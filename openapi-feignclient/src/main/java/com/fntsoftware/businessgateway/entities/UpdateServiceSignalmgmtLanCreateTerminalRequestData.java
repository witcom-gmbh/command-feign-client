/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240226111547
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
 * UpdateServiceSignalmgmtLanCreateTerminalRequestData
 */
@JsonPropertyOrder({
  UpdateServiceSignalmgmtLanCreateTerminalRequestData.JSON_PROPERTY_VISIBLE_ID,
  UpdateServiceSignalmgmtLanCreateTerminalRequestData.JSON_PROPERTY_DEVICE_MASTER_ELID,
  UpdateServiceSignalmgmtLanCreateTerminalRequestData.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class UpdateServiceSignalmgmtLanCreateTerminalRequestData {
  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_DEVICE_MASTER_ELID = "deviceMasterElid";
  private String deviceMasterElid;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public UpdateServiceSignalmgmtLanCreateTerminalRequestData() {
  }

  public UpdateServiceSignalmgmtLanCreateTerminalRequestData visibleId(String visibleId) {
    
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

  public String getVisibleId() {
    return visibleId;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleId(String visibleId) {
    this.visibleId = visibleId;
  }


  public UpdateServiceSignalmgmtLanCreateTerminalRequestData deviceMasterElid(String deviceMasterElid) {
    
    this.deviceMasterElid = deviceMasterElid;
    return this;
  }

   /**
   * Get deviceMasterElid
   * @return deviceMasterElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_MASTER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceMasterElid() {
    return deviceMasterElid;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_MASTER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceMasterElid(String deviceMasterElid) {
    this.deviceMasterElid = deviceMasterElid;
  }


  public UpdateServiceSignalmgmtLanCreateTerminalRequestData id(String id) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateServiceSignalmgmtLanCreateTerminalRequestData updateServiceSignalmgmtLanCreateTerminalRequestData = (UpdateServiceSignalmgmtLanCreateTerminalRequestData) o;
    return Objects.equals(this.visibleId, updateServiceSignalmgmtLanCreateTerminalRequestData.visibleId) &&
        Objects.equals(this.deviceMasterElid, updateServiceSignalmgmtLanCreateTerminalRequestData.deviceMasterElid) &&
        Objects.equals(this.id, updateServiceSignalmgmtLanCreateTerminalRequestData.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibleId, deviceMasterElid, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateServiceSignalmgmtLanCreateTerminalRequestData {\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    deviceMasterElid: ").append(toIndentedString(deviceMasterElid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
