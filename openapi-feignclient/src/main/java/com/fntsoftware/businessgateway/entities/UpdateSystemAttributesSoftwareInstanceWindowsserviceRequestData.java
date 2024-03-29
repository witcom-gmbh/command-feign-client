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
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceWindowsserviceAddGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceWindowsserviceAddOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceWindowsserviceAddUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceWindowsserviceSetMainOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceWindowsserviceUpdateGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceWindowsserviceUpdateUserRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData
 */
@JsonPropertyOrder({
  UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData.JSON_PROPERTY_ADD_GROUP,
  UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData.JSON_PROPERTY_ADD_OWNER,
  UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData.JSON_PROPERTY_ADD_USER,
  UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData.JSON_PROPERTY_DELETE_GROUP,
  UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData.JSON_PROPERTY_DELETE_OWNER,
  UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData.JSON_PROPERTY_DELETE_USER,
  UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData.JSON_PROPERTY_SET_MAIN_OWNER,
  UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData.JSON_PROPERTY_UPDATE_GROUP,
  UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData.JSON_PROPERTY_UPDATE_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public class UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData {
  public static final String JSON_PROPERTY_ADD_GROUP = "addGroup";
  private List<UpdateSystemAttributesSoftwareInstanceWindowsserviceAddGroupRequestData> addGroup;

  public static final String JSON_PROPERTY_ADD_OWNER = "addOwner";
  private List<UpdateSystemAttributesSoftwareInstanceWindowsserviceAddOwnerRequestData> addOwner;

  public static final String JSON_PROPERTY_ADD_USER = "addUser";
  private List<UpdateSystemAttributesSoftwareInstanceWindowsserviceAddUserRequestData> addUser;

  public static final String JSON_PROPERTY_DELETE_GROUP = "deleteGroup";
  private List<UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteGroupRequestData> deleteGroup;

  public static final String JSON_PROPERTY_DELETE_OWNER = "deleteOwner";
  private List<UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteOwnerRequestData> deleteOwner;

  public static final String JSON_PROPERTY_DELETE_USER = "deleteUser";
  private List<UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteUserRequestData> deleteUser;

  public static final String JSON_PROPERTY_SET_MAIN_OWNER = "setMainOwner";
  private UpdateSystemAttributesSoftwareInstanceWindowsserviceSetMainOwnerRequestData setMainOwner;

  public static final String JSON_PROPERTY_UPDATE_GROUP = "updateGroup";
  private List<UpdateSystemAttributesSoftwareInstanceWindowsserviceUpdateGroupRequestData> updateGroup;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private List<UpdateSystemAttributesSoftwareInstanceWindowsserviceUpdateUserRequestData> updateUser;

  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData() {
  }

  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData addGroup(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceAddGroupRequestData> addGroup) {
    
    this.addGroup = addGroup;
    return this;
  }

  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData addAddGroupItem(UpdateSystemAttributesSoftwareInstanceWindowsserviceAddGroupRequestData addGroupItem) {
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

  public List<UpdateSystemAttributesSoftwareInstanceWindowsserviceAddGroupRequestData> getAddGroup() {
    return addGroup;
  }


  @JsonProperty(JSON_PROPERTY_ADD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddGroup(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceAddGroupRequestData> addGroup) {
    this.addGroup = addGroup;
  }


  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData addOwner(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceAddOwnerRequestData> addOwner) {
    
    this.addOwner = addOwner;
    return this;
  }

  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData addAddOwnerItem(UpdateSystemAttributesSoftwareInstanceWindowsserviceAddOwnerRequestData addOwnerItem) {
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

  public List<UpdateSystemAttributesSoftwareInstanceWindowsserviceAddOwnerRequestData> getAddOwner() {
    return addOwner;
  }


  @JsonProperty(JSON_PROPERTY_ADD_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOwner(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceAddOwnerRequestData> addOwner) {
    this.addOwner = addOwner;
  }


  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData addUser(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceAddUserRequestData> addUser) {
    
    this.addUser = addUser;
    return this;
  }

  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData addAddUserItem(UpdateSystemAttributesSoftwareInstanceWindowsserviceAddUserRequestData addUserItem) {
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

  public List<UpdateSystemAttributesSoftwareInstanceWindowsserviceAddUserRequestData> getAddUser() {
    return addUser;
  }


  @JsonProperty(JSON_PROPERTY_ADD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddUser(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceAddUserRequestData> addUser) {
    this.addUser = addUser;
  }


  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData deleteGroup(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteGroupRequestData> deleteGroup) {
    
    this.deleteGroup = deleteGroup;
    return this;
  }

  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData addDeleteGroupItem(UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteGroupRequestData deleteGroupItem) {
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

  public List<UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteGroupRequestData> getDeleteGroup() {
    return deleteGroup;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteGroup(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteGroupRequestData> deleteGroup) {
    this.deleteGroup = deleteGroup;
  }


  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData deleteOwner(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteOwnerRequestData> deleteOwner) {
    
    this.deleteOwner = deleteOwner;
    return this;
  }

  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData addDeleteOwnerItem(UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteOwnerRequestData deleteOwnerItem) {
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

  public List<UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteOwnerRequestData> getDeleteOwner() {
    return deleteOwner;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteOwner(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteOwnerRequestData> deleteOwner) {
    this.deleteOwner = deleteOwner;
  }


  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData deleteUser(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteUserRequestData> deleteUser) {
    
    this.deleteUser = deleteUser;
    return this;
  }

  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData addDeleteUserItem(UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteUserRequestData deleteUserItem) {
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

  public List<UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteUserRequestData> getDeleteUser() {
    return deleteUser;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteUser(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceDeleteUserRequestData> deleteUser) {
    this.deleteUser = deleteUser;
  }


  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData setMainOwner(UpdateSystemAttributesSoftwareInstanceWindowsserviceSetMainOwnerRequestData setMainOwner) {
    
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

  public UpdateSystemAttributesSoftwareInstanceWindowsserviceSetMainOwnerRequestData getSetMainOwner() {
    return setMainOwner;
  }


  @JsonProperty(JSON_PROPERTY_SET_MAIN_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetMainOwner(UpdateSystemAttributesSoftwareInstanceWindowsserviceSetMainOwnerRequestData setMainOwner) {
    this.setMainOwner = setMainOwner;
  }


  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData updateGroup(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceUpdateGroupRequestData> updateGroup) {
    
    this.updateGroup = updateGroup;
    return this;
  }

  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData addUpdateGroupItem(UpdateSystemAttributesSoftwareInstanceWindowsserviceUpdateGroupRequestData updateGroupItem) {
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

  public List<UpdateSystemAttributesSoftwareInstanceWindowsserviceUpdateGroupRequestData> getUpdateGroup() {
    return updateGroup;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateGroup(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceUpdateGroupRequestData> updateGroup) {
    this.updateGroup = updateGroup;
  }


  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData updateUser(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceUpdateUserRequestData> updateUser) {
    
    this.updateUser = updateUser;
    return this;
  }

  public UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData addUpdateUserItem(UpdateSystemAttributesSoftwareInstanceWindowsserviceUpdateUserRequestData updateUserItem) {
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

  public List<UpdateSystemAttributesSoftwareInstanceWindowsserviceUpdateUserRequestData> getUpdateUser() {
    return updateUser;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateUser(List<UpdateSystemAttributesSoftwareInstanceWindowsserviceUpdateUserRequestData> updateUser) {
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
    UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData updateSystemAttributesSoftwareInstanceWindowsserviceRequestData = (UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData) o;
    return Objects.equals(this.addGroup, updateSystemAttributesSoftwareInstanceWindowsserviceRequestData.addGroup) &&
        Objects.equals(this.addOwner, updateSystemAttributesSoftwareInstanceWindowsserviceRequestData.addOwner) &&
        Objects.equals(this.addUser, updateSystemAttributesSoftwareInstanceWindowsserviceRequestData.addUser) &&
        Objects.equals(this.deleteGroup, updateSystemAttributesSoftwareInstanceWindowsserviceRequestData.deleteGroup) &&
        Objects.equals(this.deleteOwner, updateSystemAttributesSoftwareInstanceWindowsserviceRequestData.deleteOwner) &&
        Objects.equals(this.deleteUser, updateSystemAttributesSoftwareInstanceWindowsserviceRequestData.deleteUser) &&
        Objects.equals(this.setMainOwner, updateSystemAttributesSoftwareInstanceWindowsserviceRequestData.setMainOwner) &&
        Objects.equals(this.updateGroup, updateSystemAttributesSoftwareInstanceWindowsserviceRequestData.updateGroup) &&
        Objects.equals(this.updateUser, updateSystemAttributesSoftwareInstanceWindowsserviceRequestData.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addGroup, addOwner, addUser, deleteGroup, deleteOwner, deleteUser, setMainOwner, updateGroup, updateUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData {\n");
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

