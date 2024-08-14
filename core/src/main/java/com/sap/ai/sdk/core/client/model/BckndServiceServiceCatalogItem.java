

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
import com.sap.ai.sdk.core.client.model.BckndServiceServiceCatalogItemExtendCatalog;
import com.sap.ai.sdk.core.client.model.BckndServiceServiceCatalogItemExtendCredentials;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * BckndServiceServiceCatalogItem
 */
// CHECKSTYLE:OFF
public class BckndServiceServiceCatalogItem 
// CHECKSTYLE:ON
{
  @JsonProperty("extendCatalog")
  private BckndServiceServiceCatalogItemExtendCatalog extendCatalog;

  @JsonProperty("extendCredentials")
  private BckndServiceServiceCatalogItemExtendCredentials extendCredentials;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
    * Set the extendCatalog of this {@link BckndServiceServiceCatalogItem} instance and return the same instance.
    *
    * @param extendCatalog  The extendCatalog of this {@link BckndServiceServiceCatalogItem}
    * @return The same instance of this {@link BckndServiceServiceCatalogItem} class
    */
   @Nonnull public BckndServiceServiceCatalogItem extendCatalog(@Nonnull final BckndServiceServiceCatalogItemExtendCatalog extendCatalog) {
    this.extendCatalog = extendCatalog;
    return this;
  }

   /**
    * Get extendCatalog
    * @return extendCatalog  The extendCatalog of this {@link BckndServiceServiceCatalogItem} instance.
    */
  @Nonnull public BckndServiceServiceCatalogItemExtendCatalog getExtendCatalog() {
    return extendCatalog;
  }

  /**
   * Set the extendCatalog of this {@link BckndServiceServiceCatalogItem} instance.
   *
   * @param extendCatalog  The extendCatalog of this {@link BckndServiceServiceCatalogItem}
   */
  public void setExtendCatalog( @Nonnull final BckndServiceServiceCatalogItemExtendCatalog extendCatalog) {
    this.extendCatalog = extendCatalog;
  }

   /**
    * Set the extendCredentials of this {@link BckndServiceServiceCatalogItem} instance and return the same instance.
    *
    * @param extendCredentials  The extendCredentials of this {@link BckndServiceServiceCatalogItem}
    * @return The same instance of this {@link BckndServiceServiceCatalogItem} class
    */
   @Nonnull public BckndServiceServiceCatalogItem extendCredentials(@Nonnull final BckndServiceServiceCatalogItemExtendCredentials extendCredentials) {
    this.extendCredentials = extendCredentials;
    return this;
  }

   /**
    * Get extendCredentials
    * @return extendCredentials  The extendCredentials of this {@link BckndServiceServiceCatalogItem} instance.
    */
  @Nonnull public BckndServiceServiceCatalogItemExtendCredentials getExtendCredentials() {
    return extendCredentials;
  }

  /**
   * Set the extendCredentials of this {@link BckndServiceServiceCatalogItem} instance.
   *
   * @param extendCredentials  The extendCredentials of this {@link BckndServiceServiceCatalogItem}
   */
  public void setExtendCredentials( @Nonnull final BckndServiceServiceCatalogItemExtendCredentials extendCredentials) {
    this.extendCredentials = extendCredentials;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link BckndServiceServiceCatalogItem}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link BckndServiceServiceCatalogItem} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("BckndServiceServiceCatalogItem has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link BckndServiceServiceCatalogItem} instance. If the map previously contained a mapping
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
    final BckndServiceServiceCatalogItem bckndServiceServiceCatalogItem = (BckndServiceServiceCatalogItem) o;
    return Objects.equals(this.cloudSdkCustomFields, bckndServiceServiceCatalogItem.cloudSdkCustomFields) &&
        Objects.equals(this.extendCatalog, bckndServiceServiceCatalogItem.extendCatalog) &&
        Objects.equals(this.extendCredentials, bckndServiceServiceCatalogItem.extendCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendCatalog, extendCredentials, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class BckndServiceServiceCatalogItem {\n");
    sb.append("    extendCatalog: ").append(toIndentedString(extendCatalog)).append("\n");
    sb.append("    extendCredentials: ").append(toIndentedString(extendCredentials)).append("\n");
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

