package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.LogicalConnectionPowerFromPortRequestData;
import com.fntsoftware.businessgateway.entities.LogicalConnectionPowerFromPortResponseData;
import com.fntsoftware.businessgateway.entities.LogicalConnectionPowerLogicalConnectionPowerRequest;
import com.fntsoftware.businessgateway.entities.LogicalConnectionPowerLogicalConnectionPowerResponse;
import com.fntsoftware.businessgateway.entities.LogicalConnectionPowerToPortRequestData;
import com.fntsoftware.businessgateway.entities.LogicalConnectionPowerToPortResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface LogicalConnectionPowerApi extends ApiClient.Api {


  /**
   * Get relations to From port entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalConnectionPowerFromPortResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionPower/{elid}/FromPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalConnectionPowerFromPortResponseData logicalConnectionPowerFromPort(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalConnectionPowerFromPortRequestData body);

  /**
   * Get relations to From port entities
   * Similar to <code>logicalConnectionPowerFromPort</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionPower/{elid}/FromPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalConnectionPowerFromPortResponseData> logicalConnectionPowerFromPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalConnectionPowerFromPortRequestData body);


  /**
   * Get relations to From port entities
   * 
   * Note, this is equivalent to the other <code>logicalConnectionPowerFromPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalConnectionPowerFromPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalConnectionPowerFromPortResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionPower/{elid}/FromPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalConnectionPowerFromPortResponseData logicalConnectionPowerFromPort(@Param("elid") String elid, LogicalConnectionPowerFromPortRequestData body, @QueryMap(encoded=true) LogicalConnectionPowerFromPortQueryParams queryParams);

  /**
  * Get relations to From port entities
  * 
  * Note, this is equivalent to the other <code>logicalConnectionPowerFromPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalConnectionPowerFromPortResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalConnectionPower/{elid}/FromPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalConnectionPowerFromPortResponseData> logicalConnectionPowerFromPortWithHttpInfo(@Param("elid") String elid, LogicalConnectionPowerFromPortRequestData body, @QueryMap(encoded=true) LogicalConnectionPowerFromPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalConnectionPowerFromPort</code> method in a fluent style.
   */
  public static class LogicalConnectionPowerFromPortQueryParams extends HashMap<String, Object> {
    public LogicalConnectionPowerFromPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Logical connection (current)
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalConnectionPowerLogicalConnectionPowerResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionPower/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalConnectionPowerLogicalConnectionPowerResponse logicalConnectionPowerLogicalConnectionPower(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalConnectionPowerLogicalConnectionPowerRequest body);

  /**
   * Query Logical connection (current)
   * Similar to <code>logicalConnectionPowerLogicalConnectionPower</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionPower/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalConnectionPowerLogicalConnectionPowerResponse> logicalConnectionPowerLogicalConnectionPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalConnectionPowerLogicalConnectionPowerRequest body);


  /**
   * Query Logical connection (current)
   * 
   * Note, this is equivalent to the other <code>logicalConnectionPowerLogicalConnectionPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalConnectionPowerLogicalConnectionPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalConnectionPowerLogicalConnectionPowerResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionPower/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalConnectionPowerLogicalConnectionPowerResponse logicalConnectionPowerLogicalConnectionPower(@Param("elid") String elid, LogicalConnectionPowerLogicalConnectionPowerRequest body, @QueryMap(encoded=true) LogicalConnectionPowerLogicalConnectionPowerQueryParams queryParams);

  /**
  * Query Logical connection (current)
  * 
  * Note, this is equivalent to the other <code>logicalConnectionPowerLogicalConnectionPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalConnectionPowerLogicalConnectionPowerResponse
      */
      @RequestLine("POST /api/rest/entity/logicalConnectionPower/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalConnectionPowerLogicalConnectionPowerResponse> logicalConnectionPowerLogicalConnectionPowerWithHttpInfo(@Param("elid") String elid, LogicalConnectionPowerLogicalConnectionPowerRequest body, @QueryMap(encoded=true) LogicalConnectionPowerLogicalConnectionPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalConnectionPowerLogicalConnectionPower</code> method in a fluent style.
   */
  public static class LogicalConnectionPowerLogicalConnectionPowerQueryParams extends HashMap<String, Object> {
    public LogicalConnectionPowerLogicalConnectionPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to To port entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalConnectionPowerToPortResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionPower/{elid}/ToPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalConnectionPowerToPortResponseData logicalConnectionPowerToPort(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalConnectionPowerToPortRequestData body);

  /**
   * Get relations to To port entities
   * Similar to <code>logicalConnectionPowerToPort</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionPower/{elid}/ToPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalConnectionPowerToPortResponseData> logicalConnectionPowerToPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalConnectionPowerToPortRequestData body);


  /**
   * Get relations to To port entities
   * 
   * Note, this is equivalent to the other <code>logicalConnectionPowerToPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalConnectionPowerToPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalConnectionPowerToPortResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionPower/{elid}/ToPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalConnectionPowerToPortResponseData logicalConnectionPowerToPort(@Param("elid") String elid, LogicalConnectionPowerToPortRequestData body, @QueryMap(encoded=true) LogicalConnectionPowerToPortQueryParams queryParams);

  /**
  * Get relations to To port entities
  * 
  * Note, this is equivalent to the other <code>logicalConnectionPowerToPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalConnectionPowerToPortResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalConnectionPower/{elid}/ToPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalConnectionPowerToPortResponseData> logicalConnectionPowerToPortWithHttpInfo(@Param("elid") String elid, LogicalConnectionPowerToPortRequestData body, @QueryMap(encoded=true) LogicalConnectionPowerToPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalConnectionPowerToPort</code> method in a fluent style.
   */
  public static class LogicalConnectionPowerToPortQueryParams extends HashMap<String, Object> {
    public LogicalConnectionPowerToPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
