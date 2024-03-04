package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateGenericResourceRequestData;
import com.fntsoftware.businessgateway.entities.CreateGenericResourceResponse;
import com.fntsoftware.businessgateway.entities.DeleteGenericResourceRequestData;
import com.fntsoftware.businessgateway.entities.DeleteGenericResourceResponse;
import com.fntsoftware.businessgateway.entities.GenericResourceQueryRequest;
import com.fntsoftware.businessgateway.entities.GenericResourceQueryResponse;
import com.fntsoftware.businessgateway.entities.GenericResourceSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.GenericResourceSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateGenericResourceRequestData;
import com.fntsoftware.businessgateway.entities.UpdateGenericResourceResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesGenericResourceRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesGenericResourceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface GenericResourceApi extends ApiClient.Api {


  /**
   * Create
   * Create generic resource
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateGenericResourceResponse
   */
  @RequestLine("POST /api/rest/entity/genericResource/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateGenericResourceResponse createGenericResource(@Param("sessionId") String sessionId, CreateGenericResourceRequestData body);

  /**
   * Create
   * Similar to <code>createGenericResource</code> but it also returns the http response headers .
   * Create generic resource
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/genericResource/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateGenericResourceResponse> createGenericResourceWithHttpInfo(@Param("sessionId") String sessionId, CreateGenericResourceRequestData body);


  /**
   * Create
   * Create generic resource
   * Note, this is equivalent to the other <code>createGenericResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateGenericResourceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateGenericResourceResponse
   */
  @RequestLine("POST /api/rest/entity/genericResource/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateGenericResourceResponse createGenericResource(CreateGenericResourceRequestData body, @QueryMap(encoded=true) CreateGenericResourceQueryParams queryParams);

  /**
  * Create
  * Create generic resource
  * Note, this is equivalent to the other <code>createGenericResource</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateGenericResourceResponse
      */
      @RequestLine("POST /api/rest/entity/genericResource/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateGenericResourceResponse> createGenericResourceWithHttpInfo(CreateGenericResourceRequestData body, @QueryMap(encoded=true) CreateGenericResourceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createGenericResource</code> method in a fluent style.
   */
  public static class CreateGenericResourceQueryParams extends HashMap<String, Object> {
    public CreateGenericResourceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete generic resource
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteGenericResourceResponse
   */
  @RequestLine("POST /api/rest/entity/genericResource/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteGenericResourceResponse deleteGenericResource(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteGenericResourceRequestData body);

  /**
   * Delete
   * Similar to <code>deleteGenericResource</code> but it also returns the http response headers .
   * Delete generic resource
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/genericResource/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteGenericResourceResponse> deleteGenericResourceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteGenericResourceRequestData body);


  /**
   * Delete
   * Delete generic resource
   * Note, this is equivalent to the other <code>deleteGenericResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteGenericResourceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteGenericResourceResponse
   */
  @RequestLine("POST /api/rest/entity/genericResource/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteGenericResourceResponse deleteGenericResource(@Param("elid") String elid, DeleteGenericResourceRequestData body, @QueryMap(encoded=true) DeleteGenericResourceQueryParams queryParams);

  /**
  * Delete
  * Delete generic resource
  * Note, this is equivalent to the other <code>deleteGenericResource</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteGenericResourceResponse
      */
      @RequestLine("POST /api/rest/entity/genericResource/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteGenericResourceResponse> deleteGenericResourceWithHttpInfo(@Param("elid") String elid, DeleteGenericResourceRequestData body, @QueryMap(encoded=true) DeleteGenericResourceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteGenericResource</code> method in a fluent style.
   */
  public static class DeleteGenericResourceQueryParams extends HashMap<String, Object> {
    public DeleteGenericResourceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return GenericResourceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/genericResource/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GenericResourceQueryResponse genericResourceQuery(@Param("sessionId") String sessionId, GenericResourceQueryRequest body);

  /**
   * Basic query
   * Similar to <code>genericResourceQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/genericResource/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GenericResourceQueryResponse> genericResourceQueryWithHttpInfo(@Param("sessionId") String sessionId, GenericResourceQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>genericResourceQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GenericResourceQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return GenericResourceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/genericResource/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  GenericResourceQueryResponse genericResourceQuery(GenericResourceQueryRequest body, @QueryMap(encoded=true) GenericResourceQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>genericResourceQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return GenericResourceQueryResponse
      */
      @RequestLine("POST /api/rest/entity/genericResource/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<GenericResourceQueryResponse> genericResourceQueryWithHttpInfo(GenericResourceQueryRequest body, @QueryMap(encoded=true) GenericResourceQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>genericResourceQuery</code> method in a fluent style.
   */
  public static class GenericResourceQueryQueryParams extends HashMap<String, Object> {
    public GenericResourceQueryQueryParams sessionId(final String value) {
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
   * @return GenericResourceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/genericResource/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GenericResourceSystemAttributesResponse genericResourceSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, GenericResourceSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>genericResourceSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/genericResource/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GenericResourceSystemAttributesResponse> genericResourceSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, GenericResourceSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>genericResourceSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GenericResourceSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return GenericResourceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/genericResource/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  GenericResourceSystemAttributesResponse genericResourceSystemAttributes(@Param("elid") String elid, GenericResourceSystemAttributesRequest body, @QueryMap(encoded=true) GenericResourceSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>genericResourceSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return GenericResourceSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/genericResource/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<GenericResourceSystemAttributesResponse> genericResourceSystemAttributesWithHttpInfo(@Param("elid") String elid, GenericResourceSystemAttributesRequest body, @QueryMap(encoded=true) GenericResourceSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>genericResourceSystemAttributes</code> method in a fluent style.
   */
  public static class GenericResourceSystemAttributesQueryParams extends HashMap<String, Object> {
    public GenericResourceSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify generic resource
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateGenericResourceResponse
   */
  @RequestLine("POST /api/rest/entity/genericResource/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateGenericResourceResponse updateGenericResource(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateGenericResourceRequestData body);

  /**
   * Modify
   * Similar to <code>updateGenericResource</code> but it also returns the http response headers .
   * Modify generic resource
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/genericResource/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateGenericResourceResponse> updateGenericResourceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateGenericResourceRequestData body);


  /**
   * Modify
   * Modify generic resource
   * Note, this is equivalent to the other <code>updateGenericResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateGenericResourceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateGenericResourceResponse
   */
  @RequestLine("POST /api/rest/entity/genericResource/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateGenericResourceResponse updateGenericResource(@Param("elid") String elid, UpdateGenericResourceRequestData body, @QueryMap(encoded=true) UpdateGenericResourceQueryParams queryParams);

  /**
  * Modify
  * Modify generic resource
  * Note, this is equivalent to the other <code>updateGenericResource</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateGenericResourceResponse
      */
      @RequestLine("POST /api/rest/entity/genericResource/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateGenericResourceResponse> updateGenericResourceWithHttpInfo(@Param("elid") String elid, UpdateGenericResourceRequestData body, @QueryMap(encoded=true) UpdateGenericResourceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateGenericResource</code> method in a fluent style.
   */
  public static class UpdateGenericResourceQueryParams extends HashMap<String, Object> {
    public UpdateGenericResourceQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesGenericResourceResponse
   */
  @RequestLine("POST /api/rest/entity/genericResource/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesGenericResourceResponse updateSystemAttributesGenericResource(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesGenericResourceRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesGenericResource</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/genericResource/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesGenericResourceResponse> updateSystemAttributesGenericResourceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesGenericResourceRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesGenericResource</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesGenericResourceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesGenericResourceResponse
   */
  @RequestLine("POST /api/rest/entity/genericResource/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesGenericResourceResponse updateSystemAttributesGenericResource(@Param("elid") String elid, UpdateSystemAttributesGenericResourceRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesGenericResourceQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesGenericResource</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesGenericResourceResponse
      */
      @RequestLine("POST /api/rest/entity/genericResource/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesGenericResourceResponse> updateSystemAttributesGenericResourceWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesGenericResourceRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesGenericResourceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesGenericResource</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesGenericResourceQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesGenericResourceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
