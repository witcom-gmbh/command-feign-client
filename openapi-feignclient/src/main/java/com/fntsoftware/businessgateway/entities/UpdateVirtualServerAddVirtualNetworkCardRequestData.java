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
 * UpdateVirtualServerAddVirtualNetworkCardRequestData
 */
@JsonPropertyOrder({
  UpdateVirtualServerAddVirtualNetworkCardRequestData.JSON_PROPERTY_CONNECT_AT_PWR,
  UpdateVirtualServerAddVirtualNetworkCardRequestData.JSON_PROPERTY_NW_NAME,
  UpdateVirtualServerAddVirtualNetworkCardRequestData.JSON_PROPERTY_NAME,
  UpdateVirtualServerAddVirtualNetworkCardRequestData.JSON_PROPERTY_ADAPTER_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateVirtualServerAddVirtualNetworkCardRequestData {
  public static final String JSON_PROPERTY_CONNECT_AT_PWR = "connectAtPwr";
  private Boolean connectAtPwr;

  public static final String JSON_PROPERTY_NW_NAME = "nwName";
  private String nwName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ADAPTER_TYPE = "adapterType";
  private String adapterType;

  public UpdateVirtualServerAddVirtualNetworkCardRequestData() {
  }

  public UpdateVirtualServerAddVirtualNetworkCardRequestData connectAtPwr(Boolean connectAtPwr) {
    
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

  public Boolean getConnectAtPwr() {
    return connectAtPwr;
  }


  @JsonProperty(JSON_PROPERTY_CONNECT_AT_PWR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectAtPwr(Boolean connectAtPwr) {
    this.connectAtPwr = connectAtPwr;
  }


  public UpdateVirtualServerAddVirtualNetworkCardRequestData nwName(String nwName) {
    
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

  public String getNwName() {
    return nwName;
  }


  @JsonProperty(JSON_PROPERTY_NW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNwName(String nwName) {
    this.nwName = nwName;
  }


  public UpdateVirtualServerAddVirtualNetworkCardRequestData name(String name) {
    
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

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UpdateVirtualServerAddVirtualNetworkCardRequestData adapterType(String adapterType) {
    
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

  public String getAdapterType() {
    return adapterType;
  }


  @JsonProperty(JSON_PROPERTY_ADAPTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdapterType(String adapterType) {
    this.adapterType = adapterType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVirtualServerAddVirtualNetworkCardRequestData updateVirtualServerAddVirtualNetworkCardRequestData = (UpdateVirtualServerAddVirtualNetworkCardRequestData) o;
    return Objects.equals(this.connectAtPwr, updateVirtualServerAddVirtualNetworkCardRequestData.connectAtPwr) &&
        Objects.equals(this.nwName, updateVirtualServerAddVirtualNetworkCardRequestData.nwName) &&
        Objects.equals(this.name, updateVirtualServerAddVirtualNetworkCardRequestData.name) &&
        Objects.equals(this.adapterType, updateVirtualServerAddVirtualNetworkCardRequestData.adapterType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectAtPwr, nwName, name, adapterType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVirtualServerAddVirtualNetworkCardRequestData {\n");
    sb.append("    connectAtPwr: ").append(toIndentedString(connectAtPwr)).append("\n");
    sb.append("    nwName: ").append(toIndentedString(nwName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    adapterType: ").append(toIndentedString(adapterType)).append("\n");
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
