package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.GridInputPhaseGetGridInputPhaseRequest;
import com.fntsoftware.businessgateway.entities.GridInputPhaseGetGridInputPhaseResponse;
import com.fntsoftware.businessgateway.entities.GridInputPhaseQueryRequest;
import com.fntsoftware.businessgateway.entities.GridInputPhaseQueryResponse;
import com.fntsoftware.businessgateway.entities.GridInputPhaseSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.GridInputPhaseSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesGridInputPhaseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesGridInputPhaseResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface GridInputPhaseApi extends ApiClient.Api {


  /**
   * Query Grid input phase
   * Queries the data of the grid input phase
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return GridInputPhaseGetGridInputPhaseResponse
   */
  @RequestLine("POST /api/rest/entity/gridInputPhase/{elid}/GetGridInputPhase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GridInputPhaseGetGridInputPhaseResponse gridInputPhaseGetGridInputPhase(@Param("sessionId") String sessionId, @Param("elid") String elid, GridInputPhaseGetGridInputPhaseRequest body);

  /**
   * Query Grid input phase
   * Similar to <code>gridInputPhaseGetGridInputPhase</code> but it also returns the http response headers .
   * Queries the data of the grid input phase
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/gridInputPhase/{elid}/GetGridInputPhase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GridInputPhaseGetGridInputPhaseResponse> gridInputPhaseGetGridInputPhaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, GridInputPhaseGetGridInputPhaseRequest body);


  /**
   * Query Grid input phase
   * Queries the data of the grid input phase
   * Note, this is equivalent to the other <code>gridInputPhaseGetGridInputPhase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GridInputPhaseGetGridInputPhaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return GridInputPhaseGetGridInputPhaseResponse
   */
  @RequestLine("POST /api/rest/entity/gridInputPhase/{elid}/GetGridInputPhase?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  GridInputPhaseGetGridInputPhaseResponse gridInputPhaseGetGridInputPhase(@Param("elid") String elid, GridInputPhaseGetGridInputPhaseRequest body, @QueryMap(encoded=true) GridInputPhaseGetGridInputPhaseQueryParams queryParams);

  /**
  * Query Grid input phase
  * Queries the data of the grid input phase
  * Note, this is equivalent to the other <code>gridInputPhaseGetGridInputPhase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return GridInputPhaseGetGridInputPhaseResponse
      */
      @RequestLine("POST /api/rest/entity/gridInputPhase/{elid}/GetGridInputPhase?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<GridInputPhaseGetGridInputPhaseResponse> gridInputPhaseGetGridInputPhaseWithHttpInfo(@Param("elid") String elid, GridInputPhaseGetGridInputPhaseRequest body, @QueryMap(encoded=true) GridInputPhaseGetGridInputPhaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>gridInputPhaseGetGridInputPhase</code> method in a fluent style.
   */
  public static class GridInputPhaseGetGridInputPhaseQueryParams extends HashMap<String, Object> {
    public GridInputPhaseGetGridInputPhaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return GridInputPhaseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/gridInputPhase/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GridInputPhaseQueryResponse gridInputPhaseQuery(@Param("sessionId") String sessionId, GridInputPhaseQueryRequest body);

  /**
   * Basic query
   * Similar to <code>gridInputPhaseQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/gridInputPhase/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GridInputPhaseQueryResponse> gridInputPhaseQueryWithHttpInfo(@Param("sessionId") String sessionId, GridInputPhaseQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>gridInputPhaseQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GridInputPhaseQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return GridInputPhaseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/gridInputPhase/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  GridInputPhaseQueryResponse gridInputPhaseQuery(GridInputPhaseQueryRequest body, @QueryMap(encoded=true) GridInputPhaseQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>gridInputPhaseQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return GridInputPhaseQueryResponse
      */
      @RequestLine("POST /api/rest/entity/gridInputPhase/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<GridInputPhaseQueryResponse> gridInputPhaseQueryWithHttpInfo(GridInputPhaseQueryRequest body, @QueryMap(encoded=true) GridInputPhaseQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>gridInputPhaseQuery</code> method in a fluent style.
   */
  public static class GridInputPhaseQueryQueryParams extends HashMap<String, Object> {
    public GridInputPhaseQueryQueryParams sessionId(final String value) {
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
   * @return GridInputPhaseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/gridInputPhase/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  GridInputPhaseSystemAttributesResponse gridInputPhaseSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, GridInputPhaseSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>gridInputPhaseSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/gridInputPhase/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<GridInputPhaseSystemAttributesResponse> gridInputPhaseSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, GridInputPhaseSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>gridInputPhaseSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GridInputPhaseSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return GridInputPhaseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/gridInputPhase/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  GridInputPhaseSystemAttributesResponse gridInputPhaseSystemAttributes(@Param("elid") String elid, GridInputPhaseSystemAttributesRequest body, @QueryMap(encoded=true) GridInputPhaseSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>gridInputPhaseSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return GridInputPhaseSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/gridInputPhase/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<GridInputPhaseSystemAttributesResponse> gridInputPhaseSystemAttributesWithHttpInfo(@Param("elid") String elid, GridInputPhaseSystemAttributesRequest body, @QueryMap(encoded=true) GridInputPhaseSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>gridInputPhaseSystemAttributes</code> method in a fluent style.
   */
  public static class GridInputPhaseSystemAttributesQueryParams extends HashMap<String, Object> {
    public GridInputPhaseSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesGridInputPhaseResponse
   */
  @RequestLine("POST /api/rest/entity/gridInputPhase/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesGridInputPhaseResponse updateSystemAttributesGridInputPhase(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesGridInputPhaseRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesGridInputPhase</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/gridInputPhase/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesGridInputPhaseResponse> updateSystemAttributesGridInputPhaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesGridInputPhaseRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesGridInputPhase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesGridInputPhaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesGridInputPhaseResponse
   */
  @RequestLine("POST /api/rest/entity/gridInputPhase/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesGridInputPhaseResponse updateSystemAttributesGridInputPhase(@Param("elid") String elid, UpdateSystemAttributesGridInputPhaseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesGridInputPhaseQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesGridInputPhase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesGridInputPhaseResponse
      */
      @RequestLine("POST /api/rest/entity/gridInputPhase/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesGridInputPhaseResponse> updateSystemAttributesGridInputPhaseWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesGridInputPhaseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesGridInputPhaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesGridInputPhase</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesGridInputPhaseQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesGridInputPhaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
