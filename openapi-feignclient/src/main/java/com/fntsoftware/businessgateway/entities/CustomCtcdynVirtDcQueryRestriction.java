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
import com.fntsoftware.businessgateway.entities.RestrictionsNumeric;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomCtcdynVirtDcQueryRestriction
 */
@JsonPropertyOrder({
  CustomCtcdynVirtDcQueryRestriction.JSON_PROPERTY_VDC_TYPE,
  CustomCtcdynVirtDcQueryRestriction.JSON_PROPERTY_CAP_RAM,
  CustomCtcdynVirtDcQueryRestriction.JSON_PROPERTY_VISIBLE_ID,
  CustomCtcdynVirtDcQueryRestriction.JSON_PROPERTY_ID,
  CustomCtcdynVirtDcQueryRestriction.JSON_PROPERTY_CAP_CPU,
  CustomCtcdynVirtDcQueryRestriction.JSON_PROPERTY_ELID,
  CustomCtcdynVirtDcQueryRestriction.JSON_PROPERTY_FIRST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CustomCtcdynVirtDcQueryRestriction {
  public static final String JSON_PROPERTY_VDC_TYPE = "vdcType";
  private RestrictionsString vdcType;

  public static final String JSON_PROPERTY_CAP_RAM = "capRam";
  private RestrictionsNumeric capRam;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_CAP_CPU = "capCpu";
  private RestrictionsNumeric capCpu;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public CustomCtcdynVirtDcQueryRestriction() {
  }

  public CustomCtcdynVirtDcQueryRestriction vdcType(RestrictionsString vdcType) {
    
    this.vdcType = vdcType;
    return this;
  }

   /**
   * Get vdcType
   * @return vdcType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VDC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getVdcType() {
    return vdcType;
  }


  @JsonProperty(JSON_PROPERTY_VDC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVdcType(RestrictionsString vdcType) {
    this.vdcType = vdcType;
  }


  public CustomCtcdynVirtDcQueryRestriction capRam(RestrictionsNumeric capRam) {
    
    this.capRam = capRam;
    return this;
  }

   /**
   * Get capRam
   * @return capRam
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAP_RAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getCapRam() {
    return capRam;
  }


  @JsonProperty(JSON_PROPERTY_CAP_RAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapRam(RestrictionsNumeric capRam) {
    this.capRam = capRam;
  }


  public CustomCtcdynVirtDcQueryRestriction visibleId(RestrictionsString visibleId) {
    
    this.visibleId = visibleId;
    return this;
  }

   /**
   * Get visibleId
   * @return visibleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getVisibleId() {
    return visibleId;
  }


  @JsonProperty(JSON_PROPERTY_VISIBLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibleId(RestrictionsString visibleId) {
    this.visibleId = visibleId;
  }


  public CustomCtcdynVirtDcQueryRestriction id(RestrictionsString id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(RestrictionsString id) {
    this.id = id;
  }


  public CustomCtcdynVirtDcQueryRestriction capCpu(RestrictionsNumeric capCpu) {
    
    this.capCpu = capCpu;
    return this;
  }

   /**
   * Get capCpu
   * @return capCpu
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAP_CPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getCapCpu() {
    return capCpu;
  }


  @JsonProperty(JSON_PROPERTY_CAP_CPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapCpu(RestrictionsNumeric capCpu) {
    this.capCpu = capCpu;
  }


  public CustomCtcdynVirtDcQueryRestriction elid(RestrictionsString elid) {
    
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

  public RestrictionsString getElid() {
    return elid;
  }


  @JsonProperty(JSON_PROPERTY_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElid(RestrictionsString elid) {
    this.elid = elid;
  }


  public CustomCtcdynVirtDcQueryRestriction first(RestrictionsNumeric first) {
    
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsNumeric getFirst() {
    return first;
  }


  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirst(RestrictionsNumeric first) {
    this.first = first;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomCtcdynVirtDcQueryRestriction customCtcdynVirtDcQueryRestriction = (CustomCtcdynVirtDcQueryRestriction) o;
    return Objects.equals(this.vdcType, customCtcdynVirtDcQueryRestriction.vdcType) &&
        Objects.equals(this.capRam, customCtcdynVirtDcQueryRestriction.capRam) &&
        Objects.equals(this.visibleId, customCtcdynVirtDcQueryRestriction.visibleId) &&
        Objects.equals(this.id, customCtcdynVirtDcQueryRestriction.id) &&
        Objects.equals(this.capCpu, customCtcdynVirtDcQueryRestriction.capCpu) &&
        Objects.equals(this.elid, customCtcdynVirtDcQueryRestriction.elid) &&
        Objects.equals(this.first, customCtcdynVirtDcQueryRestriction.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vdcType, capRam, visibleId, id, capCpu, elid, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomCtcdynVirtDcQueryRestriction {\n");
    sb.append("    vdcType: ").append(toIndentedString(vdcType)).append("\n");
    sb.append("    capRam: ").append(toIndentedString(capRam)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    capCpu: ").append(toIndentedString(capCpu)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
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
