package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateLogicalAntennaRequestData;
import com.fntsoftware.businessgateway.entities.CreateLogicalAntennaResponse;
import com.fntsoftware.businessgateway.entities.DeleteLogicalAntennaRequestData;
import com.fntsoftware.businessgateway.entities.DeleteLogicalAntennaResponse;
import com.fntsoftware.businessgateway.entities.LogicalAntennaDeviceMasterAntennaRequestData;
import com.fntsoftware.businessgateway.entities.LogicalAntennaDeviceMasterAntennaResponseData;
import com.fntsoftware.businessgateway.entities.LogicalAntennaPhysicalPortsMasterDataRequestData;
import com.fntsoftware.businessgateway.entities.LogicalAntennaPhysicalPortsMasterDataResponseData;
import com.fntsoftware.businessgateway.entities.LogicalAntennaQueryRequest;
import com.fntsoftware.businessgateway.entities.LogicalAntennaQueryResponse;
import com.fntsoftware.businessgateway.entities.LogicalAntennaSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.LogicalAntennaSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateLogicalAntennaRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLogicalAntennaResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesLogicalAntennaRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesLogicalAntennaResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface LogicalAntennaApi extends ApiClient.Api {


  /**
   * Create
   * Create Logical antenna
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateLogicalAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateLogicalAntennaResponse createLogicalAntenna(@Param("sessionId") String sessionId, CreateLogicalAntennaRequestData body);

  /**
   * Create
   * Similar to <code>createLogicalAntenna</code> but it also returns the http response headers .
   * Create Logical antenna
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateLogicalAntennaResponse> createLogicalAntennaWithHttpInfo(@Param("sessionId") String sessionId, CreateLogicalAntennaRequestData body);


  /**
   * Create
   * Create Logical antenna
   * Note, this is equivalent to the other <code>createLogicalAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateLogicalAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateLogicalAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateLogicalAntennaResponse createLogicalAntenna(CreateLogicalAntennaRequestData body, @QueryMap(encoded=true) CreateLogicalAntennaQueryParams queryParams);

  /**
  * Create
  * Create Logical antenna
  * Note, this is equivalent to the other <code>createLogicalAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateLogicalAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/logicalAntenna/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateLogicalAntennaResponse> createLogicalAntennaWithHttpInfo(CreateLogicalAntennaRequestData body, @QueryMap(encoded=true) CreateLogicalAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createLogicalAntenna</code> method in a fluent style.
   */
  public static class CreateLogicalAntennaQueryParams extends HashMap<String, Object> {
    public CreateLogicalAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Logical antenna
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteLogicalAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteLogicalAntennaResponse deleteLogicalAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteLogicalAntennaRequestData body);

  /**
   * Delete
   * Similar to <code>deleteLogicalAntenna</code> but it also returns the http response headers .
   * Delete Logical antenna
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteLogicalAntennaResponse> deleteLogicalAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteLogicalAntennaRequestData body);


  /**
   * Delete
   * Delete Logical antenna
   * Note, this is equivalent to the other <code>deleteLogicalAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteLogicalAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteLogicalAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteLogicalAntennaResponse deleteLogicalAntenna(@Param("elid") String elid, DeleteLogicalAntennaRequestData body, @QueryMap(encoded=true) DeleteLogicalAntennaQueryParams queryParams);

  /**
  * Delete
  * Delete Logical antenna
  * Note, this is equivalent to the other <code>deleteLogicalAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteLogicalAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteLogicalAntennaResponse> deleteLogicalAntennaWithHttpInfo(@Param("elid") String elid, DeleteLogicalAntennaRequestData body, @QueryMap(encoded=true) DeleteLogicalAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteLogicalAntenna</code> method in a fluent style.
   */
  public static class DeleteLogicalAntennaQueryParams extends HashMap<String, Object> {
    public DeleteLogicalAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Antenna device master data entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalAntennaDeviceMasterAntennaResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/DeviceMasterAntenna?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalAntennaDeviceMasterAntennaResponseData logicalAntennaDeviceMasterAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalAntennaDeviceMasterAntennaRequestData body);

  /**
   * Get relations to Antenna device master data entities
   * Similar to <code>logicalAntennaDeviceMasterAntenna</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/DeviceMasterAntenna?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalAntennaDeviceMasterAntennaResponseData> logicalAntennaDeviceMasterAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalAntennaDeviceMasterAntennaRequestData body);


  /**
   * Get relations to Antenna device master data entities
   * 
   * Note, this is equivalent to the other <code>logicalAntennaDeviceMasterAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalAntennaDeviceMasterAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalAntennaDeviceMasterAntennaResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/DeviceMasterAntenna?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalAntennaDeviceMasterAntennaResponseData logicalAntennaDeviceMasterAntenna(@Param("elid") String elid, LogicalAntennaDeviceMasterAntennaRequestData body, @QueryMap(encoded=true) LogicalAntennaDeviceMasterAntennaQueryParams queryParams);

  /**
  * Get relations to Antenna device master data entities
  * 
  * Note, this is equivalent to the other <code>logicalAntennaDeviceMasterAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalAntennaDeviceMasterAntennaResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/DeviceMasterAntenna?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalAntennaDeviceMasterAntennaResponseData> logicalAntennaDeviceMasterAntennaWithHttpInfo(@Param("elid") String elid, LogicalAntennaDeviceMasterAntennaRequestData body, @QueryMap(encoded=true) LogicalAntennaDeviceMasterAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalAntennaDeviceMasterAntenna</code> method in a fluent style.
   */
  public static class LogicalAntennaDeviceMasterAntennaQueryParams extends HashMap<String, Object> {
    public LogicalAntennaDeviceMasterAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Physical port master (data) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalAntennaPhysicalPortsMasterDataResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/PhysicalPortsMasterData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalAntennaPhysicalPortsMasterDataResponseData logicalAntennaPhysicalPortsMasterData(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalAntennaPhysicalPortsMasterDataRequestData body);

  /**
   * Get relations to Physical port master (data) entities
   * Similar to <code>logicalAntennaPhysicalPortsMasterData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/PhysicalPortsMasterData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalAntennaPhysicalPortsMasterDataResponseData> logicalAntennaPhysicalPortsMasterDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalAntennaPhysicalPortsMasterDataRequestData body);


  /**
   * Get relations to Physical port master (data) entities
   * 
   * Note, this is equivalent to the other <code>logicalAntennaPhysicalPortsMasterData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalAntennaPhysicalPortsMasterDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalAntennaPhysicalPortsMasterDataResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/PhysicalPortsMasterData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalAntennaPhysicalPortsMasterDataResponseData logicalAntennaPhysicalPortsMasterData(@Param("elid") String elid, LogicalAntennaPhysicalPortsMasterDataRequestData body, @QueryMap(encoded=true) LogicalAntennaPhysicalPortsMasterDataQueryParams queryParams);

  /**
  * Get relations to Physical port master (data) entities
  * 
  * Note, this is equivalent to the other <code>logicalAntennaPhysicalPortsMasterData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalAntennaPhysicalPortsMasterDataResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/PhysicalPortsMasterData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalAntennaPhysicalPortsMasterDataResponseData> logicalAntennaPhysicalPortsMasterDataWithHttpInfo(@Param("elid") String elid, LogicalAntennaPhysicalPortsMasterDataRequestData body, @QueryMap(encoded=true) LogicalAntennaPhysicalPortsMasterDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalAntennaPhysicalPortsMasterData</code> method in a fluent style.
   */
  public static class LogicalAntennaPhysicalPortsMasterDataQueryParams extends HashMap<String, Object> {
    public LogicalAntennaPhysicalPortsMasterDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return LogicalAntennaQueryResponse
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalAntennaQueryResponse logicalAntennaQuery(@Param("sessionId") String sessionId, LogicalAntennaQueryRequest body);

  /**
   * Basic query
   * Similar to <code>logicalAntennaQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalAntennaQueryResponse> logicalAntennaQueryWithHttpInfo(@Param("sessionId") String sessionId, LogicalAntennaQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>logicalAntennaQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalAntennaQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalAntennaQueryResponse
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalAntennaQueryResponse logicalAntennaQuery(LogicalAntennaQueryRequest body, @QueryMap(encoded=true) LogicalAntennaQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>logicalAntennaQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalAntennaQueryResponse
      */
      @RequestLine("POST /api/rest/entity/logicalAntenna/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalAntennaQueryResponse> logicalAntennaQueryWithHttpInfo(LogicalAntennaQueryRequest body, @QueryMap(encoded=true) LogicalAntennaQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalAntennaQuery</code> method in a fluent style.
   */
  public static class LogicalAntennaQueryQueryParams extends HashMap<String, Object> {
    public LogicalAntennaQueryQueryParams sessionId(final String value) {
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
   * @return LogicalAntennaSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalAntennaSystemAttributesResponse logicalAntennaSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalAntennaSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>logicalAntennaSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalAntennaSystemAttributesResponse> logicalAntennaSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalAntennaSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>logicalAntennaSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalAntennaSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalAntennaSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalAntennaSystemAttributesResponse logicalAntennaSystemAttributes(@Param("elid") String elid, LogicalAntennaSystemAttributesRequest body, @QueryMap(encoded=true) LogicalAntennaSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>logicalAntennaSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalAntennaSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalAntennaSystemAttributesResponse> logicalAntennaSystemAttributesWithHttpInfo(@Param("elid") String elid, LogicalAntennaSystemAttributesRequest body, @QueryMap(encoded=true) LogicalAntennaSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalAntennaSystemAttributes</code> method in a fluent style.
   */
  public static class LogicalAntennaSystemAttributesQueryParams extends HashMap<String, Object> {
    public LogicalAntennaSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Logical antenna
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateLogicalAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateLogicalAntennaResponse updateLogicalAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLogicalAntennaRequestData body);

  /**
   * Modify
   * Similar to <code>updateLogicalAntenna</code> but it also returns the http response headers .
   * Modify Logical antenna
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateLogicalAntennaResponse> updateLogicalAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLogicalAntennaRequestData body);


  /**
   * Modify
   * Modify Logical antenna
   * Note, this is equivalent to the other <code>updateLogicalAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateLogicalAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateLogicalAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateLogicalAntennaResponse updateLogicalAntenna(@Param("elid") String elid, UpdateLogicalAntennaRequestData body, @QueryMap(encoded=true) UpdateLogicalAntennaQueryParams queryParams);

  /**
  * Modify
  * Modify Logical antenna
  * Note, this is equivalent to the other <code>updateLogicalAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateLogicalAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateLogicalAntennaResponse> updateLogicalAntennaWithHttpInfo(@Param("elid") String elid, UpdateLogicalAntennaRequestData body, @QueryMap(encoded=true) UpdateLogicalAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateLogicalAntenna</code> method in a fluent style.
   */
  public static class UpdateLogicalAntennaQueryParams extends HashMap<String, Object> {
    public UpdateLogicalAntennaQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesLogicalAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesLogicalAntennaResponse updateSystemAttributesLogicalAntenna(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesLogicalAntennaRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesLogicalAntenna</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesLogicalAntennaResponse> updateSystemAttributesLogicalAntennaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesLogicalAntennaRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesLogicalAntenna</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesLogicalAntennaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesLogicalAntennaResponse
   */
  @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesLogicalAntennaResponse updateSystemAttributesLogicalAntenna(@Param("elid") String elid, UpdateSystemAttributesLogicalAntennaRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesLogicalAntennaQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesLogicalAntenna</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesLogicalAntennaResponse
      */
      @RequestLine("POST /api/rest/entity/logicalAntenna/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesLogicalAntennaResponse> updateSystemAttributesLogicalAntennaWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesLogicalAntennaRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesLogicalAntennaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesLogicalAntenna</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesLogicalAntennaQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesLogicalAntennaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
