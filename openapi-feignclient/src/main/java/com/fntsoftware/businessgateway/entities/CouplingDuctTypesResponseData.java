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
 * CouplingDuctTypesResponseData
 */
@JsonPropertyOrder({
  CouplingDuctTypesResponseData.JSON_PROPERTY_SIDE,
  CouplingDuctTypesResponseData.JSON_PROPERTY_TYPE_ELID,
  CouplingDuctTypesResponseData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CouplingDuctTypesResponseData {
  public static final String JSON_PROPERTY_SIDE = "side";
  private String side;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private String typeElid;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public CouplingDuctTypesResponseData() {
  }

  public CouplingDuctTypesResponseData side(String side) {
    
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSide() {
    return side;
  }


  @JsonProperty(JSON_PROPERTY_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSide(String side) {
    this.side = side;
  }


  public CouplingDuctTypesResponseData typeElid(String typeElid) {
    
    this.typeElid = typeElid;
    return this;
  }

   /**
   * Get typeElid
   * @return typeElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypeElid() {
    return typeElid;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeElid(String typeElid) {
    this.typeElid = typeElid;
  }


  public CouplingDuctTypesResponseData type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouplingDuctTypesResponseData couplingDuctTypesResponseData = (CouplingDuctTypesResponseData) o;
    return Objects.equals(this.side, couplingDuctTypesResponseData.side) &&
        Objects.equals(this.typeElid, couplingDuctTypesResponseData.typeElid) &&
        Objects.equals(this.type, couplingDuctTypesResponseData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(side, typeElid, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouplingDuctTypesResponseData {\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    typeElid: ").append(toIndentedString(typeElid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
