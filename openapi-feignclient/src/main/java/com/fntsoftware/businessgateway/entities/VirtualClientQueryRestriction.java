/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240226111547
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
 * VirtualClientQueryRestriction
 */
@JsonPropertyOrder({
  VirtualClientQueryRestriction.JSON_PROPERTY_USAGE,
  VirtualClientQueryRestriction.JSON_PROPERTY_REMARK,
  VirtualClientQueryRestriction.JSON_PROPERTY_VISIBLE_ID,
  VirtualClientQueryRestriction.JSON_PROPERTY_ID,
  VirtualClientQueryRestriction.JSON_PROPERTY_ELID,
  VirtualClientQueryRestriction.JSON_PROPERTY_FIRST,
  VirtualClientQueryRestriction.JSON_PROPERTY_USAGE_TYPE,
  VirtualClientQueryRestriction.JSON_PROPERTY_VIRTUAL_MACHINE_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public class VirtualClientQueryRestriction {
  public static final String JSON_PROPERTY_USAGE = "usage";
  private RestrictionsString usage;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private RestrictionsString remark;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_FIRST = "first";
  private RestrictionsNumeric first;

  public static final String JSON_PROPERTY_USAGE_TYPE = "usageType";
  private RestrictionsString usageType;

  public static final String JSON_PROPERTY_VIRTUAL_MACHINE_TYPE = "virtualMachineType";
  private RestrictionsString virtualMachineType;

  public VirtualClientQueryRestriction() {
  }

  public VirtualClientQueryRestriction usage(RestrictionsString usage) {
    
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getUsage() {
    return usage;
  }


  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsage(RestrictionsString usage) {
    this.usage = usage;
  }


  public VirtualClientQueryRestriction remark(RestrictionsString remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * Get remark
   * @return remark
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(RestrictionsString remark) {
    this.remark = remark;
  }


  public VirtualClientQueryRestriction visibleId(RestrictionsString visibleId) {
    
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


  public VirtualClientQueryRestriction id(RestrictionsString id) {
    
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


  public VirtualClientQueryRestriction elid(RestrictionsString elid) {
    
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


  public VirtualClientQueryRestriction first(RestrictionsNumeric first) {
    
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


  public VirtualClientQueryRestriction usageType(RestrictionsString usageType) {
    
    this.usageType = usageType;
    return this;
  }

   /**
   * Get usageType
   * @return usageType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getUsageType() {
    return usageType;
  }


  @JsonProperty(JSON_PROPERTY_USAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsageType(RestrictionsString usageType) {
    this.usageType = usageType;
  }


  public VirtualClientQueryRestriction virtualMachineType(RestrictionsString virtualMachineType) {
    
    this.virtualMachineType = virtualMachineType;
    return this;
  }

   /**
   * Get virtualMachineType
   * @return virtualMachineType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIRTUAL_MACHINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getVirtualMachineType() {
    return virtualMachineType;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_MACHINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualMachineType(RestrictionsString virtualMachineType) {
    this.virtualMachineType = virtualMachineType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualClientQueryRestriction virtualClientQueryRestriction = (VirtualClientQueryRestriction) o;
    return Objects.equals(this.usage, virtualClientQueryRestriction.usage) &&
        Objects.equals(this.remark, virtualClientQueryRestriction.remark) &&
        Objects.equals(this.visibleId, virtualClientQueryRestriction.visibleId) &&
        Objects.equals(this.id, virtualClientQueryRestriction.id) &&
        Objects.equals(this.elid, virtualClientQueryRestriction.elid) &&
        Objects.equals(this.first, virtualClientQueryRestriction.first) &&
        Objects.equals(this.usageType, virtualClientQueryRestriction.usageType) &&
        Objects.equals(this.virtualMachineType, virtualClientQueryRestriction.virtualMachineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usage, remark, visibleId, id, elid, first, usageType, virtualMachineType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualClientQueryRestriction {\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    virtualMachineType: ").append(toIndentedString(virtualMachineType)).append("\n");
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
