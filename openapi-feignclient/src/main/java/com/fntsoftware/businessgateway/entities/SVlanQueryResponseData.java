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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SVlanQueryResponseData
 */
@JsonPropertyOrder({
  SVlanQueryResponseData.JSON_PROPERTY_VLAN_POOL_NAME,
  SVlanQueryResponseData.JSON_PROPERTY_COLOR,
  SVlanQueryResponseData.JSON_PROPERTY_VLAN_ID,
  SVlanQueryResponseData.JSON_PROPERTY_VLAN_POOL_ELID,
  SVlanQueryResponseData.JSON_PROPERTY_REMARK,
  SVlanQueryResponseData.JSON_PROPERTY_VLAN_NAME,
  SVlanQueryResponseData.JSON_PROPERTY_C_REFERENCE,
  SVlanQueryResponseData.JSON_PROPERTY_TYPE,
  SVlanQueryResponseData.JSON_PROPERTY_ELID,
  SVlanQueryResponseData.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class SVlanQueryResponseData {
  public static final String JSON_PROPERTY_VLAN_POOL_NAME = "vlanPoolName";
  private String vlanPoolName;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_VLAN_ID = "vlanId";
  private BigDecimal vlanId;

  public static final String JSON_PROPERTY_VLAN_POOL_ELID = "vlanPoolElid";
  private String vlanPoolElid;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_VLAN_NAME = "vlanName";
  private String vlanName;

  public static final String JSON_PROPERTY_C_REFERENCE = "cReference";
  private String cReference;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public SVlanQueryResponseData() {
  }

  public SVlanQueryResponseData vlanPoolName(String vlanPoolName) {
    
    this.vlanPoolName = vlanPoolName;
    return this;
  }

   /**
   * Get vlanPoolName
   * @return vlanPoolName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN_POOL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVlanPoolName() {
    return vlanPoolName;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_POOL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanPoolName(String vlanPoolName) {
    this.vlanPoolName = vlanPoolName;
  }


  public SVlanQueryResponseData color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(String color) {
    this.color = color;
  }


  public SVlanQueryResponseData vlanId(BigDecimal vlanId) {
    
    this.vlanId = vlanId;
    return this;
  }

   /**
   * Get vlanId
   * @return vlanId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getVlanId() {
    return vlanId;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanId(BigDecimal vlanId) {
    this.vlanId = vlanId;
  }


  public SVlanQueryResponseData vlanPoolElid(String vlanPoolElid) {
    
    this.vlanPoolElid = vlanPoolElid;
    return this;
  }

   /**
   * Get vlanPoolElid
   * @return vlanPoolElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN_POOL_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVlanPoolElid() {
    return vlanPoolElid;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_POOL_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanPoolElid(String vlanPoolElid) {
    this.vlanPoolElid = vlanPoolElid;
  }


  public SVlanQueryResponseData remark(String remark) {
    
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

  public String getRemark() {
    return remark;
  }


  @JsonProperty(JSON_PROPERTY_REMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemark(String remark) {
    this.remark = remark;
  }


  public SVlanQueryResponseData vlanName(String vlanName) {
    
    this.vlanName = vlanName;
    return this;
  }

   /**
   * Get vlanName
   * @return vlanName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVlanName() {
    return vlanName;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanName(String vlanName) {
    this.vlanName = vlanName;
  }


  public SVlanQueryResponseData cReference(String cReference) {
    
    this.cReference = cReference;
    return this;
  }

   /**
   * Get cReference
   * @return cReference
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_C_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getcReference() {
    return cReference;
  }


  @JsonProperty(JSON_PROPERTY_C_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setcReference(String cReference) {
    this.cReference = cReference;
  }


  public SVlanQueryResponseData type(String type) {
    
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


  public SVlanQueryResponseData elid(String elid) {
    
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


  public SVlanQueryResponseData status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SVlanQueryResponseData svlanQueryResponseData = (SVlanQueryResponseData) o;
    return Objects.equals(this.vlanPoolName, svlanQueryResponseData.vlanPoolName) &&
        Objects.equals(this.color, svlanQueryResponseData.color) &&
        Objects.equals(this.vlanId, svlanQueryResponseData.vlanId) &&
        Objects.equals(this.vlanPoolElid, svlanQueryResponseData.vlanPoolElid) &&
        Objects.equals(this.remark, svlanQueryResponseData.remark) &&
        Objects.equals(this.vlanName, svlanQueryResponseData.vlanName) &&
        Objects.equals(this.cReference, svlanQueryResponseData.cReference) &&
        Objects.equals(this.type, svlanQueryResponseData.type) &&
        Objects.equals(this.elid, svlanQueryResponseData.elid) &&
        Objects.equals(this.status, svlanQueryResponseData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vlanPoolName, color, vlanId, vlanPoolElid, remark, vlanName, cReference, type, elid, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SVlanQueryResponseData {\n");
    sb.append("    vlanPoolName: ").append(toIndentedString(vlanPoolName)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    vlanPoolElid: ").append(toIndentedString(vlanPoolElid)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    vlanName: ").append(toIndentedString(vlanName)).append("\n");
    sb.append("    cReference: ").append(toIndentedString(cReference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

