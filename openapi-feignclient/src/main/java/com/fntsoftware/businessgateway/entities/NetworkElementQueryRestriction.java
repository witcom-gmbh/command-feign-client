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
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NetworkElementQueryRestriction
 */
@JsonPropertyOrder({
  NetworkElementQueryRestriction.JSON_PROPERTY_MASTER_ZONE_ELID,
  NetworkElementQueryRestriction.JSON_PROPERTY_NAME,
  NetworkElementQueryRestriction.JSON_PROPERTY_REMARK,
  NetworkElementQueryRestriction.JSON_PROPERTY_ID,
  NetworkElementQueryRestriction.JSON_PROPERTY_TYPE,
  NetworkElementQueryRestriction.JSON_PROPERTY_ELID,
  NetworkElementQueryRestriction.JSON_PROPERTY_MASTER_DEVICE_ELID,
  NetworkElementQueryRestriction.JSON_PROPERTY_FIRST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class NetworkElementQueryRestriction {
  public static final String JSON_PROPERTY_MASTER_ZONE_ELID = "masterZoneElid";
  private RestrictionsString masterZoneElid;

  public static final String JSON_PROPERTY_NAME = "name";
  private RestrictionsString name;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RestrictionsString type;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_MASTER_DEVICE_ELID = "masterDeviceElid";
  private RestrictionsString masterDeviceElid;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public NetworkElementQueryRestriction() {
  }

  public NetworkElementQueryRestriction masterZoneElid(RestrictionsString masterZoneElid) {
    
    this.masterZoneElid = masterZoneElid;
    return this;
  }

   /**
   * Get masterZoneElid
   * @return masterZoneElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MASTER_ZONE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getMasterZoneElid() {
    return masterZoneElid;
  }


  @JsonProperty(JSON_PROPERTY_MASTER_ZONE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMasterZoneElid(RestrictionsString masterZoneElid) {
    this.masterZoneElid = masterZoneElid;
  }


  public NetworkElementQueryRestriction name(RestrictionsString name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(RestrictionsString name) {
    this.name = name;
  }


  public NetworkElementQueryRestriction remark(RestrictionsString remark) {
    
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


  public NetworkElementQueryRestriction id(RestrictionsString id) {
    
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


  public NetworkElementQueryRestriction type(RestrictionsString type) {
    
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


  public NetworkElementQueryRestriction elid(RestrictionsString elid) {
    
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


  public NetworkElementQueryRestriction masterDeviceElid(RestrictionsString masterDeviceElid) {
    
    this.masterDeviceElid = masterDeviceElid;
    return this;
  }

   /**
   * Get masterDeviceElid
   * @return masterDeviceElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MASTER_DEVICE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getMasterDeviceElid() {
    return masterDeviceElid;
  }


  @JsonProperty(JSON_PROPERTY_MASTER_DEVICE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMasterDeviceElid(RestrictionsString masterDeviceElid) {
    this.masterDeviceElid = masterDeviceElid;
  }


  public NetworkElementQueryRestriction first(RestrictionsNumeric first) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkElementQueryRestriction networkElementQueryRestriction = (NetworkElementQueryRestriction) o;
    return Objects.equals(this.masterZoneElid, networkElementQueryRestriction.masterZoneElid) &&
        Objects.equals(this.name, networkElementQueryRestriction.name) &&
        Objects.equals(this.remark, networkElementQueryRestriction.remark) &&
        Objects.equals(this.id, networkElementQueryRestriction.id) &&
        Objects.equals(this.type, networkElementQueryRestriction.type) &&
        Objects.equals(this.elid, networkElementQueryRestriction.elid) &&
        Objects.equals(this.masterDeviceElid, networkElementQueryRestriction.masterDeviceElid) &&
        Objects.equals(this.first, networkElementQueryRestriction.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterZoneElid, name, remark, id, type, elid, masterDeviceElid, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkElementQueryRestriction {\n");
    sb.append("    masterZoneElid: ").append(toIndentedString(masterZoneElid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    masterDeviceElid: ").append(toIndentedString(masterDeviceElid)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
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
