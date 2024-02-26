package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceMasterSignalmgmtLanRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceMasterSignalmgmtLanResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceMasterSignalmgmtLanRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceMasterSignalmgmtLanResponse;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtLanCableMasterDataCableRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtLanCableMasterDataCableResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtLanDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtLanDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtLanQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtLanQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtLanServicesSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtLanServicesSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtLanSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtLanSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceMasterSignalmgmtLanRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceMasterSignalmgmtLanResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceMasterSignalmgmtLanApi extends ApiClient.Api {


  /**
   * Create
   * Create Service master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceMasterSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceMasterSignalmgmtLanResponse createServiceMasterSignalmgmtLan(@Param("sessionId") String sessionId, CreateServiceMasterSignalmgmtLanRequestData body);

  /**
   * Create
   * Similar to <code>createServiceMasterSignalmgmtLan</code> but it also returns the http response headers .
   * Create Service master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceMasterSignalmgmtLanResponse> createServiceMasterSignalmgmtLanWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceMasterSignalmgmtLanRequestData body);


  /**
   * Create
   * Create Service master
   * Note, this is equivalent to the other <code>createServiceMasterSignalmgmtLan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceMasterSignalmgmtLanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceMasterSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceMasterSignalmgmtLanResponse createServiceMasterSignalmgmtLan(CreateServiceMasterSignalmgmtLanRequestData body, @QueryMap(encoded=true) CreateServiceMasterSignalmgmtLanQueryParams queryParams);

  /**
  * Create
  * Create Service master
  * Note, this is equivalent to the other <code>createServiceMasterSignalmgmtLan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceMasterSignalmgmtLanResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceMasterSignalmgmtLanResponse> createServiceMasterSignalmgmtLanWithHttpInfo(CreateServiceMasterSignalmgmtLanRequestData body, @QueryMap(encoded=true) CreateServiceMasterSignalmgmtLanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceMasterSignalmgmtLan</code> method in a fluent style.
   */
  public static class CreateServiceMasterSignalmgmtLanQueryParams extends HashMap<String, Object> {
    public CreateServiceMasterSignalmgmtLanQueryParams sessionId(final String value) {
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
   * @return DeleteServiceMasterSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceMasterSignalmgmtLanResponse deleteServiceMasterSignalmgmtLan(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceMasterSignalmgmtLanRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceMasterSignalmgmtLan</code> but it also returns the http response headers .
   * Delete Service master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceMasterSignalmgmtLanResponse> deleteServiceMasterSignalmgmtLanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceMasterSignalmgmtLanRequestData body);


  /**
   * Delete
   * Delete Service master
   * Note, this is equivalent to the other <code>deleteServiceMasterSignalmgmtLan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceMasterSignalmgmtLanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceMasterSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceMasterSignalmgmtLanResponse deleteServiceMasterSignalmgmtLan(@Param("elid") String elid, DeleteServiceMasterSignalmgmtLanRequestData body, @QueryMap(encoded=true) DeleteServiceMasterSignalmgmtLanQueryParams queryParams);

  /**
  * Delete
  * Delete Service master
  * Note, this is equivalent to the other <code>deleteServiceMasterSignalmgmtLan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceMasterSignalmgmtLanResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceMasterSignalmgmtLanResponse> deleteServiceMasterSignalmgmtLanWithHttpInfo(@Param("elid") String elid, DeleteServiceMasterSignalmgmtLanRequestData body, @QueryMap(encoded=true) DeleteServiceMasterSignalmgmtLanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceMasterSignalmgmtLan</code> method in a fluent style.
   */
  public static class DeleteServiceMasterSignalmgmtLanQueryParams extends HashMap<String, Object> {
    public DeleteServiceMasterSignalmgmtLanQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtLanCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtLanCableMasterDataCableResponseData serviceMasterSignalmgmtLanCableMasterDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtLanCableMasterDataCableRequestData body);

  /**
   * Get relations to Cable master Data cable entities
   * Similar to <code>serviceMasterSignalmgmtLanCableMasterDataCable</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtLanCableMasterDataCableResponseData> serviceMasterSignalmgmtLanCableMasterDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtLanCableMasterDataCableRequestData body);


  /**
   * Get relations to Cable master Data cable entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtLanCableMasterDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtLanCableMasterDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtLanCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtLanCableMasterDataCableResponseData serviceMasterSignalmgmtLanCableMasterDataCable(@Param("elid") String elid, ServiceMasterSignalmgmtLanCableMasterDataCableRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtLanCableMasterDataCableQueryParams queryParams);

  /**
  * Get relations to Cable master Data cable entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtLanCableMasterDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtLanCableMasterDataCableResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/CableMasterDataCable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtLanCableMasterDataCableResponseData> serviceMasterSignalmgmtLanCableMasterDataCableWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtLanCableMasterDataCableRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtLanCableMasterDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtLanCableMasterDataCable</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtLanCableMasterDataCableQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtLanCableMasterDataCableQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtLanDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtLanDeviceMasterResponseData serviceMasterSignalmgmtLanDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtLanDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>serviceMasterSignalmgmtLanDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtLanDeviceMasterResponseData> serviceMasterSignalmgmtLanDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtLanDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtLanDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtLanDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtLanDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtLanDeviceMasterResponseData serviceMasterSignalmgmtLanDeviceMaster(@Param("elid") String elid, ServiceMasterSignalmgmtLanDeviceMasterRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtLanDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtLanDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtLanDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtLanDeviceMasterResponseData> serviceMasterSignalmgmtLanDeviceMasterWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtLanDeviceMasterRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtLanDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtLanDeviceMaster</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtLanDeviceMasterQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtLanDeviceMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceMasterSignalmgmtLanQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtLanQueryResponse serviceMasterSignalmgmtLanQuery(@Param("sessionId") String sessionId, ServiceMasterSignalmgmtLanQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceMasterSignalmgmtLanQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtLanQueryResponse> serviceMasterSignalmgmtLanQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceMasterSignalmgmtLanQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtLanQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtLanQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtLanQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtLanQueryResponse serviceMasterSignalmgmtLanQuery(ServiceMasterSignalmgmtLanQueryRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtLanQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtLanQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtLanQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtLanQueryResponse> serviceMasterSignalmgmtLanQueryWithHttpInfo(ServiceMasterSignalmgmtLanQueryRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtLanQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtLanQuery</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtLanQueryQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtLanQueryQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtLanServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtLanServicesSignalmgmtResponseData serviceMasterSignalmgmtLanServicesSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtLanServicesSignalmgmtRequestData body);

  /**
   * Get relations to Service (Signal Management) entities
   * Similar to <code>serviceMasterSignalmgmtLanServicesSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtLanServicesSignalmgmtResponseData> serviceMasterSignalmgmtLanServicesSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtLanServicesSignalmgmtRequestData body);


  /**
   * Get relations to Service (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtLanServicesSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtLanServicesSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtLanServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtLanServicesSignalmgmtResponseData serviceMasterSignalmgmtLanServicesSignalmgmt(@Param("elid") String elid, ServiceMasterSignalmgmtLanServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtLanServicesSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtLanServicesSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtLanServicesSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtLanServicesSignalmgmtResponseData> serviceMasterSignalmgmtLanServicesSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtLanServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtLanServicesSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtLanServicesSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtLanServicesSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtLanServicesSignalmgmtQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtLanSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtLanSystemAttributesResponse serviceMasterSignalmgmtLanSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtLanSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceMasterSignalmgmtLanSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtLanSystemAttributesResponse> serviceMasterSignalmgmtLanSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtLanSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtLanSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtLanSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtLanSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtLanSystemAttributesResponse serviceMasterSignalmgmtLanSystemAttributes(@Param("elid") String elid, ServiceMasterSignalmgmtLanSystemAttributesRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtLanSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtLanSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtLanSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtLanSystemAttributesResponse> serviceMasterSignalmgmtLanSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtLanSystemAttributesRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtLanSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtLanSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtLanSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtLanSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateServiceMasterSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceMasterSignalmgmtLanResponse updateServiceMasterSignalmgmtLan(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceMasterSignalmgmtLanRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceMasterSignalmgmtLan</code> but it also returns the http response headers .
   * Modify Service master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceMasterSignalmgmtLanResponse> updateServiceMasterSignalmgmtLanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceMasterSignalmgmtLanRequestData body);


  /**
   * Modify
   * Modify Service master
   * Note, this is equivalent to the other <code>updateServiceMasterSignalmgmtLan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceMasterSignalmgmtLanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceMasterSignalmgmtLanResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceMasterSignalmgmtLanResponse updateServiceMasterSignalmgmtLan(@Param("elid") String elid, UpdateServiceMasterSignalmgmtLanRequestData body, @QueryMap(encoded=true) UpdateServiceMasterSignalmgmtLanQueryParams queryParams);

  /**
  * Modify
  * Modify Service master
  * Note, this is equivalent to the other <code>updateServiceMasterSignalmgmtLan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceMasterSignalmgmtLanResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtLan/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceMasterSignalmgmtLanResponse> updateServiceMasterSignalmgmtLanWithHttpInfo(@Param("elid") String elid, UpdateServiceMasterSignalmgmtLanRequestData body, @QueryMap(encoded=true) UpdateServiceMasterSignalmgmtLanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceMasterSignalmgmtLan</code> method in a fluent style.
   */
  public static class UpdateServiceMasterSignalmgmtLanQueryParams extends HashMap<String, Object> {
    public UpdateServiceMasterSignalmgmtLanQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
