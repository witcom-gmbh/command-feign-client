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
import com.fntsoftware.businessgateway.entities.InterfaceinterfaceWithAddressData;
import com.fntsoftware.businessgateway.entities.PhysicalPortDataphysicalPortDataInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ChassisIpAddressesResponseData
 */
@JsonPropertyOrder({
  ChassisIpAddressesResponseData.JSON_PROPERTY_ASSIGNED_DIRECTLY,
  ChassisIpAddressesResponseData.JSON_PROPERTY_INTERFACE,
  ChassisIpAddressesResponseData.JSON_PROPERTY_PORTS,
  ChassisIpAddressesResponseData.JSON_PROPERTY_OBJECT_ELID,
  ChassisIpAddressesResponseData.JSON_PROPERTY_OBJECT_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class ChassisIpAddressesResponseData {
  public static final String JSON_PROPERTY_ASSIGNED_DIRECTLY = "assignedDirectly";
  private Boolean assignedDirectly;

  public static final String JSON_PROPERTY_INTERFACE = "interface";
  private InterfaceinterfaceWithAddressData _interface;

  public static final String JSON_PROPERTY_PORTS = "ports";
  private List<PhysicalPortDataphysicalPortDataInfo> ports;

  public static final String JSON_PROPERTY_OBJECT_ELID = "objectElid";
  private String objectElid;

  public static final String JSON_PROPERTY_OBJECT_ID = "objectId";
  private String objectId;

  public ChassisIpAddressesResponseData() {
  }

  public ChassisIpAddressesResponseData assignedDirectly(Boolean assignedDirectly) {
    
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


  public ChassisIpAddressesResponseData _interface(InterfaceinterfaceWithAddressData _interface) {
    
    this._interface = _interface;
    return this;
  }

   /**
   * Get _interface
   * @return _interface
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERFACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterfaceinterfaceWithAddressData getInterface() {
    return _interface;
  }


  @JsonProperty(JSON_PROPERTY_INTERFACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterface(InterfaceinterfaceWithAddressData _interface) {
    this._interface = _interface;
  }


  public ChassisIpAddressesResponseData ports(List<PhysicalPortDataphysicalPortDataInfo> ports) {
    
    this.ports = ports;
    return this;
  }

  public ChassisIpAddressesResponseData addPortsItem(PhysicalPortDataphysicalPortDataInfo portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Get ports
   * @return ports
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PhysicalPortDataphysicalPortDataInfo> getPorts() {
    return ports;
  }


  @JsonProperty(JSON_PROPERTY_PORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPorts(List<PhysicalPortDataphysicalPortDataInfo> ports) {
    this.ports = ports;
  }


  public ChassisIpAddressesResponseData objectElid(String objectElid) {
    
    this.objectElid = objectElid;
    return this;
  }

   /**
   * Get objectElid
   * @return objectElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObjectElid() {
    return objectElid;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectElid(String objectElid) {
    this.objectElid = objectElid;
  }


  public ChassisIpAddressesResponseData objectId(String objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObjectId() {
    return objectId;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChassisIpAddressesResponseData chassisIpAddressesResponseData = (ChassisIpAddressesResponseData) o;
    return Objects.equals(this.assignedDirectly, chassisIpAddressesResponseData.assignedDirectly) &&
        Objects.equals(this._interface, chassisIpAddressesResponseData._interface) &&
        Objects.equals(this.ports, chassisIpAddressesResponseData.ports) &&
        Objects.equals(this.objectElid, chassisIpAddressesResponseData.objectElid) &&
        Objects.equals(this.objectId, chassisIpAddressesResponseData.objectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedDirectly, _interface, ports, objectElid, objectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChassisIpAddressesResponseData {\n");
    sb.append("    assignedDirectly: ").append(toIndentedString(assignedDirectly)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    objectElid: ").append(toIndentedString(objectElid)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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

