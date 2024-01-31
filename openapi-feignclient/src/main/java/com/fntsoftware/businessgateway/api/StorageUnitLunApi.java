package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateStorageUnitLunRequestData;
import com.fntsoftware.businessgateway.entities.CreateStorageUnitLunResponse;
import com.fntsoftware.businessgateway.entities.DeleteStorageUnitLunRequestData;
import com.fntsoftware.businessgateway.entities.DeleteStorageUnitLunResponse;
import com.fntsoftware.businessgateway.entities.StorageUnitLun100022RequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitLun100022ResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitLun100031RequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitLun100031ResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitLun100037RequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitLun100037ResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunCustomServersBaseRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunCustomServersBaseResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunFileSystemsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunFileSystemsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunPersonsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunPersonsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunQueryRequest;
import com.fntsoftware.businessgateway.entities.StorageUnitLunQueryResponse;
import com.fntsoftware.businessgateway.entities.StorageUnitLunStorageUnitsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunStorageUnitsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitLunSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.StorageUnitLunSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateStorageUnitLunRequestData;
import com.fntsoftware.businessgateway.entities.UpdateStorageUnitLunResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitLunRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitLunResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface StorageUnitLunApi extends ApiClient.Api {


  /**
   * Create
   * Create Storage unit
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateStorageUnitLunResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateStorageUnitLunResponse createStorageUnitLun(@Param("sessionId") String sessionId, CreateStorageUnitLunRequestData body);

  /**
   * Create
   * Similar to <code>createStorageUnitLun</code> but it also returns the http response headers .
   * Create Storage unit
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateStorageUnitLunResponse> createStorageUnitLunWithHttpInfo(@Param("sessionId") String sessionId, CreateStorageUnitLunRequestData body);


  /**
   * Create
   * Create Storage unit
   * Note, this is equivalent to the other <code>createStorageUnitLun</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateStorageUnitLunQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateStorageUnitLunResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateStorageUnitLunResponse createStorageUnitLun(CreateStorageUnitLunRequestData body, @QueryMap(encoded=true) CreateStorageUnitLunQueryParams queryParams);

  /**
  * Create
  * Create Storage unit
  * Note, this is equivalent to the other <code>createStorageUnitLun</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateStorageUnitLunResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateStorageUnitLunResponse> createStorageUnitLunWithHttpInfo(CreateStorageUnitLunRequestData body, @QueryMap(encoded=true) CreateStorageUnitLunQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createStorageUnitLun</code> method in a fluent style.
   */
  public static class CreateStorageUnitLunQueryParams extends HashMap<String, Object> {
    public CreateStorageUnitLunQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete storage unit
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteStorageUnitLunResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteStorageUnitLunResponse deleteStorageUnitLun(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteStorageUnitLunRequestData body);

  /**
   * Delete
   * Similar to <code>deleteStorageUnitLun</code> but it also returns the http response headers .
   * Delete storage unit
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteStorageUnitLunResponse> deleteStorageUnitLunWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteStorageUnitLunRequestData body);


  /**
   * Delete
   * Delete storage unit
   * Note, this is equivalent to the other <code>deleteStorageUnitLun</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteStorageUnitLunQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteStorageUnitLunResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteStorageUnitLunResponse deleteStorageUnitLun(@Param("elid") String elid, DeleteStorageUnitLunRequestData body, @QueryMap(encoded=true) DeleteStorageUnitLunQueryParams queryParams);

  /**
  * Delete
  * Delete storage unit
  * Note, this is equivalent to the other <code>deleteStorageUnitLun</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteStorageUnitLunResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteStorageUnitLunResponse> deleteStorageUnitLunWithHttpInfo(@Param("elid") String elid, DeleteStorageUnitLunRequestData body, @QueryMap(encoded=true) DeleteStorageUnitLunQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteStorageUnitLun</code> method in a fluent style.
   */
  public static class DeleteStorageUnitLunQueryParams extends HashMap<String, Object> {
    public DeleteStorageUnitLunQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage product entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageUnitLun100022ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/100022?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLun100022ResponseData storageUnitLun100022(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLun100022RequestData body);

  /**
   * Get relations to Storage product entities
   * Similar to <code>storageUnitLun100022</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/100022?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLun100022ResponseData> storageUnitLun100022WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLun100022RequestData body);


  /**
   * Get relations to Storage product entities
   * 
   * Note, this is equivalent to the other <code>storageUnitLun100022</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLun100022QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLun100022ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/100022?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLun100022ResponseData storageUnitLun100022(@Param("elid") String elid, StorageUnitLun100022RequestData body, @QueryMap(encoded=true) StorageUnitLun100022QueryParams queryParams);

  /**
  * Get relations to Storage product entities
  * 
  * Note, this is equivalent to the other <code>storageUnitLun100022</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLun100022ResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/100022?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLun100022ResponseData> storageUnitLun100022WithHttpInfo(@Param("elid") String elid, StorageUnitLun100022RequestData body, @QueryMap(encoded=true) StorageUnitLun100022QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLun100022</code> method in a fluent style.
   */
  public static class StorageUnitLun100022QueryParams extends HashMap<String, Object> {
    public StorageUnitLun100022QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual disk entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageUnitLun100031ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/100031?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLun100031ResponseData storageUnitLun100031(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLun100031RequestData body);

  /**
   * Get relations to Virtual disk entities
   * Similar to <code>storageUnitLun100031</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/100031?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLun100031ResponseData> storageUnitLun100031WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLun100031RequestData body);


  /**
   * Get relations to Virtual disk entities
   * 
   * Note, this is equivalent to the other <code>storageUnitLun100031</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLun100031QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLun100031ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/100031?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLun100031ResponseData storageUnitLun100031(@Param("elid") String elid, StorageUnitLun100031RequestData body, @QueryMap(encoded=true) StorageUnitLun100031QueryParams queryParams);

  /**
  * Get relations to Virtual disk entities
  * 
  * Note, this is equivalent to the other <code>storageUnitLun100031</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLun100031ResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/100031?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLun100031ResponseData> storageUnitLun100031WithHttpInfo(@Param("elid") String elid, StorageUnitLun100031RequestData body, @QueryMap(encoded=true) StorageUnitLun100031QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLun100031</code> method in a fluent style.
   */
  public static class StorageUnitLun100031QueryParams extends HashMap<String, Object> {
    public StorageUnitLun100031QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to VM datastore entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageUnitLun100037ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/100037?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLun100037ResponseData storageUnitLun100037(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLun100037RequestData body);

  /**
   * Get relations to VM datastore entities
   * Similar to <code>storageUnitLun100037</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/100037?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLun100037ResponseData> storageUnitLun100037WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLun100037RequestData body);


  /**
   * Get relations to VM datastore entities
   * 
   * Note, this is equivalent to the other <code>storageUnitLun100037</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLun100037QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLun100037ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/100037?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLun100037ResponseData storageUnitLun100037(@Param("elid") String elid, StorageUnitLun100037RequestData body, @QueryMap(encoded=true) StorageUnitLun100037QueryParams queryParams);

  /**
  * Get relations to VM datastore entities
  * 
  * Note, this is equivalent to the other <code>storageUnitLun100037</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLun100037ResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/100037?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLun100037ResponseData> storageUnitLun100037WithHttpInfo(@Param("elid") String elid, StorageUnitLun100037RequestData body, @QueryMap(encoded=true) StorageUnitLun100037QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLun100037</code> method in a fluent style.
   */
  public static class StorageUnitLun100037QueryParams extends HashMap<String, Object> {
    public StorageUnitLun100037QueryParams sessionId(final String value) {
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
   * @return StorageUnitLunContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLunContractsResponseData storageUnitLunContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>storageUnitLunContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLunContractsResponseData> storageUnitLunContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>storageUnitLunContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLunContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLunContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLunContractsResponseData storageUnitLunContracts(@Param("elid") String elid, StorageUnitLunContractsRequestData body, @QueryMap(encoded=true) StorageUnitLunContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>storageUnitLunContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLunContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLunContractsResponseData> storageUnitLunContractsWithHttpInfo(@Param("elid") String elid, StorageUnitLunContractsRequestData body, @QueryMap(encoded=true) StorageUnitLunContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLunContracts</code> method in a fluent style.
   */
  public static class StorageUnitLunContractsQueryParams extends HashMap<String, Object> {
    public StorageUnitLunContractsQueryParams sessionId(final String value) {
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
   * @return StorageUnitLunCustomServersBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/CustomServersBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLunCustomServersBaseResponseData storageUnitLunCustomServersBase(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunCustomServersBaseRequestData body);

  /**
   * Get relations to Server (base) entities
   * Similar to <code>storageUnitLunCustomServersBase</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/CustomServersBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLunCustomServersBaseResponseData> storageUnitLunCustomServersBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunCustomServersBaseRequestData body);


  /**
   * Get relations to Server (base) entities
   * 
   * Note, this is equivalent to the other <code>storageUnitLunCustomServersBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLunCustomServersBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLunCustomServersBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/CustomServersBase?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLunCustomServersBaseResponseData storageUnitLunCustomServersBase(@Param("elid") String elid, StorageUnitLunCustomServersBaseRequestData body, @QueryMap(encoded=true) StorageUnitLunCustomServersBaseQueryParams queryParams);

  /**
  * Get relations to Server (base) entities
  * 
  * Note, this is equivalent to the other <code>storageUnitLunCustomServersBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLunCustomServersBaseResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/CustomServersBase?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLunCustomServersBaseResponseData> storageUnitLunCustomServersBaseWithHttpInfo(@Param("elid") String elid, StorageUnitLunCustomServersBaseRequestData body, @QueryMap(encoded=true) StorageUnitLunCustomServersBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLunCustomServersBase</code> method in a fluent style.
   */
  public static class StorageUnitLunCustomServersBaseQueryParams extends HashMap<String, Object> {
    public StorageUnitLunCustomServersBaseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to File system entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageUnitLunFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLunFileSystemsResponseData storageUnitLunFileSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunFileSystemsRequestData body);

  /**
   * Get relations to File system entities
   * Similar to <code>storageUnitLunFileSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLunFileSystemsResponseData> storageUnitLunFileSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunFileSystemsRequestData body);


  /**
   * Get relations to File system entities
   * 
   * Note, this is equivalent to the other <code>storageUnitLunFileSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLunFileSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLunFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLunFileSystemsResponseData storageUnitLunFileSystems(@Param("elid") String elid, StorageUnitLunFileSystemsRequestData body, @QueryMap(encoded=true) StorageUnitLunFileSystemsQueryParams queryParams);

  /**
  * Get relations to File system entities
  * 
  * Note, this is equivalent to the other <code>storageUnitLunFileSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLunFileSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/FileSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLunFileSystemsResponseData> storageUnitLunFileSystemsWithHttpInfo(@Param("elid") String elid, StorageUnitLunFileSystemsRequestData body, @QueryMap(encoded=true) StorageUnitLunFileSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLunFileSystems</code> method in a fluent style.
   */
  public static class StorageUnitLunFileSystemsQueryParams extends HashMap<String, Object> {
    public StorageUnitLunFileSystemsQueryParams sessionId(final String value) {
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
   * @return StorageUnitLunFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLunFrameContractsResponseData storageUnitLunFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>storageUnitLunFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLunFrameContractsResponseData> storageUnitLunFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>storageUnitLunFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLunFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLunFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLunFrameContractsResponseData storageUnitLunFrameContracts(@Param("elid") String elid, StorageUnitLunFrameContractsRequestData body, @QueryMap(encoded=true) StorageUnitLunFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>storageUnitLunFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLunFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLunFrameContractsResponseData> storageUnitLunFrameContractsWithHttpInfo(@Param("elid") String elid, StorageUnitLunFrameContractsRequestData body, @QueryMap(encoded=true) StorageUnitLunFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLunFrameContracts</code> method in a fluent style.
   */
  public static class StorageUnitLunFrameContractsQueryParams extends HashMap<String, Object> {
    public StorageUnitLunFrameContractsQueryParams sessionId(final String value) {
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
   * @return StorageUnitLunMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLunMaintenanceContractsResponseData storageUnitLunMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>storageUnitLunMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLunMaintenanceContractsResponseData> storageUnitLunMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>storageUnitLunMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLunMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLunMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLunMaintenanceContractsResponseData storageUnitLunMaintenanceContracts(@Param("elid") String elid, StorageUnitLunMaintenanceContractsRequestData body, @QueryMap(encoded=true) StorageUnitLunMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>storageUnitLunMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLunMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLunMaintenanceContractsResponseData> storageUnitLunMaintenanceContractsWithHttpInfo(@Param("elid") String elid, StorageUnitLunMaintenanceContractsRequestData body, @QueryMap(encoded=true) StorageUnitLunMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLunMaintenanceContracts</code> method in a fluent style.
   */
  public static class StorageUnitLunMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public StorageUnitLunMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return StorageUnitLunMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLunMaintenanceWindowsResponseData storageUnitLunMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>storageUnitLunMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLunMaintenanceWindowsResponseData> storageUnitLunMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>storageUnitLunMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLunMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLunMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLunMaintenanceWindowsResponseData storageUnitLunMaintenanceWindows(@Param("elid") String elid, StorageUnitLunMaintenanceWindowsRequestData body, @QueryMap(encoded=true) StorageUnitLunMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>storageUnitLunMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLunMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLunMaintenanceWindowsResponseData> storageUnitLunMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, StorageUnitLunMaintenanceWindowsRequestData body, @QueryMap(encoded=true) StorageUnitLunMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLunMaintenanceWindows</code> method in a fluent style.
   */
  public static class StorageUnitLunMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public StorageUnitLunMaintenanceWindowsQueryParams sessionId(final String value) {
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
   * @return StorageUnitLunOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLunOrganizationsResponseData storageUnitLunOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>storageUnitLunOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLunOrganizationsResponseData> storageUnitLunOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>storageUnitLunOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLunOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLunOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLunOrganizationsResponseData storageUnitLunOrganizations(@Param("elid") String elid, StorageUnitLunOrganizationsRequestData body, @QueryMap(encoded=true) StorageUnitLunOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>storageUnitLunOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLunOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLunOrganizationsResponseData> storageUnitLunOrganizationsWithHttpInfo(@Param("elid") String elid, StorageUnitLunOrganizationsRequestData body, @QueryMap(encoded=true) StorageUnitLunOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLunOrganizations</code> method in a fluent style.
   */
  public static class StorageUnitLunOrganizationsQueryParams extends HashMap<String, Object> {
    public StorageUnitLunOrganizationsQueryParams sessionId(final String value) {
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
   * @return StorageUnitLunPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLunPersonGroupsResponseData storageUnitLunPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>storageUnitLunPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLunPersonGroupsResponseData> storageUnitLunPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>storageUnitLunPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLunPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLunPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLunPersonGroupsResponseData storageUnitLunPersonGroups(@Param("elid") String elid, StorageUnitLunPersonGroupsRequestData body, @QueryMap(encoded=true) StorageUnitLunPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>storageUnitLunPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLunPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLunPersonGroupsResponseData> storageUnitLunPersonGroupsWithHttpInfo(@Param("elid") String elid, StorageUnitLunPersonGroupsRequestData body, @QueryMap(encoded=true) StorageUnitLunPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLunPersonGroups</code> method in a fluent style.
   */
  public static class StorageUnitLunPersonGroupsQueryParams extends HashMap<String, Object> {
    public StorageUnitLunPersonGroupsQueryParams sessionId(final String value) {
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
   * @return StorageUnitLunPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLunPersonsResponseData storageUnitLunPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>storageUnitLunPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLunPersonsResponseData> storageUnitLunPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>storageUnitLunPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLunPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLunPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLunPersonsResponseData storageUnitLunPersons(@Param("elid") String elid, StorageUnitLunPersonsRequestData body, @QueryMap(encoded=true) StorageUnitLunPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>storageUnitLunPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLunPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLunPersonsResponseData> storageUnitLunPersonsWithHttpInfo(@Param("elid") String elid, StorageUnitLunPersonsRequestData body, @QueryMap(encoded=true) StorageUnitLunPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLunPersons</code> method in a fluent style.
   */
  public static class StorageUnitLunPersonsQueryParams extends HashMap<String, Object> {
    public StorageUnitLunPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageUnitLunQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLunQueryResponse storageUnitLunQuery(@Param("sessionId") String sessionId, StorageUnitLunQueryRequest body);

  /**
   * Basic query
   * Similar to <code>storageUnitLunQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLunQueryResponse> storageUnitLunQueryWithHttpInfo(@Param("sessionId") String sessionId, StorageUnitLunQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>storageUnitLunQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLunQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLunQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLunQueryResponse storageUnitLunQuery(StorageUnitLunQueryRequest body, @QueryMap(encoded=true) StorageUnitLunQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>storageUnitLunQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLunQueryResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLunQueryResponse> storageUnitLunQueryWithHttpInfo(StorageUnitLunQueryRequest body, @QueryMap(encoded=true) StorageUnitLunQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLunQuery</code> method in a fluent style.
   */
  public static class StorageUnitLunQueryQueryParams extends HashMap<String, Object> {
    public StorageUnitLunQueryQueryParams sessionId(final String value) {
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
   * @return StorageUnitLunStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLunStorageUnitsResponseData storageUnitLunStorageUnits(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunStorageUnitsRequestData body);

  /**
   * Get relations to Storage unit entities
   * Similar to <code>storageUnitLunStorageUnits</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLunStorageUnitsResponseData> storageUnitLunStorageUnitsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunStorageUnitsRequestData body);


  /**
   * Get relations to Storage unit entities
   * 
   * Note, this is equivalent to the other <code>storageUnitLunStorageUnits</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLunStorageUnitsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLunStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLunStorageUnitsResponseData storageUnitLunStorageUnits(@Param("elid") String elid, StorageUnitLunStorageUnitsRequestData body, @QueryMap(encoded=true) StorageUnitLunStorageUnitsQueryParams queryParams);

  /**
  * Get relations to Storage unit entities
  * 
  * Note, this is equivalent to the other <code>storageUnitLunStorageUnits</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLunStorageUnitsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/StorageUnits?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLunStorageUnitsResponseData> storageUnitLunStorageUnitsWithHttpInfo(@Param("elid") String elid, StorageUnitLunStorageUnitsRequestData body, @QueryMap(encoded=true) StorageUnitLunStorageUnitsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLunStorageUnits</code> method in a fluent style.
   */
  public static class StorageUnitLunStorageUnitsQueryParams extends HashMap<String, Object> {
    public StorageUnitLunStorageUnitsQueryParams sessionId(final String value) {
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
   * @return StorageUnitLunSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitLunSystemAttributesResponse storageUnitLunSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>storageUnitLunSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitLunSystemAttributesResponse> storageUnitLunSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitLunSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>storageUnitLunSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitLunSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitLunSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitLunSystemAttributesResponse storageUnitLunSystemAttributes(@Param("elid") String elid, StorageUnitLunSystemAttributesRequest body, @QueryMap(encoded=true) StorageUnitLunSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>storageUnitLunSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitLunSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitLunSystemAttributesResponse> storageUnitLunSystemAttributesWithHttpInfo(@Param("elid") String elid, StorageUnitLunSystemAttributesRequest body, @QueryMap(encoded=true) StorageUnitLunSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitLunSystemAttributes</code> method in a fluent style.
   */
  public static class StorageUnitLunSystemAttributesQueryParams extends HashMap<String, Object> {
    public StorageUnitLunSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify storage unit
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateStorageUnitLunResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateStorageUnitLunResponse updateStorageUnitLun(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateStorageUnitLunRequestData body);

  /**
   * Modify
   * Similar to <code>updateStorageUnitLun</code> but it also returns the http response headers .
   * Modify storage unit
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateStorageUnitLunResponse> updateStorageUnitLunWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateStorageUnitLunRequestData body);


  /**
   * Modify
   * Modify storage unit
   * Note, this is equivalent to the other <code>updateStorageUnitLun</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateStorageUnitLunQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateStorageUnitLunResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateStorageUnitLunResponse updateStorageUnitLun(@Param("elid") String elid, UpdateStorageUnitLunRequestData body, @QueryMap(encoded=true) UpdateStorageUnitLunQueryParams queryParams);

  /**
  * Modify
  * Modify storage unit
  * Note, this is equivalent to the other <code>updateStorageUnitLun</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateStorageUnitLunResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateStorageUnitLunResponse> updateStorageUnitLunWithHttpInfo(@Param("elid") String elid, UpdateStorageUnitLunRequestData body, @QueryMap(encoded=true) UpdateStorageUnitLunQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateStorageUnitLun</code> method in a fluent style.
   */
  public static class UpdateStorageUnitLunQueryParams extends HashMap<String, Object> {
    public UpdateStorageUnitLunQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesStorageUnitLunResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesStorageUnitLunResponse updateSystemAttributesStorageUnitLun(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageUnitLunRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesStorageUnitLun</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesStorageUnitLunResponse> updateSystemAttributesStorageUnitLunWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageUnitLunRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesStorageUnitLun</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesStorageUnitLunQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesStorageUnitLunResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesStorageUnitLunResponse updateSystemAttributesStorageUnitLun(@Param("elid") String elid, UpdateSystemAttributesStorageUnitLunRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageUnitLunQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesStorageUnitLun</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesStorageUnitLunResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitLun/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesStorageUnitLunResponse> updateSystemAttributesStorageUnitLunWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesStorageUnitLunRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageUnitLunQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesStorageUnitLun</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesStorageUnitLunQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesStorageUnitLunQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
