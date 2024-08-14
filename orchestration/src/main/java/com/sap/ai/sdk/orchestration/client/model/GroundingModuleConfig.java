

/*
 * Internal Orchestration Service API
 * SAP AI Core - Orchestration Service API
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.orchestration.client.model;

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
import com.sap.ai.sdk.orchestration.client.model.GroundingModuleConfigGroundingServiceConfiguration;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * GroundingModuleConfig
 */
// CHECKSTYLE:OFF
public class GroundingModuleConfig 
// CHECKSTYLE:ON
{
  /**
   * Gets or Sets groundingService
   */
  public enum GroundingServiceEnum {
    /**
    * The DOCUMENT_GROUNDING_SERVICE option of this GroundingModuleConfig
    */
    DOCUMENT_GROUNDING_SERVICE("document_grounding_service");

    private String value;

    GroundingServiceEnum(String value) {
      this.value = value;
    }

    /**
    * Get the value of the enum
    * @return The enum value
    */
    @JsonValue
    @Nonnull public String getValue() {
      return value;
    }

    /**
    * Get the String value of the enum value.
    * @return The enum value as String
    */
    @Override
    @Nonnull public String toString() {
      return String.valueOf(value);
    }

    /**
    * Get the enum value from a String value
    * @param value The String value
    * @return The enum value of type GroundingModuleConfig
    */
    @JsonCreator
    @Nonnull public static GroundingServiceEnum fromValue(@Nonnull final String value) {
      for (GroundingServiceEnum b : GroundingServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("grounding_service")
  private GroundingServiceEnum groundingService;

  @JsonProperty("grounding_service_configuration")
  private GroundingModuleConfigGroundingServiceConfiguration groundingServiceConfiguration;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the groundingService of this {@link GroundingModuleConfig} instance and return the same instance.
    *
    * @param groundingService  The groundingService of this {@link GroundingModuleConfig}
    * @return The same instance of this {@link GroundingModuleConfig} class
    */
   @Nonnull public GroundingModuleConfig groundingService(@Nonnull final GroundingServiceEnum groundingService) {
    this.groundingService = groundingService;
    return this;
  }

   /**
    * Get groundingService
    * @return groundingService  The groundingService of this {@link GroundingModuleConfig} instance.
    */
  @Nonnull public GroundingServiceEnum getGroundingService() {
    return groundingService;
  }

  /**
   * Set the groundingService of this {@link GroundingModuleConfig} instance.
   *
   * @param groundingService  The groundingService of this {@link GroundingModuleConfig}
   */
  public void setGroundingService( @Nonnull final GroundingServiceEnum groundingService) {
    this.groundingService = groundingService;
  }

   /**
    * Set the groundingServiceConfiguration of this {@link GroundingModuleConfig} instance and return the same instance.
    *
    * @param groundingServiceConfiguration  The groundingServiceConfiguration of this {@link GroundingModuleConfig}
    * @return The same instance of this {@link GroundingModuleConfig} class
    */
   @Nonnull public GroundingModuleConfig groundingServiceConfiguration(@Nonnull final GroundingModuleConfigGroundingServiceConfiguration groundingServiceConfiguration) {
    this.groundingServiceConfiguration = groundingServiceConfiguration;
    return this;
  }

   /**
    * Get groundingServiceConfiguration
    * @return groundingServiceConfiguration  The groundingServiceConfiguration of this {@link GroundingModuleConfig} instance.
    */
  @Nonnull public GroundingModuleConfigGroundingServiceConfiguration getGroundingServiceConfiguration() {
    return groundingServiceConfiguration;
  }

  /**
   * Set the groundingServiceConfiguration of this {@link GroundingModuleConfig} instance.
   *
   * @param groundingServiceConfiguration  The groundingServiceConfiguration of this {@link GroundingModuleConfig}
   */
  public void setGroundingServiceConfiguration( @Nonnull final GroundingModuleConfigGroundingServiceConfiguration groundingServiceConfiguration) {
    this.groundingServiceConfiguration = groundingServiceConfiguration;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link GroundingModuleConfig}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link GroundingModuleConfig} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("GroundingModuleConfig has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link GroundingModuleConfig} instance. If the map previously contained a mapping
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
    final GroundingModuleConfig groundingModuleConfig = (GroundingModuleConfig) o;
    return Objects.equals(this.cloudSdkCustomFields, groundingModuleConfig.cloudSdkCustomFields) &&
        Objects.equals(this.groundingService, groundingModuleConfig.groundingService) &&
        Objects.equals(this.groundingServiceConfiguration, groundingModuleConfig.groundingServiceConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groundingService, groundingServiceConfiguration, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class GroundingModuleConfig {\n");
    sb.append("    groundingService: ").append(toIndentedString(groundingService)).append("\n");
    sb.append("    groundingServiceConfiguration: ").append(toIndentedString(groundingServiceConfiguration)).append("\n");
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

