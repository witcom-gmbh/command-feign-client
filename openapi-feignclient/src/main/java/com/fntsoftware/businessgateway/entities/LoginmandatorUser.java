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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * LoginmandatorUser
 */
@JsonPropertyOrder({
  LoginmandatorUser.JSON_PROPERTY_USER_ELID,
  LoginmandatorUser.JSON_PROPERTY_USER_NAME
})
@JsonTypeName("loginmandatorUser")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public class LoginmandatorUser {
  public static final String JSON_PROPERTY_USER_ELID = "userElid";
  private String userElid;

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public LoginmandatorUser() {
  }

  public LoginmandatorUser userElid(String userElid) {
    
    this.userElid = userElid;
    return this;
  }

   /**
   * Get userElid
   * @return userElid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserElid() {
    return userElid;
  }


  @JsonProperty(JSON_PROPERTY_USER_ELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserElid(String userElid) {
    this.userElid = userElid;
  }


  public LoginmandatorUser userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginmandatorUser loginmandatorUser = (LoginmandatorUser) o;
    return Objects.equals(this.userElid, loginmandatorUser.userElid) &&
        Objects.equals(this.userName, loginmandatorUser.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userElid, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginmandatorUser {\n");
    sb.append("    userElid: ").append(toIndentedString(userElid)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
