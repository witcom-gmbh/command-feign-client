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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * GridInputPhaseData
 */
@JsonPropertyOrder({
  GridInputPhaseData.JSON_PROPERTY_ANGLE,
  GridInputPhaseData.JSON_PROPERTY_ID,
  GridInputPhaseData.JSON_PROPERTY_ELID,
  GridInputPhaseData.JSON_PROPERTY_VOLTAGE
})
@JsonTypeName("gridInputPhaseData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class GridInputPhaseData {
  public static final String JSON_PROPERTY_ANGLE = "angle";
  private BigDecimal angle;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_VOLTAGE = "voltage";
  private BigDecimal voltage;

  public GridInputPhaseData() {
  }

  public GridInputPhaseData angle(BigDecimal angle) {
    
    this.angle = angle;
    return this;
  }

   /**
   * Get angle
   * @return angle
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANGLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAngle() {
    return angle;
  }


  @JsonProperty(JSON_PROPERTY_ANGLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAngle(BigDecimal angle) {
    this.angle = angle;
  }


  public GridInputPhaseData id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public GridInputPhaseData elid(String elid) {
    
    this.elid = elid;
    return this;
  }

   /**
   * Get elid
   * @return elid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(String elid) {
    this.elid = elid;
  }


  public GridInputPhaseData voltage(BigDecimal voltage) {
    
    this.voltage = voltage;
    return this;
  }

   /**
   * Get voltage
   * @return voltage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOLTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getVoltage() {
    return voltage;
  }


  @JsonProperty(JSON_PROPERTY_VOLTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoltage(BigDecimal voltage) {
    this.voltage = voltage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GridInputPhaseData gridInputPhaseData = (GridInputPhaseData) o;
    return Objects.equals(this.angle, gridInputPhaseData.angle) &&
        Objects.equals(this.id, gridInputPhaseData.id) &&
        Objects.equals(this.elid, gridInputPhaseData.elid) &&
        Objects.equals(this.voltage, gridInputPhaseData.voltage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(angle, id, elid, voltage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GridInputPhaseData {\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    voltage: ").append(toIndentedString(voltage)).append("\n");
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

