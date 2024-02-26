package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceMasterSignalmgmtFoRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceMasterSignalmgmtFoResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceMasterSignalmgmtFoRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceMasterSignalmgmtFoResponse;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtFoCableMasterDataCableRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtFoCableMasterDataCableResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtFoDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtFoDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtFoQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtFoQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtFoServicesSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtFoServicesSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtFoSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtFoSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceMasterSignalmgmtFoRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceMasterSignalmgmtFoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceMasterSignalmgmtFoApi extends ApiClient.Api {


  /**
   * Create
   * Create Service master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceMasterSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceMasterSignalmgmtFoResponse createServiceMasterSignalmgmtFo(@Param("sessionId") String sessionId, CreateServiceMasterSignalmgmtFoRequestData body);

  /**
   * Create
   * Similar to <code>createServiceMasterSignalmgmtFo</code> but it also returns the http response headers .
   * Create Service master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceMasterSignalmgmtFoResponse> createServiceMasterSignalmgmtFoWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceMasterSignalmgmtFoRequestData body);


  /**
   * Create
   * Create Service master
   * Note, this is equivalent to the other <code>createServiceMasterSignalmgmtFo</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceMasterSignalmgmtFoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceMasterSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceMasterSignalmgmtFoResponse createServiceMasterSignalmgmtFo(CreateServiceMasterSignalmgmtFoRequestData body, @QueryMap(encoded=true) CreateServiceMasterSignalmgmtFoQueryParams queryParams);

  /**
  * Create
  * Create Service master
  * Note, this is equivalent to the other <code>createServiceMasterSignalmgmtFo</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceMasterSignalmgmtFoResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceMasterSignalmgmtFoResponse> createServiceMasterSignalmgmtFoWithHttpInfo(CreateServiceMasterSignalmgmtFoRequestData body, @QueryMap(encoded=true) CreateServiceMasterSignalmgmtFoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceMasterSignalmgmtFo</code> method in a fluent style.
   */
  public static class CreateServiceMasterSignalmgmtFoQueryParams extends HashMap<String, Object> {
    public CreateServiceMasterSignalmgmtFoQueryParams sessionId(final String value) {
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
   * @return DeleteServiceMasterSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceMasterSignalmgmtFoResponse deleteServiceMasterSignalmgmtFo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceMasterSignalmgmtFoRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceMasterSignalmgmtFo</code> but it also returns the http response headers .
   * Delete Service master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceMasterSignalmgmtFoResponse> deleteServiceMasterSignalmgmtFoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceMasterSignalmgmtFoRequestData body);


  /**
   * Delete
   * Delete Service master
   * Note, this is equivalent to the other <code>deleteServiceMasterSignalmgmtFo</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceMasterSignalmgmtFoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceMasterSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceMasterSignalmgmtFoResponse deleteServiceMasterSignalmgmtFo(@Param("elid") String elid, DeleteServiceMasterSignalmgmtFoRequestData body, @QueryMap(encoded=true) DeleteServiceMasterSignalmgmtFoQueryParams queryParams);

  /**
  * Delete
  * Delete Service master
  * Note, this is equivalent to the other <code>deleteServiceMasterSignalmgmtFo</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceMasterSignalmgmtFoResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceMasterSignalmgmtFoResponse> deleteServiceMasterSignalmgmtFoWithHttpInfo(@Param("elid") String elid, DeleteServiceMasterSignalmgmtFoRequestData body, @QueryMap(encoded=true) DeleteServiceMasterSignalmgmtFoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceMasterSignalmgmtFo</code> method in a fluent style.
   */
  public static class DeleteServiceMasterSignalmgmtFoQueryParams extends HashMap<String, Object> {
    public DeleteServiceMasterSignalmgmtFoQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtFoCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtFoCableMasterDataCableResponseData serviceMasterSignalmgmtFoCableMasterDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtFoCableMasterDataCableRequestData body);

  /**
   * Get relations to Cable master Data cable entities
   * Similar to <code>serviceMasterSignalmgmtFoCableMasterDataCable</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtFoCableMasterDataCableResponseData> serviceMasterSignalmgmtFoCableMasterDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtFoCableMasterDataCableRequestData body);


  /**
   * Get relations to Cable master Data cable entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtFoCableMasterDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtFoCableMasterDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtFoCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtFoCableMasterDataCableResponseData serviceMasterSignalmgmtFoCableMasterDataCable(@Param("elid") String elid, ServiceMasterSignalmgmtFoCableMasterDataCableRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtFoCableMasterDataCableQueryParams queryParams);

  /**
  * Get relations to Cable master Data cable entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtFoCableMasterDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtFoCableMasterDataCableResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/CableMasterDataCable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtFoCableMasterDataCableResponseData> serviceMasterSignalmgmtFoCableMasterDataCableWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtFoCableMasterDataCableRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtFoCableMasterDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtFoCableMasterDataCable</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtFoCableMasterDataCableQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtFoCableMasterDataCableQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtFoDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtFoDeviceMasterResponseData serviceMasterSignalmgmtFoDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtFoDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>serviceMasterSignalmgmtFoDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtFoDeviceMasterResponseData> serviceMasterSignalmgmtFoDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtFoDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtFoDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtFoDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtFoDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtFoDeviceMasterResponseData serviceMasterSignalmgmtFoDeviceMaster(@Param("elid") String elid, ServiceMasterSignalmgmtFoDeviceMasterRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtFoDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtFoDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtFoDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtFoDeviceMasterResponseData> serviceMasterSignalmgmtFoDeviceMasterWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtFoDeviceMasterRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtFoDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtFoDeviceMaster</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtFoDeviceMasterQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtFoDeviceMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceMasterSignalmgmtFoQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtFoQueryResponse serviceMasterSignalmgmtFoQuery(@Param("sessionId") String sessionId, ServiceMasterSignalmgmtFoQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceMasterSignalmgmtFoQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtFoQueryResponse> serviceMasterSignalmgmtFoQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceMasterSignalmgmtFoQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtFoQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtFoQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtFoQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtFoQueryResponse serviceMasterSignalmgmtFoQuery(ServiceMasterSignalmgmtFoQueryRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtFoQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtFoQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtFoQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtFoQueryResponse> serviceMasterSignalmgmtFoQueryWithHttpInfo(ServiceMasterSignalmgmtFoQueryRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtFoQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtFoQuery</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtFoQueryQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtFoQueryQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtFoServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtFoServicesSignalmgmtResponseData serviceMasterSignalmgmtFoServicesSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtFoServicesSignalmgmtRequestData body);

  /**
   * Get relations to Service (Signal Management) entities
   * Similar to <code>serviceMasterSignalmgmtFoServicesSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtFoServicesSignalmgmtResponseData> serviceMasterSignalmgmtFoServicesSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtFoServicesSignalmgmtRequestData body);


  /**
   * Get relations to Service (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtFoServicesSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtFoServicesSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtFoServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtFoServicesSignalmgmtResponseData serviceMasterSignalmgmtFoServicesSignalmgmt(@Param("elid") String elid, ServiceMasterSignalmgmtFoServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtFoServicesSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtFoServicesSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtFoServicesSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtFoServicesSignalmgmtResponseData> serviceMasterSignalmgmtFoServicesSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtFoServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtFoServicesSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtFoServicesSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtFoServicesSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtFoServicesSignalmgmtQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtFoSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtFoSystemAttributesResponse serviceMasterSignalmgmtFoSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtFoSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceMasterSignalmgmtFoSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtFoSystemAttributesResponse> serviceMasterSignalmgmtFoSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtFoSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtFoSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtFoSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtFoSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtFoSystemAttributesResponse serviceMasterSignalmgmtFoSystemAttributes(@Param("elid") String elid, ServiceMasterSignalmgmtFoSystemAttributesRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtFoSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtFoSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtFoSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtFoSystemAttributesResponse> serviceMasterSignalmgmtFoSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtFoSystemAttributesRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtFoSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtFoSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtFoSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtFoSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateServiceMasterSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceMasterSignalmgmtFoResponse updateServiceMasterSignalmgmtFo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceMasterSignalmgmtFoRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceMasterSignalmgmtFo</code> but it also returns the http response headers .
   * Modify Service master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceMasterSignalmgmtFoResponse> updateServiceMasterSignalmgmtFoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceMasterSignalmgmtFoRequestData body);


  /**
   * Modify
   * Modify Service master
   * Note, this is equivalent to the other <code>updateServiceMasterSignalmgmtFo</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceMasterSignalmgmtFoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceMasterSignalmgmtFoResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceMasterSignalmgmtFoResponse updateServiceMasterSignalmgmtFo(@Param("elid") String elid, UpdateServiceMasterSignalmgmtFoRequestData body, @QueryMap(encoded=true) UpdateServiceMasterSignalmgmtFoQueryParams queryParams);

  /**
  * Modify
  * Modify Service master
  * Note, this is equivalent to the other <code>updateServiceMasterSignalmgmtFo</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceMasterSignalmgmtFoResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtFo/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceMasterSignalmgmtFoResponse> updateServiceMasterSignalmgmtFoWithHttpInfo(@Param("elid") String elid, UpdateServiceMasterSignalmgmtFoRequestData body, @QueryMap(encoded=true) UpdateServiceMasterSignalmgmtFoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceMasterSignalmgmtFo</code> method in a fluent style.
   */
  public static class UpdateServiceMasterSignalmgmtFoQueryParams extends HashMap<String, Object> {
    public UpdateServiceMasterSignalmgmtFoQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
