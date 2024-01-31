package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.PowerTerminalInstallationDetailsRequest;
import com.fntsoftware.businessgateway.entities.PowerTerminalInstallationDetailsResponse;
import com.fntsoftware.businessgateway.entities.PowerTerminalPhysicalPortsPowerRequestData;
import com.fntsoftware.businessgateway.entities.PowerTerminalPhysicalPortsPowerResponseData;
import com.fntsoftware.businessgateway.entities.PowerTerminalPowerRailsRequestData;
import com.fntsoftware.businessgateway.entities.PowerTerminalPowerRailsResponseData;
import com.fntsoftware.businessgateway.entities.PowerTerminalQueryRequest;
import com.fntsoftware.businessgateway.entities.PowerTerminalQueryResponse;
import com.fntsoftware.businessgateway.entities.PowerTerminalSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.PowerTerminalSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPowerTerminalRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPowerTerminalResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface PowerTerminalApi extends ApiClient.Api {


  /**
   * Query Installation details
   * Query the basic data for installation details
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerTerminalInstallationDetailsResponse
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/InstallationDetails?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerTerminalInstallationDetailsResponse powerTerminalInstallationDetails(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerTerminalInstallationDetailsRequest body);

  /**
   * Query Installation details
   * Similar to <code>powerTerminalInstallationDetails</code> but it also returns the http response headers .
   * Query the basic data for installation details
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/InstallationDetails?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerTerminalInstallationDetailsResponse> powerTerminalInstallationDetailsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerTerminalInstallationDetailsRequest body);


  /**
   * Query Installation details
   * Query the basic data for installation details
   * Note, this is equivalent to the other <code>powerTerminalInstallationDetails</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerTerminalInstallationDetailsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerTerminalInstallationDetailsResponse
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/InstallationDetails?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerTerminalInstallationDetailsResponse powerTerminalInstallationDetails(@Param("elid") String elid, PowerTerminalInstallationDetailsRequest body, @QueryMap(encoded=true) PowerTerminalInstallationDetailsQueryParams queryParams);

  /**
  * Query Installation details
  * Query the basic data for installation details
  * Note, this is equivalent to the other <code>powerTerminalInstallationDetails</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerTerminalInstallationDetailsResponse
      */
      @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/InstallationDetails?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerTerminalInstallationDetailsResponse> powerTerminalInstallationDetailsWithHttpInfo(@Param("elid") String elid, PowerTerminalInstallationDetailsRequest body, @QueryMap(encoded=true) PowerTerminalInstallationDetailsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerTerminalInstallationDetails</code> method in a fluent style.
   */
  public static class PowerTerminalInstallationDetailsQueryParams extends HashMap<String, Object> {
    public PowerTerminalInstallationDetailsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Physical port (power) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerTerminalPhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerTerminalPhysicalPortsPowerResponseData powerTerminalPhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerTerminalPhysicalPortsPowerRequestData body);

  /**
   * Get relations to Physical port (power) entities
   * Similar to <code>powerTerminalPhysicalPortsPower</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerTerminalPhysicalPortsPowerResponseData> powerTerminalPhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerTerminalPhysicalPortsPowerRequestData body);


  /**
   * Get relations to Physical port (power) entities
   * 
   * Note, this is equivalent to the other <code>powerTerminalPhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerTerminalPhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerTerminalPhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerTerminalPhysicalPortsPowerResponseData powerTerminalPhysicalPortsPower(@Param("elid") String elid, PowerTerminalPhysicalPortsPowerRequestData body, @QueryMap(encoded=true) PowerTerminalPhysicalPortsPowerQueryParams queryParams);

  /**
  * Get relations to Physical port (power) entities
  * 
  * Note, this is equivalent to the other <code>powerTerminalPhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerTerminalPhysicalPortsPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerTerminalPhysicalPortsPowerResponseData> powerTerminalPhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, PowerTerminalPhysicalPortsPowerRequestData body, @QueryMap(encoded=true) PowerTerminalPhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerTerminalPhysicalPortsPower</code> method in a fluent style.
   */
  public static class PowerTerminalPhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public PowerTerminalPhysicalPortsPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Power rail entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerTerminalPowerRailsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/PowerRails?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerTerminalPowerRailsResponseData powerTerminalPowerRails(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerTerminalPowerRailsRequestData body);

  /**
   * Get relations to Power rail entities
   * Similar to <code>powerTerminalPowerRails</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/PowerRails?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerTerminalPowerRailsResponseData> powerTerminalPowerRailsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerTerminalPowerRailsRequestData body);


  /**
   * Get relations to Power rail entities
   * 
   * Note, this is equivalent to the other <code>powerTerminalPowerRails</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerTerminalPowerRailsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerTerminalPowerRailsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/PowerRails?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerTerminalPowerRailsResponseData powerTerminalPowerRails(@Param("elid") String elid, PowerTerminalPowerRailsRequestData body, @QueryMap(encoded=true) PowerTerminalPowerRailsQueryParams queryParams);

  /**
  * Get relations to Power rail entities
  * 
  * Note, this is equivalent to the other <code>powerTerminalPowerRails</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerTerminalPowerRailsResponseData
      */
      @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/PowerRails?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerTerminalPowerRailsResponseData> powerTerminalPowerRailsWithHttpInfo(@Param("elid") String elid, PowerTerminalPowerRailsRequestData body, @QueryMap(encoded=true) PowerTerminalPowerRailsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerTerminalPowerRails</code> method in a fluent style.
   */
  public static class PowerTerminalPowerRailsQueryParams extends HashMap<String, Object> {
    public PowerTerminalPowerRailsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PowerTerminalQueryResponse
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerTerminalQueryResponse powerTerminalQuery(@Param("sessionId") String sessionId, PowerTerminalQueryRequest body);

  /**
   * Basic query
   * Similar to <code>powerTerminalQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerTerminalQueryResponse> powerTerminalQueryWithHttpInfo(@Param("sessionId") String sessionId, PowerTerminalQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>powerTerminalQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerTerminalQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerTerminalQueryResponse
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerTerminalQueryResponse powerTerminalQuery(PowerTerminalQueryRequest body, @QueryMap(encoded=true) PowerTerminalQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>powerTerminalQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerTerminalQueryResponse
      */
      @RequestLine("POST /api/rest/entity/powerTerminal/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerTerminalQueryResponse> powerTerminalQueryWithHttpInfo(PowerTerminalQueryRequest body, @QueryMap(encoded=true) PowerTerminalQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerTerminalQuery</code> method in a fluent style.
   */
  public static class PowerTerminalQueryQueryParams extends HashMap<String, Object> {
    public PowerTerminalQueryQueryParams sessionId(final String value) {
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
   * @return PowerTerminalSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerTerminalSystemAttributesResponse powerTerminalSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerTerminalSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>powerTerminalSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerTerminalSystemAttributesResponse> powerTerminalSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerTerminalSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>powerTerminalSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerTerminalSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerTerminalSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerTerminalSystemAttributesResponse powerTerminalSystemAttributes(@Param("elid") String elid, PowerTerminalSystemAttributesRequest body, @QueryMap(encoded=true) PowerTerminalSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>powerTerminalSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerTerminalSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerTerminalSystemAttributesResponse> powerTerminalSystemAttributesWithHttpInfo(@Param("elid") String elid, PowerTerminalSystemAttributesRequest body, @QueryMap(encoded=true) PowerTerminalSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerTerminalSystemAttributes</code> method in a fluent style.
   */
  public static class PowerTerminalSystemAttributesQueryParams extends HashMap<String, Object> {
    public PowerTerminalSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesPowerTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesPowerTerminalResponse updateSystemAttributesPowerTerminal(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPowerTerminalRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesPowerTerminal</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesPowerTerminalResponse> updateSystemAttributesPowerTerminalWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPowerTerminalRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesPowerTerminal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesPowerTerminalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesPowerTerminalResponse
   */
  @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesPowerTerminalResponse updateSystemAttributesPowerTerminal(@Param("elid") String elid, UpdateSystemAttributesPowerTerminalRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPowerTerminalQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesPowerTerminal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesPowerTerminalResponse
      */
      @RequestLine("POST /api/rest/entity/powerTerminal/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesPowerTerminalResponse> updateSystemAttributesPowerTerminalWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesPowerTerminalRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPowerTerminalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesPowerTerminal</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesPowerTerminalQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesPowerTerminalQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
