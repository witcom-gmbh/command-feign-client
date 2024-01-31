package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateNetrangeNameRequestData;
import com.fntsoftware.businessgateway.entities.CreateNetrangeNameResponse;
import com.fntsoftware.businessgateway.entities.DeleteNetrangeNameRequestData;
import com.fntsoftware.businessgateway.entities.DeleteNetrangeNameResponse;
import com.fntsoftware.businessgateway.entities.NetrangeNameContractsRequestData;
import com.fntsoftware.businessgateway.entities.NetrangeNameContractsResponseData;
import com.fntsoftware.businessgateway.entities.NetrangeNameFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.NetrangeNameFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.NetrangeNameMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.NetrangeNameMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.NetrangeNameOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.NetrangeNameOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.NetrangeNamePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.NetrangeNamePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.NetrangeNamePersonsRequestData;
import com.fntsoftware.businessgateway.entities.NetrangeNamePersonsResponseData;
import com.fntsoftware.businessgateway.entities.NetrangeNameQueryRequest;
import com.fntsoftware.businessgateway.entities.NetrangeNameQueryResponse;
import com.fntsoftware.businessgateway.entities.NetrangeNameSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.NetrangeNameSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateNetrangeNameRequestData;
import com.fntsoftware.businessgateway.entities.UpdateNetrangeNameResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNetrangeNameRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNetrangeNameResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface NetrangeNameApi extends ApiClient.Api {


  /**
   * Create
   * Create netrange name
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateNetrangeNameResponse
   */
  @RequestLine("POST /api/rest/entity/netrangeName/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateNetrangeNameResponse createNetrangeName(@Param("sessionId") String sessionId, CreateNetrangeNameRequestData body);

  /**
   * Create
   * Similar to <code>createNetrangeName</code> but it also returns the http response headers .
   * Create netrange name
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netrangeName/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateNetrangeNameResponse> createNetrangeNameWithHttpInfo(@Param("sessionId") String sessionId, CreateNetrangeNameRequestData body);


  /**
   * Create
   * Create netrange name
   * Note, this is equivalent to the other <code>createNetrangeName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateNetrangeNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateNetrangeNameResponse
   */
  @RequestLine("POST /api/rest/entity/netrangeName/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateNetrangeNameResponse createNetrangeName(CreateNetrangeNameRequestData body, @QueryMap(encoded=true) CreateNetrangeNameQueryParams queryParams);

  /**
  * Create
  * Create netrange name
  * Note, this is equivalent to the other <code>createNetrangeName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateNetrangeNameResponse
      */
      @RequestLine("POST /api/rest/entity/netrangeName/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateNetrangeNameResponse> createNetrangeNameWithHttpInfo(CreateNetrangeNameRequestData body, @QueryMap(encoded=true) CreateNetrangeNameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createNetrangeName</code> method in a fluent style.
   */
  public static class CreateNetrangeNameQueryParams extends HashMap<String, Object> {
    public CreateNetrangeNameQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete netrange name
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteNetrangeNameResponse
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteNetrangeNameResponse deleteNetrangeName(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNetrangeNameRequestData body);

  /**
   * Delete
   * Similar to <code>deleteNetrangeName</code> but it also returns the http response headers .
   * Delete netrange name
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteNetrangeNameResponse> deleteNetrangeNameWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNetrangeNameRequestData body);


  /**
   * Delete
   * Delete netrange name
   * Note, this is equivalent to the other <code>deleteNetrangeName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteNetrangeNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteNetrangeNameResponse
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteNetrangeNameResponse deleteNetrangeName(@Param("elid") String elid, DeleteNetrangeNameRequestData body, @QueryMap(encoded=true) DeleteNetrangeNameQueryParams queryParams);

  /**
  * Delete
  * Delete netrange name
  * Note, this is equivalent to the other <code>deleteNetrangeName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteNetrangeNameResponse
      */
      @RequestLine("POST /api/rest/entity/netrangeName/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteNetrangeNameResponse> deleteNetrangeNameWithHttpInfo(@Param("elid") String elid, DeleteNetrangeNameRequestData body, @QueryMap(encoded=true) DeleteNetrangeNameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteNetrangeName</code> method in a fluent style.
   */
  public static class DeleteNetrangeNameQueryParams extends HashMap<String, Object> {
    public DeleteNetrangeNameQueryParams sessionId(final String value) {
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
   * @return NetrangeNameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetrangeNameContractsResponseData netrangeNameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNameContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>netrangeNameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetrangeNameContractsResponseData> netrangeNameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNameContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>netrangeNameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetrangeNameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetrangeNameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetrangeNameContractsResponseData netrangeNameContracts(@Param("elid") String elid, NetrangeNameContractsRequestData body, @QueryMap(encoded=true) NetrangeNameContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>netrangeNameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetrangeNameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/netrangeName/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetrangeNameContractsResponseData> netrangeNameContractsWithHttpInfo(@Param("elid") String elid, NetrangeNameContractsRequestData body, @QueryMap(encoded=true) NetrangeNameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netrangeNameContracts</code> method in a fluent style.
   */
  public static class NetrangeNameContractsQueryParams extends HashMap<String, Object> {
    public NetrangeNameContractsQueryParams sessionId(final String value) {
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
   * @return NetrangeNameFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetrangeNameFrameContractsResponseData netrangeNameFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNameFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>netrangeNameFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetrangeNameFrameContractsResponseData> netrangeNameFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNameFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>netrangeNameFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetrangeNameFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetrangeNameFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetrangeNameFrameContractsResponseData netrangeNameFrameContracts(@Param("elid") String elid, NetrangeNameFrameContractsRequestData body, @QueryMap(encoded=true) NetrangeNameFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>netrangeNameFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetrangeNameFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/netrangeName/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetrangeNameFrameContractsResponseData> netrangeNameFrameContractsWithHttpInfo(@Param("elid") String elid, NetrangeNameFrameContractsRequestData body, @QueryMap(encoded=true) NetrangeNameFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netrangeNameFrameContracts</code> method in a fluent style.
   */
  public static class NetrangeNameFrameContractsQueryParams extends HashMap<String, Object> {
    public NetrangeNameFrameContractsQueryParams sessionId(final String value) {
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
   * @return NetrangeNameMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetrangeNameMaintenanceContractsResponseData netrangeNameMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNameMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>netrangeNameMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetrangeNameMaintenanceContractsResponseData> netrangeNameMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNameMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>netrangeNameMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetrangeNameMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetrangeNameMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetrangeNameMaintenanceContractsResponseData netrangeNameMaintenanceContracts(@Param("elid") String elid, NetrangeNameMaintenanceContractsRequestData body, @QueryMap(encoded=true) NetrangeNameMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>netrangeNameMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetrangeNameMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/netrangeName/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetrangeNameMaintenanceContractsResponseData> netrangeNameMaintenanceContractsWithHttpInfo(@Param("elid") String elid, NetrangeNameMaintenanceContractsRequestData body, @QueryMap(encoded=true) NetrangeNameMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netrangeNameMaintenanceContracts</code> method in a fluent style.
   */
  public static class NetrangeNameMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public NetrangeNameMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return NetrangeNameOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetrangeNameOrganizationsResponseData netrangeNameOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNameOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>netrangeNameOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetrangeNameOrganizationsResponseData> netrangeNameOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNameOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>netrangeNameOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetrangeNameOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetrangeNameOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetrangeNameOrganizationsResponseData netrangeNameOrganizations(@Param("elid") String elid, NetrangeNameOrganizationsRequestData body, @QueryMap(encoded=true) NetrangeNameOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>netrangeNameOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetrangeNameOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/netrangeName/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetrangeNameOrganizationsResponseData> netrangeNameOrganizationsWithHttpInfo(@Param("elid") String elid, NetrangeNameOrganizationsRequestData body, @QueryMap(encoded=true) NetrangeNameOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netrangeNameOrganizations</code> method in a fluent style.
   */
  public static class NetrangeNameOrganizationsQueryParams extends HashMap<String, Object> {
    public NetrangeNameOrganizationsQueryParams sessionId(final String value) {
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
   * @return NetrangeNamePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetrangeNamePersonGroupsResponseData netrangeNamePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNamePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>netrangeNamePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetrangeNamePersonGroupsResponseData> netrangeNamePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNamePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>netrangeNamePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetrangeNamePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetrangeNamePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetrangeNamePersonGroupsResponseData netrangeNamePersonGroups(@Param("elid") String elid, NetrangeNamePersonGroupsRequestData body, @QueryMap(encoded=true) NetrangeNamePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>netrangeNamePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetrangeNamePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/netrangeName/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetrangeNamePersonGroupsResponseData> netrangeNamePersonGroupsWithHttpInfo(@Param("elid") String elid, NetrangeNamePersonGroupsRequestData body, @QueryMap(encoded=true) NetrangeNamePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netrangeNamePersonGroups</code> method in a fluent style.
   */
  public static class NetrangeNamePersonGroupsQueryParams extends HashMap<String, Object> {
    public NetrangeNamePersonGroupsQueryParams sessionId(final String value) {
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
   * @return NetrangeNamePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetrangeNamePersonsResponseData netrangeNamePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNamePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>netrangeNamePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetrangeNamePersonsResponseData> netrangeNamePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNamePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>netrangeNamePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetrangeNamePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetrangeNamePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetrangeNamePersonsResponseData netrangeNamePersons(@Param("elid") String elid, NetrangeNamePersonsRequestData body, @QueryMap(encoded=true) NetrangeNamePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>netrangeNamePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetrangeNamePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/netrangeName/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetrangeNamePersonsResponseData> netrangeNamePersonsWithHttpInfo(@Param("elid") String elid, NetrangeNamePersonsRequestData body, @QueryMap(encoded=true) NetrangeNamePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netrangeNamePersons</code> method in a fluent style.
   */
  public static class NetrangeNamePersonsQueryParams extends HashMap<String, Object> {
    public NetrangeNamePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NetrangeNameQueryResponse
   */
  @RequestLine("POST /api/rest/entity/netrangeName/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetrangeNameQueryResponse netrangeNameQuery(@Param("sessionId") String sessionId, NetrangeNameQueryRequest body);

  /**
   * Basic query
   * Similar to <code>netrangeNameQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netrangeName/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetrangeNameQueryResponse> netrangeNameQueryWithHttpInfo(@Param("sessionId") String sessionId, NetrangeNameQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>netrangeNameQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetrangeNameQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetrangeNameQueryResponse
   */
  @RequestLine("POST /api/rest/entity/netrangeName/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetrangeNameQueryResponse netrangeNameQuery(NetrangeNameQueryRequest body, @QueryMap(encoded=true) NetrangeNameQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>netrangeNameQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetrangeNameQueryResponse
      */
      @RequestLine("POST /api/rest/entity/netrangeName/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetrangeNameQueryResponse> netrangeNameQueryWithHttpInfo(NetrangeNameQueryRequest body, @QueryMap(encoded=true) NetrangeNameQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netrangeNameQuery</code> method in a fluent style.
   */
  public static class NetrangeNameQueryQueryParams extends HashMap<String, Object> {
    public NetrangeNameQueryQueryParams sessionId(final String value) {
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
   * @return NetrangeNameSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetrangeNameSystemAttributesResponse netrangeNameSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNameSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>netrangeNameSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetrangeNameSystemAttributesResponse> netrangeNameSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetrangeNameSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>netrangeNameSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetrangeNameSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetrangeNameSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetrangeNameSystemAttributesResponse netrangeNameSystemAttributes(@Param("elid") String elid, NetrangeNameSystemAttributesRequest body, @QueryMap(encoded=true) NetrangeNameSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>netrangeNameSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetrangeNameSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/netrangeName/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetrangeNameSystemAttributesResponse> netrangeNameSystemAttributesWithHttpInfo(@Param("elid") String elid, NetrangeNameSystemAttributesRequest body, @QueryMap(encoded=true) NetrangeNameSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netrangeNameSystemAttributes</code> method in a fluent style.
   */
  public static class NetrangeNameSystemAttributesQueryParams extends HashMap<String, Object> {
    public NetrangeNameSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify netrange name
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateNetrangeNameResponse
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateNetrangeNameResponse updateNetrangeName(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNetrangeNameRequestData body);

  /**
   * Modify
   * Similar to <code>updateNetrangeName</code> but it also returns the http response headers .
   * Modify netrange name
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateNetrangeNameResponse> updateNetrangeNameWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNetrangeNameRequestData body);


  /**
   * Modify
   * Modify netrange name
   * Note, this is equivalent to the other <code>updateNetrangeName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateNetrangeNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateNetrangeNameResponse
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateNetrangeNameResponse updateNetrangeName(@Param("elid") String elid, UpdateNetrangeNameRequestData body, @QueryMap(encoded=true) UpdateNetrangeNameQueryParams queryParams);

  /**
  * Modify
  * Modify netrange name
  * Note, this is equivalent to the other <code>updateNetrangeName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateNetrangeNameResponse
      */
      @RequestLine("POST /api/rest/entity/netrangeName/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateNetrangeNameResponse> updateNetrangeNameWithHttpInfo(@Param("elid") String elid, UpdateNetrangeNameRequestData body, @QueryMap(encoded=true) UpdateNetrangeNameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateNetrangeName</code> method in a fluent style.
   */
  public static class UpdateNetrangeNameQueryParams extends HashMap<String, Object> {
    public UpdateNetrangeNameQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesNetrangeNameResponse
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesNetrangeNameResponse updateSystemAttributesNetrangeName(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNetrangeNameRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesNetrangeName</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesNetrangeNameResponse> updateSystemAttributesNetrangeNameWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNetrangeNameRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesNetrangeName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesNetrangeNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesNetrangeNameResponse
   */
  @RequestLine("POST /api/rest/entity/netrangeName/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesNetrangeNameResponse updateSystemAttributesNetrangeName(@Param("elid") String elid, UpdateSystemAttributesNetrangeNameRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNetrangeNameQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesNetrangeName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesNetrangeNameResponse
      */
      @RequestLine("POST /api/rest/entity/netrangeName/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesNetrangeNameResponse> updateSystemAttributesNetrangeNameWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesNetrangeNameRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNetrangeNameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesNetrangeName</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesNetrangeNameQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesNetrangeNameQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
