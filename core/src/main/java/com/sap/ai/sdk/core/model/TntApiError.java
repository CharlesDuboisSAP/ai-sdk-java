/*
 * AI Core
 * Provides tools to manage your scenarios and workflows in SAP AI Core. Execute pipelines as a batch job, for example to pre-process or train your models, or perform batch inference.  Serve inference requests of trained models. Deploy а trained machine learning model as a web service to serve inference requests with high performance.  Register your own Docker registry, synchronize your AI content from your own git repository, and register your own object store for training data and trained models.
 *
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.core.model;

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

/** TntApiError */
// CHECKSTYLE:OFF
public class TntApiError
// CHECKSTYLE:ON
{
  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("requestId")
  private String requestId;

  @JsonProperty("target")
  private String target;

  @JsonProperty("details")
  private Object details;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for TntApiError. */
  protected TntApiError() {}

  /**
   * Set the code of this {@link TntApiError} instance and return the same instance.
   *
   * @param code Descriptive error code (not http status code)
   * @return The same instance of this {@link TntApiError} class
   */
  @Nonnull
  public TntApiError code(@Nonnull final String code) {
    this.code = code;
    return this;
  }

  /**
   * Descriptive error code (not http status code)
   *
   * @return code The code of this {@link TntApiError} instance.
   */
  @Nonnull
  public String getCode() {
    return code;
  }

  /**
   * Set the code of this {@link TntApiError} instance.
   *
   * @param code Descriptive error code (not http status code)
   */
  public void setCode(@Nonnull final String code) {
    this.code = code;
  }

  /**
   * Set the message of this {@link TntApiError} instance and return the same instance.
   *
   * @param message Plaintext error description
   * @return The same instance of this {@link TntApiError} class
   */
  @Nonnull
  public TntApiError message(@Nonnull final String message) {
    this.message = message;
    return this;
  }

  /**
   * Plaintext error description
   *
   * @return message The message of this {@link TntApiError} instance.
   */
  @Nonnull
  public String getMessage() {
    return message;
  }

  /**
   * Set the message of this {@link TntApiError} instance.
   *
   * @param message Plaintext error description
   */
  public void setMessage(@Nonnull final String message) {
    this.message = message;
  }

  /**
   * Set the requestId of this {@link TntApiError} instance and return the same instance.
   *
   * @param requestId ID of the individual request
   * @return The same instance of this {@link TntApiError} class
   */
  @Nonnull
  public TntApiError requestId(@Nullable final String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * ID of the individual request
   *
   * @return requestId The requestId of this {@link TntApiError} instance.
   */
  @Nonnull
  public String getRequestId() {
    return requestId;
  }

  /**
   * Set the requestId of this {@link TntApiError} instance.
   *
   * @param requestId ID of the individual request
   */
  public void setRequestId(@Nullable final String requestId) {
    this.requestId = requestId;
  }

  /**
   * Set the target of this {@link TntApiError} instance and return the same instance.
   *
   * @param target Invoked URL
   * @return The same instance of this {@link TntApiError} class
   */
  @Nonnull
  public TntApiError target(@Nullable final String target) {
    this.target = target;
    return this;
  }

  /**
   * Invoked URL
   *
   * @return target The target of this {@link TntApiError} instance.
   */
  @Nonnull
  public String getTarget() {
    return target;
  }

  /**
   * Set the target of this {@link TntApiError} instance.
   *
   * @param target Invoked URL
   */
  public void setTarget(@Nullable final String target) {
    this.target = target;
  }

  /**
   * Set the details of this {@link TntApiError} instance and return the same instance.
   *
   * @param details Optional details of the error message
   * @return The same instance of this {@link TntApiError} class
   */
  @Nonnull
  public TntApiError details(@Nullable final Object details) {
    this.details = details;
    return this;
  }

  /**
   * Optional details of the error message
   *
   * @return details The details of this {@link TntApiError} instance.
   */
  @Nonnull
  public Object getDetails() {
    return details;
  }

  /**
   * Set the details of this {@link TntApiError} instance.
   *
   * @param details Optional details of the error message
   */
  public void setDetails(@Nullable final Object details) {
    this.details = details;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link TntApiError}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link TntApiError} instance.
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
      throw new NoSuchElementException("TntApiError has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Get the value of all properties of this {@link TntApiError} instance including unrecognized
   * properties.
   *
   * @return The map of all properties
   */
  @JsonIgnore
  @Nonnull
  public Map<String, Object> toMap() {
    final Map<String, Object> declaredFields = new LinkedHashMap<>(cloudSdkCustomFields);
    if (code != null) declaredFields.put("code", code);
    if (message != null) declaredFields.put("message", message);
    if (requestId != null) declaredFields.put("requestId", requestId);
    if (target != null) declaredFields.put("target", target);
    if (details != null) declaredFields.put("details", details);
    return declaredFields;
  }

  /**
   * Set an unrecognizable property of this {@link TntApiError} instance. If the map previously
   * contained a mapping for the key, the old value is replaced by the specified value.
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
    final TntApiError tntApiError = (TntApiError) o;
    return Objects.equals(this.cloudSdkCustomFields, tntApiError.cloudSdkCustomFields)
        && Objects.equals(this.code, tntApiError.code)
        && Objects.equals(this.message, tntApiError.message)
        && Objects.equals(this.requestId, tntApiError.requestId)
        && Objects.equals(this.target, tntApiError.target)
        && Objects.equals(this.details, tntApiError.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, requestId, target, details, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class TntApiError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
   * Create a type-safe, fluent-api builder object to construct a new {@link TntApiError} instance
   * with all required arguments.
   */
  public static Builder create() {
    return (code) -> (message) -> new TntApiError().code(code).message(message);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the code of this {@link TntApiError} instance.
     *
     * @param code Descriptive error code (not http status code)
     * @return The TntApiError builder.
     */
    Builder1 code(@Nonnull final String code);
  }

  /** Builder helper class. */
  public interface Builder1 {
    /**
     * Set the message of this {@link TntApiError} instance.
     *
     * @param message Plaintext error description
     * @return The TntApiError instance.
     */
    TntApiError message(@Nonnull final String message);
  }
}
