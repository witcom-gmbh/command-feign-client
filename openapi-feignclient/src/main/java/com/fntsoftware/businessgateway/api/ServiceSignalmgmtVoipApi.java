package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceSignalmgmtVoipRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceSignalmgmtVoipResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceSignalmgmtVoipRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceSignalmgmtVoipResponse;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipServiceMasterSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipServiceMasterSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipServicesSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipServicesSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipSignalPathsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipSignalPathsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceSignalmgmtVoipSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceSignalmgmtVoipRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceSignalmgmtVoipResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceSignalmgmtVoipRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceSignalmgmtVoipResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceSignalmgmtVoipApi extends ApiClient.Api {


  /**
   * Create
   * Create Service
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceSignalmgmtVoipResponse createServiceSignalmgmtVoip(@Param("sessionId") String sessionId, CreateServiceSignalmgmtVoipRequestData body);

  /**
   * Create
   * Similar to <code>createServiceSignalmgmtVoip</code> but it also returns the http response headers .
   * Create Service
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceSignalmgmtVoipResponse> createServiceSignalmgmtVoipWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceSignalmgmtVoipRequestData body);


  /**
   * Create
   * Create Service
   * Note, this is equivalent to the other <code>createServiceSignalmgmtVoip</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceSignalmgmtVoipQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceSignalmgmtVoipResponse createServiceSignalmgmtVoip(CreateServiceSignalmgmtVoipRequestData body, @QueryMap(encoded=true) CreateServiceSignalmgmtVoipQueryParams queryParams);

  /**
  * Create
  * Create Service
  * Note, this is equivalent to the other <code>createServiceSignalmgmtVoip</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceSignalmgmtVoipResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceSignalmgmtVoipResponse> createServiceSignalmgmtVoipWithHttpInfo(CreateServiceSignalmgmtVoipRequestData body, @QueryMap(encoded=true) CreateServiceSignalmgmtVoipQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceSignalmgmtVoip</code> method in a fluent style.
   */
  public static class CreateServiceSignalmgmtVoipQueryParams extends HashMap<String, Object> {
    public CreateServiceSignalmgmtVoipQueryParams sessionId(final String value) {
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
   * @return DeleteServiceSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceSignalmgmtVoipResponse deleteServiceSignalmgmtVoip(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceSignalmgmtVoipRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceSignalmgmtVoip</code> but it also returns the http response headers .
   * Delete Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceSignalmgmtVoipResponse> deleteServiceSignalmgmtVoipWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceSignalmgmtVoipRequestData body);


  /**
   * Delete
   * Delete Service
   * Note, this is equivalent to the other <code>deleteServiceSignalmgmtVoip</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceSignalmgmtVoipQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceSignalmgmtVoipResponse deleteServiceSignalmgmtVoip(@Param("elid") String elid, DeleteServiceSignalmgmtVoipRequestData body, @QueryMap(encoded=true) DeleteServiceSignalmgmtVoipQueryParams queryParams);

  /**
  * Delete
  * Delete Service
  * Note, this is equivalent to the other <code>deleteServiceSignalmgmtVoip</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceSignalmgmtVoipResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceSignalmgmtVoipResponse> deleteServiceSignalmgmtVoipWithHttpInfo(@Param("elid") String elid, DeleteServiceSignalmgmtVoipRequestData body, @QueryMap(encoded=true) DeleteServiceSignalmgmtVoipQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceSignalmgmtVoip</code> method in a fluent style.
   */
  public static class DeleteServiceSignalmgmtVoipQueryParams extends HashMap<String, Object> {
    public DeleteServiceSignalmgmtVoipQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtVoipContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtVoipContractsResponseData serviceSignalmgmtVoipContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceSignalmgmtVoipContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtVoipContractsResponseData> serviceSignalmgmtVoipContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtVoipContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtVoipContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtVoipContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtVoipContractsResponseData serviceSignalmgmtVoipContracts(@Param("elid") String elid, ServiceSignalmgmtVoipContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtVoipContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtVoipContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtVoipContractsResponseData> serviceSignalmgmtVoipContractsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtVoipContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtVoipContracts</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtVoipContractsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtVoipContractsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtVoipDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtVoipDevicesAllResponseData serviceSignalmgmtVoipDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>serviceSignalmgmtVoipDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtVoipDevicesAllResponseData> serviceSignalmgmtVoipDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtVoipDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtVoipDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtVoipDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtVoipDevicesAllResponseData serviceSignalmgmtVoipDevicesAll(@Param("elid") String elid, ServiceSignalmgmtVoipDevicesAllRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtVoipDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtVoipDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtVoipDevicesAllResponseData> serviceSignalmgmtVoipDevicesAllWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtVoipDevicesAllRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtVoipDevicesAll</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtVoipDevicesAllQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtVoipDevicesAllQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtVoipFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtVoipFrameContractsResponseData serviceSignalmgmtVoipFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceSignalmgmtVoipFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtVoipFrameContractsResponseData> serviceSignalmgmtVoipFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtVoipFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtVoipFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtVoipFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtVoipFrameContractsResponseData serviceSignalmgmtVoipFrameContracts(@Param("elid") String elid, ServiceSignalmgmtVoipFrameContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtVoipFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtVoipFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtVoipFrameContractsResponseData> serviceSignalmgmtVoipFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtVoipFrameContractsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtVoipFrameContracts</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtVoipFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtVoipFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtVoipOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtVoipOrganizationsResponseData serviceSignalmgmtVoipOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceSignalmgmtVoipOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtVoipOrganizationsResponseData> serviceSignalmgmtVoipOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtVoipOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtVoipOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtVoipOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtVoipOrganizationsResponseData serviceSignalmgmtVoipOrganizations(@Param("elid") String elid, ServiceSignalmgmtVoipOrganizationsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtVoipOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtVoipOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtVoipOrganizationsResponseData> serviceSignalmgmtVoipOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtVoipOrganizationsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtVoipOrganizations</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtVoipOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtVoipOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtVoipPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtVoipPersonGroupsResponseData serviceSignalmgmtVoipPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceSignalmgmtVoipPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtVoipPersonGroupsResponseData> serviceSignalmgmtVoipPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtVoipPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtVoipPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtVoipPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtVoipPersonGroupsResponseData serviceSignalmgmtVoipPersonGroups(@Param("elid") String elid, ServiceSignalmgmtVoipPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtVoipPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtVoipPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtVoipPersonGroupsResponseData> serviceSignalmgmtVoipPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtVoipPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtVoipPersonGroups</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtVoipPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtVoipPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtVoipPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtVoipPersonsResponseData serviceSignalmgmtVoipPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceSignalmgmtVoipPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtVoipPersonsResponseData> serviceSignalmgmtVoipPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtVoipPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtVoipPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtVoipPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtVoipPersonsResponseData serviceSignalmgmtVoipPersons(@Param("elid") String elid, ServiceSignalmgmtVoipPersonsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtVoipPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtVoipPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtVoipPersonsResponseData> serviceSignalmgmtVoipPersonsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtVoipPersonsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtVoipPersons</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtVoipPersonsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtVoipPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceSignalmgmtVoipQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtVoipQueryResponse serviceSignalmgmtVoipQuery(@Param("sessionId") String sessionId, ServiceSignalmgmtVoipQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceSignalmgmtVoipQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtVoipQueryResponse> serviceSignalmgmtVoipQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceSignalmgmtVoipQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serviceSignalmgmtVoipQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtVoipQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtVoipQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtVoipQueryResponse serviceSignalmgmtVoipQuery(ServiceSignalmgmtVoipQueryRequest body, @QueryMap(encoded=true) ServiceSignalmgmtVoipQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serviceSignalmgmtVoipQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtVoipQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtVoipQueryResponse> serviceSignalmgmtVoipQueryWithHttpInfo(ServiceSignalmgmtVoipQueryRequest body, @QueryMap(encoded=true) ServiceSignalmgmtVoipQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtVoipQuery</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtVoipQueryQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtVoipQueryQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtVoipServiceMasterSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtVoipServiceMasterSignalmgmtResponseData serviceSignalmgmtVoipServiceMasterSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipServiceMasterSignalmgmtRequestData body);

  /**
   * Get relations to Service master (Signal Management) entities
   * Similar to <code>serviceSignalmgmtVoipServiceMasterSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtVoipServiceMasterSignalmgmtResponseData> serviceSignalmgmtVoipServiceMasterSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipServiceMasterSignalmgmtRequestData body);


  /**
   * Get relations to Service master (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtVoipServiceMasterSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtVoipServiceMasterSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtVoipServiceMasterSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtVoipServiceMasterSignalmgmtResponseData serviceSignalmgmtVoipServiceMasterSignalmgmt(@Param("elid") String elid, ServiceSignalmgmtVoipServiceMasterSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipServiceMasterSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service master (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtVoipServiceMasterSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtVoipServiceMasterSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/ServiceMasterSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtVoipServiceMasterSignalmgmtResponseData> serviceSignalmgmtVoipServiceMasterSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtVoipServiceMasterSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipServiceMasterSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtVoipServiceMasterSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtVoipServiceMasterSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtVoipServiceMasterSignalmgmtQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtVoipServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtVoipServicesSignalmgmtResponseData serviceSignalmgmtVoipServicesSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipServicesSignalmgmtRequestData body);

  /**
   * Get relations to Service (Signal Management) entities
   * Similar to <code>serviceSignalmgmtVoipServicesSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtVoipServicesSignalmgmtResponseData> serviceSignalmgmtVoipServicesSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipServicesSignalmgmtRequestData body);


  /**
   * Get relations to Service (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtVoipServicesSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtVoipServicesSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtVoipServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtVoipServicesSignalmgmtResponseData serviceSignalmgmtVoipServicesSignalmgmt(@Param("elid") String elid, ServiceSignalmgmtVoipServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipServicesSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtVoipServicesSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtVoipServicesSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtVoipServicesSignalmgmtResponseData> serviceSignalmgmtVoipServicesSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtVoipServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipServicesSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtVoipServicesSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtVoipServicesSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtVoipServicesSignalmgmtQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtVoipSignalPathsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtVoipSignalPathsResponseData serviceSignalmgmtVoipSignalPaths(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipSignalPathsRequestData body);

  /**
   * Get relations to Signal path entities
   * Similar to <code>serviceSignalmgmtVoipSignalPaths</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtVoipSignalPathsResponseData> serviceSignalmgmtVoipSignalPathsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipSignalPathsRequestData body);


  /**
   * Get relations to Signal path entities
   * 
   * Note, this is equivalent to the other <code>serviceSignalmgmtVoipSignalPaths</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtVoipSignalPathsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtVoipSignalPathsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/SignalPaths?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtVoipSignalPathsResponseData serviceSignalmgmtVoipSignalPaths(@Param("elid") String elid, ServiceSignalmgmtVoipSignalPathsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipSignalPathsQueryParams queryParams);

  /**
  * Get relations to Signal path entities
  * 
  * Note, this is equivalent to the other <code>serviceSignalmgmtVoipSignalPaths</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtVoipSignalPathsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/SignalPaths?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtVoipSignalPathsResponseData> serviceSignalmgmtVoipSignalPathsWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtVoipSignalPathsRequestData body, @QueryMap(encoded=true) ServiceSignalmgmtVoipSignalPathsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtVoipSignalPaths</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtVoipSignalPathsQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtVoipSignalPathsQueryParams sessionId(final String value) {
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
   * @return ServiceSignalmgmtVoipSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceSignalmgmtVoipSystemAttributesResponse serviceSignalmgmtVoipSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceSignalmgmtVoipSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceSignalmgmtVoipSystemAttributesResponse> serviceSignalmgmtVoipSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceSignalmgmtVoipSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serviceSignalmgmtVoipSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceSignalmgmtVoipSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceSignalmgmtVoipSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceSignalmgmtVoipSystemAttributesResponse serviceSignalmgmtVoipSystemAttributes(@Param("elid") String elid, ServiceSignalmgmtVoipSystemAttributesRequest body, @QueryMap(encoded=true) ServiceSignalmgmtVoipSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serviceSignalmgmtVoipSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceSignalmgmtVoipSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceSignalmgmtVoipSystemAttributesResponse> serviceSignalmgmtVoipSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceSignalmgmtVoipSystemAttributesRequest body, @QueryMap(encoded=true) ServiceSignalmgmtVoipSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceSignalmgmtVoipSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceSignalmgmtVoipSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceSignalmgmtVoipSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateServiceSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceSignalmgmtVoipResponse updateServiceSignalmgmtVoip(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceSignalmgmtVoipRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceSignalmgmtVoip</code> but it also returns the http response headers .
   * Modify Service
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceSignalmgmtVoipResponse> updateServiceSignalmgmtVoipWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceSignalmgmtVoipRequestData body);


  /**
   * Modify
   * Modify Service
   * Note, this is equivalent to the other <code>updateServiceSignalmgmtVoip</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceSignalmgmtVoipQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceSignalmgmtVoipResponse updateServiceSignalmgmtVoip(@Param("elid") String elid, UpdateServiceSignalmgmtVoipRequestData body, @QueryMap(encoded=true) UpdateServiceSignalmgmtVoipQueryParams queryParams);

  /**
  * Modify
  * Modify Service
  * Note, this is equivalent to the other <code>updateServiceSignalmgmtVoip</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceSignalmgmtVoipResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceSignalmgmtVoipResponse> updateServiceSignalmgmtVoipWithHttpInfo(@Param("elid") String elid, UpdateServiceSignalmgmtVoipRequestData body, @QueryMap(encoded=true) UpdateServiceSignalmgmtVoipQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceSignalmgmtVoip</code> method in a fluent style.
   */
  public static class UpdateServiceSignalmgmtVoipQueryParams extends HashMap<String, Object> {
    public UpdateServiceSignalmgmtVoipQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServiceSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceSignalmgmtVoipResponse updateSystemAttributesServiceSignalmgmtVoip(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtVoipRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceSignalmgmtVoip</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceSignalmgmtVoipResponse> updateSystemAttributesServiceSignalmgmtVoipWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtVoipRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceSignalmgmtVoip</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceSignalmgmtVoipQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceSignalmgmtVoipResponse updateSystemAttributesServiceSignalmgmtVoip(@Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtVoipRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceSignalmgmtVoipQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceSignalmgmtVoip</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceSignalmgmtVoipResponse
      */
      @RequestLine("POST /api/rest/entity/serviceSignalmgmtVoip/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceSignalmgmtVoipResponse> updateSystemAttributesServiceSignalmgmtVoipWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceSignalmgmtVoipRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceSignalmgmtVoipQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceSignalmgmtVoip</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceSignalmgmtVoipQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceSignalmgmtVoipQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
