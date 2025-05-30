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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** Entity having labels */
// CHECKSTYLE:OFF
public class RTAExecutable
// CHECKSTYLE:ON
{
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("scenarioId")
  private String scenarioId;

  @JsonProperty("inputArtifacts")
  private List<RTAExecutableArtifact> inputArtifacts = new ArrayList<>();

  @JsonProperty("outputArtifacts")
  private List<RTAExecutableArtifact> outputArtifacts = new ArrayList<>();

  @JsonProperty("parameters")
  private List<RTAExecutableParameter> parameters = new ArrayList<>();

  @JsonProperty("deployable")
  private Boolean deployable;

  @JsonProperty("labels")
  private List<RTALabel> labels = new ArrayList<>();

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt;

  @JsonProperty("modifiedAt")
  private OffsetDateTime modifiedAt;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for RTAExecutable. */
  protected RTAExecutable() {}

  /**
   * Set the id of this {@link RTAExecutable} instance and return the same instance.
   *
   * @param id ID of the executable
   * @return The same instance of this {@link RTAExecutable} class
   */
  @Nonnull
  public RTAExecutable id(@Nonnull final String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the executable
   *
   * @return id The id of this {@link RTAExecutable} instance.
   */
  @Nonnull
  public String getId() {
    return id;
  }

  /**
   * Set the id of this {@link RTAExecutable} instance.
   *
   * @param id ID of the executable
   */
  public void setId(@Nonnull final String id) {
    this.id = id;
  }

  /**
   * Set the name of this {@link RTAExecutable} instance and return the same instance.
   *
   * @param name Name of the executable
   * @return The same instance of this {@link RTAExecutable} class
   */
  @Nonnull
  public RTAExecutable name(@Nonnull final String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the executable
   *
   * @return name The name of this {@link RTAExecutable} instance.
   */
  @Nonnull
  public String getName() {
    return name;
  }

  /**
   * Set the name of this {@link RTAExecutable} instance.
   *
   * @param name Name of the executable
   */
  public void setName(@Nonnull final String name) {
    this.name = name;
  }

  /**
   * Set the description of this {@link RTAExecutable} instance and return the same instance.
   *
   * @param description Description of the executable
   * @return The same instance of this {@link RTAExecutable} class
   */
  @Nonnull
  public RTAExecutable description(@Nullable final String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the executable
   *
   * @return description The description of this {@link RTAExecutable} instance.
   */
  @Nonnull
  public String getDescription() {
    return description;
  }

  /**
   * Set the description of this {@link RTAExecutable} instance.
   *
   * @param description Description of the executable
   */
  public void setDescription(@Nullable final String description) {
    this.description = description;
  }

  /**
   * Set the scenarioId of this {@link RTAExecutable} instance and return the same instance.
   *
   * @param scenarioId ID of the scenario
   * @return The same instance of this {@link RTAExecutable} class
   */
  @Nonnull
  public RTAExecutable scenarioId(@Nonnull final String scenarioId) {
    this.scenarioId = scenarioId;
    return this;
  }

  /**
   * ID of the scenario
   *
   * @return scenarioId The scenarioId of this {@link RTAExecutable} instance.
   */
  @Nonnull
  public String getScenarioId() {
    return scenarioId;
  }

  /**
   * Set the scenarioId of this {@link RTAExecutable} instance.
   *
   * @param scenarioId ID of the scenario
   */
  public void setScenarioId(@Nonnull final String scenarioId) {
    this.scenarioId = scenarioId;
  }

  /**
   * Set the inputArtifacts of this {@link RTAExecutable} instance and return the same instance.
   *
   * @param inputArtifacts List of Artifacts that the executable expects as input artifacts
   * @return The same instance of this {@link RTAExecutable} class
   */
  @Nonnull
  public RTAExecutable inputArtifacts(@Nullable final List<RTAExecutableArtifact> inputArtifacts) {
    this.inputArtifacts = inputArtifacts;
    return this;
  }

  /**
   * Add one inputArtifacts instance to this {@link RTAExecutable}.
   *
   * @param inputArtifactsItem The inputArtifacts that should be added
   * @return The same instance of type {@link RTAExecutable}
   */
  @Nonnull
  public RTAExecutable addInputArtifactsItem(
      @Nonnull final RTAExecutableArtifact inputArtifactsItem) {
    if (this.inputArtifacts == null) {
      this.inputArtifacts = new ArrayList<>();
    }
    this.inputArtifacts.add(inputArtifactsItem);
    return this;
  }

  /**
   * List of Artifacts that the executable expects as input artifacts
   *
   * @return inputArtifacts The inputArtifacts of this {@link RTAExecutable} instance.
   */
  @Nonnull
  public List<RTAExecutableArtifact> getInputArtifacts() {
    return inputArtifacts;
  }

  /**
   * Set the inputArtifacts of this {@link RTAExecutable} instance.
   *
   * @param inputArtifacts List of Artifacts that the executable expects as input artifacts
   */
  public void setInputArtifacts(@Nullable final List<RTAExecutableArtifact> inputArtifacts) {
    this.inputArtifacts = inputArtifacts;
  }

  /**
   * Set the outputArtifacts of this {@link RTAExecutable} instance and return the same instance.
   *
   * @param outputArtifacts List of Artifacts that the executable will produce. If storage is not
   *     managed internally, a storage location will have to be specified when triggering an
   *     execution
   * @return The same instance of this {@link RTAExecutable} class
   */
  @Nonnull
  public RTAExecutable outputArtifacts(
      @Nullable final List<RTAExecutableArtifact> outputArtifacts) {
    this.outputArtifacts = outputArtifacts;
    return this;
  }

  /**
   * Add one outputArtifacts instance to this {@link RTAExecutable}.
   *
   * @param outputArtifactsItem The outputArtifacts that should be added
   * @return The same instance of type {@link RTAExecutable}
   */
  @Nonnull
  public RTAExecutable addOutputArtifactsItem(
      @Nonnull final RTAExecutableArtifact outputArtifactsItem) {
    if (this.outputArtifacts == null) {
      this.outputArtifacts = new ArrayList<>();
    }
    this.outputArtifacts.add(outputArtifactsItem);
    return this;
  }

  /**
   * List of Artifacts that the executable will produce. If storage is not managed internally, a
   * storage location will have to be specified when triggering an execution
   *
   * @return outputArtifacts The outputArtifacts of this {@link RTAExecutable} instance.
   */
  @Nonnull
  public List<RTAExecutableArtifact> getOutputArtifacts() {
    return outputArtifacts;
  }

  /**
   * Set the outputArtifacts of this {@link RTAExecutable} instance.
   *
   * @param outputArtifacts List of Artifacts that the executable will produce. If storage is not
   *     managed internally, a storage location will have to be specified when triggering an
   *     execution
   */
  public void setOutputArtifacts(@Nullable final List<RTAExecutableArtifact> outputArtifacts) {
    this.outputArtifacts = outputArtifacts;
  }

  /**
   * Set the parameters of this {@link RTAExecutable} instance and return the same instance.
   *
   * @param parameters Executable parameters
   * @return The same instance of this {@link RTAExecutable} class
   */
  @Nonnull
  public RTAExecutable parameters(@Nullable final List<RTAExecutableParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Add one parameters instance to this {@link RTAExecutable}.
   *
   * @param parametersItem The parameters that should be added
   * @return The same instance of type {@link RTAExecutable}
   */
  @Nonnull
  public RTAExecutable addParametersItem(@Nonnull final RTAExecutableParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Executable parameters
   *
   * @return parameters The parameters of this {@link RTAExecutable} instance.
   */
  @Nonnull
  public List<RTAExecutableParameter> getParameters() {
    return parameters;
  }

  /**
   * Set the parameters of this {@link RTAExecutable} instance.
   *
   * @param parameters Executable parameters
   */
  public void setParameters(@Nullable final List<RTAExecutableParameter> parameters) {
    this.parameters = parameters;
  }

  /**
   * Set the deployable of this {@link RTAExecutable} instance and return the same instance.
   *
   * @param deployable Whether this pipeline is deployable
   * @return The same instance of this {@link RTAExecutable} class
   */
  @Nonnull
  public RTAExecutable deployable(@Nonnull final Boolean deployable) {
    this.deployable = deployable;
    return this;
  }

  /**
   * Whether this pipeline is deployable
   *
   * @return deployable The deployable of this {@link RTAExecutable} instance.
   */
  @Nonnull
  public Boolean isDeployable() {
    return deployable;
  }

  /**
   * Set the deployable of this {@link RTAExecutable} instance.
   *
   * @param deployable Whether this pipeline is deployable
   */
  public void setDeployable(@Nonnull final Boolean deployable) {
    this.deployable = deployable;
  }

  /**
   * Set the labels of this {@link RTAExecutable} instance and return the same instance.
   *
   * @param labels Arbitrary labels as meta information
   * @return The same instance of this {@link RTAExecutable} class
   */
  @Nonnull
  public RTAExecutable labels(@Nullable final List<RTALabel> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Add one labels instance to this {@link RTAExecutable}.
   *
   * @param labelsItem The labels that should be added
   * @return The same instance of type {@link RTAExecutable}
   */
  @Nonnull
  public RTAExecutable addLabelsItem(@Nonnull final RTALabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Arbitrary labels as meta information
   *
   * @return labels The labels of this {@link RTAExecutable} instance.
   */
  @Nonnull
  public List<RTALabel> getLabels() {
    return labels;
  }

  /**
   * Set the labels of this {@link RTAExecutable} instance.
   *
   * @param labels Arbitrary labels as meta information
   */
  public void setLabels(@Nullable final List<RTALabel> labels) {
    this.labels = labels;
  }

  /**
   * Set the createdAt of this {@link RTAExecutable} instance and return the same instance.
   *
   * @param createdAt Timestamp of resource creation
   * @return The same instance of this {@link RTAExecutable} class
   */
  @Nonnull
  public RTAExecutable createdAt(@Nonnull final OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp of resource creation
   *
   * @return createdAt The createdAt of this {@link RTAExecutable} instance.
   */
  @Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Set the createdAt of this {@link RTAExecutable} instance.
   *
   * @param createdAt Timestamp of resource creation
   */
  public void setCreatedAt(@Nonnull final OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Set the modifiedAt of this {@link RTAExecutable} instance and return the same instance.
   *
   * @param modifiedAt Timestamp of latest resource modification
   * @return The same instance of this {@link RTAExecutable} class
   */
  @Nonnull
  public RTAExecutable modifiedAt(@Nonnull final OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp of latest resource modification
   *
   * @return modifiedAt The modifiedAt of this {@link RTAExecutable} instance.
   */
  @Nonnull
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  /**
   * Set the modifiedAt of this {@link RTAExecutable} instance.
   *
   * @param modifiedAt Timestamp of latest resource modification
   */
  public void setModifiedAt(@Nonnull final OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link RTAExecutable}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link RTAExecutable} instance.
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
      throw new NoSuchElementException("RTAExecutable has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Get the value of all properties of this {@link RTAExecutable} instance including unrecognized
   * properties.
   *
   * @return The map of all properties
   */
  @JsonIgnore
  @Nonnull
  public Map<String, Object> toMap() {
    final Map<String, Object> declaredFields = new LinkedHashMap<>(cloudSdkCustomFields);
    if (id != null) declaredFields.put("id", id);
    if (name != null) declaredFields.put("name", name);
    if (description != null) declaredFields.put("description", description);
    if (scenarioId != null) declaredFields.put("scenarioId", scenarioId);
    if (inputArtifacts != null) declaredFields.put("inputArtifacts", inputArtifacts);
    if (outputArtifacts != null) declaredFields.put("outputArtifacts", outputArtifacts);
    if (parameters != null) declaredFields.put("parameters", parameters);
    if (deployable != null) declaredFields.put("deployable", deployable);
    if (labels != null) declaredFields.put("labels", labels);
    if (createdAt != null) declaredFields.put("createdAt", createdAt);
    if (modifiedAt != null) declaredFields.put("modifiedAt", modifiedAt);
    return declaredFields;
  }

  /**
   * Set an unrecognizable property of this {@link RTAExecutable} instance. If the map previously
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
    final RTAExecutable rtAExecutable = (RTAExecutable) o;
    return Objects.equals(this.cloudSdkCustomFields, rtAExecutable.cloudSdkCustomFields)
        && Objects.equals(this.id, rtAExecutable.id)
        && Objects.equals(this.name, rtAExecutable.name)
        && Objects.equals(this.description, rtAExecutable.description)
        && Objects.equals(this.scenarioId, rtAExecutable.scenarioId)
        && Objects.equals(this.inputArtifacts, rtAExecutable.inputArtifacts)
        && Objects.equals(this.outputArtifacts, rtAExecutable.outputArtifacts)
        && Objects.equals(this.parameters, rtAExecutable.parameters)
        && Objects.equals(this.deployable, rtAExecutable.deployable)
        && Objects.equals(this.labels, rtAExecutable.labels)
        && Objects.equals(this.createdAt, rtAExecutable.createdAt)
        && Objects.equals(this.modifiedAt, rtAExecutable.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        name,
        description,
        scenarioId,
        inputArtifacts,
        outputArtifacts,
        parameters,
        deployable,
        labels,
        createdAt,
        modifiedAt,
        cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class RTAExecutable {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    inputArtifacts: ").append(toIndentedString(inputArtifacts)).append("\n");
    sb.append("    outputArtifacts: ").append(toIndentedString(outputArtifacts)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    deployable: ").append(toIndentedString(deployable)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
   * Create a type-safe, fluent-api builder object to construct a new {@link RTAExecutable} instance
   * with all required arguments.
   */
  public static Builder create() {
    return (id) ->
        (name) ->
            (scenarioId) ->
                (deployable) ->
                    (createdAt) ->
                        (modifiedAt) ->
                            new RTAExecutable()
                                .id(id)
                                .name(name)
                                .scenarioId(scenarioId)
                                .deployable(deployable)
                                .createdAt(createdAt)
                                .modifiedAt(modifiedAt);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the id of this {@link RTAExecutable} instance.
     *
     * @param id ID of the executable
     * @return The RTAExecutable builder.
     */
    Builder1 id(@Nonnull final String id);
  }

  /** Builder helper class. */
  public interface Builder1 {
    /**
     * Set the name of this {@link RTAExecutable} instance.
     *
     * @param name Name of the executable
     * @return The RTAExecutable builder.
     */
    Builder2 name(@Nonnull final String name);
  }

  /** Builder helper class. */
  public interface Builder2 {
    /**
     * Set the scenarioId of this {@link RTAExecutable} instance.
     *
     * @param scenarioId ID of the scenario
     * @return The RTAExecutable builder.
     */
    Builder3 scenarioId(@Nonnull final String scenarioId);
  }

  /** Builder helper class. */
  public interface Builder3 {
    /**
     * Set the deployable of this {@link RTAExecutable} instance.
     *
     * @param deployable Whether this pipeline is deployable
     * @return The RTAExecutable builder.
     */
    Builder4 deployable(@Nonnull final Boolean deployable);
  }

  /** Builder helper class. */
  public interface Builder4 {
    /**
     * Set the createdAt of this {@link RTAExecutable} instance.
     *
     * @param createdAt Timestamp of resource creation
     * @return The RTAExecutable builder.
     */
    Builder5 createdAt(@Nonnull final OffsetDateTime createdAt);
  }

  /** Builder helper class. */
  public interface Builder5 {
    /**
     * Set the modifiedAt of this {@link RTAExecutable} instance.
     *
     * @param modifiedAt Timestamp of latest resource modification
     * @return The RTAExecutable instance.
     */
    RTAExecutable modifiedAt(@Nonnull final OffsetDateTime modifiedAt);
  }
}
