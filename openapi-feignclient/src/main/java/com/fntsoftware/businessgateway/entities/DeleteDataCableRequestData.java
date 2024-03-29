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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DeleteDataCableRequestData
 */
@JsonPropertyOrder({
  DeleteDataCableRequestData.JSON_PROPERTY_RELEASE_SIGNALPATH,
  DeleteDataCableRequestData.JSON_PROPERTY_RELEASE_SERVICE,
  DeleteDataCableRequestData.JSON_PROPERTY_RELEASE_TRM_ROUTE,
  DeleteDataCableRequestData.JSON_PROPERTY_CONTEXT_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class DeleteDataCableRequestData {
  public static final String JSON_PROPERTY_RELEASE_SIGNALPATH = "releaseSignalpath";
  private Boolean releaseSignalpath;

  public static final String JSON_PROPERTY_RELEASE_SERVICE = "releaseService";
  private Boolean releaseService;

  public static final String JSON_PROPERTY_RELEASE_TRM_ROUTE = "releaseTrmRoute";
  private Boolean releaseTrmRoute;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public DeleteDataCableRequestData() {
  }

  public DeleteDataCableRequestData releaseSignalpath(Boolean releaseSignalpath) {
    
    this.releaseSignalpath = releaseSignalpath;
    return this;
  }

   /**
   * Get releaseSignalpath
   * @return releaseSignalpath
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_SIGNALPATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReleaseSignalpath() {
    return releaseSignalpath;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_SIGNALPATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseSignalpath(Boolean releaseSignalpath) {
    this.releaseSignalpath = releaseSignalpath;
  }


  public DeleteDataCableRequestData releaseService(Boolean releaseService) {
    
    this.releaseService = releaseService;
    return this;
  }

   /**
   * Get releaseService
   * @return releaseService
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReleaseService() {
    return releaseService;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseService(Boolean releaseService) {
    this.releaseService = releaseService;
  }


  public DeleteDataCableRequestData releaseTrmRoute(Boolean releaseTrmRoute) {
    
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


  public DeleteDataCableRequestData contextId(String contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * Get contextId
   * @return contextId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContextId() {
    return contextId;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDataCableRequestData deleteDataCableRequestData = (DeleteDataCableRequestData) o;
    return Objects.equals(this.releaseSignalpath, deleteDataCableRequestData.releaseSignalpath) &&
        Objects.equals(this.releaseService, deleteDataCableRequestData.releaseService) &&
        Objects.equals(this.releaseTrmRoute, deleteDataCableRequestData.releaseTrmRoute) &&
        Objects.equals(this.contextId, deleteDataCableRequestData.contextId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseSignalpath, releaseService, releaseTrmRoute, contextId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDataCableRequestData {\n");
    sb.append("    releaseSignalpath: ").append(toIndentedString(releaseSignalpath)).append("\n");
    sb.append("    releaseService: ").append(toIndentedString(releaseService)).append("\n");
    sb.append("    releaseTrmRoute: ").append(toIndentedString(releaseTrmRoute)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
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

