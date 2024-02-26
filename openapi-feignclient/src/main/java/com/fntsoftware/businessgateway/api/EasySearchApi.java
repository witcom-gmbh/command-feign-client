package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.EasySearchCategoriesRequest;
import com.fntsoftware.businessgateway.entities.EasySearchCategoriesResponse;
import com.fntsoftware.businessgateway.entities.EasySearchClassesRequest;
import com.fntsoftware.businessgateway.entities.EasySearchClassesResponse;
import com.fntsoftware.businessgateway.entities.EasySearchQueryRequest;
import com.fntsoftware.businessgateway.entities.EasySearchQueryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface EasySearchApi extends ApiClient.Api {


  /**
   * Query Categories
   * Provides the list of available categories. This is an informative query that serves in helping user to populate the categories list from QUERY
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return EasySearchCategoriesResponse
   */
  @RequestLine("POST /api/rest/entity/easySearch/categories?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EasySearchCategoriesResponse easySearchCategories(@Param("sessionId") String sessionId, EasySearchCategoriesRequest body);

  /**
   * Query Categories
   * Similar to <code>easySearchCategories</code> but it also returns the http response headers .
   * Provides the list of available categories. This is an informative query that serves in helping user to populate the categories list from QUERY
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/easySearch/categories?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<EasySearchCategoriesResponse> easySearchCategoriesWithHttpInfo(@Param("sessionId") String sessionId, EasySearchCategoriesRequest body);


  /**
   * Query Categories
   * Provides the list of available categories. This is an informative query that serves in helping user to populate the categories list from QUERY
   * Note, this is equivalent to the other <code>easySearchCategories</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link EasySearchCategoriesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return EasySearchCategoriesResponse
   */
  @RequestLine("POST /api/rest/entity/easySearch/categories?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  EasySearchCategoriesResponse easySearchCategories(EasySearchCategoriesRequest body, @QueryMap(encoded=true) EasySearchCategoriesQueryParams queryParams);

  /**
  * Query Categories
  * Provides the list of available categories. This is an informative query that serves in helping user to populate the categories list from QUERY
  * Note, this is equivalent to the other <code>easySearchCategories</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return EasySearchCategoriesResponse
      */
      @RequestLine("POST /api/rest/entity/easySearch/categories?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<EasySearchCategoriesResponse> easySearchCategoriesWithHttpInfo(EasySearchCategoriesRequest body, @QueryMap(encoded=true) EasySearchCategoriesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>easySearchCategories</code> method in a fluent style.
   */
  public static class EasySearchCategoriesQueryParams extends HashMap<String, Object> {
    public EasySearchCategoriesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Classes
   * Provides the list of available classes. This is an informative query that serves in helping user to populate the classes list from QUERY
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return EasySearchClassesResponse
   */
  @RequestLine("POST /api/rest/entity/easySearch/classes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EasySearchClassesResponse easySearchClasses(@Param("sessionId") String sessionId, EasySearchClassesRequest body);

  /**
   * Query Classes
   * Similar to <code>easySearchClasses</code> but it also returns the http response headers .
   * Provides the list of available classes. This is an informative query that serves in helping user to populate the classes list from QUERY
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/easySearch/classes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<EasySearchClassesResponse> easySearchClassesWithHttpInfo(@Param("sessionId") String sessionId, EasySearchClassesRequest body);


  /**
   * Query Classes
   * Provides the list of available classes. This is an informative query that serves in helping user to populate the classes list from QUERY
   * Note, this is equivalent to the other <code>easySearchClasses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link EasySearchClassesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return EasySearchClassesResponse
   */
  @RequestLine("POST /api/rest/entity/easySearch/classes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  EasySearchClassesResponse easySearchClasses(EasySearchClassesRequest body, @QueryMap(encoded=true) EasySearchClassesQueryParams queryParams);

  /**
  * Query Classes
  * Provides the list of available classes. This is an informative query that serves in helping user to populate the classes list from QUERY
  * Note, this is equivalent to the other <code>easySearchClasses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return EasySearchClassesResponse
      */
      @RequestLine("POST /api/rest/entity/easySearch/classes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<EasySearchClassesResponse> easySearchClassesWithHttpInfo(EasySearchClassesRequest body, @QueryMap(encoded=true) EasySearchClassesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>easySearchClasses</code> method in a fluent style.
   */
  public static class EasySearchClassesQueryParams extends HashMap<String, Object> {
    public EasySearchClassesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query
   * Provides the user with specific search reults. For &lt;Categories&gt; and &lt;Classes&gt; attributes, more values cand be added if they are comma separated.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return EasySearchQueryResponse
   */
  @RequestLine("POST /api/rest/entity/easySearch/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EasySearchQueryResponse easySearchQuery(@Param("sessionId") String sessionId, EasySearchQueryRequest body);

  /**
   * Query
   * Similar to <code>easySearchQuery</code> but it also returns the http response headers .
   * Provides the user with specific search reults. For &lt;Categories&gt; and &lt;Classes&gt; attributes, more values cand be added if they are comma separated.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/easySearch/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<EasySearchQueryResponse> easySearchQueryWithHttpInfo(@Param("sessionId") String sessionId, EasySearchQueryRequest body);


  /**
   * Query
   * Provides the user with specific search reults. For &lt;Categories&gt; and &lt;Classes&gt; attributes, more values cand be added if they are comma separated.
   * Note, this is equivalent to the other <code>easySearchQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link EasySearchQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return EasySearchQueryResponse
   */
  @RequestLine("POST /api/rest/entity/easySearch/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  EasySearchQueryResponse easySearchQuery(EasySearchQueryRequest body, @QueryMap(encoded=true) EasySearchQueryQueryParams queryParams);

  /**
  * Query
  * Provides the user with specific search reults. For &lt;Categories&gt; and &lt;Classes&gt; attributes, more values cand be added if they are comma separated.
  * Note, this is equivalent to the other <code>easySearchQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return EasySearchQueryResponse
      */
      @RequestLine("POST /api/rest/entity/easySearch/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<EasySearchQueryResponse> easySearchQueryWithHttpInfo(EasySearchQueryRequest body, @QueryMap(encoded=true) EasySearchQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>easySearchQuery</code> method in a fluent style.
   */
  public static class EasySearchQueryQueryParams extends HashMap<String, Object> {
    public EasySearchQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
