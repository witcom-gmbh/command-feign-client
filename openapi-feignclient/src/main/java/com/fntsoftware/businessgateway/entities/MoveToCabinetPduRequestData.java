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
import com.fntsoftware.businessgateway.entities.MoveToCabinetPduCreateLinkSwitchCabinetRequestData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MoveToCabinetPduRequestData
 */
@JsonPropertyOrder({
  MoveToCabinetPduRequestData.JSON_PROPERTY_RELEASE_CONNECTIONS,
  MoveToCabinetPduRequestData.JSON_PROPERTY_RELEASE_TRM_ROUTE,
  MoveToCabinetPduRequestData.JSON_PROPERTY_RELEASE_SUPPORTS,
  MoveToCabinetPduRequestData.JSON_PROPERTY_RELEASE_PATCHES,
  MoveToCabinetPduRequestData.JSON_PROPERTY_CREATE_LINK_SWITCH_CABINET
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class MoveToCabinetPduRequestData {
  public static final String JSON_PROPERTY_RELEASE_CONNECTIONS = "releaseConnections";
  private Boolean releaseConnections;

  public static final String JSON_PROPERTY_RELEASE_TRM_ROUTE = "releaseTrmRoute";
  private Boolean releaseTrmRoute;

  public static final String JSON_PROPERTY_RELEASE_SUPPORTS = "releaseSupports";
  private Boolean releaseSupports;

  public static final String JSON_PROPERTY_RELEASE_PATCHES = "releasePatches";
  private Boolean releasePatches;

  public static final String JSON_PROPERTY_CREATE_LINK_SWITCH_CABINET = "createLinkSwitchCabinet";
  private MoveToCabinetPduCreateLinkSwitchCabinetRequestData createLinkSwitchCabinet;

  public MoveToCabinetPduRequestData() {
  }

  public MoveToCabinetPduRequestData releaseConnections(Boolean releaseConnections) {
    
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


  public MoveToCabinetPduRequestData releaseTrmRoute(Boolean releaseTrmRoute) {
    
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


  public MoveToCabinetPduRequestData releaseSupports(Boolean releaseSupports) {
    
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


  public MoveToCabinetPduRequestData releasePatches(Boolean releasePatches) {
    
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


  public MoveToCabinetPduRequestData createLinkSwitchCabinet(MoveToCabinetPduCreateLinkSwitchCabinetRequestData createLinkSwitchCabinet) {
    
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

  public MoveToCabinetPduCreateLinkSwitchCabinetRequestData getCreateLinkSwitchCabinet() {
    return createLinkSwitchCabinet;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_SWITCH_CABINET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateLinkSwitchCabinet(MoveToCabinetPduCreateLinkSwitchCabinetRequestData createLinkSwitchCabinet) {
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
    MoveToCabinetPduRequestData moveToCabinetPduRequestData = (MoveToCabinetPduRequestData) o;
    return Objects.equals(this.releaseConnections, moveToCabinetPduRequestData.releaseConnections) &&
        Objects.equals(this.releaseTrmRoute, moveToCabinetPduRequestData.releaseTrmRoute) &&
        Objects.equals(this.releaseSupports, moveToCabinetPduRequestData.releaseSupports) &&
        Objects.equals(this.releasePatches, moveToCabinetPduRequestData.releasePatches) &&
        Objects.equals(this.createLinkSwitchCabinet, moveToCabinetPduRequestData.createLinkSwitchCabinet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseConnections, releaseTrmRoute, releaseSupports, releasePatches, createLinkSwitchCabinet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveToCabinetPduRequestData {\n");
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
