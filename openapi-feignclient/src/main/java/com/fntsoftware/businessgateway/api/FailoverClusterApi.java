package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateFailoverClusterRequestData;
import com.fntsoftware.businessgateway.entities.CreateFailoverClusterResponse;
import com.fntsoftware.businessgateway.entities.DeleteFailoverClusterRequestData;
import com.fntsoftware.businessgateway.entities.DeleteFailoverClusterResponse;
import com.fntsoftware.businessgateway.entities.FailoverClusterContractsRequestData;
import com.fntsoftware.businessgateway.entities.FailoverClusterContractsResponseData;
import com.fntsoftware.businessgateway.entities.FailoverClusterFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.FailoverClusterFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.FailoverClusterMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.FailoverClusterMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.FailoverClusterMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.FailoverClusterMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.FailoverClusterOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.FailoverClusterOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.FailoverClusterPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.FailoverClusterPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.FailoverClusterPersonsRequestData;
import com.fntsoftware.businessgateway.entities.FailoverClusterPersonsResponseData;
import com.fntsoftware.businessgateway.entities.FailoverClusterQueryRequest;
import com.fntsoftware.businessgateway.entities.FailoverClusterQueryResponse;
import com.fntsoftware.businessgateway.entities.FailoverClusterResourceGroupsRequestData;
import com.fntsoftware.businessgateway.entities.FailoverClusterResourceGroupsResponseData;
import com.fntsoftware.businessgateway.entities.FailoverClusterServersRequestData;
import com.fntsoftware.businessgateway.entities.FailoverClusterServersResponseData;
import com.fntsoftware.businessgateway.entities.FailoverClusterSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.FailoverClusterSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.FailoverClusterVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.FailoverClusterVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.UpdateFailoverClusterRequestData;
import com.fntsoftware.businessgateway.entities.UpdateFailoverClusterResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFailoverClusterRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFailoverClusterResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface FailoverClusterApi extends ApiClient.Api {


  /**
   * Create
   * Create failover cluster
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateFailoverClusterResponse
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateFailoverClusterResponse createFailoverCluster(@Param("sessionId") String sessionId, CreateFailoverClusterRequestData body);

  /**
   * Create
   * Similar to <code>createFailoverCluster</code> but it also returns the http response headers .
   * Create failover cluster
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateFailoverClusterResponse> createFailoverClusterWithHttpInfo(@Param("sessionId") String sessionId, CreateFailoverClusterRequestData body);


  /**
   * Create
   * Create failover cluster
   * Note, this is equivalent to the other <code>createFailoverCluster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateFailoverClusterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateFailoverClusterResponse
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateFailoverClusterResponse createFailoverCluster(CreateFailoverClusterRequestData body, @QueryMap(encoded=true) CreateFailoverClusterQueryParams queryParams);

  /**
  * Create
  * Create failover cluster
  * Note, this is equivalent to the other <code>createFailoverCluster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateFailoverClusterResponse
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateFailoverClusterResponse> createFailoverClusterWithHttpInfo(CreateFailoverClusterRequestData body, @QueryMap(encoded=true) CreateFailoverClusterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createFailoverCluster</code> method in a fluent style.
   */
  public static class CreateFailoverClusterQueryParams extends HashMap<String, Object> {
    public CreateFailoverClusterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete failover cluster
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteFailoverClusterResponse
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteFailoverClusterResponse deleteFailoverCluster(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteFailoverClusterRequestData body);

  /**
   * Delete
   * Similar to <code>deleteFailoverCluster</code> but it also returns the http response headers .
   * Delete failover cluster
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteFailoverClusterResponse> deleteFailoverClusterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteFailoverClusterRequestData body);


  /**
   * Delete
   * Delete failover cluster
   * Note, this is equivalent to the other <code>deleteFailoverCluster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteFailoverClusterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteFailoverClusterResponse
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteFailoverClusterResponse deleteFailoverCluster(@Param("elid") String elid, DeleteFailoverClusterRequestData body, @QueryMap(encoded=true) DeleteFailoverClusterQueryParams queryParams);

  /**
  * Delete
  * Delete failover cluster
  * Note, this is equivalent to the other <code>deleteFailoverCluster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteFailoverClusterResponse
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteFailoverClusterResponse> deleteFailoverClusterWithHttpInfo(@Param("elid") String elid, DeleteFailoverClusterRequestData body, @QueryMap(encoded=true) DeleteFailoverClusterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteFailoverCluster</code> method in a fluent style.
   */
  public static class DeleteFailoverClusterQueryParams extends HashMap<String, Object> {
    public DeleteFailoverClusterQueryParams sessionId(final String value) {
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
   * @return FailoverClusterContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FailoverClusterContractsResponseData failoverClusterContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>failoverClusterContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FailoverClusterContractsResponseData> failoverClusterContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>failoverClusterContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FailoverClusterContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FailoverClusterContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FailoverClusterContractsResponseData failoverClusterContracts(@Param("elid") String elid, FailoverClusterContractsRequestData body, @QueryMap(encoded=true) FailoverClusterContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>failoverClusterContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FailoverClusterContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FailoverClusterContractsResponseData> failoverClusterContractsWithHttpInfo(@Param("elid") String elid, FailoverClusterContractsRequestData body, @QueryMap(encoded=true) FailoverClusterContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>failoverClusterContracts</code> method in a fluent style.
   */
  public static class FailoverClusterContractsQueryParams extends HashMap<String, Object> {
    public FailoverClusterContractsQueryParams sessionId(final String value) {
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
   * @return FailoverClusterFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FailoverClusterFrameContractsResponseData failoverClusterFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>failoverClusterFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FailoverClusterFrameContractsResponseData> failoverClusterFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>failoverClusterFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FailoverClusterFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FailoverClusterFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FailoverClusterFrameContractsResponseData failoverClusterFrameContracts(@Param("elid") String elid, FailoverClusterFrameContractsRequestData body, @QueryMap(encoded=true) FailoverClusterFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>failoverClusterFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FailoverClusterFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FailoverClusterFrameContractsResponseData> failoverClusterFrameContractsWithHttpInfo(@Param("elid") String elid, FailoverClusterFrameContractsRequestData body, @QueryMap(encoded=true) FailoverClusterFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>failoverClusterFrameContracts</code> method in a fluent style.
   */
  public static class FailoverClusterFrameContractsQueryParams extends HashMap<String, Object> {
    public FailoverClusterFrameContractsQueryParams sessionId(final String value) {
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
   * @return FailoverClusterMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FailoverClusterMaintenanceContractsResponseData failoverClusterMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>failoverClusterMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FailoverClusterMaintenanceContractsResponseData> failoverClusterMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>failoverClusterMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FailoverClusterMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FailoverClusterMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FailoverClusterMaintenanceContractsResponseData failoverClusterMaintenanceContracts(@Param("elid") String elid, FailoverClusterMaintenanceContractsRequestData body, @QueryMap(encoded=true) FailoverClusterMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>failoverClusterMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FailoverClusterMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FailoverClusterMaintenanceContractsResponseData> failoverClusterMaintenanceContractsWithHttpInfo(@Param("elid") String elid, FailoverClusterMaintenanceContractsRequestData body, @QueryMap(encoded=true) FailoverClusterMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>failoverClusterMaintenanceContracts</code> method in a fluent style.
   */
  public static class FailoverClusterMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public FailoverClusterMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Maintenance window entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return FailoverClusterMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FailoverClusterMaintenanceWindowsResponseData failoverClusterMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>failoverClusterMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FailoverClusterMaintenanceWindowsResponseData> failoverClusterMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>failoverClusterMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FailoverClusterMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FailoverClusterMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FailoverClusterMaintenanceWindowsResponseData failoverClusterMaintenanceWindows(@Param("elid") String elid, FailoverClusterMaintenanceWindowsRequestData body, @QueryMap(encoded=true) FailoverClusterMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>failoverClusterMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FailoverClusterMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FailoverClusterMaintenanceWindowsResponseData> failoverClusterMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, FailoverClusterMaintenanceWindowsRequestData body, @QueryMap(encoded=true) FailoverClusterMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>failoverClusterMaintenanceWindows</code> method in a fluent style.
   */
  public static class FailoverClusterMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public FailoverClusterMaintenanceWindowsQueryParams sessionId(final String value) {
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
   * @return FailoverClusterOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FailoverClusterOrganizationsResponseData failoverClusterOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>failoverClusterOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FailoverClusterOrganizationsResponseData> failoverClusterOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>failoverClusterOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FailoverClusterOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FailoverClusterOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FailoverClusterOrganizationsResponseData failoverClusterOrganizations(@Param("elid") String elid, FailoverClusterOrganizationsRequestData body, @QueryMap(encoded=true) FailoverClusterOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>failoverClusterOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FailoverClusterOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FailoverClusterOrganizationsResponseData> failoverClusterOrganizationsWithHttpInfo(@Param("elid") String elid, FailoverClusterOrganizationsRequestData body, @QueryMap(encoded=true) FailoverClusterOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>failoverClusterOrganizations</code> method in a fluent style.
   */
  public static class FailoverClusterOrganizationsQueryParams extends HashMap<String, Object> {
    public FailoverClusterOrganizationsQueryParams sessionId(final String value) {
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
   * @return FailoverClusterPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FailoverClusterPersonGroupsResponseData failoverClusterPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>failoverClusterPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FailoverClusterPersonGroupsResponseData> failoverClusterPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>failoverClusterPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FailoverClusterPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FailoverClusterPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FailoverClusterPersonGroupsResponseData failoverClusterPersonGroups(@Param("elid") String elid, FailoverClusterPersonGroupsRequestData body, @QueryMap(encoded=true) FailoverClusterPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>failoverClusterPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FailoverClusterPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FailoverClusterPersonGroupsResponseData> failoverClusterPersonGroupsWithHttpInfo(@Param("elid") String elid, FailoverClusterPersonGroupsRequestData body, @QueryMap(encoded=true) FailoverClusterPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>failoverClusterPersonGroups</code> method in a fluent style.
   */
  public static class FailoverClusterPersonGroupsQueryParams extends HashMap<String, Object> {
    public FailoverClusterPersonGroupsQueryParams sessionId(final String value) {
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
   * @return FailoverClusterPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FailoverClusterPersonsResponseData failoverClusterPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>failoverClusterPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FailoverClusterPersonsResponseData> failoverClusterPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>failoverClusterPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FailoverClusterPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FailoverClusterPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FailoverClusterPersonsResponseData failoverClusterPersons(@Param("elid") String elid, FailoverClusterPersonsRequestData body, @QueryMap(encoded=true) FailoverClusterPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>failoverClusterPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FailoverClusterPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FailoverClusterPersonsResponseData> failoverClusterPersonsWithHttpInfo(@Param("elid") String elid, FailoverClusterPersonsRequestData body, @QueryMap(encoded=true) FailoverClusterPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>failoverClusterPersons</code> method in a fluent style.
   */
  public static class FailoverClusterPersonsQueryParams extends HashMap<String, Object> {
    public FailoverClusterPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return FailoverClusterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FailoverClusterQueryResponse failoverClusterQuery(@Param("sessionId") String sessionId, FailoverClusterQueryRequest body);

  /**
   * Basic query
   * Similar to <code>failoverClusterQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FailoverClusterQueryResponse> failoverClusterQueryWithHttpInfo(@Param("sessionId") String sessionId, FailoverClusterQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>failoverClusterQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FailoverClusterQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FailoverClusterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FailoverClusterQueryResponse failoverClusterQuery(FailoverClusterQueryRequest body, @QueryMap(encoded=true) FailoverClusterQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>failoverClusterQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FailoverClusterQueryResponse
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FailoverClusterQueryResponse> failoverClusterQueryWithHttpInfo(FailoverClusterQueryRequest body, @QueryMap(encoded=true) FailoverClusterQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>failoverClusterQuery</code> method in a fluent style.
   */
  public static class FailoverClusterQueryQueryParams extends HashMap<String, Object> {
    public FailoverClusterQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Resource group entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return FailoverClusterResourceGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/ResourceGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FailoverClusterResourceGroupsResponseData failoverClusterResourceGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterResourceGroupsRequestData body);

  /**
   * Get relations to Resource group entities
   * Similar to <code>failoverClusterResourceGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/ResourceGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FailoverClusterResourceGroupsResponseData> failoverClusterResourceGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterResourceGroupsRequestData body);


  /**
   * Get relations to Resource group entities
   * 
   * Note, this is equivalent to the other <code>failoverClusterResourceGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FailoverClusterResourceGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FailoverClusterResourceGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/ResourceGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FailoverClusterResourceGroupsResponseData failoverClusterResourceGroups(@Param("elid") String elid, FailoverClusterResourceGroupsRequestData body, @QueryMap(encoded=true) FailoverClusterResourceGroupsQueryParams queryParams);

  /**
  * Get relations to Resource group entities
  * 
  * Note, this is equivalent to the other <code>failoverClusterResourceGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FailoverClusterResourceGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/ResourceGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FailoverClusterResourceGroupsResponseData> failoverClusterResourceGroupsWithHttpInfo(@Param("elid") String elid, FailoverClusterResourceGroupsRequestData body, @QueryMap(encoded=true) FailoverClusterResourceGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>failoverClusterResourceGroups</code> method in a fluent style.
   */
  public static class FailoverClusterResourceGroupsQueryParams extends HashMap<String, Object> {
    public FailoverClusterResourceGroupsQueryParams sessionId(final String value) {
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
   * @return FailoverClusterServersResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FailoverClusterServersResponseData failoverClusterServers(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterServersRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>failoverClusterServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FailoverClusterServersResponseData> failoverClusterServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterServersRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>failoverClusterServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FailoverClusterServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FailoverClusterServersResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Servers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FailoverClusterServersResponseData failoverClusterServers(@Param("elid") String elid, FailoverClusterServersRequestData body, @QueryMap(encoded=true) FailoverClusterServersQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>failoverClusterServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FailoverClusterServersResponseData
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/Servers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FailoverClusterServersResponseData> failoverClusterServersWithHttpInfo(@Param("elid") String elid, FailoverClusterServersRequestData body, @QueryMap(encoded=true) FailoverClusterServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>failoverClusterServers</code> method in a fluent style.
   */
  public static class FailoverClusterServersQueryParams extends HashMap<String, Object> {
    public FailoverClusterServersQueryParams sessionId(final String value) {
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
   * @return FailoverClusterSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FailoverClusterSystemAttributesResponse failoverClusterSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>failoverClusterSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FailoverClusterSystemAttributesResponse> failoverClusterSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>failoverClusterSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FailoverClusterSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FailoverClusterSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FailoverClusterSystemAttributesResponse failoverClusterSystemAttributes(@Param("elid") String elid, FailoverClusterSystemAttributesRequest body, @QueryMap(encoded=true) FailoverClusterSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>failoverClusterSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FailoverClusterSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FailoverClusterSystemAttributesResponse> failoverClusterSystemAttributesWithHttpInfo(@Param("elid") String elid, FailoverClusterSystemAttributesRequest body, @QueryMap(encoded=true) FailoverClusterSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>failoverClusterSystemAttributes</code> method in a fluent style.
   */
  public static class FailoverClusterSystemAttributesQueryParams extends HashMap<String, Object> {
    public FailoverClusterSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return FailoverClusterVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FailoverClusterVirtualServersResponseData failoverClusterVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>failoverClusterVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FailoverClusterVirtualServersResponseData> failoverClusterVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FailoverClusterVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>failoverClusterVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FailoverClusterVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FailoverClusterVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FailoverClusterVirtualServersResponseData failoverClusterVirtualServers(@Param("elid") String elid, FailoverClusterVirtualServersRequestData body, @QueryMap(encoded=true) FailoverClusterVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>failoverClusterVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FailoverClusterVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FailoverClusterVirtualServersResponseData> failoverClusterVirtualServersWithHttpInfo(@Param("elid") String elid, FailoverClusterVirtualServersRequestData body, @QueryMap(encoded=true) FailoverClusterVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>failoverClusterVirtualServers</code> method in a fluent style.
   */
  public static class FailoverClusterVirtualServersQueryParams extends HashMap<String, Object> {
    public FailoverClusterVirtualServersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify failover cluster
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateFailoverClusterResponse
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateFailoverClusterResponse updateFailoverCluster(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateFailoverClusterRequestData body);

  /**
   * Modify
   * Similar to <code>updateFailoverCluster</code> but it also returns the http response headers .
   * Modify failover cluster
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateFailoverClusterResponse> updateFailoverClusterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateFailoverClusterRequestData body);


  /**
   * Modify
   * Modify failover cluster
   * Note, this is equivalent to the other <code>updateFailoverCluster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateFailoverClusterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateFailoverClusterResponse
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateFailoverClusterResponse updateFailoverCluster(@Param("elid") String elid, UpdateFailoverClusterRequestData body, @QueryMap(encoded=true) UpdateFailoverClusterQueryParams queryParams);

  /**
  * Modify
  * Modify failover cluster
  * Note, this is equivalent to the other <code>updateFailoverCluster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateFailoverClusterResponse
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateFailoverClusterResponse> updateFailoverClusterWithHttpInfo(@Param("elid") String elid, UpdateFailoverClusterRequestData body, @QueryMap(encoded=true) UpdateFailoverClusterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateFailoverCluster</code> method in a fluent style.
   */
  public static class UpdateFailoverClusterQueryParams extends HashMap<String, Object> {
    public UpdateFailoverClusterQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesFailoverClusterResponse
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesFailoverClusterResponse updateSystemAttributesFailoverCluster(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesFailoverClusterRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesFailoverCluster</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesFailoverClusterResponse> updateSystemAttributesFailoverClusterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesFailoverClusterRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesFailoverCluster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesFailoverClusterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesFailoverClusterResponse
   */
  @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesFailoverClusterResponse updateSystemAttributesFailoverCluster(@Param("elid") String elid, UpdateSystemAttributesFailoverClusterRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesFailoverClusterQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesFailoverCluster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesFailoverClusterResponse
      */
      @RequestLine("POST /api/rest/entity/failoverCluster/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesFailoverClusterResponse> updateSystemAttributesFailoverClusterWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesFailoverClusterRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesFailoverClusterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesFailoverCluster</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesFailoverClusterQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesFailoverClusterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
