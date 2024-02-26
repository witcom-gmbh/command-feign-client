package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ClearAllScrollQueryResponse;
import com.fntsoftware.businessgateway.entities.ClearAnyScrollQueryRequestData;
import com.fntsoftware.businessgateway.entities.ClearAnyScrollQueryResponse;
import com.fntsoftware.businessgateway.entities.ClearScrollQueryRequestData;
import com.fntsoftware.businessgateway.entities.ClearScrollQueryResponse;
import com.fntsoftware.businessgateway.entities.ScrollQueryGetReportRequest;
import com.fntsoftware.businessgateway.entities.ScrollQueryGetReportResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ScrollQueryApi extends ApiClient.Api {


  /**
   * Clear all scrolls
   * Clears all scrolls. Administrator rights are required.
   * @param sessionId Session-ID (required)
   * @param body  (optional)
   * @return ClearAllScrollQueryResponse
   */
  @RequestLine("POST /api/rest/entity/scrollQuery/clearAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ClearAllScrollQueryResponse clearAllScrollQuery(@Param("sessionId") String sessionId, Object body);

  /**
   * Clear all scrolls
   * Similar to <code>clearAllScrollQuery</code> but it also returns the http response headers .
   * Clears all scrolls. Administrator rights are required.
   * @param sessionId Session-ID (required)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/scrollQuery/clearAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ClearAllScrollQueryResponse> clearAllScrollQueryWithHttpInfo(@Param("sessionId") String sessionId, Object body);


  /**
   * Clear all scrolls
   * Clears all scrolls. Administrator rights are required.
   * Note, this is equivalent to the other <code>clearAllScrollQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ClearAllScrollQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ClearAllScrollQueryResponse
   */
  @RequestLine("POST /api/rest/entity/scrollQuery/clearAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ClearAllScrollQueryResponse clearAllScrollQuery(Object body, @QueryMap(encoded=true) ClearAllScrollQueryQueryParams queryParams);

  /**
  * Clear all scrolls
  * Clears all scrolls. Administrator rights are required.
  * Note, this is equivalent to the other <code>clearAllScrollQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ClearAllScrollQueryResponse
      */
      @RequestLine("POST /api/rest/entity/scrollQuery/clearAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ClearAllScrollQueryResponse> clearAllScrollQueryWithHttpInfo(Object body, @QueryMap(encoded=true) ClearAllScrollQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>clearAllScrollQuery</code> method in a fluent style.
   */
  public static class ClearAllScrollQueryQueryParams extends HashMap<String, Object> {
    public ClearAllScrollQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Clear any scroll
   * Clears the scroll context of a query. Herewith it&#39;s also possible to clear scrolls from other sessions. Administrator rights are required.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ClearAnyScrollQueryResponse
   */
  @RequestLine("POST /api/rest/entity/scrollQuery/clearAny?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ClearAnyScrollQueryResponse clearAnyScrollQuery(@Param("sessionId") String sessionId, ClearAnyScrollQueryRequestData body);

  /**
   * Clear any scroll
   * Similar to <code>clearAnyScrollQuery</code> but it also returns the http response headers .
   * Clears the scroll context of a query. Herewith it&#39;s also possible to clear scrolls from other sessions. Administrator rights are required.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/scrollQuery/clearAny?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ClearAnyScrollQueryResponse> clearAnyScrollQueryWithHttpInfo(@Param("sessionId") String sessionId, ClearAnyScrollQueryRequestData body);


  /**
   * Clear any scroll
   * Clears the scroll context of a query. Herewith it&#39;s also possible to clear scrolls from other sessions. Administrator rights are required.
   * Note, this is equivalent to the other <code>clearAnyScrollQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ClearAnyScrollQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ClearAnyScrollQueryResponse
   */
  @RequestLine("POST /api/rest/entity/scrollQuery/clearAny?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ClearAnyScrollQueryResponse clearAnyScrollQuery(ClearAnyScrollQueryRequestData body, @QueryMap(encoded=true) ClearAnyScrollQueryQueryParams queryParams);

  /**
  * Clear any scroll
  * Clears the scroll context of a query. Herewith it&#39;s also possible to clear scrolls from other sessions. Administrator rights are required.
  * Note, this is equivalent to the other <code>clearAnyScrollQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ClearAnyScrollQueryResponse
      */
      @RequestLine("POST /api/rest/entity/scrollQuery/clearAny?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ClearAnyScrollQueryResponse> clearAnyScrollQueryWithHttpInfo(ClearAnyScrollQueryRequestData body, @QueryMap(encoded=true) ClearAnyScrollQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>clearAnyScrollQuery</code> method in a fluent style.
   */
  public static class ClearAnyScrollQueryQueryParams extends HashMap<String, Object> {
    public ClearAnyScrollQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Clear scroll
   * Clears the scroll context of a query explicitly and releases unused resources. This operation should be called after the use of a scroll query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ClearScrollQueryResponse
   */
  @RequestLine("POST /api/rest/entity/scrollQuery/clear?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ClearScrollQueryResponse clearScrollQuery(@Param("sessionId") String sessionId, ClearScrollQueryRequestData body);

  /**
   * Clear scroll
   * Similar to <code>clearScrollQuery</code> but it also returns the http response headers .
   * Clears the scroll context of a query explicitly and releases unused resources. This operation should be called after the use of a scroll query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/scrollQuery/clear?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ClearScrollQueryResponse> clearScrollQueryWithHttpInfo(@Param("sessionId") String sessionId, ClearScrollQueryRequestData body);


  /**
   * Clear scroll
   * Clears the scroll context of a query explicitly and releases unused resources. This operation should be called after the use of a scroll query.
   * Note, this is equivalent to the other <code>clearScrollQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ClearScrollQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ClearScrollQueryResponse
   */
  @RequestLine("POST /api/rest/entity/scrollQuery/clear?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ClearScrollQueryResponse clearScrollQuery(ClearScrollQueryRequestData body, @QueryMap(encoded=true) ClearScrollQueryQueryParams queryParams);

  /**
  * Clear scroll
  * Clears the scroll context of a query explicitly and releases unused resources. This operation should be called after the use of a scroll query.
  * Note, this is equivalent to the other <code>clearScrollQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ClearScrollQueryResponse
      */
      @RequestLine("POST /api/rest/entity/scrollQuery/clear?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ClearScrollQueryResponse> clearScrollQueryWithHttpInfo(ClearScrollQueryRequestData body, @QueryMap(encoded=true) ClearScrollQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>clearScrollQuery</code> method in a fluent style.
   */
  public static class ClearScrollQueryQueryParams extends HashMap<String, Object> {
    public ClearScrollQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get report
   * Gets a report for diagnostic purposes which contains important information (file size, item size,...) about the active scrolls. Administrator rights are required.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ScrollQueryGetReportResponse
   */
  @RequestLine("POST /api/rest/entity/scrollQuery/getReport?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ScrollQueryGetReportResponse scrollQueryGetReport(@Param("sessionId") String sessionId, ScrollQueryGetReportRequest body);

  /**
   * Get report
   * Similar to <code>scrollQueryGetReport</code> but it also returns the http response headers .
   * Gets a report for diagnostic purposes which contains important information (file size, item size,...) about the active scrolls. Administrator rights are required.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/scrollQuery/getReport?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ScrollQueryGetReportResponse> scrollQueryGetReportWithHttpInfo(@Param("sessionId") String sessionId, ScrollQueryGetReportRequest body);


  /**
   * Get report
   * Gets a report for diagnostic purposes which contains important information (file size, item size,...) about the active scrolls. Administrator rights are required.
   * Note, this is equivalent to the other <code>scrollQueryGetReport</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ScrollQueryGetReportQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ScrollQueryGetReportResponse
   */
  @RequestLine("POST /api/rest/entity/scrollQuery/getReport?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ScrollQueryGetReportResponse scrollQueryGetReport(ScrollQueryGetReportRequest body, @QueryMap(encoded=true) ScrollQueryGetReportQueryParams queryParams);

  /**
  * Get report
  * Gets a report for diagnostic purposes which contains important information (file size, item size,...) about the active scrolls. Administrator rights are required.
  * Note, this is equivalent to the other <code>scrollQueryGetReport</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ScrollQueryGetReportResponse
      */
      @RequestLine("POST /api/rest/entity/scrollQuery/getReport?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ScrollQueryGetReportResponse> scrollQueryGetReportWithHttpInfo(ScrollQueryGetReportRequest body, @QueryMap(encoded=true) ScrollQueryGetReportQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>scrollQueryGetReport</code> method in a fluent style.
   */
  public static class ScrollQueryGetReportQueryParams extends HashMap<String, Object> {
    public ScrollQueryGetReportQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
