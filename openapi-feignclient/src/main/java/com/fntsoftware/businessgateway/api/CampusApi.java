package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AddToTopzoneCampusRequestData;
import com.fntsoftware.businessgateway.entities.AddToTopzoneCampusResponse;
import com.fntsoftware.businessgateway.entities.CampusAttachmentsRequestData;
import com.fntsoftware.businessgateway.entities.CampusAttachmentsResponseData;
import com.fntsoftware.businessgateway.entities.CampusBuildingsRequestData;
import com.fntsoftware.businessgateway.entities.CampusBuildingsResponseData;
import com.fntsoftware.businessgateway.entities.CampusContractsRequestData;
import com.fntsoftware.businessgateway.entities.CampusContractsResponseData;
import com.fntsoftware.businessgateway.entities.CampusCustomLocksRequestData;
import com.fntsoftware.businessgateway.entities.CampusCustomLocksResponseData;
import com.fntsoftware.businessgateway.entities.CampusCustomPostalAddressesRequestData;
import com.fntsoftware.businessgateway.entities.CampusCustomPostalAddressesResponseData;
import com.fntsoftware.businessgateway.entities.CampusFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.CampusFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.CampusMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.CampusMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.CampusOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.CampusOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.CampusPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.CampusPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.CampusPersonsRequestData;
import com.fntsoftware.businessgateway.entities.CampusPersonsResponseData;
import com.fntsoftware.businessgateway.entities.CampusPostalAddressesRequestData;
import com.fntsoftware.businessgateway.entities.CampusPostalAddressesResponseData;
import com.fntsoftware.businessgateway.entities.CampusQueryRequest;
import com.fntsoftware.businessgateway.entities.CampusQueryResponse;
import com.fntsoftware.businessgateway.entities.CampusSitesRequestData;
import com.fntsoftware.businessgateway.entities.CampusSitesResponseData;
import com.fntsoftware.businessgateway.entities.CampusSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CampusSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CampusTopzonesRequestData;
import com.fntsoftware.businessgateway.entities.CampusTopzonesResponseData;
import com.fntsoftware.businessgateway.entities.CreateCampusRequestData;
import com.fntsoftware.businessgateway.entities.CreateCampusResponse;
import com.fntsoftware.businessgateway.entities.DeleteCampusRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCampusResponse;
import com.fntsoftware.businessgateway.entities.RenameCampusRequestData;
import com.fntsoftware.businessgateway.entities.RenameCampusResponse;
import com.fntsoftware.businessgateway.entities.UpdateCampusRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCampusResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CampusApi extends ApiClient.Api {


  /**
   * Add to topzone
   * Add campus to topzone. A link to the topzone will be created.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AddToTopzoneCampusResponse
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/addToTopzone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddToTopzoneCampusResponse addToTopzoneCampus(@Param("sessionId") String sessionId, @Param("elid") String elid, AddToTopzoneCampusRequestData body);

  /**
   * Add to topzone
   * Similar to <code>addToTopzoneCampus</code> but it also returns the http response headers .
   * Add campus to topzone. A link to the topzone will be created.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/addToTopzone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddToTopzoneCampusResponse> addToTopzoneCampusWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AddToTopzoneCampusRequestData body);


  /**
   * Add to topzone
   * Add campus to topzone. A link to the topzone will be created.
   * Note, this is equivalent to the other <code>addToTopzoneCampus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddToTopzoneCampusQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AddToTopzoneCampusResponse
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/addToTopzone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AddToTopzoneCampusResponse addToTopzoneCampus(@Param("elid") String elid, AddToTopzoneCampusRequestData body, @QueryMap(encoded=true) AddToTopzoneCampusQueryParams queryParams);

  /**
  * Add to topzone
  * Add campus to topzone. A link to the topzone will be created.
  * Note, this is equivalent to the other <code>addToTopzoneCampus</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AddToTopzoneCampusResponse
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/addToTopzone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AddToTopzoneCampusResponse> addToTopzoneCampusWithHttpInfo(@Param("elid") String elid, AddToTopzoneCampusRequestData body, @QueryMap(encoded=true) AddToTopzoneCampusQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>addToTopzoneCampus</code> method in a fluent style.
   */
  public static class AddToTopzoneCampusQueryParams extends HashMap<String, Object> {
    public AddToTopzoneCampusQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Attachments entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CampusAttachmentsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Attachments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusAttachmentsResponseData campusAttachments(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusAttachmentsRequestData body);

  /**
   * Get relations to Attachments entities
   * Similar to <code>campusAttachments</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Attachments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusAttachmentsResponseData> campusAttachmentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusAttachmentsRequestData body);


  /**
   * Get relations to Attachments entities
   * 
   * Note, this is equivalent to the other <code>campusAttachments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusAttachmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusAttachmentsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Attachments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusAttachmentsResponseData campusAttachments(@Param("elid") String elid, CampusAttachmentsRequestData body, @QueryMap(encoded=true) CampusAttachmentsQueryParams queryParams);

  /**
  * Get relations to Attachments entities
  * 
  * Note, this is equivalent to the other <code>campusAttachments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusAttachmentsResponseData
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/Attachments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusAttachmentsResponseData> campusAttachmentsWithHttpInfo(@Param("elid") String elid, CampusAttachmentsRequestData body, @QueryMap(encoded=true) CampusAttachmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusAttachments</code> method in a fluent style.
   */
  public static class CampusAttachmentsQueryParams extends HashMap<String, Object> {
    public CampusAttachmentsQueryParams sessionId(final String value) {
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
   * @return CampusBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusBuildingsResponseData campusBuildings(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusBuildingsRequestData body);

  /**
   * Get relations to Building entities
   * Similar to <code>campusBuildings</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusBuildingsResponseData> campusBuildingsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusBuildingsRequestData body);


  /**
   * Get relations to Building entities
   * 
   * Note, this is equivalent to the other <code>campusBuildings</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusBuildingsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusBuildingsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Buildings?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusBuildingsResponseData campusBuildings(@Param("elid") String elid, CampusBuildingsRequestData body, @QueryMap(encoded=true) CampusBuildingsQueryParams queryParams);

  /**
  * Get relations to Building entities
  * 
  * Note, this is equivalent to the other <code>campusBuildings</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusBuildingsResponseData
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/Buildings?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusBuildingsResponseData> campusBuildingsWithHttpInfo(@Param("elid") String elid, CampusBuildingsRequestData body, @QueryMap(encoded=true) CampusBuildingsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusBuildings</code> method in a fluent style.
   */
  public static class CampusBuildingsQueryParams extends HashMap<String, Object> {
    public CampusBuildingsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CampusContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusContractsResponseData campusContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>campusContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusContractsResponseData> campusContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>campusContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusContractsResponseData campusContracts(@Param("elid") String elid, CampusContractsRequestData body, @QueryMap(encoded=true) CampusContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>campusContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusContractsResponseData> campusContractsWithHttpInfo(@Param("elid") String elid, CampusContractsRequestData body, @QueryMap(encoded=true) CampusContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusContracts</code> method in a fluent style.
   */
  public static class CampusContractsQueryParams extends HashMap<String, Object> {
    public CampusContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Locks entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CampusCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusCustomLocksResponseData campusCustomLocks(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusCustomLocksRequestData body);

  /**
   * Get relations to Locks entities
   * Similar to <code>campusCustomLocks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusCustomLocksResponseData> campusCustomLocksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusCustomLocksRequestData body);


  /**
   * Get relations to Locks entities
   * 
   * Note, this is equivalent to the other <code>campusCustomLocks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusCustomLocksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusCustomLocksResponseData campusCustomLocks(@Param("elid") String elid, CampusCustomLocksRequestData body, @QueryMap(encoded=true) CampusCustomLocksQueryParams queryParams);

  /**
  * Get relations to Locks entities
  * 
  * Note, this is equivalent to the other <code>campusCustomLocks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusCustomLocksResponseData
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/CustomLocks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusCustomLocksResponseData> campusCustomLocksWithHttpInfo(@Param("elid") String elid, CampusCustomLocksRequestData body, @QueryMap(encoded=true) CampusCustomLocksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusCustomLocks</code> method in a fluent style.
   */
  public static class CampusCustomLocksQueryParams extends HashMap<String, Object> {
    public CampusCustomLocksQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Postal addresses entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CampusCustomPostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/CustomPostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusCustomPostalAddressesResponseData campusCustomPostalAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusCustomPostalAddressesRequestData body);

  /**
   * Get relations to Postal addresses entities
   * Similar to <code>campusCustomPostalAddresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/CustomPostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusCustomPostalAddressesResponseData> campusCustomPostalAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusCustomPostalAddressesRequestData body);


  /**
   * Get relations to Postal addresses entities
   * 
   * Note, this is equivalent to the other <code>campusCustomPostalAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusCustomPostalAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusCustomPostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/CustomPostalAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusCustomPostalAddressesResponseData campusCustomPostalAddresses(@Param("elid") String elid, CampusCustomPostalAddressesRequestData body, @QueryMap(encoded=true) CampusCustomPostalAddressesQueryParams queryParams);

  /**
  * Get relations to Postal addresses entities
  * 
  * Note, this is equivalent to the other <code>campusCustomPostalAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusCustomPostalAddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/CustomPostalAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusCustomPostalAddressesResponseData> campusCustomPostalAddressesWithHttpInfo(@Param("elid") String elid, CampusCustomPostalAddressesRequestData body, @QueryMap(encoded=true) CampusCustomPostalAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusCustomPostalAddresses</code> method in a fluent style.
   */
  public static class CampusCustomPostalAddressesQueryParams extends HashMap<String, Object> {
    public CampusCustomPostalAddressesQueryParams sessionId(final String value) {
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
   * @return CampusFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusFrameContractsResponseData campusFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>campusFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusFrameContractsResponseData> campusFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>campusFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusFrameContractsResponseData campusFrameContracts(@Param("elid") String elid, CampusFrameContractsRequestData body, @QueryMap(encoded=true) CampusFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>campusFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusFrameContractsResponseData> campusFrameContractsWithHttpInfo(@Param("elid") String elid, CampusFrameContractsRequestData body, @QueryMap(encoded=true) CampusFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusFrameContracts</code> method in a fluent style.
   */
  public static class CampusFrameContractsQueryParams extends HashMap<String, Object> {
    public CampusFrameContractsQueryParams sessionId(final String value) {
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
   * @return CampusMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusMaintenanceContractsResponseData campusMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>campusMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusMaintenanceContractsResponseData> campusMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>campusMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusMaintenanceContractsResponseData campusMaintenanceContracts(@Param("elid") String elid, CampusMaintenanceContractsRequestData body, @QueryMap(encoded=true) CampusMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>campusMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusMaintenanceContractsResponseData> campusMaintenanceContractsWithHttpInfo(@Param("elid") String elid, CampusMaintenanceContractsRequestData body, @QueryMap(encoded=true) CampusMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusMaintenanceContracts</code> method in a fluent style.
   */
  public static class CampusMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public CampusMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return CampusOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusOrganizationsResponseData campusOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>campusOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusOrganizationsResponseData> campusOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>campusOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusOrganizationsResponseData campusOrganizations(@Param("elid") String elid, CampusOrganizationsRequestData body, @QueryMap(encoded=true) CampusOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>campusOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusOrganizationsResponseData> campusOrganizationsWithHttpInfo(@Param("elid") String elid, CampusOrganizationsRequestData body, @QueryMap(encoded=true) CampusOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusOrganizations</code> method in a fluent style.
   */
  public static class CampusOrganizationsQueryParams extends HashMap<String, Object> {
    public CampusOrganizationsQueryParams sessionId(final String value) {
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
   * @return CampusPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusPersonGroupsResponseData campusPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>campusPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusPersonGroupsResponseData> campusPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>campusPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusPersonGroupsResponseData campusPersonGroups(@Param("elid") String elid, CampusPersonGroupsRequestData body, @QueryMap(encoded=true) CampusPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>campusPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusPersonGroupsResponseData> campusPersonGroupsWithHttpInfo(@Param("elid") String elid, CampusPersonGroupsRequestData body, @QueryMap(encoded=true) CampusPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusPersonGroups</code> method in a fluent style.
   */
  public static class CampusPersonGroupsQueryParams extends HashMap<String, Object> {
    public CampusPersonGroupsQueryParams sessionId(final String value) {
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
   * @return CampusPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusPersonsResponseData campusPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>campusPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusPersonsResponseData> campusPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>campusPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusPersonsResponseData campusPersons(@Param("elid") String elid, CampusPersonsRequestData body, @QueryMap(encoded=true) CampusPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>campusPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusPersonsResponseData> campusPersonsWithHttpInfo(@Param("elid") String elid, CampusPersonsRequestData body, @QueryMap(encoded=true) CampusPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusPersons</code> method in a fluent style.
   */
  public static class CampusPersonsQueryParams extends HashMap<String, Object> {
    public CampusPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Postal address entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CampusPostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusPostalAddressesResponseData campusPostalAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusPostalAddressesRequestData body);

  /**
   * Get relations to Postal address entities
   * Similar to <code>campusPostalAddresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusPostalAddressesResponseData> campusPostalAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusPostalAddressesRequestData body);


  /**
   * Get relations to Postal address entities
   * 
   * Note, this is equivalent to the other <code>campusPostalAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusPostalAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusPostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusPostalAddressesResponseData campusPostalAddresses(@Param("elid") String elid, CampusPostalAddressesRequestData body, @QueryMap(encoded=true) CampusPostalAddressesQueryParams queryParams);

  /**
  * Get relations to Postal address entities
  * 
  * Note, this is equivalent to the other <code>campusPostalAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusPostalAddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/PostalAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusPostalAddressesResponseData> campusPostalAddressesWithHttpInfo(@Param("elid") String elid, CampusPostalAddressesRequestData body, @QueryMap(encoded=true) CampusPostalAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusPostalAddresses</code> method in a fluent style.
   */
  public static class CampusPostalAddressesQueryParams extends HashMap<String, Object> {
    public CampusPostalAddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CampusQueryResponse
   */
  @RequestLine("POST /api/rest/entity/campus/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusQueryResponse campusQuery(@Param("sessionId") String sessionId, CampusQueryRequest body);

  /**
   * Basic query
   * Similar to <code>campusQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusQueryResponse> campusQueryWithHttpInfo(@Param("sessionId") String sessionId, CampusQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>campusQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusQueryResponse
   */
  @RequestLine("POST /api/rest/entity/campus/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusQueryResponse campusQuery(CampusQueryRequest body, @QueryMap(encoded=true) CampusQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>campusQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusQueryResponse
      */
      @RequestLine("POST /api/rest/entity/campus/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusQueryResponse> campusQueryWithHttpInfo(CampusQueryRequest body, @QueryMap(encoded=true) CampusQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusQuery</code> method in a fluent style.
   */
  public static class CampusQueryQueryParams extends HashMap<String, Object> {
    public CampusQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Site entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CampusSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusSitesResponseData campusSites(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>campusSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusSitesResponseData> campusSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>campusSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusSitesResponseData campusSites(@Param("elid") String elid, CampusSitesRequestData body, @QueryMap(encoded=true) CampusSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>campusSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusSitesResponseData> campusSitesWithHttpInfo(@Param("elid") String elid, CampusSitesRequestData body, @QueryMap(encoded=true) CampusSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusSites</code> method in a fluent style.
   */
  public static class CampusSitesQueryParams extends HashMap<String, Object> {
    public CampusSitesQueryParams sessionId(final String value) {
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
   * @return CampusSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusSystemAttributesResponse campusSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>campusSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusSystemAttributesResponse> campusSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>campusSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusSystemAttributesResponse campusSystemAttributes(@Param("elid") String elid, CampusSystemAttributesRequest body, @QueryMap(encoded=true) CampusSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>campusSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusSystemAttributesResponse> campusSystemAttributesWithHttpInfo(@Param("elid") String elid, CampusSystemAttributesRequest body, @QueryMap(encoded=true) CampusSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusSystemAttributes</code> method in a fluent style.
   */
  public static class CampusSystemAttributesQueryParams extends HashMap<String, Object> {
    public CampusSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Topzone entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CampusTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CampusTopzonesResponseData campusTopzones(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusTopzonesRequestData body);

  /**
   * Get relations to Topzone entities
   * Similar to <code>campusTopzones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CampusTopzonesResponseData> campusTopzonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CampusTopzonesRequestData body);


  /**
   * Get relations to Topzone entities
   * 
   * Note, this is equivalent to the other <code>campusTopzones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CampusTopzonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CampusTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CampusTopzonesResponseData campusTopzones(@Param("elid") String elid, CampusTopzonesRequestData body, @QueryMap(encoded=true) CampusTopzonesQueryParams queryParams);

  /**
  * Get relations to Topzone entities
  * 
  * Note, this is equivalent to the other <code>campusTopzones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CampusTopzonesResponseData
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/Topzones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CampusTopzonesResponseData> campusTopzonesWithHttpInfo(@Param("elid") String elid, CampusTopzonesRequestData body, @QueryMap(encoded=true) CampusTopzonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>campusTopzones</code> method in a fluent style.
   */
  public static class CampusTopzonesQueryParams extends HashMap<String, Object> {
    public CampusTopzonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create campus
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCampusResponse
   */
  @RequestLine("POST /api/rest/entity/campus/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCampusResponse createCampus(@Param("sessionId") String sessionId, CreateCampusRequestData body);

  /**
   * Create
   * Similar to <code>createCampus</code> but it also returns the http response headers .
   * Create campus
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCampusResponse> createCampusWithHttpInfo(@Param("sessionId") String sessionId, CreateCampusRequestData body);


  /**
   * Create
   * Create campus
   * Note, this is equivalent to the other <code>createCampus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCampusQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCampusResponse
   */
  @RequestLine("POST /api/rest/entity/campus/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCampusResponse createCampus(CreateCampusRequestData body, @QueryMap(encoded=true) CreateCampusQueryParams queryParams);

  /**
  * Create
  * Create campus
  * Note, this is equivalent to the other <code>createCampus</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCampusResponse
      */
      @RequestLine("POST /api/rest/entity/campus/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCampusResponse> createCampusWithHttpInfo(CreateCampusRequestData body, @QueryMap(encoded=true) CreateCampusQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCampus</code> method in a fluent style.
   */
  public static class CreateCampusQueryParams extends HashMap<String, Object> {
    public CreateCampusQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete campus
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCampusResponse
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCampusResponse deleteCampus(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCampusRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCampus</code> but it also returns the http response headers .
   * Delete campus
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCampusResponse> deleteCampusWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCampusRequestData body);


  /**
   * Delete
   * Delete campus
   * Note, this is equivalent to the other <code>deleteCampus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCampusQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCampusResponse
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCampusResponse deleteCampus(@Param("elid") String elid, DeleteCampusRequestData body, @QueryMap(encoded=true) DeleteCampusQueryParams queryParams);

  /**
  * Delete
  * Delete campus
  * Note, this is equivalent to the other <code>deleteCampus</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCampusResponse
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCampusResponse> deleteCampusWithHttpInfo(@Param("elid") String elid, DeleteCampusRequestData body, @QueryMap(encoded=true) DeleteCampusQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCampus</code> method in a fluent style.
   */
  public static class DeleteCampusQueryParams extends HashMap<String, Object> {
    public DeleteCampusQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Rename
   * Rename campus
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RenameCampusResponse
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/rename?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RenameCampusResponse renameCampus(@Param("sessionId") String sessionId, @Param("elid") String elid, RenameCampusRequestData body);

  /**
   * Rename
   * Similar to <code>renameCampus</code> but it also returns the http response headers .
   * Rename campus
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/rename?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RenameCampusResponse> renameCampusWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RenameCampusRequestData body);


  /**
   * Rename
   * Rename campus
   * Note, this is equivalent to the other <code>renameCampus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RenameCampusQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RenameCampusResponse
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/rename?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RenameCampusResponse renameCampus(@Param("elid") String elid, RenameCampusRequestData body, @QueryMap(encoded=true) RenameCampusQueryParams queryParams);

  /**
  * Rename
  * Rename campus
  * Note, this is equivalent to the other <code>renameCampus</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RenameCampusResponse
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/rename?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RenameCampusResponse> renameCampusWithHttpInfo(@Param("elid") String elid, RenameCampusRequestData body, @QueryMap(encoded=true) RenameCampusQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>renameCampus</code> method in a fluent style.
   */
  public static class RenameCampusQueryParams extends HashMap<String, Object> {
    public RenameCampusQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify campus
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCampusResponse
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCampusResponse updateCampus(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCampusRequestData body);

  /**
   * Modify
   * Similar to <code>updateCampus</code> but it also returns the http response headers .
   * Modify campus
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCampusResponse> updateCampusWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCampusRequestData body);


  /**
   * Modify
   * Modify campus
   * Note, this is equivalent to the other <code>updateCampus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCampusQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCampusResponse
   */
  @RequestLine("POST /api/rest/entity/campus/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCampusResponse updateCampus(@Param("elid") String elid, UpdateCampusRequestData body, @QueryMap(encoded=true) UpdateCampusQueryParams queryParams);

  /**
  * Modify
  * Modify campus
  * Note, this is equivalent to the other <code>updateCampus</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCampusResponse
      */
      @RequestLine("POST /api/rest/entity/campus/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCampusResponse> updateCampusWithHttpInfo(@Param("elid") String elid, UpdateCampusRequestData body, @QueryMap(encoded=true) UpdateCampusQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCampus</code> method in a fluent style.
   */
  public static class UpdateCampusQueryParams extends HashMap<String, Object> {
    public UpdateCampusQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
