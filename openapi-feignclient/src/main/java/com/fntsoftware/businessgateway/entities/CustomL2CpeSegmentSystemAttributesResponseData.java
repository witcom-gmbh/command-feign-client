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
 * CustomL2CpeSegmentSystemAttributesResponseData
 */
@JsonPropertyOrder({
  CustomL2CpeSegmentSystemAttributesResponseData.JSON_PROPERTY_OWNER,
  CustomL2CpeSegmentSystemAttributesResponseData.JSON_PROPERTY_SOURCE_ID,
  CustomL2CpeSegmentSystemAttributesResponseData.JSON_PROPERTY_LAST_UPDATED_BY,
  CustomL2CpeSegmentSystemAttributesResponseData.JSON_PROPERTY_LAST_UPDATED_AT,
  CustomL2CpeSegmentSystemAttributesResponseData.JSON_PROPERTY_SOURCE_SYSTEM,
  CustomL2CpeSegmentSystemAttributesResponseData.JSON_PROPERTY_OBJECT_OWNER,
  CustomL2CpeSegmentSystemAttributesResponseData.JSON_PROPERTY_SYSTEM_OWNER,
  CustomL2CpeSegmentSystemAttributesResponseData.JSON_PROPERTY_ELID,
  CustomL2CpeSegmentSystemAttributesResponseData.JSON_PROPERTY_UUID,
  CustomL2CpeSegmentSystemAttributesResponseData.JSON_PROPERTY_CREATE_DATE,
  CustomL2CpeSegmentSystemAttributesResponseData.JSON_PROPERTY_EXTENDED_OBJECT_ACCESS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class CustomL2CpeSegmentSystemAttributesResponseData {
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

  public CustomL2CpeSegmentSystemAttributesResponseData() {
  }

  public CustomL2CpeSegmentSystemAttributesResponseData owner(String owner) {
    
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


  public CustomL2CpeSegmentSystemAttributesResponseData sourceId(String sourceId) {
    
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


  public CustomL2CpeSegmentSystemAttributesResponseData lastUpdatedBy(String lastUpdatedBy) {
    
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


  public CustomL2CpeSegmentSystemAttributesResponseData lastUpdatedAt(DateTime lastUpdatedAt) {
    
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


  public CustomL2CpeSegmentSystemAttributesResponseData sourceSystem(String sourceSystem) {
    
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


  public CustomL2CpeSegmentSystemAttributesResponseData objectOwner(List<ObjectOwnerInfo> objectOwner) {
    
    this.objectOwner = objectOwner;
    return this;
  }

  public CustomL2CpeSegmentSystemAttributesResponseData addObjectOwnerItem(ObjectOwnerInfo objectOwnerItem) {
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


  public CustomL2CpeSegmentSystemAttributesResponseData systemOwner(String systemOwner) {
    
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


  public CustomL2CpeSegmentSystemAttributesResponseData elid(String elid) {
    
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


  public CustomL2CpeSegmentSystemAttributesResponseData uuid(String uuid) {
    
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


  public CustomL2CpeSegmentSystemAttributesResponseData createDate(DateTime createDate) {
    
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


  public CustomL2CpeSegmentSystemAttributesResponseData extendedObjectAccess(List<ObjectAccessInfo> extendedObjectAccess) {
    
    this.extendedObjectAccess = extendedObjectAccess;
    return this;
  }

  public CustomL2CpeSegmentSystemAttributesResponseData addExtendedObjectAccessItem(ObjectAccessInfo extendedObjectAccessItem) {
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
    CustomL2CpeSegmentSystemAttributesResponseData customL2CpeSegmentSystemAttributesResponseData = (CustomL2CpeSegmentSystemAttributesResponseData) o;
    return Objects.equals(this.owner, customL2CpeSegmentSystemAttributesResponseData.owner) &&
        Objects.equals(this.sourceId, customL2CpeSegmentSystemAttributesResponseData.sourceId) &&
        Objects.equals(this.lastUpdatedBy, customL2CpeSegmentSystemAttributesResponseData.lastUpdatedBy) &&
        Objects.equals(this.lastUpdatedAt, customL2CpeSegmentSystemAttributesResponseData.lastUpdatedAt) &&
        Objects.equals(this.sourceSystem, customL2CpeSegmentSystemAttributesResponseData.sourceSystem) &&
        Objects.equals(this.objectOwner, customL2CpeSegmentSystemAttributesResponseData.objectOwner) &&
        Objects.equals(this.systemOwner, customL2CpeSegmentSystemAttributesResponseData.systemOwner) &&
        Objects.equals(this.elid, customL2CpeSegmentSystemAttributesResponseData.elid) &&
        Objects.equals(this.uuid, customL2CpeSegmentSystemAttributesResponseData.uuid) &&
        Objects.equals(this.createDate, customL2CpeSegmentSystemAttributesResponseData.createDate) &&
        Objects.equals(this.extendedObjectAccess, customL2CpeSegmentSystemAttributesResponseData.extendedObjectAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, sourceId, lastUpdatedBy, lastUpdatedAt, sourceSystem, objectOwner, systemOwner, elid, uuid, createDate, extendedObjectAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomL2CpeSegmentSystemAttributesResponseData {\n");
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
