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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceMasterSignalmgmtQueryResponseData
 */
@JsonPropertyOrder({
  ServiceMasterSignalmgmtQueryResponseData.JSON_PROPERTY_ID_POSTFIX_MIN_LENGTH,
  ServiceMasterSignalmgmtQueryResponseData.JSON_PROPERTY_MANDANT_ONLY,
  ServiceMasterSignalmgmtQueryResponseData.JSON_PROPERTY_SIGNALPATH_TYPE,
  ServiceMasterSignalmgmtQueryResponseData.JSON_PROPERTY_SERVICE_CLASS,
  ServiceMasterSignalmgmtQueryResponseData.JSON_PROPERTY_ID_POSTFIX_START_AT,
  ServiceMasterSignalmgmtQueryResponseData.JSON_PROPERTY_DELETE_TYPE,
  ServiceMasterSignalmgmtQueryResponseData.JSON_PROPERTY_DESCRIPTION,
  ServiceMasterSignalmgmtQueryResponseData.JSON_PROPERTY_ID_PREFIX,
  ServiceMasterSignalmgmtQueryResponseData.JSON_PROPERTY_SERVICE_GROUP,
  ServiceMasterSignalmgmtQueryResponseData.JSON_PROPERTY_MEDIUM,
  ServiceMasterSignalmgmtQueryResponseData.JSON_PROPERTY_TYPE,
  ServiceMasterSignalmgmtQueryResponseData.JSON_PROPERTY_ELID,
  ServiceMasterSignalmgmtQueryResponseData.JSON_PROPERTY_IS_DEFAULT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class ServiceMasterSignalmgmtQueryResponseData {
  public static final String JSON_PROPERTY_ID_POSTFIX_MIN_LENGTH = "idPostfixMinLength";
  private BigDecimal idPostfixMinLength;

  public static final String JSON_PROPERTY_MANDANT_ONLY = "mandantOnly";
  private Boolean mandantOnly;

  public static final String JSON_PROPERTY_SIGNALPATH_TYPE = "signalpathType";
  private String signalpathType;

  public static final String JSON_PROPERTY_SERVICE_CLASS = "serviceClass";
  private String serviceClass;

  public static final String JSON_PROPERTY_ID_POSTFIX_START_AT = "idPostfixStartAt";
  private BigDecimal idPostfixStartAt;

  public static final String JSON_PROPERTY_DELETE_TYPE = "deleteType";
  private String deleteType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID_PREFIX = "idPrefix";
  private String idPrefix;

  public static final String JSON_PROPERTY_SERVICE_GROUP = "serviceGroup";
  private String serviceGroup;

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  private String medium;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public ServiceMasterSignalmgmtQueryResponseData() {
  }

  public ServiceMasterSignalmgmtQueryResponseData idPostfixMinLength(BigDecimal idPostfixMinLength) {
    
    this.idPostfixMinLength = idPostfixMinLength;
    return this;
  }

   /**
   * Get idPostfixMinLength
   * @return idPostfixMinLength
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_POSTFIX_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIdPostfixMinLength() {
    return idPostfixMinLength;
  }


  @JsonProperty(JSON_PROPERTY_ID_POSTFIX_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdPostfixMinLength(BigDecimal idPostfixMinLength) {
    this.idPostfixMinLength = idPostfixMinLength;
  }


  public ServiceMasterSignalmgmtQueryResponseData mandantOnly(Boolean mandantOnly) {
    
    this.mandantOnly = mandantOnly;
    return this;
  }

   /**
   * Get mandantOnly
   * @return mandantOnly
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANDANT_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMandantOnly() {
    return mandantOnly;
  }


  @JsonProperty(JSON_PROPERTY_MANDANT_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandantOnly(Boolean mandantOnly) {
    this.mandantOnly = mandantOnly;
  }


  public ServiceMasterSignalmgmtQueryResponseData signalpathType(String signalpathType) {
    
    this.signalpathType = signalpathType;
    return this;
  }

   /**
   * Get signalpathType
   * @return signalpathType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNALPATH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignalpathType() {
    return signalpathType;
  }


  @JsonProperty(JSON_PROPERTY_SIGNALPATH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignalpathType(String signalpathType) {
    this.signalpathType = signalpathType;
  }


  public ServiceMasterSignalmgmtQueryResponseData serviceClass(String serviceClass) {
    
    this.serviceClass = serviceClass;
    return this;
  }

   /**
   * Get serviceClass
   * @return serviceClass
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceClass() {
    return serviceClass;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceClass(String serviceClass) {
    this.serviceClass = serviceClass;
  }


  public ServiceMasterSignalmgmtQueryResponseData idPostfixStartAt(BigDecimal idPostfixStartAt) {
    
    this.idPostfixStartAt = idPostfixStartAt;
    return this;
  }

   /**
   * Get idPostfixStartAt
   * @return idPostfixStartAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_POSTFIX_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIdPostfixStartAt() {
    return idPostfixStartAt;
  }


  @JsonProperty(JSON_PROPERTY_ID_POSTFIX_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdPostfixStartAt(BigDecimal idPostfixStartAt) {
    this.idPostfixStartAt = idPostfixStartAt;
  }


  public ServiceMasterSignalmgmtQueryResponseData deleteType(String deleteType) {
    
    this.deleteType = deleteType;
    return this;
  }

   /**
   * Get deleteType
   * @return deleteType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeleteType() {
    return deleteType;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteType(String deleteType) {
    this.deleteType = deleteType;
  }


  public ServiceMasterSignalmgmtQueryResponseData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ServiceMasterSignalmgmtQueryResponseData idPrefix(String idPrefix) {
    
    this.idPrefix = idPrefix;
    return this;
  }

   /**
   * Get idPrefix
   * @return idPrefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdPrefix() {
    return idPrefix;
  }


  @JsonProperty(JSON_PROPERTY_ID_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdPrefix(String idPrefix) {
    this.idPrefix = idPrefix;
  }


  public ServiceMasterSignalmgmtQueryResponseData serviceGroup(String serviceGroup) {
    
    this.serviceGroup = serviceGroup;
    return this;
  }

   /**
   * Get serviceGroup
   * @return serviceGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceGroup() {
    return serviceGroup;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceGroup(String serviceGroup) {
    this.serviceGroup = serviceGroup;
  }


  public ServiceMasterSignalmgmtQueryResponseData medium(String medium) {
    
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

  public String getMedium() {
    return medium;
  }


  @JsonProperty(JSON_PROPERTY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedium(String medium) {
    this.medium = medium;
  }


  public ServiceMasterSignalmgmtQueryResponseData type(String type) {
    
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


  public ServiceMasterSignalmgmtQueryResponseData elid(String elid) {
    
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


  public ServiceMasterSignalmgmtQueryResponseData isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceMasterSignalmgmtQueryResponseData serviceMasterSignalmgmtQueryResponseData = (ServiceMasterSignalmgmtQueryResponseData) o;
    return Objects.equals(this.idPostfixMinLength, serviceMasterSignalmgmtQueryResponseData.idPostfixMinLength) &&
        Objects.equals(this.mandantOnly, serviceMasterSignalmgmtQueryResponseData.mandantOnly) &&
        Objects.equals(this.signalpathType, serviceMasterSignalmgmtQueryResponseData.signalpathType) &&
        Objects.equals(this.serviceClass, serviceMasterSignalmgmtQueryResponseData.serviceClass) &&
        Objects.equals(this.idPostfixStartAt, serviceMasterSignalmgmtQueryResponseData.idPostfixStartAt) &&
        Objects.equals(this.deleteType, serviceMasterSignalmgmtQueryResponseData.deleteType) &&
        Objects.equals(this.description, serviceMasterSignalmgmtQueryResponseData.description) &&
        Objects.equals(this.idPrefix, serviceMasterSignalmgmtQueryResponseData.idPrefix) &&
        Objects.equals(this.serviceGroup, serviceMasterSignalmgmtQueryResponseData.serviceGroup) &&
        Objects.equals(this.medium, serviceMasterSignalmgmtQueryResponseData.medium) &&
        Objects.equals(this.type, serviceMasterSignalmgmtQueryResponseData.type) &&
        Objects.equals(this.elid, serviceMasterSignalmgmtQueryResponseData.elid) &&
        Objects.equals(this.isDefault, serviceMasterSignalmgmtQueryResponseData.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPostfixMinLength, mandantOnly, signalpathType, serviceClass, idPostfixStartAt, deleteType, description, idPrefix, serviceGroup, medium, type, elid, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceMasterSignalmgmtQueryResponseData {\n");
    sb.append("    idPostfixMinLength: ").append(toIndentedString(idPostfixMinLength)).append("\n");
    sb.append("    mandantOnly: ").append(toIndentedString(mandantOnly)).append("\n");
    sb.append("    signalpathType: ").append(toIndentedString(signalpathType)).append("\n");
    sb.append("    serviceClass: ").append(toIndentedString(serviceClass)).append("\n");
    sb.append("    idPostfixStartAt: ").append(toIndentedString(idPostfixStartAt)).append("\n");
    sb.append("    deleteType: ").append(toIndentedString(deleteType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    idPrefix: ").append(toIndentedString(idPrefix)).append("\n");
    sb.append("    serviceGroup: ").append(toIndentedString(serviceGroup)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
