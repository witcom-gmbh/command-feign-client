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
import com.fntsoftware.businessgateway.entities.RestrictionsString;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StorageUnitQtreeSharesEntityRestriction
 */
@JsonPropertyOrder({
  StorageUnitQtreeSharesEntityRestriction.JSON_PROPERTY_PATH,
  StorageUnitQtreeSharesEntityRestriction.JSON_PROPERTY_NAME,
  StorageUnitQtreeSharesEntityRestriction.JSON_PROPERTY_ID,
  StorageUnitQtreeSharesEntityRestriction.JSON_PROPERTY_SHARE_ACCESS,
  StorageUnitQtreeSharesEntityRestriction.JSON_PROPERTY_ELID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class StorageUnitQtreeSharesEntityRestriction {
  public static final String JSON_PROPERTY_PATH = "path";
  private RestrictionsString path;

  public static final String JSON_PROPERTY_NAME = "name";
  private RestrictionsString name;

  public static final String JSON_PROPERTY_ID = "id";
  private RestrictionsString id;

  public static final String JSON_PROPERTY_SHARE_ACCESS = "shareAccess";
  private RestrictionsString shareAccess;

  public static final String JSON_PROPERTY_ELID = "elid";
  private RestrictionsString elid;

  public StorageUnitQtreeSharesEntityRestriction() {
  }

  public StorageUnitQtreeSharesEntityRestriction path(RestrictionsString path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(RestrictionsString path) {
    this.path = path;
  }


  public StorageUnitQtreeSharesEntityRestriction name(RestrictionsString name) {
    
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


  public StorageUnitQtreeSharesEntityRestriction id(RestrictionsString id) {
    
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


  public StorageUnitQtreeSharesEntityRestriction shareAccess(RestrictionsString shareAccess) {
    
    this.shareAccess = shareAccess;
    return this;
  }

   /**
   * Get shareAccess
   * @return shareAccess
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARE_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestrictionsString getShareAccess() {
    return shareAccess;
  }


  @JsonProperty(JSON_PROPERTY_SHARE_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareAccess(RestrictionsString shareAccess) {
    this.shareAccess = shareAccess;
  }


  public StorageUnitQtreeSharesEntityRestriction elid(RestrictionsString elid) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageUnitQtreeSharesEntityRestriction storageUnitQtreeSharesEntityRestriction = (StorageUnitQtreeSharesEntityRestriction) o;
    return Objects.equals(this.path, storageUnitQtreeSharesEntityRestriction.path) &&
        Objects.equals(this.name, storageUnitQtreeSharesEntityRestriction.name) &&
        Objects.equals(this.id, storageUnitQtreeSharesEntityRestriction.id) &&
        Objects.equals(this.shareAccess, storageUnitQtreeSharesEntityRestriction.shareAccess) &&
        Objects.equals(this.elid, storageUnitQtreeSharesEntityRestriction.elid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, name, id, shareAccess, elid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageUnitQtreeSharesEntityRestriction {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shareAccess: ").append(toIndentedString(shareAccess)).append("\n");
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
