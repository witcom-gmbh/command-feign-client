package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.SessionApplicationPermissionsRequest;
import com.fntsoftware.businessgateway.entities.SessionApplicationPermissionsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface SessionApi extends ApiClient.Api {


  /**
   * Query Application authorizations
   * Returns application authorizations for the user logged in to the current session. The result is restricted by the specified list of privilege names.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SessionApplicationPermissionsResponse
   */
  @RequestLine("POST /api/rest/entity/session/applicationPermissions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SessionApplicationPermissionsResponse sessionApplicationPermissions(@Param("sessionId") String sessionId, SessionApplicationPermissionsRequest body);

  /**
   * Query Application authorizations
   * Similar to <code>sessionApplicationPermissions</code> but it also returns the http response headers .
   * Returns application authorizations for the user logged in to the current session. The result is restricted by the specified list of privilege names.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/session/applicationPermissions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SessionApplicationPermissionsResponse> sessionApplicationPermissionsWithHttpInfo(@Param("sessionId") String sessionId, SessionApplicationPermissionsRequest body);


  /**
   * Query Application authorizations
   * Returns application authorizations for the user logged in to the current session. The result is restricted by the specified list of privilege names.
   * Note, this is equivalent to the other <code>sessionApplicationPermissions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SessionApplicationPermissionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SessionApplicationPermissionsResponse
   */
  @RequestLine("POST /api/rest/entity/session/applicationPermissions?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SessionApplicationPermissionsResponse sessionApplicationPermissions(SessionApplicationPermissionsRequest body, @QueryMap(encoded=true) SessionApplicationPermissionsQueryParams queryParams);

  /**
  * Query Application authorizations
  * Returns application authorizations for the user logged in to the current session. The result is restricted by the specified list of privilege names.
  * Note, this is equivalent to the other <code>sessionApplicationPermissions</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SessionApplicationPermissionsResponse
      */
      @RequestLine("POST /api/rest/entity/session/applicationPermissions?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SessionApplicationPermissionsResponse> sessionApplicationPermissionsWithHttpInfo(SessionApplicationPermissionsRequest body, @QueryMap(encoded=true) SessionApplicationPermissionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sessionApplicationPermissions</code> method in a fluent style.
   */
  public static class SessionApplicationPermissionsQueryParams extends HashMap<String, Object> {
    public SessionApplicationPermissionsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
