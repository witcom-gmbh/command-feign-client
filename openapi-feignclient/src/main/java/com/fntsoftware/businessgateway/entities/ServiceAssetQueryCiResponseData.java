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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceAssetQueryCiResponseData
 */
@JsonPropertyOrder({
  ServiceAssetQueryCiResponseData.JSON_PROPERTY_CI_ELID,
  ServiceAssetQueryCiResponseData.JSON_PROPERTY_ROLE,
  ServiceAssetQueryCiResponseData.JSON_PROPERTY_SERVICE_ASSET_ELID,
  ServiceAssetQueryCiResponseData.JSON_PROPERTY_INFO1,
  ServiceAssetQueryCiResponseData.JSON_PROPERTY_CI_LOCATION,
  ServiceAssetQueryCiResponseData.JSON_PROPERTY_DESCRIPTION,
  ServiceAssetQueryCiResponseData.JSON_PROPERTY_CI_CLASS,
  ServiceAssetQueryCiResponseData.JSON_PROPERTY_LINK_ELID,
  ServiceAssetQueryCiResponseData.JSON_PROPERTY_INFO3,
  ServiceAssetQueryCiResponseData.JSON_PROPERTY_CI_ID,
  ServiceAssetQueryCiResponseData.JSON_PROPERTY_INFO2
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class ServiceAssetQueryCiResponseData {
  public static final String JSON_PROPERTY_CI_ELID = "ciElid";
  private String ciElid;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public static final String JSON_PROPERTY_SERVICE_ASSET_ELID = "serviceAssetElid";
  private String serviceAssetElid;

  public static final String JSON_PROPERTY_INFO1 = "info1";
  private String info1;

  public static final String JSON_PROPERTY_CI_LOCATION = "ciLocation";
  private String ciLocation;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CI_CLASS = "ciClass";
  private String ciClass;

  public static final String JSON_PROPERTY_LINK_ELID = "linkElid";
  private String linkElid;

  public static final String JSON_PROPERTY_INFO3 = "info3";
  private String info3;

  public static final String JSON_PROPERTY_CI_ID = "ciId";
  private String ciId;

  public static final String JSON_PROPERTY_INFO2 = "info2";
  private String info2;

  public ServiceAssetQueryCiResponseData() {
  }

  public ServiceAssetQueryCiResponseData ciElid(String ciElid) {
    
    this.ciElid = ciElid;
    return this;
  }

   /**
   * Get ciElid
   * @return ciElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCiElid() {
    return ciElid;
  }


  @JsonProperty(JSON_PROPERTY_CI_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCiElid(String ciElid) {
    this.ciElid = ciElid;
  }


  public ServiceAssetQueryCiResponseData role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(String role) {
    this.role = role;
  }


  public ServiceAssetQueryCiResponseData serviceAssetElid(String serviceAssetElid) {
    
    this.serviceAssetElid = serviceAssetElid;
    return this;
  }

   /**
   * Get serviceAssetElid
   * @return serviceAssetElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_ASSET_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceAssetElid() {
    return serviceAssetElid;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ASSET_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceAssetElid(String serviceAssetElid) {
    this.serviceAssetElid = serviceAssetElid;
  }


  public ServiceAssetQueryCiResponseData info1(String info1) {
    
    this.info1 = info1;
    return this;
  }

   /**
   * Get info1
   * @return info1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFO1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInfo1() {
    return info1;
  }


  @JsonProperty(JSON_PROPERTY_INFO1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfo1(String info1) {
    this.info1 = info1;
  }


  public ServiceAssetQueryCiResponseData ciLocation(String ciLocation) {
    
    this.ciLocation = ciLocation;
    return this;
  }

   /**
   * Get ciLocation
   * @return ciLocation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCiLocation() {
    return ciLocation;
  }


  @JsonProperty(JSON_PROPERTY_CI_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCiLocation(String ciLocation) {
    this.ciLocation = ciLocation;
  }


  public ServiceAssetQueryCiResponseData description(String description) {
    
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


  public ServiceAssetQueryCiResponseData ciClass(String ciClass) {
    
    this.ciClass = ciClass;
    return this;
  }

   /**
   * Get ciClass
   * @return ciClass
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCiClass() {
    return ciClass;
  }


  @JsonProperty(JSON_PROPERTY_CI_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCiClass(String ciClass) {
    this.ciClass = ciClass;
  }


  public ServiceAssetQueryCiResponseData linkElid(String linkElid) {
    
    this.linkElid = linkElid;
    return this;
  }

   /**
   * Get linkElid
   * @return linkElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkElid() {
    return linkElid;
  }


  @JsonProperty(JSON_PROPERTY_LINK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkElid(String linkElid) {
    this.linkElid = linkElid;
  }


  public ServiceAssetQueryCiResponseData info3(String info3) {
    
    this.info3 = info3;
    return this;
  }

   /**
   * Get info3
   * @return info3
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFO3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInfo3() {
    return info3;
  }


  @JsonProperty(JSON_PROPERTY_INFO3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfo3(String info3) {
    this.info3 = info3;
  }


  public ServiceAssetQueryCiResponseData ciId(String ciId) {
    
    this.ciId = ciId;
    return this;
  }

   /**
   * Get ciId
   * @return ciId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CI_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCiId() {
    return ciId;
  }


  @JsonProperty(JSON_PROPERTY_CI_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCiId(String ciId) {
    this.ciId = ciId;
  }


  public ServiceAssetQueryCiResponseData info2(String info2) {
    
    this.info2 = info2;
    return this;
  }

   /**
   * Get info2
   * @return info2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFO2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInfo2() {
    return info2;
  }


  @JsonProperty(JSON_PROPERTY_INFO2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfo2(String info2) {
    this.info2 = info2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAssetQueryCiResponseData serviceAssetQueryCiResponseData = (ServiceAssetQueryCiResponseData) o;
    return Objects.equals(this.ciElid, serviceAssetQueryCiResponseData.ciElid) &&
        Objects.equals(this.role, serviceAssetQueryCiResponseData.role) &&
        Objects.equals(this.serviceAssetElid, serviceAssetQueryCiResponseData.serviceAssetElid) &&
        Objects.equals(this.info1, serviceAssetQueryCiResponseData.info1) &&
        Objects.equals(this.ciLocation, serviceAssetQueryCiResponseData.ciLocation) &&
        Objects.equals(this.description, serviceAssetQueryCiResponseData.description) &&
        Objects.equals(this.ciClass, serviceAssetQueryCiResponseData.ciClass) &&
        Objects.equals(this.linkElid, serviceAssetQueryCiResponseData.linkElid) &&
        Objects.equals(this.info3, serviceAssetQueryCiResponseData.info3) &&
        Objects.equals(this.ciId, serviceAssetQueryCiResponseData.ciId) &&
        Objects.equals(this.info2, serviceAssetQueryCiResponseData.info2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciElid, role, serviceAssetElid, info1, ciLocation, description, ciClass, linkElid, info3, ciId, info2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAssetQueryCiResponseData {\n");
    sb.append("    ciElid: ").append(toIndentedString(ciElid)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    serviceAssetElid: ").append(toIndentedString(serviceAssetElid)).append("\n");
    sb.append("    info1: ").append(toIndentedString(info1)).append("\n");
    sb.append("    ciLocation: ").append(toIndentedString(ciLocation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ciClass: ").append(toIndentedString(ciClass)).append("\n");
    sb.append("    linkElid: ").append(toIndentedString(linkElid)).append("\n");
    sb.append("    info3: ").append(toIndentedString(info3)).append("\n");
    sb.append("    ciId: ").append(toIndentedString(ciId)).append("\n");
    sb.append("    info2: ").append(toIndentedString(info2)).append("\n");
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
