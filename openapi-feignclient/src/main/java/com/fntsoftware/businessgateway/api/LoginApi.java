package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeMandatorLoginRequestData;
import com.fntsoftware.businessgateway.entities.ChangeMandatorLoginResponse;
import com.fntsoftware.businessgateway.entities.ForeignLoginLoginRequestData;
import com.fntsoftware.businessgateway.entities.ForeignLoginLoginResponse;
import com.fntsoftware.businessgateway.entities.LoginGetActiveMandatorRequest;
import com.fntsoftware.businessgateway.entities.LoginGetActiveMandatorResponse;
import com.fntsoftware.businessgateway.entities.LoginGetMandatorsAndUserGroupsRequest;
import com.fntsoftware.businessgateway.entities.LoginGetMandatorsAndUserGroupsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface LoginApi extends ApiClient.Api {


  /**
   * Change mandator / group
   * Modifies the active mandator
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ChangeMandatorLoginResponse
   */
  @RequestLine("POST /api/rest/entity/login/changeMandator?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeMandatorLoginResponse changeMandatorLogin(@Param("sessionId") String sessionId, ChangeMandatorLoginRequestData body);

  /**
   * Change mandator / group
   * Similar to <code>changeMandatorLogin</code> but it also returns the http response headers .
   * Modifies the active mandator
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/login/changeMandator?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeMandatorLoginResponse> changeMandatorLoginWithHttpInfo(@Param("sessionId") String sessionId, ChangeMandatorLoginRequestData body);


  /**
   * Change mandator / group
   * Modifies the active mandator
   * Note, this is equivalent to the other <code>changeMandatorLogin</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeMandatorLoginQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeMandatorLoginResponse
   */
  @RequestLine("POST /api/rest/entity/login/changeMandator?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeMandatorLoginResponse changeMandatorLogin(ChangeMandatorLoginRequestData body, @QueryMap(encoded=true) ChangeMandatorLoginQueryParams queryParams);

  /**
  * Change mandator / group
  * Modifies the active mandator
  * Note, this is equivalent to the other <code>changeMandatorLogin</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeMandatorLoginResponse
      */
      @RequestLine("POST /api/rest/entity/login/changeMandator?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeMandatorLoginResponse> changeMandatorLoginWithHttpInfo(ChangeMandatorLoginRequestData body, @QueryMap(encoded=true) ChangeMandatorLoginQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeMandatorLogin</code> method in a fluent style.
   */
  public static class ChangeMandatorLoginQueryParams extends HashMap<String, Object> {
    public ChangeMandatorLoginQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Foreign login
   * Allows you to create a session for an arbitrary user using a technical user.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ForeignLoginLoginResponse
   */
  @RequestLine("POST /api/rest/entity/login/foreignLogin?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ForeignLoginLoginResponse foreignLoginLogin(@Param("sessionId") String sessionId, ForeignLoginLoginRequestData body);

  /**
   * Foreign login
   * Similar to <code>foreignLoginLogin</code> but it also returns the http response headers .
   * Allows you to create a session for an arbitrary user using a technical user.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/login/foreignLogin?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ForeignLoginLoginResponse> foreignLoginLoginWithHttpInfo(@Param("sessionId") String sessionId, ForeignLoginLoginRequestData body);


  /**
   * Foreign login
   * Allows you to create a session for an arbitrary user using a technical user.
   * Note, this is equivalent to the other <code>foreignLoginLogin</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ForeignLoginLoginQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ForeignLoginLoginResponse
   */
  @RequestLine("POST /api/rest/entity/login/foreignLogin?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ForeignLoginLoginResponse foreignLoginLogin(ForeignLoginLoginRequestData body, @QueryMap(encoded=true) ForeignLoginLoginQueryParams queryParams);

  /**
  * Foreign login
  * Allows you to create a session for an arbitrary user using a technical user.
  * Note, this is equivalent to the other <code>foreignLoginLogin</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ForeignLoginLoginResponse
      */
      @RequestLine("POST /api/rest/entity/login/foreignLogin?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ForeignLoginLoginResponse> foreignLoginLoginWithHttpInfo(ForeignLoginLoginRequestData body, @QueryMap(encoded=true) ForeignLoginLoginQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>foreignLoginLogin</code> method in a fluent style.
   */
  public static class ForeignLoginLoginQueryParams extends HashMap<String, Object> {
    public ForeignLoginLoginQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Active mandator and user / group
   * Queries the active mandator and the user / group
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return LoginGetActiveMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/login/getActiveMandator?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LoginGetActiveMandatorResponse loginGetActiveMandator(@Param("sessionId") String sessionId, LoginGetActiveMandatorRequest body);

  /**
   * Active mandator and user / group
   * Similar to <code>loginGetActiveMandator</code> but it also returns the http response headers .
   * Queries the active mandator and the user / group
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/login/getActiveMandator?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LoginGetActiveMandatorResponse> loginGetActiveMandatorWithHttpInfo(@Param("sessionId") String sessionId, LoginGetActiveMandatorRequest body);


  /**
   * Active mandator and user / group
   * Queries the active mandator and the user / group
   * Note, this is equivalent to the other <code>loginGetActiveMandator</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LoginGetActiveMandatorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LoginGetActiveMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/login/getActiveMandator?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LoginGetActiveMandatorResponse loginGetActiveMandator(LoginGetActiveMandatorRequest body, @QueryMap(encoded=true) LoginGetActiveMandatorQueryParams queryParams);

  /**
  * Active mandator and user / group
  * Queries the active mandator and the user / group
  * Note, this is equivalent to the other <code>loginGetActiveMandator</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LoginGetActiveMandatorResponse
      */
      @RequestLine("POST /api/rest/entity/login/getActiveMandator?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LoginGetActiveMandatorResponse> loginGetActiveMandatorWithHttpInfo(LoginGetActiveMandatorRequest body, @QueryMap(encoded=true) LoginGetActiveMandatorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>loginGetActiveMandator</code> method in a fluent style.
   */
  public static class LoginGetActiveMandatorQueryParams extends HashMap<String, Object> {
    public LoginGetActiveMandatorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Mandators, users and groups
   * Queries all possible mandators and their users / groups
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return LoginGetMandatorsAndUserGroupsResponse
   */
  @RequestLine("POST /api/rest/entity/login/getMandatorsAndUserGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LoginGetMandatorsAndUserGroupsResponse loginGetMandatorsAndUserGroups(@Param("sessionId") String sessionId, LoginGetMandatorsAndUserGroupsRequest body);

  /**
   * Mandators, users and groups
   * Similar to <code>loginGetMandatorsAndUserGroups</code> but it also returns the http response headers .
   * Queries all possible mandators and their users / groups
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/login/getMandatorsAndUserGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LoginGetMandatorsAndUserGroupsResponse> loginGetMandatorsAndUserGroupsWithHttpInfo(@Param("sessionId") String sessionId, LoginGetMandatorsAndUserGroupsRequest body);


  /**
   * Mandators, users and groups
   * Queries all possible mandators and their users / groups
   * Note, this is equivalent to the other <code>loginGetMandatorsAndUserGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LoginGetMandatorsAndUserGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LoginGetMandatorsAndUserGroupsResponse
   */
  @RequestLine("POST /api/rest/entity/login/getMandatorsAndUserGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LoginGetMandatorsAndUserGroupsResponse loginGetMandatorsAndUserGroups(LoginGetMandatorsAndUserGroupsRequest body, @QueryMap(encoded=true) LoginGetMandatorsAndUserGroupsQueryParams queryParams);

  /**
  * Mandators, users and groups
  * Queries all possible mandators and their users / groups
  * Note, this is equivalent to the other <code>loginGetMandatorsAndUserGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LoginGetMandatorsAndUserGroupsResponse
      */
      @RequestLine("POST /api/rest/entity/login/getMandatorsAndUserGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LoginGetMandatorsAndUserGroupsResponse> loginGetMandatorsAndUserGroupsWithHttpInfo(LoginGetMandatorsAndUserGroupsRequest body, @QueryMap(encoded=true) LoginGetMandatorsAndUserGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>loginGetMandatorsAndUserGroups</code> method in a fluent style.
   */
  public static class LoginGetMandatorsAndUserGroupsQueryParams extends HashMap<String, Object> {
    public LoginGetMandatorsAndUserGroupsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
