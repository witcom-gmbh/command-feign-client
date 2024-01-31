package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.HealthCheckCheckPermissionRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckCheckPermissionResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckGetAppServerSettingsRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckGetAppServerSettingsResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckGetDbObjectListRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckGetDbObjectListResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckGetDbObjectsStatusRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckGetDbObjectsStatusResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckGetDbTriggerListRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckGetDbTriggerListResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckGetDbTriggerStatusRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckGetDbTriggerStatusResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckGetDownloadPathRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckGetDownloadPathResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckGetFileListRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckGetFileListResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckGetServerInfoRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckGetServerInfoResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckGetVersionListRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckGetVersionListResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckGetVersionStatusRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckGetVersionStatusResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckShowJavaInfoRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckShowJavaInfoResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckShowMissingPngRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckShowMissingPngResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckShowMissingPortspritesRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckShowMissingPortspritesResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckShowPortspritesInfoRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckShowPortspritesInfoResponse;
import com.fntsoftware.businessgateway.entities.HealthCheckShowTimeInfoRequest;
import com.fntsoftware.businessgateway.entities.HealthCheckShowTimeInfoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface HealthCheckApi extends ApiClient.Api {


  /**
   * Check authorization (internal)
   * Check authorization
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckCheckPermissionResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/checkPermission?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckCheckPermissionResponse healthCheckCheckPermission(@Param("sessionId") String sessionId, HealthCheckCheckPermissionRequest body);

  /**
   * Check authorization (internal)
   * Similar to <code>healthCheckCheckPermission</code> but it also returns the http response headers .
   * Check authorization
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/checkPermission?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckCheckPermissionResponse> healthCheckCheckPermissionWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckCheckPermissionRequest body);


  /**
   * Check authorization (internal)
   * Check authorization
   * Note, this is equivalent to the other <code>healthCheckCheckPermission</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckCheckPermissionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckCheckPermissionResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/checkPermission?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckCheckPermissionResponse healthCheckCheckPermission(HealthCheckCheckPermissionRequest body, @QueryMap(encoded=true) HealthCheckCheckPermissionQueryParams queryParams);

  /**
  * Check authorization (internal)
  * Check authorization
  * Note, this is equivalent to the other <code>healthCheckCheckPermission</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckCheckPermissionResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/checkPermission?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckCheckPermissionResponse> healthCheckCheckPermissionWithHttpInfo(HealthCheckCheckPermissionRequest body, @QueryMap(encoded=true) HealthCheckCheckPermissionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckCheckPermission</code> method in a fluent style.
   */
  public static class HealthCheckCheckPermissionQueryParams extends HashMap<String, Object> {
    public HealthCheckCheckPermissionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Show AppServer settings (internal)
   * Show AppServer settings
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckGetAppServerSettingsResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getAppServerSettings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckGetAppServerSettingsResponse healthCheckGetAppServerSettings(@Param("sessionId") String sessionId, HealthCheckGetAppServerSettingsRequest body);

  /**
   * Show AppServer settings (internal)
   * Similar to <code>healthCheckGetAppServerSettings</code> but it also returns the http response headers .
   * Show AppServer settings
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getAppServerSettings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckGetAppServerSettingsResponse> healthCheckGetAppServerSettingsWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckGetAppServerSettingsRequest body);


  /**
   * Show AppServer settings (internal)
   * Show AppServer settings
   * Note, this is equivalent to the other <code>healthCheckGetAppServerSettings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckGetAppServerSettingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckGetAppServerSettingsResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getAppServerSettings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckGetAppServerSettingsResponse healthCheckGetAppServerSettings(HealthCheckGetAppServerSettingsRequest body, @QueryMap(encoded=true) HealthCheckGetAppServerSettingsQueryParams queryParams);

  /**
  * Show AppServer settings (internal)
  * Show AppServer settings
  * Note, this is equivalent to the other <code>healthCheckGetAppServerSettings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckGetAppServerSettingsResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/getAppServerSettings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckGetAppServerSettingsResponse> healthCheckGetAppServerSettingsWithHttpInfo(HealthCheckGetAppServerSettingsRequest body, @QueryMap(encoded=true) HealthCheckGetAppServerSettingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckGetAppServerSettings</code> method in a fluent style.
   */
  public static class HealthCheckGetAppServerSettingsQueryParams extends HashMap<String, Object> {
    public HealthCheckGetAppServerSettingsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Show all DB objects (internal)
   * Show all DB objects
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckGetDbObjectListResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDbObjectList?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckGetDbObjectListResponse healthCheckGetDbObjectList(@Param("sessionId") String sessionId, HealthCheckGetDbObjectListRequest body);

  /**
   * Show all DB objects (internal)
   * Similar to <code>healthCheckGetDbObjectList</code> but it also returns the http response headers .
   * Show all DB objects
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDbObjectList?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckGetDbObjectListResponse> healthCheckGetDbObjectListWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckGetDbObjectListRequest body);


  /**
   * Show all DB objects (internal)
   * Show all DB objects
   * Note, this is equivalent to the other <code>healthCheckGetDbObjectList</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckGetDbObjectListQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckGetDbObjectListResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDbObjectList?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckGetDbObjectListResponse healthCheckGetDbObjectList(HealthCheckGetDbObjectListRequest body, @QueryMap(encoded=true) HealthCheckGetDbObjectListQueryParams queryParams);

  /**
  * Show all DB objects (internal)
  * Show all DB objects
  * Note, this is equivalent to the other <code>healthCheckGetDbObjectList</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckGetDbObjectListResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/getDbObjectList?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckGetDbObjectListResponse> healthCheckGetDbObjectListWithHttpInfo(HealthCheckGetDbObjectListRequest body, @QueryMap(encoded=true) HealthCheckGetDbObjectListQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckGetDbObjectList</code> method in a fluent style.
   */
  public static class HealthCheckGetDbObjectListQueryParams extends HashMap<String, Object> {
    public HealthCheckGetDbObjectListQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Show DB objects state (internal)
   * Show DB objects state
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckGetDbObjectsStatusResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDbObjectsStatus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckGetDbObjectsStatusResponse healthCheckGetDbObjectsStatus(@Param("sessionId") String sessionId, HealthCheckGetDbObjectsStatusRequest body);

  /**
   * Show DB objects state (internal)
   * Similar to <code>healthCheckGetDbObjectsStatus</code> but it also returns the http response headers .
   * Show DB objects state
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDbObjectsStatus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckGetDbObjectsStatusResponse> healthCheckGetDbObjectsStatusWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckGetDbObjectsStatusRequest body);


  /**
   * Show DB objects state (internal)
   * Show DB objects state
   * Note, this is equivalent to the other <code>healthCheckGetDbObjectsStatus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckGetDbObjectsStatusQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckGetDbObjectsStatusResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDbObjectsStatus?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckGetDbObjectsStatusResponse healthCheckGetDbObjectsStatus(HealthCheckGetDbObjectsStatusRequest body, @QueryMap(encoded=true) HealthCheckGetDbObjectsStatusQueryParams queryParams);

  /**
  * Show DB objects state (internal)
  * Show DB objects state
  * Note, this is equivalent to the other <code>healthCheckGetDbObjectsStatus</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckGetDbObjectsStatusResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/getDbObjectsStatus?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckGetDbObjectsStatusResponse> healthCheckGetDbObjectsStatusWithHttpInfo(HealthCheckGetDbObjectsStatusRequest body, @QueryMap(encoded=true) HealthCheckGetDbObjectsStatusQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckGetDbObjectsStatus</code> method in a fluent style.
   */
  public static class HealthCheckGetDbObjectsStatusQueryParams extends HashMap<String, Object> {
    public HealthCheckGetDbObjectsStatusQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Show all DB trigger (internal)
   * Show all DB triggers
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckGetDbTriggerListResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDbTriggerList?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckGetDbTriggerListResponse healthCheckGetDbTriggerList(@Param("sessionId") String sessionId, HealthCheckGetDbTriggerListRequest body);

  /**
   * Show all DB trigger (internal)
   * Similar to <code>healthCheckGetDbTriggerList</code> but it also returns the http response headers .
   * Show all DB triggers
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDbTriggerList?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckGetDbTriggerListResponse> healthCheckGetDbTriggerListWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckGetDbTriggerListRequest body);


  /**
   * Show all DB trigger (internal)
   * Show all DB triggers
   * Note, this is equivalent to the other <code>healthCheckGetDbTriggerList</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckGetDbTriggerListQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckGetDbTriggerListResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDbTriggerList?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckGetDbTriggerListResponse healthCheckGetDbTriggerList(HealthCheckGetDbTriggerListRequest body, @QueryMap(encoded=true) HealthCheckGetDbTriggerListQueryParams queryParams);

  /**
  * Show all DB trigger (internal)
  * Show all DB triggers
  * Note, this is equivalent to the other <code>healthCheckGetDbTriggerList</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckGetDbTriggerListResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/getDbTriggerList?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckGetDbTriggerListResponse> healthCheckGetDbTriggerListWithHttpInfo(HealthCheckGetDbTriggerListRequest body, @QueryMap(encoded=true) HealthCheckGetDbTriggerListQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckGetDbTriggerList</code> method in a fluent style.
   */
  public static class HealthCheckGetDbTriggerListQueryParams extends HashMap<String, Object> {
    public HealthCheckGetDbTriggerListQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Show DB trigger state (internal)
   * Show DB trigger state
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckGetDbTriggerStatusResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDbTriggerStatus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckGetDbTriggerStatusResponse healthCheckGetDbTriggerStatus(@Param("sessionId") String sessionId, HealthCheckGetDbTriggerStatusRequest body);

  /**
   * Show DB trigger state (internal)
   * Similar to <code>healthCheckGetDbTriggerStatus</code> but it also returns the http response headers .
   * Show DB trigger state
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDbTriggerStatus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckGetDbTriggerStatusResponse> healthCheckGetDbTriggerStatusWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckGetDbTriggerStatusRequest body);


  /**
   * Show DB trigger state (internal)
   * Show DB trigger state
   * Note, this is equivalent to the other <code>healthCheckGetDbTriggerStatus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckGetDbTriggerStatusQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckGetDbTriggerStatusResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDbTriggerStatus?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckGetDbTriggerStatusResponse healthCheckGetDbTriggerStatus(HealthCheckGetDbTriggerStatusRequest body, @QueryMap(encoded=true) HealthCheckGetDbTriggerStatusQueryParams queryParams);

  /**
  * Show DB trigger state (internal)
  * Show DB trigger state
  * Note, this is equivalent to the other <code>healthCheckGetDbTriggerStatus</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckGetDbTriggerStatusResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/getDbTriggerStatus?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckGetDbTriggerStatusResponse> healthCheckGetDbTriggerStatusWithHttpInfo(HealthCheckGetDbTriggerStatusRequest body, @QueryMap(encoded=true) HealthCheckGetDbTriggerStatusQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckGetDbTriggerStatus</code> method in a fluent style.
   */
  public static class HealthCheckGetDbTriggerStatusQueryParams extends HashMap<String, Object> {
    public HealthCheckGetDbTriggerStatusQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Show download link of filelist.txt (internal)
   * Show download link of filelist.txt
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckGetDownloadPathResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDownloadPath?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckGetDownloadPathResponse healthCheckGetDownloadPath(@Param("sessionId") String sessionId, HealthCheckGetDownloadPathRequest body);

  /**
   * Show download link of filelist.txt (internal)
   * Similar to <code>healthCheckGetDownloadPath</code> but it also returns the http response headers .
   * Show download link of filelist.txt
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDownloadPath?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckGetDownloadPathResponse> healthCheckGetDownloadPathWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckGetDownloadPathRequest body);


  /**
   * Show download link of filelist.txt (internal)
   * Show download link of filelist.txt
   * Note, this is equivalent to the other <code>healthCheckGetDownloadPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckGetDownloadPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckGetDownloadPathResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getDownloadPath?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckGetDownloadPathResponse healthCheckGetDownloadPath(HealthCheckGetDownloadPathRequest body, @QueryMap(encoded=true) HealthCheckGetDownloadPathQueryParams queryParams);

  /**
  * Show download link of filelist.txt (internal)
  * Show download link of filelist.txt
  * Note, this is equivalent to the other <code>healthCheckGetDownloadPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckGetDownloadPathResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/getDownloadPath?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckGetDownloadPathResponse> healthCheckGetDownloadPathWithHttpInfo(HealthCheckGetDownloadPathRequest body, @QueryMap(encoded=true) HealthCheckGetDownloadPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckGetDownloadPath</code> method in a fluent style.
   */
  public static class HealthCheckGetDownloadPathQueryParams extends HashMap<String, Object> {
    public HealthCheckGetDownloadPathQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create list of all files in WmIcons (internal)
   * Create list of all files in WmIcons
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckGetFileListResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getFileList?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckGetFileListResponse healthCheckGetFileList(@Param("sessionId") String sessionId, HealthCheckGetFileListRequest body);

  /**
   * Create list of all files in WmIcons (internal)
   * Similar to <code>healthCheckGetFileList</code> but it also returns the http response headers .
   * Create list of all files in WmIcons
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getFileList?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckGetFileListResponse> healthCheckGetFileListWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckGetFileListRequest body);


  /**
   * Create list of all files in WmIcons (internal)
   * Create list of all files in WmIcons
   * Note, this is equivalent to the other <code>healthCheckGetFileList</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckGetFileListQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckGetFileListResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getFileList?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckGetFileListResponse healthCheckGetFileList(HealthCheckGetFileListRequest body, @QueryMap(encoded=true) HealthCheckGetFileListQueryParams queryParams);

  /**
  * Create list of all files in WmIcons (internal)
  * Create list of all files in WmIcons
  * Note, this is equivalent to the other <code>healthCheckGetFileList</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckGetFileListResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/getFileList?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckGetFileListResponse> healthCheckGetFileListWithHttpInfo(HealthCheckGetFileListRequest body, @QueryMap(encoded=true) HealthCheckGetFileListQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckGetFileList</code> method in a fluent style.
   */
  public static class HealthCheckGetFileListQueryParams extends HashMap<String, Object> {
    public HealthCheckGetFileListQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get server information
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckGetServerInfoResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getServerInfo?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckGetServerInfoResponse healthCheckGetServerInfo(@Param("sessionId") String sessionId, HealthCheckGetServerInfoRequest body);

  /**
   * Get server information
   * Similar to <code>healthCheckGetServerInfo</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getServerInfo?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckGetServerInfoResponse> healthCheckGetServerInfoWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckGetServerInfoRequest body);


  /**
   * Get server information
   * 
   * Note, this is equivalent to the other <code>healthCheckGetServerInfo</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckGetServerInfoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckGetServerInfoResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getServerInfo?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckGetServerInfoResponse healthCheckGetServerInfo(HealthCheckGetServerInfoRequest body, @QueryMap(encoded=true) HealthCheckGetServerInfoQueryParams queryParams);

  /**
  * Get server information
  * 
  * Note, this is equivalent to the other <code>healthCheckGetServerInfo</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckGetServerInfoResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/getServerInfo?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckGetServerInfoResponse> healthCheckGetServerInfoWithHttpInfo(HealthCheckGetServerInfoRequest body, @QueryMap(encoded=true) HealthCheckGetServerInfoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckGetServerInfo</code> method in a fluent style.
   */
  public static class HealthCheckGetServerInfoQueryParams extends HashMap<String, Object> {
    public HealthCheckGetServerInfoQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Show installed modules (internal)
   * Show installed modules
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckGetVersionListResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getVersionList?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckGetVersionListResponse healthCheckGetVersionList(@Param("sessionId") String sessionId, HealthCheckGetVersionListRequest body);

  /**
   * Show installed modules (internal)
   * Similar to <code>healthCheckGetVersionList</code> but it also returns the http response headers .
   * Show installed modules
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getVersionList?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckGetVersionListResponse> healthCheckGetVersionListWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckGetVersionListRequest body);


  /**
   * Show installed modules (internal)
   * Show installed modules
   * Note, this is equivalent to the other <code>healthCheckGetVersionList</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckGetVersionListQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckGetVersionListResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getVersionList?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckGetVersionListResponse healthCheckGetVersionList(HealthCheckGetVersionListRequest body, @QueryMap(encoded=true) HealthCheckGetVersionListQueryParams queryParams);

  /**
  * Show installed modules (internal)
  * Show installed modules
  * Note, this is equivalent to the other <code>healthCheckGetVersionList</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckGetVersionListResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/getVersionList?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckGetVersionListResponse> healthCheckGetVersionListWithHttpInfo(HealthCheckGetVersionListRequest body, @QueryMap(encoded=true) HealthCheckGetVersionListQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckGetVersionList</code> method in a fluent style.
   */
  public static class HealthCheckGetVersionListQueryParams extends HashMap<String, Object> {
    public HealthCheckGetVersionListQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Show status of version installation (internal)
   * show version installation state
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckGetVersionStatusResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getVersionStatus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckGetVersionStatusResponse healthCheckGetVersionStatus(@Param("sessionId") String sessionId, HealthCheckGetVersionStatusRequest body);

  /**
   * Show status of version installation (internal)
   * Similar to <code>healthCheckGetVersionStatus</code> but it also returns the http response headers .
   * show version installation state
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getVersionStatus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckGetVersionStatusResponse> healthCheckGetVersionStatusWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckGetVersionStatusRequest body);


  /**
   * Show status of version installation (internal)
   * show version installation state
   * Note, this is equivalent to the other <code>healthCheckGetVersionStatus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckGetVersionStatusQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckGetVersionStatusResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/getVersionStatus?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckGetVersionStatusResponse healthCheckGetVersionStatus(HealthCheckGetVersionStatusRequest body, @QueryMap(encoded=true) HealthCheckGetVersionStatusQueryParams queryParams);

  /**
  * Show status of version installation (internal)
  * show version installation state
  * Note, this is equivalent to the other <code>healthCheckGetVersionStatus</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckGetVersionStatusResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/getVersionStatus?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckGetVersionStatusResponse> healthCheckGetVersionStatusWithHttpInfo(HealthCheckGetVersionStatusRequest body, @QueryMap(encoded=true) HealthCheckGetVersionStatusQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckGetVersionStatus</code> method in a fluent style.
   */
  public static class HealthCheckGetVersionStatusQueryParams extends HashMap<String, Object> {
    public HealthCheckGetVersionStatusQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Show Java information (internal)
   * Show Java information
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckShowJavaInfoResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showJavaInfo?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckShowJavaInfoResponse healthCheckShowJavaInfo(@Param("sessionId") String sessionId, HealthCheckShowJavaInfoRequest body);

  /**
   * Show Java information (internal)
   * Similar to <code>healthCheckShowJavaInfo</code> but it also returns the http response headers .
   * Show Java information
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showJavaInfo?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckShowJavaInfoResponse> healthCheckShowJavaInfoWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckShowJavaInfoRequest body);


  /**
   * Show Java information (internal)
   * Show Java information
   * Note, this is equivalent to the other <code>healthCheckShowJavaInfo</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckShowJavaInfoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckShowJavaInfoResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showJavaInfo?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckShowJavaInfoResponse healthCheckShowJavaInfo(HealthCheckShowJavaInfoRequest body, @QueryMap(encoded=true) HealthCheckShowJavaInfoQueryParams queryParams);

  /**
  * Show Java information (internal)
  * Show Java information
  * Note, this is equivalent to the other <code>healthCheckShowJavaInfo</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckShowJavaInfoResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/showJavaInfo?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckShowJavaInfoResponse> healthCheckShowJavaInfoWithHttpInfo(HealthCheckShowJavaInfoRequest body, @QueryMap(encoded=true) HealthCheckShowJavaInfoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckShowJavaInfo</code> method in a fluent style.
   */
  public static class HealthCheckShowJavaInfoQueryParams extends HashMap<String, Object> {
    public HealthCheckShowJavaInfoQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Show missing PNG files (internal)
   * Show missing PNG files
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckShowMissingPngResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showMissingPng?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckShowMissingPngResponse healthCheckShowMissingPng(@Param("sessionId") String sessionId, HealthCheckShowMissingPngRequest body);

  /**
   * Show missing PNG files (internal)
   * Similar to <code>healthCheckShowMissingPng</code> but it also returns the http response headers .
   * Show missing PNG files
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showMissingPng?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckShowMissingPngResponse> healthCheckShowMissingPngWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckShowMissingPngRequest body);


  /**
   * Show missing PNG files (internal)
   * Show missing PNG files
   * Note, this is equivalent to the other <code>healthCheckShowMissingPng</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckShowMissingPngQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckShowMissingPngResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showMissingPng?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckShowMissingPngResponse healthCheckShowMissingPng(HealthCheckShowMissingPngRequest body, @QueryMap(encoded=true) HealthCheckShowMissingPngQueryParams queryParams);

  /**
  * Show missing PNG files (internal)
  * Show missing PNG files
  * Note, this is equivalent to the other <code>healthCheckShowMissingPng</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckShowMissingPngResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/showMissingPng?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckShowMissingPngResponse> healthCheckShowMissingPngWithHttpInfo(HealthCheckShowMissingPngRequest body, @QueryMap(encoded=true) HealthCheckShowMissingPngQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckShowMissingPng</code> method in a fluent style.
   */
  public static class HealthCheckShowMissingPngQueryParams extends HashMap<String, Object> {
    public HealthCheckShowMissingPngQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Show missing port sprites (internal)
   * Show missing port sprites
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckShowMissingPortspritesResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showMissingPortsprites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckShowMissingPortspritesResponse healthCheckShowMissingPortsprites(@Param("sessionId") String sessionId, HealthCheckShowMissingPortspritesRequest body);

  /**
   * Show missing port sprites (internal)
   * Similar to <code>healthCheckShowMissingPortsprites</code> but it also returns the http response headers .
   * Show missing port sprites
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showMissingPortsprites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckShowMissingPortspritesResponse> healthCheckShowMissingPortspritesWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckShowMissingPortspritesRequest body);


  /**
   * Show missing port sprites (internal)
   * Show missing port sprites
   * Note, this is equivalent to the other <code>healthCheckShowMissingPortsprites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckShowMissingPortspritesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckShowMissingPortspritesResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showMissingPortsprites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckShowMissingPortspritesResponse healthCheckShowMissingPortsprites(HealthCheckShowMissingPortspritesRequest body, @QueryMap(encoded=true) HealthCheckShowMissingPortspritesQueryParams queryParams);

  /**
  * Show missing port sprites (internal)
  * Show missing port sprites
  * Note, this is equivalent to the other <code>healthCheckShowMissingPortsprites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckShowMissingPortspritesResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/showMissingPortsprites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckShowMissingPortspritesResponse> healthCheckShowMissingPortspritesWithHttpInfo(HealthCheckShowMissingPortspritesRequest body, @QueryMap(encoded=true) HealthCheckShowMissingPortspritesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckShowMissingPortsprites</code> method in a fluent style.
   */
  public static class HealthCheckShowMissingPortspritesQueryParams extends HashMap<String, Object> {
    public HealthCheckShowMissingPortspritesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Show all port sprites (internal)
   * Show all port sprites
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckShowPortspritesInfoResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showPortspritesInfo?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckShowPortspritesInfoResponse healthCheckShowPortspritesInfo(@Param("sessionId") String sessionId, HealthCheckShowPortspritesInfoRequest body);

  /**
   * Show all port sprites (internal)
   * Similar to <code>healthCheckShowPortspritesInfo</code> but it also returns the http response headers .
   * Show all port sprites
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showPortspritesInfo?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckShowPortspritesInfoResponse> healthCheckShowPortspritesInfoWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckShowPortspritesInfoRequest body);


  /**
   * Show all port sprites (internal)
   * Show all port sprites
   * Note, this is equivalent to the other <code>healthCheckShowPortspritesInfo</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckShowPortspritesInfoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckShowPortspritesInfoResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showPortspritesInfo?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckShowPortspritesInfoResponse healthCheckShowPortspritesInfo(HealthCheckShowPortspritesInfoRequest body, @QueryMap(encoded=true) HealthCheckShowPortspritesInfoQueryParams queryParams);

  /**
  * Show all port sprites (internal)
  * Show all port sprites
  * Note, this is equivalent to the other <code>healthCheckShowPortspritesInfo</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckShowPortspritesInfoResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/showPortspritesInfo?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckShowPortspritesInfoResponse> healthCheckShowPortspritesInfoWithHttpInfo(HealthCheckShowPortspritesInfoRequest body, @QueryMap(encoded=true) HealthCheckShowPortspritesInfoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckShowPortspritesInfo</code> method in a fluent style.
   */
  public static class HealthCheckShowPortspritesInfoQueryParams extends HashMap<String, Object> {
    public HealthCheckShowPortspritesInfoQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Show time zone information (internal)
   * Show timezone information
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return HealthCheckShowTimeInfoResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showTimeInfo?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HealthCheckShowTimeInfoResponse healthCheckShowTimeInfo(@Param("sessionId") String sessionId, HealthCheckShowTimeInfoRequest body);

  /**
   * Show time zone information (internal)
   * Similar to <code>healthCheckShowTimeInfo</code> but it also returns the http response headers .
   * Show timezone information
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showTimeInfo?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<HealthCheckShowTimeInfoResponse> healthCheckShowTimeInfoWithHttpInfo(@Param("sessionId") String sessionId, HealthCheckShowTimeInfoRequest body);


  /**
   * Show time zone information (internal)
   * Show timezone information
   * Note, this is equivalent to the other <code>healthCheckShowTimeInfo</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link HealthCheckShowTimeInfoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return HealthCheckShowTimeInfoResponse
   */
  @RequestLine("POST /api/rest/entity/healthCheck/showTimeInfo?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  HealthCheckShowTimeInfoResponse healthCheckShowTimeInfo(HealthCheckShowTimeInfoRequest body, @QueryMap(encoded=true) HealthCheckShowTimeInfoQueryParams queryParams);

  /**
  * Show time zone information (internal)
  * Show timezone information
  * Note, this is equivalent to the other <code>healthCheckShowTimeInfo</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return HealthCheckShowTimeInfoResponse
      */
      @RequestLine("POST /api/rest/entity/healthCheck/showTimeInfo?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<HealthCheckShowTimeInfoResponse> healthCheckShowTimeInfoWithHttpInfo(HealthCheckShowTimeInfoRequest body, @QueryMap(encoded=true) HealthCheckShowTimeInfoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>healthCheckShowTimeInfo</code> method in a fluent style.
   */
  public static class HealthCheckShowTimeInfoQueryParams extends HashMap<String, Object> {
    public HealthCheckShowTimeInfoQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
