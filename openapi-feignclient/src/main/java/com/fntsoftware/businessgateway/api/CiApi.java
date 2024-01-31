package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CiDataResponse;
import com.fntsoftware.businessgateway.entities.CiHeadDataResponse;
import com.fntsoftware.businessgateway.entities.LinkedCisResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:00:24.721128812Z[Etc/UTC]")
public interface CiApi extends ApiClient.Api {


  /**
   * 
   * 
   * @param sessionid Session-ID (required)
   * @param ciElid  (required)
   * @param baseAttributes  (optional)
   * @param extendedAttributes  (optional)
   * @param systemAttributes  (optional)
   * @param planView plan view (optional)
   * @return CiDataResponse
   */
  @RequestLine("GET /rest/ci/{ciElid}/Data?sessionid={sessionid}&baseAttributes={baseAttributes}&extendedAttributes={extendedAttributes}&systemAttributes={systemAttributes}&planView={planView}")
  @Headers({
    "Accept: application/json",
  })
  CiDataResponse getCiData(@Param("sessionid") String sessionid, @Param("ciElid") String ciElid, @Param("baseAttributes") Boolean baseAttributes, @Param("extendedAttributes") Boolean extendedAttributes, @Param("systemAttributes") Boolean systemAttributes, @Param("planView") Boolean planView);

