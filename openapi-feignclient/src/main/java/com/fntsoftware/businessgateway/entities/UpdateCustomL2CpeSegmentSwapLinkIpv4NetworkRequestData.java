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
 * UpdateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData
 */
@JsonPropertyOrder({
  UpdateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData.JSON_PROPERTY_LINKED_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData {
  public static final String JSON_PROPERTY_LINKED_ELID = "linkedElid";
  private String linkedElid;

  public UpdateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData() {
  }

  public UpdateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData linkedElid(String linkedElid) {
    
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
    UpdateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData updateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData = (UpdateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData) o;
    return Objects.equals(this.linkedElid, updateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData.linkedElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomL2CpeSegmentSwapLinkIpv4NetworkRequestData {\n");
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
