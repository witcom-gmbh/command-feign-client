package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualNetworkCardRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualNetworkCardResponse;
import com.fntsoftware.businessgateway.entities.VirtualNetworkCardQueryRequest;
import com.fntsoftware.businessgateway.entities.VirtualNetworkCardQueryResponse;
import com.fntsoftware.businessgateway.entities.VirtualNetworkCardSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.VirtualNetworkCardSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.VirtualNetworkCardVirtualServerRequestData;
import com.fntsoftware.businessgateway.entities.VirtualNetworkCardVirtualServerResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface VirtualNetworkCardApi extends ApiClient.Api {


  /**
   * Change system attributes
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSystemAttributesVirtualNetworkCardResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNetworkCard/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesVirtualNetworkCardResponse updateSystemAttributesVirtualNetworkCard(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualNetworkCardRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesVirtualNetworkCard</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNetworkCard/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesVirtualNetworkCardResponse> updateSystemAttributesVirtualNetworkCardWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualNetworkCardRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesVirtualNetworkCard</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesVirtualNetworkCardQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesVirtualNetworkCardResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNetworkCard/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesVirtualNetworkCardResponse updateSystemAttributesVirtualNetworkCard(@Param("elid") String elid, UpdateSystemAttributesVirtualNetworkCardRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualNetworkCardQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesVirtualNetworkCard</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesVirtualNetworkCardResponse
      */
      @RequestLine("POST /api/rest/entity/virtualNetworkCard/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesVirtualNetworkCardResponse> updateSystemAttributesVirtualNetworkCardWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesVirtualNetworkCardRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualNetworkCardQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesVirtualNetworkCard</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesVirtualNetworkCardQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesVirtualNetworkCardQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return VirtualNetworkCardQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNetworkCard/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNetworkCardQueryResponse virtualNetworkCardQuery(@Param("sessionId") String sessionId, VirtualNetworkCardQueryRequest body);

  /**
   * Basic query
   * Similar to <code>virtualNetworkCardQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNetworkCard/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNetworkCardQueryResponse> virtualNetworkCardQueryWithHttpInfo(@Param("sessionId") String sessionId, VirtualNetworkCardQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>virtualNetworkCardQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNetworkCardQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNetworkCardQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNetworkCard/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNetworkCardQueryResponse virtualNetworkCardQuery(VirtualNetworkCardQueryRequest body, @QueryMap(encoded=true) VirtualNetworkCardQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>virtualNetworkCardQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNetworkCardQueryResponse
      */
      @RequestLine("POST /api/rest/entity/virtualNetworkCard/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNetworkCardQueryResponse> virtualNetworkCardQueryWithHttpInfo(VirtualNetworkCardQueryRequest body, @QueryMap(encoded=true) VirtualNetworkCardQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNetworkCardQuery</code> method in a fluent style.
   */
  public static class VirtualNetworkCardQueryQueryParams extends HashMap<String, Object> {
    public VirtualNetworkCardQueryQueryParams sessionId(final String value) {
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
   * @return VirtualNetworkCardSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNetworkCard/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNetworkCardSystemAttributesResponse virtualNetworkCardSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNetworkCardSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>virtualNetworkCardSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNetworkCard/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNetworkCardSystemAttributesResponse> virtualNetworkCardSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNetworkCardSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>virtualNetworkCardSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNetworkCardSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNetworkCardSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualNetworkCard/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNetworkCardSystemAttributesResponse virtualNetworkCardSystemAttributes(@Param("elid") String elid, VirtualNetworkCardSystemAttributesRequest body, @QueryMap(encoded=true) VirtualNetworkCardSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>virtualNetworkCardSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNetworkCardSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualNetworkCard/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNetworkCardSystemAttributesResponse> virtualNetworkCardSystemAttributesWithHttpInfo(@Param("elid") String elid, VirtualNetworkCardSystemAttributesRequest body, @QueryMap(encoded=true) VirtualNetworkCardSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNetworkCardSystemAttributes</code> method in a fluent style.
   */
  public static class VirtualNetworkCardSystemAttributesQueryParams extends HashMap<String, Object> {
    public VirtualNetworkCardSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VirtualNetworkCardVirtualServerResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNetworkCard/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualNetworkCardVirtualServerResponseData virtualNetworkCardVirtualServer(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNetworkCardVirtualServerRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>virtualNetworkCardVirtualServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualNetworkCard/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualNetworkCardVirtualServerResponseData> virtualNetworkCardVirtualServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualNetworkCardVirtualServerRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>virtualNetworkCardVirtualServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualNetworkCardVirtualServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualNetworkCardVirtualServerResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualNetworkCard/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualNetworkCardVirtualServerResponseData virtualNetworkCardVirtualServer(@Param("elid") String elid, VirtualNetworkCardVirtualServerRequestData body, @QueryMap(encoded=true) VirtualNetworkCardVirtualServerQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>virtualNetworkCardVirtualServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualNetworkCardVirtualServerResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualNetworkCard/{elid}/VirtualServer?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualNetworkCardVirtualServerResponseData> virtualNetworkCardVirtualServerWithHttpInfo(@Param("elid") String elid, VirtualNetworkCardVirtualServerRequestData body, @QueryMap(encoded=true) VirtualNetworkCardVirtualServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualNetworkCardVirtualServer</code> method in a fluent style.
   */
  public static class VirtualNetworkCardVirtualServerQueryParams extends HashMap<String, Object> {
    public VirtualNetworkCardVirtualServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
