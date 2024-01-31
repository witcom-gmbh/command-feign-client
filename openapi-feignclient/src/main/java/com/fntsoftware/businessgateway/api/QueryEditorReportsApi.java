package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.QueryEditorReportsBuildingWithoutOrgRequest;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsBuildingWithoutOrgResponse;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsContractSimpleRequest;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsContractSimpleResponse;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsContractWithCostsRequest;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsContractWithCostsResponse;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsDevicesInJunkWhRequest;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsDevicesInJunkWhResponse;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsMeteringDataRequest;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsMeteringDataResponse;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsResourceGroupsFromHybridResourcesRequest;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsResourceGroupsFromHybridResourcesResponse;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsServerPhysischRequest;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsServerPhysischResponse;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsServerVirtualRequest;
import com.fntsoftware.businessgateway.entities.QueryEditorReportsServerVirtualResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface QueryEditorReportsApi extends ApiClient.Api {


  /**
   * Gebäude ohne Organisation
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return QueryEditorReportsBuildingWithoutOrgResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/buildingWithoutOrg?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  QueryEditorReportsBuildingWithoutOrgResponse queryEditorReportsBuildingWithoutOrg(@Param("sessionId") String sessionId, QueryEditorReportsBuildingWithoutOrgRequest body);

  /**
   * Gebäude ohne Organisation
   * Similar to <code>queryEditorReportsBuildingWithoutOrg</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/buildingWithoutOrg?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<QueryEditorReportsBuildingWithoutOrgResponse> queryEditorReportsBuildingWithoutOrgWithHttpInfo(@Param("sessionId") String sessionId, QueryEditorReportsBuildingWithoutOrgRequest body);


  /**
   * Gebäude ohne Organisation
   * 
   * Note, this is equivalent to the other <code>queryEditorReportsBuildingWithoutOrg</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryEditorReportsBuildingWithoutOrgQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return QueryEditorReportsBuildingWithoutOrgResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/buildingWithoutOrg?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  QueryEditorReportsBuildingWithoutOrgResponse queryEditorReportsBuildingWithoutOrg(QueryEditorReportsBuildingWithoutOrgRequest body, @QueryMap(encoded=true) QueryEditorReportsBuildingWithoutOrgQueryParams queryParams);

  /**
  * Gebäude ohne Organisation
  * 
  * Note, this is equivalent to the other <code>queryEditorReportsBuildingWithoutOrg</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return QueryEditorReportsBuildingWithoutOrgResponse
      */
      @RequestLine("POST /api/rest/entity/queryEditorReports/buildingWithoutOrg?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<QueryEditorReportsBuildingWithoutOrgResponse> queryEditorReportsBuildingWithoutOrgWithHttpInfo(QueryEditorReportsBuildingWithoutOrgRequest body, @QueryMap(encoded=true) QueryEditorReportsBuildingWithoutOrgQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>queryEditorReportsBuildingWithoutOrg</code> method in a fluent style.
   */
  public static class QueryEditorReportsBuildingWithoutOrgQueryParams extends HashMap<String, Object> {
    public QueryEditorReportsBuildingWithoutOrgQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Vertragsübersicht
   * Einfache Vertragsübersicht
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return QueryEditorReportsContractSimpleResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/contractSimple?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  QueryEditorReportsContractSimpleResponse queryEditorReportsContractSimple(@Param("sessionId") String sessionId, QueryEditorReportsContractSimpleRequest body);

  /**
   * Vertragsübersicht
   * Similar to <code>queryEditorReportsContractSimple</code> but it also returns the http response headers .
   * Einfache Vertragsübersicht
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/contractSimple?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<QueryEditorReportsContractSimpleResponse> queryEditorReportsContractSimpleWithHttpInfo(@Param("sessionId") String sessionId, QueryEditorReportsContractSimpleRequest body);


  /**
   * Vertragsübersicht
   * Einfache Vertragsübersicht
   * Note, this is equivalent to the other <code>queryEditorReportsContractSimple</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryEditorReportsContractSimpleQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return QueryEditorReportsContractSimpleResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/contractSimple?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  QueryEditorReportsContractSimpleResponse queryEditorReportsContractSimple(QueryEditorReportsContractSimpleRequest body, @QueryMap(encoded=true) QueryEditorReportsContractSimpleQueryParams queryParams);

  /**
  * Vertragsübersicht
  * Einfache Vertragsübersicht
  * Note, this is equivalent to the other <code>queryEditorReportsContractSimple</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return QueryEditorReportsContractSimpleResponse
      */
      @RequestLine("POST /api/rest/entity/queryEditorReports/contractSimple?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<QueryEditorReportsContractSimpleResponse> queryEditorReportsContractSimpleWithHttpInfo(QueryEditorReportsContractSimpleRequest body, @QueryMap(encoded=true) QueryEditorReportsContractSimpleQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>queryEditorReportsContractSimple</code> method in a fluent style.
   */
  public static class QueryEditorReportsContractSimpleQueryParams extends HashMap<String, Object> {
    public QueryEditorReportsContractSimpleQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Vertragsübersicht mit Kosten
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return QueryEditorReportsContractWithCostsResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/contractWithCosts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  QueryEditorReportsContractWithCostsResponse queryEditorReportsContractWithCosts(@Param("sessionId") String sessionId, QueryEditorReportsContractWithCostsRequest body);

  /**
   * Vertragsübersicht mit Kosten
   * Similar to <code>queryEditorReportsContractWithCosts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/contractWithCosts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<QueryEditorReportsContractWithCostsResponse> queryEditorReportsContractWithCostsWithHttpInfo(@Param("sessionId") String sessionId, QueryEditorReportsContractWithCostsRequest body);


  /**
   * Vertragsübersicht mit Kosten
   * 
   * Note, this is equivalent to the other <code>queryEditorReportsContractWithCosts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryEditorReportsContractWithCostsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return QueryEditorReportsContractWithCostsResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/contractWithCosts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  QueryEditorReportsContractWithCostsResponse queryEditorReportsContractWithCosts(QueryEditorReportsContractWithCostsRequest body, @QueryMap(encoded=true) QueryEditorReportsContractWithCostsQueryParams queryParams);

  /**
  * Vertragsübersicht mit Kosten
  * 
  * Note, this is equivalent to the other <code>queryEditorReportsContractWithCosts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return QueryEditorReportsContractWithCostsResponse
      */
      @RequestLine("POST /api/rest/entity/queryEditorReports/contractWithCosts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<QueryEditorReportsContractWithCostsResponse> queryEditorReportsContractWithCostsWithHttpInfo(QueryEditorReportsContractWithCostsRequest body, @QueryMap(encoded=true) QueryEditorReportsContractWithCostsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>queryEditorReportsContractWithCosts</code> method in a fluent style.
   */
  public static class QueryEditorReportsContractWithCostsQueryParams extends HashMap<String, Object> {
    public QueryEditorReportsContractWithCostsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Geräte im Schrottlager
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return QueryEditorReportsDevicesInJunkWhResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/devicesInJunkWh?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  QueryEditorReportsDevicesInJunkWhResponse queryEditorReportsDevicesInJunkWh(@Param("sessionId") String sessionId, QueryEditorReportsDevicesInJunkWhRequest body);

  /**
   * Geräte im Schrottlager
   * Similar to <code>queryEditorReportsDevicesInJunkWh</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/devicesInJunkWh?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<QueryEditorReportsDevicesInJunkWhResponse> queryEditorReportsDevicesInJunkWhWithHttpInfo(@Param("sessionId") String sessionId, QueryEditorReportsDevicesInJunkWhRequest body);


  /**
   * Geräte im Schrottlager
   * 
   * Note, this is equivalent to the other <code>queryEditorReportsDevicesInJunkWh</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryEditorReportsDevicesInJunkWhQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return QueryEditorReportsDevicesInJunkWhResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/devicesInJunkWh?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  QueryEditorReportsDevicesInJunkWhResponse queryEditorReportsDevicesInJunkWh(QueryEditorReportsDevicesInJunkWhRequest body, @QueryMap(encoded=true) QueryEditorReportsDevicesInJunkWhQueryParams queryParams);

  /**
  * Geräte im Schrottlager
  * 
  * Note, this is equivalent to the other <code>queryEditorReportsDevicesInJunkWh</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return QueryEditorReportsDevicesInJunkWhResponse
      */
      @RequestLine("POST /api/rest/entity/queryEditorReports/devicesInJunkWh?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<QueryEditorReportsDevicesInJunkWhResponse> queryEditorReportsDevicesInJunkWhWithHttpInfo(QueryEditorReportsDevicesInJunkWhRequest body, @QueryMap(encoded=true) QueryEditorReportsDevicesInJunkWhQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>queryEditorReportsDevicesInJunkWh</code> method in a fluent style.
   */
  public static class QueryEditorReportsDevicesInJunkWhQueryParams extends HashMap<String, Object> {
    public QueryEditorReportsDevicesInJunkWhQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Zählerstände
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return QueryEditorReportsMeteringDataResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/meteringData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  QueryEditorReportsMeteringDataResponse queryEditorReportsMeteringData(@Param("sessionId") String sessionId, QueryEditorReportsMeteringDataRequest body);

  /**
   * Zählerstände
   * Similar to <code>queryEditorReportsMeteringData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/meteringData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<QueryEditorReportsMeteringDataResponse> queryEditorReportsMeteringDataWithHttpInfo(@Param("sessionId") String sessionId, QueryEditorReportsMeteringDataRequest body);


  /**
   * Zählerstände
   * 
   * Note, this is equivalent to the other <code>queryEditorReportsMeteringData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryEditorReportsMeteringDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return QueryEditorReportsMeteringDataResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/meteringData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  QueryEditorReportsMeteringDataResponse queryEditorReportsMeteringData(QueryEditorReportsMeteringDataRequest body, @QueryMap(encoded=true) QueryEditorReportsMeteringDataQueryParams queryParams);

  /**
  * Zählerstände
  * 
  * Note, this is equivalent to the other <code>queryEditorReportsMeteringData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return QueryEditorReportsMeteringDataResponse
      */
      @RequestLine("POST /api/rest/entity/queryEditorReports/meteringData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<QueryEditorReportsMeteringDataResponse> queryEditorReportsMeteringDataWithHttpInfo(QueryEditorReportsMeteringDataRequest body, @QueryMap(encoded=true) QueryEditorReportsMeteringDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>queryEditorReportsMeteringData</code> method in a fluent style.
   */
  public static class QueryEditorReportsMeteringDataQueryParams extends HashMap<String, Object> {
    public QueryEditorReportsMeteringDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Resource Groups from Hybrid Resources
   * Part of a ValuePack, please contact your project manager for use
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return QueryEditorReportsResourceGroupsFromHybridResourcesResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/resourceGroupsFromHybridResources?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  QueryEditorReportsResourceGroupsFromHybridResourcesResponse queryEditorReportsResourceGroupsFromHybridResources(@Param("sessionId") String sessionId, QueryEditorReportsResourceGroupsFromHybridResourcesRequest body);

  /**
   * Resource Groups from Hybrid Resources
   * Similar to <code>queryEditorReportsResourceGroupsFromHybridResources</code> but it also returns the http response headers .
   * Part of a ValuePack, please contact your project manager for use
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/resourceGroupsFromHybridResources?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<QueryEditorReportsResourceGroupsFromHybridResourcesResponse> queryEditorReportsResourceGroupsFromHybridResourcesWithHttpInfo(@Param("sessionId") String sessionId, QueryEditorReportsResourceGroupsFromHybridResourcesRequest body);


  /**
   * Resource Groups from Hybrid Resources
   * Part of a ValuePack, please contact your project manager for use
   * Note, this is equivalent to the other <code>queryEditorReportsResourceGroupsFromHybridResources</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryEditorReportsResourceGroupsFromHybridResourcesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return QueryEditorReportsResourceGroupsFromHybridResourcesResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/resourceGroupsFromHybridResources?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  QueryEditorReportsResourceGroupsFromHybridResourcesResponse queryEditorReportsResourceGroupsFromHybridResources(QueryEditorReportsResourceGroupsFromHybridResourcesRequest body, @QueryMap(encoded=true) QueryEditorReportsResourceGroupsFromHybridResourcesQueryParams queryParams);

  /**
  * Resource Groups from Hybrid Resources
  * Part of a ValuePack, please contact your project manager for use
  * Note, this is equivalent to the other <code>queryEditorReportsResourceGroupsFromHybridResources</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return QueryEditorReportsResourceGroupsFromHybridResourcesResponse
      */
      @RequestLine("POST /api/rest/entity/queryEditorReports/resourceGroupsFromHybridResources?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<QueryEditorReportsResourceGroupsFromHybridResourcesResponse> queryEditorReportsResourceGroupsFromHybridResourcesWithHttpInfo(QueryEditorReportsResourceGroupsFromHybridResourcesRequest body, @QueryMap(encoded=true) QueryEditorReportsResourceGroupsFromHybridResourcesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>queryEditorReportsResourceGroupsFromHybridResources</code> method in a fluent style.
   */
  public static class QueryEditorReportsResourceGroupsFromHybridResourcesQueryParams extends HashMap<String, Object> {
    public QueryEditorReportsResourceGroupsFromHybridResourcesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Server PHYSISCH
   * Report über alle physischen Server
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return QueryEditorReportsServerPhysischResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/serverPhysisch?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  QueryEditorReportsServerPhysischResponse queryEditorReportsServerPhysisch(@Param("sessionId") String sessionId, QueryEditorReportsServerPhysischRequest body);

  /**
   * Server PHYSISCH
   * Similar to <code>queryEditorReportsServerPhysisch</code> but it also returns the http response headers .
   * Report über alle physischen Server
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/serverPhysisch?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<QueryEditorReportsServerPhysischResponse> queryEditorReportsServerPhysischWithHttpInfo(@Param("sessionId") String sessionId, QueryEditorReportsServerPhysischRequest body);


  /**
   * Server PHYSISCH
   * Report über alle physischen Server
   * Note, this is equivalent to the other <code>queryEditorReportsServerPhysisch</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryEditorReportsServerPhysischQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return QueryEditorReportsServerPhysischResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/serverPhysisch?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  QueryEditorReportsServerPhysischResponse queryEditorReportsServerPhysisch(QueryEditorReportsServerPhysischRequest body, @QueryMap(encoded=true) QueryEditorReportsServerPhysischQueryParams queryParams);

  /**
  * Server PHYSISCH
  * Report über alle physischen Server
  * Note, this is equivalent to the other <code>queryEditorReportsServerPhysisch</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return QueryEditorReportsServerPhysischResponse
      */
      @RequestLine("POST /api/rest/entity/queryEditorReports/serverPhysisch?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<QueryEditorReportsServerPhysischResponse> queryEditorReportsServerPhysischWithHttpInfo(QueryEditorReportsServerPhysischRequest body, @QueryMap(encoded=true) QueryEditorReportsServerPhysischQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>queryEditorReportsServerPhysisch</code> method in a fluent style.
   */
  public static class QueryEditorReportsServerPhysischQueryParams extends HashMap<String, Object> {
    public QueryEditorReportsServerPhysischQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Server VIRTUAL
   * Report über alle virtuellen Server
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return QueryEditorReportsServerVirtualResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/serverVirtual?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  QueryEditorReportsServerVirtualResponse queryEditorReportsServerVirtual(@Param("sessionId") String sessionId, QueryEditorReportsServerVirtualRequest body);

  /**
   * Server VIRTUAL
   * Similar to <code>queryEditorReportsServerVirtual</code> but it also returns the http response headers .
   * Report über alle virtuellen Server
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/serverVirtual?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<QueryEditorReportsServerVirtualResponse> queryEditorReportsServerVirtualWithHttpInfo(@Param("sessionId") String sessionId, QueryEditorReportsServerVirtualRequest body);


  /**
   * Server VIRTUAL
   * Report über alle virtuellen Server
   * Note, this is equivalent to the other <code>queryEditorReportsServerVirtual</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link QueryEditorReportsServerVirtualQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return QueryEditorReportsServerVirtualResponse
   */
  @RequestLine("POST /api/rest/entity/queryEditorReports/serverVirtual?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  QueryEditorReportsServerVirtualResponse queryEditorReportsServerVirtual(QueryEditorReportsServerVirtualRequest body, @QueryMap(encoded=true) QueryEditorReportsServerVirtualQueryParams queryParams);

  /**
  * Server VIRTUAL
  * Report über alle virtuellen Server
  * Note, this is equivalent to the other <code>queryEditorReportsServerVirtual</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return QueryEditorReportsServerVirtualResponse
      */
      @RequestLine("POST /api/rest/entity/queryEditorReports/serverVirtual?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<QueryEditorReportsServerVirtualResponse> queryEditorReportsServerVirtualWithHttpInfo(QueryEditorReportsServerVirtualRequest body, @QueryMap(encoded=true) QueryEditorReportsServerVirtualQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>queryEditorReportsServerVirtual</code> method in a fluent style.
   */
  public static class QueryEditorReportsServerVirtualQueryParams extends HashMap<String, Object> {
    public QueryEditorReportsServerVirtualQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
