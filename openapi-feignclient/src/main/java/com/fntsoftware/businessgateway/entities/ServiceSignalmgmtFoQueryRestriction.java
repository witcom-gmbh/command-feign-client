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
import com.fntsoftware.businessgateway.entities.RestrictionsDate;
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceSignalmgmtFoQueryRestriction
 */
@JsonPropertyOrder({
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_ACTIVE_START_DATE,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_DETAIL_GROUP_ELID,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_SEQ_NUM,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_TRANSMISSION_MODE,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_REMARK,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_ELID,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_NUMBER_CODE_ELID,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_MAIN_NO,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_PROVIDER,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_TYPE_ELID,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_STATUS_REMARK,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_VISIBLE_ID,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_ID,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_ACTIVE_END_DATE,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_OPERATING_STATUS,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_FIRST,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_CUSTOMER,
  ServiceSignalmgmtFoQueryRestriction.JSON_PROPERTY_FOREIGN_RENTING
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class ServiceSignalmgmtFoQueryRestriction {
  public static final String JSON_PROPERTY_ACTIVE_START_DATE = "activeStartDate";
  private RestrictionsDate activeStartDate;

  public static final String JSON_PROPERTY_DETAIL_GROUP_ELID = "detailGroupElid";
  private RestrictionsString detailGroupElid;

  public static final String JSON_PROPERTY_SEQ_NUM = "seqNum";
  private RestrictionsString seqNum;

  public static final String JSON_PROPERTY_TRANSMISSION_MODE = "transmissionMode";
  private RestrictionsString transmissionMode;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_NUMBER_CODE_ELID = "numberCodeElid";
  private RestrictionsString numberCodeElid;

  public static final String JSON_PROPERTY_MAIN_NO = "mainNo";
  private RestrictionsBoolean mainNo;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private RestrictionsString provider;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private RestrictionsString typeElid;

  public static final String JSON_PROPERTY_STATUS_REMARK = "statusRemark";
  private RestrictionsString statusRemark;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_ACTIVE_END_DATE = "activeEndDate";
  private RestrictionsDate activeEndDate;

  public static final String JSON_PROPERTY_OPERATING_STATUS = "operatingStatus";
  private RestrictionsString operatingStatus;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private RestrictionsString customer;

  public static final String JSON_PROPERTY_FOREIGN_RENTING = "foreignRenting";
  private RestrictionsBoolean foreignRenting;

  public ServiceSignalmgmtFoQueryRestriction() {
  }

  public ServiceSignalmgmtFoQueryRestriction activeStartDate(RestrictionsDate activeStartDate) {
    
    this.activeStartDate = activeStartDate;
    return this;
  }

   /**
   * Get activeStartDate
   * @return activeStartDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getActiveStartDate() {
    return activeStartDate;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveStartDate(RestrictionsDate activeStartDate) {
    this.activeStartDate = activeStartDate;
  }


  public ServiceSignalmgmtFoQueryRestriction detailGroupElid(RestrictionsString detailGroupElid) {
    
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


  public ServiceSignalmgmtFoQueryRestriction seqNum(RestrictionsString seqNum) {
    
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


  public ServiceSignalmgmtFoQueryRestriction transmissionMode(RestrictionsString transmissionMode) {
    
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


  public ServiceSignalmgmtFoQueryRestriction remark(RestrictionsString remark) {
    
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


  public ServiceSignalmgmtFoQueryRestriction elid(RestrictionsString elid) {
    
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


  public ServiceSignalmgmtFoQueryRestriction numberCodeElid(RestrictionsString numberCodeElid) {
    
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


  public ServiceSignalmgmtFoQueryRestriction mainNo(RestrictionsBoolean mainNo) {
    
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


  public ServiceSignalmgmtFoQueryRestriction provider(RestrictionsString provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvider(RestrictionsString provider) {
    this.provider = provider;
  }


  public ServiceSignalmgmtFoQueryRestriction typeElid(RestrictionsString typeElid) {
    
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


  public ServiceSignalmgmtFoQueryRestriction statusRemark(RestrictionsString statusRemark) {
    
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


  public ServiceSignalmgmtFoQueryRestriction visibleId(RestrictionsString visibleId) {
    
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


  public ServiceSignalmgmtFoQueryRestriction id(RestrictionsString id) {
    
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


  public ServiceSignalmgmtFoQueryRestriction activeEndDate(RestrictionsDate activeEndDate) {
    
    this.activeEndDate = activeEndDate;
    return this;
  }

   /**
   * Get activeEndDate
   * @return activeEndDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getActiveEndDate() {
    return activeEndDate;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveEndDate(RestrictionsDate activeEndDate) {
    this.activeEndDate = activeEndDate;
  }


  public ServiceSignalmgmtFoQueryRestriction operatingStatus(RestrictionsString operatingStatus) {
    
    this.operatingStatus = operatingStatus;
    return this;
  }

   /**
   * Get operatingStatus
   * @return operatingStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getOperatingStatus() {
    return operatingStatus;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingStatus(RestrictionsString operatingStatus) {
    this.operatingStatus = operatingStatus;
  }


  public ServiceSignalmgmtFoQueryRestriction first(RestrictionsNumeric first) {
    
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


  public ServiceSignalmgmtFoQueryRestriction customer(RestrictionsString customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomer(RestrictionsString customer) {
    this.customer = customer;
  }


  public ServiceSignalmgmtFoQueryRestriction foreignRenting(RestrictionsBoolean foreignRenting) {
    
    this.foreignRenting = foreignRenting;
    return this;
  }

   /**
   * Get foreignRenting
   * @return foreignRenting
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOREIGN_RENTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getForeignRenting() {
    return foreignRenting;
  }


  @JsonProperty(JSON_PROPERTY_FOREIGN_RENTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForeignRenting(RestrictionsBoolean foreignRenting) {
    this.foreignRenting = foreignRenting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSignalmgmtFoQueryRestriction serviceSignalmgmtFoQueryRestriction = (ServiceSignalmgmtFoQueryRestriction) o;
    return Objects.equals(this.activeStartDate, serviceSignalmgmtFoQueryRestriction.activeStartDate) &&
        Objects.equals(this.detailGroupElid, serviceSignalmgmtFoQueryRestriction.detailGroupElid) &&
        Objects.equals(this.seqNum, serviceSignalmgmtFoQueryRestriction.seqNum) &&
        Objects.equals(this.transmissionMode, serviceSignalmgmtFoQueryRestriction.transmissionMode) &&
        Objects.equals(this.remark, serviceSignalmgmtFoQueryRestriction.remark) &&
        Objects.equals(this.elid, serviceSignalmgmtFoQueryRestriction.elid) &&
        Objects.equals(this.numberCodeElid, serviceSignalmgmtFoQueryRestriction.numberCodeElid) &&
        Objects.equals(this.mainNo, serviceSignalmgmtFoQueryRestriction.mainNo) &&
        Objects.equals(this.provider, serviceSignalmgmtFoQueryRestriction.provider) &&
        Objects.equals(this.typeElid, serviceSignalmgmtFoQueryRestriction.typeElid) &&
        Objects.equals(this.statusRemark, serviceSignalmgmtFoQueryRestriction.statusRemark) &&
        Objects.equals(this.visibleId, serviceSignalmgmtFoQueryRestriction.visibleId) &&
        Objects.equals(this.id, serviceSignalmgmtFoQueryRestriction.id) &&
        Objects.equals(this.activeEndDate, serviceSignalmgmtFoQueryRestriction.activeEndDate) &&
        Objects.equals(this.operatingStatus, serviceSignalmgmtFoQueryRestriction.operatingStatus) &&
        Objects.equals(this.first, serviceSignalmgmtFoQueryRestriction.first) &&
        Objects.equals(this.customer, serviceSignalmgmtFoQueryRestriction.customer) &&
        Objects.equals(this.foreignRenting, serviceSignalmgmtFoQueryRestriction.foreignRenting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeStartDate, detailGroupElid, seqNum, transmissionMode, remark, elid, numberCodeElid, mainNo, provider, typeElid, statusRemark, visibleId, id, activeEndDate, operatingStatus, first, customer, foreignRenting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSignalmgmtFoQueryRestriction {\n");
    sb.append("    activeStartDate: ").append(toIndentedString(activeStartDate)).append("\n");
    sb.append("    detailGroupElid: ").append(toIndentedString(detailGroupElid)).append("\n");
    sb.append("    seqNum: ").append(toIndentedString(seqNum)).append("\n");
    sb.append("    transmissionMode: ").append(toIndentedString(transmissionMode)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    numberCodeElid: ").append(toIndentedString(numberCodeElid)).append("\n");
    sb.append("    mainNo: ").append(toIndentedString(mainNo)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    typeElid: ").append(toIndentedString(typeElid)).append("\n");
    sb.append("    statusRemark: ").append(toIndentedString(statusRemark)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activeEndDate: ").append(toIndentedString(activeEndDate)).append("\n");
    sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    foreignRenting: ").append(toIndentedString(foreignRenting)).append("\n");
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
