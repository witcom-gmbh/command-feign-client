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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UnblockConductorDataCableRequestData
 */
@JsonPropertyOrder({
  UnblockConductorDataCableRequestData.JSON_PROPERTY_FIBER_NUMBER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UnblockConductorDataCableRequestData {
  public static final String JSON_PROPERTY_FIBER_NUMBER = "fiberNumber";
  private BigDecimal fiberNumber;

  public UnblockConductorDataCableRequestData() {
  }

  public UnblockConductorDataCableRequestData fiberNumber(BigDecimal fiberNumber) {
    
    this.fiberNumber = fiberNumber;
    return this;
  }

   /**
   * Get fiberNumber
   * @return fiberNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIBER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFiberNumber() {
    return fiberNumber;
  }


  @JsonProperty(JSON_PROPERTY_FIBER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiberNumber(BigDecimal fiberNumber) {
    this.fiberNumber = fiberNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnblockConductorDataCableRequestData unblockConductorDataCableRequestData = (UnblockConductorDataCableRequestData) o;
    return Objects.equals(this.fiberNumber, unblockConductorDataCableRequestData.fiberNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiberNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnblockConductorDataCableRequestData {\n");
    sb.append("    fiberNumber: ").append(toIndentedString(fiberNumber)).append("\n");
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
