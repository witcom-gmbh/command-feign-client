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
 * JobMasterData
 */
@JsonPropertyOrder({
  JobMasterData.JSON_PROPERTY_JOB_NAME,
  JobMasterData.JSON_PROPERTY_E_MAIL_RECIPIENT,
  JobMasterData.JSON_PROPERTY_TECHNICAL_LOG_LEVEL,
  JobMasterData.JSON_PROPERTY_ACTIVE,
  JobMasterData.JSON_PROPERTY_E_MAIL_ON_ERROR_IN_LOG,
  JobMasterData.JSON_PROPERTY_REMARK,
  JobMasterData.JSON_PROPERTY_JOB_GROUP,
  JobMasterData.JSON_PROPERTY_TYPE,
  JobMasterData.JSON_PROPERTY_USER_NAME,
  JobMasterData.JSON_PROPERTY_ELID,
  JobMasterData.JSON_PROPERTY_E_MAIL_RECIPIENT_ERROR_IN_LOG,
  JobMasterData.JSON_PROPERTY_JOB_MAN_ID,
  JobMasterData.JSON_PROPERTY_E_MAIL_ACTIVE,
  JobMasterData.JSON_PROPERTY_GROUP_NAME,
  JobMasterData.JSON_PROPERTY_FIRE_EVENTS,
  JobMasterData.JSON_PROPERTY_EXECUTE_ONLY_ONCE,
  JobMasterData.JSON_PROPERTY_TECHNICAL_LOG_PATH
})
@JsonTypeName("jobMasterData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class JobMasterData {
  public static final String JSON_PROPERTY_JOB_NAME = "jobName";
  private String jobName;

  public static final String JSON_PROPERTY_E_MAIL_RECIPIENT = "eMailRecipient";
  private String eMailRecipient;

  public static final String JSON_PROPERTY_TECHNICAL_LOG_LEVEL = "technicalLogLevel";
  private String technicalLogLevel;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_E_MAIL_ON_ERROR_IN_LOG = "eMailOnErrorInLog";
  private Boolean eMailOnErrorInLog;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_JOB_GROUP = "jobGroup";
  private String jobGroup;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_E_MAIL_RECIPIENT_ERROR_IN_LOG = "eMailRecipientErrorInLog";
  private String eMailRecipientErrorInLog;

  public static final String JSON_PROPERTY_JOB_MAN_ID = "jobManId";
  private BigDecimal jobManId;

  public static final String JSON_PROPERTY_E_MAIL_ACTIVE = "eMailActive";
  private Boolean eMailActive;

  public static final String JSON_PROPERTY_GROUP_NAME = "groupName";
  private String groupName;

  public static final String JSON_PROPERTY_FIRE_EVENTS = "fireEvents";
  private Boolean fireEvents;

  public static final String JSON_PROPERTY_EXECUTE_ONLY_ONCE = "executeOnlyOnce";
  private Boolean executeOnlyOnce;

  public static final String JSON_PROPERTY_TECHNICAL_LOG_PATH = "technicalLogPath";
  private String technicalLogPath;

  public JobMasterData() {
  }

  public JobMasterData jobName(String jobName) {
    
    this.jobName = jobName;
    return this;
  }

   /**
   * Get jobName
   * @return jobName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOB_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJobName() {
    return jobName;
  }


  @JsonProperty(JSON_PROPERTY_JOB_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobName(String jobName) {
    this.jobName = jobName;
  }


  public JobMasterData eMailRecipient(String eMailRecipient) {
    
    this.eMailRecipient = eMailRecipient;
    return this;
  }

   /**
   * Get eMailRecipient
   * @return eMailRecipient
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_E_MAIL_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String geteMailRecipient() {
    return eMailRecipient;
  }


  @JsonProperty(JSON_PROPERTY_E_MAIL_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void seteMailRecipient(String eMailRecipient) {
    this.eMailRecipient = eMailRecipient;
  }


  public JobMasterData technicalLogLevel(String technicalLogLevel) {
    
    this.technicalLogLevel = technicalLogLevel;
    return this;
  }

   /**
   * Get technicalLogLevel
   * @return technicalLogLevel
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TECHNICAL_LOG_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTechnicalLogLevel() {
    return technicalLogLevel;
  }


  @JsonProperty(JSON_PROPERTY_TECHNICAL_LOG_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTechnicalLogLevel(String technicalLogLevel) {
    this.technicalLogLevel = technicalLogLevel;
  }


  public JobMasterData active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public JobMasterData eMailOnErrorInLog(Boolean eMailOnErrorInLog) {
    
    this.eMailOnErrorInLog = eMailOnErrorInLog;
    return this;
  }

   /**
   * Get eMailOnErrorInLog
   * @return eMailOnErrorInLog
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_E_MAIL_ON_ERROR_IN_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean geteMailOnErrorInLog() {
    return eMailOnErrorInLog;
  }


  @JsonProperty(JSON_PROPERTY_E_MAIL_ON_ERROR_IN_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void seteMailOnErrorInLog(Boolean eMailOnErrorInLog) {
    this.eMailOnErrorInLog = eMailOnErrorInLog;
  }


  public JobMasterData remark(String remark) {
    
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


  public JobMasterData jobGroup(String jobGroup) {
    
    this.jobGroup = jobGroup;
    return this;
  }

   /**
   * Get jobGroup
   * @return jobGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOB_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJobGroup() {
    return jobGroup;
  }


  @JsonProperty(JSON_PROPERTY_JOB_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobGroup(String jobGroup) {
    this.jobGroup = jobGroup;
  }


  public JobMasterData type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public JobMasterData userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  public JobMasterData elid(String elid) {
    
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


  public JobMasterData eMailRecipientErrorInLog(String eMailRecipientErrorInLog) {
    
    this.eMailRecipientErrorInLog = eMailRecipientErrorInLog;
    return this;
  }

   /**
   * Get eMailRecipientErrorInLog
   * @return eMailRecipientErrorInLog
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_E_MAIL_RECIPIENT_ERROR_IN_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String geteMailRecipientErrorInLog() {
    return eMailRecipientErrorInLog;
  }


  @JsonProperty(JSON_PROPERTY_E_MAIL_RECIPIENT_ERROR_IN_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void seteMailRecipientErrorInLog(String eMailRecipientErrorInLog) {
    this.eMailRecipientErrorInLog = eMailRecipientErrorInLog;
  }


  public JobMasterData jobManId(BigDecimal jobManId) {
    
    this.jobManId = jobManId;
    return this;
  }

   /**
   * Get jobManId
   * @return jobManId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOB_MAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getJobManId() {
    return jobManId;
  }


  @JsonProperty(JSON_PROPERTY_JOB_MAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobManId(BigDecimal jobManId) {
    this.jobManId = jobManId;
  }


  public JobMasterData eMailActive(Boolean eMailActive) {
    
    this.eMailActive = eMailActive;
    return this;
  }

   /**
   * Get eMailActive
   * @return eMailActive
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_E_MAIL_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean geteMailActive() {
    return eMailActive;
  }


  @JsonProperty(JSON_PROPERTY_E_MAIL_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void seteMailActive(Boolean eMailActive) {
    this.eMailActive = eMailActive;
  }


  public JobMasterData groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupName() {
    return groupName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public JobMasterData fireEvents(Boolean fireEvents) {
    
    this.fireEvents = fireEvents;
    return this;
  }

   /**
   * Get fireEvents
   * @return fireEvents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRE_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFireEvents() {
    return fireEvents;
  }


  @JsonProperty(JSON_PROPERTY_FIRE_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFireEvents(Boolean fireEvents) {
    this.fireEvents = fireEvents;
  }


  public JobMasterData executeOnlyOnce(Boolean executeOnlyOnce) {
    
    this.executeOnlyOnce = executeOnlyOnce;
    return this;
  }

   /**
   * Get executeOnlyOnce
   * @return executeOnlyOnce
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTE_ONLY_ONCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExecuteOnlyOnce() {
    return executeOnlyOnce;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTE_ONLY_ONCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecuteOnlyOnce(Boolean executeOnlyOnce) {
    this.executeOnlyOnce = executeOnlyOnce;
  }


  public JobMasterData technicalLogPath(String technicalLogPath) {
    
    this.technicalLogPath = technicalLogPath;
    return this;
  }

   /**
   * Get technicalLogPath
   * @return technicalLogPath
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TECHNICAL_LOG_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTechnicalLogPath() {
    return technicalLogPath;
  }


  @JsonProperty(JSON_PROPERTY_TECHNICAL_LOG_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTechnicalLogPath(String technicalLogPath) {
    this.technicalLogPath = technicalLogPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobMasterData jobMasterData = (JobMasterData) o;
    return Objects.equals(this.jobName, jobMasterData.jobName) &&
        Objects.equals(this.eMailRecipient, jobMasterData.eMailRecipient) &&
        Objects.equals(this.technicalLogLevel, jobMasterData.technicalLogLevel) &&
        Objects.equals(this.active, jobMasterData.active) &&
        Objects.equals(this.eMailOnErrorInLog, jobMasterData.eMailOnErrorInLog) &&
        Objects.equals(this.remark, jobMasterData.remark) &&
        Objects.equals(this.jobGroup, jobMasterData.jobGroup) &&
        Objects.equals(this.type, jobMasterData.type) &&
        Objects.equals(this.userName, jobMasterData.userName) &&
        Objects.equals(this.elid, jobMasterData.elid) &&
        Objects.equals(this.eMailRecipientErrorInLog, jobMasterData.eMailRecipientErrorInLog) &&
        Objects.equals(this.jobManId, jobMasterData.jobManId) &&
        Objects.equals(this.eMailActive, jobMasterData.eMailActive) &&
        Objects.equals(this.groupName, jobMasterData.groupName) &&
        Objects.equals(this.fireEvents, jobMasterData.fireEvents) &&
        Objects.equals(this.executeOnlyOnce, jobMasterData.executeOnlyOnce) &&
        Objects.equals(this.technicalLogPath, jobMasterData.technicalLogPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobName, eMailRecipient, technicalLogLevel, active, eMailOnErrorInLog, remark, jobGroup, type, userName, elid, eMailRecipientErrorInLog, jobManId, eMailActive, groupName, fireEvents, executeOnlyOnce, technicalLogPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobMasterData {\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    eMailRecipient: ").append(toIndentedString(eMailRecipient)).append("\n");
    sb.append("    technicalLogLevel: ").append(toIndentedString(technicalLogLevel)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    eMailOnErrorInLog: ").append(toIndentedString(eMailOnErrorInLog)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    jobGroup: ").append(toIndentedString(jobGroup)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    eMailRecipientErrorInLog: ").append(toIndentedString(eMailRecipientErrorInLog)).append("\n");
    sb.append("    jobManId: ").append(toIndentedString(jobManId)).append("\n");
    sb.append("    eMailActive: ").append(toIndentedString(eMailActive)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    fireEvents: ").append(toIndentedString(fireEvents)).append("\n");
    sb.append("    executeOnlyOnce: ").append(toIndentedString(executeOnlyOnce)).append("\n");
    sb.append("    technicalLogPath: ").append(toIndentedString(technicalLogPath)).append("\n");
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
