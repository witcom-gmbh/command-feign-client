package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.SpliceCassetteMasterQueryRequest;
import com.fntsoftware.businessgateway.entities.SpliceCassetteMasterQueryResponse;
import com.fntsoftware.businessgateway.entities.SpliceCassetteMasterSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SpliceCassetteMasterSystemAttributesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface SpliceCassetteMasterApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SpliceCassetteMasterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/spliceCassetteMaster/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SpliceCassetteMasterQueryResponse spliceCassetteMasterQuery(@Param("sessionId") String sessionId, SpliceCassetteMasterQueryRequest body);

  /**
   * Basic query
   * Similar to <code>spliceCassetteMasterQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/spliceCassetteMaster/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SpliceCassetteMasterQueryResponse> spliceCassetteMasterQueryWithHttpInfo(@Param("sessionId") String sessionId, SpliceCassetteMasterQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>spliceCassetteMasterQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SpliceCassetteMasterQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SpliceCassetteMasterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/spliceCassetteMaster/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SpliceCassetteMasterQueryResponse spliceCassetteMasterQuery(SpliceCassetteMasterQueryRequest body, @QueryMap(encoded=true) SpliceCassetteMasterQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>spliceCassetteMasterQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SpliceCassetteMasterQueryResponse
      */
      @RequestLine("POST /api/rest/entity/spliceCassetteMaster/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SpliceCassetteMasterQueryResponse> spliceCassetteMasterQueryWithHttpInfo(SpliceCassetteMasterQueryRequest body, @QueryMap(encoded=true) SpliceCassetteMasterQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>spliceCassetteMasterQuery</code> method in a fluent style.
   */
  public static class SpliceCassetteMasterQueryQueryParams extends HashMap<String, Object> {
    public SpliceCassetteMasterQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query system attributes
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SpliceCassetteMasterSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/spliceCassetteMaster/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SpliceCassetteMasterSystemAttributesResponse spliceCassetteMasterSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SpliceCassetteMasterSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>spliceCassetteMasterSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/spliceCassetteMaster/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SpliceCassetteMasterSystemAttributesResponse> spliceCassetteMasterSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SpliceCassetteMasterSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>spliceCassetteMasterSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SpliceCassetteMasterSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SpliceCassetteMasterSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/spliceCassetteMaster/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SpliceCassetteMasterSystemAttributesResponse spliceCassetteMasterSystemAttributes(@Param("elid") String elid, SpliceCassetteMasterSystemAttributesRequest body, @QueryMap(encoded=true) SpliceCassetteMasterSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>spliceCassetteMasterSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SpliceCassetteMasterSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/spliceCassetteMaster/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SpliceCassetteMasterSystemAttributesResponse> spliceCassetteMasterSystemAttributesWithHttpInfo(@Param("elid") String elid, SpliceCassetteMasterSystemAttributesRequest body, @QueryMap(encoded=true) SpliceCassetteMasterSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>spliceCassetteMasterSystemAttributes</code> method in a fluent style.
   */
  public static class SpliceCassetteMasterSystemAttributesQueryParams extends HashMap<String, Object> {
    public SpliceCassetteMasterSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
