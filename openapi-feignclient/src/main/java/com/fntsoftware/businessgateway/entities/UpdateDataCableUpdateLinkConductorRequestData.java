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
 * UpdateDataCableUpdateLinkConductorRequestData
 */
@JsonPropertyOrder({
  UpdateDataCableUpdateLinkConductorRequestData.JSON_PROPERTY_BLOCK_FLAG,
  UpdateDataCableUpdateLinkConductorRequestData.JSON_PROPERTY_LENGTH,
  UpdateDataCableUpdateLinkConductorRequestData.JSON_PROPERTY_REMARK,
  UpdateDataCableUpdateLinkConductorRequestData.JSON_PROPERTY_LINK_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class UpdateDataCableUpdateLinkConductorRequestData {
  public static final String JSON_PROPERTY_BLOCK_FLAG = "blockFlag";
  private String blockFlag;

  public static final String JSON_PROPERTY_LENGTH = "length";
  private BigDecimal length;

  public static final String JSON_PROPERTY_REMARK = "remark";
  private String remark;

  public static final String JSON_PROPERTY_LINK_ELID = "linkElid";
  private String linkElid;

  public UpdateDataCableUpdateLinkConductorRequestData() {
  }

  public UpdateDataCableUpdateLinkConductorRequestData blockFlag(String blockFlag) {
    
    this.blockFlag = blockFlag;
    return this;
  }

   /**
   * Get blockFlag
   * @return blockFlag
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBlockFlag() {
    return blockFlag;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockFlag(String blockFlag) {
    this.blockFlag = blockFlag;
  }


  public UpdateDataCableUpdateLinkConductorRequestData length(BigDecimal length) {
    
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLength() {
    return length;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLength(BigDecimal length) {
    this.length = length;
  }


  public UpdateDataCableUpdateLinkConductorRequestData remark(String remark) {
    
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


  public UpdateDataCableUpdateLinkConductorRequestData linkElid(String linkElid) {
    
    this.linkElid = linkElid;
    return this;
  }

   /**
   * Get linkElid
   * @return linkElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkElid() {
    return linkElid;
  }


  @JsonProperty(JSON_PROPERTY_LINK_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkElid(String linkElid) {
    this.linkElid = linkElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDataCableUpdateLinkConductorRequestData updateDataCableUpdateLinkConductorRequestData = (UpdateDataCableUpdateLinkConductorRequestData) o;
    return Objects.equals(this.blockFlag, updateDataCableUpdateLinkConductorRequestData.blockFlag) &&
        Objects.equals(this.length, updateDataCableUpdateLinkConductorRequestData.length) &&
        Objects.equals(this.remark, updateDataCableUpdateLinkConductorRequestData.remark) &&
        Objects.equals(this.linkElid, updateDataCableUpdateLinkConductorRequestData.linkElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockFlag, length, remark, linkElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDataCableUpdateLinkConductorRequestData {\n");
    sb.append("    blockFlag: ").append(toIndentedString(blockFlag)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    linkElid: ").append(toIndentedString(linkElid)).append("\n");
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
