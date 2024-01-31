package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateNetMandatorRequestData;
import com.fntsoftware.businessgateway.entities.CreateNetMandatorResponse;
import com.fntsoftware.businessgateway.entities.DeleteNetMandatorRequestData;
import com.fntsoftware.businessgateway.entities.DeleteNetMandatorResponse;
import com.fntsoftware.businessgateway.entities.NetMandatorContractsRequestData;
import com.fntsoftware.businessgateway.entities.NetMandatorContractsResponseData;
import com.fntsoftware.businessgateway.entities.NetMandatorFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.NetMandatorFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.NetMandatorMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.NetMandatorMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.NetMandatorOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.NetMandatorOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.NetMandatorPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.NetMandatorPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.NetMandatorPersonsRequestData;
import com.fntsoftware.businessgateway.entities.NetMandatorPersonsResponseData;
import com.fntsoftware.businessgateway.entities.NetMandatorQueryRequest;
import com.fntsoftware.businessgateway.entities.NetMandatorQueryResponse;
import com.fntsoftware.businessgateway.entities.NetMandatorSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.NetMandatorSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateNetMandatorRequestData;
import com.fntsoftware.businessgateway.entities.UpdateNetMandatorResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNetMandatorRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNetMandatorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface NetMandatorApi extends ApiClient.Api {


  /**
   * Create
   * Create net mandator
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateNetMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/netMandator/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateNetMandatorResponse createNetMandator(@Param("sessionId") String sessionId, CreateNetMandatorRequestData body);

  /**
   * Create
   * Similar to <code>createNetMandator</code> but it also returns the http response headers .
   * Create net mandator
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netMandator/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateNetMandatorResponse> createNetMandatorWithHttpInfo(@Param("sessionId") String sessionId, CreateNetMandatorRequestData body);


  /**
   * Create
   * Create net mandator
   * Note, this is equivalent to the other <code>createNetMandator</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateNetMandatorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateNetMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/netMandator/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateNetMandatorResponse createNetMandator(CreateNetMandatorRequestData body, @QueryMap(encoded=true) CreateNetMandatorQueryParams queryParams);

  /**
  * Create
  * Create net mandator
  * Note, this is equivalent to the other <code>createNetMandator</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateNetMandatorResponse
      */
      @RequestLine("POST /api/rest/entity/netMandator/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateNetMandatorResponse> createNetMandatorWithHttpInfo(CreateNetMandatorRequestData body, @QueryMap(encoded=true) CreateNetMandatorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createNetMandator</code> method in a fluent style.
   */
  public static class CreateNetMandatorQueryParams extends HashMap<String, Object> {
    public CreateNetMandatorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete net mandator
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteNetMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteNetMandatorResponse deleteNetMandator(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNetMandatorRequestData body);

  /**
   * Delete
   * Similar to <code>deleteNetMandator</code> but it also returns the http response headers .
   * Delete net mandator
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteNetMandatorResponse> deleteNetMandatorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNetMandatorRequestData body);


  /**
   * Delete
   * Delete net mandator
   * Note, this is equivalent to the other <code>deleteNetMandator</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteNetMandatorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteNetMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteNetMandatorResponse deleteNetMandator(@Param("elid") String elid, DeleteNetMandatorRequestData body, @QueryMap(encoded=true) DeleteNetMandatorQueryParams queryParams);

  /**
  * Delete
  * Delete net mandator
  * Note, this is equivalent to the other <code>deleteNetMandator</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteNetMandatorResponse
      */
      @RequestLine("POST /api/rest/entity/netMandator/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteNetMandatorResponse> deleteNetMandatorWithHttpInfo(@Param("elid") String elid, DeleteNetMandatorRequestData body, @QueryMap(encoded=true) DeleteNetMandatorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteNetMandator</code> method in a fluent style.
   */
  public static class DeleteNetMandatorQueryParams extends HashMap<String, Object> {
    public DeleteNetMandatorQueryParams sessionId(final String value) {
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
   * @return NetMandatorContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetMandatorContractsResponseData netMandatorContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>netMandatorContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetMandatorContractsResponseData> netMandatorContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>netMandatorContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetMandatorContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetMandatorContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetMandatorContractsResponseData netMandatorContracts(@Param("elid") String elid, NetMandatorContractsRequestData body, @QueryMap(encoded=true) NetMandatorContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>netMandatorContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetMandatorContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/netMandator/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetMandatorContractsResponseData> netMandatorContractsWithHttpInfo(@Param("elid") String elid, NetMandatorContractsRequestData body, @QueryMap(encoded=true) NetMandatorContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netMandatorContracts</code> method in a fluent style.
   */
  public static class NetMandatorContractsQueryParams extends HashMap<String, Object> {
    public NetMandatorContractsQueryParams sessionId(final String value) {
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
   * @return NetMandatorFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetMandatorFrameContractsResponseData netMandatorFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>netMandatorFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetMandatorFrameContractsResponseData> netMandatorFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>netMandatorFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetMandatorFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetMandatorFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetMandatorFrameContractsResponseData netMandatorFrameContracts(@Param("elid") String elid, NetMandatorFrameContractsRequestData body, @QueryMap(encoded=true) NetMandatorFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>netMandatorFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetMandatorFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/netMandator/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetMandatorFrameContractsResponseData> netMandatorFrameContractsWithHttpInfo(@Param("elid") String elid, NetMandatorFrameContractsRequestData body, @QueryMap(encoded=true) NetMandatorFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netMandatorFrameContracts</code> method in a fluent style.
   */
  public static class NetMandatorFrameContractsQueryParams extends HashMap<String, Object> {
    public NetMandatorFrameContractsQueryParams sessionId(final String value) {
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
   * @return NetMandatorMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetMandatorMaintenanceContractsResponseData netMandatorMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>netMandatorMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetMandatorMaintenanceContractsResponseData> netMandatorMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>netMandatorMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetMandatorMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetMandatorMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetMandatorMaintenanceContractsResponseData netMandatorMaintenanceContracts(@Param("elid") String elid, NetMandatorMaintenanceContractsRequestData body, @QueryMap(encoded=true) NetMandatorMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>netMandatorMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetMandatorMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/netMandator/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetMandatorMaintenanceContractsResponseData> netMandatorMaintenanceContractsWithHttpInfo(@Param("elid") String elid, NetMandatorMaintenanceContractsRequestData body, @QueryMap(encoded=true) NetMandatorMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netMandatorMaintenanceContracts</code> method in a fluent style.
   */
  public static class NetMandatorMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public NetMandatorMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return NetMandatorOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetMandatorOrganizationsResponseData netMandatorOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>netMandatorOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetMandatorOrganizationsResponseData> netMandatorOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>netMandatorOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetMandatorOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetMandatorOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetMandatorOrganizationsResponseData netMandatorOrganizations(@Param("elid") String elid, NetMandatorOrganizationsRequestData body, @QueryMap(encoded=true) NetMandatorOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>netMandatorOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetMandatorOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/netMandator/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetMandatorOrganizationsResponseData> netMandatorOrganizationsWithHttpInfo(@Param("elid") String elid, NetMandatorOrganizationsRequestData body, @QueryMap(encoded=true) NetMandatorOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netMandatorOrganizations</code> method in a fluent style.
   */
  public static class NetMandatorOrganizationsQueryParams extends HashMap<String, Object> {
    public NetMandatorOrganizationsQueryParams sessionId(final String value) {
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
   * @return NetMandatorPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetMandatorPersonGroupsResponseData netMandatorPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>netMandatorPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetMandatorPersonGroupsResponseData> netMandatorPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>netMandatorPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetMandatorPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetMandatorPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetMandatorPersonGroupsResponseData netMandatorPersonGroups(@Param("elid") String elid, NetMandatorPersonGroupsRequestData body, @QueryMap(encoded=true) NetMandatorPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>netMandatorPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetMandatorPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/netMandator/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetMandatorPersonGroupsResponseData> netMandatorPersonGroupsWithHttpInfo(@Param("elid") String elid, NetMandatorPersonGroupsRequestData body, @QueryMap(encoded=true) NetMandatorPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netMandatorPersonGroups</code> method in a fluent style.
   */
  public static class NetMandatorPersonGroupsQueryParams extends HashMap<String, Object> {
    public NetMandatorPersonGroupsQueryParams sessionId(final String value) {
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
   * @return NetMandatorPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetMandatorPersonsResponseData netMandatorPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>netMandatorPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetMandatorPersonsResponseData> netMandatorPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>netMandatorPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetMandatorPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetMandatorPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetMandatorPersonsResponseData netMandatorPersons(@Param("elid") String elid, NetMandatorPersonsRequestData body, @QueryMap(encoded=true) NetMandatorPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>netMandatorPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetMandatorPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/netMandator/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetMandatorPersonsResponseData> netMandatorPersonsWithHttpInfo(@Param("elid") String elid, NetMandatorPersonsRequestData body, @QueryMap(encoded=true) NetMandatorPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netMandatorPersons</code> method in a fluent style.
   */
  public static class NetMandatorPersonsQueryParams extends HashMap<String, Object> {
    public NetMandatorPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NetMandatorQueryResponse
   */
  @RequestLine("POST /api/rest/entity/netMandator/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetMandatorQueryResponse netMandatorQuery(@Param("sessionId") String sessionId, NetMandatorQueryRequest body);

  /**
   * Basic query
   * Similar to <code>netMandatorQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netMandator/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetMandatorQueryResponse> netMandatorQueryWithHttpInfo(@Param("sessionId") String sessionId, NetMandatorQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>netMandatorQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetMandatorQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetMandatorQueryResponse
   */
  @RequestLine("POST /api/rest/entity/netMandator/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetMandatorQueryResponse netMandatorQuery(NetMandatorQueryRequest body, @QueryMap(encoded=true) NetMandatorQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>netMandatorQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetMandatorQueryResponse
      */
      @RequestLine("POST /api/rest/entity/netMandator/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetMandatorQueryResponse> netMandatorQueryWithHttpInfo(NetMandatorQueryRequest body, @QueryMap(encoded=true) NetMandatorQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netMandatorQuery</code> method in a fluent style.
   */
  public static class NetMandatorQueryQueryParams extends HashMap<String, Object> {
    public NetMandatorQueryQueryParams sessionId(final String value) {
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
   * @return NetMandatorSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NetMandatorSystemAttributesResponse netMandatorSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>netMandatorSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NetMandatorSystemAttributesResponse> netMandatorSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NetMandatorSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>netMandatorSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NetMandatorSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NetMandatorSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NetMandatorSystemAttributesResponse netMandatorSystemAttributes(@Param("elid") String elid, NetMandatorSystemAttributesRequest body, @QueryMap(encoded=true) NetMandatorSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>netMandatorSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NetMandatorSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/netMandator/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NetMandatorSystemAttributesResponse> netMandatorSystemAttributesWithHttpInfo(@Param("elid") String elid, NetMandatorSystemAttributesRequest body, @QueryMap(encoded=true) NetMandatorSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>netMandatorSystemAttributes</code> method in a fluent style.
   */
  public static class NetMandatorSystemAttributesQueryParams extends HashMap<String, Object> {
    public NetMandatorSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify net mandator
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateNetMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateNetMandatorResponse updateNetMandator(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNetMandatorRequestData body);

  /**
   * Modify
   * Similar to <code>updateNetMandator</code> but it also returns the http response headers .
   * Modify net mandator
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateNetMandatorResponse> updateNetMandatorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNetMandatorRequestData body);


  /**
   * Modify
   * Modify net mandator
   * Note, this is equivalent to the other <code>updateNetMandator</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateNetMandatorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateNetMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateNetMandatorResponse updateNetMandator(@Param("elid") String elid, UpdateNetMandatorRequestData body, @QueryMap(encoded=true) UpdateNetMandatorQueryParams queryParams);

  /**
  * Modify
  * Modify net mandator
  * Note, this is equivalent to the other <code>updateNetMandator</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateNetMandatorResponse
      */
      @RequestLine("POST /api/rest/entity/netMandator/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateNetMandatorResponse> updateNetMandatorWithHttpInfo(@Param("elid") String elid, UpdateNetMandatorRequestData body, @QueryMap(encoded=true) UpdateNetMandatorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateNetMandator</code> method in a fluent style.
   */
  public static class UpdateNetMandatorQueryParams extends HashMap<String, Object> {
    public UpdateNetMandatorQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesNetMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesNetMandatorResponse updateSystemAttributesNetMandator(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNetMandatorRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesNetMandator</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesNetMandatorResponse> updateSystemAttributesNetMandatorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNetMandatorRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesNetMandator</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesNetMandatorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesNetMandatorResponse
   */
  @RequestLine("POST /api/rest/entity/netMandator/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesNetMandatorResponse updateSystemAttributesNetMandator(@Param("elid") String elid, UpdateSystemAttributesNetMandatorRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNetMandatorQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesNetMandator</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesNetMandatorResponse
      */
      @RequestLine("POST /api/rest/entity/netMandator/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesNetMandatorResponse> updateSystemAttributesNetMandatorWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesNetMandatorRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNetMandatorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesNetMandator</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesNetMandatorQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesNetMandatorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
