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
 * VirtualDriveQueryResponseData
 */
@JsonPropertyOrder({
  VirtualDriveQueryResponseData.JSON_PROPERTY_PASS_THROUGH,
  VirtualDriveQueryResponseData.JSON_PROPERTY_DRIVE_MODE,
  VirtualDriveQueryResponseData.JSON_PROPERTY_VIRTUAL_DEVICE_MODE,
  VirtualDriveQueryResponseData.JSON_PROPERTY_LOCATION,
  VirtualDriveQueryResponseData.JSON_PROPERTY_ELID,
  VirtualDriveQueryResponseData.JSON_PROPERTY_DRIVE_PATH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class VirtualDriveQueryResponseData {
  public static final String JSON_PROPERTY_PASS_THROUGH = "passThrough";
  private Boolean passThrough;

  public static final String JSON_PROPERTY_DRIVE_MODE = "driveMode";
  private String driveMode;

  public static final String JSON_PROPERTY_VIRTUAL_DEVICE_MODE = "virtualDeviceMode";
  private String virtualDeviceMode;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_DRIVE_PATH = "drivePath";
  private String drivePath;

  public VirtualDriveQueryResponseData() {
  }

  public VirtualDriveQueryResponseData passThrough(Boolean passThrough) {
    
    this.passThrough = passThrough;
    return this;
  }

   /**
   * Get passThrough
   * @return passThrough
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASS_THROUGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPassThrough() {
    return passThrough;
  }


  @JsonProperty(JSON_PROPERTY_PASS_THROUGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassThrough(Boolean passThrough) {
    this.passThrough = passThrough;
  }


  public VirtualDriveQueryResponseData driveMode(String driveMode) {
    
    this.driveMode = driveMode;
    return this;
  }

   /**
   * Get driveMode
   * @return driveMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRIVE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDriveMode() {
    return driveMode;
  }


  @JsonProperty(JSON_PROPERTY_DRIVE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDriveMode(String driveMode) {
    this.driveMode = driveMode;
  }


  public VirtualDriveQueryResponseData virtualDeviceMode(String virtualDeviceMode) {
    
    this.virtualDeviceMode = virtualDeviceMode;
    return this;
  }

   /**
   * Get virtualDeviceMode
   * @return virtualDeviceMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIRTUAL_DEVICE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVirtualDeviceMode() {
    return virtualDeviceMode;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_DEVICE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualDeviceMode(String virtualDeviceMode) {
    this.virtualDeviceMode = virtualDeviceMode;
  }


  public VirtualDriveQueryResponseData location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(String location) {
    this.location = location;
  }


  public VirtualDriveQueryResponseData elid(String elid) {
    
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

  public String getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(String elid) {
    this.elid = elid;
  }


  public VirtualDriveQueryResponseData drivePath(String drivePath) {
    
    this.drivePath = drivePath;
    return this;
  }

   /**
   * Get drivePath
   * @return drivePath
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRIVE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDrivePath() {
    return drivePath;
  }


  @JsonProperty(JSON_PROPERTY_DRIVE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDrivePath(String drivePath) {
    this.drivePath = drivePath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualDriveQueryResponseData virtualDriveQueryResponseData = (VirtualDriveQueryResponseData) o;
    return Objects.equals(this.passThrough, virtualDriveQueryResponseData.passThrough) &&
        Objects.equals(this.driveMode, virtualDriveQueryResponseData.driveMode) &&
        Objects.equals(this.virtualDeviceMode, virtualDriveQueryResponseData.virtualDeviceMode) &&
        Objects.equals(this.location, virtualDriveQueryResponseData.location) &&
        Objects.equals(this.elid, virtualDriveQueryResponseData.elid) &&
        Objects.equals(this.drivePath, virtualDriveQueryResponseData.drivePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passThrough, driveMode, virtualDeviceMode, location, elid, drivePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualDriveQueryResponseData {\n");
    sb.append("    passThrough: ").append(toIndentedString(passThrough)).append("\n");
    sb.append("    driveMode: ").append(toIndentedString(driveMode)).append("\n");
    sb.append("    virtualDeviceMode: ").append(toIndentedString(virtualDeviceMode)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    drivePath: ").append(toIndentedString(drivePath)).append("\n");
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
