package com.sap.ai.sdk.app.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.sap.ai.sdk.app.services.OrchestrationService;
import com.sap.ai.sdk.orchestration.AzureFilterThreshold;
import com.sap.ai.sdk.orchestration.OrchestrationClient;
import com.sap.ai.sdk.orchestration.OrchestrationClientException;
import com.sap.ai.sdk.orchestration.OrchestrationPrompt;
import com.sap.ai.sdk.orchestration.model.CompletionPostResponse;
import com.sap.ai.sdk.orchestration.model.DPIEntities;
import com.sap.ai.sdk.orchestration.model.LLMChoice;
import com.sap.ai.sdk.orchestration.model.LLMModuleResultSynchronous;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;

@Slf4j
class OrchestrationTest {
  OrchestrationService service;

  @BeforeEach
  void setUp() {
    service = new OrchestrationService();
  }

  @Test
  void testCompletion() {
    final var result = service.completion("HelloWorld!");

    assertThat(result).isNotNull();
    assertThat(result.getContent()).isNotEmpty();
  }

  @Test
  void testStreamChatCompletion() {
    final var prompt = new OrchestrationPrompt("Who is the prettiest?");
    final var stream = new OrchestrationClient().streamChatCompletion(prompt, service.getConfig());

    final var filledDeltaCount = new AtomicInteger(0);
    stream
        // foreach consumes all elements, closing the stream at the end
        .forEach(
        delta -> {
          log.info("delta: {}", delta);
          if (!delta.isEmpty()) {
            filledDeltaCount.incrementAndGet();
          }
        });

    // the first two and the last delta don't have any content
    // see OpenAiChatCompletionDelta#getDeltaContent
    assertThat(filledDeltaCount.get()).isGreaterThan(0);
  }

  @Test
  void testTemplate() {
    assertThat(service.getConfig().getLlmConfig()).isNotNull();
    final var modelName = service.getConfig().getLlmConfig().getModelName();

    final var result = service.template("German");
    final var response = result.getOriginalResponse();

    assertThat(response.getRequestId()).isNotEmpty();
    assertThat(result.getAllMessages().get(0).content())
        .isEqualTo("Reply with 'Orchestration Service is working!' in German");
    assertThat(result.getAllMessages().get(0).role()).isEqualTo("user");
    var llm = (LLMModuleResultSynchronous) response.getModuleResults().getLlm();
    assertThat(llm.getId()).isEmpty();
    assertThat(llm.getObject()).isEqualTo("chat.completion");
    assertThat(llm.getCreated()).isGreaterThan(1);
    assertThat(llm.getModel()).isEqualTo(modelName);
    var choices = llm.getChoices();
    assertThat(choices.get(0).getIndex()).isZero();
    assertThat(choices.get(0).getMessage().getContent()).isNotEmpty();
    assertThat(choices.get(0).getMessage().getRole()).isEqualTo("assistant");
    assertThat(choices.get(0).getFinishReason()).isEqualTo("stop");
    var usage = result.getTokenUsage();
    assertThat(usage.getCompletionTokens()).isGreaterThan(1);
    assertThat(usage.getPromptTokens()).isGreaterThan(1);
    assertThat(usage.getTotalTokens()).isGreaterThan(1);

    var orchestrationResult = ((LLMModuleResultSynchronous) response.getOrchestrationResult());
    assertThat(orchestrationResult.getObject()).isEqualTo("chat.completion");
    assertThat(orchestrationResult.getCreated()).isGreaterThan(1);
    assertThat(orchestrationResult.getModel()).isEqualTo(modelName);
    choices = orchestrationResult.getChoices();
    assertThat(choices.get(0).getIndex()).isZero();
    assertThat(choices.get(0).getMessage().getContent()).isNotEmpty();
    assertThat(choices.get(0).getMessage().getRole()).isEqualTo("assistant");
    assertThat(choices.get(0).getFinishReason()).isEqualTo("stop");
    assertThat(result.getChoice()).isSameAs(choices.get(0));
    usage = result.getTokenUsage();
    assertThat(usage.getCompletionTokens()).isGreaterThan(1);
    assertThat(usage.getPromptTokens()).isGreaterThan(1);
    assertThat(usage.getTotalTokens()).isGreaterThan(1);
  }

