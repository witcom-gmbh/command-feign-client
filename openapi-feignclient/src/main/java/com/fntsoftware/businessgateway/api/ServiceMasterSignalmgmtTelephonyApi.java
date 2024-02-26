package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceMasterSignalmgmtTelephonyRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceMasterSignalmgmtTelephonyResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceMasterSignalmgmtTelephonyRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceMasterSignalmgmtTelephonyResponse;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtTelephonyCableMasterDataCableRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtTelephonyCableMasterDataCableResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtTelephonyDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtTelephonyDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtTelephonyQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtTelephonyQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtTelephonyServicesSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtTelephonyServicesSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtTelephonySystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtTelephonySystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceMasterSignalmgmtTelephonyRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceMasterSignalmgmtTelephonyResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceMasterSignalmgmtTelephonyApi extends ApiClient.Api {


  /**
   * Create
   * Create Service master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceMasterSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceMasterSignalmgmtTelephonyResponse createServiceMasterSignalmgmtTelephony(@Param("sessionId") String sessionId, CreateServiceMasterSignalmgmtTelephonyRequestData body);

  /**
   * Create
   * Similar to <code>createServiceMasterSignalmgmtTelephony</code> but it also returns the http response headers .
   * Create Service master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceMasterSignalmgmtTelephonyResponse> createServiceMasterSignalmgmtTelephonyWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceMasterSignalmgmtTelephonyRequestData body);


  /**
   * Create
   * Create Service master
   * Note, this is equivalent to the other <code>createServiceMasterSignalmgmtTelephony</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceMasterSignalmgmtTelephonyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceMasterSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceMasterSignalmgmtTelephonyResponse createServiceMasterSignalmgmtTelephony(CreateServiceMasterSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) CreateServiceMasterSignalmgmtTelephonyQueryParams queryParams);

  /**
  * Create
  * Create Service master
  * Note, this is equivalent to the other <code>createServiceMasterSignalmgmtTelephony</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceMasterSignalmgmtTelephonyResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceMasterSignalmgmtTelephonyResponse> createServiceMasterSignalmgmtTelephonyWithHttpInfo(CreateServiceMasterSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) CreateServiceMasterSignalmgmtTelephonyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceMasterSignalmgmtTelephony</code> method in a fluent style.
   */
  public static class CreateServiceMasterSignalmgmtTelephonyQueryParams extends HashMap<String, Object> {
    public CreateServiceMasterSignalmgmtTelephonyQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Service master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServiceMasterSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceMasterSignalmgmtTelephonyResponse deleteServiceMasterSignalmgmtTelephony(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceMasterSignalmgmtTelephonyRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceMasterSignalmgmtTelephony</code> but it also returns the http response headers .
   * Delete Service master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceMasterSignalmgmtTelephonyResponse> deleteServiceMasterSignalmgmtTelephonyWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceMasterSignalmgmtTelephonyRequestData body);


  /**
   * Delete
   * Delete Service master
   * Note, this is equivalent to the other <code>deleteServiceMasterSignalmgmtTelephony</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceMasterSignalmgmtTelephonyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceMasterSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceMasterSignalmgmtTelephonyResponse deleteServiceMasterSignalmgmtTelephony(@Param("elid") String elid, DeleteServiceMasterSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) DeleteServiceMasterSignalmgmtTelephonyQueryParams queryParams);

  /**
  * Delete
  * Delete Service master
  * Note, this is equivalent to the other <code>deleteServiceMasterSignalmgmtTelephony</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceMasterSignalmgmtTelephonyResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceMasterSignalmgmtTelephonyResponse> deleteServiceMasterSignalmgmtTelephonyWithHttpInfo(@Param("elid") String elid, DeleteServiceMasterSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) DeleteServiceMasterSignalmgmtTelephonyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceMasterSignalmgmtTelephony</code> method in a fluent style.
   */
  public static class DeleteServiceMasterSignalmgmtTelephonyQueryParams extends HashMap<String, Object> {
    public DeleteServiceMasterSignalmgmtTelephonyQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Cable master Data cable entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceMasterSignalmgmtTelephonyCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtTelephonyCableMasterDataCableResponseData serviceMasterSignalmgmtTelephonyCableMasterDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtTelephonyCableMasterDataCableRequestData body);

  /**
   * Get relations to Cable master Data cable entities
   * Similar to <code>serviceMasterSignalmgmtTelephonyCableMasterDataCable</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtTelephonyCableMasterDataCableResponseData> serviceMasterSignalmgmtTelephonyCableMasterDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtTelephonyCableMasterDataCableRequestData body);


  /**
   * Get relations to Cable master Data cable entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtTelephonyCableMasterDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtTelephonyCableMasterDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtTelephonyCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtTelephonyCableMasterDataCableResponseData serviceMasterSignalmgmtTelephonyCableMasterDataCable(@Param("elid") String elid, ServiceMasterSignalmgmtTelephonyCableMasterDataCableRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtTelephonyCableMasterDataCableQueryParams queryParams);

  /**
  * Get relations to Cable master Data cable entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtTelephonyCableMasterDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtTelephonyCableMasterDataCableResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/CableMasterDataCable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtTelephonyCableMasterDataCableResponseData> serviceMasterSignalmgmtTelephonyCableMasterDataCableWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtTelephonyCableMasterDataCableRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtTelephonyCableMasterDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtTelephonyCableMasterDataCable</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtTelephonyCableMasterDataCableQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtTelephonyCableMasterDataCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device master entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceMasterSignalmgmtTelephonyDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtTelephonyDeviceMasterResponseData serviceMasterSignalmgmtTelephonyDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtTelephonyDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>serviceMasterSignalmgmtTelephonyDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtTelephonyDeviceMasterResponseData> serviceMasterSignalmgmtTelephonyDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtTelephonyDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtTelephonyDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtTelephonyDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtTelephonyDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtTelephonyDeviceMasterResponseData serviceMasterSignalmgmtTelephonyDeviceMaster(@Param("elid") String elid, ServiceMasterSignalmgmtTelephonyDeviceMasterRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtTelephonyDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtTelephonyDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtTelephonyDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtTelephonyDeviceMasterResponseData> serviceMasterSignalmgmtTelephonyDeviceMasterWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtTelephonyDeviceMasterRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtTelephonyDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtTelephonyDeviceMaster</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtTelephonyDeviceMasterQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtTelephonyDeviceMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceMasterSignalmgmtTelephonyQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtTelephonyQueryResponse serviceMasterSignalmgmtTelephonyQuery(@Param("sessionId") String sessionId, ServiceMasterSignalmgmtTelephonyQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceMasterSignalmgmtTelephonyQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtTelephonyQueryResponse> serviceMasterSignalmgmtTelephonyQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceMasterSignalmgmtTelephonyQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtTelephonyQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtTelephonyQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtTelephonyQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtTelephonyQueryResponse serviceMasterSignalmgmtTelephonyQuery(ServiceMasterSignalmgmtTelephonyQueryRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtTelephonyQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtTelephonyQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtTelephonyQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtTelephonyQueryResponse> serviceMasterSignalmgmtTelephonyQueryWithHttpInfo(ServiceMasterSignalmgmtTelephonyQueryRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtTelephonyQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtTelephonyQuery</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtTelephonyQueryQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtTelephonyQueryQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtTelephonyServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtTelephonyServicesSignalmgmtResponseData serviceMasterSignalmgmtTelephonyServicesSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtTelephonyServicesSignalmgmtRequestData body);

  /**
   * Get relations to Service (Signal Management) entities
   * Similar to <code>serviceMasterSignalmgmtTelephonyServicesSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtTelephonyServicesSignalmgmtResponseData> serviceMasterSignalmgmtTelephonyServicesSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtTelephonyServicesSignalmgmtRequestData body);


  /**
   * Get relations to Service (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtTelephonyServicesSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtTelephonyServicesSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtTelephonyServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtTelephonyServicesSignalmgmtResponseData serviceMasterSignalmgmtTelephonyServicesSignalmgmt(@Param("elid") String elid, ServiceMasterSignalmgmtTelephonyServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtTelephonyServicesSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtTelephonyServicesSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtTelephonyServicesSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtTelephonyServicesSignalmgmtResponseData> serviceMasterSignalmgmtTelephonyServicesSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtTelephonyServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtTelephonyServicesSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtTelephonyServicesSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtTelephonyServicesSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtTelephonyServicesSignalmgmtQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtTelephonySystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtTelephonySystemAttributesResponse serviceMasterSignalmgmtTelephonySystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtTelephonySystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceMasterSignalmgmtTelephonySystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtTelephonySystemAttributesResponse> serviceMasterSignalmgmtTelephonySystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtTelephonySystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtTelephonySystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtTelephonySystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtTelephonySystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtTelephonySystemAttributesResponse serviceMasterSignalmgmtTelephonySystemAttributes(@Param("elid") String elid, ServiceMasterSignalmgmtTelephonySystemAttributesRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtTelephonySystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtTelephonySystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtTelephonySystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtTelephonySystemAttributesResponse> serviceMasterSignalmgmtTelephonySystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtTelephonySystemAttributesRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtTelephonySystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtTelephonySystemAttributes</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtTelephonySystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtTelephonySystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Service master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateServiceMasterSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceMasterSignalmgmtTelephonyResponse updateServiceMasterSignalmgmtTelephony(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceMasterSignalmgmtTelephonyRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceMasterSignalmgmtTelephony</code> but it also returns the http response headers .
   * Modify Service master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceMasterSignalmgmtTelephonyResponse> updateServiceMasterSignalmgmtTelephonyWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceMasterSignalmgmtTelephonyRequestData body);


  /**
   * Modify
   * Modify Service master
   * Note, this is equivalent to the other <code>updateServiceMasterSignalmgmtTelephony</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceMasterSignalmgmtTelephonyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceMasterSignalmgmtTelephonyResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceMasterSignalmgmtTelephonyResponse updateServiceMasterSignalmgmtTelephony(@Param("elid") String elid, UpdateServiceMasterSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) UpdateServiceMasterSignalmgmtTelephonyQueryParams queryParams);

  /**
  * Modify
  * Modify Service master
  * Note, this is equivalent to the other <code>updateServiceMasterSignalmgmtTelephony</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceMasterSignalmgmtTelephonyResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtTelephony/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceMasterSignalmgmtTelephonyResponse> updateServiceMasterSignalmgmtTelephonyWithHttpInfo(@Param("elid") String elid, UpdateServiceMasterSignalmgmtTelephonyRequestData body, @QueryMap(encoded=true) UpdateServiceMasterSignalmgmtTelephonyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceMasterSignalmgmtTelephony</code> method in a fluent style.
   */
  public static class UpdateServiceMasterSignalmgmtTelephonyQueryParams extends HashMap<String, Object> {
    public UpdateServiceMasterSignalmgmtTelephonyQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
