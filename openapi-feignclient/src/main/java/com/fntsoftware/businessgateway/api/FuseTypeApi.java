package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.FuseTypeFusesRequestData;
import com.fntsoftware.businessgateway.entities.FuseTypeFusesResponseData;
import com.fntsoftware.businessgateway.entities.FuseTypeQueryRequest;
import com.fntsoftware.businessgateway.entities.FuseTypeQueryResponse;
import com.fntsoftware.businessgateway.entities.FuseTypeSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.FuseTypeSystemAttributesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface FuseTypeApi extends ApiClient.Api {


  /**
   * Get relations to Fuse entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return FuseTypeFusesResponseData
   */
  @RequestLine("POST /api/rest/entity/fuseType/{elid}/Fuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FuseTypeFusesResponseData fuseTypeFuses(@Param("sessionId") String sessionId, @Param("elid") String elid, FuseTypeFusesRequestData body);

  /**
   * Get relations to Fuse entities
   * Similar to <code>fuseTypeFuses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fuseType/{elid}/Fuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FuseTypeFusesResponseData> fuseTypeFusesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FuseTypeFusesRequestData body);


  /**
   * Get relations to Fuse entities
   * 
   * Note, this is equivalent to the other <code>fuseTypeFuses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FuseTypeFusesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FuseTypeFusesResponseData
   */
  @RequestLine("POST /api/rest/entity/fuseType/{elid}/Fuses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FuseTypeFusesResponseData fuseTypeFuses(@Param("elid") String elid, FuseTypeFusesRequestData body, @QueryMap(encoded=true) FuseTypeFusesQueryParams queryParams);

  /**
  * Get relations to Fuse entities
  * 
  * Note, this is equivalent to the other <code>fuseTypeFuses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FuseTypeFusesResponseData
      */
      @RequestLine("POST /api/rest/entity/fuseType/{elid}/Fuses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FuseTypeFusesResponseData> fuseTypeFusesWithHttpInfo(@Param("elid") String elid, FuseTypeFusesRequestData body, @QueryMap(encoded=true) FuseTypeFusesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fuseTypeFuses</code> method in a fluent style.
   */
  public static class FuseTypeFusesQueryParams extends HashMap<String, Object> {
    public FuseTypeFusesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return FuseTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/fuseType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FuseTypeQueryResponse fuseTypeQuery(@Param("sessionId") String sessionId, FuseTypeQueryRequest body);

  /**
   * Basic query
   * Similar to <code>fuseTypeQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fuseType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FuseTypeQueryResponse> fuseTypeQueryWithHttpInfo(@Param("sessionId") String sessionId, FuseTypeQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>fuseTypeQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FuseTypeQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FuseTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/fuseType/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FuseTypeQueryResponse fuseTypeQuery(FuseTypeQueryRequest body, @QueryMap(encoded=true) FuseTypeQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>fuseTypeQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FuseTypeQueryResponse
      */
      @RequestLine("POST /api/rest/entity/fuseType/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FuseTypeQueryResponse> fuseTypeQueryWithHttpInfo(FuseTypeQueryRequest body, @QueryMap(encoded=true) FuseTypeQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fuseTypeQuery</code> method in a fluent style.
   */
  public static class FuseTypeQueryQueryParams extends HashMap<String, Object> {
    public FuseTypeQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query system attributes
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return FuseTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/fuseType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FuseTypeSystemAttributesResponse fuseTypeSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, FuseTypeSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>fuseTypeSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fuseType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FuseTypeSystemAttributesResponse> fuseTypeSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FuseTypeSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>fuseTypeSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FuseTypeSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FuseTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/fuseType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FuseTypeSystemAttributesResponse fuseTypeSystemAttributes(@Param("elid") String elid, FuseTypeSystemAttributesRequest body, @QueryMap(encoded=true) FuseTypeSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>fuseTypeSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FuseTypeSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/fuseType/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FuseTypeSystemAttributesResponse> fuseTypeSystemAttributesWithHttpInfo(@Param("elid") String elid, FuseTypeSystemAttributesRequest body, @QueryMap(encoded=true) FuseTypeSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fuseTypeSystemAttributes</code> method in a fluent style.
   */
  public static class FuseTypeSystemAttributesQueryParams extends HashMap<String, Object> {
    public FuseTypeSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
