package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateUserGroupRequestData;
import com.fntsoftware.businessgateway.entities.CreateUserGroupResponse;
import com.fntsoftware.businessgateway.entities.DeleteUserGroupRequestData;
import com.fntsoftware.businessgateway.entities.DeleteUserGroupResponse;
import com.fntsoftware.businessgateway.entities.UpdateUserGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateUserGroupResponse;
import com.fntsoftware.businessgateway.entities.UserGroupMandatorsRequest;
import com.fntsoftware.businessgateway.entities.UserGroupMandatorsResponse;
import com.fntsoftware.businessgateway.entities.UserGroupQueryRequest;
import com.fntsoftware.businessgateway.entities.UserGroupQueryResponse;
import com.fntsoftware.businessgateway.entities.UserGroupRolesRequest;
import com.fntsoftware.businessgateway.entities.UserGroupRolesResponse;
import com.fntsoftware.businessgateway.entities.UserGroupUsersRequest;
import com.fntsoftware.businessgateway.entities.UserGroupUsersResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface UserGroupApi extends ApiClient.Api {


  /**
   * Create
   * Create User group
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateUserGroupResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateUserGroupResponse createUserGroup(@Param("sessionId") String sessionId, CreateUserGroupRequestData body);

  /**
   * Create
   * Similar to <code>createUserGroup</code> but it also returns the http response headers .
   * Create User group
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/userGroup/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateUserGroupResponse> createUserGroupWithHttpInfo(@Param("sessionId") String sessionId, CreateUserGroupRequestData body);


  /**
   * Create
   * Create User group
   * Note, this is equivalent to the other <code>createUserGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateUserGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateUserGroupResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateUserGroupResponse createUserGroup(CreateUserGroupRequestData body, @QueryMap(encoded=true) CreateUserGroupQueryParams queryParams);

  /**
  * Create
  * Create User group
  * Note, this is equivalent to the other <code>createUserGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateUserGroupResponse
      */
      @RequestLine("POST /api/rest/entity/userGroup/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateUserGroupResponse> createUserGroupWithHttpInfo(CreateUserGroupRequestData body, @QueryMap(encoded=true) CreateUserGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createUserGroup</code> method in a fluent style.
   */
  public static class CreateUserGroupQueryParams extends HashMap<String, Object> {
    public CreateUserGroupQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete User group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteUserGroupResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteUserGroupResponse deleteUserGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteUserGroupRequestData body);

  /**
   * Delete
   * Similar to <code>deleteUserGroup</code> but it also returns the http response headers .
   * Delete User group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteUserGroupResponse> deleteUserGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteUserGroupRequestData body);


  /**
   * Delete
   * Delete User group
   * Note, this is equivalent to the other <code>deleteUserGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteUserGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteUserGroupResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteUserGroupResponse deleteUserGroup(@Param("elid") String elid, DeleteUserGroupRequestData body, @QueryMap(encoded=true) DeleteUserGroupQueryParams queryParams);

  /**
  * Delete
  * Delete User group
  * Note, this is equivalent to the other <code>deleteUserGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteUserGroupResponse
      */
      @RequestLine("POST /api/rest/entity/userGroup/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteUserGroupResponse> deleteUserGroupWithHttpInfo(@Param("elid") String elid, DeleteUserGroupRequestData body, @QueryMap(encoded=true) DeleteUserGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteUserGroup</code> method in a fluent style.
   */
  public static class DeleteUserGroupQueryParams extends HashMap<String, Object> {
    public DeleteUserGroupQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify User group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateUserGroupResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateUserGroupResponse updateUserGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateUserGroupRequestData body);

  /**
   * Modify
   * Similar to <code>updateUserGroup</code> but it also returns the http response headers .
   * Modify User group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateUserGroupResponse> updateUserGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateUserGroupRequestData body);


  /**
   * Modify
   * Modify User group
   * Note, this is equivalent to the other <code>updateUserGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateUserGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateUserGroupResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateUserGroupResponse updateUserGroup(@Param("elid") String elid, UpdateUserGroupRequestData body, @QueryMap(encoded=true) UpdateUserGroupQueryParams queryParams);

  /**
  * Modify
  * Modify User group
  * Note, this is equivalent to the other <code>updateUserGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateUserGroupResponse
      */
      @RequestLine("POST /api/rest/entity/userGroup/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateUserGroupResponse> updateUserGroupWithHttpInfo(@Param("elid") String elid, UpdateUserGroupRequestData body, @QueryMap(encoded=true) UpdateUserGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateUserGroup</code> method in a fluent style.
   */
  public static class UpdateUserGroupQueryParams extends HashMap<String, Object> {
    public UpdateUserGroupQueryParams sessionId(final String value) {
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
   * @return UserGroupMandatorsResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/Mandators?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserGroupMandatorsResponse userGroupMandators(@Param("sessionId") String sessionId, @Param("elid") String elid, UserGroupMandatorsRequest body);

  /**
   * Mandators
   * Similar to <code>userGroupMandators</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/Mandators?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserGroupMandatorsResponse> userGroupMandatorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UserGroupMandatorsRequest body);


  /**
   * Mandators
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>userGroupMandators</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UserGroupMandatorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UserGroupMandatorsResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/Mandators?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UserGroupMandatorsResponse userGroupMandators(@Param("elid") String elid, UserGroupMandatorsRequest body, @QueryMap(encoded=true) UserGroupMandatorsQueryParams queryParams);

  /**
  * Mandators
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>userGroupMandators</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UserGroupMandatorsResponse
      */
      @RequestLine("POST /api/rest/entity/userGroup/{elid}/Mandators?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UserGroupMandatorsResponse> userGroupMandatorsWithHttpInfo(@Param("elid") String elid, UserGroupMandatorsRequest body, @QueryMap(encoded=true) UserGroupMandatorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>userGroupMandators</code> method in a fluent style.
   */
  public static class UserGroupMandatorsQueryParams extends HashMap<String, Object> {
    public UserGroupMandatorsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return UserGroupQueryResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserGroupQueryResponse userGroupQuery(@Param("sessionId") String sessionId, UserGroupQueryRequest body);

  /**
   * Basic query
   * Similar to <code>userGroupQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/userGroup/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserGroupQueryResponse> userGroupQueryWithHttpInfo(@Param("sessionId") String sessionId, UserGroupQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>userGroupQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UserGroupQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UserGroupQueryResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UserGroupQueryResponse userGroupQuery(UserGroupQueryRequest body, @QueryMap(encoded=true) UserGroupQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>userGroupQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UserGroupQueryResponse
      */
      @RequestLine("POST /api/rest/entity/userGroup/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UserGroupQueryResponse> userGroupQueryWithHttpInfo(UserGroupQueryRequest body, @QueryMap(encoded=true) UserGroupQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>userGroupQuery</code> method in a fluent style.
   */
  public static class UserGroupQueryQueryParams extends HashMap<String, Object> {
    public UserGroupQueryQueryParams sessionId(final String value) {
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
   * @return UserGroupRolesResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/Roles?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserGroupRolesResponse userGroupRoles(@Param("sessionId") String sessionId, @Param("elid") String elid, UserGroupRolesRequest body);

  /**
   * Roles
   * Similar to <code>userGroupRoles</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/Roles?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserGroupRolesResponse> userGroupRolesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UserGroupRolesRequest body);


  /**
   * Roles
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>userGroupRoles</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UserGroupRolesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UserGroupRolesResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/Roles?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UserGroupRolesResponse userGroupRoles(@Param("elid") String elid, UserGroupRolesRequest body, @QueryMap(encoded=true) UserGroupRolesQueryParams queryParams);

  /**
  * Roles
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>userGroupRoles</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UserGroupRolesResponse
      */
      @RequestLine("POST /api/rest/entity/userGroup/{elid}/Roles?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UserGroupRolesResponse> userGroupRolesWithHttpInfo(@Param("elid") String elid, UserGroupRolesRequest body, @QueryMap(encoded=true) UserGroupRolesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>userGroupRoles</code> method in a fluent style.
   */
  public static class UserGroupRolesQueryParams extends HashMap<String, Object> {
    public UserGroupRolesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Users
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UserGroupUsersResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/Users?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UserGroupUsersResponse userGroupUsers(@Param("sessionId") String sessionId, @Param("elid") String elid, UserGroupUsersRequest body);

  /**
   * Users
   * Similar to <code>userGroupUsers</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/Users?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UserGroupUsersResponse> userGroupUsersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UserGroupUsersRequest body);


  /**
   * Users
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>userGroupUsers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UserGroupUsersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UserGroupUsersResponse
   */
  @RequestLine("POST /api/rest/entity/userGroup/{elid}/Users?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UserGroupUsersResponse userGroupUsers(@Param("elid") String elid, UserGroupUsersRequest body, @QueryMap(encoded=true) UserGroupUsersQueryParams queryParams);

  /**
  * Users
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>userGroupUsers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UserGroupUsersResponse
      */
      @RequestLine("POST /api/rest/entity/userGroup/{elid}/Users?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UserGroupUsersResponse> userGroupUsersWithHttpInfo(@Param("elid") String elid, UserGroupUsersRequest body, @QueryMap(encoded=true) UserGroupUsersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>userGroupUsers</code> method in a fluent style.
   */
  public static class UserGroupUsersQueryParams extends HashMap<String, Object> {
    public UserGroupUsersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
