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

/** BckndResourceGroupsPostRequest */
// CHECKSTYLE:OFF
public class BckndResourceGroupsPostRequest
// CHECKSTYLE:ON
{
  @JsonProperty("resourceGroupId")
  private String resourceGroupId;

  @JsonProperty("labels")
  private List<BckndResourceGroupLabel> labels = new ArrayList<>();

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for BckndResourceGroupsPostRequest. */
  protected BckndResourceGroupsPostRequest() {}

  /**
   * Set the resourceGroupId of this {@link BckndResourceGroupsPostRequest} instance and return the
   * same instance.
   *
   * @param resourceGroupId resource group id
   * @return The same instance of this {@link BckndResourceGroupsPostRequest} class
   */
  @Nonnull
  public BckndResourceGroupsPostRequest resourceGroupId(@Nullable final String resourceGroupId) {
    this.resourceGroupId = resourceGroupId;
    return this;
  }

  /**
   * resource group id
   *
   * @return resourceGroupId The resourceGroupId of this {@link BckndResourceGroupsPostRequest}
   *     instance.
   */
  @Nonnull
  public String getResourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Set the resourceGroupId of this {@link BckndResourceGroupsPostRequest} instance.
   *
   * @param resourceGroupId resource group id
   */
  public void setResourceGroupId(@Nullable final String resourceGroupId) {
    this.resourceGroupId = resourceGroupId;
  }

  /**
   * Set the labels of this {@link BckndResourceGroupsPostRequest} instance and return the same
   * instance.
   *
   * @param labels Arbitrary labels as meta information
   * @return The same instance of this {@link BckndResourceGroupsPostRequest} class
   */
  @Nonnull
  public BckndResourceGroupsPostRequest labels(
      @Nullable final List<BckndResourceGroupLabel> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Add one labels instance to this {@link BckndResourceGroupsPostRequest}.
   *
   * @param labelsItem The labels that should be added
   * @return The same instance of type {@link BckndResourceGroupsPostRequest}
   */
  @Nonnull
  public BckndResourceGroupsPostRequest addLabelsItem(
      @Nonnull final BckndResourceGroupLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Arbitrary labels as meta information
   *
   * @return labels The labels of this {@link BckndResourceGroupsPostRequest} instance.
   */
  @Nonnull
  public List<BckndResourceGroupLabel> getLabels() {
    return labels;
  }

  /**
   * Set the labels of this {@link BckndResourceGroupsPostRequest} instance.
   *
   * @param labels Arbitrary labels as meta information
   */
  public void setLabels(@Nullable final List<BckndResourceGroupLabel> labels) {
    this.labels = labels;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link BckndResourceGroupsPostRequest}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link BckndResourceGroupsPostRequest}
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
          "BckndResourceGroupsPostRequest has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Get the value of all properties of this {@link BckndResourceGroupsPostRequest} instance
   * including unrecognized properties.
   *
   * @return The map of all properties
   */
  @JsonIgnore
  @Nonnull
  public Map<String, Object> toMap() {
    final Map<String, Object> declaredFields = new LinkedHashMap<>(cloudSdkCustomFields);
    if (resourceGroupId != null) declaredFields.put("resourceGroupId", resourceGroupId);
    if (labels != null) declaredFields.put("labels", labels);
    return declaredFields;
  }

  /**
   * Set an unrecognizable property of this {@link BckndResourceGroupsPostRequest} instance. If the
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
    final BckndResourceGroupsPostRequest bckndResourceGroupsPostRequest =
        (BckndResourceGroupsPostRequest) o;
    return Objects.equals(
            this.cloudSdkCustomFields, bckndResourceGroupsPostRequest.cloudSdkCustomFields)
        && Objects.equals(this.resourceGroupId, bckndResourceGroupsPostRequest.resourceGroupId)
        && Objects.equals(this.labels, bckndResourceGroupsPostRequest.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceGroupId, labels, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class BckndResourceGroupsPostRequest {\n");
    sb.append("    resourceGroupId: ").append(toIndentedString(resourceGroupId)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

  /** Create a new {@link BckndResourceGroupsPostRequest} instance. No arguments are required. */
  public static BckndResourceGroupsPostRequest create() {
    return new BckndResourceGroupsPostRequest();
  }
}
