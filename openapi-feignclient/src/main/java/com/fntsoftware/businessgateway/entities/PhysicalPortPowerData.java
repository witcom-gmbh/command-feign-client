/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240131102312
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
 * PhysicalPortPowerData
 */
@JsonPropertyOrder({
  PhysicalPortPowerData.JSON_PROPERTY_SOCKET_NAME_SPC,
  PhysicalPortPowerData.JSON_PROPERTY_BORDER_COLOR,
  PhysicalPortPowerData.JSON_PROPERTY_DEVICE_ALL_ELID,
  PhysicalPortPowerData.JSON_PROPERTY_SOCKET_NAME,
  PhysicalPortPowerData.JSON_PROPERTY_PORT_IDENTIFIER,
  PhysicalPortPowerData.JSON_PROPERTY_WIRE_TYPE,
  PhysicalPortPowerData.JSON_PROPERTY_PORT_CATEGORY,
  PhysicalPortPowerData.JSON_PROPERTY_SOCKET_NO,
  PhysicalPortPowerData.JSON_PROPERTY_MEDIUM,
  PhysicalPortPowerData.JSON_PROPERTY_CONNECTOR,
  PhysicalPortPowerData.JSON_PROPERTY_SOCKET_SIDE,
  PhysicalPortPowerData.JSON_PROPERTY_SOCKET_SUB_NO,
  PhysicalPortPowerData.JSON_PROPERTY_STATUS_REMARK,
  PhysicalPortPowerData.JSON_PROPERTY_DEVICE_ALL_ID,
  PhysicalPortPowerData.JSON_PROPERTY_STATUS
})
@JsonTypeName("physicalPortPowerData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:00:24.721128812Z[Etc/UTC]")
public class PhysicalPortPowerData {
  public static final String JSON_PROPERTY_SOCKET_NAME_SPC = "socketNameSpc";
  private String socketNameSpc;

  public static final String JSON_PROPERTY_BORDER_COLOR = "borderColor";
  private String borderColor;

  public static final String JSON_PROPERTY_DEVICE_ALL_ELID = "deviceAllElid";
  private String deviceAllElid;

  public static final String JSON_PROPERTY_SOCKET_NAME = "socketName";
  private String socketName;

  public static final String JSON_PROPERTY_PORT_IDENTIFIER = "portIdentifier";
  private String portIdentifier;

  public static final String JSON_PROPERTY_WIRE_TYPE = "wireType";
  private String wireType;

  public static final String JSON_PROPERTY_PORT_CATEGORY = "portCategory";
  private String portCategory;

  public static final String JSON_PROPERTY_SOCKET_NO = "socketNo";
  private BigDecimal socketNo;

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  private String medium;

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private String connector;

  public static final String JSON_PROPERTY_SOCKET_SIDE = "socketSide";
  private String socketSide;

  public static final String JSON_PROPERTY_SOCKET_SUB_NO = "socketSubNo";
  private BigDecimal socketSubNo;

  public static final String JSON_PROPERTY_STATUS_REMARK = "statusRemark";
  private String statusRemark;

  public static final String JSON_PROPERTY_DEVICE_ALL_ID = "deviceAllId";
  private String deviceAllId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public PhysicalPortPowerData() {
  }

