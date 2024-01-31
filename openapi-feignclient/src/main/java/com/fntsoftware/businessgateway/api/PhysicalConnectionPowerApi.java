package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.PhysicalConnectionPowerCableRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionPowerCableResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionPowerFromPortRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionPowerFromPortResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionPowerPhysicalConnectionPowerRequest;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionPowerPhysicalConnectionPowerResponse;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionPowerToPortRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionPowerToPortResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface PhysicalConnectionPowerApi extends ApiClient.Api {


  /**
   * Get relations to Power cable entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PhysicalConnectionPowerCableResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}/Cable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalConnectionPowerCableResponseData physicalConnectionPowerCable(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionPowerCableRequestData body);

  /**
   * Get relations to Power cable entities
   * Similar to <code>physicalConnectionPowerCable</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}/Cable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalConnectionPowerCableResponseData> physicalConnectionPowerCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionPowerCableRequestData body);


  /**
   * Get relations to Power cable entities
   * 
   * Note, this is equivalent to the other <code>physicalConnectionPowerCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalConnectionPowerCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalConnectionPowerCableResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}/Cable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalConnectionPowerCableResponseData physicalConnectionPowerCable(@Param("elid") String elid, PhysicalConnectionPowerCableRequestData body, @QueryMap(encoded=true) PhysicalConnectionPowerCableQueryParams queryParams);

  /**
  * Get relations to Power cable entities
  * 
  * Note, this is equivalent to the other <code>physicalConnectionPowerCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalConnectionPowerCableResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}/Cable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalConnectionPowerCableResponseData> physicalConnectionPowerCableWithHttpInfo(@Param("elid") String elid, PhysicalConnectionPowerCableRequestData body, @QueryMap(encoded=true) PhysicalConnectionPowerCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalConnectionPowerCable</code> method in a fluent style.
   */
  public static class PhysicalConnectionPowerCableQueryParams extends HashMap<String, Object> {
    public PhysicalConnectionPowerCableQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to From port entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PhysicalConnectionPowerFromPortResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}/FromPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalConnectionPowerFromPortResponseData physicalConnectionPowerFromPort(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionPowerFromPortRequestData body);

  /**
   * Get relations to From port entities
   * Similar to <code>physicalConnectionPowerFromPort</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}/FromPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalConnectionPowerFromPortResponseData> physicalConnectionPowerFromPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionPowerFromPortRequestData body);


  /**
   * Get relations to From port entities
   * 
   * Note, this is equivalent to the other <code>physicalConnectionPowerFromPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalConnectionPowerFromPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalConnectionPowerFromPortResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}/FromPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalConnectionPowerFromPortResponseData physicalConnectionPowerFromPort(@Param("elid") String elid, PhysicalConnectionPowerFromPortRequestData body, @QueryMap(encoded=true) PhysicalConnectionPowerFromPortQueryParams queryParams);

  /**
  * Get relations to From port entities
  * 
  * Note, this is equivalent to the other <code>physicalConnectionPowerFromPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalConnectionPowerFromPortResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}/FromPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalConnectionPowerFromPortResponseData> physicalConnectionPowerFromPortWithHttpInfo(@Param("elid") String elid, PhysicalConnectionPowerFromPortRequestData body, @QueryMap(encoded=true) PhysicalConnectionPowerFromPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalConnectionPowerFromPort</code> method in a fluent style.
   */
  public static class PhysicalConnectionPowerFromPortQueryParams extends HashMap<String, Object> {
    public PhysicalConnectionPowerFromPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Physical connection (current)
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PhysicalConnectionPowerPhysicalConnectionPowerResponse
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalConnectionPowerPhysicalConnectionPowerResponse physicalConnectionPowerPhysicalConnectionPower(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionPowerPhysicalConnectionPowerRequest body);

  /**
   * Query Physical connection (current)
   * Similar to <code>physicalConnectionPowerPhysicalConnectionPower</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalConnectionPowerPhysicalConnectionPowerResponse> physicalConnectionPowerPhysicalConnectionPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionPowerPhysicalConnectionPowerRequest body);


  /**
   * Query Physical connection (current)
   * 
   * Note, this is equivalent to the other <code>physicalConnectionPowerPhysicalConnectionPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalConnectionPowerPhysicalConnectionPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalConnectionPowerPhysicalConnectionPowerResponse
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalConnectionPowerPhysicalConnectionPowerResponse physicalConnectionPowerPhysicalConnectionPower(@Param("elid") String elid, PhysicalConnectionPowerPhysicalConnectionPowerRequest body, @QueryMap(encoded=true) PhysicalConnectionPowerPhysicalConnectionPowerQueryParams queryParams);

  /**
  * Query Physical connection (current)
  * 
  * Note, this is equivalent to the other <code>physicalConnectionPowerPhysicalConnectionPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalConnectionPowerPhysicalConnectionPowerResponse
      */
      @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalConnectionPowerPhysicalConnectionPowerResponse> physicalConnectionPowerPhysicalConnectionPowerWithHttpInfo(@Param("elid") String elid, PhysicalConnectionPowerPhysicalConnectionPowerRequest body, @QueryMap(encoded=true) PhysicalConnectionPowerPhysicalConnectionPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalConnectionPowerPhysicalConnectionPower</code> method in a fluent style.
   */
  public static class PhysicalConnectionPowerPhysicalConnectionPowerQueryParams extends HashMap<String, Object> {
    public PhysicalConnectionPowerPhysicalConnectionPowerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to To port entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PhysicalConnectionPowerToPortResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}/ToPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalConnectionPowerToPortResponseData physicalConnectionPowerToPort(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionPowerToPortRequestData body);

  /**
   * Get relations to To port entities
   * Similar to <code>physicalConnectionPowerToPort</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}/ToPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalConnectionPowerToPortResponseData> physicalConnectionPowerToPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionPowerToPortRequestData body);


  /**
   * Get relations to To port entities
   * 
   * Note, this is equivalent to the other <code>physicalConnectionPowerToPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalConnectionPowerToPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalConnectionPowerToPortResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}/ToPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalConnectionPowerToPortResponseData physicalConnectionPowerToPort(@Param("elid") String elid, PhysicalConnectionPowerToPortRequestData body, @QueryMap(encoded=true) PhysicalConnectionPowerToPortQueryParams queryParams);

  /**
  * Get relations to To port entities
  * 
  * Note, this is equivalent to the other <code>physicalConnectionPowerToPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalConnectionPowerToPortResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalConnectionPower/{elid}/ToPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalConnectionPowerToPortResponseData> physicalConnectionPowerToPortWithHttpInfo(@Param("elid") String elid, PhysicalConnectionPowerToPortRequestData body, @QueryMap(encoded=true) PhysicalConnectionPowerToPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalConnectionPowerToPort</code> method in a fluent style.
   */
  public static class PhysicalConnectionPowerToPortQueryParams extends HashMap<String, Object> {
    public PhysicalConnectionPowerToPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
