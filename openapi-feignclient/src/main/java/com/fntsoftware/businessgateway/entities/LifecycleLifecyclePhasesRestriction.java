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
import com.fntsoftware.businessgateway.entities.RestrictionsBoolean;
import com.fntsoftware.businessgateway.entities.RestrictionsDate;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * LifecycleLifecyclePhasesRestriction
 */
@JsonPropertyOrder({
  LifecycleLifecyclePhasesRestriction.JSON_PROPERTY_PHASE,
  LifecycleLifecyclePhasesRestriction.JSON_PROPERTY_ALLOW_CREATE,
  LifecycleLifecyclePhasesRestriction.JSON_PROPERTY_END_DATE,
  LifecycleLifecyclePhasesRestriction.JSON_PROPERTY_ELID,
  LifecycleLifecyclePhasesRestriction.JSON_PROPERTY_START_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class LifecycleLifecyclePhasesRestriction {
  public static final String JSON_PROPERTY_PHASE = "phase";
  private RestrictionsString phase;

  public static final String JSON_PROPERTY_ALLOW_CREATE = "allowCreate";
  private RestrictionsBoolean allowCreate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private RestrictionsDate endDate;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private RestrictionsDate startDate;

  public LifecycleLifecyclePhasesRestriction() {
  }

  public LifecycleLifecyclePhasesRestriction phase(RestrictionsString phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPhase() {
    return phase;
  }


  @JsonProperty(JSON_PROPERTY_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhase(RestrictionsString phase) {
    this.phase = phase;
  }


  public LifecycleLifecyclePhasesRestriction allowCreate(RestrictionsBoolean allowCreate) {
    
    this.allowCreate = allowCreate;
    return this;
  }

   /**
   * Get allowCreate
   * @return allowCreate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_CREATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getAllowCreate() {
    return allowCreate;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_CREATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowCreate(RestrictionsBoolean allowCreate) {
    this.allowCreate = allowCreate;
  }


  public LifecycleLifecyclePhasesRestriction endDate(RestrictionsDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(RestrictionsDate endDate) {
    this.endDate = endDate;
  }


  public LifecycleLifecyclePhasesRestriction elid(RestrictionsString elid) {
    
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


  public LifecycleLifecyclePhasesRestriction startDate(RestrictionsDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(RestrictionsDate startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifecycleLifecyclePhasesRestriction lifecycleLifecyclePhasesRestriction = (LifecycleLifecyclePhasesRestriction) o;
    return Objects.equals(this.phase, lifecycleLifecyclePhasesRestriction.phase) &&
        Objects.equals(this.allowCreate, lifecycleLifecyclePhasesRestriction.allowCreate) &&
        Objects.equals(this.endDate, lifecycleLifecyclePhasesRestriction.endDate) &&
        Objects.equals(this.elid, lifecycleLifecyclePhasesRestriction.elid) &&
        Objects.equals(this.startDate, lifecycleLifecyclePhasesRestriction.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phase, allowCreate, endDate, elid, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifecycleLifecyclePhasesRestriction {\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    allowCreate: ").append(toIndentedString(allowCreate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
