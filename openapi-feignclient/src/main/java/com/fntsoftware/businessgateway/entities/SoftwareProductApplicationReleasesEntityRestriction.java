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
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SoftwareProductApplicationReleasesEntityRestriction
 */
@JsonPropertyOrder({
  SoftwareProductApplicationReleasesEntityRestriction.JSON_PROPERTY_INSTALL_REQUIREMENT,
  SoftwareProductApplicationReleasesEntityRestriction.JSON_PROPERTY_APPLICATION,
  SoftwareProductApplicationReleasesEntityRestriction.JSON_PROPERTY_DESCRIPTION,
  SoftwareProductApplicationReleasesEntityRestriction.JSON_PROPERTY_HOTLINE_NO,
  SoftwareProductApplicationReleasesEntityRestriction.JSON_PROPERTY_REMARK,
  SoftwareProductApplicationReleasesEntityRestriction.JSON_PROPERTY_ID,
  SoftwareProductApplicationReleasesEntityRestriction.JSON_PROPERTY_ELID,
  SoftwareProductApplicationReleasesEntityRestriction.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class SoftwareProductApplicationReleasesEntityRestriction {
  public static final String JSON_PROPERTY_INSTALL_REQUIREMENT = "installRequirement";
  private RestrictionsString installRequirement;

  public static final String JSON_PROPERTY_APPLICATION = "application";
  private RestrictionsString application;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private RestrictionsString description;

  public static final String JSON_PROPERTY_HOTLINE_NO = "hotlineNo";
  private RestrictionsString hotlineNo;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_VERSION = "version";
  private RestrictionsString version;

  public SoftwareProductApplicationReleasesEntityRestriction() {
  }

  public SoftwareProductApplicationReleasesEntityRestriction installRequirement(RestrictionsString installRequirement) {
    
    this.installRequirement = installRequirement;
    return this;
  }

   /**
   * Get installRequirement
   * @return installRequirement
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTALL_REQUIREMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getInstallRequirement() {
    return installRequirement;
  }


  @JsonProperty(JSON_PROPERTY_INSTALL_REQUIREMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstallRequirement(RestrictionsString installRequirement) {
    this.installRequirement = installRequirement;
  }


  public SoftwareProductApplicationReleasesEntityRestriction application(RestrictionsString application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getApplication() {
    return application;
  }


  @JsonProperty(JSON_PROPERTY_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplication(RestrictionsString application) {
    this.application = application;
  }


  public SoftwareProductApplicationReleasesEntityRestriction description(RestrictionsString description) {
    
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

  public RestrictionsString getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(RestrictionsString description) {
    this.description = description;
  }


  public SoftwareProductApplicationReleasesEntityRestriction hotlineNo(RestrictionsString hotlineNo) {
    
    this.hotlineNo = hotlineNo;
    return this;
  }

   /**
   * Get hotlineNo
   * @return hotlineNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOTLINE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getHotlineNo() {
    return hotlineNo;
  }


  @JsonProperty(JSON_PROPERTY_HOTLINE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHotlineNo(RestrictionsString hotlineNo) {
    this.hotlineNo = hotlineNo;
  }


  public SoftwareProductApplicationReleasesEntityRestriction remark(RestrictionsString remark) {
    
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


  public SoftwareProductApplicationReleasesEntityRestriction id(RestrictionsString id) {
    
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


  public SoftwareProductApplicationReleasesEntityRestriction elid(RestrictionsString elid) {
    
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


  public SoftwareProductApplicationReleasesEntityRestriction version(RestrictionsString version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(RestrictionsString version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareProductApplicationReleasesEntityRestriction softwareProductApplicationReleasesEntityRestriction = (SoftwareProductApplicationReleasesEntityRestriction) o;
    return Objects.equals(this.installRequirement, softwareProductApplicationReleasesEntityRestriction.installRequirement) &&
        Objects.equals(this.application, softwareProductApplicationReleasesEntityRestriction.application) &&
        Objects.equals(this.description, softwareProductApplicationReleasesEntityRestriction.description) &&
        Objects.equals(this.hotlineNo, softwareProductApplicationReleasesEntityRestriction.hotlineNo) &&
        Objects.equals(this.remark, softwareProductApplicationReleasesEntityRestriction.remark) &&
        Objects.equals(this.id, softwareProductApplicationReleasesEntityRestriction.id) &&
        Objects.equals(this.elid, softwareProductApplicationReleasesEntityRestriction.elid) &&
        Objects.equals(this.version, softwareProductApplicationReleasesEntityRestriction.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installRequirement, application, description, hotlineNo, remark, id, elid, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareProductApplicationReleasesEntityRestriction {\n");
    sb.append("    installRequirement: ").append(toIndentedString(installRequirement)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hotlineNo: ").append(toIndentedString(hotlineNo)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
