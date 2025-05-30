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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** MetaExtensionsDatasetLimits */
// CHECKSTYLE:OFF
public class MetaExtensionsDatasetLimits
// CHECKSTYLE:ON
{
  @JsonProperty("maxUploadFileSize")
  private Integer maxUploadFileSize = 104857600;

  @JsonProperty("maxFilesPerDataset")
  private Integer maxFilesPerDataset = -1;

  @JsonProperty("acceptedContentTypes")
  private List<String> acceptedContentTypes = new ArrayList<>();

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for MetaExtensionsDatasetLimits. */
  protected MetaExtensionsDatasetLimits() {}

  /**
   * Set the maxUploadFileSize of this {@link MetaExtensionsDatasetLimits} instance and return the
   * same instance.
   *
   * @param maxUploadFileSize Max size (in bytes) of a single uploaded file allowed by this runtime
   *     per resource group.
   * @return The same instance of this {@link MetaExtensionsDatasetLimits} class
   */
  @Nonnull
  public MetaExtensionsDatasetLimits maxUploadFileSize(@Nullable final Integer maxUploadFileSize) {
    this.maxUploadFileSize = maxUploadFileSize;
    return this;
  }

  /**
   * Max size (in bytes) of a single uploaded file allowed by this runtime per resource group.
   *
   * @return maxUploadFileSize The maxUploadFileSize of this {@link MetaExtensionsDatasetLimits}
   *     instance.
   */
  @Nonnull
  public Integer getMaxUploadFileSize() {
    return maxUploadFileSize;
  }

  /**
   * Set the maxUploadFileSize of this {@link MetaExtensionsDatasetLimits} instance.
   *
   * @param maxUploadFileSize Max size (in bytes) of a single uploaded file allowed by this runtime
   *     per resource group.
   */
  public void setMaxUploadFileSize(@Nullable final Integer maxUploadFileSize) {
    this.maxUploadFileSize = maxUploadFileSize;
  }

  /**
   * Set the maxFilesPerDataset of this {@link MetaExtensionsDatasetLimits} instance and return the
   * same instance.
   *
   * @param maxFilesPerDataset Max number of files per dataset. &lt;0 means unlimited.
   * @return The same instance of this {@link MetaExtensionsDatasetLimits} class
   */
  @Nonnull
  public MetaExtensionsDatasetLimits maxFilesPerDataset(
      @Nullable final Integer maxFilesPerDataset) {
    this.maxFilesPerDataset = maxFilesPerDataset;
    return this;
  }

  /**
   * Max number of files per dataset. &lt;0 means unlimited.
   *
   * @return maxFilesPerDataset The maxFilesPerDataset of this {@link MetaExtensionsDatasetLimits}
   *     instance.
   */
  @Nonnull
  public Integer getMaxFilesPerDataset() {
    return maxFilesPerDataset;
  }

  /**
   * Set the maxFilesPerDataset of this {@link MetaExtensionsDatasetLimits} instance.
   *
   * @param maxFilesPerDataset Max number of files per dataset. &lt;0 means unlimited.
   */
  public void setMaxFilesPerDataset(@Nullable final Integer maxFilesPerDataset) {
    this.maxFilesPerDataset = maxFilesPerDataset;
  }

  /**
   * Set the acceptedContentTypes of this {@link MetaExtensionsDatasetLimits} instance and return
   * the same instance.
   *
   * @param acceptedContentTypes The acceptedContentTypes of this {@link
   *     MetaExtensionsDatasetLimits}
   * @return The same instance of this {@link MetaExtensionsDatasetLimits} class
   */
  @Nonnull
  public MetaExtensionsDatasetLimits acceptedContentTypes(
      @Nullable final List<String> acceptedContentTypes) {
    this.acceptedContentTypes = acceptedContentTypes;
    return this;
  }

  /**
   * Add one acceptedContentTypes instance to this {@link MetaExtensionsDatasetLimits}.
   *
   * @param acceptedContentTypesItem The acceptedContentTypes that should be added
   * @return The same instance of type {@link MetaExtensionsDatasetLimits}
   */
  @Nonnull
  public MetaExtensionsDatasetLimits addAcceptedContentTypesItem(
      @Nonnull final String acceptedContentTypesItem) {
    if (this.acceptedContentTypes == null) {
      this.acceptedContentTypes = new ArrayList<>();
    }
    this.acceptedContentTypes.add(acceptedContentTypesItem);
    return this;
  }

  /**
   * Get acceptedContentTypes
   *
   * @return acceptedContentTypes The acceptedContentTypes of this {@link
   *     MetaExtensionsDatasetLimits} instance.
   */
  @Nonnull
  public List<String> getAcceptedContentTypes() {
    return acceptedContentTypes;
  }

  /**
   * Set the acceptedContentTypes of this {@link MetaExtensionsDatasetLimits} instance.
   *
   * @param acceptedContentTypes The acceptedContentTypes of this {@link
   *     MetaExtensionsDatasetLimits}
   */
  public void setAcceptedContentTypes(@Nullable final List<String> acceptedContentTypes) {
    this.acceptedContentTypes = acceptedContentTypes;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link MetaExtensionsDatasetLimits}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link MetaExtensionsDatasetLimits}
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
          "MetaExtensionsDatasetLimits has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Get the value of all properties of this {@link MetaExtensionsDatasetLimits} instance including
   * unrecognized properties.
   *
   * @return The map of all properties
   */
  @JsonIgnore
  @Nonnull
  public Map<String, Object> toMap() {
    final Map<String, Object> declaredFields = new LinkedHashMap<>(cloudSdkCustomFields);
    if (maxUploadFileSize != null) declaredFields.put("maxUploadFileSize", maxUploadFileSize);
    if (maxFilesPerDataset != null) declaredFields.put("maxFilesPerDataset", maxFilesPerDataset);
    if (acceptedContentTypes != null)
      declaredFields.put("acceptedContentTypes", acceptedContentTypes);
    return declaredFields;
  }

  /**
   * Set an unrecognizable property of this {@link MetaExtensionsDatasetLimits} instance. If the map
   * previously contained a mapping for the key, the old value is replaced by the specified value.
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
    final MetaExtensionsDatasetLimits metaExtensionsDatasetLimits = (MetaExtensionsDatasetLimits) o;
    return Objects.equals(
            this.cloudSdkCustomFields, metaExtensionsDatasetLimits.cloudSdkCustomFields)
        && Objects.equals(this.maxUploadFileSize, metaExtensionsDatasetLimits.maxUploadFileSize)
        && Objects.equals(this.maxFilesPerDataset, metaExtensionsDatasetLimits.maxFilesPerDataset)
        && Objects.equals(
            this.acceptedContentTypes, metaExtensionsDatasetLimits.acceptedContentTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        maxUploadFileSize, maxFilesPerDataset, acceptedContentTypes, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class MetaExtensionsDatasetLimits {\n");
    sb.append("    maxUploadFileSize: ").append(toIndentedString(maxUploadFileSize)).append("\n");
    sb.append("    maxFilesPerDataset: ").append(toIndentedString(maxFilesPerDataset)).append("\n");
    sb.append("    acceptedContentTypes: ")
        .append(toIndentedString(acceptedContentTypes))
        .append("\n");
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

  /** Create a new {@link MetaExtensionsDatasetLimits} instance. No arguments are required. */
  public static MetaExtensionsDatasetLimits create() {
    return new MetaExtensionsDatasetLimits();
  }
}
