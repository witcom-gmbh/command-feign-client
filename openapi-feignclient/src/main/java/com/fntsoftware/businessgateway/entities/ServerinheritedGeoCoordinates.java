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
import com.fntsoftware.businessgateway.entities.ServerinheritedGeoPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServerinheritedGeoCoordinates
 */
@JsonPropertyOrder({
  ServerinheritedGeoCoordinates.JSON_PROPERTY_COORDINATES,
  ServerinheritedGeoCoordinates.JSON_PROPERTY_INHERITED_FROM,
  ServerinheritedGeoCoordinates.JSON_PROPERTY_TYPE,
  ServerinheritedGeoCoordinates.JSON_PROPERTY_OBJECT_ELID
})
@JsonTypeName("serverinheritedGeoCoordinates")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ServerinheritedGeoCoordinates {
  public static final String JSON_PROPERTY_COORDINATES = "coordinates";
  private List<ServerinheritedGeoPoint> coordinates;

  public static final String JSON_PROPERTY_INHERITED_FROM = "inheritedFrom";
  private String inheritedFrom;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_OBJECT_ELID = "objectElid";
  private String objectElid;

  public ServerinheritedGeoCoordinates() {
  }

  public ServerinheritedGeoCoordinates coordinates(List<ServerinheritedGeoPoint> coordinates) {
    
    this.coordinates = coordinates;
    return this;
  }

  public ServerinheritedGeoCoordinates addCoordinatesItem(ServerinheritedGeoPoint coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COORDINATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ServerinheritedGeoPoint> getCoordinates() {
    return coordinates;
  }


  @JsonProperty(JSON_PROPERTY_COORDINATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoordinates(List<ServerinheritedGeoPoint> coordinates) {
    this.coordinates = coordinates;
  }


  public ServerinheritedGeoCoordinates inheritedFrom(String inheritedFrom) {
    
    this.inheritedFrom = inheritedFrom;
    return this;
  }

   /**
   * Get inheritedFrom
   * @return inheritedFrom
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INHERITED_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInheritedFrom() {
    return inheritedFrom;
  }


  @JsonProperty(JSON_PROPERTY_INHERITED_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInheritedFrom(String inheritedFrom) {
    this.inheritedFrom = inheritedFrom;
  }


  public ServerinheritedGeoCoordinates type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public ServerinheritedGeoCoordinates objectElid(String objectElid) {
    
    this.objectElid = objectElid;
    return this;
  }

   /**
   * Get objectElid
   * @return objectElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObjectElid() {
    return objectElid;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectElid(String objectElid) {
    this.objectElid = objectElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerinheritedGeoCoordinates serverinheritedGeoCoordinates = (ServerinheritedGeoCoordinates) o;
    return Objects.equals(this.coordinates, serverinheritedGeoCoordinates.coordinates) &&
        Objects.equals(this.inheritedFrom, serverinheritedGeoCoordinates.inheritedFrom) &&
        Objects.equals(this.type, serverinheritedGeoCoordinates.type) &&
        Objects.equals(this.objectElid, serverinheritedGeoCoordinates.objectElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, inheritedFrom, type, objectElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerinheritedGeoCoordinates {\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    inheritedFrom: ").append(toIndentedString(inheritedFrom)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    objectElid: ").append(toIndentedString(objectElid)).append("\n");
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
