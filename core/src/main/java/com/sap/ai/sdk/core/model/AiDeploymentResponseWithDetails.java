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
import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** Detail properties of the deployment */
// CHECKSTYLE:OFF
public class AiDeploymentResponseWithDetails
// CHECKSTYLE:ON
{
  @JsonProperty("id")
  private String id;

  @JsonProperty("deploymentUrl")
  private String deploymentUrl;

  @JsonProperty("configurationId")
  private String configurationId;

  @JsonProperty("configurationName")
  private String configurationName;

  @JsonProperty("executableId")
  private String executableId;

  @JsonProperty("scenarioId")
  private String scenarioId;

  @JsonProperty("status")
  private AiDeploymentStatus status;

  @JsonProperty("statusMessage")
  private String statusMessage;

  /** Deployment target status */
  public enum TargetStatusEnum {
    /** The RUNNING option of this AiDeploymentResponseWithDetails */
    RUNNING("RUNNING"),

    /** The STOPPED option of this AiDeploymentResponseWithDetails */
    STOPPED("STOPPED"),

    /** The DELETED option of this AiDeploymentResponseWithDetails */
    DELETED("DELETED"),

    /** The UNKNOWN_DEFAULT_OPEN_API option of this AiDeploymentResponseWithDetails */
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    TargetStatusEnum(String value) {
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
     * @return The enum value of type AiDeploymentResponseWithDetails
     */
    @JsonCreator
    @Nonnull
    public static TargetStatusEnum fromValue(@Nonnull final String value) {
      for (TargetStatusEnum b : TargetStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  @JsonProperty("targetStatus")
  private TargetStatusEnum targetStatus;

  /** Gets or Sets lastOperation */
  public enum LastOperationEnum {
    /** The CREATE option of this AiDeploymentResponseWithDetails */
    CREATE("CREATE"),

    /** The UPDATE option of this AiDeploymentResponseWithDetails */
    UPDATE("UPDATE"),

    /** The DELETE option of this AiDeploymentResponseWithDetails */
    DELETE("DELETE"),

    /** The CASCADE_UPDATE option of this AiDeploymentResponseWithDetails */
    CASCADE_UPDATE("CASCADE-UPDATE"),

    /** The UNKNOWN_DEFAULT_OPEN_API option of this AiDeploymentResponseWithDetails */
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    LastOperationEnum(String value) {
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
     * @return The enum value of type AiDeploymentResponseWithDetails
     */
    @JsonCreator
    @Nullable
    public static LastOperationEnum fromValue(@Nonnull final String value) {
      for (LastOperationEnum b : LastOperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("lastOperation")
  private LastOperationEnum lastOperation;

  @JsonProperty("latestRunningConfigurationId")
  private String latestRunningConfigurationId;

  @JsonProperty("ttl")
  private String ttl;

  @JsonProperty("details")
  private AiDeploymentDetails details;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt;

  @JsonProperty("modifiedAt")
  private OffsetDateTime modifiedAt;

  @JsonProperty("submissionTime")
  private OffsetDateTime submissionTime;

  @JsonProperty("startTime")
  private OffsetDateTime startTime;

  @JsonProperty("completionTime")
  private OffsetDateTime completionTime;

  @JsonProperty("statusDetails")
  private Object statusDetails;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for AiDeploymentResponseWithDetails. */
  protected AiDeploymentResponseWithDetails() {}

  /**
   * Set the id of this {@link AiDeploymentResponseWithDetails} instance and return the same
   * instance.
   *
   * @param id ID of the deployment
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails id(@Nonnull final String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the deployment
   *
   * @return id The id of this {@link AiDeploymentResponseWithDetails} instance.
   */
  @Nonnull
  public String getId() {
    return id;
  }

  /**
   * Set the id of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param id ID of the deployment
   */
  public void setId(@Nonnull final String id) {
    this.id = id;
  }

  /**
   * Set the deploymentUrl of this {@link AiDeploymentResponseWithDetails} instance and return the
   * same instance.
   *
   * @param deploymentUrl Consumption URL of the deployment
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails deploymentUrl(@Nullable final String deploymentUrl) {
    this.deploymentUrl = deploymentUrl;
    return this;
  }

  /**
   * Consumption URL of the deployment
   *
   * @return deploymentUrl The deploymentUrl of this {@link AiDeploymentResponseWithDetails}
   *     instance.
   */
  @Nonnull
  public String getDeploymentUrl() {
    return deploymentUrl;
  }

  /**
   * Set the deploymentUrl of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param deploymentUrl Consumption URL of the deployment
   */
  public void setDeploymentUrl(@Nullable final String deploymentUrl) {
    this.deploymentUrl = deploymentUrl;
  }

  /**
   * Set the configurationId of this {@link AiDeploymentResponseWithDetails} instance and return the
   * same instance.
   *
   * @param configurationId ID of the configuration
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails configurationId(@Nonnull final String configurationId) {
    this.configurationId = configurationId;
    return this;
  }

  /**
   * ID of the configuration
   *
   * @return configurationId The configurationId of this {@link AiDeploymentResponseWithDetails}
   *     instance.
   */
  @Nonnull
  public String getConfigurationId() {
    return configurationId;
  }

  /**
   * Set the configurationId of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param configurationId ID of the configuration
   */
  public void setConfigurationId(@Nonnull final String configurationId) {
    this.configurationId = configurationId;
  }

  /**
   * Set the configurationName of this {@link AiDeploymentResponseWithDetails} instance and return
   * the same instance.
   *
   * @param configurationName Name of the configuration
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails configurationName(
      @Nullable final String configurationName) {
    this.configurationName = configurationName;
    return this;
  }

  /**
   * Name of the configuration
   *
   * @return configurationName The configurationName of this {@link AiDeploymentResponseWithDetails}
   *     instance.
   */
  @Nonnull
  public String getConfigurationName() {
    return configurationName;
  }

  /**
   * Set the configurationName of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param configurationName Name of the configuration
   */
  public void setConfigurationName(@Nullable final String configurationName) {
    this.configurationName = configurationName;
  }

  /**
   * Set the executableId of this {@link AiDeploymentResponseWithDetails} instance and return the
   * same instance.
   *
   * @param executableId ID of the executable
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails executableId(@Nullable final String executableId) {
    this.executableId = executableId;
    return this;
  }

  /**
   * ID of the executable
   *
   * @return executableId The executableId of this {@link AiDeploymentResponseWithDetails} instance.
   */
  @Nonnull
  public String getExecutableId() {
    return executableId;
  }

  /**
   * Set the executableId of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param executableId ID of the executable
   */
  public void setExecutableId(@Nullable final String executableId) {
    this.executableId = executableId;
  }

  /**
   * Set the scenarioId of this {@link AiDeploymentResponseWithDetails} instance and return the same
   * instance.
   *
   * @param scenarioId ID of the scenario
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails scenarioId(@Nullable final String scenarioId) {
    this.scenarioId = scenarioId;
    return this;
  }

  /**
   * ID of the scenario
   *
   * @return scenarioId The scenarioId of this {@link AiDeploymentResponseWithDetails} instance.
   */
  @Nonnull
  public String getScenarioId() {
    return scenarioId;
  }

  /**
   * Set the scenarioId of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param scenarioId ID of the scenario
   */
  public void setScenarioId(@Nullable final String scenarioId) {
    this.scenarioId = scenarioId;
  }

  /**
   * Set the status of this {@link AiDeploymentResponseWithDetails} instance and return the same
   * instance.
   *
   * @param status The status of this {@link AiDeploymentResponseWithDetails}
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails status(@Nonnull final AiDeploymentStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status The status of this {@link AiDeploymentResponseWithDetails} instance.
   */
  @Nonnull
  public AiDeploymentStatus getStatus() {
    return status;
  }

  /**
   * Set the status of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param status The status of this {@link AiDeploymentResponseWithDetails}
   */
  public void setStatus(@Nonnull final AiDeploymentStatus status) {
    this.status = status;
  }

  /**
   * Set the statusMessage of this {@link AiDeploymentResponseWithDetails} instance and return the
   * same instance.
   *
   * @param statusMessage Deployment status message
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails statusMessage(@Nullable final String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Deployment status message
   *
   * @return statusMessage The statusMessage of this {@link AiDeploymentResponseWithDetails}
   *     instance.
   */
  @Nonnull
  public String getStatusMessage() {
    return statusMessage;
  }

  /**
   * Set the statusMessage of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param statusMessage Deployment status message
   */
  public void setStatusMessage(@Nullable final String statusMessage) {
    this.statusMessage = statusMessage;
  }

  /**
   * Set the targetStatus of this {@link AiDeploymentResponseWithDetails} instance and return the
   * same instance.
   *
   * @param targetStatus Deployment target status
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails targetStatus(
      @Nullable final TargetStatusEnum targetStatus) {
    this.targetStatus = targetStatus;
    return this;
  }

  /**
   * Deployment target status
   *
   * @return targetStatus The targetStatus of this {@link AiDeploymentResponseWithDetails} instance.
   */
  @Nonnull
  public TargetStatusEnum getTargetStatus() {
    return targetStatus;
  }

  /**
   * Set the targetStatus of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param targetStatus Deployment target status
   */
  public void setTargetStatus(@Nullable final TargetStatusEnum targetStatus) {
    this.targetStatus = targetStatus;
  }

  /**
   * Set the lastOperation of this {@link AiDeploymentResponseWithDetails} instance and return the
   * same instance.
   *
   * @param lastOperation The lastOperation of this {@link AiDeploymentResponseWithDetails}
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails lastOperation(
      @Nullable final LastOperationEnum lastOperation) {
    this.lastOperation = lastOperation;
    return this;
  }

  /**
   * Get lastOperation
   *
   * @return lastOperation The lastOperation of this {@link AiDeploymentResponseWithDetails}
   *     instance.
   */
  @Nullable
  public LastOperationEnum getLastOperation() {
    return lastOperation;
  }

  /**
   * Set the lastOperation of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param lastOperation The lastOperation of this {@link AiDeploymentResponseWithDetails}
   */
  public void setLastOperation(@Nullable final LastOperationEnum lastOperation) {
    this.lastOperation = lastOperation;
  }

  /**
   * Set the latestRunningConfigurationId of this {@link AiDeploymentResponseWithDetails} instance
   * and return the same instance.
   *
   * @param latestRunningConfigurationId configurationId that was running before a PATCH operation
   *     has modified the configurationId of the deployment. This can be used for a manual rollback
   *     in case the new configurationId results in a DEAD deployment
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails latestRunningConfigurationId(
      @Nullable final String latestRunningConfigurationId) {
    this.latestRunningConfigurationId = latestRunningConfigurationId;
    return this;
  }

  /**
   * configurationId that was running before a PATCH operation has modified the configurationId of
   * the deployment. This can be used for a manual rollback in case the new configurationId results
   * in a DEAD deployment
   *
   * @return latestRunningConfigurationId The latestRunningConfigurationId of this {@link
   *     AiDeploymentResponseWithDetails} instance.
   */
  @Nonnull
  public String getLatestRunningConfigurationId() {
    return latestRunningConfigurationId;
  }

  /**
   * Set the latestRunningConfigurationId of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param latestRunningConfigurationId configurationId that was running before a PATCH operation
   *     has modified the configurationId of the deployment. This can be used for a manual rollback
   *     in case the new configurationId results in a DEAD deployment
   */
  public void setLatestRunningConfigurationId(@Nullable final String latestRunningConfigurationId) {
    this.latestRunningConfigurationId = latestRunningConfigurationId;
  }

  /**
   * Set the ttl of this {@link AiDeploymentResponseWithDetails} instance and return the same
   * instance.
   *
   * @param ttl Time to live for a deployment. Its value can be either null or a number followed by
   *     the unit (any of following values, minutes(m|M), hours(h|H) or days(d|D))
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails ttl(@Nullable final String ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * Time to live for a deployment. Its value can be either null or a number followed by the unit
   * (any of following values, minutes(m|M), hours(h|H) or days(d|D))
   *
   * @return ttl The ttl of this {@link AiDeploymentResponseWithDetails} instance.
   */
  @Nullable
  public String getTtl() {
    return ttl;
  }

  /**
   * Set the ttl of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param ttl Time to live for a deployment. Its value can be either null or a number followed by
   *     the unit (any of following values, minutes(m|M), hours(h|H) or days(d|D))
   */
  public void setTtl(@Nullable final String ttl) {
    this.ttl = ttl;
  }

  /**
   * Set the details of this {@link AiDeploymentResponseWithDetails} instance and return the same
   * instance.
   *
   * @param details The details of this {@link AiDeploymentResponseWithDetails}
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails details(@Nullable final AiDeploymentDetails details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   *
   * @return details The details of this {@link AiDeploymentResponseWithDetails} instance.
   */
  @Nonnull
  public AiDeploymentDetails getDetails() {
    return details;
  }

  /**
   * Set the details of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param details The details of this {@link AiDeploymentResponseWithDetails}
   */
  public void setDetails(@Nullable final AiDeploymentDetails details) {
    this.details = details;
  }

  /**
   * Set the createdAt of this {@link AiDeploymentResponseWithDetails} instance and return the same
   * instance.
   *
   * @param createdAt Timestamp of resource creation
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails createdAt(@Nonnull final OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp of resource creation
   *
   * @return createdAt The createdAt of this {@link AiDeploymentResponseWithDetails} instance.
   */
  @Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Set the createdAt of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param createdAt Timestamp of resource creation
   */
  public void setCreatedAt(@Nonnull final OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Set the modifiedAt of this {@link AiDeploymentResponseWithDetails} instance and return the same
   * instance.
   *
   * @param modifiedAt Timestamp of latest resource modification
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails modifiedAt(@Nonnull final OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp of latest resource modification
   *
   * @return modifiedAt The modifiedAt of this {@link AiDeploymentResponseWithDetails} instance.
   */
  @Nonnull
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  /**
   * Set the modifiedAt of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param modifiedAt Timestamp of latest resource modification
   */
  public void setModifiedAt(@Nonnull final OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  /**
   * Set the submissionTime of this {@link AiDeploymentResponseWithDetails} instance and return the
   * same instance.
   *
   * @param submissionTime Timestamp of job submitted
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails submissionTime(
      @Nullable final OffsetDateTime submissionTime) {
    this.submissionTime = submissionTime;
    return this;
  }

  /**
   * Timestamp of job submitted
   *
   * @return submissionTime The submissionTime of this {@link AiDeploymentResponseWithDetails}
   *     instance.
   */
  @Nonnull
  public OffsetDateTime getSubmissionTime() {
    return submissionTime;
  }

  /**
   * Set the submissionTime of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param submissionTime Timestamp of job submitted
   */
  public void setSubmissionTime(@Nullable final OffsetDateTime submissionTime) {
    this.submissionTime = submissionTime;
  }

  /**
   * Set the startTime of this {@link AiDeploymentResponseWithDetails} instance and return the same
   * instance.
   *
   * @param startTime Timestamp of job status changed to RUNNING
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails startTime(@Nullable final OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Timestamp of job status changed to RUNNING
   *
   * @return startTime The startTime of this {@link AiDeploymentResponseWithDetails} instance.
   */
  @Nonnull
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  /**
   * Set the startTime of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param startTime Timestamp of job status changed to RUNNING
   */
  public void setStartTime(@Nullable final OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  /**
   * Set the completionTime of this {@link AiDeploymentResponseWithDetails} instance and return the
   * same instance.
   *
   * @param completionTime Timestamp of job status changed to COMPLETED/DEAD/STOPPED
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails completionTime(
      @Nullable final OffsetDateTime completionTime) {
    this.completionTime = completionTime;
    return this;
  }

  /**
   * Timestamp of job status changed to COMPLETED/DEAD/STOPPED
   *
   * @return completionTime The completionTime of this {@link AiDeploymentResponseWithDetails}
   *     instance.
   */
  @Nonnull
  public OffsetDateTime getCompletionTime() {
    return completionTime;
  }

  /**
   * Set the completionTime of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param completionTime Timestamp of job status changed to COMPLETED/DEAD/STOPPED
   */
  public void setCompletionTime(@Nullable final OffsetDateTime completionTime) {
    this.completionTime = completionTime;
  }

  /**
   * Set the statusDetails of this {@link AiDeploymentResponseWithDetails} instance and return the
   * same instance.
   *
   * @param statusDetails Current status details of the deployment
   * @return The same instance of this {@link AiDeploymentResponseWithDetails} class
   */
  @Nonnull
  public AiDeploymentResponseWithDetails statusDetails(@Nullable final Object statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

  /**
   * Current status details of the deployment
   *
   * @return statusDetails The statusDetails of this {@link AiDeploymentResponseWithDetails}
   *     instance.
   */
  @Nonnull
  public Object getStatusDetails() {
    return statusDetails;
  }

  /**
   * Set the statusDetails of this {@link AiDeploymentResponseWithDetails} instance.
   *
   * @param statusDetails Current status details of the deployment
   */
  public void setStatusDetails(@Nullable final Object statusDetails) {
    this.statusDetails = statusDetails;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link AiDeploymentResponseWithDetails}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link AiDeploymentResponseWithDetails}
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
          "AiDeploymentResponseWithDetails has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Get the value of all properties of this {@link AiDeploymentResponseWithDetails} instance
   * including unrecognized properties.
   *
   * @return The map of all properties
   */
  @JsonIgnore
  @Nonnull
  public Map<String, Object> toMap() {
    final Map<String, Object> declaredFields = new LinkedHashMap<>(cloudSdkCustomFields);
    if (id != null) declaredFields.put("id", id);
    if (deploymentUrl != null) declaredFields.put("deploymentUrl", deploymentUrl);
    if (configurationId != null) declaredFields.put("configurationId", configurationId);
    if (configurationName != null) declaredFields.put("configurationName", configurationName);
    if (executableId != null) declaredFields.put("executableId", executableId);
    if (scenarioId != null) declaredFields.put("scenarioId", scenarioId);
    if (status != null) declaredFields.put("status", status);
    if (statusMessage != null) declaredFields.put("statusMessage", statusMessage);
    if (targetStatus != null) declaredFields.put("targetStatus", targetStatus);
    if (lastOperation != null) declaredFields.put("lastOperation", lastOperation);
    if (latestRunningConfigurationId != null)
      declaredFields.put("latestRunningConfigurationId", latestRunningConfigurationId);
    if (ttl != null) declaredFields.put("ttl", ttl);
    if (details != null) declaredFields.put("details", details);
    if (createdAt != null) declaredFields.put("createdAt", createdAt);
    if (modifiedAt != null) declaredFields.put("modifiedAt", modifiedAt);
    if (submissionTime != null) declaredFields.put("submissionTime", submissionTime);
    if (startTime != null) declaredFields.put("startTime", startTime);
    if (completionTime != null) declaredFields.put("completionTime", completionTime);
    if (statusDetails != null) declaredFields.put("statusDetails", statusDetails);
    return declaredFields;
  }

  /**
   * Set an unrecognizable property of this {@link AiDeploymentResponseWithDetails} instance. If the
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
    final AiDeploymentResponseWithDetails aiDeploymentResponseWithDetails =
        (AiDeploymentResponseWithDetails) o;
    return Objects.equals(
            this.cloudSdkCustomFields, aiDeploymentResponseWithDetails.cloudSdkCustomFields)
        && Objects.equals(this.id, aiDeploymentResponseWithDetails.id)
        && Objects.equals(this.deploymentUrl, aiDeploymentResponseWithDetails.deploymentUrl)
        && Objects.equals(this.configurationId, aiDeploymentResponseWithDetails.configurationId)
        && Objects.equals(this.configurationName, aiDeploymentResponseWithDetails.configurationName)
        && Objects.equals(this.executableId, aiDeploymentResponseWithDetails.executableId)
        && Objects.equals(this.scenarioId, aiDeploymentResponseWithDetails.scenarioId)
        && Objects.equals(this.status, aiDeploymentResponseWithDetails.status)
        && Objects.equals(this.statusMessage, aiDeploymentResponseWithDetails.statusMessage)
        && Objects.equals(this.targetStatus, aiDeploymentResponseWithDetails.targetStatus)
        && Objects.equals(this.lastOperation, aiDeploymentResponseWithDetails.lastOperation)
        && Objects.equals(
            this.latestRunningConfigurationId,
            aiDeploymentResponseWithDetails.latestRunningConfigurationId)
        && Objects.equals(this.ttl, aiDeploymentResponseWithDetails.ttl)
        && Objects.equals(this.details, aiDeploymentResponseWithDetails.details)
        && Objects.equals(this.createdAt, aiDeploymentResponseWithDetails.createdAt)
        && Objects.equals(this.modifiedAt, aiDeploymentResponseWithDetails.modifiedAt)
        && Objects.equals(this.submissionTime, aiDeploymentResponseWithDetails.submissionTime)
        && Objects.equals(this.startTime, aiDeploymentResponseWithDetails.startTime)
        && Objects.equals(this.completionTime, aiDeploymentResponseWithDetails.completionTime)
        && Objects.equals(this.statusDetails, aiDeploymentResponseWithDetails.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        deploymentUrl,
        configurationId,
        configurationName,
        executableId,
        scenarioId,
        status,
        statusMessage,
        targetStatus,
        lastOperation,
        latestRunningConfigurationId,
        ttl,
        details,
        createdAt,
        modifiedAt,
        submissionTime,
        startTime,
        completionTime,
        statusDetails,
        cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class AiDeploymentResponseWithDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deploymentUrl: ").append(toIndentedString(deploymentUrl)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
    sb.append("    executableId: ").append(toIndentedString(executableId)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    targetStatus: ").append(toIndentedString(targetStatus)).append("\n");
    sb.append("    lastOperation: ").append(toIndentedString(lastOperation)).append("\n");
    sb.append("    latestRunningConfigurationId: ")
        .append(toIndentedString(latestRunningConfigurationId))
        .append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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
   * AiDeploymentResponseWithDetails} instance with all required arguments.
   */
  public static Builder create() {
    return (id) ->
        (configurationId) ->
            (status) ->
                (createdAt) ->
                    (modifiedAt) ->
                        new AiDeploymentResponseWithDetails()
                            .id(id)
                            .configurationId(configurationId)
                            .status(status)
                            .createdAt(createdAt)
                            .modifiedAt(modifiedAt);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the id of this {@link AiDeploymentResponseWithDetails} instance.
     *
     * @param id ID of the deployment
     * @return The AiDeploymentResponseWithDetails builder.
     */
    Builder1 id(@Nonnull final String id);
  }

  /** Builder helper class. */
  public interface Builder1 {
    /**
     * Set the configurationId of this {@link AiDeploymentResponseWithDetails} instance.
     *
     * @param configurationId ID of the configuration
     * @return The AiDeploymentResponseWithDetails builder.
     */
    Builder2 configurationId(@Nonnull final String configurationId);
  }

  /** Builder helper class. */
  public interface Builder2 {
    /**
     * Set the status of this {@link AiDeploymentResponseWithDetails} instance.
     *
     * @param status The status of this {@link AiDeploymentResponseWithDetails}
     * @return The AiDeploymentResponseWithDetails builder.
     */
    Builder3 status(@Nonnull final AiDeploymentStatus status);
  }

  /** Builder helper class. */
  public interface Builder3 {
    /**
     * Set the createdAt of this {@link AiDeploymentResponseWithDetails} instance.
     *
     * @param createdAt Timestamp of resource creation
     * @return The AiDeploymentResponseWithDetails builder.
     */
    Builder4 createdAt(@Nonnull final OffsetDateTime createdAt);
  }

  /** Builder helper class. */
  public interface Builder4 {
    /**
     * Set the modifiedAt of this {@link AiDeploymentResponseWithDetails} instance.
     *
     * @param modifiedAt Timestamp of latest resource modification
     * @return The AiDeploymentResponseWithDetails instance.
     */
    AiDeploymentResponseWithDetails modifiedAt(@Nonnull final OffsetDateTime modifiedAt);
  }
}
