package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ConfigurationDataLayerQueryRequest;
import com.fntsoftware.businessgateway.entities.ConfigurationDataLayerQueryResponse;
import com.fntsoftware.businessgateway.entities.ConfigurationDataLayerSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ConfigurationDataLayerSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesConfigurationDataLayerRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesConfigurationDataLayerResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface ConfigurationDataLayerApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ConfigurationDataLayerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataLayer/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConfigurationDataLayerQueryResponse configurationDataLayerQuery(@Param("sessionId") String sessionId, ConfigurationDataLayerQueryRequest body);

  /**
   * Basic query
   * Similar to <code>configurationDataLayerQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataLayer/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConfigurationDataLayerQueryResponse> configurationDataLayerQueryWithHttpInfo(@Param("sessionId") String sessionId, ConfigurationDataLayerQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>configurationDataLayerQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConfigurationDataLayerQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConfigurationDataLayerQueryResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataLayer/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConfigurationDataLayerQueryResponse configurationDataLayerQuery(ConfigurationDataLayerQueryRequest body, @QueryMap(encoded=true) ConfigurationDataLayerQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>configurationDataLayerQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConfigurationDataLayerQueryResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataLayer/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConfigurationDataLayerQueryResponse> configurationDataLayerQueryWithHttpInfo(ConfigurationDataLayerQueryRequest body, @QueryMap(encoded=true) ConfigurationDataLayerQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>configurationDataLayerQuery</code> method in a fluent style.
   */
  public static class ConfigurationDataLayerQueryQueryParams extends HashMap<String, Object> {
    public ConfigurationDataLayerQueryQueryParams sessionId(final String value) {
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
   * @return ConfigurationDataLayerSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataLayer/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConfigurationDataLayerSystemAttributesResponse configurationDataLayerSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataLayerSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>configurationDataLayerSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataLayer/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConfigurationDataLayerSystemAttributesResponse> configurationDataLayerSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataLayerSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>configurationDataLayerSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConfigurationDataLayerSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConfigurationDataLayerSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataLayer/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConfigurationDataLayerSystemAttributesResponse configurationDataLayerSystemAttributes(@Param("elid") String elid, ConfigurationDataLayerSystemAttributesRequest body, @QueryMap(encoded=true) ConfigurationDataLayerSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>configurationDataLayerSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConfigurationDataLayerSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataLayer/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConfigurationDataLayerSystemAttributesResponse> configurationDataLayerSystemAttributesWithHttpInfo(@Param("elid") String elid, ConfigurationDataLayerSystemAttributesRequest body, @QueryMap(encoded=true) ConfigurationDataLayerSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>configurationDataLayerSystemAttributes</code> method in a fluent style.
   */
  public static class ConfigurationDataLayerSystemAttributesQueryParams extends HashMap<String, Object> {
    public ConfigurationDataLayerSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesConfigurationDataLayerResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataLayer/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesConfigurationDataLayerResponse updateSystemAttributesConfigurationDataLayer(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesConfigurationDataLayerRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesConfigurationDataLayer</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataLayer/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesConfigurationDataLayerResponse> updateSystemAttributesConfigurationDataLayerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesConfigurationDataLayerRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesConfigurationDataLayer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesConfigurationDataLayerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesConfigurationDataLayerResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataLayer/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesConfigurationDataLayerResponse updateSystemAttributesConfigurationDataLayer(@Param("elid") String elid, UpdateSystemAttributesConfigurationDataLayerRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesConfigurationDataLayerQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesConfigurationDataLayer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesConfigurationDataLayerResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataLayer/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesConfigurationDataLayerResponse> updateSystemAttributesConfigurationDataLayerWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesConfigurationDataLayerRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesConfigurationDataLayerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesConfigurationDataLayer</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesConfigurationDataLayerQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesConfigurationDataLayerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
