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
import com.fntsoftware.businessgateway.entities.VlanGroupvlanGroupInfo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SVlanvlanInfo
 */
@JsonPropertyOrder({
  SVlanvlanInfo.JSON_PROPERTY_COLOR,
  SVlanvlanInfo.JSON_PROPERTY_VLAN_ID,
  SVlanvlanInfo.JSON_PROPERTY_VLAN_POOL_ELID,
  SVlanvlanInfo.JSON_PROPERTY_REMARK,
  SVlanvlanInfo.JSON_PROPERTY_VLAN_NAME,
  SVlanvlanInfo.JSON_PROPERTY_TYPE,
  SVlanvlanInfo.JSON_PROPERTY_VLAN_GROUPS,
  SVlanvlanInfo.JSON_PROPERTY_ELID,
  SVlanvlanInfo.JSON_PROPERTY_STATUS
})
@JsonTypeName("sVlanvlanInfo")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class SVlanvlanInfo {
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

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VLAN_GROUPS = "vlanGroups";
  private List<VlanGroupvlanGroupInfo> vlanGroups;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public SVlanvlanInfo() {
  }

  public SVlanvlanInfo color(String color) {
    
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


  public SVlanvlanInfo vlanId(BigDecimal vlanId) {
    
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


  public SVlanvlanInfo vlanPoolElid(String vlanPoolElid) {
    
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


  public SVlanvlanInfo remark(String remark) {
    
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


  public SVlanvlanInfo vlanName(String vlanName) {
    
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


  public SVlanvlanInfo type(String type) {
    
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


  public SVlanvlanInfo vlanGroups(List<VlanGroupvlanGroupInfo> vlanGroups) {
    
    this.vlanGroups = vlanGroups;
    return this;
  }

  public SVlanvlanInfo addVlanGroupsItem(VlanGroupvlanGroupInfo vlanGroupsItem) {
    if (this.vlanGroups == null) {
      this.vlanGroups = new ArrayList<>();
    }
    this.vlanGroups.add(vlanGroupsItem);
    return this;
  }

   /**
   * Get vlanGroups
   * @return vlanGroups
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VLAN_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VlanGroupvlanGroupInfo> getVlanGroups() {
    return vlanGroups;
  }


  @JsonProperty(JSON_PROPERTY_VLAN_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVlanGroups(List<VlanGroupvlanGroupInfo> vlanGroups) {
    this.vlanGroups = vlanGroups;
  }


  public SVlanvlanInfo elid(String elid) {
    
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


  public SVlanvlanInfo status(String status) {
    
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
    SVlanvlanInfo sVlanvlanInfo = (SVlanvlanInfo) o;
    return Objects.equals(this.color, sVlanvlanInfo.color) &&
        Objects.equals(this.vlanId, sVlanvlanInfo.vlanId) &&
        Objects.equals(this.vlanPoolElid, sVlanvlanInfo.vlanPoolElid) &&
        Objects.equals(this.remark, sVlanvlanInfo.remark) &&
        Objects.equals(this.vlanName, sVlanvlanInfo.vlanName) &&
        Objects.equals(this.type, sVlanvlanInfo.type) &&
        Objects.equals(this.vlanGroups, sVlanvlanInfo.vlanGroups) &&
        Objects.equals(this.elid, sVlanvlanInfo.elid) &&
        Objects.equals(this.status, sVlanvlanInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, vlanId, vlanPoolElid, remark, vlanName, type, vlanGroups, elid, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SVlanvlanInfo {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
    sb.append("    vlanPoolElid: ").append(toIndentedString(vlanPoolElid)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    vlanName: ").append(toIndentedString(vlanName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vlanGroups: ").append(toIndentedString(vlanGroups)).append("\n");
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
