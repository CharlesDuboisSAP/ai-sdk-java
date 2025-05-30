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

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.annotations.Beta;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** A chat completion delta generated by streamed model responses. */
@Beta // CHECKSTYLE:OFF
public class ChatCompletionStreamResponseDelta
// CHECKSTYLE:ON
{
  @JsonProperty("content")
  private String content;

  @JsonProperty("function_call")
  private ChatCompletionStreamResponseDeltaFunctionCall functionCall;

  @JsonProperty("tool_calls")
  private List<ChatCompletionMessageToolCallChunk> toolCalls = new ArrayList<>();

  /** The role of the author of this message. */
  public enum RoleEnum {
    /** The SYSTEM option of this ChatCompletionStreamResponseDelta */
    SYSTEM("system"),

    /** The USER option of this ChatCompletionStreamResponseDelta */
    USER("user"),

    /** The ASSISTANT option of this ChatCompletionStreamResponseDelta */
    ASSISTANT("assistant"),

    /** The TOOL option of this ChatCompletionStreamResponseDelta */
    TOOL("tool"),

    /** The UNKNOWN_DEFAULT_OPEN_API option of this ChatCompletionStreamResponseDelta */
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    /**
     * Get the value of the enum
     *
     * @return The enum value
     */
    @JsonValue
    @Nonnull
    public String getValue() {
      return value;
    }

    /**
     * Get the String value of the enum value.
     *
     * @return The enum value as String
     */
    @Override
    @Nonnull
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * Get the enum value from a String value
     *
     * @param value The String value
     * @return The enum value of type ChatCompletionStreamResponseDelta
     */
    @JsonCreator
    @Nonnull
    public static RoleEnum fromValue(@Nonnull final String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  @JsonProperty("role")
  private RoleEnum role;

  @JsonProperty("refusal")
  private String refusal;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /**
   * Set the content of this {@link ChatCompletionStreamResponseDelta} instance and return the same
   * instance.
   *
   * @param content The contents of the chunk message.
   * @return The same instance of this {@link ChatCompletionStreamResponseDelta} class
   */
  @Nonnull
  public ChatCompletionStreamResponseDelta content(@Nullable final String content) {
    this.content = content;
    return this;
  }

  /**
   * The contents of the chunk message.
   *
   * @return content The content of this {@link ChatCompletionStreamResponseDelta} instance.
   */
  @Nullable
  public String getContent() {
    return content;
  }

  /**
   * Set the content of this {@link ChatCompletionStreamResponseDelta} instance.
   *
   * @param content The contents of the chunk message.
   */
  public void setContent(@Nullable final String content) {
    this.content = content;
  }

  /**
   * Set the functionCall of this {@link ChatCompletionStreamResponseDelta} instance and return the
   * same instance.
   *
   * @param functionCall The functionCall of this {@link ChatCompletionStreamResponseDelta}
   * @return The same instance of this {@link ChatCompletionStreamResponseDelta} class
   */
  @Nonnull
  public ChatCompletionStreamResponseDelta functionCall(
      @Nullable final ChatCompletionStreamResponseDeltaFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

  /**
   * Get functionCall
   *
   * @return functionCall The functionCall of this {@link ChatCompletionStreamResponseDelta}
   *     instance.
   * @deprecated
   */
  @Deprecated
  @Nonnull
  public ChatCompletionStreamResponseDeltaFunctionCall getFunctionCall() {
    return functionCall;
  }

  /**
   * Set the functionCall of this {@link ChatCompletionStreamResponseDelta} instance.
   *
   * @param functionCall The functionCall of this {@link ChatCompletionStreamResponseDelta}
   */
  public void setFunctionCall(
      @Nullable final ChatCompletionStreamResponseDeltaFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  /**
   * Set the toolCalls of this {@link ChatCompletionStreamResponseDelta} instance and return the
   * same instance.
   *
   * @param toolCalls The toolCalls of this {@link ChatCompletionStreamResponseDelta}
   * @return The same instance of this {@link ChatCompletionStreamResponseDelta} class
   */
  @Nonnull
  public ChatCompletionStreamResponseDelta toolCalls(
      @Nullable final List<ChatCompletionMessageToolCallChunk> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  /**
   * Add one toolCalls instance to this {@link ChatCompletionStreamResponseDelta}.
   *
   * @param toolCallsItem The toolCalls that should be added
   * @return The same instance of type {@link ChatCompletionStreamResponseDelta}
   */
  @Nonnull
  public ChatCompletionStreamResponseDelta addToolCallsItem(
      @Nonnull final ChatCompletionMessageToolCallChunk toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }

  /**
   * Get toolCalls
   *
   * @return toolCalls The toolCalls of this {@link ChatCompletionStreamResponseDelta} instance.
   */
  @Nonnull
  public List<ChatCompletionMessageToolCallChunk> getToolCalls() {
    return toolCalls;
  }

  /**
   * Set the toolCalls of this {@link ChatCompletionStreamResponseDelta} instance.
   *
   * @param toolCalls The toolCalls of this {@link ChatCompletionStreamResponseDelta}
   */
  public void setToolCalls(@Nullable final List<ChatCompletionMessageToolCallChunk> toolCalls) {
    this.toolCalls = toolCalls;
  }

  /**
   * Set the role of this {@link ChatCompletionStreamResponseDelta} instance and return the same
   * instance.
   *
   * @param role The role of the author of this message.
   * @return The same instance of this {@link ChatCompletionStreamResponseDelta} class
   */
  @Nonnull
  public ChatCompletionStreamResponseDelta role(@Nullable final RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * The role of the author of this message.
   *
   * @return role The role of this {@link ChatCompletionStreamResponseDelta} instance.
   */
  @Nonnull
  public RoleEnum getRole() {
    return role;
  }

  /**
   * Set the role of this {@link ChatCompletionStreamResponseDelta} instance.
   *
   * @param role The role of the author of this message.
   */
  public void setRole(@Nullable final RoleEnum role) {
    this.role = role;
  }

  /**
   * Set the refusal of this {@link ChatCompletionStreamResponseDelta} instance and return the same
   * instance.
   *
   * @param refusal The refusal message generated by the model.
   * @return The same instance of this {@link ChatCompletionStreamResponseDelta} class
   */
  @Nonnull
  public ChatCompletionStreamResponseDelta refusal(@Nullable final String refusal) {
    this.refusal = refusal;
    return this;
  }

  /**
   * The refusal message generated by the model.
   *
   * @return refusal The refusal of this {@link ChatCompletionStreamResponseDelta} instance.
   */
  @Nullable
  public String getRefusal() {
    return refusal;
  }

  /**
   * Set the refusal of this {@link ChatCompletionStreamResponseDelta} instance.
   *
   * @param refusal The refusal message generated by the model.
   */
  public void setRefusal(@Nullable final String refusal) {
    this.refusal = refusal;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link
   * ChatCompletionStreamResponseDelta}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link ChatCompletionStreamResponseDelta}
   * instance.
   *
   * @deprecated Use {@link #toMap()} instead.
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  @Deprecated
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException(
          "ChatCompletionStreamResponseDelta has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Get the value of all properties of this {@link ChatCompletionStreamResponseDelta} instance
   * including unrecognized properties.
   *
   * @return The map of all properties
   */
  @JsonIgnore
  @Nonnull
  public Map<String, Object> toMap() {
    final Map<String, Object> declaredFields = new LinkedHashMap<>(cloudSdkCustomFields);
    if (content != null) declaredFields.put("content", content);
    if (functionCall != null) declaredFields.put("functionCall", functionCall);
    if (toolCalls != null) declaredFields.put("toolCalls", toolCalls);
    if (role != null) declaredFields.put("role", role);
    if (refusal != null) declaredFields.put("refusal", refusal);
    return declaredFields;
  }

  /**
   * Set an unrecognizable property of this {@link ChatCompletionStreamResponseDelta} instance. If
   * the map previously contained a mapping for the key, the old value is replaced by the specified
   * value.
   *
   * @param customFieldName The name of the property
   * @param customFieldValue The value of the property
   */
  @JsonIgnore
  public void setCustomField(@Nonnull String customFieldName, @Nullable Object customFieldValue) {
    cloudSdkCustomFields.put(customFieldName, customFieldValue);
  }

  @Override
  public boolean equals(@Nullable final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final ChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta =
        (ChatCompletionStreamResponseDelta) o;
    return Objects.equals(
            this.cloudSdkCustomFields, chatCompletionStreamResponseDelta.cloudSdkCustomFields)
        && Objects.equals(this.content, chatCompletionStreamResponseDelta.content)
        && Objects.equals(this.functionCall, chatCompletionStreamResponseDelta.functionCall)
        && Objects.equals(this.toolCalls, chatCompletionStreamResponseDelta.toolCalls)
        && Objects.equals(this.role, chatCompletionStreamResponseDelta.role)
        && Objects.equals(this.refusal, chatCompletionStreamResponseDelta.refusal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, functionCall, toolCalls, role, refusal, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionStreamResponseDelta {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
    cloudSdkCustomFields.forEach(
        (k, v) ->
            sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
