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
 * UpdateDeviceAllUpdateLinkVlanRequestData
 */
@JsonPropertyOrder({
  UpdateDeviceAllUpdateLinkVlanRequestData.JSON_PROPERTY_ASSIGNED_DIRECTLY,
  UpdateDeviceAllUpdateLinkVlanRequestData.JSON_PROPERTY_PORT_NUMBERS,
  UpdateDeviceAllUpdateLinkVlanRequestData.JSON_PROPERTY_LINK_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateDeviceAllUpdateLinkVlanRequestData {
  public static final String JSON_PROPERTY_ASSIGNED_DIRECTLY = "assignedDirectly";
  private Boolean assignedDirectly;

  public static final String JSON_PROPERTY_PORT_NUMBERS = "portNumbers";
  private String portNumbers;

  public static final String JSON_PROPERTY_LINK_ELID = "linkElid";
  private String linkElid;

  public UpdateDeviceAllUpdateLinkVlanRequestData() {
  }

  public UpdateDeviceAllUpdateLinkVlanRequestData assignedDirectly(Boolean assignedDirectly) {
    
    this.assignedDirectly = assignedDirectly;
    return this;
  }

   /**
   * Get assignedDirectly
   * @return assignedDirectly
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNED_DIRECTLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAssignedDirectly() {
    return assignedDirectly;
  }


  @JsonProperty(JSON_PROPERTY_ASSIGNED_DIRECTLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssignedDirectly(Boolean assignedDirectly) {
    this.assignedDirectly = assignedDirectly;
  }


  public UpdateDeviceAllUpdateLinkVlanRequestData portNumbers(String portNumbers) {
    
    this.portNumbers = portNumbers;
    return this;
  }

   /**
   * Get portNumbers
   * @return portNumbers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortNumbers() {
    return portNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PORT_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortNumbers(String portNumbers) {
    this.portNumbers = portNumbers;
  }


  public UpdateDeviceAllUpdateLinkVlanRequestData linkElid(String linkElid) {
    
    this.linkElid = linkElid;
    return this;
  }

   /**
   * Get linkElid
   * @return linkElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkElid() {
    return linkElid;
  }


  @JsonProperty(JSON_PROPERTY_LINK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkElid(String linkElid) {
    this.linkElid = linkElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDeviceAllUpdateLinkVlanRequestData updateDeviceAllUpdateLinkVlanRequestData = (UpdateDeviceAllUpdateLinkVlanRequestData) o;
    return Objects.equals(this.assignedDirectly, updateDeviceAllUpdateLinkVlanRequestData.assignedDirectly) &&
        Objects.equals(this.portNumbers, updateDeviceAllUpdateLinkVlanRequestData.portNumbers) &&
        Objects.equals(this.linkElid, updateDeviceAllUpdateLinkVlanRequestData.linkElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedDirectly, portNumbers, linkElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDeviceAllUpdateLinkVlanRequestData {\n");
    sb.append("    assignedDirectly: ").append(toIndentedString(assignedDirectly)).append("\n");
    sb.append("    portNumbers: ").append(toIndentedString(portNumbers)).append("\n");
    sb.append("    linkElid: ").append(toIndentedString(linkElid)).append("\n");
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
