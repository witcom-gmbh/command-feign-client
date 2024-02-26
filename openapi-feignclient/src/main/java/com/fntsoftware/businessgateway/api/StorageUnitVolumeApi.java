package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateStorageUnitVolumeRequestData;
import com.fntsoftware.businessgateway.entities.CreateStorageUnitVolumeResponse;
import com.fntsoftware.businessgateway.entities.DeleteStorageUnitVolumeRequestData;
import com.fntsoftware.businessgateway.entities.DeleteStorageUnitVolumeResponse;
import com.fntsoftware.businessgateway.entities.StorageUnitVolume100022RequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolume100022ResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolume100031RequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolume100031ResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolume100037RequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolume100037ResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeCustomServersRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeCustomServersResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeFileSystemsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeFileSystemsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumePersonsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumePersonsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeQueryRequest;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeQueryResponse;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeSharesRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeSharesResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeStorageUnitsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeStorageUnitsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeVirtualNasServersRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitVolumeVirtualNasServersResponseData;
import com.fntsoftware.businessgateway.entities.UpdateStorageUnitVolumeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateStorageUnitVolumeResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitVolumeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitVolumeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface StorageUnitVolumeApi extends ApiClient.Api {


  /**
   * Create
   * Create storage unit
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateStorageUnitVolumeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateStorageUnitVolumeResponse createStorageUnitVolume(@Param("sessionId") String sessionId, CreateStorageUnitVolumeRequestData body);

  /**
   * Create
   * Similar to <code>createStorageUnitVolume</code> but it also returns the http response headers .
   * Create storage unit
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateStorageUnitVolumeResponse> createStorageUnitVolumeWithHttpInfo(@Param("sessionId") String sessionId, CreateStorageUnitVolumeRequestData body);


  /**
   * Create
   * Create storage unit
   * Note, this is equivalent to the other <code>createStorageUnitVolume</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateStorageUnitVolumeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateStorageUnitVolumeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateStorageUnitVolumeResponse createStorageUnitVolume(CreateStorageUnitVolumeRequestData body, @QueryMap(encoded=true) CreateStorageUnitVolumeQueryParams queryParams);

  /**
  * Create
  * Create storage unit
  * Note, this is equivalent to the other <code>createStorageUnitVolume</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateStorageUnitVolumeResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateStorageUnitVolumeResponse> createStorageUnitVolumeWithHttpInfo(CreateStorageUnitVolumeRequestData body, @QueryMap(encoded=true) CreateStorageUnitVolumeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createStorageUnitVolume</code> method in a fluent style.
   */
  public static class CreateStorageUnitVolumeQueryParams extends HashMap<String, Object> {
    public CreateStorageUnitVolumeQueryParams sessionId(final String value) {
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
   * @return DeleteStorageUnitVolumeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteStorageUnitVolumeResponse deleteStorageUnitVolume(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteStorageUnitVolumeRequestData body);

  /**
   * Delete
   * Similar to <code>deleteStorageUnitVolume</code> but it also returns the http response headers .
   * Delete storage unit
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteStorageUnitVolumeResponse> deleteStorageUnitVolumeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteStorageUnitVolumeRequestData body);


  /**
   * Delete
   * Delete storage unit
   * Note, this is equivalent to the other <code>deleteStorageUnitVolume</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteStorageUnitVolumeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteStorageUnitVolumeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteStorageUnitVolumeResponse deleteStorageUnitVolume(@Param("elid") String elid, DeleteStorageUnitVolumeRequestData body, @QueryMap(encoded=true) DeleteStorageUnitVolumeQueryParams queryParams);

  /**
  * Delete
  * Delete storage unit
  * Note, this is equivalent to the other <code>deleteStorageUnitVolume</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteStorageUnitVolumeResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteStorageUnitVolumeResponse> deleteStorageUnitVolumeWithHttpInfo(@Param("elid") String elid, DeleteStorageUnitVolumeRequestData body, @QueryMap(encoded=true) DeleteStorageUnitVolumeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteStorageUnitVolume</code> method in a fluent style.
   */
  public static class DeleteStorageUnitVolumeQueryParams extends HashMap<String, Object> {
    public DeleteStorageUnitVolumeQueryParams sessionId(final String value) {
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
   * @return StorageUnitVolume100022ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/100022?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolume100022ResponseData storageUnitVolume100022(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolume100022RequestData body);

  /**
   * Get relations to Storage product entities
   * Similar to <code>storageUnitVolume100022</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/100022?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolume100022ResponseData> storageUnitVolume100022WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolume100022RequestData body);


  /**
   * Get relations to Storage product entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolume100022</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolume100022QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolume100022ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/100022?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolume100022ResponseData storageUnitVolume100022(@Param("elid") String elid, StorageUnitVolume100022RequestData body, @QueryMap(encoded=true) StorageUnitVolume100022QueryParams queryParams);

  /**
  * Get relations to Storage product entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolume100022</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolume100022ResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/100022?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolume100022ResponseData> storageUnitVolume100022WithHttpInfo(@Param("elid") String elid, StorageUnitVolume100022RequestData body, @QueryMap(encoded=true) StorageUnitVolume100022QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolume100022</code> method in a fluent style.
   */
  public static class StorageUnitVolume100022QueryParams extends HashMap<String, Object> {
    public StorageUnitVolume100022QueryParams sessionId(final String value) {
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
   * @return StorageUnitVolume100031ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/100031?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolume100031ResponseData storageUnitVolume100031(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolume100031RequestData body);

  /**
   * Get relations to Virtual disk entities
   * Similar to <code>storageUnitVolume100031</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/100031?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolume100031ResponseData> storageUnitVolume100031WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolume100031RequestData body);


  /**
   * Get relations to Virtual disk entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolume100031</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolume100031QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolume100031ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/100031?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolume100031ResponseData storageUnitVolume100031(@Param("elid") String elid, StorageUnitVolume100031RequestData body, @QueryMap(encoded=true) StorageUnitVolume100031QueryParams queryParams);

  /**
  * Get relations to Virtual disk entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolume100031</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolume100031ResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/100031?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolume100031ResponseData> storageUnitVolume100031WithHttpInfo(@Param("elid") String elid, StorageUnitVolume100031RequestData body, @QueryMap(encoded=true) StorageUnitVolume100031QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolume100031</code> method in a fluent style.
   */
  public static class StorageUnitVolume100031QueryParams extends HashMap<String, Object> {
    public StorageUnitVolume100031QueryParams sessionId(final String value) {
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
   * @return StorageUnitVolume100037ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/100037?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolume100037ResponseData storageUnitVolume100037(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolume100037RequestData body);

  /**
   * Get relations to VM datastore entities
   * Similar to <code>storageUnitVolume100037</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/100037?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolume100037ResponseData> storageUnitVolume100037WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolume100037RequestData body);


  /**
   * Get relations to VM datastore entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolume100037</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolume100037QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolume100037ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/100037?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolume100037ResponseData storageUnitVolume100037(@Param("elid") String elid, StorageUnitVolume100037RequestData body, @QueryMap(encoded=true) StorageUnitVolume100037QueryParams queryParams);

  /**
  * Get relations to VM datastore entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolume100037</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolume100037ResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/100037?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolume100037ResponseData> storageUnitVolume100037WithHttpInfo(@Param("elid") String elid, StorageUnitVolume100037RequestData body, @QueryMap(encoded=true) StorageUnitVolume100037QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolume100037</code> method in a fluent style.
   */
  public static class StorageUnitVolume100037QueryParams extends HashMap<String, Object> {
    public StorageUnitVolume100037QueryParams sessionId(final String value) {
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
   * @return StorageUnitVolumeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumeContractsResponseData storageUnitVolumeContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>storageUnitVolumeContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumeContractsResponseData> storageUnitVolumeContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolumeContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumeContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumeContractsResponseData storageUnitVolumeContracts(@Param("elid") String elid, StorageUnitVolumeContractsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolumeContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumeContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumeContractsResponseData> storageUnitVolumeContractsWithHttpInfo(@Param("elid") String elid, StorageUnitVolumeContractsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumeContracts</code> method in a fluent style.
   */
  public static class StorageUnitVolumeContractsQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumeContractsQueryParams sessionId(final String value) {
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
   * @return StorageUnitVolumeCustomServersResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/CustomServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumeCustomServersResponseData storageUnitVolumeCustomServers(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeCustomServersRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>storageUnitVolumeCustomServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/CustomServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumeCustomServersResponseData> storageUnitVolumeCustomServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeCustomServersRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolumeCustomServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumeCustomServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumeCustomServersResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/CustomServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumeCustomServersResponseData storageUnitVolumeCustomServers(@Param("elid") String elid, StorageUnitVolumeCustomServersRequestData body, @QueryMap(encoded=true) StorageUnitVolumeCustomServersQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolumeCustomServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumeCustomServersResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/CustomServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumeCustomServersResponseData> storageUnitVolumeCustomServersWithHttpInfo(@Param("elid") String elid, StorageUnitVolumeCustomServersRequestData body, @QueryMap(encoded=true) StorageUnitVolumeCustomServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumeCustomServers</code> method in a fluent style.
   */
  public static class StorageUnitVolumeCustomServersQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumeCustomServersQueryParams sessionId(final String value) {
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
   * @return StorageUnitVolumeFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumeFileSystemsResponseData storageUnitVolumeFileSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeFileSystemsRequestData body);

  /**
   * Get relations to File system entities
   * Similar to <code>storageUnitVolumeFileSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumeFileSystemsResponseData> storageUnitVolumeFileSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeFileSystemsRequestData body);


  /**
   * Get relations to File system entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolumeFileSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumeFileSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumeFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumeFileSystemsResponseData storageUnitVolumeFileSystems(@Param("elid") String elid, StorageUnitVolumeFileSystemsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeFileSystemsQueryParams queryParams);

  /**
  * Get relations to File system entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolumeFileSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumeFileSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/FileSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumeFileSystemsResponseData> storageUnitVolumeFileSystemsWithHttpInfo(@Param("elid") String elid, StorageUnitVolumeFileSystemsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeFileSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumeFileSystems</code> method in a fluent style.
   */
  public static class StorageUnitVolumeFileSystemsQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumeFileSystemsQueryParams sessionId(final String value) {
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
   * @return StorageUnitVolumeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumeFrameContractsResponseData storageUnitVolumeFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>storageUnitVolumeFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumeFrameContractsResponseData> storageUnitVolumeFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolumeFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumeFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumeFrameContractsResponseData storageUnitVolumeFrameContracts(@Param("elid") String elid, StorageUnitVolumeFrameContractsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolumeFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumeFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumeFrameContractsResponseData> storageUnitVolumeFrameContractsWithHttpInfo(@Param("elid") String elid, StorageUnitVolumeFrameContractsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumeFrameContracts</code> method in a fluent style.
   */
  public static class StorageUnitVolumeFrameContractsQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumeFrameContractsQueryParams sessionId(final String value) {
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
   * @return StorageUnitVolumeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumeMaintenanceContractsResponseData storageUnitVolumeMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>storageUnitVolumeMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumeMaintenanceContractsResponseData> storageUnitVolumeMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolumeMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumeMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumeMaintenanceContractsResponseData storageUnitVolumeMaintenanceContracts(@Param("elid") String elid, StorageUnitVolumeMaintenanceContractsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolumeMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumeMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumeMaintenanceContractsResponseData> storageUnitVolumeMaintenanceContractsWithHttpInfo(@Param("elid") String elid, StorageUnitVolumeMaintenanceContractsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumeMaintenanceContracts</code> method in a fluent style.
   */
  public static class StorageUnitVolumeMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumeMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return StorageUnitVolumeMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumeMaintenanceWindowsResponseData storageUnitVolumeMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>storageUnitVolumeMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumeMaintenanceWindowsResponseData> storageUnitVolumeMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolumeMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumeMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumeMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumeMaintenanceWindowsResponseData storageUnitVolumeMaintenanceWindows(@Param("elid") String elid, StorageUnitVolumeMaintenanceWindowsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolumeMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumeMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumeMaintenanceWindowsResponseData> storageUnitVolumeMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, StorageUnitVolumeMaintenanceWindowsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumeMaintenanceWindows</code> method in a fluent style.
   */
  public static class StorageUnitVolumeMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumeMaintenanceWindowsQueryParams sessionId(final String value) {
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
   * @return StorageUnitVolumeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumeOrganizationsResponseData storageUnitVolumeOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>storageUnitVolumeOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumeOrganizationsResponseData> storageUnitVolumeOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolumeOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumeOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumeOrganizationsResponseData storageUnitVolumeOrganizations(@Param("elid") String elid, StorageUnitVolumeOrganizationsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolumeOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumeOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumeOrganizationsResponseData> storageUnitVolumeOrganizationsWithHttpInfo(@Param("elid") String elid, StorageUnitVolumeOrganizationsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumeOrganizations</code> method in a fluent style.
   */
  public static class StorageUnitVolumeOrganizationsQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumeOrganizationsQueryParams sessionId(final String value) {
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
   * @return StorageUnitVolumePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumePersonGroupsResponseData storageUnitVolumePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>storageUnitVolumePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumePersonGroupsResponseData> storageUnitVolumePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolumePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumePersonGroupsResponseData storageUnitVolumePersonGroups(@Param("elid") String elid, StorageUnitVolumePersonGroupsRequestData body, @QueryMap(encoded=true) StorageUnitVolumePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolumePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumePersonGroupsResponseData> storageUnitVolumePersonGroupsWithHttpInfo(@Param("elid") String elid, StorageUnitVolumePersonGroupsRequestData body, @QueryMap(encoded=true) StorageUnitVolumePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumePersonGroups</code> method in a fluent style.
   */
  public static class StorageUnitVolumePersonGroupsQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumePersonGroupsQueryParams sessionId(final String value) {
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
   * @return StorageUnitVolumePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumePersonsResponseData storageUnitVolumePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>storageUnitVolumePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumePersonsResponseData> storageUnitVolumePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolumePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumePersonsResponseData storageUnitVolumePersons(@Param("elid") String elid, StorageUnitVolumePersonsRequestData body, @QueryMap(encoded=true) StorageUnitVolumePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolumePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumePersonsResponseData> storageUnitVolumePersonsWithHttpInfo(@Param("elid") String elid, StorageUnitVolumePersonsRequestData body, @QueryMap(encoded=true) StorageUnitVolumePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumePersons</code> method in a fluent style.
   */
  public static class StorageUnitVolumePersonsQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageUnitVolumeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumeQueryResponse storageUnitVolumeQuery(@Param("sessionId") String sessionId, StorageUnitVolumeQueryRequest body);

  /**
   * Basic query
   * Similar to <code>storageUnitVolumeQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumeQueryResponse> storageUnitVolumeQueryWithHttpInfo(@Param("sessionId") String sessionId, StorageUnitVolumeQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>storageUnitVolumeQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumeQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumeQueryResponse storageUnitVolumeQuery(StorageUnitVolumeQueryRequest body, @QueryMap(encoded=true) StorageUnitVolumeQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>storageUnitVolumeQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumeQueryResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumeQueryResponse> storageUnitVolumeQueryWithHttpInfo(StorageUnitVolumeQueryRequest body, @QueryMap(encoded=true) StorageUnitVolumeQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumeQuery</code> method in a fluent style.
   */
  public static class StorageUnitVolumeQueryQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumeQueryQueryParams sessionId(final String value) {
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
   * @return StorageUnitVolumeSharesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Shares?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumeSharesResponseData storageUnitVolumeShares(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeSharesRequestData body);

  /**
   * Get relations to Share entities
   * Similar to <code>storageUnitVolumeShares</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Shares?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumeSharesResponseData> storageUnitVolumeSharesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeSharesRequestData body);


  /**
   * Get relations to Share entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolumeShares</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumeSharesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumeSharesResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Shares?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumeSharesResponseData storageUnitVolumeShares(@Param("elid") String elid, StorageUnitVolumeSharesRequestData body, @QueryMap(encoded=true) StorageUnitVolumeSharesQueryParams queryParams);

  /**
  * Get relations to Share entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolumeShares</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumeSharesResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/Shares?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumeSharesResponseData> storageUnitVolumeSharesWithHttpInfo(@Param("elid") String elid, StorageUnitVolumeSharesRequestData body, @QueryMap(encoded=true) StorageUnitVolumeSharesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumeShares</code> method in a fluent style.
   */
  public static class StorageUnitVolumeSharesQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumeSharesQueryParams sessionId(final String value) {
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
   * @return StorageUnitVolumeStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumeStorageUnitsResponseData storageUnitVolumeStorageUnits(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeStorageUnitsRequestData body);

  /**
   * Get relations to Storage unit entities
   * Similar to <code>storageUnitVolumeStorageUnits</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumeStorageUnitsResponseData> storageUnitVolumeStorageUnitsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeStorageUnitsRequestData body);


  /**
   * Get relations to Storage unit entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolumeStorageUnits</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumeStorageUnitsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumeStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumeStorageUnitsResponseData storageUnitVolumeStorageUnits(@Param("elid") String elid, StorageUnitVolumeStorageUnitsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeStorageUnitsQueryParams queryParams);

  /**
  * Get relations to Storage unit entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolumeStorageUnits</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumeStorageUnitsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/StorageUnits?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumeStorageUnitsResponseData> storageUnitVolumeStorageUnitsWithHttpInfo(@Param("elid") String elid, StorageUnitVolumeStorageUnitsRequestData body, @QueryMap(encoded=true) StorageUnitVolumeStorageUnitsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumeStorageUnits</code> method in a fluent style.
   */
  public static class StorageUnitVolumeStorageUnitsQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumeStorageUnitsQueryParams sessionId(final String value) {
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
   * @return StorageUnitVolumeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumeSystemAttributesResponse storageUnitVolumeSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>storageUnitVolumeSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumeSystemAttributesResponse> storageUnitVolumeSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>storageUnitVolumeSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumeSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumeSystemAttributesResponse storageUnitVolumeSystemAttributes(@Param("elid") String elid, StorageUnitVolumeSystemAttributesRequest body, @QueryMap(encoded=true) StorageUnitVolumeSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>storageUnitVolumeSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumeSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumeSystemAttributesResponse> storageUnitVolumeSystemAttributesWithHttpInfo(@Param("elid") String elid, StorageUnitVolumeSystemAttributesRequest body, @QueryMap(encoded=true) StorageUnitVolumeSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumeSystemAttributes</code> method in a fluent style.
   */
  public static class StorageUnitVolumeSystemAttributesQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumeSystemAttributesQueryParams sessionId(final String value) {
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
   * @return StorageUnitVolumeVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitVolumeVirtualNasServersResponseData storageUnitVolumeVirtualNasServers(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeVirtualNasServersRequestData body);

  /**
   * Get relations to Virtual NAS server entities
   * Similar to <code>storageUnitVolumeVirtualNasServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitVolumeVirtualNasServersResponseData> storageUnitVolumeVirtualNasServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitVolumeVirtualNasServersRequestData body);


  /**
   * Get relations to Virtual NAS server entities
   * 
   * Note, this is equivalent to the other <code>storageUnitVolumeVirtualNasServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitVolumeVirtualNasServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitVolumeVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitVolumeVirtualNasServersResponseData storageUnitVolumeVirtualNasServers(@Param("elid") String elid, StorageUnitVolumeVirtualNasServersRequestData body, @QueryMap(encoded=true) StorageUnitVolumeVirtualNasServersQueryParams queryParams);

  /**
  * Get relations to Virtual NAS server entities
  * 
  * Note, this is equivalent to the other <code>storageUnitVolumeVirtualNasServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitVolumeVirtualNasServersResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/VirtualNasServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitVolumeVirtualNasServersResponseData> storageUnitVolumeVirtualNasServersWithHttpInfo(@Param("elid") String elid, StorageUnitVolumeVirtualNasServersRequestData body, @QueryMap(encoded=true) StorageUnitVolumeVirtualNasServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitVolumeVirtualNasServers</code> method in a fluent style.
   */
  public static class StorageUnitVolumeVirtualNasServersQueryParams extends HashMap<String, Object> {
    public StorageUnitVolumeVirtualNasServersQueryParams sessionId(final String value) {
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
   * @return UpdateStorageUnitVolumeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateStorageUnitVolumeResponse updateStorageUnitVolume(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateStorageUnitVolumeRequestData body);

  /**
   * Modify
   * Similar to <code>updateStorageUnitVolume</code> but it also returns the http response headers .
   * Modify storage unit
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateStorageUnitVolumeResponse> updateStorageUnitVolumeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateStorageUnitVolumeRequestData body);


  /**
   * Modify
   * Modify storage unit
   * Note, this is equivalent to the other <code>updateStorageUnitVolume</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateStorageUnitVolumeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateStorageUnitVolumeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateStorageUnitVolumeResponse updateStorageUnitVolume(@Param("elid") String elid, UpdateStorageUnitVolumeRequestData body, @QueryMap(encoded=true) UpdateStorageUnitVolumeQueryParams queryParams);

  /**
  * Modify
  * Modify storage unit
  * Note, this is equivalent to the other <code>updateStorageUnitVolume</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateStorageUnitVolumeResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateStorageUnitVolumeResponse> updateStorageUnitVolumeWithHttpInfo(@Param("elid") String elid, UpdateStorageUnitVolumeRequestData body, @QueryMap(encoded=true) UpdateStorageUnitVolumeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateStorageUnitVolume</code> method in a fluent style.
   */
  public static class UpdateStorageUnitVolumeQueryParams extends HashMap<String, Object> {
    public UpdateStorageUnitVolumeQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesStorageUnitVolumeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesStorageUnitVolumeResponse updateSystemAttributesStorageUnitVolume(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageUnitVolumeRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesStorageUnitVolume</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesStorageUnitVolumeResponse> updateSystemAttributesStorageUnitVolumeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageUnitVolumeRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesStorageUnitVolume</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesStorageUnitVolumeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesStorageUnitVolumeResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesStorageUnitVolumeResponse updateSystemAttributesStorageUnitVolume(@Param("elid") String elid, UpdateSystemAttributesStorageUnitVolumeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageUnitVolumeQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesStorageUnitVolume</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesStorageUnitVolumeResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnitVolume/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesStorageUnitVolumeResponse> updateSystemAttributesStorageUnitVolumeWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesStorageUnitVolumeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageUnitVolumeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesStorageUnitVolume</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesStorageUnitVolumeQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesStorageUnitVolumeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
