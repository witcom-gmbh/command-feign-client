/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240131102312
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fntsoftware.businessgateway.entities;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CiAttribute
 */
@JsonPropertyOrder({
  CiAttribute.JSON_PROPERTY_VALUE_LABEL,
  CiAttribute.JSON_PROPERTY_VALUE,
  CiAttribute.JSON_PROPERTY_KEY,
  CiAttribute.JSON_PROPERTY_KEY_LABEL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:00:24.721128812Z[Etc/UTC]")
public class CiAttribute {
  public static final String JSON_PROPERTY_VALUE_LABEL = "valueLabel";
  private String valueLabel;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_KEY_LABEL = "keyLabel";
  private String keyLabel;

  public CiAttribute() {
  }

  public CiAttribute valueLabel(String valueLabel) {
    
    this.valueLabel = valueLabel;
    return this;
  }

   /**
   * Get valueLabel
   * @return valueLabel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValueLabel() {
    return valueLabel;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueLabel(String valueLabel) {
    this.valueLabel = valueLabel;
  }


  public CiAttribute value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public CiAttribute key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public CiAttribute keyLabel(String keyLabel) {
    
    this.keyLabel = keyLabel;
    return this;
  }

   /**
   * Get keyLabel
   * @return keyLabel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyLabel() {
    return keyLabel;
  }


  @JsonProperty(JSON_PROPERTY_KEY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyLabel(String keyLabel) {
    this.keyLabel = keyLabel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CiAttribute ciAttribute = (CiAttribute) o;
    return Objects.equals(this.valueLabel, ciAttribute.valueLabel) &&
        Objects.equals(this.value, ciAttribute.value) &&
        Objects.equals(this.key, ciAttribute.key) &&
        Objects.equals(this.keyLabel, ciAttribute.keyLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueLabel, value, key, keyLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CiAttribute {\n");
    sb.append("    valueLabel: ").append(toIndentedString(valueLabel)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyLabel: ").append(toIndentedString(keyLabel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
