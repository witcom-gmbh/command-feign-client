package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.StorageUnit100022RequestData;
import com.fntsoftware.businessgateway.entities.StorageUnit100022ResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnit100031RequestData;
import com.fntsoftware.businessgateway.entities.StorageUnit100031ResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnit100037RequestData;
import com.fntsoftware.businessgateway.entities.StorageUnit100037ResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitCustomServersBaseRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitCustomServersBaseResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitFileSystemsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitFileSystemsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitMaintenanceWindowsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitMaintenanceWindowsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitPersonsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitPersonsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitQueryRequest;
import com.fntsoftware.businessgateway.entities.StorageUnitQueryResponse;
import com.fntsoftware.businessgateway.entities.StorageUnitStorageUnitsRequestData;
import com.fntsoftware.businessgateway.entities.StorageUnitStorageUnitsResponseData;
import com.fntsoftware.businessgateway.entities.StorageUnitSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.StorageUnitSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesStorageUnitResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface StorageUnitApi extends ApiClient.Api {


  /**
   * Get relations to Storage product entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return StorageUnit100022ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/100022?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnit100022ResponseData storageUnit100022(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnit100022RequestData body);

  /**
   * Get relations to Storage product entities
   * Similar to <code>storageUnit100022</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/100022?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnit100022ResponseData> storageUnit100022WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnit100022RequestData body);


  /**
   * Get relations to Storage product entities
   * 
   * Note, this is equivalent to the other <code>storageUnit100022</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnit100022QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnit100022ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/100022?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnit100022ResponseData storageUnit100022(@Param("elid") String elid, StorageUnit100022RequestData body, @QueryMap(encoded=true) StorageUnit100022QueryParams queryParams);

  /**
  * Get relations to Storage product entities
  * 
  * Note, this is equivalent to the other <code>storageUnit100022</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnit100022ResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnit/{elid}/100022?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnit100022ResponseData> storageUnit100022WithHttpInfo(@Param("elid") String elid, StorageUnit100022RequestData body, @QueryMap(encoded=true) StorageUnit100022QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnit100022</code> method in a fluent style.
   */
  public static class StorageUnit100022QueryParams extends HashMap<String, Object> {
    public StorageUnit100022QueryParams sessionId(final String value) {
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
   * @return StorageUnit100031ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/100031?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnit100031ResponseData storageUnit100031(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnit100031RequestData body);

  /**
   * Get relations to Virtual disk entities
   * Similar to <code>storageUnit100031</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/100031?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnit100031ResponseData> storageUnit100031WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnit100031RequestData body);


  /**
   * Get relations to Virtual disk entities
   * 
   * Note, this is equivalent to the other <code>storageUnit100031</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnit100031QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnit100031ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/100031?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnit100031ResponseData storageUnit100031(@Param("elid") String elid, StorageUnit100031RequestData body, @QueryMap(encoded=true) StorageUnit100031QueryParams queryParams);

  /**
  * Get relations to Virtual disk entities
  * 
  * Note, this is equivalent to the other <code>storageUnit100031</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnit100031ResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnit/{elid}/100031?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnit100031ResponseData> storageUnit100031WithHttpInfo(@Param("elid") String elid, StorageUnit100031RequestData body, @QueryMap(encoded=true) StorageUnit100031QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnit100031</code> method in a fluent style.
   */
  public static class StorageUnit100031QueryParams extends HashMap<String, Object> {
    public StorageUnit100031QueryParams sessionId(final String value) {
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
   * @return StorageUnit100037ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/100037?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnit100037ResponseData storageUnit100037(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnit100037RequestData body);

  /**
   * Get relations to VM datastore entities
   * Similar to <code>storageUnit100037</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/100037?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnit100037ResponseData> storageUnit100037WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnit100037RequestData body);


  /**
   * Get relations to VM datastore entities
   * 
   * Note, this is equivalent to the other <code>storageUnit100037</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnit100037QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnit100037ResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/100037?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnit100037ResponseData storageUnit100037(@Param("elid") String elid, StorageUnit100037RequestData body, @QueryMap(encoded=true) StorageUnit100037QueryParams queryParams);

  /**
  * Get relations to VM datastore entities
  * 
  * Note, this is equivalent to the other <code>storageUnit100037</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnit100037ResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnit/{elid}/100037?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnit100037ResponseData> storageUnit100037WithHttpInfo(@Param("elid") String elid, StorageUnit100037RequestData body, @QueryMap(encoded=true) StorageUnit100037QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnit100037</code> method in a fluent style.
   */
  public static class StorageUnit100037QueryParams extends HashMap<String, Object> {
    public StorageUnit100037QueryParams sessionId(final String value) {
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
   * @return StorageUnitCustomServersBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/CustomServersBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitCustomServersBaseResponseData storageUnitCustomServersBase(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitCustomServersBaseRequestData body);

  /**
   * Get relations to Server (base) entities
   * Similar to <code>storageUnitCustomServersBase</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/CustomServersBase?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitCustomServersBaseResponseData> storageUnitCustomServersBaseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitCustomServersBaseRequestData body);


  /**
   * Get relations to Server (base) entities
   * 
   * Note, this is equivalent to the other <code>storageUnitCustomServersBase</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitCustomServersBaseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitCustomServersBaseResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/CustomServersBase?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitCustomServersBaseResponseData storageUnitCustomServersBase(@Param("elid") String elid, StorageUnitCustomServersBaseRequestData body, @QueryMap(encoded=true) StorageUnitCustomServersBaseQueryParams queryParams);

  /**
  * Get relations to Server (base) entities
  * 
  * Note, this is equivalent to the other <code>storageUnitCustomServersBase</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitCustomServersBaseResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnit/{elid}/CustomServersBase?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitCustomServersBaseResponseData> storageUnitCustomServersBaseWithHttpInfo(@Param("elid") String elid, StorageUnitCustomServersBaseRequestData body, @QueryMap(encoded=true) StorageUnitCustomServersBaseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitCustomServersBase</code> method in a fluent style.
   */
  public static class StorageUnitCustomServersBaseQueryParams extends HashMap<String, Object> {
    public StorageUnitCustomServersBaseQueryParams sessionId(final String value) {
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
   * @return StorageUnitFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitFileSystemsResponseData storageUnitFileSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitFileSystemsRequestData body);

  /**
   * Get relations to File system entities
   * Similar to <code>storageUnitFileSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitFileSystemsResponseData> storageUnitFileSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitFileSystemsRequestData body);


  /**
   * Get relations to File system entities
   * 
   * Note, this is equivalent to the other <code>storageUnitFileSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitFileSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitFileSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/FileSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitFileSystemsResponseData storageUnitFileSystems(@Param("elid") String elid, StorageUnitFileSystemsRequestData body, @QueryMap(encoded=true) StorageUnitFileSystemsQueryParams queryParams);

  /**
  * Get relations to File system entities
  * 
  * Note, this is equivalent to the other <code>storageUnitFileSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitFileSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnit/{elid}/FileSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitFileSystemsResponseData> storageUnitFileSystemsWithHttpInfo(@Param("elid") String elid, StorageUnitFileSystemsRequestData body, @QueryMap(encoded=true) StorageUnitFileSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitFileSystems</code> method in a fluent style.
   */
  public static class StorageUnitFileSystemsQueryParams extends HashMap<String, Object> {
    public StorageUnitFileSystemsQueryParams sessionId(final String value) {
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
   * @return StorageUnitFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitFrameContractsResponseData storageUnitFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>storageUnitFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitFrameContractsResponseData> storageUnitFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>storageUnitFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitFrameContractsResponseData storageUnitFrameContracts(@Param("elid") String elid, StorageUnitFrameContractsRequestData body, @QueryMap(encoded=true) StorageUnitFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>storageUnitFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnit/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitFrameContractsResponseData> storageUnitFrameContractsWithHttpInfo(@Param("elid") String elid, StorageUnitFrameContractsRequestData body, @QueryMap(encoded=true) StorageUnitFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitFrameContracts</code> method in a fluent style.
   */
  public static class StorageUnitFrameContractsQueryParams extends HashMap<String, Object> {
    public StorageUnitFrameContractsQueryParams sessionId(final String value) {
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
   * @return StorageUnitMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitMaintenanceWindowsResponseData storageUnitMaintenanceWindows(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitMaintenanceWindowsRequestData body);

  /**
   * Get relations to Maintenance window entities
   * Similar to <code>storageUnitMaintenanceWindows</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitMaintenanceWindowsResponseData> storageUnitMaintenanceWindowsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitMaintenanceWindowsRequestData body);


  /**
   * Get relations to Maintenance window entities
   * 
   * Note, this is equivalent to the other <code>storageUnitMaintenanceWindows</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitMaintenanceWindowsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitMaintenanceWindowsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/MaintenanceWindows?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitMaintenanceWindowsResponseData storageUnitMaintenanceWindows(@Param("elid") String elid, StorageUnitMaintenanceWindowsRequestData body, @QueryMap(encoded=true) StorageUnitMaintenanceWindowsQueryParams queryParams);

  /**
  * Get relations to Maintenance window entities
  * 
  * Note, this is equivalent to the other <code>storageUnitMaintenanceWindows</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitMaintenanceWindowsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnit/{elid}/MaintenanceWindows?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitMaintenanceWindowsResponseData> storageUnitMaintenanceWindowsWithHttpInfo(@Param("elid") String elid, StorageUnitMaintenanceWindowsRequestData body, @QueryMap(encoded=true) StorageUnitMaintenanceWindowsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitMaintenanceWindows</code> method in a fluent style.
   */
  public static class StorageUnitMaintenanceWindowsQueryParams extends HashMap<String, Object> {
    public StorageUnitMaintenanceWindowsQueryParams sessionId(final String value) {
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
   * @return StorageUnitOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitOrganizationsResponseData storageUnitOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>storageUnitOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitOrganizationsResponseData> storageUnitOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>storageUnitOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitOrganizationsResponseData storageUnitOrganizations(@Param("elid") String elid, StorageUnitOrganizationsRequestData body, @QueryMap(encoded=true) StorageUnitOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>storageUnitOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnit/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitOrganizationsResponseData> storageUnitOrganizationsWithHttpInfo(@Param("elid") String elid, StorageUnitOrganizationsRequestData body, @QueryMap(encoded=true) StorageUnitOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitOrganizations</code> method in a fluent style.
   */
  public static class StorageUnitOrganizationsQueryParams extends HashMap<String, Object> {
    public StorageUnitOrganizationsQueryParams sessionId(final String value) {
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
   * @return StorageUnitPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitPersonGroupsResponseData storageUnitPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>storageUnitPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitPersonGroupsResponseData> storageUnitPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>storageUnitPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitPersonGroupsResponseData storageUnitPersonGroups(@Param("elid") String elid, StorageUnitPersonGroupsRequestData body, @QueryMap(encoded=true) StorageUnitPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>storageUnitPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnit/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitPersonGroupsResponseData> storageUnitPersonGroupsWithHttpInfo(@Param("elid") String elid, StorageUnitPersonGroupsRequestData body, @QueryMap(encoded=true) StorageUnitPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitPersonGroups</code> method in a fluent style.
   */
  public static class StorageUnitPersonGroupsQueryParams extends HashMap<String, Object> {
    public StorageUnitPersonGroupsQueryParams sessionId(final String value) {
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
   * @return StorageUnitPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitPersonsResponseData storageUnitPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>storageUnitPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitPersonsResponseData> storageUnitPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>storageUnitPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitPersonsResponseData storageUnitPersons(@Param("elid") String elid, StorageUnitPersonsRequestData body, @QueryMap(encoded=true) StorageUnitPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>storageUnitPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnit/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitPersonsResponseData> storageUnitPersonsWithHttpInfo(@Param("elid") String elid, StorageUnitPersonsRequestData body, @QueryMap(encoded=true) StorageUnitPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitPersons</code> method in a fluent style.
   */
  public static class StorageUnitPersonsQueryParams extends HashMap<String, Object> {
    public StorageUnitPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StorageUnitQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnit/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitQueryResponse storageUnitQuery(@Param("sessionId") String sessionId, StorageUnitQueryRequest body);

  /**
   * Basic query
   * Similar to <code>storageUnitQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitQueryResponse> storageUnitQueryWithHttpInfo(@Param("sessionId") String sessionId, StorageUnitQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>storageUnitQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitQueryResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnit/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitQueryResponse storageUnitQuery(StorageUnitQueryRequest body, @QueryMap(encoded=true) StorageUnitQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>storageUnitQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitQueryResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnit/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitQueryResponse> storageUnitQueryWithHttpInfo(StorageUnitQueryRequest body, @QueryMap(encoded=true) StorageUnitQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitQuery</code> method in a fluent style.
   */
  public static class StorageUnitQueryQueryParams extends HashMap<String, Object> {
    public StorageUnitQueryQueryParams sessionId(final String value) {
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
   * @return StorageUnitStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitStorageUnitsResponseData storageUnitStorageUnits(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitStorageUnitsRequestData body);

  /**
   * Get relations to Storage unit entities
   * Similar to <code>storageUnitStorageUnits</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitStorageUnitsResponseData> storageUnitStorageUnitsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitStorageUnitsRequestData body);


  /**
   * Get relations to Storage unit entities
   * 
   * Note, this is equivalent to the other <code>storageUnitStorageUnits</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitStorageUnitsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitStorageUnitsResponseData
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/StorageUnits?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitStorageUnitsResponseData storageUnitStorageUnits(@Param("elid") String elid, StorageUnitStorageUnitsRequestData body, @QueryMap(encoded=true) StorageUnitStorageUnitsQueryParams queryParams);

  /**
  * Get relations to Storage unit entities
  * 
  * Note, this is equivalent to the other <code>storageUnitStorageUnits</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitStorageUnitsResponseData
      */
      @RequestLine("POST /api/rest/entity/storageUnit/{elid}/StorageUnits?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitStorageUnitsResponseData> storageUnitStorageUnitsWithHttpInfo(@Param("elid") String elid, StorageUnitStorageUnitsRequestData body, @QueryMap(encoded=true) StorageUnitStorageUnitsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitStorageUnits</code> method in a fluent style.
   */
  public static class StorageUnitStorageUnitsQueryParams extends HashMap<String, Object> {
    public StorageUnitStorageUnitsQueryParams sessionId(final String value) {
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
   * @return StorageUnitSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StorageUnitSystemAttributesResponse storageUnitSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>storageUnitSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StorageUnitSystemAttributesResponse> storageUnitSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, StorageUnitSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>storageUnitSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StorageUnitSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StorageUnitSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StorageUnitSystemAttributesResponse storageUnitSystemAttributes(@Param("elid") String elid, StorageUnitSystemAttributesRequest body, @QueryMap(encoded=true) StorageUnitSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>storageUnitSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StorageUnitSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnit/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StorageUnitSystemAttributesResponse> storageUnitSystemAttributesWithHttpInfo(@Param("elid") String elid, StorageUnitSystemAttributesRequest body, @QueryMap(encoded=true) StorageUnitSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>storageUnitSystemAttributes</code> method in a fluent style.
   */
  public static class StorageUnitSystemAttributesQueryParams extends HashMap<String, Object> {
    public StorageUnitSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesStorageUnitResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesStorageUnitResponse updateSystemAttributesStorageUnit(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageUnitRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesStorageUnit</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesStorageUnitResponse> updateSystemAttributesStorageUnitWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesStorageUnitRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesStorageUnit</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesStorageUnitQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesStorageUnitResponse
   */
  @RequestLine("POST /api/rest/entity/storageUnit/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesStorageUnitResponse updateSystemAttributesStorageUnit(@Param("elid") String elid, UpdateSystemAttributesStorageUnitRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageUnitQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesStorageUnit</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesStorageUnitResponse
      */
      @RequestLine("POST /api/rest/entity/storageUnit/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesStorageUnitResponse> updateSystemAttributesStorageUnitWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesStorageUnitRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesStorageUnitQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesStorageUnit</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesStorageUnitQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesStorageUnitQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
