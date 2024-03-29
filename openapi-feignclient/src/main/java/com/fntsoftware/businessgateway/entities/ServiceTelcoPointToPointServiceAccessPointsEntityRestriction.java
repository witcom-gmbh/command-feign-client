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
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceTelcoPointToPointServiceAccessPointsEntityRestriction
 */
@JsonPropertyOrder({
  ServiceTelcoPointToPointServiceAccessPointsEntityRestriction.JSON_PROPERTY_ENCAPSULATION,
  ServiceTelcoPointToPointServiceAccessPointsEntityRestriction.JSON_PROPERTY_C_DATA_SOURCE,
  ServiceTelcoPointToPointServiceAccessPointsEntityRestriction.JSON_PROPERTY_C_CVLAN,
  ServiceTelcoPointToPointServiceAccessPointsEntityRestriction.JSON_PROPERTY_C_TYPE,
  ServiceTelcoPointToPointServiceAccessPointsEntityRestriction.JSON_PROPERTY_DESCRIPTION,
  ServiceTelcoPointToPointServiceAccessPointsEntityRestriction.JSON_PROPERTY_C_DATA_SOURCE_ID,
  ServiceTelcoPointToPointServiceAccessPointsEntityRestriction.JSON_PROPERTY_ID,
  ServiceTelcoPointToPointServiceAccessPointsEntityRestriction.JSON_PROPERTY_ELID,
  ServiceTelcoPointToPointServiceAccessPointsEntityRestriction.JSON_PROPERTY_C_BW_PROFILE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class ServiceTelcoPointToPointServiceAccessPointsEntityRestriction {
  public static final String JSON_PROPERTY_ENCAPSULATION = "encapsulation";
  private RestrictionsString encapsulation;

  public static final String JSON_PROPERTY_C_DATA_SOURCE = "cDataSource";
  private RestrictionsString cDataSource;

  public static final String JSON_PROPERTY_C_CVLAN = "cCvlan";
  private RestrictionsString cCvlan;

  public static final String JSON_PROPERTY_C_TYPE = "cType";
  private RestrictionsString cType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private RestrictionsString description;

  public static final String JSON_PROPERTY_C_DATA_SOURCE_ID = "cDataSourceId";
  private RestrictionsString cDataSourceId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_C_BW_PROFILE = "cBwProfile";
  private RestrictionsString cBwProfile;

  public ServiceTelcoPointToPointServiceAccessPointsEntityRestriction() {
  }

  public ServiceTelcoPointToPointServiceAccessPointsEntityRestriction encapsulation(RestrictionsString encapsulation) {
    
    this.encapsulation = encapsulation;
    return this;
  }

   /**
   * Get encapsulation
   * @return encapsulation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENCAPSULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getEncapsulation() {
    return encapsulation;
  }


  @JsonProperty(JSON_PROPERTY_ENCAPSULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncapsulation(RestrictionsString encapsulation) {
    this.encapsulation = encapsulation;
  }


  public ServiceTelcoPointToPointServiceAccessPointsEntityRestriction cDataSource(RestrictionsString cDataSource) {
    
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


  public ServiceTelcoPointToPointServiceAccessPointsEntityRestriction cCvlan(RestrictionsString cCvlan) {
    
    this.cCvlan = cCvlan;
    return this;
  }

   /**
   * Get cCvlan
   * @return cCvlan
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_CVLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcCvlan() {
    return cCvlan;
  }


  @JsonProperty(JSON_PROPERTY_C_CVLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcCvlan(RestrictionsString cCvlan) {
    this.cCvlan = cCvlan;
  }


  public ServiceTelcoPointToPointServiceAccessPointsEntityRestriction cType(RestrictionsString cType) {
    
    this.cType = cType;
    return this;
  }

   /**
   * Get cType
   * @return cType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcType() {
    return cType;
  }


  @JsonProperty(JSON_PROPERTY_C_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcType(RestrictionsString cType) {
    this.cType = cType;
  }


  public ServiceTelcoPointToPointServiceAccessPointsEntityRestriction description(RestrictionsString description) {
    
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


  public ServiceTelcoPointToPointServiceAccessPointsEntityRestriction cDataSourceId(RestrictionsString cDataSourceId) {
    
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


  public ServiceTelcoPointToPointServiceAccessPointsEntityRestriction id(RestrictionsString id) {
    
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


  public ServiceTelcoPointToPointServiceAccessPointsEntityRestriction elid(RestrictionsString elid) {
    
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


  public ServiceTelcoPointToPointServiceAccessPointsEntityRestriction cBwProfile(RestrictionsString cBwProfile) {
    
    this.cBwProfile = cBwProfile;
    return this;
  }

   /**
   * Get cBwProfile
   * @return cBwProfile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_BW_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getcBwProfile() {
    return cBwProfile;
  }


  @JsonProperty(JSON_PROPERTY_C_BW_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcBwProfile(RestrictionsString cBwProfile) {
    this.cBwProfile = cBwProfile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceTelcoPointToPointServiceAccessPointsEntityRestriction serviceTelcoPointToPointServiceAccessPointsEntityRestriction = (ServiceTelcoPointToPointServiceAccessPointsEntityRestriction) o;
    return Objects.equals(this.encapsulation, serviceTelcoPointToPointServiceAccessPointsEntityRestriction.encapsulation) &&
        Objects.equals(this.cDataSource, serviceTelcoPointToPointServiceAccessPointsEntityRestriction.cDataSource) &&
        Objects.equals(this.cCvlan, serviceTelcoPointToPointServiceAccessPointsEntityRestriction.cCvlan) &&
        Objects.equals(this.cType, serviceTelcoPointToPointServiceAccessPointsEntityRestriction.cType) &&
        Objects.equals(this.description, serviceTelcoPointToPointServiceAccessPointsEntityRestriction.description) &&
        Objects.equals(this.cDataSourceId, serviceTelcoPointToPointServiceAccessPointsEntityRestriction.cDataSourceId) &&
        Objects.equals(this.id, serviceTelcoPointToPointServiceAccessPointsEntityRestriction.id) &&
        Objects.equals(this.elid, serviceTelcoPointToPointServiceAccessPointsEntityRestriction.elid) &&
        Objects.equals(this.cBwProfile, serviceTelcoPointToPointServiceAccessPointsEntityRestriction.cBwProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encapsulation, cDataSource, cCvlan, cType, description, cDataSourceId, id, elid, cBwProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceTelcoPointToPointServiceAccessPointsEntityRestriction {\n");
    sb.append("    encapsulation: ").append(toIndentedString(encapsulation)).append("\n");
    sb.append("    cDataSource: ").append(toIndentedString(cDataSource)).append("\n");
    sb.append("    cCvlan: ").append(toIndentedString(cCvlan)).append("\n");
    sb.append("    cType: ").append(toIndentedString(cType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cDataSourceId: ").append(toIndentedString(cDataSourceId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    cBwProfile: ").append(toIndentedString(cBwProfile)).append("\n");
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

