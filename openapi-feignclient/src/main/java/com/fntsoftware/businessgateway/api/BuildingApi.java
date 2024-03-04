package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AddToTopzoneBuildingRequestData;
import com.fntsoftware.businessgateway.entities.AddToTopzoneBuildingResponse;
import com.fntsoftware.businessgateway.entities.BuildingAttachmentsRequestData;
import com.fntsoftware.businessgateway.entities.BuildingAttachmentsResponseData;
import com.fntsoftware.businessgateway.entities.BuildingCampusRequestData;
import com.fntsoftware.businessgateway.entities.BuildingCampusResponseData;
import com.fntsoftware.businessgateway.entities.BuildingContractsRequestData;
import com.fntsoftware.businessgateway.entities.BuildingContractsResponseData;
import com.fntsoftware.businessgateway.entities.BuildingCustomLocksRequestData;
import com.fntsoftware.businessgateway.entities.BuildingCustomLocksResponseData;
import com.fntsoftware.businessgateway.entities.BuildingCustomPostalAddressesRequestData;
import com.fntsoftware.businessgateway.entities.BuildingCustomPostalAddressesResponseData;
import com.fntsoftware.businessgateway.entities.BuildingFloorsRequestData;
import com.fntsoftware.businessgateway.entities.BuildingFloorsResponseData;
import com.fntsoftware.businessgateway.entities.BuildingFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.BuildingFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.BuildingMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.BuildingMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.BuildingOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.BuildingOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.BuildingPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.BuildingPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.BuildingPersonsRequestData;
import com.fntsoftware.businessgateway.entities.BuildingPersonsResponseData;
import com.fntsoftware.businessgateway.entities.BuildingPostalAddressesRequestData;
import com.fntsoftware.businessgateway.entities.BuildingPostalAddressesResponseData;
import com.fntsoftware.businessgateway.entities.BuildingQueryRequest;
import com.fntsoftware.businessgateway.entities.BuildingQueryResponse;
import com.fntsoftware.businessgateway.entities.BuildingSitesRequestData;
import com.fntsoftware.businessgateway.entities.BuildingSitesResponseData;
import com.fntsoftware.businessgateway.entities.BuildingSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.BuildingSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.BuildingTopzonesRequestData;
import com.fntsoftware.businessgateway.entities.BuildingTopzonesResponseData;
import com.fntsoftware.businessgateway.entities.CreateBuildingRequestData;
import com.fntsoftware.businessgateway.entities.CreateBuildingResponse;
import com.fntsoftware.businessgateway.entities.DeleteBuildingRequestData;
import com.fntsoftware.businessgateway.entities.DeleteBuildingResponse;
import com.fntsoftware.businessgateway.entities.RenameBuildingRequestData;
import com.fntsoftware.businessgateway.entities.RenameBuildingResponse;
import com.fntsoftware.businessgateway.entities.UpdateBuildingRequestData;
import com.fntsoftware.businessgateway.entities.UpdateBuildingResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface BuildingApi extends ApiClient.Api {


  /**
   * Add to topzone
   * Add building to topzone. A link to the topzone will be created.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AddToTopzoneBuildingResponse
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/addToTopzone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddToTopzoneBuildingResponse addToTopzoneBuilding(@Param("sessionId") String sessionId, @Param("elid") String elid, AddToTopzoneBuildingRequestData body);

  /**
   * Add to topzone
   * Similar to <code>addToTopzoneBuilding</code> but it also returns the http response headers .
   * Add building to topzone. A link to the topzone will be created.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/addToTopzone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddToTopzoneBuildingResponse> addToTopzoneBuildingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AddToTopzoneBuildingRequestData body);


  /**
   * Add to topzone
   * Add building to topzone. A link to the topzone will be created.
   * Note, this is equivalent to the other <code>addToTopzoneBuilding</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddToTopzoneBuildingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AddToTopzoneBuildingResponse
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/addToTopzone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AddToTopzoneBuildingResponse addToTopzoneBuilding(@Param("elid") String elid, AddToTopzoneBuildingRequestData body, @QueryMap(encoded=true) AddToTopzoneBuildingQueryParams queryParams);

  /**
  * Add to topzone
  * Add building to topzone. A link to the topzone will be created.
  * Note, this is equivalent to the other <code>addToTopzoneBuilding</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AddToTopzoneBuildingResponse
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/addToTopzone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AddToTopzoneBuildingResponse> addToTopzoneBuildingWithHttpInfo(@Param("elid") String elid, AddToTopzoneBuildingRequestData body, @QueryMap(encoded=true) AddToTopzoneBuildingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>addToTopzoneBuilding</code> method in a fluent style.
   */
  public static class AddToTopzoneBuildingQueryParams extends HashMap<String, Object> {
    public AddToTopzoneBuildingQueryParams sessionId(final String value) {
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
   * @return BuildingAttachmentsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Attachments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingAttachmentsResponseData buildingAttachments(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingAttachmentsRequestData body);

  /**
   * Get relations to Attachments entities
   * Similar to <code>buildingAttachments</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Attachments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingAttachmentsResponseData> buildingAttachmentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingAttachmentsRequestData body);


  /**
   * Get relations to Attachments entities
   * 
   * Note, this is equivalent to the other <code>buildingAttachments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingAttachmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingAttachmentsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Attachments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingAttachmentsResponseData buildingAttachments(@Param("elid") String elid, BuildingAttachmentsRequestData body, @QueryMap(encoded=true) BuildingAttachmentsQueryParams queryParams);

  /**
  * Get relations to Attachments entities
  * 
  * Note, this is equivalent to the other <code>buildingAttachments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingAttachmentsResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/Attachments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingAttachmentsResponseData> buildingAttachmentsWithHttpInfo(@Param("elid") String elid, BuildingAttachmentsRequestData body, @QueryMap(encoded=true) BuildingAttachmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingAttachments</code> method in a fluent style.
   */
  public static class BuildingAttachmentsQueryParams extends HashMap<String, Object> {
    public BuildingAttachmentsQueryParams sessionId(final String value) {
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
   * @return BuildingCampusResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Campus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingCampusResponseData buildingCampus(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingCampusRequestData body);

  /**
   * Get relations to Campus entities
   * Similar to <code>buildingCampus</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Campus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingCampusResponseData> buildingCampusWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingCampusRequestData body);


  /**
   * Get relations to Campus entities
   * 
   * Note, this is equivalent to the other <code>buildingCampus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingCampusQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingCampusResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Campus?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingCampusResponseData buildingCampus(@Param("elid") String elid, BuildingCampusRequestData body, @QueryMap(encoded=true) BuildingCampusQueryParams queryParams);

  /**
  * Get relations to Campus entities
  * 
  * Note, this is equivalent to the other <code>buildingCampus</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingCampusResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/Campus?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingCampusResponseData> buildingCampusWithHttpInfo(@Param("elid") String elid, BuildingCampusRequestData body, @QueryMap(encoded=true) BuildingCampusQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingCampus</code> method in a fluent style.
   */
  public static class BuildingCampusQueryParams extends HashMap<String, Object> {
    public BuildingCampusQueryParams sessionId(final String value) {
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
   * @return BuildingContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingContractsResponseData buildingContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>buildingContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingContractsResponseData> buildingContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>buildingContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingContractsResponseData buildingContracts(@Param("elid") String elid, BuildingContractsRequestData body, @QueryMap(encoded=true) BuildingContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>buildingContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingContractsResponseData> buildingContractsWithHttpInfo(@Param("elid") String elid, BuildingContractsRequestData body, @QueryMap(encoded=true) BuildingContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingContracts</code> method in a fluent style.
   */
  public static class BuildingContractsQueryParams extends HashMap<String, Object> {
    public BuildingContractsQueryParams sessionId(final String value) {
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
   * @return BuildingCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingCustomLocksResponseData buildingCustomLocks(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingCustomLocksRequestData body);

  /**
   * Get relations to Locks entities
   * Similar to <code>buildingCustomLocks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingCustomLocksResponseData> buildingCustomLocksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingCustomLocksRequestData body);


  /**
   * Get relations to Locks entities
   * 
   * Note, this is equivalent to the other <code>buildingCustomLocks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingCustomLocksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingCustomLocksResponseData buildingCustomLocks(@Param("elid") String elid, BuildingCustomLocksRequestData body, @QueryMap(encoded=true) BuildingCustomLocksQueryParams queryParams);

  /**
  * Get relations to Locks entities
  * 
  * Note, this is equivalent to the other <code>buildingCustomLocks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingCustomLocksResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/CustomLocks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingCustomLocksResponseData> buildingCustomLocksWithHttpInfo(@Param("elid") String elid, BuildingCustomLocksRequestData body, @QueryMap(encoded=true) BuildingCustomLocksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingCustomLocks</code> method in a fluent style.
   */
  public static class BuildingCustomLocksQueryParams extends HashMap<String, Object> {
    public BuildingCustomLocksQueryParams sessionId(final String value) {
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
   * @return BuildingCustomPostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/CustomPostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingCustomPostalAddressesResponseData buildingCustomPostalAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingCustomPostalAddressesRequestData body);

  /**
   * Get relations to Postal addresses entities
   * Similar to <code>buildingCustomPostalAddresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/CustomPostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingCustomPostalAddressesResponseData> buildingCustomPostalAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingCustomPostalAddressesRequestData body);


  /**
   * Get relations to Postal addresses entities
   * 
   * Note, this is equivalent to the other <code>buildingCustomPostalAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingCustomPostalAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingCustomPostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/CustomPostalAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingCustomPostalAddressesResponseData buildingCustomPostalAddresses(@Param("elid") String elid, BuildingCustomPostalAddressesRequestData body, @QueryMap(encoded=true) BuildingCustomPostalAddressesQueryParams queryParams);

  /**
  * Get relations to Postal addresses entities
  * 
  * Note, this is equivalent to the other <code>buildingCustomPostalAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingCustomPostalAddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/CustomPostalAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingCustomPostalAddressesResponseData> buildingCustomPostalAddressesWithHttpInfo(@Param("elid") String elid, BuildingCustomPostalAddressesRequestData body, @QueryMap(encoded=true) BuildingCustomPostalAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingCustomPostalAddresses</code> method in a fluent style.
   */
  public static class BuildingCustomPostalAddressesQueryParams extends HashMap<String, Object> {
    public BuildingCustomPostalAddressesQueryParams sessionId(final String value) {
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
   * @return BuildingFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingFloorsResponseData buildingFloors(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingFloorsRequestData body);

  /**
   * Get relations to Floor entities
   * Similar to <code>buildingFloors</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Floors?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingFloorsResponseData> buildingFloorsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingFloorsRequestData body);


  /**
   * Get relations to Floor entities
   * 
   * Note, this is equivalent to the other <code>buildingFloors</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingFloorsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingFloorsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Floors?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingFloorsResponseData buildingFloors(@Param("elid") String elid, BuildingFloorsRequestData body, @QueryMap(encoded=true) BuildingFloorsQueryParams queryParams);

  /**
  * Get relations to Floor entities
  * 
  * Note, this is equivalent to the other <code>buildingFloors</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingFloorsResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/Floors?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingFloorsResponseData> buildingFloorsWithHttpInfo(@Param("elid") String elid, BuildingFloorsRequestData body, @QueryMap(encoded=true) BuildingFloorsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingFloors</code> method in a fluent style.
   */
  public static class BuildingFloorsQueryParams extends HashMap<String, Object> {
    public BuildingFloorsQueryParams sessionId(final String value) {
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
   * @return BuildingFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingFrameContractsResponseData buildingFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>buildingFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingFrameContractsResponseData> buildingFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>buildingFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingFrameContractsResponseData buildingFrameContracts(@Param("elid") String elid, BuildingFrameContractsRequestData body, @QueryMap(encoded=true) BuildingFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>buildingFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingFrameContractsResponseData> buildingFrameContractsWithHttpInfo(@Param("elid") String elid, BuildingFrameContractsRequestData body, @QueryMap(encoded=true) BuildingFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingFrameContracts</code> method in a fluent style.
   */
  public static class BuildingFrameContractsQueryParams extends HashMap<String, Object> {
    public BuildingFrameContractsQueryParams sessionId(final String value) {
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
   * @return BuildingMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingMaintenanceContractsResponseData buildingMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>buildingMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingMaintenanceContractsResponseData> buildingMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>buildingMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingMaintenanceContractsResponseData buildingMaintenanceContracts(@Param("elid") String elid, BuildingMaintenanceContractsRequestData body, @QueryMap(encoded=true) BuildingMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>buildingMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingMaintenanceContractsResponseData> buildingMaintenanceContractsWithHttpInfo(@Param("elid") String elid, BuildingMaintenanceContractsRequestData body, @QueryMap(encoded=true) BuildingMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingMaintenanceContracts</code> method in a fluent style.
   */
  public static class BuildingMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public BuildingMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return BuildingOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingOrganizationsResponseData buildingOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>buildingOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingOrganizationsResponseData> buildingOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>buildingOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingOrganizationsResponseData buildingOrganizations(@Param("elid") String elid, BuildingOrganizationsRequestData body, @QueryMap(encoded=true) BuildingOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>buildingOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingOrganizationsResponseData> buildingOrganizationsWithHttpInfo(@Param("elid") String elid, BuildingOrganizationsRequestData body, @QueryMap(encoded=true) BuildingOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingOrganizations</code> method in a fluent style.
   */
  public static class BuildingOrganizationsQueryParams extends HashMap<String, Object> {
    public BuildingOrganizationsQueryParams sessionId(final String value) {
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
   * @return BuildingPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingPersonGroupsResponseData buildingPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>buildingPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingPersonGroupsResponseData> buildingPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>buildingPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingPersonGroupsResponseData buildingPersonGroups(@Param("elid") String elid, BuildingPersonGroupsRequestData body, @QueryMap(encoded=true) BuildingPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>buildingPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingPersonGroupsResponseData> buildingPersonGroupsWithHttpInfo(@Param("elid") String elid, BuildingPersonGroupsRequestData body, @QueryMap(encoded=true) BuildingPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingPersonGroups</code> method in a fluent style.
   */
  public static class BuildingPersonGroupsQueryParams extends HashMap<String, Object> {
    public BuildingPersonGroupsQueryParams sessionId(final String value) {
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
   * @return BuildingPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingPersonsResponseData buildingPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>buildingPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingPersonsResponseData> buildingPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>buildingPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingPersonsResponseData buildingPersons(@Param("elid") String elid, BuildingPersonsRequestData body, @QueryMap(encoded=true) BuildingPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>buildingPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingPersonsResponseData> buildingPersonsWithHttpInfo(@Param("elid") String elid, BuildingPersonsRequestData body, @QueryMap(encoded=true) BuildingPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingPersons</code> method in a fluent style.
   */
  public static class BuildingPersonsQueryParams extends HashMap<String, Object> {
    public BuildingPersonsQueryParams sessionId(final String value) {
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
   * @return BuildingPostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingPostalAddressesResponseData buildingPostalAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingPostalAddressesRequestData body);

  /**
   * Get relations to Postal address entities
   * Similar to <code>buildingPostalAddresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingPostalAddressesResponseData> buildingPostalAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingPostalAddressesRequestData body);


  /**
   * Get relations to Postal address entities
   * 
   * Note, this is equivalent to the other <code>buildingPostalAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingPostalAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingPostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingPostalAddressesResponseData buildingPostalAddresses(@Param("elid") String elid, BuildingPostalAddressesRequestData body, @QueryMap(encoded=true) BuildingPostalAddressesQueryParams queryParams);

  /**
  * Get relations to Postal address entities
  * 
  * Note, this is equivalent to the other <code>buildingPostalAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingPostalAddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/PostalAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingPostalAddressesResponseData> buildingPostalAddressesWithHttpInfo(@Param("elid") String elid, BuildingPostalAddressesRequestData body, @QueryMap(encoded=true) BuildingPostalAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingPostalAddresses</code> method in a fluent style.
   */
  public static class BuildingPostalAddressesQueryParams extends HashMap<String, Object> {
    public BuildingPostalAddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return BuildingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/building/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingQueryResponse buildingQuery(@Param("sessionId") String sessionId, BuildingQueryRequest body);

  /**
   * Basic query
   * Similar to <code>buildingQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingQueryResponse> buildingQueryWithHttpInfo(@Param("sessionId") String sessionId, BuildingQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>buildingQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingQueryResponse
   */
  @RequestLine("POST /api/rest/entity/building/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingQueryResponse buildingQuery(BuildingQueryRequest body, @QueryMap(encoded=true) BuildingQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>buildingQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingQueryResponse
      */
      @RequestLine("POST /api/rest/entity/building/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingQueryResponse> buildingQueryWithHttpInfo(BuildingQueryRequest body, @QueryMap(encoded=true) BuildingQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingQuery</code> method in a fluent style.
   */
  public static class BuildingQueryQueryParams extends HashMap<String, Object> {
    public BuildingQueryQueryParams sessionId(final String value) {
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
   * @return BuildingSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingSitesResponseData buildingSites(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>buildingSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingSitesResponseData> buildingSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>buildingSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingSitesResponseData buildingSites(@Param("elid") String elid, BuildingSitesRequestData body, @QueryMap(encoded=true) BuildingSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>buildingSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingSitesResponseData> buildingSitesWithHttpInfo(@Param("elid") String elid, BuildingSitesRequestData body, @QueryMap(encoded=true) BuildingSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingSites</code> method in a fluent style.
   */
  public static class BuildingSitesQueryParams extends HashMap<String, Object> {
    public BuildingSitesQueryParams sessionId(final String value) {
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
   * @return BuildingSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingSystemAttributesResponse buildingSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>buildingSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingSystemAttributesResponse> buildingSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>buildingSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingSystemAttributesResponse buildingSystemAttributes(@Param("elid") String elid, BuildingSystemAttributesRequest body, @QueryMap(encoded=true) BuildingSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>buildingSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingSystemAttributesResponse> buildingSystemAttributesWithHttpInfo(@Param("elid") String elid, BuildingSystemAttributesRequest body, @QueryMap(encoded=true) BuildingSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingSystemAttributes</code> method in a fluent style.
   */
  public static class BuildingSystemAttributesQueryParams extends HashMap<String, Object> {
    public BuildingSystemAttributesQueryParams sessionId(final String value) {
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
   * @return BuildingTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  BuildingTopzonesResponseData buildingTopzones(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingTopzonesRequestData body);

  /**
   * Get relations to Topzone entities
   * Similar to <code>buildingTopzones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<BuildingTopzonesResponseData> buildingTopzonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, BuildingTopzonesRequestData body);


  /**
   * Get relations to Topzone entities
   * 
   * Note, this is equivalent to the other <code>buildingTopzones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link BuildingTopzonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return BuildingTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  BuildingTopzonesResponseData buildingTopzones(@Param("elid") String elid, BuildingTopzonesRequestData body, @QueryMap(encoded=true) BuildingTopzonesQueryParams queryParams);

  /**
  * Get relations to Topzone entities
  * 
  * Note, this is equivalent to the other <code>buildingTopzones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return BuildingTopzonesResponseData
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/Topzones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<BuildingTopzonesResponseData> buildingTopzonesWithHttpInfo(@Param("elid") String elid, BuildingTopzonesRequestData body, @QueryMap(encoded=true) BuildingTopzonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>buildingTopzones</code> method in a fluent style.
   */
  public static class BuildingTopzonesQueryParams extends HashMap<String, Object> {
    public BuildingTopzonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create building
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateBuildingResponse
   */
  @RequestLine("POST /api/rest/entity/building/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateBuildingResponse createBuilding(@Param("sessionId") String sessionId, CreateBuildingRequestData body);

  /**
   * Create
   * Similar to <code>createBuilding</code> but it also returns the http response headers .
   * Create building
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateBuildingResponse> createBuildingWithHttpInfo(@Param("sessionId") String sessionId, CreateBuildingRequestData body);


  /**
   * Create
   * Create building
   * Note, this is equivalent to the other <code>createBuilding</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateBuildingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateBuildingResponse
   */
  @RequestLine("POST /api/rest/entity/building/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateBuildingResponse createBuilding(CreateBuildingRequestData body, @QueryMap(encoded=true) CreateBuildingQueryParams queryParams);

  /**
  * Create
  * Create building
  * Note, this is equivalent to the other <code>createBuilding</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateBuildingResponse
      */
      @RequestLine("POST /api/rest/entity/building/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateBuildingResponse> createBuildingWithHttpInfo(CreateBuildingRequestData body, @QueryMap(encoded=true) CreateBuildingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createBuilding</code> method in a fluent style.
   */
  public static class CreateBuildingQueryParams extends HashMap<String, Object> {
    public CreateBuildingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete building
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteBuildingResponse
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteBuildingResponse deleteBuilding(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteBuildingRequestData body);

  /**
   * Delete
   * Similar to <code>deleteBuilding</code> but it also returns the http response headers .
   * Delete building
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteBuildingResponse> deleteBuildingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteBuildingRequestData body);


  /**
   * Delete
   * Delete building
   * Note, this is equivalent to the other <code>deleteBuilding</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteBuildingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteBuildingResponse
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteBuildingResponse deleteBuilding(@Param("elid") String elid, DeleteBuildingRequestData body, @QueryMap(encoded=true) DeleteBuildingQueryParams queryParams);

  /**
  * Delete
  * Delete building
  * Note, this is equivalent to the other <code>deleteBuilding</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteBuildingResponse
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteBuildingResponse> deleteBuildingWithHttpInfo(@Param("elid") String elid, DeleteBuildingRequestData body, @QueryMap(encoded=true) DeleteBuildingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteBuilding</code> method in a fluent style.
   */
  public static class DeleteBuildingQueryParams extends HashMap<String, Object> {
    public DeleteBuildingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Rename
   * Rename building
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RenameBuildingResponse
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/rename?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RenameBuildingResponse renameBuilding(@Param("sessionId") String sessionId, @Param("elid") String elid, RenameBuildingRequestData body);

  /**
   * Rename
   * Similar to <code>renameBuilding</code> but it also returns the http response headers .
   * Rename building
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/rename?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RenameBuildingResponse> renameBuildingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RenameBuildingRequestData body);


  /**
   * Rename
   * Rename building
   * Note, this is equivalent to the other <code>renameBuilding</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RenameBuildingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RenameBuildingResponse
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/rename?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RenameBuildingResponse renameBuilding(@Param("elid") String elid, RenameBuildingRequestData body, @QueryMap(encoded=true) RenameBuildingQueryParams queryParams);

  /**
  * Rename
  * Rename building
  * Note, this is equivalent to the other <code>renameBuilding</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RenameBuildingResponse
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/rename?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RenameBuildingResponse> renameBuildingWithHttpInfo(@Param("elid") String elid, RenameBuildingRequestData body, @QueryMap(encoded=true) RenameBuildingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>renameBuilding</code> method in a fluent style.
   */
  public static class RenameBuildingQueryParams extends HashMap<String, Object> {
    public RenameBuildingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify building
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateBuildingResponse
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateBuildingResponse updateBuilding(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateBuildingRequestData body);

  /**
   * Modify
   * Similar to <code>updateBuilding</code> but it also returns the http response headers .
   * Modify building
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateBuildingResponse> updateBuildingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateBuildingRequestData body);


  /**
   * Modify
   * Modify building
   * Note, this is equivalent to the other <code>updateBuilding</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateBuildingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateBuildingResponse
   */
  @RequestLine("POST /api/rest/entity/building/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateBuildingResponse updateBuilding(@Param("elid") String elid, UpdateBuildingRequestData body, @QueryMap(encoded=true) UpdateBuildingQueryParams queryParams);

  /**
  * Modify
  * Modify building
  * Note, this is equivalent to the other <code>updateBuilding</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateBuildingResponse
      */
      @RequestLine("POST /api/rest/entity/building/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateBuildingResponse> updateBuildingWithHttpInfo(@Param("elid") String elid, UpdateBuildingRequestData body, @QueryMap(encoded=true) UpdateBuildingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateBuilding</code> method in a fluent style.
   */
  public static class UpdateBuildingQueryParams extends HashMap<String, Object> {
    public UpdateBuildingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
