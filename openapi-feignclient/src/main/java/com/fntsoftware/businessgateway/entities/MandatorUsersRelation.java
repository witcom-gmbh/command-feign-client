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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MandatorUsersRelation
 */
@JsonPropertyOrder({
  MandatorUsersRelation.JSON_PROPERTY_ZONE_VIEW,
  MandatorUsersRelation.JSON_PROPERTY_ACCESS,
  MandatorUsersRelation.JSON_PROPERTY_DESCRIPTION,
  MandatorUsersRelation.JSON_PROPERTY_READ_ONLY,
  MandatorUsersRelation.JSON_PROPERTY_ROLE_ADDITION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class MandatorUsersRelation {
  public static final String JSON_PROPERTY_ZONE_VIEW = "zoneView";
  private Boolean zoneView;

  public static final String JSON_PROPERTY_ACCESS = "access";
  private String access;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_READ_ONLY = "readOnly";
  private Boolean readOnly;

  public static final String JSON_PROPERTY_ROLE_ADDITION = "roleAddition";
  private Boolean roleAddition;

  public MandatorUsersRelation() {
  }

  public MandatorUsersRelation zoneView(Boolean zoneView) {
    
    this.zoneView = zoneView;
    return this;
  }

   /**
   * Get zoneView
   * @return zoneView
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZONE_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getZoneView() {
    return zoneView;
  }


  @JsonProperty(JSON_PROPERTY_ZONE_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZoneView(Boolean zoneView) {
    this.zoneView = zoneView;
  }


  public MandatorUsersRelation access(String access) {
    
    this.access = access;
    return this;
  }

   /**
   * Get access
   * @return access
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccess() {
    return access;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccess(String access) {
    this.access = access;
  }


  public MandatorUsersRelation description(String description) {
    
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


  public MandatorUsersRelation readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_READ_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReadOnly() {
    return readOnly;
  }


  @JsonProperty(JSON_PROPERTY_READ_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public MandatorUsersRelation roleAddition(Boolean roleAddition) {
    
    this.roleAddition = roleAddition;
    return this;
  }

   /**
   * Get roleAddition
   * @return roleAddition
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_ADDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRoleAddition() {
    return roleAddition;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ADDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleAddition(Boolean roleAddition) {
    this.roleAddition = roleAddition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandatorUsersRelation mandatorUsersRelation = (MandatorUsersRelation) o;
    return Objects.equals(this.zoneView, mandatorUsersRelation.zoneView) &&
        Objects.equals(this.access, mandatorUsersRelation.access) &&
        Objects.equals(this.description, mandatorUsersRelation.description) &&
        Objects.equals(this.readOnly, mandatorUsersRelation.readOnly) &&
        Objects.equals(this.roleAddition, mandatorUsersRelation.roleAddition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoneView, access, description, readOnly, roleAddition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandatorUsersRelation {\n");
    sb.append("    zoneView: ").append(toIndentedString(zoneView)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    roleAddition: ").append(toIndentedString(roleAddition)).append("\n");
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
