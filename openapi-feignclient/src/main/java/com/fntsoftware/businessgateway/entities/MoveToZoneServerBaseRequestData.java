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
import com.fntsoftware.businessgateway.entities.MoveToZoneServerBaseCreateLinkZoneRequestData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MoveToZoneServerBaseRequestData
 */
@JsonPropertyOrder({
  MoveToZoneServerBaseRequestData.JSON_PROPERTY_RELEASE_CONNECTIONS,
  MoveToZoneServerBaseRequestData.JSON_PROPERTY_RELEASE_TRM_ROUTE,
  MoveToZoneServerBaseRequestData.JSON_PROPERTY_RELEASE_SUPPORTS,
  MoveToZoneServerBaseRequestData.JSON_PROPERTY_RELEASE_PATCHES,
  MoveToZoneServerBaseRequestData.JSON_PROPERTY_CREATE_LINK_ZONE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class MoveToZoneServerBaseRequestData {
  public static final String JSON_PROPERTY_RELEASE_CONNECTIONS = "releaseConnections";
  private Boolean releaseConnections;

  public static final String JSON_PROPERTY_RELEASE_TRM_ROUTE = "releaseTrmRoute";
  private Boolean releaseTrmRoute;

  public static final String JSON_PROPERTY_RELEASE_SUPPORTS = "releaseSupports";
  private Boolean releaseSupports;

  public static final String JSON_PROPERTY_RELEASE_PATCHES = "releasePatches";
  private Boolean releasePatches;

  public static final String JSON_PROPERTY_CREATE_LINK_ZONE = "createLinkZone";
  private MoveToZoneServerBaseCreateLinkZoneRequestData createLinkZone;

  public MoveToZoneServerBaseRequestData() {
  }

  public MoveToZoneServerBaseRequestData releaseConnections(Boolean releaseConnections) {
    
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


  public MoveToZoneServerBaseRequestData releaseTrmRoute(Boolean releaseTrmRoute) {
    
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


  public MoveToZoneServerBaseRequestData releaseSupports(Boolean releaseSupports) {
    
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


  public MoveToZoneServerBaseRequestData releasePatches(Boolean releasePatches) {
    
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


  public MoveToZoneServerBaseRequestData createLinkZone(MoveToZoneServerBaseCreateLinkZoneRequestData createLinkZone) {
    
    this.createLinkZone = createLinkZone;
    return this;
  }

   /**
   * Get createLinkZone
   * @return createLinkZone
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MoveToZoneServerBaseCreateLinkZoneRequestData getCreateLinkZone() {
    return createLinkZone;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_ZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateLinkZone(MoveToZoneServerBaseCreateLinkZoneRequestData createLinkZone) {
    this.createLinkZone = createLinkZone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveToZoneServerBaseRequestData moveToZoneServerBaseRequestData = (MoveToZoneServerBaseRequestData) o;
    return Objects.equals(this.releaseConnections, moveToZoneServerBaseRequestData.releaseConnections) &&
        Objects.equals(this.releaseTrmRoute, moveToZoneServerBaseRequestData.releaseTrmRoute) &&
        Objects.equals(this.releaseSupports, moveToZoneServerBaseRequestData.releaseSupports) &&
        Objects.equals(this.releasePatches, moveToZoneServerBaseRequestData.releasePatches) &&
        Objects.equals(this.createLinkZone, moveToZoneServerBaseRequestData.createLinkZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseConnections, releaseTrmRoute, releaseSupports, releasePatches, createLinkZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveToZoneServerBaseRequestData {\n");
    sb.append("    releaseConnections: ").append(toIndentedString(releaseConnections)).append("\n");
    sb.append("    releaseTrmRoute: ").append(toIndentedString(releaseTrmRoute)).append("\n");
    sb.append("    releaseSupports: ").append(toIndentedString(releaseSupports)).append("\n");
    sb.append("    releasePatches: ").append(toIndentedString(releasePatches)).append("\n");
    sb.append("    createLinkZone: ").append(toIndentedString(createLinkZone)).append("\n");
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
