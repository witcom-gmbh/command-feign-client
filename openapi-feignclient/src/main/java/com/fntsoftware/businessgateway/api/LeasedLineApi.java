package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.LeasedLineCustomServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.LeasedLineCustomServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.LeasedLineCustomTcoInterconnectRequestData;
import com.fntsoftware.businessgateway.entities.LeasedLineCustomTcoInterconnectResponseData;
import com.fntsoftware.businessgateway.entities.LeasedLineQueryRequest;
import com.fntsoftware.businessgateway.entities.LeasedLineQueryResponse;
import com.fntsoftware.businessgateway.entities.LeasedLineSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.LeasedLineSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesLeasedLineRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesLeasedLineResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface LeasedLineApi extends ApiClient.Api {


  /**
   * Get relations to Service (Telco) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LeasedLineCustomServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLineCustomServicesTelcoResponseData leasedLineCustomServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineCustomServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>leasedLineCustomServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLineCustomServicesTelcoResponseData> leasedLineCustomServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineCustomServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>leasedLineCustomServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLineCustomServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLineCustomServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLineCustomServicesTelcoResponseData leasedLineCustomServicesTelco(@Param("elid") String elid, LeasedLineCustomServicesTelcoRequestData body, @QueryMap(encoded=true) LeasedLineCustomServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>leasedLineCustomServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLineCustomServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLineCustomServicesTelcoResponseData> leasedLineCustomServicesTelcoWithHttpInfo(@Param("elid") String elid, LeasedLineCustomServicesTelcoRequestData body, @QueryMap(encoded=true) LeasedLineCustomServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLineCustomServicesTelco</code> method in a fluent style.
   */
  public static class LeasedLineCustomServicesTelcoQueryParams extends HashMap<String, Object> {
    public LeasedLineCustomServicesTelcoQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Telco-Interconnect entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LeasedLineCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLineCustomTcoInterconnectResponseData leasedLineCustomTcoInterconnect(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineCustomTcoInterconnectRequestData body);

  /**
   * Get relations to Telco-Interconnect entities
   * Similar to <code>leasedLineCustomTcoInterconnect</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLineCustomTcoInterconnectResponseData> leasedLineCustomTcoInterconnectWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineCustomTcoInterconnectRequestData body);


  /**
   * Get relations to Telco-Interconnect entities
   * 
   * Note, this is equivalent to the other <code>leasedLineCustomTcoInterconnect</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLineCustomTcoInterconnectQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLineCustomTcoInterconnectResponseData
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLineCustomTcoInterconnectResponseData leasedLineCustomTcoInterconnect(@Param("elid") String elid, LeasedLineCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) LeasedLineCustomTcoInterconnectQueryParams queryParams);

  /**
  * Get relations to Telco-Interconnect entities
  * 
  * Note, this is equivalent to the other <code>leasedLineCustomTcoInterconnect</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLineCustomTcoInterconnectResponseData
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/CustomTcoInterconnect?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLineCustomTcoInterconnectResponseData> leasedLineCustomTcoInterconnectWithHttpInfo(@Param("elid") String elid, LeasedLineCustomTcoInterconnectRequestData body, @QueryMap(encoded=true) LeasedLineCustomTcoInterconnectQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLineCustomTcoInterconnect</code> method in a fluent style.
   */
  public static class LeasedLineCustomTcoInterconnectQueryParams extends HashMap<String, Object> {
    public LeasedLineCustomTcoInterconnectQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return LeasedLineQueryResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLineQueryResponse leasedLineQuery(@Param("sessionId") String sessionId, LeasedLineQueryRequest body);

  /**
   * Basic query
   * Similar to <code>leasedLineQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLineQueryResponse> leasedLineQueryWithHttpInfo(@Param("sessionId") String sessionId, LeasedLineQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>leasedLineQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLineQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLineQueryResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLineQueryResponse leasedLineQuery(LeasedLineQueryRequest body, @QueryMap(encoded=true) LeasedLineQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>leasedLineQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLineQueryResponse
      */
      @RequestLine("POST /api/rest/entity/leasedLine/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLineQueryResponse> leasedLineQueryWithHttpInfo(LeasedLineQueryRequest body, @QueryMap(encoded=true) LeasedLineQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLineQuery</code> method in a fluent style.
   */
  public static class LeasedLineQueryQueryParams extends HashMap<String, Object> {
    public LeasedLineQueryQueryParams sessionId(final String value) {
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
   * @return LeasedLineSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LeasedLineSystemAttributesResponse leasedLineSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>leasedLineSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LeasedLineSystemAttributesResponse> leasedLineSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LeasedLineSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>leasedLineSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LeasedLineSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LeasedLineSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LeasedLineSystemAttributesResponse leasedLineSystemAttributes(@Param("elid") String elid, LeasedLineSystemAttributesRequest body, @QueryMap(encoded=true) LeasedLineSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>leasedLineSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LeasedLineSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LeasedLineSystemAttributesResponse> leasedLineSystemAttributesWithHttpInfo(@Param("elid") String elid, LeasedLineSystemAttributesRequest body, @QueryMap(encoded=true) LeasedLineSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>leasedLineSystemAttributes</code> method in a fluent style.
   */
  public static class LeasedLineSystemAttributesQueryParams extends HashMap<String, Object> {
    public LeasedLineSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesLeasedLineResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesLeasedLineResponse updateSystemAttributesLeasedLine(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesLeasedLineRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesLeasedLine</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesLeasedLineResponse> updateSystemAttributesLeasedLineWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesLeasedLineRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesLeasedLine</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesLeasedLineQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesLeasedLineResponse
   */
  @RequestLine("POST /api/rest/entity/leasedLine/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesLeasedLineResponse updateSystemAttributesLeasedLine(@Param("elid") String elid, UpdateSystemAttributesLeasedLineRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesLeasedLineQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesLeasedLine</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesLeasedLineResponse
      */
      @RequestLine("POST /api/rest/entity/leasedLine/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesLeasedLineResponse> updateSystemAttributesLeasedLineWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesLeasedLineRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesLeasedLineQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesLeasedLine</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesLeasedLineQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesLeasedLineQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
