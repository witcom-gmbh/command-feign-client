package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateBulkUniqueIdHierarchyUniqueIdHierarchyRequestData;
import com.fntsoftware.businessgateway.entities.CreateBulkUniqueIdHierarchyUniqueIdHierarchyResponse;
import com.fntsoftware.businessgateway.entities.CreateUniqueIdHierarchyRequestData;
import com.fntsoftware.businessgateway.entities.CreateUniqueIdHierarchyResponse;
import com.fntsoftware.businessgateway.entities.DeleteUniqueIdHierarchyRequestData;
import com.fntsoftware.businessgateway.entities.DeleteUniqueIdHierarchyResponse;
import com.fntsoftware.businessgateway.entities.UniqueIdHierarchyQueryRequest;
import com.fntsoftware.businessgateway.entities.UniqueIdHierarchyQueryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface UniqueIdHierarchyApi extends ApiClient.Api {


  /**
   * Create bulk for unique ID hierarchy
   * Create bulk unique ID hierarchy
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateBulkUniqueIdHierarchyUniqueIdHierarchyResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/createBulkUniqueIdHierarchy?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateBulkUniqueIdHierarchyUniqueIdHierarchyResponse createBulkUniqueIdHierarchyUniqueIdHierarchy(@Param("sessionId") String sessionId, CreateBulkUniqueIdHierarchyUniqueIdHierarchyRequestData body);

  /**
   * Create bulk for unique ID hierarchy
   * Similar to <code>createBulkUniqueIdHierarchyUniqueIdHierarchy</code> but it also returns the http response headers .
   * Create bulk unique ID hierarchy
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/createBulkUniqueIdHierarchy?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateBulkUniqueIdHierarchyUniqueIdHierarchyResponse> createBulkUniqueIdHierarchyUniqueIdHierarchyWithHttpInfo(@Param("sessionId") String sessionId, CreateBulkUniqueIdHierarchyUniqueIdHierarchyRequestData body);


  /**
   * Create bulk for unique ID hierarchy
   * Create bulk unique ID hierarchy
   * Note, this is equivalent to the other <code>createBulkUniqueIdHierarchyUniqueIdHierarchy</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateBulkUniqueIdHierarchyUniqueIdHierarchyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateBulkUniqueIdHierarchyUniqueIdHierarchyResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/createBulkUniqueIdHierarchy?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateBulkUniqueIdHierarchyUniqueIdHierarchyResponse createBulkUniqueIdHierarchyUniqueIdHierarchy(CreateBulkUniqueIdHierarchyUniqueIdHierarchyRequestData body, @QueryMap(encoded=true) CreateBulkUniqueIdHierarchyUniqueIdHierarchyQueryParams queryParams);

  /**
  * Create bulk for unique ID hierarchy
  * Create bulk unique ID hierarchy
  * Note, this is equivalent to the other <code>createBulkUniqueIdHierarchyUniqueIdHierarchy</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateBulkUniqueIdHierarchyUniqueIdHierarchyResponse
      */
      @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/createBulkUniqueIdHierarchy?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateBulkUniqueIdHierarchyUniqueIdHierarchyResponse> createBulkUniqueIdHierarchyUniqueIdHierarchyWithHttpInfo(CreateBulkUniqueIdHierarchyUniqueIdHierarchyRequestData body, @QueryMap(encoded=true) CreateBulkUniqueIdHierarchyUniqueIdHierarchyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createBulkUniqueIdHierarchyUniqueIdHierarchy</code> method in a fluent style.
   */
  public static class CreateBulkUniqueIdHierarchyUniqueIdHierarchyQueryParams extends HashMap<String, Object> {
    public CreateBulkUniqueIdHierarchyUniqueIdHierarchyQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Unique ID hierarchy
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateUniqueIdHierarchyResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateUniqueIdHierarchyResponse createUniqueIdHierarchy(@Param("sessionId") String sessionId, CreateUniqueIdHierarchyRequestData body);

  /**
   * Create
   * Similar to <code>createUniqueIdHierarchy</code> but it also returns the http response headers .
   * Create Unique ID hierarchy
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateUniqueIdHierarchyResponse> createUniqueIdHierarchyWithHttpInfo(@Param("sessionId") String sessionId, CreateUniqueIdHierarchyRequestData body);


  /**
   * Create
   * Create Unique ID hierarchy
   * Note, this is equivalent to the other <code>createUniqueIdHierarchy</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateUniqueIdHierarchyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateUniqueIdHierarchyResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateUniqueIdHierarchyResponse createUniqueIdHierarchy(CreateUniqueIdHierarchyRequestData body, @QueryMap(encoded=true) CreateUniqueIdHierarchyQueryParams queryParams);

  /**
  * Create
  * Create Unique ID hierarchy
  * Note, this is equivalent to the other <code>createUniqueIdHierarchy</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateUniqueIdHierarchyResponse
      */
      @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateUniqueIdHierarchyResponse> createUniqueIdHierarchyWithHttpInfo(CreateUniqueIdHierarchyRequestData body, @QueryMap(encoded=true) CreateUniqueIdHierarchyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createUniqueIdHierarchy</code> method in a fluent style.
   */
  public static class CreateUniqueIdHierarchyQueryParams extends HashMap<String, Object> {
    public CreateUniqueIdHierarchyQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Unique ID hierarchy
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DeleteUniqueIdHierarchyResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteUniqueIdHierarchyResponse deleteUniqueIdHierarchy(@Param("sessionId") String sessionId, DeleteUniqueIdHierarchyRequestData body);

  /**
   * Delete
   * Similar to <code>deleteUniqueIdHierarchy</code> but it also returns the http response headers .
   * Delete Unique ID hierarchy
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteUniqueIdHierarchyResponse> deleteUniqueIdHierarchyWithHttpInfo(@Param("sessionId") String sessionId, DeleteUniqueIdHierarchyRequestData body);


  /**
   * Delete
   * Delete Unique ID hierarchy
   * Note, this is equivalent to the other <code>deleteUniqueIdHierarchy</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteUniqueIdHierarchyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteUniqueIdHierarchyResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteUniqueIdHierarchyResponse deleteUniqueIdHierarchy(DeleteUniqueIdHierarchyRequestData body, @QueryMap(encoded=true) DeleteUniqueIdHierarchyQueryParams queryParams);

  /**
  * Delete
  * Delete Unique ID hierarchy
  * Note, this is equivalent to the other <code>deleteUniqueIdHierarchy</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteUniqueIdHierarchyResponse
      */
      @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteUniqueIdHierarchyResponse> deleteUniqueIdHierarchyWithHttpInfo(DeleteUniqueIdHierarchyRequestData body, @QueryMap(encoded=true) DeleteUniqueIdHierarchyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteUniqueIdHierarchy</code> method in a fluent style.
   */
  public static class DeleteUniqueIdHierarchyQueryParams extends HashMap<String, Object> {
    public DeleteUniqueIdHierarchyQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return UniqueIdHierarchyQueryResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UniqueIdHierarchyQueryResponse uniqueIdHierarchyQuery(@Param("sessionId") String sessionId, UniqueIdHierarchyQueryRequest body);

  /**
   * Basic query
   * Similar to <code>uniqueIdHierarchyQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UniqueIdHierarchyQueryResponse> uniqueIdHierarchyQueryWithHttpInfo(@Param("sessionId") String sessionId, UniqueIdHierarchyQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>uniqueIdHierarchyQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UniqueIdHierarchyQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UniqueIdHierarchyQueryResponse
   */
  @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UniqueIdHierarchyQueryResponse uniqueIdHierarchyQuery(UniqueIdHierarchyQueryRequest body, @QueryMap(encoded=true) UniqueIdHierarchyQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>uniqueIdHierarchyQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UniqueIdHierarchyQueryResponse
      */
      @RequestLine("POST /api/rest/entity/uniqueIdHierarchy/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UniqueIdHierarchyQueryResponse> uniqueIdHierarchyQueryWithHttpInfo(UniqueIdHierarchyQueryRequest body, @QueryMap(encoded=true) UniqueIdHierarchyQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>uniqueIdHierarchyQuery</code> method in a fluent style.
   */
  public static class UniqueIdHierarchyQueryQueryParams extends HashMap<String, Object> {
    public UniqueIdHierarchyQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
