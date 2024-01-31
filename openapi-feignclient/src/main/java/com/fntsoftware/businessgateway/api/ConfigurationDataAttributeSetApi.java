package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ConfigurationDataAttributeSetAttributesRequest;
import com.fntsoftware.businessgateway.entities.ConfigurationDataAttributeSetAttributesResponse;
import com.fntsoftware.businessgateway.entities.ConfigurationDataAttributeSetQueryRequest;
import com.fntsoftware.businessgateway.entities.ConfigurationDataAttributeSetQueryResponse;
import com.fntsoftware.businessgateway.entities.ConfigurationDataAttributeSetSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ConfigurationDataAttributeSetSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesConfigurationDataAttributeSetRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesConfigurationDataAttributeSetResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface ConfigurationDataAttributeSetApi extends ApiClient.Api {


  /**
   * Query attributes of attribute set
   * Determines the attributes of a attribute set.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ConfigurationDataAttributeSetAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/{elid}/Attributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConfigurationDataAttributeSetAttributesResponse configurationDataAttributeSetAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataAttributeSetAttributesRequest body);

  /**
   * Query attributes of attribute set
   * Similar to <code>configurationDataAttributeSetAttributes</code> but it also returns the http response headers .
   * Determines the attributes of a attribute set.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/{elid}/Attributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConfigurationDataAttributeSetAttributesResponse> configurationDataAttributeSetAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataAttributeSetAttributesRequest body);


  /**
   * Query attributes of attribute set
   * Determines the attributes of a attribute set.
   * Note, this is equivalent to the other <code>configurationDataAttributeSetAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConfigurationDataAttributeSetAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConfigurationDataAttributeSetAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/{elid}/Attributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConfigurationDataAttributeSetAttributesResponse configurationDataAttributeSetAttributes(@Param("elid") String elid, ConfigurationDataAttributeSetAttributesRequest body, @QueryMap(encoded=true) ConfigurationDataAttributeSetAttributesQueryParams queryParams);

  /**
  * Query attributes of attribute set
  * Determines the attributes of a attribute set.
  * Note, this is equivalent to the other <code>configurationDataAttributeSetAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConfigurationDataAttributeSetAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/{elid}/Attributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConfigurationDataAttributeSetAttributesResponse> configurationDataAttributeSetAttributesWithHttpInfo(@Param("elid") String elid, ConfigurationDataAttributeSetAttributesRequest body, @QueryMap(encoded=true) ConfigurationDataAttributeSetAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>configurationDataAttributeSetAttributes</code> method in a fluent style.
   */
  public static class ConfigurationDataAttributeSetAttributesQueryParams extends HashMap<String, Object> {
    public ConfigurationDataAttributeSetAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ConfigurationDataAttributeSetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConfigurationDataAttributeSetQueryResponse configurationDataAttributeSetQuery(@Param("sessionId") String sessionId, ConfigurationDataAttributeSetQueryRequest body);

  /**
   * Basic query
   * Similar to <code>configurationDataAttributeSetQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConfigurationDataAttributeSetQueryResponse> configurationDataAttributeSetQueryWithHttpInfo(@Param("sessionId") String sessionId, ConfigurationDataAttributeSetQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>configurationDataAttributeSetQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConfigurationDataAttributeSetQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConfigurationDataAttributeSetQueryResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConfigurationDataAttributeSetQueryResponse configurationDataAttributeSetQuery(ConfigurationDataAttributeSetQueryRequest body, @QueryMap(encoded=true) ConfigurationDataAttributeSetQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>configurationDataAttributeSetQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConfigurationDataAttributeSetQueryResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConfigurationDataAttributeSetQueryResponse> configurationDataAttributeSetQueryWithHttpInfo(ConfigurationDataAttributeSetQueryRequest body, @QueryMap(encoded=true) ConfigurationDataAttributeSetQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>configurationDataAttributeSetQuery</code> method in a fluent style.
   */
  public static class ConfigurationDataAttributeSetQueryQueryParams extends HashMap<String, Object> {
    public ConfigurationDataAttributeSetQueryQueryParams sessionId(final String value) {
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
   * @return ConfigurationDataAttributeSetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConfigurationDataAttributeSetSystemAttributesResponse configurationDataAttributeSetSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataAttributeSetSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>configurationDataAttributeSetSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConfigurationDataAttributeSetSystemAttributesResponse> configurationDataAttributeSetSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataAttributeSetSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>configurationDataAttributeSetSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConfigurationDataAttributeSetSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConfigurationDataAttributeSetSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConfigurationDataAttributeSetSystemAttributesResponse configurationDataAttributeSetSystemAttributes(@Param("elid") String elid, ConfigurationDataAttributeSetSystemAttributesRequest body, @QueryMap(encoded=true) ConfigurationDataAttributeSetSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>configurationDataAttributeSetSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConfigurationDataAttributeSetSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConfigurationDataAttributeSetSystemAttributesResponse> configurationDataAttributeSetSystemAttributesWithHttpInfo(@Param("elid") String elid, ConfigurationDataAttributeSetSystemAttributesRequest body, @QueryMap(encoded=true) ConfigurationDataAttributeSetSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>configurationDataAttributeSetSystemAttributes</code> method in a fluent style.
   */
  public static class ConfigurationDataAttributeSetSystemAttributesQueryParams extends HashMap<String, Object> {
    public ConfigurationDataAttributeSetSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesConfigurationDataAttributeSetResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesConfigurationDataAttributeSetResponse updateSystemAttributesConfigurationDataAttributeSet(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesConfigurationDataAttributeSetRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesConfigurationDataAttributeSet</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesConfigurationDataAttributeSetResponse> updateSystemAttributesConfigurationDataAttributeSetWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesConfigurationDataAttributeSetRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesConfigurationDataAttributeSet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesConfigurationDataAttributeSetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesConfigurationDataAttributeSetResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesConfigurationDataAttributeSetResponse updateSystemAttributesConfigurationDataAttributeSet(@Param("elid") String elid, UpdateSystemAttributesConfigurationDataAttributeSetRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesConfigurationDataAttributeSetQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesConfigurationDataAttributeSet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesConfigurationDataAttributeSetResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataAttributeSet/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesConfigurationDataAttributeSetResponse> updateSystemAttributesConfigurationDataAttributeSetWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesConfigurationDataAttributeSetRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesConfigurationDataAttributeSetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesConfigurationDataAttributeSet</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesConfigurationDataAttributeSetQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesConfigurationDataAttributeSetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
