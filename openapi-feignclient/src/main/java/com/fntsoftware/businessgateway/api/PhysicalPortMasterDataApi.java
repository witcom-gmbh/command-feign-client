package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.PhysicalPortMasterDataQueryRequest;
import com.fntsoftware.businessgateway.entities.PhysicalPortMasterDataQueryResponse;
import com.fntsoftware.businessgateway.entities.PhysicalPortMasterDataSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.PhysicalPortMasterDataSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPhysicalPortMasterDataRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPhysicalPortMasterDataResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface PhysicalPortMasterDataApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PhysicalPortMasterDataQueryResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortMasterData/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortMasterDataQueryResponse physicalPortMasterDataQuery(@Param("sessionId") String sessionId, PhysicalPortMasterDataQueryRequest body);

  /**
   * Basic query
   * Similar to <code>physicalPortMasterDataQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortMasterData/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortMasterDataQueryResponse> physicalPortMasterDataQueryWithHttpInfo(@Param("sessionId") String sessionId, PhysicalPortMasterDataQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>physicalPortMasterDataQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortMasterDataQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortMasterDataQueryResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortMasterData/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortMasterDataQueryResponse physicalPortMasterDataQuery(PhysicalPortMasterDataQueryRequest body, @QueryMap(encoded=true) PhysicalPortMasterDataQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>physicalPortMasterDataQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortMasterDataQueryResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortMasterData/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortMasterDataQueryResponse> physicalPortMasterDataQueryWithHttpInfo(PhysicalPortMasterDataQueryRequest body, @QueryMap(encoded=true) PhysicalPortMasterDataQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortMasterDataQuery</code> method in a fluent style.
   */
  public static class PhysicalPortMasterDataQueryQueryParams extends HashMap<String, Object> {
    public PhysicalPortMasterDataQueryQueryParams sessionId(final String value) {
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
   * @return PhysicalPortMasterDataSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortMasterData/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalPortMasterDataSystemAttributesResponse physicalPortMasterDataSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalPortMasterDataSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>physicalPortMasterDataSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortMasterData/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalPortMasterDataSystemAttributesResponse> physicalPortMasterDataSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalPortMasterDataSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>physicalPortMasterDataSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalPortMasterDataSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalPortMasterDataSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortMasterData/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalPortMasterDataSystemAttributesResponse physicalPortMasterDataSystemAttributes(@Param("elid") String elid, PhysicalPortMasterDataSystemAttributesRequest body, @QueryMap(encoded=true) PhysicalPortMasterDataSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>physicalPortMasterDataSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalPortMasterDataSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortMasterData/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalPortMasterDataSystemAttributesResponse> physicalPortMasterDataSystemAttributesWithHttpInfo(@Param("elid") String elid, PhysicalPortMasterDataSystemAttributesRequest body, @QueryMap(encoded=true) PhysicalPortMasterDataSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalPortMasterDataSystemAttributes</code> method in a fluent style.
   */
  public static class PhysicalPortMasterDataSystemAttributesQueryParams extends HashMap<String, Object> {
    public PhysicalPortMasterDataSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Change system attributes
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSystemAttributesPhysicalPortMasterDataResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortMasterData/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesPhysicalPortMasterDataResponse updateSystemAttributesPhysicalPortMasterData(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPhysicalPortMasterDataRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesPhysicalPortMasterData</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalPortMasterData/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesPhysicalPortMasterDataResponse> updateSystemAttributesPhysicalPortMasterDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPhysicalPortMasterDataRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesPhysicalPortMasterData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesPhysicalPortMasterDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesPhysicalPortMasterDataResponse
   */
  @RequestLine("POST /api/rest/entity/physicalPortMasterData/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesPhysicalPortMasterDataResponse updateSystemAttributesPhysicalPortMasterData(@Param("elid") String elid, UpdateSystemAttributesPhysicalPortMasterDataRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPhysicalPortMasterDataQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesPhysicalPortMasterData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesPhysicalPortMasterDataResponse
      */
      @RequestLine("POST /api/rest/entity/physicalPortMasterData/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesPhysicalPortMasterDataResponse> updateSystemAttributesPhysicalPortMasterDataWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesPhysicalPortMasterDataRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPhysicalPortMasterDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesPhysicalPortMasterData</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesPhysicalPortMasterDataQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesPhysicalPortMasterDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
