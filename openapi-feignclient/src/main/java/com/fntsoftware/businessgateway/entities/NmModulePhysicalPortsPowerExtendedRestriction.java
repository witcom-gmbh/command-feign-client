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
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NmModulePhysicalPortsPowerExtendedRestriction
 */
@JsonPropertyOrder({
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_END_CONSUMER_ELID,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_SOCKET_NAME_SPC,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_BORDER_COLOR,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_SUPPLIER_ID,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_SOCKET_NAME,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_PORT_IDENTIFIER,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_WIRE_TYPE,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_FUSE_ID,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_END_CONSUMER_ID,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_PORT_CATEGORY,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_SOCKET_NO,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_MEDIUM,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_ELID,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_POWER_DISTRIBUTION_ELID,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_CONNECTOR,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_SOCKET_SIDE,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_POWER_CONSUMPTION_CALC,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_STATUS_REMARK,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_END_CONSUMER_VISIBLE_ID,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_FUSE_ELID,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_POWER_DISTRIBUTION_ID,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_SUPPLIER_ELID,
  NmModulePhysicalPortsPowerExtendedRestriction.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class NmModulePhysicalPortsPowerExtendedRestriction {
  public static final String JSON_PROPERTY_END_CONSUMER_ELID = "endConsumerElid";
  private RestrictionsString endConsumerElid;

  public static final String JSON_PROPERTY_SOCKET_NAME_SPC = "socketNameSpc";
  private RestrictionsString socketNameSpc;

  public static final String JSON_PROPERTY_BORDER_COLOR = "borderColor";
  private RestrictionsString borderColor;

  public static final String JSON_PROPERTY_SUPPLIER_ID = "supplierId";
  private RestrictionsString supplierId;

  public static final String JSON_PROPERTY_SOCKET_NAME = "socketName";
  private RestrictionsString socketName;

  public static final String JSON_PROPERTY_PORT_IDENTIFIER = "portIdentifier";
  private RestrictionsString portIdentifier;

  public static final String JSON_PROPERTY_WIRE_TYPE = "wireType";
  private RestrictionsString wireType;

  public static final String JSON_PROPERTY_FUSE_ID = "fuseId";
  private RestrictionsString fuseId;

  public static final String JSON_PROPERTY_END_CONSUMER_ID = "endConsumerId";
  private RestrictionsString endConsumerId;

  public static final String JSON_PROPERTY_PORT_CATEGORY = "portCategory";
  private RestrictionsString portCategory;

  public static final String JSON_PROPERTY_SOCKET_NO = "socketNo";
  private RestrictionsNumeric socketNo;

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  private RestrictionsString medium;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_POWER_DISTRIBUTION_ELID = "powerDistributionElid";
  private RestrictionsString powerDistributionElid;

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private RestrictionsString connector;

  public static final String JSON_PROPERTY_SOCKET_SIDE = "socketSide";
  private RestrictionsString socketSide;

  public static final String JSON_PROPERTY_POWER_CONSUMPTION_CALC = "powerConsumptionCalc";
  private RestrictionsNumeric powerConsumptionCalc;

  public static final String JSON_PROPERTY_STATUS_REMARK = "statusRemark";
  private RestrictionsString statusRemark;

  public static final String JSON_PROPERTY_END_CONSUMER_VISIBLE_ID = "endConsumerVisibleId";
  private RestrictionsString endConsumerVisibleId;

  public static final String JSON_PROPERTY_FUSE_ELID = "fuseElid";
  private RestrictionsString fuseElid;

  public static final String JSON_PROPERTY_POWER_DISTRIBUTION_ID = "powerDistributionId";
  private RestrictionsString powerDistributionId;

  public static final String JSON_PROPERTY_SUPPLIER_ELID = "supplierElid";
  private RestrictionsString supplierElid;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RestrictionsString status;

  public NmModulePhysicalPortsPowerExtendedRestriction() {
  }

  public NmModulePhysicalPortsPowerExtendedRestriction endConsumerElid(RestrictionsString endConsumerElid) {
    
    this.endConsumerElid = endConsumerElid;
    return this;
  }

   /**
   * Get endConsumerElid
   * @return endConsumerElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_CONSUMER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getEndConsumerElid() {
    return endConsumerElid;
  }


  @JsonProperty(JSON_PROPERTY_END_CONSUMER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndConsumerElid(RestrictionsString endConsumerElid) {
    this.endConsumerElid = endConsumerElid;
  }


  public NmModulePhysicalPortsPowerExtendedRestriction socketNameSpc(RestrictionsString socketNameSpc) {
    
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


  public NmModulePhysicalPortsPowerExtendedRestriction borderColor(RestrictionsString borderColor) {
    
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


  public NmModulePhysicalPortsPowerExtendedRestriction supplierId(RestrictionsString supplierId) {
    
    this.supplierId = supplierId;
    return this;
  }

   /**
   * Get supplierId
   * @return supplierId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPLIER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSupplierId() {
    return supplierId;
  }


  @JsonProperty(JSON_PROPERTY_SUPPLIER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupplierId(RestrictionsString supplierId) {
    this.supplierId = supplierId;
  }


  public NmModulePhysicalPortsPowerExtendedRestriction socketName(RestrictionsString socketName) {
    
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


  public NmModulePhysicalPortsPowerExtendedRestriction portIdentifier(RestrictionsString portIdentifier) {
    
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


  public NmModulePhysicalPortsPowerExtendedRestriction wireType(RestrictionsString wireType) {
    
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


  public NmModulePhysicalPortsPowerExtendedRestriction fuseId(RestrictionsString fuseId) {
    
    this.fuseId = fuseId;
    return this;
  }

   /**
   * Get fuseId
   * @return fuseId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getFuseId() {
    return fuseId;
  }


  @JsonProperty(JSON_PROPERTY_FUSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFuseId(RestrictionsString fuseId) {
    this.fuseId = fuseId;
  }


  public NmModulePhysicalPortsPowerExtendedRestriction endConsumerId(RestrictionsString endConsumerId) {
    
    this.endConsumerId = endConsumerId;
    return this;
  }

   /**
   * Get endConsumerId
   * @return endConsumerId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_CONSUMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getEndConsumerId() {
    return endConsumerId;
  }


  @JsonProperty(JSON_PROPERTY_END_CONSUMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndConsumerId(RestrictionsString endConsumerId) {
    this.endConsumerId = endConsumerId;
  }


  public NmModulePhysicalPortsPowerExtendedRestriction portCategory(RestrictionsString portCategory) {
    
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


  public NmModulePhysicalPortsPowerExtendedRestriction socketNo(RestrictionsNumeric socketNo) {
    
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


  public NmModulePhysicalPortsPowerExtendedRestriction medium(RestrictionsString medium) {
    
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


  public NmModulePhysicalPortsPowerExtendedRestriction elid(RestrictionsString elid) {
    
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


  public NmModulePhysicalPortsPowerExtendedRestriction powerDistributionElid(RestrictionsString powerDistributionElid) {
    
    this.powerDistributionElid = powerDistributionElid;
    return this;
  }

   /**
   * Get powerDistributionElid
   * @return powerDistributionElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_DISTRIBUTION_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPowerDistributionElid() {
    return powerDistributionElid;
  }


  @JsonProperty(JSON_PROPERTY_POWER_DISTRIBUTION_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerDistributionElid(RestrictionsString powerDistributionElid) {
    this.powerDistributionElid = powerDistributionElid;
  }


  public NmModulePhysicalPortsPowerExtendedRestriction connector(RestrictionsString connector) {
    
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


  public NmModulePhysicalPortsPowerExtendedRestriction socketSide(RestrictionsString socketSide) {
    
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


  public NmModulePhysicalPortsPowerExtendedRestriction powerConsumptionCalc(RestrictionsNumeric powerConsumptionCalc) {
    
    this.powerConsumptionCalc = powerConsumptionCalc;
    return this;
  }

   /**
   * Get powerConsumptionCalc
   * @return powerConsumptionCalc
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_CONSUMPTION_CALC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getPowerConsumptionCalc() {
    return powerConsumptionCalc;
  }


  @JsonProperty(JSON_PROPERTY_POWER_CONSUMPTION_CALC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerConsumptionCalc(RestrictionsNumeric powerConsumptionCalc) {
    this.powerConsumptionCalc = powerConsumptionCalc;
  }


  public NmModulePhysicalPortsPowerExtendedRestriction statusRemark(RestrictionsString statusRemark) {
    
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


  public NmModulePhysicalPortsPowerExtendedRestriction endConsumerVisibleId(RestrictionsString endConsumerVisibleId) {
    
    this.endConsumerVisibleId = endConsumerVisibleId;
    return this;
  }

   /**
   * Get endConsumerVisibleId
   * @return endConsumerVisibleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_CONSUMER_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getEndConsumerVisibleId() {
    return endConsumerVisibleId;
  }


  @JsonProperty(JSON_PROPERTY_END_CONSUMER_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndConsumerVisibleId(RestrictionsString endConsumerVisibleId) {
    this.endConsumerVisibleId = endConsumerVisibleId;
  }


  public NmModulePhysicalPortsPowerExtendedRestriction fuseElid(RestrictionsString fuseElid) {
    
    this.fuseElid = fuseElid;
    return this;
  }

   /**
   * Get fuseElid
   * @return fuseElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUSE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getFuseElid() {
    return fuseElid;
  }


  @JsonProperty(JSON_PROPERTY_FUSE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFuseElid(RestrictionsString fuseElid) {
    this.fuseElid = fuseElid;
  }


  public NmModulePhysicalPortsPowerExtendedRestriction powerDistributionId(RestrictionsString powerDistributionId) {
    
    this.powerDistributionId = powerDistributionId;
    return this;
  }

   /**
   * Get powerDistributionId
   * @return powerDistributionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POWER_DISTRIBUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPowerDistributionId() {
    return powerDistributionId;
  }


  @JsonProperty(JSON_PROPERTY_POWER_DISTRIBUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPowerDistributionId(RestrictionsString powerDistributionId) {
    this.powerDistributionId = powerDistributionId;
  }


  public NmModulePhysicalPortsPowerExtendedRestriction supplierElid(RestrictionsString supplierElid) {
    
    this.supplierElid = supplierElid;
    return this;
  }

   /**
   * Get supplierElid
   * @return supplierElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPLIER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSupplierElid() {
    return supplierElid;
  }


  @JsonProperty(JSON_PROPERTY_SUPPLIER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupplierElid(RestrictionsString supplierElid) {
    this.supplierElid = supplierElid;
  }


  public NmModulePhysicalPortsPowerExtendedRestriction status(RestrictionsString status) {
    
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
    NmModulePhysicalPortsPowerExtendedRestriction nmModulePhysicalPortsPowerExtendedRestriction = (NmModulePhysicalPortsPowerExtendedRestriction) o;
    return Objects.equals(this.endConsumerElid, nmModulePhysicalPortsPowerExtendedRestriction.endConsumerElid) &&
        Objects.equals(this.socketNameSpc, nmModulePhysicalPortsPowerExtendedRestriction.socketNameSpc) &&
        Objects.equals(this.borderColor, nmModulePhysicalPortsPowerExtendedRestriction.borderColor) &&
        Objects.equals(this.supplierId, nmModulePhysicalPortsPowerExtendedRestriction.supplierId) &&
        Objects.equals(this.socketName, nmModulePhysicalPortsPowerExtendedRestriction.socketName) &&
        Objects.equals(this.portIdentifier, nmModulePhysicalPortsPowerExtendedRestriction.portIdentifier) &&
        Objects.equals(this.wireType, nmModulePhysicalPortsPowerExtendedRestriction.wireType) &&
        Objects.equals(this.fuseId, nmModulePhysicalPortsPowerExtendedRestriction.fuseId) &&
        Objects.equals(this.endConsumerId, nmModulePhysicalPortsPowerExtendedRestriction.endConsumerId) &&
        Objects.equals(this.portCategory, nmModulePhysicalPortsPowerExtendedRestriction.portCategory) &&
        Objects.equals(this.socketNo, nmModulePhysicalPortsPowerExtendedRestriction.socketNo) &&
        Objects.equals(this.medium, nmModulePhysicalPortsPowerExtendedRestriction.medium) &&
        Objects.equals(this.elid, nmModulePhysicalPortsPowerExtendedRestriction.elid) &&
        Objects.equals(this.powerDistributionElid, nmModulePhysicalPortsPowerExtendedRestriction.powerDistributionElid) &&
        Objects.equals(this.connector, nmModulePhysicalPortsPowerExtendedRestriction.connector) &&
        Objects.equals(this.socketSide, nmModulePhysicalPortsPowerExtendedRestriction.socketSide) &&
        Objects.equals(this.powerConsumptionCalc, nmModulePhysicalPortsPowerExtendedRestriction.powerConsumptionCalc) &&
        Objects.equals(this.statusRemark, nmModulePhysicalPortsPowerExtendedRestriction.statusRemark) &&
        Objects.equals(this.endConsumerVisibleId, nmModulePhysicalPortsPowerExtendedRestriction.endConsumerVisibleId) &&
        Objects.equals(this.fuseElid, nmModulePhysicalPortsPowerExtendedRestriction.fuseElid) &&
        Objects.equals(this.powerDistributionId, nmModulePhysicalPortsPowerExtendedRestriction.powerDistributionId) &&
        Objects.equals(this.supplierElid, nmModulePhysicalPortsPowerExtendedRestriction.supplierElid) &&
        Objects.equals(this.status, nmModulePhysicalPortsPowerExtendedRestriction.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endConsumerElid, socketNameSpc, borderColor, supplierId, socketName, portIdentifier, wireType, fuseId, endConsumerId, portCategory, socketNo, medium, elid, powerDistributionElid, connector, socketSide, powerConsumptionCalc, statusRemark, endConsumerVisibleId, fuseElid, powerDistributionId, supplierElid, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NmModulePhysicalPortsPowerExtendedRestriction {\n");
    sb.append("    endConsumerElid: ").append(toIndentedString(endConsumerElid)).append("\n");
    sb.append("    socketNameSpc: ").append(toIndentedString(socketNameSpc)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
    sb.append("    socketName: ").append(toIndentedString(socketName)).append("\n");
    sb.append("    portIdentifier: ").append(toIndentedString(portIdentifier)).append("\n");
    sb.append("    wireType: ").append(toIndentedString(wireType)).append("\n");
    sb.append("    fuseId: ").append(toIndentedString(fuseId)).append("\n");
    sb.append("    endConsumerId: ").append(toIndentedString(endConsumerId)).append("\n");
    sb.append("    portCategory: ").append(toIndentedString(portCategory)).append("\n");
    sb.append("    socketNo: ").append(toIndentedString(socketNo)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    powerDistributionElid: ").append(toIndentedString(powerDistributionElid)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    socketSide: ").append(toIndentedString(socketSide)).append("\n");
    sb.append("    powerConsumptionCalc: ").append(toIndentedString(powerConsumptionCalc)).append("\n");
    sb.append("    statusRemark: ").append(toIndentedString(statusRemark)).append("\n");
    sb.append("    endConsumerVisibleId: ").append(toIndentedString(endConsumerVisibleId)).append("\n");
    sb.append("    fuseElid: ").append(toIndentedString(fuseElid)).append("\n");
    sb.append("    powerDistributionId: ").append(toIndentedString(powerDistributionId)).append("\n");
    sb.append("    supplierElid: ").append(toIndentedString(supplierElid)).append("\n");
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

