package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateNetworkFunctionRequestData;
import com.fntsoftware.businessgateway.entities.CreateNetworkFunctionResponse;
import com.fntsoftware.businessgateway.entities.DeleteNetworkFunctionRequestData;
import com.fntsoftware.businessgateway.entities.DeleteNetworkFunctionResponse;
import com.fntsoftware.businessgateway.entities.NetworkFunctionCellsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionCellsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionContractsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionContractsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionNetworkElementRequestData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionNetworkElementResponseData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionNetworkFunctionsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionNetworkFunctionsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionPersonsRequestData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionPersonsResponseData;
import com.fntsoftware.businessgateway.entities.NetworkFunctionQueryRequest;
import com.fntsoftware.businessgateway.entities.NetworkFunctionQueryResponse;
import com.fntsoftware.businessgateway.entities.NetworkFunctionSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.NetworkFunctionSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateNetworkFunctionRequestData;
import com.fntsoftware.businessgateway.entities.UpdateNetworkFunctionResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNetworkFunctionRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNetworkFunctionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface NetworkFunctionApi extends ApiClient.Api {


  /**
   * Create
   * Create Network function
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateNetworkFunctionResponse
   */
  @RequestLine("POST /api/rest/entity/networkFunction/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateNetworkFunctionResponse createNetworkFunction(@Param("sessionId") String sessionId, CreateNetworkFunctionRequestData body);

  /**
   * Create
   * Similar to <code>createNetworkFunction</code> but it also returns the http response headers .
   * Create Network function
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateNetworkFunctionResponse> createNetworkFunctionWithHttpInfo(@Param("sessionId") String sessionId, CreateNetworkFunctionRequestData body);


  /**
   * Create
   * Create Network function
   * Note, this is equivalent to the other <code>createNetworkFunction</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateNetworkFunctionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateNetworkFunctionResponse
   */
  @RequestLine("POST /api/rest/entity/networkFunction/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateNetworkFunctionResponse createNetworkFunction(CreateNetworkFunctionRequestData body, @QueryMap(encoded=true) CreateNetworkFunctionQueryParams queryParams);

  /**
  * Create
  * Create Network function
  * Note, this is equivalent to the other <code>createNetworkFunction</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateNetworkFunctionResponse
      */
      @RequestLine("POST /api/rest/entity/networkFunction/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateNetworkFunctionResponse> createNetworkFunctionWithHttpInfo(CreateNetworkFunctionRequestData body, @QueryMap(encoded=true) CreateNetworkFunctionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createNetworkFunction</code> method in a fluent style.
   */
  public static class CreateNetworkFunctionQueryParams extends HashMap<String, Object> {
    public CreateNetworkFunctionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Network function
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteNetworkFunctionResponse
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteNetworkFunctionResponse deleteNetworkFunction(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNetworkFunctionRequestData body);

  /**
   * Delete
   * Similar to <code>deleteNetworkFunction</code> but it also returns the http response headers .
   * Delete Network function
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteNetworkFunctionResponse> deleteNetworkFunctionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNetworkFunctionRequestData body);


  /**
   * Delete
   * Delete Network function
   * Note, this is equivalent to the other <code>deleteNetworkFunction</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteNetworkFunctionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteNetworkFunctionResponse
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteNetworkFunctionResponse deleteNetworkFunction(@Param("elid") String elid, DeleteNetworkFunctionRequestData body, @QueryMap(encoded=true) DeleteNetworkFunctionQueryParams queryParams);

  /**
  * Delete
  * Delete Network function
  * Note, this is equivalent to the other <code>deleteNetworkFunction</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteNetworkFunctionResponse
      */
      @RequestLine("POST /api/rest/entity/networkFunction/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteNetworkFunctionResponse> deleteNetworkFunctionWithHttpInfo(@Param("elid") String elid, DeleteNetworkFunctionRequestData body, @QueryMap(encoded=true) DeleteNetworkFunctionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteNetworkFunction</code> method in a fluent style.
   */
  public static class DeleteNetworkFunctionQueryParams extends HashMap<String, Object> {
    public DeleteNetworkFunctionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Cell entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NetworkFunctionCellsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Cells?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkFunctionCellsResponseData networkFunctionCells(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionCellsRequestData body);

  /**
   * Get relations to Cell entities
   * Similar to <code>networkFunctionCells</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Cells?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkFunctionCellsResponseData> networkFunctionCellsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionCellsRequestData body);


  /**
   * Get relations to Cell entities
   * 
   * Note, this is equivalent to the other <code>networkFunctionCells</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkFunctionCellsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkFunctionCellsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Cells?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkFunctionCellsResponseData networkFunctionCells(@Param("elid") String elid, NetworkFunctionCellsRequestData body, @QueryMap(encoded=true) NetworkFunctionCellsQueryParams queryParams);

  /**
  * Get relations to Cell entities
  * 
  * Note, this is equivalent to the other <code>networkFunctionCells</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkFunctionCellsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Cells?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkFunctionCellsResponseData> networkFunctionCellsWithHttpInfo(@Param("elid") String elid, NetworkFunctionCellsRequestData body, @QueryMap(encoded=true) NetworkFunctionCellsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkFunctionCells</code> method in a fluent style.
   */
  public static class NetworkFunctionCellsQueryParams extends HashMap<String, Object> {
    public NetworkFunctionCellsQueryParams sessionId(final String value) {
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
   * @return NetworkFunctionContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkFunctionContractsResponseData networkFunctionContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>networkFunctionContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkFunctionContractsResponseData> networkFunctionContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>networkFunctionContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkFunctionContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkFunctionContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkFunctionContractsResponseData networkFunctionContracts(@Param("elid") String elid, NetworkFunctionContractsRequestData body, @QueryMap(encoded=true) NetworkFunctionContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>networkFunctionContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkFunctionContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkFunctionContractsResponseData> networkFunctionContractsWithHttpInfo(@Param("elid") String elid, NetworkFunctionContractsRequestData body, @QueryMap(encoded=true) NetworkFunctionContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkFunctionContracts</code> method in a fluent style.
   */
  public static class NetworkFunctionContractsQueryParams extends HashMap<String, Object> {
    public NetworkFunctionContractsQueryParams sessionId(final String value) {
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
   * @return NetworkFunctionFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkFunctionFrameContractsResponseData networkFunctionFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>networkFunctionFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkFunctionFrameContractsResponseData> networkFunctionFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>networkFunctionFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkFunctionFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkFunctionFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkFunctionFrameContractsResponseData networkFunctionFrameContracts(@Param("elid") String elid, NetworkFunctionFrameContractsRequestData body, @QueryMap(encoded=true) NetworkFunctionFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>networkFunctionFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkFunctionFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkFunction/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkFunctionFrameContractsResponseData> networkFunctionFrameContractsWithHttpInfo(@Param("elid") String elid, NetworkFunctionFrameContractsRequestData body, @QueryMap(encoded=true) NetworkFunctionFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkFunctionFrameContracts</code> method in a fluent style.
   */
  public static class NetworkFunctionFrameContractsQueryParams extends HashMap<String, Object> {
    public NetworkFunctionFrameContractsQueryParams sessionId(final String value) {
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
   * @return NetworkFunctionMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkFunctionMaintenanceContractsResponseData networkFunctionMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>networkFunctionMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkFunctionMaintenanceContractsResponseData> networkFunctionMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>networkFunctionMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkFunctionMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkFunctionMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkFunctionMaintenanceContractsResponseData networkFunctionMaintenanceContracts(@Param("elid") String elid, NetworkFunctionMaintenanceContractsRequestData body, @QueryMap(encoded=true) NetworkFunctionMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>networkFunctionMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkFunctionMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkFunction/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkFunctionMaintenanceContractsResponseData> networkFunctionMaintenanceContractsWithHttpInfo(@Param("elid") String elid, NetworkFunctionMaintenanceContractsRequestData body, @QueryMap(encoded=true) NetworkFunctionMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkFunctionMaintenanceContracts</code> method in a fluent style.
   */
  public static class NetworkFunctionMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public NetworkFunctionMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return NetworkFunctionNetworkElementResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/NetworkElement?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkFunctionNetworkElementResponseData networkFunctionNetworkElement(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionNetworkElementRequestData body);

  /**
   * Get relations to Network element entities
   * Similar to <code>networkFunctionNetworkElement</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/NetworkElement?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkFunctionNetworkElementResponseData> networkFunctionNetworkElementWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionNetworkElementRequestData body);


  /**
   * Get relations to Network element entities
   * 
   * Note, this is equivalent to the other <code>networkFunctionNetworkElement</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkFunctionNetworkElementQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkFunctionNetworkElementResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/NetworkElement?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkFunctionNetworkElementResponseData networkFunctionNetworkElement(@Param("elid") String elid, NetworkFunctionNetworkElementRequestData body, @QueryMap(encoded=true) NetworkFunctionNetworkElementQueryParams queryParams);

  /**
  * Get relations to Network element entities
  * 
  * Note, this is equivalent to the other <code>networkFunctionNetworkElement</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkFunctionNetworkElementResponseData
      */
      @RequestLine("POST /api/rest/entity/networkFunction/{elid}/NetworkElement?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkFunctionNetworkElementResponseData> networkFunctionNetworkElementWithHttpInfo(@Param("elid") String elid, NetworkFunctionNetworkElementRequestData body, @QueryMap(encoded=true) NetworkFunctionNetworkElementQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkFunctionNetworkElement</code> method in a fluent style.
   */
  public static class NetworkFunctionNetworkElementQueryParams extends HashMap<String, Object> {
    public NetworkFunctionNetworkElementQueryParams sessionId(final String value) {
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
   * @return NetworkFunctionNetworkFunctionsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/NetworkFunctions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkFunctionNetworkFunctionsResponseData networkFunctionNetworkFunctions(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionNetworkFunctionsRequestData body);

  /**
   * Get relations to Network function entities
   * Similar to <code>networkFunctionNetworkFunctions</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/NetworkFunctions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkFunctionNetworkFunctionsResponseData> networkFunctionNetworkFunctionsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionNetworkFunctionsRequestData body);


  /**
   * Get relations to Network function entities
   * 
   * Note, this is equivalent to the other <code>networkFunctionNetworkFunctions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkFunctionNetworkFunctionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkFunctionNetworkFunctionsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/NetworkFunctions?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkFunctionNetworkFunctionsResponseData networkFunctionNetworkFunctions(@Param("elid") String elid, NetworkFunctionNetworkFunctionsRequestData body, @QueryMap(encoded=true) NetworkFunctionNetworkFunctionsQueryParams queryParams);

  /**
  * Get relations to Network function entities
  * 
  * Note, this is equivalent to the other <code>networkFunctionNetworkFunctions</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkFunctionNetworkFunctionsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkFunction/{elid}/NetworkFunctions?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkFunctionNetworkFunctionsResponseData> networkFunctionNetworkFunctionsWithHttpInfo(@Param("elid") String elid, NetworkFunctionNetworkFunctionsRequestData body, @QueryMap(encoded=true) NetworkFunctionNetworkFunctionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkFunctionNetworkFunctions</code> method in a fluent style.
   */
  public static class NetworkFunctionNetworkFunctionsQueryParams extends HashMap<String, Object> {
    public NetworkFunctionNetworkFunctionsQueryParams sessionId(final String value) {
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
   * @return NetworkFunctionOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkFunctionOrganizationsResponseData networkFunctionOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>networkFunctionOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkFunctionOrganizationsResponseData> networkFunctionOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>networkFunctionOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkFunctionOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkFunctionOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkFunctionOrganizationsResponseData networkFunctionOrganizations(@Param("elid") String elid, NetworkFunctionOrganizationsRequestData body, @QueryMap(encoded=true) NetworkFunctionOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>networkFunctionOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkFunctionOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkFunctionOrganizationsResponseData> networkFunctionOrganizationsWithHttpInfo(@Param("elid") String elid, NetworkFunctionOrganizationsRequestData body, @QueryMap(encoded=true) NetworkFunctionOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkFunctionOrganizations</code> method in a fluent style.
   */
  public static class NetworkFunctionOrganizationsQueryParams extends HashMap<String, Object> {
    public NetworkFunctionOrganizationsQueryParams sessionId(final String value) {
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
   * @return NetworkFunctionPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkFunctionPersonGroupsResponseData networkFunctionPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>networkFunctionPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkFunctionPersonGroupsResponseData> networkFunctionPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>networkFunctionPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkFunctionPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkFunctionPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkFunctionPersonGroupsResponseData networkFunctionPersonGroups(@Param("elid") String elid, NetworkFunctionPersonGroupsRequestData body, @QueryMap(encoded=true) NetworkFunctionPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>networkFunctionPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkFunctionPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkFunction/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkFunctionPersonGroupsResponseData> networkFunctionPersonGroupsWithHttpInfo(@Param("elid") String elid, NetworkFunctionPersonGroupsRequestData body, @QueryMap(encoded=true) NetworkFunctionPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkFunctionPersonGroups</code> method in a fluent style.
   */
  public static class NetworkFunctionPersonGroupsQueryParams extends HashMap<String, Object> {
    public NetworkFunctionPersonGroupsQueryParams sessionId(final String value) {
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
   * @return NetworkFunctionPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkFunctionPersonsResponseData networkFunctionPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>networkFunctionPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkFunctionPersonsResponseData> networkFunctionPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>networkFunctionPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkFunctionPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkFunctionPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkFunctionPersonsResponseData networkFunctionPersons(@Param("elid") String elid, NetworkFunctionPersonsRequestData body, @QueryMap(encoded=true) NetworkFunctionPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>networkFunctionPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkFunctionPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/networkFunction/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkFunctionPersonsResponseData> networkFunctionPersonsWithHttpInfo(@Param("elid") String elid, NetworkFunctionPersonsRequestData body, @QueryMap(encoded=true) NetworkFunctionPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkFunctionPersons</code> method in a fluent style.
   */
  public static class NetworkFunctionPersonsQueryParams extends HashMap<String, Object> {
    public NetworkFunctionPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NetworkFunctionQueryResponse
   */
  @RequestLine("POST /api/rest/entity/networkFunction/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkFunctionQueryResponse networkFunctionQuery(@Param("sessionId") String sessionId, NetworkFunctionQueryRequest body);

  /**
   * Basic query
   * Similar to <code>networkFunctionQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkFunctionQueryResponse> networkFunctionQueryWithHttpInfo(@Param("sessionId") String sessionId, NetworkFunctionQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>networkFunctionQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkFunctionQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkFunctionQueryResponse
   */
  @RequestLine("POST /api/rest/entity/networkFunction/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkFunctionQueryResponse networkFunctionQuery(NetworkFunctionQueryRequest body, @QueryMap(encoded=true) NetworkFunctionQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>networkFunctionQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkFunctionQueryResponse
      */
      @RequestLine("POST /api/rest/entity/networkFunction/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkFunctionQueryResponse> networkFunctionQueryWithHttpInfo(NetworkFunctionQueryRequest body, @QueryMap(encoded=true) NetworkFunctionQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkFunctionQuery</code> method in a fluent style.
   */
  public static class NetworkFunctionQueryQueryParams extends HashMap<String, Object> {
    public NetworkFunctionQueryQueryParams sessionId(final String value) {
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
   * @return NetworkFunctionSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetworkFunctionSystemAttributesResponse networkFunctionSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>networkFunctionSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetworkFunctionSystemAttributesResponse> networkFunctionSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetworkFunctionSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>networkFunctionSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetworkFunctionSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetworkFunctionSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetworkFunctionSystemAttributesResponse networkFunctionSystemAttributes(@Param("elid") String elid, NetworkFunctionSystemAttributesRequest body, @QueryMap(encoded=true) NetworkFunctionSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>networkFunctionSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetworkFunctionSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/networkFunction/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetworkFunctionSystemAttributesResponse> networkFunctionSystemAttributesWithHttpInfo(@Param("elid") String elid, NetworkFunctionSystemAttributesRequest body, @QueryMap(encoded=true) NetworkFunctionSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>networkFunctionSystemAttributes</code> method in a fluent style.
   */
  public static class NetworkFunctionSystemAttributesQueryParams extends HashMap<String, Object> {
    public NetworkFunctionSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Network function
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateNetworkFunctionResponse
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateNetworkFunctionResponse updateNetworkFunction(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNetworkFunctionRequestData body);

  /**
   * Modify
   * Similar to <code>updateNetworkFunction</code> but it also returns the http response headers .
   * Modify Network function
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateNetworkFunctionResponse> updateNetworkFunctionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNetworkFunctionRequestData body);


  /**
   * Modify
   * Modify Network function
   * Note, this is equivalent to the other <code>updateNetworkFunction</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateNetworkFunctionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateNetworkFunctionResponse
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateNetworkFunctionResponse updateNetworkFunction(@Param("elid") String elid, UpdateNetworkFunctionRequestData body, @QueryMap(encoded=true) UpdateNetworkFunctionQueryParams queryParams);

  /**
  * Modify
  * Modify Network function
  * Note, this is equivalent to the other <code>updateNetworkFunction</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateNetworkFunctionResponse
      */
      @RequestLine("POST /api/rest/entity/networkFunction/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateNetworkFunctionResponse> updateNetworkFunctionWithHttpInfo(@Param("elid") String elid, UpdateNetworkFunctionRequestData body, @QueryMap(encoded=true) UpdateNetworkFunctionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateNetworkFunction</code> method in a fluent style.
   */
  public static class UpdateNetworkFunctionQueryParams extends HashMap<String, Object> {
    public UpdateNetworkFunctionQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesNetworkFunctionResponse
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesNetworkFunctionResponse updateSystemAttributesNetworkFunction(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNetworkFunctionRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesNetworkFunction</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesNetworkFunctionResponse> updateSystemAttributesNetworkFunctionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNetworkFunctionRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesNetworkFunction</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesNetworkFunctionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesNetworkFunctionResponse
   */
  @RequestLine("POST /api/rest/entity/networkFunction/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesNetworkFunctionResponse updateSystemAttributesNetworkFunction(@Param("elid") String elid, UpdateSystemAttributesNetworkFunctionRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNetworkFunctionQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesNetworkFunction</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesNetworkFunctionResponse
      */
      @RequestLine("POST /api/rest/entity/networkFunction/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesNetworkFunctionResponse> updateSystemAttributesNetworkFunctionWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesNetworkFunctionRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNetworkFunctionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesNetworkFunction</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesNetworkFunctionQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesNetworkFunctionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
