

/*
 * AI Core
 * Provides tools to manage your scenarios and workflows in SAP AI Core. Execute pipelines as a batch job, for example to pre-process or train your models, or perform batch inference.  Serve inference requests of trained models. Deploy а trained machine learning model as a web service to serve inference requests with high performance.  Register your own Docker registry, synchronize your AI content from your own git repository, and register your own object store for training data and trained models. 
 *
 * The version of the OpenAPI document: 2.33.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.core.client.model;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.sap.ai.sdk.core.client.model.AiExecutionScheduleStatus;
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Request object for changing the execution schedule
 */
// CHECKSTYLE:OFF
public class AiExecutionScheduleModificationRequest 
// CHECKSTYLE:ON
{
  @JsonProperty("cron")
  private String cron;

  @JsonProperty("start")
  private OffsetDateTime start;

  @JsonProperty("end")
  private OffsetDateTime end;

  @JsonProperty("configurationId")
  private String configurationId;

  @JsonProperty("status")
  private AiExecutionScheduleStatus status;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the cron of this {@link AiExecutionScheduleModificationRequest} instance and return the same instance.
    *
    * @param cron  Cron defining the schedule to run the executions.
    * @return The same instance of this {@link AiExecutionScheduleModificationRequest} class
    */
   @Nonnull public AiExecutionScheduleModificationRequest cron(@Nonnull final String cron) {
    this.cron = cron;
    return this;
  }

   /**
    * Cron defining the schedule to run the executions.
    * @return cron  The cron of this {@link AiExecutionScheduleModificationRequest} instance.
    */
  @Nonnull public String getCron() {
    return cron;
  }

  /**
   * Set the cron of this {@link AiExecutionScheduleModificationRequest} instance.
   *
   * @param cron  Cron defining the schedule to run the executions.
   */
  public void setCron( @Nonnull final String cron) {
    this.cron = cron;
  }

   /**
    * Set the start of this {@link AiExecutionScheduleModificationRequest} instance and return the same instance.
    *
    * @param start  Timestamp, defining when the executions should start running periodically, defaults to now
    * @return The same instance of this {@link AiExecutionScheduleModificationRequest} class
    */
   @Nonnull public AiExecutionScheduleModificationRequest start(@Nonnull final OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
    * Timestamp, defining when the executions should start running periodically, defaults to now
    * @return start  The start of this {@link AiExecutionScheduleModificationRequest} instance.
    */
  @Nonnull public OffsetDateTime getStart() {
    return start;
  }

  /**
   * Set the start of this {@link AiExecutionScheduleModificationRequest} instance.
   *
   * @param start  Timestamp, defining when the executions should start running periodically, defaults to now
   */
  public void setStart( @Nonnull final OffsetDateTime start) {
    this.start = start;
  }

   /**
    * Set the end of this {@link AiExecutionScheduleModificationRequest} instance and return the same instance.
    *
    * @param end  Timestamp, defining when the executions should stop running
    * @return The same instance of this {@link AiExecutionScheduleModificationRequest} class
    */
   @Nonnull public AiExecutionScheduleModificationRequest end(@Nonnull final OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
    * Timestamp, defining when the executions should stop running
    * @return end  The end of this {@link AiExecutionScheduleModificationRequest} instance.
    */
  @Nonnull public OffsetDateTime getEnd() {
    return end;
  }

  /**
   * Set the end of this {@link AiExecutionScheduleModificationRequest} instance.
   *
   * @param end  Timestamp, defining when the executions should stop running
   */
  public void setEnd( @Nonnull final OffsetDateTime end) {
    this.end = end;
  }

   /**
    * Set the configurationId of this {@link AiExecutionScheduleModificationRequest} instance and return the same instance.
    *
    * @param configurationId  ID of the configuration
    * @return The same instance of this {@link AiExecutionScheduleModificationRequest} class
    */
   @Nonnull public AiExecutionScheduleModificationRequest configurationId(@Nonnull final String configurationId) {
    this.configurationId = configurationId;
    return this;
  }

   /**
    * ID of the configuration
    * @return configurationId  The configurationId of this {@link AiExecutionScheduleModificationRequest} instance.
    */
  @Nonnull public String getConfigurationId() {
    return configurationId;
  }

  /**
   * Set the configurationId of this {@link AiExecutionScheduleModificationRequest} instance.
   *
   * @param configurationId  ID of the configuration
   */
  public void setConfigurationId( @Nonnull final String configurationId) {
    this.configurationId = configurationId;
  }

   /**
    * Set the status of this {@link AiExecutionScheduleModificationRequest} instance and return the same instance.
    *
    * @param status  The status of this {@link AiExecutionScheduleModificationRequest}
    * @return The same instance of this {@link AiExecutionScheduleModificationRequest} class
    */
   @Nonnull public AiExecutionScheduleModificationRequest status(@Nonnull final AiExecutionScheduleStatus status) {
    this.status = status;
    return this;
  }

   /**
    * Get status
    * @return status  The status of this {@link AiExecutionScheduleModificationRequest} instance.
    */
  @Nonnull public AiExecutionScheduleStatus getStatus() {
    return status;
  }

  /**
   * Set the status of this {@link AiExecutionScheduleModificationRequest} instance.
   *
   * @param status  The status of this {@link AiExecutionScheduleModificationRequest}
   */
  public void setStatus( @Nonnull final AiExecutionScheduleStatus status) {
    this.status = status;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link AiExecutionScheduleModificationRequest}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link AiExecutionScheduleModificationRequest} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("AiExecutionScheduleModificationRequest has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link AiExecutionScheduleModificationRequest} instance. If the map previously contained a mapping
   * for the key, the old value is replaced by the specified value.
   * @param customFieldName The name of the property
   * @param customFieldValue The value of the property
   */
  @JsonIgnore
  public void setCustomField( @Nonnull String customFieldName, @Nullable Object customFieldValue )
  {
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
    final AiExecutionScheduleModificationRequest aiExecutionScheduleModificationRequest = (AiExecutionScheduleModificationRequest) o;
    return Objects.equals(this.cloudSdkCustomFields, aiExecutionScheduleModificationRequest.cloudSdkCustomFields) &&
        Objects.equals(this.cron, aiExecutionScheduleModificationRequest.cron) &&
        Objects.equals(this.start, aiExecutionScheduleModificationRequest.start) &&
        Objects.equals(this.end, aiExecutionScheduleModificationRequest.end) &&
        Objects.equals(this.configurationId, aiExecutionScheduleModificationRequest.configurationId) &&
        Objects.equals(this.status, aiExecutionScheduleModificationRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cron, start, end, configurationId, status, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class AiExecutionScheduleModificationRequest {\n");
    sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    cloudSdkCustomFields.forEach((k,v) -> sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

