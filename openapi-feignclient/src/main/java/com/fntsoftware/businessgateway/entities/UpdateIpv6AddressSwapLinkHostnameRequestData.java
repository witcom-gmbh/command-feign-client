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
 * UpdateIpv6AddressSwapLinkHostnameRequestData
 */
@JsonPropertyOrder({
  UpdateIpv6AddressSwapLinkHostnameRequestData.JSON_PROPERTY_DOMAIN_ELID,
  UpdateIpv6AddressSwapLinkHostnameRequestData.JSON_PROPERTY_NEW_HOSTNAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateIpv6AddressSwapLinkHostnameRequestData {
  public static final String JSON_PROPERTY_DOMAIN_ELID = "domainElid";
  private String domainElid;

  public static final String JSON_PROPERTY_NEW_HOSTNAME = "newHostname";
  private String newHostname;

  public UpdateIpv6AddressSwapLinkHostnameRequestData() {
  }

  public UpdateIpv6AddressSwapLinkHostnameRequestData domainElid(String domainElid) {
    
    this.domainElid = domainElid;
    return this;
  }

   /**
   * Get domainElid
   * @return domainElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomainElid() {
    return domainElid;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainElid(String domainElid) {
    this.domainElid = domainElid;
  }


  public UpdateIpv6AddressSwapLinkHostnameRequestData newHostname(String newHostname) {
    
    this.newHostname = newHostname;
    return this;
  }

   /**
   * Get newHostname
   * @return newHostname
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEW_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewHostname() {
    return newHostname;
  }


  @JsonProperty(JSON_PROPERTY_NEW_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewHostname(String newHostname) {
    this.newHostname = newHostname;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateIpv6AddressSwapLinkHostnameRequestData updateIpv6AddressSwapLinkHostnameRequestData = (UpdateIpv6AddressSwapLinkHostnameRequestData) o;
    return Objects.equals(this.domainElid, updateIpv6AddressSwapLinkHostnameRequestData.domainElid) &&
        Objects.equals(this.newHostname, updateIpv6AddressSwapLinkHostnameRequestData.newHostname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainElid, newHostname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateIpv6AddressSwapLinkHostnameRequestData {\n");
    sb.append("    domainElid: ").append(toIndentedString(domainElid)).append("\n");
    sb.append("    newHostname: ").append(toIndentedString(newHostname)).append("\n");
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
