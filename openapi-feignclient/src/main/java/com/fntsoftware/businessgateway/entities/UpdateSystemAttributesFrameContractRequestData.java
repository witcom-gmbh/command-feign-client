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
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFrameContractAddGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFrameContractAddOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFrameContractAddUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFrameContractDeleteGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFrameContractDeleteOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFrameContractDeleteUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFrameContractSetMainOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFrameContractUpdateGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFrameContractUpdateUserRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateSystemAttributesFrameContractRequestData
 */
@JsonPropertyOrder({
  UpdateSystemAttributesFrameContractRequestData.JSON_PROPERTY_ADD_GROUP,
  UpdateSystemAttributesFrameContractRequestData.JSON_PROPERTY_ADD_OWNER,
  UpdateSystemAttributesFrameContractRequestData.JSON_PROPERTY_ADD_USER,
  UpdateSystemAttributesFrameContractRequestData.JSON_PROPERTY_DELETE_GROUP,
  UpdateSystemAttributesFrameContractRequestData.JSON_PROPERTY_DELETE_OWNER,
  UpdateSystemAttributesFrameContractRequestData.JSON_PROPERTY_DELETE_USER,
  UpdateSystemAttributesFrameContractRequestData.JSON_PROPERTY_SET_MAIN_OWNER,
  UpdateSystemAttributesFrameContractRequestData.JSON_PROPERTY_UPDATE_GROUP,
  UpdateSystemAttributesFrameContractRequestData.JSON_PROPERTY_UPDATE_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateSystemAttributesFrameContractRequestData {
  public static final String JSON_PROPERTY_ADD_GROUP = "addGroup";
  private List<UpdateSystemAttributesFrameContractAddGroupRequestData> addGroup;

  public static final String JSON_PROPERTY_ADD_OWNER = "addOwner";
  private List<UpdateSystemAttributesFrameContractAddOwnerRequestData> addOwner;

  public static final String JSON_PROPERTY_ADD_USER = "addUser";
  private List<UpdateSystemAttributesFrameContractAddUserRequestData> addUser;

  public static final String JSON_PROPERTY_DELETE_GROUP = "deleteGroup";
  private List<UpdateSystemAttributesFrameContractDeleteGroupRequestData> deleteGroup;

  public static final String JSON_PROPERTY_DELETE_OWNER = "deleteOwner";
  private List<UpdateSystemAttributesFrameContractDeleteOwnerRequestData> deleteOwner;

  public static final String JSON_PROPERTY_DELETE_USER = "deleteUser";
  private List<UpdateSystemAttributesFrameContractDeleteUserRequestData> deleteUser;

  public static final String JSON_PROPERTY_SET_MAIN_OWNER = "setMainOwner";
  private UpdateSystemAttributesFrameContractSetMainOwnerRequestData setMainOwner;

  public static final String JSON_PROPERTY_UPDATE_GROUP = "updateGroup";
  private List<UpdateSystemAttributesFrameContractUpdateGroupRequestData> updateGroup;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private List<UpdateSystemAttributesFrameContractUpdateUserRequestData> updateUser;

  public UpdateSystemAttributesFrameContractRequestData() {
  }

  public UpdateSystemAttributesFrameContractRequestData addGroup(List<UpdateSystemAttributesFrameContractAddGroupRequestData> addGroup) {
    
    this.addGroup = addGroup;
    return this;
  }

  public UpdateSystemAttributesFrameContractRequestData addAddGroupItem(UpdateSystemAttributesFrameContractAddGroupRequestData addGroupItem) {
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

  public List<UpdateSystemAttributesFrameContractAddGroupRequestData> getAddGroup() {
    return addGroup;
  }


  @JsonProperty(JSON_PROPERTY_ADD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddGroup(List<UpdateSystemAttributesFrameContractAddGroupRequestData> addGroup) {
    this.addGroup = addGroup;
  }


  public UpdateSystemAttributesFrameContractRequestData addOwner(List<UpdateSystemAttributesFrameContractAddOwnerRequestData> addOwner) {
    
    this.addOwner = addOwner;
    return this;
  }

  public UpdateSystemAttributesFrameContractRequestData addAddOwnerItem(UpdateSystemAttributesFrameContractAddOwnerRequestData addOwnerItem) {
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

  public List<UpdateSystemAttributesFrameContractAddOwnerRequestData> getAddOwner() {
    return addOwner;
  }


  @JsonProperty(JSON_PROPERTY_ADD_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOwner(List<UpdateSystemAttributesFrameContractAddOwnerRequestData> addOwner) {
    this.addOwner = addOwner;
  }


  public UpdateSystemAttributesFrameContractRequestData addUser(List<UpdateSystemAttributesFrameContractAddUserRequestData> addUser) {
    
    this.addUser = addUser;
    return this;
  }

  public UpdateSystemAttributesFrameContractRequestData addAddUserItem(UpdateSystemAttributesFrameContractAddUserRequestData addUserItem) {
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

  public List<UpdateSystemAttributesFrameContractAddUserRequestData> getAddUser() {
    return addUser;
  }


  @JsonProperty(JSON_PROPERTY_ADD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddUser(List<UpdateSystemAttributesFrameContractAddUserRequestData> addUser) {
    this.addUser = addUser;
  }


  public UpdateSystemAttributesFrameContractRequestData deleteGroup(List<UpdateSystemAttributesFrameContractDeleteGroupRequestData> deleteGroup) {
    
    this.deleteGroup = deleteGroup;
    return this;
  }

  public UpdateSystemAttributesFrameContractRequestData addDeleteGroupItem(UpdateSystemAttributesFrameContractDeleteGroupRequestData deleteGroupItem) {
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

  public List<UpdateSystemAttributesFrameContractDeleteGroupRequestData> getDeleteGroup() {
    return deleteGroup;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteGroup(List<UpdateSystemAttributesFrameContractDeleteGroupRequestData> deleteGroup) {
    this.deleteGroup = deleteGroup;
  }


  public UpdateSystemAttributesFrameContractRequestData deleteOwner(List<UpdateSystemAttributesFrameContractDeleteOwnerRequestData> deleteOwner) {
    
    this.deleteOwner = deleteOwner;
    return this;
  }

  public UpdateSystemAttributesFrameContractRequestData addDeleteOwnerItem(UpdateSystemAttributesFrameContractDeleteOwnerRequestData deleteOwnerItem) {
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

  public List<UpdateSystemAttributesFrameContractDeleteOwnerRequestData> getDeleteOwner() {
    return deleteOwner;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteOwner(List<UpdateSystemAttributesFrameContractDeleteOwnerRequestData> deleteOwner) {
    this.deleteOwner = deleteOwner;
  }


  public UpdateSystemAttributesFrameContractRequestData deleteUser(List<UpdateSystemAttributesFrameContractDeleteUserRequestData> deleteUser) {
    
    this.deleteUser = deleteUser;
    return this;
  }

  public UpdateSystemAttributesFrameContractRequestData addDeleteUserItem(UpdateSystemAttributesFrameContractDeleteUserRequestData deleteUserItem) {
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

  public List<UpdateSystemAttributesFrameContractDeleteUserRequestData> getDeleteUser() {
    return deleteUser;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteUser(List<UpdateSystemAttributesFrameContractDeleteUserRequestData> deleteUser) {
    this.deleteUser = deleteUser;
  }


  public UpdateSystemAttributesFrameContractRequestData setMainOwner(UpdateSystemAttributesFrameContractSetMainOwnerRequestData setMainOwner) {
    
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

  public UpdateSystemAttributesFrameContractSetMainOwnerRequestData getSetMainOwner() {
    return setMainOwner;
  }


  @JsonProperty(JSON_PROPERTY_SET_MAIN_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetMainOwner(UpdateSystemAttributesFrameContractSetMainOwnerRequestData setMainOwner) {
    this.setMainOwner = setMainOwner;
  }


  public UpdateSystemAttributesFrameContractRequestData updateGroup(List<UpdateSystemAttributesFrameContractUpdateGroupRequestData> updateGroup) {
    
    this.updateGroup = updateGroup;
    return this;
  }

  public UpdateSystemAttributesFrameContractRequestData addUpdateGroupItem(UpdateSystemAttributesFrameContractUpdateGroupRequestData updateGroupItem) {
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

  public List<UpdateSystemAttributesFrameContractUpdateGroupRequestData> getUpdateGroup() {
    return updateGroup;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateGroup(List<UpdateSystemAttributesFrameContractUpdateGroupRequestData> updateGroup) {
    this.updateGroup = updateGroup;
  }


  public UpdateSystemAttributesFrameContractRequestData updateUser(List<UpdateSystemAttributesFrameContractUpdateUserRequestData> updateUser) {
    
    this.updateUser = updateUser;
    return this;
  }

  public UpdateSystemAttributesFrameContractRequestData addUpdateUserItem(UpdateSystemAttributesFrameContractUpdateUserRequestData updateUserItem) {
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

  public List<UpdateSystemAttributesFrameContractUpdateUserRequestData> getUpdateUser() {
    return updateUser;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateUser(List<UpdateSystemAttributesFrameContractUpdateUserRequestData> updateUser) {
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
    UpdateSystemAttributesFrameContractRequestData updateSystemAttributesFrameContractRequestData = (UpdateSystemAttributesFrameContractRequestData) o;
    return Objects.equals(this.addGroup, updateSystemAttributesFrameContractRequestData.addGroup) &&
        Objects.equals(this.addOwner, updateSystemAttributesFrameContractRequestData.addOwner) &&
        Objects.equals(this.addUser, updateSystemAttributesFrameContractRequestData.addUser) &&
        Objects.equals(this.deleteGroup, updateSystemAttributesFrameContractRequestData.deleteGroup) &&
        Objects.equals(this.deleteOwner, updateSystemAttributesFrameContractRequestData.deleteOwner) &&
        Objects.equals(this.deleteUser, updateSystemAttributesFrameContractRequestData.deleteUser) &&
        Objects.equals(this.setMainOwner, updateSystemAttributesFrameContractRequestData.setMainOwner) &&
        Objects.equals(this.updateGroup, updateSystemAttributesFrameContractRequestData.updateGroup) &&
        Objects.equals(this.updateUser, updateSystemAttributesFrameContractRequestData.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addGroup, addOwner, addUser, deleteGroup, deleteOwner, deleteUser, setMainOwner, updateGroup, updateUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemAttributesFrameContractRequestData {\n");
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
