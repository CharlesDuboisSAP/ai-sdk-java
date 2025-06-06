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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Base data of the artifact; this is the data that can be provided when the artifact is created;
 * &#x60;name&#x60; and &#x60;kind&#x60; are required because they constitute important semantic
 * filtering criteria for use in training / inference executables (&#x60;name&#x60; is a semantic
 * handle of the artifact within a scenario and &#x60;kind&#x60; specifies the type of usage, e.g.
 * you would only want to allow models in the model operator).
 */
// CHECKSTYLE:OFF
public class AiArtifactPostData
// CHECKSTYLE:ON
{
  @JsonProperty("labels")
  private List<AiLabel> labels = new ArrayList<>();

  @JsonProperty("name")
  private String name;

  /** Kind of the artifact, i.e. model or dataset */
  public enum KindEnum {
    /** The MODEL option of this AiArtifactPostData */
    MODEL("model"),

    /** The DATASET option of this AiArtifactPostData */
    DATASET("dataset"),

    /** The RESULTSET option of this AiArtifactPostData */
    RESULTSET("resultset"),

    /** The OTHER option of this AiArtifactPostData */
    OTHER("other"),

    /** The UNKNOWN_DEFAULT_OPEN_API option of this AiArtifactPostData */
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    KindEnum(String value) {
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
     * @return The enum value of type AiArtifactPostData
     */
    @JsonCreator
    @Nonnull
    public static KindEnum fromValue(@Nonnull final String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  @JsonProperty("kind")
  private KindEnum kind;

  @JsonProperty("url")
  private String url;

  @JsonProperty("description")
  private String description;

  @JsonProperty("scenarioId")
  private String scenarioId;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for AiArtifactPostData. */
  protected AiArtifactPostData() {}

  /**
   * Set the labels of this {@link AiArtifactPostData} instance and return the same instance.
   *
   * @param labels Arbitrary labels as meta information
   * @return The same instance of this {@link AiArtifactPostData} class
   */
  @Nonnull
  public AiArtifactPostData labels(@Nullable final List<AiLabel> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Add one labels instance to this {@link AiArtifactPostData}.
   *
   * @param labelsItem The labels that should be added
   * @return The same instance of type {@link AiArtifactPostData}
   */
  @Nonnull
  public AiArtifactPostData addLabelsItem(@Nonnull final AiLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Arbitrary labels as meta information
   *
   * @return labels The labels of this {@link AiArtifactPostData} instance.
   */
  @Nonnull
  public List<AiLabel> getLabels() {
    return labels;
  }

  /**
   * Set the labels of this {@link AiArtifactPostData} instance.
   *
   * @param labels Arbitrary labels as meta information
   */
  public void setLabels(@Nullable final List<AiLabel> labels) {
    this.labels = labels;
  }

  /**
   * Set the name of this {@link AiArtifactPostData} instance and return the same instance.
   *
   * @param name Name of the artifact
   * @return The same instance of this {@link AiArtifactPostData} class
   */
  @Nonnull
  public AiArtifactPostData name(@Nonnull final String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the artifact
   *
   * @return name The name of this {@link AiArtifactPostData} instance.
   */
  @Nonnull
  public String getName() {
    return name;
  }

  /**
   * Set the name of this {@link AiArtifactPostData} instance.
   *
   * @param name Name of the artifact
   */
  public void setName(@Nonnull final String name) {
    this.name = name;
  }

  /**
   * Set the kind of this {@link AiArtifactPostData} instance and return the same instance.
   *
   * @param kind Kind of the artifact, i.e. model or dataset
   * @return The same instance of this {@link AiArtifactPostData} class
   */
  @Nonnull
  public AiArtifactPostData kind(@Nonnull final KindEnum kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind of the artifact, i.e. model or dataset
   *
   * @return kind The kind of this {@link AiArtifactPostData} instance.
   */
  @Nonnull
  public KindEnum getKind() {
    return kind;
  }

  /**
   * Set the kind of this {@link AiArtifactPostData} instance.
   *
   * @param kind Kind of the artifact, i.e. model or dataset
   */
  public void setKind(@Nonnull final KindEnum kind) {
    this.kind = kind;
  }

  /**
   * Set the url of this {@link AiArtifactPostData} instance and return the same instance.
   *
   * @param url Reference to the location of the artifact.
   * @return The same instance of this {@link AiArtifactPostData} class
   */
  @Nonnull
  public AiArtifactPostData url(@Nonnull final String url) {
    this.url = url;
    return this;
  }

  /**
   * Reference to the location of the artifact.
   *
   * @return url The url of this {@link AiArtifactPostData} instance.
   */
  @Nonnull
  public String getUrl() {
    return url;
  }

  /**
   * Set the url of this {@link AiArtifactPostData} instance.
   *
   * @param url Reference to the location of the artifact.
   */
  public void setUrl(@Nonnull final String url) {
    this.url = url;
  }

  /**
   * Set the description of this {@link AiArtifactPostData} instance and return the same instance.
   *
   * @param description Description of the artifact
   * @return The same instance of this {@link AiArtifactPostData} class
   */
  @Nonnull
  public AiArtifactPostData description(@Nullable final String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the artifact
   *
   * @return description The description of this {@link AiArtifactPostData} instance.
   */
  @Nonnull
  public String getDescription() {
    return description;
  }

  /**
   * Set the description of this {@link AiArtifactPostData} instance.
   *
   * @param description Description of the artifact
   */
  public void setDescription(@Nullable final String description) {
    this.description = description;
  }

  /**
   * Set the scenarioId of this {@link AiArtifactPostData} instance and return the same instance.
   *
   * @param scenarioId ID of the scenario
   * @return The same instance of this {@link AiArtifactPostData} class
   */
  @Nonnull
  public AiArtifactPostData scenarioId(@Nonnull final String scenarioId) {
    this.scenarioId = scenarioId;
    return this;
  }

  /**
   * ID of the scenario
   *
   * @return scenarioId The scenarioId of this {@link AiArtifactPostData} instance.
   */
  @Nonnull
  public String getScenarioId() {
    return scenarioId;
  }

  /**
   * Set the scenarioId of this {@link AiArtifactPostData} instance.
   *
   * @param scenarioId ID of the scenario
   */
  public void setScenarioId(@Nonnull final String scenarioId) {
    this.scenarioId = scenarioId;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link AiArtifactPostData}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link AiArtifactPostData} instance.
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
      throw new NoSuchElementException("AiArtifactPostData has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Get the value of all properties of this {@link AiArtifactPostData} instance including
   * unrecognized properties.
   *
   * @return The map of all properties
   */
  @JsonIgnore
  @Nonnull
  public Map<String, Object> toMap() {
    final Map<String, Object> declaredFields = new LinkedHashMap<>(cloudSdkCustomFields);
    if (labels != null) declaredFields.put("labels", labels);
    if (name != null) declaredFields.put("name", name);
    if (kind != null) declaredFields.put("kind", kind);
    if (url != null) declaredFields.put("url", url);
    if (description != null) declaredFields.put("description", description);
    if (scenarioId != null) declaredFields.put("scenarioId", scenarioId);
    return declaredFields;
  }

  /**
   * Set an unrecognizable property of this {@link AiArtifactPostData} instance. If the map
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
    final AiArtifactPostData aiArtifactPostData = (AiArtifactPostData) o;
    return Objects.equals(this.cloudSdkCustomFields, aiArtifactPostData.cloudSdkCustomFields)
        && Objects.equals(this.labels, aiArtifactPostData.labels)
        && Objects.equals(this.name, aiArtifactPostData.name)
        && Objects.equals(this.kind, aiArtifactPostData.kind)
        && Objects.equals(this.url, aiArtifactPostData.url)
        && Objects.equals(this.description, aiArtifactPostData.description)
        && Objects.equals(this.scenarioId, aiArtifactPostData.scenarioId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, name, kind, url, description, scenarioId, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class AiArtifactPostData {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
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
   * Create a type-safe, fluent-api builder object to construct a new {@link AiArtifactPostData}
   * instance with all required arguments.
   */
  public static Builder create() {
    return (name) ->
        (kind) ->
            (url) ->
                (scenarioId) ->
                    new AiArtifactPostData().name(name).kind(kind).url(url).scenarioId(scenarioId);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the name of this {@link AiArtifactPostData} instance.
     *
     * @param name Name of the artifact
     * @return The AiArtifactPostData builder.
     */
    Builder1 name(@Nonnull final String name);
  }

  /** Builder helper class. */
  public interface Builder1 {
    /**
     * Set the kind of this {@link AiArtifactPostData} instance.
     *
     * @param kind Kind of the artifact, i.e. model or dataset
     * @return The AiArtifactPostData builder.
     */
    Builder2 kind(@Nonnull final KindEnum kind);
  }

  /** Builder helper class. */
  public interface Builder2 {
    /**
     * Set the url of this {@link AiArtifactPostData} instance.
     *
     * @param url Reference to the location of the artifact.
     * @return The AiArtifactPostData builder.
     */
    Builder3 url(@Nonnull final String url);
  }

  /** Builder helper class. */
  public interface Builder3 {
    /**
     * Set the scenarioId of this {@link AiArtifactPostData} instance.
     *
     * @param scenarioId ID of the scenario
     * @return The AiArtifactPostData instance.
     */
    AiArtifactPostData scenarioId(@Nonnull final String scenarioId);
  }
}
