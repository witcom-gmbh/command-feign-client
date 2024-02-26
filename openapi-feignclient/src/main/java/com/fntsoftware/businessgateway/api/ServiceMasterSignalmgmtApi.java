package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.DeleteServiceMasterSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceMasterSignalmgmtResponse;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtCableMasterDataCableRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtCableMasterDataCableResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtServicesSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtServicesSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceMasterSignalmgmtSystemAttributesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface ServiceMasterSignalmgmtApi extends ApiClient.Api {


  /**
   * Delete
   * Delete Service master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServiceMasterSignalmgmtResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceMasterSignalmgmtResponse deleteServiceMasterSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceMasterSignalmgmtRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceMasterSignalmgmt</code> but it also returns the http response headers .
   * Delete Service master
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceMasterSignalmgmtResponse> deleteServiceMasterSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceMasterSignalmgmtRequestData body);


  /**
   * Delete
   * Delete Service master
   * Note, this is equivalent to the other <code>deleteServiceMasterSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceMasterSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceMasterSignalmgmtResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceMasterSignalmgmtResponse deleteServiceMasterSignalmgmt(@Param("elid") String elid, DeleteServiceMasterSignalmgmtRequestData body, @QueryMap(encoded=true) DeleteServiceMasterSignalmgmtQueryParams queryParams);

  /**
  * Delete
  * Delete Service master
  * Note, this is equivalent to the other <code>deleteServiceMasterSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceMasterSignalmgmtResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceMasterSignalmgmtResponse> deleteServiceMasterSignalmgmtWithHttpInfo(@Param("elid") String elid, DeleteServiceMasterSignalmgmtRequestData body, @QueryMap(encoded=true) DeleteServiceMasterSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceMasterSignalmgmt</code> method in a fluent style.
   */
  public static class DeleteServiceMasterSignalmgmtQueryParams extends HashMap<String, Object> {
    public DeleteServiceMasterSignalmgmtQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtCableMasterDataCableResponseData serviceMasterSignalmgmtCableMasterDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtCableMasterDataCableRequestData body);

  /**
   * Get relations to Cable master Data cable entities
   * Similar to <code>serviceMasterSignalmgmtCableMasterDataCable</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtCableMasterDataCableResponseData> serviceMasterSignalmgmtCableMasterDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtCableMasterDataCableRequestData body);


  /**
   * Get relations to Cable master Data cable entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtCableMasterDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtCableMasterDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtCableMasterDataCableResponseData serviceMasterSignalmgmtCableMasterDataCable(@Param("elid") String elid, ServiceMasterSignalmgmtCableMasterDataCableRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtCableMasterDataCableQueryParams queryParams);

  /**
  * Get relations to Cable master Data cable entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtCableMasterDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtCableMasterDataCableResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/CableMasterDataCable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtCableMasterDataCableResponseData> serviceMasterSignalmgmtCableMasterDataCableWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtCableMasterDataCableRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtCableMasterDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtCableMasterDataCable</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtCableMasterDataCableQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtCableMasterDataCableQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtDeviceMasterResponseData serviceMasterSignalmgmtDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>serviceMasterSignalmgmtDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtDeviceMasterResponseData> serviceMasterSignalmgmtDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtDeviceMasterResponseData serviceMasterSignalmgmtDeviceMaster(@Param("elid") String elid, ServiceMasterSignalmgmtDeviceMasterRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtDeviceMasterResponseData> serviceMasterSignalmgmtDeviceMasterWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtDeviceMasterRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtDeviceMaster</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtDeviceMasterQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtDeviceMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceMasterSignalmgmtQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtQueryResponse serviceMasterSignalmgmtQuery(@Param("sessionId") String sessionId, ServiceMasterSignalmgmtQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceMasterSignalmgmtQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtQueryResponse> serviceMasterSignalmgmtQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceMasterSignalmgmtQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtQueryResponse serviceMasterSignalmgmtQuery(ServiceMasterSignalmgmtQueryRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtQueryResponse> serviceMasterSignalmgmtQueryWithHttpInfo(ServiceMasterSignalmgmtQueryRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtQuery</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtQueryQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtQueryQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtServicesSignalmgmtResponseData serviceMasterSignalmgmtServicesSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtServicesSignalmgmtRequestData body);

  /**
   * Get relations to Service (Signal Management) entities
   * Similar to <code>serviceMasterSignalmgmtServicesSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtServicesSignalmgmtResponseData> serviceMasterSignalmgmtServicesSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtServicesSignalmgmtRequestData body);


  /**
   * Get relations to Service (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtServicesSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtServicesSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtServicesSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtServicesSignalmgmtResponseData serviceMasterSignalmgmtServicesSignalmgmt(@Param("elid") String elid, ServiceMasterSignalmgmtServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtServicesSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtServicesSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtServicesSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/ServicesSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtServicesSignalmgmtResponseData> serviceMasterSignalmgmtServicesSignalmgmtWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtServicesSignalmgmtRequestData body, @QueryMap(encoded=true) ServiceMasterSignalmgmtServicesSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtServicesSignalmgmt</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtServicesSignalmgmtQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtServicesSignalmgmtQueryParams sessionId(final String value) {
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
   * @return ServiceMasterSignalmgmtSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceMasterSignalmgmtSystemAttributesResponse serviceMasterSignalmgmtSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceMasterSignalmgmtSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceMasterSignalmgmtSystemAttributesResponse> serviceMasterSignalmgmtSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceMasterSignalmgmtSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>serviceMasterSignalmgmtSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceMasterSignalmgmtSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceMasterSignalmgmtSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceMasterSignalmgmtSystemAttributesResponse serviceMasterSignalmgmtSystemAttributes(@Param("elid") String elid, ServiceMasterSignalmgmtSystemAttributesRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>serviceMasterSignalmgmtSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceMasterSignalmgmtSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceMasterSignalmgmt/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceMasterSignalmgmtSystemAttributesResponse> serviceMasterSignalmgmtSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceMasterSignalmgmtSystemAttributesRequest body, @QueryMap(encoded=true) ServiceMasterSignalmgmtSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceMasterSignalmgmtSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceMasterSignalmgmtSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceMasterSignalmgmtSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
