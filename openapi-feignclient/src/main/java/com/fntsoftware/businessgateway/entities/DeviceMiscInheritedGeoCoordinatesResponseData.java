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
import com.fntsoftware.businessgateway.entities.DeviceMiscinheritedGeoCoordinates;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DeviceMiscInheritedGeoCoordinatesResponseData
 */
@JsonPropertyOrder({
  DeviceMiscInheritedGeoCoordinatesResponseData.JSON_PROPERTY_GEOMETRY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class DeviceMiscInheritedGeoCoordinatesResponseData {
  public static final String JSON_PROPERTY_GEOMETRY = "geometry";
  private List<DeviceMiscinheritedGeoCoordinates> geometry;

  public DeviceMiscInheritedGeoCoordinatesResponseData() {
  }

  public DeviceMiscInheritedGeoCoordinatesResponseData geometry(List<DeviceMiscinheritedGeoCoordinates> geometry) {
    
    this.geometry = geometry;
    return this;
  }

  public DeviceMiscInheritedGeoCoordinatesResponseData addGeometryItem(DeviceMiscinheritedGeoCoordinates geometryItem) {
    if (this.geometry == null) {
      this.geometry = new ArrayList<>();
    }
    this.geometry.add(geometryItem);
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEOMETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DeviceMiscinheritedGeoCoordinates> getGeometry() {
    return geometry;
  }


  @JsonProperty(JSON_PROPERTY_GEOMETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeometry(List<DeviceMiscinheritedGeoCoordinates> geometry) {
    this.geometry = geometry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceMiscInheritedGeoCoordinatesResponseData deviceMiscInheritedGeoCoordinatesResponseData = (DeviceMiscInheritedGeoCoordinatesResponseData) o;
    return Objects.equals(this.geometry, deviceMiscInheritedGeoCoordinatesResponseData.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMiscInheritedGeoCoordinatesResponseData {\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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
