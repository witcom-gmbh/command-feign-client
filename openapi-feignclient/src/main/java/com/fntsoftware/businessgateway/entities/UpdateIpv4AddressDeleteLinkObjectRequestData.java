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
 * UpdateIpv4AddressDeleteLinkObjectRequestData
 */
@JsonPropertyOrder({
  UpdateIpv4AddressDeleteLinkObjectRequestData.JSON_PROPERTY_LINK_ELID,
  UpdateIpv4AddressDeleteLinkObjectRequestData.JSON_PROPERTY_DELETE_ORPHANED_INTERFACE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateIpv4AddressDeleteLinkObjectRequestData {
  public static final String JSON_PROPERTY_LINK_ELID = "linkElid";
  private String linkElid;

  public static final String JSON_PROPERTY_DELETE_ORPHANED_INTERFACE = "deleteOrphanedInterface";
  private Boolean deleteOrphanedInterface;

  public UpdateIpv4AddressDeleteLinkObjectRequestData() {
  }

  public UpdateIpv4AddressDeleteLinkObjectRequestData linkElid(String linkElid) {
    
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


  public UpdateIpv4AddressDeleteLinkObjectRequestData deleteOrphanedInterface(Boolean deleteOrphanedInterface) {
    
    this.deleteOrphanedInterface = deleteOrphanedInterface;
    return this;
  }

   /**
   * Get deleteOrphanedInterface
   * @return deleteOrphanedInterface
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_ORPHANED_INTERFACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleteOrphanedInterface() {
    return deleteOrphanedInterface;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_ORPHANED_INTERFACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteOrphanedInterface(Boolean deleteOrphanedInterface) {
    this.deleteOrphanedInterface = deleteOrphanedInterface;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateIpv4AddressDeleteLinkObjectRequestData updateIpv4AddressDeleteLinkObjectRequestData = (UpdateIpv4AddressDeleteLinkObjectRequestData) o;
    return Objects.equals(this.linkElid, updateIpv4AddressDeleteLinkObjectRequestData.linkElid) &&
        Objects.equals(this.deleteOrphanedInterface, updateIpv4AddressDeleteLinkObjectRequestData.deleteOrphanedInterface);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkElid, deleteOrphanedInterface);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateIpv4AddressDeleteLinkObjectRequestData {\n");
    sb.append("    linkElid: ").append(toIndentedString(linkElid)).append("\n");
    sb.append("    deleteOrphanedInterface: ").append(toIndentedString(deleteOrphanedInterface)).append("\n");
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
