/*
 * Swagger for Command BGE
 * Swagger API for FNT Command Business Gateway
 *
 * The version of the OpenAPI document: 20240131102312
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * LoginRequest
 */
@JsonPropertyOrder({
  LoginRequest.JSON_PROPERTY_PASSWORD,
  LoginRequest.JSON_PROPERTY_USER_GROUP_NAME,
  LoginRequest.JSON_PROPERTY_MAN_ID,
  LoginRequest.JSON_PROPERTY_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:00:24.721128812Z[Etc/UTC]")
public class LoginRequest {
  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_USER_GROUP_NAME = "userGroupName";
  private String userGroupName;

  public static final String JSON_PROPERTY_MAN_ID = "manId";
  private String manId;

  public static final String JSON_PROPERTY_USER = "user";
  private String user;

  public LoginRequest() {
  }

  public LoginRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public LoginRequest userGroupName(String userGroupName) {
    
    this.userGroupName = userGroupName;
    return this;
  }

   /**
   * Get userGroupName
   * @return userGroupName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserGroupName() {
    return userGroupName;
  }


  @JsonProperty(JSON_PROPERTY_USER_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserGroupName(String userGroupName) {
    this.userGroupName = userGroupName;
  }


  public LoginRequest manId(String manId) {
    
    this.manId = manId;
    return this;
  }

   /**
   * Get manId
   * @return manId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManId() {
    return manId;
  }


  @JsonProperty(JSON_PROPERTY_MAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManId(String manId) {
    this.manId = manId;
  }


  public LoginRequest user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginRequest loginRequest = (LoginRequest) o;
    return Objects.equals(this.password, loginRequest.password) &&
        Objects.equals(this.userGroupName, loginRequest.userGroupName) &&
        Objects.equals(this.manId, loginRequest.manId) &&
        Objects.equals(this.user, loginRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, userGroupName, manId, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginRequest {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
    sb.append("    manId: ").append(toIndentedString(manId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
