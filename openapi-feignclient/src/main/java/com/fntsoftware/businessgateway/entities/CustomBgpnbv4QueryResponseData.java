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
 * CustomBgpnbv4QueryResponseData
 */
@JsonPropertyOrder({
  CustomBgpnbv4QueryResponseData.JSON_PROPERTY_ACCEPTED_AS_SET,
  CustomBgpnbv4QueryResponseData.JSON_PROPERTY_LOCAL_AS,
  CustomBgpnbv4QueryResponseData.JSON_PROPERTY_REMOTE_AS,
  CustomBgpnbv4QueryResponseData.JSON_PROPERTY_OFFERED_AS_SET,
  CustomBgpnbv4QueryResponseData.JSON_PROPERTY_OFFERED_PFX,
  CustomBgpnbv4QueryResponseData.JSON_PROPERTY_ID,
  CustomBgpnbv4QueryResponseData.JSON_PROPERTY_ACCEPTED_PFX,
  CustomBgpnbv4QueryResponseData.JSON_PROPERTY_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CustomBgpnbv4QueryResponseData {
  public static final String JSON_PROPERTY_ACCEPTED_AS_SET = "acceptedAsSet";
  private String acceptedAsSet;

  public static final String JSON_PROPERTY_LOCAL_AS = "localAs";
  private BigDecimal localAs;

  public static final String JSON_PROPERTY_REMOTE_AS = "remoteAs";
  private BigDecimal remoteAs;

  public static final String JSON_PROPERTY_OFFERED_AS_SET = "offeredAsSet";
  private String offeredAsSet;

  public static final String JSON_PROPERTY_OFFERED_PFX = "offeredPfx";
  private String offeredPfx;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ACCEPTED_PFX = "acceptedPfx";
  private String acceptedPfx;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public CustomBgpnbv4QueryResponseData() {
  }

  public CustomBgpnbv4QueryResponseData acceptedAsSet(String acceptedAsSet) {
    
    this.acceptedAsSet = acceptedAsSet;
    return this;
  }

   /**
   * Get acceptedAsSet
   * @return acceptedAsSet
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCEPTED_AS_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcceptedAsSet() {
    return acceptedAsSet;
  }


  @JsonProperty(JSON_PROPERTY_ACCEPTED_AS_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptedAsSet(String acceptedAsSet) {
    this.acceptedAsSet = acceptedAsSet;
  }


  public CustomBgpnbv4QueryResponseData localAs(BigDecimal localAs) {
    
    this.localAs = localAs;
    return this;
  }

   /**
   * Get localAs
   * @return localAs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCAL_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLocalAs() {
    return localAs;
  }


  @JsonProperty(JSON_PROPERTY_LOCAL_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocalAs(BigDecimal localAs) {
    this.localAs = localAs;
  }


  public CustomBgpnbv4QueryResponseData remoteAs(BigDecimal remoteAs) {
    
    this.remoteAs = remoteAs;
    return this;
  }

   /**
   * Get remoteAs
   * @return remoteAs
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOTE_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRemoteAs() {
    return remoteAs;
  }


  @JsonProperty(JSON_PROPERTY_REMOTE_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoteAs(BigDecimal remoteAs) {
    this.remoteAs = remoteAs;
  }


  public CustomBgpnbv4QueryResponseData offeredAsSet(String offeredAsSet) {
    
    this.offeredAsSet = offeredAsSet;
    return this;
  }

   /**
   * Get offeredAsSet
   * @return offeredAsSet
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFERED_AS_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOfferedAsSet() {
    return offeredAsSet;
  }


  @JsonProperty(JSON_PROPERTY_OFFERED_AS_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfferedAsSet(String offeredAsSet) {
    this.offeredAsSet = offeredAsSet;
  }


  public CustomBgpnbv4QueryResponseData offeredPfx(String offeredPfx) {
    
    this.offeredPfx = offeredPfx;
    return this;
  }

   /**
   * Get offeredPfx
   * @return offeredPfx
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFERED_PFX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOfferedPfx() {
    return offeredPfx;
  }


  @JsonProperty(JSON_PROPERTY_OFFERED_PFX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfferedPfx(String offeredPfx) {
    this.offeredPfx = offeredPfx;
  }


  public CustomBgpnbv4QueryResponseData id(String id) {
    
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

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public CustomBgpnbv4QueryResponseData acceptedPfx(String acceptedPfx) {
    
    this.acceptedPfx = acceptedPfx;
    return this;
  }

   /**
   * Get acceptedPfx
   * @return acceptedPfx
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCEPTED_PFX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcceptedPfx() {
    return acceptedPfx;
  }


  @JsonProperty(JSON_PROPERTY_ACCEPTED_PFX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptedPfx(String acceptedPfx) {
    this.acceptedPfx = acceptedPfx;
  }


  public CustomBgpnbv4QueryResponseData elid(String elid) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomBgpnbv4QueryResponseData customBgpnbv4QueryResponseData = (CustomBgpnbv4QueryResponseData) o;
    return Objects.equals(this.acceptedAsSet, customBgpnbv4QueryResponseData.acceptedAsSet) &&
        Objects.equals(this.localAs, customBgpnbv4QueryResponseData.localAs) &&
        Objects.equals(this.remoteAs, customBgpnbv4QueryResponseData.remoteAs) &&
        Objects.equals(this.offeredAsSet, customBgpnbv4QueryResponseData.offeredAsSet) &&
        Objects.equals(this.offeredPfx, customBgpnbv4QueryResponseData.offeredPfx) &&
        Objects.equals(this.id, customBgpnbv4QueryResponseData.id) &&
        Objects.equals(this.acceptedPfx, customBgpnbv4QueryResponseData.acceptedPfx) &&
        Objects.equals(this.elid, customBgpnbv4QueryResponseData.elid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedAsSet, localAs, remoteAs, offeredAsSet, offeredPfx, id, acceptedPfx, elid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomBgpnbv4QueryResponseData {\n");
    sb.append("    acceptedAsSet: ").append(toIndentedString(acceptedAsSet)).append("\n");
    sb.append("    localAs: ").append(toIndentedString(localAs)).append("\n");
    sb.append("    remoteAs: ").append(toIndentedString(remoteAs)).append("\n");
    sb.append("    offeredAsSet: ").append(toIndentedString(offeredAsSet)).append("\n");
    sb.append("    offeredPfx: ").append(toIndentedString(offeredPfx)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    acceptedPfx: ").append(toIndentedString(acceptedPfx)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
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
