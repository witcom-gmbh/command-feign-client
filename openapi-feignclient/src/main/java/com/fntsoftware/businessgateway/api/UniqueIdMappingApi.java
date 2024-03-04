package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateBulkUniqueIdMappingUniqueIdMappingRequestData;
import com.fntsoftware.businessgateway.entities.CreateBulkUniqueIdMappingUniqueIdMappingResponse;
import com.fntsoftware.businessgateway.entities.CreateUniqueIdMappingRequestData;
import com.fntsoftware.businessgateway.entities.CreateUniqueIdMappingResponse;
import com.fntsoftware.businessgateway.entities.DeleteUniqueIdMappingRequestData;
import com.fntsoftware.businessgateway.entities.DeleteUniqueIdMappingResponse;
import com.fntsoftware.businessgateway.entities.UniqueIdMappingQueryRequest;
import com.fntsoftware.businessgateway.entities.UniqueIdMappingQueryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface UniqueIdMappingApi extends ApiClient.Api {


  /**
   * Create bulk for unique ID assignment
   * Create bulk unique ID assignment
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateBulkUniqueIdMappingUniqueIdMappingResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdMapping/createBulkUniqueIdMapping?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateBulkUniqueIdMappingUniqueIdMappingResponse createBulkUniqueIdMappingUniqueIdMapping(@Param("sessionId") String sessionId, CreateBulkUniqueIdMappingUniqueIdMappingRequestData body);

  /**
   * Create bulk for unique ID assignment
   * Similar to <code>createBulkUniqueIdMappingUniqueIdMapping</code> but it also returns the http response headers .
   * Create bulk unique ID assignment
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/uniqueIdMapping/createBulkUniqueIdMapping?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateBulkUniqueIdMappingUniqueIdMappingResponse> createBulkUniqueIdMappingUniqueIdMappingWithHttpInfo(@Param("sessionId") String sessionId, CreateBulkUniqueIdMappingUniqueIdMappingRequestData body);


  /**
   * Create bulk for unique ID assignment
   * Create bulk unique ID assignment
   * Note, this is equivalent to the other <code>createBulkUniqueIdMappingUniqueIdMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateBulkUniqueIdMappingUniqueIdMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateBulkUniqueIdMappingUniqueIdMappingResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdMapping/createBulkUniqueIdMapping?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateBulkUniqueIdMappingUniqueIdMappingResponse createBulkUniqueIdMappingUniqueIdMapping(CreateBulkUniqueIdMappingUniqueIdMappingRequestData body, @QueryMap(encoded=true) CreateBulkUniqueIdMappingUniqueIdMappingQueryParams queryParams);

  /**
  * Create bulk for unique ID assignment
  * Create bulk unique ID assignment
  * Note, this is equivalent to the other <code>createBulkUniqueIdMappingUniqueIdMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateBulkUniqueIdMappingUniqueIdMappingResponse
      */
      @RequestLine("POST /api/rest/entity/uniqueIdMapping/createBulkUniqueIdMapping?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateBulkUniqueIdMappingUniqueIdMappingResponse> createBulkUniqueIdMappingUniqueIdMappingWithHttpInfo(CreateBulkUniqueIdMappingUniqueIdMappingRequestData body, @QueryMap(encoded=true) CreateBulkUniqueIdMappingUniqueIdMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createBulkUniqueIdMappingUniqueIdMapping</code> method in a fluent style.
   */
  public static class CreateBulkUniqueIdMappingUniqueIdMappingQueryParams extends HashMap<String, Object> {
    public CreateBulkUniqueIdMappingUniqueIdMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Unique ID mapping
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateUniqueIdMappingResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdMapping/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateUniqueIdMappingResponse createUniqueIdMapping(@Param("sessionId") String sessionId, CreateUniqueIdMappingRequestData body);

  /**
   * Create
   * Similar to <code>createUniqueIdMapping</code> but it also returns the http response headers .
   * Create Unique ID mapping
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/uniqueIdMapping/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateUniqueIdMappingResponse> createUniqueIdMappingWithHttpInfo(@Param("sessionId") String sessionId, CreateUniqueIdMappingRequestData body);


  /**
   * Create
   * Create Unique ID mapping
   * Note, this is equivalent to the other <code>createUniqueIdMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateUniqueIdMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateUniqueIdMappingResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdMapping/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateUniqueIdMappingResponse createUniqueIdMapping(CreateUniqueIdMappingRequestData body, @QueryMap(encoded=true) CreateUniqueIdMappingQueryParams queryParams);

  /**
  * Create
  * Create Unique ID mapping
  * Note, this is equivalent to the other <code>createUniqueIdMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateUniqueIdMappingResponse
      */
      @RequestLine("POST /api/rest/entity/uniqueIdMapping/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateUniqueIdMappingResponse> createUniqueIdMappingWithHttpInfo(CreateUniqueIdMappingRequestData body, @QueryMap(encoded=true) CreateUniqueIdMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createUniqueIdMapping</code> method in a fluent style.
   */
  public static class CreateUniqueIdMappingQueryParams extends HashMap<String, Object> {
    public CreateUniqueIdMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Unique ID mapping
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeleteUniqueIdMappingResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdMapping/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteUniqueIdMappingResponse deleteUniqueIdMapping(@Param("sessionId") String sessionId, DeleteUniqueIdMappingRequestData body);

  /**
   * Delete
   * Similar to <code>deleteUniqueIdMapping</code> but it also returns the http response headers .
   * Delete Unique ID mapping
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/uniqueIdMapping/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteUniqueIdMappingResponse> deleteUniqueIdMappingWithHttpInfo(@Param("sessionId") String sessionId, DeleteUniqueIdMappingRequestData body);


  /**
   * Delete
   * Delete Unique ID mapping
   * Note, this is equivalent to the other <code>deleteUniqueIdMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteUniqueIdMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteUniqueIdMappingResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdMapping/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteUniqueIdMappingResponse deleteUniqueIdMapping(DeleteUniqueIdMappingRequestData body, @QueryMap(encoded=true) DeleteUniqueIdMappingQueryParams queryParams);

  /**
  * Delete
  * Delete Unique ID mapping
  * Note, this is equivalent to the other <code>deleteUniqueIdMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteUniqueIdMappingResponse
      */
      @RequestLine("POST /api/rest/entity/uniqueIdMapping/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteUniqueIdMappingResponse> deleteUniqueIdMappingWithHttpInfo(DeleteUniqueIdMappingRequestData body, @QueryMap(encoded=true) DeleteUniqueIdMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteUniqueIdMapping</code> method in a fluent style.
   */
  public static class DeleteUniqueIdMappingQueryParams extends HashMap<String, Object> {
    public DeleteUniqueIdMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return UniqueIdMappingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdMapping/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UniqueIdMappingQueryResponse uniqueIdMappingQuery(@Param("sessionId") String sessionId, UniqueIdMappingQueryRequest body);

  /**
   * Basic query
   * Similar to <code>uniqueIdMappingQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/uniqueIdMapping/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UniqueIdMappingQueryResponse> uniqueIdMappingQueryWithHttpInfo(@Param("sessionId") String sessionId, UniqueIdMappingQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>uniqueIdMappingQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UniqueIdMappingQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UniqueIdMappingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdMapping/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UniqueIdMappingQueryResponse uniqueIdMappingQuery(UniqueIdMappingQueryRequest body, @QueryMap(encoded=true) UniqueIdMappingQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>uniqueIdMappingQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UniqueIdMappingQueryResponse
      */
      @RequestLine("POST /api/rest/entity/uniqueIdMapping/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UniqueIdMappingQueryResponse> uniqueIdMappingQueryWithHttpInfo(UniqueIdMappingQueryRequest body, @QueryMap(encoded=true) UniqueIdMappingQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>uniqueIdMappingQuery</code> method in a fluent style.
   */
  public static class UniqueIdMappingQueryQueryParams extends HashMap<String, Object> {
    public UniqueIdMappingQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
