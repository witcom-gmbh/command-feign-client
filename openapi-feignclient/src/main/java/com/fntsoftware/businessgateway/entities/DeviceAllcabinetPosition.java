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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DeviceAllcabinetPosition
 */
@JsonPropertyOrder({
  DeviceAllcabinetPosition.JSON_PROPERTY_CABINET_VISIBLE_ID,
  DeviceAllcabinetPosition.JSON_PROPERTY_OFFSET,
  DeviceAllcabinetPosition.JSON_PROPERTY_CABINET_ID,
  DeviceAllcabinetPosition.JSON_PROPERTY_CABINET_ELID,
  DeviceAllcabinetPosition.JSON_PROPERTY_CABINET_SIDE,
  DeviceAllcabinetPosition.JSON_PROPERTY_HEIGHT_UNIT
})
@JsonTypeName("deviceAllcabinetPosition")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:00:24.721128812Z[Etc/UTC]")
public class DeviceAllcabinetPosition {
  public static final String JSON_PROPERTY_CABINET_VISIBLE_ID = "cabinetVisibleId";
  private String cabinetVisibleId;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private BigDecimal offset;

  public static final String JSON_PROPERTY_CABINET_ID = "cabinetId";
  private String cabinetId;

  public static final String JSON_PROPERTY_CABINET_ELID = "cabinetElid";
  private String cabinetElid;

  public static final String JSON_PROPERTY_CABINET_SIDE = "cabinetSide";
  private String cabinetSide;

  public static final String JSON_PROPERTY_HEIGHT_UNIT = "heightUnit";
  private BigDecimal heightUnit;

  public DeviceAllcabinetPosition() {
  }

  public DeviceAllcabinetPosition cabinetVisibleId(String cabinetVisibleId) {
    
    this.cabinetVisibleId = cabinetVisibleId;
    return this;
  }

   /**
   * Get cabinetVisibleId
   * @return cabinetVisibleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CABINET_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCabinetVisibleId() {
    return cabinetVisibleId;
  }


  @JsonProperty(JSON_PROPERTY_CABINET_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCabinetVisibleId(String cabinetVisibleId) {
    this.cabinetVisibleId = cabinetVisibleId;
  }


  public DeviceAllcabinetPosition offset(BigDecimal offset) {
    
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


  public DeviceAllcabinetPosition cabinetId(String cabinetId) {
    
    this.cabinetId = cabinetId;
    return this;
  }

   /**
   * Get cabinetId
   * @return cabinetId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CABINET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCabinetId() {
    return cabinetId;
  }


  @JsonProperty(JSON_PROPERTY_CABINET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCabinetId(String cabinetId) {
    this.cabinetId = cabinetId;
  }


  public DeviceAllcabinetPosition cabinetElid(String cabinetElid) {
    
    this.cabinetElid = cabinetElid;
    return this;
  }

   /**
   * Get cabinetElid
   * @return cabinetElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CABINET_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCabinetElid() {
    return cabinetElid;
  }


  @JsonProperty(JSON_PROPERTY_CABINET_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCabinetElid(String cabinetElid) {
    this.cabinetElid = cabinetElid;
  }


  public DeviceAllcabinetPosition cabinetSide(String cabinetSide) {
    
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


  public DeviceAllcabinetPosition heightUnit(BigDecimal heightUnit) {
    
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
    DeviceAllcabinetPosition deviceAllcabinetPosition = (DeviceAllcabinetPosition) o;
    return Objects.equals(this.cabinetVisibleId, deviceAllcabinetPosition.cabinetVisibleId) &&
        Objects.equals(this.offset, deviceAllcabinetPosition.offset) &&
        Objects.equals(this.cabinetId, deviceAllcabinetPosition.cabinetId) &&
        Objects.equals(this.cabinetElid, deviceAllcabinetPosition.cabinetElid) &&
        Objects.equals(this.cabinetSide, deviceAllcabinetPosition.cabinetSide) &&
        Objects.equals(this.heightUnit, deviceAllcabinetPosition.heightUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cabinetVisibleId, offset, cabinetId, cabinetElid, cabinetSide, heightUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceAllcabinetPosition {\n");
    sb.append("    cabinetVisibleId: ").append(toIndentedString(cabinetVisibleId)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    cabinetId: ").append(toIndentedString(cabinetId)).append("\n");
    sb.append("    cabinetElid: ").append(toIndentedString(cabinetElid)).append("\n");
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
