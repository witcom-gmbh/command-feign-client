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
 * UpdateCustomPostalAddressCreateLinkCampusRequestData
 */
@JsonPropertyOrder({
  UpdateCustomPostalAddressCreateLinkCampusRequestData.JSON_PROPERTY_ADDRESS_TYPE,
  UpdateCustomPostalAddressCreateLinkCampusRequestData.JSON_PROPERTY_PRIMARY_ADDRESS,
  UpdateCustomPostalAddressCreateLinkCampusRequestData.JSON_PROPERTY_LINKED_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateCustomPostalAddressCreateLinkCampusRequestData {
  public static final String JSON_PROPERTY_ADDRESS_TYPE = "addressType";
  private String addressType;

  public static final String JSON_PROPERTY_PRIMARY_ADDRESS = "primaryAddress";
  private String primaryAddress;

  public static final String JSON_PROPERTY_LINKED_ELID = "linkedElid";
  private String linkedElid;

  public UpdateCustomPostalAddressCreateLinkCampusRequestData() {
  }

  public UpdateCustomPostalAddressCreateLinkCampusRequestData addressType(String addressType) {
    
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressType() {
    return addressType;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }


  public UpdateCustomPostalAddressCreateLinkCampusRequestData primaryAddress(String primaryAddress) {
    
    this.primaryAddress = primaryAddress;
    return this;
  }

   /**
   * Get primaryAddress
   * @return primaryAddress
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryAddress() {
    return primaryAddress;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryAddress(String primaryAddress) {
    this.primaryAddress = primaryAddress;
  }


  public UpdateCustomPostalAddressCreateLinkCampusRequestData linkedElid(String linkedElid) {
    
    this.linkedElid = linkedElid;
    return this;
  }

   /**
   * Get linkedElid
   * @return linkedElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkedElid() {
    return linkedElid;
  }


  @JsonProperty(JSON_PROPERTY_LINKED_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkedElid(String linkedElid) {
    this.linkedElid = linkedElid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomPostalAddressCreateLinkCampusRequestData updateCustomPostalAddressCreateLinkCampusRequestData = (UpdateCustomPostalAddressCreateLinkCampusRequestData) o;
    return Objects.equals(this.addressType, updateCustomPostalAddressCreateLinkCampusRequestData.addressType) &&
        Objects.equals(this.primaryAddress, updateCustomPostalAddressCreateLinkCampusRequestData.primaryAddress) &&
        Objects.equals(this.linkedElid, updateCustomPostalAddressCreateLinkCampusRequestData.linkedElid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, primaryAddress, linkedElid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomPostalAddressCreateLinkCampusRequestData {\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    primaryAddress: ").append(toIndentedString(primaryAddress)).append("\n");
    sb.append("    linkedElid: ").append(toIndentedString(linkedElid)).append("\n");
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
