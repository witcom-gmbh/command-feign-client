package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateLinkSubdividedPortsLogicalPortRequestData;
import com.fntsoftware.businessgateway.entities.CreateLinkSubdividedPortsLogicalPortResponse;
import com.fntsoftware.businessgateway.entities.CreateSupportType1LogicalPortRequestData;
import com.fntsoftware.businessgateway.entities.CreateSupportType1LogicalPortResponse;
import com.fntsoftware.businessgateway.entities.CreateSupportType2LogicalPortRequestData;
import com.fntsoftware.businessgateway.entities.CreateSupportType2LogicalPortResponse;
import com.fntsoftware.businessgateway.entities.CreateSupportType3LogicalPortRequestData;
import com.fntsoftware.businessgateway.entities.CreateSupportType3LogicalPortResponse;
import com.fntsoftware.businessgateway.entities.DeleteLogicalPortRequestData;
import com.fntsoftware.businessgateway.entities.DeleteLogicalPortResponse;
import com.fntsoftware.businessgateway.entities.LogicalPortAggregatedPortsRequest;
import com.fntsoftware.businessgateway.entities.LogicalPortAggregatedPortsResponse;
import com.fntsoftware.businessgateway.entities.LogicalPortBearerRxRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortBearerRxResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortBearerTxRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortBearerTxResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortContractsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortContractsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortCustomIpaccessSvcRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortCustomIpaccessSvcResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortCustomSvidRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortCustomSvidResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortCustomTcoInterconnectRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortCustomTcoInterconnectResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortDeviceAllResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortLogicalPortsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortLogicalPortsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortNetworkElementRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortNetworkElementResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortParentDeviceRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortParentDeviceResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortPersonsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortPersonsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortQueryRequest;
import com.fntsoftware.businessgateway.entities.LogicalPortQueryResponse;
import com.fntsoftware.businessgateway.entities.LogicalPortSubdividedPortsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalPortSubdividedPortsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalPortSubdivisionedPortsRequest;
import com.fntsoftware.businessgateway.entities.LogicalPortSubdivisionedPortsResponse;
import com.fntsoftware.businessgateway.entities.LogicalPortSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.LogicalPortSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSupportType1LogicalPortRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSupportType1LogicalPortResponse;
import com.fntsoftware.businessgateway.entities.UpdateSupportType2LogicalPortRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSupportType2LogicalPortResponse;
import com.fntsoftware.businessgateway.entities.UpdateSupportType3LogicalPortRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSupportType3LogicalPortResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesLogicalPortRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesLogicalPortResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface LogicalPortApi extends ApiClient.Api {


  /**
   * Divide logical port
   * Subdivision
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CreateLinkSubdividedPortsLogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/createLinkSubdividedPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateLinkSubdividedPortsLogicalPortResponse createLinkSubdividedPortsLogicalPort(@Param("sessionId") String sessionId, @Param("elid") String elid, CreateLinkSubdividedPortsLogicalPortRequestData body);

  /**
   * Divide logical port
   * Similar to <code>createLinkSubdividedPortsLogicalPort</code> but it also returns the http response headers .
   * Subdivision
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/createLinkSubdividedPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateLinkSubdividedPortsLogicalPortResponse> createLinkSubdividedPortsLogicalPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CreateLinkSubdividedPortsLogicalPortRequestData body);


  /**
   * Divide logical port
   * Subdivision
   * Note, this is equivalent to the other <code>createLinkSubdividedPortsLogicalPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateLinkSubdividedPortsLogicalPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateLinkSubdividedPortsLogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/createLinkSubdividedPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateLinkSubdividedPortsLogicalPortResponse createLinkSubdividedPortsLogicalPort(@Param("elid") String elid, CreateLinkSubdividedPortsLogicalPortRequestData body, @QueryMap(encoded=true) CreateLinkSubdividedPortsLogicalPortQueryParams queryParams);

  /**
  * Divide logical port
  * Subdivision
  * Note, this is equivalent to the other <code>createLinkSubdividedPortsLogicalPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateLinkSubdividedPortsLogicalPortResponse
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/createLinkSubdividedPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateLinkSubdividedPortsLogicalPortResponse> createLinkSubdividedPortsLogicalPortWithHttpInfo(@Param("elid") String elid, CreateLinkSubdividedPortsLogicalPortRequestData body, @QueryMap(encoded=true) CreateLinkSubdividedPortsLogicalPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createLinkSubdividedPortsLogicalPort</code> method in a fluent style.
   */
  public static class CreateLinkSubdividedPortsLogicalPortQueryParams extends HashMap<String, Object> {
    public CreateLinkSubdividedPortsLogicalPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create PTOLP type 1
   * Create PTOLP type 1
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSupportType1LogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/createSupportType1?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSupportType1LogicalPortResponse createSupportType1LogicalPort(@Param("sessionId") String sessionId, CreateSupportType1LogicalPortRequestData body);

  /**
   * Create PTOLP type 1
   * Similar to <code>createSupportType1LogicalPort</code> but it also returns the http response headers .
   * Create PTOLP type 1
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/createSupportType1?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSupportType1LogicalPortResponse> createSupportType1LogicalPortWithHttpInfo(@Param("sessionId") String sessionId, CreateSupportType1LogicalPortRequestData body);


  /**
   * Create PTOLP type 1
   * Create PTOLP type 1
   * Note, this is equivalent to the other <code>createSupportType1LogicalPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSupportType1LogicalPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSupportType1LogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/createSupportType1?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSupportType1LogicalPortResponse createSupportType1LogicalPort(CreateSupportType1LogicalPortRequestData body, @QueryMap(encoded=true) CreateSupportType1LogicalPortQueryParams queryParams);

  /**
  * Create PTOLP type 1
  * Create PTOLP type 1
  * Note, this is equivalent to the other <code>createSupportType1LogicalPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSupportType1LogicalPortResponse
      */
      @RequestLine("POST /api/rest/entity/logicalPort/createSupportType1?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSupportType1LogicalPortResponse> createSupportType1LogicalPortWithHttpInfo(CreateSupportType1LogicalPortRequestData body, @QueryMap(encoded=true) CreateSupportType1LogicalPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSupportType1LogicalPort</code> method in a fluent style.
   */
  public static class CreateSupportType1LogicalPortQueryParams extends HashMap<String, Object> {
    public CreateSupportType1LogicalPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create PTOLP type 2
   * Create PTOLP type 2
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSupportType2LogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/createSupportType2?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSupportType2LogicalPortResponse createSupportType2LogicalPort(@Param("sessionId") String sessionId, CreateSupportType2LogicalPortRequestData body);

  /**
   * Create PTOLP type 2
   * Similar to <code>createSupportType2LogicalPort</code> but it also returns the http response headers .
   * Create PTOLP type 2
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/createSupportType2?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSupportType2LogicalPortResponse> createSupportType2LogicalPortWithHttpInfo(@Param("sessionId") String sessionId, CreateSupportType2LogicalPortRequestData body);


  /**
   * Create PTOLP type 2
   * Create PTOLP type 2
   * Note, this is equivalent to the other <code>createSupportType2LogicalPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSupportType2LogicalPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSupportType2LogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/createSupportType2?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSupportType2LogicalPortResponse createSupportType2LogicalPort(CreateSupportType2LogicalPortRequestData body, @QueryMap(encoded=true) CreateSupportType2LogicalPortQueryParams queryParams);

  /**
  * Create PTOLP type 2
  * Create PTOLP type 2
  * Note, this is equivalent to the other <code>createSupportType2LogicalPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSupportType2LogicalPortResponse
      */
      @RequestLine("POST /api/rest/entity/logicalPort/createSupportType2?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSupportType2LogicalPortResponse> createSupportType2LogicalPortWithHttpInfo(CreateSupportType2LogicalPortRequestData body, @QueryMap(encoded=true) CreateSupportType2LogicalPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSupportType2LogicalPort</code> method in a fluent style.
   */
  public static class CreateSupportType2LogicalPortQueryParams extends HashMap<String, Object> {
    public CreateSupportType2LogicalPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create PTOLP type 3
   * Create PTOLP type 3
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSupportType3LogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/createSupportType3?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSupportType3LogicalPortResponse createSupportType3LogicalPort(@Param("sessionId") String sessionId, CreateSupportType3LogicalPortRequestData body);

  /**
   * Create PTOLP type 3
   * Similar to <code>createSupportType3LogicalPort</code> but it also returns the http response headers .
   * Create PTOLP type 3
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/createSupportType3?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSupportType3LogicalPortResponse> createSupportType3LogicalPortWithHttpInfo(@Param("sessionId") String sessionId, CreateSupportType3LogicalPortRequestData body);


  /**
   * Create PTOLP type 3
   * Create PTOLP type 3
   * Note, this is equivalent to the other <code>createSupportType3LogicalPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSupportType3LogicalPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSupportType3LogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/createSupportType3?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSupportType3LogicalPortResponse createSupportType3LogicalPort(CreateSupportType3LogicalPortRequestData body, @QueryMap(encoded=true) CreateSupportType3LogicalPortQueryParams queryParams);

  /**
  * Create PTOLP type 3
  * Create PTOLP type 3
  * Note, this is equivalent to the other <code>createSupportType3LogicalPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSupportType3LogicalPortResponse
      */
      @RequestLine("POST /api/rest/entity/logicalPort/createSupportType3?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSupportType3LogicalPortResponse> createSupportType3LogicalPortWithHttpInfo(CreateSupportType3LogicalPortRequestData body, @QueryMap(encoded=true) CreateSupportType3LogicalPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSupportType3LogicalPort</code> method in a fluent style.
   */
  public static class CreateSupportType3LogicalPortQueryParams extends HashMap<String, Object> {
    public CreateSupportType3LogicalPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete logical port
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteLogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteLogicalPortResponse deleteLogicalPort(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteLogicalPortRequestData body);

  /**
   * Delete
   * Similar to <code>deleteLogicalPort</code> but it also returns the http response headers .
   * Delete logical port
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteLogicalPortResponse> deleteLogicalPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteLogicalPortRequestData body);


  /**
   * Delete
   * Delete logical port
   * Note, this is equivalent to the other <code>deleteLogicalPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteLogicalPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteLogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteLogicalPortResponse deleteLogicalPort(@Param("elid") String elid, DeleteLogicalPortRequestData body, @QueryMap(encoded=true) DeleteLogicalPortQueryParams queryParams);

  /**
  * Delete
  * Delete logical port
  * Note, this is equivalent to the other <code>deleteLogicalPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteLogicalPortResponse
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteLogicalPortResponse> deleteLogicalPortWithHttpInfo(@Param("elid") String elid, DeleteLogicalPortRequestData body, @QueryMap(encoded=true) DeleteLogicalPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteLogicalPort</code> method in a fluent style.
   */
  public static class DeleteLogicalPortQueryParams extends HashMap<String, Object> {
    public DeleteLogicalPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Aggregation query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortAggregatedPortsResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/AggregatedPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortAggregatedPortsResponse logicalPortAggregatedPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortAggregatedPortsRequest body);

  /**
   * Aggregation query
   * Similar to <code>logicalPortAggregatedPorts</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/AggregatedPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortAggregatedPortsResponse> logicalPortAggregatedPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortAggregatedPortsRequest body);


  /**
   * Aggregation query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>logicalPortAggregatedPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortAggregatedPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortAggregatedPortsResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/AggregatedPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortAggregatedPortsResponse logicalPortAggregatedPorts(@Param("elid") String elid, LogicalPortAggregatedPortsRequest body, @QueryMap(encoded=true) LogicalPortAggregatedPortsQueryParams queryParams);

  /**
  * Aggregation query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>logicalPortAggregatedPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortAggregatedPortsResponse
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/AggregatedPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortAggregatedPortsResponse> logicalPortAggregatedPortsWithHttpInfo(@Param("elid") String elid, LogicalPortAggregatedPortsRequest body, @QueryMap(encoded=true) LogicalPortAggregatedPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortAggregatedPorts</code> method in a fluent style.
   */
  public static class LogicalPortAggregatedPortsQueryParams extends HashMap<String, Object> {
    public LogicalPortAggregatedPortsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Bearer RX entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortBearerRxResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/BearerRx?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortBearerRxResponseData logicalPortBearerRx(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortBearerRxRequestData body);

  /**
   * Get relations to Bearer RX entities
   * Similar to <code>logicalPortBearerRx</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/BearerRx?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortBearerRxResponseData> logicalPortBearerRxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortBearerRxRequestData body);


  /**
   * Get relations to Bearer RX entities
   * 
   * Note, this is equivalent to the other <code>logicalPortBearerRx</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortBearerRxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortBearerRxResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/BearerRx?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortBearerRxResponseData logicalPortBearerRx(@Param("elid") String elid, LogicalPortBearerRxRequestData body, @QueryMap(encoded=true) LogicalPortBearerRxQueryParams queryParams);

  /**
  * Get relations to Bearer RX entities
  * 
  * Note, this is equivalent to the other <code>logicalPortBearerRx</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortBearerRxResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/BearerRx?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortBearerRxResponseData> logicalPortBearerRxWithHttpInfo(@Param("elid") String elid, LogicalPortBearerRxRequestData body, @QueryMap(encoded=true) LogicalPortBearerRxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortBearerRx</code> method in a fluent style.
   */
  public static class LogicalPortBearerRxQueryParams extends HashMap<String, Object> {
    public LogicalPortBearerRxQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Bearer TX entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortBearerTxResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/BearerTx?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortBearerTxResponseData logicalPortBearerTx(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortBearerTxRequestData body);

  /**
   * Get relations to Bearer TX entities
   * Similar to <code>logicalPortBearerTx</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/BearerTx?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortBearerTxResponseData> logicalPortBearerTxWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortBearerTxRequestData body);


  /**
   * Get relations to Bearer TX entities
   * 
   * Note, this is equivalent to the other <code>logicalPortBearerTx</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortBearerTxQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortBearerTxResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/BearerTx?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortBearerTxResponseData logicalPortBearerTx(@Param("elid") String elid, LogicalPortBearerTxRequestData body, @QueryMap(encoded=true) LogicalPortBearerTxQueryParams queryParams);

  /**
  * Get relations to Bearer TX entities
  * 
  * Note, this is equivalent to the other <code>logicalPortBearerTx</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortBearerTxResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/BearerTx?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortBearerTxResponseData> logicalPortBearerTxWithHttpInfo(@Param("elid") String elid, LogicalPortBearerTxRequestData body, @QueryMap(encoded=true) LogicalPortBearerTxQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortBearerTx</code> method in a fluent style.
   */
  public static class LogicalPortBearerTxQueryParams extends HashMap<String, Object> {
    public LogicalPortBearerTxQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortContractsResponseData logicalPortContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>logicalPortContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortContractsResponseData> logicalPortContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>logicalPortContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortContractsResponseData logicalPortContracts(@Param("elid") String elid, LogicalPortContractsRequestData body, @QueryMap(encoded=true) LogicalPortContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>logicalPortContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortContractsResponseData> logicalPortContractsWithHttpInfo(@Param("elid") String elid, LogicalPortContractsRequestData body, @QueryMap(encoded=true) LogicalPortContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortContracts</code> method in a fluent style.
   */
  public static class LogicalPortContractsQueryParams extends HashMap<String, Object> {
    public LogicalPortContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IP-Access Service entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortCustomIpaccessSvcResponseData logicalPortCustomIpaccessSvc(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortCustomIpaccessSvcRequestData body);

  /**
   * Get relations to IP-Access Service entities
   * Similar to <code>logicalPortCustomIpaccessSvc</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortCustomIpaccessSvcResponseData> logicalPortCustomIpaccessSvcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortCustomIpaccessSvcRequestData body);


  /**
   * Get relations to IP-Access Service entities
   * 
   * Note, this is equivalent to the other <code>logicalPortCustomIpaccessSvc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortCustomIpaccessSvcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortCustomIpaccessSvcResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortCustomIpaccessSvcResponseData logicalPortCustomIpaccessSvc(@Param("elid") String elid, LogicalPortCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) LogicalPortCustomIpaccessSvcQueryParams queryParams);

  /**
  * Get relations to IP-Access Service entities
  * 
  * Note, this is equivalent to the other <code>logicalPortCustomIpaccessSvc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortCustomIpaccessSvcResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/CustomIpaccessSvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortCustomIpaccessSvcResponseData> logicalPortCustomIpaccessSvcWithHttpInfo(@Param("elid") String elid, LogicalPortCustomIpaccessSvcRequestData body, @QueryMap(encoded=true) LogicalPortCustomIpaccessSvcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortCustomIpaccessSvc</code> method in a fluent style.
   */
  public static class LogicalPortCustomIpaccessSvcQueryParams extends HashMap<String, Object> {
    public LogicalPortCustomIpaccessSvcQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to S-VLAN entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortCustomSvidResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/CustomSvid?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortCustomSvidResponseData logicalPortCustomSvid(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortCustomSvidRequestData body);

  /**
   * Get relations to S-VLAN entities
   * Similar to <code>logicalPortCustomSvid</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/CustomSvid?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortCustomSvidResponseData> logicalPortCustomSvidWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortCustomSvidRequestData body);


  /**
   * Get relations to S-VLAN entities
   * 
   * Note, this is equivalent to the other <code>logicalPortCustomSvid</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortCustomSvidQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortCustomSvidResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/CustomSvid?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortCustomSvidResponseData logicalPortCustomSvid(@Param("elid") String elid, LogicalPortCustomSvidRequestData body, @QueryMap(encoded=true) LogicalPortCustomSvidQueryParams queryParams);

  /**
  * Get relations to S-VLAN entities
  * 
  * Note, this is equivalent to the other <code>logicalPortCustomSvid</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortCustomSvidResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/CustomSvid?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortCustomSvidResponseData> logicalPortCustomSvidWithHttpInfo(@Param("elid") String elid, LogicalPortCustomSvidRequestData body, @QueryMap(encoded=true) LogicalPortCustomSvidQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortCustomSvid</code> method in a fluent style.
   */
  public static class LogicalPortCustomSvidQueryParams extends HashMap<String, Object> {
    public LogicalPortCustomSvidQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Telco-Interconnect entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortCustomTcoInterconnectResponseData logicalPortCustomTcoInterconnect(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortCustomTcoInterconnectRequestData body);

  /**
   * Get relations to Telco-Interconnect entities
   * Similar to <code>logicalPortCustomTcoInterconnect</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortCustomTcoInterconnectResponseData> logicalPortCustomTcoInterconnectWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortCustomTcoInterconnectRequestData body);


  /**
   * Get relations to Telco-Interconnect entities
   * 
   * Note, this is equivalent to the other <code>logicalPortCustomTcoInterconnect</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortCustomTcoInterconnectQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortCustomTcoInterconnectResponseData logicalPortCustomTcoInterconnect(@Param("elid") String elid, LogicalPortCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) LogicalPortCustomTcoInterconnectQueryParams queryParams);

  /**
  * Get relations to Telco-Interconnect entities
  * 
  * Note, this is equivalent to the other <code>logicalPortCustomTcoInterconnect</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortCustomTcoInterconnectResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortCustomTcoInterconnectResponseData> logicalPortCustomTcoInterconnectWithHttpInfo(@Param("elid") String elid, LogicalPortCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) LogicalPortCustomTcoInterconnectQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortCustomTcoInterconnect</code> method in a fluent style.
   */
  public static class LogicalPortCustomTcoInterconnectQueryParams extends HashMap<String, Object> {
    public LogicalPortCustomTcoInterconnectQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to DeviceToLogicalPortLink entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/DeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortDeviceAllResponseData logicalPortDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortDeviceAllRequestData body);

  /**
   * Get relations to DeviceToLogicalPortLink entities
   * Similar to <code>logicalPortDeviceAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/DeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortDeviceAllResponseData> logicalPortDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortDeviceAllRequestData body);


  /**
   * Get relations to DeviceToLogicalPortLink entities
   * 
   * Note, this is equivalent to the other <code>logicalPortDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/DeviceAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortDeviceAllResponseData logicalPortDeviceAll(@Param("elid") String elid, LogicalPortDeviceAllRequestData body, @QueryMap(encoded=true) LogicalPortDeviceAllQueryParams queryParams);

  /**
  * Get relations to DeviceToLogicalPortLink entities
  * 
  * Note, this is equivalent to the other <code>logicalPortDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortDeviceAllResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/DeviceAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortDeviceAllResponseData> logicalPortDeviceAllWithHttpInfo(@Param("elid") String elid, LogicalPortDeviceAllRequestData body, @QueryMap(encoded=true) LogicalPortDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortDeviceAll</code> method in a fluent style.
   */
  public static class LogicalPortDeviceAllQueryParams extends HashMap<String, Object> {
    public LogicalPortDeviceAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Frame contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortFrameContractsResponseData logicalPortFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>logicalPortFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortFrameContractsResponseData> logicalPortFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>logicalPortFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortFrameContractsResponseData logicalPortFrameContracts(@Param("elid") String elid, LogicalPortFrameContractsRequestData body, @QueryMap(encoded=true) LogicalPortFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>logicalPortFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortFrameContractsResponseData> logicalPortFrameContractsWithHttpInfo(@Param("elid") String elid, LogicalPortFrameContractsRequestData body, @QueryMap(encoded=true) LogicalPortFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortFrameContracts</code> method in a fluent style.
   */
  public static class LogicalPortFrameContractsQueryParams extends HashMap<String, Object> {
    public LogicalPortFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Aggregation entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortLogicalPortsResponseData logicalPortLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortLogicalPortsRequestData body);

  /**
   * Get relations to Aggregation entities
   * Similar to <code>logicalPortLogicalPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortLogicalPortsResponseData> logicalPortLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortLogicalPortsRequestData body);


  /**
   * Get relations to Aggregation entities
   * 
   * Note, this is equivalent to the other <code>logicalPortLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortLogicalPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortLogicalPortsResponseData logicalPortLogicalPorts(@Param("elid") String elid, LogicalPortLogicalPortsRequestData body, @QueryMap(encoded=true) LogicalPortLogicalPortsQueryParams queryParams);

  /**
  * Get relations to Aggregation entities
  * 
  * Note, this is equivalent to the other <code>logicalPortLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortLogicalPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortLogicalPortsResponseData> logicalPortLogicalPortsWithHttpInfo(@Param("elid") String elid, LogicalPortLogicalPortsRequestData body, @QueryMap(encoded=true) LogicalPortLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortLogicalPorts</code> method in a fluent style.
   */
  public static class LogicalPortLogicalPortsQueryParams extends HashMap<String, Object> {
    public LogicalPortLogicalPortsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Maintenance contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortMaintenanceContractsResponseData logicalPortMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>logicalPortMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortMaintenanceContractsResponseData> logicalPortMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>logicalPortMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortMaintenanceContractsResponseData logicalPortMaintenanceContracts(@Param("elid") String elid, LogicalPortMaintenanceContractsRequestData body, @QueryMap(encoded=true) LogicalPortMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>logicalPortMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortMaintenanceContractsResponseData> logicalPortMaintenanceContractsWithHttpInfo(@Param("elid") String elid, LogicalPortMaintenanceContractsRequestData body, @QueryMap(encoded=true) LogicalPortMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortMaintenanceContracts</code> method in a fluent style.
   */
  public static class LogicalPortMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public LogicalPortMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Network element entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortNetworkElementResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/NetworkElement?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortNetworkElementResponseData logicalPortNetworkElement(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortNetworkElementRequestData body);

  /**
   * Get relations to Network element entities
   * Similar to <code>logicalPortNetworkElement</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/NetworkElement?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortNetworkElementResponseData> logicalPortNetworkElementWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortNetworkElementRequestData body);


  /**
   * Get relations to Network element entities
   * 
   * Note, this is equivalent to the other <code>logicalPortNetworkElement</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortNetworkElementQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortNetworkElementResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/NetworkElement?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortNetworkElementResponseData logicalPortNetworkElement(@Param("elid") String elid, LogicalPortNetworkElementRequestData body, @QueryMap(encoded=true) LogicalPortNetworkElementQueryParams queryParams);

  /**
  * Get relations to Network element entities
  * 
  * Note, this is equivalent to the other <code>logicalPortNetworkElement</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortNetworkElementResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/NetworkElement?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortNetworkElementResponseData> logicalPortNetworkElementWithHttpInfo(@Param("elid") String elid, LogicalPortNetworkElementRequestData body, @QueryMap(encoded=true) LogicalPortNetworkElementQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortNetworkElement</code> method in a fluent style.
   */
  public static class LogicalPortNetworkElementQueryParams extends HashMap<String, Object> {
    public LogicalPortNetworkElementQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Organization entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortOrganizationsResponseData logicalPortOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>logicalPortOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortOrganizationsResponseData> logicalPortOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>logicalPortOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortOrganizationsResponseData logicalPortOrganizations(@Param("elid") String elid, LogicalPortOrganizationsRequestData body, @QueryMap(encoded=true) LogicalPortOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>logicalPortOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortOrganizationsResponseData> logicalPortOrganizationsWithHttpInfo(@Param("elid") String elid, LogicalPortOrganizationsRequestData body, @QueryMap(encoded=true) LogicalPortOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortOrganizations</code> method in a fluent style.
   */
  public static class LogicalPortOrganizationsQueryParams extends HashMap<String, Object> {
    public LogicalPortOrganizationsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to ParentDeviceToLogicalPortLink entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortParentDeviceResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/ParentDevice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortParentDeviceResponseData logicalPortParentDevice(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortParentDeviceRequestData body);

  /**
   * Get relations to ParentDeviceToLogicalPortLink entities
   * Similar to <code>logicalPortParentDevice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/ParentDevice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortParentDeviceResponseData> logicalPortParentDeviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortParentDeviceRequestData body);


  /**
   * Get relations to ParentDeviceToLogicalPortLink entities
   * 
   * Note, this is equivalent to the other <code>logicalPortParentDevice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortParentDeviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortParentDeviceResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/ParentDevice?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortParentDeviceResponseData logicalPortParentDevice(@Param("elid") String elid, LogicalPortParentDeviceRequestData body, @QueryMap(encoded=true) LogicalPortParentDeviceQueryParams queryParams);

  /**
  * Get relations to ParentDeviceToLogicalPortLink entities
  * 
  * Note, this is equivalent to the other <code>logicalPortParentDevice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortParentDeviceResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/ParentDevice?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortParentDeviceResponseData> logicalPortParentDeviceWithHttpInfo(@Param("elid") String elid, LogicalPortParentDeviceRequestData body, @QueryMap(encoded=true) LogicalPortParentDeviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortParentDevice</code> method in a fluent style.
   */
  public static class LogicalPortParentDeviceQueryParams extends HashMap<String, Object> {
    public LogicalPortParentDeviceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Person group entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortPersonGroupsResponseData logicalPortPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>logicalPortPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortPersonGroupsResponseData> logicalPortPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>logicalPortPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortPersonGroupsResponseData logicalPortPersonGroups(@Param("elid") String elid, LogicalPortPersonGroupsRequestData body, @QueryMap(encoded=true) LogicalPortPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>logicalPortPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortPersonGroupsResponseData> logicalPortPersonGroupsWithHttpInfo(@Param("elid") String elid, LogicalPortPersonGroupsRequestData body, @QueryMap(encoded=true) LogicalPortPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortPersonGroups</code> method in a fluent style.
   */
  public static class LogicalPortPersonGroupsQueryParams extends HashMap<String, Object> {
    public LogicalPortPersonGroupsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Person entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortPersonsResponseData logicalPortPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>logicalPortPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortPersonsResponseData> logicalPortPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>logicalPortPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortPersonsResponseData logicalPortPersons(@Param("elid") String elid, LogicalPortPersonsRequestData body, @QueryMap(encoded=true) LogicalPortPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>logicalPortPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortPersonsResponseData> logicalPortPersonsWithHttpInfo(@Param("elid") String elid, LogicalPortPersonsRequestData body, @QueryMap(encoded=true) LogicalPortPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortPersons</code> method in a fluent style.
   */
  public static class LogicalPortPersonsQueryParams extends HashMap<String, Object> {
    public LogicalPortPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to PortToLogicalPortLink entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortPhysicalPortsDataResponseData logicalPortPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortPhysicalPortsDataRequestData body);

  /**
   * Get relations to PortToLogicalPortLink entities
   * Similar to <code>logicalPortPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortPhysicalPortsDataResponseData> logicalPortPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortPhysicalPortsDataRequestData body);


  /**
   * Get relations to PortToLogicalPortLink entities
   * 
   * Note, this is equivalent to the other <code>logicalPortPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortPhysicalPortsDataResponseData logicalPortPhysicalPortsData(@Param("elid") String elid, LogicalPortPhysicalPortsDataRequestData body, @QueryMap(encoded=true) LogicalPortPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to PortToLogicalPortLink entities
  * 
  * Note, this is equivalent to the other <code>logicalPortPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortPhysicalPortsDataResponseData> logicalPortPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, LogicalPortPhysicalPortsDataRequestData body, @QueryMap(encoded=true) LogicalPortPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortPhysicalPortsData</code> method in a fluent style.
   */
  public static class LogicalPortPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public LogicalPortPhysicalPortsDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return LogicalPortQueryResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortQueryResponse logicalPortQuery(@Param("sessionId") String sessionId, LogicalPortQueryRequest body);

  /**
   * Basic query
   * Similar to <code>logicalPortQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortQueryResponse> logicalPortQueryWithHttpInfo(@Param("sessionId") String sessionId, LogicalPortQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>logicalPortQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortQueryResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortQueryResponse logicalPortQuery(LogicalPortQueryRequest body, @QueryMap(encoded=true) LogicalPortQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>logicalPortQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortQueryResponse
      */
      @RequestLine("POST /api/rest/entity/logicalPort/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortQueryResponse> logicalPortQueryWithHttpInfo(LogicalPortQueryRequest body, @QueryMap(encoded=true) LogicalPortQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortQuery</code> method in a fluent style.
   */
  public static class LogicalPortQueryQueryParams extends HashMap<String, Object> {
    public LogicalPortQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Subdivision entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortSubdividedPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/SubdividedPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortSubdividedPortsResponseData logicalPortSubdividedPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortSubdividedPortsRequestData body);

  /**
   * Get relations to Subdivision entities
   * Similar to <code>logicalPortSubdividedPorts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/SubdividedPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortSubdividedPortsResponseData> logicalPortSubdividedPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortSubdividedPortsRequestData body);


  /**
   * Get relations to Subdivision entities
   * 
   * Note, this is equivalent to the other <code>logicalPortSubdividedPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortSubdividedPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortSubdividedPortsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/SubdividedPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortSubdividedPortsResponseData logicalPortSubdividedPorts(@Param("elid") String elid, LogicalPortSubdividedPortsRequestData body, @QueryMap(encoded=true) LogicalPortSubdividedPortsQueryParams queryParams);

  /**
  * Get relations to Subdivision entities
  * 
  * Note, this is equivalent to the other <code>logicalPortSubdividedPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortSubdividedPortsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/SubdividedPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortSubdividedPortsResponseData> logicalPortSubdividedPortsWithHttpInfo(@Param("elid") String elid, LogicalPortSubdividedPortsRequestData body, @QueryMap(encoded=true) LogicalPortSubdividedPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortSubdividedPorts</code> method in a fluent style.
   */
  public static class LogicalPortSubdividedPortsQueryParams extends HashMap<String, Object> {
    public LogicalPortSubdividedPortsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Subdivision query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalPortSubdivisionedPortsResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/SubdivisionedPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortSubdivisionedPortsResponse logicalPortSubdivisionedPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortSubdivisionedPortsRequest body);

  /**
   * Subdivision query
   * Similar to <code>logicalPortSubdivisionedPorts</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/SubdivisionedPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortSubdivisionedPortsResponse> logicalPortSubdivisionedPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortSubdivisionedPortsRequest body);


  /**
   * Subdivision query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>logicalPortSubdivisionedPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortSubdivisionedPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortSubdivisionedPortsResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/SubdivisionedPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortSubdivisionedPortsResponse logicalPortSubdivisionedPorts(@Param("elid") String elid, LogicalPortSubdivisionedPortsRequest body, @QueryMap(encoded=true) LogicalPortSubdivisionedPortsQueryParams queryParams);

  /**
  * Subdivision query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>logicalPortSubdivisionedPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortSubdivisionedPortsResponse
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/SubdivisionedPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortSubdivisionedPortsResponse> logicalPortSubdivisionedPortsWithHttpInfo(@Param("elid") String elid, LogicalPortSubdivisionedPortsRequest body, @QueryMap(encoded=true) LogicalPortSubdivisionedPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortSubdivisionedPorts</code> method in a fluent style.
   */
  public static class LogicalPortSubdivisionedPortsQueryParams extends HashMap<String, Object> {
    public LogicalPortSubdivisionedPortsQueryParams sessionId(final String value) {
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
   * @return LogicalPortSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalPortSystemAttributesResponse logicalPortSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>logicalPortSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalPortSystemAttributesResponse> logicalPortSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalPortSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>logicalPortSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalPortSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalPortSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalPortSystemAttributesResponse logicalPortSystemAttributes(@Param("elid") String elid, LogicalPortSystemAttributesRequest body, @QueryMap(encoded=true) LogicalPortSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>logicalPortSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalPortSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalPortSystemAttributesResponse> logicalPortSystemAttributesWithHttpInfo(@Param("elid") String elid, LogicalPortSystemAttributesRequest body, @QueryMap(encoded=true) LogicalPortSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalPortSystemAttributes</code> method in a fluent style.
   */
  public static class LogicalPortSystemAttributesQueryParams extends HashMap<String, Object> {
    public LogicalPortSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify PTOLP type 1
   * Modify PTOLP type 1
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSupportType1LogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSupportType1?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSupportType1LogicalPortResponse updateSupportType1LogicalPort(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSupportType1LogicalPortRequestData body);

  /**
   * Modify PTOLP type 1
   * Similar to <code>updateSupportType1LogicalPort</code> but it also returns the http response headers .
   * Modify PTOLP type 1
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSupportType1?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSupportType1LogicalPortResponse> updateSupportType1LogicalPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSupportType1LogicalPortRequestData body);


  /**
   * Modify PTOLP type 1
   * Modify PTOLP type 1
   * Note, this is equivalent to the other <code>updateSupportType1LogicalPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSupportType1LogicalPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSupportType1LogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSupportType1?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSupportType1LogicalPortResponse updateSupportType1LogicalPort(@Param("elid") String elid, UpdateSupportType1LogicalPortRequestData body, @QueryMap(encoded=true) UpdateSupportType1LogicalPortQueryParams queryParams);

  /**
  * Modify PTOLP type 1
  * Modify PTOLP type 1
  * Note, this is equivalent to the other <code>updateSupportType1LogicalPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSupportType1LogicalPortResponse
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSupportType1?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSupportType1LogicalPortResponse> updateSupportType1LogicalPortWithHttpInfo(@Param("elid") String elid, UpdateSupportType1LogicalPortRequestData body, @QueryMap(encoded=true) UpdateSupportType1LogicalPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSupportType1LogicalPort</code> method in a fluent style.
   */
  public static class UpdateSupportType1LogicalPortQueryParams extends HashMap<String, Object> {
    public UpdateSupportType1LogicalPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify PTOLP type 2
   * Modify PTOLP type 2
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSupportType2LogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSupportType2?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSupportType2LogicalPortResponse updateSupportType2LogicalPort(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSupportType2LogicalPortRequestData body);

  /**
   * Modify PTOLP type 2
   * Similar to <code>updateSupportType2LogicalPort</code> but it also returns the http response headers .
   * Modify PTOLP type 2
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSupportType2?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSupportType2LogicalPortResponse> updateSupportType2LogicalPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSupportType2LogicalPortRequestData body);


  /**
   * Modify PTOLP type 2
   * Modify PTOLP type 2
   * Note, this is equivalent to the other <code>updateSupportType2LogicalPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSupportType2LogicalPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSupportType2LogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSupportType2?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSupportType2LogicalPortResponse updateSupportType2LogicalPort(@Param("elid") String elid, UpdateSupportType2LogicalPortRequestData body, @QueryMap(encoded=true) UpdateSupportType2LogicalPortQueryParams queryParams);

  /**
  * Modify PTOLP type 2
  * Modify PTOLP type 2
  * Note, this is equivalent to the other <code>updateSupportType2LogicalPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSupportType2LogicalPortResponse
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSupportType2?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSupportType2LogicalPortResponse> updateSupportType2LogicalPortWithHttpInfo(@Param("elid") String elid, UpdateSupportType2LogicalPortRequestData body, @QueryMap(encoded=true) UpdateSupportType2LogicalPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSupportType2LogicalPort</code> method in a fluent style.
   */
  public static class UpdateSupportType2LogicalPortQueryParams extends HashMap<String, Object> {
    public UpdateSupportType2LogicalPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify PTOLP type 3
   * Modify PTOLP type 3
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSupportType3LogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSupportType3?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSupportType3LogicalPortResponse updateSupportType3LogicalPort(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSupportType3LogicalPortRequestData body);

  /**
   * Modify PTOLP type 3
   * Similar to <code>updateSupportType3LogicalPort</code> but it also returns the http response headers .
   * Modify PTOLP type 3
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSupportType3?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSupportType3LogicalPortResponse> updateSupportType3LogicalPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSupportType3LogicalPortRequestData body);


  /**
   * Modify PTOLP type 3
   * Modify PTOLP type 3
   * Note, this is equivalent to the other <code>updateSupportType3LogicalPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSupportType3LogicalPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSupportType3LogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSupportType3?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSupportType3LogicalPortResponse updateSupportType3LogicalPort(@Param("elid") String elid, UpdateSupportType3LogicalPortRequestData body, @QueryMap(encoded=true) UpdateSupportType3LogicalPortQueryParams queryParams);

  /**
  * Modify PTOLP type 3
  * Modify PTOLP type 3
  * Note, this is equivalent to the other <code>updateSupportType3LogicalPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSupportType3LogicalPortResponse
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSupportType3?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSupportType3LogicalPortResponse> updateSupportType3LogicalPortWithHttpInfo(@Param("elid") String elid, UpdateSupportType3LogicalPortRequestData body, @QueryMap(encoded=true) UpdateSupportType3LogicalPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSupportType3LogicalPort</code> method in a fluent style.
   */
  public static class UpdateSupportType3LogicalPortQueryParams extends HashMap<String, Object> {
    public UpdateSupportType3LogicalPortQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesLogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesLogicalPortResponse updateSystemAttributesLogicalPort(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesLogicalPortRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesLogicalPort</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesLogicalPortResponse> updateSystemAttributesLogicalPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesLogicalPortRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesLogicalPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesLogicalPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesLogicalPortResponse
   */
  @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesLogicalPortResponse updateSystemAttributesLogicalPort(@Param("elid") String elid, UpdateSystemAttributesLogicalPortRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesLogicalPortQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesLogicalPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesLogicalPortResponse
      */
      @RequestLine("POST /api/rest/entity/logicalPort/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesLogicalPortResponse> updateSystemAttributesLogicalPortWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesLogicalPortRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesLogicalPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesLogicalPort</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesLogicalPortQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesLogicalPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
