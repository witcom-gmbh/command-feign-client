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
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomKeyCustomKeyParentEntityRestriction
 */
@JsonPropertyOrder({
  CustomKeyCustomKeyParentEntityRestriction.JSON_PROPERTY_KEY_CODE,
  CustomKeyCustomKeyParentEntityRestriction.JSON_PROPERTY_DATA_SOURCE_ID,
  CustomKeyCustomKeyParentEntityRestriction.JSON_PROPERTY_KEY_NUMBER,
  CustomKeyCustomKeyParentEntityRestriction.JSON_PROPERTY_LOCATION,
  CustomKeyCustomKeyParentEntityRestriction.JSON_PROPERTY_REMARK,
  CustomKeyCustomKeyParentEntityRestriction.JSON_PROPERTY_VISIBLE_ID,
  CustomKeyCustomKeyParentEntityRestriction.JSON_PROPERTY_ID,
  CustomKeyCustomKeyParentEntityRestriction.JSON_PROPERTY_KEY_TYPE,
  CustomKeyCustomKeyParentEntityRestriction.JSON_PROPERTY_DATA_SOURCE,
  CustomKeyCustomKeyParentEntityRestriction.JSON_PROPERTY_ELID,
  CustomKeyCustomKeyParentEntityRestriction.JSON_PROPERTY_MANUFACTURER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CustomKeyCustomKeyParentEntityRestriction {
  public static final String JSON_PROPERTY_KEY_CODE = "keyCode";
  private RestrictionsString keyCode;

  public static final String JSON_PROPERTY_DATA_SOURCE_ID = "dataSourceId";
  private RestrictionsString dataSourceId;

  public static final String JSON_PROPERTY_KEY_NUMBER = "keyNumber";
  private RestrictionsString keyNumber;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private RestrictionsString location;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_KEY_TYPE = "keyType";
  private RestrictionsString keyType;

  public static final String JSON_PROPERTY_DATA_SOURCE = "dataSource";
  private RestrictionsString dataSource;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_MANUFACTURER = "manufacturer";
  private RestrictionsString manufacturer;

  public CustomKeyCustomKeyParentEntityRestriction() {
  }

  public CustomKeyCustomKeyParentEntityRestriction keyCode(RestrictionsString keyCode) {
    
    this.keyCode = keyCode;
    return this;
  }

   /**
   * Get keyCode
   * @return keyCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getKeyCode() {
    return keyCode;
  }


  @JsonProperty(JSON_PROPERTY_KEY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyCode(RestrictionsString keyCode) {
    this.keyCode = keyCode;
  }


  public CustomKeyCustomKeyParentEntityRestriction dataSourceId(RestrictionsString dataSourceId) {
    
    this.dataSourceId = dataSourceId;
    return this;
  }

   /**
   * Get dataSourceId
   * @return dataSourceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDataSourceId() {
    return dataSourceId;
  }


  @JsonProperty(JSON_PROPERTY_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataSourceId(RestrictionsString dataSourceId) {
    this.dataSourceId = dataSourceId;
  }


  public CustomKeyCustomKeyParentEntityRestriction keyNumber(RestrictionsString keyNumber) {
    
    this.keyNumber = keyNumber;
    return this;
  }

   /**
   * Get keyNumber
   * @return keyNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getKeyNumber() {
    return keyNumber;
  }


  @JsonProperty(JSON_PROPERTY_KEY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyNumber(RestrictionsString keyNumber) {
    this.keyNumber = keyNumber;
  }


  public CustomKeyCustomKeyParentEntityRestriction location(RestrictionsString location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(RestrictionsString location) {
    this.location = location;
  }


  public CustomKeyCustomKeyParentEntityRestriction remark(RestrictionsString remark) {
    
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


  public CustomKeyCustomKeyParentEntityRestriction visibleId(RestrictionsString visibleId) {
    
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


  public CustomKeyCustomKeyParentEntityRestriction id(RestrictionsString id) {
    
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


  public CustomKeyCustomKeyParentEntityRestriction keyType(RestrictionsString keyType) {
    
    this.keyType = keyType;
    return this;
  }

   /**
   * Get keyType
   * @return keyType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getKeyType() {
    return keyType;
  }


  @JsonProperty(JSON_PROPERTY_KEY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyType(RestrictionsString keyType) {
    this.keyType = keyType;
  }


  public CustomKeyCustomKeyParentEntityRestriction dataSource(RestrictionsString dataSource) {
    
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDataSource() {
    return dataSource;
  }


  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataSource(RestrictionsString dataSource) {
    this.dataSource = dataSource;
  }


  public CustomKeyCustomKeyParentEntityRestriction elid(RestrictionsString elid) {
    
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


  public CustomKeyCustomKeyParentEntityRestriction manufacturer(RestrictionsString manufacturer) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomKeyCustomKeyParentEntityRestriction customKeyCustomKeyParentEntityRestriction = (CustomKeyCustomKeyParentEntityRestriction) o;
    return Objects.equals(this.keyCode, customKeyCustomKeyParentEntityRestriction.keyCode) &&
        Objects.equals(this.dataSourceId, customKeyCustomKeyParentEntityRestriction.dataSourceId) &&
        Objects.equals(this.keyNumber, customKeyCustomKeyParentEntityRestriction.keyNumber) &&
        Objects.equals(this.location, customKeyCustomKeyParentEntityRestriction.location) &&
        Objects.equals(this.remark, customKeyCustomKeyParentEntityRestriction.remark) &&
        Objects.equals(this.visibleId, customKeyCustomKeyParentEntityRestriction.visibleId) &&
        Objects.equals(this.id, customKeyCustomKeyParentEntityRestriction.id) &&
        Objects.equals(this.keyType, customKeyCustomKeyParentEntityRestriction.keyType) &&
        Objects.equals(this.dataSource, customKeyCustomKeyParentEntityRestriction.dataSource) &&
        Objects.equals(this.elid, customKeyCustomKeyParentEntityRestriction.elid) &&
        Objects.equals(this.manufacturer, customKeyCustomKeyParentEntityRestriction.manufacturer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyCode, dataSourceId, keyNumber, location, remark, visibleId, id, keyType, dataSource, elid, manufacturer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomKeyCustomKeyParentEntityRestriction {\n");
    sb.append("    keyCode: ").append(toIndentedString(keyCode)).append("\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
    sb.append("    keyNumber: ").append(toIndentedString(keyNumber)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
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
