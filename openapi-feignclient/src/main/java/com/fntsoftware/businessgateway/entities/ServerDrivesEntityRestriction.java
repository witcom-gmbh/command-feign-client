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
import com.fntsoftware.businessgateway.entities.RestrictionsDate;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServerDrivesEntityRestriction
 */
@JsonPropertyOrder({
  ServerDrivesEntityRestriction.JSON_PROPERTY_SUPPLIER,
  ServerDrivesEntityRestriction.JSON_PROPERTY_REMARK,
  ServerDrivesEntityRestriction.JSON_PROPERTY_VISIBLE_ID,
  ServerDrivesEntityRestriction.JSON_PROPERTY_ID,
  ServerDrivesEntityRestriction.JSON_PROPERTY_SUPPLY_DATE,
  ServerDrivesEntityRestriction.JSON_PROPERTY_TYPE,
  ServerDrivesEntityRestriction.JSON_PROPERTY_ELID,
  ServerDrivesEntityRestriction.JSON_PROPERTY_MANUFACTURER,
  ServerDrivesEntityRestriction.JSON_PROPERTY_SERIAL_NO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ServerDrivesEntityRestriction {
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

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private RestrictionsString manufacturer;

  public static final String JSON_PROPERTY_SERIAL_NO = "serialNo";
  private RestrictionsString serialNo;

  public ServerDrivesEntityRestriction() {
  }

  public ServerDrivesEntityRestriction supplier(RestrictionsString supplier) {
    
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


  public ServerDrivesEntityRestriction remark(RestrictionsString remark) {
    
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


  public ServerDrivesEntityRestriction visibleId(RestrictionsString visibleId) {
    
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


  public ServerDrivesEntityRestriction id(RestrictionsString id) {
    
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


  public ServerDrivesEntityRestriction supplyDate(RestrictionsDate supplyDate) {
    
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


  public ServerDrivesEntityRestriction type(RestrictionsString type) {
    
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


  public ServerDrivesEntityRestriction elid(RestrictionsString elid) {
    
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


  public ServerDrivesEntityRestriction manufacturer(RestrictionsString manufacturer) {
    
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


  public ServerDrivesEntityRestriction serialNo(RestrictionsString serialNo) {
    
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
    ServerDrivesEntityRestriction serverDrivesEntityRestriction = (ServerDrivesEntityRestriction) o;
    return Objects.equals(this.supplier, serverDrivesEntityRestriction.supplier) &&
        Objects.equals(this.remark, serverDrivesEntityRestriction.remark) &&
        Objects.equals(this.visibleId, serverDrivesEntityRestriction.visibleId) &&
        Objects.equals(this.id, serverDrivesEntityRestriction.id) &&
        Objects.equals(this.supplyDate, serverDrivesEntityRestriction.supplyDate) &&
        Objects.equals(this.type, serverDrivesEntityRestriction.type) &&
        Objects.equals(this.elid, serverDrivesEntityRestriction.elid) &&
        Objects.equals(this.manufacturer, serverDrivesEntityRestriction.manufacturer) &&
        Objects.equals(this.serialNo, serverDrivesEntityRestriction.serialNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplier, remark, visibleId, id, supplyDate, type, elid, manufacturer, serialNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerDrivesEntityRestriction {\n");
    sb.append("    supplier: ").append(toIndentedString(supplier)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    supplyDate: ").append(toIndentedString(supplyDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
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
