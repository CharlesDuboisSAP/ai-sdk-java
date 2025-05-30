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

/** BckndExecutableResourceQuotaResponse */
// CHECKSTYLE:OFF
public class BckndExecutableResourceQuotaResponse
// CHECKSTYLE:ON
{
  @JsonProperty("usage")
  private BckndExecutableResourceQuotaResponseUsage usage;

  @JsonProperty("quota")
  private BckndExecutableResourceQuotaResponseQuota quota;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for BckndExecutableResourceQuotaResponse. */
  protected BckndExecutableResourceQuotaResponse() {}

  /**
   * Set the usage of this {@link BckndExecutableResourceQuotaResponse} instance and return the same
   * instance.
   *
   * @param usage The usage of this {@link BckndExecutableResourceQuotaResponse}
   * @return The same instance of this {@link BckndExecutableResourceQuotaResponse} class
   */
  @Nonnull
  public BckndExecutableResourceQuotaResponse usage(
      @Nullable final BckndExecutableResourceQuotaResponseUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   *
   * @return usage The usage of this {@link BckndExecutableResourceQuotaResponse} instance.
   */
  @Nonnull
  public BckndExecutableResourceQuotaResponseUsage getUsage() {
    return usage;
  }

  /**
   * Set the usage of this {@link BckndExecutableResourceQuotaResponse} instance.
   *
   * @param usage The usage of this {@link BckndExecutableResourceQuotaResponse}
   */
  public void setUsage(@Nullable final BckndExecutableResourceQuotaResponseUsage usage) {
    this.usage = usage;
  }

  /**
   * Set the quota of this {@link BckndExecutableResourceQuotaResponse} instance and return the same
   * instance.
   *
   * @param quota The quota of this {@link BckndExecutableResourceQuotaResponse}
   * @return The same instance of this {@link BckndExecutableResourceQuotaResponse} class
   */
  @Nonnull
  public BckndExecutableResourceQuotaResponse quota(
      @Nonnull final BckndExecutableResourceQuotaResponseQuota quota) {
    this.quota = quota;
    return this;
  }

  /**
   * Get quota
   *
   * @return quota The quota of this {@link BckndExecutableResourceQuotaResponse} instance.
   */
  @Nonnull
  public BckndExecutableResourceQuotaResponseQuota getQuota() {
    return quota;
  }

  /**
   * Set the quota of this {@link BckndExecutableResourceQuotaResponse} instance.
   *
   * @param quota The quota of this {@link BckndExecutableResourceQuotaResponse}
   */
  public void setQuota(@Nonnull final BckndExecutableResourceQuotaResponseQuota quota) {
    this.quota = quota;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link
   * BckndExecutableResourceQuotaResponse}.
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
   * BckndExecutableResourceQuotaResponse} instance.
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
          "BckndExecutableResourceQuotaResponse has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Get the value of all properties of this {@link BckndExecutableResourceQuotaResponse} instance
   * including unrecognized properties.
   *
   * @return The map of all properties
   */
  @JsonIgnore
  @Nonnull
  public Map<String, Object> toMap() {
    final Map<String, Object> declaredFields = new LinkedHashMap<>(cloudSdkCustomFields);
    if (usage != null) declaredFields.put("usage", usage);
    if (quota != null) declaredFields.put("quota", quota);
    return declaredFields;
  }

  /**
   * Set an unrecognizable property of this {@link BckndExecutableResourceQuotaResponse} instance.
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
    final BckndExecutableResourceQuotaResponse bckndExecutableResourceQuotaResponse =
        (BckndExecutableResourceQuotaResponse) o;
    return Objects.equals(
            this.cloudSdkCustomFields, bckndExecutableResourceQuotaResponse.cloudSdkCustomFields)
        && Objects.equals(this.usage, bckndExecutableResourceQuotaResponse.usage)
        && Objects.equals(this.quota, bckndExecutableResourceQuotaResponse.quota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usage, quota, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class BckndExecutableResourceQuotaResponse {\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
   * BckndExecutableResourceQuotaResponse} instance with all required arguments.
   */
  public static Builder create() {
    return (quota) -> new BckndExecutableResourceQuotaResponse().quota(quota);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the quota of this {@link BckndExecutableResourceQuotaResponse} instance.
     *
     * @param quota The quota of this {@link BckndExecutableResourceQuotaResponse}
     * @return The BckndExecutableResourceQuotaResponse instance.
     */
    BckndExecutableResourceQuotaResponse quota(
        @Nonnull final BckndExecutableResourceQuotaResponseQuota quota);
  }
}
