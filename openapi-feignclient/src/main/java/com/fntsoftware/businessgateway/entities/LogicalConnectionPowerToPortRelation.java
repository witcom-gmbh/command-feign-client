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
 * LogicalConnectionPowerToPortRelation
 */
@JsonPropertyOrder({
  LogicalConnectionPowerToPortRelation.JSON_PROPERTY_DIRECTION,
  LogicalConnectionPowerToPortRelation.JSON_PROPERTY_TO_DIRECTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class LogicalConnectionPowerToPortRelation {
  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private String direction;

  public static final String JSON_PROPERTY_TO_DIRECTION = "toDirection";
  private String toDirection;

  public LogicalConnectionPowerToPortRelation() {
  }

  public LogicalConnectionPowerToPortRelation direction(String direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(String direction) {
    this.direction = direction;
  }


  public LogicalConnectionPowerToPortRelation toDirection(String toDirection) {
    
    this.toDirection = toDirection;
    return this;
  }

   /**
   * Get toDirection
   * @return toDirection
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToDirection() {
    return toDirection;
  }


  @JsonProperty(JSON_PROPERTY_TO_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToDirection(String toDirection) {
    this.toDirection = toDirection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogicalConnectionPowerToPortRelation logicalConnectionPowerToPortRelation = (LogicalConnectionPowerToPortRelation) o;
    return Objects.equals(this.direction, logicalConnectionPowerToPortRelation.direction) &&
        Objects.equals(this.toDirection, logicalConnectionPowerToPortRelation.toDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, toDirection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalConnectionPowerToPortRelation {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    toDirection: ").append(toIndentedString(toDirection)).append("\n");
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
