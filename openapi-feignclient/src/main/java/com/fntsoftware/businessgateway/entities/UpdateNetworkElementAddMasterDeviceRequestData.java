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
 * UpdateNetworkElementAddMasterDeviceRequestData
 */
@JsonPropertyOrder({
  UpdateNetworkElementAddMasterDeviceRequestData.JSON_PROPERTY_ADD_ZONE,
  UpdateNetworkElementAddMasterDeviceRequestData.JSON_PROPERTY_SET_ZONE_AS_MASTER_ZONE,
  UpdateNetworkElementAddMasterDeviceRequestData.JSON_PROPERTY_LINKED_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateNetworkElementAddMasterDeviceRequestData {
  public static final String JSON_PROPERTY_ADD_ZONE = "addZone";
  private Boolean addZone;

  public static final String JSON_PROPERTY_SET_ZONE_AS_MASTER_ZONE = "setZoneAsMasterZone";
  private Boolean setZoneAsMasterZone;

  public static final String JSON_PROPERTY_LINKED_ELID = "linkedElid";
  private String linkedElid;

  public UpdateNetworkElementAddMasterDeviceRequestData() {
  }

  public UpdateNetworkElementAddMasterDeviceRequestData addZone(Boolean addZone) {
    
    this.addZone = addZone;
    return this;
  }

   /**
   * Get addZone
   * @return addZone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADD_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAddZone() {
    return addZone;
  }


  @JsonProperty(JSON_PROPERTY_ADD_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddZone(Boolean addZone) {
    this.addZone = addZone;
  }


  public UpdateNetworkElementAddMasterDeviceRequestData setZoneAsMasterZone(Boolean setZoneAsMasterZone) {
    
    this.setZoneAsMasterZone = setZoneAsMasterZone;
    return this;
  }

   /**
   * Get setZoneAsMasterZone
   * @return setZoneAsMasterZone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SET_ZONE_AS_MASTER_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSetZoneAsMasterZone() {
    return setZoneAsMasterZone;
  }


  @JsonProperty(JSON_PROPERTY_SET_ZONE_AS_MASTER_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetZoneAsMasterZone(Boolean setZoneAsMasterZone) {
    this.setZoneAsMasterZone = setZoneAsMasterZone;
  }


  public UpdateNetworkElementAddMasterDeviceRequestData linkedElid(String linkedElid) {
    
    this.linkedElid = linkedElid;
    return this;
  }

   /**
   * Get linkedElid
   * @return linkedElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkedElid() {
    return linkedElid;
  }


  @JsonProperty(JSON_PROPERTY_LINKED_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkedElid(String linkedElid) {
    this.linkedElid = linkedElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateNetworkElementAddMasterDeviceRequestData updateNetworkElementAddMasterDeviceRequestData = (UpdateNetworkElementAddMasterDeviceRequestData) o;
    return Objects.equals(this.addZone, updateNetworkElementAddMasterDeviceRequestData.addZone) &&
        Objects.equals(this.setZoneAsMasterZone, updateNetworkElementAddMasterDeviceRequestData.setZoneAsMasterZone) &&
        Objects.equals(this.linkedElid, updateNetworkElementAddMasterDeviceRequestData.linkedElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addZone, setZoneAsMasterZone, linkedElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNetworkElementAddMasterDeviceRequestData {\n");
    sb.append("    addZone: ").append(toIndentedString(addZone)).append("\n");
    sb.append("    setZoneAsMasterZone: ").append(toIndentedString(setZoneAsMasterZone)).append("\n");
    sb.append("    linkedElid: ").append(toIndentedString(linkedElid)).append("\n");
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
