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
import com.fntsoftware.businessgateway.entities.ObjectAccessInfo;
import com.fntsoftware.businessgateway.entities.ObjectOwnerInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ipv4NetworkSystemAttributesResponseData
 */
@JsonPropertyOrder({
  Ipv4NetworkSystemAttributesResponseData.JSON_PROPERTY_OWNER,
  Ipv4NetworkSystemAttributesResponseData.JSON_PROPERTY_SOURCE_ID,
  Ipv4NetworkSystemAttributesResponseData.JSON_PROPERTY_LAST_UPDATED_BY,
  Ipv4NetworkSystemAttributesResponseData.JSON_PROPERTY_LAST_UPDATED_AT,
  Ipv4NetworkSystemAttributesResponseData.JSON_PROPERTY_SOURCE_SYSTEM,
  Ipv4NetworkSystemAttributesResponseData.JSON_PROPERTY_OBJECT_OWNER,
  Ipv4NetworkSystemAttributesResponseData.JSON_PROPERTY_SYSTEM_OWNER,
  Ipv4NetworkSystemAttributesResponseData.JSON_PROPERTY_ELID,
  Ipv4NetworkSystemAttributesResponseData.JSON_PROPERTY_UUID,
  Ipv4NetworkSystemAttributesResponseData.JSON_PROPERTY_CREATE_DATE,
  Ipv4NetworkSystemAttributesResponseData.JSON_PROPERTY_EXTENDED_OBJECT_ACCESS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class Ipv4NetworkSystemAttributesResponseData {
  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_LAST_UPDATED_BY = "lastUpdatedBy";
  private String lastUpdatedBy;

  public static final String JSON_PROPERTY_LAST_UPDATED_AT = "lastUpdatedAt";
  private DateTime lastUpdatedAt;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_OBJECT_OWNER = "objectOwner";
  private List<ObjectOwnerInfo> objectOwner;

  public static final String JSON_PROPERTY_SYSTEM_OWNER = "systemOwner";
  private String systemOwner;

  public static final String JSON_PROPERTY_ELID = "elid";
  private String elid;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  private DateTime createDate;

  public static final String JSON_PROPERTY_EXTENDED_OBJECT_ACCESS = "extendedObjectAccess";
  private List<ObjectAccessInfo> extendedObjectAccess;

  public Ipv4NetworkSystemAttributesResponseData() {
  }

  public Ipv4NetworkSystemAttributesResponseData owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  public Ipv4NetworkSystemAttributesResponseData sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceId() {
    return sourceId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public Ipv4NetworkSystemAttributesResponseData lastUpdatedBy(String lastUpdatedBy) {
    
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  public Ipv4NetworkSystemAttributesResponseData lastUpdatedAt(DateTime lastUpdatedAt) {
    
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

   /**
   * Get lastUpdatedAt
   * @return lastUpdatedAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getLastUpdatedAt() {
    return lastUpdatedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdatedAt(DateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }


  public Ipv4NetworkSystemAttributesResponseData sourceSystem(String sourceSystem) {
    
    this.sourceSystem = sourceSystem;
    return this;
  }

   /**
   * Get sourceSystem
   * @return sourceSystem
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceSystem() {
    return sourceSystem;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
  }


  public Ipv4NetworkSystemAttributesResponseData objectOwner(List<ObjectOwnerInfo> objectOwner) {
    
    this.objectOwner = objectOwner;
    return this;
  }

  public Ipv4NetworkSystemAttributesResponseData addObjectOwnerItem(ObjectOwnerInfo objectOwnerItem) {
    if (this.objectOwner == null) {
      this.objectOwner = new ArrayList<>();
    }
    this.objectOwner.add(objectOwnerItem);
    return this;
  }

   /**
   * Get objectOwner
   * @return objectOwner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJECT_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObjectOwnerInfo> getObjectOwner() {
    return objectOwner;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectOwner(List<ObjectOwnerInfo> objectOwner) {
    this.objectOwner = objectOwner;
  }


  public Ipv4NetworkSystemAttributesResponseData systemOwner(String systemOwner) {
    
    this.systemOwner = systemOwner;
    return this;
  }

   /**
   * Get systemOwner
   * @return systemOwner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYSTEM_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSystemOwner() {
    return systemOwner;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemOwner(String systemOwner) {
    this.systemOwner = systemOwner;
  }


  public Ipv4NetworkSystemAttributesResponseData elid(String elid) {
    
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


  public Ipv4NetworkSystemAttributesResponseData uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public Ipv4NetworkSystemAttributesResponseData createDate(DateTime createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DateTime getCreateDate() {
    return createDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateDate(DateTime createDate) {
    this.createDate = createDate;
  }


  public Ipv4NetworkSystemAttributesResponseData extendedObjectAccess(List<ObjectAccessInfo> extendedObjectAccess) {
    
    this.extendedObjectAccess = extendedObjectAccess;
    return this;
  }

  public Ipv4NetworkSystemAttributesResponseData addExtendedObjectAccessItem(ObjectAccessInfo extendedObjectAccessItem) {
    if (this.extendedObjectAccess == null) {
      this.extendedObjectAccess = new ArrayList<>();
    }
    this.extendedObjectAccess.add(extendedObjectAccessItem);
    return this;
  }

   /**
   * Get extendedObjectAccess
   * @return extendedObjectAccess
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTENDED_OBJECT_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObjectAccessInfo> getExtendedObjectAccess() {
    return extendedObjectAccess;
  }


  @JsonProperty(JSON_PROPERTY_EXTENDED_OBJECT_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtendedObjectAccess(List<ObjectAccessInfo> extendedObjectAccess) {
    this.extendedObjectAccess = extendedObjectAccess;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ipv4NetworkSystemAttributesResponseData ipv4NetworkSystemAttributesResponseData = (Ipv4NetworkSystemAttributesResponseData) o;
    return Objects.equals(this.owner, ipv4NetworkSystemAttributesResponseData.owner) &&
        Objects.equals(this.sourceId, ipv4NetworkSystemAttributesResponseData.sourceId) &&
        Objects.equals(this.lastUpdatedBy, ipv4NetworkSystemAttributesResponseData.lastUpdatedBy) &&
        Objects.equals(this.lastUpdatedAt, ipv4NetworkSystemAttributesResponseData.lastUpdatedAt) &&
        Objects.equals(this.sourceSystem, ipv4NetworkSystemAttributesResponseData.sourceSystem) &&
        Objects.equals(this.objectOwner, ipv4NetworkSystemAttributesResponseData.objectOwner) &&
        Objects.equals(this.systemOwner, ipv4NetworkSystemAttributesResponseData.systemOwner) &&
        Objects.equals(this.elid, ipv4NetworkSystemAttributesResponseData.elid) &&
        Objects.equals(this.uuid, ipv4NetworkSystemAttributesResponseData.uuid) &&
        Objects.equals(this.createDate, ipv4NetworkSystemAttributesResponseData.createDate) &&
        Objects.equals(this.extendedObjectAccess, ipv4NetworkSystemAttributesResponseData.extendedObjectAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, sourceId, lastUpdatedBy, lastUpdatedAt, sourceSystem, objectOwner, systemOwner, elid, uuid, createDate, extendedObjectAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ipv4NetworkSystemAttributesResponseData {\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    objectOwner: ").append(toIndentedString(objectOwner)).append("\n");
    sb.append("    systemOwner: ").append(toIndentedString(systemOwner)).append("\n");
    sb.append("    elid: ").append(toIndentedString(elid)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    extendedObjectAccess: ").append(toIndentedString(extendedObjectAccess)).append("\n");
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
