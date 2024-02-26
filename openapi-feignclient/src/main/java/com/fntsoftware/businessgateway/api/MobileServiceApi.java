package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.MobileServiceQueryRequest;
import com.fntsoftware.businessgateway.entities.MobileServiceQueryResponse;
import com.fntsoftware.businessgateway.entities.MobileServiceSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.MobileServiceSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMobileServiceRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMobileServiceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface MobileServiceApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return MobileServiceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/mobileService/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MobileServiceQueryResponse mobileServiceQuery(@Param("sessionId") String sessionId, MobileServiceQueryRequest body);

  /**
   * Basic query
   * Similar to <code>mobileServiceQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileService/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MobileServiceQueryResponse> mobileServiceQueryWithHttpInfo(@Param("sessionId") String sessionId, MobileServiceQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>mobileServiceQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MobileServiceQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MobileServiceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/mobileService/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MobileServiceQueryResponse mobileServiceQuery(MobileServiceQueryRequest body, @QueryMap(encoded=true) MobileServiceQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>mobileServiceQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MobileServiceQueryResponse
      */
      @RequestLine("POST /api/rest/entity/mobileService/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MobileServiceQueryResponse> mobileServiceQueryWithHttpInfo(MobileServiceQueryRequest body, @QueryMap(encoded=true) MobileServiceQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mobileServiceQuery</code> method in a fluent style.
   */
  public static class MobileServiceQueryQueryParams extends HashMap<String, Object> {
    public MobileServiceQueryQueryParams sessionId(final String value) {
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
   * @return MobileServiceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/mobileService/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MobileServiceSystemAttributesResponse mobileServiceSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileServiceSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>mobileServiceSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileService/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MobileServiceSystemAttributesResponse> mobileServiceSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileServiceSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>mobileServiceSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MobileServiceSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MobileServiceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/mobileService/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MobileServiceSystemAttributesResponse mobileServiceSystemAttributes(@Param("elid") String elid, MobileServiceSystemAttributesRequest body, @QueryMap(encoded=true) MobileServiceSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>mobileServiceSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MobileServiceSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/mobileService/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MobileServiceSystemAttributesResponse> mobileServiceSystemAttributesWithHttpInfo(@Param("elid") String elid, MobileServiceSystemAttributesRequest body, @QueryMap(encoded=true) MobileServiceSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mobileServiceSystemAttributes</code> method in a fluent style.
   */
  public static class MobileServiceSystemAttributesQueryParams extends HashMap<String, Object> {
    public MobileServiceSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesMobileServiceResponse
   */
  @RequestLine("POST /api/rest/entity/mobileService/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesMobileServiceResponse updateSystemAttributesMobileService(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMobileServiceRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesMobileService</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileService/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesMobileServiceResponse> updateSystemAttributesMobileServiceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMobileServiceRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesMobileService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesMobileServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesMobileServiceResponse
   */
  @RequestLine("POST /api/rest/entity/mobileService/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesMobileServiceResponse updateSystemAttributesMobileService(@Param("elid") String elid, UpdateSystemAttributesMobileServiceRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMobileServiceQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesMobileService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesMobileServiceResponse
      */
      @RequestLine("POST /api/rest/entity/mobileService/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesMobileServiceResponse> updateSystemAttributesMobileServiceWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesMobileServiceRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMobileServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesMobileService</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesMobileServiceQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesMobileServiceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
