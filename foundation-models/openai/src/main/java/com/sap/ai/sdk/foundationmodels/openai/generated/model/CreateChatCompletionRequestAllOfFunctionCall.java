/*
 * Azure OpenAI Service API
 * Azure OpenAI APIs for completions and search
 *
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.foundationmodels.openai.generated.model;

import com.google.common.annotations.Beta;
import javax.annotation.Nonnull;

/**
 * Deprecated in favor of &#x60;tool_choice&#x60;. Controls which (if any) function is called by the
 * model. &#x60;none&#x60; means the model will not call a function and instead generates a message.
 * &#x60;auto&#x60; means the model can pick between generating a message or calling a function.
 * Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60;
 * forces the model to call that function. &#x60;none&#x60; is the default when no functions are
 * present. &#x60;auto&#x60; is the default if functions are present.
 *
 * @deprecated
 */
@Deprecated
@Beta
public interface CreateChatCompletionRequestAllOfFunctionCall {
  /**
   * Helper class to create a ChatCompletionFunctionCallOption that implements {@link
   * CreateChatCompletionRequestAllOfFunctionCall}.
   */
  record InnerChatCompletionFunctionCallOption(
      @com.fasterxml.jackson.annotation.JsonValue @Nonnull ChatCompletionFunctionCallOption value)
      implements CreateChatCompletionRequestAllOfFunctionCall {}

  /**
   * Creator to enable deserialization of a ChatCompletionFunctionCallOption.
   *
   * @param val the value to use
   * @return a new instance of {@link InnerChatCompletionFunctionCallOption}.
   */
  @com.fasterxml.jackson.annotation.JsonCreator
  @Nonnull
  static InnerChatCompletionFunctionCallOption create(
      @Nonnull final ChatCompletionFunctionCallOption val) {
    return new InnerChatCompletionFunctionCallOption(val);
  }

  /**
   * Helper class to create a String that implements {@link
   * CreateChatCompletionRequestAllOfFunctionCall}.
   */
  record InnerString(@com.fasterxml.jackson.annotation.JsonValue @Nonnull String value)
      implements CreateChatCompletionRequestAllOfFunctionCall {}

  /**
   * Creator to enable deserialization of a String.
   *
   * @param val the value to use
   * @return a new instance of {@link InnerString}.
   */
  @com.fasterxml.jackson.annotation.JsonCreator
  @Nonnull
  static InnerString create(@Nonnull final String val) {
    return new InnerString(val);
  }
}
