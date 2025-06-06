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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** Specifies a tool the model should use. Use to force the model to call a specific function. */
@Beta // CHECKSTYLE:OFF
public class ChatCompletionNamedToolChoice
// CHECKSTYLE:ON
{
  /** The type of the tool. Currently, only &#x60;function&#x60; is supported. */
  public enum TypeEnum {
    /** The FUNCTION option of this ChatCompletionNamedToolChoice */
    FUNCTION("function"),

    /** The UNKNOWN_DEFAULT_OPEN_API option of this ChatCompletionNamedToolChoice */
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    TypeEnum(String value) {
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
     * @return The enum value of type ChatCompletionNamedToolChoice
     */
    @JsonCreator
    @Nonnull
    public static TypeEnum fromValue(@Nonnull final String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("function")
  private ChatCompletionNamedToolChoiceFunction function;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /**
   * Set the type of this {@link ChatCompletionNamedToolChoice} instance and return the same
   * instance.
   *
   * @param type The type of the tool. Currently, only &#x60;function&#x60; is supported.
   * @return The same instance of this {@link ChatCompletionNamedToolChoice} class
   */
  @Nonnull
  public ChatCompletionNamedToolChoice type(@Nonnull final TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the tool. Currently, only &#x60;function&#x60; is supported.
   *
   * @return type The type of this {@link ChatCompletionNamedToolChoice} instance.
   */
  @Nonnull
  public TypeEnum getType() {
    return type;
  }

  /**
   * Set the type of this {@link ChatCompletionNamedToolChoice} instance.
   *
   * @param type The type of the tool. Currently, only &#x60;function&#x60; is supported.
   */
  public void setType(@Nonnull final TypeEnum type) {
    this.type = type;
  }

  /**
   * Set the function of this {@link ChatCompletionNamedToolChoice} instance and return the same
   * instance.
   *
   * @param function The function of this {@link ChatCompletionNamedToolChoice}
   * @return The same instance of this {@link ChatCompletionNamedToolChoice} class
   */
  @Nonnull
  public ChatCompletionNamedToolChoice function(
      @Nonnull final ChatCompletionNamedToolChoiceFunction function) {
    this.function = function;
    return this;
  }

  /**
   * Get function
   *
   * @return function The function of this {@link ChatCompletionNamedToolChoice} instance.
   */
  @Nonnull
  public ChatCompletionNamedToolChoiceFunction getFunction() {
    return function;
  }

  /**
   * Set the function of this {@link ChatCompletionNamedToolChoice} instance.
   *
   * @param function The function of this {@link ChatCompletionNamedToolChoice}
   */
  public void setFunction(@Nonnull final ChatCompletionNamedToolChoiceFunction function) {
    this.function = function;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link ChatCompletionNamedToolChoice}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link ChatCompletionNamedToolChoice}
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
          "ChatCompletionNamedToolChoice has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Get the value of all properties of this {@link ChatCompletionNamedToolChoice} instance
   * including unrecognized properties.
   *
   * @return The map of all properties
   */
  @JsonIgnore
  @Nonnull
  public Map<String, Object> toMap() {
    final Map<String, Object> declaredFields = new LinkedHashMap<>(cloudSdkCustomFields);
    if (type != null) declaredFields.put("type", type);
    if (function != null) declaredFields.put("function", function);
    return declaredFields;
  }

  /**
   * Set an unrecognizable property of this {@link ChatCompletionNamedToolChoice} instance. If the
   * map previously contained a mapping for the key, the old value is replaced by the specified
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
    final ChatCompletionNamedToolChoice chatCompletionNamedToolChoice =
        (ChatCompletionNamedToolChoice) o;
    return Objects.equals(
            this.cloudSdkCustomFields, chatCompletionNamedToolChoice.cloudSdkCustomFields)
        && Objects.equals(this.type, chatCompletionNamedToolChoice.type)
        && Objects.equals(this.function, chatCompletionNamedToolChoice.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, function, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionNamedToolChoice {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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
