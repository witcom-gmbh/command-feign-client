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
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RoomIpv4NetrangesEntityRestriction
 */
@JsonPropertyOrder({
  RoomIpv4NetrangesEntityRestriction.JSON_PROPERTY_END_IP,
  RoomIpv4NetrangesEntityRestriction.JSON_PROPERTY_DOMAIN_ELID,
  RoomIpv4NetrangesEntityRestriction.JSON_PROPERTY_NETRANGE_NAME_ELID,
  RoomIpv4NetrangesEntityRestriction.JSON_PROPERTY_START_IP,
  RoomIpv4NetrangesEntityRestriction.JSON_PROPERTY_BLOCKED,
  RoomIpv4NetrangesEntityRestriction.JSON_PROPERTY_REMARK,
  RoomIpv4NetrangesEntityRestriction.JSON_PROPERTY_ELID,
  RoomIpv4NetrangesEntityRestriction.JSON_PROPERTY_NETWORK_ELID,
  RoomIpv4NetrangesEntityRestriction.JSON_PROPERTY_DHCP,
  RoomIpv4NetrangesEntityRestriction.JSON_PROPERTY_NET_CLIENT_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class RoomIpv4NetrangesEntityRestriction {
  public static final String JSON_PROPERTY_END_IP = "endIp";
  private RestrictionsString endIp;

  public static final String JSON_PROPERTY_DOMAIN_ELID = "domainElid";
  private RestrictionsString domainElid;

  public static final String JSON_PROPERTY_NETRANGE_NAME_ELID = "netrangeNameElid";
  private RestrictionsString netrangeNameElid;

  public static final String JSON_PROPERTY_START_IP = "startIp";
  private RestrictionsString startIp;

  public static final String JSON_PROPERTY_BLOCKED = "blocked";
  private RestrictionsBoolean blocked;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_NETWORK_ELID = "networkElid";
  private RestrictionsString networkElid;

  public static final String JSON_PROPERTY_DHCP = "dhcp";
  private RestrictionsBoolean dhcp;

  public static final String JSON_PROPERTY_NET_CLIENT_ELID = "netClientElid";
  private RestrictionsString netClientElid;

  public RoomIpv4NetrangesEntityRestriction() {
  }

  public RoomIpv4NetrangesEntityRestriction endIp(RestrictionsString endIp) {
    
    this.endIp = endIp;
    return this;
  }

   /**
   * Get endIp
   * @return endIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getEndIp() {
    return endIp;
  }


  @JsonProperty(JSON_PROPERTY_END_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndIp(RestrictionsString endIp) {
    this.endIp = endIp;
  }


  public RoomIpv4NetrangesEntityRestriction domainElid(RestrictionsString domainElid) {
    
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

  public RestrictionsString getDomainElid() {
    return domainElid;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainElid(RestrictionsString domainElid) {
    this.domainElid = domainElid;
  }


  public RoomIpv4NetrangesEntityRestriction netrangeNameElid(RestrictionsString netrangeNameElid) {
    
    this.netrangeNameElid = netrangeNameElid;
    return this;
  }

   /**
   * Get netrangeNameElid
   * @return netrangeNameElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETRANGE_NAME_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getNetrangeNameElid() {
    return netrangeNameElid;
  }


  @JsonProperty(JSON_PROPERTY_NETRANGE_NAME_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetrangeNameElid(RestrictionsString netrangeNameElid) {
    this.netrangeNameElid = netrangeNameElid;
  }


  public RoomIpv4NetrangesEntityRestriction startIp(RestrictionsString startIp) {
    
    this.startIp = startIp;
    return this;
  }

   /**
   * Get startIp
   * @return startIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getStartIp() {
    return startIp;
  }


  @JsonProperty(JSON_PROPERTY_START_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIp(RestrictionsString startIp) {
    this.startIp = startIp;
  }


  public RoomIpv4NetrangesEntityRestriction blocked(RestrictionsBoolean blocked) {
    
    this.blocked = blocked;
    return this;
  }

   /**
   * Get blocked
   * @return blocked
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getBlocked() {
    return blocked;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlocked(RestrictionsBoolean blocked) {
    this.blocked = blocked;
  }


  public RoomIpv4NetrangesEntityRestriction remark(RestrictionsString remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(RestrictionsString remark) {
    this.remark = remark;
  }


  public RoomIpv4NetrangesEntityRestriction elid(RestrictionsString elid) {
    
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


  public RoomIpv4NetrangesEntityRestriction networkElid(RestrictionsString networkElid) {
    
    this.networkElid = networkElid;
    return this;
  }

   /**
   * Get networkElid
   * @return networkElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getNetworkElid() {
    return networkElid;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkElid(RestrictionsString networkElid) {
    this.networkElid = networkElid;
  }


  public RoomIpv4NetrangesEntityRestriction dhcp(RestrictionsBoolean dhcp) {
    
    this.dhcp = dhcp;
    return this;
  }

   /**
   * Get dhcp
   * @return dhcp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DHCP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getDhcp() {
    return dhcp;
  }


  @JsonProperty(JSON_PROPERTY_DHCP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDhcp(RestrictionsBoolean dhcp) {
    this.dhcp = dhcp;
  }


  public RoomIpv4NetrangesEntityRestriction netClientElid(RestrictionsString netClientElid) {
    
    this.netClientElid = netClientElid;
    return this;
  }

   /**
   * Get netClientElid
   * @return netClientElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NET_CLIENT_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getNetClientElid() {
    return netClientElid;
  }


  @JsonProperty(JSON_PROPERTY_NET_CLIENT_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetClientElid(RestrictionsString netClientElid) {
    this.netClientElid = netClientElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomIpv4NetrangesEntityRestriction roomIpv4NetrangesEntityRestriction = (RoomIpv4NetrangesEntityRestriction) o;
    return Objects.equals(this.endIp, roomIpv4NetrangesEntityRestriction.endIp) &&
        Objects.equals(this.domainElid, roomIpv4NetrangesEntityRestriction.domainElid) &&
        Objects.equals(this.netrangeNameElid, roomIpv4NetrangesEntityRestriction.netrangeNameElid) &&
        Objects.equals(this.startIp, roomIpv4NetrangesEntityRestriction.startIp) &&
        Objects.equals(this.blocked, roomIpv4NetrangesEntityRestriction.blocked) &&
        Objects.equals(this.remark, roomIpv4NetrangesEntityRestriction.remark) &&
        Objects.equals(this.elid, roomIpv4NetrangesEntityRestriction.elid) &&
        Objects.equals(this.networkElid, roomIpv4NetrangesEntityRestriction.networkElid) &&
        Objects.equals(this.dhcp, roomIpv4NetrangesEntityRestriction.dhcp) &&
        Objects.equals(this.netClientElid, roomIpv4NetrangesEntityRestriction.netClientElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endIp, domainElid, netrangeNameElid, startIp, blocked, remark, elid, networkElid, dhcp, netClientElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomIpv4NetrangesEntityRestriction {\n");
    sb.append("    endIp: ").append(toIndentedString(endIp)).append("\n");
    sb.append("    domainElid: ").append(toIndentedString(domainElid)).append("\n");
    sb.append("    netrangeNameElid: ").append(toIndentedString(netrangeNameElid)).append("\n");
    sb.append("    startIp: ").append(toIndentedString(startIp)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    networkElid: ").append(toIndentedString(networkElid)).append("\n");
    sb.append("    dhcp: ").append(toIndentedString(dhcp)).append("\n");
    sb.append("    netClientElid: ").append(toIndentedString(netClientElid)).append("\n");
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
