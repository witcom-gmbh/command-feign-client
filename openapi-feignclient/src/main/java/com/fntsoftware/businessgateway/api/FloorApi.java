package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AddToTopzoneFloorRequestData;
import com.fntsoftware.businessgateway.entities.AddToTopzoneFloorResponse;
import com.fntsoftware.businessgateway.entities.CreateFloorRequestData;
import com.fntsoftware.businessgateway.entities.CreateFloorResponse;
import com.fntsoftware.businessgateway.entities.DeleteFloorRequestData;
import com.fntsoftware.businessgateway.entities.DeleteFloorResponse;
import com.fntsoftware.businessgateway.entities.FloorAttachmentsRequestData;
import com.fntsoftware.businessgateway.entities.FloorAttachmentsResponseData;
import com.fntsoftware.businessgateway.entities.FloorBuildingRequestData;
import com.fntsoftware.businessgateway.entities.FloorBuildingResponseData;
import com.fntsoftware.businessgateway.entities.FloorContractsRequestData;
import com.fntsoftware.businessgateway.entities.FloorContractsResponseData;
import com.fntsoftware.businessgateway.entities.FloorCustomLocksRequestData;
import com.fntsoftware.businessgateway.entities.FloorCustomLocksResponseData;
import com.fntsoftware.businessgateway.entities.FloorFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.FloorFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.FloorMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.FloorMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.FloorOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.FloorOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.FloorPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.FloorPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.FloorPersonsRequestData;
import com.fntsoftware.businessgateway.entities.FloorPersonsResponseData;
import com.fntsoftware.businessgateway.entities.FloorPostalAddressesRequestData;
import com.fntsoftware.businessgateway.entities.FloorPostalAddressesResponseData;
import com.fntsoftware.businessgateway.entities.FloorQueryRequest;
import com.fntsoftware.businessgateway.entities.FloorQueryResponse;
import com.fntsoftware.businessgateway.entities.FloorRoomsRequestData;
import com.fntsoftware.businessgateway.entities.FloorRoomsResponseData;
import com.fntsoftware.businessgateway.entities.FloorSitesRequestData;
import com.fntsoftware.businessgateway.entities.FloorSitesResponseData;
import com.fntsoftware.businessgateway.entities.FloorSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.FloorSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.FloorTopzonesRequestData;
import com.fntsoftware.businessgateway.entities.FloorTopzonesResponseData;
import com.fntsoftware.businessgateway.entities.RenameFloorRequestData;
import com.fntsoftware.businessgateway.entities.RenameFloorResponse;
import com.fntsoftware.businessgateway.entities.UpdateFloorRequestData;
import com.fntsoftware.businessgateway.entities.UpdateFloorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface FloorApi extends ApiClient.Api {


  /**
   * Add to topzone
   * Add floor to topzone. A link to the topzone will be created.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AddToTopzoneFloorResponse
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/addToTopzone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddToTopzoneFloorResponse addToTopzoneFloor(@Param("sessionId") String sessionId, @Param("elid") String elid, AddToTopzoneFloorRequestData body);

  /**
   * Add to topzone
   * Similar to <code>addToTopzoneFloor</code> but it also returns the http response headers .
   * Add floor to topzone. A link to the topzone will be created.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/addToTopzone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddToTopzoneFloorResponse> addToTopzoneFloorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AddToTopzoneFloorRequestData body);


  /**
   * Add to topzone
   * Add floor to topzone. A link to the topzone will be created.
   * Note, this is equivalent to the other <code>addToTopzoneFloor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddToTopzoneFloorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AddToTopzoneFloorResponse
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/addToTopzone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AddToTopzoneFloorResponse addToTopzoneFloor(@Param("elid") String elid, AddToTopzoneFloorRequestData body, @QueryMap(encoded=true) AddToTopzoneFloorQueryParams queryParams);

  /**
  * Add to topzone
  * Add floor to topzone. A link to the topzone will be created.
  * Note, this is equivalent to the other <code>addToTopzoneFloor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AddToTopzoneFloorResponse
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/addToTopzone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AddToTopzoneFloorResponse> addToTopzoneFloorWithHttpInfo(@Param("elid") String elid, AddToTopzoneFloorRequestData body, @QueryMap(encoded=true) AddToTopzoneFloorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>addToTopzoneFloor</code> method in a fluent style.
   */
  public static class AddToTopzoneFloorQueryParams extends HashMap<String, Object> {
    public AddToTopzoneFloorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create floor
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateFloorResponse
   */
  @RequestLine("POST /api/rest/entity/floor/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateFloorResponse createFloor(@Param("sessionId") String sessionId, CreateFloorRequestData body);

  /**
   * Create
   * Similar to <code>createFloor</code> but it also returns the http response headers .
   * Create floor
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateFloorResponse> createFloorWithHttpInfo(@Param("sessionId") String sessionId, CreateFloorRequestData body);


  /**
   * Create
   * Create floor
   * Note, this is equivalent to the other <code>createFloor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateFloorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateFloorResponse
   */
  @RequestLine("POST /api/rest/entity/floor/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateFloorResponse createFloor(CreateFloorRequestData body, @QueryMap(encoded=true) CreateFloorQueryParams queryParams);

  /**
  * Create
  * Create floor
  * Note, this is equivalent to the other <code>createFloor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateFloorResponse
      */
      @RequestLine("POST /api/rest/entity/floor/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateFloorResponse> createFloorWithHttpInfo(CreateFloorRequestData body, @QueryMap(encoded=true) CreateFloorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createFloor</code> method in a fluent style.
   */
  public static class CreateFloorQueryParams extends HashMap<String, Object> {
    public CreateFloorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete floor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteFloorResponse
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteFloorResponse deleteFloor(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteFloorRequestData body);

  /**
   * Delete
   * Similar to <code>deleteFloor</code> but it also returns the http response headers .
   * Delete floor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteFloorResponse> deleteFloorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteFloorRequestData body);


  /**
   * Delete
   * Delete floor
   * Note, this is equivalent to the other <code>deleteFloor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteFloorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteFloorResponse
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteFloorResponse deleteFloor(@Param("elid") String elid, DeleteFloorRequestData body, @QueryMap(encoded=true) DeleteFloorQueryParams queryParams);

  /**
  * Delete
  * Delete floor
  * Note, this is equivalent to the other <code>deleteFloor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteFloorResponse
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteFloorResponse> deleteFloorWithHttpInfo(@Param("elid") String elid, DeleteFloorRequestData body, @QueryMap(encoded=true) DeleteFloorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteFloor</code> method in a fluent style.
   */
  public static class DeleteFloorQueryParams extends HashMap<String, Object> {
    public DeleteFloorQueryParams sessionId(final String value) {
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
   * @return FloorAttachmentsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Attachments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorAttachmentsResponseData floorAttachments(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorAttachmentsRequestData body);

  /**
   * Get relations to Attachments entities
   * Similar to <code>floorAttachments</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Attachments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorAttachmentsResponseData> floorAttachmentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorAttachmentsRequestData body);


  /**
   * Get relations to Attachments entities
   * 
   * Note, this is equivalent to the other <code>floorAttachments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorAttachmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorAttachmentsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Attachments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorAttachmentsResponseData floorAttachments(@Param("elid") String elid, FloorAttachmentsRequestData body, @QueryMap(encoded=true) FloorAttachmentsQueryParams queryParams);

  /**
  * Get relations to Attachments entities
  * 
  * Note, this is equivalent to the other <code>floorAttachments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorAttachmentsResponseData
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/Attachments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorAttachmentsResponseData> floorAttachmentsWithHttpInfo(@Param("elid") String elid, FloorAttachmentsRequestData body, @QueryMap(encoded=true) FloorAttachmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorAttachments</code> method in a fluent style.
   */
  public static class FloorAttachmentsQueryParams extends HashMap<String, Object> {
    public FloorAttachmentsQueryParams sessionId(final String value) {
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
   * @return FloorBuildingResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Building?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorBuildingResponseData floorBuilding(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorBuildingRequestData body);

  /**
   * Get relations to Building entities
   * Similar to <code>floorBuilding</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Building?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorBuildingResponseData> floorBuildingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorBuildingRequestData body);


  /**
   * Get relations to Building entities
   * 
   * Note, this is equivalent to the other <code>floorBuilding</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorBuildingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorBuildingResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Building?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorBuildingResponseData floorBuilding(@Param("elid") String elid, FloorBuildingRequestData body, @QueryMap(encoded=true) FloorBuildingQueryParams queryParams);

  /**
  * Get relations to Building entities
  * 
  * Note, this is equivalent to the other <code>floorBuilding</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorBuildingResponseData
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/Building?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorBuildingResponseData> floorBuildingWithHttpInfo(@Param("elid") String elid, FloorBuildingRequestData body, @QueryMap(encoded=true) FloorBuildingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorBuilding</code> method in a fluent style.
   */
  public static class FloorBuildingQueryParams extends HashMap<String, Object> {
    public FloorBuildingQueryParams sessionId(final String value) {
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
   * @return FloorContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorContractsResponseData floorContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>floorContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorContractsResponseData> floorContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>floorContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorContractsResponseData floorContracts(@Param("elid") String elid, FloorContractsRequestData body, @QueryMap(encoded=true) FloorContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>floorContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorContractsResponseData> floorContractsWithHttpInfo(@Param("elid") String elid, FloorContractsRequestData body, @QueryMap(encoded=true) FloorContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorContracts</code> method in a fluent style.
   */
  public static class FloorContractsQueryParams extends HashMap<String, Object> {
    public FloorContractsQueryParams sessionId(final String value) {
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
   * @return FloorCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorCustomLocksResponseData floorCustomLocks(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorCustomLocksRequestData body);

  /**
   * Get relations to Locks entities
   * Similar to <code>floorCustomLocks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorCustomLocksResponseData> floorCustomLocksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorCustomLocksRequestData body);


  /**
   * Get relations to Locks entities
   * 
   * Note, this is equivalent to the other <code>floorCustomLocks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorCustomLocksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorCustomLocksResponseData floorCustomLocks(@Param("elid") String elid, FloorCustomLocksRequestData body, @QueryMap(encoded=true) FloorCustomLocksQueryParams queryParams);

  /**
  * Get relations to Locks entities
  * 
  * Note, this is equivalent to the other <code>floorCustomLocks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorCustomLocksResponseData
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/CustomLocks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorCustomLocksResponseData> floorCustomLocksWithHttpInfo(@Param("elid") String elid, FloorCustomLocksRequestData body, @QueryMap(encoded=true) FloorCustomLocksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorCustomLocks</code> method in a fluent style.
   */
  public static class FloorCustomLocksQueryParams extends HashMap<String, Object> {
    public FloorCustomLocksQueryParams sessionId(final String value) {
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
   * @return FloorFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorFrameContractsResponseData floorFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>floorFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorFrameContractsResponseData> floorFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>floorFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorFrameContractsResponseData floorFrameContracts(@Param("elid") String elid, FloorFrameContractsRequestData body, @QueryMap(encoded=true) FloorFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>floorFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorFrameContractsResponseData> floorFrameContractsWithHttpInfo(@Param("elid") String elid, FloorFrameContractsRequestData body, @QueryMap(encoded=true) FloorFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorFrameContracts</code> method in a fluent style.
   */
  public static class FloorFrameContractsQueryParams extends HashMap<String, Object> {
    public FloorFrameContractsQueryParams sessionId(final String value) {
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
   * @return FloorMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorMaintenanceContractsResponseData floorMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>floorMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorMaintenanceContractsResponseData> floorMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>floorMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorMaintenanceContractsResponseData floorMaintenanceContracts(@Param("elid") String elid, FloorMaintenanceContractsRequestData body, @QueryMap(encoded=true) FloorMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>floorMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorMaintenanceContractsResponseData> floorMaintenanceContractsWithHttpInfo(@Param("elid") String elid, FloorMaintenanceContractsRequestData body, @QueryMap(encoded=true) FloorMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorMaintenanceContracts</code> method in a fluent style.
   */
  public static class FloorMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public FloorMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return FloorOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorOrganizationsResponseData floorOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>floorOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorOrganizationsResponseData> floorOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>floorOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorOrganizationsResponseData floorOrganizations(@Param("elid") String elid, FloorOrganizationsRequestData body, @QueryMap(encoded=true) FloorOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>floorOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorOrganizationsResponseData> floorOrganizationsWithHttpInfo(@Param("elid") String elid, FloorOrganizationsRequestData body, @QueryMap(encoded=true) FloorOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorOrganizations</code> method in a fluent style.
   */
  public static class FloorOrganizationsQueryParams extends HashMap<String, Object> {
    public FloorOrganizationsQueryParams sessionId(final String value) {
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
   * @return FloorPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorPersonGroupsResponseData floorPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>floorPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorPersonGroupsResponseData> floorPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>floorPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorPersonGroupsResponseData floorPersonGroups(@Param("elid") String elid, FloorPersonGroupsRequestData body, @QueryMap(encoded=true) FloorPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>floorPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorPersonGroupsResponseData> floorPersonGroupsWithHttpInfo(@Param("elid") String elid, FloorPersonGroupsRequestData body, @QueryMap(encoded=true) FloorPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorPersonGroups</code> method in a fluent style.
   */
  public static class FloorPersonGroupsQueryParams extends HashMap<String, Object> {
    public FloorPersonGroupsQueryParams sessionId(final String value) {
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
   * @return FloorPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorPersonsResponseData floorPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>floorPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorPersonsResponseData> floorPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>floorPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorPersonsResponseData floorPersons(@Param("elid") String elid, FloorPersonsRequestData body, @QueryMap(encoded=true) FloorPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>floorPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorPersonsResponseData> floorPersonsWithHttpInfo(@Param("elid") String elid, FloorPersonsRequestData body, @QueryMap(encoded=true) FloorPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorPersons</code> method in a fluent style.
   */
  public static class FloorPersonsQueryParams extends HashMap<String, Object> {
    public FloorPersonsQueryParams sessionId(final String value) {
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
   * @return FloorPostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorPostalAddressesResponseData floorPostalAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorPostalAddressesRequestData body);

  /**
   * Get relations to Postal address entities
   * Similar to <code>floorPostalAddresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorPostalAddressesResponseData> floorPostalAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorPostalAddressesRequestData body);


  /**
   * Get relations to Postal address entities
   * 
   * Note, this is equivalent to the other <code>floorPostalAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorPostalAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorPostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorPostalAddressesResponseData floorPostalAddresses(@Param("elid") String elid, FloorPostalAddressesRequestData body, @QueryMap(encoded=true) FloorPostalAddressesQueryParams queryParams);

  /**
  * Get relations to Postal address entities
  * 
  * Note, this is equivalent to the other <code>floorPostalAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorPostalAddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/PostalAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorPostalAddressesResponseData> floorPostalAddressesWithHttpInfo(@Param("elid") String elid, FloorPostalAddressesRequestData body, @QueryMap(encoded=true) FloorPostalAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorPostalAddresses</code> method in a fluent style.
   */
  public static class FloorPostalAddressesQueryParams extends HashMap<String, Object> {
    public FloorPostalAddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return FloorQueryResponse
   */
  @RequestLine("POST /api/rest/entity/floor/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorQueryResponse floorQuery(@Param("sessionId") String sessionId, FloorQueryRequest body);

  /**
   * Basic query
   * Similar to <code>floorQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorQueryResponse> floorQueryWithHttpInfo(@Param("sessionId") String sessionId, FloorQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>floorQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorQueryResponse
   */
  @RequestLine("POST /api/rest/entity/floor/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorQueryResponse floorQuery(FloorQueryRequest body, @QueryMap(encoded=true) FloorQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>floorQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorQueryResponse
      */
      @RequestLine("POST /api/rest/entity/floor/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorQueryResponse> floorQueryWithHttpInfo(FloorQueryRequest body, @QueryMap(encoded=true) FloorQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorQuery</code> method in a fluent style.
   */
  public static class FloorQueryQueryParams extends HashMap<String, Object> {
    public FloorQueryQueryParams sessionId(final String value) {
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
   * @return FloorRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorRoomsResponseData floorRooms(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorRoomsRequestData body);

  /**
   * Get relations to Room entities
   * Similar to <code>floorRooms</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorRoomsResponseData> floorRoomsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorRoomsRequestData body);


  /**
   * Get relations to Room entities
   * 
   * Note, this is equivalent to the other <code>floorRooms</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorRoomsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorRoomsResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Rooms?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorRoomsResponseData floorRooms(@Param("elid") String elid, FloorRoomsRequestData body, @QueryMap(encoded=true) FloorRoomsQueryParams queryParams);

  /**
  * Get relations to Room entities
  * 
  * Note, this is equivalent to the other <code>floorRooms</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorRoomsResponseData
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/Rooms?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorRoomsResponseData> floorRoomsWithHttpInfo(@Param("elid") String elid, FloorRoomsRequestData body, @QueryMap(encoded=true) FloorRoomsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorRooms</code> method in a fluent style.
   */
  public static class FloorRoomsQueryParams extends HashMap<String, Object> {
    public FloorRoomsQueryParams sessionId(final String value) {
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
   * @return FloorSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorSitesResponseData floorSites(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorSitesRequestData body);

  /**
   * Get relations to Site entities
   * Similar to <code>floorSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorSitesResponseData> floorSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorSitesRequestData body);


  /**
   * Get relations to Site entities
   * 
   * Note, this is equivalent to the other <code>floorSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorSitesResponseData floorSites(@Param("elid") String elid, FloorSitesRequestData body, @QueryMap(encoded=true) FloorSitesQueryParams queryParams);

  /**
  * Get relations to Site entities
  * 
  * Note, this is equivalent to the other <code>floorSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorSitesResponseData> floorSitesWithHttpInfo(@Param("elid") String elid, FloorSitesRequestData body, @QueryMap(encoded=true) FloorSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorSites</code> method in a fluent style.
   */
  public static class FloorSitesQueryParams extends HashMap<String, Object> {
    public FloorSitesQueryParams sessionId(final String value) {
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
   * @return FloorSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorSystemAttributesResponse floorSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>floorSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorSystemAttributesResponse> floorSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>floorSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorSystemAttributesResponse floorSystemAttributes(@Param("elid") String elid, FloorSystemAttributesRequest body, @QueryMap(encoded=true) FloorSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>floorSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorSystemAttributesResponse> floorSystemAttributesWithHttpInfo(@Param("elid") String elid, FloorSystemAttributesRequest body, @QueryMap(encoded=true) FloorSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorSystemAttributes</code> method in a fluent style.
   */
  public static class FloorSystemAttributesQueryParams extends HashMap<String, Object> {
    public FloorSystemAttributesQueryParams sessionId(final String value) {
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
   * @return FloorTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  FloorTopzonesResponseData floorTopzones(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorTopzonesRequestData body);

  /**
   * Get relations to Topzone entities
   * Similar to <code>floorTopzones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<FloorTopzonesResponseData> floorTopzonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, FloorTopzonesRequestData body);


  /**
   * Get relations to Topzone entities
   * 
   * Note, this is equivalent to the other <code>floorTopzones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link FloorTopzonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return FloorTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  FloorTopzonesResponseData floorTopzones(@Param("elid") String elid, FloorTopzonesRequestData body, @QueryMap(encoded=true) FloorTopzonesQueryParams queryParams);

  /**
  * Get relations to Topzone entities
  * 
  * Note, this is equivalent to the other <code>floorTopzones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return FloorTopzonesResponseData
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/Topzones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<FloorTopzonesResponseData> floorTopzonesWithHttpInfo(@Param("elid") String elid, FloorTopzonesRequestData body, @QueryMap(encoded=true) FloorTopzonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>floorTopzones</code> method in a fluent style.
   */
  public static class FloorTopzonesQueryParams extends HashMap<String, Object> {
    public FloorTopzonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Rename
   * Rename floor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RenameFloorResponse
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/rename?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RenameFloorResponse renameFloor(@Param("sessionId") String sessionId, @Param("elid") String elid, RenameFloorRequestData body);

  /**
   * Rename
   * Similar to <code>renameFloor</code> but it also returns the http response headers .
   * Rename floor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/rename?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RenameFloorResponse> renameFloorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RenameFloorRequestData body);


  /**
   * Rename
   * Rename floor
   * Note, this is equivalent to the other <code>renameFloor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RenameFloorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RenameFloorResponse
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/rename?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RenameFloorResponse renameFloor(@Param("elid") String elid, RenameFloorRequestData body, @QueryMap(encoded=true) RenameFloorQueryParams queryParams);

  /**
  * Rename
  * Rename floor
  * Note, this is equivalent to the other <code>renameFloor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RenameFloorResponse
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/rename?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RenameFloorResponse> renameFloorWithHttpInfo(@Param("elid") String elid, RenameFloorRequestData body, @QueryMap(encoded=true) RenameFloorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>renameFloor</code> method in a fluent style.
   */
  public static class RenameFloorQueryParams extends HashMap<String, Object> {
    public RenameFloorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify floor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateFloorResponse
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateFloorResponse updateFloor(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateFloorRequestData body);

  /**
   * Modify
   * Similar to <code>updateFloor</code> but it also returns the http response headers .
   * Modify floor
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateFloorResponse> updateFloorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateFloorRequestData body);


  /**
   * Modify
   * Modify floor
   * Note, this is equivalent to the other <code>updateFloor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateFloorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateFloorResponse
   */
  @RequestLine("POST /api/rest/entity/floor/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateFloorResponse updateFloor(@Param("elid") String elid, UpdateFloorRequestData body, @QueryMap(encoded=true) UpdateFloorQueryParams queryParams);

  /**
  * Modify
  * Modify floor
  * Note, this is equivalent to the other <code>updateFloor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateFloorResponse
      */
      @RequestLine("POST /api/rest/entity/floor/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateFloorResponse> updateFloorWithHttpInfo(@Param("elid") String elid, UpdateFloorRequestData body, @QueryMap(encoded=true) UpdateFloorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateFloor</code> method in a fluent style.
   */
  public static class UpdateFloorQueryParams extends HashMap<String, Object> {
    public UpdateFloorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
