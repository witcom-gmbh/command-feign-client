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
 * UpdateVirtualServerUpdateVirtualHardDiskRequestData
 */
@JsonPropertyOrder({
  UpdateVirtualServerUpdateVirtualHardDiskRequestData.JSON_PROPERTY_STORE_WITH_VM,
  UpdateVirtualServerUpdateVirtualHardDiskRequestData.JSON_PROPERTY_NAME,
  UpdateVirtualServerUpdateVirtualHardDiskRequestData.JSON_PROPERTY_HDD_MODE,
  UpdateVirtualServerUpdateVirtualHardDiskRequestData.JSON_PROPERTY_V_MODE,
  UpdateVirtualServerUpdateVirtualHardDiskRequestData.JSON_PROPERTY_LINK_ELID,
  UpdateVirtualServerUpdateVirtualHardDiskRequestData.JSON_PROPERTY_CAPACITY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateVirtualServerUpdateVirtualHardDiskRequestData {
  public static final String JSON_PROPERTY_STORE_WITH_VM = "storeWithVm";
  private Boolean storeWithVm;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_HDD_MODE = "hddMode";
  private String hddMode;

  public static final String JSON_PROPERTY_V_MODE = "vMode";
  private String vMode;

  public static final String JSON_PROPERTY_LINK_ELID = "linkElid";
  private String linkElid;

  public static final String JSON_PROPERTY_CAPACITY = "capacity";
  private BigDecimal capacity;

  public UpdateVirtualServerUpdateVirtualHardDiskRequestData() {
  }

  public UpdateVirtualServerUpdateVirtualHardDiskRequestData storeWithVm(Boolean storeWithVm) {
    
    this.storeWithVm = storeWithVm;
    return this;
  }

   /**
   * Get storeWithVm
   * @return storeWithVm
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORE_WITH_VM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getStoreWithVm() {
    return storeWithVm;
  }


  @JsonProperty(JSON_PROPERTY_STORE_WITH_VM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreWithVm(Boolean storeWithVm) {
    this.storeWithVm = storeWithVm;
  }


  public UpdateVirtualServerUpdateVirtualHardDiskRequestData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UpdateVirtualServerUpdateVirtualHardDiskRequestData hddMode(String hddMode) {
    
    this.hddMode = hddMode;
    return this;
  }

   /**
   * Get hddMode
   * @return hddMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HDD_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHddMode() {
    return hddMode;
  }


  @JsonProperty(JSON_PROPERTY_HDD_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHddMode(String hddMode) {
    this.hddMode = hddMode;
  }


  public UpdateVirtualServerUpdateVirtualHardDiskRequestData vMode(String vMode) {
    
    this.vMode = vMode;
    return this;
  }

   /**
   * Get vMode
   * @return vMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_V_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getvMode() {
    return vMode;
  }


  @JsonProperty(JSON_PROPERTY_V_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setvMode(String vMode) {
    this.vMode = vMode;
  }


  public UpdateVirtualServerUpdateVirtualHardDiskRequestData linkElid(String linkElid) {
    
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


  public UpdateVirtualServerUpdateVirtualHardDiskRequestData capacity(BigDecimal capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCapacity() {
    return capacity;
  }


  @JsonProperty(JSON_PROPERTY_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapacity(BigDecimal capacity) {
    this.capacity = capacity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVirtualServerUpdateVirtualHardDiskRequestData updateVirtualServerUpdateVirtualHardDiskRequestData = (UpdateVirtualServerUpdateVirtualHardDiskRequestData) o;
    return Objects.equals(this.storeWithVm, updateVirtualServerUpdateVirtualHardDiskRequestData.storeWithVm) &&
        Objects.equals(this.name, updateVirtualServerUpdateVirtualHardDiskRequestData.name) &&
        Objects.equals(this.hddMode, updateVirtualServerUpdateVirtualHardDiskRequestData.hddMode) &&
        Objects.equals(this.vMode, updateVirtualServerUpdateVirtualHardDiskRequestData.vMode) &&
        Objects.equals(this.linkElid, updateVirtualServerUpdateVirtualHardDiskRequestData.linkElid) &&
        Objects.equals(this.capacity, updateVirtualServerUpdateVirtualHardDiskRequestData.capacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeWithVm, name, hddMode, vMode, linkElid, capacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVirtualServerUpdateVirtualHardDiskRequestData {\n");
    sb.append("    storeWithVm: ").append(toIndentedString(storeWithVm)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hddMode: ").append(toIndentedString(hddMode)).append("\n");
    sb.append("    vMode: ").append(toIndentedString(vMode)).append("\n");
    sb.append("    linkElid: ").append(toIndentedString(linkElid)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
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
