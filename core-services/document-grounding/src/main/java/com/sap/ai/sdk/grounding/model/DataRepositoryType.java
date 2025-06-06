/*
 * Document Grounding Pipeline API
 * SAP AI Core - API Specification AI Data Management api's
 *
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.grounding.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.Nonnull;

/** Gets or Sets DataRepositoryType */
public enum DataRepositoryType {
  VECTOR("vector"),

  UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

  private final String value;

  DataRepositoryType(String value) {
    this.value = value;
  }

  /**
   * @return The enum value.
   */
  @JsonValue
  public String getValue() {
    return value;
  }

  /**
   * @return The String representation of the enum value.
   */
  @Override
  @Nonnull
  public String toString() {
    return String.valueOf(value);
  }

  /**
   * Converts the given value to its enum representation.
   *
   * @param value The input value.
   * @return The enum representation of the given value.
   */
  @JsonCreator
  public static DataRepositoryType fromValue(@Nonnull final String value) {
    for (final DataRepositoryType b : DataRepositoryType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}
