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
 * UpdateSystemAttributesServerBaseAddUserRequestData
 */
@JsonPropertyOrder({
  UpdateSystemAttributesServerBaseAddUserRequestData.JSON_PROPERTY_MODIFY_PLAN,
  UpdateSystemAttributesServerBaseAddUserRequestData.JSON_PROPERTY_DELETE_REAL,
  UpdateSystemAttributesServerBaseAddUserRequestData.JSON_PROPERTY_READ_PLAN,
  UpdateSystemAttributesServerBaseAddUserRequestData.JSON_PROPERTY_MANDANT_ID,
  UpdateSystemAttributesServerBaseAddUserRequestData.JSON_PROPERTY_USER_ELID,
  UpdateSystemAttributesServerBaseAddUserRequestData.JSON_PROPERTY_MODIFY_REAL,
  UpdateSystemAttributesServerBaseAddUserRequestData.JSON_PROPERTY_READ_REAL,
  UpdateSystemAttributesServerBaseAddUserRequestData.JSON_PROPERTY_DELETE_PLAN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateSystemAttributesServerBaseAddUserRequestData {
  public static final String JSON_PROPERTY_MODIFY_PLAN = "modifyPlan";
  private Boolean modifyPlan;

  public static final String JSON_PROPERTY_DELETE_REAL = "deleteReal";
  private Boolean deleteReal;

  public static final String JSON_PROPERTY_READ_PLAN = "readPlan";
  private Boolean readPlan;

  public static final String JSON_PROPERTY_MANDANT_ID = "mandantId";
  private BigDecimal mandantId;

  public static final String JSON_PROPERTY_USER_ELID = "userElid";
  private String userElid;

  public static final String JSON_PROPERTY_MODIFY_REAL = "modifyReal";
  private Boolean modifyReal;

  public static final String JSON_PROPERTY_READ_REAL = "readReal";
  private Boolean readReal;

  public static final String JSON_PROPERTY_DELETE_PLAN = "deletePlan";
  private Boolean deletePlan;

  public UpdateSystemAttributesServerBaseAddUserRequestData() {
  }

  public UpdateSystemAttributesServerBaseAddUserRequestData modifyPlan(Boolean modifyPlan) {
    
    this.modifyPlan = modifyPlan;
    return this;
  }

   /**
   * Get modifyPlan
   * @return modifyPlan
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getModifyPlan() {
    return modifyPlan;
  }


  @JsonProperty(JSON_PROPERTY_MODIFY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifyPlan(Boolean modifyPlan) {
    this.modifyPlan = modifyPlan;
  }


  public UpdateSystemAttributesServerBaseAddUserRequestData deleteReal(Boolean deleteReal) {
    
    this.deleteReal = deleteReal;
    return this;
  }

   /**
   * Get deleteReal
   * @return deleteReal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_REAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleteReal() {
    return deleteReal;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_REAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteReal(Boolean deleteReal) {
    this.deleteReal = deleteReal;
  }


  public UpdateSystemAttributesServerBaseAddUserRequestData readPlan(Boolean readPlan) {
    
    this.readPlan = readPlan;
    return this;
  }

   /**
   * Get readPlan
   * @return readPlan
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_READ_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReadPlan() {
    return readPlan;
  }


  @JsonProperty(JSON_PROPERTY_READ_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadPlan(Boolean readPlan) {
    this.readPlan = readPlan;
  }


  public UpdateSystemAttributesServerBaseAddUserRequestData mandantId(BigDecimal mandantId) {
    
    this.mandantId = mandantId;
    return this;
  }

   /**
   * Get mandantId
   * @return mandantId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANDANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMandantId() {
    return mandantId;
  }


  @JsonProperty(JSON_PROPERTY_MANDANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandantId(BigDecimal mandantId) {
    this.mandantId = mandantId;
  }


  public UpdateSystemAttributesServerBaseAddUserRequestData userElid(String userElid) {
    
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


  public UpdateSystemAttributesServerBaseAddUserRequestData modifyReal(Boolean modifyReal) {
    
    this.modifyReal = modifyReal;
    return this;
  }

   /**
   * Get modifyReal
   * @return modifyReal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFY_REAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getModifyReal() {
    return modifyReal;
  }


  @JsonProperty(JSON_PROPERTY_MODIFY_REAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifyReal(Boolean modifyReal) {
    this.modifyReal = modifyReal;
  }


  public UpdateSystemAttributesServerBaseAddUserRequestData readReal(Boolean readReal) {
    
    this.readReal = readReal;
    return this;
  }

   /**
   * Get readReal
   * @return readReal
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_READ_REAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReadReal() {
    return readReal;
  }


  @JsonProperty(JSON_PROPERTY_READ_REAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadReal(Boolean readReal) {
    this.readReal = readReal;
  }


  public UpdateSystemAttributesServerBaseAddUserRequestData deletePlan(Boolean deletePlan) {
    
    this.deletePlan = deletePlan;
    return this;
  }

   /**
   * Get deletePlan
   * @return deletePlan
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeletePlan() {
    return deletePlan;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeletePlan(Boolean deletePlan) {
    this.deletePlan = deletePlan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSystemAttributesServerBaseAddUserRequestData updateSystemAttributesServerBaseAddUserRequestData = (UpdateSystemAttributesServerBaseAddUserRequestData) o;
    return Objects.equals(this.modifyPlan, updateSystemAttributesServerBaseAddUserRequestData.modifyPlan) &&
        Objects.equals(this.deleteReal, updateSystemAttributesServerBaseAddUserRequestData.deleteReal) &&
        Objects.equals(this.readPlan, updateSystemAttributesServerBaseAddUserRequestData.readPlan) &&
        Objects.equals(this.mandantId, updateSystemAttributesServerBaseAddUserRequestData.mandantId) &&
        Objects.equals(this.userElid, updateSystemAttributesServerBaseAddUserRequestData.userElid) &&
        Objects.equals(this.modifyReal, updateSystemAttributesServerBaseAddUserRequestData.modifyReal) &&
        Objects.equals(this.readReal, updateSystemAttributesServerBaseAddUserRequestData.readReal) &&
        Objects.equals(this.deletePlan, updateSystemAttributesServerBaseAddUserRequestData.deletePlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifyPlan, deleteReal, readPlan, mandantId, userElid, modifyReal, readReal, deletePlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemAttributesServerBaseAddUserRequestData {\n");
    sb.append("    modifyPlan: ").append(toIndentedString(modifyPlan)).append("\n");
    sb.append("    deleteReal: ").append(toIndentedString(deleteReal)).append("\n");
    sb.append("    readPlan: ").append(toIndentedString(readPlan)).append("\n");
    sb.append("    mandantId: ").append(toIndentedString(mandantId)).append("\n");
    sb.append("    userElid: ").append(toIndentedString(userElid)).append("\n");
    sb.append("    modifyReal: ").append(toIndentedString(modifyReal)).append("\n");
    sb.append("    readReal: ").append(toIndentedString(readReal)).append("\n");
    sb.append("    deletePlan: ").append(toIndentedString(deletePlan)).append("\n");
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
