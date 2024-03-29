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
 * LoopOutNetNodeBearerRequestData
 */
@JsonPropertyOrder({
  LoopOutNetNodeBearerRequestData.JSON_PROPERTY_FIRST_BEARER_ELID,
  LoopOutNetNodeBearerRequestData.JSON_PROPERTY_DEVICE_ELID,
  LoopOutNetNodeBearerRequestData.JSON_PROPERTY_SECOND_BEARER_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class LoopOutNetNodeBearerRequestData {
  public static final String JSON_PROPERTY_FIRST_BEARER_ELID = "firstBearerElid";
  private String firstBearerElid;

  public static final String JSON_PROPERTY_DEVICE_ELID = "deviceElid";
  private String deviceElid;

  public static final String JSON_PROPERTY_SECOND_BEARER_ELID = "secondBearerElid";
  private String secondBearerElid;

  public LoopOutNetNodeBearerRequestData() {
  }

  public LoopOutNetNodeBearerRequestData firstBearerElid(String firstBearerElid) {
    
    this.firstBearerElid = firstBearerElid;
    return this;
  }

   /**
   * Get firstBearerElid
   * @return firstBearerElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_BEARER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstBearerElid() {
    return firstBearerElid;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_BEARER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstBearerElid(String firstBearerElid) {
    this.firstBearerElid = firstBearerElid;
  }


  public LoopOutNetNodeBearerRequestData deviceElid(String deviceElid) {
    
    this.deviceElid = deviceElid;
    return this;
  }

   /**
   * Get deviceElid
   * @return deviceElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceElid() {
    return deviceElid;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceElid(String deviceElid) {
    this.deviceElid = deviceElid;
  }


  public LoopOutNetNodeBearerRequestData secondBearerElid(String secondBearerElid) {
    
    this.secondBearerElid = secondBearerElid;
    return this;
  }

   /**
   * Get secondBearerElid
   * @return secondBearerElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECOND_BEARER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecondBearerElid() {
    return secondBearerElid;
  }


  @JsonProperty(JSON_PROPERTY_SECOND_BEARER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondBearerElid(String secondBearerElid) {
    this.secondBearerElid = secondBearerElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoopOutNetNodeBearerRequestData loopOutNetNodeBearerRequestData = (LoopOutNetNodeBearerRequestData) o;
    return Objects.equals(this.firstBearerElid, loopOutNetNodeBearerRequestData.firstBearerElid) &&
        Objects.equals(this.deviceElid, loopOutNetNodeBearerRequestData.deviceElid) &&
        Objects.equals(this.secondBearerElid, loopOutNetNodeBearerRequestData.secondBearerElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstBearerElid, deviceElid, secondBearerElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoopOutNetNodeBearerRequestData {\n");
    sb.append("    firstBearerElid: ").append(toIndentedString(firstBearerElid)).append("\n");
    sb.append("    deviceElid: ").append(toIndentedString(deviceElid)).append("\n");
    sb.append("    secondBearerElid: ").append(toIndentedString(secondBearerElid)).append("\n");
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

