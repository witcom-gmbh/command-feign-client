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
 * StorageUnitLunMaintenanceWindowsRelationRestriction
 */
@JsonPropertyOrder({
  StorageUnitLunMaintenanceWindowsRelationRestriction.JSON_PROPERTY_TIMEZONE,
  StorageUnitLunMaintenanceWindowsRelationRestriction.JSON_PROPERTY_IMPACT,
  StorageUnitLunMaintenanceWindowsRelationRestriction.JSON_PROPERTY_LINK_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class StorageUnitLunMaintenanceWindowsRelationRestriction {
  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private RestrictionsString timezone;

  public static final String JSON_PROPERTY_IMPACT = "impact";
  private RestrictionsString impact;

  public static final String JSON_PROPERTY_LINK_ELID = "linkElid";
  private RestrictionsString linkElid;

  public StorageUnitLunMaintenanceWindowsRelationRestriction() {
  }

  public StorageUnitLunMaintenanceWindowsRelationRestriction timezone(RestrictionsString timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(RestrictionsString timezone) {
    this.timezone = timezone;
  }


  public StorageUnitLunMaintenanceWindowsRelationRestriction impact(RestrictionsString impact) {
    
    this.impact = impact;
    return this;
  }

   /**
   * Get impact
   * @return impact
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getImpact() {
    return impact;
  }


  @JsonProperty(JSON_PROPERTY_IMPACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpact(RestrictionsString impact) {
    this.impact = impact;
  }


  public StorageUnitLunMaintenanceWindowsRelationRestriction linkElid(RestrictionsString linkElid) {
    
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

  public RestrictionsString getLinkElid() {
    return linkElid;
  }


  @JsonProperty(JSON_PROPERTY_LINK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkElid(RestrictionsString linkElid) {
    this.linkElid = linkElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageUnitLunMaintenanceWindowsRelationRestriction storageUnitLunMaintenanceWindowsRelationRestriction = (StorageUnitLunMaintenanceWindowsRelationRestriction) o;
    return Objects.equals(this.timezone, storageUnitLunMaintenanceWindowsRelationRestriction.timezone) &&
        Objects.equals(this.impact, storageUnitLunMaintenanceWindowsRelationRestriction.impact) &&
        Objects.equals(this.linkElid, storageUnitLunMaintenanceWindowsRelationRestriction.linkElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timezone, impact, linkElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageUnitLunMaintenanceWindowsRelationRestriction {\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    linkElid: ").append(toIndentedString(linkElid)).append("\n");
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
