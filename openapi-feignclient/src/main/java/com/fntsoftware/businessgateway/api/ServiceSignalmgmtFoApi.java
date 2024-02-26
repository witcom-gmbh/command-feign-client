package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceSignalmgmtFoRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceSignalmgmtFoResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceSignalmgmtFoRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceSignalmgmtFoResponse;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoServiceMasterSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoServiceMasterSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoServicesSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoServicesSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoSignalPathsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoSignalPathsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtFoSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceSignalmgmtFoRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceSignalmgmtFoResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceSignalmgmtFoRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceSignalmgmtFoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceSignalmgmtFoApi extends ApiClient.Api {


  /**
   * Create
   * Create Service
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceSignalmgmtFoResponse createServiceSignalmgmtFo(@Param("sessionId") String sessionId, CreateServiceSignalmgmtFoRequestData body);

  /**
   * Create
   * Similar to <code>createServiceSignalmgmtFo</code> but it also returns the http response headers .
   * Create Service
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceSignalmgmtFoResponse> createServiceSignalmgmtFoWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceSignalmgmtFoRequestData body);


  /**
   * Create
   * Create Service
   * Note, this is equivalent to the other <code>createServiceSignalmgmtFo</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceSignalmgmtFoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceSignalmgmtFoResponse createServiceSignalmgmtFo(CreateServiceSignalmgmtFoRequestData body, @QueryMap(encoded=true) CreateServiceSignalmgmtFoQueryParams queryParams);

  /**
  * Create
  * Create Service
  * Note, this is equivalent to the other <code>createServiceSignalmgmtFo</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceSignalmgmtFoResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceSignalmgmtFoResponse> createServiceSignalmgmtFoWithHttpInfo(CreateServiceSignalmgmtFoRequestData body, @QueryMap(encoded=true) CreateServiceSignalmgmtFoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceSignalmgmtFo</code> method in a fluent style.
   */
  public static class CreateServiceSignalmgmtFoQueryParams extends HashMap<String, Object> {
    public CreateServiceSignalmgmtFoQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServiceSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceSignalmgmtFoResponse deleteServiceSignalmgmtFo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceSignalmgmtFoRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceSignalmgmtFo</code> but it also returns the http response headers .
   * Delete Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceSignalmgmtFoResponse> deleteServiceSignalmgmtFoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceSignalmgmtFoRequestData body);


  /**
   * Delete
   * Delete Service
   * Note, this is equivalent to the other <code>deleteServiceSignalmgmtFo</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceSignalmgmtFoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceSignalmgmtFoResponse deleteServiceSignalmgmtFo(@Param("elid") String elid, DeleteServiceSignalmgmtFoRequestData body, @QueryMap(encoded=true) DeleteServiceSignalmgmtFoQueryParams queryParams);

  /**
  * Delete
  * Delete Service
  * Note, this is equivalent to the other <code>deleteServiceSignalmgmtFo</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceSignalmgmtFoResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceSignalmgmtFoResponse> deleteServiceSignalmgmtFoWithHttpInfo(@Param("elid") String elid, DeleteServiceSignalmgmtFoRequestData body, @QueryMap(encoded=true) DeleteServiceSignalmgmtFoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceSignalmgmtFo</code> method in a fluent style.
   */
  public static class DeleteServiceSignalmgmtFoQueryParams extends HashMap<String, Object> {
    public DeleteServiceSignalmgmtFoQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtFoContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtFoContractsResponseData serviceSignalmgmtFoContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceSignalmgmtFoContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtFoContractsResponseData> serviceSignalmgmtFoContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtFoContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtFoContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtFoContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtFoContractsResponseData serviceSignalmgmtFoContracts(@Param("elid") String elid, ServiceSignalmgmtFoContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtFoContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtFoContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtFoContractsResponseData> serviceSignalmgmtFoContractsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtFoContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtFoContracts</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtFoContractsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtFoContractsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtFoDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtFoDevicesAllResponseData serviceSignalmgmtFoDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>serviceSignalmgmtFoDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtFoDevicesAllResponseData> serviceSignalmgmtFoDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtFoDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtFoDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtFoDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtFoDevicesAllResponseData serviceSignalmgmtFoDevicesAll(@Param("elid") String elid, ServiceSignalmgmtFoDevicesAllRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtFoDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtFoDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtFoDevicesAllResponseData> serviceSignalmgmtFoDevicesAllWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtFoDevicesAllRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtFoDevicesAll</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtFoDevicesAllQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtFoDevicesAllQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtFoFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtFoFrameContractsResponseData serviceSignalmgmtFoFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceSignalmgmtFoFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtFoFrameContractsResponseData> serviceSignalmgmtFoFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtFoFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtFoFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtFoFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtFoFrameContractsResponseData serviceSignalmgmtFoFrameContracts(@Param("elid") String elid, ServiceSignalmgmtFoFrameContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtFoFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtFoFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtFoFrameContractsResponseData> serviceSignalmgmtFoFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtFoFrameContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtFoFrameContracts</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtFoFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtFoFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtFoOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtFoOrganizationsResponseData serviceSignalmgmtFoOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceSignalmgmtFoOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtFoOrganizationsResponseData> serviceSignalmgmtFoOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtFoOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtFoOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtFoOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtFoOrganizationsResponseData serviceSignalmgmtFoOrganizations(@Param("elid") String elid, ServiceSignalmgmtFoOrganizationsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtFoOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtFoOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtFoOrganizationsResponseData> serviceSignalmgmtFoOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtFoOrganizationsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtFoOrganizations</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtFoOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtFoOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtFoPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtFoPersonGroupsResponseData serviceSignalmgmtFoPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceSignalmgmtFoPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtFoPersonGroupsResponseData> serviceSignalmgmtFoPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtFoPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtFoPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtFoPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtFoPersonGroupsResponseData serviceSignalmgmtFoPersonGroups(@Param("elid") String elid, ServiceSignalmgmtFoPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtFoPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtFoPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtFoPersonGroupsResponseData> serviceSignalmgmtFoPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtFoPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtFoPersonGroups</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtFoPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtFoPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtFoPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtFoPersonsResponseData serviceSignalmgmtFoPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceSignalmgmtFoPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtFoPersonsResponseData> serviceSignalmgmtFoPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtFoPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtFoPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtFoPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtFoPersonsResponseData serviceSignalmgmtFoPersons(@Param("elid") String elid, ServiceSignalmgmtFoPersonsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtFoPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtFoPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtFoPersonsResponseData> serviceSignalmgmtFoPersonsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtFoPersonsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtFoPersons</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtFoPersonsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtFoPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceSignalmgmtFoQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtFoQueryResponse serviceSignalmgmtFoQuery(@Param("sessionId") String sessionId, ServiceSignalmgmtFoQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceSignalmgmtFoQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtFoQueryResponse> serviceSignalmgmtFoQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceSignalmgmtFoQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serviceSignalmgmtFoQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtFoQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtFoQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtFoQueryResponse serviceSignalmgmtFoQuery(ServiceSignalmgmtFoQueryRequest body, @QueryMap(encoded=true) ServiceSignalmgmtFoQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serviceSignalmgmtFoQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtFoQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtFoQueryResponse> serviceSignalmgmtFoQueryWithHttpInfo(ServiceSignalmgmtFoQueryRequest body, @QueryMap(encoded=true) ServiceSignalmgmtFoQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtFoQuery</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtFoQueryQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtFoQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service master (Signal Management) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceSignalmgmtFoServiceMasterSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtFoServiceMasterSignalmgmtResponseData serviceSignalmgmtFoServiceMasterSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoServiceMasterSignalmgmtRequestData body);

  /**
   * Get relations to Service master (Signal Management) entities
   * Similar to <code>serviceSignalmgmtFoServiceMasterSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtFoServiceMasterSignalmgmtResponseData> serviceSignalmgmtFoServiceMasterSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoServiceMasterSignalmgmtRequestData body);


  /**
   * Get relations to Service master (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtFoServiceMasterSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtFoServiceMasterSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtFoServiceMasterSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtFoServiceMasterSignalmgmtResponseData serviceSignalmgmtFoServiceMasterSignalmgmt(@Param("elid") String elid, ServiceSignalmgmtFoServiceMasterSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoServiceMasterSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service master (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtFoServiceMasterSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtFoServiceMasterSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtFoServiceMasterSignalmgmtResponseData> serviceSignalmgmtFoServiceMasterSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtFoServiceMasterSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoServiceMasterSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtFoServiceMasterSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtFoServiceMasterSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtFoServiceMasterSignalmgmtQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service (Signal Management) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceSignalmgmtFoServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtFoServicesSignalmgmtResponseData serviceSignalmgmtFoServicesSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoServicesSignalmgmtRequestData body);

  /**
   * Get relations to Service (Signal Management) entities
   * Similar to <code>serviceSignalmgmtFoServicesSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtFoServicesSignalmgmtResponseData> serviceSignalmgmtFoServicesSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoServicesSignalmgmtRequestData body);


  /**
   * Get relations to Service (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtFoServicesSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtFoServicesSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtFoServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtFoServicesSignalmgmtResponseData serviceSignalmgmtFoServicesSignalmgmt(@Param("elid") String elid, ServiceSignalmgmtFoServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoServicesSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtFoServicesSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtFoServicesSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtFoServicesSignalmgmtResponseData> serviceSignalmgmtFoServicesSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtFoServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoServicesSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtFoServicesSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtFoServicesSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtFoServicesSignalmgmtQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Signal path entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceSignalmgmtFoSignalPathsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtFoSignalPathsResponseData serviceSignalmgmtFoSignalPaths(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoSignalPathsRequestData body);

  /**
   * Get relations to Signal path entities
   * Similar to <code>serviceSignalmgmtFoSignalPaths</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtFoSignalPathsResponseData> serviceSignalmgmtFoSignalPathsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoSignalPathsRequestData body);


  /**
   * Get relations to Signal path entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtFoSignalPaths</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtFoSignalPathsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtFoSignalPathsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtFoSignalPathsResponseData serviceSignalmgmtFoSignalPaths(@Param("elid") String elid, ServiceSignalmgmtFoSignalPathsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoSignalPathsQueryParams queryParams);

  /**
  * Get relations to Signal path entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtFoSignalPaths</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtFoSignalPathsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/SignalPaths?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtFoSignalPathsResponseData> serviceSignalmgmtFoSignalPathsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtFoSignalPathsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtFoSignalPathsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtFoSignalPaths</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtFoSignalPathsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtFoSignalPathsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtFoSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtFoSystemAttributesResponse serviceSignalmgmtFoSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceSignalmgmtFoSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtFoSystemAttributesResponse> serviceSignalmgmtFoSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtFoSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serviceSignalmgmtFoSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtFoSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtFoSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtFoSystemAttributesResponse serviceSignalmgmtFoSystemAttributes(@Param("elid") String elid, ServiceSignalmgmtFoSystemAttributesRequest body, @QueryMap(encoded=true) ServiceSignalmgmtFoSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serviceSignalmgmtFoSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtFoSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtFoSystemAttributesResponse> serviceSignalmgmtFoSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtFoSystemAttributesRequest body, @QueryMap(encoded=true) ServiceSignalmgmtFoSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtFoSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtFoSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtFoSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateServiceSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceSignalmgmtFoResponse updateServiceSignalmgmtFo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceSignalmgmtFoRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceSignalmgmtFo</code> but it also returns the http response headers .
   * Modify Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceSignalmgmtFoResponse> updateServiceSignalmgmtFoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceSignalmgmtFoRequestData body);


  /**
   * Modify
   * Modify Service
   * Note, this is equivalent to the other <code>updateServiceSignalmgmtFo</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceSignalmgmtFoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceSignalmgmtFoResponse updateServiceSignalmgmtFo(@Param("elid") String elid, UpdateServiceSignalmgmtFoRequestData body, @QueryMap(encoded=true) UpdateServiceSignalmgmtFoQueryParams queryParams);

  /**
  * Modify
  * Modify Service
  * Note, this is equivalent to the other <code>updateServiceSignalmgmtFo</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceSignalmgmtFoResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceSignalmgmtFoResponse> updateServiceSignalmgmtFoWithHttpInfo(@Param("elid") String elid, UpdateServiceSignalmgmtFoRequestData body, @QueryMap(encoded=true) UpdateServiceSignalmgmtFoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceSignalmgmtFo</code> method in a fluent style.
   */
  public static class UpdateServiceSignalmgmtFoQueryParams extends HashMap<String, Object> {
    public UpdateServiceSignalmgmtFoQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceSignalmgmtFoResponse updateSystemAttributesServiceSignalmgmtFo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtFoRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceSignalmgmtFo</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceSignalmgmtFoResponse> updateSystemAttributesServiceSignalmgmtFoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtFoRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceSignalmgmtFo</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceSignalmgmtFoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceSignalmgmtFoResponse updateSystemAttributesServiceSignalmgmtFo(@Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtFoRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceSignalmgmtFoQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceSignalmgmtFo</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceSignalmgmtFoResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtFo/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceSignalmgmtFoResponse> updateSystemAttributesServiceSignalmgmtFoWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtFoRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceSignalmgmtFoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceSignalmgmtFo</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceSignalmgmtFoQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceSignalmgmtFoQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
