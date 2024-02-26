package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.PhysicalConnectionDataCableRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionDataCableResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionDataFromPortRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionDataFromPortResponseData;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionDataPhysicalConnectionDataRequest;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionDataPhysicalConnectionDataResponse;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionDataToPortRequestData;
import com.fntsoftware.businessgateway.entities.PhysicalConnectionDataToPortResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface PhysicalConnectionDataApi extends ApiClient.Api {


  /**
   * Get relations to Data cable entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PhysicalConnectionDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}/Cable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalConnectionDataCableResponseData physicalConnectionDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionDataCableRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>physicalConnectionDataCable</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}/Cable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalConnectionDataCableResponseData> physicalConnectionDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionDataCableRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>physicalConnectionDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalConnectionDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalConnectionDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}/Cable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalConnectionDataCableResponseData physicalConnectionDataCable(@Param("elid") String elid, PhysicalConnectionDataCableRequestData body, @QueryMap(encoded=true) PhysicalConnectionDataCableQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>physicalConnectionDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalConnectionDataCableResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}/Cable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalConnectionDataCableResponseData> physicalConnectionDataCableWithHttpInfo(@Param("elid") String elid, PhysicalConnectionDataCableRequestData body, @QueryMap(encoded=true) PhysicalConnectionDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalConnectionDataCable</code> method in a fluent style.
   */
  public static class PhysicalConnectionDataCableQueryParams extends HashMap<String, Object> {
    public PhysicalConnectionDataCableQueryParams sessionId(final String value) {
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
   * @return PhysicalConnectionDataFromPortResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}/FromPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalConnectionDataFromPortResponseData physicalConnectionDataFromPort(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionDataFromPortRequestData body);

  /**
   * Get relations to From port entities
   * Similar to <code>physicalConnectionDataFromPort</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}/FromPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalConnectionDataFromPortResponseData> physicalConnectionDataFromPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionDataFromPortRequestData body);


  /**
   * Get relations to From port entities
   * 
   * Note, this is equivalent to the other <code>physicalConnectionDataFromPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalConnectionDataFromPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalConnectionDataFromPortResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}/FromPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalConnectionDataFromPortResponseData physicalConnectionDataFromPort(@Param("elid") String elid, PhysicalConnectionDataFromPortRequestData body, @QueryMap(encoded=true) PhysicalConnectionDataFromPortQueryParams queryParams);

  /**
  * Get relations to From port entities
  * 
  * Note, this is equivalent to the other <code>physicalConnectionDataFromPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalConnectionDataFromPortResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}/FromPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalConnectionDataFromPortResponseData> physicalConnectionDataFromPortWithHttpInfo(@Param("elid") String elid, PhysicalConnectionDataFromPortRequestData body, @QueryMap(encoded=true) PhysicalConnectionDataFromPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalConnectionDataFromPort</code> method in a fluent style.
   */
  public static class PhysicalConnectionDataFromPortQueryParams extends HashMap<String, Object> {
    public PhysicalConnectionDataFromPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Physical connection (data)
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return PhysicalConnectionDataPhysicalConnectionDataResponse
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalConnectionDataPhysicalConnectionDataResponse physicalConnectionDataPhysicalConnectionData(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionDataPhysicalConnectionDataRequest body);

  /**
   * Query Physical connection (data)
   * Similar to <code>physicalConnectionDataPhysicalConnectionData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalConnectionDataPhysicalConnectionDataResponse> physicalConnectionDataPhysicalConnectionDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionDataPhysicalConnectionDataRequest body);


  /**
   * Query Physical connection (data)
   * 
   * Note, this is equivalent to the other <code>physicalConnectionDataPhysicalConnectionData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalConnectionDataPhysicalConnectionDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalConnectionDataPhysicalConnectionDataResponse
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalConnectionDataPhysicalConnectionDataResponse physicalConnectionDataPhysicalConnectionData(@Param("elid") String elid, PhysicalConnectionDataPhysicalConnectionDataRequest body, @QueryMap(encoded=true) PhysicalConnectionDataPhysicalConnectionDataQueryParams queryParams);

  /**
  * Query Physical connection (data)
  * 
  * Note, this is equivalent to the other <code>physicalConnectionDataPhysicalConnectionData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalConnectionDataPhysicalConnectionDataResponse
      */
      @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalConnectionDataPhysicalConnectionDataResponse> physicalConnectionDataPhysicalConnectionDataWithHttpInfo(@Param("elid") String elid, PhysicalConnectionDataPhysicalConnectionDataRequest body, @QueryMap(encoded=true) PhysicalConnectionDataPhysicalConnectionDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalConnectionDataPhysicalConnectionData</code> method in a fluent style.
   */
  public static class PhysicalConnectionDataPhysicalConnectionDataQueryParams extends HashMap<String, Object> {
    public PhysicalConnectionDataPhysicalConnectionDataQueryParams sessionId(final String value) {
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
   * @return PhysicalConnectionDataToPortResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}/ToPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PhysicalConnectionDataToPortResponseData physicalConnectionDataToPort(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionDataToPortRequestData body);

  /**
   * Get relations to To port entities
   * Similar to <code>physicalConnectionDataToPort</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}/ToPort?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<PhysicalConnectionDataToPortResponseData> physicalConnectionDataToPortWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, PhysicalConnectionDataToPortRequestData body);


  /**
   * Get relations to To port entities
   * 
   * Note, this is equivalent to the other <code>physicalConnectionDataToPort</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PhysicalConnectionDataToPortQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return PhysicalConnectionDataToPortResponseData
   */
  @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}/ToPort?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PhysicalConnectionDataToPortResponseData physicalConnectionDataToPort(@Param("elid") String elid, PhysicalConnectionDataToPortRequestData body, @QueryMap(encoded=true) PhysicalConnectionDataToPortQueryParams queryParams);

  /**
  * Get relations to To port entities
  * 
  * Note, this is equivalent to the other <code>physicalConnectionDataToPort</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return PhysicalConnectionDataToPortResponseData
      */
      @RequestLine("POST /api/rest/entity/physicalConnectionData/{elid}/ToPort?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<PhysicalConnectionDataToPortResponseData> physicalConnectionDataToPortWithHttpInfo(@Param("elid") String elid, PhysicalConnectionDataToPortRequestData body, @QueryMap(encoded=true) PhysicalConnectionDataToPortQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>physicalConnectionDataToPort</code> method in a fluent style.
   */
  public static class PhysicalConnectionDataToPortQueryParams extends HashMap<String, Object> {
    public PhysicalConnectionDataToPortQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
