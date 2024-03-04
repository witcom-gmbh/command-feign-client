package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateStorageUnitQtreeRequestData;
import com.fntsoftware.businessgateway.entities.CreateStorageUnitQtreeResponse;
import com.fntsoftware.businessgateway.entities.DeleteStorageUnitQtreeRequestData;
import com.fntsoftware.businessgateway.entities.DeleteStorageUnitQtreeResponse;
import com.fntsoftware.businessgateway.entities.StorageUnitQtree100022RequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtree100022ResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtree100031RequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtree100031ResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtree100037RequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtree100037ResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeCustomServersBaseRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeCustomServersBaseResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeFileSystemsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeFileSystemsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreePersonsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreePersonsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeQueryRequest;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeQueryResponse;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeSharesRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeSharesResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeStorageUnitsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeStorageUnitsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeVirtualNasServersRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitQtreeVirtualNasServersResponseData;
import com.fntsoftware.businessgateway.entities.UpdateStorageUnitQtreeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateStorageUnitQtreeResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitQtreeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitQtreeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface StorageUnitQtreeApi extends ApiClient.Api {


  /**
   * Create
   * Create storage unit
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateStorageUnitQtreeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateStorageUnitQtreeResponse createStorageUnitQtree(@Param("sessionId") String sessionId, CreateStorageUnitQtreeRequestData body);

  /**
   * Create
   * Similar to <code>createStorageUnitQtree</code> but it also returns the http response headers .
   * Create storage unit
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateStorageUnitQtreeResponse> createStorageUnitQtreeWithHttpInfo(@Param("sessionId") String sessionId, CreateStorageUnitQtreeRequestData body);


  /**
   * Create
   * Create storage unit
   * Note, this is equivalent to the other <code>createStorageUnitQtree</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateStorageUnitQtreeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateStorageUnitQtreeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateStorageUnitQtreeResponse createStorageUnitQtree(CreateStorageUnitQtreeRequestData body, @QueryMap(encoded=true) CreateStorageUnitQtreeQueryParams queryParams);

  /**
  * Create
  * Create storage unit
  * Note, this is equivalent to the other <code>createStorageUnitQtree</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateStorageUnitQtreeResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateStorageUnitQtreeResponse> createStorageUnitQtreeWithHttpInfo(CreateStorageUnitQtreeRequestData body, @QueryMap(encoded=true) CreateStorageUnitQtreeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createStorageUnitQtree</code> method in a fluent style.
   */
  public static class CreateStorageUnitQtreeQueryParams extends HashMap<String, Object> {
    public CreateStorageUnitQtreeQueryParams sessionId(final String value) {
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
   * @return DeleteStorageUnitQtreeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteStorageUnitQtreeResponse deleteStorageUnitQtree(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteStorageUnitQtreeRequestData body);

  /**
   * Delete
   * Similar to <code>deleteStorageUnitQtree</code> but it also returns the http response headers .
   * Delete storage unit
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteStorageUnitQtreeResponse> deleteStorageUnitQtreeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteStorageUnitQtreeRequestData body);


  /**
   * Delete
   * Delete storage unit
   * Note, this is equivalent to the other <code>deleteStorageUnitQtree</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteStorageUnitQtreeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteStorageUnitQtreeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteStorageUnitQtreeResponse deleteStorageUnitQtree(@Param("elid") String elid, DeleteStorageUnitQtreeRequestData body, @QueryMap(encoded=true) DeleteStorageUnitQtreeQueryParams queryParams);

  /**
  * Delete
  * Delete storage unit
  * Note, this is equivalent to the other <code>deleteStorageUnitQtree</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteStorageUnitQtreeResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteStorageUnitQtreeResponse> deleteStorageUnitQtreeWithHttpInfo(@Param("elid") String elid, DeleteStorageUnitQtreeRequestData body, @QueryMap(encoded=true) DeleteStorageUnitQtreeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteStorageUnitQtree</code> method in a fluent style.
   */
  public static class DeleteStorageUnitQtreeQueryParams extends HashMap<String, Object> {
    public DeleteStorageUnitQtreeQueryParams sessionId(final String value) {
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
   * @return StorageUnitQtree100022ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/100022?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtree100022ResponseData storageUnitQtree100022(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtree100022RequestData body);

  /**
   * Get relations to Storage product entities
   * Similar to <code>storageUnitQtree100022</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/100022?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtree100022ResponseData> storageUnitQtree100022WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtree100022RequestData body);


  /**
   * Get relations to Storage product entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtree100022</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtree100022QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtree100022ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/100022?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtree100022ResponseData storageUnitQtree100022(@Param("elid") String elid, StorageUnitQtree100022RequestData body, @QueryMap(encoded=true) StorageUnitQtree100022QueryParams queryParams);

  /**
  * Get relations to Storage product entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtree100022</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtree100022ResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/100022?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtree100022ResponseData> storageUnitQtree100022WithHttpInfo(@Param("elid") String elid, StorageUnitQtree100022RequestData body, @QueryMap(encoded=true) StorageUnitQtree100022QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtree100022</code> method in a fluent style.
   */
  public static class StorageUnitQtree100022QueryParams extends HashMap<String, Object> {
    public StorageUnitQtree100022QueryParams sessionId(final String value) {
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
   * @return StorageUnitQtree100031ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/100031?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtree100031ResponseData storageUnitQtree100031(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtree100031RequestData body);

  /**
   * Get relations to Virtual disk entities
   * Similar to <code>storageUnitQtree100031</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/100031?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtree100031ResponseData> storageUnitQtree100031WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtree100031RequestData body);


  /**
   * Get relations to Virtual disk entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtree100031</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtree100031QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtree100031ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/100031?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtree100031ResponseData storageUnitQtree100031(@Param("elid") String elid, StorageUnitQtree100031RequestData body, @QueryMap(encoded=true) StorageUnitQtree100031QueryParams queryParams);

  /**
  * Get relations to Virtual disk entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtree100031</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtree100031ResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/100031?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtree100031ResponseData> storageUnitQtree100031WithHttpInfo(@Param("elid") String elid, StorageUnitQtree100031RequestData body, @QueryMap(encoded=true) StorageUnitQtree100031QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtree100031</code> method in a fluent style.
   */
  public static class StorageUnitQtree100031QueryParams extends HashMap<String, Object> {
    public StorageUnitQtree100031QueryParams sessionId(final String value) {
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
   * @return StorageUnitQtree100037ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/100037?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtree100037ResponseData storageUnitQtree100037(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtree100037RequestData body);

  /**
   * Get relations to VM datastore entities
   * Similar to <code>storageUnitQtree100037</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/100037?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtree100037ResponseData> storageUnitQtree100037WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtree100037RequestData body);


  /**
   * Get relations to VM datastore entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtree100037</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtree100037QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtree100037ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/100037?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtree100037ResponseData storageUnitQtree100037(@Param("elid") String elid, StorageUnitQtree100037RequestData body, @QueryMap(encoded=true) StorageUnitQtree100037QueryParams queryParams);

  /**
  * Get relations to VM datastore entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtree100037</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtree100037ResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/100037?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtree100037ResponseData> storageUnitQtree100037WithHttpInfo(@Param("elid") String elid, StorageUnitQtree100037RequestData body, @QueryMap(encoded=true) StorageUnitQtree100037QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtree100037</code> method in a fluent style.
   */
  public static class StorageUnitQtree100037QueryParams extends HashMap<String, Object> {
    public StorageUnitQtree100037QueryParams sessionId(final String value) {
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
   * @return StorageUnitQtreeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreeContractsResponseData storageUnitQtreeContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>storageUnitQtreeContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreeContractsResponseData> storageUnitQtreeContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtreeContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreeContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreeContractsResponseData storageUnitQtreeContracts(@Param("elid") String elid, StorageUnitQtreeContractsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtreeContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreeContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreeContractsResponseData> storageUnitQtreeContractsWithHttpInfo(@Param("elid") String elid, StorageUnitQtreeContractsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreeContracts</code> method in a fluent style.
   */
  public static class StorageUnitQtreeContractsQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreeContractsQueryParams sessionId(final String value) {
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
   * @return StorageUnitQtreeCustomServersBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/CustomServersBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreeCustomServersBaseResponseData storageUnitQtreeCustomServersBase(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeCustomServersBaseRequestData body);

  /**
   * Get relations to Server (base) entities
   * Similar to <code>storageUnitQtreeCustomServersBase</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/CustomServersBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreeCustomServersBaseResponseData> storageUnitQtreeCustomServersBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeCustomServersBaseRequestData body);


  /**
   * Get relations to Server (base) entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtreeCustomServersBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreeCustomServersBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreeCustomServersBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/CustomServersBase?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreeCustomServersBaseResponseData storageUnitQtreeCustomServersBase(@Param("elid") String elid, StorageUnitQtreeCustomServersBaseRequestData body, @QueryMap(encoded=true) StorageUnitQtreeCustomServersBaseQueryParams queryParams);

  /**
  * Get relations to Server (base) entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtreeCustomServersBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreeCustomServersBaseResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/CustomServersBase?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreeCustomServersBaseResponseData> storageUnitQtreeCustomServersBaseWithHttpInfo(@Param("elid") String elid, StorageUnitQtreeCustomServersBaseRequestData body, @QueryMap(encoded=true) StorageUnitQtreeCustomServersBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreeCustomServersBase</code> method in a fluent style.
   */
  public static class StorageUnitQtreeCustomServersBaseQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreeCustomServersBaseQueryParams sessionId(final String value) {
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
   * @return StorageUnitQtreeFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreeFileSystemsResponseData storageUnitQtreeFileSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeFileSystemsRequestData body);

  /**
   * Get relations to File system entities
   * Similar to <code>storageUnitQtreeFileSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreeFileSystemsResponseData> storageUnitQtreeFileSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeFileSystemsRequestData body);


  /**
   * Get relations to File system entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtreeFileSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreeFileSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreeFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreeFileSystemsResponseData storageUnitQtreeFileSystems(@Param("elid") String elid, StorageUnitQtreeFileSystemsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeFileSystemsQueryParams queryParams);

  /**
  * Get relations to File system entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtreeFileSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreeFileSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/FileSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreeFileSystemsResponseData> storageUnitQtreeFileSystemsWithHttpInfo(@Param("elid") String elid, StorageUnitQtreeFileSystemsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeFileSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreeFileSystems</code> method in a fluent style.
   */
  public static class StorageUnitQtreeFileSystemsQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreeFileSystemsQueryParams sessionId(final String value) {
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
   * @return StorageUnitQtreeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreeFrameContractsResponseData storageUnitQtreeFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>storageUnitQtreeFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreeFrameContractsResponseData> storageUnitQtreeFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtreeFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreeFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreeFrameContractsResponseData storageUnitQtreeFrameContracts(@Param("elid") String elid, StorageUnitQtreeFrameContractsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtreeFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreeFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreeFrameContractsResponseData> storageUnitQtreeFrameContractsWithHttpInfo(@Param("elid") String elid, StorageUnitQtreeFrameContractsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreeFrameContracts</code> method in a fluent style.
   */
  public static class StorageUnitQtreeFrameContractsQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreeFrameContractsQueryParams sessionId(final String value) {
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
   * @return StorageUnitQtreeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreeMaintenanceContractsResponseData storageUnitQtreeMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>storageUnitQtreeMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreeMaintenanceContractsResponseData> storageUnitQtreeMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtreeMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreeMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreeMaintenanceContractsResponseData storageUnitQtreeMaintenanceContracts(@Param("elid") String elid, StorageUnitQtreeMaintenanceContractsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtreeMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreeMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreeMaintenanceContractsResponseData> storageUnitQtreeMaintenanceContractsWithHttpInfo(@Param("elid") String elid, StorageUnitQtreeMaintenanceContractsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreeMaintenanceContracts</code> method in a fluent style.
   */
  public static class StorageUnitQtreeMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreeMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return StorageUnitQtreeMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreeMaintenanceWindowsResponseData storageUnitQtreeMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>storageUnitQtreeMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreeMaintenanceWindowsResponseData> storageUnitQtreeMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtreeMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreeMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreeMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreeMaintenanceWindowsResponseData storageUnitQtreeMaintenanceWindows(@Param("elid") String elid, StorageUnitQtreeMaintenanceWindowsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtreeMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreeMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreeMaintenanceWindowsResponseData> storageUnitQtreeMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, StorageUnitQtreeMaintenanceWindowsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreeMaintenanceWindows</code> method in a fluent style.
   */
  public static class StorageUnitQtreeMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreeMaintenanceWindowsQueryParams sessionId(final String value) {
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
   * @return StorageUnitQtreeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreeOrganizationsResponseData storageUnitQtreeOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>storageUnitQtreeOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreeOrganizationsResponseData> storageUnitQtreeOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtreeOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreeOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreeOrganizationsResponseData storageUnitQtreeOrganizations(@Param("elid") String elid, StorageUnitQtreeOrganizationsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtreeOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreeOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreeOrganizationsResponseData> storageUnitQtreeOrganizationsWithHttpInfo(@Param("elid") String elid, StorageUnitQtreeOrganizationsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreeOrganizations</code> method in a fluent style.
   */
  public static class StorageUnitQtreeOrganizationsQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreeOrganizationsQueryParams sessionId(final String value) {
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
   * @return StorageUnitQtreePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreePersonGroupsResponseData storageUnitQtreePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>storageUnitQtreePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreePersonGroupsResponseData> storageUnitQtreePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtreePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreePersonGroupsResponseData storageUnitQtreePersonGroups(@Param("elid") String elid, StorageUnitQtreePersonGroupsRequestData body, @QueryMap(encoded=true) StorageUnitQtreePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtreePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreePersonGroupsResponseData> storageUnitQtreePersonGroupsWithHttpInfo(@Param("elid") String elid, StorageUnitQtreePersonGroupsRequestData body, @QueryMap(encoded=true) StorageUnitQtreePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreePersonGroups</code> method in a fluent style.
   */
  public static class StorageUnitQtreePersonGroupsQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreePersonGroupsQueryParams sessionId(final String value) {
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
   * @return StorageUnitQtreePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreePersonsResponseData storageUnitQtreePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>storageUnitQtreePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreePersonsResponseData> storageUnitQtreePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtreePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreePersonsResponseData storageUnitQtreePersons(@Param("elid") String elid, StorageUnitQtreePersonsRequestData body, @QueryMap(encoded=true) StorageUnitQtreePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtreePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreePersonsResponseData> storageUnitQtreePersonsWithHttpInfo(@Param("elid") String elid, StorageUnitQtreePersonsRequestData body, @QueryMap(encoded=true) StorageUnitQtreePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreePersons</code> method in a fluent style.
   */
  public static class StorageUnitQtreePersonsQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageUnitQtreeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreeQueryResponse storageUnitQtreeQuery(@Param("sessionId") String sessionId, StorageUnitQtreeQueryRequest body);

  /**
   * Basic query
   * Similar to <code>storageUnitQtreeQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreeQueryResponse> storageUnitQtreeQueryWithHttpInfo(@Param("sessionId") String sessionId, StorageUnitQtreeQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>storageUnitQtreeQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreeQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreeQueryResponse storageUnitQtreeQuery(StorageUnitQtreeQueryRequest body, @QueryMap(encoded=true) StorageUnitQtreeQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>storageUnitQtreeQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreeQueryResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreeQueryResponse> storageUnitQtreeQueryWithHttpInfo(StorageUnitQtreeQueryRequest body, @QueryMap(encoded=true) StorageUnitQtreeQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreeQuery</code> method in a fluent style.
   */
  public static class StorageUnitQtreeQueryQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreeQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Share entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageUnitQtreeSharesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Shares?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreeSharesResponseData storageUnitQtreeShares(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeSharesRequestData body);

  /**
   * Get relations to Share entities
   * Similar to <code>storageUnitQtreeShares</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Shares?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreeSharesResponseData> storageUnitQtreeSharesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeSharesRequestData body);


  /**
   * Get relations to Share entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtreeShares</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreeSharesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreeSharesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Shares?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreeSharesResponseData storageUnitQtreeShares(@Param("elid") String elid, StorageUnitQtreeSharesRequestData body, @QueryMap(encoded=true) StorageUnitQtreeSharesQueryParams queryParams);

  /**
  * Get relations to Share entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtreeShares</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreeSharesResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/Shares?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreeSharesResponseData> storageUnitQtreeSharesWithHttpInfo(@Param("elid") String elid, StorageUnitQtreeSharesRequestData body, @QueryMap(encoded=true) StorageUnitQtreeSharesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreeShares</code> method in a fluent style.
   */
  public static class StorageUnitQtreeSharesQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreeSharesQueryParams sessionId(final String value) {
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
   * @return StorageUnitQtreeStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreeStorageUnitsResponseData storageUnitQtreeStorageUnits(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeStorageUnitsRequestData body);

  /**
   * Get relations to Storage unit entities
   * Similar to <code>storageUnitQtreeStorageUnits</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreeStorageUnitsResponseData> storageUnitQtreeStorageUnitsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeStorageUnitsRequestData body);


  /**
   * Get relations to Storage unit entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtreeStorageUnits</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreeStorageUnitsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreeStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreeStorageUnitsResponseData storageUnitQtreeStorageUnits(@Param("elid") String elid, StorageUnitQtreeStorageUnitsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeStorageUnitsQueryParams queryParams);

  /**
  * Get relations to Storage unit entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtreeStorageUnits</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreeStorageUnitsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/StorageUnits?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreeStorageUnitsResponseData> storageUnitQtreeStorageUnitsWithHttpInfo(@Param("elid") String elid, StorageUnitQtreeStorageUnitsRequestData body, @QueryMap(encoded=true) StorageUnitQtreeStorageUnitsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreeStorageUnits</code> method in a fluent style.
   */
  public static class StorageUnitQtreeStorageUnitsQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreeStorageUnitsQueryParams sessionId(final String value) {
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
   * @return StorageUnitQtreeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreeSystemAttributesResponse storageUnitQtreeSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>storageUnitQtreeSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreeSystemAttributesResponse> storageUnitQtreeSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>storageUnitQtreeSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreeSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreeSystemAttributesResponse storageUnitQtreeSystemAttributes(@Param("elid") String elid, StorageUnitQtreeSystemAttributesRequest body, @QueryMap(encoded=true) StorageUnitQtreeSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>storageUnitQtreeSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreeSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreeSystemAttributesResponse> storageUnitQtreeSystemAttributesWithHttpInfo(@Param("elid") String elid, StorageUnitQtreeSystemAttributesRequest body, @QueryMap(encoded=true) StorageUnitQtreeSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreeSystemAttributes</code> method in a fluent style.
   */
  public static class StorageUnitQtreeSystemAttributesQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreeSystemAttributesQueryParams sessionId(final String value) {
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
   * @return StorageUnitQtreeVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQtreeVirtualNasServersResponseData storageUnitQtreeVirtualNasServers(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeVirtualNasServersRequestData body);

  /**
   * Get relations to Virtual NAS server entities
   * Similar to <code>storageUnitQtreeVirtualNasServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQtreeVirtualNasServersResponseData> storageUnitQtreeVirtualNasServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitQtreeVirtualNasServersRequestData body);


  /**
   * Get relations to Virtual NAS server entities
   * 
   * Note, this is equivalent to the other <code>storageUnitQtreeVirtualNasServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQtreeVirtualNasServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQtreeVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQtreeVirtualNasServersResponseData storageUnitQtreeVirtualNasServers(@Param("elid") String elid, StorageUnitQtreeVirtualNasServersRequestData body, @QueryMap(encoded=true) StorageUnitQtreeVirtualNasServersQueryParams queryParams);

  /**
  * Get relations to Virtual NAS server entities
  * 
  * Note, this is equivalent to the other <code>storageUnitQtreeVirtualNasServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQtreeVirtualNasServersResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/VirtualNasServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQtreeVirtualNasServersResponseData> storageUnitQtreeVirtualNasServersWithHttpInfo(@Param("elid") String elid, StorageUnitQtreeVirtualNasServersRequestData body, @QueryMap(encoded=true) StorageUnitQtreeVirtualNasServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQtreeVirtualNasServers</code> method in a fluent style.
   */
  public static class StorageUnitQtreeVirtualNasServersQueryParams extends HashMap<String, Object> {
    public StorageUnitQtreeVirtualNasServersQueryParams sessionId(final String value) {
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
   * @return UpdateStorageUnitQtreeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateStorageUnitQtreeResponse updateStorageUnitQtree(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateStorageUnitQtreeRequestData body);

  /**
   * Modify
   * Similar to <code>updateStorageUnitQtree</code> but it also returns the http response headers .
   * Modify storage unit
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateStorageUnitQtreeResponse> updateStorageUnitQtreeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateStorageUnitQtreeRequestData body);


  /**
   * Modify
   * Modify storage unit
   * Note, this is equivalent to the other <code>updateStorageUnitQtree</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateStorageUnitQtreeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateStorageUnitQtreeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateStorageUnitQtreeResponse updateStorageUnitQtree(@Param("elid") String elid, UpdateStorageUnitQtreeRequestData body, @QueryMap(encoded=true) UpdateStorageUnitQtreeQueryParams queryParams);

  /**
  * Modify
  * Modify storage unit
  * Note, this is equivalent to the other <code>updateStorageUnitQtree</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateStorageUnitQtreeResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateStorageUnitQtreeResponse> updateStorageUnitQtreeWithHttpInfo(@Param("elid") String elid, UpdateStorageUnitQtreeRequestData body, @QueryMap(encoded=true) UpdateStorageUnitQtreeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateStorageUnitQtree</code> method in a fluent style.
   */
  public static class UpdateStorageUnitQtreeQueryParams extends HashMap<String, Object> {
    public UpdateStorageUnitQtreeQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesStorageUnitQtreeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesStorageUnitQtreeResponse updateSystemAttributesStorageUnitQtree(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageUnitQtreeRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesStorageUnitQtree</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesStorageUnitQtreeResponse> updateSystemAttributesStorageUnitQtreeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageUnitQtreeRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesStorageUnitQtree</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesStorageUnitQtreeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesStorageUnitQtreeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesStorageUnitQtreeResponse updateSystemAttributesStorageUnitQtree(@Param("elid") String elid, UpdateSystemAttributesStorageUnitQtreeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageUnitQtreeQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesStorageUnitQtree</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesStorageUnitQtreeResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitQtree/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesStorageUnitQtreeResponse> updateSystemAttributesStorageUnitQtreeWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesStorageUnitQtreeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageUnitQtreeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesStorageUnitQtree</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesStorageUnitQtreeQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesStorageUnitQtreeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
