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
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareLicenseAddGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareLicenseAddOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareLicenseAddUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareLicenseDeleteGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareLicenseDeleteOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareLicenseDeleteUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareLicenseSetMainOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareLicenseUpdateGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareLicenseUpdateUserRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateSystemAttributesSoftwareLicenseRequestData
 */
@JsonPropertyOrder({
  UpdateSystemAttributesSoftwareLicenseRequestData.JSON_PROPERTY_ADD_GROUP,
  UpdateSystemAttributesSoftwareLicenseRequestData.JSON_PROPERTY_ADD_OWNER,
  UpdateSystemAttributesSoftwareLicenseRequestData.JSON_PROPERTY_ADD_USER,
  UpdateSystemAttributesSoftwareLicenseRequestData.JSON_PROPERTY_DELETE_GROUP,
  UpdateSystemAttributesSoftwareLicenseRequestData.JSON_PROPERTY_DELETE_OWNER,
  UpdateSystemAttributesSoftwareLicenseRequestData.JSON_PROPERTY_DELETE_USER,
  UpdateSystemAttributesSoftwareLicenseRequestData.JSON_PROPERTY_SET_MAIN_OWNER,
  UpdateSystemAttributesSoftwareLicenseRequestData.JSON_PROPERTY_UPDATE_GROUP,
  UpdateSystemAttributesSoftwareLicenseRequestData.JSON_PROPERTY_UPDATE_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateSystemAttributesSoftwareLicenseRequestData {
  public static final String JSON_PROPERTY_ADD_GROUP = "addGroup";
  private List<UpdateSystemAttributesSoftwareLicenseAddGroupRequestData> addGroup;

  public static final String JSON_PROPERTY_ADD_OWNER = "addOwner";
  private List<UpdateSystemAttributesSoftwareLicenseAddOwnerRequestData> addOwner;

  public static final String JSON_PROPERTY_ADD_USER = "addUser";
  private List<UpdateSystemAttributesSoftwareLicenseAddUserRequestData> addUser;

  public static final String JSON_PROPERTY_DELETE_GROUP = "deleteGroup";
  private List<UpdateSystemAttributesSoftwareLicenseDeleteGroupRequestData> deleteGroup;

  public static final String JSON_PROPERTY_DELETE_OWNER = "deleteOwner";
  private List<UpdateSystemAttributesSoftwareLicenseDeleteOwnerRequestData> deleteOwner;

  public static final String JSON_PROPERTY_DELETE_USER = "deleteUser";
  private List<UpdateSystemAttributesSoftwareLicenseDeleteUserRequestData> deleteUser;

  public static final String JSON_PROPERTY_SET_MAIN_OWNER = "setMainOwner";
  private UpdateSystemAttributesSoftwareLicenseSetMainOwnerRequestData setMainOwner;

  public static final String JSON_PROPERTY_UPDATE_GROUP = "updateGroup";
  private List<UpdateSystemAttributesSoftwareLicenseUpdateGroupRequestData> updateGroup;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private List<UpdateSystemAttributesSoftwareLicenseUpdateUserRequestData> updateUser;

  public UpdateSystemAttributesSoftwareLicenseRequestData() {
  }

  public UpdateSystemAttributesSoftwareLicenseRequestData addGroup(List<UpdateSystemAttributesSoftwareLicenseAddGroupRequestData> addGroup) {
    
    this.addGroup = addGroup;
    return this;
  }

  public UpdateSystemAttributesSoftwareLicenseRequestData addAddGroupItem(UpdateSystemAttributesSoftwareLicenseAddGroupRequestData addGroupItem) {
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

  public List<UpdateSystemAttributesSoftwareLicenseAddGroupRequestData> getAddGroup() {
    return addGroup;
  }


  @JsonProperty(JSON_PROPERTY_ADD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddGroup(List<UpdateSystemAttributesSoftwareLicenseAddGroupRequestData> addGroup) {
    this.addGroup = addGroup;
  }


  public UpdateSystemAttributesSoftwareLicenseRequestData addOwner(List<UpdateSystemAttributesSoftwareLicenseAddOwnerRequestData> addOwner) {
    
    this.addOwner = addOwner;
    return this;
  }

  public UpdateSystemAttributesSoftwareLicenseRequestData addAddOwnerItem(UpdateSystemAttributesSoftwareLicenseAddOwnerRequestData addOwnerItem) {
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

  public List<UpdateSystemAttributesSoftwareLicenseAddOwnerRequestData> getAddOwner() {
    return addOwner;
  }


  @JsonProperty(JSON_PROPERTY_ADD_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOwner(List<UpdateSystemAttributesSoftwareLicenseAddOwnerRequestData> addOwner) {
    this.addOwner = addOwner;
  }


  public UpdateSystemAttributesSoftwareLicenseRequestData addUser(List<UpdateSystemAttributesSoftwareLicenseAddUserRequestData> addUser) {
    
    this.addUser = addUser;
    return this;
  }

  public UpdateSystemAttributesSoftwareLicenseRequestData addAddUserItem(UpdateSystemAttributesSoftwareLicenseAddUserRequestData addUserItem) {
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

  public List<UpdateSystemAttributesSoftwareLicenseAddUserRequestData> getAddUser() {
    return addUser;
  }


  @JsonProperty(JSON_PROPERTY_ADD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddUser(List<UpdateSystemAttributesSoftwareLicenseAddUserRequestData> addUser) {
    this.addUser = addUser;
  }


  public UpdateSystemAttributesSoftwareLicenseRequestData deleteGroup(List<UpdateSystemAttributesSoftwareLicenseDeleteGroupRequestData> deleteGroup) {
    
    this.deleteGroup = deleteGroup;
    return this;
  }

  public UpdateSystemAttributesSoftwareLicenseRequestData addDeleteGroupItem(UpdateSystemAttributesSoftwareLicenseDeleteGroupRequestData deleteGroupItem) {
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

  public List<UpdateSystemAttributesSoftwareLicenseDeleteGroupRequestData> getDeleteGroup() {
    return deleteGroup;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteGroup(List<UpdateSystemAttributesSoftwareLicenseDeleteGroupRequestData> deleteGroup) {
    this.deleteGroup = deleteGroup;
  }


  public UpdateSystemAttributesSoftwareLicenseRequestData deleteOwner(List<UpdateSystemAttributesSoftwareLicenseDeleteOwnerRequestData> deleteOwner) {
    
    this.deleteOwner = deleteOwner;
    return this;
  }

  public UpdateSystemAttributesSoftwareLicenseRequestData addDeleteOwnerItem(UpdateSystemAttributesSoftwareLicenseDeleteOwnerRequestData deleteOwnerItem) {
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

  public List<UpdateSystemAttributesSoftwareLicenseDeleteOwnerRequestData> getDeleteOwner() {
    return deleteOwner;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteOwner(List<UpdateSystemAttributesSoftwareLicenseDeleteOwnerRequestData> deleteOwner) {
    this.deleteOwner = deleteOwner;
  }


  public UpdateSystemAttributesSoftwareLicenseRequestData deleteUser(List<UpdateSystemAttributesSoftwareLicenseDeleteUserRequestData> deleteUser) {
    
    this.deleteUser = deleteUser;
    return this;
  }

  public UpdateSystemAttributesSoftwareLicenseRequestData addDeleteUserItem(UpdateSystemAttributesSoftwareLicenseDeleteUserRequestData deleteUserItem) {
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

  public List<UpdateSystemAttributesSoftwareLicenseDeleteUserRequestData> getDeleteUser() {
    return deleteUser;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteUser(List<UpdateSystemAttributesSoftwareLicenseDeleteUserRequestData> deleteUser) {
    this.deleteUser = deleteUser;
  }


  public UpdateSystemAttributesSoftwareLicenseRequestData setMainOwner(UpdateSystemAttributesSoftwareLicenseSetMainOwnerRequestData setMainOwner) {
    
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

  public UpdateSystemAttributesSoftwareLicenseSetMainOwnerRequestData getSetMainOwner() {
    return setMainOwner;
  }


  @JsonProperty(JSON_PROPERTY_SET_MAIN_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetMainOwner(UpdateSystemAttributesSoftwareLicenseSetMainOwnerRequestData setMainOwner) {
    this.setMainOwner = setMainOwner;
  }


  public UpdateSystemAttributesSoftwareLicenseRequestData updateGroup(List<UpdateSystemAttributesSoftwareLicenseUpdateGroupRequestData> updateGroup) {
    
    this.updateGroup = updateGroup;
    return this;
  }

  public UpdateSystemAttributesSoftwareLicenseRequestData addUpdateGroupItem(UpdateSystemAttributesSoftwareLicenseUpdateGroupRequestData updateGroupItem) {
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

  public List<UpdateSystemAttributesSoftwareLicenseUpdateGroupRequestData> getUpdateGroup() {
    return updateGroup;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateGroup(List<UpdateSystemAttributesSoftwareLicenseUpdateGroupRequestData> updateGroup) {
    this.updateGroup = updateGroup;
  }


  public UpdateSystemAttributesSoftwareLicenseRequestData updateUser(List<UpdateSystemAttributesSoftwareLicenseUpdateUserRequestData> updateUser) {
    
    this.updateUser = updateUser;
    return this;
  }

  public UpdateSystemAttributesSoftwareLicenseRequestData addUpdateUserItem(UpdateSystemAttributesSoftwareLicenseUpdateUserRequestData updateUserItem) {
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

  public List<UpdateSystemAttributesSoftwareLicenseUpdateUserRequestData> getUpdateUser() {
    return updateUser;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateUser(List<UpdateSystemAttributesSoftwareLicenseUpdateUserRequestData> updateUser) {
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
    UpdateSystemAttributesSoftwareLicenseRequestData updateSystemAttributesSoftwareLicenseRequestData = (UpdateSystemAttributesSoftwareLicenseRequestData) o;
    return Objects.equals(this.addGroup, updateSystemAttributesSoftwareLicenseRequestData.addGroup) &&
        Objects.equals(this.addOwner, updateSystemAttributesSoftwareLicenseRequestData.addOwner) &&
        Objects.equals(this.addUser, updateSystemAttributesSoftwareLicenseRequestData.addUser) &&
        Objects.equals(this.deleteGroup, updateSystemAttributesSoftwareLicenseRequestData.deleteGroup) &&
        Objects.equals(this.deleteOwner, updateSystemAttributesSoftwareLicenseRequestData.deleteOwner) &&
        Objects.equals(this.deleteUser, updateSystemAttributesSoftwareLicenseRequestData.deleteUser) &&
        Objects.equals(this.setMainOwner, updateSystemAttributesSoftwareLicenseRequestData.setMainOwner) &&
        Objects.equals(this.updateGroup, updateSystemAttributesSoftwareLicenseRequestData.updateGroup) &&
        Objects.equals(this.updateUser, updateSystemAttributesSoftwareLicenseRequestData.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addGroup, addOwner, addUser, deleteGroup, deleteOwner, deleteUser, setMainOwner, updateGroup, updateUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemAttributesSoftwareLicenseRequestData {\n");
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
