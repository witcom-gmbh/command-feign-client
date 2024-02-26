package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.TraySectionTypeContractsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionTypeContractsResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionTypeDuctTypesRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionTypeDuctTypesResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionTypeFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionTypeFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionTypeMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionTypeMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionTypeOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionTypeOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionTypePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionTypePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionTypePersonsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionTypePersonsResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionTypeQueryRequest;
import com.fntsoftware.businessgateway.entities.TraySectionTypeQueryResponse;
import com.fntsoftware.businessgateway.entities.TraySectionTypeSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.TraySectionTypeSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.TraySectionTypeTraySectionsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionTypeTraySectionsResponseData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTraySectionTypeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTraySectionTypeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface TraySectionTypeApi extends ApiClient.Api {


  /**
   * Get relations to Contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionTypeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionTypeContractsResponseData traySectionTypeContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>traySectionTypeContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionTypeContractsResponseData> traySectionTypeContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>traySectionTypeContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionTypeContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionTypeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionTypeContractsResponseData traySectionTypeContracts(@Param("elid") String elid, TraySectionTypeContractsRequestData body, @QueryMap(encoded=true) TraySectionTypeContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>traySectionTypeContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionTypeContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySectionType/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionTypeContractsResponseData> traySectionTypeContractsWithHttpInfo(@Param("elid") String elid, TraySectionTypeContractsRequestData body, @QueryMap(encoded=true) TraySectionTypeContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionTypeContracts</code> method in a fluent style.
   */
  public static class TraySectionTypeContractsQueryParams extends HashMap<String, Object> {
    public TraySectionTypeContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Duct type entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionTypeDuctTypesResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/DuctTypes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionTypeDuctTypesResponseData traySectionTypeDuctTypes(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeDuctTypesRequestData body);

  /**
   * Get relations to Duct type entities
   * Similar to <code>traySectionTypeDuctTypes</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/DuctTypes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionTypeDuctTypesResponseData> traySectionTypeDuctTypesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeDuctTypesRequestData body);


  /**
   * Get relations to Duct type entities
   * 
   * Note, this is equivalent to the other <code>traySectionTypeDuctTypes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionTypeDuctTypesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionTypeDuctTypesResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/DuctTypes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionTypeDuctTypesResponseData traySectionTypeDuctTypes(@Param("elid") String elid, TraySectionTypeDuctTypesRequestData body, @QueryMap(encoded=true) TraySectionTypeDuctTypesQueryParams queryParams);

  /**
  * Get relations to Duct type entities
  * 
  * Note, this is equivalent to the other <code>traySectionTypeDuctTypes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionTypeDuctTypesResponseData
      */
      @RequestLine("POST /api/rest/entity/traySectionType/{elid}/DuctTypes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionTypeDuctTypesResponseData> traySectionTypeDuctTypesWithHttpInfo(@Param("elid") String elid, TraySectionTypeDuctTypesRequestData body, @QueryMap(encoded=true) TraySectionTypeDuctTypesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionTypeDuctTypes</code> method in a fluent style.
   */
  public static class TraySectionTypeDuctTypesQueryParams extends HashMap<String, Object> {
    public TraySectionTypeDuctTypesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Frame contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionTypeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionTypeFrameContractsResponseData traySectionTypeFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>traySectionTypeFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionTypeFrameContractsResponseData> traySectionTypeFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>traySectionTypeFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionTypeFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionTypeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionTypeFrameContractsResponseData traySectionTypeFrameContracts(@Param("elid") String elid, TraySectionTypeFrameContractsRequestData body, @QueryMap(encoded=true) TraySectionTypeFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>traySectionTypeFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionTypeFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySectionType/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionTypeFrameContractsResponseData> traySectionTypeFrameContractsWithHttpInfo(@Param("elid") String elid, TraySectionTypeFrameContractsRequestData body, @QueryMap(encoded=true) TraySectionTypeFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionTypeFrameContracts</code> method in a fluent style.
   */
  public static class TraySectionTypeFrameContractsQueryParams extends HashMap<String, Object> {
    public TraySectionTypeFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Maintenance contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionTypeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionTypeMaintenanceContractsResponseData traySectionTypeMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>traySectionTypeMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionTypeMaintenanceContractsResponseData> traySectionTypeMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>traySectionTypeMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionTypeMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionTypeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionTypeMaintenanceContractsResponseData traySectionTypeMaintenanceContracts(@Param("elid") String elid, TraySectionTypeMaintenanceContractsRequestData body, @QueryMap(encoded=true) TraySectionTypeMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>traySectionTypeMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionTypeMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySectionType/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionTypeMaintenanceContractsResponseData> traySectionTypeMaintenanceContractsWithHttpInfo(@Param("elid") String elid, TraySectionTypeMaintenanceContractsRequestData body, @QueryMap(encoded=true) TraySectionTypeMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionTypeMaintenanceContracts</code> method in a fluent style.
   */
  public static class TraySectionTypeMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public TraySectionTypeMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Organization entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionTypeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionTypeOrganizationsResponseData traySectionTypeOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>traySectionTypeOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionTypeOrganizationsResponseData> traySectionTypeOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>traySectionTypeOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionTypeOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionTypeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionTypeOrganizationsResponseData traySectionTypeOrganizations(@Param("elid") String elid, TraySectionTypeOrganizationsRequestData body, @QueryMap(encoded=true) TraySectionTypeOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>traySectionTypeOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionTypeOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySectionType/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionTypeOrganizationsResponseData> traySectionTypeOrganizationsWithHttpInfo(@Param("elid") String elid, TraySectionTypeOrganizationsRequestData body, @QueryMap(encoded=true) TraySectionTypeOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionTypeOrganizations</code> method in a fluent style.
   */
  public static class TraySectionTypeOrganizationsQueryParams extends HashMap<String, Object> {
    public TraySectionTypeOrganizationsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Person group entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionTypePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionTypePersonGroupsResponseData traySectionTypePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>traySectionTypePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionTypePersonGroupsResponseData> traySectionTypePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>traySectionTypePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionTypePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionTypePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionTypePersonGroupsResponseData traySectionTypePersonGroups(@Param("elid") String elid, TraySectionTypePersonGroupsRequestData body, @QueryMap(encoded=true) TraySectionTypePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>traySectionTypePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionTypePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySectionType/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionTypePersonGroupsResponseData> traySectionTypePersonGroupsWithHttpInfo(@Param("elid") String elid, TraySectionTypePersonGroupsRequestData body, @QueryMap(encoded=true) TraySectionTypePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionTypePersonGroups</code> method in a fluent style.
   */
  public static class TraySectionTypePersonGroupsQueryParams extends HashMap<String, Object> {
    public TraySectionTypePersonGroupsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Person entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionTypePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionTypePersonsResponseData traySectionTypePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>traySectionTypePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionTypePersonsResponseData> traySectionTypePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>traySectionTypePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionTypePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionTypePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionTypePersonsResponseData traySectionTypePersons(@Param("elid") String elid, TraySectionTypePersonsRequestData body, @QueryMap(encoded=true) TraySectionTypePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>traySectionTypePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionTypePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySectionType/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionTypePersonsResponseData> traySectionTypePersonsWithHttpInfo(@Param("elid") String elid, TraySectionTypePersonsRequestData body, @QueryMap(encoded=true) TraySectionTypePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionTypePersons</code> method in a fluent style.
   */
  public static class TraySectionTypePersonsQueryParams extends HashMap<String, Object> {
    public TraySectionTypePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return TraySectionTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/traySectionType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionTypeQueryResponse traySectionTypeQuery(@Param("sessionId") String sessionId, TraySectionTypeQueryRequest body);

  /**
   * Basic query
   * Similar to <code>traySectionTypeQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySectionType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionTypeQueryResponse> traySectionTypeQueryWithHttpInfo(@Param("sessionId") String sessionId, TraySectionTypeQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>traySectionTypeQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionTypeQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/traySectionType/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionTypeQueryResponse traySectionTypeQuery(TraySectionTypeQueryRequest body, @QueryMap(encoded=true) TraySectionTypeQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>traySectionTypeQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionTypeQueryResponse
      */
      @RequestLine("POST /api/rest/entity/traySectionType/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionTypeQueryResponse> traySectionTypeQueryWithHttpInfo(TraySectionTypeQueryRequest body, @QueryMap(encoded=true) TraySectionTypeQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionTypeQuery</code> method in a fluent style.
   */
  public static class TraySectionTypeQueryQueryParams extends HashMap<String, Object> {
    public TraySectionTypeQueryQueryParams sessionId(final String value) {
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
   * @return TraySectionTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionTypeSystemAttributesResponse traySectionTypeSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>traySectionTypeSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionTypeSystemAttributesResponse> traySectionTypeSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>traySectionTypeSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionTypeSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionTypeSystemAttributesResponse traySectionTypeSystemAttributes(@Param("elid") String elid, TraySectionTypeSystemAttributesRequest body, @QueryMap(encoded=true) TraySectionTypeSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>traySectionTypeSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionTypeSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/traySectionType/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionTypeSystemAttributesResponse> traySectionTypeSystemAttributesWithHttpInfo(@Param("elid") String elid, TraySectionTypeSystemAttributesRequest body, @QueryMap(encoded=true) TraySectionTypeSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionTypeSystemAttributes</code> method in a fluent style.
   */
  public static class TraySectionTypeSystemAttributesQueryParams extends HashMap<String, Object> {
    public TraySectionTypeSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Tray section entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionTypeTraySectionsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/TraySections?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionTypeTraySectionsResponseData traySectionTypeTraySections(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeTraySectionsRequestData body);

  /**
   * Get relations to Tray section entities
   * Similar to <code>traySectionTypeTraySections</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/TraySections?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionTypeTraySectionsResponseData> traySectionTypeTraySectionsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTypeTraySectionsRequestData body);


  /**
   * Get relations to Tray section entities
   * 
   * Note, this is equivalent to the other <code>traySectionTypeTraySections</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionTypeTraySectionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionTypeTraySectionsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/TraySections?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionTypeTraySectionsResponseData traySectionTypeTraySections(@Param("elid") String elid, TraySectionTypeTraySectionsRequestData body, @QueryMap(encoded=true) TraySectionTypeTraySectionsQueryParams queryParams);

  /**
  * Get relations to Tray section entities
  * 
  * Note, this is equivalent to the other <code>traySectionTypeTraySections</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionTypeTraySectionsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySectionType/{elid}/TraySections?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionTypeTraySectionsResponseData> traySectionTypeTraySectionsWithHttpInfo(@Param("elid") String elid, TraySectionTypeTraySectionsRequestData body, @QueryMap(encoded=true) TraySectionTypeTraySectionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionTypeTraySections</code> method in a fluent style.
   */
  public static class TraySectionTypeTraySectionsQueryParams extends HashMap<String, Object> {
    public TraySectionTypeTraySectionsQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesTraySectionTypeResponse
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesTraySectionTypeResponse updateSystemAttributesTraySectionType(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTraySectionTypeRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesTraySectionType</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesTraySectionTypeResponse> updateSystemAttributesTraySectionTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTraySectionTypeRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesTraySectionType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesTraySectionTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesTraySectionTypeResponse
   */
  @RequestLine("POST /api/rest/entity/traySectionType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesTraySectionTypeResponse updateSystemAttributesTraySectionType(@Param("elid") String elid, UpdateSystemAttributesTraySectionTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTraySectionTypeQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesTraySectionType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesTraySectionTypeResponse
      */
      @RequestLine("POST /api/rest/entity/traySectionType/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesTraySectionTypeResponse> updateSystemAttributesTraySectionTypeWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesTraySectionTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTraySectionTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesTraySectionType</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesTraySectionTypeQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesTraySectionTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
