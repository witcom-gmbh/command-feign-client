package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.PowerRailFusesRequestData;
import com.fntsoftware.businessgateway.entities.PowerRailFusesResponseData;
import com.fntsoftware.businessgateway.entities.PowerRailInstallationDetailsRequest;
import com.fntsoftware.businessgateway.entities.PowerRailInstallationDetailsResponse;
import com.fntsoftware.businessgateway.entities.PowerRailPowerDistributorSystemsRequestData;
import com.fntsoftware.businessgateway.entities.PowerRailPowerDistributorSystemsResponseData;
import com.fntsoftware.businessgateway.entities.PowerRailPowerTerminalsRequestData;
import com.fntsoftware.businessgateway.entities.PowerRailPowerTerminalsResponseData;
import com.fntsoftware.businessgateway.entities.PowerRailQueryRequest;
import com.fntsoftware.businessgateway.entities.PowerRailQueryResponse;
import com.fntsoftware.businessgateway.entities.PowerRailSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.PowerRailSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPowerRailRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesPowerRailResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface PowerRailApi extends ApiClient.Api {


  /**
   * Get relations to Fuse entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerRailFusesResponseData
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/Fuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerRailFusesResponseData powerRailFuses(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerRailFusesRequestData body);

  /**
   * Get relations to Fuse entities
   * Similar to <code>powerRailFuses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/Fuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerRailFusesResponseData> powerRailFusesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerRailFusesRequestData body);


  /**
   * Get relations to Fuse entities
   * 
   * Note, this is equivalent to the other <code>powerRailFuses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerRailFusesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerRailFusesResponseData
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/Fuses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerRailFusesResponseData powerRailFuses(@Param("elid") String elid, PowerRailFusesRequestData body, @QueryMap(encoded=true) PowerRailFusesQueryParams queryParams);

  /**
  * Get relations to Fuse entities
  * 
  * Note, this is equivalent to the other <code>powerRailFuses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerRailFusesResponseData
      */
      @RequestLine("POST /api/rest/entity/powerRail/{elid}/Fuses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerRailFusesResponseData> powerRailFusesWithHttpInfo(@Param("elid") String elid, PowerRailFusesRequestData body, @QueryMap(encoded=true) PowerRailFusesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerRailFuses</code> method in a fluent style.
   */
  public static class PowerRailFusesQueryParams extends HashMap<String, Object> {
    public PowerRailFusesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Installation details
   * Query the basic data from installation details
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerRailInstallationDetailsResponse
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/InstallationDetails?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerRailInstallationDetailsResponse powerRailInstallationDetails(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerRailInstallationDetailsRequest body);

  /**
   * Query Installation details
   * Similar to <code>powerRailInstallationDetails</code> but it also returns the http response headers .
   * Query the basic data from installation details
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/InstallationDetails?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerRailInstallationDetailsResponse> powerRailInstallationDetailsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerRailInstallationDetailsRequest body);


  /**
   * Query Installation details
   * Query the basic data from installation details
   * Note, this is equivalent to the other <code>powerRailInstallationDetails</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerRailInstallationDetailsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerRailInstallationDetailsResponse
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/InstallationDetails?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerRailInstallationDetailsResponse powerRailInstallationDetails(@Param("elid") String elid, PowerRailInstallationDetailsRequest body, @QueryMap(encoded=true) PowerRailInstallationDetailsQueryParams queryParams);

  /**
  * Query Installation details
  * Query the basic data from installation details
  * Note, this is equivalent to the other <code>powerRailInstallationDetails</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerRailInstallationDetailsResponse
      */
      @RequestLine("POST /api/rest/entity/powerRail/{elid}/InstallationDetails?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerRailInstallationDetailsResponse> powerRailInstallationDetailsWithHttpInfo(@Param("elid") String elid, PowerRailInstallationDetailsRequest body, @QueryMap(encoded=true) PowerRailInstallationDetailsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerRailInstallationDetails</code> method in a fluent style.
   */
  public static class PowerRailInstallationDetailsQueryParams extends HashMap<String, Object> {
    public PowerRailInstallationDetailsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Power distributor system entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerRailPowerDistributorSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerRailPowerDistributorSystemsResponseData powerRailPowerDistributorSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerRailPowerDistributorSystemsRequestData body);

  /**
   * Get relations to Power distributor system entities
   * Similar to <code>powerRailPowerDistributorSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerRailPowerDistributorSystemsResponseData> powerRailPowerDistributorSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerRailPowerDistributorSystemsRequestData body);


  /**
   * Get relations to Power distributor system entities
   * 
   * Note, this is equivalent to the other <code>powerRailPowerDistributorSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerRailPowerDistributorSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerRailPowerDistributorSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerRailPowerDistributorSystemsResponseData powerRailPowerDistributorSystems(@Param("elid") String elid, PowerRailPowerDistributorSystemsRequestData body, @QueryMap(encoded=true) PowerRailPowerDistributorSystemsQueryParams queryParams);

  /**
  * Get relations to Power distributor system entities
  * 
  * Note, this is equivalent to the other <code>powerRailPowerDistributorSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerRailPowerDistributorSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/powerRail/{elid}/PowerDistributorSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerRailPowerDistributorSystemsResponseData> powerRailPowerDistributorSystemsWithHttpInfo(@Param("elid") String elid, PowerRailPowerDistributorSystemsRequestData body, @QueryMap(encoded=true) PowerRailPowerDistributorSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerRailPowerDistributorSystems</code> method in a fluent style.
   */
  public static class PowerRailPowerDistributorSystemsQueryParams extends HashMap<String, Object> {
    public PowerRailPowerDistributorSystemsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Power terminal entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerRailPowerTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/PowerTerminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerRailPowerTerminalsResponseData powerRailPowerTerminals(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerRailPowerTerminalsRequestData body);

  /**
   * Get relations to Power terminal entities
   * Similar to <code>powerRailPowerTerminals</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/PowerTerminals?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerRailPowerTerminalsResponseData> powerRailPowerTerminalsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerRailPowerTerminalsRequestData body);


  /**
   * Get relations to Power terminal entities
   * 
   * Note, this is equivalent to the other <code>powerRailPowerTerminals</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerRailPowerTerminalsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerRailPowerTerminalsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/PowerTerminals?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerRailPowerTerminalsResponseData powerRailPowerTerminals(@Param("elid") String elid, PowerRailPowerTerminalsRequestData body, @QueryMap(encoded=true) PowerRailPowerTerminalsQueryParams queryParams);

  /**
  * Get relations to Power terminal entities
  * 
  * Note, this is equivalent to the other <code>powerRailPowerTerminals</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerRailPowerTerminalsResponseData
      */
      @RequestLine("POST /api/rest/entity/powerRail/{elid}/PowerTerminals?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerRailPowerTerminalsResponseData> powerRailPowerTerminalsWithHttpInfo(@Param("elid") String elid, PowerRailPowerTerminalsRequestData body, @QueryMap(encoded=true) PowerRailPowerTerminalsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerRailPowerTerminals</code> method in a fluent style.
   */
  public static class PowerRailPowerTerminalsQueryParams extends HashMap<String, Object> {
    public PowerRailPowerTerminalsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PowerRailQueryResponse
   */
  @RequestLine("POST /api/rest/entity/powerRail/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerRailQueryResponse powerRailQuery(@Param("sessionId") String sessionId, PowerRailQueryRequest body);

  /**
   * Basic query
   * Similar to <code>powerRailQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerRail/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerRailQueryResponse> powerRailQueryWithHttpInfo(@Param("sessionId") String sessionId, PowerRailQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>powerRailQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerRailQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerRailQueryResponse
   */
  @RequestLine("POST /api/rest/entity/powerRail/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerRailQueryResponse powerRailQuery(PowerRailQueryRequest body, @QueryMap(encoded=true) PowerRailQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>powerRailQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerRailQueryResponse
      */
      @RequestLine("POST /api/rest/entity/powerRail/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerRailQueryResponse> powerRailQueryWithHttpInfo(PowerRailQueryRequest body, @QueryMap(encoded=true) PowerRailQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerRailQuery</code> method in a fluent style.
   */
  public static class PowerRailQueryQueryParams extends HashMap<String, Object> {
    public PowerRailQueryQueryParams sessionId(final String value) {
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
   * @return PowerRailSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerRailSystemAttributesResponse powerRailSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerRailSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>powerRailSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerRailSystemAttributesResponse> powerRailSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerRailSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>powerRailSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerRailSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerRailSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerRailSystemAttributesResponse powerRailSystemAttributes(@Param("elid") String elid, PowerRailSystemAttributesRequest body, @QueryMap(encoded=true) PowerRailSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>powerRailSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerRailSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/powerRail/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerRailSystemAttributesResponse> powerRailSystemAttributesWithHttpInfo(@Param("elid") String elid, PowerRailSystemAttributesRequest body, @QueryMap(encoded=true) PowerRailSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerRailSystemAttributes</code> method in a fluent style.
   */
  public static class PowerRailSystemAttributesQueryParams extends HashMap<String, Object> {
    public PowerRailSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesPowerRailResponse
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesPowerRailResponse updateSystemAttributesPowerRail(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPowerRailRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesPowerRail</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesPowerRailResponse> updateSystemAttributesPowerRailWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesPowerRailRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesPowerRail</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesPowerRailQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesPowerRailResponse
   */
  @RequestLine("POST /api/rest/entity/powerRail/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesPowerRailResponse updateSystemAttributesPowerRail(@Param("elid") String elid, UpdateSystemAttributesPowerRailRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPowerRailQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesPowerRail</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesPowerRailResponse
      */
      @RequestLine("POST /api/rest/entity/powerRail/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesPowerRailResponse> updateSystemAttributesPowerRailWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesPowerRailRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesPowerRailQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesPowerRail</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesPowerRailQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesPowerRailQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
