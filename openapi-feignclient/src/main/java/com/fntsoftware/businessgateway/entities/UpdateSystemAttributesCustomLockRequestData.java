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
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomLockAddGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomLockAddOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomLockAddUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomLockDeleteGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomLockDeleteOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomLockDeleteUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomLockSetMainOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomLockUpdateGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomLockUpdateUserRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateSystemAttributesCustomLockRequestData
 */
@JsonPropertyOrder({
  UpdateSystemAttributesCustomLockRequestData.JSON_PROPERTY_ADD_GROUP,
  UpdateSystemAttributesCustomLockRequestData.JSON_PROPERTY_ADD_OWNER,
  UpdateSystemAttributesCustomLockRequestData.JSON_PROPERTY_ADD_USER,
  UpdateSystemAttributesCustomLockRequestData.JSON_PROPERTY_DELETE_GROUP,
  UpdateSystemAttributesCustomLockRequestData.JSON_PROPERTY_DELETE_OWNER,
  UpdateSystemAttributesCustomLockRequestData.JSON_PROPERTY_DELETE_USER,
  UpdateSystemAttributesCustomLockRequestData.JSON_PROPERTY_SET_MAIN_OWNER,
  UpdateSystemAttributesCustomLockRequestData.JSON_PROPERTY_UPDATE_GROUP,
  UpdateSystemAttributesCustomLockRequestData.JSON_PROPERTY_UPDATE_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateSystemAttributesCustomLockRequestData {
  public static final String JSON_PROPERTY_ADD_GROUP = "addGroup";
  private List<UpdateSystemAttributesCustomLockAddGroupRequestData> addGroup;

  public static final String JSON_PROPERTY_ADD_OWNER = "addOwner";
  private List<UpdateSystemAttributesCustomLockAddOwnerRequestData> addOwner;

  public static final String JSON_PROPERTY_ADD_USER = "addUser";
  private List<UpdateSystemAttributesCustomLockAddUserRequestData> addUser;

  public static final String JSON_PROPERTY_DELETE_GROUP = "deleteGroup";
  private List<UpdateSystemAttributesCustomLockDeleteGroupRequestData> deleteGroup;

  public static final String JSON_PROPERTY_DELETE_OWNER = "deleteOwner";
  private List<UpdateSystemAttributesCustomLockDeleteOwnerRequestData> deleteOwner;

  public static final String JSON_PROPERTY_DELETE_USER = "deleteUser";
  private List<UpdateSystemAttributesCustomLockDeleteUserRequestData> deleteUser;

  public static final String JSON_PROPERTY_SET_MAIN_OWNER = "setMainOwner";
  private UpdateSystemAttributesCustomLockSetMainOwnerRequestData setMainOwner;

  public static final String JSON_PROPERTY_UPDATE_GROUP = "updateGroup";
  private List<UpdateSystemAttributesCustomLockUpdateGroupRequestData> updateGroup;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private List<UpdateSystemAttributesCustomLockUpdateUserRequestData> updateUser;

  public UpdateSystemAttributesCustomLockRequestData() {
  }

  public UpdateSystemAttributesCustomLockRequestData addGroup(List<UpdateSystemAttributesCustomLockAddGroupRequestData> addGroup) {
    
    this.addGroup = addGroup;
    return this;
  }

  public UpdateSystemAttributesCustomLockRequestData addAddGroupItem(UpdateSystemAttributesCustomLockAddGroupRequestData addGroupItem) {
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

  public List<UpdateSystemAttributesCustomLockAddGroupRequestData> getAddGroup() {
    return addGroup;
  }


  @JsonProperty(JSON_PROPERTY_ADD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddGroup(List<UpdateSystemAttributesCustomLockAddGroupRequestData> addGroup) {
    this.addGroup = addGroup;
  }


  public UpdateSystemAttributesCustomLockRequestData addOwner(List<UpdateSystemAttributesCustomLockAddOwnerRequestData> addOwner) {
    
    this.addOwner = addOwner;
    return this;
  }

  public UpdateSystemAttributesCustomLockRequestData addAddOwnerItem(UpdateSystemAttributesCustomLockAddOwnerRequestData addOwnerItem) {
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

  public List<UpdateSystemAttributesCustomLockAddOwnerRequestData> getAddOwner() {
    return addOwner;
  }


  @JsonProperty(JSON_PROPERTY_ADD_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOwner(List<UpdateSystemAttributesCustomLockAddOwnerRequestData> addOwner) {
    this.addOwner = addOwner;
  }


  public UpdateSystemAttributesCustomLockRequestData addUser(List<UpdateSystemAttributesCustomLockAddUserRequestData> addUser) {
    
    this.addUser = addUser;
    return this;
  }

  public UpdateSystemAttributesCustomLockRequestData addAddUserItem(UpdateSystemAttributesCustomLockAddUserRequestData addUserItem) {
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

  public List<UpdateSystemAttributesCustomLockAddUserRequestData> getAddUser() {
    return addUser;
  }


  @JsonProperty(JSON_PROPERTY_ADD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddUser(List<UpdateSystemAttributesCustomLockAddUserRequestData> addUser) {
    this.addUser = addUser;
  }


  public UpdateSystemAttributesCustomLockRequestData deleteGroup(List<UpdateSystemAttributesCustomLockDeleteGroupRequestData> deleteGroup) {
    
    this.deleteGroup = deleteGroup;
    return this;
  }

  public UpdateSystemAttributesCustomLockRequestData addDeleteGroupItem(UpdateSystemAttributesCustomLockDeleteGroupRequestData deleteGroupItem) {
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

  public List<UpdateSystemAttributesCustomLockDeleteGroupRequestData> getDeleteGroup() {
    return deleteGroup;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteGroup(List<UpdateSystemAttributesCustomLockDeleteGroupRequestData> deleteGroup) {
    this.deleteGroup = deleteGroup;
  }


  public UpdateSystemAttributesCustomLockRequestData deleteOwner(List<UpdateSystemAttributesCustomLockDeleteOwnerRequestData> deleteOwner) {
    
    this.deleteOwner = deleteOwner;
    return this;
  }

  public UpdateSystemAttributesCustomLockRequestData addDeleteOwnerItem(UpdateSystemAttributesCustomLockDeleteOwnerRequestData deleteOwnerItem) {
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

  public List<UpdateSystemAttributesCustomLockDeleteOwnerRequestData> getDeleteOwner() {
    return deleteOwner;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteOwner(List<UpdateSystemAttributesCustomLockDeleteOwnerRequestData> deleteOwner) {
    this.deleteOwner = deleteOwner;
  }


  public UpdateSystemAttributesCustomLockRequestData deleteUser(List<UpdateSystemAttributesCustomLockDeleteUserRequestData> deleteUser) {
    
    this.deleteUser = deleteUser;
    return this;
  }

  public UpdateSystemAttributesCustomLockRequestData addDeleteUserItem(UpdateSystemAttributesCustomLockDeleteUserRequestData deleteUserItem) {
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

  public List<UpdateSystemAttributesCustomLockDeleteUserRequestData> getDeleteUser() {
    return deleteUser;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteUser(List<UpdateSystemAttributesCustomLockDeleteUserRequestData> deleteUser) {
    this.deleteUser = deleteUser;
  }


  public UpdateSystemAttributesCustomLockRequestData setMainOwner(UpdateSystemAttributesCustomLockSetMainOwnerRequestData setMainOwner) {
    
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

  public UpdateSystemAttributesCustomLockSetMainOwnerRequestData getSetMainOwner() {
    return setMainOwner;
  }


  @JsonProperty(JSON_PROPERTY_SET_MAIN_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetMainOwner(UpdateSystemAttributesCustomLockSetMainOwnerRequestData setMainOwner) {
    this.setMainOwner = setMainOwner;
  }


  public UpdateSystemAttributesCustomLockRequestData updateGroup(List<UpdateSystemAttributesCustomLockUpdateGroupRequestData> updateGroup) {
    
    this.updateGroup = updateGroup;
    return this;
  }

  public UpdateSystemAttributesCustomLockRequestData addUpdateGroupItem(UpdateSystemAttributesCustomLockUpdateGroupRequestData updateGroupItem) {
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

  public List<UpdateSystemAttributesCustomLockUpdateGroupRequestData> getUpdateGroup() {
    return updateGroup;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateGroup(List<UpdateSystemAttributesCustomLockUpdateGroupRequestData> updateGroup) {
    this.updateGroup = updateGroup;
  }


  public UpdateSystemAttributesCustomLockRequestData updateUser(List<UpdateSystemAttributesCustomLockUpdateUserRequestData> updateUser) {
    
    this.updateUser = updateUser;
    return this;
  }

  public UpdateSystemAttributesCustomLockRequestData addUpdateUserItem(UpdateSystemAttributesCustomLockUpdateUserRequestData updateUserItem) {
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

  public List<UpdateSystemAttributesCustomLockUpdateUserRequestData> getUpdateUser() {
    return updateUser;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateUser(List<UpdateSystemAttributesCustomLockUpdateUserRequestData> updateUser) {
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
    UpdateSystemAttributesCustomLockRequestData updateSystemAttributesCustomLockRequestData = (UpdateSystemAttributesCustomLockRequestData) o;
    return Objects.equals(this.addGroup, updateSystemAttributesCustomLockRequestData.addGroup) &&
        Objects.equals(this.addOwner, updateSystemAttributesCustomLockRequestData.addOwner) &&
        Objects.equals(this.addUser, updateSystemAttributesCustomLockRequestData.addUser) &&
        Objects.equals(this.deleteGroup, updateSystemAttributesCustomLockRequestData.deleteGroup) &&
        Objects.equals(this.deleteOwner, updateSystemAttributesCustomLockRequestData.deleteOwner) &&
        Objects.equals(this.deleteUser, updateSystemAttributesCustomLockRequestData.deleteUser) &&
        Objects.equals(this.setMainOwner, updateSystemAttributesCustomLockRequestData.setMainOwner) &&
        Objects.equals(this.updateGroup, updateSystemAttributesCustomLockRequestData.updateGroup) &&
        Objects.equals(this.updateUser, updateSystemAttributesCustomLockRequestData.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addGroup, addOwner, addUser, deleteGroup, deleteOwner, deleteUser, setMainOwner, updateGroup, updateUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemAttributesCustomLockRequestData {\n");
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
