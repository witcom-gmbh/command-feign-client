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
import com.fntsoftware.businessgateway.entities.MoveToCabinetDeviceMiscCreateLinkSwitchCabinetRequestData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MoveToCabinetDeviceMiscRequestData
 */
@JsonPropertyOrder({
  MoveToCabinetDeviceMiscRequestData.JSON_PROPERTY_RELEASE_CONNECTIONS,
  MoveToCabinetDeviceMiscRequestData.JSON_PROPERTY_RELEASE_TRM_ROUTE,
  MoveToCabinetDeviceMiscRequestData.JSON_PROPERTY_RELEASE_SUPPORTS,
  MoveToCabinetDeviceMiscRequestData.JSON_PROPERTY_RELEASE_PATCHES,
  MoveToCabinetDeviceMiscRequestData.JSON_PROPERTY_CREATE_LINK_SWITCH_CABINET
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class MoveToCabinetDeviceMiscRequestData {
  public static final String JSON_PROPERTY_RELEASE_CONNECTIONS = "releaseConnections";
  private Boolean releaseConnections;

  public static final String JSON_PROPERTY_RELEASE_TRM_ROUTE = "releaseTrmRoute";
  private Boolean releaseTrmRoute;

  public static final String JSON_PROPERTY_RELEASE_SUPPORTS = "releaseSupports";
  private Boolean releaseSupports;

  public static final String JSON_PROPERTY_RELEASE_PATCHES = "releasePatches";
  private Boolean releasePatches;

  public static final String JSON_PROPERTY_CREATE_LINK_SWITCH_CABINET = "createLinkSwitchCabinet";
  private MoveToCabinetDeviceMiscCreateLinkSwitchCabinetRequestData createLinkSwitchCabinet;

  public MoveToCabinetDeviceMiscRequestData() {
  }

  public MoveToCabinetDeviceMiscRequestData releaseConnections(Boolean releaseConnections) {
    
    this.releaseConnections = releaseConnections;
    return this;
  }

   /**
   * Get releaseConnections
   * @return releaseConnections
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReleaseConnections() {
    return releaseConnections;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseConnections(Boolean releaseConnections) {
    this.releaseConnections = releaseConnections;
  }


  public MoveToCabinetDeviceMiscRequestData releaseTrmRoute(Boolean releaseTrmRoute) {
    
    this.releaseTrmRoute = releaseTrmRoute;
    return this;
  }

   /**
   * Get releaseTrmRoute
   * @return releaseTrmRoute
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_TRM_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReleaseTrmRoute() {
    return releaseTrmRoute;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_TRM_ROUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseTrmRoute(Boolean releaseTrmRoute) {
    this.releaseTrmRoute = releaseTrmRoute;
  }


  public MoveToCabinetDeviceMiscRequestData releaseSupports(Boolean releaseSupports) {
    
    this.releaseSupports = releaseSupports;
    return this;
  }

   /**
   * Get releaseSupports
   * @return releaseSupports
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_SUPPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReleaseSupports() {
    return releaseSupports;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_SUPPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseSupports(Boolean releaseSupports) {
    this.releaseSupports = releaseSupports;
  }


  public MoveToCabinetDeviceMiscRequestData releasePatches(Boolean releasePatches) {
    
    this.releasePatches = releasePatches;
    return this;
  }

   /**
   * Get releasePatches
   * @return releasePatches
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_PATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReleasePatches() {
    return releasePatches;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_PATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleasePatches(Boolean releasePatches) {
    this.releasePatches = releasePatches;
  }


  public MoveToCabinetDeviceMiscRequestData createLinkSwitchCabinet(MoveToCabinetDeviceMiscCreateLinkSwitchCabinetRequestData createLinkSwitchCabinet) {
    
    this.createLinkSwitchCabinet = createLinkSwitchCabinet;
    return this;
  }

   /**
   * Get createLinkSwitchCabinet
   * @return createLinkSwitchCabinet
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SWITCH_CABINET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MoveToCabinetDeviceMiscCreateLinkSwitchCabinetRequestData getCreateLinkSwitchCabinet() {
    return createLinkSwitchCabinet;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SWITCH_CABINET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateLinkSwitchCabinet(MoveToCabinetDeviceMiscCreateLinkSwitchCabinetRequestData createLinkSwitchCabinet) {
    this.createLinkSwitchCabinet = createLinkSwitchCabinet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveToCabinetDeviceMiscRequestData moveToCabinetDeviceMiscRequestData = (MoveToCabinetDeviceMiscRequestData) o;
    return Objects.equals(this.releaseConnections, moveToCabinetDeviceMiscRequestData.releaseConnections) &&
        Objects.equals(this.releaseTrmRoute, moveToCabinetDeviceMiscRequestData.releaseTrmRoute) &&
        Objects.equals(this.releaseSupports, moveToCabinetDeviceMiscRequestData.releaseSupports) &&
        Objects.equals(this.releasePatches, moveToCabinetDeviceMiscRequestData.releasePatches) &&
        Objects.equals(this.createLinkSwitchCabinet, moveToCabinetDeviceMiscRequestData.createLinkSwitchCabinet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseConnections, releaseTrmRoute, releaseSupports, releasePatches, createLinkSwitchCabinet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveToCabinetDeviceMiscRequestData {\n");
    sb.append("    releaseConnections: ").append(toIndentedString(releaseConnections)).append("\n");
    sb.append("    releaseTrmRoute: ").append(toIndentedString(releaseTrmRoute)).append("\n");
    sb.append("    releaseSupports: ").append(toIndentedString(releaseSupports)).append("\n");
    sb.append("    releasePatches: ").append(toIndentedString(releasePatches)).append("\n");
    sb.append("    createLinkSwitchCabinet: ").append(toIndentedString(createLinkSwitchCabinet)).append("\n");
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

