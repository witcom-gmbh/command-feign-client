/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240226111547
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
 * UnblockFiberDataCableRequestData
 */
@JsonPropertyOrder({
  UnblockFiberDataCableRequestData.JSON_PROPERTY_INCLUDE_OPPOSITE_SIDE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class UnblockFiberDataCableRequestData {
  public static final String JSON_PROPERTY_INCLUDE_OPPOSITE_SIDE = "includeOppositeSide";
  private Boolean includeOppositeSide;

  public UnblockFiberDataCableRequestData() {
  }

  public UnblockFiberDataCableRequestData includeOppositeSide(Boolean includeOppositeSide) {
    
    this.includeOppositeSide = includeOppositeSide;
    return this;
  }

   /**
   * Get includeOppositeSide
   * @return includeOppositeSide
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_OPPOSITE_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeOppositeSide() {
    return includeOppositeSide;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_OPPOSITE_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeOppositeSide(Boolean includeOppositeSide) {
    this.includeOppositeSide = includeOppositeSide;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnblockFiberDataCableRequestData unblockFiberDataCableRequestData = (UnblockFiberDataCableRequestData) o;
    return Objects.equals(this.includeOppositeSide, unblockFiberDataCableRequestData.includeOppositeSide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeOppositeSide);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnblockFiberDataCableRequestData {\n");
    sb.append("    includeOppositeSide: ").append(toIndentedString(includeOppositeSide)).append("\n");
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
