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
 * ServiceSignalmgmtLanQueryResponseData
 */
@JsonPropertyOrder({
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_SW_REVISION,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_DETAIL_GROUP_ELID,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_NET_SPEED,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_NET_ID,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_NET_NAME,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_SEQ_NUM,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_TRANSMISSION_MODE,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_IP_ADDRESS,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_HOST_ID,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_REMARK,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_ELID,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_NUMBER_CODE_ELID,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_HOSTNAME,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_MAIN_NO,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_TYPE_ELID,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_SERVICE_STATUS,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_STATUS_REMARK,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_VISIBLE_ID,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_ID,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_SUBNETMASK,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_DHCP,
  ServiceSignalmgmtLanQueryResponseData.JSON_PROPERTY_GATEWAY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class ServiceSignalmgmtLanQueryResponseData {
  public static final String JSON_PROPERTY_SW_REVISION = "swRevision";
  private String swRevision;

  public static final String JSON_PROPERTY_DETAIL_GROUP_ELID = "detailGroupElid";
  private String detailGroupElid;

  public static final String JSON_PROPERTY_NET_SPEED = "netSpeed";
  private String netSpeed;

  public static final String JSON_PROPERTY_NET_ID = "netId";
  private String netId;

  public static final String JSON_PROPERTY_NET_NAME = "netName";
  private String netName;

  public static final String JSON_PROPERTY_SEQ_NUM = "seqNum";
  private String seqNum;

  public static final String JSON_PROPERTY_TRANSMISSION_MODE = "transmissionMode";
  private String transmissionMode;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_HOST_ID = "hostId";
  private String hostId;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_NUMBER_CODE_ELID = "numberCodeElid";
  private String numberCodeElid;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_MAIN_NO = "mainNo";
  private Boolean mainNo;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private String typeElid;

  public static final String JSON_PROPERTY_SERVICE_STATUS = "serviceStatus";
  private String serviceStatus;

  public static final String JSON_PROPERTY_STATUS_REMARK = "statusRemark";
  private String statusRemark;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SUBNETMASK = "subnetmask";
  private String subnetmask;

  public static final String JSON_PROPERTY_DHCP = "dhcp";
  private Boolean dhcp;

  public static final String JSON_PROPERTY_GATEWAY = "gateway";
  private String gateway;

  public ServiceSignalmgmtLanQueryResponseData() {
  }

  public ServiceSignalmgmtLanQueryResponseData swRevision(String swRevision) {
    
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

  public String getSwRevision() {
    return swRevision;
  }


  @JsonProperty(JSON_PROPERTY_SW_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwRevision(String swRevision) {
    this.swRevision = swRevision;
  }


  public ServiceSignalmgmtLanQueryResponseData detailGroupElid(String detailGroupElid) {
    
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

  public String getDetailGroupElid() {
    return detailGroupElid;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL_GROUP_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetailGroupElid(String detailGroupElid) {
    this.detailGroupElid = detailGroupElid;
  }


  public ServiceSignalmgmtLanQueryResponseData netSpeed(String netSpeed) {
    
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

  public String getNetSpeed() {
    return netSpeed;
  }


  @JsonProperty(JSON_PROPERTY_NET_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetSpeed(String netSpeed) {
    this.netSpeed = netSpeed;
  }


  public ServiceSignalmgmtLanQueryResponseData netId(String netId) {
    
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

  public String getNetId() {
    return netId;
  }


  @JsonProperty(JSON_PROPERTY_NET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetId(String netId) {
    this.netId = netId;
  }


  public ServiceSignalmgmtLanQueryResponseData netName(String netName) {
    
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

  public String getNetName() {
    return netName;
  }


  @JsonProperty(JSON_PROPERTY_NET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetName(String netName) {
    this.netName = netName;
  }


  public ServiceSignalmgmtLanQueryResponseData seqNum(String seqNum) {
    
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

  public String getSeqNum() {
    return seqNum;
  }


  @JsonProperty(JSON_PROPERTY_SEQ_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeqNum(String seqNum) {
    this.seqNum = seqNum;
  }


  public ServiceSignalmgmtLanQueryResponseData transmissionMode(String transmissionMode) {
    
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

  public String getTransmissionMode() {
    return transmissionMode;
  }


  @JsonProperty(JSON_PROPERTY_TRANSMISSION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransmissionMode(String transmissionMode) {
    this.transmissionMode = transmissionMode;
  }


  public ServiceSignalmgmtLanQueryResponseData ipAddress(String ipAddress) {
    
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

  public String getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public ServiceSignalmgmtLanQueryResponseData hostId(String hostId) {
    
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

  public String getHostId() {
    return hostId;
  }


  @JsonProperty(JSON_PROPERTY_HOST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostId(String hostId) {
    this.hostId = hostId;
  }


  public ServiceSignalmgmtLanQueryResponseData remark(String remark) {
    
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

  public String getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(String remark) {
    this.remark = remark;
  }


  public ServiceSignalmgmtLanQueryResponseData elid(String elid) {
    
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

  public String getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(String elid) {
    this.elid = elid;
  }


  public ServiceSignalmgmtLanQueryResponseData numberCodeElid(String numberCodeElid) {
    
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

  public String getNumberCodeElid() {
    return numberCodeElid;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_CODE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberCodeElid(String numberCodeElid) {
    this.numberCodeElid = numberCodeElid;
  }


  public ServiceSignalmgmtLanQueryResponseData hostname(String hostname) {
    
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

  public String getHostname() {
    return hostname;
  }


  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public ServiceSignalmgmtLanQueryResponseData mainNo(Boolean mainNo) {
    
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

  public Boolean getMainNo() {
    return mainNo;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainNo(Boolean mainNo) {
    this.mainNo = mainNo;
  }


  public ServiceSignalmgmtLanQueryResponseData typeElid(String typeElid) {
    
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

  public String getTypeElid() {
    return typeElid;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeElid(String typeElid) {
    this.typeElid = typeElid;
  }


  public ServiceSignalmgmtLanQueryResponseData serviceStatus(String serviceStatus) {
    
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

  public String getServiceStatus() {
    return serviceStatus;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceStatus(String serviceStatus) {
    this.serviceStatus = serviceStatus;
  }


  public ServiceSignalmgmtLanQueryResponseData statusRemark(String statusRemark) {
    
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


  public ServiceSignalmgmtLanQueryResponseData visibleId(String visibleId) {
    
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


  public ServiceSignalmgmtLanQueryResponseData id(String id) {
    
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


  public ServiceSignalmgmtLanQueryResponseData subnetmask(String subnetmask) {
    
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

  public String getSubnetmask() {
    return subnetmask;
  }


  @JsonProperty(JSON_PROPERTY_SUBNETMASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubnetmask(String subnetmask) {
    this.subnetmask = subnetmask;
  }


  public ServiceSignalmgmtLanQueryResponseData dhcp(Boolean dhcp) {
    
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

  public Boolean getDhcp() {
    return dhcp;
  }


  @JsonProperty(JSON_PROPERTY_DHCP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDhcp(Boolean dhcp) {
    this.dhcp = dhcp;
  }


  public ServiceSignalmgmtLanQueryResponseData gateway(String gateway) {
    
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

  public String getGateway() {
    return gateway;
  }


  @JsonProperty(JSON_PROPERTY_GATEWAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGateway(String gateway) {
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
    ServiceSignalmgmtLanQueryResponseData serviceSignalmgmtLanQueryResponseData = (ServiceSignalmgmtLanQueryResponseData) o;
    return Objects.equals(this.swRevision, serviceSignalmgmtLanQueryResponseData.swRevision) &&
        Objects.equals(this.detailGroupElid, serviceSignalmgmtLanQueryResponseData.detailGroupElid) &&
        Objects.equals(this.netSpeed, serviceSignalmgmtLanQueryResponseData.netSpeed) &&
        Objects.equals(this.netId, serviceSignalmgmtLanQueryResponseData.netId) &&
        Objects.equals(this.netName, serviceSignalmgmtLanQueryResponseData.netName) &&
        Objects.equals(this.seqNum, serviceSignalmgmtLanQueryResponseData.seqNum) &&
        Objects.equals(this.transmissionMode, serviceSignalmgmtLanQueryResponseData.transmissionMode) &&
        Objects.equals(this.ipAddress, serviceSignalmgmtLanQueryResponseData.ipAddress) &&
        Objects.equals(this.hostId, serviceSignalmgmtLanQueryResponseData.hostId) &&
        Objects.equals(this.remark, serviceSignalmgmtLanQueryResponseData.remark) &&
        Objects.equals(this.elid, serviceSignalmgmtLanQueryResponseData.elid) &&
        Objects.equals(this.numberCodeElid, serviceSignalmgmtLanQueryResponseData.numberCodeElid) &&
        Objects.equals(this.hostname, serviceSignalmgmtLanQueryResponseData.hostname) &&
        Objects.equals(this.mainNo, serviceSignalmgmtLanQueryResponseData.mainNo) &&
        Objects.equals(this.typeElid, serviceSignalmgmtLanQueryResponseData.typeElid) &&
        Objects.equals(this.serviceStatus, serviceSignalmgmtLanQueryResponseData.serviceStatus) &&
        Objects.equals(this.statusRemark, serviceSignalmgmtLanQueryResponseData.statusRemark) &&
        Objects.equals(this.visibleId, serviceSignalmgmtLanQueryResponseData.visibleId) &&
        Objects.equals(this.id, serviceSignalmgmtLanQueryResponseData.id) &&
        Objects.equals(this.subnetmask, serviceSignalmgmtLanQueryResponseData.subnetmask) &&
        Objects.equals(this.dhcp, serviceSignalmgmtLanQueryResponseData.dhcp) &&
        Objects.equals(this.gateway, serviceSignalmgmtLanQueryResponseData.gateway);
  }

  @Override
  public int hashCode() {
    return Objects.hash(swRevision, detailGroupElid, netSpeed, netId, netName, seqNum, transmissionMode, ipAddress, hostId, remark, elid, numberCodeElid, hostname, mainNo, typeElid, serviceStatus, statusRemark, visibleId, id, subnetmask, dhcp, gateway);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSignalmgmtLanQueryResponseData {\n");
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
