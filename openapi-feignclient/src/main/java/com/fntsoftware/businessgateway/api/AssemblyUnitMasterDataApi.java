package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AssemblyUnitMasterDataDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.AssemblyUnitMasterDataDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.AssemblyUnitMasterDataQueryRequest;
import com.fntsoftware.businessgateway.entities.AssemblyUnitMasterDataQueryResponse;
import com.fntsoftware.businessgateway.entities.AssemblyUnitMasterDataSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.AssemblyUnitMasterDataSystemAttributesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface AssemblyUnitMasterDataApi extends ApiClient.Api {


  /**
   * Get relations to Device master entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AssemblyUnitMasterDataDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/assemblyUnitMasterData/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AssemblyUnitMasterDataDeviceMasterResponseData assemblyUnitMasterDataDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, AssemblyUnitMasterDataDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>assemblyUnitMasterDataDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/assemblyUnitMasterData/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AssemblyUnitMasterDataDeviceMasterResponseData> assemblyUnitMasterDataDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AssemblyUnitMasterDataDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>assemblyUnitMasterDataDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AssemblyUnitMasterDataDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AssemblyUnitMasterDataDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/assemblyUnitMasterData/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AssemblyUnitMasterDataDeviceMasterResponseData assemblyUnitMasterDataDeviceMaster(@Param("elid") String elid, AssemblyUnitMasterDataDeviceMasterRequestData body, @QueryMap(encoded=true) AssemblyUnitMasterDataDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>assemblyUnitMasterDataDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AssemblyUnitMasterDataDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/assemblyUnitMasterData/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AssemblyUnitMasterDataDeviceMasterResponseData> assemblyUnitMasterDataDeviceMasterWithHttpInfo(@Param("elid") String elid, AssemblyUnitMasterDataDeviceMasterRequestData body, @QueryMap(encoded=true) AssemblyUnitMasterDataDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>assemblyUnitMasterDataDeviceMaster</code> method in a fluent style.
   */
  public static class AssemblyUnitMasterDataDeviceMasterQueryParams extends HashMap<String, Object> {
    public AssemblyUnitMasterDataDeviceMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return AssemblyUnitMasterDataQueryResponse
   */
  @RequestLine("POST /api/rest/entity/assemblyUnitMasterData/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AssemblyUnitMasterDataQueryResponse assemblyUnitMasterDataQuery(@Param("sessionId") String sessionId, AssemblyUnitMasterDataQueryRequest body);

  /**
   * Basic query
   * Similar to <code>assemblyUnitMasterDataQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/assemblyUnitMasterData/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AssemblyUnitMasterDataQueryResponse> assemblyUnitMasterDataQueryWithHttpInfo(@Param("sessionId") String sessionId, AssemblyUnitMasterDataQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>assemblyUnitMasterDataQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AssemblyUnitMasterDataQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AssemblyUnitMasterDataQueryResponse
   */
  @RequestLine("POST /api/rest/entity/assemblyUnitMasterData/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AssemblyUnitMasterDataQueryResponse assemblyUnitMasterDataQuery(AssemblyUnitMasterDataQueryRequest body, @QueryMap(encoded=true) AssemblyUnitMasterDataQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>assemblyUnitMasterDataQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AssemblyUnitMasterDataQueryResponse
      */
      @RequestLine("POST /api/rest/entity/assemblyUnitMasterData/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AssemblyUnitMasterDataQueryResponse> assemblyUnitMasterDataQueryWithHttpInfo(AssemblyUnitMasterDataQueryRequest body, @QueryMap(encoded=true) AssemblyUnitMasterDataQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>assemblyUnitMasterDataQuery</code> method in a fluent style.
   */
  public static class AssemblyUnitMasterDataQueryQueryParams extends HashMap<String, Object> {
    public AssemblyUnitMasterDataQueryQueryParams sessionId(final String value) {
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
   * @return AssemblyUnitMasterDataSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/assemblyUnitMasterData/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AssemblyUnitMasterDataSystemAttributesResponse assemblyUnitMasterDataSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, AssemblyUnitMasterDataSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>assemblyUnitMasterDataSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/assemblyUnitMasterData/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AssemblyUnitMasterDataSystemAttributesResponse> assemblyUnitMasterDataSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AssemblyUnitMasterDataSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>assemblyUnitMasterDataSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AssemblyUnitMasterDataSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AssemblyUnitMasterDataSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/assemblyUnitMasterData/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AssemblyUnitMasterDataSystemAttributesResponse assemblyUnitMasterDataSystemAttributes(@Param("elid") String elid, AssemblyUnitMasterDataSystemAttributesRequest body, @QueryMap(encoded=true) AssemblyUnitMasterDataSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>assemblyUnitMasterDataSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AssemblyUnitMasterDataSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/assemblyUnitMasterData/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AssemblyUnitMasterDataSystemAttributesResponse> assemblyUnitMasterDataSystemAttributesWithHttpInfo(@Param("elid") String elid, AssemblyUnitMasterDataSystemAttributesRequest body, @QueryMap(encoded=true) AssemblyUnitMasterDataSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>assemblyUnitMasterDataSystemAttributes</code> method in a fluent style.
   */
  public static class AssemblyUnitMasterDataSystemAttributesQueryParams extends HashMap<String, Object> {
    public AssemblyUnitMasterDataSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
