package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualDriveRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVirtualDriveResponse;
import com.fntsoftware.businessgateway.entities.VirtualDriveQueryRequest;
import com.fntsoftware.businessgateway.entities.VirtualDriveQueryResponse;
import com.fntsoftware.businessgateway.entities.VirtualDriveSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.VirtualDriveSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.VirtualDriveVirtualServerRequestData;
import com.fntsoftware.businessgateway.entities.VirtualDriveVirtualServerResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface VirtualDriveApi extends ApiClient.Api {


  /**
   * Change system attributes
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSystemAttributesVirtualDriveResponse
   */
  @RequestLine("POST /api/rest/entity/virtualDrive/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesVirtualDriveResponse updateSystemAttributesVirtualDrive(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualDriveRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesVirtualDrive</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualDrive/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesVirtualDriveResponse> updateSystemAttributesVirtualDriveWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVirtualDriveRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesVirtualDrive</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesVirtualDriveQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesVirtualDriveResponse
   */
  @RequestLine("POST /api/rest/entity/virtualDrive/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesVirtualDriveResponse updateSystemAttributesVirtualDrive(@Param("elid") String elid, UpdateSystemAttributesVirtualDriveRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualDriveQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesVirtualDrive</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesVirtualDriveResponse
      */
      @RequestLine("POST /api/rest/entity/virtualDrive/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesVirtualDriveResponse> updateSystemAttributesVirtualDriveWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesVirtualDriveRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVirtualDriveQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesVirtualDrive</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesVirtualDriveQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesVirtualDriveQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return VirtualDriveQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualDrive/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualDriveQueryResponse virtualDriveQuery(@Param("sessionId") String sessionId, VirtualDriveQueryRequest body);

  /**
   * Basic query
   * Similar to <code>virtualDriveQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualDrive/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualDriveQueryResponse> virtualDriveQueryWithHttpInfo(@Param("sessionId") String sessionId, VirtualDriveQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>virtualDriveQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualDriveQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualDriveQueryResponse
   */
  @RequestLine("POST /api/rest/entity/virtualDrive/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualDriveQueryResponse virtualDriveQuery(VirtualDriveQueryRequest body, @QueryMap(encoded=true) VirtualDriveQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>virtualDriveQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualDriveQueryResponse
      */
      @RequestLine("POST /api/rest/entity/virtualDrive/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualDriveQueryResponse> virtualDriveQueryWithHttpInfo(VirtualDriveQueryRequest body, @QueryMap(encoded=true) VirtualDriveQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualDriveQuery</code> method in a fluent style.
   */
  public static class VirtualDriveQueryQueryParams extends HashMap<String, Object> {
    public VirtualDriveQueryQueryParams sessionId(final String value) {
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
   * @return VirtualDriveSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualDrive/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualDriveSystemAttributesResponse virtualDriveSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualDriveSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>virtualDriveSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualDrive/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualDriveSystemAttributesResponse> virtualDriveSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualDriveSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>virtualDriveSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualDriveSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualDriveSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/virtualDrive/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualDriveSystemAttributesResponse virtualDriveSystemAttributes(@Param("elid") String elid, VirtualDriveSystemAttributesRequest body, @QueryMap(encoded=true) VirtualDriveSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>virtualDriveSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualDriveSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/virtualDrive/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualDriveSystemAttributesResponse> virtualDriveSystemAttributesWithHttpInfo(@Param("elid") String elid, VirtualDriveSystemAttributesRequest body, @QueryMap(encoded=true) VirtualDriveSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualDriveSystemAttributes</code> method in a fluent style.
   */
  public static class VirtualDriveSystemAttributesQueryParams extends HashMap<String, Object> {
    public VirtualDriveSystemAttributesQueryParams sessionId(final String value) {
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
   * @return VirtualDriveVirtualServerResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualDrive/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VirtualDriveVirtualServerResponseData virtualDriveVirtualServer(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualDriveVirtualServerRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>virtualDriveVirtualServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/virtualDrive/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VirtualDriveVirtualServerResponseData> virtualDriveVirtualServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VirtualDriveVirtualServerRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>virtualDriveVirtualServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VirtualDriveVirtualServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VirtualDriveVirtualServerResponseData
   */
  @RequestLine("POST /api/rest/entity/virtualDrive/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VirtualDriveVirtualServerResponseData virtualDriveVirtualServer(@Param("elid") String elid, VirtualDriveVirtualServerRequestData body, @QueryMap(encoded=true) VirtualDriveVirtualServerQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>virtualDriveVirtualServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VirtualDriveVirtualServerResponseData
      */
      @RequestLine("POST /api/rest/entity/virtualDrive/{elid}/VirtualServer?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VirtualDriveVirtualServerResponseData> virtualDriveVirtualServerWithHttpInfo(@Param("elid") String elid, VirtualDriveVirtualServerRequestData body, @QueryMap(encoded=true) VirtualDriveVirtualServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>virtualDriveVirtualServer</code> method in a fluent style.
   */
  public static class VirtualDriveVirtualServerQueryParams extends HashMap<String, Object> {
    public VirtualDriveVirtualServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
