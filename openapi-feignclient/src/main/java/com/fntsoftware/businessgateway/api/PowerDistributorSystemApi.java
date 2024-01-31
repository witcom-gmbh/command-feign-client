package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.PowerDistributorSystemPowerRailsRequestData;
import com.fntsoftware.businessgateway.entities.PowerDistributorSystemPowerRailsResponseData;
import com.fntsoftware.businessgateway.entities.PowerDistributorSystemQueryRequest;
import com.fntsoftware.businessgateway.entities.PowerDistributorSystemQueryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface PowerDistributorSystemApi extends ApiClient.Api {


  /**
   * Get relations to Power rail entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PowerDistributorSystemPowerRailsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerDistributorSystem/{elid}/PowerRails?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerDistributorSystemPowerRailsResponseData powerDistributorSystemPowerRails(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerDistributorSystemPowerRailsRequestData body);

  /**
   * Get relations to Power rail entities
   * Similar to <code>powerDistributorSystemPowerRails</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerDistributorSystem/{elid}/PowerRails?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerDistributorSystemPowerRailsResponseData> powerDistributorSystemPowerRailsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PowerDistributorSystemPowerRailsRequestData body);


  /**
   * Get relations to Power rail entities
   * 
   * Note, this is equivalent to the other <code>powerDistributorSystemPowerRails</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerDistributorSystemPowerRailsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerDistributorSystemPowerRailsResponseData
   */
  @RequestLine("POST /api/rest/entity/powerDistributorSystem/{elid}/PowerRails?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerDistributorSystemPowerRailsResponseData powerDistributorSystemPowerRails(@Param("elid") String elid, PowerDistributorSystemPowerRailsRequestData body, @QueryMap(encoded=true) PowerDistributorSystemPowerRailsQueryParams queryParams);

  /**
  * Get relations to Power rail entities
  * 
  * Note, this is equivalent to the other <code>powerDistributorSystemPowerRails</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerDistributorSystemPowerRailsResponseData
      */
      @RequestLine("POST /api/rest/entity/powerDistributorSystem/{elid}/PowerRails?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerDistributorSystemPowerRailsResponseData> powerDistributorSystemPowerRailsWithHttpInfo(@Param("elid") String elid, PowerDistributorSystemPowerRailsRequestData body, @QueryMap(encoded=true) PowerDistributorSystemPowerRailsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerDistributorSystemPowerRails</code> method in a fluent style.
   */
  public static class PowerDistributorSystemPowerRailsQueryParams extends HashMap<String, Object> {
    public PowerDistributorSystemPowerRailsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return PowerDistributorSystemQueryResponse
   */
  @RequestLine("POST /api/rest/entity/powerDistributorSystem/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PowerDistributorSystemQueryResponse powerDistributorSystemQuery(@Param("sessionId") String sessionId, PowerDistributorSystemQueryRequest body);

  /**
   * Basic query
   * Similar to <code>powerDistributorSystemQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/powerDistributorSystem/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PowerDistributorSystemQueryResponse> powerDistributorSystemQueryWithHttpInfo(@Param("sessionId") String sessionId, PowerDistributorSystemQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>powerDistributorSystemQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PowerDistributorSystemQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PowerDistributorSystemQueryResponse
   */
  @RequestLine("POST /api/rest/entity/powerDistributorSystem/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PowerDistributorSystemQueryResponse powerDistributorSystemQuery(PowerDistributorSystemQueryRequest body, @QueryMap(encoded=true) PowerDistributorSystemQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>powerDistributorSystemQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PowerDistributorSystemQueryResponse
      */
      @RequestLine("POST /api/rest/entity/powerDistributorSystem/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PowerDistributorSystemQueryResponse> powerDistributorSystemQueryWithHttpInfo(PowerDistributorSystemQueryRequest body, @QueryMap(encoded=true) PowerDistributorSystemQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>powerDistributorSystemQuery</code> method in a fluent style.
   */
  public static class PowerDistributorSystemQueryQueryParams extends HashMap<String, Object> {
    public PowerDistributorSystemQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
