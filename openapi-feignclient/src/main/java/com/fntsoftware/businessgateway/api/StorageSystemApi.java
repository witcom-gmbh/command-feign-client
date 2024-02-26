package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateStorageSystemRequestData;
import com.fntsoftware.businessgateway.entities.CreateStorageSystemResponse;
import com.fntsoftware.businessgateway.entities.DeleteStorageSystemRequestData;
import com.fntsoftware.businessgateway.entities.DeleteStorageSystemResponse;
import com.fntsoftware.businessgateway.entities.StorageSystemContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageSystemContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageSystemDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.StorageSystemDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.StorageSystemFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageSystemFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageSystemMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageSystemMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageSystemMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.StorageSystemMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.StorageSystemOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.StorageSystemOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.StorageSystemPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.StorageSystemPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.StorageSystemPersonsRequestData;
import com.fntsoftware.businessgateway.entities.StorageSystemPersonsResponseData;
import com.fntsoftware.businessgateway.entities.StorageSystemQueryRequest;
import com.fntsoftware.businessgateway.entities.StorageSystemQueryResponse;
import com.fntsoftware.businessgateway.entities.StorageSystemStorageSystemsRequestData;
import com.fntsoftware.businessgateway.entities.StorageSystemStorageSystemsResponseData;
import com.fntsoftware.businessgateway.entities.StorageSystemStorageUnitsRequestData;
import com.fntsoftware.businessgateway.entities.StorageSystemStorageUnitsResponseData;
import com.fntsoftware.businessgateway.entities.StorageSystemSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.StorageSystemSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.StorageSystemVirtualNasServersRequestData;
import com.fntsoftware.businessgateway.entities.StorageSystemVirtualNasServersResponseData;
import com.fntsoftware.businessgateway.entities.StorageSystemZoneRequestData;
import com.fntsoftware.businessgateway.entities.StorageSystemZoneResponseData;
import com.fntsoftware.businessgateway.entities.UpdateStorageSystemRequestData;
import com.fntsoftware.businessgateway.entities.UpdateStorageSystemResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageSystemRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageSystemResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface StorageSystemApi extends ApiClient.Api {


  /**
   * Create
   * Create Storage system
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateStorageSystemResponse
   */
  @RequestLine("POST /api/rest/entity/storageSystem/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateStorageSystemResponse createStorageSystem(@Param("sessionId") String sessionId, CreateStorageSystemRequestData body);

  /**
   * Create
   * Similar to <code>createStorageSystem</code> but it also returns the http response headers .
   * Create Storage system
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateStorageSystemResponse> createStorageSystemWithHttpInfo(@Param("sessionId") String sessionId, CreateStorageSystemRequestData body);


  /**
   * Create
   * Create Storage system
   * Note, this is equivalent to the other <code>createStorageSystem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateStorageSystemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateStorageSystemResponse
   */
  @RequestLine("POST /api/rest/entity/storageSystem/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateStorageSystemResponse createStorageSystem(CreateStorageSystemRequestData body, @QueryMap(encoded=true) CreateStorageSystemQueryParams queryParams);

  /**
  * Create
  * Create Storage system
  * Note, this is equivalent to the other <code>createStorageSystem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateStorageSystemResponse
      */
      @RequestLine("POST /api/rest/entity/storageSystem/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateStorageSystemResponse> createStorageSystemWithHttpInfo(CreateStorageSystemRequestData body, @QueryMap(encoded=true) CreateStorageSystemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createStorageSystem</code> method in a fluent style.
   */
  public static class CreateStorageSystemQueryParams extends HashMap<String, Object> {
    public CreateStorageSystemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Storage system
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteStorageSystemResponse
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteStorageSystemResponse deleteStorageSystem(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteStorageSystemRequestData body);

  /**
   * Delete
   * Similar to <code>deleteStorageSystem</code> but it also returns the http response headers .
   * Delete Storage system
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteStorageSystemResponse> deleteStorageSystemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteStorageSystemRequestData body);


  /**
   * Delete
   * Delete Storage system
   * Note, this is equivalent to the other <code>deleteStorageSystem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteStorageSystemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteStorageSystemResponse
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteStorageSystemResponse deleteStorageSystem(@Param("elid") String elid, DeleteStorageSystemRequestData body, @QueryMap(encoded=true) DeleteStorageSystemQueryParams queryParams);

  /**
  * Delete
  * Delete Storage system
  * Note, this is equivalent to the other <code>deleteStorageSystem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteStorageSystemResponse
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteStorageSystemResponse> deleteStorageSystemWithHttpInfo(@Param("elid") String elid, DeleteStorageSystemRequestData body, @QueryMap(encoded=true) DeleteStorageSystemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteStorageSystem</code> method in a fluent style.
   */
  public static class DeleteStorageSystemQueryParams extends HashMap<String, Object> {
    public DeleteStorageSystemQueryParams sessionId(final String value) {
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
   * @return StorageSystemContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemContractsResponseData storageSystemContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>storageSystemContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemContractsResponseData> storageSystemContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>storageSystemContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemContractsResponseData storageSystemContracts(@Param("elid") String elid, StorageSystemContractsRequestData body, @QueryMap(encoded=true) StorageSystemContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>storageSystemContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemContractsResponseData> storageSystemContractsWithHttpInfo(@Param("elid") String elid, StorageSystemContractsRequestData body, @QueryMap(encoded=true) StorageSystemContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemContracts</code> method in a fluent style.
   */
  public static class StorageSystemContractsQueryParams extends HashMap<String, Object> {
    public StorageSystemContractsQueryParams sessionId(final String value) {
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
   * @return StorageSystemDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemDevicesAllResponseData storageSystemDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>storageSystemDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemDevicesAllResponseData> storageSystemDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>storageSystemDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemDevicesAllResponseData storageSystemDevicesAll(@Param("elid") String elid, StorageSystemDevicesAllRequestData body, @QueryMap(encoded=true) StorageSystemDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>storageSystemDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemDevicesAllResponseData> storageSystemDevicesAllWithHttpInfo(@Param("elid") String elid, StorageSystemDevicesAllRequestData body, @QueryMap(encoded=true) StorageSystemDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemDevicesAll</code> method in a fluent style.
   */
  public static class StorageSystemDevicesAllQueryParams extends HashMap<String, Object> {
    public StorageSystemDevicesAllQueryParams sessionId(final String value) {
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
   * @return StorageSystemFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemFrameContractsResponseData storageSystemFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>storageSystemFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemFrameContractsResponseData> storageSystemFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>storageSystemFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemFrameContractsResponseData storageSystemFrameContracts(@Param("elid") String elid, StorageSystemFrameContractsRequestData body, @QueryMap(encoded=true) StorageSystemFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>storageSystemFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemFrameContractsResponseData> storageSystemFrameContractsWithHttpInfo(@Param("elid") String elid, StorageSystemFrameContractsRequestData body, @QueryMap(encoded=true) StorageSystemFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemFrameContracts</code> method in a fluent style.
   */
  public static class StorageSystemFrameContractsQueryParams extends HashMap<String, Object> {
    public StorageSystemFrameContractsQueryParams sessionId(final String value) {
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
   * @return StorageSystemMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemMaintenanceContractsResponseData storageSystemMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>storageSystemMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemMaintenanceContractsResponseData> storageSystemMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>storageSystemMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemMaintenanceContractsResponseData storageSystemMaintenanceContracts(@Param("elid") String elid, StorageSystemMaintenanceContractsRequestData body, @QueryMap(encoded=true) StorageSystemMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>storageSystemMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemMaintenanceContractsResponseData> storageSystemMaintenanceContractsWithHttpInfo(@Param("elid") String elid, StorageSystemMaintenanceContractsRequestData body, @QueryMap(encoded=true) StorageSystemMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemMaintenanceContracts</code> method in a fluent style.
   */
  public static class StorageSystemMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public StorageSystemMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return StorageSystemMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemMaintenanceWindowsResponseData storageSystemMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>storageSystemMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemMaintenanceWindowsResponseData> storageSystemMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>storageSystemMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemMaintenanceWindowsResponseData storageSystemMaintenanceWindows(@Param("elid") String elid, StorageSystemMaintenanceWindowsRequestData body, @QueryMap(encoded=true) StorageSystemMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>storageSystemMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemMaintenanceWindowsResponseData> storageSystemMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, StorageSystemMaintenanceWindowsRequestData body, @QueryMap(encoded=true) StorageSystemMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemMaintenanceWindows</code> method in a fluent style.
   */
  public static class StorageSystemMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public StorageSystemMaintenanceWindowsQueryParams sessionId(final String value) {
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
   * @return StorageSystemOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemOrganizationsResponseData storageSystemOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>storageSystemOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemOrganizationsResponseData> storageSystemOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>storageSystemOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemOrganizationsResponseData storageSystemOrganizations(@Param("elid") String elid, StorageSystemOrganizationsRequestData body, @QueryMap(encoded=true) StorageSystemOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>storageSystemOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemOrganizationsResponseData> storageSystemOrganizationsWithHttpInfo(@Param("elid") String elid, StorageSystemOrganizationsRequestData body, @QueryMap(encoded=true) StorageSystemOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemOrganizations</code> method in a fluent style.
   */
  public static class StorageSystemOrganizationsQueryParams extends HashMap<String, Object> {
    public StorageSystemOrganizationsQueryParams sessionId(final String value) {
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
   * @return StorageSystemPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemPersonGroupsResponseData storageSystemPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>storageSystemPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemPersonGroupsResponseData> storageSystemPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>storageSystemPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemPersonGroupsResponseData storageSystemPersonGroups(@Param("elid") String elid, StorageSystemPersonGroupsRequestData body, @QueryMap(encoded=true) StorageSystemPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>storageSystemPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemPersonGroupsResponseData> storageSystemPersonGroupsWithHttpInfo(@Param("elid") String elid, StorageSystemPersonGroupsRequestData body, @QueryMap(encoded=true) StorageSystemPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemPersonGroups</code> method in a fluent style.
   */
  public static class StorageSystemPersonGroupsQueryParams extends HashMap<String, Object> {
    public StorageSystemPersonGroupsQueryParams sessionId(final String value) {
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
   * @return StorageSystemPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemPersonsResponseData storageSystemPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>storageSystemPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemPersonsResponseData> storageSystemPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>storageSystemPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemPersonsResponseData storageSystemPersons(@Param("elid") String elid, StorageSystemPersonsRequestData body, @QueryMap(encoded=true) StorageSystemPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>storageSystemPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemPersonsResponseData> storageSystemPersonsWithHttpInfo(@Param("elid") String elid, StorageSystemPersonsRequestData body, @QueryMap(encoded=true) StorageSystemPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemPersons</code> method in a fluent style.
   */
  public static class StorageSystemPersonsQueryParams extends HashMap<String, Object> {
    public StorageSystemPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageSystemQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storageSystem/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemQueryResponse storageSystemQuery(@Param("sessionId") String sessionId, StorageSystemQueryRequest body);

  /**
   * Basic query
   * Similar to <code>storageSystemQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemQueryResponse> storageSystemQueryWithHttpInfo(@Param("sessionId") String sessionId, StorageSystemQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>storageSystemQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storageSystem/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemQueryResponse storageSystemQuery(StorageSystemQueryRequest body, @QueryMap(encoded=true) StorageSystemQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>storageSystemQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemQueryResponse
      */
      @RequestLine("POST /api/rest/entity/storageSystem/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemQueryResponse> storageSystemQueryWithHttpInfo(StorageSystemQueryRequest body, @QueryMap(encoded=true) StorageSystemQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemQuery</code> method in a fluent style.
   */
  public static class StorageSystemQueryQueryParams extends HashMap<String, Object> {
    public StorageSystemQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage system entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageSystemStorageSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/StorageSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemStorageSystemsResponseData storageSystemStorageSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemStorageSystemsRequestData body);

  /**
   * Get relations to Storage system entities
   * Similar to <code>storageSystemStorageSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/StorageSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemStorageSystemsResponseData> storageSystemStorageSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemStorageSystemsRequestData body);


  /**
   * Get relations to Storage system entities
   * 
   * Note, this is equivalent to the other <code>storageSystemStorageSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemStorageSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemStorageSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/StorageSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemStorageSystemsResponseData storageSystemStorageSystems(@Param("elid") String elid, StorageSystemStorageSystemsRequestData body, @QueryMap(encoded=true) StorageSystemStorageSystemsQueryParams queryParams);

  /**
  * Get relations to Storage system entities
  * 
  * Note, this is equivalent to the other <code>storageSystemStorageSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemStorageSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/StorageSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemStorageSystemsResponseData> storageSystemStorageSystemsWithHttpInfo(@Param("elid") String elid, StorageSystemStorageSystemsRequestData body, @QueryMap(encoded=true) StorageSystemStorageSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemStorageSystems</code> method in a fluent style.
   */
  public static class StorageSystemStorageSystemsQueryParams extends HashMap<String, Object> {
    public StorageSystemStorageSystemsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage unit entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageSystemStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemStorageUnitsResponseData storageSystemStorageUnits(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemStorageUnitsRequestData body);

  /**
   * Get relations to Storage unit entities
   * Similar to <code>storageSystemStorageUnits</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemStorageUnitsResponseData> storageSystemStorageUnitsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemStorageUnitsRequestData body);


  /**
   * Get relations to Storage unit entities
   * 
   * Note, this is equivalent to the other <code>storageSystemStorageUnits</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemStorageUnitsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemStorageUnitsResponseData storageSystemStorageUnits(@Param("elid") String elid, StorageSystemStorageUnitsRequestData body, @QueryMap(encoded=true) StorageSystemStorageUnitsQueryParams queryParams);

  /**
  * Get relations to Storage unit entities
  * 
  * Note, this is equivalent to the other <code>storageSystemStorageUnits</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemStorageUnitsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/StorageUnits?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemStorageUnitsResponseData> storageSystemStorageUnitsWithHttpInfo(@Param("elid") String elid, StorageSystemStorageUnitsRequestData body, @QueryMap(encoded=true) StorageSystemStorageUnitsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemStorageUnits</code> method in a fluent style.
   */
  public static class StorageSystemStorageUnitsQueryParams extends HashMap<String, Object> {
    public StorageSystemStorageUnitsQueryParams sessionId(final String value) {
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
   * @return StorageSystemSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemSystemAttributesResponse storageSystemSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>storageSystemSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemSystemAttributesResponse> storageSystemSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>storageSystemSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemSystemAttributesResponse storageSystemSystemAttributes(@Param("elid") String elid, StorageSystemSystemAttributesRequest body, @QueryMap(encoded=true) StorageSystemSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>storageSystemSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemSystemAttributesResponse> storageSystemSystemAttributesWithHttpInfo(@Param("elid") String elid, StorageSystemSystemAttributesRequest body, @QueryMap(encoded=true) StorageSystemSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemSystemAttributes</code> method in a fluent style.
   */
  public static class StorageSystemSystemAttributesQueryParams extends HashMap<String, Object> {
    public StorageSystemSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual NAS server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageSystemVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemVirtualNasServersResponseData storageSystemVirtualNasServers(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemVirtualNasServersRequestData body);

  /**
   * Get relations to Virtual NAS server entities
   * Similar to <code>storageSystemVirtualNasServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemVirtualNasServersResponseData> storageSystemVirtualNasServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemVirtualNasServersRequestData body);


  /**
   * Get relations to Virtual NAS server entities
   * 
   * Note, this is equivalent to the other <code>storageSystemVirtualNasServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemVirtualNasServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemVirtualNasServersResponseData storageSystemVirtualNasServers(@Param("elid") String elid, StorageSystemVirtualNasServersRequestData body, @QueryMap(encoded=true) StorageSystemVirtualNasServersQueryParams queryParams);

  /**
  * Get relations to Virtual NAS server entities
  * 
  * Note, this is equivalent to the other <code>storageSystemVirtualNasServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemVirtualNasServersResponseData
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/VirtualNasServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemVirtualNasServersResponseData> storageSystemVirtualNasServersWithHttpInfo(@Param("elid") String elid, StorageSystemVirtualNasServersRequestData body, @QueryMap(encoded=true) StorageSystemVirtualNasServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemVirtualNasServers</code> method in a fluent style.
   */
  public static class StorageSystemVirtualNasServersQueryParams extends HashMap<String, Object> {
    public StorageSystemVirtualNasServersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Zone entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageSystemZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageSystemZoneResponseData storageSystemZone(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemZoneRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>storageSystemZone</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Zone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageSystemZoneResponseData> storageSystemZoneWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageSystemZoneRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>storageSystemZone</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageSystemZoneQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageSystemZoneResponseData
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Zone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageSystemZoneResponseData storageSystemZone(@Param("elid") String elid, StorageSystemZoneRequestData body, @QueryMap(encoded=true) StorageSystemZoneQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>storageSystemZone</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageSystemZoneResponseData
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/Zone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageSystemZoneResponseData> storageSystemZoneWithHttpInfo(@Param("elid") String elid, StorageSystemZoneRequestData body, @QueryMap(encoded=true) StorageSystemZoneQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageSystemZone</code> method in a fluent style.
   */
  public static class StorageSystemZoneQueryParams extends HashMap<String, Object> {
    public StorageSystemZoneQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Storage system
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateStorageSystemResponse
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateStorageSystemResponse updateStorageSystem(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateStorageSystemRequestData body);

  /**
   * Modify
   * Similar to <code>updateStorageSystem</code> but it also returns the http response headers .
   * Modify Storage system
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateStorageSystemResponse> updateStorageSystemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateStorageSystemRequestData body);


  /**
   * Modify
   * Modify Storage system
   * Note, this is equivalent to the other <code>updateStorageSystem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateStorageSystemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateStorageSystemResponse
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateStorageSystemResponse updateStorageSystem(@Param("elid") String elid, UpdateStorageSystemRequestData body, @QueryMap(encoded=true) UpdateStorageSystemQueryParams queryParams);

  /**
  * Modify
  * Modify Storage system
  * Note, this is equivalent to the other <code>updateStorageSystem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateStorageSystemResponse
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateStorageSystemResponse> updateStorageSystemWithHttpInfo(@Param("elid") String elid, UpdateStorageSystemRequestData body, @QueryMap(encoded=true) UpdateStorageSystemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateStorageSystem</code> method in a fluent style.
   */
  public static class UpdateStorageSystemQueryParams extends HashMap<String, Object> {
    public UpdateStorageSystemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Change system attributes
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSystemAttributesStorageSystemResponse
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesStorageSystemResponse updateSystemAttributesStorageSystem(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageSystemRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesStorageSystem</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesStorageSystemResponse> updateSystemAttributesStorageSystemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageSystemRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesStorageSystem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesStorageSystemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesStorageSystemResponse
   */
  @RequestLine("POST /api/rest/entity/storageSystem/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesStorageSystemResponse updateSystemAttributesStorageSystem(@Param("elid") String elid, UpdateSystemAttributesStorageSystemRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageSystemQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesStorageSystem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesStorageSystemResponse
      */
      @RequestLine("POST /api/rest/entity/storageSystem/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesStorageSystemResponse> updateSystemAttributesStorageSystemWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesStorageSystemRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageSystemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesStorageSystem</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesStorageSystemQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesStorageSystemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
