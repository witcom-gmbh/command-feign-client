/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240304133000
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
 * PowerCableConnectionsRelation
 */
@JsonPropertyOrder({
  PowerCableConnectionsRelation.JSON_PROPERTY_PLAN_FLAG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class PowerCableConnectionsRelation {
  public static final String JSON_PROPERTY_PLAN_FLAG = "planFlag";
  private Boolean planFlag;

  public PowerCableConnectionsRelation() {
  }

  public PowerCableConnectionsRelation planFlag(Boolean planFlag) {
    
    this.planFlag = planFlag;
    return this;
  }

   /**
   * Get planFlag
   * @return planFlag
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPlanFlag() {
    return planFlag;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanFlag(Boolean planFlag) {
    this.planFlag = planFlag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerCableConnectionsRelation powerCableConnectionsRelation = (PowerCableConnectionsRelation) o;
    return Objects.equals(this.planFlag, powerCableConnectionsRelation.planFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerCableConnectionsRelation {\n");
    sb.append("    planFlag: ").append(toIndentedString(planFlag)).append("\n");
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

