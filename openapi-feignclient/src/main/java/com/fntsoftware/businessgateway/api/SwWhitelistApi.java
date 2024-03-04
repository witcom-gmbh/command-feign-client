package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSwWhitelistRequestData;
import com.fntsoftware.businessgateway.entities.CreateSwWhitelistResponse;
import com.fntsoftware.businessgateway.entities.DeleteSwWhitelistRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSwWhitelistResponse;
import com.fntsoftware.businessgateway.entities.SwWhitelistQueryRequest;
import com.fntsoftware.businessgateway.entities.SwWhitelistQueryResponse;
import com.fntsoftware.businessgateway.entities.SwWhitelistSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SwWhitelistSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSwWhitelistRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSwWhitelistResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwWhitelistRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSwWhitelistResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface SwWhitelistApi extends ApiClient.Api {


  /**
   * Create
   * Create Software Whitelist
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSwWhitelistResponse
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSwWhitelistResponse createSwWhitelist(@Param("sessionId") String sessionId, CreateSwWhitelistRequestData body);

  /**
   * Create
   * Similar to <code>createSwWhitelist</code> but it also returns the http response headers .
   * Create Software Whitelist
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSwWhitelistResponse> createSwWhitelistWithHttpInfo(@Param("sessionId") String sessionId, CreateSwWhitelistRequestData body);


  /**
   * Create
   * Create Software Whitelist
   * Note, this is equivalent to the other <code>createSwWhitelist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSwWhitelistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSwWhitelistResponse
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSwWhitelistResponse createSwWhitelist(CreateSwWhitelistRequestData body, @QueryMap(encoded=true) CreateSwWhitelistQueryParams queryParams);

  /**
  * Create
  * Create Software Whitelist
  * Note, this is equivalent to the other <code>createSwWhitelist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSwWhitelistResponse
      */
      @RequestLine("POST /api/rest/entity/swWhitelist/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSwWhitelistResponse> createSwWhitelistWithHttpInfo(CreateSwWhitelistRequestData body, @QueryMap(encoded=true) CreateSwWhitelistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSwWhitelist</code> method in a fluent style.
   */
  public static class CreateSwWhitelistQueryParams extends HashMap<String, Object> {
    public CreateSwWhitelistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Software Whitelist
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSwWhitelistResponse
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSwWhitelistResponse deleteSwWhitelist(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSwWhitelistRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSwWhitelist</code> but it also returns the http response headers .
   * Delete Software Whitelist
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSwWhitelistResponse> deleteSwWhitelistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSwWhitelistRequestData body);


  /**
   * Delete
   * Delete Software Whitelist
   * Note, this is equivalent to the other <code>deleteSwWhitelist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSwWhitelistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSwWhitelistResponse
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSwWhitelistResponse deleteSwWhitelist(@Param("elid") String elid, DeleteSwWhitelistRequestData body, @QueryMap(encoded=true) DeleteSwWhitelistQueryParams queryParams);

  /**
  * Delete
  * Delete Software Whitelist
  * Note, this is equivalent to the other <code>deleteSwWhitelist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSwWhitelistResponse
      */
      @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSwWhitelistResponse> deleteSwWhitelistWithHttpInfo(@Param("elid") String elid, DeleteSwWhitelistRequestData body, @QueryMap(encoded=true) DeleteSwWhitelistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSwWhitelist</code> method in a fluent style.
   */
  public static class DeleteSwWhitelistQueryParams extends HashMap<String, Object> {
    public DeleteSwWhitelistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SwWhitelistQueryResponse
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwWhitelistQueryResponse swWhitelistQuery(@Param("sessionId") String sessionId, SwWhitelistQueryRequest body);

  /**
   * Basic query
   * Similar to <code>swWhitelistQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwWhitelistQueryResponse> swWhitelistQueryWithHttpInfo(@Param("sessionId") String sessionId, SwWhitelistQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data
   * Note, this is equivalent to the other <code>swWhitelistQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwWhitelistQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwWhitelistQueryResponse
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwWhitelistQueryResponse swWhitelistQuery(SwWhitelistQueryRequest body, @QueryMap(encoded=true) SwWhitelistQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data
  * Note, this is equivalent to the other <code>swWhitelistQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwWhitelistQueryResponse
      */
      @RequestLine("POST /api/rest/entity/swWhitelist/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwWhitelistQueryResponse> swWhitelistQueryWithHttpInfo(SwWhitelistQueryRequest body, @QueryMap(encoded=true) SwWhitelistQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>swWhitelistQuery</code> method in a fluent style.
   */
  public static class SwWhitelistQueryQueryParams extends HashMap<String, Object> {
    public SwWhitelistQueryQueryParams sessionId(final String value) {
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
   * @return SwWhitelistSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SwWhitelistSystemAttributesResponse swWhitelistSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SwWhitelistSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>swWhitelistSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SwWhitelistSystemAttributesResponse> swWhitelistSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SwWhitelistSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>swWhitelistSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SwWhitelistSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SwWhitelistSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SwWhitelistSystemAttributesResponse swWhitelistSystemAttributes(@Param("elid") String elid, SwWhitelistSystemAttributesRequest body, @QueryMap(encoded=true) SwWhitelistSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>swWhitelistSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SwWhitelistSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SwWhitelistSystemAttributesResponse> swWhitelistSystemAttributesWithHttpInfo(@Param("elid") String elid, SwWhitelistSystemAttributesRequest body, @QueryMap(encoded=true) SwWhitelistSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>swWhitelistSystemAttributes</code> method in a fluent style.
   */
  public static class SwWhitelistSystemAttributesQueryParams extends HashMap<String, Object> {
    public SwWhitelistSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Software Whitelist
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSwWhitelistResponse
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSwWhitelistResponse updateSwWhitelist(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSwWhitelistRequestData body);

  /**
   * Modify
   * Similar to <code>updateSwWhitelist</code> but it also returns the http response headers .
   * Modify Software Whitelist
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSwWhitelistResponse> updateSwWhitelistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSwWhitelistRequestData body);


  /**
   * Modify
   * Modify Software Whitelist
   * Note, this is equivalent to the other <code>updateSwWhitelist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSwWhitelistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSwWhitelistResponse
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSwWhitelistResponse updateSwWhitelist(@Param("elid") String elid, UpdateSwWhitelistRequestData body, @QueryMap(encoded=true) UpdateSwWhitelistQueryParams queryParams);

  /**
  * Modify
  * Modify Software Whitelist
  * Note, this is equivalent to the other <code>updateSwWhitelist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSwWhitelistResponse
      */
      @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSwWhitelistResponse> updateSwWhitelistWithHttpInfo(@Param("elid") String elid, UpdateSwWhitelistRequestData body, @QueryMap(encoded=true) UpdateSwWhitelistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSwWhitelist</code> method in a fluent style.
   */
  public static class UpdateSwWhitelistQueryParams extends HashMap<String, Object> {
    public UpdateSwWhitelistQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSwWhitelistResponse
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSwWhitelistResponse updateSystemAttributesSwWhitelist(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSwWhitelistRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSwWhitelist</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSwWhitelistResponse> updateSystemAttributesSwWhitelistWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSwWhitelistRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSwWhitelist</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSwWhitelistQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSwWhitelistResponse
   */
  @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSwWhitelistResponse updateSystemAttributesSwWhitelist(@Param("elid") String elid, UpdateSystemAttributesSwWhitelistRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSwWhitelistQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSwWhitelist</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSwWhitelistResponse
      */
      @RequestLine("POST /api/rest/entity/swWhitelist/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSwWhitelistResponse> updateSystemAttributesSwWhitelistWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSwWhitelistRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSwWhitelistQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSwWhitelist</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSwWhitelistQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSwWhitelistQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
