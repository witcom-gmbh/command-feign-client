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
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomL2CpeSegmentAddGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomL2CpeSegmentAddOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomL2CpeSegmentAddUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomL2CpeSegmentDeleteGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomL2CpeSegmentDeleteOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomL2CpeSegmentDeleteUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomL2CpeSegmentSetMainOwnerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomL2CpeSegmentUpdateGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomL2CpeSegmentUpdateUserRequestData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateSystemAttributesCustomL2CpeSegmentRequestData
 */
@JsonPropertyOrder({
  UpdateSystemAttributesCustomL2CpeSegmentRequestData.JSON_PROPERTY_ADD_GROUP,
  UpdateSystemAttributesCustomL2CpeSegmentRequestData.JSON_PROPERTY_ADD_OWNER,
  UpdateSystemAttributesCustomL2CpeSegmentRequestData.JSON_PROPERTY_ADD_USER,
  UpdateSystemAttributesCustomL2CpeSegmentRequestData.JSON_PROPERTY_DELETE_GROUP,
  UpdateSystemAttributesCustomL2CpeSegmentRequestData.JSON_PROPERTY_DELETE_OWNER,
  UpdateSystemAttributesCustomL2CpeSegmentRequestData.JSON_PROPERTY_DELETE_USER,
  UpdateSystemAttributesCustomL2CpeSegmentRequestData.JSON_PROPERTY_SET_MAIN_OWNER,
  UpdateSystemAttributesCustomL2CpeSegmentRequestData.JSON_PROPERTY_UPDATE_GROUP,
  UpdateSystemAttributesCustomL2CpeSegmentRequestData.JSON_PROPERTY_UPDATE_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class UpdateSystemAttributesCustomL2CpeSegmentRequestData {
  public static final String JSON_PROPERTY_ADD_GROUP = "addGroup";
  private List<UpdateSystemAttributesCustomL2CpeSegmentAddGroupRequestData> addGroup;

  public static final String JSON_PROPERTY_ADD_OWNER = "addOwner";
  private List<UpdateSystemAttributesCustomL2CpeSegmentAddOwnerRequestData> addOwner;

  public static final String JSON_PROPERTY_ADD_USER = "addUser";
  private List<UpdateSystemAttributesCustomL2CpeSegmentAddUserRequestData> addUser;

  public static final String JSON_PROPERTY_DELETE_GROUP = "deleteGroup";
  private List<UpdateSystemAttributesCustomL2CpeSegmentDeleteGroupRequestData> deleteGroup;

  public static final String JSON_PROPERTY_DELETE_OWNER = "deleteOwner";
  private List<UpdateSystemAttributesCustomL2CpeSegmentDeleteOwnerRequestData> deleteOwner;

  public static final String JSON_PROPERTY_DELETE_USER = "deleteUser";
  private List<UpdateSystemAttributesCustomL2CpeSegmentDeleteUserRequestData> deleteUser;

  public static final String JSON_PROPERTY_SET_MAIN_OWNER = "setMainOwner";
  private UpdateSystemAttributesCustomL2CpeSegmentSetMainOwnerRequestData setMainOwner;

  public static final String JSON_PROPERTY_UPDATE_GROUP = "updateGroup";
  private List<UpdateSystemAttributesCustomL2CpeSegmentUpdateGroupRequestData> updateGroup;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private List<UpdateSystemAttributesCustomL2CpeSegmentUpdateUserRequestData> updateUser;

  public UpdateSystemAttributesCustomL2CpeSegmentRequestData() {
  }

  public UpdateSystemAttributesCustomL2CpeSegmentRequestData addGroup(List<UpdateSystemAttributesCustomL2CpeSegmentAddGroupRequestData> addGroup) {
    
    this.addGroup = addGroup;
    return this;
  }

  public UpdateSystemAttributesCustomL2CpeSegmentRequestData addAddGroupItem(UpdateSystemAttributesCustomL2CpeSegmentAddGroupRequestData addGroupItem) {
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

  public List<UpdateSystemAttributesCustomL2CpeSegmentAddGroupRequestData> getAddGroup() {
    return addGroup;
  }


  @JsonProperty(JSON_PROPERTY_ADD_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddGroup(List<UpdateSystemAttributesCustomL2CpeSegmentAddGroupRequestData> addGroup) {
    this.addGroup = addGroup;
  }


  public UpdateSystemAttributesCustomL2CpeSegmentRequestData addOwner(List<UpdateSystemAttributesCustomL2CpeSegmentAddOwnerRequestData> addOwner) {
    
    this.addOwner = addOwner;
    return this;
  }

  public UpdateSystemAttributesCustomL2CpeSegmentRequestData addAddOwnerItem(UpdateSystemAttributesCustomL2CpeSegmentAddOwnerRequestData addOwnerItem) {
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

  public List<UpdateSystemAttributesCustomL2CpeSegmentAddOwnerRequestData> getAddOwner() {
    return addOwner;
  }


  @JsonProperty(JSON_PROPERTY_ADD_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOwner(List<UpdateSystemAttributesCustomL2CpeSegmentAddOwnerRequestData> addOwner) {
    this.addOwner = addOwner;
  }


  public UpdateSystemAttributesCustomL2CpeSegmentRequestData addUser(List<UpdateSystemAttributesCustomL2CpeSegmentAddUserRequestData> addUser) {
    
    this.addUser = addUser;
    return this;
  }

  public UpdateSystemAttributesCustomL2CpeSegmentRequestData addAddUserItem(UpdateSystemAttributesCustomL2CpeSegmentAddUserRequestData addUserItem) {
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

  public List<UpdateSystemAttributesCustomL2CpeSegmentAddUserRequestData> getAddUser() {
    return addUser;
  }


  @JsonProperty(JSON_PROPERTY_ADD_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddUser(List<UpdateSystemAttributesCustomL2CpeSegmentAddUserRequestData> addUser) {
    this.addUser = addUser;
  }


  public UpdateSystemAttributesCustomL2CpeSegmentRequestData deleteGroup(List<UpdateSystemAttributesCustomL2CpeSegmentDeleteGroupRequestData> deleteGroup) {
    
    this.deleteGroup = deleteGroup;
    return this;
  }

  public UpdateSystemAttributesCustomL2CpeSegmentRequestData addDeleteGroupItem(UpdateSystemAttributesCustomL2CpeSegmentDeleteGroupRequestData deleteGroupItem) {
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

  public List<UpdateSystemAttributesCustomL2CpeSegmentDeleteGroupRequestData> getDeleteGroup() {
    return deleteGroup;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteGroup(List<UpdateSystemAttributesCustomL2CpeSegmentDeleteGroupRequestData> deleteGroup) {
    this.deleteGroup = deleteGroup;
  }


  public UpdateSystemAttributesCustomL2CpeSegmentRequestData deleteOwner(List<UpdateSystemAttributesCustomL2CpeSegmentDeleteOwnerRequestData> deleteOwner) {
    
    this.deleteOwner = deleteOwner;
    return this;
  }

  public UpdateSystemAttributesCustomL2CpeSegmentRequestData addDeleteOwnerItem(UpdateSystemAttributesCustomL2CpeSegmentDeleteOwnerRequestData deleteOwnerItem) {
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

  public List<UpdateSystemAttributesCustomL2CpeSegmentDeleteOwnerRequestData> getDeleteOwner() {
    return deleteOwner;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteOwner(List<UpdateSystemAttributesCustomL2CpeSegmentDeleteOwnerRequestData> deleteOwner) {
    this.deleteOwner = deleteOwner;
  }


  public UpdateSystemAttributesCustomL2CpeSegmentRequestData deleteUser(List<UpdateSystemAttributesCustomL2CpeSegmentDeleteUserRequestData> deleteUser) {
    
    this.deleteUser = deleteUser;
    return this;
  }

  public UpdateSystemAttributesCustomL2CpeSegmentRequestData addDeleteUserItem(UpdateSystemAttributesCustomL2CpeSegmentDeleteUserRequestData deleteUserItem) {
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

  public List<UpdateSystemAttributesCustomL2CpeSegmentDeleteUserRequestData> getDeleteUser() {
    return deleteUser;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteUser(List<UpdateSystemAttributesCustomL2CpeSegmentDeleteUserRequestData> deleteUser) {
    this.deleteUser = deleteUser;
  }


  public UpdateSystemAttributesCustomL2CpeSegmentRequestData setMainOwner(UpdateSystemAttributesCustomL2CpeSegmentSetMainOwnerRequestData setMainOwner) {
    
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

  public UpdateSystemAttributesCustomL2CpeSegmentSetMainOwnerRequestData getSetMainOwner() {
    return setMainOwner;
  }


  @JsonProperty(JSON_PROPERTY_SET_MAIN_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetMainOwner(UpdateSystemAttributesCustomL2CpeSegmentSetMainOwnerRequestData setMainOwner) {
    this.setMainOwner = setMainOwner;
  }


  public UpdateSystemAttributesCustomL2CpeSegmentRequestData updateGroup(List<UpdateSystemAttributesCustomL2CpeSegmentUpdateGroupRequestData> updateGroup) {
    
    this.updateGroup = updateGroup;
    return this;
  }

  public UpdateSystemAttributesCustomL2CpeSegmentRequestData addUpdateGroupItem(UpdateSystemAttributesCustomL2CpeSegmentUpdateGroupRequestData updateGroupItem) {
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

  public List<UpdateSystemAttributesCustomL2CpeSegmentUpdateGroupRequestData> getUpdateGroup() {
    return updateGroup;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateGroup(List<UpdateSystemAttributesCustomL2CpeSegmentUpdateGroupRequestData> updateGroup) {
    this.updateGroup = updateGroup;
  }


  public UpdateSystemAttributesCustomL2CpeSegmentRequestData updateUser(List<UpdateSystemAttributesCustomL2CpeSegmentUpdateUserRequestData> updateUser) {
    
    this.updateUser = updateUser;
    return this;
  }

  public UpdateSystemAttributesCustomL2CpeSegmentRequestData addUpdateUserItem(UpdateSystemAttributesCustomL2CpeSegmentUpdateUserRequestData updateUserItem) {
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

  public List<UpdateSystemAttributesCustomL2CpeSegmentUpdateUserRequestData> getUpdateUser() {
    return updateUser;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateUser(List<UpdateSystemAttributesCustomL2CpeSegmentUpdateUserRequestData> updateUser) {
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
    UpdateSystemAttributesCustomL2CpeSegmentRequestData updateSystemAttributesCustomL2CpeSegmentRequestData = (UpdateSystemAttributesCustomL2CpeSegmentRequestData) o;
    return Objects.equals(this.addGroup, updateSystemAttributesCustomL2CpeSegmentRequestData.addGroup) &&
        Objects.equals(this.addOwner, updateSystemAttributesCustomL2CpeSegmentRequestData.addOwner) &&
        Objects.equals(this.addUser, updateSystemAttributesCustomL2CpeSegmentRequestData.addUser) &&
        Objects.equals(this.deleteGroup, updateSystemAttributesCustomL2CpeSegmentRequestData.deleteGroup) &&
        Objects.equals(this.deleteOwner, updateSystemAttributesCustomL2CpeSegmentRequestData.deleteOwner) &&
        Objects.equals(this.deleteUser, updateSystemAttributesCustomL2CpeSegmentRequestData.deleteUser) &&
        Objects.equals(this.setMainOwner, updateSystemAttributesCustomL2CpeSegmentRequestData.setMainOwner) &&
        Objects.equals(this.updateGroup, updateSystemAttributesCustomL2CpeSegmentRequestData.updateGroup) &&
        Objects.equals(this.updateUser, updateSystemAttributesCustomL2CpeSegmentRequestData.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addGroup, addOwner, addUser, deleteGroup, deleteOwner, deleteUser, setMainOwner, updateGroup, updateUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSystemAttributesCustomL2CpeSegmentRequestData {\n");
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
