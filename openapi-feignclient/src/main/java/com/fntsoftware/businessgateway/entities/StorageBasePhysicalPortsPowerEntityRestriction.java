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
 * StorageBasePhysicalPortsPowerEntityRestriction
 */
@JsonPropertyOrder({
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_SOCKET_NAME_SPC,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_BORDER_COLOR,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_DEVICE_ALL_ELID,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_SOCKET_NAME,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_PORT_IDENTIFIER,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_WIRE_TYPE,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_PORT_CATEGORY,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_SOCKET_NO,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_MEDIUM,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_CONNECTOR,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_SOCKET_SIDE,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_SOCKET_SUB_NO,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_STATUS_REMARK,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_DEVICE_ALL_ID,
  StorageBasePhysicalPortsPowerEntityRestriction.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class StorageBasePhysicalPortsPowerEntityRestriction {
  public static final String JSON_PROPERTY_SOCKET_NAME_SPC = "socketNameSpc";
  private RestrictionsString socketNameSpc;

  public static final String JSON_PROPERTY_BORDER_COLOR = "borderColor";
  private RestrictionsString borderColor;

  public static final String JSON_PROPERTY_DEVICE_ALL_ELID = "deviceAllElid";
  private RestrictionsString deviceAllElid;

  public static final String JSON_PROPERTY_SOCKET_NAME = "socketName";
  private RestrictionsString socketName;

  public static final String JSON_PROPERTY_PORT_IDENTIFIER = "portIdentifier";
  private RestrictionsString portIdentifier;

  public static final String JSON_PROPERTY_WIRE_TYPE = "wireType";
  private RestrictionsString wireType;

  public static final String JSON_PROPERTY_PORT_CATEGORY = "portCategory";
  private RestrictionsString portCategory;

  public static final String JSON_PROPERTY_SOCKET_NO = "socketNo";
  private RestrictionsNumeric socketNo;

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  private RestrictionsString medium;

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private RestrictionsString connector;

  public static final String JSON_PROPERTY_SOCKET_SIDE = "socketSide";
  private RestrictionsString socketSide;

  public static final String JSON_PROPERTY_SOCKET_SUB_NO = "socketSubNo";
  private RestrictionsNumeric socketSubNo;

  public static final String JSON_PROPERTY_STATUS_REMARK = "statusRemark";
  private RestrictionsString statusRemark;

  public static final String JSON_PROPERTY_DEVICE_ALL_ID = "deviceAllId";
  private RestrictionsString deviceAllId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RestrictionsString status;

  public StorageBasePhysicalPortsPowerEntityRestriction() {
  }

  public StorageBasePhysicalPortsPowerEntityRestriction socketNameSpc(RestrictionsString socketNameSpc) {
    
    this.socketNameSpc = socketNameSpc;
    return this;
  }

   /**
   * Get socketNameSpc
   * @return socketNameSpc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOCKET_NAME_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSocketNameSpc() {
    return socketNameSpc;
  }


  @JsonProperty(JSON_PROPERTY_SOCKET_NAME_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocketNameSpc(RestrictionsString socketNameSpc) {
    this.socketNameSpc = socketNameSpc;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction borderColor(RestrictionsString borderColor) {
    
    this.borderColor = borderColor;
    return this;
  }

   /**
   * Get borderColor
   * @return borderColor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BORDER_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getBorderColor() {
    return borderColor;
  }


  @JsonProperty(JSON_PROPERTY_BORDER_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorderColor(RestrictionsString borderColor) {
    this.borderColor = borderColor;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction deviceAllElid(RestrictionsString deviceAllElid) {
    
    this.deviceAllElid = deviceAllElid;
    return this;
  }

   /**
   * Get deviceAllElid
   * @return deviceAllElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_ALL_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDeviceAllElid() {
    return deviceAllElid;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_ALL_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceAllElid(RestrictionsString deviceAllElid) {
    this.deviceAllElid = deviceAllElid;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction socketName(RestrictionsString socketName) {
    
    this.socketName = socketName;
    return this;
  }

   /**
   * Get socketName
   * @return socketName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSocketName() {
    return socketName;
  }


  @JsonProperty(JSON_PROPERTY_SOCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocketName(RestrictionsString socketName) {
    this.socketName = socketName;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction portIdentifier(RestrictionsString portIdentifier) {
    
    this.portIdentifier = portIdentifier;
    return this;
  }

   /**
   * Get portIdentifier
   * @return portIdentifier
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPortIdentifier() {
    return portIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_PORT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortIdentifier(RestrictionsString portIdentifier) {
    this.portIdentifier = portIdentifier;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction wireType(RestrictionsString wireType) {
    
    this.wireType = wireType;
    return this;
  }

   /**
   * Get wireType
   * @return wireType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIRE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getWireType() {
    return wireType;
  }


  @JsonProperty(JSON_PROPERTY_WIRE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWireType(RestrictionsString wireType) {
    this.wireType = wireType;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction portCategory(RestrictionsString portCategory) {
    
    this.portCategory = portCategory;
    return this;
  }

   /**
   * Get portCategory
   * @return portCategory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPortCategory() {
    return portCategory;
  }


  @JsonProperty(JSON_PROPERTY_PORT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortCategory(RestrictionsString portCategory) {
    this.portCategory = portCategory;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction socketNo(RestrictionsNumeric socketNo) {
    
    this.socketNo = socketNo;
    return this;
  }

   /**
   * Get socketNo
   * @return socketNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOCKET_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getSocketNo() {
    return socketNo;
  }


  @JsonProperty(JSON_PROPERTY_SOCKET_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocketNo(RestrictionsNumeric socketNo) {
    this.socketNo = socketNo;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction medium(RestrictionsString medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * Get medium
   * @return medium
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getMedium() {
    return medium;
  }


  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedium(RestrictionsString medium) {
    this.medium = medium;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction connector(RestrictionsString connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * Get connector
   * @return connector
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnector(RestrictionsString connector) {
    this.connector = connector;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction socketSide(RestrictionsString socketSide) {
    
    this.socketSide = socketSide;
    return this;
  }

   /**
   * Get socketSide
   * @return socketSide
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOCKET_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSocketSide() {
    return socketSide;
  }


  @JsonProperty(JSON_PROPERTY_SOCKET_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocketSide(RestrictionsString socketSide) {
    this.socketSide = socketSide;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction socketSubNo(RestrictionsNumeric socketSubNo) {
    
    this.socketSubNo = socketSubNo;
    return this;
  }

   /**
   * Get socketSubNo
   * @return socketSubNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOCKET_SUB_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getSocketSubNo() {
    return socketSubNo;
  }


  @JsonProperty(JSON_PROPERTY_SOCKET_SUB_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocketSubNo(RestrictionsNumeric socketSubNo) {
    this.socketSubNo = socketSubNo;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction statusRemark(RestrictionsString statusRemark) {
    
    this.statusRemark = statusRemark;
    return this;
  }

   /**
   * Get statusRemark
   * @return statusRemark
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getStatusRemark() {
    return statusRemark;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusRemark(RestrictionsString statusRemark) {
    this.statusRemark = statusRemark;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction deviceAllId(RestrictionsString deviceAllId) {
    
    this.deviceAllId = deviceAllId;
    return this;
  }

   /**
   * Get deviceAllId
   * @return deviceAllId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_ALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDeviceAllId() {
    return deviceAllId;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_ALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceAllId(RestrictionsString deviceAllId) {
    this.deviceAllId = deviceAllId;
  }


  public StorageBasePhysicalPortsPowerEntityRestriction status(RestrictionsString status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(RestrictionsString status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageBasePhysicalPortsPowerEntityRestriction storageBasePhysicalPortsPowerEntityRestriction = (StorageBasePhysicalPortsPowerEntityRestriction) o;
    return Objects.equals(this.socketNameSpc, storageBasePhysicalPortsPowerEntityRestriction.socketNameSpc) &&
        Objects.equals(this.borderColor, storageBasePhysicalPortsPowerEntityRestriction.borderColor) &&
        Objects.equals(this.deviceAllElid, storageBasePhysicalPortsPowerEntityRestriction.deviceAllElid) &&
        Objects.equals(this.socketName, storageBasePhysicalPortsPowerEntityRestriction.socketName) &&
        Objects.equals(this.portIdentifier, storageBasePhysicalPortsPowerEntityRestriction.portIdentifier) &&
        Objects.equals(this.wireType, storageBasePhysicalPortsPowerEntityRestriction.wireType) &&
        Objects.equals(this.portCategory, storageBasePhysicalPortsPowerEntityRestriction.portCategory) &&
        Objects.equals(this.socketNo, storageBasePhysicalPortsPowerEntityRestriction.socketNo) &&
        Objects.equals(this.medium, storageBasePhysicalPortsPowerEntityRestriction.medium) &&
        Objects.equals(this.connector, storageBasePhysicalPortsPowerEntityRestriction.connector) &&
        Objects.equals(this.socketSide, storageBasePhysicalPortsPowerEntityRestriction.socketSide) &&
        Objects.equals(this.socketSubNo, storageBasePhysicalPortsPowerEntityRestriction.socketSubNo) &&
        Objects.equals(this.statusRemark, storageBasePhysicalPortsPowerEntityRestriction.statusRemark) &&
        Objects.equals(this.deviceAllId, storageBasePhysicalPortsPowerEntityRestriction.deviceAllId) &&
        Objects.equals(this.status, storageBasePhysicalPortsPowerEntityRestriction.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socketNameSpc, borderColor, deviceAllElid, socketName, portIdentifier, wireType, portCategory, socketNo, medium, connector, socketSide, socketSubNo, statusRemark, deviceAllId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageBasePhysicalPortsPowerEntityRestriction {\n");
    sb.append("    socketNameSpc: ").append(toIndentedString(socketNameSpc)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    deviceAllElid: ").append(toIndentedString(deviceAllElid)).append("\n");
    sb.append("    socketName: ").append(toIndentedString(socketName)).append("\n");
    sb.append("    portIdentifier: ").append(toIndentedString(portIdentifier)).append("\n");
    sb.append("    wireType: ").append(toIndentedString(wireType)).append("\n");
    sb.append("    portCategory: ").append(toIndentedString(portCategory)).append("\n");
    sb.append("    socketNo: ").append(toIndentedString(socketNo)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    socketSide: ").append(toIndentedString(socketSide)).append("\n");
    sb.append("    socketSubNo: ").append(toIndentedString(socketSubNo)).append("\n");
    sb.append("    statusRemark: ").append(toIndentedString(statusRemark)).append("\n");
    sb.append("    deviceAllId: ").append(toIndentedString(deviceAllId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
