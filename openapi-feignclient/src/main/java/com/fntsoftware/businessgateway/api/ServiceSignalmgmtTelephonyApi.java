package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceSignalmgmtTelephonyRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceSignalmgmtTelephonyResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceSignalmgmtTelephonyRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceSignalmgmtTelephonyResponse;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyServiceMasterSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyServiceMasterSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyServicesSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonyServicesSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonySignalPathsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonySignalPathsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonySystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtTelephonySystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceSignalmgmtTelephonyRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceSignalmgmtTelephonyResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceSignalmgmtTelephonyRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceSignalmgmtTelephonyResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceSignalmgmtTelephonyApi extends ApiClient.Api {


  /**
   * Create
   * Create Service
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceSignalmgmtTelephonyResponse createServiceSignalmgmtTelephony(@Param("sessionId") String sessionId, CreateServiceSignalmgmtTelephonyRequestData body);

  /**
   * Create
   * Similar to <code>createServiceSignalmgmtTelephony</code> but it also returns the http response headers .
   * Create Service
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceSignalmgmtTelephonyResponse> createServiceSignalmgmtTelephonyWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceSignalmgmtTelephonyRequestData body);


  /**
   * Create
   * Create Service
   * Note, this is equivalent to the other <code>createServiceSignalmgmtTelephony</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceSignalmgmtTelephonyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceSignalmgmtTelephonyResponse createServiceSignalmgmtTelephony(CreateServiceSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) CreateServiceSignalmgmtTelephonyQueryParams queryParams);

  /**
  * Create
  * Create Service
  * Note, this is equivalent to the other <code>createServiceSignalmgmtTelephony</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceSignalmgmtTelephonyResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceSignalmgmtTelephonyResponse> createServiceSignalmgmtTelephonyWithHttpInfo(CreateServiceSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) CreateServiceSignalmgmtTelephonyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceSignalmgmtTelephony</code> method in a fluent style.
   */
  public static class CreateServiceSignalmgmtTelephonyQueryParams extends HashMap<String, Object> {
    public CreateServiceSignalmgmtTelephonyQueryParams sessionId(final String value) {
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
   * @return DeleteServiceSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceSignalmgmtTelephonyResponse deleteServiceSignalmgmtTelephony(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceSignalmgmtTelephonyRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceSignalmgmtTelephony</code> but it also returns the http response headers .
   * Delete Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceSignalmgmtTelephonyResponse> deleteServiceSignalmgmtTelephonyWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceSignalmgmtTelephonyRequestData body);


  /**
   * Delete
   * Delete Service
   * Note, this is equivalent to the other <code>deleteServiceSignalmgmtTelephony</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceSignalmgmtTelephonyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceSignalmgmtTelephonyResponse deleteServiceSignalmgmtTelephony(@Param("elid") String elid, DeleteServiceSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) DeleteServiceSignalmgmtTelephonyQueryParams queryParams);

  /**
  * Delete
  * Delete Service
  * Note, this is equivalent to the other <code>deleteServiceSignalmgmtTelephony</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceSignalmgmtTelephonyResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceSignalmgmtTelephonyResponse> deleteServiceSignalmgmtTelephonyWithHttpInfo(@Param("elid") String elid, DeleteServiceSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) DeleteServiceSignalmgmtTelephonyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceSignalmgmtTelephony</code> method in a fluent style.
   */
  public static class DeleteServiceSignalmgmtTelephonyQueryParams extends HashMap<String, Object> {
    public DeleteServiceSignalmgmtTelephonyQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtTelephonyContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyContractsResponseData serviceSignalmgmtTelephonyContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceSignalmgmtTelephonyContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtTelephonyContractsResponseData> serviceSignalmgmtTelephonyContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtTelephonyContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtTelephonyContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyContractsResponseData serviceSignalmgmtTelephonyContracts(@Param("elid") String elid, ServiceSignalmgmtTelephonyContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtTelephonyContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtTelephonyContractsResponseData> serviceSignalmgmtTelephonyContractsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtTelephonyContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtTelephonyContracts</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtTelephonyContractsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtTelephonyContractsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtTelephonyDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyDevicesAllResponseData serviceSignalmgmtTelephonyDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>serviceSignalmgmtTelephonyDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtTelephonyDevicesAllResponseData> serviceSignalmgmtTelephonyDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtTelephonyDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtTelephonyDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyDevicesAllResponseData serviceSignalmgmtTelephonyDevicesAll(@Param("elid") String elid, ServiceSignalmgmtTelephonyDevicesAllRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtTelephonyDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtTelephonyDevicesAllResponseData> serviceSignalmgmtTelephonyDevicesAllWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtTelephonyDevicesAllRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtTelephonyDevicesAll</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtTelephonyDevicesAllQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtTelephonyDevicesAllQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtTelephonyFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyFrameContractsResponseData serviceSignalmgmtTelephonyFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceSignalmgmtTelephonyFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtTelephonyFrameContractsResponseData> serviceSignalmgmtTelephonyFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtTelephonyFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtTelephonyFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyFrameContractsResponseData serviceSignalmgmtTelephonyFrameContracts(@Param("elid") String elid, ServiceSignalmgmtTelephonyFrameContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtTelephonyFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtTelephonyFrameContractsResponseData> serviceSignalmgmtTelephonyFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtTelephonyFrameContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtTelephonyFrameContracts</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtTelephonyFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtTelephonyFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtTelephonyOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyOrganizationsResponseData serviceSignalmgmtTelephonyOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceSignalmgmtTelephonyOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtTelephonyOrganizationsResponseData> serviceSignalmgmtTelephonyOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtTelephonyOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtTelephonyOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyOrganizationsResponseData serviceSignalmgmtTelephonyOrganizations(@Param("elid") String elid, ServiceSignalmgmtTelephonyOrganizationsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtTelephonyOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtTelephonyOrganizationsResponseData> serviceSignalmgmtTelephonyOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtTelephonyOrganizationsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtTelephonyOrganizations</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtTelephonyOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtTelephonyOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtTelephonyPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyPersonGroupsResponseData serviceSignalmgmtTelephonyPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceSignalmgmtTelephonyPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtTelephonyPersonGroupsResponseData> serviceSignalmgmtTelephonyPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtTelephonyPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtTelephonyPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyPersonGroupsResponseData serviceSignalmgmtTelephonyPersonGroups(@Param("elid") String elid, ServiceSignalmgmtTelephonyPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtTelephonyPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtTelephonyPersonGroupsResponseData> serviceSignalmgmtTelephonyPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtTelephonyPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtTelephonyPersonGroups</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtTelephonyPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtTelephonyPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtTelephonyPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyPersonsResponseData serviceSignalmgmtTelephonyPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceSignalmgmtTelephonyPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtTelephonyPersonsResponseData> serviceSignalmgmtTelephonyPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtTelephonyPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtTelephonyPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyPersonsResponseData serviceSignalmgmtTelephonyPersons(@Param("elid") String elid, ServiceSignalmgmtTelephonyPersonsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtTelephonyPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtTelephonyPersonsResponseData> serviceSignalmgmtTelephonyPersonsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtTelephonyPersonsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtTelephonyPersons</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtTelephonyPersonsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtTelephonyPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceSignalmgmtTelephonyQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyQueryResponse serviceSignalmgmtTelephonyQuery(@Param("sessionId") String sessionId, ServiceSignalmgmtTelephonyQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceSignalmgmtTelephonyQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtTelephonyQueryResponse> serviceSignalmgmtTelephonyQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceSignalmgmtTelephonyQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtTelephonyQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtTelephonyQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyQueryResponse serviceSignalmgmtTelephonyQuery(ServiceSignalmgmtTelephonyQueryRequest body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtTelephonyQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtTelephonyQueryResponse> serviceSignalmgmtTelephonyQueryWithHttpInfo(ServiceSignalmgmtTelephonyQueryRequest body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtTelephonyQuery</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtTelephonyQueryQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtTelephonyQueryQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtTelephonyServiceMasterSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyServiceMasterSignalmgmtResponseData serviceSignalmgmtTelephonyServiceMasterSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyServiceMasterSignalmgmtRequestData body);

  /**
   * Get relations to Service master (Signal Management) entities
   * Similar to <code>serviceSignalmgmtTelephonyServiceMasterSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtTelephonyServiceMasterSignalmgmtResponseData> serviceSignalmgmtTelephonyServiceMasterSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyServiceMasterSignalmgmtRequestData body);


  /**
   * Get relations to Service master (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyServiceMasterSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtTelephonyServiceMasterSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtTelephonyServiceMasterSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyServiceMasterSignalmgmtResponseData serviceSignalmgmtTelephonyServiceMasterSignalmgmt(@Param("elid") String elid, ServiceSignalmgmtTelephonyServiceMasterSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyServiceMasterSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service master (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyServiceMasterSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtTelephonyServiceMasterSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtTelephonyServiceMasterSignalmgmtResponseData> serviceSignalmgmtTelephonyServiceMasterSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtTelephonyServiceMasterSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyServiceMasterSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtTelephonyServiceMasterSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtTelephonyServiceMasterSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtTelephonyServiceMasterSignalmgmtQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtTelephonyServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyServicesSignalmgmtResponseData serviceSignalmgmtTelephonyServicesSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyServicesSignalmgmtRequestData body);

  /**
   * Get relations to Service (Signal Management) entities
   * Similar to <code>serviceSignalmgmtTelephonyServicesSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtTelephonyServicesSignalmgmtResponseData> serviceSignalmgmtTelephonyServicesSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonyServicesSignalmgmtRequestData body);


  /**
   * Get relations to Service (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyServicesSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtTelephonyServicesSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtTelephonyServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtTelephonyServicesSignalmgmtResponseData serviceSignalmgmtTelephonyServicesSignalmgmt(@Param("elid") String elid, ServiceSignalmgmtTelephonyServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyServicesSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonyServicesSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtTelephonyServicesSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtTelephonyServicesSignalmgmtResponseData> serviceSignalmgmtTelephonyServicesSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtTelephonyServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonyServicesSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtTelephonyServicesSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtTelephonyServicesSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtTelephonyServicesSignalmgmtQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtTelephonySignalPathsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtTelephonySignalPathsResponseData serviceSignalmgmtTelephonySignalPaths(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonySignalPathsRequestData body);

  /**
   * Get relations to Signal path entities
   * Similar to <code>serviceSignalmgmtTelephonySignalPaths</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtTelephonySignalPathsResponseData> serviceSignalmgmtTelephonySignalPathsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonySignalPathsRequestData body);


  /**
   * Get relations to Signal path entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonySignalPaths</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtTelephonySignalPathsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtTelephonySignalPathsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtTelephonySignalPathsResponseData serviceSignalmgmtTelephonySignalPaths(@Param("elid") String elid, ServiceSignalmgmtTelephonySignalPathsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonySignalPathsQueryParams queryParams);

  /**
  * Get relations to Signal path entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonySignalPaths</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtTelephonySignalPathsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/SignalPaths?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtTelephonySignalPathsResponseData> serviceSignalmgmtTelephonySignalPathsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtTelephonySignalPathsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonySignalPathsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtTelephonySignalPaths</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtTelephonySignalPathsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtTelephonySignalPathsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtTelephonySystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtTelephonySystemAttributesResponse serviceSignalmgmtTelephonySystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonySystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceSignalmgmtTelephonySystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtTelephonySystemAttributesResponse> serviceSignalmgmtTelephonySystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtTelephonySystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonySystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtTelephonySystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtTelephonySystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtTelephonySystemAttributesResponse serviceSignalmgmtTelephonySystemAttributes(@Param("elid") String elid, ServiceSignalmgmtTelephonySystemAttributesRequest body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonySystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serviceSignalmgmtTelephonySystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtTelephonySystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtTelephonySystemAttributesResponse> serviceSignalmgmtTelephonySystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtTelephonySystemAttributesRequest body, @QueryMap(encoded=true) ServiceSignalmgmtTelephonySystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtTelephonySystemAttributes</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtTelephonySystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtTelephonySystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateServiceSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceSignalmgmtTelephonyResponse updateServiceSignalmgmtTelephony(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceSignalmgmtTelephonyRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceSignalmgmtTelephony</code> but it also returns the http response headers .
   * Modify Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceSignalmgmtTelephonyResponse> updateServiceSignalmgmtTelephonyWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceSignalmgmtTelephonyRequestData body);


  /**
   * Modify
   * Modify Service
   * Note, this is equivalent to the other <code>updateServiceSignalmgmtTelephony</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceSignalmgmtTelephonyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceSignalmgmtTelephonyResponse updateServiceSignalmgmtTelephony(@Param("elid") String elid, UpdateServiceSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) UpdateServiceSignalmgmtTelephonyQueryParams queryParams);

  /**
  * Modify
  * Modify Service
  * Note, this is equivalent to the other <code>updateServiceSignalmgmtTelephony</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceSignalmgmtTelephonyResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceSignalmgmtTelephonyResponse> updateServiceSignalmgmtTelephonyWithHttpInfo(@Param("elid") String elid, UpdateServiceSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) UpdateServiceSignalmgmtTelephonyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceSignalmgmtTelephony</code> method in a fluent style.
   */
  public static class UpdateServiceSignalmgmtTelephonyQueryParams extends HashMap<String, Object> {
    public UpdateServiceSignalmgmtTelephonyQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceSignalmgmtTelephonyResponse updateSystemAttributesServiceSignalmgmtTelephony(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtTelephonyRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceSignalmgmtTelephony</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceSignalmgmtTelephonyResponse> updateSystemAttributesServiceSignalmgmtTelephonyWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtTelephonyRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceSignalmgmtTelephony</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceSignalmgmtTelephonyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceSignalmgmtTelephonyResponse updateSystemAttributesServiceSignalmgmtTelephony(@Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceSignalmgmtTelephonyQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceSignalmgmtTelephony</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceSignalmgmtTelephonyResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtTelephony/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceSignalmgmtTelephonyResponse> updateSystemAttributesServiceSignalmgmtTelephonyWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceSignalmgmtTelephonyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceSignalmgmtTelephony</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceSignalmgmtTelephonyQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceSignalmgmtTelephonyQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
