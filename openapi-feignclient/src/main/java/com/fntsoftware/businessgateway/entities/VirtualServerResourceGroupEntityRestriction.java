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
import com.fntsoftware.businessgateway.entities.RestrictionsDate;
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VirtualServerResourceGroupEntityRestriction
 */
@JsonPropertyOrder({
  VirtualServerResourceGroupEntityRestriction.JSON_PROPERTY_LIFECYCLE_STATUS_DATE,
  VirtualServerResourceGroupEntityRestriction.JSON_PROPERTY_LIFECYCLE_STATUS,
  VirtualServerResourceGroupEntityRestriction.JSON_PROPERTY_PURPOSE,
  VirtualServerResourceGroupEntityRestriction.JSON_PROPERTY_NAME,
  VirtualServerResourceGroupEntityRestriction.JSON_PROPERTY_PREFERED_OWNER,
  VirtualServerResourceGroupEntityRestriction.JSON_PROPERTY_DESCRIPTION,
  VirtualServerResourceGroupEntityRestriction.JSON_PROPERTY_VISIBLE_ID,
  VirtualServerResourceGroupEntityRestriction.JSON_PROPERTY_ID,
  VirtualServerResourceGroupEntityRestriction.JSON_PROPERTY_SUBSCRIPTION_ID,
  VirtualServerResourceGroupEntityRestriction.JSON_PROPERTY_ELID,
  VirtualServerResourceGroupEntityRestriction.JSON_PROPERTY_RG_LOCATION,
  VirtualServerResourceGroupEntityRestriction.JSON_PROPERTY_RESOURCE_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class VirtualServerResourceGroupEntityRestriction {
  public static final String JSON_PROPERTY_LIFECYCLE_STATUS_DATE = "lifecycleStatusDate";
  private RestrictionsDate lifecycleStatusDate;

  public static final String JSON_PROPERTY_LIFECYCLE_STATUS = "lifecycleStatus";
  private RestrictionsString lifecycleStatus;

  public static final String JSON_PROPERTY_PURPOSE = "purpose";
  private RestrictionsString purpose;

  public static final String JSON_PROPERTY_NAME = "name";
  private RestrictionsString name;

  public static final String JSON_PROPERTY_PREFERED_OWNER = "preferedOwner";
  private RestrictionsString preferedOwner;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private RestrictionsString description;

  public static final String JSON_PROPERTY_VISIBLE_ID = "visibleId";
  private RestrictionsString visibleId;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private RestrictionsString subscriptionId;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public static final String JSON_PROPERTY_RG_LOCATION = "rgLocation";
  private RestrictionsString rgLocation;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  private RestrictionsString resourceType;

  public VirtualServerResourceGroupEntityRestriction() {
  }

  public VirtualServerResourceGroupEntityRestriction lifecycleStatusDate(RestrictionsDate lifecycleStatusDate) {
    
    this.lifecycleStatusDate = lifecycleStatusDate;
    return this;
  }

   /**
   * Get lifecycleStatusDate
   * @return lifecycleStatusDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIFECYCLE_STATUS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsDate getLifecycleStatusDate() {
    return lifecycleStatusDate;
  }


  @JsonProperty(JSON_PROPERTY_LIFECYCLE_STATUS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifecycleStatusDate(RestrictionsDate lifecycleStatusDate) {
    this.lifecycleStatusDate = lifecycleStatusDate;
  }


  public VirtualServerResourceGroupEntityRestriction lifecycleStatus(RestrictionsString lifecycleStatus) {
    
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

   /**
   * Get lifecycleStatus
   * @return lifecycleStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIFECYCLE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getLifecycleStatus() {
    return lifecycleStatus;
  }


  @JsonProperty(JSON_PROPERTY_LIFECYCLE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifecycleStatus(RestrictionsString lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }


  public VirtualServerResourceGroupEntityRestriction purpose(RestrictionsString purpose) {
    
    this.purpose = purpose;
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPurpose() {
    return purpose;
  }


  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurpose(RestrictionsString purpose) {
    this.purpose = purpose;
  }


  public VirtualServerResourceGroupEntityRestriction name(RestrictionsString name) {
    
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

  public RestrictionsString getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(RestrictionsString name) {
    this.name = name;
  }


  public VirtualServerResourceGroupEntityRestriction preferedOwner(RestrictionsString preferedOwner) {
    
    this.preferedOwner = preferedOwner;
    return this;
  }

   /**
   * Get preferedOwner
   * @return preferedOwner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFERED_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPreferedOwner() {
    return preferedOwner;
  }


  @JsonProperty(JSON_PROPERTY_PREFERED_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferedOwner(RestrictionsString preferedOwner) {
    this.preferedOwner = preferedOwner;
  }


  public VirtualServerResourceGroupEntityRestriction description(RestrictionsString description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(RestrictionsString description) {
    this.description = description;
  }


  public VirtualServerResourceGroupEntityRestriction visibleId(RestrictionsString visibleId) {
    
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


  public VirtualServerResourceGroupEntityRestriction id(RestrictionsString id) {
    
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


  public VirtualServerResourceGroupEntityRestriction subscriptionId(RestrictionsString subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getSubscriptionId() {
    return subscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionId(RestrictionsString subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public VirtualServerResourceGroupEntityRestriction elid(RestrictionsString elid) {
    
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


  public VirtualServerResourceGroupEntityRestriction rgLocation(RestrictionsString rgLocation) {
    
    this.rgLocation = rgLocation;
    return this;
  }

   /**
   * Get rgLocation
   * @return rgLocation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RG_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getRgLocation() {
    return rgLocation;
  }


  @JsonProperty(JSON_PROPERTY_RG_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRgLocation(RestrictionsString rgLocation) {
    this.rgLocation = rgLocation;
  }


  public VirtualServerResourceGroupEntityRestriction resourceType(RestrictionsString resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getResourceType() {
    return resourceType;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceType(RestrictionsString resourceType) {
    this.resourceType = resourceType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualServerResourceGroupEntityRestriction virtualServerResourceGroupEntityRestriction = (VirtualServerResourceGroupEntityRestriction) o;
    return Objects.equals(this.lifecycleStatusDate, virtualServerResourceGroupEntityRestriction.lifecycleStatusDate) &&
        Objects.equals(this.lifecycleStatus, virtualServerResourceGroupEntityRestriction.lifecycleStatus) &&
        Objects.equals(this.purpose, virtualServerResourceGroupEntityRestriction.purpose) &&
        Objects.equals(this.name, virtualServerResourceGroupEntityRestriction.name) &&
        Objects.equals(this.preferedOwner, virtualServerResourceGroupEntityRestriction.preferedOwner) &&
        Objects.equals(this.description, virtualServerResourceGroupEntityRestriction.description) &&
        Objects.equals(this.visibleId, virtualServerResourceGroupEntityRestriction.visibleId) &&
        Objects.equals(this.id, virtualServerResourceGroupEntityRestriction.id) &&
        Objects.equals(this.subscriptionId, virtualServerResourceGroupEntityRestriction.subscriptionId) &&
        Objects.equals(this.elid, virtualServerResourceGroupEntityRestriction.elid) &&
        Objects.equals(this.rgLocation, virtualServerResourceGroupEntityRestriction.rgLocation) &&
        Objects.equals(this.resourceType, virtualServerResourceGroupEntityRestriction.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleStatusDate, lifecycleStatus, purpose, name, preferedOwner, description, visibleId, id, subscriptionId, elid, rgLocation, resourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualServerResourceGroupEntityRestriction {\n");
    sb.append("    lifecycleStatusDate: ").append(toIndentedString(lifecycleStatusDate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preferedOwner: ").append(toIndentedString(preferedOwner)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    visibleId: ").append(toIndentedString(visibleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    rgLocation: ").append(toIndentedString(rgLocation)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
