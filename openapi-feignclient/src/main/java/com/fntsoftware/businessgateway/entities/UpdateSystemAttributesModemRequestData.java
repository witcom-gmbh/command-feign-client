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
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesModemAddGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesModemAddOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesModemAddUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesModemDeleteGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesModemDeleteOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesModemDeleteUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesModemSetMainOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesModemUpdateGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesModemUpdateUserRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateSystemAttributesModemRequestData
 */
@JsonPropertyOrder({
  UpdateSystemAttributesModemRequestData.JSON_PROPERTY_ADD_GROUP,
  UpdateSystemAttributesModemRequestData.JSON_PROPERTY_ADD_OWNER,
  UpdateSystemAttributesModemRequestData.JSON_PROPERTY_ADD_USER,
  UpdateSystemAttributesModemRequestData.JSON_PROPERTY_DELETE_GROUP,
  UpdateSystemAttributesModemRequestData.JSON_PROPERTY_DELETE_OWNER,
  UpdateSystemAttributesModemRequestData.JSON_PROPERTY_DELETE_USER,
  UpdateSystemAttributesModemRequestData.JSON_PROPERTY_SET_MAIN_OWNER,
  UpdateSystemAttributesModemRequestData.JSON_PROPERTY_UPDATE_GROUP,
  UpdateSystemAttributesModemRequestData.JSON_PROPERTY_UPDATE_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateSystemAttributesModemRequestData {
  public static final String JSON_PROPERTY_ADD_GROUP = "addGroup";
  private List<UpdateSystemAttributesModemAddGroupRequestData> addGroup;

  public static final String JSON_PROPERTY_ADD_OWNER = "addOwner";
  private List<UpdateSystemAttributesModemAddOwnerRequestData> addOwner;

  public static final String JSON_PROPERTY_ADD_USER = "addUser";
  private List<UpdateSystemAttributesModemAddUserRequestData> addUser;

  public static final String JSON_PROPERTY_DELETE_GROUP = "deleteGroup";
  private List<UpdateSystemAttributesModemDeleteGroupRequestData> deleteGroup;

  public static final String JSON_PROPERTY_DELETE_OWNER = "deleteOwner";
  private List<UpdateSystemAttributesModemDeleteOwnerRequestData> deleteOwner;

  public static final String JSON_PROPERTY_DELETE_USER = "deleteUser";
  private List<UpdateSystemAttributesModemDeleteUserRequestData> deleteUser;

  public static final String JSON_PROPERTY_SET_MAIN_OWNER = "setMainOwner";
  private UpdateSystemAttributesModemSetMainOwnerRequestData setMainOwner;

  public static final String JSON_PROPERTY_UPDATE_GROUP = "updateGroup";
  private List<UpdateSystemAttributesModemUpdateGroupRequestData> updateGroup;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private List<UpdateSystemAttributesModemUpdateUserRequestData> updateUser;

  public UpdateSystemAttributesModemRequestData() {
  }

  public UpdateSystemAttributesModemRequestData addGroup(List<UpdateSystemAttributesModemAddGroupRequestData> addGroup) {
    
    this.addGroup = addGroup;
    return this;
  }

  public UpdateSystemAttributesModemRequestData addAddGroupItem(UpdateSystemAttributesModemAddGroupRequestData addGroupItem) {
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

  public List<UpdateSystemAttributesModemAddGroupRequestData> getAddGroup() {
    return addGroup;
  }


  @JsonProperty(JSON_PROPERTY_ADD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddGroup(List<UpdateSystemAttributesModemAddGroupRequestData> addGroup) {
    this.addGroup = addGroup;
  }


  public UpdateSystemAttributesModemRequestData addOwner(List<UpdateSystemAttributesModemAddOwnerRequestData> addOwner) {
    
    this.addOwner = addOwner;
    return this;
  }

  public UpdateSystemAttributesModemRequestData addAddOwnerItem(UpdateSystemAttributesModemAddOwnerRequestData addOwnerItem) {
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

  public List<UpdateSystemAttributesModemAddOwnerRequestData> getAddOwner() {
    return addOwner;
  }


  @JsonProperty(JSON_PROPERTY_ADD_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOwner(List<UpdateSystemAttributesModemAddOwnerRequestData> addOwner) {
    this.addOwner = addOwner;
  }


  public UpdateSystemAttributesModemRequestData addUser(List<UpdateSystemAttributesModemAddUserRequestData> addUser) {
    
    this.addUser = addUser;
    return this;
  }

  public UpdateSystemAttributesModemRequestData addAddUserItem(UpdateSystemAttributesModemAddUserRequestData addUserItem) {
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

  public List<UpdateSystemAttributesModemAddUserRequestData> getAddUser() {
    return addUser;
  }


  @JsonProperty(JSON_PROPERTY_ADD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddUser(List<UpdateSystemAttributesModemAddUserRequestData> addUser) {
    this.addUser = addUser;
  }


  public UpdateSystemAttributesModemRequestData deleteGroup(List<UpdateSystemAttributesModemDeleteGroupRequestData> deleteGroup) {
    
    this.deleteGroup = deleteGroup;
    return this;
  }

  public UpdateSystemAttributesModemRequestData addDeleteGroupItem(UpdateSystemAttributesModemDeleteGroupRequestData deleteGroupItem) {
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

  public List<UpdateSystemAttributesModemDeleteGroupRequestData> getDeleteGroup() {
    return deleteGroup;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteGroup(List<UpdateSystemAttributesModemDeleteGroupRequestData> deleteGroup) {
    this.deleteGroup = deleteGroup;
  }


  public UpdateSystemAttributesModemRequestData deleteOwner(List<UpdateSystemAttributesModemDeleteOwnerRequestData> deleteOwner) {
    
    this.deleteOwner = deleteOwner;
    return this;
  }

  public UpdateSystemAttributesModemRequestData addDeleteOwnerItem(UpdateSystemAttributesModemDeleteOwnerRequestData deleteOwnerItem) {
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

  public List<UpdateSystemAttributesModemDeleteOwnerRequestData> getDeleteOwner() {
    return deleteOwner;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteOwner(List<UpdateSystemAttributesModemDeleteOwnerRequestData> deleteOwner) {
    this.deleteOwner = deleteOwner;
  }


  public UpdateSystemAttributesModemRequestData deleteUser(List<UpdateSystemAttributesModemDeleteUserRequestData> deleteUser) {
    
    this.deleteUser = deleteUser;
    return this;
  }

  public UpdateSystemAttributesModemRequestData addDeleteUserItem(UpdateSystemAttributesModemDeleteUserRequestData deleteUserItem) {
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

  public List<UpdateSystemAttributesModemDeleteUserRequestData> getDeleteUser() {
    return deleteUser;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteUser(List<UpdateSystemAttributesModemDeleteUserRequestData> deleteUser) {
    this.deleteUser = deleteUser;
  }


  public UpdateSystemAttributesModemRequestData setMainOwner(UpdateSystemAttributesModemSetMainOwnerRequestData setMainOwner) {
    
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

  public UpdateSystemAttributesModemSetMainOwnerRequestData getSetMainOwner() {
    return setMainOwner;
  }


  @JsonProperty(JSON_PROPERTY_SET_MAIN_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetMainOwner(UpdateSystemAttributesModemSetMainOwnerRequestData setMainOwner) {
    this.setMainOwner = setMainOwner;
  }


  public UpdateSystemAttributesModemRequestData updateGroup(List<UpdateSystemAttributesModemUpdateGroupRequestData> updateGroup) {
    
    this.updateGroup = updateGroup;
    return this;
  }

  public UpdateSystemAttributesModemRequestData addUpdateGroupItem(UpdateSystemAttributesModemUpdateGroupRequestData updateGroupItem) {
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

  public List<UpdateSystemAttributesModemUpdateGroupRequestData> getUpdateGroup() {
    return updateGroup;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateGroup(List<UpdateSystemAttributesModemUpdateGroupRequestData> updateGroup) {
    this.updateGroup = updateGroup;
  }


  public UpdateSystemAttributesModemRequestData updateUser(List<UpdateSystemAttributesModemUpdateUserRequestData> updateUser) {
    
    this.updateUser = updateUser;
    return this;
  }

  public UpdateSystemAttributesModemRequestData addUpdateUserItem(UpdateSystemAttributesModemUpdateUserRequestData updateUserItem) {
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

  public List<UpdateSystemAttributesModemUpdateUserRequestData> getUpdateUser() {
    return updateUser;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateUser(List<UpdateSystemAttributesModemUpdateUserRequestData> updateUser) {
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
    UpdateSystemAttributesModemRequestData updateSystemAttributesModemRequestData = (UpdateSystemAttributesModemRequestData) o;
    return Objects.equals(this.addGroup, updateSystemAttributesModemRequestData.addGroup) &&
        Objects.equals(this.addOwner, updateSystemAttributesModemRequestData.addOwner) &&
        Objects.equals(this.addUser, updateSystemAttributesModemRequestData.addUser) &&
        Objects.equals(this.deleteGroup, updateSystemAttributesModemRequestData.deleteGroup) &&
        Objects.equals(this.deleteOwner, updateSystemAttributesModemRequestData.deleteOwner) &&
        Objects.equals(this.deleteUser, updateSystemAttributesModemRequestData.deleteUser) &&
        Objects.equals(this.setMainOwner, updateSystemAttributesModemRequestData.setMainOwner) &&
        Objects.equals(this.updateGroup, updateSystemAttributesModemRequestData.updateGroup) &&
        Objects.equals(this.updateUser, updateSystemAttributesModemRequestData.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addGroup, addOwner, addUser, deleteGroup, deleteOwner, deleteUser, setMainOwner, updateGroup, updateUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemAttributesModemRequestData {\n");
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
