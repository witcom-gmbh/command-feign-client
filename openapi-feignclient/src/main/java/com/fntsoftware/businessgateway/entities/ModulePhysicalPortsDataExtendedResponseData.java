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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ModulePhysicalPortsDataExtendedResponseData
 */
@JsonPropertyOrder({
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_SOCKET_NAME_SPC,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_BORDER_COLOR,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_WWN_ADDRESS,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_NOTES,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_PORT_STATE,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_SOCKET_NAME,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_WIRE_TYPE,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_MEDIUM,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_VLAN,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_SOCKET_SUB_NO,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_PORT_SPEED,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_STATUS_REMARK,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_VLAN_TYPE,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_DEVICE_ALL_ELID,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_PORT_IDENTIFIER,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_VLAN_ID,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_PORT_NETWORK_CATEGORY,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_SOCKET_NO,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_VTP_DOMAIN,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_CONNECTOR,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_PORT_DUPLEX,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_SOCKET_SIDE,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_DEVICE_ALL_ID,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_COAX_NET,
  ModulePhysicalPortsDataExtendedResponseData.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ModulePhysicalPortsDataExtendedResponseData {
  public static final String JSON_PROPERTY_SOCKET_NAME_SPC = "socketNameSpc";
  private String socketNameSpc;

  public static final String JSON_PROPERTY_BORDER_COLOR = "borderColor";
  private String borderColor;

  public static final String JSON_PROPERTY_WWN_ADDRESS = "wwnAddress";
  private String wwnAddress;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_PORT_STATE = "portState";
  private String portState;

  public static final String JSON_PROPERTY_SOCKET_NAME = "socketName";
  private String socketName;

  public static final String JSON_PROPERTY_WIRE_TYPE = "wireType";
  private String wireType;

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  private String medium;

  public static final String JSON_PROPERTY_VLAN = "vlan";
  private String vlan;

  public static final String JSON_PROPERTY_SOCKET_SUB_NO = "socketSubNo";
  private BigDecimal socketSubNo;

  public static final String JSON_PROPERTY_PORT_SPEED = "portSpeed";
  private String portSpeed;

  public static final String JSON_PROPERTY_STATUS_REMARK = "statusRemark";
  private String statusRemark;

  public static final String JSON_PROPERTY_VLAN_TYPE = "vlanType";
  private String vlanType;

  public static final String JSON_PROPERTY_DEVICE_ALL_ELID = "deviceAllElid";
  private String deviceAllElid;

  public static final String JSON_PROPERTY_PORT_IDENTIFIER = "portIdentifier";
  private String portIdentifier;

  public static final String JSON_PROPERTY_VLAN_ID = "vlanId";
  private BigDecimal vlanId;

  public static final String JSON_PROPERTY_PORT_NETWORK_CATEGORY = "portNetworkCategory";
  private String portNetworkCategory;

  public static final String JSON_PROPERTY_SOCKET_NO = "socketNo";
  private BigDecimal socketNo;

  public static final String JSON_PROPERTY_VTP_DOMAIN = "vtpDomain";
  private String vtpDomain;

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private String connector;

  public static final String JSON_PROPERTY_PORT_DUPLEX = "portDuplex";
  private String portDuplex;

  public static final String JSON_PROPERTY_SOCKET_SIDE = "socketSide";
  private String socketSide;

  public static final String JSON_PROPERTY_DEVICE_ALL_ID = "deviceAllId";
  private String deviceAllId;

  public static final String JSON_PROPERTY_COAX_NET = "coaxNet";
  private String coaxNet;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public ModulePhysicalPortsDataExtendedResponseData() {
  }

  public ModulePhysicalPortsDataExtendedResponseData socketNameSpc(String socketNameSpc) {
    
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


  public ModulePhysicalPortsDataExtendedResponseData borderColor(String borderColor) {
    
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


  public ModulePhysicalPortsDataExtendedResponseData wwnAddress(String wwnAddress) {
    
    this.wwnAddress = wwnAddress;
    return this;
  }

   /**
   * Get wwnAddress
   * @return wwnAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WWN_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWwnAddress() {
    return wwnAddress;
  }


  @JsonProperty(JSON_PROPERTY_WWN_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWwnAddress(String wwnAddress) {
    this.wwnAddress = wwnAddress;
  }


  public ModulePhysicalPortsDataExtendedResponseData notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotes() {
    return notes;
  }


  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotes(String notes) {
    this.notes = notes;
  }


  public ModulePhysicalPortsDataExtendedResponseData portState(String portState) {
    
    this.portState = portState;
    return this;
  }

   /**
   * Get portState
   * @return portState
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortState() {
    return portState;
  }


  @JsonProperty(JSON_PROPERTY_PORT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortState(String portState) {
    this.portState = portState;
  }


  public ModulePhysicalPortsDataExtendedResponseData socketName(String socketName) {
    
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


  public ModulePhysicalPortsDataExtendedResponseData wireType(String wireType) {
    
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


  public ModulePhysicalPortsDataExtendedResponseData medium(String medium) {
    
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


  public ModulePhysicalPortsDataExtendedResponseData vlan(String vlan) {
    
    this.vlan = vlan;
    return this;
  }

   /**
   * Get vlan
   * @return vlan
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVlan() {
    return vlan;
  }


  @JsonProperty(JSON_PROPERTY_VLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlan(String vlan) {
    this.vlan = vlan;
  }


  public ModulePhysicalPortsDataExtendedResponseData socketSubNo(BigDecimal socketSubNo) {
    
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


  public ModulePhysicalPortsDataExtendedResponseData portSpeed(String portSpeed) {
    
    this.portSpeed = portSpeed;
    return this;
  }

   /**
   * Get portSpeed
   * @return portSpeed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortSpeed() {
    return portSpeed;
  }


  @JsonProperty(JSON_PROPERTY_PORT_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortSpeed(String portSpeed) {
    this.portSpeed = portSpeed;
  }


  public ModulePhysicalPortsDataExtendedResponseData statusRemark(String statusRemark) {
    
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


  public ModulePhysicalPortsDataExtendedResponseData vlanType(String vlanType) {
    
    this.vlanType = vlanType;
    return this;
  }

   /**
   * Get vlanType
   * @return vlanType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVlanType() {
    return vlanType;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanType(String vlanType) {
    this.vlanType = vlanType;
  }


  public ModulePhysicalPortsDataExtendedResponseData deviceAllElid(String deviceAllElid) {
    
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


  public ModulePhysicalPortsDataExtendedResponseData portIdentifier(String portIdentifier) {
    
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


  public ModulePhysicalPortsDataExtendedResponseData vlanId(BigDecimal vlanId) {
    
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getVlanId() {
    return vlanId;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanId(BigDecimal vlanId) {
    this.vlanId = vlanId;
  }


  public ModulePhysicalPortsDataExtendedResponseData portNetworkCategory(String portNetworkCategory) {
    
    this.portNetworkCategory = portNetworkCategory;
    return this;
  }

   /**
   * Get portNetworkCategory
   * @return portNetworkCategory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_NETWORK_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortNetworkCategory() {
    return portNetworkCategory;
  }


  @JsonProperty(JSON_PROPERTY_PORT_NETWORK_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortNetworkCategory(String portNetworkCategory) {
    this.portNetworkCategory = portNetworkCategory;
  }


  public ModulePhysicalPortsDataExtendedResponseData socketNo(BigDecimal socketNo) {
    
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


  public ModulePhysicalPortsDataExtendedResponseData vtpDomain(String vtpDomain) {
    
    this.vtpDomain = vtpDomain;
    return this;
  }

   /**
   * Get vtpDomain
   * @return vtpDomain
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VTP_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVtpDomain() {
    return vtpDomain;
  }


  @JsonProperty(JSON_PROPERTY_VTP_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVtpDomain(String vtpDomain) {
    this.vtpDomain = vtpDomain;
  }


  public ModulePhysicalPortsDataExtendedResponseData connector(String connector) {
    
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


  public ModulePhysicalPortsDataExtendedResponseData portDuplex(String portDuplex) {
    
    this.portDuplex = portDuplex;
    return this;
  }

   /**
   * Get portDuplex
   * @return portDuplex
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_DUPLEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortDuplex() {
    return portDuplex;
  }


  @JsonProperty(JSON_PROPERTY_PORT_DUPLEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortDuplex(String portDuplex) {
    this.portDuplex = portDuplex;
  }


  public ModulePhysicalPortsDataExtendedResponseData socketSide(String socketSide) {
    
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


  public ModulePhysicalPortsDataExtendedResponseData deviceAllId(String deviceAllId) {
    
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


  public ModulePhysicalPortsDataExtendedResponseData coaxNet(String coaxNet) {
    
    this.coaxNet = coaxNet;
    return this;
  }

   /**
   * Get coaxNet
   * @return coaxNet
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COAX_NET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoaxNet() {
    return coaxNet;
  }


  @JsonProperty(JSON_PROPERTY_COAX_NET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoaxNet(String coaxNet) {
    this.coaxNet = coaxNet;
  }


  public ModulePhysicalPortsDataExtendedResponseData status(String status) {
    
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
    ModulePhysicalPortsDataExtendedResponseData modulePhysicalPortsDataExtendedResponseData = (ModulePhysicalPortsDataExtendedResponseData) o;
    return Objects.equals(this.socketNameSpc, modulePhysicalPortsDataExtendedResponseData.socketNameSpc) &&
        Objects.equals(this.borderColor, modulePhysicalPortsDataExtendedResponseData.borderColor) &&
        Objects.equals(this.wwnAddress, modulePhysicalPortsDataExtendedResponseData.wwnAddress) &&
        Objects.equals(this.notes, modulePhysicalPortsDataExtendedResponseData.notes) &&
        Objects.equals(this.portState, modulePhysicalPortsDataExtendedResponseData.portState) &&
        Objects.equals(this.socketName, modulePhysicalPortsDataExtendedResponseData.socketName) &&
        Objects.equals(this.wireType, modulePhysicalPortsDataExtendedResponseData.wireType) &&
        Objects.equals(this.medium, modulePhysicalPortsDataExtendedResponseData.medium) &&
        Objects.equals(this.vlan, modulePhysicalPortsDataExtendedResponseData.vlan) &&
        Objects.equals(this.socketSubNo, modulePhysicalPortsDataExtendedResponseData.socketSubNo) &&
        Objects.equals(this.portSpeed, modulePhysicalPortsDataExtendedResponseData.portSpeed) &&
        Objects.equals(this.statusRemark, modulePhysicalPortsDataExtendedResponseData.statusRemark) &&
        Objects.equals(this.vlanType, modulePhysicalPortsDataExtendedResponseData.vlanType) &&
        Objects.equals(this.deviceAllElid, modulePhysicalPortsDataExtendedResponseData.deviceAllElid) &&
        Objects.equals(this.portIdentifier, modulePhysicalPortsDataExtendedResponseData.portIdentifier) &&
        Objects.equals(this.vlanId, modulePhysicalPortsDataExtendedResponseData.vlanId) &&
        Objects.equals(this.portNetworkCategory, modulePhysicalPortsDataExtendedResponseData.portNetworkCategory) &&
        Objects.equals(this.socketNo, modulePhysicalPortsDataExtendedResponseData.socketNo) &&
        Objects.equals(this.vtpDomain, modulePhysicalPortsDataExtendedResponseData.vtpDomain) &&
        Objects.equals(this.connector, modulePhysicalPortsDataExtendedResponseData.connector) &&
        Objects.equals(this.portDuplex, modulePhysicalPortsDataExtendedResponseData.portDuplex) &&
        Objects.equals(this.socketSide, modulePhysicalPortsDataExtendedResponseData.socketSide) &&
        Objects.equals(this.deviceAllId, modulePhysicalPortsDataExtendedResponseData.deviceAllId) &&
        Objects.equals(this.coaxNet, modulePhysicalPortsDataExtendedResponseData.coaxNet) &&
        Objects.equals(this.status, modulePhysicalPortsDataExtendedResponseData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socketNameSpc, borderColor, wwnAddress, notes, portState, socketName, wireType, medium, vlan, socketSubNo, portSpeed, statusRemark, vlanType, deviceAllElid, portIdentifier, vlanId, portNetworkCategory, socketNo, vtpDomain, connector, portDuplex, socketSide, deviceAllId, coaxNet, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModulePhysicalPortsDataExtendedResponseData {\n");
    sb.append("    socketNameSpc: ").append(toIndentedString(socketNameSpc)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    wwnAddress: ").append(toIndentedString(wwnAddress)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    portState: ").append(toIndentedString(portState)).append("\n");
    sb.append("    socketName: ").append(toIndentedString(socketName)).append("\n");
    sb.append("    wireType: ").append(toIndentedString(wireType)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
    sb.append("    socketSubNo: ").append(toIndentedString(socketSubNo)).append("\n");
    sb.append("    portSpeed: ").append(toIndentedString(portSpeed)).append("\n");
    sb.append("    statusRemark: ").append(toIndentedString(statusRemark)).append("\n");
    sb.append("    vlanType: ").append(toIndentedString(vlanType)).append("\n");
    sb.append("    deviceAllElid: ").append(toIndentedString(deviceAllElid)).append("\n");
    sb.append("    portIdentifier: ").append(toIndentedString(portIdentifier)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    portNetworkCategory: ").append(toIndentedString(portNetworkCategory)).append("\n");
    sb.append("    socketNo: ").append(toIndentedString(socketNo)).append("\n");
    sb.append("    vtpDomain: ").append(toIndentedString(vtpDomain)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    portDuplex: ").append(toIndentedString(portDuplex)).append("\n");
    sb.append("    socketSide: ").append(toIndentedString(socketSide)).append("\n");
    sb.append("    deviceAllId: ").append(toIndentedString(deviceAllId)).append("\n");
    sb.append("    coaxNet: ").append(toIndentedString(coaxNet)).append("\n");
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
