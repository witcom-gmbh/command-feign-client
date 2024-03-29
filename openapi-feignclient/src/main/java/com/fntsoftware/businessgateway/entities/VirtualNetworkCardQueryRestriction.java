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
 * VirtualNetworkCardQueryRestriction
 */
@JsonPropertyOrder({
  VirtualNetworkCardQueryRestriction.JSON_PROPERTY_CONNECT_AT_PWR,
  VirtualNetworkCardQueryRestriction.JSON_PROPERTY_NW_NAME,
  VirtualNetworkCardQueryRestriction.JSON_PROPERTY_NAME,
  VirtualNetworkCardQueryRestriction.JSON_PROPERTY_ADAPTER_TYPE,
  VirtualNetworkCardQueryRestriction.JSON_PROPERTY_ELID,
  VirtualNetworkCardQueryRestriction.JSON_PROPERTY_FIRST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class VirtualNetworkCardQueryRestriction {
  public static final String JSON_PROPERTY_CONNECT_AT_PWR = "connectAtPwr";
  private RestrictionsBoolean connectAtPwr;

  public static final String JSON_PROPERTY_NW_NAME = "nwName";
  private RestrictionsString nwName;

  public static final String JSON_PROPERTY_NAME = "name";
  private RestrictionsString name;

  public static final String JSON_PROPERTY_ADAPTER_TYPE = "adapterType";
  private RestrictionsString adapterType;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public VirtualNetworkCardQueryRestriction() {
  }

  public VirtualNetworkCardQueryRestriction connectAtPwr(RestrictionsBoolean connectAtPwr) {
    
    this.connectAtPwr = connectAtPwr;
    return this;
  }

   /**
   * Get connectAtPwr
   * @return connectAtPwr
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECT_AT_PWR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsBoolean getConnectAtPwr() {
    return connectAtPwr;
  }


  @JsonProperty(JSON_PROPERTY_CONNECT_AT_PWR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectAtPwr(RestrictionsBoolean connectAtPwr) {
    this.connectAtPwr = connectAtPwr;
  }


  public VirtualNetworkCardQueryRestriction nwName(RestrictionsString nwName) {
    
    this.nwName = nwName;
    return this;
  }

   /**
   * Get nwName
   * @return nwName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getNwName() {
    return nwName;
  }


  @JsonProperty(JSON_PROPERTY_NW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNwName(RestrictionsString nwName) {
    this.nwName = nwName;
  }


  public VirtualNetworkCardQueryRestriction name(RestrictionsString name) {
    
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


  public VirtualNetworkCardQueryRestriction adapterType(RestrictionsString adapterType) {
    
    this.adapterType = adapterType;
    return this;
  }

   /**
   * Get adapterType
   * @return adapterType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADAPTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getAdapterType() {
    return adapterType;
  }


  @JsonProperty(JSON_PROPERTY_ADAPTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdapterType(RestrictionsString adapterType) {
    this.adapterType = adapterType;
  }


  public VirtualNetworkCardQueryRestriction elid(RestrictionsString elid) {
    
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


  public VirtualNetworkCardQueryRestriction first(RestrictionsNumeric first) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualNetworkCardQueryRestriction virtualNetworkCardQueryRestriction = (VirtualNetworkCardQueryRestriction) o;
    return Objects.equals(this.connectAtPwr, virtualNetworkCardQueryRestriction.connectAtPwr) &&
        Objects.equals(this.nwName, virtualNetworkCardQueryRestriction.nwName) &&
        Objects.equals(this.name, virtualNetworkCardQueryRestriction.name) &&
        Objects.equals(this.adapterType, virtualNetworkCardQueryRestriction.adapterType) &&
        Objects.equals(this.elid, virtualNetworkCardQueryRestriction.elid) &&
        Objects.equals(this.first, virtualNetworkCardQueryRestriction.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectAtPwr, nwName, name, adapterType, elid, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualNetworkCardQueryRestriction {\n");
    sb.append("    connectAtPwr: ").append(toIndentedString(connectAtPwr)).append("\n");
    sb.append("    nwName: ").append(toIndentedString(nwName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    adapterType: ").append(toIndentedString(adapterType)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
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

