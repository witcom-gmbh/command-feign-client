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
 * UpdateIpv4AddressUpdateLinkCustomBgpnbv4RequestData
 */
@JsonPropertyOrder({
  UpdateIpv4AddressUpdateLinkCustomBgpnbv4RequestData.JSON_PROPERTY_ATTACHED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateIpv4AddressUpdateLinkCustomBgpnbv4RequestData {
  public static final String JSON_PROPERTY_ATTACHED = "attached";
  private String attached;

  public UpdateIpv4AddressUpdateLinkCustomBgpnbv4RequestData() {
  }

  public UpdateIpv4AddressUpdateLinkCustomBgpnbv4RequestData attached(String attached) {
    
    this.attached = attached;
    return this;
  }

   /**
   * Get attached
   * @return attached
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttached() {
    return attached;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttached(String attached) {
    this.attached = attached;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateIpv4AddressUpdateLinkCustomBgpnbv4RequestData updateIpv4AddressUpdateLinkCustomBgpnbv4RequestData = (UpdateIpv4AddressUpdateLinkCustomBgpnbv4RequestData) o;
    return Objects.equals(this.attached, updateIpv4AddressUpdateLinkCustomBgpnbv4RequestData.attached);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attached);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateIpv4AddressUpdateLinkCustomBgpnbv4RequestData {\n");
    sb.append("    attached: ").append(toIndentedString(attached)).append("\n");
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
