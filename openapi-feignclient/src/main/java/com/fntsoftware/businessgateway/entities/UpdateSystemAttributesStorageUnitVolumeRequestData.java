/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240304133000
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
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitVolumeAddGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitVolumeAddOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitVolumeAddUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitVolumeDeleteGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitVolumeDeleteOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitVolumeDeleteUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitVolumeSetMainOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitVolumeUpdateGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitVolumeUpdateUserRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateSystemAttributesStorageUnitVolumeRequestData
 */
@JsonPropertyOrder({
  UpdateSystemAttributesStorageUnitVolumeRequestData.JSON_PROPERTY_ADD_GROUP,
  UpdateSystemAttributesStorageUnitVolumeRequestData.JSON_PROPERTY_ADD_OWNER,
  UpdateSystemAttributesStorageUnitVolumeRequestData.JSON_PROPERTY_ADD_USER,
  UpdateSystemAttributesStorageUnitVolumeRequestData.JSON_PROPERTY_DELETE_GROUP,
  UpdateSystemAttributesStorageUnitVolumeRequestData.JSON_PROPERTY_DELETE_OWNER,
  UpdateSystemAttributesStorageUnitVolumeRequestData.JSON_PROPERTY_DELETE_USER,
  UpdateSystemAttributesStorageUnitVolumeRequestData.JSON_PROPERTY_SET_MAIN_OWNER,
  UpdateSystemAttributesStorageUnitVolumeRequestData.JSON_PROPERTY_UPDATE_GROUP,
  UpdateSystemAttributesStorageUnitVolumeRequestData.JSON_PROPERTY_UPDATE_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class UpdateSystemAttributesStorageUnitVolumeRequestData {
  public static final String JSON_PROPERTY_ADD_GROUP = "addGroup";
  private List<UpdateSystemAttributesStorageUnitVolumeAddGroupRequestData> addGroup;

  public static final String JSON_PROPERTY_ADD_OWNER = "addOwner";
  private List<UpdateSystemAttributesStorageUnitVolumeAddOwnerRequestData> addOwner;

  public static final String JSON_PROPERTY_ADD_USER = "addUser";
  private List<UpdateSystemAttributesStorageUnitVolumeAddUserRequestData> addUser;

  public static final String JSON_PROPERTY_DELETE_GROUP = "deleteGroup";
  private List<UpdateSystemAttributesStorageUnitVolumeDeleteGroupRequestData> deleteGroup;

  public static final String JSON_PROPERTY_DELETE_OWNER = "deleteOwner";
  private List<UpdateSystemAttributesStorageUnitVolumeDeleteOwnerRequestData> deleteOwner;

  public static final String JSON_PROPERTY_DELETE_USER = "deleteUser";
  private List<UpdateSystemAttributesStorageUnitVolumeDeleteUserRequestData> deleteUser;

  public static final String JSON_PROPERTY_SET_MAIN_OWNER = "setMainOwner";
  private UpdateSystemAttributesStorageUnitVolumeSetMainOwnerRequestData setMainOwner;

  public static final String JSON_PROPERTY_UPDATE_GROUP = "updateGroup";
  private List<UpdateSystemAttributesStorageUnitVolumeUpdateGroupRequestData> updateGroup;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private List<UpdateSystemAttributesStorageUnitVolumeUpdateUserRequestData> updateUser;

  public UpdateSystemAttributesStorageUnitVolumeRequestData() {
  }

  public UpdateSystemAttributesStorageUnitVolumeRequestData addGroup(List<UpdateSystemAttributesStorageUnitVolumeAddGroupRequestData> addGroup) {
    
    this.addGroup = addGroup;
    return this;
  }

  public UpdateSystemAttributesStorageUnitVolumeRequestData addAddGroupItem(UpdateSystemAttributesStorageUnitVolumeAddGroupRequestData addGroupItem) {
    if (this.addGroup == null) {
      this.addGroup = new ArrayList<>();
    }
    this.addGroup.add(addGroupItem);
    return this;
  }

   /**
   * Get addGroup
   * @return addGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateSystemAttributesStorageUnitVolumeAddGroupRequestData> getAddGroup() {
    return addGroup;
  }


  @JsonProperty(JSON_PROPERTY_ADD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddGroup(List<UpdateSystemAttributesStorageUnitVolumeAddGroupRequestData> addGroup) {
    this.addGroup = addGroup;
  }


  public UpdateSystemAttributesStorageUnitVolumeRequestData addOwner(List<UpdateSystemAttributesStorageUnitVolumeAddOwnerRequestData> addOwner) {
    
    this.addOwner = addOwner;
    return this;
  }

  public UpdateSystemAttributesStorageUnitVolumeRequestData addAddOwnerItem(UpdateSystemAttributesStorageUnitVolumeAddOwnerRequestData addOwnerItem) {
    if (this.addOwner == null) {
      this.addOwner = new ArrayList<>();
    }
    this.addOwner.add(addOwnerItem);
    return this;
  }

   /**
   * Get addOwner
   * @return addOwner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADD_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateSystemAttributesStorageUnitVolumeAddOwnerRequestData> getAddOwner() {
    return addOwner;
  }


  @JsonProperty(JSON_PROPERTY_ADD_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOwner(List<UpdateSystemAttributesStorageUnitVolumeAddOwnerRequestData> addOwner) {
    this.addOwner = addOwner;
  }


  public UpdateSystemAttributesStorageUnitVolumeRequestData addUser(List<UpdateSystemAttributesStorageUnitVolumeAddUserRequestData> addUser) {
    
    this.addUser = addUser;
    return this;
  }

  public UpdateSystemAttributesStorageUnitVolumeRequestData addAddUserItem(UpdateSystemAttributesStorageUnitVolumeAddUserRequestData addUserItem) {
    if (this.addUser == null) {
      this.addUser = new ArrayList<>();
    }
    this.addUser.add(addUserItem);
    return this;
  }

   /**
   * Get addUser
   * @return addUser
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateSystemAttributesStorageUnitVolumeAddUserRequestData> getAddUser() {
    return addUser;
  }


  @JsonProperty(JSON_PROPERTY_ADD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddUser(List<UpdateSystemAttributesStorageUnitVolumeAddUserRequestData> addUser) {
    this.addUser = addUser;
  }


  public UpdateSystemAttributesStorageUnitVolumeRequestData deleteGroup(List<UpdateSystemAttributesStorageUnitVolumeDeleteGroupRequestData> deleteGroup) {
    
    this.deleteGroup = deleteGroup;
    return this;
  }

  public UpdateSystemAttributesStorageUnitVolumeRequestData addDeleteGroupItem(UpdateSystemAttributesStorageUnitVolumeDeleteGroupRequestData deleteGroupItem) {
    if (this.deleteGroup == null) {
      this.deleteGroup = new ArrayList<>();
    }
    this.deleteGroup.add(deleteGroupItem);
    return this;
  }

   /**
   * Get deleteGroup
   * @return deleteGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateSystemAttributesStorageUnitVolumeDeleteGroupRequestData> getDeleteGroup() {
    return deleteGroup;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteGroup(List<UpdateSystemAttributesStorageUnitVolumeDeleteGroupRequestData> deleteGroup) {
    this.deleteGroup = deleteGroup;
  }


  public UpdateSystemAttributesStorageUnitVolumeRequestData deleteOwner(List<UpdateSystemAttributesStorageUnitVolumeDeleteOwnerRequestData> deleteOwner) {
    
    this.deleteOwner = deleteOwner;
    return this;
  }

  public UpdateSystemAttributesStorageUnitVolumeRequestData addDeleteOwnerItem(UpdateSystemAttributesStorageUnitVolumeDeleteOwnerRequestData deleteOwnerItem) {
    if (this.deleteOwner == null) {
      this.deleteOwner = new ArrayList<>();
    }
    this.deleteOwner.add(deleteOwnerItem);
    return this;
  }

   /**
   * Get deleteOwner
   * @return deleteOwner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateSystemAttributesStorageUnitVolumeDeleteOwnerRequestData> getDeleteOwner() {
    return deleteOwner;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteOwner(List<UpdateSystemAttributesStorageUnitVolumeDeleteOwnerRequestData> deleteOwner) {
    this.deleteOwner = deleteOwner;
  }


  public UpdateSystemAttributesStorageUnitVolumeRequestData deleteUser(List<UpdateSystemAttributesStorageUnitVolumeDeleteUserRequestData> deleteUser) {
    
    this.deleteUser = deleteUser;
    return this;
  }

  public UpdateSystemAttributesStorageUnitVolumeRequestData addDeleteUserItem(UpdateSystemAttributesStorageUnitVolumeDeleteUserRequestData deleteUserItem) {
    if (this.deleteUser == null) {
      this.deleteUser = new ArrayList<>();
    }
    this.deleteUser.add(deleteUserItem);
    return this;
  }

   /**
   * Get deleteUser
   * @return deleteUser
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateSystemAttributesStorageUnitVolumeDeleteUserRequestData> getDeleteUser() {
    return deleteUser;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteUser(List<UpdateSystemAttributesStorageUnitVolumeDeleteUserRequestData> deleteUser) {
    this.deleteUser = deleteUser;
  }


  public UpdateSystemAttributesStorageUnitVolumeRequestData setMainOwner(UpdateSystemAttributesStorageUnitVolumeSetMainOwnerRequestData setMainOwner) {
    
    this.setMainOwner = setMainOwner;
    return this;
  }

   /**
   * Get setMainOwner
   * @return setMainOwner
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SET_MAIN_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateSystemAttributesStorageUnitVolumeSetMainOwnerRequestData getSetMainOwner() {
    return setMainOwner;
  }


  @JsonProperty(JSON_PROPERTY_SET_MAIN_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetMainOwner(UpdateSystemAttributesStorageUnitVolumeSetMainOwnerRequestData setMainOwner) {
    this.setMainOwner = setMainOwner;
  }


  public UpdateSystemAttributesStorageUnitVolumeRequestData updateGroup(List<UpdateSystemAttributesStorageUnitVolumeUpdateGroupRequestData> updateGroup) {
    
    this.updateGroup = updateGroup;
    return this;
  }

  public UpdateSystemAttributesStorageUnitVolumeRequestData addUpdateGroupItem(UpdateSystemAttributesStorageUnitVolumeUpdateGroupRequestData updateGroupItem) {
    if (this.updateGroup == null) {
      this.updateGroup = new ArrayList<>();
    }
    this.updateGroup.add(updateGroupItem);
    return this;
  }

   /**
   * Get updateGroup
   * @return updateGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateSystemAttributesStorageUnitVolumeUpdateGroupRequestData> getUpdateGroup() {
    return updateGroup;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateGroup(List<UpdateSystemAttributesStorageUnitVolumeUpdateGroupRequestData> updateGroup) {
    this.updateGroup = updateGroup;
  }


  public UpdateSystemAttributesStorageUnitVolumeRequestData updateUser(List<UpdateSystemAttributesStorageUnitVolumeUpdateUserRequestData> updateUser) {
    
    this.updateUser = updateUser;
    return this;
  }

  public UpdateSystemAttributesStorageUnitVolumeRequestData addUpdateUserItem(UpdateSystemAttributesStorageUnitVolumeUpdateUserRequestData updateUserItem) {
    if (this.updateUser == null) {
      this.updateUser = new ArrayList<>();
    }
    this.updateUser.add(updateUserItem);
    return this;
  }

   /**
   * Get updateUser
   * @return updateUser
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateSystemAttributesStorageUnitVolumeUpdateUserRequestData> getUpdateUser() {
    return updateUser;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateUser(List<UpdateSystemAttributesStorageUnitVolumeUpdateUserRequestData> updateUser) {
    this.updateUser = updateUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSystemAttributesStorageUnitVolumeRequestData updateSystemAttributesStorageUnitVolumeRequestData = (UpdateSystemAttributesStorageUnitVolumeRequestData) o;
    return Objects.equals(this.addGroup, updateSystemAttributesStorageUnitVolumeRequestData.addGroup) &&
        Objects.equals(this.addOwner, updateSystemAttributesStorageUnitVolumeRequestData.addOwner) &&
        Objects.equals(this.addUser, updateSystemAttributesStorageUnitVolumeRequestData.addUser) &&
        Objects.equals(this.deleteGroup, updateSystemAttributesStorageUnitVolumeRequestData.deleteGroup) &&
        Objects.equals(this.deleteOwner, updateSystemAttributesStorageUnitVolumeRequestData.deleteOwner) &&
        Objects.equals(this.deleteUser, updateSystemAttributesStorageUnitVolumeRequestData.deleteUser) &&
        Objects.equals(this.setMainOwner, updateSystemAttributesStorageUnitVolumeRequestData.setMainOwner) &&
        Objects.equals(this.updateGroup, updateSystemAttributesStorageUnitVolumeRequestData.updateGroup) &&
        Objects.equals(this.updateUser, updateSystemAttributesStorageUnitVolumeRequestData.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addGroup, addOwner, addUser, deleteGroup, deleteOwner, deleteUser, setMainOwner, updateGroup, updateUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemAttributesStorageUnitVolumeRequestData {\n");
    sb.append("    addGroup: ").append(toIndentedString(addGroup)).append("\n");
    sb.append("    addOwner: ").append(toIndentedString(addOwner)).append("\n");
    sb.append("    addUser: ").append(toIndentedString(addUser)).append("\n");
    sb.append("    deleteGroup: ").append(toIndentedString(deleteGroup)).append("\n");
    sb.append("    deleteOwner: ").append(toIndentedString(deleteOwner)).append("\n");
    sb.append("    deleteUser: ").append(toIndentedString(deleteUser)).append("\n");
    sb.append("    setMainOwner: ").append(toIndentedString(setMainOwner)).append("\n");
    sb.append("    updateGroup: ").append(toIndentedString(updateGroup)).append("\n");
    sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
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

