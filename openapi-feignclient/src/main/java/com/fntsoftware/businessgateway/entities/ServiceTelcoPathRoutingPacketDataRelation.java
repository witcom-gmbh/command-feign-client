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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceTelcoPathRoutingPacketDataRelation
 */
@JsonPropertyOrder({
  ServiceTelcoPathRoutingPacketDataRelation.JSON_PROPERTY_SEQUENCE_NO,
  ServiceTelcoPathRoutingPacketDataRelation.JSON_PROPERTY_UNIBI,
  ServiceTelcoPathRoutingPacketDataRelation.JSON_PROPERTY_END_DEVICE_ELID,
  ServiceTelcoPathRoutingPacketDataRelation.JSON_PROPERTY_START_DEVICE_ELID,
  ServiceTelcoPathRoutingPacketDataRelation.JSON_PROPERTY_DIRECTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class ServiceTelcoPathRoutingPacketDataRelation {
  public static final String JSON_PROPERTY_SEQUENCE_NO = "sequenceNo";
  private BigDecimal sequenceNo;

  public static final String JSON_PROPERTY_UNIBI = "unibi";
  private String unibi;

  public static final String JSON_PROPERTY_END_DEVICE_ELID = "endDeviceElid";
  private String endDeviceElid;

  public static final String JSON_PROPERTY_START_DEVICE_ELID = "startDeviceElid";
  private String startDeviceElid;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private String direction;

  public ServiceTelcoPathRoutingPacketDataRelation() {
  }

  public ServiceTelcoPathRoutingPacketDataRelation sequenceNo(BigDecimal sequenceNo) {
    
    this.sequenceNo = sequenceNo;
    return this;
  }

   /**
   * Get sequenceNo
   * @return sequenceNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEQUENCE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSequenceNo() {
    return sequenceNo;
  }


  @JsonProperty(JSON_PROPERTY_SEQUENCE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSequenceNo(BigDecimal sequenceNo) {
    this.sequenceNo = sequenceNo;
  }


  public ServiceTelcoPathRoutingPacketDataRelation unibi(String unibi) {
    
    this.unibi = unibi;
    return this;
  }

   /**
   * Get unibi
   * @return unibi
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIBI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnibi() {
    return unibi;
  }


  @JsonProperty(JSON_PROPERTY_UNIBI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnibi(String unibi) {
    this.unibi = unibi;
  }


  public ServiceTelcoPathRoutingPacketDataRelation endDeviceElid(String endDeviceElid) {
    
    this.endDeviceElid = endDeviceElid;
    return this;
  }

   /**
   * Get endDeviceElid
   * @return endDeviceElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DEVICE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDeviceElid() {
    return endDeviceElid;
  }


  @JsonProperty(JSON_PROPERTY_END_DEVICE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDeviceElid(String endDeviceElid) {
    this.endDeviceElid = endDeviceElid;
  }


  public ServiceTelcoPathRoutingPacketDataRelation startDeviceElid(String startDeviceElid) {
    
    this.startDeviceElid = startDeviceElid;
    return this;
  }

   /**
   * Get startDeviceElid
   * @return startDeviceElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DEVICE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDeviceElid() {
    return startDeviceElid;
  }


  @JsonProperty(JSON_PROPERTY_START_DEVICE_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDeviceElid(String startDeviceElid) {
    this.startDeviceElid = startDeviceElid;
  }


  public ServiceTelcoPathRoutingPacketDataRelation direction(String direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(String direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceTelcoPathRoutingPacketDataRelation serviceTelcoPathRoutingPacketDataRelation = (ServiceTelcoPathRoutingPacketDataRelation) o;
    return Objects.equals(this.sequenceNo, serviceTelcoPathRoutingPacketDataRelation.sequenceNo) &&
        Objects.equals(this.unibi, serviceTelcoPathRoutingPacketDataRelation.unibi) &&
        Objects.equals(this.endDeviceElid, serviceTelcoPathRoutingPacketDataRelation.endDeviceElid) &&
        Objects.equals(this.startDeviceElid, serviceTelcoPathRoutingPacketDataRelation.startDeviceElid) &&
        Objects.equals(this.direction, serviceTelcoPathRoutingPacketDataRelation.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequenceNo, unibi, endDeviceElid, startDeviceElid, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceTelcoPathRoutingPacketDataRelation {\n");
    sb.append("    sequenceNo: ").append(toIndentedString(sequenceNo)).append("\n");
    sb.append("    unibi: ").append(toIndentedString(unibi)).append("\n");
    sb.append("    endDeviceElid: ").append(toIndentedString(endDeviceElid)).append("\n");
    sb.append("    startDeviceElid: ").append(toIndentedString(startDeviceElid)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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
