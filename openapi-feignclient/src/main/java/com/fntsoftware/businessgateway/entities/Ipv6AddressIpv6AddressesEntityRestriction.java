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
import com.fntsoftware.businessgateway.entities.RestrictionsDate;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ipv6AddressIpv6AddressesEntityRestriction
 */
@JsonPropertyOrder({
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_MULTIPLE_USAGE,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_NETRANGE_ELID,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_IP_ADDRESS,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_H_INFO,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_REMARK,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_ELID,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_FULL_IP_ADDRESS,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_MULTICAST,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_NET_CLIENT_ELID,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_MAC_ADDRESS,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_DHCP_TYPE,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_HOSTNAME_ELID,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_LOOKUP_ADDRESS,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_NETWORK_ELID,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_START_DATE,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_DELETE_DATE,
  Ipv6AddressIpv6AddressesEntityRestriction.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class Ipv6AddressIpv6AddressesEntityRestriction {
  public static final String JSON_PROPERTY_MULTIPLE_USAGE = "multipleUsage";
  private RestrictionsBoolean multipleUsage;

  public static final String JSON_PROPERTY_NETRANGE_ELID = "netrangeElid";
  private RestrictionsString netrangeElid;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private RestrictionsString ipAddress;

  public static final String JSON_PROPERTY_H_INFO = "hInfo";
  private RestrictionsString hInfo;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_FULL_IP_ADDRESS = "fullIpAddress";
  private RestrictionsString fullIpAddress;

  public static final String JSON_PROPERTY_MULTICAST = "multicast";
  private RestrictionsBoolean multicast;

  public static final String JSON_PROPERTY_NET_CLIENT_ELID = "netClientElid";
  private RestrictionsString netClientElid;

  public static final String JSON_PROPERTY_MAC_ADDRESS = "macAddress";
  private RestrictionsString macAddress;

  public static final String JSON_PROPERTY_DHCP_TYPE = "dhcpType";
  private RestrictionsString dhcpType;

  public static final String JSON_PROPERTY_HOSTNAME_ELID = "hostnameElid";
  private RestrictionsString hostnameElid;

  public static final String JSON_PROPERTY_LOOKUP_ADDRESS = "lookupAddress";
  private RestrictionsBoolean lookupAddress;

  public static final String JSON_PROPERTY_NETWORK_ELID = "networkElid";
  private RestrictionsString networkElid;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private RestrictionsDate startDate;

  public static final String JSON_PROPERTY_DELETE_DATE = "deleteDate";
  private RestrictionsDate deleteDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RestrictionsString status;

  public Ipv6AddressIpv6AddressesEntityRestriction() {
  }

  public Ipv6AddressIpv6AddressesEntityRestriction multipleUsage(RestrictionsBoolean multipleUsage) {
    
    this.multipleUsage = multipleUsage;
    return this;
  }

   /**
   * Get multipleUsage
   * @return multipleUsage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTIPLE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getMultipleUsage() {
    return multipleUsage;
  }


  @JsonProperty(JSON_PROPERTY_MULTIPLE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultipleUsage(RestrictionsBoolean multipleUsage) {
    this.multipleUsage = multipleUsage;
  }


  public Ipv6AddressIpv6AddressesEntityRestriction netrangeElid(RestrictionsString netrangeElid) {
    
    this.netrangeElid = netrangeElid;
    return this;
  }

   /**
   * Get netrangeElid
   * @return netrangeElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETRANGE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getNetrangeElid() {
    return netrangeElid;
  }


  @JsonProperty(JSON_PROPERTY_NETRANGE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetrangeElid(RestrictionsString netrangeElid) {
    this.netrangeElid = netrangeElid;
  }


  public Ipv6AddressIpv6AddressesEntityRestriction ipAddress(RestrictionsString ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(RestrictionsString ipAddress) {
    this.ipAddress = ipAddress;
  }


  public Ipv6AddressIpv6AddressesEntityRestriction hInfo(RestrictionsString hInfo) {
    
    this.hInfo = hInfo;
    return this;
  }

   /**
   * Get hInfo
   * @return hInfo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_H_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString gethInfo() {
    return hInfo;
  }


  @JsonProperty(JSON_PROPERTY_H_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void sethInfo(RestrictionsString hInfo) {
    this.hInfo = hInfo;
  }


  public Ipv6AddressIpv6AddressesEntityRestriction remark(RestrictionsString remark) {
    
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


  public Ipv6AddressIpv6AddressesEntityRestriction elid(RestrictionsString elid) {
    
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


  public Ipv6AddressIpv6AddressesEntityRestriction fullIpAddress(RestrictionsString fullIpAddress) {
    
    this.fullIpAddress = fullIpAddress;
    return this;
  }

   /**
   * Get fullIpAddress
   * @return fullIpAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getFullIpAddress() {
    return fullIpAddress;
  }


  @JsonProperty(JSON_PROPERTY_FULL_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullIpAddress(RestrictionsString fullIpAddress) {
    this.fullIpAddress = fullIpAddress;
  }


  public Ipv6AddressIpv6AddressesEntityRestriction multicast(RestrictionsBoolean multicast) {
    
    this.multicast = multicast;
    return this;
  }

   /**
   * Get multicast
   * @return multicast
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTICAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getMulticast() {
    return multicast;
  }


  @JsonProperty(JSON_PROPERTY_MULTICAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMulticast(RestrictionsBoolean multicast) {
    this.multicast = multicast;
  }


  public Ipv6AddressIpv6AddressesEntityRestriction netClientElid(RestrictionsString netClientElid) {
    
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


  public Ipv6AddressIpv6AddressesEntityRestriction macAddress(RestrictionsString macAddress) {
    
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getMacAddress() {
    return macAddress;
  }


  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMacAddress(RestrictionsString macAddress) {
    this.macAddress = macAddress;
  }


  public Ipv6AddressIpv6AddressesEntityRestriction dhcpType(RestrictionsString dhcpType) {
    
    this.dhcpType = dhcpType;
    return this;
  }

   /**
   * Get dhcpType
   * @return dhcpType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DHCP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDhcpType() {
    return dhcpType;
  }


  @JsonProperty(JSON_PROPERTY_DHCP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDhcpType(RestrictionsString dhcpType) {
    this.dhcpType = dhcpType;
  }


  public Ipv6AddressIpv6AddressesEntityRestriction hostnameElid(RestrictionsString hostnameElid) {
    
    this.hostnameElid = hostnameElid;
    return this;
  }

   /**
   * Get hostnameElid
   * @return hostnameElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTNAME_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getHostnameElid() {
    return hostnameElid;
  }


  @JsonProperty(JSON_PROPERTY_HOSTNAME_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostnameElid(RestrictionsString hostnameElid) {
    this.hostnameElid = hostnameElid;
  }


  public Ipv6AddressIpv6AddressesEntityRestriction lookupAddress(RestrictionsBoolean lookupAddress) {
    
    this.lookupAddress = lookupAddress;
    return this;
  }

   /**
   * Get lookupAddress
   * @return lookupAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOOKUP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getLookupAddress() {
    return lookupAddress;
  }


  @JsonProperty(JSON_PROPERTY_LOOKUP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLookupAddress(RestrictionsBoolean lookupAddress) {
    this.lookupAddress = lookupAddress;
  }


  public Ipv6AddressIpv6AddressesEntityRestriction networkElid(RestrictionsString networkElid) {
    
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


  public Ipv6AddressIpv6AddressesEntityRestriction startDate(RestrictionsDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(RestrictionsDate startDate) {
    this.startDate = startDate;
  }


  public Ipv6AddressIpv6AddressesEntityRestriction deleteDate(RestrictionsDate deleteDate) {
    
    this.deleteDate = deleteDate;
    return this;
  }

   /**
   * Get deleteDate
   * @return deleteDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getDeleteDate() {
    return deleteDate;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteDate(RestrictionsDate deleteDate) {
    this.deleteDate = deleteDate;
  }


  public Ipv6AddressIpv6AddressesEntityRestriction status(RestrictionsString status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(RestrictionsString status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ipv6AddressIpv6AddressesEntityRestriction ipv6AddressIpv6AddressesEntityRestriction = (Ipv6AddressIpv6AddressesEntityRestriction) o;
    return Objects.equals(this.multipleUsage, ipv6AddressIpv6AddressesEntityRestriction.multipleUsage) &&
        Objects.equals(this.netrangeElid, ipv6AddressIpv6AddressesEntityRestriction.netrangeElid) &&
        Objects.equals(this.ipAddress, ipv6AddressIpv6AddressesEntityRestriction.ipAddress) &&
        Objects.equals(this.hInfo, ipv6AddressIpv6AddressesEntityRestriction.hInfo) &&
        Objects.equals(this.remark, ipv6AddressIpv6AddressesEntityRestriction.remark) &&
        Objects.equals(this.elid, ipv6AddressIpv6AddressesEntityRestriction.elid) &&
        Objects.equals(this.fullIpAddress, ipv6AddressIpv6AddressesEntityRestriction.fullIpAddress) &&
        Objects.equals(this.multicast, ipv6AddressIpv6AddressesEntityRestriction.multicast) &&
        Objects.equals(this.netClientElid, ipv6AddressIpv6AddressesEntityRestriction.netClientElid) &&
        Objects.equals(this.macAddress, ipv6AddressIpv6AddressesEntityRestriction.macAddress) &&
        Objects.equals(this.dhcpType, ipv6AddressIpv6AddressesEntityRestriction.dhcpType) &&
        Objects.equals(this.hostnameElid, ipv6AddressIpv6AddressesEntityRestriction.hostnameElid) &&
        Objects.equals(this.lookupAddress, ipv6AddressIpv6AddressesEntityRestriction.lookupAddress) &&
        Objects.equals(this.networkElid, ipv6AddressIpv6AddressesEntityRestriction.networkElid) &&
        Objects.equals(this.startDate, ipv6AddressIpv6AddressesEntityRestriction.startDate) &&
        Objects.equals(this.deleteDate, ipv6AddressIpv6AddressesEntityRestriction.deleteDate) &&
        Objects.equals(this.status, ipv6AddressIpv6AddressesEntityRestriction.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleUsage, netrangeElid, ipAddress, hInfo, remark, elid, fullIpAddress, multicast, netClientElid, macAddress, dhcpType, hostnameElid, lookupAddress, networkElid, startDate, deleteDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ipv6AddressIpv6AddressesEntityRestriction {\n");
    sb.append("    multipleUsage: ").append(toIndentedString(multipleUsage)).append("\n");
    sb.append("    netrangeElid: ").append(toIndentedString(netrangeElid)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    hInfo: ").append(toIndentedString(hInfo)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    fullIpAddress: ").append(toIndentedString(fullIpAddress)).append("\n");
    sb.append("    multicast: ").append(toIndentedString(multicast)).append("\n");
    sb.append("    netClientElid: ").append(toIndentedString(netClientElid)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    dhcpType: ").append(toIndentedString(dhcpType)).append("\n");
    sb.append("    hostnameElid: ").append(toIndentedString(hostnameElid)).append("\n");
    sb.append("    lookupAddress: ").append(toIndentedString(lookupAddress)).append("\n");
    sb.append("    networkElid: ").append(toIndentedString(networkElid)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    deleteDate: ").append(toIndentedString(deleteDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
