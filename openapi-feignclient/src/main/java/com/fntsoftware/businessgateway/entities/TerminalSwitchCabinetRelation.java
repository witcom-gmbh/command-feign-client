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
 * TerminalSwitchCabinetRelation
 */
@JsonPropertyOrder({
  TerminalSwitchCabinetRelation.JSON_PROPERTY_OFFSET,
  TerminalSwitchCabinetRelation.JSON_PROPERTY_OPPOSITE_SIDE_USED,
  TerminalSwitchCabinetRelation.JSON_PROPERTY_ROTATE180,
  TerminalSwitchCabinetRelation.JSON_PROPERTY_CABINET_SIDE,
  TerminalSwitchCabinetRelation.JSON_PROPERTY_HEIGHT_UNIT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class TerminalSwitchCabinetRelation {
  public static final String JSON_PROPERTY_OFFSET = "offset";
  private BigDecimal offset;

  public static final String JSON_PROPERTY_OPPOSITE_SIDE_USED = "oppositeSideUsed";
  private Boolean oppositeSideUsed;

  public static final String JSON_PROPERTY_ROTATE180 = "rotate180";
  private Boolean rotate180;

  public static final String JSON_PROPERTY_CABINET_SIDE = "cabinetSide";
  private String cabinetSide;

  public static final String JSON_PROPERTY_HEIGHT_UNIT = "heightUnit";
  private BigDecimal heightUnit;

  public TerminalSwitchCabinetRelation() {
  }

  public TerminalSwitchCabinetRelation offset(BigDecimal offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOffset() {
    return offset;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffset(BigDecimal offset) {
    this.offset = offset;
  }


  public TerminalSwitchCabinetRelation oppositeSideUsed(Boolean oppositeSideUsed) {
    
    this.oppositeSideUsed = oppositeSideUsed;
    return this;
  }

   /**
   * Get oppositeSideUsed
   * @return oppositeSideUsed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPPOSITE_SIDE_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOppositeSideUsed() {
    return oppositeSideUsed;
  }


  @JsonProperty(JSON_PROPERTY_OPPOSITE_SIDE_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOppositeSideUsed(Boolean oppositeSideUsed) {
    this.oppositeSideUsed = oppositeSideUsed;
  }


  public TerminalSwitchCabinetRelation rotate180(Boolean rotate180) {
    
    this.rotate180 = rotate180;
    return this;
  }

   /**
   * Get rotate180
   * @return rotate180
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROTATE180)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRotate180() {
    return rotate180;
  }


  @JsonProperty(JSON_PROPERTY_ROTATE180)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRotate180(Boolean rotate180) {
    this.rotate180 = rotate180;
  }


  public TerminalSwitchCabinetRelation cabinetSide(String cabinetSide) {
    
    this.cabinetSide = cabinetSide;
    return this;
  }

   /**
   * Get cabinetSide
   * @return cabinetSide
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CABINET_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCabinetSide() {
    return cabinetSide;
  }


  @JsonProperty(JSON_PROPERTY_CABINET_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCabinetSide(String cabinetSide) {
    this.cabinetSide = cabinetSide;
  }


  public TerminalSwitchCabinetRelation heightUnit(BigDecimal heightUnit) {
    
    this.heightUnit = heightUnit;
    return this;
  }

   /**
   * Get heightUnit
   * @return heightUnit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHeightUnit() {
    return heightUnit;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeightUnit(BigDecimal heightUnit) {
    this.heightUnit = heightUnit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalSwitchCabinetRelation terminalSwitchCabinetRelation = (TerminalSwitchCabinetRelation) o;
    return Objects.equals(this.offset, terminalSwitchCabinetRelation.offset) &&
        Objects.equals(this.oppositeSideUsed, terminalSwitchCabinetRelation.oppositeSideUsed) &&
        Objects.equals(this.rotate180, terminalSwitchCabinetRelation.rotate180) &&
        Objects.equals(this.cabinetSide, terminalSwitchCabinetRelation.cabinetSide) &&
        Objects.equals(this.heightUnit, terminalSwitchCabinetRelation.heightUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, oppositeSideUsed, rotate180, cabinetSide, heightUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalSwitchCabinetRelation {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    oppositeSideUsed: ").append(toIndentedString(oppositeSideUsed)).append("\n");
    sb.append("    rotate180: ").append(toIndentedString(rotate180)).append("\n");
    sb.append("    cabinetSide: ").append(toIndentedString(cabinetSide)).append("\n");
    sb.append("    heightUnit: ").append(toIndentedString(heightUnit)).append("\n");
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
