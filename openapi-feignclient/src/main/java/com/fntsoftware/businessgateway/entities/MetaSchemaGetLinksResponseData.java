/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240131110751
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
 * MetaSchemaGetLinksResponseData
 */
@JsonPropertyOrder({
  MetaSchemaGetLinksResponseData.JSON_PROPERTY_FROM_ENTITY_NAME,
  MetaSchemaGetLinksResponseData.JSON_PROPERTY_OVER_ENTITY_NAME,
  MetaSchemaGetLinksResponseData.JSON_PROPERTY_TO_ENTITY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class MetaSchemaGetLinksResponseData {
  public static final String JSON_PROPERTY_FROM_ENTITY_NAME = "fromEntityName";
  private String fromEntityName;

  public static final String JSON_PROPERTY_OVER_ENTITY_NAME = "overEntityName";
  private String overEntityName;

  public static final String JSON_PROPERTY_TO_ENTITY_NAME = "toEntityName";
  private String toEntityName;

  public MetaSchemaGetLinksResponseData() {
  }

  public MetaSchemaGetLinksResponseData fromEntityName(String fromEntityName) {
    
    this.fromEntityName = fromEntityName;
    return this;
  }

   /**
   * Get fromEntityName
   * @return fromEntityName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromEntityName() {
    return fromEntityName;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromEntityName(String fromEntityName) {
    this.fromEntityName = fromEntityName;
  }


  public MetaSchemaGetLinksResponseData overEntityName(String overEntityName) {
    
    this.overEntityName = overEntityName;
    return this;
  }

   /**
   * Get overEntityName
   * @return overEntityName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVER_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOverEntityName() {
    return overEntityName;
  }


  @JsonProperty(JSON_PROPERTY_OVER_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverEntityName(String overEntityName) {
    this.overEntityName = overEntityName;
  }


  public MetaSchemaGetLinksResponseData toEntityName(String toEntityName) {
    
    this.toEntityName = toEntityName;
    return this;
  }

   /**
   * Get toEntityName
   * @return toEntityName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToEntityName() {
    return toEntityName;
  }


  @JsonProperty(JSON_PROPERTY_TO_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToEntityName(String toEntityName) {
    this.toEntityName = toEntityName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaSchemaGetLinksResponseData metaSchemaGetLinksResponseData = (MetaSchemaGetLinksResponseData) o;
    return Objects.equals(this.fromEntityName, metaSchemaGetLinksResponseData.fromEntityName) &&
        Objects.equals(this.overEntityName, metaSchemaGetLinksResponseData.overEntityName) &&
        Objects.equals(this.toEntityName, metaSchemaGetLinksResponseData.toEntityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromEntityName, overEntityName, toEntityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaSchemaGetLinksResponseData {\n");
    sb.append("    fromEntityName: ").append(toIndentedString(fromEntityName)).append("\n");
    sb.append("    overEntityName: ").append(toIndentedString(overEntityName)).append("\n");
    sb.append("    toEntityName: ").append(toIndentedString(toEntityName)).append("\n");
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
