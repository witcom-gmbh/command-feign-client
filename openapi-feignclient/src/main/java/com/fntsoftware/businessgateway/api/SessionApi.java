package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.SessionApplicationPermissionsRequest;
import com.fntsoftware.businessgateway.entities.SessionApplicationPermissionsResponse;
import com.fntsoftware.businessgateway.entities.SessionIsAliveRequest;
import com.fntsoftware.businessgateway.entities.SessionIsAliveResponse;
import com.fntsoftware.businessgateway.entities.SessionObjectPermissionsRequest;
import com.fntsoftware.businessgateway.entities.SessionObjectPermissionsResponse;
import com.fntsoftware.businessgateway.entities.SessionSettingsRequest;
import com.fntsoftware.businessgateway.entities.SessionSettingsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
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

  /**
   * Check session
   * Checks whether the session is still valid.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SessionIsAliveResponse
   */
  @RequestLine("POST /api/rest/entity/session/isAlive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SessionIsAliveResponse sessionIsAlive(@Param("sessionId") String sessionId, SessionIsAliveRequest body);

  /**
   * Check session
   * Similar to <code>sessionIsAlive</code> but it also returns the http response headers .
   * Checks whether the session is still valid.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/session/isAlive?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SessionIsAliveResponse> sessionIsAliveWithHttpInfo(@Param("sessionId") String sessionId, SessionIsAliveRequest body);


  /**
   * Check session
   * Checks whether the session is still valid.
   * Note, this is equivalent to the other <code>sessionIsAlive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SessionIsAliveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SessionIsAliveResponse
   */
  @RequestLine("POST /api/rest/entity/session/isAlive?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SessionIsAliveResponse sessionIsAlive(SessionIsAliveRequest body, @QueryMap(encoded=true) SessionIsAliveQueryParams queryParams);

  /**
  * Check session
  * Checks whether the session is still valid.
  * Note, this is equivalent to the other <code>sessionIsAlive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SessionIsAliveResponse
      */
      @RequestLine("POST /api/rest/entity/session/isAlive?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SessionIsAliveResponse> sessionIsAliveWithHttpInfo(SessionIsAliveRequest body, @QueryMap(encoded=true) SessionIsAliveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sessionIsAlive</code> method in a fluent style.
   */
  public static class SessionIsAliveQueryParams extends HashMap<String, Object> {
    public SessionIsAliveQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Object authorization
   * Object authorization
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SessionObjectPermissionsResponse
   */
  @RequestLine("POST /api/rest/entity/session/objectPermissions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SessionObjectPermissionsResponse sessionObjectPermissions(@Param("sessionId") String sessionId, SessionObjectPermissionsRequest body);

  /**
   * Object authorization
   * Similar to <code>sessionObjectPermissions</code> but it also returns the http response headers .
   * Object authorization
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/session/objectPermissions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SessionObjectPermissionsResponse> sessionObjectPermissionsWithHttpInfo(@Param("sessionId") String sessionId, SessionObjectPermissionsRequest body);


  /**
   * Object authorization
   * Object authorization
   * Note, this is equivalent to the other <code>sessionObjectPermissions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SessionObjectPermissionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SessionObjectPermissionsResponse
   */
  @RequestLine("POST /api/rest/entity/session/objectPermissions?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SessionObjectPermissionsResponse sessionObjectPermissions(SessionObjectPermissionsRequest body, @QueryMap(encoded=true) SessionObjectPermissionsQueryParams queryParams);

  /**
  * Object authorization
  * Object authorization
  * Note, this is equivalent to the other <code>sessionObjectPermissions</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SessionObjectPermissionsResponse
      */
      @RequestLine("POST /api/rest/entity/session/objectPermissions?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SessionObjectPermissionsResponse> sessionObjectPermissionsWithHttpInfo(SessionObjectPermissionsRequest body, @QueryMap(encoded=true) SessionObjectPermissionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sessionObjectPermissions</code> method in a fluent style.
   */
  public static class SessionObjectPermissionsQueryParams extends HashMap<String, Object> {
    public SessionObjectPermissionsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query settings
   * Returns the settings for the user who is logged in the current session. The result can be limited via a setting name.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SessionSettingsResponse
   */
  @RequestLine("POST /api/rest/entity/session/settings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SessionSettingsResponse sessionSettings(@Param("sessionId") String sessionId, SessionSettingsRequest body);

  /**
   * Query settings
   * Similar to <code>sessionSettings</code> but it also returns the http response headers .
   * Returns the settings for the user who is logged in the current session. The result can be limited via a setting name.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/session/settings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SessionSettingsResponse> sessionSettingsWithHttpInfo(@Param("sessionId") String sessionId, SessionSettingsRequest body);


  /**
   * Query settings
   * Returns the settings for the user who is logged in the current session. The result can be limited via a setting name.
   * Note, this is equivalent to the other <code>sessionSettings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SessionSettingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SessionSettingsResponse
   */
  @RequestLine("POST /api/rest/entity/session/settings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SessionSettingsResponse sessionSettings(SessionSettingsRequest body, @QueryMap(encoded=true) SessionSettingsQueryParams queryParams);

  /**
  * Query settings
  * Returns the settings for the user who is logged in the current session. The result can be limited via a setting name.
  * Note, this is equivalent to the other <code>sessionSettings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SessionSettingsResponse
      */
      @RequestLine("POST /api/rest/entity/session/settings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SessionSettingsResponse> sessionSettingsWithHttpInfo(SessionSettingsRequest body, @QueryMap(encoded=true) SessionSettingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sessionSettings</code> method in a fluent style.
   */
  public static class SessionSettingsQueryParams extends HashMap<String, Object> {
    public SessionSettingsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
