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
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOperatingSystemInstallationAddGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOperatingSystemInstallationAddOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOperatingSystemInstallationAddUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOperatingSystemInstallationDeleteGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOperatingSystemInstallationDeleteOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOperatingSystemInstallationDeleteUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOperatingSystemInstallationSetMainOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOperatingSystemInstallationUpdateGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOperatingSystemInstallationUpdateUserRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateSystemAttributesOperatingSystemInstallationRequestData
 */
@JsonPropertyOrder({
  UpdateSystemAttributesOperatingSystemInstallationRequestData.JSON_PROPERTY_ADD_GROUP,
  UpdateSystemAttributesOperatingSystemInstallationRequestData.JSON_PROPERTY_ADD_OWNER,
  UpdateSystemAttributesOperatingSystemInstallationRequestData.JSON_PROPERTY_ADD_USER,
  UpdateSystemAttributesOperatingSystemInstallationRequestData.JSON_PROPERTY_DELETE_GROUP,
  UpdateSystemAttributesOperatingSystemInstallationRequestData.JSON_PROPERTY_DELETE_OWNER,
  UpdateSystemAttributesOperatingSystemInstallationRequestData.JSON_PROPERTY_DELETE_USER,
  UpdateSystemAttributesOperatingSystemInstallationRequestData.JSON_PROPERTY_SET_MAIN_OWNER,
  UpdateSystemAttributesOperatingSystemInstallationRequestData.JSON_PROPERTY_UPDATE_GROUP,
  UpdateSystemAttributesOperatingSystemInstallationRequestData.JSON_PROPERTY_UPDATE_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateSystemAttributesOperatingSystemInstallationRequestData {
  public static final String JSON_PROPERTY_ADD_GROUP = "addGroup";
  private List<UpdateSystemAttributesOperatingSystemInstallationAddGroupRequestData> addGroup;

  public static final String JSON_PROPERTY_ADD_OWNER = "addOwner";
  private List<UpdateSystemAttributesOperatingSystemInstallationAddOwnerRequestData> addOwner;

  public static final String JSON_PROPERTY_ADD_USER = "addUser";
  private List<UpdateSystemAttributesOperatingSystemInstallationAddUserRequestData> addUser;

  public static final String JSON_PROPERTY_DELETE_GROUP = "deleteGroup";
  private List<UpdateSystemAttributesOperatingSystemInstallationDeleteGroupRequestData> deleteGroup;

  public static final String JSON_PROPERTY_DELETE_OWNER = "deleteOwner";
  private List<UpdateSystemAttributesOperatingSystemInstallationDeleteOwnerRequestData> deleteOwner;

  public static final String JSON_PROPERTY_DELETE_USER = "deleteUser";
  private List<UpdateSystemAttributesOperatingSystemInstallationDeleteUserRequestData> deleteUser;

  public static final String JSON_PROPERTY_SET_MAIN_OWNER = "setMainOwner";
  private UpdateSystemAttributesOperatingSystemInstallationSetMainOwnerRequestData setMainOwner;

  public static final String JSON_PROPERTY_UPDATE_GROUP = "updateGroup";
  private List<UpdateSystemAttributesOperatingSystemInstallationUpdateGroupRequestData> updateGroup;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private List<UpdateSystemAttributesOperatingSystemInstallationUpdateUserRequestData> updateUser;

  public UpdateSystemAttributesOperatingSystemInstallationRequestData() {
  }

  public UpdateSystemAttributesOperatingSystemInstallationRequestData addGroup(List<UpdateSystemAttributesOperatingSystemInstallationAddGroupRequestData> addGroup) {
    
    this.addGroup = addGroup;
    return this;
  }

  public UpdateSystemAttributesOperatingSystemInstallationRequestData addAddGroupItem(UpdateSystemAttributesOperatingSystemInstallationAddGroupRequestData addGroupItem) {
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

  public List<UpdateSystemAttributesOperatingSystemInstallationAddGroupRequestData> getAddGroup() {
    return addGroup;
  }


  @JsonProperty(JSON_PROPERTY_ADD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddGroup(List<UpdateSystemAttributesOperatingSystemInstallationAddGroupRequestData> addGroup) {
    this.addGroup = addGroup;
  }


  public UpdateSystemAttributesOperatingSystemInstallationRequestData addOwner(List<UpdateSystemAttributesOperatingSystemInstallationAddOwnerRequestData> addOwner) {
    
    this.addOwner = addOwner;
    return this;
  }

  public UpdateSystemAttributesOperatingSystemInstallationRequestData addAddOwnerItem(UpdateSystemAttributesOperatingSystemInstallationAddOwnerRequestData addOwnerItem) {
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

  public List<UpdateSystemAttributesOperatingSystemInstallationAddOwnerRequestData> getAddOwner() {
    return addOwner;
  }


  @JsonProperty(JSON_PROPERTY_ADD_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOwner(List<UpdateSystemAttributesOperatingSystemInstallationAddOwnerRequestData> addOwner) {
    this.addOwner = addOwner;
  }


  public UpdateSystemAttributesOperatingSystemInstallationRequestData addUser(List<UpdateSystemAttributesOperatingSystemInstallationAddUserRequestData> addUser) {
    
    this.addUser = addUser;
    return this;
  }

  public UpdateSystemAttributesOperatingSystemInstallationRequestData addAddUserItem(UpdateSystemAttributesOperatingSystemInstallationAddUserRequestData addUserItem) {
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

  public List<UpdateSystemAttributesOperatingSystemInstallationAddUserRequestData> getAddUser() {
    return addUser;
  }


  @JsonProperty(JSON_PROPERTY_ADD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddUser(List<UpdateSystemAttributesOperatingSystemInstallationAddUserRequestData> addUser) {
    this.addUser = addUser;
  }


  public UpdateSystemAttributesOperatingSystemInstallationRequestData deleteGroup(List<UpdateSystemAttributesOperatingSystemInstallationDeleteGroupRequestData> deleteGroup) {
    
    this.deleteGroup = deleteGroup;
    return this;
  }

  public UpdateSystemAttributesOperatingSystemInstallationRequestData addDeleteGroupItem(UpdateSystemAttributesOperatingSystemInstallationDeleteGroupRequestData deleteGroupItem) {
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

  public List<UpdateSystemAttributesOperatingSystemInstallationDeleteGroupRequestData> getDeleteGroup() {
    return deleteGroup;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteGroup(List<UpdateSystemAttributesOperatingSystemInstallationDeleteGroupRequestData> deleteGroup) {
    this.deleteGroup = deleteGroup;
  }


  public UpdateSystemAttributesOperatingSystemInstallationRequestData deleteOwner(List<UpdateSystemAttributesOperatingSystemInstallationDeleteOwnerRequestData> deleteOwner) {
    
    this.deleteOwner = deleteOwner;
    return this;
  }

  public UpdateSystemAttributesOperatingSystemInstallationRequestData addDeleteOwnerItem(UpdateSystemAttributesOperatingSystemInstallationDeleteOwnerRequestData deleteOwnerItem) {
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

  public List<UpdateSystemAttributesOperatingSystemInstallationDeleteOwnerRequestData> getDeleteOwner() {
    return deleteOwner;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteOwner(List<UpdateSystemAttributesOperatingSystemInstallationDeleteOwnerRequestData> deleteOwner) {
    this.deleteOwner = deleteOwner;
  }


  public UpdateSystemAttributesOperatingSystemInstallationRequestData deleteUser(List<UpdateSystemAttributesOperatingSystemInstallationDeleteUserRequestData> deleteUser) {
    
    this.deleteUser = deleteUser;
    return this;
  }

  public UpdateSystemAttributesOperatingSystemInstallationRequestData addDeleteUserItem(UpdateSystemAttributesOperatingSystemInstallationDeleteUserRequestData deleteUserItem) {
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

  public List<UpdateSystemAttributesOperatingSystemInstallationDeleteUserRequestData> getDeleteUser() {
    return deleteUser;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteUser(List<UpdateSystemAttributesOperatingSystemInstallationDeleteUserRequestData> deleteUser) {
    this.deleteUser = deleteUser;
  }


  public UpdateSystemAttributesOperatingSystemInstallationRequestData setMainOwner(UpdateSystemAttributesOperatingSystemInstallationSetMainOwnerRequestData setMainOwner) {
    
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

  public UpdateSystemAttributesOperatingSystemInstallationSetMainOwnerRequestData getSetMainOwner() {
    return setMainOwner;
  }


  @JsonProperty(JSON_PROPERTY_SET_MAIN_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetMainOwner(UpdateSystemAttributesOperatingSystemInstallationSetMainOwnerRequestData setMainOwner) {
    this.setMainOwner = setMainOwner;
  }


  public UpdateSystemAttributesOperatingSystemInstallationRequestData updateGroup(List<UpdateSystemAttributesOperatingSystemInstallationUpdateGroupRequestData> updateGroup) {
    
    this.updateGroup = updateGroup;
    return this;
  }

  public UpdateSystemAttributesOperatingSystemInstallationRequestData addUpdateGroupItem(UpdateSystemAttributesOperatingSystemInstallationUpdateGroupRequestData updateGroupItem) {
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

  public List<UpdateSystemAttributesOperatingSystemInstallationUpdateGroupRequestData> getUpdateGroup() {
    return updateGroup;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateGroup(List<UpdateSystemAttributesOperatingSystemInstallationUpdateGroupRequestData> updateGroup) {
    this.updateGroup = updateGroup;
  }


  public UpdateSystemAttributesOperatingSystemInstallationRequestData updateUser(List<UpdateSystemAttributesOperatingSystemInstallationUpdateUserRequestData> updateUser) {
    
    this.updateUser = updateUser;
    return this;
  }

  public UpdateSystemAttributesOperatingSystemInstallationRequestData addUpdateUserItem(UpdateSystemAttributesOperatingSystemInstallationUpdateUserRequestData updateUserItem) {
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

  public List<UpdateSystemAttributesOperatingSystemInstallationUpdateUserRequestData> getUpdateUser() {
    return updateUser;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateUser(List<UpdateSystemAttributesOperatingSystemInstallationUpdateUserRequestData> updateUser) {
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
    UpdateSystemAttributesOperatingSystemInstallationRequestData updateSystemAttributesOperatingSystemInstallationRequestData = (UpdateSystemAttributesOperatingSystemInstallationRequestData) o;
    return Objects.equals(this.addGroup, updateSystemAttributesOperatingSystemInstallationRequestData.addGroup) &&
        Objects.equals(this.addOwner, updateSystemAttributesOperatingSystemInstallationRequestData.addOwner) &&
        Objects.equals(this.addUser, updateSystemAttributesOperatingSystemInstallationRequestData.addUser) &&
        Objects.equals(this.deleteGroup, updateSystemAttributesOperatingSystemInstallationRequestData.deleteGroup) &&
        Objects.equals(this.deleteOwner, updateSystemAttributesOperatingSystemInstallationRequestData.deleteOwner) &&
        Objects.equals(this.deleteUser, updateSystemAttributesOperatingSystemInstallationRequestData.deleteUser) &&
        Objects.equals(this.setMainOwner, updateSystemAttributesOperatingSystemInstallationRequestData.setMainOwner) &&
        Objects.equals(this.updateGroup, updateSystemAttributesOperatingSystemInstallationRequestData.updateGroup) &&
        Objects.equals(this.updateUser, updateSystemAttributesOperatingSystemInstallationRequestData.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addGroup, addOwner, addUser, deleteGroup, deleteOwner, deleteUser, setMainOwner, updateGroup, updateUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemAttributesOperatingSystemInstallationRequestData {\n");
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
