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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.annotations.Beta;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** Breakdown of tokens used in a completion. */
@Beta // CHECKSTYLE:OFF
public class CompletionUsageCompletionTokensDetails
// CHECKSTYLE:ON
{
  @JsonProperty("reasoning_tokens")
  private Integer reasoningTokens;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /**
   * Set the reasoningTokens of this {@link CompletionUsageCompletionTokensDetails} instance and
   * return the same instance.
   *
   * @param reasoningTokens Tokens generated by the model for reasoning.
   * @return The same instance of this {@link CompletionUsageCompletionTokensDetails} class
   */
  @Nonnull
  public CompletionUsageCompletionTokensDetails reasoningTokens(
      @Nullable final Integer reasoningTokens) {
    this.reasoningTokens = reasoningTokens;
    return this;
  }

  /**
   * Tokens generated by the model for reasoning.
   *
   * @return reasoningTokens The reasoningTokens of this {@link
   *     CompletionUsageCompletionTokensDetails} instance.
   */
  @Nonnull
  public Integer getReasoningTokens() {
    return reasoningTokens;
  }

  /**
   * Set the reasoningTokens of this {@link CompletionUsageCompletionTokensDetails} instance.
   *
   * @param reasoningTokens Tokens generated by the model for reasoning.
   */
  public void setReasoningTokens(@Nullable final Integer reasoningTokens) {
    this.reasoningTokens = reasoningTokens;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link
   * CompletionUsageCompletionTokensDetails}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link
   * CompletionUsageCompletionTokensDetails} instance.
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
          "CompletionUsageCompletionTokensDetails has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Get the value of all properties of this {@link CompletionUsageCompletionTokensDetails} instance
   * including unrecognized properties.
   *
   * @return The map of all properties
   */
  @JsonIgnore
  @Nonnull
  public Map<String, Object> toMap() {
    final Map<String, Object> declaredFields = new LinkedHashMap<>(cloudSdkCustomFields);
    if (reasoningTokens != null) declaredFields.put("reasoningTokens", reasoningTokens);
    return declaredFields;
  }

  /**
   * Set an unrecognizable property of this {@link CompletionUsageCompletionTokensDetails} instance.
   * If the map previously contained a mapping for the key, the old value is replaced by the
   * specified value.
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
    final CompletionUsageCompletionTokensDetails completionUsageCompletionTokensDetails =
        (CompletionUsageCompletionTokensDetails) o;
    return Objects.equals(
            this.cloudSdkCustomFields, completionUsageCompletionTokensDetails.cloudSdkCustomFields)
        && Objects.equals(
            this.reasoningTokens, completionUsageCompletionTokensDetails.reasoningTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasoningTokens, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class CompletionUsageCompletionTokensDetails {\n");
    sb.append("    reasoningTokens: ").append(toIndentedString(reasoningTokens)).append("\n");
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
