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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** Repository details */
// CHECKSTYLE:OFF
public class BckndArgoCDRepositoryDetails
// CHECKSTYLE:ON
{
  @JsonProperty("name")
  private String name;

  @JsonProperty("url")
  private String url;

  /** The status of the repository&#39;s on-boarding */
  public enum StatusEnum {
    /** The ERROR option of this BckndArgoCDRepositoryDetails */
    ERROR("ERROR"),

    /** The IN_PROGRESS option of this BckndArgoCDRepositoryDetails */
    IN_PROGRESS("IN-PROGRESS"),

    /** The COMPLETED option of this BckndArgoCDRepositoryDetails */
    COMPLETED("COMPLETED"),

    /** The UNKNOWN_DEFAULT_OPEN_API option of this BckndArgoCDRepositoryDetails */
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    StatusEnum(String value) {
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
     * @return The enum value of type BckndArgoCDRepositoryDetails
     */
    @JsonCreator
    @Nonnull
    public static StatusEnum fromValue(@Nonnull final String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for BckndArgoCDRepositoryDetails. */
  protected BckndArgoCDRepositoryDetails() {}

  /**
   * Set the name of this {@link BckndArgoCDRepositoryDetails} instance and return the same
   * instance.
   *
   * @param name The name of the repository
   * @return The same instance of this {@link BckndArgoCDRepositoryDetails} class
   */
  @Nonnull
  public BckndArgoCDRepositoryDetails name(@Nullable final String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the repository
   *
   * @return name The name of this {@link BckndArgoCDRepositoryDetails} instance.
   */
  @Nonnull
  public String getName() {
    return name;
  }

  /**
   * Set the name of this {@link BckndArgoCDRepositoryDetails} instance.
   *
   * @param name The name of the repository
   */
  public void setName(@Nullable final String name) {
    this.name = name;
  }

  /**
   * Set the url of this {@link BckndArgoCDRepositoryDetails} instance and return the same instance.
   *
   * @param url The repository URL
   * @return The same instance of this {@link BckndArgoCDRepositoryDetails} class
   */
  @Nonnull
  public BckndArgoCDRepositoryDetails url(@Nullable final String url) {
    this.url = url;
    return this;
  }

  /**
   * The repository URL
   *
   * @return url The url of this {@link BckndArgoCDRepositoryDetails} instance.
   */
  @Nonnull
  public String getUrl() {
    return url;
  }

  /**
   * Set the url of this {@link BckndArgoCDRepositoryDetails} instance.
   *
   * @param url The repository URL
   */
  public void setUrl(@Nullable final String url) {
    this.url = url;
  }

  /**
   * Set the status of this {@link BckndArgoCDRepositoryDetails} instance and return the same
   * instance.
   *
   * @param status The status of the repository&#39;s on-boarding
   * @return The same instance of this {@link BckndArgoCDRepositoryDetails} class
   */
  @Nonnull
  public BckndArgoCDRepositoryDetails status(@Nullable final StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the repository&#39;s on-boarding
   *
   * @return status The status of this {@link BckndArgoCDRepositoryDetails} instance.
   */
  @Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * Set the status of this {@link BckndArgoCDRepositoryDetails} instance.
   *
   * @param status The status of the repository&#39;s on-boarding
   */
  public void setStatus(@Nullable final StatusEnum status) {
    this.status = status;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link BckndArgoCDRepositoryDetails}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link BckndArgoCDRepositoryDetails}
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
          "BckndArgoCDRepositoryDetails has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Get the value of all properties of this {@link BckndArgoCDRepositoryDetails} instance including
   * unrecognized properties.
   *
   * @return The map of all properties
   */
  @JsonIgnore
  @Nonnull
  public Map<String, Object> toMap() {
    final Map<String, Object> declaredFields = new LinkedHashMap<>(cloudSdkCustomFields);
    if (name != null) declaredFields.put("name", name);
    if (url != null) declaredFields.put("url", url);
    if (status != null) declaredFields.put("status", status);
    return declaredFields;
  }

  /**
   * Set an unrecognizable property of this {@link BckndArgoCDRepositoryDetails} instance. If the
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
    final BckndArgoCDRepositoryDetails bckndArgoCDRepositoryDetails =
        (BckndArgoCDRepositoryDetails) o;
    return Objects.equals(
            this.cloudSdkCustomFields, bckndArgoCDRepositoryDetails.cloudSdkCustomFields)
        && Objects.equals(this.name, bckndArgoCDRepositoryDetails.name)
        && Objects.equals(this.url, bckndArgoCDRepositoryDetails.url)
        && Objects.equals(this.status, bckndArgoCDRepositoryDetails.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url, status, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class BckndArgoCDRepositoryDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

  /** Create a new {@link BckndArgoCDRepositoryDetails} instance. No arguments are required. */
  public static BckndArgoCDRepositoryDetails create() {
    return new BckndArgoCDRepositoryDetails();
  }
}