  /**
   * 
   * Similar to <code>getCiData</code> but it also returns the http response headers .
   * 
   * @param sessionid Session-ID (required)
   * @param ciElid  (required)
   * @param baseAttributes  (optional)
   * @param extendedAttributes  (optional)
   * @param systemAttributes  (optional)
   * @param planView plan view (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /rest/ci/{ciElid}/Data?sessionid={sessionid}&baseAttributes={baseAttributes}&extendedAttributes={extendedAttributes}&systemAttributes={systemAttributes}&planView={planView}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CiDataResponse> getCiDataWithHttpInfo(@Param("sessionid") String sessionid, @Param("ciElid") String ciElid, @Param("baseAttributes") Boolean baseAttributes, @Param("extendedAttributes") Boolean extendedAttributes, @Param("systemAttributes") Boolean systemAttributes, @Param("planView") Boolean planView);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getCiData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCiDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param ciElid  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionid - Session-ID (required)</li>
   *   <li>baseAttributes -  (optional)</li>
   *   <li>extendedAttributes -  (optional)</li>
   *   <li>systemAttributes -  (optional)</li>
   *   <li>planView - plan view (optional)</li>
   *   </ul>
   * @return CiDataResponse
   */
  @RequestLine("GET /rest/ci/{ciElid}/Data?sessionid={sessionid}&baseAttributes={baseAttributes}&extendedAttributes={extendedAttributes}&systemAttributes={systemAttributes}&planView={planView}")
  @Headers({
  "Accept: application/json",
  })
  CiDataResponse getCiData(@Param("ciElid") String ciElid, @QueryMap(encoded=true) GetCiDataQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getCiData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param ciElid  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionid - Session-ID (required)</li>
          *   <li>baseAttributes -  (optional)</li>
          *   <li>extendedAttributes -  (optional)</li>
          *   <li>systemAttributes -  (optional)</li>
          *   <li>planView - plan view (optional)</li>
      *   </ul>
          * @return CiDataResponse
      */
      @RequestLine("GET /rest/ci/{ciElid}/Data?sessionid={sessionid}&baseAttributes={baseAttributes}&extendedAttributes={extendedAttributes}&systemAttributes={systemAttributes}&planView={planView}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<CiDataResponse> getCiDataWithHttpInfo(@Param("ciElid") String ciElid, @QueryMap(encoded=true) GetCiDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getCiData</code> method in a fluent style.
   */
  public static class GetCiDataQueryParams extends HashMap<String, Object> {
    public GetCiDataQueryParams sessionid(final String value) {
      put("sessionid", EncodingUtils.encode(value));
      return this;
    }
    public GetCiDataQueryParams baseAttributes(final Boolean value) {
      put("baseAttributes", EncodingUtils.encode(value));
      return this;
    }
    public GetCiDataQueryParams extendedAttributes(final Boolean value) {
      put("extendedAttributes", EncodingUtils.encode(value));
      return this;
    }
    public GetCiDataQueryParams systemAttributes(final Boolean value) {
      put("systemAttributes", EncodingUtils.encode(value));
      return this;
    }
    public GetCiDataQueryParams planView(final Boolean value) {
      put("planView", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param sessionid Session-ID (required)
   * @param ciElid  (required)
   * @param planView plan view (optional)
   * @return CiHeadDataResponse
   */
  @RequestLine("GET /rest/ci/{ciElid}/HeadData?sessionid={sessionid}&planView={planView}")
  @Headers({
    "Accept: application/json",
  })
  CiHeadDataResponse getCiHeadData(@Param("sessionid") String sessionid, @Param("ciElid") String ciElid, @Param("planView") Boolean planView);

  /**
   * 
   * Similar to <code>getCiHeadData</code> but it also returns the http response headers .
   * 
   * @param sessionid Session-ID (required)
   * @param ciElid  (required)
   * @param planView plan view (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /rest/ci/{ciElid}/HeadData?sessionid={sessionid}&planView={planView}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<CiHeadDataResponse> getCiHeadDataWithHttpInfo(@Param("sessionid") String sessionid, @Param("ciElid") String ciElid, @Param("planView") Boolean planView);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getCiHeadData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetCiHeadDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param ciElid  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionid - Session-ID (required)</li>
   *   <li>planView - plan view (optional)</li>
   *   </ul>
   * @return CiHeadDataResponse
   */
  @RequestLine("GET /rest/ci/{ciElid}/HeadData?sessionid={sessionid}&planView={planView}")
  @Headers({
  "Accept: application/json",
  })
  CiHeadDataResponse getCiHeadData(@Param("ciElid") String ciElid, @QueryMap(encoded=true) GetCiHeadDataQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getCiHeadData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param ciElid  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionid - Session-ID (required)</li>
          *   <li>planView - plan view (optional)</li>
      *   </ul>
          * @return CiHeadDataResponse
      */
      @RequestLine("GET /rest/ci/{ciElid}/HeadData?sessionid={sessionid}&planView={planView}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<CiHeadDataResponse> getCiHeadDataWithHttpInfo(@Param("ciElid") String ciElid, @QueryMap(encoded=true) GetCiHeadDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getCiHeadData</code> method in a fluent style.
   */
  public static class GetCiHeadDataQueryParams extends HashMap<String, Object> {
    public GetCiHeadDataQueryParams sessionid(final String value) {
      put("sessionid", EncodingUtils.encode(value));
      return this;
    }
    public GetCiHeadDataQueryParams planView(final Boolean value) {
      put("planView", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * 
   * @param sessionid Session-ID (required)
   * @param ciElid  (required)
   * @param planView plan view (optional)
   * @return LinkedCisResponse
   */
  @RequestLine("GET /rest/ci/{ciElid}/LinkedCis?sessionid={sessionid}&planView={planView}")
  @Headers({
    "Accept: application/json",
  })
  LinkedCisResponse getlinkedCis(@Param("sessionid") String sessionid, @Param("ciElid") String ciElid, @Param("planView") Boolean planView);

  /**
   * 
   * Similar to <code>getlinkedCis</code> but it also returns the http response headers .
   * 
   * @param sessionid Session-ID (required)
   * @param ciElid  (required)
   * @param planView plan view (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /rest/ci/{ciElid}/LinkedCis?sessionid={sessionid}&planView={planView}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<LinkedCisResponse> getlinkedCisWithHttpInfo(@Param("sessionid") String sessionid, @Param("ciElid") String ciElid, @Param("planView") Boolean planView);


  /**
   * 
   * 
   * Note, this is equivalent to the other <code>getlinkedCis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetlinkedCisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param ciElid  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionid - Session-ID (required)</li>
   *   <li>planView - plan view (optional)</li>
   *   </ul>
   * @return LinkedCisResponse
   */
  @RequestLine("GET /rest/ci/{ciElid}/LinkedCis?sessionid={sessionid}&planView={planView}")
  @Headers({
  "Accept: application/json",
  })
  LinkedCisResponse getlinkedCis(@Param("ciElid") String ciElid, @QueryMap(encoded=true) GetlinkedCisQueryParams queryParams);

  /**
  * 
  * 
  * Note, this is equivalent to the other <code>getlinkedCis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param ciElid  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionid - Session-ID (required)</li>
          *   <li>planView - plan view (optional)</li>
      *   </ul>
          * @return LinkedCisResponse
      */
      @RequestLine("GET /rest/ci/{ciElid}/LinkedCis?sessionid={sessionid}&planView={planView}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<LinkedCisResponse> getlinkedCisWithHttpInfo(@Param("ciElid") String ciElid, @QueryMap(encoded=true) GetlinkedCisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>getlinkedCis</code> method in a fluent style.
   */
  public static class GetlinkedCisQueryParams extends HashMap<String, Object> {
    public GetlinkedCisQueryParams sessionid(final String value) {
      put("sessionid", EncodingUtils.encode(value));
      return this;
    }
    public GetlinkedCisQueryParams planView(final Boolean value) {
      put("planView", EncodingUtils.encode(value));
      return this;
    }
  }
}
