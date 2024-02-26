package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceMasterSignalmgmtVoipRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceMasterSignalmgmtVoipResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceMasterSignalmgmtVoipRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceMasterSignalmgmtVoipResponse;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtVoipCableMasterDataCableRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtVoipCableMasterDataCableResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtVoipDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtVoipDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtVoipQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtVoipQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtVoipServicesSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtVoipServicesSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtVoipSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtVoipSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceMasterSignalmgmtVoipRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceMasterSignalmgmtVoipResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceMasterSignalmgmtVoipApi extends ApiClient.Api {


  /**
   * Create
   * Create Service master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceMasterSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceMasterSignalmgmtVoipResponse createServiceMasterSignalmgmtVoip(@Param("sessionId") String sessionId, CreateServiceMasterSignalmgmtVoipRequestData body);

  /**
   * Create
   * Similar to <code>createServiceMasterSignalmgmtVoip</code> but it also returns the http response headers .
   * Create Service master
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceMasterSignalmgmtVoipResponse> createServiceMasterSignalmgmtVoipWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceMasterSignalmgmtVoipRequestData body);


  /**
   * Create
   * Create Service master
   * Note, this is equivalent to the other <code>createServiceMasterSignalmgmtVoip</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceMasterSignalmgmtVoipQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceMasterSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceMasterSignalmgmtVoipResponse createServiceMasterSignalmgmtVoip(CreateServiceMasterSignalmgmtVoipRequestData body, @QueryMap(encoded=true) CreateServiceMasterSignalmgmtVoipQueryParams queryParams);

  /**
  * Create
  * Create Service master
  * Note, this is equivalent to the other <code>createServiceMasterSignalmgmtVoip</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceMasterSignalmgmtVoipResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceMasterSignalmgmtVoipResponse> createServiceMasterSignalmgmtVoipWithHttpInfo(CreateServiceMasterSignalmgmtVoipRequestData body, @QueryMap(encoded=true) CreateServiceMasterSignalmgmtVoipQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceMasterSignalmgmtVoip</code> method in a fluent style.
   */
  public static class CreateServiceMasterSignalmgmtVoipQueryParams extends HashMap<String, Object> {
    public CreateServiceMasterSignalmgmtVoipQueryParams sessionId(final String value) {
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
   * @return DeleteServiceMasterSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceMasterSignalmgmtVoipResponse deleteServiceMasterSignalmgmtVoip(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceMasterSignalmgmtVoipRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceMasterSignalmgmtVoip</code> but it also returns the http response headers .
   * Delete Service master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceMasterSignalmgmtVoipResponse> deleteServiceMasterSignalmgmtVoipWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceMasterSignalmgmtVoipRequestData body);


  /**
   * Delete
   * Delete Service master
   * Note, this is equivalent to the other <code>deleteServiceMasterSignalmgmtVoip</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceMasterSignalmgmtVoipQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceMasterSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceMasterSignalmgmtVoipResponse deleteServiceMasterSignalmgmtVoip(@Param("elid") String elid, DeleteServiceMasterSignalmgmtVoipRequestData body, @QueryMap(encoded=true) DeleteServiceMasterSignalmgmtVoipQueryParams queryParams);

  /**
  * Delete
  * Delete Service master
  * Note, this is equivalent to the other <code>deleteServiceMasterSignalmgmtVoip</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceMasterSignalmgmtVoipResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceMasterSignalmgmtVoipResponse> deleteServiceMasterSignalmgmtVoipWithHttpInfo(@Param("elid") String elid, DeleteServiceMasterSignalmgmtVoipRequestData body, @QueryMap(encoded=true) DeleteServiceMasterSignalmgmtVoipQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceMasterSignalmgmtVoip</code> method in a fluent style.
   */
  public static class DeleteServiceMasterSignalmgmtVoipQueryParams extends HashMap<String, Object> {
    public DeleteServiceMasterSignalmgmtVoipQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtVoipCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtVoipCableMasterDataCableResponseData serviceMasterSignalmgmtVoipCableMasterDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtVoipCableMasterDataCableRequestData body);

  /**
   * Get relations to Cable master Data cable entities
   * Similar to <code>serviceMasterSignalmgmtVoipCableMasterDataCable</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtVoipCableMasterDataCableResponseData> serviceMasterSignalmgmtVoipCableMasterDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtVoipCableMasterDataCableRequestData body);


  /**
   * Get relations to Cable master Data cable entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtVoipCableMasterDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtVoipCableMasterDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtVoipCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtVoipCableMasterDataCableResponseData serviceMasterSignalmgmtVoipCableMasterDataCable(@Param("elid") String elid, ServiceMasterSignalmgmtVoipCableMasterDataCableRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtVoipCableMasterDataCableQueryParams queryParams);

  /**
  * Get relations to Cable master Data cable entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtVoipCableMasterDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtVoipCableMasterDataCableResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/CableMasterDataCable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtVoipCableMasterDataCableResponseData> serviceMasterSignalmgmtVoipCableMasterDataCableWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtVoipCableMasterDataCableRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtVoipCableMasterDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtVoipCableMasterDataCable</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtVoipCableMasterDataCableQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtVoipCableMasterDataCableQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtVoipDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtVoipDeviceMasterResponseData serviceMasterSignalmgmtVoipDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtVoipDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>serviceMasterSignalmgmtVoipDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtVoipDeviceMasterResponseData> serviceMasterSignalmgmtVoipDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtVoipDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtVoipDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtVoipDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtVoipDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtVoipDeviceMasterResponseData serviceMasterSignalmgmtVoipDeviceMaster(@Param("elid") String elid, ServiceMasterSignalmgmtVoipDeviceMasterRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtVoipDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtVoipDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtVoipDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtVoipDeviceMasterResponseData> serviceMasterSignalmgmtVoipDeviceMasterWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtVoipDeviceMasterRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtVoipDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtVoipDeviceMaster</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtVoipDeviceMasterQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtVoipDeviceMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceMasterSignalmgmtVoipQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtVoipQueryResponse serviceMasterSignalmgmtVoipQuery(@Param("sessionId") String sessionId, ServiceMasterSignalmgmtVoipQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceMasterSignalmgmtVoipQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtVoipQueryResponse> serviceMasterSignalmgmtVoipQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceMasterSignalmgmtVoipQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtVoipQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtVoipQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtVoipQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtVoipQueryResponse serviceMasterSignalmgmtVoipQuery(ServiceMasterSignalmgmtVoipQueryRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtVoipQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtVoipQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtVoipQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtVoipQueryResponse> serviceMasterSignalmgmtVoipQueryWithHttpInfo(ServiceMasterSignalmgmtVoipQueryRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtVoipQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtVoipQuery</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtVoipQueryQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtVoipQueryQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtVoipServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtVoipServicesSignalmgmtResponseData serviceMasterSignalmgmtVoipServicesSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtVoipServicesSignalmgmtRequestData body);

  /**
   * Get relations to Service (Signal Management) entities
   * Similar to <code>serviceMasterSignalmgmtVoipServicesSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtVoipServicesSignalmgmtResponseData> serviceMasterSignalmgmtVoipServicesSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtVoipServicesSignalmgmtRequestData body);


  /**
   * Get relations to Service (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtVoipServicesSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtVoipServicesSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtVoipServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtVoipServicesSignalmgmtResponseData serviceMasterSignalmgmtVoipServicesSignalmgmt(@Param("elid") String elid, ServiceMasterSignalmgmtVoipServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtVoipServicesSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtVoipServicesSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtVoipServicesSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtVoipServicesSignalmgmtResponseData> serviceMasterSignalmgmtVoipServicesSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtVoipServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtVoipServicesSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtVoipServicesSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtVoipServicesSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtVoipServicesSignalmgmtQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtVoipSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtVoipSystemAttributesResponse serviceMasterSignalmgmtVoipSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtVoipSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceMasterSignalmgmtVoipSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtVoipSystemAttributesResponse> serviceMasterSignalmgmtVoipSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtVoipSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtVoipSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtVoipSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtVoipSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtVoipSystemAttributesResponse serviceMasterSignalmgmtVoipSystemAttributes(@Param("elid") String elid, ServiceMasterSignalmgmtVoipSystemAttributesRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtVoipSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtVoipSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtVoipSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtVoipSystemAttributesResponse> serviceMasterSignalmgmtVoipSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtVoipSystemAttributesRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtVoipSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtVoipSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtVoipSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtVoipSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateServiceMasterSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceMasterSignalmgmtVoipResponse updateServiceMasterSignalmgmtVoip(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceMasterSignalmgmtVoipRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceMasterSignalmgmtVoip</code> but it also returns the http response headers .
   * Modify Service master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceMasterSignalmgmtVoipResponse> updateServiceMasterSignalmgmtVoipWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceMasterSignalmgmtVoipRequestData body);


  /**
   * Modify
   * Modify Service master
   * Note, this is equivalent to the other <code>updateServiceMasterSignalmgmtVoip</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceMasterSignalmgmtVoipQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceMasterSignalmgmtVoipResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceMasterSignalmgmtVoipResponse updateServiceMasterSignalmgmtVoip(@Param("elid") String elid, UpdateServiceMasterSignalmgmtVoipRequestData body, @QueryMap(encoded=true) UpdateServiceMasterSignalmgmtVoipQueryParams queryParams);

  /**
  * Modify
  * Modify Service master
  * Note, this is equivalent to the other <code>updateServiceMasterSignalmgmtVoip</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceMasterSignalmgmtVoipResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmtVoip/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceMasterSignalmgmtVoipResponse> updateServiceMasterSignalmgmtVoipWithHttpInfo(@Param("elid") String elid, UpdateServiceMasterSignalmgmtVoipRequestData body, @QueryMap(encoded=true) UpdateServiceMasterSignalmgmtVoipQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceMasterSignalmgmtVoip</code> method in a fluent style.
   */
  public static class UpdateServiceMasterSignalmgmtVoipQueryParams extends HashMap<String, Object> {
    public UpdateServiceMasterSignalmgmtVoipQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
