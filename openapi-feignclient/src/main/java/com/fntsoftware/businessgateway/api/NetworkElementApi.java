package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateNetworkElementRequestData;
import com.fntsoftware.businessgateway.entities.CreateNetworkElementResponse;
import com.fntsoftware.businessgateway.entities.DeleteNetworkElementRequestData;
import com.fntsoftware.businessgateway.entities.DeleteNetworkElementResponse;
import com.fntsoftware.businessgateway.entities.NetworkElementContractsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkElementContractsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkElementDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.NetworkElementDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.NetworkElementFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkElementFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkElementLogicalPortsRequest;
import com.fntsoftware.businessgateway.entities.NetworkElementLogicalPortsResponse;
import com.fntsoftware.businessgateway.entities.NetworkElementMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkElementMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkElementMasterDeviceRequestData;
import com.fntsoftware.businessgateway.entities.NetworkElementMasterDeviceResponseData;
import com.fntsoftware.businessgateway.entities.NetworkElementMasterZoneRequestData;
import com.fntsoftware.businessgateway.entities.NetworkElementMasterZoneResponseData;
import com.fntsoftware.businessgateway.entities.NetworkElementNetworkFunctionsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkElementNetworkFunctionsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkElementOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkElementOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkElementPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkElementPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkElementPersonsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkElementPersonsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkElementQueryRequest;
import com.fntsoftware.businessgateway.entities.NetworkElementQueryResponse;
import com.fntsoftware.businessgateway.entities.NetworkElementSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.NetworkElementSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.NetworkElementZonesRequestData;
import com.fntsoftware.businessgateway.entities.NetworkElementZonesResponseData;
import com.fntsoftware.businessgateway.entities.UpdateNetworkElementRequestData;
import com.fntsoftware.businessgateway.entities.UpdateNetworkElementResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNetworkElementRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNetworkElementResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface NetworkElementApi extends ApiClient.Api {


  /**
   * Create
   * Create network element
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateNetworkElementResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateNetworkElementResponse createNetworkElement(@Param("sessionId") String sessionId, CreateNetworkElementRequestData body);

  /**
   * Create
   * Similar to <code>createNetworkElement</code> but it also returns the http response headers .
   * Create network element
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateNetworkElementResponse> createNetworkElementWithHttpInfo(@Param("sessionId") String sessionId, CreateNetworkElementRequestData body);


  /**
   * Create
   * Create network element
   * Note, this is equivalent to the other <code>createNetworkElement</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateNetworkElementQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateNetworkElementResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateNetworkElementResponse createNetworkElement(CreateNetworkElementRequestData body, @QueryMap(encoded=true) CreateNetworkElementQueryParams queryParams);

  /**
  * Create
  * Create network element
  * Note, this is equivalent to the other <code>createNetworkElement</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateNetworkElementResponse
      */
      @RequestLine("POST /api/rest/entity/networkElement/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateNetworkElementResponse> createNetworkElementWithHttpInfo(CreateNetworkElementRequestData body, @QueryMap(encoded=true) CreateNetworkElementQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createNetworkElement</code> method in a fluent style.
   */
  public static class CreateNetworkElementQueryParams extends HashMap<String, Object> {
    public CreateNetworkElementQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete network element
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteNetworkElementResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteNetworkElementResponse deleteNetworkElement(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNetworkElementRequestData body);

  /**
   * Delete
   * Similar to <code>deleteNetworkElement</code> but it also returns the http response headers .
   * Delete network element
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteNetworkElementResponse> deleteNetworkElementWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNetworkElementRequestData body);


  /**
   * Delete
   * Delete network element
   * Note, this is equivalent to the other <code>deleteNetworkElement</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteNetworkElementQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteNetworkElementResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteNetworkElementResponse deleteNetworkElement(@Param("elid") String elid, DeleteNetworkElementRequestData body, @QueryMap(encoded=true) DeleteNetworkElementQueryParams queryParams);

  /**
  * Delete
  * Delete network element
  * Note, this is equivalent to the other <code>deleteNetworkElement</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteNetworkElementResponse
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteNetworkElementResponse> deleteNetworkElementWithHttpInfo(@Param("elid") String elid, DeleteNetworkElementRequestData body, @QueryMap(encoded=true) DeleteNetworkElementQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteNetworkElement</code> method in a fluent style.
   */
  public static class DeleteNetworkElementQueryParams extends HashMap<String, Object> {
    public DeleteNetworkElementQueryParams sessionId(final String value) {
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
   * @return NetworkElementContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementContractsResponseData networkElementContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>networkElementContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementContractsResponseData> networkElementContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>networkElementContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementContractsResponseData networkElementContracts(@Param("elid") String elid, NetworkElementContractsRequestData body, @QueryMap(encoded=true) NetworkElementContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>networkElementContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementContractsResponseData> networkElementContractsWithHttpInfo(@Param("elid") String elid, NetworkElementContractsRequestData body, @QueryMap(encoded=true) NetworkElementContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementContracts</code> method in a fluent style.
   */
  public static class NetworkElementContractsQueryParams extends HashMap<String, Object> {
    public NetworkElementContractsQueryParams sessionId(final String value) {
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
   * @return NetworkElementDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementDevicesAllResponseData networkElementDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>networkElementDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementDevicesAllResponseData> networkElementDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>networkElementDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementDevicesAllResponseData networkElementDevicesAll(@Param("elid") String elid, NetworkElementDevicesAllRequestData body, @QueryMap(encoded=true) NetworkElementDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>networkElementDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementDevicesAllResponseData> networkElementDevicesAllWithHttpInfo(@Param("elid") String elid, NetworkElementDevicesAllRequestData body, @QueryMap(encoded=true) NetworkElementDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementDevicesAll</code> method in a fluent style.
   */
  public static class NetworkElementDevicesAllQueryParams extends HashMap<String, Object> {
    public NetworkElementDevicesAllQueryParams sessionId(final String value) {
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
   * @return NetworkElementFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementFrameContractsResponseData networkElementFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>networkElementFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementFrameContractsResponseData> networkElementFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>networkElementFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementFrameContractsResponseData networkElementFrameContracts(@Param("elid") String elid, NetworkElementFrameContractsRequestData body, @QueryMap(encoded=true) NetworkElementFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>networkElementFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementFrameContractsResponseData> networkElementFrameContractsWithHttpInfo(@Param("elid") String elid, NetworkElementFrameContractsRequestData body, @QueryMap(encoded=true) NetworkElementFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementFrameContracts</code> method in a fluent style.
   */
  public static class NetworkElementFrameContractsQueryParams extends HashMap<String, Object> {
    public NetworkElementFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query logical ports
   * Queries the logical ports, their properties, associated devices and the linked services of a network element
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NetworkElementLogicalPortsResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementLogicalPortsResponse networkElementLogicalPorts(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementLogicalPortsRequest body);

  /**
   * Query logical ports
   * Similar to <code>networkElementLogicalPorts</code> but it also returns the http response headers .
   * Queries the logical ports, their properties, associated devices and the linked services of a network element
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementLogicalPortsResponse> networkElementLogicalPortsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementLogicalPortsRequest body);


  /**
   * Query logical ports
   * Queries the logical ports, their properties, associated devices and the linked services of a network element
   * Note, this is equivalent to the other <code>networkElementLogicalPorts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementLogicalPortsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementLogicalPortsResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/LogicalPorts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementLogicalPortsResponse networkElementLogicalPorts(@Param("elid") String elid, NetworkElementLogicalPortsRequest body, @QueryMap(encoded=true) NetworkElementLogicalPortsQueryParams queryParams);

  /**
  * Query logical ports
  * Queries the logical ports, their properties, associated devices and the linked services of a network element
  * Note, this is equivalent to the other <code>networkElementLogicalPorts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementLogicalPortsResponse
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/LogicalPorts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementLogicalPortsResponse> networkElementLogicalPortsWithHttpInfo(@Param("elid") String elid, NetworkElementLogicalPortsRequest body, @QueryMap(encoded=true) NetworkElementLogicalPortsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementLogicalPorts</code> method in a fluent style.
   */
  public static class NetworkElementLogicalPortsQueryParams extends HashMap<String, Object> {
    public NetworkElementLogicalPortsQueryParams sessionId(final String value) {
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
   * @return NetworkElementMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementMaintenanceContractsResponseData networkElementMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>networkElementMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementMaintenanceContractsResponseData> networkElementMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>networkElementMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementMaintenanceContractsResponseData networkElementMaintenanceContracts(@Param("elid") String elid, NetworkElementMaintenanceContractsRequestData body, @QueryMap(encoded=true) NetworkElementMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>networkElementMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementMaintenanceContractsResponseData> networkElementMaintenanceContractsWithHttpInfo(@Param("elid") String elid, NetworkElementMaintenanceContractsRequestData body, @QueryMap(encoded=true) NetworkElementMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementMaintenanceContracts</code> method in a fluent style.
   */
  public static class NetworkElementMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public NetworkElementMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Master device (super) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NetworkElementMasterDeviceResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/MasterDevice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementMasterDeviceResponseData networkElementMasterDevice(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementMasterDeviceRequestData body);

  /**
   * Get relations to Master device (super) entities
   * Similar to <code>networkElementMasterDevice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/MasterDevice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementMasterDeviceResponseData> networkElementMasterDeviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementMasterDeviceRequestData body);


  /**
   * Get relations to Master device (super) entities
   * 
   * Note, this is equivalent to the other <code>networkElementMasterDevice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementMasterDeviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementMasterDeviceResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/MasterDevice?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementMasterDeviceResponseData networkElementMasterDevice(@Param("elid") String elid, NetworkElementMasterDeviceRequestData body, @QueryMap(encoded=true) NetworkElementMasterDeviceQueryParams queryParams);

  /**
  * Get relations to Master device (super) entities
  * 
  * Note, this is equivalent to the other <code>networkElementMasterDevice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementMasterDeviceResponseData
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/MasterDevice?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementMasterDeviceResponseData> networkElementMasterDeviceWithHttpInfo(@Param("elid") String elid, NetworkElementMasterDeviceRequestData body, @QueryMap(encoded=true) NetworkElementMasterDeviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementMasterDevice</code> method in a fluent style.
   */
  public static class NetworkElementMasterDeviceQueryParams extends HashMap<String, Object> {
    public NetworkElementMasterDeviceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Master zone entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NetworkElementMasterZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/MasterZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementMasterZoneResponseData networkElementMasterZone(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementMasterZoneRequestData body);

  /**
   * Get relations to Master zone entities
   * Similar to <code>networkElementMasterZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/MasterZone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementMasterZoneResponseData> networkElementMasterZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementMasterZoneRequestData body);


  /**
   * Get relations to Master zone entities
   * 
   * Note, this is equivalent to the other <code>networkElementMasterZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementMasterZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementMasterZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/MasterZone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementMasterZoneResponseData networkElementMasterZone(@Param("elid") String elid, NetworkElementMasterZoneRequestData body, @QueryMap(encoded=true) NetworkElementMasterZoneQueryParams queryParams);

  /**
  * Get relations to Master zone entities
  * 
  * Note, this is equivalent to the other <code>networkElementMasterZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementMasterZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/MasterZone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementMasterZoneResponseData> networkElementMasterZoneWithHttpInfo(@Param("elid") String elid, NetworkElementMasterZoneRequestData body, @QueryMap(encoded=true) NetworkElementMasterZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementMasterZone</code> method in a fluent style.
   */
  public static class NetworkElementMasterZoneQueryParams extends HashMap<String, Object> {
    public NetworkElementMasterZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Network function entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NetworkElementNetworkFunctionsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/NetworkFunctions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementNetworkFunctionsResponseData networkElementNetworkFunctions(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementNetworkFunctionsRequestData body);

  /**
   * Get relations to Network function entities
   * Similar to <code>networkElementNetworkFunctions</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/NetworkFunctions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementNetworkFunctionsResponseData> networkElementNetworkFunctionsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementNetworkFunctionsRequestData body);


  /**
   * Get relations to Network function entities
   * 
   * Note, this is equivalent to the other <code>networkElementNetworkFunctions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementNetworkFunctionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementNetworkFunctionsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/NetworkFunctions?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementNetworkFunctionsResponseData networkElementNetworkFunctions(@Param("elid") String elid, NetworkElementNetworkFunctionsRequestData body, @QueryMap(encoded=true) NetworkElementNetworkFunctionsQueryParams queryParams);

  /**
  * Get relations to Network function entities
  * 
  * Note, this is equivalent to the other <code>networkElementNetworkFunctions</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementNetworkFunctionsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/NetworkFunctions?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementNetworkFunctionsResponseData> networkElementNetworkFunctionsWithHttpInfo(@Param("elid") String elid, NetworkElementNetworkFunctionsRequestData body, @QueryMap(encoded=true) NetworkElementNetworkFunctionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementNetworkFunctions</code> method in a fluent style.
   */
  public static class NetworkElementNetworkFunctionsQueryParams extends HashMap<String, Object> {
    public NetworkElementNetworkFunctionsQueryParams sessionId(final String value) {
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
   * @return NetworkElementOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementOrganizationsResponseData networkElementOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>networkElementOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementOrganizationsResponseData> networkElementOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>networkElementOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementOrganizationsResponseData networkElementOrganizations(@Param("elid") String elid, NetworkElementOrganizationsRequestData body, @QueryMap(encoded=true) NetworkElementOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>networkElementOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementOrganizationsResponseData> networkElementOrganizationsWithHttpInfo(@Param("elid") String elid, NetworkElementOrganizationsRequestData body, @QueryMap(encoded=true) NetworkElementOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementOrganizations</code> method in a fluent style.
   */
  public static class NetworkElementOrganizationsQueryParams extends HashMap<String, Object> {
    public NetworkElementOrganizationsQueryParams sessionId(final String value) {
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
   * @return NetworkElementPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementPersonGroupsResponseData networkElementPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>networkElementPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementPersonGroupsResponseData> networkElementPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>networkElementPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementPersonGroupsResponseData networkElementPersonGroups(@Param("elid") String elid, NetworkElementPersonGroupsRequestData body, @QueryMap(encoded=true) NetworkElementPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>networkElementPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementPersonGroupsResponseData> networkElementPersonGroupsWithHttpInfo(@Param("elid") String elid, NetworkElementPersonGroupsRequestData body, @QueryMap(encoded=true) NetworkElementPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementPersonGroups</code> method in a fluent style.
   */
  public static class NetworkElementPersonGroupsQueryParams extends HashMap<String, Object> {
    public NetworkElementPersonGroupsQueryParams sessionId(final String value) {
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
   * @return NetworkElementPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementPersonsResponseData networkElementPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>networkElementPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementPersonsResponseData> networkElementPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>networkElementPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementPersonsResponseData networkElementPersons(@Param("elid") String elid, NetworkElementPersonsRequestData body, @QueryMap(encoded=true) NetworkElementPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>networkElementPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementPersonsResponseData> networkElementPersonsWithHttpInfo(@Param("elid") String elid, NetworkElementPersonsRequestData body, @QueryMap(encoded=true) NetworkElementPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementPersons</code> method in a fluent style.
   */
  public static class NetworkElementPersonsQueryParams extends HashMap<String, Object> {
    public NetworkElementPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NetworkElementQueryResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementQueryResponse networkElementQuery(@Param("sessionId") String sessionId, NetworkElementQueryRequest body);

  /**
   * Basic query
   * Similar to <code>networkElementQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementQueryResponse> networkElementQueryWithHttpInfo(@Param("sessionId") String sessionId, NetworkElementQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>networkElementQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementQueryResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementQueryResponse networkElementQuery(NetworkElementQueryRequest body, @QueryMap(encoded=true) NetworkElementQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>networkElementQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementQueryResponse
      */
      @RequestLine("POST /api/rest/entity/networkElement/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementQueryResponse> networkElementQueryWithHttpInfo(NetworkElementQueryRequest body, @QueryMap(encoded=true) NetworkElementQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementQuery</code> method in a fluent style.
   */
  public static class NetworkElementQueryQueryParams extends HashMap<String, Object> {
    public NetworkElementQueryQueryParams sessionId(final String value) {
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
   * @return NetworkElementSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementSystemAttributesResponse networkElementSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>networkElementSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementSystemAttributesResponse> networkElementSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>networkElementSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementSystemAttributesResponse networkElementSystemAttributes(@Param("elid") String elid, NetworkElementSystemAttributesRequest body, @QueryMap(encoded=true) NetworkElementSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>networkElementSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementSystemAttributesResponse> networkElementSystemAttributesWithHttpInfo(@Param("elid") String elid, NetworkElementSystemAttributesRequest body, @QueryMap(encoded=true) NetworkElementSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementSystemAttributes</code> method in a fluent style.
   */
  public static class NetworkElementSystemAttributesQueryParams extends HashMap<String, Object> {
    public NetworkElementSystemAttributesQueryParams sessionId(final String value) {
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
   * @return NetworkElementZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkElementZonesResponseData networkElementZones(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementZonesRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>networkElementZones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkElementZonesResponseData> networkElementZonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkElementZonesRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>networkElementZones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkElementZonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkElementZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/Zones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkElementZonesResponseData networkElementZones(@Param("elid") String elid, NetworkElementZonesRequestData body, @QueryMap(encoded=true) NetworkElementZonesQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>networkElementZones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkElementZonesResponseData
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/Zones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkElementZonesResponseData> networkElementZonesWithHttpInfo(@Param("elid") String elid, NetworkElementZonesRequestData body, @QueryMap(encoded=true) NetworkElementZonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkElementZones</code> method in a fluent style.
   */
  public static class NetworkElementZonesQueryParams extends HashMap<String, Object> {
    public NetworkElementZonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify network element
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateNetworkElementResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateNetworkElementResponse updateNetworkElement(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNetworkElementRequestData body);

  /**
   * Modify
   * Similar to <code>updateNetworkElement</code> but it also returns the http response headers .
   * Modify network element
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateNetworkElementResponse> updateNetworkElementWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNetworkElementRequestData body);


  /**
   * Modify
   * Modify network element
   * Note, this is equivalent to the other <code>updateNetworkElement</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateNetworkElementQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateNetworkElementResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateNetworkElementResponse updateNetworkElement(@Param("elid") String elid, UpdateNetworkElementRequestData body, @QueryMap(encoded=true) UpdateNetworkElementQueryParams queryParams);

  /**
  * Modify
  * Modify network element
  * Note, this is equivalent to the other <code>updateNetworkElement</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateNetworkElementResponse
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateNetworkElementResponse> updateNetworkElementWithHttpInfo(@Param("elid") String elid, UpdateNetworkElementRequestData body, @QueryMap(encoded=true) UpdateNetworkElementQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateNetworkElement</code> method in a fluent style.
   */
  public static class UpdateNetworkElementQueryParams extends HashMap<String, Object> {
    public UpdateNetworkElementQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesNetworkElementResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesNetworkElementResponse updateSystemAttributesNetworkElement(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNetworkElementRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesNetworkElement</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesNetworkElementResponse> updateSystemAttributesNetworkElementWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNetworkElementRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesNetworkElement</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesNetworkElementQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesNetworkElementResponse
   */
  @RequestLine("POST /api/rest/entity/networkElement/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesNetworkElementResponse updateSystemAttributesNetworkElement(@Param("elid") String elid, UpdateSystemAttributesNetworkElementRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNetworkElementQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesNetworkElement</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesNetworkElementResponse
      */
      @RequestLine("POST /api/rest/entity/networkElement/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesNetworkElementResponse> updateSystemAttributesNetworkElementWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesNetworkElementRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNetworkElementQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesNetworkElement</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesNetworkElementQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesNetworkElementQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
