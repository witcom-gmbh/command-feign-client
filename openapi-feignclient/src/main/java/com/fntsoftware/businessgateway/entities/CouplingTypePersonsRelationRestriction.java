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
 * CouplingTypePersonsRelationRestriction
 */
@JsonPropertyOrder({
  CouplingTypePersonsRelationRestriction.JSON_PROPERTY_ROLE,
  CouplingTypePersonsRelationRestriction.JSON_PROPERTY_LINK_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CouplingTypePersonsRelationRestriction {
  public static final String JSON_PROPERTY_ROLE = "role";
  private RestrictionsString role;

  public static final String JSON_PROPERTY_LINK_ELID = "linkElid";
  private RestrictionsString linkElid;

  public CouplingTypePersonsRelationRestriction() {
  }

  public CouplingTypePersonsRelationRestriction role(RestrictionsString role) {
    
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

  public RestrictionsString getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(RestrictionsString role) {
    this.role = role;
  }


  public CouplingTypePersonsRelationRestriction linkElid(RestrictionsString linkElid) {
    
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
    CouplingTypePersonsRelationRestriction couplingTypePersonsRelationRestriction = (CouplingTypePersonsRelationRestriction) o;
    return Objects.equals(this.role, couplingTypePersonsRelationRestriction.role) &&
        Objects.equals(this.linkElid, couplingTypePersonsRelationRestriction.linkElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, linkElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouplingTypePersonsRelationRestriction {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
