package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceAccessPointRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceAccessPointResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceAccessPointRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceAccessPointResponse;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointCustomInterfaceRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointCustomInterfaceResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointLogicalPortRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointLogicalPortResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointVlansRequestData;
import com.fntsoftware.businessgateway.entities.ServiceAccessPointVlansResponseData;
import com.fntsoftware.businessgateway.entities.UpdateServiceAccessPointRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceAccessPointResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceAccessPointRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceAccessPointResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface ServiceAccessPointApi extends ApiClient.Api {


  /**
   * Create
   * Create Service Access Point
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceAccessPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceAccessPointResponse createServiceAccessPoint(@Param("sessionId") String sessionId, CreateServiceAccessPointRequestData body);

  /**
   * Create
   * Similar to <code>createServiceAccessPoint</code> but it also returns the http response headers .
   * Create Service Access Point
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceAccessPointResponse> createServiceAccessPointWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceAccessPointRequestData body);


  /**
   * Create
   * Create Service Access Point
   * Note, this is equivalent to the other <code>createServiceAccessPoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceAccessPointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceAccessPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceAccessPointResponse createServiceAccessPoint(CreateServiceAccessPointRequestData body, @QueryMap(encoded=true) CreateServiceAccessPointQueryParams queryParams);

  /**
  * Create
  * Create Service Access Point
  * Note, this is equivalent to the other <code>createServiceAccessPoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceAccessPointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceAccessPointResponse> createServiceAccessPointWithHttpInfo(CreateServiceAccessPointRequestData body, @QueryMap(encoded=true) CreateServiceAccessPointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceAccessPoint</code> method in a fluent style.
   */
  public static class CreateServiceAccessPointQueryParams extends HashMap<String, Object> {
    public CreateServiceAccessPointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Service Access Point
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServiceAccessPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceAccessPointResponse deleteServiceAccessPoint(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceAccessPointRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceAccessPoint</code> but it also returns the http response headers .
   * Delete Service Access Point
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceAccessPointResponse> deleteServiceAccessPointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceAccessPointRequestData body);


  /**
   * Delete
   * Delete Service Access Point
   * Note, this is equivalent to the other <code>deleteServiceAccessPoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceAccessPointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceAccessPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceAccessPointResponse deleteServiceAccessPoint(@Param("elid") String elid, DeleteServiceAccessPointRequestData body, @QueryMap(encoded=true) DeleteServiceAccessPointQueryParams queryParams);

  /**
  * Delete
  * Delete Service Access Point
  * Note, this is equivalent to the other <code>deleteServiceAccessPoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceAccessPointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceAccessPointResponse> deleteServiceAccessPointWithHttpInfo(@Param("elid") String elid, DeleteServiceAccessPointRequestData body, @QueryMap(encoded=true) DeleteServiceAccessPointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceAccessPoint</code> method in a fluent style.
   */
  public static class DeleteServiceAccessPointQueryParams extends HashMap<String, Object> {
    public DeleteServiceAccessPointQueryParams sessionId(final String value) {
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
   * @return ServiceAccessPointContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAccessPointContractsResponseData serviceAccessPointContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceAccessPointContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAccessPointContractsResponseData> serviceAccessPointContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceAccessPointContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAccessPointContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAccessPointContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAccessPointContractsResponseData serviceAccessPointContracts(@Param("elid") String elid, ServiceAccessPointContractsRequestData body, @QueryMap(encoded=true) ServiceAccessPointContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceAccessPointContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAccessPointContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAccessPointContractsResponseData> serviceAccessPointContractsWithHttpInfo(@Param("elid") String elid, ServiceAccessPointContractsRequestData body, @QueryMap(encoded=true) ServiceAccessPointContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAccessPointContracts</code> method in a fluent style.
   */
  public static class ServiceAccessPointContractsQueryParams extends HashMap<String, Object> {
    public ServiceAccessPointContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Interface entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceAccessPointCustomInterfaceResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/CustomInterface?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAccessPointCustomInterfaceResponseData serviceAccessPointCustomInterface(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointCustomInterfaceRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>serviceAccessPointCustomInterface</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/CustomInterface?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAccessPointCustomInterfaceResponseData> serviceAccessPointCustomInterfaceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointCustomInterfaceRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>serviceAccessPointCustomInterface</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAccessPointCustomInterfaceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAccessPointCustomInterfaceResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/CustomInterface?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAccessPointCustomInterfaceResponseData serviceAccessPointCustomInterface(@Param("elid") String elid, ServiceAccessPointCustomInterfaceRequestData body, @QueryMap(encoded=true) ServiceAccessPointCustomInterfaceQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>serviceAccessPointCustomInterface</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAccessPointCustomInterfaceResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/CustomInterface?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAccessPointCustomInterfaceResponseData> serviceAccessPointCustomInterfaceWithHttpInfo(@Param("elid") String elid, ServiceAccessPointCustomInterfaceRequestData body, @QueryMap(encoded=true) ServiceAccessPointCustomInterfaceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAccessPointCustomInterface</code> method in a fluent style.
   */
  public static class ServiceAccessPointCustomInterfaceQueryParams extends HashMap<String, Object> {
    public ServiceAccessPointCustomInterfaceQueryParams sessionId(final String value) {
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
   * @return ServiceAccessPointFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAccessPointFrameContractsResponseData serviceAccessPointFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceAccessPointFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAccessPointFrameContractsResponseData> serviceAccessPointFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceAccessPointFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAccessPointFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAccessPointFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAccessPointFrameContractsResponseData serviceAccessPointFrameContracts(@Param("elid") String elid, ServiceAccessPointFrameContractsRequestData body, @QueryMap(encoded=true) ServiceAccessPointFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceAccessPointFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAccessPointFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAccessPointFrameContractsResponseData> serviceAccessPointFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceAccessPointFrameContractsRequestData body, @QueryMap(encoded=true) ServiceAccessPointFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAccessPointFrameContracts</code> method in a fluent style.
   */
  public static class ServiceAccessPointFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceAccessPointFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Logical port entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceAccessPointLogicalPortResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/LogicalPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAccessPointLogicalPortResponseData serviceAccessPointLogicalPort(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointLogicalPortRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>serviceAccessPointLogicalPort</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/LogicalPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAccessPointLogicalPortResponseData> serviceAccessPointLogicalPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointLogicalPortRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>serviceAccessPointLogicalPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAccessPointLogicalPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAccessPointLogicalPortResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/LogicalPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAccessPointLogicalPortResponseData serviceAccessPointLogicalPort(@Param("elid") String elid, ServiceAccessPointLogicalPortRequestData body, @QueryMap(encoded=true) ServiceAccessPointLogicalPortQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>serviceAccessPointLogicalPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAccessPointLogicalPortResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/LogicalPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAccessPointLogicalPortResponseData> serviceAccessPointLogicalPortWithHttpInfo(@Param("elid") String elid, ServiceAccessPointLogicalPortRequestData body, @QueryMap(encoded=true) ServiceAccessPointLogicalPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAccessPointLogicalPort</code> method in a fluent style.
   */
  public static class ServiceAccessPointLogicalPortQueryParams extends HashMap<String, Object> {
    public ServiceAccessPointLogicalPortQueryParams sessionId(final String value) {
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
   * @return ServiceAccessPointMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAccessPointMaintenanceContractsResponseData serviceAccessPointMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serviceAccessPointMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAccessPointMaintenanceContractsResponseData> serviceAccessPointMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serviceAccessPointMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAccessPointMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAccessPointMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAccessPointMaintenanceContractsResponseData serviceAccessPointMaintenanceContracts(@Param("elid") String elid, ServiceAccessPointMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceAccessPointMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serviceAccessPointMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAccessPointMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAccessPointMaintenanceContractsResponseData> serviceAccessPointMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServiceAccessPointMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceAccessPointMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAccessPointMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServiceAccessPointMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServiceAccessPointMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServiceAccessPointOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAccessPointOrganizationsResponseData serviceAccessPointOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceAccessPointOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAccessPointOrganizationsResponseData> serviceAccessPointOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceAccessPointOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAccessPointOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAccessPointOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAccessPointOrganizationsResponseData serviceAccessPointOrganizations(@Param("elid") String elid, ServiceAccessPointOrganizationsRequestData body, @QueryMap(encoded=true) ServiceAccessPointOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceAccessPointOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAccessPointOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAccessPointOrganizationsResponseData> serviceAccessPointOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceAccessPointOrganizationsRequestData body, @QueryMap(encoded=true) ServiceAccessPointOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAccessPointOrganizations</code> method in a fluent style.
   */
  public static class ServiceAccessPointOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceAccessPointOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceAccessPointPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAccessPointPersonGroupsResponseData serviceAccessPointPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceAccessPointPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAccessPointPersonGroupsResponseData> serviceAccessPointPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceAccessPointPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAccessPointPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAccessPointPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAccessPointPersonGroupsResponseData serviceAccessPointPersonGroups(@Param("elid") String elid, ServiceAccessPointPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceAccessPointPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceAccessPointPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAccessPointPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAccessPointPersonGroupsResponseData> serviceAccessPointPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceAccessPointPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceAccessPointPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAccessPointPersonGroups</code> method in a fluent style.
   */
  public static class ServiceAccessPointPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceAccessPointPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceAccessPointPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAccessPointPersonsResponseData serviceAccessPointPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceAccessPointPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAccessPointPersonsResponseData> serviceAccessPointPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceAccessPointPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAccessPointPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAccessPointPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAccessPointPersonsResponseData serviceAccessPointPersons(@Param("elid") String elid, ServiceAccessPointPersonsRequestData body, @QueryMap(encoded=true) ServiceAccessPointPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceAccessPointPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAccessPointPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAccessPointPersonsResponseData> serviceAccessPointPersonsWithHttpInfo(@Param("elid") String elid, ServiceAccessPointPersonsRequestData body, @QueryMap(encoded=true) ServiceAccessPointPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAccessPointPersons</code> method in a fluent style.
   */
  public static class ServiceAccessPointPersonsQueryParams extends HashMap<String, Object> {
    public ServiceAccessPointPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceAccessPointQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAccessPointQueryResponse serviceAccessPointQuery(@Param("sessionId") String sessionId, ServiceAccessPointQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceAccessPointQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAccessPointQueryResponse> serviceAccessPointQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceAccessPointQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>serviceAccessPointQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAccessPointQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAccessPointQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAccessPointQueryResponse serviceAccessPointQuery(ServiceAccessPointQueryRequest body, @QueryMap(encoded=true) ServiceAccessPointQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>serviceAccessPointQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAccessPointQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAccessPointQueryResponse> serviceAccessPointQueryWithHttpInfo(ServiceAccessPointQueryRequest body, @QueryMap(encoded=true) ServiceAccessPointQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAccessPointQuery</code> method in a fluent style.
   */
  public static class ServiceAccessPointQueryQueryParams extends HashMap<String, Object> {
    public ServiceAccessPointQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service (Telco) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceAccessPointServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAccessPointServicesTelcoResponseData serviceAccessPointServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>serviceAccessPointServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAccessPointServicesTelcoResponseData> serviceAccessPointServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>serviceAccessPointServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAccessPointServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAccessPointServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAccessPointServicesTelcoResponseData serviceAccessPointServicesTelco(@Param("elid") String elid, ServiceAccessPointServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceAccessPointServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>serviceAccessPointServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAccessPointServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/ServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAccessPointServicesTelcoResponseData> serviceAccessPointServicesTelcoWithHttpInfo(@Param("elid") String elid, ServiceAccessPointServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceAccessPointServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAccessPointServicesTelco</code> method in a fluent style.
   */
  public static class ServiceAccessPointServicesTelcoQueryParams extends HashMap<String, Object> {
    public ServiceAccessPointServicesTelcoQueryParams sessionId(final String value) {
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
   * @return ServiceAccessPointSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAccessPointSystemAttributesResponse serviceAccessPointSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceAccessPointSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAccessPointSystemAttributesResponse> serviceAccessPointSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>serviceAccessPointSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAccessPointSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAccessPointSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAccessPointSystemAttributesResponse serviceAccessPointSystemAttributes(@Param("elid") String elid, ServiceAccessPointSystemAttributesRequest body, @QueryMap(encoded=true) ServiceAccessPointSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>serviceAccessPointSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAccessPointSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAccessPointSystemAttributesResponse> serviceAccessPointSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceAccessPointSystemAttributesRequest body, @QueryMap(encoded=true) ServiceAccessPointSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAccessPointSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceAccessPointSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceAccessPointSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to VLAN entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceAccessPointVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceAccessPointVlansResponseData serviceAccessPointVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointVlansRequestData body);

  /**
   * Get relations to VLAN entities
   * Similar to <code>serviceAccessPointVlans</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceAccessPointVlansResponseData> serviceAccessPointVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceAccessPointVlansRequestData body);


  /**
   * Get relations to VLAN entities
   * 
   * Note, this is equivalent to the other <code>serviceAccessPointVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceAccessPointVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceAccessPointVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceAccessPointVlansResponseData serviceAccessPointVlans(@Param("elid") String elid, ServiceAccessPointVlansRequestData body, @QueryMap(encoded=true) ServiceAccessPointVlansQueryParams queryParams);

  /**
  * Get relations to VLAN entities
  * 
  * Note, this is equivalent to the other <code>serviceAccessPointVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceAccessPointVlansResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceAccessPointVlansResponseData> serviceAccessPointVlansWithHttpInfo(@Param("elid") String elid, ServiceAccessPointVlansRequestData body, @QueryMap(encoded=true) ServiceAccessPointVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceAccessPointVlans</code> method in a fluent style.
   */
  public static class ServiceAccessPointVlansQueryParams extends HashMap<String, Object> {
    public ServiceAccessPointVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Service Access Point
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateServiceAccessPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceAccessPointResponse updateServiceAccessPoint(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceAccessPointRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceAccessPoint</code> but it also returns the http response headers .
   * Modify Service Access Point
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceAccessPointResponse> updateServiceAccessPointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceAccessPointRequestData body);


  /**
   * Modify
   * Modify Service Access Point
   * Note, this is equivalent to the other <code>updateServiceAccessPoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceAccessPointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceAccessPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceAccessPointResponse updateServiceAccessPoint(@Param("elid") String elid, UpdateServiceAccessPointRequestData body, @QueryMap(encoded=true) UpdateServiceAccessPointQueryParams queryParams);

  /**
  * Modify
  * Modify Service Access Point
  * Note, this is equivalent to the other <code>updateServiceAccessPoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceAccessPointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceAccessPointResponse> updateServiceAccessPointWithHttpInfo(@Param("elid") String elid, UpdateServiceAccessPointRequestData body, @QueryMap(encoded=true) UpdateServiceAccessPointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceAccessPoint</code> method in a fluent style.
   */
  public static class UpdateServiceAccessPointQueryParams extends HashMap<String, Object> {
    public UpdateServiceAccessPointQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceAccessPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceAccessPointResponse updateSystemAttributesServiceAccessPoint(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceAccessPointRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceAccessPoint</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceAccessPointResponse> updateSystemAttributesServiceAccessPointWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceAccessPointRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceAccessPoint</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceAccessPointQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceAccessPointResponse
   */
  @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceAccessPointResponse updateSystemAttributesServiceAccessPoint(@Param("elid") String elid, UpdateSystemAttributesServiceAccessPointRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceAccessPointQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceAccessPoint</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceAccessPointResponse
      */
      @RequestLine("POST /api/rest/entity/serviceAccessPoint/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceAccessPointResponse> updateSystemAttributesServiceAccessPointWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceAccessPointRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceAccessPointQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceAccessPoint</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceAccessPointQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceAccessPointQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
