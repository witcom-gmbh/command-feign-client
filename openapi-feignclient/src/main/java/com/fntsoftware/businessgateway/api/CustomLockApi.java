package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomLockRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomLockResponse;
import com.fntsoftware.businessgateway.entities.CustomLockBuildingsRequestData;
import com.fntsoftware.businessgateway.entities.CustomLockBuildingsResponseData;
import com.fntsoftware.businessgateway.entities.CustomLockCampusesRequestData;
import com.fntsoftware.businessgateway.entities.CustomLockCampusesResponseData;
import com.fntsoftware.businessgateway.entities.CustomLockCustomKeysRequestData;
import com.fntsoftware.businessgateway.entities.CustomLockCustomKeysResponseData;
import com.fntsoftware.businessgateway.entities.CustomLockFloorsRequestData;
import com.fntsoftware.businessgateway.entities.CustomLockFloorsResponseData;
import com.fntsoftware.businessgateway.entities.CustomLockLogicalGroupsRequestData;
import com.fntsoftware.businessgateway.entities.CustomLockLogicalGroupsResponseData;
import com.fntsoftware.businessgateway.entities.CustomLockPowerDistributorSystemsRequestData;
import com.fntsoftware.businessgateway.entities.CustomLockPowerDistributorSystemsResponseData;
import com.fntsoftware.businessgateway.entities.CustomLockQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomLockQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomLockRoomsRequestData;
import com.fntsoftware.businessgateway.entities.CustomLockRoomsResponseData;
import com.fntsoftware.businessgateway.entities.CustomLockSwitchCabinetsRequestData;
import com.fntsoftware.businessgateway.entities.CustomLockSwitchCabinetsResponseData;
import com.fntsoftware.businessgateway.entities.CustomLockSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomLockSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomLockRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomLockResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomLockRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomLockResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomLockRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomLockResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CustomLockApi extends ApiClient.Api {


  /**
   * Create
   * Create Lock
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomLockResponse
   */
  @RequestLine("POST /api/rest/entity/custom/lock/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomLockResponse createCustomLock(@Param("sessionId") String sessionId, CreateCustomLockRequestData body);

  /**
   * Create
   * Similar to <code>createCustomLock</code> but it also returns the http response headers .
   * Create Lock
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomLockResponse> createCustomLockWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomLockRequestData body);


  /**
   * Create
   * Create Lock
   * Note, this is equivalent to the other <code>createCustomLock</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomLockQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomLockResponse
   */
  @RequestLine("POST /api/rest/entity/custom/lock/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomLockResponse createCustomLock(CreateCustomLockRequestData body, @QueryMap(encoded=true) CreateCustomLockQueryParams queryParams);

  /**
  * Create
  * Create Lock
  * Note, this is equivalent to the other <code>createCustomLock</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomLockResponse
      */
      @RequestLine("POST /api/rest/entity/custom/lock/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomLockResponse> createCustomLockWithHttpInfo(CreateCustomLockRequestData body, @QueryMap(encoded=true) CreateCustomLockQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomLock</code> method in a fluent style.
   */
  public static class CreateCustomLockQueryParams extends HashMap<String, Object> {
    public CreateCustomLockQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Building entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomLockBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomLockBuildingsResponseData customLockBuildings(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockBuildingsRequestData body);

  /**
   * Get relations to Building entities
   * Similar to <code>customLockBuildings</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomLockBuildingsResponseData> customLockBuildingsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockBuildingsRequestData body);


  /**
   * Get relations to Building entities
   * 
   * Note, this is equivalent to the other <code>customLockBuildings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomLockBuildingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomLockBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomLockBuildingsResponseData customLockBuildings(@Param("elid") String elid, CustomLockBuildingsRequestData body, @QueryMap(encoded=true) CustomLockBuildingsQueryParams queryParams);

  /**
  * Get relations to Building entities
  * 
  * Note, this is equivalent to the other <code>customLockBuildings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomLockBuildingsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Buildings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomLockBuildingsResponseData> customLockBuildingsWithHttpInfo(@Param("elid") String elid, CustomLockBuildingsRequestData body, @QueryMap(encoded=true) CustomLockBuildingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customLockBuildings</code> method in a fluent style.
   */
  public static class CustomLockBuildingsQueryParams extends HashMap<String, Object> {
    public CustomLockBuildingsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Campus entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomLockCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomLockCampusesResponseData customLockCampuses(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockCampusesRequestData body);

  /**
   * Get relations to Campus entities
   * Similar to <code>customLockCampuses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomLockCampusesResponseData> customLockCampusesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockCampusesRequestData body);


  /**
   * Get relations to Campus entities
   * 
   * Note, this is equivalent to the other <code>customLockCampuses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomLockCampusesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomLockCampusesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Campuses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomLockCampusesResponseData customLockCampuses(@Param("elid") String elid, CustomLockCampusesRequestData body, @QueryMap(encoded=true) CustomLockCampusesQueryParams queryParams);

  /**
  * Get relations to Campus entities
  * 
  * Note, this is equivalent to the other <code>customLockCampuses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomLockCampusesResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Campuses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomLockCampusesResponseData> customLockCampusesWithHttpInfo(@Param("elid") String elid, CustomLockCampusesRequestData body, @QueryMap(encoded=true) CustomLockCampusesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customLockCampuses</code> method in a fluent style.
   */
  public static class CustomLockCampusesQueryParams extends HashMap<String, Object> {
    public CustomLockCampusesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Key entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomLockCustomKeysResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/CustomKeys?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomLockCustomKeysResponseData customLockCustomKeys(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockCustomKeysRequestData body);

  /**
   * Get relations to Key entities
   * Similar to <code>customLockCustomKeys</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/CustomKeys?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomLockCustomKeysResponseData> customLockCustomKeysWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockCustomKeysRequestData body);


  /**
   * Get relations to Key entities
   * 
   * Note, this is equivalent to the other <code>customLockCustomKeys</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomLockCustomKeysQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomLockCustomKeysResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/CustomKeys?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomLockCustomKeysResponseData customLockCustomKeys(@Param("elid") String elid, CustomLockCustomKeysRequestData body, @QueryMap(encoded=true) CustomLockCustomKeysQueryParams queryParams);

  /**
  * Get relations to Key entities
  * 
  * Note, this is equivalent to the other <code>customLockCustomKeys</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomLockCustomKeysResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/lock/{elid}/CustomKeys?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomLockCustomKeysResponseData> customLockCustomKeysWithHttpInfo(@Param("elid") String elid, CustomLockCustomKeysRequestData body, @QueryMap(encoded=true) CustomLockCustomKeysQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customLockCustomKeys</code> method in a fluent style.
   */
  public static class CustomLockCustomKeysQueryParams extends HashMap<String, Object> {
    public CustomLockCustomKeysQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Floor entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomLockFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomLockFloorsResponseData customLockFloors(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockFloorsRequestData body);

  /**
   * Get relations to Floor entities
   * Similar to <code>customLockFloors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomLockFloorsResponseData> customLockFloorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockFloorsRequestData body);


  /**
   * Get relations to Floor entities
   * 
   * Note, this is equivalent to the other <code>customLockFloors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomLockFloorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomLockFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Floors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomLockFloorsResponseData customLockFloors(@Param("elid") String elid, CustomLockFloorsRequestData body, @QueryMap(encoded=true) CustomLockFloorsQueryParams queryParams);

  /**
  * Get relations to Floor entities
  * 
  * Note, this is equivalent to the other <code>customLockFloors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomLockFloorsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Floors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomLockFloorsResponseData> customLockFloorsWithHttpInfo(@Param("elid") String elid, CustomLockFloorsRequestData body, @QueryMap(encoded=true) CustomLockFloorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customLockFloors</code> method in a fluent style.
   */
  public static class CustomLockFloorsQueryParams extends HashMap<String, Object> {
    public CustomLockFloorsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Logical group entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomLockLogicalGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/LogicalGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomLockLogicalGroupsResponseData customLockLogicalGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockLogicalGroupsRequestData body);

  /**
   * Get relations to Logical group entities
   * Similar to <code>customLockLogicalGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/LogicalGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomLockLogicalGroupsResponseData> customLockLogicalGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockLogicalGroupsRequestData body);


  /**
   * Get relations to Logical group entities
   * 
   * Note, this is equivalent to the other <code>customLockLogicalGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomLockLogicalGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomLockLogicalGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/LogicalGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomLockLogicalGroupsResponseData customLockLogicalGroups(@Param("elid") String elid, CustomLockLogicalGroupsRequestData body, @QueryMap(encoded=true) CustomLockLogicalGroupsQueryParams queryParams);

  /**
  * Get relations to Logical group entities
  * 
  * Note, this is equivalent to the other <code>customLockLogicalGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomLockLogicalGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/lock/{elid}/LogicalGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomLockLogicalGroupsResponseData> customLockLogicalGroupsWithHttpInfo(@Param("elid") String elid, CustomLockLogicalGroupsRequestData body, @QueryMap(encoded=true) CustomLockLogicalGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customLockLogicalGroups</code> method in a fluent style.
   */
  public static class CustomLockLogicalGroupsQueryParams extends HashMap<String, Object> {
    public CustomLockLogicalGroupsQueryParams sessionId(final String value) {
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
   * @return CustomLockPowerDistributorSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomLockPowerDistributorSystemsResponseData customLockPowerDistributorSystems(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockPowerDistributorSystemsRequestData body);

  /**
   * Get relations to Power distributor system entities
   * Similar to <code>customLockPowerDistributorSystems</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomLockPowerDistributorSystemsResponseData> customLockPowerDistributorSystemsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockPowerDistributorSystemsRequestData body);


  /**
   * Get relations to Power distributor system entities
   * 
   * Note, this is equivalent to the other <code>customLockPowerDistributorSystems</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomLockPowerDistributorSystemsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomLockPowerDistributorSystemsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/PowerDistributorSystems?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomLockPowerDistributorSystemsResponseData customLockPowerDistributorSystems(@Param("elid") String elid, CustomLockPowerDistributorSystemsRequestData body, @QueryMap(encoded=true) CustomLockPowerDistributorSystemsQueryParams queryParams);

  /**
  * Get relations to Power distributor system entities
  * 
  * Note, this is equivalent to the other <code>customLockPowerDistributorSystems</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomLockPowerDistributorSystemsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/lock/{elid}/PowerDistributorSystems?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomLockPowerDistributorSystemsResponseData> customLockPowerDistributorSystemsWithHttpInfo(@Param("elid") String elid, CustomLockPowerDistributorSystemsRequestData body, @QueryMap(encoded=true) CustomLockPowerDistributorSystemsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customLockPowerDistributorSystems</code> method in a fluent style.
   */
  public static class CustomLockPowerDistributorSystemsQueryParams extends HashMap<String, Object> {
    public CustomLockPowerDistributorSystemsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomLockQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/lock/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomLockQueryResponse customLockQuery(@Param("sessionId") String sessionId, CustomLockQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customLockQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomLockQueryResponse> customLockQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomLockQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customLockQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomLockQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomLockQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/lock/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomLockQueryResponse customLockQuery(CustomLockQueryRequest body, @QueryMap(encoded=true) CustomLockQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customLockQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomLockQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/lock/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomLockQueryResponse> customLockQueryWithHttpInfo(CustomLockQueryRequest body, @QueryMap(encoded=true) CustomLockQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customLockQuery</code> method in a fluent style.
   */
  public static class CustomLockQueryQueryParams extends HashMap<String, Object> {
    public CustomLockQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Room entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomLockRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomLockRoomsResponseData customLockRooms(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockRoomsRequestData body);

  /**
   * Get relations to Room entities
   * Similar to <code>customLockRooms</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomLockRoomsResponseData> customLockRoomsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockRoomsRequestData body);


  /**
   * Get relations to Room entities
   * 
   * Note, this is equivalent to the other <code>customLockRooms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomLockRoomsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomLockRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomLockRoomsResponseData customLockRooms(@Param("elid") String elid, CustomLockRoomsRequestData body, @QueryMap(encoded=true) CustomLockRoomsQueryParams queryParams);

  /**
  * Get relations to Room entities
  * 
  * Note, this is equivalent to the other <code>customLockRooms</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomLockRoomsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/lock/{elid}/Rooms?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomLockRoomsResponseData> customLockRoomsWithHttpInfo(@Param("elid") String elid, CustomLockRoomsRequestData body, @QueryMap(encoded=true) CustomLockRoomsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customLockRooms</code> method in a fluent style.
   */
  public static class CustomLockRoomsQueryParams extends HashMap<String, Object> {
    public CustomLockRoomsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Switch cabinet entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomLockSwitchCabinetsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/SwitchCabinets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomLockSwitchCabinetsResponseData customLockSwitchCabinets(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockSwitchCabinetsRequestData body);

  /**
   * Get relations to Switch cabinet entities
   * Similar to <code>customLockSwitchCabinets</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/SwitchCabinets?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomLockSwitchCabinetsResponseData> customLockSwitchCabinetsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockSwitchCabinetsRequestData body);


  /**
   * Get relations to Switch cabinet entities
   * 
   * Note, this is equivalent to the other <code>customLockSwitchCabinets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomLockSwitchCabinetsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomLockSwitchCabinetsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/SwitchCabinets?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomLockSwitchCabinetsResponseData customLockSwitchCabinets(@Param("elid") String elid, CustomLockSwitchCabinetsRequestData body, @QueryMap(encoded=true) CustomLockSwitchCabinetsQueryParams queryParams);

  /**
  * Get relations to Switch cabinet entities
  * 
  * Note, this is equivalent to the other <code>customLockSwitchCabinets</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomLockSwitchCabinetsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/lock/{elid}/SwitchCabinets?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomLockSwitchCabinetsResponseData> customLockSwitchCabinetsWithHttpInfo(@Param("elid") String elid, CustomLockSwitchCabinetsRequestData body, @QueryMap(encoded=true) CustomLockSwitchCabinetsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customLockSwitchCabinets</code> method in a fluent style.
   */
  public static class CustomLockSwitchCabinetsQueryParams extends HashMap<String, Object> {
    public CustomLockSwitchCabinetsQueryParams sessionId(final String value) {
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
   * @return CustomLockSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomLockSystemAttributesResponse customLockSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customLockSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomLockSystemAttributesResponse> customLockSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomLockSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customLockSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomLockSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomLockSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomLockSystemAttributesResponse customLockSystemAttributes(@Param("elid") String elid, CustomLockSystemAttributesRequest body, @QueryMap(encoded=true) CustomLockSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customLockSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomLockSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/lock/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomLockSystemAttributesResponse> customLockSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomLockSystemAttributesRequest body, @QueryMap(encoded=true) CustomLockSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customLockSystemAttributes</code> method in a fluent style.
   */
  public static class CustomLockSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomLockSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Lock
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomLockResponse
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomLockResponse deleteCustomLock(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomLockRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomLock</code> but it also returns the http response headers .
   * Delete Lock
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomLockResponse> deleteCustomLockWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomLockRequestData body);


  /**
   * Delete
   * Delete Lock
   * Note, this is equivalent to the other <code>deleteCustomLock</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomLockQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomLockResponse
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomLockResponse deleteCustomLock(@Param("elid") String elid, DeleteCustomLockRequestData body, @QueryMap(encoded=true) DeleteCustomLockQueryParams queryParams);

  /**
  * Delete
  * Delete Lock
  * Note, this is equivalent to the other <code>deleteCustomLock</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomLockResponse
      */
      @RequestLine("POST /api/rest/entity/custom/lock/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomLockResponse> deleteCustomLockWithHttpInfo(@Param("elid") String elid, DeleteCustomLockRequestData body, @QueryMap(encoded=true) DeleteCustomLockQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomLock</code> method in a fluent style.
   */
  public static class DeleteCustomLockQueryParams extends HashMap<String, Object> {
    public DeleteCustomLockQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Lock
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomLockResponse
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomLockResponse updateCustomLock(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomLockRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomLock</code> but it also returns the http response headers .
   * Modify Lock
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomLockResponse> updateCustomLockWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomLockRequestData body);


  /**
   * Modify
   * Modify Lock
   * Note, this is equivalent to the other <code>updateCustomLock</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomLockQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomLockResponse
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomLockResponse updateCustomLock(@Param("elid") String elid, UpdateCustomLockRequestData body, @QueryMap(encoded=true) UpdateCustomLockQueryParams queryParams);

  /**
  * Modify
  * Modify Lock
  * Note, this is equivalent to the other <code>updateCustomLock</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomLockResponse
      */
      @RequestLine("POST /api/rest/entity/custom/lock/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomLockResponse> updateCustomLockWithHttpInfo(@Param("elid") String elid, UpdateCustomLockRequestData body, @QueryMap(encoded=true) UpdateCustomLockQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomLock</code> method in a fluent style.
   */
  public static class UpdateCustomLockQueryParams extends HashMap<String, Object> {
    public UpdateCustomLockQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomLockResponse
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomLockResponse updateSystemAttributesCustomLock(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomLockRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomLock</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomLockResponse> updateSystemAttributesCustomLockWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomLockRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomLock</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomLockQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomLockResponse
   */
  @RequestLine("POST /api/rest/entity/custom/lock/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomLockResponse updateSystemAttributesCustomLock(@Param("elid") String elid, UpdateSystemAttributesCustomLockRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomLockQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomLock</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomLockResponse
      */
      @RequestLine("POST /api/rest/entity/custom/lock/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomLockResponse> updateSystemAttributesCustomLockWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomLockRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomLockQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomLock</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomLockQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomLockQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
