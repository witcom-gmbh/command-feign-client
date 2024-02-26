package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSwMappingRequestData;
import com.fntsoftware.businessgateway.entities.CreateSwMappingResponse;
import com.fntsoftware.businessgateway.entities.DeleteSwMappingRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSwMappingResponse;
import com.fntsoftware.businessgateway.entities.SwMappingQueryRequest;
import com.fntsoftware.businessgateway.entities.SwMappingQueryResponse;
import com.fntsoftware.businessgateway.entities.SwMappingSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SwMappingSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSwMappingRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSwMappingResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwMappingRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwMappingResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface SwMappingApi extends ApiClient.Api {


  /**
   * Create
   * Create Software Mapping
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSwMappingResponse
   */
  @RequestLine("POST /api/rest/entity/swMapping/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSwMappingResponse createSwMapping(@Param("sessionId") String sessionId, CreateSwMappingRequestData body);

  /**
   * Create
   * Similar to <code>createSwMapping</code> but it also returns the http response headers .
   * Create Software Mapping
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/swMapping/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSwMappingResponse> createSwMappingWithHttpInfo(@Param("sessionId") String sessionId, CreateSwMappingRequestData body);


  /**
   * Create
   * Create Software Mapping
   * Note, this is equivalent to the other <code>createSwMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSwMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSwMappingResponse
   */
  @RequestLine("POST /api/rest/entity/swMapping/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSwMappingResponse createSwMapping(CreateSwMappingRequestData body, @QueryMap(encoded=true) CreateSwMappingQueryParams queryParams);

  /**
  * Create
  * Create Software Mapping
  * Note, this is equivalent to the other <code>createSwMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSwMappingResponse
      */
      @RequestLine("POST /api/rest/entity/swMapping/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSwMappingResponse> createSwMappingWithHttpInfo(CreateSwMappingRequestData body, @QueryMap(encoded=true) CreateSwMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSwMapping</code> method in a fluent style.
   */
  public static class CreateSwMappingQueryParams extends HashMap<String, Object> {
    public CreateSwMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Software Mapping
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSwMappingResponse
   */
  @RequestLine("POST /api/rest/entity/swMapping/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSwMappingResponse deleteSwMapping(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSwMappingRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSwMapping</code> but it also returns the http response headers .
   * Delete Software Mapping
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/swMapping/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSwMappingResponse> deleteSwMappingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSwMappingRequestData body);


  /**
   * Delete
   * Delete Software Mapping
   * Note, this is equivalent to the other <code>deleteSwMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSwMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSwMappingResponse
   */
  @RequestLine("POST /api/rest/entity/swMapping/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSwMappingResponse deleteSwMapping(@Param("elid") String elid, DeleteSwMappingRequestData body, @QueryMap(encoded=true) DeleteSwMappingQueryParams queryParams);

  /**
  * Delete
  * Delete Software Mapping
  * Note, this is equivalent to the other <code>deleteSwMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSwMappingResponse
      */
      @RequestLine("POST /api/rest/entity/swMapping/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSwMappingResponse> deleteSwMappingWithHttpInfo(@Param("elid") String elid, DeleteSwMappingRequestData body, @QueryMap(encoded=true) DeleteSwMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSwMapping</code> method in a fluent style.
   */
  public static class DeleteSwMappingQueryParams extends HashMap<String, Object> {
    public DeleteSwMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SwMappingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/swMapping/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwMappingQueryResponse swMappingQuery(@Param("sessionId") String sessionId, SwMappingQueryRequest body);

  /**
   * Basic query
   * Similar to <code>swMappingQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/swMapping/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwMappingQueryResponse> swMappingQueryWithHttpInfo(@Param("sessionId") String sessionId, SwMappingQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data
   * Note, this is equivalent to the other <code>swMappingQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwMappingQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwMappingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/swMapping/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwMappingQueryResponse swMappingQuery(SwMappingQueryRequest body, @QueryMap(encoded=true) SwMappingQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data
  * Note, this is equivalent to the other <code>swMappingQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwMappingQueryResponse
      */
      @RequestLine("POST /api/rest/entity/swMapping/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwMappingQueryResponse> swMappingQueryWithHttpInfo(SwMappingQueryRequest body, @QueryMap(encoded=true) SwMappingQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>swMappingQuery</code> method in a fluent style.
   */
  public static class SwMappingQueryQueryParams extends HashMap<String, Object> {
    public SwMappingQueryQueryParams sessionId(final String value) {
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
   * @return SwMappingSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/swMapping/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwMappingSystemAttributesResponse swMappingSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SwMappingSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>swMappingSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/swMapping/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwMappingSystemAttributesResponse> swMappingSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwMappingSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>swMappingSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwMappingSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwMappingSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/swMapping/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwMappingSystemAttributesResponse swMappingSystemAttributes(@Param("elid") String elid, SwMappingSystemAttributesRequest body, @QueryMap(encoded=true) SwMappingSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>swMappingSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwMappingSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/swMapping/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwMappingSystemAttributesResponse> swMappingSystemAttributesWithHttpInfo(@Param("elid") String elid, SwMappingSystemAttributesRequest body, @QueryMap(encoded=true) SwMappingSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>swMappingSystemAttributes</code> method in a fluent style.
   */
  public static class SwMappingSystemAttributesQueryParams extends HashMap<String, Object> {
    public SwMappingSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Software Mapping
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSwMappingResponse
   */
  @RequestLine("POST /api/rest/entity/swMapping/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSwMappingResponse updateSwMapping(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSwMappingRequestData body);

  /**
   * Modify
   * Similar to <code>updateSwMapping</code> but it also returns the http response headers .
   * Modify Software Mapping
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/swMapping/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSwMappingResponse> updateSwMappingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSwMappingRequestData body);


  /**
   * Modify
   * Modify Software Mapping
   * Note, this is equivalent to the other <code>updateSwMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSwMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSwMappingResponse
   */
  @RequestLine("POST /api/rest/entity/swMapping/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSwMappingResponse updateSwMapping(@Param("elid") String elid, UpdateSwMappingRequestData body, @QueryMap(encoded=true) UpdateSwMappingQueryParams queryParams);

  /**
  * Modify
  * Modify Software Mapping
  * Note, this is equivalent to the other <code>updateSwMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSwMappingResponse
      */
      @RequestLine("POST /api/rest/entity/swMapping/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSwMappingResponse> updateSwMappingWithHttpInfo(@Param("elid") String elid, UpdateSwMappingRequestData body, @QueryMap(encoded=true) UpdateSwMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSwMapping</code> method in a fluent style.
   */
  public static class UpdateSwMappingQueryParams extends HashMap<String, Object> {
    public UpdateSwMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Change system attributes
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSystemAttributesSwMappingResponse
   */
  @RequestLine("POST /api/rest/entity/swMapping/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSwMappingResponse updateSystemAttributesSwMapping(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSwMappingRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSwMapping</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/swMapping/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSwMappingResponse> updateSystemAttributesSwMappingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSwMappingRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSwMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSwMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSwMappingResponse
   */
  @RequestLine("POST /api/rest/entity/swMapping/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSwMappingResponse updateSystemAttributesSwMapping(@Param("elid") String elid, UpdateSystemAttributesSwMappingRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSwMappingQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSwMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSwMappingResponse
      */
      @RequestLine("POST /api/rest/entity/swMapping/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSwMappingResponse> updateSystemAttributesSwMappingWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSwMappingRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSwMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSwMapping</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSwMappingQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSwMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
