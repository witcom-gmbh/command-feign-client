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
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwitchCabinetAddGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwitchCabinetAddOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwitchCabinetAddUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwitchCabinetDeleteGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwitchCabinetDeleteOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwitchCabinetDeleteUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwitchCabinetSetMainOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwitchCabinetUpdateGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwitchCabinetUpdateUserRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateSystemAttributesSwitchCabinetRequestData
 */
@JsonPropertyOrder({
  UpdateSystemAttributesSwitchCabinetRequestData.JSON_PROPERTY_ADD_GROUP,
  UpdateSystemAttributesSwitchCabinetRequestData.JSON_PROPERTY_ADD_OWNER,
  UpdateSystemAttributesSwitchCabinetRequestData.JSON_PROPERTY_ADD_USER,
  UpdateSystemAttributesSwitchCabinetRequestData.JSON_PROPERTY_DELETE_GROUP,
  UpdateSystemAttributesSwitchCabinetRequestData.JSON_PROPERTY_DELETE_OWNER,
  UpdateSystemAttributesSwitchCabinetRequestData.JSON_PROPERTY_DELETE_USER,
  UpdateSystemAttributesSwitchCabinetRequestData.JSON_PROPERTY_SET_MAIN_OWNER,
  UpdateSystemAttributesSwitchCabinetRequestData.JSON_PROPERTY_UPDATE_GROUP,
  UpdateSystemAttributesSwitchCabinetRequestData.JSON_PROPERTY_UPDATE_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateSystemAttributesSwitchCabinetRequestData {
  public static final String JSON_PROPERTY_ADD_GROUP = "addGroup";
  private List<UpdateSystemAttributesSwitchCabinetAddGroupRequestData> addGroup;

  public static final String JSON_PROPERTY_ADD_OWNER = "addOwner";
  private List<UpdateSystemAttributesSwitchCabinetAddOwnerRequestData> addOwner;

  public static final String JSON_PROPERTY_ADD_USER = "addUser";
  private List<UpdateSystemAttributesSwitchCabinetAddUserRequestData> addUser;

  public static final String JSON_PROPERTY_DELETE_GROUP = "deleteGroup";
  private List<UpdateSystemAttributesSwitchCabinetDeleteGroupRequestData> deleteGroup;

  public static final String JSON_PROPERTY_DELETE_OWNER = "deleteOwner";
  private List<UpdateSystemAttributesSwitchCabinetDeleteOwnerRequestData> deleteOwner;

  public static final String JSON_PROPERTY_DELETE_USER = "deleteUser";
  private List<UpdateSystemAttributesSwitchCabinetDeleteUserRequestData> deleteUser;

  public static final String JSON_PROPERTY_SET_MAIN_OWNER = "setMainOwner";
  private UpdateSystemAttributesSwitchCabinetSetMainOwnerRequestData setMainOwner;

  public static final String JSON_PROPERTY_UPDATE_GROUP = "updateGroup";
  private List<UpdateSystemAttributesSwitchCabinetUpdateGroupRequestData> updateGroup;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private List<UpdateSystemAttributesSwitchCabinetUpdateUserRequestData> updateUser;

  public UpdateSystemAttributesSwitchCabinetRequestData() {
  }

  public UpdateSystemAttributesSwitchCabinetRequestData addGroup(List<UpdateSystemAttributesSwitchCabinetAddGroupRequestData> addGroup) {
    
    this.addGroup = addGroup;
    return this;
  }

  public UpdateSystemAttributesSwitchCabinetRequestData addAddGroupItem(UpdateSystemAttributesSwitchCabinetAddGroupRequestData addGroupItem) {
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

  public List<UpdateSystemAttributesSwitchCabinetAddGroupRequestData> getAddGroup() {
    return addGroup;
  }


  @JsonProperty(JSON_PROPERTY_ADD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddGroup(List<UpdateSystemAttributesSwitchCabinetAddGroupRequestData> addGroup) {
    this.addGroup = addGroup;
  }


  public UpdateSystemAttributesSwitchCabinetRequestData addOwner(List<UpdateSystemAttributesSwitchCabinetAddOwnerRequestData> addOwner) {
    
    this.addOwner = addOwner;
    return this;
  }

  public UpdateSystemAttributesSwitchCabinetRequestData addAddOwnerItem(UpdateSystemAttributesSwitchCabinetAddOwnerRequestData addOwnerItem) {
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

  public List<UpdateSystemAttributesSwitchCabinetAddOwnerRequestData> getAddOwner() {
    return addOwner;
  }


  @JsonProperty(JSON_PROPERTY_ADD_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOwner(List<UpdateSystemAttributesSwitchCabinetAddOwnerRequestData> addOwner) {
    this.addOwner = addOwner;
  }


  public UpdateSystemAttributesSwitchCabinetRequestData addUser(List<UpdateSystemAttributesSwitchCabinetAddUserRequestData> addUser) {
    
    this.addUser = addUser;
    return this;
  }

  public UpdateSystemAttributesSwitchCabinetRequestData addAddUserItem(UpdateSystemAttributesSwitchCabinetAddUserRequestData addUserItem) {
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

  public List<UpdateSystemAttributesSwitchCabinetAddUserRequestData> getAddUser() {
    return addUser;
  }


  @JsonProperty(JSON_PROPERTY_ADD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddUser(List<UpdateSystemAttributesSwitchCabinetAddUserRequestData> addUser) {
    this.addUser = addUser;
  }


  public UpdateSystemAttributesSwitchCabinetRequestData deleteGroup(List<UpdateSystemAttributesSwitchCabinetDeleteGroupRequestData> deleteGroup) {
    
    this.deleteGroup = deleteGroup;
    return this;
  }

  public UpdateSystemAttributesSwitchCabinetRequestData addDeleteGroupItem(UpdateSystemAttributesSwitchCabinetDeleteGroupRequestData deleteGroupItem) {
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

  public List<UpdateSystemAttributesSwitchCabinetDeleteGroupRequestData> getDeleteGroup() {
    return deleteGroup;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteGroup(List<UpdateSystemAttributesSwitchCabinetDeleteGroupRequestData> deleteGroup) {
    this.deleteGroup = deleteGroup;
  }


  public UpdateSystemAttributesSwitchCabinetRequestData deleteOwner(List<UpdateSystemAttributesSwitchCabinetDeleteOwnerRequestData> deleteOwner) {
    
    this.deleteOwner = deleteOwner;
    return this;
  }

  public UpdateSystemAttributesSwitchCabinetRequestData addDeleteOwnerItem(UpdateSystemAttributesSwitchCabinetDeleteOwnerRequestData deleteOwnerItem) {
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

  public List<UpdateSystemAttributesSwitchCabinetDeleteOwnerRequestData> getDeleteOwner() {
    return deleteOwner;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteOwner(List<UpdateSystemAttributesSwitchCabinetDeleteOwnerRequestData> deleteOwner) {
    this.deleteOwner = deleteOwner;
  }


  public UpdateSystemAttributesSwitchCabinetRequestData deleteUser(List<UpdateSystemAttributesSwitchCabinetDeleteUserRequestData> deleteUser) {
    
    this.deleteUser = deleteUser;
    return this;
  }

  public UpdateSystemAttributesSwitchCabinetRequestData addDeleteUserItem(UpdateSystemAttributesSwitchCabinetDeleteUserRequestData deleteUserItem) {
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

  public List<UpdateSystemAttributesSwitchCabinetDeleteUserRequestData> getDeleteUser() {
    return deleteUser;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteUser(List<UpdateSystemAttributesSwitchCabinetDeleteUserRequestData> deleteUser) {
    this.deleteUser = deleteUser;
  }


  public UpdateSystemAttributesSwitchCabinetRequestData setMainOwner(UpdateSystemAttributesSwitchCabinetSetMainOwnerRequestData setMainOwner) {
    
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

  public UpdateSystemAttributesSwitchCabinetSetMainOwnerRequestData getSetMainOwner() {
    return setMainOwner;
  }


  @JsonProperty(JSON_PROPERTY_SET_MAIN_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetMainOwner(UpdateSystemAttributesSwitchCabinetSetMainOwnerRequestData setMainOwner) {
    this.setMainOwner = setMainOwner;
  }


  public UpdateSystemAttributesSwitchCabinetRequestData updateGroup(List<UpdateSystemAttributesSwitchCabinetUpdateGroupRequestData> updateGroup) {
    
    this.updateGroup = updateGroup;
    return this;
  }

  public UpdateSystemAttributesSwitchCabinetRequestData addUpdateGroupItem(UpdateSystemAttributesSwitchCabinetUpdateGroupRequestData updateGroupItem) {
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

  public List<UpdateSystemAttributesSwitchCabinetUpdateGroupRequestData> getUpdateGroup() {
    return updateGroup;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateGroup(List<UpdateSystemAttributesSwitchCabinetUpdateGroupRequestData> updateGroup) {
    this.updateGroup = updateGroup;
  }


  public UpdateSystemAttributesSwitchCabinetRequestData updateUser(List<UpdateSystemAttributesSwitchCabinetUpdateUserRequestData> updateUser) {
    
    this.updateUser = updateUser;
    return this;
  }

  public UpdateSystemAttributesSwitchCabinetRequestData addUpdateUserItem(UpdateSystemAttributesSwitchCabinetUpdateUserRequestData updateUserItem) {
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

  public List<UpdateSystemAttributesSwitchCabinetUpdateUserRequestData> getUpdateUser() {
    return updateUser;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateUser(List<UpdateSystemAttributesSwitchCabinetUpdateUserRequestData> updateUser) {
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
    UpdateSystemAttributesSwitchCabinetRequestData updateSystemAttributesSwitchCabinetRequestData = (UpdateSystemAttributesSwitchCabinetRequestData) o;
    return Objects.equals(this.addGroup, updateSystemAttributesSwitchCabinetRequestData.addGroup) &&
        Objects.equals(this.addOwner, updateSystemAttributesSwitchCabinetRequestData.addOwner) &&
        Objects.equals(this.addUser, updateSystemAttributesSwitchCabinetRequestData.addUser) &&
        Objects.equals(this.deleteGroup, updateSystemAttributesSwitchCabinetRequestData.deleteGroup) &&
        Objects.equals(this.deleteOwner, updateSystemAttributesSwitchCabinetRequestData.deleteOwner) &&
        Objects.equals(this.deleteUser, updateSystemAttributesSwitchCabinetRequestData.deleteUser) &&
        Objects.equals(this.setMainOwner, updateSystemAttributesSwitchCabinetRequestData.setMainOwner) &&
        Objects.equals(this.updateGroup, updateSystemAttributesSwitchCabinetRequestData.updateGroup) &&
        Objects.equals(this.updateUser, updateSystemAttributesSwitchCabinetRequestData.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addGroup, addOwner, addUser, deleteGroup, deleteOwner, deleteUser, setMainOwner, updateGroup, updateUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemAttributesSwitchCabinetRequestData {\n");
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
