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
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceSignalmgmtFoData
 */
@JsonPropertyOrder({
  ServiceSignalmgmtFoData.JSON_PROPERTY_ACTIVE_START_DATE,
  ServiceSignalmgmtFoData.JSON_PROPERTY_DETAIL_GROUP_ELID,
  ServiceSignalmgmtFoData.JSON_PROPERTY_SEQ_NUM,
  ServiceSignalmgmtFoData.JSON_PROPERTY_TRANSMISSION_MODE,
  ServiceSignalmgmtFoData.JSON_PROPERTY_REMARK,
  ServiceSignalmgmtFoData.JSON_PROPERTY_ELID,
  ServiceSignalmgmtFoData.JSON_PROPERTY_NUMBER_CODE_ELID,
  ServiceSignalmgmtFoData.JSON_PROPERTY_MAIN_NO,
  ServiceSignalmgmtFoData.JSON_PROPERTY_PROVIDER,
  ServiceSignalmgmtFoData.JSON_PROPERTY_TYPE_ELID,
  ServiceSignalmgmtFoData.JSON_PROPERTY_STATUS_REMARK,
  ServiceSignalmgmtFoData.JSON_PROPERTY_VISIBLE_ID,
  ServiceSignalmgmtFoData.JSON_PROPERTY_ID,
  ServiceSignalmgmtFoData.JSON_PROPERTY_ACTIVE_END_DATE,
  ServiceSignalmgmtFoData.JSON_PROPERTY_OPERATING_STATUS,
  ServiceSignalmgmtFoData.JSON_PROPERTY_CUSTOMER,
  ServiceSignalmgmtFoData.JSON_PROPERTY_FOREIGN_RENTING
})
@JsonTypeName("serviceSignalmgmtFoData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class ServiceSignalmgmtFoData {
  public static final String JSON_PROPERTY_ACTIVE_START_DATE = "activeStartDate";
  private DateTime activeStartDate;

  public static final String JSON_PROPERTY_DETAIL_GROUP_ELID = "detailGroupElid";
  private String detailGroupElid;

  public static final String JSON_PROPERTY_SEQ_NUM = "seqNum";
  private String seqNum;

  public static final String JSON_PROPERTY_TRANSMISSION_MODE = "transmissionMode";
  private String transmissionMode;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_NUMBER_CODE_ELID = "numberCodeElid";
  private String numberCodeElid;

  public static final String JSON_PROPERTY_MAIN_NO = "mainNo";
  private Boolean mainNo;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public static final String JSON_PROPERTY_TYPE_ELID = "typeElid";
  private String typeElid;

  public static final String JSON_PROPERTY_STATUS_REMARK = "statusRemark";
  private String statusRemark;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ACTIVE_END_DATE = "activeEndDate";
  private DateTime activeEndDate;

  public static final String JSON_PROPERTY_OPERATING_STATUS = "operatingStatus";
  private String operatingStatus;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private String customer;

  public static final String JSON_PROPERTY_FOREIGN_RENTING = "foreignRenting";
  private Boolean foreignRenting;

  public ServiceSignalmgmtFoData() {
  }

  public ServiceSignalmgmtFoData activeStartDate(DateTime activeStartDate) {
    
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

  public DateTime getActiveStartDate() {
    return activeStartDate;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveStartDate(DateTime activeStartDate) {
    this.activeStartDate = activeStartDate;
  }


  public ServiceSignalmgmtFoData detailGroupElid(String detailGroupElid) {
    
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


  public ServiceSignalmgmtFoData seqNum(String seqNum) {
    
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


  public ServiceSignalmgmtFoData transmissionMode(String transmissionMode) {
    
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


  public ServiceSignalmgmtFoData remark(String remark) {
    
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


  public ServiceSignalmgmtFoData elid(String elid) {
    
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


  public ServiceSignalmgmtFoData numberCodeElid(String numberCodeElid) {
    
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


  public ServiceSignalmgmtFoData mainNo(Boolean mainNo) {
    
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


  public ServiceSignalmgmtFoData provider(String provider) {
    
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

  public String getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvider(String provider) {
    this.provider = provider;
  }


  public ServiceSignalmgmtFoData typeElid(String typeElid) {
    
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


  public ServiceSignalmgmtFoData statusRemark(String statusRemark) {
    
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


  public ServiceSignalmgmtFoData visibleId(String visibleId) {
    
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


  public ServiceSignalmgmtFoData id(String id) {
    
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


  public ServiceSignalmgmtFoData activeEndDate(DateTime activeEndDate) {
    
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

  public DateTime getActiveEndDate() {
    return activeEndDate;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveEndDate(DateTime activeEndDate) {
    this.activeEndDate = activeEndDate;
  }


  public ServiceSignalmgmtFoData operatingStatus(String operatingStatus) {
    
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

  public String getOperatingStatus() {
    return operatingStatus;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingStatus(String operatingStatus) {
    this.operatingStatus = operatingStatus;
  }


  public ServiceSignalmgmtFoData customer(String customer) {
    
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

  public String getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomer(String customer) {
    this.customer = customer;
  }


  public ServiceSignalmgmtFoData foreignRenting(Boolean foreignRenting) {
    
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

  public Boolean getForeignRenting() {
    return foreignRenting;
  }


  @JsonProperty(JSON_PROPERTY_FOREIGN_RENTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForeignRenting(Boolean foreignRenting) {
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
    ServiceSignalmgmtFoData serviceSignalmgmtFoData = (ServiceSignalmgmtFoData) o;
    return Objects.equals(this.activeStartDate, serviceSignalmgmtFoData.activeStartDate) &&
        Objects.equals(this.detailGroupElid, serviceSignalmgmtFoData.detailGroupElid) &&
        Objects.equals(this.seqNum, serviceSignalmgmtFoData.seqNum) &&
        Objects.equals(this.transmissionMode, serviceSignalmgmtFoData.transmissionMode) &&
        Objects.equals(this.remark, serviceSignalmgmtFoData.remark) &&
        Objects.equals(this.elid, serviceSignalmgmtFoData.elid) &&
        Objects.equals(this.numberCodeElid, serviceSignalmgmtFoData.numberCodeElid) &&
        Objects.equals(this.mainNo, serviceSignalmgmtFoData.mainNo) &&
        Objects.equals(this.provider, serviceSignalmgmtFoData.provider) &&
        Objects.equals(this.typeElid, serviceSignalmgmtFoData.typeElid) &&
        Objects.equals(this.statusRemark, serviceSignalmgmtFoData.statusRemark) &&
        Objects.equals(this.visibleId, serviceSignalmgmtFoData.visibleId) &&
        Objects.equals(this.id, serviceSignalmgmtFoData.id) &&
        Objects.equals(this.activeEndDate, serviceSignalmgmtFoData.activeEndDate) &&
        Objects.equals(this.operatingStatus, serviceSignalmgmtFoData.operatingStatus) &&
        Objects.equals(this.customer, serviceSignalmgmtFoData.customer) &&
        Objects.equals(this.foreignRenting, serviceSignalmgmtFoData.foreignRenting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeStartDate, detailGroupElid, seqNum, transmissionMode, remark, elid, numberCodeElid, mainNo, provider, typeElid, statusRemark, visibleId, id, activeEndDate, operatingStatus, customer, foreignRenting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSignalmgmtFoData {\n");
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
