package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.RolePrivilegesRequest;
import com.fntsoftware.businessgateway.entities.RolePrivilegesResponse;
import com.fntsoftware.businessgateway.entities.RoleQueryRequest;
import com.fntsoftware.businessgateway.entities.RoleQueryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface RoleApi extends ApiClient.Api {


  /**
   * Privileges
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param roleId  (required)
   * @param body  (required)
   * @return RolePrivilegesResponse
   */
  @RequestLine("POST /api/rest/entity/role/{roleId}/Privileges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RolePrivilegesResponse rolePrivileges(@Param("sessionId") String sessionId, @Param("roleId") String roleId, RolePrivilegesRequest body);

  /**
   * Privileges
   * Similar to <code>rolePrivileges</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param roleId  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/role/{roleId}/Privileges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RolePrivilegesResponse> rolePrivilegesWithHttpInfo(@Param("sessionId") String sessionId, @Param("roleId") String roleId, RolePrivilegesRequest body);


  /**
   * Privileges
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>rolePrivileges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RolePrivilegesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param roleId  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RolePrivilegesResponse
   */
  @RequestLine("POST /api/rest/entity/role/{roleId}/Privileges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RolePrivilegesResponse rolePrivileges(@Param("roleId") String roleId, RolePrivilegesRequest body, @QueryMap(encoded=true) RolePrivilegesQueryParams queryParams);

  /**
  * Privileges
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>rolePrivileges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param roleId  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RolePrivilegesResponse
      */
      @RequestLine("POST /api/rest/entity/role/{roleId}/Privileges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RolePrivilegesResponse> rolePrivilegesWithHttpInfo(@Param("roleId") String roleId, RolePrivilegesRequest body, @QueryMap(encoded=true) RolePrivilegesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>rolePrivileges</code> method in a fluent style.
   */
  public static class RolePrivilegesQueryParams extends HashMap<String, Object> {
    public RolePrivilegesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return RoleQueryResponse
   */
  @RequestLine("POST /api/rest/entity/role/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoleQueryResponse roleQuery(@Param("sessionId") String sessionId, RoleQueryRequest body);

  /**
   * Basic query
   * Similar to <code>roleQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/role/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoleQueryResponse> roleQueryWithHttpInfo(@Param("sessionId") String sessionId, RoleQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>roleQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoleQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoleQueryResponse
   */
  @RequestLine("POST /api/rest/entity/role/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoleQueryResponse roleQuery(RoleQueryRequest body, @QueryMap(encoded=true) RoleQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>roleQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoleQueryResponse
      */
      @RequestLine("POST /api/rest/entity/role/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoleQueryResponse> roleQueryWithHttpInfo(RoleQueryRequest body, @QueryMap(encoded=true) RoleQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roleQuery</code> method in a fluent style.
   */
  public static class RoleQueryQueryParams extends HashMap<String, Object> {
    public RoleQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
