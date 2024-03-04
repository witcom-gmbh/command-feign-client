package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServerfarmRequestData;
import com.fntsoftware.businessgateway.entities.CreateServerfarmResponse;
import com.fntsoftware.businessgateway.entities.DeleteServerfarmRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServerfarmResponse;
import com.fntsoftware.businessgateway.entities.Serverfarm100025RequestData;
import com.fntsoftware.businessgateway.entities.Serverfarm100025ResponseData;
import com.fntsoftware.businessgateway.entities.ServerfarmContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServerfarmContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServerfarmDatacenterRequestData;
import com.fntsoftware.businessgateway.entities.ServerfarmDatacenterResponseData;
import com.fntsoftware.businessgateway.entities.ServerfarmFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServerfarmFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServerfarmMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServerfarmMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServerfarmMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.ServerfarmMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.ServerfarmOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServerfarmOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServerfarmPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServerfarmPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServerfarmPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServerfarmPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServerfarmQueryRequest;
import com.fntsoftware.businessgateway.entities.ServerfarmQueryResponse;
import com.fntsoftware.businessgateway.entities.ServerfarmServersBaseRequestData;
import com.fntsoftware.businessgateway.entities.ServerfarmServersBaseResponseData;
import com.fntsoftware.businessgateway.entities.ServerfarmServersRequestData;
import com.fntsoftware.businessgateway.entities.ServerfarmServersResponseData;
import com.fntsoftware.businessgateway.entities.ServerfarmSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServerfarmSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ServerfarmVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.ServerfarmVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.UpdateServerfarmRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServerfarmResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServerfarmRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServerfarmResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ServerfarmApi extends ApiClient.Api {


  /**
   * Create
   * Create serverfarm
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServerfarmResponse
   */
  @RequestLine("POST /api/rest/entity/serverfarm/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServerfarmResponse createServerfarm(@Param("sessionId") String sessionId, CreateServerfarmRequestData body);

  /**
   * Create
   * Similar to <code>createServerfarm</code> but it also returns the http response headers .
   * Create serverfarm
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServerfarmResponse> createServerfarmWithHttpInfo(@Param("sessionId") String sessionId, CreateServerfarmRequestData body);


  /**
   * Create
   * Create serverfarm
   * Note, this is equivalent to the other <code>createServerfarm</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServerfarmQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServerfarmResponse
   */
  @RequestLine("POST /api/rest/entity/serverfarm/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServerfarmResponse createServerfarm(CreateServerfarmRequestData body, @QueryMap(encoded=true) CreateServerfarmQueryParams queryParams);

  /**
  * Create
  * Create serverfarm
  * Note, this is equivalent to the other <code>createServerfarm</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServerfarmResponse
      */
      @RequestLine("POST /api/rest/entity/serverfarm/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServerfarmResponse> createServerfarmWithHttpInfo(CreateServerfarmRequestData body, @QueryMap(encoded=true) CreateServerfarmQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServerfarm</code> method in a fluent style.
   */
  public static class CreateServerfarmQueryParams extends HashMap<String, Object> {
    public CreateServerfarmQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete serverfarm
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServerfarmResponse
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServerfarmResponse deleteServerfarm(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServerfarmRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServerfarm</code> but it also returns the http response headers .
   * Delete serverfarm
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServerfarmResponse> deleteServerfarmWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServerfarmRequestData body);


  /**
   * Delete
   * Delete serverfarm
   * Note, this is equivalent to the other <code>deleteServerfarm</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServerfarmQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServerfarmResponse
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServerfarmResponse deleteServerfarm(@Param("elid") String elid, DeleteServerfarmRequestData body, @QueryMap(encoded=true) DeleteServerfarmQueryParams queryParams);

  /**
  * Delete
  * Delete serverfarm
  * Note, this is equivalent to the other <code>deleteServerfarm</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServerfarmResponse
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServerfarmResponse> deleteServerfarmWithHttpInfo(@Param("elid") String elid, DeleteServerfarmRequestData body, @QueryMap(encoded=true) DeleteServerfarmQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServerfarm</code> method in a fluent style.
   */
  public static class DeleteServerfarmQueryParams extends HashMap<String, Object> {
    public DeleteServerfarmQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual Datacenter entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Serverfarm100025ResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/100025?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Serverfarm100025ResponseData serverfarm100025(@Param("sessionId") String sessionId, @Param("elid") String elid, Serverfarm100025RequestData body);

  /**
   * Get relations to Virtual Datacenter entities
   * Similar to <code>serverfarm100025</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/100025?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Serverfarm100025ResponseData> serverfarm100025WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Serverfarm100025RequestData body);


  /**
   * Get relations to Virtual Datacenter entities
   * 
   * Note, this is equivalent to the other <code>serverfarm100025</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Serverfarm100025QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Serverfarm100025ResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/100025?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Serverfarm100025ResponseData serverfarm100025(@Param("elid") String elid, Serverfarm100025RequestData body, @QueryMap(encoded=true) Serverfarm100025QueryParams queryParams);

  /**
  * Get relations to Virtual Datacenter entities
  * 
  * Note, this is equivalent to the other <code>serverfarm100025</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Serverfarm100025ResponseData
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/100025?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Serverfarm100025ResponseData> serverfarm100025WithHttpInfo(@Param("elid") String elid, Serverfarm100025RequestData body, @QueryMap(encoded=true) Serverfarm100025QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarm100025</code> method in a fluent style.
   */
  public static class Serverfarm100025QueryParams extends HashMap<String, Object> {
    public Serverfarm100025QueryParams sessionId(final String value) {
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
   * @return ServerfarmContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerfarmContractsResponseData serverfarmContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serverfarmContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerfarmContractsResponseData> serverfarmContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serverfarmContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerfarmContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerfarmContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerfarmContractsResponseData serverfarmContracts(@Param("elid") String elid, ServerfarmContractsRequestData body, @QueryMap(encoded=true) ServerfarmContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serverfarmContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerfarmContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerfarmContractsResponseData> serverfarmContractsWithHttpInfo(@Param("elid") String elid, ServerfarmContractsRequestData body, @QueryMap(encoded=true) ServerfarmContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarmContracts</code> method in a fluent style.
   */
  public static class ServerfarmContractsQueryParams extends HashMap<String, Object> {
    public ServerfarmContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Data center (vCenter) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerfarmDatacenterResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Datacenter?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerfarmDatacenterResponseData serverfarmDatacenter(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmDatacenterRequestData body);

  /**
   * Get relations to Data center (vCenter) entities
   * Similar to <code>serverfarmDatacenter</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Datacenter?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerfarmDatacenterResponseData> serverfarmDatacenterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmDatacenterRequestData body);


  /**
   * Get relations to Data center (vCenter) entities
   * 
   * Note, this is equivalent to the other <code>serverfarmDatacenter</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerfarmDatacenterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerfarmDatacenterResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Datacenter?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerfarmDatacenterResponseData serverfarmDatacenter(@Param("elid") String elid, ServerfarmDatacenterRequestData body, @QueryMap(encoded=true) ServerfarmDatacenterQueryParams queryParams);

  /**
  * Get relations to Data center (vCenter) entities
  * 
  * Note, this is equivalent to the other <code>serverfarmDatacenter</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerfarmDatacenterResponseData
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Datacenter?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerfarmDatacenterResponseData> serverfarmDatacenterWithHttpInfo(@Param("elid") String elid, ServerfarmDatacenterRequestData body, @QueryMap(encoded=true) ServerfarmDatacenterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarmDatacenter</code> method in a fluent style.
   */
  public static class ServerfarmDatacenterQueryParams extends HashMap<String, Object> {
    public ServerfarmDatacenterQueryParams sessionId(final String value) {
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
   * @return ServerfarmFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerfarmFrameContractsResponseData serverfarmFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serverfarmFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerfarmFrameContractsResponseData> serverfarmFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serverfarmFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerfarmFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerfarmFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerfarmFrameContractsResponseData serverfarmFrameContracts(@Param("elid") String elid, ServerfarmFrameContractsRequestData body, @QueryMap(encoded=true) ServerfarmFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serverfarmFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerfarmFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerfarmFrameContractsResponseData> serverfarmFrameContractsWithHttpInfo(@Param("elid") String elid, ServerfarmFrameContractsRequestData body, @QueryMap(encoded=true) ServerfarmFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarmFrameContracts</code> method in a fluent style.
   */
  public static class ServerfarmFrameContractsQueryParams extends HashMap<String, Object> {
    public ServerfarmFrameContractsQueryParams sessionId(final String value) {
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
   * @return ServerfarmMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerfarmMaintenanceContractsResponseData serverfarmMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serverfarmMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerfarmMaintenanceContractsResponseData> serverfarmMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serverfarmMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerfarmMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerfarmMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerfarmMaintenanceContractsResponseData serverfarmMaintenanceContracts(@Param("elid") String elid, ServerfarmMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServerfarmMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serverfarmMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerfarmMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerfarmMaintenanceContractsResponseData> serverfarmMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServerfarmMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServerfarmMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarmMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServerfarmMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServerfarmMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Maintenance window entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerfarmMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerfarmMaintenanceWindowsResponseData serverfarmMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>serverfarmMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerfarmMaintenanceWindowsResponseData> serverfarmMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>serverfarmMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerfarmMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerfarmMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerfarmMaintenanceWindowsResponseData serverfarmMaintenanceWindows(@Param("elid") String elid, ServerfarmMaintenanceWindowsRequestData body, @QueryMap(encoded=true) ServerfarmMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>serverfarmMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerfarmMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerfarmMaintenanceWindowsResponseData> serverfarmMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, ServerfarmMaintenanceWindowsRequestData body, @QueryMap(encoded=true) ServerfarmMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarmMaintenanceWindows</code> method in a fluent style.
   */
  public static class ServerfarmMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public ServerfarmMaintenanceWindowsQueryParams sessionId(final String value) {
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
   * @return ServerfarmOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerfarmOrganizationsResponseData serverfarmOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serverfarmOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerfarmOrganizationsResponseData> serverfarmOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serverfarmOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerfarmOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerfarmOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerfarmOrganizationsResponseData serverfarmOrganizations(@Param("elid") String elid, ServerfarmOrganizationsRequestData body, @QueryMap(encoded=true) ServerfarmOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serverfarmOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerfarmOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerfarmOrganizationsResponseData> serverfarmOrganizationsWithHttpInfo(@Param("elid") String elid, ServerfarmOrganizationsRequestData body, @QueryMap(encoded=true) ServerfarmOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarmOrganizations</code> method in a fluent style.
   */
  public static class ServerfarmOrganizationsQueryParams extends HashMap<String, Object> {
    public ServerfarmOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServerfarmPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerfarmPersonGroupsResponseData serverfarmPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serverfarmPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerfarmPersonGroupsResponseData> serverfarmPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serverfarmPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerfarmPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerfarmPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerfarmPersonGroupsResponseData serverfarmPersonGroups(@Param("elid") String elid, ServerfarmPersonGroupsRequestData body, @QueryMap(encoded=true) ServerfarmPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serverfarmPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerfarmPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerfarmPersonGroupsResponseData> serverfarmPersonGroupsWithHttpInfo(@Param("elid") String elid, ServerfarmPersonGroupsRequestData body, @QueryMap(encoded=true) ServerfarmPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarmPersonGroups</code> method in a fluent style.
   */
  public static class ServerfarmPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServerfarmPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServerfarmPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerfarmPersonsResponseData serverfarmPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serverfarmPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerfarmPersonsResponseData> serverfarmPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serverfarmPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerfarmPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerfarmPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerfarmPersonsResponseData serverfarmPersons(@Param("elid") String elid, ServerfarmPersonsRequestData body, @QueryMap(encoded=true) ServerfarmPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serverfarmPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerfarmPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerfarmPersonsResponseData> serverfarmPersonsWithHttpInfo(@Param("elid") String elid, ServerfarmPersonsRequestData body, @QueryMap(encoded=true) ServerfarmPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarmPersons</code> method in a fluent style.
   */
  public static class ServerfarmPersonsQueryParams extends HashMap<String, Object> {
    public ServerfarmPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServerfarmQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serverfarm/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerfarmQueryResponse serverfarmQuery(@Param("sessionId") String sessionId, ServerfarmQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serverfarmQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerfarmQueryResponse> serverfarmQueryWithHttpInfo(@Param("sessionId") String sessionId, ServerfarmQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>serverfarmQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerfarmQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerfarmQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serverfarm/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerfarmQueryResponse serverfarmQuery(ServerfarmQueryRequest body, @QueryMap(encoded=true) ServerfarmQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>serverfarmQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerfarmQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serverfarm/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerfarmQueryResponse> serverfarmQueryWithHttpInfo(ServerfarmQueryRequest body, @QueryMap(encoded=true) ServerfarmQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarmQuery</code> method in a fluent style.
   */
  public static class ServerfarmQueryQueryParams extends HashMap<String, Object> {
    public ServerfarmQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerfarmServersResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerfarmServersResponseData serverfarmServers(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmServersRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>serverfarmServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Servers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerfarmServersResponseData> serverfarmServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmServersRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>serverfarmServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerfarmServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerfarmServersResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Servers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerfarmServersResponseData serverfarmServers(@Param("elid") String elid, ServerfarmServersRequestData body, @QueryMap(encoded=true) ServerfarmServersQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>serverfarmServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerfarmServersResponseData
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/Servers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerfarmServersResponseData> serverfarmServersWithHttpInfo(@Param("elid") String elid, ServerfarmServersRequestData body, @QueryMap(encoded=true) ServerfarmServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarmServers</code> method in a fluent style.
   */
  public static class ServerfarmServersQueryParams extends HashMap<String, Object> {
    public ServerfarmServersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Server (base) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerfarmServersBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/ServersBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerfarmServersBaseResponseData serverfarmServersBase(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmServersBaseRequestData body);

  /**
   * Get relations to Server (base) entities
   * Similar to <code>serverfarmServersBase</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/ServersBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerfarmServersBaseResponseData> serverfarmServersBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmServersBaseRequestData body);


  /**
   * Get relations to Server (base) entities
   * 
   * Note, this is equivalent to the other <code>serverfarmServersBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerfarmServersBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerfarmServersBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/ServersBase?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerfarmServersBaseResponseData serverfarmServersBase(@Param("elid") String elid, ServerfarmServersBaseRequestData body, @QueryMap(encoded=true) ServerfarmServersBaseQueryParams queryParams);

  /**
  * Get relations to Server (base) entities
  * 
  * Note, this is equivalent to the other <code>serverfarmServersBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerfarmServersBaseResponseData
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/ServersBase?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerfarmServersBaseResponseData> serverfarmServersBaseWithHttpInfo(@Param("elid") String elid, ServerfarmServersBaseRequestData body, @QueryMap(encoded=true) ServerfarmServersBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarmServersBase</code> method in a fluent style.
   */
  public static class ServerfarmServersBaseQueryParams extends HashMap<String, Object> {
    public ServerfarmServersBaseQueryParams sessionId(final String value) {
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
   * @return ServerfarmSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerfarmSystemAttributesResponse serverfarmSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serverfarmSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerfarmSystemAttributesResponse> serverfarmSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>serverfarmSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerfarmSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerfarmSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerfarmSystemAttributesResponse serverfarmSystemAttributes(@Param("elid") String elid, ServerfarmSystemAttributesRequest body, @QueryMap(encoded=true) ServerfarmSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>serverfarmSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerfarmSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerfarmSystemAttributesResponse> serverfarmSystemAttributesWithHttpInfo(@Param("elid") String elid, ServerfarmSystemAttributesRequest body, @QueryMap(encoded=true) ServerfarmSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarmSystemAttributes</code> method in a fluent style.
   */
  public static class ServerfarmSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServerfarmSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServerfarmVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServerfarmVirtualServersResponseData serverfarmVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>serverfarmVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServerfarmVirtualServersResponseData> serverfarmVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServerfarmVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>serverfarmVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServerfarmVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServerfarmVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServerfarmVirtualServersResponseData serverfarmVirtualServers(@Param("elid") String elid, ServerfarmVirtualServersRequestData body, @QueryMap(encoded=true) ServerfarmVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>serverfarmVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServerfarmVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServerfarmVirtualServersResponseData> serverfarmVirtualServersWithHttpInfo(@Param("elid") String elid, ServerfarmVirtualServersRequestData body, @QueryMap(encoded=true) ServerfarmVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serverfarmVirtualServers</code> method in a fluent style.
   */
  public static class ServerfarmVirtualServersQueryParams extends HashMap<String, Object> {
    public ServerfarmVirtualServersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify server farm
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateServerfarmResponse
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServerfarmResponse updateServerfarm(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServerfarmRequestData body);

  /**
   * Modify
   * Similar to <code>updateServerfarm</code> but it also returns the http response headers .
   * Modify server farm
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServerfarmResponse> updateServerfarmWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServerfarmRequestData body);


  /**
   * Modify
   * Modify server farm
   * Note, this is equivalent to the other <code>updateServerfarm</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServerfarmQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServerfarmResponse
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServerfarmResponse updateServerfarm(@Param("elid") String elid, UpdateServerfarmRequestData body, @QueryMap(encoded=true) UpdateServerfarmQueryParams queryParams);

  /**
  * Modify
  * Modify server farm
  * Note, this is equivalent to the other <code>updateServerfarm</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServerfarmResponse
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServerfarmResponse> updateServerfarmWithHttpInfo(@Param("elid") String elid, UpdateServerfarmRequestData body, @QueryMap(encoded=true) UpdateServerfarmQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServerfarm</code> method in a fluent style.
   */
  public static class UpdateServerfarmQueryParams extends HashMap<String, Object> {
    public UpdateServerfarmQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesServerfarmResponse
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServerfarmResponse updateSystemAttributesServerfarm(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServerfarmRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServerfarm</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServerfarmResponse> updateSystemAttributesServerfarmWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServerfarmRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServerfarm</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServerfarmQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServerfarmResponse
   */
  @RequestLine("POST /api/rest/entity/serverfarm/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServerfarmResponse updateSystemAttributesServerfarm(@Param("elid") String elid, UpdateSystemAttributesServerfarmRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServerfarmQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServerfarm</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServerfarmResponse
      */
      @RequestLine("POST /api/rest/entity/serverfarm/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServerfarmResponse> updateSystemAttributesServerfarmWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServerfarmRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServerfarmQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServerfarm</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServerfarmQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServerfarmQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
