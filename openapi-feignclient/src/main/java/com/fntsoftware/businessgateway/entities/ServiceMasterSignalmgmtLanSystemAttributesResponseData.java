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
 * ServiceMasterSignalmgmtLanSystemAttributesResponseData
 */
@JsonPropertyOrder({
  ServiceMasterSignalmgmtLanSystemAttributesResponseData.JSON_PROPERTY_OWNER,
  ServiceMasterSignalmgmtLanSystemAttributesResponseData.JSON_PROPERTY_LAST_UPDATED_BY,
  ServiceMasterSignalmgmtLanSystemAttributesResponseData.JSON_PROPERTY_LAST_UPDATED_AT,
  ServiceMasterSignalmgmtLanSystemAttributesResponseData.JSON_PROPERTY_SYSTEM_OWNER,
  ServiceMasterSignalmgmtLanSystemAttributesResponseData.JSON_PROPERTY_ELID,
  ServiceMasterSignalmgmtLanSystemAttributesResponseData.JSON_PROPERTY_UUID,
  ServiceMasterSignalmgmtLanSystemAttributesResponseData.JSON_PROPERTY_CREATE_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class ServiceMasterSignalmgmtLanSystemAttributesResponseData {
  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_LAST_UPDATED_BY = "lastUpdatedBy";
  private String lastUpdatedBy;

  public static final String JSON_PROPERTY_LAST_UPDATED_AT = "lastUpdatedAt";
  private DateTime lastUpdatedAt;

  public static final String JSON_PROPERTY_SYSTEM_OWNER = "systemOwner";
  private String systemOwner;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  private DateTime createDate;

  public ServiceMasterSignalmgmtLanSystemAttributesResponseData() {
  }

  public ServiceMasterSignalmgmtLanSystemAttributesResponseData owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  public ServiceMasterSignalmgmtLanSystemAttributesResponseData lastUpdatedBy(String lastUpdatedBy) {
    
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  public ServiceMasterSignalmgmtLanSystemAttributesResponseData lastUpdatedAt(DateTime lastUpdatedAt) {
    
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

   /**
   * Get lastUpdatedAt
   * @return lastUpdatedAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getLastUpdatedAt() {
    return lastUpdatedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdatedAt(DateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }


  public ServiceMasterSignalmgmtLanSystemAttributesResponseData systemOwner(String systemOwner) {
    
    this.systemOwner = systemOwner;
    return this;
  }

   /**
   * Get systemOwner
   * @return systemOwner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSystemOwner() {
    return systemOwner;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemOwner(String systemOwner) {
    this.systemOwner = systemOwner;
  }


  public ServiceMasterSignalmgmtLanSystemAttributesResponseData elid(String elid) {
    
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


  public ServiceMasterSignalmgmtLanSystemAttributesResponseData uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public ServiceMasterSignalmgmtLanSystemAttributesResponseData createDate(DateTime createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getCreateDate() {
    return createDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateDate(DateTime createDate) {
    this.createDate = createDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceMasterSignalmgmtLanSystemAttributesResponseData serviceMasterSignalmgmtLanSystemAttributesResponseData = (ServiceMasterSignalmgmtLanSystemAttributesResponseData) o;
    return Objects.equals(this.owner, serviceMasterSignalmgmtLanSystemAttributesResponseData.owner) &&
        Objects.equals(this.lastUpdatedBy, serviceMasterSignalmgmtLanSystemAttributesResponseData.lastUpdatedBy) &&
        Objects.equals(this.lastUpdatedAt, serviceMasterSignalmgmtLanSystemAttributesResponseData.lastUpdatedAt) &&
        Objects.equals(this.systemOwner, serviceMasterSignalmgmtLanSystemAttributesResponseData.systemOwner) &&
        Objects.equals(this.elid, serviceMasterSignalmgmtLanSystemAttributesResponseData.elid) &&
        Objects.equals(this.uuid, serviceMasterSignalmgmtLanSystemAttributesResponseData.uuid) &&
        Objects.equals(this.createDate, serviceMasterSignalmgmtLanSystemAttributesResponseData.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, lastUpdatedBy, lastUpdatedAt, systemOwner, elid, uuid, createDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceMasterSignalmgmtLanSystemAttributesResponseData {\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    systemOwner: ").append(toIndentedString(systemOwner)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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
