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
import com.fntsoftware.businessgateway.entities.UpdateMandatorCreateLinkUserGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateMandatorCreateLinkUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateMandatorDeleteLinkUserGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateMandatorDeleteLinkUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateMandatorUpdateLinkUserGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateMandatorUpdateLinkUserRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateMandatorRequestData
 */
@JsonPropertyOrder({
  UpdateMandatorRequestData.JSON_PROPERTY_SOURCE_ID,
  UpdateMandatorRequestData.JSON_PROPERTY_USE_OWNER_FROM_ZONE,
  UpdateMandatorRequestData.JSON_PROPERTY_IS_PROTECTED,
  UpdateMandatorRequestData.JSON_PROPERTY_SOURCE_SYSTEM,
  UpdateMandatorRequestData.JSON_PROPERTY_DESCRIPTION,
  UpdateMandatorRequestData.JSON_PROPERTY_CONTEXT_ID,
  UpdateMandatorRequestData.JSON_PROPERTY_ROLE_ADDITION,
  UpdateMandatorRequestData.JSON_PROPERTY_CREATE_LINK_USER,
  UpdateMandatorRequestData.JSON_PROPERTY_CREATE_LINK_USER_GROUP,
  UpdateMandatorRequestData.JSON_PROPERTY_DELETE_LINK_USER,
  UpdateMandatorRequestData.JSON_PROPERTY_DELETE_LINK_USER_GROUP,
  UpdateMandatorRequestData.JSON_PROPERTY_UPDATE_LINK_USER,
  UpdateMandatorRequestData.JSON_PROPERTY_UPDATE_LINK_USER_GROUP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateMandatorRequestData {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_USE_OWNER_FROM_ZONE = "useOwnerFromZone";
  private Boolean useOwnerFromZone;

  public static final String JSON_PROPERTY_IS_PROTECTED = "isProtected";
  private Boolean isProtected;

  public static final String JSON_PROPERTY_SOURCE_SYSTEM = "sourceSystem";
  private String sourceSystem;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_ROLE_ADDITION = "roleAddition";
  private Boolean roleAddition;

  public static final String JSON_PROPERTY_CREATE_LINK_USER = "createLinkUser";
  private List<UpdateMandatorCreateLinkUserRequestData> createLinkUser;

  public static final String JSON_PROPERTY_CREATE_LINK_USER_GROUP = "createLinkUserGroup";
  private List<UpdateMandatorCreateLinkUserGroupRequestData> createLinkUserGroup;

  public static final String JSON_PROPERTY_DELETE_LINK_USER = "deleteLinkUser";
  private List<UpdateMandatorDeleteLinkUserRequestData> deleteLinkUser;

  public static final String JSON_PROPERTY_DELETE_LINK_USER_GROUP = "deleteLinkUserGroup";
  private List<UpdateMandatorDeleteLinkUserGroupRequestData> deleteLinkUserGroup;

  public static final String JSON_PROPERTY_UPDATE_LINK_USER = "updateLinkUser";
  private List<UpdateMandatorUpdateLinkUserRequestData> updateLinkUser;

  public static final String JSON_PROPERTY_UPDATE_LINK_USER_GROUP = "updateLinkUserGroup";
  private List<UpdateMandatorUpdateLinkUserGroupRequestData> updateLinkUserGroup;

  public UpdateMandatorRequestData() {
  }

  public UpdateMandatorRequestData sourceId(String sourceId) {
    
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


  public UpdateMandatorRequestData useOwnerFromZone(Boolean useOwnerFromZone) {
    
    this.useOwnerFromZone = useOwnerFromZone;
    return this;
  }

   /**
   * Get useOwnerFromZone
   * @return useOwnerFromZone
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_OWNER_FROM_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseOwnerFromZone() {
    return useOwnerFromZone;
  }


  @JsonProperty(JSON_PROPERTY_USE_OWNER_FROM_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseOwnerFromZone(Boolean useOwnerFromZone) {
    this.useOwnerFromZone = useOwnerFromZone;
  }


  public UpdateMandatorRequestData isProtected(Boolean isProtected) {
    
    this.isProtected = isProtected;
    return this;
  }

   /**
   * Get isProtected
   * @return isProtected
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PROTECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsProtected() {
    return isProtected;
  }


  @JsonProperty(JSON_PROPERTY_IS_PROTECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsProtected(Boolean isProtected) {
    this.isProtected = isProtected;
  }


  public UpdateMandatorRequestData sourceSystem(String sourceSystem) {
    
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


  public UpdateMandatorRequestData description(String description) {
    
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

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateMandatorRequestData contextId(String contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * Get contextId
   * @return contextId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContextId() {
    return contextId;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  public UpdateMandatorRequestData roleAddition(Boolean roleAddition) {
    
    this.roleAddition = roleAddition;
    return this;
  }

   /**
   * Get roleAddition
   * @return roleAddition
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_ADDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRoleAddition() {
    return roleAddition;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ADDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleAddition(Boolean roleAddition) {
    this.roleAddition = roleAddition;
  }


  public UpdateMandatorRequestData createLinkUser(List<UpdateMandatorCreateLinkUserRequestData> createLinkUser) {
    
    this.createLinkUser = createLinkUser;
    return this;
  }

  public UpdateMandatorRequestData addCreateLinkUserItem(UpdateMandatorCreateLinkUserRequestData createLinkUserItem) {
    if (this.createLinkUser == null) {
      this.createLinkUser = new ArrayList<>();
    }
    this.createLinkUser.add(createLinkUserItem);
    return this;
  }

   /**
   * Get createLinkUser
   * @return createLinkUser
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateMandatorCreateLinkUserRequestData> getCreateLinkUser() {
    return createLinkUser;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkUser(List<UpdateMandatorCreateLinkUserRequestData> createLinkUser) {
    this.createLinkUser = createLinkUser;
  }


  public UpdateMandatorRequestData createLinkUserGroup(List<UpdateMandatorCreateLinkUserGroupRequestData> createLinkUserGroup) {
    
    this.createLinkUserGroup = createLinkUserGroup;
    return this;
  }

  public UpdateMandatorRequestData addCreateLinkUserGroupItem(UpdateMandatorCreateLinkUserGroupRequestData createLinkUserGroupItem) {
    if (this.createLinkUserGroup == null) {
      this.createLinkUserGroup = new ArrayList<>();
    }
    this.createLinkUserGroup.add(createLinkUserGroupItem);
    return this;
  }

   /**
   * Get createLinkUserGroup
   * @return createLinkUserGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_LINK_USER_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateMandatorCreateLinkUserGroupRequestData> getCreateLinkUserGroup() {
    return createLinkUserGroup;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_LINK_USER_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateLinkUserGroup(List<UpdateMandatorCreateLinkUserGroupRequestData> createLinkUserGroup) {
    this.createLinkUserGroup = createLinkUserGroup;
  }


  public UpdateMandatorRequestData deleteLinkUser(List<UpdateMandatorDeleteLinkUserRequestData> deleteLinkUser) {
    
    this.deleteLinkUser = deleteLinkUser;
    return this;
  }

  public UpdateMandatorRequestData addDeleteLinkUserItem(UpdateMandatorDeleteLinkUserRequestData deleteLinkUserItem) {
    if (this.deleteLinkUser == null) {
      this.deleteLinkUser = new ArrayList<>();
    }
    this.deleteLinkUser.add(deleteLinkUserItem);
    return this;
  }

   /**
   * Get deleteLinkUser
   * @return deleteLinkUser
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateMandatorDeleteLinkUserRequestData> getDeleteLinkUser() {
    return deleteLinkUser;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkUser(List<UpdateMandatorDeleteLinkUserRequestData> deleteLinkUser) {
    this.deleteLinkUser = deleteLinkUser;
  }


  public UpdateMandatorRequestData deleteLinkUserGroup(List<UpdateMandatorDeleteLinkUserGroupRequestData> deleteLinkUserGroup) {
    
    this.deleteLinkUserGroup = deleteLinkUserGroup;
    return this;
  }

  public UpdateMandatorRequestData addDeleteLinkUserGroupItem(UpdateMandatorDeleteLinkUserGroupRequestData deleteLinkUserGroupItem) {
    if (this.deleteLinkUserGroup == null) {
      this.deleteLinkUserGroup = new ArrayList<>();
    }
    this.deleteLinkUserGroup.add(deleteLinkUserGroupItem);
    return this;
  }

   /**
   * Get deleteLinkUserGroup
   * @return deleteLinkUserGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_LINK_USER_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateMandatorDeleteLinkUserGroupRequestData> getDeleteLinkUserGroup() {
    return deleteLinkUserGroup;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_LINK_USER_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteLinkUserGroup(List<UpdateMandatorDeleteLinkUserGroupRequestData> deleteLinkUserGroup) {
    this.deleteLinkUserGroup = deleteLinkUserGroup;
  }


  public UpdateMandatorRequestData updateLinkUser(List<UpdateMandatorUpdateLinkUserRequestData> updateLinkUser) {
    
    this.updateLinkUser = updateLinkUser;
    return this;
  }

  public UpdateMandatorRequestData addUpdateLinkUserItem(UpdateMandatorUpdateLinkUserRequestData updateLinkUserItem) {
    if (this.updateLinkUser == null) {
      this.updateLinkUser = new ArrayList<>();
    }
    this.updateLinkUser.add(updateLinkUserItem);
    return this;
  }

   /**
   * Get updateLinkUser
   * @return updateLinkUser
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateMandatorUpdateLinkUserRequestData> getUpdateLinkUser() {
    return updateLinkUser;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateLinkUser(List<UpdateMandatorUpdateLinkUserRequestData> updateLinkUser) {
    this.updateLinkUser = updateLinkUser;
  }


  public UpdateMandatorRequestData updateLinkUserGroup(List<UpdateMandatorUpdateLinkUserGroupRequestData> updateLinkUserGroup) {
    
    this.updateLinkUserGroup = updateLinkUserGroup;
    return this;
  }

  public UpdateMandatorRequestData addUpdateLinkUserGroupItem(UpdateMandatorUpdateLinkUserGroupRequestData updateLinkUserGroupItem) {
    if (this.updateLinkUserGroup == null) {
      this.updateLinkUserGroup = new ArrayList<>();
    }
    this.updateLinkUserGroup.add(updateLinkUserGroupItem);
    return this;
  }

   /**
   * Get updateLinkUserGroup
   * @return updateLinkUserGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_USER_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateMandatorUpdateLinkUserGroupRequestData> getUpdateLinkUserGroup() {
    return updateLinkUserGroup;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_LINK_USER_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateLinkUserGroup(List<UpdateMandatorUpdateLinkUserGroupRequestData> updateLinkUserGroup) {
    this.updateLinkUserGroup = updateLinkUserGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMandatorRequestData updateMandatorRequestData = (UpdateMandatorRequestData) o;
    return Objects.equals(this.sourceId, updateMandatorRequestData.sourceId) &&
        Objects.equals(this.useOwnerFromZone, updateMandatorRequestData.useOwnerFromZone) &&
        Objects.equals(this.isProtected, updateMandatorRequestData.isProtected) &&
        Objects.equals(this.sourceSystem, updateMandatorRequestData.sourceSystem) &&
        Objects.equals(this.description, updateMandatorRequestData.description) &&
        Objects.equals(this.contextId, updateMandatorRequestData.contextId) &&
        Objects.equals(this.roleAddition, updateMandatorRequestData.roleAddition) &&
        Objects.equals(this.createLinkUser, updateMandatorRequestData.createLinkUser) &&
        Objects.equals(this.createLinkUserGroup, updateMandatorRequestData.createLinkUserGroup) &&
        Objects.equals(this.deleteLinkUser, updateMandatorRequestData.deleteLinkUser) &&
        Objects.equals(this.deleteLinkUserGroup, updateMandatorRequestData.deleteLinkUserGroup) &&
        Objects.equals(this.updateLinkUser, updateMandatorRequestData.updateLinkUser) &&
        Objects.equals(this.updateLinkUserGroup, updateMandatorRequestData.updateLinkUserGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, useOwnerFromZone, isProtected, sourceSystem, description, contextId, roleAddition, createLinkUser, createLinkUserGroup, deleteLinkUser, deleteLinkUserGroup, updateLinkUser, updateLinkUserGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMandatorRequestData {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    useOwnerFromZone: ").append(toIndentedString(useOwnerFromZone)).append("\n");
    sb.append("    isProtected: ").append(toIndentedString(isProtected)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    roleAddition: ").append(toIndentedString(roleAddition)).append("\n");
    sb.append("    createLinkUser: ").append(toIndentedString(createLinkUser)).append("\n");
    sb.append("    createLinkUserGroup: ").append(toIndentedString(createLinkUserGroup)).append("\n");
    sb.append("    deleteLinkUser: ").append(toIndentedString(deleteLinkUser)).append("\n");
    sb.append("    deleteLinkUserGroup: ").append(toIndentedString(deleteLinkUserGroup)).append("\n");
    sb.append("    updateLinkUser: ").append(toIndentedString(updateLinkUser)).append("\n");
    sb.append("    updateLinkUserGroup: ").append(toIndentedString(updateLinkUserGroup)).append("\n");
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
