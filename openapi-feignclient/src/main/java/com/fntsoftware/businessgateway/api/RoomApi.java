package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AddToTopzoneRoomRequestData;
import com.fntsoftware.businessgateway.entities.AddToTopzoneRoomResponse;
import com.fntsoftware.businessgateway.entities.CreateRoomRequestData;
import com.fntsoftware.businessgateway.entities.CreateRoomResponse;
import com.fntsoftware.businessgateway.entities.DeleteRoomRequestData;
import com.fntsoftware.businessgateway.entities.DeleteRoomResponse;
import com.fntsoftware.businessgateway.entities.RenameRoomRequestData;
import com.fntsoftware.businessgateway.entities.RenameRoomResponse;
import com.fntsoftware.businessgateway.entities.RoomContractsRequestData;
import com.fntsoftware.businessgateway.entities.RoomContractsResponseData;
import com.fntsoftware.businessgateway.entities.RoomCustomLocksRequestData;
import com.fntsoftware.businessgateway.entities.RoomCustomLocksResponseData;
import com.fntsoftware.businessgateway.entities.RoomFloorRequestData;
import com.fntsoftware.businessgateway.entities.RoomFloorResponseData;
import com.fntsoftware.businessgateway.entities.RoomFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.RoomFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.RoomIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.RoomIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.RoomIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.RoomIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.RoomMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.RoomMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.RoomNetworksAndNetrangesRequest;
import com.fntsoftware.businessgateway.entities.RoomNetworksAndNetrangesResponse;
import com.fntsoftware.businessgateway.entities.RoomOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.RoomOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.RoomPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.RoomPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.RoomPersonsRequestData;
import com.fntsoftware.businessgateway.entities.RoomPersonsResponseData;
import com.fntsoftware.businessgateway.entities.RoomQueryRequest;
import com.fntsoftware.businessgateway.entities.RoomQueryResponse;
import com.fntsoftware.businessgateway.entities.RoomSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.RoomSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.RoomTopzonesRequestData;
import com.fntsoftware.businessgateway.entities.RoomTopzonesResponseData;
import com.fntsoftware.businessgateway.entities.RoomVlansRequest;
import com.fntsoftware.businessgateway.entities.RoomVlansResponse;
import com.fntsoftware.businessgateway.entities.UpdateRoomRequestData;
import com.fntsoftware.businessgateway.entities.UpdateRoomResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface RoomApi extends ApiClient.Api {


  /**
   * Add to topzone
   * Add room to topzone. A link to the topzone will be created.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AddToTopzoneRoomResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/addToTopzone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AddToTopzoneRoomResponse addToTopzoneRoom(@Param("sessionId") String sessionId, @Param("elid") String elid, AddToTopzoneRoomRequestData body);

  /**
   * Add to topzone
   * Similar to <code>addToTopzoneRoom</code> but it also returns the http response headers .
   * Add room to topzone. A link to the topzone will be created.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/addToTopzone?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AddToTopzoneRoomResponse> addToTopzoneRoomWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AddToTopzoneRoomRequestData body);


  /**
   * Add to topzone
   * Add room to topzone. A link to the topzone will be created.
   * Note, this is equivalent to the other <code>addToTopzoneRoom</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AddToTopzoneRoomQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AddToTopzoneRoomResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/addToTopzone?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AddToTopzoneRoomResponse addToTopzoneRoom(@Param("elid") String elid, AddToTopzoneRoomRequestData body, @QueryMap(encoded=true) AddToTopzoneRoomQueryParams queryParams);

  /**
  * Add to topzone
  * Add room to topzone. A link to the topzone will be created.
  * Note, this is equivalent to the other <code>addToTopzoneRoom</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AddToTopzoneRoomResponse
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/addToTopzone?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AddToTopzoneRoomResponse> addToTopzoneRoomWithHttpInfo(@Param("elid") String elid, AddToTopzoneRoomRequestData body, @QueryMap(encoded=true) AddToTopzoneRoomQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>addToTopzoneRoom</code> method in a fluent style.
   */
  public static class AddToTopzoneRoomQueryParams extends HashMap<String, Object> {
    public AddToTopzoneRoomQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create room
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateRoomResponse
   */
  @RequestLine("POST /api/rest/entity/room/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateRoomResponse createRoom(@Param("sessionId") String sessionId, CreateRoomRequestData body);

  /**
   * Create
   * Similar to <code>createRoom</code> but it also returns the http response headers .
   * Create room
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateRoomResponse> createRoomWithHttpInfo(@Param("sessionId") String sessionId, CreateRoomRequestData body);


  /**
   * Create
   * Create room
   * Note, this is equivalent to the other <code>createRoom</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateRoomQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateRoomResponse
   */
  @RequestLine("POST /api/rest/entity/room/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateRoomResponse createRoom(CreateRoomRequestData body, @QueryMap(encoded=true) CreateRoomQueryParams queryParams);

  /**
  * Create
  * Create room
  * Note, this is equivalent to the other <code>createRoom</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateRoomResponse
      */
      @RequestLine("POST /api/rest/entity/room/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateRoomResponse> createRoomWithHttpInfo(CreateRoomRequestData body, @QueryMap(encoded=true) CreateRoomQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createRoom</code> method in a fluent style.
   */
  public static class CreateRoomQueryParams extends HashMap<String, Object> {
    public CreateRoomQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete room
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteRoomResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteRoomResponse deleteRoom(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteRoomRequestData body);

  /**
   * Delete
   * Similar to <code>deleteRoom</code> but it also returns the http response headers .
   * Delete room
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteRoomResponse> deleteRoomWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteRoomRequestData body);


  /**
   * Delete
   * Delete room
   * Note, this is equivalent to the other <code>deleteRoom</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteRoomQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteRoomResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteRoomResponse deleteRoom(@Param("elid") String elid, DeleteRoomRequestData body, @QueryMap(encoded=true) DeleteRoomQueryParams queryParams);

  /**
  * Delete
  * Delete room
  * Note, this is equivalent to the other <code>deleteRoom</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteRoomResponse
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteRoomResponse> deleteRoomWithHttpInfo(@Param("elid") String elid, DeleteRoomRequestData body, @QueryMap(encoded=true) DeleteRoomQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteRoom</code> method in a fluent style.
   */
  public static class DeleteRoomQueryParams extends HashMap<String, Object> {
    public DeleteRoomQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Rename
   * Rename room
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RenameRoomResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/rename?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RenameRoomResponse renameRoom(@Param("sessionId") String sessionId, @Param("elid") String elid, RenameRoomRequestData body);

  /**
   * Rename
   * Similar to <code>renameRoom</code> but it also returns the http response headers .
   * Rename room
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/rename?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RenameRoomResponse> renameRoomWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RenameRoomRequestData body);


  /**
   * Rename
   * Rename room
   * Note, this is equivalent to the other <code>renameRoom</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RenameRoomQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RenameRoomResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/rename?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RenameRoomResponse renameRoom(@Param("elid") String elid, RenameRoomRequestData body, @QueryMap(encoded=true) RenameRoomQueryParams queryParams);

  /**
  * Rename
  * Rename room
  * Note, this is equivalent to the other <code>renameRoom</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RenameRoomResponse
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/rename?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RenameRoomResponse> renameRoomWithHttpInfo(@Param("elid") String elid, RenameRoomRequestData body, @QueryMap(encoded=true) RenameRoomQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>renameRoom</code> method in a fluent style.
   */
  public static class RenameRoomQueryParams extends HashMap<String, Object> {
    public RenameRoomQueryParams sessionId(final String value) {
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
   * @return RoomContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomContractsResponseData roomContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>roomContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomContractsResponseData> roomContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>roomContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomContractsResponseData roomContracts(@Param("elid") String elid, RoomContractsRequestData body, @QueryMap(encoded=true) RoomContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>roomContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomContractsResponseData> roomContractsWithHttpInfo(@Param("elid") String elid, RoomContractsRequestData body, @QueryMap(encoded=true) RoomContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomContracts</code> method in a fluent style.
   */
  public static class RoomContractsQueryParams extends HashMap<String, Object> {
    public RoomContractsQueryParams sessionId(final String value) {
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
   * @return RoomCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomCustomLocksResponseData roomCustomLocks(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomCustomLocksRequestData body);

  /**
   * Get relations to Locks entities
   * Similar to <code>roomCustomLocks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomCustomLocksResponseData> roomCustomLocksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomCustomLocksRequestData body);


  /**
   * Get relations to Locks entities
   * 
   * Note, this is equivalent to the other <code>roomCustomLocks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomCustomLocksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomCustomLocksResponseData roomCustomLocks(@Param("elid") String elid, RoomCustomLocksRequestData body, @QueryMap(encoded=true) RoomCustomLocksQueryParams queryParams);

  /**
  * Get relations to Locks entities
  * 
  * Note, this is equivalent to the other <code>roomCustomLocks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomCustomLocksResponseData
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/CustomLocks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomCustomLocksResponseData> roomCustomLocksWithHttpInfo(@Param("elid") String elid, RoomCustomLocksRequestData body, @QueryMap(encoded=true) RoomCustomLocksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomCustomLocks</code> method in a fluent style.
   */
  public static class RoomCustomLocksQueryParams extends HashMap<String, Object> {
    public RoomCustomLocksQueryParams sessionId(final String value) {
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
   * @return RoomFloorResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Floor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomFloorResponseData roomFloor(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomFloorRequestData body);

  /**
   * Get relations to Floor entities
   * Similar to <code>roomFloor</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Floor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomFloorResponseData> roomFloorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomFloorRequestData body);


  /**
   * Get relations to Floor entities
   * 
   * Note, this is equivalent to the other <code>roomFloor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomFloorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomFloorResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Floor?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomFloorResponseData roomFloor(@Param("elid") String elid, RoomFloorRequestData body, @QueryMap(encoded=true) RoomFloorQueryParams queryParams);

  /**
  * Get relations to Floor entities
  * 
  * Note, this is equivalent to the other <code>roomFloor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomFloorResponseData
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/Floor?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomFloorResponseData> roomFloorWithHttpInfo(@Param("elid") String elid, RoomFloorRequestData body, @QueryMap(encoded=true) RoomFloorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomFloor</code> method in a fluent style.
   */
  public static class RoomFloorQueryParams extends HashMap<String, Object> {
    public RoomFloorQueryParams sessionId(final String value) {
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
   * @return RoomFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomFrameContractsResponseData roomFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>roomFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomFrameContractsResponseData> roomFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>roomFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomFrameContractsResponseData roomFrameContracts(@Param("elid") String elid, RoomFrameContractsRequestData body, @QueryMap(encoded=true) RoomFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>roomFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomFrameContractsResponseData> roomFrameContractsWithHttpInfo(@Param("elid") String elid, RoomFrameContractsRequestData body, @QueryMap(encoded=true) RoomFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomFrameContracts</code> method in a fluent style.
   */
  public static class RoomFrameContractsQueryParams extends HashMap<String, Object> {
    public RoomFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv4 netrange entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RoomIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomIpv4NetrangesResponseData roomIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>roomIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomIpv4NetrangesResponseData> roomIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>roomIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomIpv4NetrangesResponseData roomIpv4Netranges(@Param("elid") String elid, RoomIpv4NetrangesRequestData body, @QueryMap(encoded=true) RoomIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>roomIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomIpv4NetrangesResponseData> roomIpv4NetrangesWithHttpInfo(@Param("elid") String elid, RoomIpv4NetrangesRequestData body, @QueryMap(encoded=true) RoomIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomIpv4Netranges</code> method in a fluent style.
   */
  public static class RoomIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public RoomIpv4NetrangesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv4 Network entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RoomIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomIpv4NetworksResponseData roomIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>roomIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomIpv4NetworksResponseData> roomIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>roomIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomIpv4NetworksResponseData roomIpv4Networks(@Param("elid") String elid, RoomIpv4NetworksRequestData body, @QueryMap(encoded=true) RoomIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>roomIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomIpv4NetworksResponseData> roomIpv4NetworksWithHttpInfo(@Param("elid") String elid, RoomIpv4NetworksRequestData body, @QueryMap(encoded=true) RoomIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomIpv4Networks</code> method in a fluent style.
   */
  public static class RoomIpv4NetworksQueryParams extends HashMap<String, Object> {
    public RoomIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return RoomMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomMaintenanceContractsResponseData roomMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>roomMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomMaintenanceContractsResponseData> roomMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>roomMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomMaintenanceContractsResponseData roomMaintenanceContracts(@Param("elid") String elid, RoomMaintenanceContractsRequestData body, @QueryMap(encoded=true) RoomMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>roomMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomMaintenanceContractsResponseData> roomMaintenanceContractsWithHttpInfo(@Param("elid") String elid, RoomMaintenanceContractsRequestData body, @QueryMap(encoded=true) RoomMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomMaintenanceContracts</code> method in a fluent style.
   */
  public static class RoomMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public RoomMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RoomNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomNetworksAndNetrangesResponse roomNetworksAndNetranges(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomNetworksAndNetrangesRequest body);

  /**
   * Nets / Net ranges
   * Similar to <code>roomNetworksAndNetranges</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomNetworksAndNetrangesResponse> roomNetworksAndNetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomNetworksAndNetrangesRequest body);


  /**
   * Nets / Net ranges
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>roomNetworksAndNetranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomNetworksAndNetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomNetworksAndNetrangesResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/NetworksAndNetranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomNetworksAndNetrangesResponse roomNetworksAndNetranges(@Param("elid") String elid, RoomNetworksAndNetrangesRequest body, @QueryMap(encoded=true) RoomNetworksAndNetrangesQueryParams queryParams);

  /**
  * Nets / Net ranges
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>roomNetworksAndNetranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomNetworksAndNetrangesResponse
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/NetworksAndNetranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomNetworksAndNetrangesResponse> roomNetworksAndNetrangesWithHttpInfo(@Param("elid") String elid, RoomNetworksAndNetrangesRequest body, @QueryMap(encoded=true) RoomNetworksAndNetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomNetworksAndNetranges</code> method in a fluent style.
   */
  public static class RoomNetworksAndNetrangesQueryParams extends HashMap<String, Object> {
    public RoomNetworksAndNetrangesQueryParams sessionId(final String value) {
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
   * @return RoomOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomOrganizationsResponseData roomOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>roomOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomOrganizationsResponseData> roomOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>roomOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomOrganizationsResponseData roomOrganizations(@Param("elid") String elid, RoomOrganizationsRequestData body, @QueryMap(encoded=true) RoomOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>roomOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomOrganizationsResponseData> roomOrganizationsWithHttpInfo(@Param("elid") String elid, RoomOrganizationsRequestData body, @QueryMap(encoded=true) RoomOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomOrganizations</code> method in a fluent style.
   */
  public static class RoomOrganizationsQueryParams extends HashMap<String, Object> {
    public RoomOrganizationsQueryParams sessionId(final String value) {
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
   * @return RoomPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomPersonGroupsResponseData roomPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>roomPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomPersonGroupsResponseData> roomPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>roomPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomPersonGroupsResponseData roomPersonGroups(@Param("elid") String elid, RoomPersonGroupsRequestData body, @QueryMap(encoded=true) RoomPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>roomPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomPersonGroupsResponseData> roomPersonGroupsWithHttpInfo(@Param("elid") String elid, RoomPersonGroupsRequestData body, @QueryMap(encoded=true) RoomPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomPersonGroups</code> method in a fluent style.
   */
  public static class RoomPersonGroupsQueryParams extends HashMap<String, Object> {
    public RoomPersonGroupsQueryParams sessionId(final String value) {
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
   * @return RoomPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomPersonsResponseData roomPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>roomPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomPersonsResponseData> roomPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>roomPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomPersonsResponseData roomPersons(@Param("elid") String elid, RoomPersonsRequestData body, @QueryMap(encoded=true) RoomPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>roomPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomPersonsResponseData> roomPersonsWithHttpInfo(@Param("elid") String elid, RoomPersonsRequestData body, @QueryMap(encoded=true) RoomPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomPersons</code> method in a fluent style.
   */
  public static class RoomPersonsQueryParams extends HashMap<String, Object> {
    public RoomPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return RoomQueryResponse
   */
  @RequestLine("POST /api/rest/entity/room/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomQueryResponse roomQuery(@Param("sessionId") String sessionId, RoomQueryRequest body);

  /**
   * Basic query
   * Similar to <code>roomQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomQueryResponse> roomQueryWithHttpInfo(@Param("sessionId") String sessionId, RoomQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>roomQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomQueryResponse
   */
  @RequestLine("POST /api/rest/entity/room/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomQueryResponse roomQuery(RoomQueryRequest body, @QueryMap(encoded=true) RoomQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>roomQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomQueryResponse
      */
      @RequestLine("POST /api/rest/entity/room/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomQueryResponse> roomQueryWithHttpInfo(RoomQueryRequest body, @QueryMap(encoded=true) RoomQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomQuery</code> method in a fluent style.
   */
  public static class RoomQueryQueryParams extends HashMap<String, Object> {
    public RoomQueryQueryParams sessionId(final String value) {
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
   * @return RoomSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomSystemAttributesResponse roomSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>roomSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomSystemAttributesResponse> roomSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>roomSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomSystemAttributesResponse roomSystemAttributes(@Param("elid") String elid, RoomSystemAttributesRequest body, @QueryMap(encoded=true) RoomSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>roomSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomSystemAttributesResponse> roomSystemAttributesWithHttpInfo(@Param("elid") String elid, RoomSystemAttributesRequest body, @QueryMap(encoded=true) RoomSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomSystemAttributes</code> method in a fluent style.
   */
  public static class RoomSystemAttributesQueryParams extends HashMap<String, Object> {
    public RoomSystemAttributesQueryParams sessionId(final String value) {
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
   * @return RoomTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomTopzonesResponseData roomTopzones(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomTopzonesRequestData body);

  /**
   * Get relations to Topzone entities
   * Similar to <code>roomTopzones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomTopzonesResponseData> roomTopzonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomTopzonesRequestData body);


  /**
   * Get relations to Topzone entities
   * 
   * Note, this is equivalent to the other <code>roomTopzones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomTopzonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomTopzonesResponseData
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Topzones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomTopzonesResponseData roomTopzones(@Param("elid") String elid, RoomTopzonesRequestData body, @QueryMap(encoded=true) RoomTopzonesQueryParams queryParams);

  /**
  * Get relations to Topzone entities
  * 
  * Note, this is equivalent to the other <code>roomTopzones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomTopzonesResponseData
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/Topzones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomTopzonesResponseData> roomTopzonesWithHttpInfo(@Param("elid") String elid, RoomTopzonesRequestData body, @QueryMap(encoded=true) RoomTopzonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomTopzones</code> method in a fluent style.
   */
  public static class RoomTopzonesQueryParams extends HashMap<String, Object> {
    public RoomTopzonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * VLANs
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return RoomVlansResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RoomVlansResponse roomVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomVlansRequest body);

  /**
   * VLANs
   * Similar to <code>roomVlans</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<RoomVlansResponse> roomVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, RoomVlansRequest body);


  /**
   * VLANs
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>roomVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RoomVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return RoomVlansResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RoomVlansResponse roomVlans(@Param("elid") String elid, RoomVlansRequest body, @QueryMap(encoded=true) RoomVlansQueryParams queryParams);

  /**
  * VLANs
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>roomVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return RoomVlansResponse
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<RoomVlansResponse> roomVlansWithHttpInfo(@Param("elid") String elid, RoomVlansRequest body, @QueryMap(encoded=true) RoomVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>roomVlans</code> method in a fluent style.
   */
  public static class RoomVlansQueryParams extends HashMap<String, Object> {
    public RoomVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify room
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateRoomResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateRoomResponse updateRoom(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateRoomRequestData body);

  /**
   * Modify
   * Similar to <code>updateRoom</code> but it also returns the http response headers .
   * Modify room
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateRoomResponse> updateRoomWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateRoomRequestData body);


  /**
   * Modify
   * Modify room
   * Note, this is equivalent to the other <code>updateRoom</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateRoomQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateRoomResponse
   */
  @RequestLine("POST /api/rest/entity/room/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateRoomResponse updateRoom(@Param("elid") String elid, UpdateRoomRequestData body, @QueryMap(encoded=true) UpdateRoomQueryParams queryParams);

  /**
  * Modify
  * Modify room
  * Note, this is equivalent to the other <code>updateRoom</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateRoomResponse
      */
      @RequestLine("POST /api/rest/entity/room/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateRoomResponse> updateRoomWithHttpInfo(@Param("elid") String elid, UpdateRoomRequestData body, @QueryMap(encoded=true) UpdateRoomQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateRoom</code> method in a fluent style.
   */
  public static class UpdateRoomQueryParams extends HashMap<String, Object> {
    public UpdateRoomQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
