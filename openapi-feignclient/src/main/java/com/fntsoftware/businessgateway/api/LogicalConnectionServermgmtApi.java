package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateLogicalConnectionServermgmtRequestData;
import com.fntsoftware.businessgateway.entities.CreateLogicalConnectionServermgmtResponse;
import com.fntsoftware.businessgateway.entities.DeleteLogicalConnectionServermgmtRequestData;
import com.fntsoftware.businessgateway.entities.DeleteLogicalConnectionServermgmtResponse;
import com.fntsoftware.businessgateway.entities.LogicalConnectionServermgmtQueryRequest;
import com.fntsoftware.businessgateway.entities.LogicalConnectionServermgmtQueryResponse;
import com.fntsoftware.businessgateway.entities.LogicalConnectionServermgmtSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.LogicalConnectionServermgmtSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateLogicalConnectionServermgmtRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLogicalConnectionServermgmtResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesLogicalConnectionServermgmtRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesLogicalConnectionServermgmtResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface LogicalConnectionServermgmtApi extends ApiClient.Api {


  /**
   * Create
   * Create Logical connection
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateLogicalConnectionServermgmtResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateLogicalConnectionServermgmtResponse createLogicalConnectionServermgmt(@Param("sessionId") String sessionId, CreateLogicalConnectionServermgmtRequestData body);

  /**
   * Create
   * Similar to <code>createLogicalConnectionServermgmt</code> but it also returns the http response headers .
   * Create Logical connection
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateLogicalConnectionServermgmtResponse> createLogicalConnectionServermgmtWithHttpInfo(@Param("sessionId") String sessionId, CreateLogicalConnectionServermgmtRequestData body);


  /**
   * Create
   * Create Logical connection
   * Note, this is equivalent to the other <code>createLogicalConnectionServermgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateLogicalConnectionServermgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateLogicalConnectionServermgmtResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateLogicalConnectionServermgmtResponse createLogicalConnectionServermgmt(CreateLogicalConnectionServermgmtRequestData body, @QueryMap(encoded=true) CreateLogicalConnectionServermgmtQueryParams queryParams);

  /**
  * Create
  * Create Logical connection
  * Note, this is equivalent to the other <code>createLogicalConnectionServermgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateLogicalConnectionServermgmtResponse
      */
      @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateLogicalConnectionServermgmtResponse> createLogicalConnectionServermgmtWithHttpInfo(CreateLogicalConnectionServermgmtRequestData body, @QueryMap(encoded=true) CreateLogicalConnectionServermgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createLogicalConnectionServermgmt</code> method in a fluent style.
   */
  public static class CreateLogicalConnectionServermgmtQueryParams extends HashMap<String, Object> {
    public CreateLogicalConnectionServermgmtQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Logical connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteLogicalConnectionServermgmtResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteLogicalConnectionServermgmtResponse deleteLogicalConnectionServermgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteLogicalConnectionServermgmtRequestData body);

  /**
   * Delete
   * Similar to <code>deleteLogicalConnectionServermgmt</code> but it also returns the http response headers .
   * Delete Logical connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteLogicalConnectionServermgmtResponse> deleteLogicalConnectionServermgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteLogicalConnectionServermgmtRequestData body);


  /**
   * Delete
   * Delete Logical connection
   * Note, this is equivalent to the other <code>deleteLogicalConnectionServermgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteLogicalConnectionServermgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteLogicalConnectionServermgmtResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteLogicalConnectionServermgmtResponse deleteLogicalConnectionServermgmt(@Param("elid") String elid, DeleteLogicalConnectionServermgmtRequestData body, @QueryMap(encoded=true) DeleteLogicalConnectionServermgmtQueryParams queryParams);

  /**
  * Delete
  * Delete Logical connection
  * Note, this is equivalent to the other <code>deleteLogicalConnectionServermgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteLogicalConnectionServermgmtResponse
      */
      @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteLogicalConnectionServermgmtResponse> deleteLogicalConnectionServermgmtWithHttpInfo(@Param("elid") String elid, DeleteLogicalConnectionServermgmtRequestData body, @QueryMap(encoded=true) DeleteLogicalConnectionServermgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteLogicalConnectionServermgmt</code> method in a fluent style.
   */
  public static class DeleteLogicalConnectionServermgmtQueryParams extends HashMap<String, Object> {
    public DeleteLogicalConnectionServermgmtQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return LogicalConnectionServermgmtQueryResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalConnectionServermgmtQueryResponse logicalConnectionServermgmtQuery(@Param("sessionId") String sessionId, LogicalConnectionServermgmtQueryRequest body);

  /**
   * Basic query
   * Similar to <code>logicalConnectionServermgmtQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalConnectionServermgmtQueryResponse> logicalConnectionServermgmtQueryWithHttpInfo(@Param("sessionId") String sessionId, LogicalConnectionServermgmtQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data
   * Note, this is equivalent to the other <code>logicalConnectionServermgmtQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalConnectionServermgmtQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalConnectionServermgmtQueryResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalConnectionServermgmtQueryResponse logicalConnectionServermgmtQuery(LogicalConnectionServermgmtQueryRequest body, @QueryMap(encoded=true) LogicalConnectionServermgmtQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data
  * Note, this is equivalent to the other <code>logicalConnectionServermgmtQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalConnectionServermgmtQueryResponse
      */
      @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalConnectionServermgmtQueryResponse> logicalConnectionServermgmtQueryWithHttpInfo(LogicalConnectionServermgmtQueryRequest body, @QueryMap(encoded=true) LogicalConnectionServermgmtQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalConnectionServermgmtQuery</code> method in a fluent style.
   */
  public static class LogicalConnectionServermgmtQueryQueryParams extends HashMap<String, Object> {
    public LogicalConnectionServermgmtQueryQueryParams sessionId(final String value) {
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
   * @return LogicalConnectionServermgmtSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalConnectionServermgmtSystemAttributesResponse logicalConnectionServermgmtSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalConnectionServermgmtSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>logicalConnectionServermgmtSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalConnectionServermgmtSystemAttributesResponse> logicalConnectionServermgmtSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalConnectionServermgmtSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>logicalConnectionServermgmtSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalConnectionServermgmtSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalConnectionServermgmtSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalConnectionServermgmtSystemAttributesResponse logicalConnectionServermgmtSystemAttributes(@Param("elid") String elid, LogicalConnectionServermgmtSystemAttributesRequest body, @QueryMap(encoded=true) LogicalConnectionServermgmtSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>logicalConnectionServermgmtSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalConnectionServermgmtSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalConnectionServermgmtSystemAttributesResponse> logicalConnectionServermgmtSystemAttributesWithHttpInfo(@Param("elid") String elid, LogicalConnectionServermgmtSystemAttributesRequest body, @QueryMap(encoded=true) LogicalConnectionServermgmtSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalConnectionServermgmtSystemAttributes</code> method in a fluent style.
   */
  public static class LogicalConnectionServermgmtSystemAttributesQueryParams extends HashMap<String, Object> {
    public LogicalConnectionServermgmtSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Logical connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateLogicalConnectionServermgmtResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateLogicalConnectionServermgmtResponse updateLogicalConnectionServermgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLogicalConnectionServermgmtRequestData body);

  /**
   * Modify
   * Similar to <code>updateLogicalConnectionServermgmt</code> but it also returns the http response headers .
   * Modify Logical connection
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateLogicalConnectionServermgmtResponse> updateLogicalConnectionServermgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLogicalConnectionServermgmtRequestData body);


  /**
   * Modify
   * Modify Logical connection
   * Note, this is equivalent to the other <code>updateLogicalConnectionServermgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateLogicalConnectionServermgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateLogicalConnectionServermgmtResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateLogicalConnectionServermgmtResponse updateLogicalConnectionServermgmt(@Param("elid") String elid, UpdateLogicalConnectionServermgmtRequestData body, @QueryMap(encoded=true) UpdateLogicalConnectionServermgmtQueryParams queryParams);

  /**
  * Modify
  * Modify Logical connection
  * Note, this is equivalent to the other <code>updateLogicalConnectionServermgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateLogicalConnectionServermgmtResponse
      */
      @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateLogicalConnectionServermgmtResponse> updateLogicalConnectionServermgmtWithHttpInfo(@Param("elid") String elid, UpdateLogicalConnectionServermgmtRequestData body, @QueryMap(encoded=true) UpdateLogicalConnectionServermgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateLogicalConnectionServermgmt</code> method in a fluent style.
   */
  public static class UpdateLogicalConnectionServermgmtQueryParams extends HashMap<String, Object> {
    public UpdateLogicalConnectionServermgmtQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesLogicalConnectionServermgmtResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesLogicalConnectionServermgmtResponse updateSystemAttributesLogicalConnectionServermgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesLogicalConnectionServermgmtRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesLogicalConnectionServermgmt</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesLogicalConnectionServermgmtResponse> updateSystemAttributesLogicalConnectionServermgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesLogicalConnectionServermgmtRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesLogicalConnectionServermgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesLogicalConnectionServermgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesLogicalConnectionServermgmtResponse
   */
  @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesLogicalConnectionServermgmtResponse updateSystemAttributesLogicalConnectionServermgmt(@Param("elid") String elid, UpdateSystemAttributesLogicalConnectionServermgmtRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesLogicalConnectionServermgmtQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesLogicalConnectionServermgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesLogicalConnectionServermgmtResponse
      */
      @RequestLine("POST /api/rest/entity/logicalConnectionServermgmt/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesLogicalConnectionServermgmtResponse> updateSystemAttributesLogicalConnectionServermgmtWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesLogicalConnectionServermgmtRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesLogicalConnectionServermgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesLogicalConnectionServermgmt</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesLogicalConnectionServermgmtQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesLogicalConnectionServermgmtQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
