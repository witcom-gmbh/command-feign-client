package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ConfigurationDataConfigurationAttributeSetsRequest;
import com.fntsoftware.businessgateway.entities.ConfigurationDataConfigurationAttributeSetsResponse;
import com.fntsoftware.businessgateway.entities.ConfigurationDataConfigurationLayersRequest;
import com.fntsoftware.businessgateway.entities.ConfigurationDataConfigurationLayersResponse;
import com.fntsoftware.businessgateway.entities.ConfigurationDataConfigurationQueryRequest;
import com.fntsoftware.businessgateway.entities.ConfigurationDataConfigurationQueryResponse;
import com.fntsoftware.businessgateway.entities.ConfigurationDataConfigurationSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ConfigurationDataConfigurationSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesConfigurationDataConfigurationRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesConfigurationDataConfigurationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface ConfigurationDataConfigurationApi extends ApiClient.Api {


  /**
   * Query attribute sets of configuration
   * Determines the attribute sets of a configuration.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ConfigurationDataConfigurationAttributeSetsResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/AttributeSets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConfigurationDataConfigurationAttributeSetsResponse configurationDataConfigurationAttributeSets(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataConfigurationAttributeSetsRequest body);

  /**
   * Query attribute sets of configuration
   * Similar to <code>configurationDataConfigurationAttributeSets</code> but it also returns the http response headers .
   * Determines the attribute sets of a configuration.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/AttributeSets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConfigurationDataConfigurationAttributeSetsResponse> configurationDataConfigurationAttributeSetsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataConfigurationAttributeSetsRequest body);


  /**
   * Query attribute sets of configuration
   * Determines the attribute sets of a configuration.
   * Note, this is equivalent to the other <code>configurationDataConfigurationAttributeSets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConfigurationDataConfigurationAttributeSetsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConfigurationDataConfigurationAttributeSetsResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/AttributeSets?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConfigurationDataConfigurationAttributeSetsResponse configurationDataConfigurationAttributeSets(@Param("elid") String elid, ConfigurationDataConfigurationAttributeSetsRequest body, @QueryMap(encoded=true) ConfigurationDataConfigurationAttributeSetsQueryParams queryParams);

  /**
  * Query attribute sets of configuration
  * Determines the attribute sets of a configuration.
  * Note, this is equivalent to the other <code>configurationDataConfigurationAttributeSets</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConfigurationDataConfigurationAttributeSetsResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/AttributeSets?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConfigurationDataConfigurationAttributeSetsResponse> configurationDataConfigurationAttributeSetsWithHttpInfo(@Param("elid") String elid, ConfigurationDataConfigurationAttributeSetsRequest body, @QueryMap(encoded=true) ConfigurationDataConfigurationAttributeSetsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>configurationDataConfigurationAttributeSets</code> method in a fluent style.
   */
  public static class ConfigurationDataConfigurationAttributeSetsQueryParams extends HashMap<String, Object> {
    public ConfigurationDataConfigurationAttributeSetsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Identify layers of configuration
   * Determines the data layer of a configuration.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ConfigurationDataConfigurationLayersResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/Layers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConfigurationDataConfigurationLayersResponse configurationDataConfigurationLayers(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataConfigurationLayersRequest body);

  /**
   * Identify layers of configuration
   * Similar to <code>configurationDataConfigurationLayers</code> but it also returns the http response headers .
   * Determines the data layer of a configuration.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/Layers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConfigurationDataConfigurationLayersResponse> configurationDataConfigurationLayersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataConfigurationLayersRequest body);


  /**
   * Identify layers of configuration
   * Determines the data layer of a configuration.
   * Note, this is equivalent to the other <code>configurationDataConfigurationLayers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConfigurationDataConfigurationLayersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConfigurationDataConfigurationLayersResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/Layers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConfigurationDataConfigurationLayersResponse configurationDataConfigurationLayers(@Param("elid") String elid, ConfigurationDataConfigurationLayersRequest body, @QueryMap(encoded=true) ConfigurationDataConfigurationLayersQueryParams queryParams);

  /**
  * Identify layers of configuration
  * Determines the data layer of a configuration.
  * Note, this is equivalent to the other <code>configurationDataConfigurationLayers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConfigurationDataConfigurationLayersResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/Layers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConfigurationDataConfigurationLayersResponse> configurationDataConfigurationLayersWithHttpInfo(@Param("elid") String elid, ConfigurationDataConfigurationLayersRequest body, @QueryMap(encoded=true) ConfigurationDataConfigurationLayersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>configurationDataConfigurationLayers</code> method in a fluent style.
   */
  public static class ConfigurationDataConfigurationLayersQueryParams extends HashMap<String, Object> {
    public ConfigurationDataConfigurationLayersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ConfigurationDataConfigurationQueryResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConfigurationDataConfigurationQueryResponse configurationDataConfigurationQuery(@Param("sessionId") String sessionId, ConfigurationDataConfigurationQueryRequest body);

  /**
   * Basic query
   * Similar to <code>configurationDataConfigurationQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConfigurationDataConfigurationQueryResponse> configurationDataConfigurationQueryWithHttpInfo(@Param("sessionId") String sessionId, ConfigurationDataConfigurationQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>configurationDataConfigurationQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConfigurationDataConfigurationQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConfigurationDataConfigurationQueryResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConfigurationDataConfigurationQueryResponse configurationDataConfigurationQuery(ConfigurationDataConfigurationQueryRequest body, @QueryMap(encoded=true) ConfigurationDataConfigurationQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>configurationDataConfigurationQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConfigurationDataConfigurationQueryResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataConfiguration/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConfigurationDataConfigurationQueryResponse> configurationDataConfigurationQueryWithHttpInfo(ConfigurationDataConfigurationQueryRequest body, @QueryMap(encoded=true) ConfigurationDataConfigurationQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>configurationDataConfigurationQuery</code> method in a fluent style.
   */
  public static class ConfigurationDataConfigurationQueryQueryParams extends HashMap<String, Object> {
    public ConfigurationDataConfigurationQueryQueryParams sessionId(final String value) {
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
   * @return ConfigurationDataConfigurationSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConfigurationDataConfigurationSystemAttributesResponse configurationDataConfigurationSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataConfigurationSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>configurationDataConfigurationSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConfigurationDataConfigurationSystemAttributesResponse> configurationDataConfigurationSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataConfigurationSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>configurationDataConfigurationSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConfigurationDataConfigurationSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConfigurationDataConfigurationSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConfigurationDataConfigurationSystemAttributesResponse configurationDataConfigurationSystemAttributes(@Param("elid") String elid, ConfigurationDataConfigurationSystemAttributesRequest body, @QueryMap(encoded=true) ConfigurationDataConfigurationSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>configurationDataConfigurationSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConfigurationDataConfigurationSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConfigurationDataConfigurationSystemAttributesResponse> configurationDataConfigurationSystemAttributesWithHttpInfo(@Param("elid") String elid, ConfigurationDataConfigurationSystemAttributesRequest body, @QueryMap(encoded=true) ConfigurationDataConfigurationSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>configurationDataConfigurationSystemAttributes</code> method in a fluent style.
   */
  public static class ConfigurationDataConfigurationSystemAttributesQueryParams extends HashMap<String, Object> {
    public ConfigurationDataConfigurationSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesConfigurationDataConfigurationResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesConfigurationDataConfigurationResponse updateSystemAttributesConfigurationDataConfiguration(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesConfigurationDataConfigurationRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesConfigurationDataConfiguration</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesConfigurationDataConfigurationResponse> updateSystemAttributesConfigurationDataConfigurationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesConfigurationDataConfigurationRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesConfigurationDataConfiguration</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesConfigurationDataConfigurationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesConfigurationDataConfigurationResponse
   */
  @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesConfigurationDataConfigurationResponse updateSystemAttributesConfigurationDataConfiguration(@Param("elid") String elid, UpdateSystemAttributesConfigurationDataConfigurationRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesConfigurationDataConfigurationQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesConfigurationDataConfiguration</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesConfigurationDataConfigurationResponse
      */
      @RequestLine("POST /api/rest/entity/configurationDataConfiguration/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesConfigurationDataConfigurationResponse> updateSystemAttributesConfigurationDataConfigurationWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesConfigurationDataConfigurationRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesConfigurationDataConfigurationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesConfigurationDataConfiguration</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesConfigurationDataConfigurationQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesConfigurationDataConfigurationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
