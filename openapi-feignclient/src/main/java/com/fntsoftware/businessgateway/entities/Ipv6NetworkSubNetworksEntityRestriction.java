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
import com.fntsoftware.businessgateway.entities.RestrictionsBoolean;
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ipv6NetworkSubNetworksEntityRestriction
 */
@JsonPropertyOrder({
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_LOOKUP,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_DHCP_SCOPE_TYPE,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_REMARK,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_ELID,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_NET_CLIENT_ELID,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_PREFIX_LENGTH,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_DHCP_LEASE_TIME,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_DOMAIN_ELID,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_NETRANGE_NAME_ELID,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_BLOCKED,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_FUNCTION,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_NAME,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_PRIMARY_SCOPE_ELID,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_DHCP_SCOPE_NAME,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_GATEWAY_IP_ADDRESS_ELID,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_FULL_ID,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_ID,
  Ipv6NetworkSubNetworksEntityRestriction.JSON_PROPERTY_DHCP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class Ipv6NetworkSubNetworksEntityRestriction {
  public static final String JSON_PROPERTY_LOOKUP = "lookup";
  private RestrictionsBoolean lookup;

  public static final String JSON_PROPERTY_DHCP_SCOPE_TYPE = "dhcpScopeType";
  private RestrictionsString dhcpScopeType;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_NET_CLIENT_ELID = "netClientElid";
  private RestrictionsString netClientElid;

  public static final String JSON_PROPERTY_PREFIX_LENGTH = "prefixLength";
  private RestrictionsNumeric prefixLength;

  public static final String JSON_PROPERTY_DHCP_LEASE_TIME = "dhcpLeaseTime";
  private RestrictionsString dhcpLeaseTime;

  public static final String JSON_PROPERTY_DOMAIN_ELID = "domainElid";
  private RestrictionsString domainElid;

  public static final String JSON_PROPERTY_NETRANGE_NAME_ELID = "netrangeNameElid";
  private RestrictionsString netrangeNameElid;

  public static final String JSON_PROPERTY_BLOCKED = "blocked";
  private RestrictionsBoolean blocked;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private RestrictionsString function;

  public static final String JSON_PROPERTY_NAME = "name";
  private RestrictionsString name;

  public static final String JSON_PROPERTY_PRIMARY_SCOPE_ELID = "primaryScopeElid";
  private RestrictionsString primaryScopeElid;

  public static final String JSON_PROPERTY_DHCP_SCOPE_NAME = "dhcpScopeName";
  private RestrictionsString dhcpScopeName;

  public static final String JSON_PROPERTY_GATEWAY_IP_ADDRESS_ELID = "gatewayIpAddressElid";
  private RestrictionsString gatewayIpAddressElid;

  public static final String JSON_PROPERTY_FULL_ID = "fullId";
  private RestrictionsString fullId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_DHCP = "dhcp";
  private RestrictionsBoolean dhcp;

  public Ipv6NetworkSubNetworksEntityRestriction() {
  }

  public Ipv6NetworkSubNetworksEntityRestriction lookup(RestrictionsBoolean lookup) {
    
    this.lookup = lookup;
    return this;
  }

   /**
   * Get lookup
   * @return lookup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOOKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getLookup() {
    return lookup;
  }


  @JsonProperty(JSON_PROPERTY_LOOKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLookup(RestrictionsBoolean lookup) {
    this.lookup = lookup;
  }


  public Ipv6NetworkSubNetworksEntityRestriction dhcpScopeType(RestrictionsString dhcpScopeType) {
    
    this.dhcpScopeType = dhcpScopeType;
    return this;
  }

   /**
   * Get dhcpScopeType
   * @return dhcpScopeType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DHCP_SCOPE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDhcpScopeType() {
    return dhcpScopeType;
  }


  @JsonProperty(JSON_PROPERTY_DHCP_SCOPE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDhcpScopeType(RestrictionsString dhcpScopeType) {
    this.dhcpScopeType = dhcpScopeType;
  }


  public Ipv6NetworkSubNetworksEntityRestriction remark(RestrictionsString remark) {
    
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


  public Ipv6NetworkSubNetworksEntityRestriction elid(RestrictionsString elid) {
    
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


  public Ipv6NetworkSubNetworksEntityRestriction netClientElid(RestrictionsString netClientElid) {
    
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


  public Ipv6NetworkSubNetworksEntityRestriction prefixLength(RestrictionsNumeric prefixLength) {
    
    this.prefixLength = prefixLength;
    return this;
  }

   /**
   * Get prefixLength
   * @return prefixLength
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getPrefixLength() {
    return prefixLength;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixLength(RestrictionsNumeric prefixLength) {
    this.prefixLength = prefixLength;
  }


  public Ipv6NetworkSubNetworksEntityRestriction dhcpLeaseTime(RestrictionsString dhcpLeaseTime) {
    
    this.dhcpLeaseTime = dhcpLeaseTime;
    return this;
  }

   /**
   * Get dhcpLeaseTime
   * @return dhcpLeaseTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DHCP_LEASE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDhcpLeaseTime() {
    return dhcpLeaseTime;
  }


  @JsonProperty(JSON_PROPERTY_DHCP_LEASE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDhcpLeaseTime(RestrictionsString dhcpLeaseTime) {
    this.dhcpLeaseTime = dhcpLeaseTime;
  }


  public Ipv6NetworkSubNetworksEntityRestriction domainElid(RestrictionsString domainElid) {
    
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


  public Ipv6NetworkSubNetworksEntityRestriction netrangeNameElid(RestrictionsString netrangeNameElid) {
    
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


  public Ipv6NetworkSubNetworksEntityRestriction blocked(RestrictionsBoolean blocked) {
    
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


  public Ipv6NetworkSubNetworksEntityRestriction function(RestrictionsString function) {
    
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getFunction() {
    return function;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFunction(RestrictionsString function) {
    this.function = function;
  }


  public Ipv6NetworkSubNetworksEntityRestriction name(RestrictionsString name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(RestrictionsString name) {
    this.name = name;
  }


  public Ipv6NetworkSubNetworksEntityRestriction primaryScopeElid(RestrictionsString primaryScopeElid) {
    
    this.primaryScopeElid = primaryScopeElid;
    return this;
  }

   /**
   * Get primaryScopeElid
   * @return primaryScopeElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_SCOPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPrimaryScopeElid() {
    return primaryScopeElid;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_SCOPE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryScopeElid(RestrictionsString primaryScopeElid) {
    this.primaryScopeElid = primaryScopeElid;
  }


  public Ipv6NetworkSubNetworksEntityRestriction dhcpScopeName(RestrictionsString dhcpScopeName) {
    
    this.dhcpScopeName = dhcpScopeName;
    return this;
  }

   /**
   * Get dhcpScopeName
   * @return dhcpScopeName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DHCP_SCOPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDhcpScopeName() {
    return dhcpScopeName;
  }


  @JsonProperty(JSON_PROPERTY_DHCP_SCOPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDhcpScopeName(RestrictionsString dhcpScopeName) {
    this.dhcpScopeName = dhcpScopeName;
  }


  public Ipv6NetworkSubNetworksEntityRestriction gatewayIpAddressElid(RestrictionsString gatewayIpAddressElid) {
    
    this.gatewayIpAddressElid = gatewayIpAddressElid;
    return this;
  }

   /**
   * Get gatewayIpAddressElid
   * @return gatewayIpAddressElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GATEWAY_IP_ADDRESS_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getGatewayIpAddressElid() {
    return gatewayIpAddressElid;
  }


  @JsonProperty(JSON_PROPERTY_GATEWAY_IP_ADDRESS_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGatewayIpAddressElid(RestrictionsString gatewayIpAddressElid) {
    this.gatewayIpAddressElid = gatewayIpAddressElid;
  }


  public Ipv6NetworkSubNetworksEntityRestriction fullId(RestrictionsString fullId) {
    
    this.fullId = fullId;
    return this;
  }

   /**
   * Get fullId
   * @return fullId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getFullId() {
    return fullId;
  }


  @JsonProperty(JSON_PROPERTY_FULL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullId(RestrictionsString fullId) {
    this.fullId = fullId;
  }


  public Ipv6NetworkSubNetworksEntityRestriction id(RestrictionsString id) {
    
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

  public RestrictionsString getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(RestrictionsString id) {
    this.id = id;
  }


  public Ipv6NetworkSubNetworksEntityRestriction dhcp(RestrictionsBoolean dhcp) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ipv6NetworkSubNetworksEntityRestriction ipv6NetworkSubNetworksEntityRestriction = (Ipv6NetworkSubNetworksEntityRestriction) o;
    return Objects.equals(this.lookup, ipv6NetworkSubNetworksEntityRestriction.lookup) &&
        Objects.equals(this.dhcpScopeType, ipv6NetworkSubNetworksEntityRestriction.dhcpScopeType) &&
        Objects.equals(this.remark, ipv6NetworkSubNetworksEntityRestriction.remark) &&
        Objects.equals(this.elid, ipv6NetworkSubNetworksEntityRestriction.elid) &&
        Objects.equals(this.netClientElid, ipv6NetworkSubNetworksEntityRestriction.netClientElid) &&
        Objects.equals(this.prefixLength, ipv6NetworkSubNetworksEntityRestriction.prefixLength) &&
        Objects.equals(this.dhcpLeaseTime, ipv6NetworkSubNetworksEntityRestriction.dhcpLeaseTime) &&
        Objects.equals(this.domainElid, ipv6NetworkSubNetworksEntityRestriction.domainElid) &&
        Objects.equals(this.netrangeNameElid, ipv6NetworkSubNetworksEntityRestriction.netrangeNameElid) &&
        Objects.equals(this.blocked, ipv6NetworkSubNetworksEntityRestriction.blocked) &&
        Objects.equals(this.function, ipv6NetworkSubNetworksEntityRestriction.function) &&
        Objects.equals(this.name, ipv6NetworkSubNetworksEntityRestriction.name) &&
        Objects.equals(this.primaryScopeElid, ipv6NetworkSubNetworksEntityRestriction.primaryScopeElid) &&
        Objects.equals(this.dhcpScopeName, ipv6NetworkSubNetworksEntityRestriction.dhcpScopeName) &&
        Objects.equals(this.gatewayIpAddressElid, ipv6NetworkSubNetworksEntityRestriction.gatewayIpAddressElid) &&
        Objects.equals(this.fullId, ipv6NetworkSubNetworksEntityRestriction.fullId) &&
        Objects.equals(this.id, ipv6NetworkSubNetworksEntityRestriction.id) &&
        Objects.equals(this.dhcp, ipv6NetworkSubNetworksEntityRestriction.dhcp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lookup, dhcpScopeType, remark, elid, netClientElid, prefixLength, dhcpLeaseTime, domainElid, netrangeNameElid, blocked, function, name, primaryScopeElid, dhcpScopeName, gatewayIpAddressElid, fullId, id, dhcp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ipv6NetworkSubNetworksEntityRestriction {\n");
    sb.append("    lookup: ").append(toIndentedString(lookup)).append("\n");
    sb.append("    dhcpScopeType: ").append(toIndentedString(dhcpScopeType)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    netClientElid: ").append(toIndentedString(netClientElid)).append("\n");
    sb.append("    prefixLength: ").append(toIndentedString(prefixLength)).append("\n");
    sb.append("    dhcpLeaseTime: ").append(toIndentedString(dhcpLeaseTime)).append("\n");
    sb.append("    domainElid: ").append(toIndentedString(domainElid)).append("\n");
    sb.append("    netrangeNameElid: ").append(toIndentedString(netrangeNameElid)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryScopeElid: ").append(toIndentedString(primaryScopeElid)).append("\n");
    sb.append("    dhcpScopeName: ").append(toIndentedString(dhcpScopeName)).append("\n");
    sb.append("    gatewayIpAddressElid: ").append(toIndentedString(gatewayIpAddressElid)).append("\n");
    sb.append("    fullId: ").append(toIndentedString(fullId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dhcp: ").append(toIndentedString(dhcp)).append("\n");
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
