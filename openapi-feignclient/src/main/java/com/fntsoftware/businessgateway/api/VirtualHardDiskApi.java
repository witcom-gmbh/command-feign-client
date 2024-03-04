package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualHardDiskRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualHardDiskResponse;
import com.fntsoftware.businessgateway.entities.VirtualHardDiskQueryRequest;
import com.fntsoftware.businessgateway.entities.VirtualHardDiskQueryResponse;
import com.fntsoftware.businessgateway.entities.VirtualHardDiskSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.VirtualHardDiskSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.VirtualHardDiskVirtualServerRequestData;
import com.fntsoftware.businessgateway.entities.VirtualHardDiskVirtualServerResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface VirtualHardDiskApi extends ApiClient.Api {


  /**
   * Change system attributes
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSystemAttributesVirtualHardDiskResponse
   */
  @RequestLine("POST /api/rest/entity/virtualHardDisk/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesVirtualHardDiskResponse updateSystemAttributesVirtualHardDisk(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualHardDiskRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesVirtualHardDisk</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualHardDisk/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesVirtualHardDiskResponse> updateSystemAttributesVirtualHardDiskWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualHardDiskRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesVirtualHardDisk</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesVirtualHardDiskQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesVirtualHardDiskResponse
   */
  @RequestLine("POST /api/rest/entity/virtualHardDisk/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesVirtualHardDiskResponse updateSystemAttributesVirtualHardDisk(@Param("elid") String elid, UpdateSystemAttributesVirtualHardDiskRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualHardDiskQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesVirtualHardDisk</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesVirtualHardDiskResponse
      */
      @RequestLine("POST /api/rest/entity/virtualHardDisk/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesVirtualHardDiskResponse> updateSystemAttributesVirtualHardDiskWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesVirtualHardDiskRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualHardDiskQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesVirtualHardDisk</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesVirtualHardDiskQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesVirtualHardDiskQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return VirtualHardDiskQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualHardDisk/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualHardDiskQueryResponse virtualHardDiskQuery(@Param("sessionId") String sessionId, VirtualHardDiskQueryRequest body);

  /**
   * Basic query
   * Similar to <code>virtualHardDiskQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualHardDisk/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualHardDiskQueryResponse> virtualHardDiskQueryWithHttpInfo(@Param("sessionId") String sessionId, VirtualHardDiskQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>virtualHardDiskQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualHardDiskQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualHardDiskQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualHardDisk/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualHardDiskQueryResponse virtualHardDiskQuery(VirtualHardDiskQueryRequest body, @QueryMap(encoded=true) VirtualHardDiskQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>virtualHardDiskQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualHardDiskQueryResponse
      */
      @RequestLine("POST /api/rest/entity/virtualHardDisk/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualHardDiskQueryResponse> virtualHardDiskQueryWithHttpInfo(VirtualHardDiskQueryRequest body, @QueryMap(encoded=true) VirtualHardDiskQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualHardDiskQuery</code> method in a fluent style.
   */
  public static class VirtualHardDiskQueryQueryParams extends HashMap<String, Object> {
    public VirtualHardDiskQueryQueryParams sessionId(final String value) {
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
   * @return VirtualHardDiskSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualHardDisk/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualHardDiskSystemAttributesResponse virtualHardDiskSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualHardDiskSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>virtualHardDiskSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualHardDisk/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualHardDiskSystemAttributesResponse> virtualHardDiskSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualHardDiskSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>virtualHardDiskSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualHardDiskSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualHardDiskSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualHardDisk/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualHardDiskSystemAttributesResponse virtualHardDiskSystemAttributes(@Param("elid") String elid, VirtualHardDiskSystemAttributesRequest body, @QueryMap(encoded=true) VirtualHardDiskSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>virtualHardDiskSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualHardDiskSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualHardDisk/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualHardDiskSystemAttributesResponse> virtualHardDiskSystemAttributesWithHttpInfo(@Param("elid") String elid, VirtualHardDiskSystemAttributesRequest body, @QueryMap(encoded=true) VirtualHardDiskSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualHardDiskSystemAttributes</code> method in a fluent style.
   */
  public static class VirtualHardDiskSystemAttributesQueryParams extends HashMap<String, Object> {
    public VirtualHardDiskSystemAttributesQueryParams sessionId(final String value) {
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
   * @return VirtualHardDiskVirtualServerResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualHardDisk/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualHardDiskVirtualServerResponseData virtualHardDiskVirtualServer(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualHardDiskVirtualServerRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>virtualHardDiskVirtualServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualHardDisk/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualHardDiskVirtualServerResponseData> virtualHardDiskVirtualServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualHardDiskVirtualServerRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>virtualHardDiskVirtualServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualHardDiskVirtualServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualHardDiskVirtualServerResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualHardDisk/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualHardDiskVirtualServerResponseData virtualHardDiskVirtualServer(@Param("elid") String elid, VirtualHardDiskVirtualServerRequestData body, @QueryMap(encoded=true) VirtualHardDiskVirtualServerQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>virtualHardDiskVirtualServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualHardDiskVirtualServerResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualHardDisk/{elid}/VirtualServer?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualHardDiskVirtualServerResponseData> virtualHardDiskVirtualServerWithHttpInfo(@Param("elid") String elid, VirtualHardDiskVirtualServerRequestData body, @QueryMap(encoded=true) VirtualHardDiskVirtualServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualHardDiskVirtualServer</code> method in a fluent style.
   */
  public static class VirtualHardDiskVirtualServerQueryParams extends HashMap<String, Object> {
    public VirtualHardDiskVirtualServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
