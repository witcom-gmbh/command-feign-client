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
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMultiDuctTypeAddGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMultiDuctTypeAddOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMultiDuctTypeAddUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMultiDuctTypeDeleteGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMultiDuctTypeDeleteOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMultiDuctTypeDeleteUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMultiDuctTypeSetMainOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMultiDuctTypeUpdateGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMultiDuctTypeUpdateUserRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateSystemAttributesMultiDuctTypeRequestData
 */
@JsonPropertyOrder({
  UpdateSystemAttributesMultiDuctTypeRequestData.JSON_PROPERTY_ADD_GROUP,
  UpdateSystemAttributesMultiDuctTypeRequestData.JSON_PROPERTY_ADD_OWNER,
  UpdateSystemAttributesMultiDuctTypeRequestData.JSON_PROPERTY_ADD_USER,
  UpdateSystemAttributesMultiDuctTypeRequestData.JSON_PROPERTY_DELETE_GROUP,
  UpdateSystemAttributesMultiDuctTypeRequestData.JSON_PROPERTY_DELETE_OWNER,
  UpdateSystemAttributesMultiDuctTypeRequestData.JSON_PROPERTY_DELETE_USER,
  UpdateSystemAttributesMultiDuctTypeRequestData.JSON_PROPERTY_SET_MAIN_OWNER,
  UpdateSystemAttributesMultiDuctTypeRequestData.JSON_PROPERTY_UPDATE_GROUP,
  UpdateSystemAttributesMultiDuctTypeRequestData.JSON_PROPERTY_UPDATE_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateSystemAttributesMultiDuctTypeRequestData {
  public static final String JSON_PROPERTY_ADD_GROUP = "addGroup";
  private List<UpdateSystemAttributesMultiDuctTypeAddGroupRequestData> addGroup;

  public static final String JSON_PROPERTY_ADD_OWNER = "addOwner";
  private List<UpdateSystemAttributesMultiDuctTypeAddOwnerRequestData> addOwner;

  public static final String JSON_PROPERTY_ADD_USER = "addUser";
  private List<UpdateSystemAttributesMultiDuctTypeAddUserRequestData> addUser;

  public static final String JSON_PROPERTY_DELETE_GROUP = "deleteGroup";
  private List<UpdateSystemAttributesMultiDuctTypeDeleteGroupRequestData> deleteGroup;

  public static final String JSON_PROPERTY_DELETE_OWNER = "deleteOwner";
  private List<UpdateSystemAttributesMultiDuctTypeDeleteOwnerRequestData> deleteOwner;

  public static final String JSON_PROPERTY_DELETE_USER = "deleteUser";
  private List<UpdateSystemAttributesMultiDuctTypeDeleteUserRequestData> deleteUser;

  public static final String JSON_PROPERTY_SET_MAIN_OWNER = "setMainOwner";
  private UpdateSystemAttributesMultiDuctTypeSetMainOwnerRequestData setMainOwner;

  public static final String JSON_PROPERTY_UPDATE_GROUP = "updateGroup";
  private List<UpdateSystemAttributesMultiDuctTypeUpdateGroupRequestData> updateGroup;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private List<UpdateSystemAttributesMultiDuctTypeUpdateUserRequestData> updateUser;

  public UpdateSystemAttributesMultiDuctTypeRequestData() {
  }

  public UpdateSystemAttributesMultiDuctTypeRequestData addGroup(List<UpdateSystemAttributesMultiDuctTypeAddGroupRequestData> addGroup) {
    
    this.addGroup = addGroup;
    return this;
  }

  public UpdateSystemAttributesMultiDuctTypeRequestData addAddGroupItem(UpdateSystemAttributesMultiDuctTypeAddGroupRequestData addGroupItem) {
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

  public List<UpdateSystemAttributesMultiDuctTypeAddGroupRequestData> getAddGroup() {
    return addGroup;
  }


  @JsonProperty(JSON_PROPERTY_ADD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddGroup(List<UpdateSystemAttributesMultiDuctTypeAddGroupRequestData> addGroup) {
    this.addGroup = addGroup;
  }


  public UpdateSystemAttributesMultiDuctTypeRequestData addOwner(List<UpdateSystemAttributesMultiDuctTypeAddOwnerRequestData> addOwner) {
    
    this.addOwner = addOwner;
    return this;
  }

  public UpdateSystemAttributesMultiDuctTypeRequestData addAddOwnerItem(UpdateSystemAttributesMultiDuctTypeAddOwnerRequestData addOwnerItem) {
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

  public List<UpdateSystemAttributesMultiDuctTypeAddOwnerRequestData> getAddOwner() {
    return addOwner;
  }


  @JsonProperty(JSON_PROPERTY_ADD_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOwner(List<UpdateSystemAttributesMultiDuctTypeAddOwnerRequestData> addOwner) {
    this.addOwner = addOwner;
  }


  public UpdateSystemAttributesMultiDuctTypeRequestData addUser(List<UpdateSystemAttributesMultiDuctTypeAddUserRequestData> addUser) {
    
    this.addUser = addUser;
    return this;
  }

  public UpdateSystemAttributesMultiDuctTypeRequestData addAddUserItem(UpdateSystemAttributesMultiDuctTypeAddUserRequestData addUserItem) {
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

  public List<UpdateSystemAttributesMultiDuctTypeAddUserRequestData> getAddUser() {
    return addUser;
  }


  @JsonProperty(JSON_PROPERTY_ADD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddUser(List<UpdateSystemAttributesMultiDuctTypeAddUserRequestData> addUser) {
    this.addUser = addUser;
  }


  public UpdateSystemAttributesMultiDuctTypeRequestData deleteGroup(List<UpdateSystemAttributesMultiDuctTypeDeleteGroupRequestData> deleteGroup) {
    
    this.deleteGroup = deleteGroup;
    return this;
  }

  public UpdateSystemAttributesMultiDuctTypeRequestData addDeleteGroupItem(UpdateSystemAttributesMultiDuctTypeDeleteGroupRequestData deleteGroupItem) {
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

  public List<UpdateSystemAttributesMultiDuctTypeDeleteGroupRequestData> getDeleteGroup() {
    return deleteGroup;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteGroup(List<UpdateSystemAttributesMultiDuctTypeDeleteGroupRequestData> deleteGroup) {
    this.deleteGroup = deleteGroup;
  }


  public UpdateSystemAttributesMultiDuctTypeRequestData deleteOwner(List<UpdateSystemAttributesMultiDuctTypeDeleteOwnerRequestData> deleteOwner) {
    
    this.deleteOwner = deleteOwner;
    return this;
  }

  public UpdateSystemAttributesMultiDuctTypeRequestData addDeleteOwnerItem(UpdateSystemAttributesMultiDuctTypeDeleteOwnerRequestData deleteOwnerItem) {
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

  public List<UpdateSystemAttributesMultiDuctTypeDeleteOwnerRequestData> getDeleteOwner() {
    return deleteOwner;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteOwner(List<UpdateSystemAttributesMultiDuctTypeDeleteOwnerRequestData> deleteOwner) {
    this.deleteOwner = deleteOwner;
  }


  public UpdateSystemAttributesMultiDuctTypeRequestData deleteUser(List<UpdateSystemAttributesMultiDuctTypeDeleteUserRequestData> deleteUser) {
    
    this.deleteUser = deleteUser;
    return this;
  }

  public UpdateSystemAttributesMultiDuctTypeRequestData addDeleteUserItem(UpdateSystemAttributesMultiDuctTypeDeleteUserRequestData deleteUserItem) {
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

  public List<UpdateSystemAttributesMultiDuctTypeDeleteUserRequestData> getDeleteUser() {
    return deleteUser;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteUser(List<UpdateSystemAttributesMultiDuctTypeDeleteUserRequestData> deleteUser) {
    this.deleteUser = deleteUser;
  }


  public UpdateSystemAttributesMultiDuctTypeRequestData setMainOwner(UpdateSystemAttributesMultiDuctTypeSetMainOwnerRequestData setMainOwner) {
    
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

  public UpdateSystemAttributesMultiDuctTypeSetMainOwnerRequestData getSetMainOwner() {
    return setMainOwner;
  }


  @JsonProperty(JSON_PROPERTY_SET_MAIN_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetMainOwner(UpdateSystemAttributesMultiDuctTypeSetMainOwnerRequestData setMainOwner) {
    this.setMainOwner = setMainOwner;
  }


  public UpdateSystemAttributesMultiDuctTypeRequestData updateGroup(List<UpdateSystemAttributesMultiDuctTypeUpdateGroupRequestData> updateGroup) {
    
    this.updateGroup = updateGroup;
    return this;
  }

  public UpdateSystemAttributesMultiDuctTypeRequestData addUpdateGroupItem(UpdateSystemAttributesMultiDuctTypeUpdateGroupRequestData updateGroupItem) {
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

  public List<UpdateSystemAttributesMultiDuctTypeUpdateGroupRequestData> getUpdateGroup() {
    return updateGroup;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateGroup(List<UpdateSystemAttributesMultiDuctTypeUpdateGroupRequestData> updateGroup) {
    this.updateGroup = updateGroup;
  }


  public UpdateSystemAttributesMultiDuctTypeRequestData updateUser(List<UpdateSystemAttributesMultiDuctTypeUpdateUserRequestData> updateUser) {
    
    this.updateUser = updateUser;
    return this;
  }

  public UpdateSystemAttributesMultiDuctTypeRequestData addUpdateUserItem(UpdateSystemAttributesMultiDuctTypeUpdateUserRequestData updateUserItem) {
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

  public List<UpdateSystemAttributesMultiDuctTypeUpdateUserRequestData> getUpdateUser() {
    return updateUser;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateUser(List<UpdateSystemAttributesMultiDuctTypeUpdateUserRequestData> updateUser) {
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
    UpdateSystemAttributesMultiDuctTypeRequestData updateSystemAttributesMultiDuctTypeRequestData = (UpdateSystemAttributesMultiDuctTypeRequestData) o;
    return Objects.equals(this.addGroup, updateSystemAttributesMultiDuctTypeRequestData.addGroup) &&
        Objects.equals(this.addOwner, updateSystemAttributesMultiDuctTypeRequestData.addOwner) &&
        Objects.equals(this.addUser, updateSystemAttributesMultiDuctTypeRequestData.addUser) &&
        Objects.equals(this.deleteGroup, updateSystemAttributesMultiDuctTypeRequestData.deleteGroup) &&
        Objects.equals(this.deleteOwner, updateSystemAttributesMultiDuctTypeRequestData.deleteOwner) &&
        Objects.equals(this.deleteUser, updateSystemAttributesMultiDuctTypeRequestData.deleteUser) &&
        Objects.equals(this.setMainOwner, updateSystemAttributesMultiDuctTypeRequestData.setMainOwner) &&
        Objects.equals(this.updateGroup, updateSystemAttributesMultiDuctTypeRequestData.updateGroup) &&
        Objects.equals(this.updateUser, updateSystemAttributesMultiDuctTypeRequestData.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addGroup, addOwner, addUser, deleteGroup, deleteOwner, deleteUser, setMainOwner, updateGroup, updateUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemAttributesMultiDuctTypeRequestData {\n");
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
