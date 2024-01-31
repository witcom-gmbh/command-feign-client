package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.DuctBundleTypeQueryRequest;
import com.fntsoftware.businessgateway.entities.DuctBundleTypeQueryResponse;
import com.fntsoftware.businessgateway.entities.DuctBundleTypeSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.DuctBundleTypeSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDuctBundleTypeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesDuctBundleTypeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface DuctBundleTypeApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DuctBundleTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundleType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctBundleTypeQueryResponse ductBundleTypeQuery(@Param("sessionId") String sessionId, DuctBundleTypeQueryRequest body);

  /**
   * Basic query
   * Similar to <code>ductBundleTypeQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundleType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctBundleTypeQueryResponse> ductBundleTypeQueryWithHttpInfo(@Param("sessionId") String sessionId, DuctBundleTypeQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>ductBundleTypeQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctBundleTypeQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctBundleTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundleType/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctBundleTypeQueryResponse ductBundleTypeQuery(DuctBundleTypeQueryRequest body, @QueryMap(encoded=true) DuctBundleTypeQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>ductBundleTypeQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctBundleTypeQueryResponse
      */
      @RequestLine("POST /api/rest/entity/ductBundleType/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctBundleTypeQueryResponse> ductBundleTypeQueryWithHttpInfo(DuctBundleTypeQueryRequest body, @QueryMap(encoded=true) DuctBundleTypeQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductBundleTypeQuery</code> method in a fluent style.
   */
  public static class DuctBundleTypeQueryQueryParams extends HashMap<String, Object> {
    public DuctBundleTypeQueryQueryParams sessionId(final String value) {
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
   * @return DuctBundleTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundleType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DuctBundleTypeSystemAttributesResponse ductBundleTypeSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleTypeSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>ductBundleTypeSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundleType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DuctBundleTypeSystemAttributesResponse> ductBundleTypeSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DuctBundleTypeSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>ductBundleTypeSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DuctBundleTypeSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DuctBundleTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundleType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DuctBundleTypeSystemAttributesResponse ductBundleTypeSystemAttributes(@Param("elid") String elid, DuctBundleTypeSystemAttributesRequest body, @QueryMap(encoded=true) DuctBundleTypeSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>ductBundleTypeSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DuctBundleTypeSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/ductBundleType/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DuctBundleTypeSystemAttributesResponse> ductBundleTypeSystemAttributesWithHttpInfo(@Param("elid") String elid, DuctBundleTypeSystemAttributesRequest body, @QueryMap(encoded=true) DuctBundleTypeSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ductBundleTypeSystemAttributes</code> method in a fluent style.
   */
  public static class DuctBundleTypeSystemAttributesQueryParams extends HashMap<String, Object> {
    public DuctBundleTypeSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesDuctBundleTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundleType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesDuctBundleTypeResponse updateSystemAttributesDuctBundleType(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDuctBundleTypeRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesDuctBundleType</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ductBundleType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesDuctBundleTypeResponse> updateSystemAttributesDuctBundleTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesDuctBundleTypeRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesDuctBundleType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesDuctBundleTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesDuctBundleTypeResponse
   */
  @RequestLine("POST /api/rest/entity/ductBundleType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesDuctBundleTypeResponse updateSystemAttributesDuctBundleType(@Param("elid") String elid, UpdateSystemAttributesDuctBundleTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDuctBundleTypeQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesDuctBundleType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesDuctBundleTypeResponse
      */
      @RequestLine("POST /api/rest/entity/ductBundleType/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesDuctBundleTypeResponse> updateSystemAttributesDuctBundleTypeWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesDuctBundleTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesDuctBundleTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesDuctBundleType</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesDuctBundleTypeQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesDuctBundleTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
