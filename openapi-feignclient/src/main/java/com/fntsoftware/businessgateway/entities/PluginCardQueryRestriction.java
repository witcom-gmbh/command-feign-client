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
import com.fntsoftware.businessgateway.entities.RestrictionsDate;
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PluginCardQueryRestriction
 */
@JsonPropertyOrder({
  PluginCardQueryRestriction.JSON_PROPERTY_SUPPLIER,
  PluginCardQueryRestriction.JSON_PROPERTY_REMARK,
  PluginCardQueryRestriction.JSON_PROPERTY_VISIBLE_ID,
  PluginCardQueryRestriction.JSON_PROPERTY_ID,
  PluginCardQueryRestriction.JSON_PROPERTY_SUPPLY_DATE,
  PluginCardQueryRestriction.JSON_PROPERTY_TYPE,
  PluginCardQueryRestriction.JSON_PROPERTY_ELID,
  PluginCardQueryRestriction.JSON_PROPERTY_FIRST,
  PluginCardQueryRestriction.JSON_PROPERTY_MANUFACTURER,
  PluginCardQueryRestriction.JSON_PROPERTY_SERIAL_NO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class PluginCardQueryRestriction {
  public static final String JSON_PROPERTY_SUPPLIER = "supplier";
  private RestrictionsString supplier;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_SUPPLY_DATE = "supplyDate";
  private RestrictionsDate supplyDate;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RestrictionsString type;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private RestrictionsString manufacturer;

  public static final String JSON_PROPERTY_SERIAL_NO = "serialNo";
  private RestrictionsString serialNo;

  public PluginCardQueryRestriction() {
  }

  public PluginCardQueryRestriction supplier(RestrictionsString supplier) {
    
    this.supplier = supplier;
    return this;
  }

   /**
   * Get supplier
   * @return supplier
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSupplier() {
    return supplier;
  }


  @JsonProperty(JSON_PROPERTY_SUPPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupplier(RestrictionsString supplier) {
    this.supplier = supplier;
  }


  public PluginCardQueryRestriction remark(RestrictionsString remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(RestrictionsString remark) {
    this.remark = remark;
  }


  public PluginCardQueryRestriction visibleId(RestrictionsString visibleId) {
    
    this.visibleId = visibleId;
    return this;
  }

   /**
   * Get visibleId
   * @return visibleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getVisibleId() {
    return visibleId;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleId(RestrictionsString visibleId) {
    this.visibleId = visibleId;
  }


  public PluginCardQueryRestriction id(RestrictionsString id) {
    
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

  public RestrictionsString getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(RestrictionsString id) {
    this.id = id;
  }


  public PluginCardQueryRestriction supplyDate(RestrictionsDate supplyDate) {
    
    this.supplyDate = supplyDate;
    return this;
  }

   /**
   * Get supplyDate
   * @return supplyDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPLY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getSupplyDate() {
    return supplyDate;
  }


  @JsonProperty(JSON_PROPERTY_SUPPLY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupplyDate(RestrictionsDate supplyDate) {
    this.supplyDate = supplyDate;
  }


  public PluginCardQueryRestriction type(RestrictionsString type) {
    
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

  public RestrictionsString getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(RestrictionsString type) {
    this.type = type;
  }


  public PluginCardQueryRestriction elid(RestrictionsString elid) {
    
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

  public RestrictionsString getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(RestrictionsString elid) {
    this.elid = elid;
  }


  public PluginCardQueryRestriction first(RestrictionsNumeric first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getFirst() {
    return first;
  }


  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirst(RestrictionsNumeric first) {
    this.first = first;
  }


  public PluginCardQueryRestriction manufacturer(RestrictionsString manufacturer) {
    
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

  public RestrictionsString getManufacturer() {
    return manufacturer;
  }


  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturer(RestrictionsString manufacturer) {
    this.manufacturer = manufacturer;
  }


  public PluginCardQueryRestriction serialNo(RestrictionsString serialNo) {
    
    this.serialNo = serialNo;
    return this;
  }

   /**
   * Get serialNo
   * @return serialNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIAL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSerialNo() {
    return serialNo;
  }


  @JsonProperty(JSON_PROPERTY_SERIAL_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSerialNo(RestrictionsString serialNo) {
    this.serialNo = serialNo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginCardQueryRestriction pluginCardQueryRestriction = (PluginCardQueryRestriction) o;
    return Objects.equals(this.supplier, pluginCardQueryRestriction.supplier) &&
        Objects.equals(this.remark, pluginCardQueryRestriction.remark) &&
        Objects.equals(this.visibleId, pluginCardQueryRestriction.visibleId) &&
        Objects.equals(this.id, pluginCardQueryRestriction.id) &&
        Objects.equals(this.supplyDate, pluginCardQueryRestriction.supplyDate) &&
        Objects.equals(this.type, pluginCardQueryRestriction.type) &&
        Objects.equals(this.elid, pluginCardQueryRestriction.elid) &&
        Objects.equals(this.first, pluginCardQueryRestriction.first) &&
        Objects.equals(this.manufacturer, pluginCardQueryRestriction.manufacturer) &&
        Objects.equals(this.serialNo, pluginCardQueryRestriction.serialNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplier, remark, visibleId, id, supplyDate, type, elid, first, manufacturer, serialNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginCardQueryRestriction {\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    supplyDate: ").append(toIndentedString(supplyDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    serialNo: ").append(toIndentedString(serialNo)).append("\n");
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

