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
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RoleQueryRestriction
 */
@JsonPropertyOrder({
  RoleQueryRestriction.JSON_PROPERTY_ROLE_ID,
  RoleQueryRestriction.JSON_PROPERTY_DESCRIPTION2,
  RoleQueryRestriction.JSON_PROPERTY_TYPE,
  RoleQueryRestriction.JSON_PROPERTY_FIRST,
  RoleQueryRestriction.JSON_PROPERTY_DESCRIPTION1
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class RoleQueryRestriction {
  public static final String JSON_PROPERTY_ROLE_ID = "roleId";
  private RestrictionsNumeric roleId;

  public static final String JSON_PROPERTY_DESCRIPTION2 = "description2";
  private RestrictionsString description2;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RestrictionsString type;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public static final String JSON_PROPERTY_DESCRIPTION1 = "description1";
  private RestrictionsString description1;

  public RoleQueryRestriction() {
  }

  public RoleQueryRestriction roleId(RestrictionsNumeric roleId) {
    
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getRoleId() {
    return roleId;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleId(RestrictionsNumeric roleId) {
    this.roleId = roleId;
  }


  public RoleQueryRestriction description2(RestrictionsString description2) {
    
    this.description2 = description2;
    return this;
  }

   /**
   * Get description2
   * @return description2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDescription2() {
    return description2;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription2(RestrictionsString description2) {
    this.description2 = description2;
  }


  public RoleQueryRestriction type(RestrictionsString type) {
    
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

  public RestrictionsString getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(RestrictionsString type) {
    this.type = type;
  }


  public RoleQueryRestriction first(RestrictionsNumeric first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getFirst() {
    return first;
  }


  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirst(RestrictionsNumeric first) {
    this.first = first;
  }


  public RoleQueryRestriction description1(RestrictionsString description1) {
    
    this.description1 = description1;
    return this;
  }

   /**
   * Get description1
   * @return description1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDescription1() {
    return description1;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription1(RestrictionsString description1) {
    this.description1 = description1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleQueryRestriction roleQueryRestriction = (RoleQueryRestriction) o;
    return Objects.equals(this.roleId, roleQueryRestriction.roleId) &&
        Objects.equals(this.description2, roleQueryRestriction.description2) &&
        Objects.equals(this.type, roleQueryRestriction.type) &&
        Objects.equals(this.first, roleQueryRestriction.first) &&
        Objects.equals(this.description1, roleQueryRestriction.description1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, description2, type, first, description1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleQueryRestriction {\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    description1: ").append(toIndentedString(description1)).append("\n");
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
