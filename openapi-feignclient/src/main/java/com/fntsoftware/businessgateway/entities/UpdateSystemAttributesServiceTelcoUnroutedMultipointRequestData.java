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
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoUnroutedMultipointAddGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoUnroutedMultipointAddOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoUnroutedMultipointAddUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoUnroutedMultipointSetMainOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoUnroutedMultipointUpdateGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTelcoUnroutedMultipointUpdateUserRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData
 */
@JsonPropertyOrder({
  UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData.JSON_PROPERTY_ADD_GROUP,
  UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData.JSON_PROPERTY_ADD_OWNER,
  UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData.JSON_PROPERTY_ADD_USER,
  UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData.JSON_PROPERTY_DELETE_GROUP,
  UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData.JSON_PROPERTY_DELETE_OWNER,
  UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData.JSON_PROPERTY_DELETE_USER,
  UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData.JSON_PROPERTY_SET_MAIN_OWNER,
  UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData.JSON_PROPERTY_UPDATE_GROUP,
  UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData.JSON_PROPERTY_UPDATE_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData {
  public static final String JSON_PROPERTY_ADD_GROUP = "addGroup";
  private List<UpdateSystemAttributesServiceTelcoUnroutedMultipointAddGroupRequestData> addGroup;

  public static final String JSON_PROPERTY_ADD_OWNER = "addOwner";
  private List<UpdateSystemAttributesServiceTelcoUnroutedMultipointAddOwnerRequestData> addOwner;

  public static final String JSON_PROPERTY_ADD_USER = "addUser";
  private List<UpdateSystemAttributesServiceTelcoUnroutedMultipointAddUserRequestData> addUser;

  public static final String JSON_PROPERTY_DELETE_GROUP = "deleteGroup";
  private List<UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteGroupRequestData> deleteGroup;

  public static final String JSON_PROPERTY_DELETE_OWNER = "deleteOwner";
  private List<UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteOwnerRequestData> deleteOwner;

  public static final String JSON_PROPERTY_DELETE_USER = "deleteUser";
  private List<UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteUserRequestData> deleteUser;

  public static final String JSON_PROPERTY_SET_MAIN_OWNER = "setMainOwner";
  private UpdateSystemAttributesServiceTelcoUnroutedMultipointSetMainOwnerRequestData setMainOwner;

  public static final String JSON_PROPERTY_UPDATE_GROUP = "updateGroup";
  private List<UpdateSystemAttributesServiceTelcoUnroutedMultipointUpdateGroupRequestData> updateGroup;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private List<UpdateSystemAttributesServiceTelcoUnroutedMultipointUpdateUserRequestData> updateUser;

  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData() {
  }

  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData addGroup(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointAddGroupRequestData> addGroup) {
    
    this.addGroup = addGroup;
    return this;
  }

  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData addAddGroupItem(UpdateSystemAttributesServiceTelcoUnroutedMultipointAddGroupRequestData addGroupItem) {
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

  public List<UpdateSystemAttributesServiceTelcoUnroutedMultipointAddGroupRequestData> getAddGroup() {
    return addGroup;
  }


  @JsonProperty(JSON_PROPERTY_ADD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddGroup(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointAddGroupRequestData> addGroup) {
    this.addGroup = addGroup;
  }


  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData addOwner(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointAddOwnerRequestData> addOwner) {
    
    this.addOwner = addOwner;
    return this;
  }

  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData addAddOwnerItem(UpdateSystemAttributesServiceTelcoUnroutedMultipointAddOwnerRequestData addOwnerItem) {
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

  public List<UpdateSystemAttributesServiceTelcoUnroutedMultipointAddOwnerRequestData> getAddOwner() {
    return addOwner;
  }


  @JsonProperty(JSON_PROPERTY_ADD_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOwner(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointAddOwnerRequestData> addOwner) {
    this.addOwner = addOwner;
  }


  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData addUser(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointAddUserRequestData> addUser) {
    
    this.addUser = addUser;
    return this;
  }

  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData addAddUserItem(UpdateSystemAttributesServiceTelcoUnroutedMultipointAddUserRequestData addUserItem) {
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

  public List<UpdateSystemAttributesServiceTelcoUnroutedMultipointAddUserRequestData> getAddUser() {
    return addUser;
  }


  @JsonProperty(JSON_PROPERTY_ADD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddUser(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointAddUserRequestData> addUser) {
    this.addUser = addUser;
  }


  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData deleteGroup(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteGroupRequestData> deleteGroup) {
    
    this.deleteGroup = deleteGroup;
    return this;
  }

  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData addDeleteGroupItem(UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteGroupRequestData deleteGroupItem) {
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

  public List<UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteGroupRequestData> getDeleteGroup() {
    return deleteGroup;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteGroup(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteGroupRequestData> deleteGroup) {
    this.deleteGroup = deleteGroup;
  }


  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData deleteOwner(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteOwnerRequestData> deleteOwner) {
    
    this.deleteOwner = deleteOwner;
    return this;
  }

  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData addDeleteOwnerItem(UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteOwnerRequestData deleteOwnerItem) {
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

  public List<UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteOwnerRequestData> getDeleteOwner() {
    return deleteOwner;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteOwner(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteOwnerRequestData> deleteOwner) {
    this.deleteOwner = deleteOwner;
  }


  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData deleteUser(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteUserRequestData> deleteUser) {
    
    this.deleteUser = deleteUser;
    return this;
  }

  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData addDeleteUserItem(UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteUserRequestData deleteUserItem) {
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

  public List<UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteUserRequestData> getDeleteUser() {
    return deleteUser;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteUser(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointDeleteUserRequestData> deleteUser) {
    this.deleteUser = deleteUser;
  }


  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData setMainOwner(UpdateSystemAttributesServiceTelcoUnroutedMultipointSetMainOwnerRequestData setMainOwner) {
    
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

  public UpdateSystemAttributesServiceTelcoUnroutedMultipointSetMainOwnerRequestData getSetMainOwner() {
    return setMainOwner;
  }


  @JsonProperty(JSON_PROPERTY_SET_MAIN_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetMainOwner(UpdateSystemAttributesServiceTelcoUnroutedMultipointSetMainOwnerRequestData setMainOwner) {
    this.setMainOwner = setMainOwner;
  }


  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData updateGroup(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointUpdateGroupRequestData> updateGroup) {
    
    this.updateGroup = updateGroup;
    return this;
  }

  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData addUpdateGroupItem(UpdateSystemAttributesServiceTelcoUnroutedMultipointUpdateGroupRequestData updateGroupItem) {
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

  public List<UpdateSystemAttributesServiceTelcoUnroutedMultipointUpdateGroupRequestData> getUpdateGroup() {
    return updateGroup;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateGroup(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointUpdateGroupRequestData> updateGroup) {
    this.updateGroup = updateGroup;
  }


  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData updateUser(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointUpdateUserRequestData> updateUser) {
    
    this.updateUser = updateUser;
    return this;
  }

  public UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData addUpdateUserItem(UpdateSystemAttributesServiceTelcoUnroutedMultipointUpdateUserRequestData updateUserItem) {
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

  public List<UpdateSystemAttributesServiceTelcoUnroutedMultipointUpdateUserRequestData> getUpdateUser() {
    return updateUser;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateUser(List<UpdateSystemAttributesServiceTelcoUnroutedMultipointUpdateUserRequestData> updateUser) {
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
    UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData updateSystemAttributesServiceTelcoUnroutedMultipointRequestData = (UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData) o;
    return Objects.equals(this.addGroup, updateSystemAttributesServiceTelcoUnroutedMultipointRequestData.addGroup) &&
        Objects.equals(this.addOwner, updateSystemAttributesServiceTelcoUnroutedMultipointRequestData.addOwner) &&
        Objects.equals(this.addUser, updateSystemAttributesServiceTelcoUnroutedMultipointRequestData.addUser) &&
        Objects.equals(this.deleteGroup, updateSystemAttributesServiceTelcoUnroutedMultipointRequestData.deleteGroup) &&
        Objects.equals(this.deleteOwner, updateSystemAttributesServiceTelcoUnroutedMultipointRequestData.deleteOwner) &&
        Objects.equals(this.deleteUser, updateSystemAttributesServiceTelcoUnroutedMultipointRequestData.deleteUser) &&
        Objects.equals(this.setMainOwner, updateSystemAttributesServiceTelcoUnroutedMultipointRequestData.setMainOwner) &&
        Objects.equals(this.updateGroup, updateSystemAttributesServiceTelcoUnroutedMultipointRequestData.updateGroup) &&
        Objects.equals(this.updateUser, updateSystemAttributesServiceTelcoUnroutedMultipointRequestData.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addGroup, addOwner, addUser, deleteGroup, deleteOwner, deleteUser, setMainOwner, updateGroup, updateUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemAttributesServiceTelcoUnroutedMultipointRequestData {\n");
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
