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
 * TenantData
 */
@JsonPropertyOrder({
  TenantData.JSON_PROPERTY_INDIVIDUAL_ICON,
  TenantData.JSON_PROPERTY_VISIBLE_ID,
  TenantData.JSON_PROPERTY_ID,
  TenantData.JSON_PROPERTY_ELID
})
@JsonTypeName("tenantData")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class TenantData {
  public static final String JSON_PROPERTY_INDIVIDUAL_ICON = "individualIcon";
  private String individualIcon;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private String visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public TenantData() {
  }

  public TenantData individualIcon(String individualIcon) {
    
    this.individualIcon = individualIcon;
    return this;
  }

   /**
   * Get individualIcon
   * @return individualIcon
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDIVIDUAL_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIndividualIcon() {
    return individualIcon;
  }


  @JsonProperty(JSON_PROPERTY_INDIVIDUAL_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndividualIcon(String individualIcon) {
    this.individualIcon = individualIcon;
  }


  public TenantData visibleId(String visibleId) {
    
    this.visibleId = visibleId;
    return this;
  }

   /**
   * Get visibleId
   * @return visibleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisibleId() {
    return visibleId;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleId(String visibleId) {
    this.visibleId = visibleId;
  }


  public TenantData id(String id) {
    
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

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public TenantData elid(String elid) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantData tenantData = (TenantData) o;
    return Objects.equals(this.individualIcon, tenantData.individualIcon) &&
        Objects.equals(this.visibleId, tenantData.visibleId) &&
        Objects.equals(this.id, tenantData.id) &&
        Objects.equals(this.elid, tenantData.elid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(individualIcon, visibleId, id, elid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantData {\n");
    sb.append("    individualIcon: ").append(toIndentedString(individualIcon)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
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
