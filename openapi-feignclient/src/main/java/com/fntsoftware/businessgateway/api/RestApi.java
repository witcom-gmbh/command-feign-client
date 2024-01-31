package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.LoginRequest;
import com.fntsoftware.businessgateway.entities.LoginResponse;
import com.fntsoftware.businessgateway.entities.ServiceStatusData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:00:24.721128812Z[Etc/UTC]")
public interface RestApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param body  (required)
   * @return LoginResponse
   */
  @RequestLine("POST /api/rest/businessGateway/login")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LoginResponse login(LoginRequest body);

  /**
   * 
   * Similar to <code>login</code> but it also returns the http response headers .
   * 
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/businessGateway/login")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LoginResponse> loginWithHttpInfo(LoginRequest body);



  /**
   * 
   * 
   * @param sessionId Session-ID (required)
   * @return ServiceStatusData
   */
  @RequestLine("POST /api/rest/businessGateway/logout?sessionId={sessionId}")
  @Headers({
    "Accept: application/json",
  })
  ServiceStatusData logout(@Param("sessionId") String sessionId);

  /**
   * 
   * Similar to <code>logout</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/businessGateway/logout?sessionId={sessionId}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<ServiceStatusData> logoutWithHttpInfo(@Param("sessionId") String sessionId);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>logout</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogoutQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceStatusData
   */
  @RequestLine("POST /api/rest/businessGateway/logout?sessionId={sessionId}")
  @Headers({
  "Accept: application/json",
  })
  ServiceStatusData logout(@QueryMap(encoded=true) LogoutQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>logout</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceStatusData
      */
      @RequestLine("POST /api/rest/businessGateway/logout?sessionId={sessionId}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<ServiceStatusData> logoutWithHttpInfo(@QueryMap(encoded=true) LogoutQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logout</code> method in a fluent style.
   */
  public static class LogoutQueryParams extends HashMap<String, Object> {
    public LogoutQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
