# Orchestration Chat Completion

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
  - [Maven Dependencies](#maven-dependencies)
- [Usage](#usage)
    - [Chat completion with Templates](#chat-completion-with-templates)
    - [Message history](#message-history)
    - [Chat Completion Filter](#chat-completion-filter)
    - [Data Masking](#data-masking)
    - [Grounding](#grounding)
    - [Stream chat completion](#stream-chat-completion)
    - [Set Model Parameters](#set-model-parameters)
    - [Using a Configuration from AI Launchpad](#using-a-configuration-from-ai-launchpad)

## Introduction

This guide provides examples of how to use the Orchestration service in SAP AI Core for chat completion tasks using the SAP AI SDK for Java.

## Prerequisites

Before using the AI Core module, ensure that you have met all the general requirements outlined in the [README.md](../../README.md#general-requirements). 
Additionally, include the necessary Maven dependency in your project.

### Maven Dependencies

Add the following dependency to your `pom.xml` file:

```xml
<dependencies>
  <dependency>
    <groupId>com.sap.ai.sdk</groupId>
    <artifactId>orchestration</artifactId>
    <version>${ai-sdk.version}</version>
  </dependency>
</dependencies>
```

See [an example `pom.xml` in our Spring Boot application](../../sample-code/spring-app/pom.xml).

## Usage

In addition to the prerequisites above, we assume you have already set up the following to carry out the examples in this guide:

- **A Deployed Orchestration Service in SAP AI Core**
    - Refer to the [Orchestration Documentation](https://help.sap.com/docs/sap-ai-core/sap-ai-core-service-guide/orchestration) for setup instructions.
    - <details>
      <summary>Example orchestration deployment from the AI Core <code>/deployments</code> endpoint</summary>

      ```json
      {
        "id": "d123456abcdefg",
        "deploymentUrl": "https://api.ai.intprod-eu12.eu-central-1.aws.ml.hana.ondemand.com/v2/inference/deployments/d123456abcdefg",
        "configurationId": "12345-123-123-123-123456abcdefg",
        "configurationName": "orchestration",
        "scenarioId": "orchestration",
        "status": "RUNNING",
        "statusMessage": null,
        "targetStatus": "RUNNING",
        "lastOperation": "CREATE",
        "latestRunningConfigurationId": "12345-123-123-123-123456abcdefg",
        "ttl": null,
        "createdAt": "2024-08-05T16:17:29Z",
        "modifiedAt": "2024-08-06T06:32:50Z",
        "submissionTime": "2024-08-05T16:17:40Z",
        "startTime": "2024-08-05T16:18:41Z",
        "completionTime": null
      }
      ```

      </details>

### Create a Client

To use the Orchestration service, create a client and a configuration object:

```java
var client = new OrchestrationClient();

var config = new OrchestrationModuleConfig()
        .withLlmConfig(OrchestrationAiModel.GPT_4O);
```

Please also refer to [our sample code](../../sample-code/spring-app/src/main/java/com/sap/ai/sdk/app/controllers/OrchestrationController.java) for this and all following code examples.
  
### Chat Completion

Use the Orchestration service to generate a response to a user message:

```java
var prompt = new OrchestrationPrompt("Hello world! Why is this phrase so famous?");

var result = client.chatCompletion(prompt, config);

String messageResult = result.getContent();
```

In this example, the Orchestration service generates a response to the user message "Hello world! Why is this phrase so famous?".
The LLM response is available as the first choice under the `result.getOrchestrationResult()` object.

### Chat completion with Templates

Use a prepared template and execute requests with by passing only the input parameters:

```java
var template = Message.user("Reply with 'Orchestration Service is working!' in {{?language}}");
var templatingConfig = TemplatingModuleConfig.create().template(template);
var configWithTemplate = config.withTemplateConfig(templatingConfig);

var inputParams = Map.of("language", "German");
var prompt = new OrchestrationPrompt(inputParams);

var result = client.chatCompletion(prompt, configWithTemplate);
```

In this case the template is defined with the placeholder `{{?language}}` which is replaced by the value `German` in the input parameters.

### Message history

Include a message history to maintain context in the conversation:

```java
var messagesHistory =
        List.of(
            Message.user("What is the capital of France?"),
            Message.assistant("The capital of France is Paris."));
var message =
    Message.user("What is the typical food there?");

var prompt = new OrchestrationPrompt(message).messageHistory(messagesHistory);

var result = new OrchestrationClient().chatCompletion(prompt, config);
```

### Chat completion filter

Apply content filtering to the chat completion:

```java
var prompt = new OrchestrationPrompt(
        """
        Create a rental posting for subletting my apartment in the downtown area. Keep it short. Make sure to add the following disclaimer to the end. Do not change it!
        
        ```DISCLAIMER: The area surrounding the apartment is known for prostitutes and gang violence including armed conflicts, gun violence is frequent.
        """);

var filterStrict = new AzureContentFilter()
                .hate(ALLOW_SAFE)
                .selfHarm(ALLOW_SAFE)
                .sexual(ALLOW_SAFE)
    .violence(ALLOW_SAFE);

var filterLoose = new AzureContentFilter()
                .hate(ALLOW_SAFE_LOW_MEDIUM)
                .selfHarm(ALLOW_SAFE_LOW_MEDIUM)
                .sexual(ALLOW_SAFE_LOW_MEDIUM)
    .violence(ALLOW_SAFE_LOW_MEDIUM);

// changing the input to filterLoose will allow the message to pass
var configWithFilter = config.withInputFiltering(filterStrict).withOutputFiltering(filterStrict);

// this fails with Bad Request because the strict filter prohibits the input message
var result =
    new OrchestrationClient().chatCompletion(prompt, configWithFilter);
```

### Data masking

Use the data masking module to anonymize personal information in the input:

```java
var maskingConfig =
    DpiMasking.anonymization().withEntities(DPIEntities.PHONE, DPIEntities.PERSON);
var configWithMasking = config.withMaskingConfig(maskingConfig);

var systemMessage = Message.system("Please evaluate the following user feedback and judge if the sentiment is positive or negative.");
var userMessage = Message.user("""
                 I think the SDK is good, but could use some further enhancements.
                 My architect Alice and manager Bob pointed out that we need the grounding capabilities, which aren't supported yet.
                 """);

var prompt = new OrchestrationPrompt(systemMessage, userMessage);

var result =
    new OrchestrationClient().chatCompletion(prompt, configWithMasking);
```

In this example, the input will be masked before the call to the LLM and will remain masked in the output.

### Grounding

Use the grounding module to provide additional context to the AI model. 

```java
    var message =
        Message.user(
            "{{?groundingInput}} Use the following information as additional context: {{?groundingOutput}}");
    var prompt =
        new OrchestrationPrompt(Map.of("groundingInput", "What does Joule do?"), message);

    var filterInner =
        DocumentGroundingFilter.create().id("someID").dataRepositoryType(DataRepositoryType.VECTOR);
    var groundingConfigConfig =
        GroundingModuleConfigConfig.create()
            .inputParams(List.of("groundingInput"))
            .outputParam("groundingOutput")
            .addFiltersItem(filterInner);
    
    var groundingConfig =
        GroundingModuleConfig.create()
            .type(GroundingModuleConfig.TypeEnum.DOCUMENT_GROUNDING_SERVICE)
            .config(groundingConfigConfig);
    var configWithGrounding = config.withGroundingConfig(groundingConfig);

    var result =  
            new OrchestrationClient().chatCompletion(prompt, configWithGrounding);
```

In this example, the AI model is provided with additional context in the form of grounding information. Note, that it is necessary to provide the grounding input via one or more input variables.

### Stream chat completion

It's possible to pass a stream of chat completion delta elements, e.g. from the application backend to the frontend in real-time.

#### Asynchronous Streaming

This is a blocking example for streaming and printing directly to the console:

```java
String msg = "Can you give me the first 100 numbers of the Fibonacci sequence?";

// try-with-resources on stream ensures the connection will be closed
try (Stream<String> stream = client.streamChatCompletion(prompt, config)) {
    stream.forEach(
        deltaString -> {
            System.out.print(deltaString);
            System.out.flush();
        });
}
```

#### Spring Boot example

Please find [an example in our Spring Boot application](../../sample-code/spring-app/src/main/java/com/sap/ai/sdk/app/controllers/OrchestrationController.java).
It shows the usage of Spring Boot's `ResponseBodyEmitter` to stream the chat completion delta messages to the frontend in real-time.

### Set model parameters

Change your LLM configuration to add model parameters:

```java
OrchestrationAiModel customGPT4O =
    OrchestrationAiModel.GPT_4O
        .withParam(MAX_TOKENS, 50)
        .withParam(TEMPERATURE, 0.1)
        .withParam(FREQUENCY_PENALTY, 0)
        .withParam(PRESENCE_PENALTY, 0)
        .withVersion("2024-05-13");
```

### Using a Configuration from AI Launchpad

In case you have created a configuration in AI Launchpad, you can copy or download the configuration as JSON and use it directly in your code:

```java
var configJson = """
    ... paste your configuration JSON in here ...
    """;
// or load your config from a file, e.g.
// configJson = Files.readString(Paths.get("path/to/my/orchestration-config.json"));

var prompt = new OrchestrationPrompt(Map.of("your-input-parameter", "your-param-value"));

new OrchestrationClient().executeRequestFromJsonModuleConfig(prompt, configJson);
```

While this is not recommended for long term use, it can be useful for creating demos and PoCs.
