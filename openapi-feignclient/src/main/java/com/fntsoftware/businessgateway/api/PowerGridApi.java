package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.PowerGridQueryRequest;
import com.fntsoftware.businessgateway.entities.PowerGridQueryResponse;
import com.fntsoftware.businessgateway.entities.PowerGridSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.PowerGridSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPowerGridRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPowerGridResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface PowerGridApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PowerGridQueryResponse
   */
  @RequestLine("POST /api/rest/entity/powerGrid/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerGridQueryResponse powerGridQuery(@Param("sessionId") String sessionId, PowerGridQueryRequest body);

  /**
   * Basic query
   * Similar to <code>powerGridQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerGrid/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerGridQueryResponse> powerGridQueryWithHttpInfo(@Param("sessionId") String sessionId, PowerGridQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>powerGridQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerGridQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerGridQueryResponse
   */
  @RequestLine("POST /api/rest/entity/powerGrid/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerGridQueryResponse powerGridQuery(PowerGridQueryRequest body, @QueryMap(encoded=true) PowerGridQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>powerGridQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerGridQueryResponse
      */
      @RequestLine("POST /api/rest/entity/powerGrid/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerGridQueryResponse> powerGridQueryWithHttpInfo(PowerGridQueryRequest body, @QueryMap(encoded=true) PowerGridQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerGridQuery</code> method in a fluent style.
   */
  public static class PowerGridQueryQueryParams extends HashMap<String, Object> {
    public PowerGridQueryQueryParams sessionId(final String value) {
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
   * @return PowerGridSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/powerGrid/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerGridSystemAttributesResponse powerGridSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerGridSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>powerGridSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerGrid/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerGridSystemAttributesResponse> powerGridSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerGridSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>powerGridSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerGridSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerGridSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/powerGrid/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerGridSystemAttributesResponse powerGridSystemAttributes(@Param("elid") String elid, PowerGridSystemAttributesRequest body, @QueryMap(encoded=true) PowerGridSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>powerGridSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerGridSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/powerGrid/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerGridSystemAttributesResponse> powerGridSystemAttributesWithHttpInfo(@Param("elid") String elid, PowerGridSystemAttributesRequest body, @QueryMap(encoded=true) PowerGridSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerGridSystemAttributes</code> method in a fluent style.
   */
  public static class PowerGridSystemAttributesQueryParams extends HashMap<String, Object> {
    public PowerGridSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesPowerGridResponse
   */
  @RequestLine("POST /api/rest/entity/powerGrid/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesPowerGridResponse updateSystemAttributesPowerGrid(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPowerGridRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesPowerGrid</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerGrid/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesPowerGridResponse> updateSystemAttributesPowerGridWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPowerGridRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesPowerGrid</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesPowerGridQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesPowerGridResponse
   */
  @RequestLine("POST /api/rest/entity/powerGrid/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesPowerGridResponse updateSystemAttributesPowerGrid(@Param("elid") String elid, UpdateSystemAttributesPowerGridRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPowerGridQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesPowerGrid</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesPowerGridResponse
      */
      @RequestLine("POST /api/rest/entity/powerGrid/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesPowerGridResponse> updateSystemAttributesPowerGridWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesPowerGridRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPowerGridQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesPowerGrid</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesPowerGridQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesPowerGridQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
