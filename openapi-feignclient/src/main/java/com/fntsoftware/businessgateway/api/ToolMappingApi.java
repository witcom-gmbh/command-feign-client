package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateToolMappingRequestData;
import com.fntsoftware.businessgateway.entities.CreateToolMappingResponse;
import com.fntsoftware.businessgateway.entities.DeleteToolMappingRequestData;
import com.fntsoftware.businessgateway.entities.DeleteToolMappingResponse;
import com.fntsoftware.businessgateway.entities.ToolMappingQueryMappingValuesRequest;
import com.fntsoftware.businessgateway.entities.ToolMappingQueryMappingValuesResponse;
import com.fntsoftware.businessgateway.entities.ToolMappingQueryRequest;
import com.fntsoftware.businessgateway.entities.ToolMappingQueryResponse;
import com.fntsoftware.businessgateway.entities.ToolMappingSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ToolMappingSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesToolMappingRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesToolMappingResponse;
import com.fntsoftware.businessgateway.entities.UpdateToolMappingRequestData;
import com.fntsoftware.businessgateway.entities.UpdateToolMappingResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ToolMappingApi extends ApiClient.Api {


  /**
   * Create
   * Create Mappings
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateToolMappingResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateToolMappingResponse createToolMapping(@Param("sessionId") String sessionId, CreateToolMappingRequestData body);

  /**
   * Create
   * Similar to <code>createToolMapping</code> but it also returns the http response headers .
   * Create Mappings
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/toolMapping/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateToolMappingResponse> createToolMappingWithHttpInfo(@Param("sessionId") String sessionId, CreateToolMappingRequestData body);


  /**
   * Create
   * Create Mappings
   * Note, this is equivalent to the other <code>createToolMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateToolMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateToolMappingResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateToolMappingResponse createToolMapping(CreateToolMappingRequestData body, @QueryMap(encoded=true) CreateToolMappingQueryParams queryParams);

  /**
  * Create
  * Create Mappings
  * Note, this is equivalent to the other <code>createToolMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateToolMappingResponse
      */
      @RequestLine("POST /api/rest/entity/toolMapping/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateToolMappingResponse> createToolMappingWithHttpInfo(CreateToolMappingRequestData body, @QueryMap(encoded=true) CreateToolMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createToolMapping</code> method in a fluent style.
   */
  public static class CreateToolMappingQueryParams extends HashMap<String, Object> {
    public CreateToolMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Mappings
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteToolMappingResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteToolMappingResponse deleteToolMapping(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteToolMappingRequestData body);

  /**
   * Delete
   * Similar to <code>deleteToolMapping</code> but it also returns the http response headers .
   * Delete Mappings
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/toolMapping/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteToolMappingResponse> deleteToolMappingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteToolMappingRequestData body);


  /**
   * Delete
   * Delete Mappings
   * Note, this is equivalent to the other <code>deleteToolMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteToolMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteToolMappingResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteToolMappingResponse deleteToolMapping(@Param("elid") String elid, DeleteToolMappingRequestData body, @QueryMap(encoded=true) DeleteToolMappingQueryParams queryParams);

  /**
  * Delete
  * Delete Mappings
  * Note, this is equivalent to the other <code>deleteToolMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteToolMappingResponse
      */
      @RequestLine("POST /api/rest/entity/toolMapping/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteToolMappingResponse> deleteToolMappingWithHttpInfo(@Param("elid") String elid, DeleteToolMappingRequestData body, @QueryMap(encoded=true) DeleteToolMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteToolMapping</code> method in a fluent style.
   */
  public static class DeleteToolMappingQueryParams extends HashMap<String, Object> {
    public DeleteToolMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ToolMappingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ToolMappingQueryResponse toolMappingQuery(@Param("sessionId") String sessionId, ToolMappingQueryRequest body);

  /**
   * Basic query
   * Similar to <code>toolMappingQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/toolMapping/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ToolMappingQueryResponse> toolMappingQueryWithHttpInfo(@Param("sessionId") String sessionId, ToolMappingQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>toolMappingQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ToolMappingQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ToolMappingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ToolMappingQueryResponse toolMappingQuery(ToolMappingQueryRequest body, @QueryMap(encoded=true) ToolMappingQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>toolMappingQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ToolMappingQueryResponse
      */
      @RequestLine("POST /api/rest/entity/toolMapping/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ToolMappingQueryResponse> toolMappingQueryWithHttpInfo(ToolMappingQueryRequest body, @QueryMap(encoded=true) ToolMappingQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>toolMappingQuery</code> method in a fluent style.
   */
  public static class ToolMappingQueryQueryParams extends HashMap<String, Object> {
    public ToolMappingQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Mapping Values
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ToolMappingQueryMappingValuesResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/queryMappingValues?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ToolMappingQueryMappingValuesResponse toolMappingQueryMappingValues(@Param("sessionId") String sessionId, ToolMappingQueryMappingValuesRequest body);

  /**
   * Query Mapping Values
   * Similar to <code>toolMappingQueryMappingValues</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/toolMapping/queryMappingValues?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ToolMappingQueryMappingValuesResponse> toolMappingQueryMappingValuesWithHttpInfo(@Param("sessionId") String sessionId, ToolMappingQueryMappingValuesRequest body);


  /**
   * Query Mapping Values
   * 
   * Note, this is equivalent to the other <code>toolMappingQueryMappingValues</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ToolMappingQueryMappingValuesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ToolMappingQueryMappingValuesResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/queryMappingValues?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ToolMappingQueryMappingValuesResponse toolMappingQueryMappingValues(ToolMappingQueryMappingValuesRequest body, @QueryMap(encoded=true) ToolMappingQueryMappingValuesQueryParams queryParams);

  /**
  * Query Mapping Values
  * 
  * Note, this is equivalent to the other <code>toolMappingQueryMappingValues</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ToolMappingQueryMappingValuesResponse
      */
      @RequestLine("POST /api/rest/entity/toolMapping/queryMappingValues?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ToolMappingQueryMappingValuesResponse> toolMappingQueryMappingValuesWithHttpInfo(ToolMappingQueryMappingValuesRequest body, @QueryMap(encoded=true) ToolMappingQueryMappingValuesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>toolMappingQueryMappingValues</code> method in a fluent style.
   */
  public static class ToolMappingQueryMappingValuesQueryParams extends HashMap<String, Object> {
    public ToolMappingQueryMappingValuesQueryParams sessionId(final String value) {
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
   * @return ToolMappingSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ToolMappingSystemAttributesResponse toolMappingSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ToolMappingSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>toolMappingSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/toolMapping/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ToolMappingSystemAttributesResponse> toolMappingSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ToolMappingSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>toolMappingSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ToolMappingSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ToolMappingSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ToolMappingSystemAttributesResponse toolMappingSystemAttributes(@Param("elid") String elid, ToolMappingSystemAttributesRequest body, @QueryMap(encoded=true) ToolMappingSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>toolMappingSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ToolMappingSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/toolMapping/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ToolMappingSystemAttributesResponse> toolMappingSystemAttributesWithHttpInfo(@Param("elid") String elid, ToolMappingSystemAttributesRequest body, @QueryMap(encoded=true) ToolMappingSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>toolMappingSystemAttributes</code> method in a fluent style.
   */
  public static class ToolMappingSystemAttributesQueryParams extends HashMap<String, Object> {
    public ToolMappingSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesToolMappingResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesToolMappingResponse updateSystemAttributesToolMapping(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesToolMappingRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesToolMapping</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/toolMapping/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesToolMappingResponse> updateSystemAttributesToolMappingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesToolMappingRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesToolMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesToolMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesToolMappingResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesToolMappingResponse updateSystemAttributesToolMapping(@Param("elid") String elid, UpdateSystemAttributesToolMappingRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesToolMappingQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesToolMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesToolMappingResponse
      */
      @RequestLine("POST /api/rest/entity/toolMapping/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesToolMappingResponse> updateSystemAttributesToolMappingWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesToolMappingRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesToolMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesToolMapping</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesToolMappingQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesToolMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Mappings
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateToolMappingResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateToolMappingResponse updateToolMapping(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateToolMappingRequestData body);

  /**
   * Modify
   * Similar to <code>updateToolMapping</code> but it also returns the http response headers .
   * Modify Mappings
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/toolMapping/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateToolMappingResponse> updateToolMappingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateToolMappingRequestData body);


  /**
   * Modify
   * Modify Mappings
   * Note, this is equivalent to the other <code>updateToolMapping</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateToolMappingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateToolMappingResponse
   */
  @RequestLine("POST /api/rest/entity/toolMapping/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateToolMappingResponse updateToolMapping(@Param("elid") String elid, UpdateToolMappingRequestData body, @QueryMap(encoded=true) UpdateToolMappingQueryParams queryParams);

  /**
  * Modify
  * Modify Mappings
  * Note, this is equivalent to the other <code>updateToolMapping</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateToolMappingResponse
      */
      @RequestLine("POST /api/rest/entity/toolMapping/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateToolMappingResponse> updateToolMappingWithHttpInfo(@Param("elid") String elid, UpdateToolMappingRequestData body, @QueryMap(encoded=true) UpdateToolMappingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateToolMapping</code> method in a fluent style.
   */
  public static class UpdateToolMappingQueryParams extends HashMap<String, Object> {
    public UpdateToolMappingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