  @Test
  void testLenientContentFilter() {
    var response = service.filter(AzureFilterThreshold.ALLOW_SAFE_LOW_MEDIUM, "the downtown area");
    var result = response.getOriginalResponse();
    var llmChoice =
        ((LLMModuleResultSynchronous) result.getOrchestrationResult()).getChoices().get(0);
    assertThat(llmChoice.getFinishReason()).isEqualTo("stop");
    assertThat(llmChoice.getMessage().getContent()).isNotEmpty();

    var filterResult = result.getModuleResults().getInputFiltering();
    assertThat(filterResult.getMessage()).contains("passed");
  }

  @Test
  void testStrictContentFilter() {
    assertThatThrownBy(() -> service.filter(AzureFilterThreshold.ALLOW_SAFE, "the downtown area"))
        .isInstanceOf(OrchestrationClientException.class)
        .hasMessageContaining("400 Bad Request")
        .hasMessageContaining("Content filtered");
  }

  @Test
  void testMessagesHistory() {
    CompletionPostResponse result =
        service.messagesHistory("What is the capital of France?").getOriginalResponse();
    final var choices = ((LLMModuleResultSynchronous) result.getOrchestrationResult()).getChoices();
    assertThat(choices.get(0).getMessage().getContent()).isNotEmpty();
  }

  @SuppressWarnings("unchecked")
  @Test
  void testMaskingAnonymization() {
    var response = service.maskingAnonymization(DPIEntities.PERSON);
    var result = response.getOriginalResponse();
    var llmChoice =
        ((LLMModuleResultSynchronous) result.getOrchestrationResult()).getChoices().get(0);
    assertThat(llmChoice.getFinishReason()).isEqualTo("stop");

    var maskingResult = result.getModuleResults().getInputMasking();
    assertThat(maskingResult.getMessage()).isNotEmpty();
    var data = (Map<String, Object>) maskingResult.getData();
    var maskedMessage = (String) data.get("masked_template");
    assertThat(maskedMessage)
        .describedAs("The masked input should not contain any user names")
        .doesNotContain("Alice", "Bob");

    assertThat(result.getModuleResults().getOutputUnmasking()).isEmpty();
  }

  @SuppressWarnings("unchecked")
  @Test
  void testMaskingPseudonymization() {
    var response = service.maskingPseudonymization(DPIEntities.PERSON);
    var result = response.getOriginalResponse();
    var llmChoice =
        ((LLMModuleResultSynchronous) result.getOrchestrationResult()).getChoices().get(0);
    assertThat(llmChoice.getFinishReason()).isEqualTo("stop");
    assertThat(llmChoice.getMessage().getContent())
        .describedAs("The final response should contain the original user name")
        .contains("Mallory");

    var maskingResult = result.getModuleResults().getInputMasking();
    assertThat(maskingResult.getMessage()).isNotEmpty();
    var data = (Map<String, Object>) maskingResult.getData();
    var maskedMessage = (String) data.get("masked_template");
    assertThat(maskedMessage)
        .describedAs("The masked input should not contain any user names but only pseudonyms")
        .doesNotContain("Mallory", "Alice", "Bob")
        .contains("MASKED_PERSON");

    var unmaskingResult = result.getModuleResults().getOutputUnmasking();
    assertThat(unmaskingResult).isNotEmpty();
    assertThat(((LLMChoice) unmaskingResult.get(0)).getMessage().getContent())
        .describedAs("The unmasking step should replace the pseudonyms used by the LLM")
        .doesNotContain("MASKED_PERSON")
        .contains("Mallory");
  }

  @Test
  @DisabledIfSystemProperty(named = "aicore.landscape", matches = "production")
  void testGrounding() {
    assertThat(System.getProperty("aicore.landscape")).isNotEqualTo("production");
    var response = service.grounding("What does Joule do?");
    var result = response.getOriginalResponse();
    var llmChoice =
        ((LLMModuleResultSynchronous) result.getOrchestrationResult()).getChoices().get(0);
    assertThat(response).isNotNull();
    assertThat(llmChoice.getFinishReason()).isEqualTo("stop");
    assertThat(result.getModuleResults().getGrounding()).isNotNull();
    assertThat(result.getModuleResults().getGrounding().getData()).isNotNull();
    assertThat(result.getModuleResults().getGrounding().getMessage()).isEqualTo("grounding result");
  }

  @Test
  void testCompletionWithResourceGroup() {
    var response = service.completionWithResourceGroup("ai-sdk-java-e2e", "Hello world!");
    var result = response.getOriginalResponse();
    var llmChoice =
        ((LLMModuleResultSynchronous) result.getOrchestrationResult()).getChoices().get(0);
    assertThat(llmChoice.getFinishReason()).isEqualTo("stop");
    assertThat(llmChoice.getMessage().getContent()).isNotEmpty();
  }
}
