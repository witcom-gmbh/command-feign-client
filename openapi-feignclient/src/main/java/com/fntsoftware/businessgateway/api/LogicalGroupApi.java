package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateLogicalGroupRequestData;
import com.fntsoftware.businessgateway.entities.CreateLogicalGroupResponse;
import com.fntsoftware.businessgateway.entities.DeleteLogicalGroupRequestData;
import com.fntsoftware.businessgateway.entities.DeleteLogicalGroupResponse;
import com.fntsoftware.businessgateway.entities.LogicalGroupContractsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalGroupContractsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalGroupCustomLocksRequestData;
import com.fntsoftware.businessgateway.entities.LogicalGroupCustomLocksResponseData;
import com.fntsoftware.businessgateway.entities.LogicalGroupDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.LogicalGroupDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.LogicalGroupFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalGroupFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalGroupMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalGroupMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalGroupOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalGroupOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalGroupPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalGroupPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalGroupPersonsRequestData;
import com.fntsoftware.businessgateway.entities.LogicalGroupPersonsResponseData;
import com.fntsoftware.businessgateway.entities.LogicalGroupQueryRequest;
import com.fntsoftware.businessgateway.entities.LogicalGroupQueryResponse;
import com.fntsoftware.businessgateway.entities.LogicalGroupSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.LogicalGroupSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.LogicalGroupZoneRequestData;
import com.fntsoftware.businessgateway.entities.LogicalGroupZoneResponseData;
import com.fntsoftware.businessgateway.entities.UpdateLogicalGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLogicalGroupResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesLogicalGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesLogicalGroupResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface LogicalGroupApi extends ApiClient.Api {


  /**
   * Create
   * Create Logical group
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateLogicalGroupResponse
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateLogicalGroupResponse createLogicalGroup(@Param("sessionId") String sessionId, CreateLogicalGroupRequestData body);

  /**
   * Create
   * Similar to <code>createLogicalGroup</code> but it also returns the http response headers .
   * Create Logical group
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateLogicalGroupResponse> createLogicalGroupWithHttpInfo(@Param("sessionId") String sessionId, CreateLogicalGroupRequestData body);


  /**
   * Create
   * Create Logical group
   * Note, this is equivalent to the other <code>createLogicalGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateLogicalGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateLogicalGroupResponse
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateLogicalGroupResponse createLogicalGroup(CreateLogicalGroupRequestData body, @QueryMap(encoded=true) CreateLogicalGroupQueryParams queryParams);

  /**
  * Create
  * Create Logical group
  * Note, this is equivalent to the other <code>createLogicalGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateLogicalGroupResponse
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateLogicalGroupResponse> createLogicalGroupWithHttpInfo(CreateLogicalGroupRequestData body, @QueryMap(encoded=true) CreateLogicalGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createLogicalGroup</code> method in a fluent style.
   */
  public static class CreateLogicalGroupQueryParams extends HashMap<String, Object> {
    public CreateLogicalGroupQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Logical group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteLogicalGroupResponse
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteLogicalGroupResponse deleteLogicalGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteLogicalGroupRequestData body);

  /**
   * Delete
   * Similar to <code>deleteLogicalGroup</code> but it also returns the http response headers .
   * Delete Logical group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteLogicalGroupResponse> deleteLogicalGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteLogicalGroupRequestData body);


  /**
   * Delete
   * Delete Logical group
   * Note, this is equivalent to the other <code>deleteLogicalGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteLogicalGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteLogicalGroupResponse
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteLogicalGroupResponse deleteLogicalGroup(@Param("elid") String elid, DeleteLogicalGroupRequestData body, @QueryMap(encoded=true) DeleteLogicalGroupQueryParams queryParams);

  /**
  * Delete
  * Delete Logical group
  * Note, this is equivalent to the other <code>deleteLogicalGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteLogicalGroupResponse
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteLogicalGroupResponse> deleteLogicalGroupWithHttpInfo(@Param("elid") String elid, DeleteLogicalGroupRequestData body, @QueryMap(encoded=true) DeleteLogicalGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteLogicalGroup</code> method in a fluent style.
   */
  public static class DeleteLogicalGroupQueryParams extends HashMap<String, Object> {
    public DeleteLogicalGroupQueryParams sessionId(final String value) {
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
   * @return LogicalGroupContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalGroupContractsResponseData logicalGroupContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>logicalGroupContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalGroupContractsResponseData> logicalGroupContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>logicalGroupContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalGroupContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalGroupContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalGroupContractsResponseData logicalGroupContracts(@Param("elid") String elid, LogicalGroupContractsRequestData body, @QueryMap(encoded=true) LogicalGroupContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>logicalGroupContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalGroupContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalGroupContractsResponseData> logicalGroupContractsWithHttpInfo(@Param("elid") String elid, LogicalGroupContractsRequestData body, @QueryMap(encoded=true) LogicalGroupContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalGroupContracts</code> method in a fluent style.
   */
  public static class LogicalGroupContractsQueryParams extends HashMap<String, Object> {
    public LogicalGroupContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Locks entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalGroupCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalGroupCustomLocksResponseData logicalGroupCustomLocks(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupCustomLocksRequestData body);

  /**
   * Get relations to Locks entities
   * Similar to <code>logicalGroupCustomLocks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalGroupCustomLocksResponseData> logicalGroupCustomLocksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupCustomLocksRequestData body);


  /**
   * Get relations to Locks entities
   * 
   * Note, this is equivalent to the other <code>logicalGroupCustomLocks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalGroupCustomLocksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalGroupCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalGroupCustomLocksResponseData logicalGroupCustomLocks(@Param("elid") String elid, LogicalGroupCustomLocksRequestData body, @QueryMap(encoded=true) LogicalGroupCustomLocksQueryParams queryParams);

  /**
  * Get relations to Locks entities
  * 
  * Note, this is equivalent to the other <code>logicalGroupCustomLocks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalGroupCustomLocksResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/CustomLocks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalGroupCustomLocksResponseData> logicalGroupCustomLocksWithHttpInfo(@Param("elid") String elid, LogicalGroupCustomLocksRequestData body, @QueryMap(encoded=true) LogicalGroupCustomLocksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalGroupCustomLocks</code> method in a fluent style.
   */
  public static class LogicalGroupCustomLocksQueryParams extends HashMap<String, Object> {
    public LogicalGroupCustomLocksQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device (all) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalGroupDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalGroupDevicesAllResponseData logicalGroupDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>logicalGroupDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalGroupDevicesAllResponseData> logicalGroupDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>logicalGroupDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalGroupDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalGroupDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalGroupDevicesAllResponseData logicalGroupDevicesAll(@Param("elid") String elid, LogicalGroupDevicesAllRequestData body, @QueryMap(encoded=true) LogicalGroupDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>logicalGroupDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalGroupDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalGroupDevicesAllResponseData> logicalGroupDevicesAllWithHttpInfo(@Param("elid") String elid, LogicalGroupDevicesAllRequestData body, @QueryMap(encoded=true) LogicalGroupDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalGroupDevicesAll</code> method in a fluent style.
   */
  public static class LogicalGroupDevicesAllQueryParams extends HashMap<String, Object> {
    public LogicalGroupDevicesAllQueryParams sessionId(final String value) {
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
   * @return LogicalGroupFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalGroupFrameContractsResponseData logicalGroupFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>logicalGroupFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalGroupFrameContractsResponseData> logicalGroupFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>logicalGroupFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalGroupFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalGroupFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalGroupFrameContractsResponseData logicalGroupFrameContracts(@Param("elid") String elid, LogicalGroupFrameContractsRequestData body, @QueryMap(encoded=true) LogicalGroupFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>logicalGroupFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalGroupFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalGroupFrameContractsResponseData> logicalGroupFrameContractsWithHttpInfo(@Param("elid") String elid, LogicalGroupFrameContractsRequestData body, @QueryMap(encoded=true) LogicalGroupFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalGroupFrameContracts</code> method in a fluent style.
   */
  public static class LogicalGroupFrameContractsQueryParams extends HashMap<String, Object> {
    public LogicalGroupFrameContractsQueryParams sessionId(final String value) {
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
   * @return LogicalGroupMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalGroupMaintenanceContractsResponseData logicalGroupMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>logicalGroupMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalGroupMaintenanceContractsResponseData> logicalGroupMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>logicalGroupMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalGroupMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalGroupMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalGroupMaintenanceContractsResponseData logicalGroupMaintenanceContracts(@Param("elid") String elid, LogicalGroupMaintenanceContractsRequestData body, @QueryMap(encoded=true) LogicalGroupMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>logicalGroupMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalGroupMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalGroupMaintenanceContractsResponseData> logicalGroupMaintenanceContractsWithHttpInfo(@Param("elid") String elid, LogicalGroupMaintenanceContractsRequestData body, @QueryMap(encoded=true) LogicalGroupMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalGroupMaintenanceContracts</code> method in a fluent style.
   */
  public static class LogicalGroupMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public LogicalGroupMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return LogicalGroupOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalGroupOrganizationsResponseData logicalGroupOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>logicalGroupOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalGroupOrganizationsResponseData> logicalGroupOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>logicalGroupOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalGroupOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalGroupOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalGroupOrganizationsResponseData logicalGroupOrganizations(@Param("elid") String elid, LogicalGroupOrganizationsRequestData body, @QueryMap(encoded=true) LogicalGroupOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>logicalGroupOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalGroupOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalGroupOrganizationsResponseData> logicalGroupOrganizationsWithHttpInfo(@Param("elid") String elid, LogicalGroupOrganizationsRequestData body, @QueryMap(encoded=true) LogicalGroupOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalGroupOrganizations</code> method in a fluent style.
   */
  public static class LogicalGroupOrganizationsQueryParams extends HashMap<String, Object> {
    public LogicalGroupOrganizationsQueryParams sessionId(final String value) {
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
   * @return LogicalGroupPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalGroupPersonGroupsResponseData logicalGroupPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>logicalGroupPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalGroupPersonGroupsResponseData> logicalGroupPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>logicalGroupPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalGroupPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalGroupPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalGroupPersonGroupsResponseData logicalGroupPersonGroups(@Param("elid") String elid, LogicalGroupPersonGroupsRequestData body, @QueryMap(encoded=true) LogicalGroupPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>logicalGroupPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalGroupPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalGroupPersonGroupsResponseData> logicalGroupPersonGroupsWithHttpInfo(@Param("elid") String elid, LogicalGroupPersonGroupsRequestData body, @QueryMap(encoded=true) LogicalGroupPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalGroupPersonGroups</code> method in a fluent style.
   */
  public static class LogicalGroupPersonGroupsQueryParams extends HashMap<String, Object> {
    public LogicalGroupPersonGroupsQueryParams sessionId(final String value) {
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
   * @return LogicalGroupPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalGroupPersonsResponseData logicalGroupPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>logicalGroupPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalGroupPersonsResponseData> logicalGroupPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>logicalGroupPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalGroupPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalGroupPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalGroupPersonsResponseData logicalGroupPersons(@Param("elid") String elid, LogicalGroupPersonsRequestData body, @QueryMap(encoded=true) LogicalGroupPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>logicalGroupPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalGroupPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalGroupPersonsResponseData> logicalGroupPersonsWithHttpInfo(@Param("elid") String elid, LogicalGroupPersonsRequestData body, @QueryMap(encoded=true) LogicalGroupPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalGroupPersons</code> method in a fluent style.
   */
  public static class LogicalGroupPersonsQueryParams extends HashMap<String, Object> {
    public LogicalGroupPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return LogicalGroupQueryResponse
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalGroupQueryResponse logicalGroupQuery(@Param("sessionId") String sessionId, LogicalGroupQueryRequest body);

  /**
   * Basic query
   * Similar to <code>logicalGroupQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalGroupQueryResponse> logicalGroupQueryWithHttpInfo(@Param("sessionId") String sessionId, LogicalGroupQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>logicalGroupQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalGroupQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalGroupQueryResponse
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalGroupQueryResponse logicalGroupQuery(LogicalGroupQueryRequest body, @QueryMap(encoded=true) LogicalGroupQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>logicalGroupQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalGroupQueryResponse
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalGroupQueryResponse> logicalGroupQueryWithHttpInfo(LogicalGroupQueryRequest body, @QueryMap(encoded=true) LogicalGroupQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalGroupQuery</code> method in a fluent style.
   */
  public static class LogicalGroupQueryQueryParams extends HashMap<String, Object> {
    public LogicalGroupQueryQueryParams sessionId(final String value) {
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
   * @return LogicalGroupSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalGroupSystemAttributesResponse logicalGroupSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>logicalGroupSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalGroupSystemAttributesResponse> logicalGroupSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>logicalGroupSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalGroupSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalGroupSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalGroupSystemAttributesResponse logicalGroupSystemAttributes(@Param("elid") String elid, LogicalGroupSystemAttributesRequest body, @QueryMap(encoded=true) LogicalGroupSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>logicalGroupSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalGroupSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalGroupSystemAttributesResponse> logicalGroupSystemAttributesWithHttpInfo(@Param("elid") String elid, LogicalGroupSystemAttributesRequest body, @QueryMap(encoded=true) LogicalGroupSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalGroupSystemAttributes</code> method in a fluent style.
   */
  public static class LogicalGroupSystemAttributesQueryParams extends HashMap<String, Object> {
    public LogicalGroupSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Zone entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LogicalGroupZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LogicalGroupZoneResponseData logicalGroupZone(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>logicalGroupZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LogicalGroupZoneResponseData> logicalGroupZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LogicalGroupZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>logicalGroupZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LogicalGroupZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LogicalGroupZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LogicalGroupZoneResponseData logicalGroupZone(@Param("elid") String elid, LogicalGroupZoneRequestData body, @QueryMap(encoded=true) LogicalGroupZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>logicalGroupZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LogicalGroupZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LogicalGroupZoneResponseData> logicalGroupZoneWithHttpInfo(@Param("elid") String elid, LogicalGroupZoneRequestData body, @QueryMap(encoded=true) LogicalGroupZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>logicalGroupZone</code> method in a fluent style.
   */
  public static class LogicalGroupZoneQueryParams extends HashMap<String, Object> {
    public LogicalGroupZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Logical group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateLogicalGroupResponse
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateLogicalGroupResponse updateLogicalGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLogicalGroupRequestData body);

  /**
   * Modify
   * Similar to <code>updateLogicalGroup</code> but it also returns the http response headers .
   * Modify Logical group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateLogicalGroupResponse> updateLogicalGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLogicalGroupRequestData body);


  /**
   * Modify
   * Modify Logical group
   * Note, this is equivalent to the other <code>updateLogicalGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateLogicalGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateLogicalGroupResponse
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateLogicalGroupResponse updateLogicalGroup(@Param("elid") String elid, UpdateLogicalGroupRequestData body, @QueryMap(encoded=true) UpdateLogicalGroupQueryParams queryParams);

  /**
  * Modify
  * Modify Logical group
  * Note, this is equivalent to the other <code>updateLogicalGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateLogicalGroupResponse
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateLogicalGroupResponse> updateLogicalGroupWithHttpInfo(@Param("elid") String elid, UpdateLogicalGroupRequestData body, @QueryMap(encoded=true) UpdateLogicalGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateLogicalGroup</code> method in a fluent style.
   */
  public static class UpdateLogicalGroupQueryParams extends HashMap<String, Object> {
    public UpdateLogicalGroupQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesLogicalGroupResponse
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesLogicalGroupResponse updateSystemAttributesLogicalGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesLogicalGroupRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesLogicalGroup</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesLogicalGroupResponse> updateSystemAttributesLogicalGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesLogicalGroupRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesLogicalGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesLogicalGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesLogicalGroupResponse
   */
  @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesLogicalGroupResponse updateSystemAttributesLogicalGroup(@Param("elid") String elid, UpdateSystemAttributesLogicalGroupRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesLogicalGroupQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesLogicalGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesLogicalGroupResponse
      */
      @RequestLine("POST /api/rest/entity/logicalGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesLogicalGroupResponse> updateSystemAttributesLogicalGroupWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesLogicalGroupRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesLogicalGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesLogicalGroup</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesLogicalGroupQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesLogicalGroupQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
