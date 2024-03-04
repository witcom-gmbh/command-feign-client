package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangePasswordUserRequestData;
import com.fntsoftware.businessgateway.entities.ChangePasswordUserResponse;
import com.fntsoftware.businessgateway.entities.CreateUserRequestData;
import com.fntsoftware.businessgateway.entities.CreateUserResponse;
import com.fntsoftware.businessgateway.entities.DeleteUserRequestData;
import com.fntsoftware.businessgateway.entities.DeleteUserResponse;
import com.fntsoftware.businessgateway.entities.ResetPasswordUserRequestData;
import com.fntsoftware.businessgateway.entities.ResetPasswordUserResponse;
import com.fntsoftware.businessgateway.entities.UpdateUserRequestData;
import com.fntsoftware.businessgateway.entities.UpdateUserResponse;
import com.fntsoftware.businessgateway.entities.UserMandatorsRequest;
import com.fntsoftware.businessgateway.entities.UserMandatorsResponse;
import com.fntsoftware.businessgateway.entities.UserPersonRequestData;
import com.fntsoftware.businessgateway.entities.UserPersonResponseData;
import com.fntsoftware.businessgateway.entities.UserQueryRequest;
import com.fntsoftware.businessgateway.entities.UserQueryResponse;
import com.fntsoftware.businessgateway.entities.UserRolesRequest;
import com.fntsoftware.businessgateway.entities.UserRolesResponse;
import com.fntsoftware.businessgateway.entities.UserUserGroupsRequest;
import com.fntsoftware.businessgateway.entities.UserUserGroupsResponse;
import com.fntsoftware.businessgateway.entities.UserUserRequest;
import com.fntsoftware.businessgateway.entities.UserUserResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface UserApi extends ApiClient.Api {


  /**
   * Change password
   * Modifies the user password. The old password is required for authentication.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangePasswordUserResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/changePassword?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangePasswordUserResponse changePasswordUser(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangePasswordUserRequestData body);

  /**
   * Change password
   * Similar to <code>changePasswordUser</code> but it also returns the http response headers .
   * Modifies the user password. The old password is required for authentication.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/changePassword?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangePasswordUserResponse> changePasswordUserWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangePasswordUserRequestData body);


  /**
   * Change password
   * Modifies the user password. The old password is required for authentication.
   * Note, this is equivalent to the other <code>changePasswordUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangePasswordUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangePasswordUserResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/changePassword?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangePasswordUserResponse changePasswordUser(@Param("elid") String elid, ChangePasswordUserRequestData body, @QueryMap(encoded=true) ChangePasswordUserQueryParams queryParams);

  /**
  * Change password
  * Modifies the user password. The old password is required for authentication.
  * Note, this is equivalent to the other <code>changePasswordUser</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangePasswordUserResponse
      */
      @RequestLine("POST /api/rest/entity/user/{elid}/changePassword?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangePasswordUserResponse> changePasswordUserWithHttpInfo(@Param("elid") String elid, ChangePasswordUserRequestData body, @QueryMap(encoded=true) ChangePasswordUserQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changePasswordUser</code> method in a fluent style.
   */
  public static class ChangePasswordUserQueryParams extends HashMap<String, Object> {
    public ChangePasswordUserQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create User
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateUserResponse
   */
  @RequestLine("POST /api/rest/entity/user/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateUserResponse createUser(@Param("sessionId") String sessionId, CreateUserRequestData body);

  /**
   * Create
   * Similar to <code>createUser</code> but it also returns the http response headers .
   * Create User
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/user/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateUserResponse> createUserWithHttpInfo(@Param("sessionId") String sessionId, CreateUserRequestData body);


  /**
   * Create
   * Create User
   * Note, this is equivalent to the other <code>createUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateUserResponse
   */
  @RequestLine("POST /api/rest/entity/user/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateUserResponse createUser(CreateUserRequestData body, @QueryMap(encoded=true) CreateUserQueryParams queryParams);

  /**
  * Create
  * Create User
  * Note, this is equivalent to the other <code>createUser</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateUserResponse
      */
      @RequestLine("POST /api/rest/entity/user/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateUserResponse> createUserWithHttpInfo(CreateUserRequestData body, @QueryMap(encoded=true) CreateUserQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createUser</code> method in a fluent style.
   */
  public static class CreateUserQueryParams extends HashMap<String, Object> {
    public CreateUserQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete User
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteUserResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteUserResponse deleteUser(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteUserRequestData body);

  /**
   * Delete
   * Similar to <code>deleteUser</code> but it also returns the http response headers .
   * Delete User
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteUserResponse> deleteUserWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteUserRequestData body);


  /**
   * Delete
   * Delete User
   * Note, this is equivalent to the other <code>deleteUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteUserResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteUserResponse deleteUser(@Param("elid") String elid, DeleteUserRequestData body, @QueryMap(encoded=true) DeleteUserQueryParams queryParams);

  /**
  * Delete
  * Delete User
  * Note, this is equivalent to the other <code>deleteUser</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteUserResponse
      */
      @RequestLine("POST /api/rest/entity/user/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteUserResponse> deleteUserWithHttpInfo(@Param("elid") String elid, DeleteUserRequestData body, @QueryMap(encoded=true) DeleteUserQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteUser</code> method in a fluent style.
   */
  public static class DeleteUserQueryParams extends HashMap<String, Object> {
    public DeleteUserQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reset user password
   * Resets the password for a user. Administrator rights are required.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ResetPasswordUserResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/resetPassword?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ResetPasswordUserResponse resetPasswordUser(@Param("sessionId") String sessionId, @Param("elid") String elid, ResetPasswordUserRequestData body);

  /**
   * Reset user password
   * Similar to <code>resetPasswordUser</code> but it also returns the http response headers .
   * Resets the password for a user. Administrator rights are required.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/resetPassword?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ResetPasswordUserResponse> resetPasswordUserWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ResetPasswordUserRequestData body);


  /**
   * Reset user password
   * Resets the password for a user. Administrator rights are required.
   * Note, this is equivalent to the other <code>resetPasswordUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ResetPasswordUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ResetPasswordUserResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/resetPassword?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ResetPasswordUserResponse resetPasswordUser(@Param("elid") String elid, ResetPasswordUserRequestData body, @QueryMap(encoded=true) ResetPasswordUserQueryParams queryParams);

  /**
  * Reset user password
  * Resets the password for a user. Administrator rights are required.
  * Note, this is equivalent to the other <code>resetPasswordUser</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ResetPasswordUserResponse
      */
      @RequestLine("POST /api/rest/entity/user/{elid}/resetPassword?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ResetPasswordUserResponse> resetPasswordUserWithHttpInfo(@Param("elid") String elid, ResetPasswordUserRequestData body, @QueryMap(encoded=true) ResetPasswordUserQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>resetPasswordUser</code> method in a fluent style.
   */
  public static class ResetPasswordUserQueryParams extends HashMap<String, Object> {
    public ResetPasswordUserQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify User
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateUserResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateUserResponse updateUser(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateUserRequestData body);

  /**
   * Modify
   * Similar to <code>updateUser</code> but it also returns the http response headers .
   * Modify User
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateUserResponse> updateUserWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateUserRequestData body);


  /**
   * Modify
   * Modify User
   * Note, this is equivalent to the other <code>updateUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateUserResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateUserResponse updateUser(@Param("elid") String elid, UpdateUserRequestData body, @QueryMap(encoded=true) UpdateUserQueryParams queryParams);

  /**
  * Modify
  * Modify User
  * Note, this is equivalent to the other <code>updateUser</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateUserResponse
      */
      @RequestLine("POST /api/rest/entity/user/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateUserResponse> updateUserWithHttpInfo(@Param("elid") String elid, UpdateUserRequestData body, @QueryMap(encoded=true) UpdateUserQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateUser</code> method in a fluent style.
   */
  public static class UpdateUserQueryParams extends HashMap<String, Object> {
    public UpdateUserQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Mandators
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UserMandatorsResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/Mandators?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserMandatorsResponse userMandators(@Param("sessionId") String sessionId, @Param("elid") String elid, UserMandatorsRequest body);

  /**
   * Mandators
   * Similar to <code>userMandators</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/Mandators?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserMandatorsResponse> userMandatorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UserMandatorsRequest body);


  /**
   * Mandators
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>userMandators</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UserMandatorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UserMandatorsResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/Mandators?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UserMandatorsResponse userMandators(@Param("elid") String elid, UserMandatorsRequest body, @QueryMap(encoded=true) UserMandatorsQueryParams queryParams);

  /**
  * Mandators
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>userMandators</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UserMandatorsResponse
      */
      @RequestLine("POST /api/rest/entity/user/{elid}/Mandators?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UserMandatorsResponse> userMandatorsWithHttpInfo(@Param("elid") String elid, UserMandatorsRequest body, @QueryMap(encoded=true) UserMandatorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>userMandators</code> method in a fluent style.
   */
  public static class UserMandatorsQueryParams extends HashMap<String, Object> {
    public UserMandatorsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Person entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UserPersonResponseData
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/Person?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserPersonResponseData userPerson(@Param("sessionId") String sessionId, @Param("elid") String elid, UserPersonRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>userPerson</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/Person?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserPersonResponseData> userPersonWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UserPersonRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>userPerson</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UserPersonQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UserPersonResponseData
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/Person?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UserPersonResponseData userPerson(@Param("elid") String elid, UserPersonRequestData body, @QueryMap(encoded=true) UserPersonQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>userPerson</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UserPersonResponseData
      */
      @RequestLine("POST /api/rest/entity/user/{elid}/Person?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UserPersonResponseData> userPersonWithHttpInfo(@Param("elid") String elid, UserPersonRequestData body, @QueryMap(encoded=true) UserPersonQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>userPerson</code> method in a fluent style.
   */
  public static class UserPersonQueryParams extends HashMap<String, Object> {
    public UserPersonQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return UserQueryResponse
   */
  @RequestLine("POST /api/rest/entity/user/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserQueryResponse userQuery(@Param("sessionId") String sessionId, UserQueryRequest body);

  /**
   * Basic query
   * Similar to <code>userQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/user/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserQueryResponse> userQueryWithHttpInfo(@Param("sessionId") String sessionId, UserQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>userQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UserQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UserQueryResponse
   */
  @RequestLine("POST /api/rest/entity/user/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UserQueryResponse userQuery(UserQueryRequest body, @QueryMap(encoded=true) UserQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>userQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UserQueryResponse
      */
      @RequestLine("POST /api/rest/entity/user/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UserQueryResponse> userQueryWithHttpInfo(UserQueryRequest body, @QueryMap(encoded=true) UserQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>userQuery</code> method in a fluent style.
   */
  public static class UserQueryQueryParams extends HashMap<String, Object> {
    public UserQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Roles
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UserRolesResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/Roles?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserRolesResponse userRoles(@Param("sessionId") String sessionId, @Param("elid") String elid, UserRolesRequest body);

  /**
   * Roles
   * Similar to <code>userRoles</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/Roles?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserRolesResponse> userRolesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UserRolesRequest body);


  /**
   * Roles
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>userRoles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UserRolesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UserRolesResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/Roles?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UserRolesResponse userRoles(@Param("elid") String elid, UserRolesRequest body, @QueryMap(encoded=true) UserRolesQueryParams queryParams);

  /**
  * Roles
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>userRoles</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UserRolesResponse
      */
      @RequestLine("POST /api/rest/entity/user/{elid}/Roles?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UserRolesResponse> userRolesWithHttpInfo(@Param("elid") String elid, UserRolesRequest body, @QueryMap(encoded=true) UserRolesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>userRoles</code> method in a fluent style.
   */
  public static class UserRolesQueryParams extends HashMap<String, Object> {
    public UserRolesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query User
   * Query of the User basic data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UserUserResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserUserResponse userUser(@Param("sessionId") String sessionId, @Param("elid") String elid, UserUserRequest body);

  /**
   * Query User
   * Similar to <code>userUser</code> but it also returns the http response headers .
   * Query of the User basic data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/user/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserUserResponse> userUserWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UserUserRequest body);


  /**
   * Query User
   * Query of the User basic data
   * Note, this is equivalent to the other <code>userUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UserUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UserUserResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UserUserResponse userUser(@Param("elid") String elid, UserUserRequest body, @QueryMap(encoded=true) UserUserQueryParams queryParams);

  /**
  * Query User
  * Query of the User basic data
  * Note, this is equivalent to the other <code>userUser</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UserUserResponse
      */
      @RequestLine("POST /api/rest/entity/user/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UserUserResponse> userUserWithHttpInfo(@Param("elid") String elid, UserUserRequest body, @QueryMap(encoded=true) UserUserQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>userUser</code> method in a fluent style.
   */
  public static class UserUserQueryParams extends HashMap<String, Object> {
    public UserUserQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Groups
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UserUserGroupsResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/UserGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserUserGroupsResponse userUserGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, UserUserGroupsRequest body);

  /**
   * Groups
   * Similar to <code>userUserGroups</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/UserGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserUserGroupsResponse> userUserGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UserUserGroupsRequest body);


  /**
   * Groups
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>userUserGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UserUserGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UserUserGroupsResponse
   */
  @RequestLine("POST /api/rest/entity/user/{elid}/UserGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UserUserGroupsResponse userUserGroups(@Param("elid") String elid, UserUserGroupsRequest body, @QueryMap(encoded=true) UserUserGroupsQueryParams queryParams);

  /**
  * Groups
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>userUserGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UserUserGroupsResponse
      */
      @RequestLine("POST /api/rest/entity/user/{elid}/UserGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UserUserGroupsResponse> userUserGroupsWithHttpInfo(@Param("elid") String elid, UserUserGroupsRequest body, @QueryMap(encoded=true) UserUserGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>userUserGroups</code> method in a fluent style.
   */
  public static class UserUserGroupsQueryParams extends HashMap<String, Object> {
    public UserUserGroupsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
