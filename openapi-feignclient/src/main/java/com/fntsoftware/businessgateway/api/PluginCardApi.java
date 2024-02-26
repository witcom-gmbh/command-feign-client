package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreatePluginCardRequestData;
import com.fntsoftware.businessgateway.entities.CreatePluginCardResponse;
import com.fntsoftware.businessgateway.entities.DeletePluginCardRequestData;
import com.fntsoftware.businessgateway.entities.DeletePluginCardResponse;
import com.fntsoftware.businessgateway.entities.PluginCardQueryRequest;
import com.fntsoftware.businessgateway.entities.PluginCardQueryResponse;
import com.fntsoftware.businessgateway.entities.PluginCardServerRequestData;
import com.fntsoftware.businessgateway.entities.PluginCardServerResponseData;
import com.fntsoftware.businessgateway.entities.PluginCardSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.PluginCardSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdatePluginCardRequestData;
import com.fntsoftware.businessgateway.entities.UpdatePluginCardResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPluginCardRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPluginCardResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface PluginCardApi extends ApiClient.Api {


  /**
   * Create
   * Create assembly part card
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreatePluginCardResponse
   */
  @RequestLine("POST /api/rest/entity/pluginCard/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreatePluginCardResponse createPluginCard(@Param("sessionId") String sessionId, CreatePluginCardRequestData body);

  /**
   * Create
   * Similar to <code>createPluginCard</code> but it also returns the http response headers .
   * Create assembly part card
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pluginCard/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreatePluginCardResponse> createPluginCardWithHttpInfo(@Param("sessionId") String sessionId, CreatePluginCardRequestData body);


  /**
   * Create
   * Create assembly part card
   * Note, this is equivalent to the other <code>createPluginCard</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreatePluginCardQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreatePluginCardResponse
   */
  @RequestLine("POST /api/rest/entity/pluginCard/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreatePluginCardResponse createPluginCard(CreatePluginCardRequestData body, @QueryMap(encoded=true) CreatePluginCardQueryParams queryParams);

  /**
  * Create
  * Create assembly part card
  * Note, this is equivalent to the other <code>createPluginCard</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreatePluginCardResponse
      */
      @RequestLine("POST /api/rest/entity/pluginCard/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreatePluginCardResponse> createPluginCardWithHttpInfo(CreatePluginCardRequestData body, @QueryMap(encoded=true) CreatePluginCardQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createPluginCard</code> method in a fluent style.
   */
  public static class CreatePluginCardQueryParams extends HashMap<String, Object> {
    public CreatePluginCardQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete assembly part card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeletePluginCardResponse
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeletePluginCardResponse deletePluginCard(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePluginCardRequestData body);

  /**
   * Delete
   * Similar to <code>deletePluginCard</code> but it also returns the http response headers .
   * Delete assembly part card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeletePluginCardResponse> deletePluginCardWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeletePluginCardRequestData body);


  /**
   * Delete
   * Delete assembly part card
   * Note, this is equivalent to the other <code>deletePluginCard</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeletePluginCardQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeletePluginCardResponse
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeletePluginCardResponse deletePluginCard(@Param("elid") String elid, DeletePluginCardRequestData body, @QueryMap(encoded=true) DeletePluginCardQueryParams queryParams);

  /**
  * Delete
  * Delete assembly part card
  * Note, this is equivalent to the other <code>deletePluginCard</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeletePluginCardResponse
      */
      @RequestLine("POST /api/rest/entity/pluginCard/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeletePluginCardResponse> deletePluginCardWithHttpInfo(@Param("elid") String elid, DeletePluginCardRequestData body, @QueryMap(encoded=true) DeletePluginCardQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deletePluginCard</code> method in a fluent style.
   */
  public static class DeletePluginCardQueryParams extends HashMap<String, Object> {
    public DeletePluginCardQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PluginCardQueryResponse
   */
  @RequestLine("POST /api/rest/entity/pluginCard/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PluginCardQueryResponse pluginCardQuery(@Param("sessionId") String sessionId, PluginCardQueryRequest body);

  /**
   * Basic query
   * Similar to <code>pluginCardQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pluginCard/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PluginCardQueryResponse> pluginCardQueryWithHttpInfo(@Param("sessionId") String sessionId, PluginCardQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>pluginCardQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PluginCardQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PluginCardQueryResponse
   */
  @RequestLine("POST /api/rest/entity/pluginCard/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PluginCardQueryResponse pluginCardQuery(PluginCardQueryRequest body, @QueryMap(encoded=true) PluginCardQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>pluginCardQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PluginCardQueryResponse
      */
      @RequestLine("POST /api/rest/entity/pluginCard/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PluginCardQueryResponse> pluginCardQueryWithHttpInfo(PluginCardQueryRequest body, @QueryMap(encoded=true) PluginCardQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pluginCardQuery</code> method in a fluent style.
   */
  public static class PluginCardQueryQueryParams extends HashMap<String, Object> {
    public PluginCardQueryQueryParams sessionId(final String value) {
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
   * @return PluginCardServerResponseData
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PluginCardServerResponseData pluginCardServer(@Param("sessionId") String sessionId, @Param("elid") String elid, PluginCardServerRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>pluginCardServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PluginCardServerResponseData> pluginCardServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PluginCardServerRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>pluginCardServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PluginCardServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PluginCardServerResponseData
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/Server?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PluginCardServerResponseData pluginCardServer(@Param("elid") String elid, PluginCardServerRequestData body, @QueryMap(encoded=true) PluginCardServerQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>pluginCardServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PluginCardServerResponseData
      */
      @RequestLine("POST /api/rest/entity/pluginCard/{elid}/Server?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PluginCardServerResponseData> pluginCardServerWithHttpInfo(@Param("elid") String elid, PluginCardServerRequestData body, @QueryMap(encoded=true) PluginCardServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pluginCardServer</code> method in a fluent style.
   */
  public static class PluginCardServerQueryParams extends HashMap<String, Object> {
    public PluginCardServerQueryParams sessionId(final String value) {
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
   * @return PluginCardSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PluginCardSystemAttributesResponse pluginCardSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, PluginCardSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>pluginCardSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PluginCardSystemAttributesResponse> pluginCardSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PluginCardSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>pluginCardSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PluginCardSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PluginCardSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PluginCardSystemAttributesResponse pluginCardSystemAttributes(@Param("elid") String elid, PluginCardSystemAttributesRequest body, @QueryMap(encoded=true) PluginCardSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>pluginCardSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PluginCardSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/pluginCard/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PluginCardSystemAttributesResponse> pluginCardSystemAttributesWithHttpInfo(@Param("elid") String elid, PluginCardSystemAttributesRequest body, @QueryMap(encoded=true) PluginCardSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>pluginCardSystemAttributes</code> method in a fluent style.
   */
  public static class PluginCardSystemAttributesQueryParams extends HashMap<String, Object> {
    public PluginCardSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify assembly part card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdatePluginCardResponse
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdatePluginCardResponse updatePluginCard(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePluginCardRequestData body);

  /**
   * Modify
   * Similar to <code>updatePluginCard</code> but it also returns the http response headers .
   * Modify assembly part card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdatePluginCardResponse> updatePluginCardWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdatePluginCardRequestData body);


  /**
   * Modify
   * Modify assembly part card
   * Note, this is equivalent to the other <code>updatePluginCard</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdatePluginCardQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdatePluginCardResponse
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdatePluginCardResponse updatePluginCard(@Param("elid") String elid, UpdatePluginCardRequestData body, @QueryMap(encoded=true) UpdatePluginCardQueryParams queryParams);

  /**
  * Modify
  * Modify assembly part card
  * Note, this is equivalent to the other <code>updatePluginCard</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdatePluginCardResponse
      */
      @RequestLine("POST /api/rest/entity/pluginCard/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdatePluginCardResponse> updatePluginCardWithHttpInfo(@Param("elid") String elid, UpdatePluginCardRequestData body, @QueryMap(encoded=true) UpdatePluginCardQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updatePluginCard</code> method in a fluent style.
   */
  public static class UpdatePluginCardQueryParams extends HashMap<String, Object> {
    public UpdatePluginCardQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesPluginCardResponse
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesPluginCardResponse updateSystemAttributesPluginCard(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPluginCardRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesPluginCard</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesPluginCardResponse> updateSystemAttributesPluginCardWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPluginCardRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesPluginCard</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesPluginCardQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesPluginCardResponse
   */
  @RequestLine("POST /api/rest/entity/pluginCard/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesPluginCardResponse updateSystemAttributesPluginCard(@Param("elid") String elid, UpdateSystemAttributesPluginCardRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPluginCardQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesPluginCard</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesPluginCardResponse
      */
      @RequestLine("POST /api/rest/entity/pluginCard/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesPluginCardResponse> updateSystemAttributesPluginCardWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesPluginCardRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPluginCardQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesPluginCard</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesPluginCardQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesPluginCardQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
