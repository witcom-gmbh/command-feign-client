package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.FuseFuseRequest;
import com.fntsoftware.businessgateway.entities.FuseFuseResponse;
import com.fntsoftware.businessgateway.entities.FuseFuseTypeRequestData;
import com.fntsoftware.businessgateway.entities.FuseFuseTypeResponseData;
import com.fntsoftware.businessgateway.entities.FuseInstallationDetailsRequest;
import com.fntsoftware.businessgateway.entities.FuseInstallationDetailsResponse;
import com.fntsoftware.businessgateway.entities.FusePhysicalPortsPowerRequestData;
import com.fntsoftware.businessgateway.entities.FusePhysicalPortsPowerResponseData;
import com.fntsoftware.businessgateway.entities.FusePowerRailsRequestData;
import com.fntsoftware.businessgateway.entities.FusePowerRailsResponseData;
import com.fntsoftware.businessgateway.entities.FuseQueryRequest;
import com.fntsoftware.businessgateway.entities.FuseQueryResponse;
import com.fntsoftware.businessgateway.entities.FuseSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.FuseSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFuseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesFuseResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface FuseApi extends ApiClient.Api {


  /**
   * Query Fuse
   * Query the basic data from Fuse
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return FuseFuseResponse
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FuseFuseResponse fuseFuse(@Param("sessionId") String sessionId, @Param("elid") String elid, FuseFuseRequest body);

  /**
   * Query Fuse
   * Similar to <code>fuseFuse</code> but it also returns the http response headers .
   * Query the basic data from Fuse
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FuseFuseResponse> fuseFuseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FuseFuseRequest body);


  /**
   * Query Fuse
   * Query the basic data from Fuse
   * Note, this is equivalent to the other <code>fuseFuse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FuseFuseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FuseFuseResponse
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FuseFuseResponse fuseFuse(@Param("elid") String elid, FuseFuseRequest body, @QueryMap(encoded=true) FuseFuseQueryParams queryParams);

  /**
  * Query Fuse
  * Query the basic data from Fuse
  * Note, this is equivalent to the other <code>fuseFuse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FuseFuseResponse
      */
      @RequestLine("POST /api/rest/entity/fuse/{elid}?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FuseFuseResponse> fuseFuseWithHttpInfo(@Param("elid") String elid, FuseFuseRequest body, @QueryMap(encoded=true) FuseFuseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fuseFuse</code> method in a fluent style.
   */
  public static class FuseFuseQueryParams extends HashMap<String, Object> {
    public FuseFuseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Fuse type entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return FuseFuseTypeResponseData
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/FuseType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FuseFuseTypeResponseData fuseFuseType(@Param("sessionId") String sessionId, @Param("elid") String elid, FuseFuseTypeRequestData body);

  /**
   * Get relations to Fuse type entities
   * Similar to <code>fuseFuseType</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/FuseType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FuseFuseTypeResponseData> fuseFuseTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FuseFuseTypeRequestData body);


  /**
   * Get relations to Fuse type entities
   * 
   * Note, this is equivalent to the other <code>fuseFuseType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FuseFuseTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FuseFuseTypeResponseData
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/FuseType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FuseFuseTypeResponseData fuseFuseType(@Param("elid") String elid, FuseFuseTypeRequestData body, @QueryMap(encoded=true) FuseFuseTypeQueryParams queryParams);

  /**
  * Get relations to Fuse type entities
  * 
  * Note, this is equivalent to the other <code>fuseFuseType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FuseFuseTypeResponseData
      */
      @RequestLine("POST /api/rest/entity/fuse/{elid}/FuseType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FuseFuseTypeResponseData> fuseFuseTypeWithHttpInfo(@Param("elid") String elid, FuseFuseTypeRequestData body, @QueryMap(encoded=true) FuseFuseTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fuseFuseType</code> method in a fluent style.
   */
  public static class FuseFuseTypeQueryParams extends HashMap<String, Object> {
    public FuseFuseTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Installation details
   * Query the basic data from Installation details
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return FuseInstallationDetailsResponse
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/InstallationDetails?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FuseInstallationDetailsResponse fuseInstallationDetails(@Param("sessionId") String sessionId, @Param("elid") String elid, FuseInstallationDetailsRequest body);

  /**
   * Query Installation details
   * Similar to <code>fuseInstallationDetails</code> but it also returns the http response headers .
   * Query the basic data from Installation details
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/InstallationDetails?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FuseInstallationDetailsResponse> fuseInstallationDetailsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FuseInstallationDetailsRequest body);


  /**
   * Query Installation details
   * Query the basic data from Installation details
   * Note, this is equivalent to the other <code>fuseInstallationDetails</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FuseInstallationDetailsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FuseInstallationDetailsResponse
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/InstallationDetails?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FuseInstallationDetailsResponse fuseInstallationDetails(@Param("elid") String elid, FuseInstallationDetailsRequest body, @QueryMap(encoded=true) FuseInstallationDetailsQueryParams queryParams);

  /**
  * Query Installation details
  * Query the basic data from Installation details
  * Note, this is equivalent to the other <code>fuseInstallationDetails</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FuseInstallationDetailsResponse
      */
      @RequestLine("POST /api/rest/entity/fuse/{elid}/InstallationDetails?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FuseInstallationDetailsResponse> fuseInstallationDetailsWithHttpInfo(@Param("elid") String elid, FuseInstallationDetailsRequest body, @QueryMap(encoded=true) FuseInstallationDetailsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fuseInstallationDetails</code> method in a fluent style.
   */
  public static class FuseInstallationDetailsQueryParams extends HashMap<String, Object> {
    public FuseInstallationDetailsQueryParams sessionId(final String value) {
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
   * @return FusePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FusePhysicalPortsPowerResponseData fusePhysicalPortsPower(@Param("sessionId") String sessionId, @Param("elid") String elid, FusePhysicalPortsPowerRequestData body);

  /**
   * Get relations to Physical port (power) entities
   * Similar to <code>fusePhysicalPortsPower</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FusePhysicalPortsPowerResponseData> fusePhysicalPortsPowerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FusePhysicalPortsPowerRequestData body);


  /**
   * Get relations to Physical port (power) entities
   * 
   * Note, this is equivalent to the other <code>fusePhysicalPortsPower</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FusePhysicalPortsPowerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FusePhysicalPortsPowerResponseData
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/PhysicalPortsPower?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FusePhysicalPortsPowerResponseData fusePhysicalPortsPower(@Param("elid") String elid, FusePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) FusePhysicalPortsPowerQueryParams queryParams);

  /**
  * Get relations to Physical port (power) entities
  * 
  * Note, this is equivalent to the other <code>fusePhysicalPortsPower</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FusePhysicalPortsPowerResponseData
      */
      @RequestLine("POST /api/rest/entity/fuse/{elid}/PhysicalPortsPower?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FusePhysicalPortsPowerResponseData> fusePhysicalPortsPowerWithHttpInfo(@Param("elid") String elid, FusePhysicalPortsPowerRequestData body, @QueryMap(encoded=true) FusePhysicalPortsPowerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fusePhysicalPortsPower</code> method in a fluent style.
   */
  public static class FusePhysicalPortsPowerQueryParams extends HashMap<String, Object> {
    public FusePhysicalPortsPowerQueryParams sessionId(final String value) {
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
   * @return FusePowerRailsResponseData
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/PowerRails?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FusePowerRailsResponseData fusePowerRails(@Param("sessionId") String sessionId, @Param("elid") String elid, FusePowerRailsRequestData body);

  /**
   * Get relations to Power rail entities
   * Similar to <code>fusePowerRails</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/PowerRails?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FusePowerRailsResponseData> fusePowerRailsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FusePowerRailsRequestData body);


  /**
   * Get relations to Power rail entities
   * 
   * Note, this is equivalent to the other <code>fusePowerRails</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FusePowerRailsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FusePowerRailsResponseData
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/PowerRails?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FusePowerRailsResponseData fusePowerRails(@Param("elid") String elid, FusePowerRailsRequestData body, @QueryMap(encoded=true) FusePowerRailsQueryParams queryParams);

  /**
  * Get relations to Power rail entities
  * 
  * Note, this is equivalent to the other <code>fusePowerRails</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FusePowerRailsResponseData
      */
      @RequestLine("POST /api/rest/entity/fuse/{elid}/PowerRails?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FusePowerRailsResponseData> fusePowerRailsWithHttpInfo(@Param("elid") String elid, FusePowerRailsRequestData body, @QueryMap(encoded=true) FusePowerRailsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fusePowerRails</code> method in a fluent style.
   */
  public static class FusePowerRailsQueryParams extends HashMap<String, Object> {
    public FusePowerRailsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return FuseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/fuse/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FuseQueryResponse fuseQuery(@Param("sessionId") String sessionId, FuseQueryRequest body);

  /**
   * Basic query
   * Similar to <code>fuseQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fuse/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FuseQueryResponse> fuseQueryWithHttpInfo(@Param("sessionId") String sessionId, FuseQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>fuseQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FuseQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FuseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/fuse/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FuseQueryResponse fuseQuery(FuseQueryRequest body, @QueryMap(encoded=true) FuseQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>fuseQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FuseQueryResponse
      */
      @RequestLine("POST /api/rest/entity/fuse/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FuseQueryResponse> fuseQueryWithHttpInfo(FuseQueryRequest body, @QueryMap(encoded=true) FuseQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fuseQuery</code> method in a fluent style.
   */
  public static class FuseQueryQueryParams extends HashMap<String, Object> {
    public FuseQueryQueryParams sessionId(final String value) {
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
   * @return FuseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FuseSystemAttributesResponse fuseSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, FuseSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>fuseSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FuseSystemAttributesResponse> fuseSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FuseSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>fuseSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FuseSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FuseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FuseSystemAttributesResponse fuseSystemAttributes(@Param("elid") String elid, FuseSystemAttributesRequest body, @QueryMap(encoded=true) FuseSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>fuseSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FuseSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/fuse/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FuseSystemAttributesResponse> fuseSystemAttributesWithHttpInfo(@Param("elid") String elid, FuseSystemAttributesRequest body, @QueryMap(encoded=true) FuseSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>fuseSystemAttributes</code> method in a fluent style.
   */
  public static class FuseSystemAttributesQueryParams extends HashMap<String, Object> {
    public FuseSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesFuseResponse
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesFuseResponse updateSystemAttributesFuse(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesFuseRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesFuse</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesFuseResponse> updateSystemAttributesFuseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesFuseRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesFuse</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesFuseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesFuseResponse
   */
  @RequestLine("POST /api/rest/entity/fuse/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesFuseResponse updateSystemAttributesFuse(@Param("elid") String elid, UpdateSystemAttributesFuseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesFuseQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesFuse</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesFuseResponse
      */
      @RequestLine("POST /api/rest/entity/fuse/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesFuseResponse> updateSystemAttributesFuseWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesFuseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesFuseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesFuse</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesFuseQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesFuseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
