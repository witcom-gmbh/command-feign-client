package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ConfigurationDataImportGetImportStatusRequest;
import com.fntsoftware.businessgateway.entities.ConfigurationDataImportGetImportStatusResponse;
import com.fntsoftware.businessgateway.entities.StartImportConfigurationDataImportRequestData;
import com.fntsoftware.businessgateway.entities.StartImportConfigurationDataImportResponse;
import com.fntsoftware.businessgateway.entities.WriteImportLogConfigurationDataImportRequestData;
import com.fntsoftware.businessgateway.entities.WriteImportLogConfigurationDataImportResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ConfigurationDataImportApi extends ApiClient.Api {


  /**
   * Query status
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ConfigurationDataImportGetImportStatusResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataImport/getImportStatus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConfigurationDataImportGetImportStatusResponse configurationDataImportGetImportStatus(@Param("sessionId") String sessionId, ConfigurationDataImportGetImportStatusRequest body);

  /**
   * Query status
   * Similar to <code>configurationDataImportGetImportStatus</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataImport/getImportStatus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConfigurationDataImportGetImportStatusResponse> configurationDataImportGetImportStatusWithHttpInfo(@Param("sessionId") String sessionId, ConfigurationDataImportGetImportStatusRequest body);


  /**
   * Query status
   * 
   * Note, this is equivalent to the other <code>configurationDataImportGetImportStatus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConfigurationDataImportGetImportStatusQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConfigurationDataImportGetImportStatusResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataImport/getImportStatus?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConfigurationDataImportGetImportStatusResponse configurationDataImportGetImportStatus(ConfigurationDataImportGetImportStatusRequest body, @QueryMap(encoded=true) ConfigurationDataImportGetImportStatusQueryParams queryParams);

  /**
  * Query status
  * 
  * Note, this is equivalent to the other <code>configurationDataImportGetImportStatus</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConfigurationDataImportGetImportStatusResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataImport/getImportStatus?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConfigurationDataImportGetImportStatusResponse> configurationDataImportGetImportStatusWithHttpInfo(ConfigurationDataImportGetImportStatusRequest body, @QueryMap(encoded=true) ConfigurationDataImportGetImportStatusQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>configurationDataImportGetImportStatus</code> method in a fluent style.
   */
  public static class ConfigurationDataImportGetImportStatusQueryParams extends HashMap<String, Object> {
    public ConfigurationDataImportGetImportStatusQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Start import
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StartImportConfigurationDataImportResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataImport/startImport?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StartImportConfigurationDataImportResponse startImportConfigurationDataImport(@Param("sessionId") String sessionId, StartImportConfigurationDataImportRequestData body);

  /**
   * Start import
   * Similar to <code>startImportConfigurationDataImport</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataImport/startImport?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StartImportConfigurationDataImportResponse> startImportConfigurationDataImportWithHttpInfo(@Param("sessionId") String sessionId, StartImportConfigurationDataImportRequestData body);


  /**
   * Start import
   * 
   * Note, this is equivalent to the other <code>startImportConfigurationDataImport</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StartImportConfigurationDataImportQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StartImportConfigurationDataImportResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataImport/startImport?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StartImportConfigurationDataImportResponse startImportConfigurationDataImport(StartImportConfigurationDataImportRequestData body, @QueryMap(encoded=true) StartImportConfigurationDataImportQueryParams queryParams);

  /**
  * Start import
  * 
  * Note, this is equivalent to the other <code>startImportConfigurationDataImport</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StartImportConfigurationDataImportResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataImport/startImport?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StartImportConfigurationDataImportResponse> startImportConfigurationDataImportWithHttpInfo(StartImportConfigurationDataImportRequestData body, @QueryMap(encoded=true) StartImportConfigurationDataImportQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>startImportConfigurationDataImport</code> method in a fluent style.
   */
  public static class StartImportConfigurationDataImportQueryParams extends HashMap<String, Object> {
    public StartImportConfigurationDataImportQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create log file
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return WriteImportLogConfigurationDataImportResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataImport/writeImportLog?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WriteImportLogConfigurationDataImportResponse writeImportLogConfigurationDataImport(@Param("sessionId") String sessionId, WriteImportLogConfigurationDataImportRequestData body);

  /**
   * Create log file
   * Similar to <code>writeImportLogConfigurationDataImport</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataImport/writeImportLog?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WriteImportLogConfigurationDataImportResponse> writeImportLogConfigurationDataImportWithHttpInfo(@Param("sessionId") String sessionId, WriteImportLogConfigurationDataImportRequestData body);


  /**
   * Create log file
   * 
   * Note, this is equivalent to the other <code>writeImportLogConfigurationDataImport</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WriteImportLogConfigurationDataImportQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WriteImportLogConfigurationDataImportResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataImport/writeImportLog?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WriteImportLogConfigurationDataImportResponse writeImportLogConfigurationDataImport(WriteImportLogConfigurationDataImportRequestData body, @QueryMap(encoded=true) WriteImportLogConfigurationDataImportQueryParams queryParams);

  /**
  * Create log file
  * 
  * Note, this is equivalent to the other <code>writeImportLogConfigurationDataImport</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WriteImportLogConfigurationDataImportResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataImport/writeImportLog?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WriteImportLogConfigurationDataImportResponse> writeImportLogConfigurationDataImportWithHttpInfo(WriteImportLogConfigurationDataImportRequestData body, @QueryMap(encoded=true) WriteImportLogConfigurationDataImportQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>writeImportLogConfigurationDataImport</code> method in a fluent style.
   */
  public static class WriteImportLogConfigurationDataImportQueryParams extends HashMap<String, Object> {
    public WriteImportLogConfigurationDataImportQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
