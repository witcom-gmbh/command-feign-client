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
 * CreateVirtualServerCreateLinkMaintenanceWindowRequestData
 */
@JsonPropertyOrder({
  CreateVirtualServerCreateLinkMaintenanceWindowRequestData.JSON_PROPERTY_TIMEZONE,
  CreateVirtualServerCreateLinkMaintenanceWindowRequestData.JSON_PROPERTY_IMPACT,
  CreateVirtualServerCreateLinkMaintenanceWindowRequestData.JSON_PROPERTY_LINKED_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class CreateVirtualServerCreateLinkMaintenanceWindowRequestData {
  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_IMPACT = "impact";
  private String impact;

  public static final String JSON_PROPERTY_LINKED_ELID = "linkedElid";
  private String linkedElid;

  public CreateVirtualServerCreateLinkMaintenanceWindowRequestData() {
  }

  public CreateVirtualServerCreateLinkMaintenanceWindowRequestData timezone(String timezone) {
    
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

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public CreateVirtualServerCreateLinkMaintenanceWindowRequestData impact(String impact) {
    
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

  public String getImpact() {
    return impact;
  }


  @JsonProperty(JSON_PROPERTY_IMPACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpact(String impact) {
    this.impact = impact;
  }


  public CreateVirtualServerCreateLinkMaintenanceWindowRequestData linkedElid(String linkedElid) {
    
    this.linkedElid = linkedElid;
    return this;
  }

   /**
   * Get linkedElid
   * @return linkedElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkedElid() {
    return linkedElid;
  }


  @JsonProperty(JSON_PROPERTY_LINKED_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkedElid(String linkedElid) {
    this.linkedElid = linkedElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVirtualServerCreateLinkMaintenanceWindowRequestData createVirtualServerCreateLinkMaintenanceWindowRequestData = (CreateVirtualServerCreateLinkMaintenanceWindowRequestData) o;
    return Objects.equals(this.timezone, createVirtualServerCreateLinkMaintenanceWindowRequestData.timezone) &&
        Objects.equals(this.impact, createVirtualServerCreateLinkMaintenanceWindowRequestData.impact) &&
        Objects.equals(this.linkedElid, createVirtualServerCreateLinkMaintenanceWindowRequestData.linkedElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timezone, impact, linkedElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVirtualServerCreateLinkMaintenanceWindowRequestData {\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    linkedElid: ").append(toIndentedString(linkedElid)).append("\n");
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

