package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceAssetRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceAssetResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceAssetRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceAssetResponse;
import com.fntsoftware.businessgateway.entities.ReassignAllCiServiceAssetResponse;
import com.fntsoftware.businessgateway.entities.ReassignCiPartiallyServiceAssetRequestData;
import com.fntsoftware.businessgateway.entities.ReassignCiPartiallyServiceAssetResponse;
import com.fntsoftware.businessgateway.entities.ServiceAssetContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAssetContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAssetFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAssetFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAssetMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAssetMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAssetOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAssetOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAssetPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAssetPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAssetPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAssetPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAssetQueryCiRequest;
import com.fntsoftware.businessgateway.entities.ServiceAssetQueryCiResponse;
import com.fntsoftware.businessgateway.entities.ServiceAssetQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceAssetQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceAssetServiceSamRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAssetServiceSamResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAssetSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceAssetSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceAssetRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceAssetResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceAssetRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceAssetResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ServiceAssetApi extends ApiClient.Api {


  /**
   * Create
   * Create Service Asset
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceAssetResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceAssetResponse createServiceAsset(@Param("sessionId") String sessionId, CreateServiceAssetRequestData body);

  /**
   * Create
   * Similar to <code>createServiceAsset</code> but it also returns the http response headers .
   * Create Service Asset
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceAssetResponse> createServiceAssetWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceAssetRequestData body);


  /**
   * Create
   * Create Service Asset
   * Note, this is equivalent to the other <code>createServiceAsset</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceAssetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceAssetResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceAssetResponse createServiceAsset(CreateServiceAssetRequestData body, @QueryMap(encoded=true) CreateServiceAssetQueryParams queryParams);

  /**
  * Create
  * Create Service Asset
  * Note, this is equivalent to the other <code>createServiceAsset</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceAssetResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceAssetResponse> createServiceAssetWithHttpInfo(CreateServiceAssetRequestData body, @QueryMap(encoded=true) CreateServiceAssetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceAsset</code> method in a fluent style.
   */
  public static class CreateServiceAssetQueryParams extends HashMap<String, Object> {
    public CreateServiceAssetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Service Asset
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServiceAssetResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceAssetResponse deleteServiceAsset(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceAssetRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceAsset</code> but it also returns the http response headers .
   * Delete Service Asset
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceAssetResponse> deleteServiceAssetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceAssetRequestData body);


  /**
   * Delete
   * Delete Service Asset
   * Note, this is equivalent to the other <code>deleteServiceAsset</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceAssetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceAssetResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceAssetResponse deleteServiceAsset(@Param("elid") String elid, DeleteServiceAssetRequestData body, @QueryMap(encoded=true) DeleteServiceAssetQueryParams queryParams);

  /**
  * Delete
  * Delete Service Asset
  * Note, this is equivalent to the other <code>deleteServiceAsset</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceAssetResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceAssetResponse> deleteServiceAssetWithHttpInfo(@Param("elid") String elid, DeleteServiceAssetRequestData body, @QueryMap(encoded=true) DeleteServiceAssetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceAsset</code> method in a fluent style.
   */
  public static class DeleteServiceAssetQueryParams extends HashMap<String, Object> {
    public DeleteServiceAssetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reassign all CIs
   * Reassign all CIs
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return ReassignAllCiServiceAssetResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/reassignAllCi?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignAllCiServiceAssetResponse reassignAllCiServiceAsset(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);

  /**
   * Reassign all CIs
   * Similar to <code>reassignAllCiServiceAsset</code> but it also returns the http response headers .
   * Reassign all CIs
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/reassignAllCi?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignAllCiServiceAssetResponse> reassignAllCiServiceAssetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);


  /**
   * Reassign all CIs
   * Reassign all CIs
   * Note, this is equivalent to the other <code>reassignAllCiServiceAsset</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignAllCiServiceAssetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignAllCiServiceAssetResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/reassignAllCi?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignAllCiServiceAssetResponse reassignAllCiServiceAsset(@Param("elid") String elid, Object body, @QueryMap(encoded=true) ReassignAllCiServiceAssetQueryParams queryParams);

  /**
  * Reassign all CIs
  * Reassign all CIs
  * Note, this is equivalent to the other <code>reassignAllCiServiceAsset</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignAllCiServiceAssetResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/reassignAllCi?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignAllCiServiceAssetResponse> reassignAllCiServiceAssetWithHttpInfo(@Param("elid") String elid, Object body, @QueryMap(encoded=true) ReassignAllCiServiceAssetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignAllCiServiceAsset</code> method in a fluent style.
   */
  public static class ReassignAllCiServiceAssetQueryParams extends HashMap<String, Object> {
    public ReassignAllCiServiceAssetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reassign CIs
   * Reassign CIs
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ReassignCiPartiallyServiceAssetResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/reassignCiPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReassignCiPartiallyServiceAssetResponse reassignCiPartiallyServiceAsset(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignCiPartiallyServiceAssetRequestData body);

  /**
   * Reassign CIs
   * Similar to <code>reassignCiPartiallyServiceAsset</code> but it also returns the http response headers .
   * Reassign CIs
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/reassignCiPartially?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReassignCiPartiallyServiceAssetResponse> reassignCiPartiallyServiceAssetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ReassignCiPartiallyServiceAssetRequestData body);


  /**
   * Reassign CIs
   * Reassign CIs
   * Note, this is equivalent to the other <code>reassignCiPartiallyServiceAsset</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReassignCiPartiallyServiceAssetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReassignCiPartiallyServiceAssetResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/reassignCiPartially?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReassignCiPartiallyServiceAssetResponse reassignCiPartiallyServiceAsset(@Param("elid") String elid, ReassignCiPartiallyServiceAssetRequestData body, @QueryMap(encoded=true) ReassignCiPartiallyServiceAssetQueryParams queryParams);

  /**
  * Reassign CIs
  * Reassign CIs
  * Note, this is equivalent to the other <code>reassignCiPartiallyServiceAsset</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReassignCiPartiallyServiceAssetResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/reassignCiPartially?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReassignCiPartiallyServiceAssetResponse> reassignCiPartiallyServiceAssetWithHttpInfo(@Param("elid") String elid, ReassignCiPartiallyServiceAssetRequestData body, @QueryMap(encoded=true) ReassignCiPartiallyServiceAssetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reassignCiPartiallyServiceAsset</code> method in a fluent style.
   */
  public static class ReassignCiPartiallyServiceAssetQueryParams extends HashMap<String, Object> {
    public ReassignCiPartiallyServiceAssetQueryParams sessionId(final String value) {
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
   * @return ServiceAssetContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAssetContractsResponseData serviceAssetContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceAssetContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAssetContractsResponseData> serviceAssetContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceAssetContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAssetContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAssetContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAssetContractsResponseData serviceAssetContracts(@Param("elid") String elid, ServiceAssetContractsRequestData body, @QueryMap(encoded=true) ServiceAssetContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceAssetContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAssetContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAssetContractsResponseData> serviceAssetContractsWithHttpInfo(@Param("elid") String elid, ServiceAssetContractsRequestData body, @QueryMap(encoded=true) ServiceAssetContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAssetContracts</code> method in a fluent style.
   */
  public static class ServiceAssetContractsQueryParams extends HashMap<String, Object> {
    public ServiceAssetContractsQueryParams sessionId(final String value) {
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
   * @return ServiceAssetFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAssetFrameContractsResponseData serviceAssetFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceAssetFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAssetFrameContractsResponseData> serviceAssetFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceAssetFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAssetFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAssetFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAssetFrameContractsResponseData serviceAssetFrameContracts(@Param("elid") String elid, ServiceAssetFrameContractsRequestData body, @QueryMap(encoded=true) ServiceAssetFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceAssetFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAssetFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAssetFrameContractsResponseData> serviceAssetFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceAssetFrameContractsRequestData body, @QueryMap(encoded=true) ServiceAssetFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAssetFrameContracts</code> method in a fluent style.
   */
  public static class ServiceAssetFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceAssetFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceAssetMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAssetMaintenanceContractsResponseData serviceAssetMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serviceAssetMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAssetMaintenanceContractsResponseData> serviceAssetMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serviceAssetMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAssetMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAssetMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAssetMaintenanceContractsResponseData serviceAssetMaintenanceContracts(@Param("elid") String elid, ServiceAssetMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceAssetMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serviceAssetMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAssetMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAssetMaintenanceContractsResponseData> serviceAssetMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServiceAssetMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceAssetMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAssetMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServiceAssetMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServiceAssetMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServiceAssetOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAssetOrganizationsResponseData serviceAssetOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceAssetOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAssetOrganizationsResponseData> serviceAssetOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceAssetOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAssetOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAssetOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAssetOrganizationsResponseData serviceAssetOrganizations(@Param("elid") String elid, ServiceAssetOrganizationsRequestData body, @QueryMap(encoded=true) ServiceAssetOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceAssetOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAssetOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAssetOrganizationsResponseData> serviceAssetOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceAssetOrganizationsRequestData body, @QueryMap(encoded=true) ServiceAssetOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAssetOrganizations</code> method in a fluent style.
   */
  public static class ServiceAssetOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceAssetOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceAssetPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAssetPersonGroupsResponseData serviceAssetPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceAssetPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAssetPersonGroupsResponseData> serviceAssetPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceAssetPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAssetPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAssetPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAssetPersonGroupsResponseData serviceAssetPersonGroups(@Param("elid") String elid, ServiceAssetPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceAssetPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceAssetPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAssetPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAssetPersonGroupsResponseData> serviceAssetPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceAssetPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceAssetPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAssetPersonGroups</code> method in a fluent style.
   */
  public static class ServiceAssetPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceAssetPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceAssetPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAssetPersonsResponseData serviceAssetPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceAssetPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAssetPersonsResponseData> serviceAssetPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceAssetPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAssetPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAssetPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAssetPersonsResponseData serviceAssetPersons(@Param("elid") String elid, ServiceAssetPersonsRequestData body, @QueryMap(encoded=true) ServiceAssetPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceAssetPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAssetPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAssetPersonsResponseData> serviceAssetPersonsWithHttpInfo(@Param("elid") String elid, ServiceAssetPersonsRequestData body, @QueryMap(encoded=true) ServiceAssetPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAssetPersons</code> method in a fluent style.
   */
  public static class ServiceAssetPersonsQueryParams extends HashMap<String, Object> {
    public ServiceAssetPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceAssetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAssetQueryResponse serviceAssetQuery(@Param("sessionId") String sessionId, ServiceAssetQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceAssetQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAssetQueryResponse> serviceAssetQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceAssetQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>serviceAssetQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAssetQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAssetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAssetQueryResponse serviceAssetQuery(ServiceAssetQueryRequest body, @QueryMap(encoded=true) ServiceAssetQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>serviceAssetQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAssetQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAssetQueryResponse> serviceAssetQueryWithHttpInfo(ServiceAssetQueryRequest body, @QueryMap(encoded=true) ServiceAssetQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAssetQuery</code> method in a fluent style.
   */
  public static class ServiceAssetQueryQueryParams extends HashMap<String, Object> {
    public ServiceAssetQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CIs
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceAssetQueryCiResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/QueryCi?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAssetQueryCiResponse serviceAssetQueryCi(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetQueryCiRequest body);

  /**
   * CIs
   * Similar to <code>serviceAssetQueryCi</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/QueryCi?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAssetQueryCiResponse> serviceAssetQueryCiWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetQueryCiRequest body);


  /**
   * CIs
   * 
   * Note, this is equivalent to the other <code>serviceAssetQueryCi</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAssetQueryCiQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAssetQueryCiResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/QueryCi?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAssetQueryCiResponse serviceAssetQueryCi(@Param("elid") String elid, ServiceAssetQueryCiRequest body, @QueryMap(encoded=true) ServiceAssetQueryCiQueryParams queryParams);

  /**
  * CIs
  * 
  * Note, this is equivalent to the other <code>serviceAssetQueryCi</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAssetQueryCiResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/QueryCi?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAssetQueryCiResponse> serviceAssetQueryCiWithHttpInfo(@Param("elid") String elid, ServiceAssetQueryCiRequest body, @QueryMap(encoded=true) ServiceAssetQueryCiQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAssetQueryCi</code> method in a fluent style.
   */
  public static class ServiceAssetQueryCiQueryParams extends HashMap<String, Object> {
    public ServiceAssetQueryCiQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service (SAM) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceAssetServiceSamResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/ServiceSam?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAssetServiceSamResponseData serviceAssetServiceSam(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetServiceSamRequestData body);

  /**
   * Get relations to Service (SAM) entities
   * Similar to <code>serviceAssetServiceSam</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/ServiceSam?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAssetServiceSamResponseData> serviceAssetServiceSamWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetServiceSamRequestData body);


  /**
   * Get relations to Service (SAM) entities
   * 
   * Note, this is equivalent to the other <code>serviceAssetServiceSam</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAssetServiceSamQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAssetServiceSamResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/ServiceSam?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAssetServiceSamResponseData serviceAssetServiceSam(@Param("elid") String elid, ServiceAssetServiceSamRequestData body, @QueryMap(encoded=true) ServiceAssetServiceSamQueryParams queryParams);

  /**
  * Get relations to Service (SAM) entities
  * 
  * Note, this is equivalent to the other <code>serviceAssetServiceSam</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAssetServiceSamResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/ServiceSam?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAssetServiceSamResponseData> serviceAssetServiceSamWithHttpInfo(@Param("elid") String elid, ServiceAssetServiceSamRequestData body, @QueryMap(encoded=true) ServiceAssetServiceSamQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAssetServiceSam</code> method in a fluent style.
   */
  public static class ServiceAssetServiceSamQueryParams extends HashMap<String, Object> {
    public ServiceAssetServiceSamQueryParams sessionId(final String value) {
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
   * @return ServiceAssetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAssetSystemAttributesResponse serviceAssetSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceAssetSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAssetSystemAttributesResponse> serviceAssetSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAssetSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serviceAssetSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAssetSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAssetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAssetSystemAttributesResponse serviceAssetSystemAttributes(@Param("elid") String elid, ServiceAssetSystemAttributesRequest body, @QueryMap(encoded=true) ServiceAssetSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serviceAssetSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAssetSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAssetSystemAttributesResponse> serviceAssetSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceAssetSystemAttributesRequest body, @QueryMap(encoded=true) ServiceAssetSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAssetSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceAssetSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceAssetSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Service Asset
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateServiceAssetResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceAssetResponse updateServiceAsset(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceAssetRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceAsset</code> but it also returns the http response headers .
   * Modify Service Asset
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceAssetResponse> updateServiceAssetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceAssetRequestData body);


  /**
   * Modify
   * Modify Service Asset
   * Note, this is equivalent to the other <code>updateServiceAsset</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceAssetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceAssetResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceAssetResponse updateServiceAsset(@Param("elid") String elid, UpdateServiceAssetRequestData body, @QueryMap(encoded=true) UpdateServiceAssetQueryParams queryParams);

  /**
  * Modify
  * Modify Service Asset
  * Note, this is equivalent to the other <code>updateServiceAsset</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceAssetResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceAssetResponse> updateServiceAssetWithHttpInfo(@Param("elid") String elid, UpdateServiceAssetRequestData body, @QueryMap(encoded=true) UpdateServiceAssetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceAsset</code> method in a fluent style.
   */
  public static class UpdateServiceAssetQueryParams extends HashMap<String, Object> {
    public UpdateServiceAssetQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceAssetResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceAssetResponse updateSystemAttributesServiceAsset(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceAssetRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceAsset</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceAssetResponse> updateSystemAttributesServiceAssetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceAssetRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceAsset</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceAssetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceAssetResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceAssetResponse updateSystemAttributesServiceAsset(@Param("elid") String elid, UpdateSystemAttributesServiceAssetRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceAssetQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceAsset</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceAssetResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAsset/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceAssetResponse> updateSystemAttributesServiceAssetWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceAssetRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceAssetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceAsset</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceAssetQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceAssetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
