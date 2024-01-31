package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CouplingTypeContractsRequestData;
import com.fntsoftware.businessgateway.entities.CouplingTypeContractsResponseData;
import com.fntsoftware.businessgateway.entities.CouplingTypeDuctTypesRequestData;
import com.fntsoftware.businessgateway.entities.CouplingTypeDuctTypesResponseData;
import com.fntsoftware.businessgateway.entities.CouplingTypeFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.CouplingTypeFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.CouplingTypeMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.CouplingTypeMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.CouplingTypeOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.CouplingTypeOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.CouplingTypePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.CouplingTypePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.CouplingTypePersonsRequestData;
import com.fntsoftware.businessgateway.entities.CouplingTypePersonsResponseData;
import com.fntsoftware.businessgateway.entities.CouplingTypeQueryRequest;
import com.fntsoftware.businessgateway.entities.CouplingTypeQueryResponse;
import com.fntsoftware.businessgateway.entities.CouplingTypeSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CouplingTypeSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CreateCouplingTypeRequestData;
import com.fntsoftware.businessgateway.entities.CreateCouplingTypeResponse;
import com.fntsoftware.businessgateway.entities.DeleteCouplingTypeRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCouplingTypeResponse;
import com.fntsoftware.businessgateway.entities.UpdateCouplingTypeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCouplingTypeResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCouplingTypeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCouplingTypeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CouplingTypeApi extends ApiClient.Api {


  /**
   * Get relations to Contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CouplingTypeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingTypeContractsResponseData couplingTypeContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypeContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>couplingTypeContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingTypeContractsResponseData> couplingTypeContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypeContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>couplingTypeContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingTypeContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingTypeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingTypeContractsResponseData couplingTypeContracts(@Param("elid") String elid, CouplingTypeContractsRequestData body, @QueryMap(encoded=true) CouplingTypeContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>couplingTypeContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingTypeContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/couplingType/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingTypeContractsResponseData> couplingTypeContractsWithHttpInfo(@Param("elid") String elid, CouplingTypeContractsRequestData body, @QueryMap(encoded=true) CouplingTypeContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingTypeContracts</code> method in a fluent style.
   */
  public static class CouplingTypeContractsQueryParams extends HashMap<String, Object> {
    public CouplingTypeContractsQueryParams sessionId(final String value) {
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
   * @return CouplingTypeDuctTypesResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/DuctTypes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingTypeDuctTypesResponseData couplingTypeDuctTypes(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypeDuctTypesRequestData body);

  /**
   * Get relations to Duct type entities
   * Similar to <code>couplingTypeDuctTypes</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/DuctTypes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingTypeDuctTypesResponseData> couplingTypeDuctTypesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypeDuctTypesRequestData body);


  /**
   * Get relations to Duct type entities
   * 
   * Note, this is equivalent to the other <code>couplingTypeDuctTypes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingTypeDuctTypesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingTypeDuctTypesResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/DuctTypes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingTypeDuctTypesResponseData couplingTypeDuctTypes(@Param("elid") String elid, CouplingTypeDuctTypesRequestData body, @QueryMap(encoded=true) CouplingTypeDuctTypesQueryParams queryParams);

  /**
  * Get relations to Duct type entities
  * 
  * Note, this is equivalent to the other <code>couplingTypeDuctTypes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingTypeDuctTypesResponseData
      */
      @RequestLine("POST /api/rest/entity/couplingType/{elid}/DuctTypes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingTypeDuctTypesResponseData> couplingTypeDuctTypesWithHttpInfo(@Param("elid") String elid, CouplingTypeDuctTypesRequestData body, @QueryMap(encoded=true) CouplingTypeDuctTypesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingTypeDuctTypes</code> method in a fluent style.
   */
  public static class CouplingTypeDuctTypesQueryParams extends HashMap<String, Object> {
    public CouplingTypeDuctTypesQueryParams sessionId(final String value) {
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
   * @return CouplingTypeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingTypeFrameContractsResponseData couplingTypeFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypeFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>couplingTypeFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingTypeFrameContractsResponseData> couplingTypeFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypeFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>couplingTypeFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingTypeFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingTypeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingTypeFrameContractsResponseData couplingTypeFrameContracts(@Param("elid") String elid, CouplingTypeFrameContractsRequestData body, @QueryMap(encoded=true) CouplingTypeFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>couplingTypeFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingTypeFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/couplingType/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingTypeFrameContractsResponseData> couplingTypeFrameContractsWithHttpInfo(@Param("elid") String elid, CouplingTypeFrameContractsRequestData body, @QueryMap(encoded=true) CouplingTypeFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingTypeFrameContracts</code> method in a fluent style.
   */
  public static class CouplingTypeFrameContractsQueryParams extends HashMap<String, Object> {
    public CouplingTypeFrameContractsQueryParams sessionId(final String value) {
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
   * @return CouplingTypeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingTypeMaintenanceContractsResponseData couplingTypeMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypeMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>couplingTypeMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingTypeMaintenanceContractsResponseData> couplingTypeMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypeMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>couplingTypeMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingTypeMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingTypeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingTypeMaintenanceContractsResponseData couplingTypeMaintenanceContracts(@Param("elid") String elid, CouplingTypeMaintenanceContractsRequestData body, @QueryMap(encoded=true) CouplingTypeMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>couplingTypeMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingTypeMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/couplingType/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingTypeMaintenanceContractsResponseData> couplingTypeMaintenanceContractsWithHttpInfo(@Param("elid") String elid, CouplingTypeMaintenanceContractsRequestData body, @QueryMap(encoded=true) CouplingTypeMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingTypeMaintenanceContracts</code> method in a fluent style.
   */
  public static class CouplingTypeMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public CouplingTypeMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return CouplingTypeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingTypeOrganizationsResponseData couplingTypeOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypeOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>couplingTypeOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingTypeOrganizationsResponseData> couplingTypeOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypeOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>couplingTypeOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingTypeOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingTypeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingTypeOrganizationsResponseData couplingTypeOrganizations(@Param("elid") String elid, CouplingTypeOrganizationsRequestData body, @QueryMap(encoded=true) CouplingTypeOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>couplingTypeOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingTypeOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/couplingType/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingTypeOrganizationsResponseData> couplingTypeOrganizationsWithHttpInfo(@Param("elid") String elid, CouplingTypeOrganizationsRequestData body, @QueryMap(encoded=true) CouplingTypeOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingTypeOrganizations</code> method in a fluent style.
   */
  public static class CouplingTypeOrganizationsQueryParams extends HashMap<String, Object> {
    public CouplingTypeOrganizationsQueryParams sessionId(final String value) {
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
   * @return CouplingTypePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingTypePersonGroupsResponseData couplingTypePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>couplingTypePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingTypePersonGroupsResponseData> couplingTypePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>couplingTypePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingTypePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingTypePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingTypePersonGroupsResponseData couplingTypePersonGroups(@Param("elid") String elid, CouplingTypePersonGroupsRequestData body, @QueryMap(encoded=true) CouplingTypePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>couplingTypePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingTypePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/couplingType/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingTypePersonGroupsResponseData> couplingTypePersonGroupsWithHttpInfo(@Param("elid") String elid, CouplingTypePersonGroupsRequestData body, @QueryMap(encoded=true) CouplingTypePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingTypePersonGroups</code> method in a fluent style.
   */
  public static class CouplingTypePersonGroupsQueryParams extends HashMap<String, Object> {
    public CouplingTypePersonGroupsQueryParams sessionId(final String value) {
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
   * @return CouplingTypePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingTypePersonsResponseData couplingTypePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>couplingTypePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingTypePersonsResponseData> couplingTypePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>couplingTypePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingTypePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingTypePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingTypePersonsResponseData couplingTypePersons(@Param("elid") String elid, CouplingTypePersonsRequestData body, @QueryMap(encoded=true) CouplingTypePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>couplingTypePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingTypePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/couplingType/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingTypePersonsResponseData> couplingTypePersonsWithHttpInfo(@Param("elid") String elid, CouplingTypePersonsRequestData body, @QueryMap(encoded=true) CouplingTypePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingTypePersons</code> method in a fluent style.
   */
  public static class CouplingTypePersonsQueryParams extends HashMap<String, Object> {
    public CouplingTypePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CouplingTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/couplingType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingTypeQueryResponse couplingTypeQuery(@Param("sessionId") String sessionId, CouplingTypeQueryRequest body);

  /**
   * Basic query
   * Similar to <code>couplingTypeQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/couplingType/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingTypeQueryResponse> couplingTypeQueryWithHttpInfo(@Param("sessionId") String sessionId, CouplingTypeQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>couplingTypeQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingTypeQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingTypeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/couplingType/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingTypeQueryResponse couplingTypeQuery(CouplingTypeQueryRequest body, @QueryMap(encoded=true) CouplingTypeQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>couplingTypeQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingTypeQueryResponse
      */
      @RequestLine("POST /api/rest/entity/couplingType/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingTypeQueryResponse> couplingTypeQueryWithHttpInfo(CouplingTypeQueryRequest body, @QueryMap(encoded=true) CouplingTypeQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingTypeQuery</code> method in a fluent style.
   */
  public static class CouplingTypeQueryQueryParams extends HashMap<String, Object> {
    public CouplingTypeQueryQueryParams sessionId(final String value) {
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
   * @return CouplingTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CouplingTypeSystemAttributesResponse couplingTypeSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypeSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>couplingTypeSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CouplingTypeSystemAttributesResponse> couplingTypeSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CouplingTypeSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>couplingTypeSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CouplingTypeSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CouplingTypeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CouplingTypeSystemAttributesResponse couplingTypeSystemAttributes(@Param("elid") String elid, CouplingTypeSystemAttributesRequest body, @QueryMap(encoded=true) CouplingTypeSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>couplingTypeSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CouplingTypeSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/couplingType/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CouplingTypeSystemAttributesResponse> couplingTypeSystemAttributesWithHttpInfo(@Param("elid") String elid, CouplingTypeSystemAttributesRequest body, @QueryMap(encoded=true) CouplingTypeSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>couplingTypeSystemAttributes</code> method in a fluent style.
   */
  public static class CouplingTypeSystemAttributesQueryParams extends HashMap<String, Object> {
    public CouplingTypeSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Coupler type
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCouplingTypeResponse
   */
  @RequestLine("POST /api/rest/entity/couplingType/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCouplingTypeResponse createCouplingType(@Param("sessionId") String sessionId, CreateCouplingTypeRequestData body);

  /**
   * Create
   * Similar to <code>createCouplingType</code> but it also returns the http response headers .
   * Create Coupler type
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/couplingType/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCouplingTypeResponse> createCouplingTypeWithHttpInfo(@Param("sessionId") String sessionId, CreateCouplingTypeRequestData body);


  /**
   * Create
   * Create Coupler type
   * Note, this is equivalent to the other <code>createCouplingType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCouplingTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCouplingTypeResponse
   */
  @RequestLine("POST /api/rest/entity/couplingType/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCouplingTypeResponse createCouplingType(CreateCouplingTypeRequestData body, @QueryMap(encoded=true) CreateCouplingTypeQueryParams queryParams);

  /**
  * Create
  * Create Coupler type
  * Note, this is equivalent to the other <code>createCouplingType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCouplingTypeResponse
      */
      @RequestLine("POST /api/rest/entity/couplingType/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCouplingTypeResponse> createCouplingTypeWithHttpInfo(CreateCouplingTypeRequestData body, @QueryMap(encoded=true) CreateCouplingTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCouplingType</code> method in a fluent style.
   */
  public static class CreateCouplingTypeQueryParams extends HashMap<String, Object> {
    public CreateCouplingTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Coupler type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCouplingTypeResponse
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCouplingTypeResponse deleteCouplingType(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCouplingTypeRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCouplingType</code> but it also returns the http response headers .
   * Delete Coupler type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCouplingTypeResponse> deleteCouplingTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCouplingTypeRequestData body);


  /**
   * Delete
   * Delete Coupler type
   * Note, this is equivalent to the other <code>deleteCouplingType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCouplingTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCouplingTypeResponse
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCouplingTypeResponse deleteCouplingType(@Param("elid") String elid, DeleteCouplingTypeRequestData body, @QueryMap(encoded=true) DeleteCouplingTypeQueryParams queryParams);

  /**
  * Delete
  * Delete Coupler type
  * Note, this is equivalent to the other <code>deleteCouplingType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCouplingTypeResponse
      */
      @RequestLine("POST /api/rest/entity/couplingType/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCouplingTypeResponse> deleteCouplingTypeWithHttpInfo(@Param("elid") String elid, DeleteCouplingTypeRequestData body, @QueryMap(encoded=true) DeleteCouplingTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCouplingType</code> method in a fluent style.
   */
  public static class DeleteCouplingTypeQueryParams extends HashMap<String, Object> {
    public DeleteCouplingTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Coupler type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCouplingTypeResponse
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCouplingTypeResponse updateCouplingType(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCouplingTypeRequestData body);

  /**
   * Modify
   * Similar to <code>updateCouplingType</code> but it also returns the http response headers .
   * Modify Coupler type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCouplingTypeResponse> updateCouplingTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCouplingTypeRequestData body);


  /**
   * Modify
   * Modify Coupler type
   * Note, this is equivalent to the other <code>updateCouplingType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCouplingTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCouplingTypeResponse
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCouplingTypeResponse updateCouplingType(@Param("elid") String elid, UpdateCouplingTypeRequestData body, @QueryMap(encoded=true) UpdateCouplingTypeQueryParams queryParams);

  /**
  * Modify
  * Modify Coupler type
  * Note, this is equivalent to the other <code>updateCouplingType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCouplingTypeResponse
      */
      @RequestLine("POST /api/rest/entity/couplingType/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCouplingTypeResponse> updateCouplingTypeWithHttpInfo(@Param("elid") String elid, UpdateCouplingTypeRequestData body, @QueryMap(encoded=true) UpdateCouplingTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCouplingType</code> method in a fluent style.
   */
  public static class UpdateCouplingTypeQueryParams extends HashMap<String, Object> {
    public UpdateCouplingTypeQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCouplingTypeResponse
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCouplingTypeResponse updateSystemAttributesCouplingType(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCouplingTypeRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCouplingType</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCouplingTypeResponse> updateSystemAttributesCouplingTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCouplingTypeRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCouplingType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCouplingTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCouplingTypeResponse
   */
  @RequestLine("POST /api/rest/entity/couplingType/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCouplingTypeResponse updateSystemAttributesCouplingType(@Param("elid") String elid, UpdateSystemAttributesCouplingTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCouplingTypeQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCouplingType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCouplingTypeResponse
      */
      @RequestLine("POST /api/rest/entity/couplingType/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCouplingTypeResponse> updateSystemAttributesCouplingTypeWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCouplingTypeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCouplingTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCouplingType</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCouplingTypeQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCouplingTypeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
