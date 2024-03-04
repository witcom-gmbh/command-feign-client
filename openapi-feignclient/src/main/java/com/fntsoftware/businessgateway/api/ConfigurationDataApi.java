package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ConfigurationDataConfigurationsRequest;
import com.fntsoftware.businessgateway.entities.ConfigurationDataConfigurationsResponse;
import com.fntsoftware.businessgateway.entities.ConfigurationDataDataRequest;
import com.fntsoftware.businessgateway.entities.ConfigurationDataDataResponse;
import com.fntsoftware.businessgateway.entities.DeactivateEntryConfigurationDataRequestData;
import com.fntsoftware.businessgateway.entities.DeactivateEntryConfigurationDataResponse;
import com.fntsoftware.businessgateway.entities.DeleteEntryConfigurationDataRequestData;
import com.fntsoftware.businessgateway.entities.DeleteEntryConfigurationDataResponse;
import com.fntsoftware.businessgateway.entities.WriteDataConfigurationDataRequestData;
import com.fntsoftware.businessgateway.entities.WriteDataConfigurationDataResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ConfigurationDataApi extends ApiClient.Api {


  /**
   * Query configurations for object
   * Determines the configuration for a object.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ConfigurationDataConfigurationsResponse
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/Configurations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConfigurationDataConfigurationsResponse configurationDataConfigurations(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataConfigurationsRequest body);

  /**
   * Query configurations for object
   * Similar to <code>configurationDataConfigurations</code> but it also returns the http response headers .
   * Determines the configuration for a object.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/Configurations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConfigurationDataConfigurationsResponse> configurationDataConfigurationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataConfigurationsRequest body);


  /**
   * Query configurations for object
   * Determines the configuration for a object.
   * Note, this is equivalent to the other <code>configurationDataConfigurations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConfigurationDataConfigurationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConfigurationDataConfigurationsResponse
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/Configurations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConfigurationDataConfigurationsResponse configurationDataConfigurations(@Param("elid") String elid, ConfigurationDataConfigurationsRequest body, @QueryMap(encoded=true) ConfigurationDataConfigurationsQueryParams queryParams);

  /**
  * Query configurations for object
  * Determines the configuration for a object.
  * Note, this is equivalent to the other <code>configurationDataConfigurations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConfigurationDataConfigurationsResponse
      */
      @RequestLine("POST /api/rest/entity/configurationData/{elid}/Configurations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConfigurationDataConfigurationsResponse> configurationDataConfigurationsWithHttpInfo(@Param("elid") String elid, ConfigurationDataConfigurationsRequest body, @QueryMap(encoded=true) ConfigurationDataConfigurationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>configurationDataConfigurations</code> method in a fluent style.
   */
  public static class ConfigurationDataConfigurationsQueryParams extends HashMap<String, Object> {
    public ConfigurationDataConfigurationsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Generic configuration data query
   * Generic query to fetch configuration data. All attributes of the attribute set can be added as result.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ConfigurationDataDataResponse
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/Data?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ConfigurationDataDataResponse configurationDataData(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataDataRequest body);

  /**
   * Generic configuration data query
   * Similar to <code>configurationDataData</code> but it also returns the http response headers .
   * Generic query to fetch configuration data. All attributes of the attribute set can be added as result.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/Data?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ConfigurationDataDataResponse> configurationDataDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ConfigurationDataDataRequest body);


  /**
   * Generic configuration data query
   * Generic query to fetch configuration data. All attributes of the attribute set can be added as result.
   * Note, this is equivalent to the other <code>configurationDataData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ConfigurationDataDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ConfigurationDataDataResponse
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/Data?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ConfigurationDataDataResponse configurationDataData(@Param("elid") String elid, ConfigurationDataDataRequest body, @QueryMap(encoded=true) ConfigurationDataDataQueryParams queryParams);

  /**
  * Generic configuration data query
  * Generic query to fetch configuration data. All attributes of the attribute set can be added as result.
  * Note, this is equivalent to the other <code>configurationDataData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ConfigurationDataDataResponse
      */
      @RequestLine("POST /api/rest/entity/configurationData/{elid}/Data?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ConfigurationDataDataResponse> configurationDataDataWithHttpInfo(@Param("elid") String elid, ConfigurationDataDataRequest body, @QueryMap(encoded=true) ConfigurationDataDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>configurationDataData</code> method in a fluent style.
   */
  public static class ConfigurationDataDataQueryParams extends HashMap<String, Object> {
    public ConfigurationDataDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Deactivate entries of an attribute set
   * Entries can only be deactivated for layers that use a validity date. Only entries of TABLE attribute sets can be deactivated.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeactivateEntryConfigurationDataResponse
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/deactivateEntry?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeactivateEntryConfigurationDataResponse deactivateEntryConfigurationData(@Param("sessionId") String sessionId, @Param("elid") String elid, DeactivateEntryConfigurationDataRequestData body);

  /**
   * Deactivate entries of an attribute set
   * Similar to <code>deactivateEntryConfigurationData</code> but it also returns the http response headers .
   * Entries can only be deactivated for layers that use a validity date. Only entries of TABLE attribute sets can be deactivated.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/deactivateEntry?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeactivateEntryConfigurationDataResponse> deactivateEntryConfigurationDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeactivateEntryConfigurationDataRequestData body);


  /**
   * Deactivate entries of an attribute set
   * Entries can only be deactivated for layers that use a validity date. Only entries of TABLE attribute sets can be deactivated.
   * Note, this is equivalent to the other <code>deactivateEntryConfigurationData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeactivateEntryConfigurationDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeactivateEntryConfigurationDataResponse
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/deactivateEntry?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeactivateEntryConfigurationDataResponse deactivateEntryConfigurationData(@Param("elid") String elid, DeactivateEntryConfigurationDataRequestData body, @QueryMap(encoded=true) DeactivateEntryConfigurationDataQueryParams queryParams);

  /**
  * Deactivate entries of an attribute set
  * Entries can only be deactivated for layers that use a validity date. Only entries of TABLE attribute sets can be deactivated.
  * Note, this is equivalent to the other <code>deactivateEntryConfigurationData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeactivateEntryConfigurationDataResponse
      */
      @RequestLine("POST /api/rest/entity/configurationData/{elid}/deactivateEntry?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeactivateEntryConfigurationDataResponse> deactivateEntryConfigurationDataWithHttpInfo(@Param("elid") String elid, DeactivateEntryConfigurationDataRequestData body, @QueryMap(encoded=true) DeactivateEntryConfigurationDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deactivateEntryConfigurationData</code> method in a fluent style.
   */
  public static class DeactivateEntryConfigurationDataQueryParams extends HashMap<String, Object> {
    public DeactivateEntryConfigurationDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete entries of an attribute set
   * Deletes entries of an attribute set. If the specified layer uses a validity date, the attribute OLD_VALIDITY_DATE is required.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteEntryConfigurationDataResponse
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/deleteEntry?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteEntryConfigurationDataResponse deleteEntryConfigurationData(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteEntryConfigurationDataRequestData body);

  /**
   * Delete entries of an attribute set
   * Similar to <code>deleteEntryConfigurationData</code> but it also returns the http response headers .
   * Deletes entries of an attribute set. If the specified layer uses a validity date, the attribute OLD_VALIDITY_DATE is required.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/deleteEntry?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteEntryConfigurationDataResponse> deleteEntryConfigurationDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteEntryConfigurationDataRequestData body);


  /**
   * Delete entries of an attribute set
   * Deletes entries of an attribute set. If the specified layer uses a validity date, the attribute OLD_VALIDITY_DATE is required.
   * Note, this is equivalent to the other <code>deleteEntryConfigurationData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteEntryConfigurationDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteEntryConfigurationDataResponse
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/deleteEntry?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteEntryConfigurationDataResponse deleteEntryConfigurationData(@Param("elid") String elid, DeleteEntryConfigurationDataRequestData body, @QueryMap(encoded=true) DeleteEntryConfigurationDataQueryParams queryParams);

  /**
  * Delete entries of an attribute set
  * Deletes entries of an attribute set. If the specified layer uses a validity date, the attribute OLD_VALIDITY_DATE is required.
  * Note, this is equivalent to the other <code>deleteEntryConfigurationData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteEntryConfigurationDataResponse
      */
      @RequestLine("POST /api/rest/entity/configurationData/{elid}/deleteEntry?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteEntryConfigurationDataResponse> deleteEntryConfigurationDataWithHttpInfo(@Param("elid") String elid, DeleteEntryConfigurationDataRequestData body, @QueryMap(encoded=true) DeleteEntryConfigurationDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteEntryConfigurationData</code> method in a fluent style.
   */
  public static class DeleteEntryConfigurationDataQueryParams extends HashMap<String, Object> {
    public DeleteEntryConfigurationDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Generic configuration data change
   * Generic operation to update and add all possible configuration data. Attributes of the attribute set can be added additionally.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return WriteDataConfigurationDataResponse
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/writeData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  WriteDataConfigurationDataResponse writeDataConfigurationData(@Param("sessionId") String sessionId, @Param("elid") String elid, WriteDataConfigurationDataRequestData body);

  /**
   * Generic configuration data change
   * Similar to <code>writeDataConfigurationData</code> but it also returns the http response headers .
   * Generic operation to update and add all possible configuration data. Attributes of the attribute set can be added additionally.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/writeData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<WriteDataConfigurationDataResponse> writeDataConfigurationDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, WriteDataConfigurationDataRequestData body);


  /**
   * Generic configuration data change
   * Generic operation to update and add all possible configuration data. Attributes of the attribute set can be added additionally.
   * Note, this is equivalent to the other <code>writeDataConfigurationData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link WriteDataConfigurationDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return WriteDataConfigurationDataResponse
   */
  @RequestLine("POST /api/rest/entity/configurationData/{elid}/writeData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  WriteDataConfigurationDataResponse writeDataConfigurationData(@Param("elid") String elid, WriteDataConfigurationDataRequestData body, @QueryMap(encoded=true) WriteDataConfigurationDataQueryParams queryParams);

  /**
  * Generic configuration data change
  * Generic operation to update and add all possible configuration data. Attributes of the attribute set can be added additionally.
  * Note, this is equivalent to the other <code>writeDataConfigurationData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return WriteDataConfigurationDataResponse
      */
      @RequestLine("POST /api/rest/entity/configurationData/{elid}/writeData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<WriteDataConfigurationDataResponse> writeDataConfigurationDataWithHttpInfo(@Param("elid") String elid, WriteDataConfigurationDataRequestData body, @QueryMap(encoded=true) WriteDataConfigurationDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>writeDataConfigurationData</code> method in a fluent style.
   */
  public static class WriteDataConfigurationDataQueryParams extends HashMap<String, Object> {
    public WriteDataConfigurationDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
