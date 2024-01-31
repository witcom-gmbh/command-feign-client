package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateVlanGroupRequestData;
import com.fntsoftware.businessgateway.entities.CreateVlanGroupResponse;
import com.fntsoftware.businessgateway.entities.DeleteVlanGroupRequestData;
import com.fntsoftware.businessgateway.entities.DeleteVlanGroupResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVlanGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVlanGroupResponse;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanGroupResponse;
import com.fntsoftware.businessgateway.entities.VlanGroupContractsRequestData;
import com.fntsoftware.businessgateway.entities.VlanGroupContractsResponseData;
import com.fntsoftware.businessgateway.entities.VlanGroupFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.VlanGroupFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.VlanGroupMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.VlanGroupMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.VlanGroupOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.VlanGroupOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.VlanGroupPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.VlanGroupPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.VlanGroupPersonsRequestData;
import com.fntsoftware.businessgateway.entities.VlanGroupPersonsResponseData;
import com.fntsoftware.businessgateway.entities.VlanGroupQueryRequest;
import com.fntsoftware.businessgateway.entities.VlanGroupQueryResponse;
import com.fntsoftware.businessgateway.entities.VlanGroupSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.VlanGroupSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.VlanGroupVlansRequestData;
import com.fntsoftware.businessgateway.entities.VlanGroupVlansResponseData;
import com.fntsoftware.businessgateway.entities.VlanGroupZonesRequestData;
import com.fntsoftware.businessgateway.entities.VlanGroupZonesResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface VlanGroupApi extends ApiClient.Api {


  /**
   * Create
   * Create VLAN group
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateVlanGroupResponse
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateVlanGroupResponse createVlanGroup(@Param("sessionId") String sessionId, CreateVlanGroupRequestData body);

  /**
   * Create
   * Similar to <code>createVlanGroup</code> but it also returns the http response headers .
   * Create VLAN group
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateVlanGroupResponse> createVlanGroupWithHttpInfo(@Param("sessionId") String sessionId, CreateVlanGroupRequestData body);


  /**
   * Create
   * Create VLAN group
   * Note, this is equivalent to the other <code>createVlanGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateVlanGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateVlanGroupResponse
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateVlanGroupResponse createVlanGroup(CreateVlanGroupRequestData body, @QueryMap(encoded=true) CreateVlanGroupQueryParams queryParams);

  /**
  * Create
  * Create VLAN group
  * Note, this is equivalent to the other <code>createVlanGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateVlanGroupResponse
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateVlanGroupResponse> createVlanGroupWithHttpInfo(CreateVlanGroupRequestData body, @QueryMap(encoded=true) CreateVlanGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createVlanGroup</code> method in a fluent style.
   */
  public static class CreateVlanGroupQueryParams extends HashMap<String, Object> {
    public CreateVlanGroupQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete VLAN group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteVlanGroupResponse
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteVlanGroupResponse deleteVlanGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVlanGroupRequestData body);

  /**
   * Delete
   * Similar to <code>deleteVlanGroup</code> but it also returns the http response headers .
   * Delete VLAN group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteVlanGroupResponse> deleteVlanGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVlanGroupRequestData body);


  /**
   * Delete
   * Delete VLAN group
   * Note, this is equivalent to the other <code>deleteVlanGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteVlanGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteVlanGroupResponse
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteVlanGroupResponse deleteVlanGroup(@Param("elid") String elid, DeleteVlanGroupRequestData body, @QueryMap(encoded=true) DeleteVlanGroupQueryParams queryParams);

  /**
  * Delete
  * Delete VLAN group
  * Note, this is equivalent to the other <code>deleteVlanGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteVlanGroupResponse
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteVlanGroupResponse> deleteVlanGroupWithHttpInfo(@Param("elid") String elid, DeleteVlanGroupRequestData body, @QueryMap(encoded=true) DeleteVlanGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteVlanGroup</code> method in a fluent style.
   */
  public static class DeleteVlanGroupQueryParams extends HashMap<String, Object> {
    public DeleteVlanGroupQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesVlanGroupResponse
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesVlanGroupResponse updateSystemAttributesVlanGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVlanGroupRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesVlanGroup</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesVlanGroupResponse> updateSystemAttributesVlanGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVlanGroupRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesVlanGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesVlanGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesVlanGroupResponse
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesVlanGroupResponse updateSystemAttributesVlanGroup(@Param("elid") String elid, UpdateSystemAttributesVlanGroupRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVlanGroupQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesVlanGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesVlanGroupResponse
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesVlanGroupResponse> updateSystemAttributesVlanGroupWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesVlanGroupRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVlanGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesVlanGroup</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesVlanGroupQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesVlanGroupQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify VLAN group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateVlanGroupResponse
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateVlanGroupResponse updateVlanGroup(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVlanGroupRequestData body);

  /**
   * Modify
   * Similar to <code>updateVlanGroup</code> but it also returns the http response headers .
   * Modify VLAN group
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateVlanGroupResponse> updateVlanGroupWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVlanGroupRequestData body);


  /**
   * Modify
   * Modify VLAN group
   * Note, this is equivalent to the other <code>updateVlanGroup</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateVlanGroupQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateVlanGroupResponse
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateVlanGroupResponse updateVlanGroup(@Param("elid") String elid, UpdateVlanGroupRequestData body, @QueryMap(encoded=true) UpdateVlanGroupQueryParams queryParams);

  /**
  * Modify
  * Modify VLAN group
  * Note, this is equivalent to the other <code>updateVlanGroup</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateVlanGroupResponse
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateVlanGroupResponse> updateVlanGroupWithHttpInfo(@Param("elid") String elid, UpdateVlanGroupRequestData body, @QueryMap(encoded=true) UpdateVlanGroupQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateVlanGroup</code> method in a fluent style.
   */
  public static class UpdateVlanGroupQueryParams extends HashMap<String, Object> {
    public UpdateVlanGroupQueryParams sessionId(final String value) {
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
   * @return VlanGroupContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanGroupContractsResponseData vlanGroupContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>vlanGroupContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanGroupContractsResponseData> vlanGroupContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>vlanGroupContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanGroupContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanGroupContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanGroupContractsResponseData vlanGroupContracts(@Param("elid") String elid, VlanGroupContractsRequestData body, @QueryMap(encoded=true) VlanGroupContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>vlanGroupContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanGroupContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanGroupContractsResponseData> vlanGroupContractsWithHttpInfo(@Param("elid") String elid, VlanGroupContractsRequestData body, @QueryMap(encoded=true) VlanGroupContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanGroupContracts</code> method in a fluent style.
   */
  public static class VlanGroupContractsQueryParams extends HashMap<String, Object> {
    public VlanGroupContractsQueryParams sessionId(final String value) {
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
   * @return VlanGroupFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanGroupFrameContractsResponseData vlanGroupFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>vlanGroupFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanGroupFrameContractsResponseData> vlanGroupFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>vlanGroupFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanGroupFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanGroupFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanGroupFrameContractsResponseData vlanGroupFrameContracts(@Param("elid") String elid, VlanGroupFrameContractsRequestData body, @QueryMap(encoded=true) VlanGroupFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>vlanGroupFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanGroupFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanGroupFrameContractsResponseData> vlanGroupFrameContractsWithHttpInfo(@Param("elid") String elid, VlanGroupFrameContractsRequestData body, @QueryMap(encoded=true) VlanGroupFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanGroupFrameContracts</code> method in a fluent style.
   */
  public static class VlanGroupFrameContractsQueryParams extends HashMap<String, Object> {
    public VlanGroupFrameContractsQueryParams sessionId(final String value) {
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
   * @return VlanGroupMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanGroupMaintenanceContractsResponseData vlanGroupMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>vlanGroupMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanGroupMaintenanceContractsResponseData> vlanGroupMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>vlanGroupMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanGroupMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanGroupMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanGroupMaintenanceContractsResponseData vlanGroupMaintenanceContracts(@Param("elid") String elid, VlanGroupMaintenanceContractsRequestData body, @QueryMap(encoded=true) VlanGroupMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>vlanGroupMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanGroupMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanGroupMaintenanceContractsResponseData> vlanGroupMaintenanceContractsWithHttpInfo(@Param("elid") String elid, VlanGroupMaintenanceContractsRequestData body, @QueryMap(encoded=true) VlanGroupMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanGroupMaintenanceContracts</code> method in a fluent style.
   */
  public static class VlanGroupMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public VlanGroupMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return VlanGroupOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanGroupOrganizationsResponseData vlanGroupOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>vlanGroupOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanGroupOrganizationsResponseData> vlanGroupOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>vlanGroupOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanGroupOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanGroupOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanGroupOrganizationsResponseData vlanGroupOrganizations(@Param("elid") String elid, VlanGroupOrganizationsRequestData body, @QueryMap(encoded=true) VlanGroupOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>vlanGroupOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanGroupOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanGroupOrganizationsResponseData> vlanGroupOrganizationsWithHttpInfo(@Param("elid") String elid, VlanGroupOrganizationsRequestData body, @QueryMap(encoded=true) VlanGroupOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanGroupOrganizations</code> method in a fluent style.
   */
  public static class VlanGroupOrganizationsQueryParams extends HashMap<String, Object> {
    public VlanGroupOrganizationsQueryParams sessionId(final String value) {
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
   * @return VlanGroupPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanGroupPersonGroupsResponseData vlanGroupPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>vlanGroupPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanGroupPersonGroupsResponseData> vlanGroupPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>vlanGroupPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanGroupPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanGroupPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanGroupPersonGroupsResponseData vlanGroupPersonGroups(@Param("elid") String elid, VlanGroupPersonGroupsRequestData body, @QueryMap(encoded=true) VlanGroupPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>vlanGroupPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanGroupPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanGroupPersonGroupsResponseData> vlanGroupPersonGroupsWithHttpInfo(@Param("elid") String elid, VlanGroupPersonGroupsRequestData body, @QueryMap(encoded=true) VlanGroupPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanGroupPersonGroups</code> method in a fluent style.
   */
  public static class VlanGroupPersonGroupsQueryParams extends HashMap<String, Object> {
    public VlanGroupPersonGroupsQueryParams sessionId(final String value) {
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
   * @return VlanGroupPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanGroupPersonsResponseData vlanGroupPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>vlanGroupPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanGroupPersonsResponseData> vlanGroupPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>vlanGroupPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanGroupPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanGroupPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanGroupPersonsResponseData vlanGroupPersons(@Param("elid") String elid, VlanGroupPersonsRequestData body, @QueryMap(encoded=true) VlanGroupPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>vlanGroupPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanGroupPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanGroupPersonsResponseData> vlanGroupPersonsWithHttpInfo(@Param("elid") String elid, VlanGroupPersonsRequestData body, @QueryMap(encoded=true) VlanGroupPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanGroupPersons</code> method in a fluent style.
   */
  public static class VlanGroupPersonsQueryParams extends HashMap<String, Object> {
    public VlanGroupPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return VlanGroupQueryResponse
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanGroupQueryResponse vlanGroupQuery(@Param("sessionId") String sessionId, VlanGroupQueryRequest body);

  /**
   * Basic query
   * Similar to <code>vlanGroupQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanGroupQueryResponse> vlanGroupQueryWithHttpInfo(@Param("sessionId") String sessionId, VlanGroupQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>vlanGroupQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanGroupQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanGroupQueryResponse
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanGroupQueryResponse vlanGroupQuery(VlanGroupQueryRequest body, @QueryMap(encoded=true) VlanGroupQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>vlanGroupQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanGroupQueryResponse
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanGroupQueryResponse> vlanGroupQueryWithHttpInfo(VlanGroupQueryRequest body, @QueryMap(encoded=true) VlanGroupQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanGroupQuery</code> method in a fluent style.
   */
  public static class VlanGroupQueryQueryParams extends HashMap<String, Object> {
    public VlanGroupQueryQueryParams sessionId(final String value) {
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
   * @return VlanGroupSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanGroupSystemAttributesResponse vlanGroupSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>vlanGroupSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanGroupSystemAttributesResponse> vlanGroupSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>vlanGroupSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanGroupSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanGroupSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanGroupSystemAttributesResponse vlanGroupSystemAttributes(@Param("elid") String elid, VlanGroupSystemAttributesRequest body, @QueryMap(encoded=true) VlanGroupSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>vlanGroupSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanGroupSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanGroupSystemAttributesResponse> vlanGroupSystemAttributesWithHttpInfo(@Param("elid") String elid, VlanGroupSystemAttributesRequest body, @QueryMap(encoded=true) VlanGroupSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanGroupSystemAttributes</code> method in a fluent style.
   */
  public static class VlanGroupSystemAttributesQueryParams extends HashMap<String, Object> {
    public VlanGroupSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to VLAN entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanGroupVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanGroupVlansResponseData vlanGroupVlans(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupVlansRequestData body);

  /**
   * Get relations to VLAN entities
   * Similar to <code>vlanGroupVlans</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanGroupVlansResponseData> vlanGroupVlansWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupVlansRequestData body);


  /**
   * Get relations to VLAN entities
   * 
   * Note, this is equivalent to the other <code>vlanGroupVlans</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanGroupVlansQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanGroupVlansResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Vlans?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanGroupVlansResponseData vlanGroupVlans(@Param("elid") String elid, VlanGroupVlansRequestData body, @QueryMap(encoded=true) VlanGroupVlansQueryParams queryParams);

  /**
  * Get relations to VLAN entities
  * 
  * Note, this is equivalent to the other <code>vlanGroupVlans</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanGroupVlansResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Vlans?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanGroupVlansResponseData> vlanGroupVlansWithHttpInfo(@Param("elid") String elid, VlanGroupVlansRequestData body, @QueryMap(encoded=true) VlanGroupVlansQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanGroupVlans</code> method in a fluent style.
   */
  public static class VlanGroupVlansQueryParams extends HashMap<String, Object> {
    public VlanGroupVlansQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Zone entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanGroupZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanGroupZonesResponseData vlanGroupZones(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupZonesRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>vlanGroupZones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanGroupZonesResponseData> vlanGroupZonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanGroupZonesRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>vlanGroupZones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanGroupZonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanGroupZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Zones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanGroupZonesResponseData vlanGroupZones(@Param("elid") String elid, VlanGroupZonesRequestData body, @QueryMap(encoded=true) VlanGroupZonesQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>vlanGroupZones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanGroupZonesResponseData
      */
      @RequestLine("POST /api/rest/entity/vlanGroup/{elid}/Zones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanGroupZonesResponseData> vlanGroupZonesWithHttpInfo(@Param("elid") String elid, VlanGroupZonesRequestData body, @QueryMap(encoded=true) VlanGroupZonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanGroupZones</code> method in a fluent style.
   */
  public static class VlanGroupZonesQueryParams extends HashMap<String, Object> {
    public VlanGroupZonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
