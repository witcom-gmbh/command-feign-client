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
 * DeviceMasterJunctionBoxData
 */
@JsonPropertyOrder({
  DeviceMasterJunctionBoxData.JSON_PROPERTY_HEIGHT_UNITS,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_ID_PREFIX,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_USED,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_EXPLANATION,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_TYPE,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_ELID,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_MANUFACTURER,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_ENTRIES,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_IS_STANDARD,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_DEVICE_FROM_WAREHOUSE,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_DEVICE_TO_WAREHOUSE,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_FUNCTION,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_OBJMGMT_ON_CREATE,
  DeviceMasterJunctionBoxData.JSON_PROPERTY_WIDTH_UNITS
})
@JsonTypeName("deviceMasterJunctionBoxData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class DeviceMasterJunctionBoxData {
  public static final String JSON_PROPERTY_HEIGHT_UNITS = "heightUnits";
  private BigDecimal heightUnits;

  public static final String JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER = "manufacturerArticleNumber";
  private String manufacturerArticleNumber;

  public static final String JSON_PROPERTY_ID_PREFIX = "idPrefix";
  private String idPrefix;

  public static final String JSON_PROPERTY_USED = "used";
  private Boolean used;

  public static final String JSON_PROPERTY_EXPLANATION = "explanation";
  private String explanation;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private String manufacturer;

  public static final String JSON_PROPERTY_ENTRIES = "entries";
  private BigDecimal entries;

  public static final String JSON_PROPERTY_IS_STANDARD = "isStandard";
  private Boolean isStandard;

  public static final String JSON_PROPERTY_DEVICE_FROM_WAREHOUSE = "deviceFromWarehouse";
  private Boolean deviceFromWarehouse;

  public static final String JSON_PROPERTY_DEVICE_TO_WAREHOUSE = "deviceToWarehouse";
  private Boolean deviceToWarehouse;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private String function;

  public static final String JSON_PROPERTY_OBJMGMT_ON_CREATE = "objmgmtOnCreate";
  private Boolean objmgmtOnCreate;

  public static final String JSON_PROPERTY_WIDTH_UNITS = "widthUnits";
  private BigDecimal widthUnits;

  public DeviceMasterJunctionBoxData() {
  }

  public DeviceMasterJunctionBoxData heightUnits(BigDecimal heightUnits) {
    
    this.heightUnits = heightUnits;
    return this;
  }

   /**
   * Get heightUnits
   * @return heightUnits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHeightUnits() {
    return heightUnits;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeightUnits(BigDecimal heightUnits) {
    this.heightUnits = heightUnits;
  }


  public DeviceMasterJunctionBoxData manufacturerArticleNumber(String manufacturerArticleNumber) {
    
    this.manufacturerArticleNumber = manufacturerArticleNumber;
    return this;
  }

   /**
   * Get manufacturerArticleNumber
   * @return manufacturerArticleNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManufacturerArticleNumber() {
    return manufacturerArticleNumber;
  }


  @JsonProperty(JSON_PROPERTY_MANUFACTURER_ARTICLE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturerArticleNumber(String manufacturerArticleNumber) {
    this.manufacturerArticleNumber = manufacturerArticleNumber;
  }


  public DeviceMasterJunctionBoxData idPrefix(String idPrefix) {
    
    this.idPrefix = idPrefix;
    return this;
  }

   /**
   * Get idPrefix
   * @return idPrefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdPrefix() {
    return idPrefix;
  }


  @JsonProperty(JSON_PROPERTY_ID_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdPrefix(String idPrefix) {
    this.idPrefix = idPrefix;
  }


  public DeviceMasterJunctionBoxData used(Boolean used) {
    
    this.used = used;
    return this;
  }

   /**
   * Get used
   * @return used
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsed() {
    return used;
  }


  @JsonProperty(JSON_PROPERTY_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsed(Boolean used) {
    this.used = used;
  }


  public DeviceMasterJunctionBoxData explanation(String explanation) {
    
    this.explanation = explanation;
    return this;
  }

   /**
   * Get explanation
   * @return explanation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExplanation() {
    return explanation;
  }


  @JsonProperty(JSON_PROPERTY_EXPLANATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  public DeviceMasterJunctionBoxData type(String type) {
    
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


  public DeviceMasterJunctionBoxData elid(String elid) {
    
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


  public DeviceMasterJunctionBoxData manufacturer(String manufacturer) {
    
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManufacturer() {
    return manufacturer;
  }


  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public DeviceMasterJunctionBoxData entries(BigDecimal entries) {
    
    this.entries = entries;
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEntries() {
    return entries;
  }


  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntries(BigDecimal entries) {
    this.entries = entries;
  }


  public DeviceMasterJunctionBoxData isStandard(Boolean isStandard) {
    
    this.isStandard = isStandard;
    return this;
  }

   /**
   * Get isStandard
   * @return isStandard
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsStandard() {
    return isStandard;
  }


  @JsonProperty(JSON_PROPERTY_IS_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }


  public DeviceMasterJunctionBoxData deviceFromWarehouse(Boolean deviceFromWarehouse) {
    
    this.deviceFromWarehouse = deviceFromWarehouse;
    return this;
  }

   /**
   * Get deviceFromWarehouse
   * @return deviceFromWarehouse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_FROM_WAREHOUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeviceFromWarehouse() {
    return deviceFromWarehouse;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_FROM_WAREHOUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceFromWarehouse(Boolean deviceFromWarehouse) {
    this.deviceFromWarehouse = deviceFromWarehouse;
  }


  public DeviceMasterJunctionBoxData deviceToWarehouse(Boolean deviceToWarehouse) {
    
    this.deviceToWarehouse = deviceToWarehouse;
    return this;
  }

   /**
   * Get deviceToWarehouse
   * @return deviceToWarehouse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_TO_WAREHOUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeviceToWarehouse() {
    return deviceToWarehouse;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_TO_WAREHOUSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceToWarehouse(Boolean deviceToWarehouse) {
    this.deviceToWarehouse = deviceToWarehouse;
  }


  public DeviceMasterJunctionBoxData function(String function) {
    
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFunction() {
    return function;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFunction(String function) {
    this.function = function;
  }


  public DeviceMasterJunctionBoxData objmgmtOnCreate(Boolean objmgmtOnCreate) {
    
    this.objmgmtOnCreate = objmgmtOnCreate;
    return this;
  }

   /**
   * Get objmgmtOnCreate
   * @return objmgmtOnCreate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJMGMT_ON_CREATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getObjmgmtOnCreate() {
    return objmgmtOnCreate;
  }


  @JsonProperty(JSON_PROPERTY_OBJMGMT_ON_CREATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjmgmtOnCreate(Boolean objmgmtOnCreate) {
    this.objmgmtOnCreate = objmgmtOnCreate;
  }


  public DeviceMasterJunctionBoxData widthUnits(BigDecimal widthUnits) {
    
    this.widthUnits = widthUnits;
    return this;
  }

   /**
   * Get widthUnits
   * @return widthUnits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWidthUnits() {
    return widthUnits;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidthUnits(BigDecimal widthUnits) {
    this.widthUnits = widthUnits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceMasterJunctionBoxData deviceMasterJunctionBoxData = (DeviceMasterJunctionBoxData) o;
    return Objects.equals(this.heightUnits, deviceMasterJunctionBoxData.heightUnits) &&
        Objects.equals(this.manufacturerArticleNumber, deviceMasterJunctionBoxData.manufacturerArticleNumber) &&
        Objects.equals(this.idPrefix, deviceMasterJunctionBoxData.idPrefix) &&
        Objects.equals(this.used, deviceMasterJunctionBoxData.used) &&
        Objects.equals(this.explanation, deviceMasterJunctionBoxData.explanation) &&
        Objects.equals(this.type, deviceMasterJunctionBoxData.type) &&
        Objects.equals(this.elid, deviceMasterJunctionBoxData.elid) &&
        Objects.equals(this.manufacturer, deviceMasterJunctionBoxData.manufacturer) &&
        Objects.equals(this.entries, deviceMasterJunctionBoxData.entries) &&
        Objects.equals(this.isStandard, deviceMasterJunctionBoxData.isStandard) &&
        Objects.equals(this.deviceFromWarehouse, deviceMasterJunctionBoxData.deviceFromWarehouse) &&
        Objects.equals(this.deviceToWarehouse, deviceMasterJunctionBoxData.deviceToWarehouse) &&
        Objects.equals(this.function, deviceMasterJunctionBoxData.function) &&
        Objects.equals(this.objmgmtOnCreate, deviceMasterJunctionBoxData.objmgmtOnCreate) &&
        Objects.equals(this.widthUnits, deviceMasterJunctionBoxData.widthUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heightUnits, manufacturerArticleNumber, idPrefix, used, explanation, type, elid, manufacturer, entries, isStandard, deviceFromWarehouse, deviceToWarehouse, function, objmgmtOnCreate, widthUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMasterJunctionBoxData {\n");
    sb.append("    heightUnits: ").append(toIndentedString(heightUnits)).append("\n");
    sb.append("    manufacturerArticleNumber: ").append(toIndentedString(manufacturerArticleNumber)).append("\n");
    sb.append("    idPrefix: ").append(toIndentedString(idPrefix)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    deviceFromWarehouse: ").append(toIndentedString(deviceFromWarehouse)).append("\n");
    sb.append("    deviceToWarehouse: ").append(toIndentedString(deviceToWarehouse)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    objmgmtOnCreate: ").append(toIndentedString(objmgmtOnCreate)).append("\n");
    sb.append("    widthUnits: ").append(toIndentedString(widthUnits)).append("\n");
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
