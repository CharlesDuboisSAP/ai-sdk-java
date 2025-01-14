/*
 * Orchestration
 * Orchestration is an inference service which provides common additional capabilities for business AI scenarios, such as content filtering and data masking. At the core of the service is the LLM module which allows for an easy, harmonized access to the language models of gen AI hub. The service is designed to be modular and extensible, allowing for the addition of new modules in the future. Each module can be configured independently and at runtime, allowing for a high degree of flexibility in the orchestration of AI services.
 *
 * The version of the OpenAPI document: 0.43.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.orchestration.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.annotations.Beta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** InputFilteringConfig */
@Beta // CHECKSTYLE:OFF
public class InputFilteringConfig
// CHECKSTYLE:ON
{
  @JsonProperty("filters")
  private List<FilterConfig> filters = new ArrayList<>();

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for InputFilteringConfig. */
  protected InputFilteringConfig() {}

  /**
   * Set the filters of this {@link InputFilteringConfig} instance and return the same instance.
   *
   * @param filters Configuration for content filtering services that should be used for the given
   *     filtering step (input filtering or output filtering).
   * @return The same instance of this {@link InputFilteringConfig} class
   */
  @Nonnull
  public InputFilteringConfig filters(@Nonnull final List<FilterConfig> filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Add one filters instance to this {@link InputFilteringConfig}.
   *
   * @param filtersItem The filters that should be added
   * @return The same instance of type {@link InputFilteringConfig}
   */
  @Nonnull
  public InputFilteringConfig addFiltersItem(@Nonnull final FilterConfig filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Configuration for content filtering services that should be used for the given filtering step
   * (input filtering or output filtering).
   *
   * @return filters The filters of this {@link InputFilteringConfig} instance.
   */
  @Nonnull
  public List<FilterConfig> getFilters() {
    return filters;
  }

  /**
   * Set the filters of this {@link InputFilteringConfig} instance.
   *
   * @param filters Configuration for content filtering services that should be used for the given
   *     filtering step (input filtering or output filtering).
   */
  public void setFilters(@Nonnull final List<FilterConfig> filters) {
    this.filters = filters;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link InputFilteringConfig}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link InputFilteringConfig} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException(
          "InputFilteringConfig has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link InputFilteringConfig} instance. If the map
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
    final InputFilteringConfig inputFilteringConfig = (InputFilteringConfig) o;
    return Objects.equals(this.cloudSdkCustomFields, inputFilteringConfig.cloudSdkCustomFields)
        && Objects.equals(this.filters, inputFilteringConfig.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class InputFilteringConfig {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
   * Create a type-safe, fluent-api builder object to construct a new {@link InputFilteringConfig}
   * instance with all required arguments.
   */
  public static Builder create() {
    return (filters) -> new InputFilteringConfig().filters(filters);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the filters of this {@link InputFilteringConfig} instance.
     *
     * @param filters Configuration for content filtering services that should be used for the given
     *     filtering step (input filtering or output filtering).
     * @return The InputFilteringConfig instance.
     */
    InputFilteringConfig filters(@Nonnull final List<FilterConfig> filters);

    /**
     * Set the filters of this {@link InputFilteringConfig} instance.
     *
     * @param filters Configuration for content filtering services that should be used for the given
     *     filtering step (input filtering or output filtering).
     * @return The InputFilteringConfig instance.
     */
    default InputFilteringConfig filters(@Nonnull final FilterConfig... filters) {
      return filters(Arrays.asList(filters));
    }
  }
}
