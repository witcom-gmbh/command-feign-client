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
import java.math.BigDecimal;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * HistorizationAttributesHistoryResponseData
 */
@JsonPropertyOrder({
  HistorizationAttributesHistoryResponseData.JSON_PROPERTY_NEW_VALUE,
  HistorizationAttributesHistoryResponseData.JSON_PROPERTY_PHYSICAL_TABLE_NAME,
  HistorizationAttributesHistoryResponseData.JSON_PROPERTY_TRANS_ID,
  HistorizationAttributesHistoryResponseData.JSON_PROPERTY_CHANGE_DATE,
  HistorizationAttributesHistoryResponseData.JSON_PROPERTY_ACTION,
  HistorizationAttributesHistoryResponseData.JSON_PROPERTY_USER_ELID,
  HistorizationAttributesHistoryResponseData.JSON_PROPERTY_ID,
  HistorizationAttributesHistoryResponseData.JSON_PROPERTY_OLD_VALUE,
  HistorizationAttributesHistoryResponseData.JSON_PROPERTY_ELID,
  HistorizationAttributesHistoryResponseData.JSON_PROPERTY_ATTRIB_NAME,
  HistorizationAttributesHistoryResponseData.JSON_PROPERTY_TABLE_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class HistorizationAttributesHistoryResponseData {
  public static final String JSON_PROPERTY_NEW_VALUE = "newValue";
  private String newValue;

  public static final String JSON_PROPERTY_PHYSICAL_TABLE_NAME = "physicalTableName";
  private String physicalTableName;

  public static final String JSON_PROPERTY_TRANS_ID = "transId";
  private BigDecimal transId;

  public static final String JSON_PROPERTY_CHANGE_DATE = "changeDate";
  private DateTime changeDate;

  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_USER_ELID = "userElid";
  private String userElid;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OLD_VALUE = "oldValue";
  private String oldValue;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_ATTRIB_NAME = "attribName";
  private String attribName;

  public static final String JSON_PROPERTY_TABLE_NAME = "tableName";
  private String tableName;

  public HistorizationAttributesHistoryResponseData() {
  }

  public HistorizationAttributesHistoryResponseData newValue(String newValue) {
    
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewValue() {
    return newValue;
  }


  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }


  public HistorizationAttributesHistoryResponseData physicalTableName(String physicalTableName) {
    
    this.physicalTableName = physicalTableName;
    return this;
  }

   /**
   * Get physicalTableName
   * @return physicalTableName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHYSICAL_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhysicalTableName() {
    return physicalTableName;
  }


  @JsonProperty(JSON_PROPERTY_PHYSICAL_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhysicalTableName(String physicalTableName) {
    this.physicalTableName = physicalTableName;
  }


  public HistorizationAttributesHistoryResponseData transId(BigDecimal transId) {
    
    this.transId = transId;
    return this;
  }

   /**
   * Get transId
   * @return transId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTransId() {
    return transId;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransId(BigDecimal transId) {
    this.transId = transId;
  }


  public HistorizationAttributesHistoryResponseData changeDate(DateTime changeDate) {
    
    this.changeDate = changeDate;
    return this;
  }

   /**
   * Get changeDate
   * @return changeDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getChangeDate() {
    return changeDate;
  }


  @JsonProperty(JSON_PROPERTY_CHANGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangeDate(DateTime changeDate) {
    this.changeDate = changeDate;
  }


  public HistorizationAttributesHistoryResponseData action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(String action) {
    this.action = action;
  }


  public HistorizationAttributesHistoryResponseData userElid(String userElid) {
    
    this.userElid = userElid;
    return this;
  }

   /**
   * Get userElid
   * @return userElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserElid() {
    return userElid;
  }


  @JsonProperty(JSON_PROPERTY_USER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserElid(String userElid) {
    this.userElid = userElid;
  }


  public HistorizationAttributesHistoryResponseData id(String id) {
    
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


  public HistorizationAttributesHistoryResponseData oldValue(String oldValue) {
    
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOldValue() {
    return oldValue;
  }


  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }


  public HistorizationAttributesHistoryResponseData elid(String elid) {
    
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


  public HistorizationAttributesHistoryResponseData attribName(String attribName) {
    
    this.attribName = attribName;
    return this;
  }

   /**
   * Get attribName
   * @return attribName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIB_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttribName() {
    return attribName;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIB_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttribName(String attribName) {
    this.attribName = attribName;
  }


  public HistorizationAttributesHistoryResponseData tableName(String tableName) {
    
    this.tableName = tableName;
    return this;
  }

   /**
   * Get tableName
   * @return tableName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTableName() {
    return tableName;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistorizationAttributesHistoryResponseData historizationAttributesHistoryResponseData = (HistorizationAttributesHistoryResponseData) o;
    return Objects.equals(this.newValue, historizationAttributesHistoryResponseData.newValue) &&
        Objects.equals(this.physicalTableName, historizationAttributesHistoryResponseData.physicalTableName) &&
        Objects.equals(this.transId, historizationAttributesHistoryResponseData.transId) &&
        Objects.equals(this.changeDate, historizationAttributesHistoryResponseData.changeDate) &&
        Objects.equals(this.action, historizationAttributesHistoryResponseData.action) &&
        Objects.equals(this.userElid, historizationAttributesHistoryResponseData.userElid) &&
        Objects.equals(this.id, historizationAttributesHistoryResponseData.id) &&
        Objects.equals(this.oldValue, historizationAttributesHistoryResponseData.oldValue) &&
        Objects.equals(this.elid, historizationAttributesHistoryResponseData.elid) &&
        Objects.equals(this.attribName, historizationAttributesHistoryResponseData.attribName) &&
        Objects.equals(this.tableName, historizationAttributesHistoryResponseData.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newValue, physicalTableName, transId, changeDate, action, userElid, id, oldValue, elid, attribName, tableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistorizationAttributesHistoryResponseData {\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    physicalTableName: ").append(toIndentedString(physicalTableName)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    userElid: ").append(toIndentedString(userElid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    attribName: ").append(toIndentedString(attribName)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
