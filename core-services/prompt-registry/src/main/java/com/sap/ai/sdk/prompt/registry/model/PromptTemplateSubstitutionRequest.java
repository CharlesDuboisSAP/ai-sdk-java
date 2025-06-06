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

/** PromptTemplateSubstitutionRequest */
// CHECKSTYLE:OFF
public class PromptTemplateSubstitutionRequest
// CHECKSTYLE:ON
{
  @JsonProperty("inputParams")
  private Object inputParams;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for PromptTemplateSubstitutionRequest. */
  protected PromptTemplateSubstitutionRequest() {}

  /**
   * Set the inputParams of this {@link PromptTemplateSubstitutionRequest} instance and return the
   * same instance.
   *
   * @param inputParams The inputParams of this {@link PromptTemplateSubstitutionRequest}
   * @return The same instance of this {@link PromptTemplateSubstitutionRequest} class
   */
  @Nonnull
  public PromptTemplateSubstitutionRequest inputParams(@Nullable final Object inputParams) {
    this.inputParams = inputParams;
    return this;
  }

  /**
   * Get inputParams
   *
   * @return inputParams The inputParams of this {@link PromptTemplateSubstitutionRequest} instance.
   */
  @Nonnull
  public Object getInputParams() {
    return inputParams;
  }

  /**
   * Set the inputParams of this {@link PromptTemplateSubstitutionRequest} instance.
   *
   * @param inputParams The inputParams of this {@link PromptTemplateSubstitutionRequest}
   */
  public void setInputParams(@Nullable final Object inputParams) {
    this.inputParams = inputParams;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link
   * PromptTemplateSubstitutionRequest}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link PromptTemplateSubstitutionRequest}
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
          "PromptTemplateSubstitutionRequest has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Get the value of all properties of this {@link PromptTemplateSubstitutionRequest} instance
   * including unrecognized properties.
   *
   * @return The map of all properties
   */
  @JsonIgnore
  @Nonnull
  public Map<String, Object> toMap() {
    final Map<String, Object> declaredFields = new LinkedHashMap<>(cloudSdkCustomFields);
    if (inputParams != null) declaredFields.put("inputParams", inputParams);
    return declaredFields;
  }

  /**
   * Set an unrecognizable property of this {@link PromptTemplateSubstitutionRequest} instance. If
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
    final PromptTemplateSubstitutionRequest promptTemplateSubstitutionRequest =
        (PromptTemplateSubstitutionRequest) o;
    return Objects.equals(
            this.cloudSdkCustomFields, promptTemplateSubstitutionRequest.cloudSdkCustomFields)
        && Objects.equals(this.inputParams, promptTemplateSubstitutionRequest.inputParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputParams, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class PromptTemplateSubstitutionRequest {\n");
    sb.append("    inputParams: ").append(toIndentedString(inputParams)).append("\n");
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

  /** Create a new {@link PromptTemplateSubstitutionRequest} instance. No arguments are required. */
  public static PromptTemplateSubstitutionRequest create() {
    return new PromptTemplateSubstitutionRequest();
  }
}
