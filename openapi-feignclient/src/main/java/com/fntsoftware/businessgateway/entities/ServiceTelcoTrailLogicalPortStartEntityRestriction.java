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
import com.fntsoftware.businessgateway.entities.RestrictionsBoolean;
import com.fntsoftware.businessgateway.entities.RestrictionsDate;
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceTelcoTrailLogicalPortStartEntityRestriction
 */
@JsonPropertyOrder({
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_RX_BLOCK_FLAG,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_LOCK_SUB_PORT,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_C_DATA_SOURCE_ID,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_PHYS_PORT2,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_PORT_STATUS,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_PORT_NAME,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_PTOLP,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_TX_BLOCK_FLAG,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_PORT_NO,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_ATM,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_PORT_NAME_ORG,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_SIGNAL_RATE,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_ACTIVE_FROM,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_NOMINAL_UTILIZATION,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_C_DATA_SOURCE_DELETED,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_C_SERVICE_SIDE,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_OVERLOAD_WARNING,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_BANDWIDTH,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_PORT_CATEGORY,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_ELID,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_PHYS_PORT2_SIDE,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_PORT_TYPE,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_C_DATA_SOURCE,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_PHYS_PORT,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_PHYS_PORT_SIDE,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_PORT_FUNCTION,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_IMA,
  ServiceTelcoTrailLogicalPortStartEntityRestriction.JSON_PROPERTY_ACTIVE_UNTIL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class ServiceTelcoTrailLogicalPortStartEntityRestriction {
  public static final String JSON_PROPERTY_RX_BLOCK_FLAG = "rxBlockFlag";
  private RestrictionsBoolean rxBlockFlag;

  public static final String JSON_PROPERTY_LOCK_SUB_PORT = "lockSubPort";
  private RestrictionsBoolean lockSubPort;

  public static final String JSON_PROPERTY_C_DATA_SOURCE_ID = "cDataSourceId";
  private RestrictionsString cDataSourceId;

  public static final String JSON_PROPERTY_PHYS_PORT2 = "physPort2";
  private RestrictionsNumeric physPort2;

  public static final String JSON_PROPERTY_PORT_STATUS = "portStatus";
  private RestrictionsString portStatus;

  public static final String JSON_PROPERTY_PORT_NAME = "portName";
  private RestrictionsString portName;

  public static final String JSON_PROPERTY_PTOLP = "ptolp";
  private RestrictionsString ptolp;

  public static final String JSON_PROPERTY_TX_BLOCK_FLAG = "txBlockFlag";
  private RestrictionsBoolean txBlockFlag;

  public static final String JSON_PROPERTY_PORT_NO = "portNo";
  private RestrictionsNumeric portNo;

  public static final String JSON_PROPERTY_ATM = "atm";
  private RestrictionsBoolean atm;

  public static final String JSON_PROPERTY_PORT_NAME_ORG = "portNameOrg";
  private RestrictionsString portNameOrg;

  public static final String JSON_PROPERTY_SIGNAL_RATE = "signalRate";
  private RestrictionsString signalRate;

  public static final String JSON_PROPERTY_ACTIVE_FROM = "activeFrom";
  private RestrictionsDate activeFrom;

  public static final String JSON_PROPERTY_NOMINAL_UTILIZATION = "nominalUtilization";
  private RestrictionsNumeric nominalUtilization;

  public static final String JSON_PROPERTY_C_DATA_SOURCE_DELETED = "cDataSourceDeleted";
  private RestrictionsString cDataSourceDeleted;

  public static final String JSON_PROPERTY_C_SERVICE_SIDE = "cServiceSide";
  private RestrictionsString cServiceSide;

  public static final String JSON_PROPERTY_OVERLOAD_WARNING = "overloadWarning";
  private RestrictionsString overloadWarning;

  public static final String JSON_PROPERTY_BANDWIDTH = "bandwidth";
  private RestrictionsNumeric bandwidth;

  public static final String JSON_PROPERTY_PORT_CATEGORY = "portCategory";
  private RestrictionsString portCategory;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_PHYS_PORT2_SIDE = "physPort2Side";
  private RestrictionsString physPort2Side;

  public static final String JSON_PROPERTY_PORT_TYPE = "portType";
  private RestrictionsString portType;

  public static final String JSON_PROPERTY_C_DATA_SOURCE = "cDataSource";
  private RestrictionsString cDataSource;

  public static final String JSON_PROPERTY_PHYS_PORT = "physPort";
  private RestrictionsNumeric physPort;

  public static final String JSON_PROPERTY_PHYS_PORT_SIDE = "physPortSide";
  private RestrictionsString physPortSide;

  public static final String JSON_PROPERTY_PORT_FUNCTION = "portFunction";
  private RestrictionsString portFunction;

  public static final String JSON_PROPERTY_IMA = "ima";
  private RestrictionsBoolean ima;

  public static final String JSON_PROPERTY_ACTIVE_UNTIL = "activeUntil";
  private RestrictionsDate activeUntil;

  public ServiceTelcoTrailLogicalPortStartEntityRestriction() {
  }

  public ServiceTelcoTrailLogicalPortStartEntityRestriction rxBlockFlag(RestrictionsBoolean rxBlockFlag) {
    
    this.rxBlockFlag = rxBlockFlag;
    return this;
  }

   /**
   * Get rxBlockFlag
   * @return rxBlockFlag
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RX_BLOCK_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getRxBlockFlag() {
    return rxBlockFlag;
  }


  @JsonProperty(JSON_PROPERTY_RX_BLOCK_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRxBlockFlag(RestrictionsBoolean rxBlockFlag) {
    this.rxBlockFlag = rxBlockFlag;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction lockSubPort(RestrictionsBoolean lockSubPort) {
    
    this.lockSubPort = lockSubPort;
    return this;
  }

   /**
   * Get lockSubPort
   * @return lockSubPort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCK_SUB_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getLockSubPort() {
    return lockSubPort;
  }


  @JsonProperty(JSON_PROPERTY_LOCK_SUB_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLockSubPort(RestrictionsBoolean lockSubPort) {
    this.lockSubPort = lockSubPort;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction cDataSourceId(RestrictionsString cDataSourceId) {
    
    this.cDataSourceId = cDataSourceId;
    return this;
  }

   /**
   * Get cDataSourceId
   * @return cDataSourceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcDataSourceId() {
    return cDataSourceId;
  }


  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDataSourceId(RestrictionsString cDataSourceId) {
    this.cDataSourceId = cDataSourceId;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction physPort2(RestrictionsNumeric physPort2) {
    
    this.physPort2 = physPort2;
    return this;
  }

   /**
   * Get physPort2
   * @return physPort2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHYS_PORT2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getPhysPort2() {
    return physPort2;
  }


  @JsonProperty(JSON_PROPERTY_PHYS_PORT2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhysPort2(RestrictionsNumeric physPort2) {
    this.physPort2 = physPort2;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction portStatus(RestrictionsString portStatus) {
    
    this.portStatus = portStatus;
    return this;
  }

   /**
   * Get portStatus
   * @return portStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPortStatus() {
    return portStatus;
  }


  @JsonProperty(JSON_PROPERTY_PORT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortStatus(RestrictionsString portStatus) {
    this.portStatus = portStatus;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction portName(RestrictionsString portName) {
    
    this.portName = portName;
    return this;
  }

   /**
   * Get portName
   * @return portName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPortName() {
    return portName;
  }


  @JsonProperty(JSON_PROPERTY_PORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortName(RestrictionsString portName) {
    this.portName = portName;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction ptolp(RestrictionsString ptolp) {
    
    this.ptolp = ptolp;
    return this;
  }

   /**
   * Get ptolp
   * @return ptolp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PTOLP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPtolp() {
    return ptolp;
  }


  @JsonProperty(JSON_PROPERTY_PTOLP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPtolp(RestrictionsString ptolp) {
    this.ptolp = ptolp;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction txBlockFlag(RestrictionsBoolean txBlockFlag) {
    
    this.txBlockFlag = txBlockFlag;
    return this;
  }

   /**
   * Get txBlockFlag
   * @return txBlockFlag
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TX_BLOCK_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getTxBlockFlag() {
    return txBlockFlag;
  }


  @JsonProperty(JSON_PROPERTY_TX_BLOCK_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTxBlockFlag(RestrictionsBoolean txBlockFlag) {
    this.txBlockFlag = txBlockFlag;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction portNo(RestrictionsNumeric portNo) {
    
    this.portNo = portNo;
    return this;
  }

   /**
   * Get portNo
   * @return portNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getPortNo() {
    return portNo;
  }


  @JsonProperty(JSON_PROPERTY_PORT_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortNo(RestrictionsNumeric portNo) {
    this.portNo = portNo;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction atm(RestrictionsBoolean atm) {
    
    this.atm = atm;
    return this;
  }

   /**
   * Get atm
   * @return atm
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getAtm() {
    return atm;
  }


  @JsonProperty(JSON_PROPERTY_ATM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAtm(RestrictionsBoolean atm) {
    this.atm = atm;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction portNameOrg(RestrictionsString portNameOrg) {
    
    this.portNameOrg = portNameOrg;
    return this;
  }

   /**
   * Get portNameOrg
   * @return portNameOrg
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_NAME_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPortNameOrg() {
    return portNameOrg;
  }


  @JsonProperty(JSON_PROPERTY_PORT_NAME_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortNameOrg(RestrictionsString portNameOrg) {
    this.portNameOrg = portNameOrg;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction signalRate(RestrictionsString signalRate) {
    
    this.signalRate = signalRate;
    return this;
  }

   /**
   * Get signalRate
   * @return signalRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNAL_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSignalRate() {
    return signalRate;
  }


  @JsonProperty(JSON_PROPERTY_SIGNAL_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignalRate(RestrictionsString signalRate) {
    this.signalRate = signalRate;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction activeFrom(RestrictionsDate activeFrom) {
    
    this.activeFrom = activeFrom;
    return this;
  }

   /**
   * Get activeFrom
   * @return activeFrom
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getActiveFrom() {
    return activeFrom;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveFrom(RestrictionsDate activeFrom) {
    this.activeFrom = activeFrom;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction nominalUtilization(RestrictionsNumeric nominalUtilization) {
    
    this.nominalUtilization = nominalUtilization;
    return this;
  }

   /**
   * Get nominalUtilization
   * @return nominalUtilization
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOMINAL_UTILIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getNominalUtilization() {
    return nominalUtilization;
  }


  @JsonProperty(JSON_PROPERTY_NOMINAL_UTILIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNominalUtilization(RestrictionsNumeric nominalUtilization) {
    this.nominalUtilization = nominalUtilization;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction cDataSourceDeleted(RestrictionsString cDataSourceDeleted) {
    
    this.cDataSourceDeleted = cDataSourceDeleted;
    return this;
  }

   /**
   * Get cDataSourceDeleted
   * @return cDataSourceDeleted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcDataSourceDeleted() {
    return cDataSourceDeleted;
  }


  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDataSourceDeleted(RestrictionsString cDataSourceDeleted) {
    this.cDataSourceDeleted = cDataSourceDeleted;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction cServiceSide(RestrictionsString cServiceSide) {
    
    this.cServiceSide = cServiceSide;
    return this;
  }

   /**
   * Get cServiceSide
   * @return cServiceSide
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_SERVICE_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcServiceSide() {
    return cServiceSide;
  }


  @JsonProperty(JSON_PROPERTY_C_SERVICE_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcServiceSide(RestrictionsString cServiceSide) {
    this.cServiceSide = cServiceSide;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction overloadWarning(RestrictionsString overloadWarning) {
    
    this.overloadWarning = overloadWarning;
    return this;
  }

   /**
   * Get overloadWarning
   * @return overloadWarning
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERLOAD_WARNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getOverloadWarning() {
    return overloadWarning;
  }


  @JsonProperty(JSON_PROPERTY_OVERLOAD_WARNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverloadWarning(RestrictionsString overloadWarning) {
    this.overloadWarning = overloadWarning;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction bandwidth(RestrictionsNumeric bandwidth) {
    
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANDWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getBandwidth() {
    return bandwidth;
  }


  @JsonProperty(JSON_PROPERTY_BANDWIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBandwidth(RestrictionsNumeric bandwidth) {
    this.bandwidth = bandwidth;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction portCategory(RestrictionsString portCategory) {
    
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


  public ServiceTelcoTrailLogicalPortStartEntityRestriction elid(RestrictionsString elid) {
    
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


  public ServiceTelcoTrailLogicalPortStartEntityRestriction physPort2Side(RestrictionsString physPort2Side) {
    
    this.physPort2Side = physPort2Side;
    return this;
  }

   /**
   * Get physPort2Side
   * @return physPort2Side
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHYS_PORT2_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPhysPort2Side() {
    return physPort2Side;
  }


  @JsonProperty(JSON_PROPERTY_PHYS_PORT2_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhysPort2Side(RestrictionsString physPort2Side) {
    this.physPort2Side = physPort2Side;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction portType(RestrictionsString portType) {
    
    this.portType = portType;
    return this;
  }

   /**
   * Get portType
   * @return portType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPortType() {
    return portType;
  }


  @JsonProperty(JSON_PROPERTY_PORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortType(RestrictionsString portType) {
    this.portType = portType;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction cDataSource(RestrictionsString cDataSource) {
    
    this.cDataSource = cDataSource;
    return this;
  }

   /**
   * Get cDataSource
   * @return cDataSource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcDataSource() {
    return cDataSource;
  }


  @JsonProperty(JSON_PROPERTY_C_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcDataSource(RestrictionsString cDataSource) {
    this.cDataSource = cDataSource;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction physPort(RestrictionsNumeric physPort) {
    
    this.physPort = physPort;
    return this;
  }

   /**
   * Get physPort
   * @return physPort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHYS_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getPhysPort() {
    return physPort;
  }


  @JsonProperty(JSON_PROPERTY_PHYS_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhysPort(RestrictionsNumeric physPort) {
    this.physPort = physPort;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction physPortSide(RestrictionsString physPortSide) {
    
    this.physPortSide = physPortSide;
    return this;
  }

   /**
   * Get physPortSide
   * @return physPortSide
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHYS_PORT_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPhysPortSide() {
    return physPortSide;
  }


  @JsonProperty(JSON_PROPERTY_PHYS_PORT_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhysPortSide(RestrictionsString physPortSide) {
    this.physPortSide = physPortSide;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction portFunction(RestrictionsString portFunction) {
    
    this.portFunction = portFunction;
    return this;
  }

   /**
   * Get portFunction
   * @return portFunction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPortFunction() {
    return portFunction;
  }


  @JsonProperty(JSON_PROPERTY_PORT_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortFunction(RestrictionsString portFunction) {
    this.portFunction = portFunction;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction ima(RestrictionsBoolean ima) {
    
    this.ima = ima;
    return this;
  }

   /**
   * Get ima
   * @return ima
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getIma() {
    return ima;
  }


  @JsonProperty(JSON_PROPERTY_IMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIma(RestrictionsBoolean ima) {
    this.ima = ima;
  }


  public ServiceTelcoTrailLogicalPortStartEntityRestriction activeUntil(RestrictionsDate activeUntil) {
    
    this.activeUntil = activeUntil;
    return this;
  }

   /**
   * Get activeUntil
   * @return activeUntil
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getActiveUntil() {
    return activeUntil;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveUntil(RestrictionsDate activeUntil) {
    this.activeUntil = activeUntil;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceTelcoTrailLogicalPortStartEntityRestriction serviceTelcoTrailLogicalPortStartEntityRestriction = (ServiceTelcoTrailLogicalPortStartEntityRestriction) o;
    return Objects.equals(this.rxBlockFlag, serviceTelcoTrailLogicalPortStartEntityRestriction.rxBlockFlag) &&
        Objects.equals(this.lockSubPort, serviceTelcoTrailLogicalPortStartEntityRestriction.lockSubPort) &&
        Objects.equals(this.cDataSourceId, serviceTelcoTrailLogicalPortStartEntityRestriction.cDataSourceId) &&
        Objects.equals(this.physPort2, serviceTelcoTrailLogicalPortStartEntityRestriction.physPort2) &&
        Objects.equals(this.portStatus, serviceTelcoTrailLogicalPortStartEntityRestriction.portStatus) &&
        Objects.equals(this.portName, serviceTelcoTrailLogicalPortStartEntityRestriction.portName) &&
        Objects.equals(this.ptolp, serviceTelcoTrailLogicalPortStartEntityRestriction.ptolp) &&
        Objects.equals(this.txBlockFlag, serviceTelcoTrailLogicalPortStartEntityRestriction.txBlockFlag) &&
        Objects.equals(this.portNo, serviceTelcoTrailLogicalPortStartEntityRestriction.portNo) &&
        Objects.equals(this.atm, serviceTelcoTrailLogicalPortStartEntityRestriction.atm) &&
        Objects.equals(this.portNameOrg, serviceTelcoTrailLogicalPortStartEntityRestriction.portNameOrg) &&
        Objects.equals(this.signalRate, serviceTelcoTrailLogicalPortStartEntityRestriction.signalRate) &&
        Objects.equals(this.activeFrom, serviceTelcoTrailLogicalPortStartEntityRestriction.activeFrom) &&
        Objects.equals(this.nominalUtilization, serviceTelcoTrailLogicalPortStartEntityRestriction.nominalUtilization) &&
        Objects.equals(this.cDataSourceDeleted, serviceTelcoTrailLogicalPortStartEntityRestriction.cDataSourceDeleted) &&
        Objects.equals(this.cServiceSide, serviceTelcoTrailLogicalPortStartEntityRestriction.cServiceSide) &&
        Objects.equals(this.overloadWarning, serviceTelcoTrailLogicalPortStartEntityRestriction.overloadWarning) &&
        Objects.equals(this.bandwidth, serviceTelcoTrailLogicalPortStartEntityRestriction.bandwidth) &&
        Objects.equals(this.portCategory, serviceTelcoTrailLogicalPortStartEntityRestriction.portCategory) &&
        Objects.equals(this.elid, serviceTelcoTrailLogicalPortStartEntityRestriction.elid) &&
        Objects.equals(this.physPort2Side, serviceTelcoTrailLogicalPortStartEntityRestriction.physPort2Side) &&
        Objects.equals(this.portType, serviceTelcoTrailLogicalPortStartEntityRestriction.portType) &&
        Objects.equals(this.cDataSource, serviceTelcoTrailLogicalPortStartEntityRestriction.cDataSource) &&
        Objects.equals(this.physPort, serviceTelcoTrailLogicalPortStartEntityRestriction.physPort) &&
        Objects.equals(this.physPortSide, serviceTelcoTrailLogicalPortStartEntityRestriction.physPortSide) &&
        Objects.equals(this.portFunction, serviceTelcoTrailLogicalPortStartEntityRestriction.portFunction) &&
        Objects.equals(this.ima, serviceTelcoTrailLogicalPortStartEntityRestriction.ima) &&
        Objects.equals(this.activeUntil, serviceTelcoTrailLogicalPortStartEntityRestriction.activeUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rxBlockFlag, lockSubPort, cDataSourceId, physPort2, portStatus, portName, ptolp, txBlockFlag, portNo, atm, portNameOrg, signalRate, activeFrom, nominalUtilization, cDataSourceDeleted, cServiceSide, overloadWarning, bandwidth, portCategory, elid, physPort2Side, portType, cDataSource, physPort, physPortSide, portFunction, ima, activeUntil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceTelcoTrailLogicalPortStartEntityRestriction {\n");
    sb.append("    rxBlockFlag: ").append(toIndentedString(rxBlockFlag)).append("\n");
    sb.append("    lockSubPort: ").append(toIndentedString(lockSubPort)).append("\n");
    sb.append("    cDataSourceId: ").append(toIndentedString(cDataSourceId)).append("\n");
    sb.append("    physPort2: ").append(toIndentedString(physPort2)).append("\n");
    sb.append("    portStatus: ").append(toIndentedString(portStatus)).append("\n");
    sb.append("    portName: ").append(toIndentedString(portName)).append("\n");
    sb.append("    ptolp: ").append(toIndentedString(ptolp)).append("\n");
    sb.append("    txBlockFlag: ").append(toIndentedString(txBlockFlag)).append("\n");
    sb.append("    portNo: ").append(toIndentedString(portNo)).append("\n");
    sb.append("    atm: ").append(toIndentedString(atm)).append("\n");
    sb.append("    portNameOrg: ").append(toIndentedString(portNameOrg)).append("\n");
    sb.append("    signalRate: ").append(toIndentedString(signalRate)).append("\n");
    sb.append("    activeFrom: ").append(toIndentedString(activeFrom)).append("\n");
    sb.append("    nominalUtilization: ").append(toIndentedString(nominalUtilization)).append("\n");
    sb.append("    cDataSourceDeleted: ").append(toIndentedString(cDataSourceDeleted)).append("\n");
    sb.append("    cServiceSide: ").append(toIndentedString(cServiceSide)).append("\n");
    sb.append("    overloadWarning: ").append(toIndentedString(overloadWarning)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    portCategory: ").append(toIndentedString(portCategory)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    physPort2Side: ").append(toIndentedString(physPort2Side)).append("\n");
    sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
    sb.append("    cDataSource: ").append(toIndentedString(cDataSource)).append("\n");
    sb.append("    physPort: ").append(toIndentedString(physPort)).append("\n");
    sb.append("    physPortSide: ").append(toIndentedString(physPortSide)).append("\n");
    sb.append("    portFunction: ").append(toIndentedString(portFunction)).append("\n");
    sb.append("    ima: ").append(toIndentedString(ima)).append("\n");
    sb.append("    activeUntil: ").append(toIndentedString(activeUntil)).append("\n");
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
