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
import com.fntsoftware.businessgateway.entities.RestrictionsBoolean;
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceSignalmgmtLanQueryRestriction
 */
@JsonPropertyOrder({
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_SW_REVISION,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_DETAIL_GROUP_ELID,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_NET_SPEED,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_NET_ID,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_NET_NAME,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_SEQ_NUM,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_TRANSMISSION_MODE,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_IP_ADDRESS,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_HOST_ID,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_REMARK,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_ELID,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_NUMBER_CODE_ELID,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_HOSTNAME,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_MAIN_NO,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_TYPE_ELID,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_SERVICE_STATUS,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_STATUS_REMARK,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_VISIBLE_ID,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_ID,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_SUBNETMASK,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_DHCP,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_FIRST,
  ServiceSignalmgmtLanQueryRestriction.JSON_PROPERTY_GATEWAY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class ServiceSignalmgmtLanQueryRestriction {
  public static final String JSON_PROPERTY_SW_REVISION = "swRevision";
  private RestrictionsString swRevision;

  public static final String JSON_PROPERTY_DETAIL_GROUP_ELID = "detailGroupElid";
  private RestrictionsString detailGroupElid;

  public static final String JSON_PROPERTY_NET_SPEED = "netSpeed";
  private RestrictionsString netSpeed;

  public static final String JSON_PROPERTY_NET_ID = "netId";
  private RestrictionsString netId;

  public static final String JSON_PROPERTY_NET_NAME = "netName";
  private RestrictionsString netName;

  public static final String JSON_PROPERTY_SEQ_NUM = "seqNum";
  private RestrictionsString seqNum;

  public static final String JSON_PROPERTY_TRANSMISSION_MODE = "transmissionMode";
  private RestrictionsString transmissionMode;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private RestrictionsString ipAddress;

  public static final String JSON_PROPERTY_HOST_ID = "hostId";
  private RestrictionsString hostId;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_NUMBER_CODE_ELID = "numberCodeElid";
  private RestrictionsString numberCodeElid;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private RestrictionsString hostname;

  public static final String JSON_PROPERTY_MAIN_NO = "mainNo";
  private RestrictionsBoolean mainNo;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private RestrictionsString typeElid;

  public static final String JSON_PROPERTY_SERVICE_STATUS = "serviceStatus";
  private RestrictionsString serviceStatus;

  public static final String JSON_PROPERTY_STATUS_REMARK = "statusRemark";
  private RestrictionsString statusRemark;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_SUBNETMASK = "subnetmask";
  private RestrictionsString subnetmask;

  public static final String JSON_PROPERTY_DHCP = "dhcp";
  private RestrictionsBoolean dhcp;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public static final String JSON_PROPERTY_GATEWAY = "gateway";
  private RestrictionsString gateway;

  public ServiceSignalmgmtLanQueryRestriction() {
  }

  public ServiceSignalmgmtLanQueryRestriction swRevision(RestrictionsString swRevision) {
    
    this.swRevision = swRevision;
    return this;
  }

   /**
   * Get swRevision
   * @return swRevision
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SW_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSwRevision() {
    return swRevision;
  }


  @JsonProperty(JSON_PROPERTY_SW_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwRevision(RestrictionsString swRevision) {
    this.swRevision = swRevision;
  }


  public ServiceSignalmgmtLanQueryRestriction detailGroupElid(RestrictionsString detailGroupElid) {
    
    this.detailGroupElid = detailGroupElid;
    return this;
  }

   /**
   * Get detailGroupElid
   * @return detailGroupElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAIL_GROUP_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDetailGroupElid() {
    return detailGroupElid;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL_GROUP_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetailGroupElid(RestrictionsString detailGroupElid) {
    this.detailGroupElid = detailGroupElid;
  }


  public ServiceSignalmgmtLanQueryRestriction netSpeed(RestrictionsString netSpeed) {
    
    this.netSpeed = netSpeed;
    return this;
  }

   /**
   * Get netSpeed
   * @return netSpeed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NET_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getNetSpeed() {
    return netSpeed;
  }


  @JsonProperty(JSON_PROPERTY_NET_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetSpeed(RestrictionsString netSpeed) {
    this.netSpeed = netSpeed;
  }


  public ServiceSignalmgmtLanQueryRestriction netId(RestrictionsString netId) {
    
    this.netId = netId;
    return this;
  }

   /**
   * Get netId
   * @return netId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getNetId() {
    return netId;
  }


  @JsonProperty(JSON_PROPERTY_NET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetId(RestrictionsString netId) {
    this.netId = netId;
  }


  public ServiceSignalmgmtLanQueryRestriction netName(RestrictionsString netName) {
    
    this.netName = netName;
    return this;
  }

   /**
   * Get netName
   * @return netName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getNetName() {
    return netName;
  }


  @JsonProperty(JSON_PROPERTY_NET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetName(RestrictionsString netName) {
    this.netName = netName;
  }


  public ServiceSignalmgmtLanQueryRestriction seqNum(RestrictionsString seqNum) {
    
    this.seqNum = seqNum;
    return this;
  }

   /**
   * Get seqNum
   * @return seqNum
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEQ_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSeqNum() {
    return seqNum;
  }


  @JsonProperty(JSON_PROPERTY_SEQ_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeqNum(RestrictionsString seqNum) {
    this.seqNum = seqNum;
  }


  public ServiceSignalmgmtLanQueryRestriction transmissionMode(RestrictionsString transmissionMode) {
    
    this.transmissionMode = transmissionMode;
    return this;
  }

   /**
   * Get transmissionMode
   * @return transmissionMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSMISSION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getTransmissionMode() {
    return transmissionMode;
  }


  @JsonProperty(JSON_PROPERTY_TRANSMISSION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransmissionMode(RestrictionsString transmissionMode) {
    this.transmissionMode = transmissionMode;
  }


  public ServiceSignalmgmtLanQueryRestriction ipAddress(RestrictionsString ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(RestrictionsString ipAddress) {
    this.ipAddress = ipAddress;
  }


  public ServiceSignalmgmtLanQueryRestriction hostId(RestrictionsString hostId) {
    
    this.hostId = hostId;
    return this;
  }

   /**
   * Get hostId
   * @return hostId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getHostId() {
    return hostId;
  }


  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostId(RestrictionsString hostId) {
    this.hostId = hostId;
  }


  public ServiceSignalmgmtLanQueryRestriction remark(RestrictionsString remark) {
    
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


  public ServiceSignalmgmtLanQueryRestriction elid(RestrictionsString elid) {
    
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


  public ServiceSignalmgmtLanQueryRestriction numberCodeElid(RestrictionsString numberCodeElid) {
    
    this.numberCodeElid = numberCodeElid;
    return this;
  }

   /**
   * Get numberCodeElid
   * @return numberCodeElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_CODE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getNumberCodeElid() {
    return numberCodeElid;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_CODE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberCodeElid(RestrictionsString numberCodeElid) {
    this.numberCodeElid = numberCodeElid;
  }


  public ServiceSignalmgmtLanQueryRestriction hostname(RestrictionsString hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getHostname() {
    return hostname;
  }


  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostname(RestrictionsString hostname) {
    this.hostname = hostname;
  }


  public ServiceSignalmgmtLanQueryRestriction mainNo(RestrictionsBoolean mainNo) {
    
    this.mainNo = mainNo;
    return this;
  }

   /**
   * Get mainNo
   * @return mainNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIN_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getMainNo() {
    return mainNo;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainNo(RestrictionsBoolean mainNo) {
    this.mainNo = mainNo;
  }


  public ServiceSignalmgmtLanQueryRestriction typeElid(RestrictionsString typeElid) {
    
    this.typeElid = typeElid;
    return this;
  }

   /**
   * Get typeElid
   * @return typeElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getTypeElid() {
    return typeElid;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeElid(RestrictionsString typeElid) {
    this.typeElid = typeElid;
  }


  public ServiceSignalmgmtLanQueryRestriction serviceStatus(RestrictionsString serviceStatus) {
    
    this.serviceStatus = serviceStatus;
    return this;
  }

   /**
   * Get serviceStatus
   * @return serviceStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getServiceStatus() {
    return serviceStatus;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceStatus(RestrictionsString serviceStatus) {
    this.serviceStatus = serviceStatus;
  }


  public ServiceSignalmgmtLanQueryRestriction statusRemark(RestrictionsString statusRemark) {
    
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


  public ServiceSignalmgmtLanQueryRestriction visibleId(RestrictionsString visibleId) {
    
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


  public ServiceSignalmgmtLanQueryRestriction id(RestrictionsString id) {
    
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


  public ServiceSignalmgmtLanQueryRestriction subnetmask(RestrictionsString subnetmask) {
    
    this.subnetmask = subnetmask;
    return this;
  }

   /**
   * Get subnetmask
   * @return subnetmask
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBNETMASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSubnetmask() {
    return subnetmask;
  }


  @JsonProperty(JSON_PROPERTY_SUBNETMASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubnetmask(RestrictionsString subnetmask) {
    this.subnetmask = subnetmask;
  }


  public ServiceSignalmgmtLanQueryRestriction dhcp(RestrictionsBoolean dhcp) {
    
    this.dhcp = dhcp;
    return this;
  }

   /**
   * Get dhcp
   * @return dhcp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DHCP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getDhcp() {
    return dhcp;
  }


  @JsonProperty(JSON_PROPERTY_DHCP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDhcp(RestrictionsBoolean dhcp) {
    this.dhcp = dhcp;
  }


  public ServiceSignalmgmtLanQueryRestriction first(RestrictionsNumeric first) {
    
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


  public ServiceSignalmgmtLanQueryRestriction gateway(RestrictionsString gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GATEWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getGateway() {
    return gateway;
  }


  @JsonProperty(JSON_PROPERTY_GATEWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGateway(RestrictionsString gateway) {
    this.gateway = gateway;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSignalmgmtLanQueryRestriction serviceSignalmgmtLanQueryRestriction = (ServiceSignalmgmtLanQueryRestriction) o;
    return Objects.equals(this.swRevision, serviceSignalmgmtLanQueryRestriction.swRevision) &&
        Objects.equals(this.detailGroupElid, serviceSignalmgmtLanQueryRestriction.detailGroupElid) &&
        Objects.equals(this.netSpeed, serviceSignalmgmtLanQueryRestriction.netSpeed) &&
        Objects.equals(this.netId, serviceSignalmgmtLanQueryRestriction.netId) &&
        Objects.equals(this.netName, serviceSignalmgmtLanQueryRestriction.netName) &&
        Objects.equals(this.seqNum, serviceSignalmgmtLanQueryRestriction.seqNum) &&
        Objects.equals(this.transmissionMode, serviceSignalmgmtLanQueryRestriction.transmissionMode) &&
        Objects.equals(this.ipAddress, serviceSignalmgmtLanQueryRestriction.ipAddress) &&
        Objects.equals(this.hostId, serviceSignalmgmtLanQueryRestriction.hostId) &&
        Objects.equals(this.remark, serviceSignalmgmtLanQueryRestriction.remark) &&
        Objects.equals(this.elid, serviceSignalmgmtLanQueryRestriction.elid) &&
        Objects.equals(this.numberCodeElid, serviceSignalmgmtLanQueryRestriction.numberCodeElid) &&
        Objects.equals(this.hostname, serviceSignalmgmtLanQueryRestriction.hostname) &&
        Objects.equals(this.mainNo, serviceSignalmgmtLanQueryRestriction.mainNo) &&
        Objects.equals(this.typeElid, serviceSignalmgmtLanQueryRestriction.typeElid) &&
        Objects.equals(this.serviceStatus, serviceSignalmgmtLanQueryRestriction.serviceStatus) &&
        Objects.equals(this.statusRemark, serviceSignalmgmtLanQueryRestriction.statusRemark) &&
        Objects.equals(this.visibleId, serviceSignalmgmtLanQueryRestriction.visibleId) &&
        Objects.equals(this.id, serviceSignalmgmtLanQueryRestriction.id) &&
        Objects.equals(this.subnetmask, serviceSignalmgmtLanQueryRestriction.subnetmask) &&
        Objects.equals(this.dhcp, serviceSignalmgmtLanQueryRestriction.dhcp) &&
        Objects.equals(this.first, serviceSignalmgmtLanQueryRestriction.first) &&
        Objects.equals(this.gateway, serviceSignalmgmtLanQueryRestriction.gateway);
  }

  @Override
  public int hashCode() {
    return Objects.hash(swRevision, detailGroupElid, netSpeed, netId, netName, seqNum, transmissionMode, ipAddress, hostId, remark, elid, numberCodeElid, hostname, mainNo, typeElid, serviceStatus, statusRemark, visibleId, id, subnetmask, dhcp, first, gateway);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSignalmgmtLanQueryRestriction {\n");
    sb.append("    swRevision: ").append(toIndentedString(swRevision)).append("\n");
    sb.append("    detailGroupElid: ").append(toIndentedString(detailGroupElid)).append("\n");
    sb.append("    netSpeed: ").append(toIndentedString(netSpeed)).append("\n");
    sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
    sb.append("    netName: ").append(toIndentedString(netName)).append("\n");
    sb.append("    seqNum: ").append(toIndentedString(seqNum)).append("\n");
    sb.append("    transmissionMode: ").append(toIndentedString(transmissionMode)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    numberCodeElid: ").append(toIndentedString(numberCodeElid)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    mainNo: ").append(toIndentedString(mainNo)).append("\n");
    sb.append("    typeElid: ").append(toIndentedString(typeElid)).append("\n");
    sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
    sb.append("    statusRemark: ").append(toIndentedString(statusRemark)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subnetmask: ").append(toIndentedString(subnetmask)).append("\n");
    sb.append("    dhcp: ").append(toIndentedString(dhcp)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
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