  public PhysicalPortPowerData socketNameSpc(String socketNameSpc) {
    
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

  public String getSocketNameSpc() {
    return socketNameSpc;
  }


  @JsonProperty(JSON_PROPERTY_SOCKET_NAME_SPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocketNameSpc(String socketNameSpc) {
    this.socketNameSpc = socketNameSpc;
  }


  public PhysicalPortPowerData borderColor(String borderColor) {
    
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

  public String getBorderColor() {
    return borderColor;
  }


  @JsonProperty(JSON_PROPERTY_BORDER_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }


  public PhysicalPortPowerData deviceAllElid(String deviceAllElid) {
    
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

  public String getDeviceAllElid() {
    return deviceAllElid;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_ALL_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceAllElid(String deviceAllElid) {
    this.deviceAllElid = deviceAllElid;
  }


  public PhysicalPortPowerData socketName(String socketName) {
    
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

  public String getSocketName() {
    return socketName;
  }


  @JsonProperty(JSON_PROPERTY_SOCKET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocketName(String socketName) {
    this.socketName = socketName;
  }


  public PhysicalPortPowerData portIdentifier(String portIdentifier) {
    
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

  public String getPortIdentifier() {
    return portIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_PORT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortIdentifier(String portIdentifier) {
    this.portIdentifier = portIdentifier;
  }


  public PhysicalPortPowerData wireType(String wireType) {
    
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

  public String getWireType() {
    return wireType;
  }


  @JsonProperty(JSON_PROPERTY_WIRE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWireType(String wireType) {
    this.wireType = wireType;
  }


  public PhysicalPortPowerData portCategory(String portCategory) {
    
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

  public String getPortCategory() {
    return portCategory;
  }


  @JsonProperty(JSON_PROPERTY_PORT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortCategory(String portCategory) {
    this.portCategory = portCategory;
  }


  public PhysicalPortPowerData socketNo(BigDecimal socketNo) {
    
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

  public BigDecimal getSocketNo() {
    return socketNo;
  }


  @JsonProperty(JSON_PROPERTY_SOCKET_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocketNo(BigDecimal socketNo) {
    this.socketNo = socketNo;
  }


  public PhysicalPortPowerData medium(String medium) {
    
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

  public String getMedium() {
    return medium;
  }


  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedium(String medium) {
    this.medium = medium;
  }


  public PhysicalPortPowerData connector(String connector) {
    
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

  public String getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnector(String connector) {
    this.connector = connector;
  }


  public PhysicalPortPowerData socketSide(String socketSide) {
    
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

  public String getSocketSide() {
    return socketSide;
  }


  @JsonProperty(JSON_PROPERTY_SOCKET_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocketSide(String socketSide) {
    this.socketSide = socketSide;
  }


  public PhysicalPortPowerData socketSubNo(BigDecimal socketSubNo) {
    
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

  public BigDecimal getSocketSubNo() {
    return socketSubNo;
  }


  @JsonProperty(JSON_PROPERTY_SOCKET_SUB_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSocketSubNo(BigDecimal socketSubNo) {
    this.socketSubNo = socketSubNo;
  }


  public PhysicalPortPowerData statusRemark(String statusRemark) {
    
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

  public String getStatusRemark() {
    return statusRemark;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusRemark(String statusRemark) {
    this.statusRemark = statusRemark;
  }


  public PhysicalPortPowerData deviceAllId(String deviceAllId) {
    
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

  public String getDeviceAllId() {
    return deviceAllId;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_ALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceAllId(String deviceAllId) {
    this.deviceAllId = deviceAllId;
  }


  public PhysicalPortPowerData status(String status) {
    
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

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
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
    PhysicalPortPowerData physicalPortPowerData = (PhysicalPortPowerData) o;
    return Objects.equals(this.socketNameSpc, physicalPortPowerData.socketNameSpc) &&
        Objects.equals(this.borderColor, physicalPortPowerData.borderColor) &&
        Objects.equals(this.deviceAllElid, physicalPortPowerData.deviceAllElid) &&
        Objects.equals(this.socketName, physicalPortPowerData.socketName) &&
        Objects.equals(this.portIdentifier, physicalPortPowerData.portIdentifier) &&
        Objects.equals(this.wireType, physicalPortPowerData.wireType) &&
        Objects.equals(this.portCategory, physicalPortPowerData.portCategory) &&
        Objects.equals(this.socketNo, physicalPortPowerData.socketNo) &&
        Objects.equals(this.medium, physicalPortPowerData.medium) &&
        Objects.equals(this.connector, physicalPortPowerData.connector) &&
        Objects.equals(this.socketSide, physicalPortPowerData.socketSide) &&
        Objects.equals(this.socketSubNo, physicalPortPowerData.socketSubNo) &&
        Objects.equals(this.statusRemark, physicalPortPowerData.statusRemark) &&
        Objects.equals(this.deviceAllId, physicalPortPowerData.deviceAllId) &&
        Objects.equals(this.status, physicalPortPowerData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socketNameSpc, borderColor, deviceAllElid, socketName, portIdentifier, wireType, portCategory, socketNo, medium, connector, socketSide, socketSubNo, statusRemark, deviceAllId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalPortPowerData {\n");
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
