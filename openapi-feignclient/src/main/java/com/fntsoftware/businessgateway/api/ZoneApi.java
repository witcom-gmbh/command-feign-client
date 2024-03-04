package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ZoneInheritedGeoCoordinatesRequest;
import com.fntsoftware.businessgateway.entities.ZoneInheritedGeoCoordinatesResponse;
import com.fntsoftware.businessgateway.entities.ZoneObjectZoneHierarchyRequest;
import com.fntsoftware.businessgateway.entities.ZoneObjectZoneHierarchyResponse;
import com.fntsoftware.businessgateway.entities.ZonePlaceableDevicesRequest;
import com.fntsoftware.businessgateway.entities.ZonePlaceableDevicesResponse;
import com.fntsoftware.businessgateway.entities.ZoneQueryContentRequest;
import com.fntsoftware.businessgateway.entities.ZoneQueryContentResponse;
import com.fntsoftware.businessgateway.entities.ZoneQueryRequest;
import com.fntsoftware.businessgateway.entities.ZoneQueryResponse;
import com.fntsoftware.businessgateway.entities.ZoneQueryScrollFirstRequest;
import com.fntsoftware.businessgateway.entities.ZoneQueryScrollFirstResponse;
import com.fntsoftware.businessgateway.entities.ZoneQueryScrollMoreRequest;
import com.fntsoftware.businessgateway.entities.ZoneQueryScrollMoreResponse;
import com.fntsoftware.businessgateway.entities.ZoneServicesTelcoRequest;
import com.fntsoftware.businessgateway.entities.ZoneServicesTelcoResponse;
import com.fntsoftware.businessgateway.entities.ZoneZoneRelatedObjectsRequest;
import com.fntsoftware.businessgateway.entities.ZoneZoneRelatedObjectsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ZoneApi extends ApiClient.Api {


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ZoneInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/zone/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ZoneInheritedGeoCoordinatesResponse zoneInheritedGeoCoordinates(@Param("sessionId") String sessionId, ZoneInheritedGeoCoordinatesRequest body);

  /**
   * Query inherited coordinates
   * Similar to <code>zoneInheritedGeoCoordinates</code> but it also returns the http response headers .
   * Query the own coordinates of an object or inherit them from parents
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/zone/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ZoneInheritedGeoCoordinatesResponse> zoneInheritedGeoCoordinatesWithHttpInfo(@Param("sessionId") String sessionId, ZoneInheritedGeoCoordinatesRequest body);


  /**
   * Query inherited coordinates
   * Query the own coordinates of an object or inherit them from parents
   * Note, this is equivalent to the other <code>zoneInheritedGeoCoordinates</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ZoneInheritedGeoCoordinatesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ZoneInheritedGeoCoordinatesResponse
   */
  @RequestLine("POST /api/rest/entity/zone/inheritedGeoCoordinates?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ZoneInheritedGeoCoordinatesResponse zoneInheritedGeoCoordinates(ZoneInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) ZoneInheritedGeoCoordinatesQueryParams queryParams);

  /**
  * Query inherited coordinates
  * Query the own coordinates of an object or inherit them from parents
  * Note, this is equivalent to the other <code>zoneInheritedGeoCoordinates</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ZoneInheritedGeoCoordinatesResponse
      */
      @RequestLine("POST /api/rest/entity/zone/inheritedGeoCoordinates?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ZoneInheritedGeoCoordinatesResponse> zoneInheritedGeoCoordinatesWithHttpInfo(ZoneInheritedGeoCoordinatesRequest body, @QueryMap(encoded=true) ZoneInheritedGeoCoordinatesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>zoneInheritedGeoCoordinates</code> method in a fluent style.
   */
  public static class ZoneInheritedGeoCoordinatesQueryParams extends HashMap<String, Object> {
    public ZoneInheritedGeoCoordinatesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query zone hierarchy of the object
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ZoneObjectZoneHierarchyResponse
   */
  @RequestLine("POST /api/rest/entity/zone/objectZoneHierarchy?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ZoneObjectZoneHierarchyResponse zoneObjectZoneHierarchy(@Param("sessionId") String sessionId, ZoneObjectZoneHierarchyRequest body);

  /**
   * Query zone hierarchy of the object
   * Similar to <code>zoneObjectZoneHierarchy</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/zone/objectZoneHierarchy?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ZoneObjectZoneHierarchyResponse> zoneObjectZoneHierarchyWithHttpInfo(@Param("sessionId") String sessionId, ZoneObjectZoneHierarchyRequest body);


  /**
   * Query zone hierarchy of the object
   * 
   * Note, this is equivalent to the other <code>zoneObjectZoneHierarchy</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ZoneObjectZoneHierarchyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ZoneObjectZoneHierarchyResponse
   */
  @RequestLine("POST /api/rest/entity/zone/objectZoneHierarchy?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ZoneObjectZoneHierarchyResponse zoneObjectZoneHierarchy(ZoneObjectZoneHierarchyRequest body, @QueryMap(encoded=true) ZoneObjectZoneHierarchyQueryParams queryParams);

  /**
  * Query zone hierarchy of the object
  * 
  * Note, this is equivalent to the other <code>zoneObjectZoneHierarchy</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ZoneObjectZoneHierarchyResponse
      */
      @RequestLine("POST /api/rest/entity/zone/objectZoneHierarchy?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ZoneObjectZoneHierarchyResponse> zoneObjectZoneHierarchyWithHttpInfo(ZoneObjectZoneHierarchyRequest body, @QueryMap(encoded=true) ZoneObjectZoneHierarchyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>zoneObjectZoneHierarchy</code> method in a fluent style.
   */
  public static class ZoneObjectZoneHierarchyQueryParams extends HashMap<String, Object> {
    public ZoneObjectZoneHierarchyQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Devices for zone
   * Fetch placeable devices for the zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ZonePlaceableDevicesResponse
   */
  @RequestLine("POST /api/rest/entity/zone/placeableDevices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ZonePlaceableDevicesResponse zonePlaceableDevices(@Param("sessionId") String sessionId, ZonePlaceableDevicesRequest body);

  /**
   * Devices for zone
   * Similar to <code>zonePlaceableDevices</code> but it also returns the http response headers .
   * Fetch placeable devices for the zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/zone/placeableDevices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ZonePlaceableDevicesResponse> zonePlaceableDevicesWithHttpInfo(@Param("sessionId") String sessionId, ZonePlaceableDevicesRequest body);


  /**
   * Devices for zone
   * Fetch placeable devices for the zone
   * Note, this is equivalent to the other <code>zonePlaceableDevices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ZonePlaceableDevicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ZonePlaceableDevicesResponse
   */
  @RequestLine("POST /api/rest/entity/zone/placeableDevices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ZonePlaceableDevicesResponse zonePlaceableDevices(ZonePlaceableDevicesRequest body, @QueryMap(encoded=true) ZonePlaceableDevicesQueryParams queryParams);

  /**
  * Devices for zone
  * Fetch placeable devices for the zone
  * Note, this is equivalent to the other <code>zonePlaceableDevices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ZonePlaceableDevicesResponse
      */
      @RequestLine("POST /api/rest/entity/zone/placeableDevices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ZonePlaceableDevicesResponse> zonePlaceableDevicesWithHttpInfo(ZonePlaceableDevicesRequest body, @QueryMap(encoded=true) ZonePlaceableDevicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>zonePlaceableDevices</code> method in a fluent style.
   */
  public static class ZonePlaceableDevicesQueryParams extends HashMap<String, Object> {
    public ZonePlaceableDevicesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: campus, building, floor, room.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ZoneQueryResponse
   */
  @RequestLine("POST /api/rest/entity/zone/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ZoneQueryResponse zoneQuery(@Param("sessionId") String sessionId, ZoneQueryRequest body);

  /**
   * Basic query
   * Similar to <code>zoneQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: campus, building, floor, room.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/zone/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ZoneQueryResponse> zoneQueryWithHttpInfo(@Param("sessionId") String sessionId, ZoneQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: campus, building, floor, room.
   * Note, this is equivalent to the other <code>zoneQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ZoneQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ZoneQueryResponse
   */
  @RequestLine("POST /api/rest/entity/zone/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ZoneQueryResponse zoneQuery(ZoneQueryRequest body, @QueryMap(encoded=true) ZoneQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: campus, building, floor, room.
  * Note, this is equivalent to the other <code>zoneQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ZoneQueryResponse
      */
      @RequestLine("POST /api/rest/entity/zone/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ZoneQueryResponse> zoneQueryWithHttpInfo(ZoneQueryRequest body, @QueryMap(encoded=true) ZoneQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>zoneQuery</code> method in a fluent style.
   */
  public static class ZoneQueryQueryParams extends HashMap<String, Object> {
    public ZoneQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query zone content
   * Returns all contents linked with a specific zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ZoneQueryContentResponse
   */
  @RequestLine("POST /api/rest/entity/zone/queryContent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ZoneQueryContentResponse zoneQueryContent(@Param("sessionId") String sessionId, ZoneQueryContentRequest body);

  /**
   * Query zone content
   * Similar to <code>zoneQueryContent</code> but it also returns the http response headers .
   * Returns all contents linked with a specific zone
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/zone/queryContent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ZoneQueryContentResponse> zoneQueryContentWithHttpInfo(@Param("sessionId") String sessionId, ZoneQueryContentRequest body);


  /**
   * Query zone content
   * Returns all contents linked with a specific zone
   * Note, this is equivalent to the other <code>zoneQueryContent</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ZoneQueryContentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ZoneQueryContentResponse
   */
  @RequestLine("POST /api/rest/entity/zone/queryContent?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ZoneQueryContentResponse zoneQueryContent(ZoneQueryContentRequest body, @QueryMap(encoded=true) ZoneQueryContentQueryParams queryParams);

  /**
  * Query zone content
  * Returns all contents linked with a specific zone
  * Note, this is equivalent to the other <code>zoneQueryContent</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ZoneQueryContentResponse
      */
      @RequestLine("POST /api/rest/entity/zone/queryContent?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ZoneQueryContentResponse> zoneQueryContentWithHttpInfo(ZoneQueryContentRequest body, @QueryMap(encoded=true) ZoneQueryContentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>zoneQueryContent</code> method in a fluent style.
   */
  public static class ZoneQueryContentQueryParams extends HashMap<String, Object> {
    public ZoneQueryContentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query scroll first
   * Query for fetching all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: campus, building, floor, room This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ZoneQueryScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/zone/queryScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ZoneQueryScrollFirstResponse zoneQueryScrollFirst(@Param("sessionId") String sessionId, ZoneQueryScrollFirstRequest body);

  /**
   * Basic query scroll first
   * Similar to <code>zoneQueryScrollFirst</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: campus, building, floor, room This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/zone/queryScrollFirst?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ZoneQueryScrollFirstResponse> zoneQueryScrollFirstWithHttpInfo(@Param("sessionId") String sessionId, ZoneQueryScrollFirstRequest body);


  /**
   * Basic query scroll first
   * Query for fetching all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: campus, building, floor, room This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
   * Note, this is equivalent to the other <code>zoneQueryScrollFirst</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ZoneQueryScrollFirstQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ZoneQueryScrollFirstResponse
   */
  @RequestLine("POST /api/rest/entity/zone/queryScrollFirst?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ZoneQueryScrollFirstResponse zoneQueryScrollFirst(ZoneQueryScrollFirstRequest body, @QueryMap(encoded=true) ZoneQueryScrollFirstQueryParams queryParams);

  /**
  * Basic query scroll first
  * Query for fetching all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: campus, building, floor, room This query supports scrolling. Calls the query and returns the first results including the scroll-ID for the next call.
  * Note, this is equivalent to the other <code>zoneQueryScrollFirst</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ZoneQueryScrollFirstResponse
      */
      @RequestLine("POST /api/rest/entity/zone/queryScrollFirst?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ZoneQueryScrollFirstResponse> zoneQueryScrollFirstWithHttpInfo(ZoneQueryScrollFirstRequest body, @QueryMap(encoded=true) ZoneQueryScrollFirstQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>zoneQueryScrollFirst</code> method in a fluent style.
   */
  public static class ZoneQueryScrollFirstQueryParams extends HashMap<String, Object> {
    public ZoneQueryScrollFirstQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query scroll more
   * Query for fetching all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: campus, building, floor, room This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ZoneQueryScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/zone/queryScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ZoneQueryScrollMoreResponse zoneQueryScrollMore(@Param("sessionId") String sessionId, ZoneQueryScrollMoreRequest body);

  /**
   * Basic query scroll more
   * Similar to <code>zoneQueryScrollMore</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: campus, building, floor, room This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/zone/queryScrollMore?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ZoneQueryScrollMoreResponse> zoneQueryScrollMoreWithHttpInfo(@Param("sessionId") String sessionId, ZoneQueryScrollMoreRequest body);


  /**
   * Basic query scroll more
   * Query for fetching all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: campus, building, floor, room This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
   * Note, this is equivalent to the other <code>zoneQueryScrollMore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ZoneQueryScrollMoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ZoneQueryScrollMoreResponse
   */
  @RequestLine("POST /api/rest/entity/zone/queryScrollMore?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ZoneQueryScrollMoreResponse zoneQueryScrollMore(ZoneQueryScrollMoreRequest body, @QueryMap(encoded=true) ZoneQueryScrollMoreQueryParams queryParams);

  /**
  * Basic query scroll more
  * Query for fetching all basic target entity data. Possible values for attribute &#39;Target sub entity&#39; (Alias of the target sub entity which specifies the target entity in detail.) are: campus, building, floor, room This query supports scrolling. Requires a scroll-ID and returns the next results of the query.
  * Note, this is equivalent to the other <code>zoneQueryScrollMore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ZoneQueryScrollMoreResponse
      */
      @RequestLine("POST /api/rest/entity/zone/queryScrollMore?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ZoneQueryScrollMoreResponse> zoneQueryScrollMoreWithHttpInfo(ZoneQueryScrollMoreRequest body, @QueryMap(encoded=true) ZoneQueryScrollMoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>zoneQueryScrollMore</code> method in a fluent style.
   */
  public static class ZoneQueryScrollMoreQueryParams extends HashMap<String, Object> {
    public ZoneQueryScrollMoreQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query services
   * Queries the linked services, their properties, associated start / end points and zones to a zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ZoneServicesTelcoResponse
   */
  @RequestLine("POST /api/rest/entity/zone/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ZoneServicesTelcoResponse zoneServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, ZoneServicesTelcoRequest body);

  /**
   * Query services
   * Similar to <code>zoneServicesTelco</code> but it also returns the http response headers .
   * Queries the linked services, their properties, associated start / end points and zones to a zone
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/zone/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ZoneServicesTelcoResponse> zoneServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ZoneServicesTelcoRequest body);


  /**
   * Query services
   * Queries the linked services, their properties, associated start / end points and zones to a zone
   * Note, this is equivalent to the other <code>zoneServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ZoneServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ZoneServicesTelcoResponse
   */
  @RequestLine("POST /api/rest/entity/zone/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ZoneServicesTelcoResponse zoneServicesTelco(@Param("elid") String elid, ZoneServicesTelcoRequest body, @QueryMap(encoded=true) ZoneServicesTelcoQueryParams queryParams);

  /**
  * Query services
  * Queries the linked services, their properties, associated start / end points and zones to a zone
  * Note, this is equivalent to the other <code>zoneServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ZoneServicesTelcoResponse
      */
      @RequestLine("POST /api/rest/entity/zone/{elid}/ServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ZoneServicesTelcoResponse> zoneServicesTelcoWithHttpInfo(@Param("elid") String elid, ZoneServicesTelcoRequest body, @QueryMap(encoded=true) ZoneServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>zoneServicesTelco</code> method in a fluent style.
   */
  public static class ZoneServicesTelcoQueryParams extends HashMap<String, Object> {
    public ZoneServicesTelcoQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Fetch all zone-related objects
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ZoneZoneRelatedObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/zone/zoneRelatedObjects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ZoneZoneRelatedObjectsResponse zoneZoneRelatedObjects(@Param("sessionId") String sessionId, ZoneZoneRelatedObjectsRequest body);

  /**
   * Fetch all zone-related objects
   * Similar to <code>zoneZoneRelatedObjects</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/zone/zoneRelatedObjects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ZoneZoneRelatedObjectsResponse> zoneZoneRelatedObjectsWithHttpInfo(@Param("sessionId") String sessionId, ZoneZoneRelatedObjectsRequest body);


  /**
   * Fetch all zone-related objects
   * 
   * Note, this is equivalent to the other <code>zoneZoneRelatedObjects</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ZoneZoneRelatedObjectsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ZoneZoneRelatedObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/zone/zoneRelatedObjects?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ZoneZoneRelatedObjectsResponse zoneZoneRelatedObjects(ZoneZoneRelatedObjectsRequest body, @QueryMap(encoded=true) ZoneZoneRelatedObjectsQueryParams queryParams);

  /**
  * Fetch all zone-related objects
  * 
  * Note, this is equivalent to the other <code>zoneZoneRelatedObjects</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ZoneZoneRelatedObjectsResponse
      */
      @RequestLine("POST /api/rest/entity/zone/zoneRelatedObjects?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ZoneZoneRelatedObjectsResponse> zoneZoneRelatedObjectsWithHttpInfo(ZoneZoneRelatedObjectsRequest body, @QueryMap(encoded=true) ZoneZoneRelatedObjectsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>zoneZoneRelatedObjects</code> method in a fluent style.
   */
  public static class ZoneZoneRelatedObjectsQueryParams extends HashMap<String, Object> {
    public ZoneZoneRelatedObjectsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
