/*
 * Prompt Registry API
 * Prompt Storage service for Design time & Runtime prompt templates.
 *
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.prompt.registry.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** PromptTemplateDeleteResponse */
// CHECKSTYLE:OFF
public class PromptTemplateDeleteResponse
// CHECKSTYLE:ON
{
  @JsonProperty("message")
  private String message;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for PromptTemplateDeleteResponse. */
  protected PromptTemplateDeleteResponse() {}

  /**
   * Set the message of this {@link PromptTemplateDeleteResponse} instance and return the same
   * instance.
   *
   * @param message The message of this {@link PromptTemplateDeleteResponse}
   * @return The same instance of this {@link PromptTemplateDeleteResponse} class
   */
  @Nonnull
  public PromptTemplateDeleteResponse message(@Nonnull final String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   *
   * @return message The message of this {@link PromptTemplateDeleteResponse} instance.
   */
  @Nonnull
  public String getMessage() {
    return message;
  }

  /**
   * Set the message of this {@link PromptTemplateDeleteResponse} instance.
   *
   * @param message The message of this {@link PromptTemplateDeleteResponse}
   */
  public void setMessage(@Nonnull final String message) {
    this.message = message;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link PromptTemplateDeleteResponse}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link PromptTemplateDeleteResponse}
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
          "PromptTemplateDeleteResponse has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Get the value of all properties of this {@link PromptTemplateDeleteResponse} instance including
   * unrecognized properties.
   *
   * @return The map of all properties
   */
  @JsonIgnore
  @Nonnull
  public Map<String, Object> toMap() {
    final Map<String, Object> declaredFields = new LinkedHashMap<>(cloudSdkCustomFields);
    if (message != null) declaredFields.put("message", message);
    return declaredFields;
  }

  /**
   * Set an unrecognizable property of this {@link PromptTemplateDeleteResponse} instance. If the
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
    final PromptTemplateDeleteResponse promptTemplateDeleteResponse =
        (PromptTemplateDeleteResponse) o;
    return Objects.equals(
            this.cloudSdkCustomFields, promptTemplateDeleteResponse.cloudSdkCustomFields)
        && Objects.equals(this.message, promptTemplateDeleteResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class PromptTemplateDeleteResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

  /**
   * Create a type-safe, fluent-api builder object to construct a new {@link
   * PromptTemplateDeleteResponse} instance with all required arguments.
   */
  public static Builder create() {
    return (message) -> new PromptTemplateDeleteResponse().message(message);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the message of this {@link PromptTemplateDeleteResponse} instance.
     *
     * @param message The message of this {@link PromptTemplateDeleteResponse}
     * @return The PromptTemplateDeleteResponse instance.
     */
    PromptTemplateDeleteResponse message(@Nonnull final String message);
  }
}
