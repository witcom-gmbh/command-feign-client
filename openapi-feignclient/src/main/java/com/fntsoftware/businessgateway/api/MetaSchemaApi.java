package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.MetaSchemaGetEntitiesRequest;
import com.fntsoftware.businessgateway.entities.MetaSchemaGetEntitiesResponse;
import com.fntsoftware.businessgateway.entities.MetaSchemaGetEntityGroupsRequest;
import com.fntsoftware.businessgateway.entities.MetaSchemaGetEntityGroupsResponse;
import com.fntsoftware.businessgateway.entities.MetaSchemaGetLinksRequest;
import com.fntsoftware.businessgateway.entities.MetaSchemaGetLinksResponse;
import com.fntsoftware.businessgateway.entities.MetaSchemaGetRelationsRequest;
import com.fntsoftware.businessgateway.entities.MetaSchemaGetRelationsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface MetaSchemaApi extends ApiClient.Api {


  /**
   * Entities
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return MetaSchemaGetEntitiesResponse
   */
  @RequestLine("POST /api/rest/entity/metaSchema/getEntities?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MetaSchemaGetEntitiesResponse metaSchemaGetEntities(@Param("sessionId") String sessionId, MetaSchemaGetEntitiesRequest body);

  /**
   * Entities
   * Similar to <code>metaSchemaGetEntities</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/metaSchema/getEntities?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MetaSchemaGetEntitiesResponse> metaSchemaGetEntitiesWithHttpInfo(@Param("sessionId") String sessionId, MetaSchemaGetEntitiesRequest body);


  /**
   * Entities
   * 
   * Note, this is equivalent to the other <code>metaSchemaGetEntities</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MetaSchemaGetEntitiesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MetaSchemaGetEntitiesResponse
   */
  @RequestLine("POST /api/rest/entity/metaSchema/getEntities?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MetaSchemaGetEntitiesResponse metaSchemaGetEntities(MetaSchemaGetEntitiesRequest body, @QueryMap(encoded=true) MetaSchemaGetEntitiesQueryParams queryParams);

  /**
  * Entities
  * 
  * Note, this is equivalent to the other <code>metaSchemaGetEntities</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MetaSchemaGetEntitiesResponse
      */
      @RequestLine("POST /api/rest/entity/metaSchema/getEntities?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MetaSchemaGetEntitiesResponse> metaSchemaGetEntitiesWithHttpInfo(MetaSchemaGetEntitiesRequest body, @QueryMap(encoded=true) MetaSchemaGetEntitiesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>metaSchemaGetEntities</code> method in a fluent style.
   */
  public static class MetaSchemaGetEntitiesQueryParams extends HashMap<String, Object> {
    public MetaSchemaGetEntitiesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Entity Group
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return MetaSchemaGetEntityGroupsResponse
   */
  @RequestLine("POST /api/rest/entity/metaSchema/getEntityGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MetaSchemaGetEntityGroupsResponse metaSchemaGetEntityGroups(@Param("sessionId") String sessionId, MetaSchemaGetEntityGroupsRequest body);

  /**
   * Entity Group
   * Similar to <code>metaSchemaGetEntityGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/metaSchema/getEntityGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MetaSchemaGetEntityGroupsResponse> metaSchemaGetEntityGroupsWithHttpInfo(@Param("sessionId") String sessionId, MetaSchemaGetEntityGroupsRequest body);


  /**
   * Entity Group
   * 
   * Note, this is equivalent to the other <code>metaSchemaGetEntityGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MetaSchemaGetEntityGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MetaSchemaGetEntityGroupsResponse
   */
  @RequestLine("POST /api/rest/entity/metaSchema/getEntityGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MetaSchemaGetEntityGroupsResponse metaSchemaGetEntityGroups(MetaSchemaGetEntityGroupsRequest body, @QueryMap(encoded=true) MetaSchemaGetEntityGroupsQueryParams queryParams);

  /**
  * Entity Group
  * 
  * Note, this is equivalent to the other <code>metaSchemaGetEntityGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MetaSchemaGetEntityGroupsResponse
      */
      @RequestLine("POST /api/rest/entity/metaSchema/getEntityGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MetaSchemaGetEntityGroupsResponse> metaSchemaGetEntityGroupsWithHttpInfo(MetaSchemaGetEntityGroupsRequest body, @QueryMap(encoded=true) MetaSchemaGetEntityGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>metaSchemaGetEntityGroups</code> method in a fluent style.
   */
  public static class MetaSchemaGetEntityGroupsQueryParams extends HashMap<String, Object> {
    public MetaSchemaGetEntityGroupsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Links
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return MetaSchemaGetLinksResponse
   */
  @RequestLine("POST /api/rest/entity/metaSchema/getLinks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MetaSchemaGetLinksResponse metaSchemaGetLinks(@Param("sessionId") String sessionId, MetaSchemaGetLinksRequest body);

  /**
   * Links
   * Similar to <code>metaSchemaGetLinks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/metaSchema/getLinks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MetaSchemaGetLinksResponse> metaSchemaGetLinksWithHttpInfo(@Param("sessionId") String sessionId, MetaSchemaGetLinksRequest body);


  /**
   * Links
   * 
   * Note, this is equivalent to the other <code>metaSchemaGetLinks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MetaSchemaGetLinksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MetaSchemaGetLinksResponse
   */
  @RequestLine("POST /api/rest/entity/metaSchema/getLinks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MetaSchemaGetLinksResponse metaSchemaGetLinks(MetaSchemaGetLinksRequest body, @QueryMap(encoded=true) MetaSchemaGetLinksQueryParams queryParams);

  /**
  * Links
  * 
  * Note, this is equivalent to the other <code>metaSchemaGetLinks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MetaSchemaGetLinksResponse
      */
      @RequestLine("POST /api/rest/entity/metaSchema/getLinks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MetaSchemaGetLinksResponse> metaSchemaGetLinksWithHttpInfo(MetaSchemaGetLinksRequest body, @QueryMap(encoded=true) MetaSchemaGetLinksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>metaSchemaGetLinks</code> method in a fluent style.
   */
  public static class MetaSchemaGetLinksQueryParams extends HashMap<String, Object> {
    public MetaSchemaGetLinksQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Relations
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return MetaSchemaGetRelationsResponse
   */
  @RequestLine("POST /api/rest/entity/metaSchema/getRelations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MetaSchemaGetRelationsResponse metaSchemaGetRelations(@Param("sessionId") String sessionId, MetaSchemaGetRelationsRequest body);

  /**
   * Relations
   * Similar to <code>metaSchemaGetRelations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/metaSchema/getRelations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MetaSchemaGetRelationsResponse> metaSchemaGetRelationsWithHttpInfo(@Param("sessionId") String sessionId, MetaSchemaGetRelationsRequest body);


  /**
   * Relations
   * 
   * Note, this is equivalent to the other <code>metaSchemaGetRelations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MetaSchemaGetRelationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MetaSchemaGetRelationsResponse
   */
  @RequestLine("POST /api/rest/entity/metaSchema/getRelations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MetaSchemaGetRelationsResponse metaSchemaGetRelations(MetaSchemaGetRelationsRequest body, @QueryMap(encoded=true) MetaSchemaGetRelationsQueryParams queryParams);

  /**
  * Relations
  * 
  * Note, this is equivalent to the other <code>metaSchemaGetRelations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MetaSchemaGetRelationsResponse
      */
      @RequestLine("POST /api/rest/entity/metaSchema/getRelations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MetaSchemaGetRelationsResponse> metaSchemaGetRelationsWithHttpInfo(MetaSchemaGetRelationsRequest body, @QueryMap(encoded=true) MetaSchemaGetRelationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>metaSchemaGetRelations</code> method in a fluent style.
   */
  public static class MetaSchemaGetRelationsQueryParams extends HashMap<String, Object> {
    public MetaSchemaGetRelationsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
