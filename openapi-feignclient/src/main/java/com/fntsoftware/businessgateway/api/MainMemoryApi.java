package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateMainMemoryRequestData;
import com.fntsoftware.businessgateway.entities.CreateMainMemoryResponse;
import com.fntsoftware.businessgateway.entities.DeleteMainMemoryRequestData;
import com.fntsoftware.businessgateway.entities.DeleteMainMemoryResponse;
import com.fntsoftware.businessgateway.entities.MainMemoryQueryRequest;
import com.fntsoftware.businessgateway.entities.MainMemoryQueryResponse;
import com.fntsoftware.businessgateway.entities.MainMemoryServerRequestData;
import com.fntsoftware.businessgateway.entities.MainMemoryServerResponseData;
import com.fntsoftware.businessgateway.entities.MainMemorySystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.MainMemorySystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateMainMemoryRequestData;
import com.fntsoftware.businessgateway.entities.UpdateMainMemoryResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMainMemoryRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMainMemoryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface MainMemoryApi extends ApiClient.Api {


  /**
   * Create
   * Create main memory
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateMainMemoryResponse
   */
  @RequestLine("POST /api/rest/entity/mainMemory/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateMainMemoryResponse createMainMemory(@Param("sessionId") String sessionId, CreateMainMemoryRequestData body);

  /**
   * Create
   * Similar to <code>createMainMemory</code> but it also returns the http response headers .
   * Create main memory
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mainMemory/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateMainMemoryResponse> createMainMemoryWithHttpInfo(@Param("sessionId") String sessionId, CreateMainMemoryRequestData body);


  /**
   * Create
   * Create main memory
   * Note, this is equivalent to the other <code>createMainMemory</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateMainMemoryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateMainMemoryResponse
   */
  @RequestLine("POST /api/rest/entity/mainMemory/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateMainMemoryResponse createMainMemory(CreateMainMemoryRequestData body, @QueryMap(encoded=true) CreateMainMemoryQueryParams queryParams);

  /**
  * Create
  * Create main memory
  * Note, this is equivalent to the other <code>createMainMemory</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateMainMemoryResponse
      */
      @RequestLine("POST /api/rest/entity/mainMemory/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateMainMemoryResponse> createMainMemoryWithHttpInfo(CreateMainMemoryRequestData body, @QueryMap(encoded=true) CreateMainMemoryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createMainMemory</code> method in a fluent style.
   */
  public static class CreateMainMemoryQueryParams extends HashMap<String, Object> {
    public CreateMainMemoryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete main memory
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteMainMemoryResponse
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteMainMemoryResponse deleteMainMemory(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteMainMemoryRequestData body);

  /**
   * Delete
   * Similar to <code>deleteMainMemory</code> but it also returns the http response headers .
   * Delete main memory
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteMainMemoryResponse> deleteMainMemoryWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteMainMemoryRequestData body);


  /**
   * Delete
   * Delete main memory
   * Note, this is equivalent to the other <code>deleteMainMemory</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMainMemoryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteMainMemoryResponse
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteMainMemoryResponse deleteMainMemory(@Param("elid") String elid, DeleteMainMemoryRequestData body, @QueryMap(encoded=true) DeleteMainMemoryQueryParams queryParams);

  /**
  * Delete
  * Delete main memory
  * Note, this is equivalent to the other <code>deleteMainMemory</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteMainMemoryResponse
      */
      @RequestLine("POST /api/rest/entity/mainMemory/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteMainMemoryResponse> deleteMainMemoryWithHttpInfo(@Param("elid") String elid, DeleteMainMemoryRequestData body, @QueryMap(encoded=true) DeleteMainMemoryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMainMemory</code> method in a fluent style.
   */
  public static class DeleteMainMemoryQueryParams extends HashMap<String, Object> {
    public DeleteMainMemoryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return MainMemoryQueryResponse
   */
  @RequestLine("POST /api/rest/entity/mainMemory/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MainMemoryQueryResponse mainMemoryQuery(@Param("sessionId") String sessionId, MainMemoryQueryRequest body);

  /**
   * Basic query
   * Similar to <code>mainMemoryQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mainMemory/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MainMemoryQueryResponse> mainMemoryQueryWithHttpInfo(@Param("sessionId") String sessionId, MainMemoryQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>mainMemoryQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MainMemoryQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MainMemoryQueryResponse
   */
  @RequestLine("POST /api/rest/entity/mainMemory/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MainMemoryQueryResponse mainMemoryQuery(MainMemoryQueryRequest body, @QueryMap(encoded=true) MainMemoryQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>mainMemoryQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MainMemoryQueryResponse
      */
      @RequestLine("POST /api/rest/entity/mainMemory/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MainMemoryQueryResponse> mainMemoryQueryWithHttpInfo(MainMemoryQueryRequest body, @QueryMap(encoded=true) MainMemoryQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mainMemoryQuery</code> method in a fluent style.
   */
  public static class MainMemoryQueryQueryParams extends HashMap<String, Object> {
    public MainMemoryQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MainMemoryServerResponseData
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MainMemoryServerResponseData mainMemoryServer(@Param("sessionId") String sessionId, @Param("elid") String elid, MainMemoryServerRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>mainMemoryServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MainMemoryServerResponseData> mainMemoryServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MainMemoryServerRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>mainMemoryServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MainMemoryServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MainMemoryServerResponseData
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/Server?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MainMemoryServerResponseData mainMemoryServer(@Param("elid") String elid, MainMemoryServerRequestData body, @QueryMap(encoded=true) MainMemoryServerQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>mainMemoryServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MainMemoryServerResponseData
      */
      @RequestLine("POST /api/rest/entity/mainMemory/{elid}/Server?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MainMemoryServerResponseData> mainMemoryServerWithHttpInfo(@Param("elid") String elid, MainMemoryServerRequestData body, @QueryMap(encoded=true) MainMemoryServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mainMemoryServer</code> method in a fluent style.
   */
  public static class MainMemoryServerQueryParams extends HashMap<String, Object> {
    public MainMemoryServerQueryParams sessionId(final String value) {
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
   * @return MainMemorySystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MainMemorySystemAttributesResponse mainMemorySystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, MainMemorySystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>mainMemorySystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MainMemorySystemAttributesResponse> mainMemorySystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MainMemorySystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>mainMemorySystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MainMemorySystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MainMemorySystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MainMemorySystemAttributesResponse mainMemorySystemAttributes(@Param("elid") String elid, MainMemorySystemAttributesRequest body, @QueryMap(encoded=true) MainMemorySystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>mainMemorySystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MainMemorySystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/mainMemory/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MainMemorySystemAttributesResponse> mainMemorySystemAttributesWithHttpInfo(@Param("elid") String elid, MainMemorySystemAttributesRequest body, @QueryMap(encoded=true) MainMemorySystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mainMemorySystemAttributes</code> method in a fluent style.
   */
  public static class MainMemorySystemAttributesQueryParams extends HashMap<String, Object> {
    public MainMemorySystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify main memory
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateMainMemoryResponse
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateMainMemoryResponse updateMainMemory(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateMainMemoryRequestData body);

  /**
   * Modify
   * Similar to <code>updateMainMemory</code> but it also returns the http response headers .
   * Modify main memory
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateMainMemoryResponse> updateMainMemoryWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateMainMemoryRequestData body);


  /**
   * Modify
   * Modify main memory
   * Note, this is equivalent to the other <code>updateMainMemory</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateMainMemoryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateMainMemoryResponse
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateMainMemoryResponse updateMainMemory(@Param("elid") String elid, UpdateMainMemoryRequestData body, @QueryMap(encoded=true) UpdateMainMemoryQueryParams queryParams);

  /**
  * Modify
  * Modify main memory
  * Note, this is equivalent to the other <code>updateMainMemory</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateMainMemoryResponse
      */
      @RequestLine("POST /api/rest/entity/mainMemory/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateMainMemoryResponse> updateMainMemoryWithHttpInfo(@Param("elid") String elid, UpdateMainMemoryRequestData body, @QueryMap(encoded=true) UpdateMainMemoryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateMainMemory</code> method in a fluent style.
   */
  public static class UpdateMainMemoryQueryParams extends HashMap<String, Object> {
    public UpdateMainMemoryQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesMainMemoryResponse
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesMainMemoryResponse updateSystemAttributesMainMemory(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMainMemoryRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesMainMemory</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesMainMemoryResponse> updateSystemAttributesMainMemoryWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMainMemoryRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesMainMemory</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesMainMemoryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesMainMemoryResponse
   */
  @RequestLine("POST /api/rest/entity/mainMemory/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesMainMemoryResponse updateSystemAttributesMainMemory(@Param("elid") String elid, UpdateSystemAttributesMainMemoryRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMainMemoryQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesMainMemory</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesMainMemoryResponse
      */
      @RequestLine("POST /api/rest/entity/mainMemory/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesMainMemoryResponse> updateSystemAttributesMainMemoryWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesMainMemoryRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMainMemoryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesMainMemory</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesMainMemoryQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesMainMemoryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
