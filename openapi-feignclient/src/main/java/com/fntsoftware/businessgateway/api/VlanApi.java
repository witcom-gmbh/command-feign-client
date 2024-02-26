package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.DeleteVlanRequestData;
import com.fntsoftware.businessgateway.entities.DeleteVlanResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVlanRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesVlanResponse;
import com.fntsoftware.businessgateway.entities.UpdateVlanRequestData;
import com.fntsoftware.businessgateway.entities.UpdateVlanResponse;
import com.fntsoftware.businessgateway.entities.VlanContractsRequestData;
import com.fntsoftware.businessgateway.entities.VlanContractsResponseData;
import com.fntsoftware.businessgateway.entities.VlanCustomL2CpeSegmentRequestData;
import com.fntsoftware.businessgateway.entities.VlanCustomL2CpeSegmentResponseData;
import com.fntsoftware.businessgateway.entities.VlanCustomLogportRequestData;
import com.fntsoftware.businessgateway.entities.VlanCustomLogportResponseData;
import com.fntsoftware.businessgateway.entities.VlanDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.VlanDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.VlanFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.VlanFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.VlanIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.VlanIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.VlanMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.VlanMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.VlanObjectsRequest;
import com.fntsoftware.businessgateway.entities.VlanObjectsResponse;
import com.fntsoftware.businessgateway.entities.VlanOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.VlanOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.VlanPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.VlanPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.VlanPersonsRequestData;
import com.fntsoftware.businessgateway.entities.VlanPersonsResponseData;
import com.fntsoftware.businessgateway.entities.VlanPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.VlanPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.VlanQueryRequest;
import com.fntsoftware.businessgateway.entities.VlanQueryResponse;
import com.fntsoftware.businessgateway.entities.VlanSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.VlanSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.VlanVirtualClientsRequestData;
import com.fntsoftware.businessgateway.entities.VlanVirtualClientsResponseData;
import com.fntsoftware.businessgateway.entities.VlanVirtualNasServersRequestData;
import com.fntsoftware.businessgateway.entities.VlanVirtualNasServersResponseData;
import com.fntsoftware.businessgateway.entities.VlanVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.VlanVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.VlanVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.VlanVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.VlanVlanGroupsRequestData;
import com.fntsoftware.businessgateway.entities.VlanVlanGroupsResponseData;
import com.fntsoftware.businessgateway.entities.VlanVlanPoolRequestData;
import com.fntsoftware.businessgateway.entities.VlanVlanPoolResponseData;
import com.fntsoftware.businessgateway.entities.VlanZonesRequestData;
import com.fntsoftware.businessgateway.entities.VlanZonesResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface VlanApi extends ApiClient.Api {


  /**
   * Delete
   * Delete VLAN
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteVlanResponse
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteVlanResponse deleteVlan(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVlanRequestData body);

  /**
   * Delete
   * Similar to <code>deleteVlan</code> but it also returns the http response headers .
   * Delete VLAN
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteVlanResponse> deleteVlanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteVlanRequestData body);


  /**
   * Delete
   * Delete VLAN
   * Note, this is equivalent to the other <code>deleteVlan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteVlanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteVlanResponse
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteVlanResponse deleteVlan(@Param("elid") String elid, DeleteVlanRequestData body, @QueryMap(encoded=true) DeleteVlanQueryParams queryParams);

  /**
  * Delete
  * Delete VLAN
  * Note, this is equivalent to the other <code>deleteVlan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteVlanResponse
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteVlanResponse> deleteVlanWithHttpInfo(@Param("elid") String elid, DeleteVlanRequestData body, @QueryMap(encoded=true) DeleteVlanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteVlan</code> method in a fluent style.
   */
  public static class DeleteVlanQueryParams extends HashMap<String, Object> {
    public DeleteVlanQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesVlanResponse
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesVlanResponse updateSystemAttributesVlan(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVlanRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesVlan</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesVlanResponse> updateSystemAttributesVlanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesVlanRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesVlan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesVlanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesVlanResponse
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesVlanResponse updateSystemAttributesVlan(@Param("elid") String elid, UpdateSystemAttributesVlanRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVlanQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesVlan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesVlanResponse
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesVlanResponse> updateSystemAttributesVlanWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesVlanRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesVlanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesVlan</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesVlanQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesVlanQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify VLAN
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateVlanResponse
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateVlanResponse updateVlan(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVlanRequestData body);

  /**
   * Modify
   * Similar to <code>updateVlan</code> but it also returns the http response headers .
   * Modify VLAN
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateVlanResponse> updateVlanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateVlanRequestData body);


  /**
   * Modify
   * Modify VLAN
   * Note, this is equivalent to the other <code>updateVlan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateVlanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateVlanResponse
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateVlanResponse updateVlan(@Param("elid") String elid, UpdateVlanRequestData body, @QueryMap(encoded=true) UpdateVlanQueryParams queryParams);

  /**
  * Modify
  * Modify VLAN
  * Note, this is equivalent to the other <code>updateVlan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateVlanResponse
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateVlanResponse> updateVlanWithHttpInfo(@Param("elid") String elid, UpdateVlanRequestData body, @QueryMap(encoded=true) UpdateVlanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateVlan</code> method in a fluent style.
   */
  public static class UpdateVlanQueryParams extends HashMap<String, Object> {
    public UpdateVlanQueryParams sessionId(final String value) {
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
   * @return VlanContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanContractsResponseData vlanContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>vlanContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanContractsResponseData> vlanContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>vlanContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanContractsResponseData vlanContracts(@Param("elid") String elid, VlanContractsRequestData body, @QueryMap(encoded=true) VlanContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>vlanContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanContractsResponseData> vlanContractsWithHttpInfo(@Param("elid") String elid, VlanContractsRequestData body, @QueryMap(encoded=true) VlanContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanContracts</code> method in a fluent style.
   */
  public static class VlanContractsQueryParams extends HashMap<String, Object> {
    public VlanContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to L2-CPE Segment entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanCustomL2CpeSegmentResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanCustomL2CpeSegmentResponseData vlanCustomL2CpeSegment(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanCustomL2CpeSegmentRequestData body);

  /**
   * Get relations to L2-CPE Segment entities
   * Similar to <code>vlanCustomL2CpeSegment</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanCustomL2CpeSegmentResponseData> vlanCustomL2CpeSegmentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanCustomL2CpeSegmentRequestData body);


  /**
   * Get relations to L2-CPE Segment entities
   * 
   * Note, this is equivalent to the other <code>vlanCustomL2CpeSegment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanCustomL2CpeSegmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanCustomL2CpeSegmentResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanCustomL2CpeSegmentResponseData vlanCustomL2CpeSegment(@Param("elid") String elid, VlanCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) VlanCustomL2CpeSegmentQueryParams queryParams);

  /**
  * Get relations to L2-CPE Segment entities
  * 
  * Note, this is equivalent to the other <code>vlanCustomL2CpeSegment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanCustomL2CpeSegmentResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanCustomL2CpeSegmentResponseData> vlanCustomL2CpeSegmentWithHttpInfo(@Param("elid") String elid, VlanCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) VlanCustomL2CpeSegmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanCustomL2CpeSegment</code> method in a fluent style.
   */
  public static class VlanCustomL2CpeSegmentQueryParams extends HashMap<String, Object> {
    public VlanCustomL2CpeSegmentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Logical port entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanCustomLogportResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/CustomLogport?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanCustomLogportResponseData vlanCustomLogport(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanCustomLogportRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>vlanCustomLogport</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/CustomLogport?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanCustomLogportResponseData> vlanCustomLogportWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanCustomLogportRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>vlanCustomLogport</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanCustomLogportQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanCustomLogportResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/CustomLogport?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanCustomLogportResponseData vlanCustomLogport(@Param("elid") String elid, VlanCustomLogportRequestData body, @QueryMap(encoded=true) VlanCustomLogportQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>vlanCustomLogport</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanCustomLogportResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/CustomLogport?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanCustomLogportResponseData> vlanCustomLogportWithHttpInfo(@Param("elid") String elid, VlanCustomLogportRequestData body, @QueryMap(encoded=true) VlanCustomLogportQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanCustomLogport</code> method in a fluent style.
   */
  public static class VlanCustomLogportQueryParams extends HashMap<String, Object> {
    public VlanCustomLogportQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device (all) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanDevicesAllResponseData vlanDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>vlanDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanDevicesAllResponseData> vlanDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>vlanDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanDevicesAllResponseData vlanDevicesAll(@Param("elid") String elid, VlanDevicesAllRequestData body, @QueryMap(encoded=true) VlanDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>vlanDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanDevicesAllResponseData> vlanDevicesAllWithHttpInfo(@Param("elid") String elid, VlanDevicesAllRequestData body, @QueryMap(encoded=true) VlanDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanDevicesAll</code> method in a fluent style.
   */
  public static class VlanDevicesAllQueryParams extends HashMap<String, Object> {
    public VlanDevicesAllQueryParams sessionId(final String value) {
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
   * @return VlanFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanFrameContractsResponseData vlanFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>vlanFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanFrameContractsResponseData> vlanFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>vlanFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanFrameContractsResponseData vlanFrameContracts(@Param("elid") String elid, VlanFrameContractsRequestData body, @QueryMap(encoded=true) VlanFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>vlanFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanFrameContractsResponseData> vlanFrameContractsWithHttpInfo(@Param("elid") String elid, VlanFrameContractsRequestData body, @QueryMap(encoded=true) VlanFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanFrameContracts</code> method in a fluent style.
   */
  public static class VlanFrameContractsQueryParams extends HashMap<String, Object> {
    public VlanFrameContractsQueryParams sessionId(final String value) {
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
   * @return VlanIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanIpv4NetworksResponseData vlanIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>vlanIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanIpv4NetworksResponseData> vlanIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>vlanIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanIpv4NetworksResponseData vlanIpv4Networks(@Param("elid") String elid, VlanIpv4NetworksRequestData body, @QueryMap(encoded=true) VlanIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>vlanIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanIpv4NetworksResponseData> vlanIpv4NetworksWithHttpInfo(@Param("elid") String elid, VlanIpv4NetworksRequestData body, @QueryMap(encoded=true) VlanIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanIpv4Networks</code> method in a fluent style.
   */
  public static class VlanIpv4NetworksQueryParams extends HashMap<String, Object> {
    public VlanIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return VlanMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanMaintenanceContractsResponseData vlanMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>vlanMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanMaintenanceContractsResponseData> vlanMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>vlanMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanMaintenanceContractsResponseData vlanMaintenanceContracts(@Param("elid") String elid, VlanMaintenanceContractsRequestData body, @QueryMap(encoded=true) VlanMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>vlanMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanMaintenanceContractsResponseData> vlanMaintenanceContractsWithHttpInfo(@Param("elid") String elid, VlanMaintenanceContractsRequestData body, @QueryMap(encoded=true) VlanMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanMaintenanceContracts</code> method in a fluent style.
   */
  public static class VlanMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public VlanMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Objects
   * Query of the Objects
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanObjectsResponse vlanObjects(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanObjectsRequest body);

  /**
   * Query Objects
   * Similar to <code>vlanObjects</code> but it also returns the http response headers .
   * Query of the Objects
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanObjectsResponse> vlanObjectsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanObjectsRequest body);


  /**
   * Query Objects
   * Query of the Objects
   * Note, this is equivalent to the other <code>vlanObjects</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanObjectsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Objects?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanObjectsResponse vlanObjects(@Param("elid") String elid, VlanObjectsRequest body, @QueryMap(encoded=true) VlanObjectsQueryParams queryParams);

  /**
  * Query Objects
  * Query of the Objects
  * Note, this is equivalent to the other <code>vlanObjects</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanObjectsResponse
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/Objects?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanObjectsResponse> vlanObjectsWithHttpInfo(@Param("elid") String elid, VlanObjectsRequest body, @QueryMap(encoded=true) VlanObjectsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanObjects</code> method in a fluent style.
   */
  public static class VlanObjectsQueryParams extends HashMap<String, Object> {
    public VlanObjectsQueryParams sessionId(final String value) {
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
   * @return VlanOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanOrganizationsResponseData vlanOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>vlanOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanOrganizationsResponseData> vlanOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>vlanOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanOrganizationsResponseData vlanOrganizations(@Param("elid") String elid, VlanOrganizationsRequestData body, @QueryMap(encoded=true) VlanOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>vlanOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanOrganizationsResponseData> vlanOrganizationsWithHttpInfo(@Param("elid") String elid, VlanOrganizationsRequestData body, @QueryMap(encoded=true) VlanOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanOrganizations</code> method in a fluent style.
   */
  public static class VlanOrganizationsQueryParams extends HashMap<String, Object> {
    public VlanOrganizationsQueryParams sessionId(final String value) {
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
   * @return VlanPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPersonGroupsResponseData vlanPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>vlanPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPersonGroupsResponseData> vlanPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>vlanPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPersonGroupsResponseData vlanPersonGroups(@Param("elid") String elid, VlanPersonGroupsRequestData body, @QueryMap(encoded=true) VlanPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>vlanPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPersonGroupsResponseData> vlanPersonGroupsWithHttpInfo(@Param("elid") String elid, VlanPersonGroupsRequestData body, @QueryMap(encoded=true) VlanPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPersonGroups</code> method in a fluent style.
   */
  public static class VlanPersonGroupsQueryParams extends HashMap<String, Object> {
    public VlanPersonGroupsQueryParams sessionId(final String value) {
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
   * @return VlanPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPersonsResponseData vlanPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>vlanPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPersonsResponseData> vlanPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>vlanPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPersonsResponseData vlanPersons(@Param("elid") String elid, VlanPersonsRequestData body, @QueryMap(encoded=true) VlanPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>vlanPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPersonsResponseData> vlanPersonsWithHttpInfo(@Param("elid") String elid, VlanPersonsRequestData body, @QueryMap(encoded=true) VlanPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPersons</code> method in a fluent style.
   */
  public static class VlanPersonsQueryParams extends HashMap<String, Object> {
    public VlanPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Physical port (data) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanPhysicalPortsDataResponseData vlanPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>vlanPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanPhysicalPortsDataResponseData> vlanPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanPhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>vlanPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanPhysicalPortsDataResponseData vlanPhysicalPortsData(@Param("elid") String elid, VlanPhysicalPortsDataRequestData body, @QueryMap(encoded=true) VlanPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>vlanPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanPhysicalPortsDataResponseData> vlanPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, VlanPhysicalPortsDataRequestData body, @QueryMap(encoded=true) VlanPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanPhysicalPortsData</code> method in a fluent style.
   */
  public static class VlanPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public VlanPhysicalPortsDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return VlanQueryResponse
   */
  @RequestLine("POST /api/rest/entity/vlan/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanQueryResponse vlanQuery(@Param("sessionId") String sessionId, VlanQueryRequest body);

  /**
   * Basic query
   * Similar to <code>vlanQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanQueryResponse> vlanQueryWithHttpInfo(@Param("sessionId") String sessionId, VlanQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>vlanQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanQueryResponse
   */
  @RequestLine("POST /api/rest/entity/vlan/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanQueryResponse vlanQuery(VlanQueryRequest body, @QueryMap(encoded=true) VlanQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>vlanQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanQueryResponse
      */
      @RequestLine("POST /api/rest/entity/vlan/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanQueryResponse> vlanQueryWithHttpInfo(VlanQueryRequest body, @QueryMap(encoded=true) VlanQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanQuery</code> method in a fluent style.
   */
  public static class VlanQueryQueryParams extends HashMap<String, Object> {
    public VlanQueryQueryParams sessionId(final String value) {
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
   * @return VlanSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanSystemAttributesResponse vlanSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>vlanSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanSystemAttributesResponse> vlanSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>vlanSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanSystemAttributesResponse vlanSystemAttributes(@Param("elid") String elid, VlanSystemAttributesRequest body, @QueryMap(encoded=true) VlanSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>vlanSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanSystemAttributesResponse> vlanSystemAttributesWithHttpInfo(@Param("elid") String elid, VlanSystemAttributesRequest body, @QueryMap(encoded=true) VlanSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanSystemAttributes</code> method in a fluent style.
   */
  public static class VlanSystemAttributesQueryParams extends HashMap<String, Object> {
    public VlanSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual client entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanVirtualClientsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualClients?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanVirtualClientsResponseData vlanVirtualClients(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanVirtualClientsRequestData body);

  /**
   * Get relations to Virtual client entities
   * Similar to <code>vlanVirtualClients</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualClients?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanVirtualClientsResponseData> vlanVirtualClientsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanVirtualClientsRequestData body);


  /**
   * Get relations to Virtual client entities
   * 
   * Note, this is equivalent to the other <code>vlanVirtualClients</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanVirtualClientsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanVirtualClientsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualClients?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanVirtualClientsResponseData vlanVirtualClients(@Param("elid") String elid, VlanVirtualClientsRequestData body, @QueryMap(encoded=true) VlanVirtualClientsQueryParams queryParams);

  /**
  * Get relations to Virtual client entities
  * 
  * Note, this is equivalent to the other <code>vlanVirtualClients</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanVirtualClientsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualClients?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanVirtualClientsResponseData> vlanVirtualClientsWithHttpInfo(@Param("elid") String elid, VlanVirtualClientsRequestData body, @QueryMap(encoded=true) VlanVirtualClientsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanVirtualClients</code> method in a fluent style.
   */
  public static class VlanVirtualClientsQueryParams extends HashMap<String, Object> {
    public VlanVirtualClientsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual NAS server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanVirtualNasServersResponseData vlanVirtualNasServers(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanVirtualNasServersRequestData body);

  /**
   * Get relations to Virtual NAS server entities
   * Similar to <code>vlanVirtualNasServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanVirtualNasServersResponseData> vlanVirtualNasServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanVirtualNasServersRequestData body);


  /**
   * Get relations to Virtual NAS server entities
   * 
   * Note, this is equivalent to the other <code>vlanVirtualNasServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanVirtualNasServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanVirtualNasServersResponseData vlanVirtualNasServers(@Param("elid") String elid, VlanVirtualNasServersRequestData body, @QueryMap(encoded=true) VlanVirtualNasServersQueryParams queryParams);

  /**
  * Get relations to Virtual NAS server entities
  * 
  * Note, this is equivalent to the other <code>vlanVirtualNasServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanVirtualNasServersResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualNasServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanVirtualNasServersResponseData> vlanVirtualNasServersWithHttpInfo(@Param("elid") String elid, VlanVirtualNasServersRequestData body, @QueryMap(encoded=true) VlanVirtualNasServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanVirtualNasServers</code> method in a fluent style.
   */
  public static class VlanVirtualNasServersQueryParams extends HashMap<String, Object> {
    public VlanVirtualNasServersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanVirtualServersResponseData vlanVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>vlanVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanVirtualServersResponseData> vlanVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>vlanVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanVirtualServersResponseData vlanVirtualServers(@Param("elid") String elid, VlanVirtualServersRequestData body, @QueryMap(encoded=true) VlanVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>vlanVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanVirtualServersResponseData> vlanVirtualServersWithHttpInfo(@Param("elid") String elid, VlanVirtualServersRequestData body, @QueryMap(encoded=true) VlanVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanVirtualServers</code> method in a fluent style.
   */
  public static class VlanVirtualServersQueryParams extends HashMap<String, Object> {
    public VlanVirtualServersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual switch entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanVirtualSwitchesResponseData vlanVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>vlanVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanVirtualSwitchesResponseData> vlanVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>vlanVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanVirtualSwitchesResponseData vlanVirtualSwitches(@Param("elid") String elid, VlanVirtualSwitchesRequestData body, @QueryMap(encoded=true) VlanVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>vlanVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanVirtualSwitchesResponseData> vlanVirtualSwitchesWithHttpInfo(@Param("elid") String elid, VlanVirtualSwitchesRequestData body, @QueryMap(encoded=true) VlanVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanVirtualSwitches</code> method in a fluent style.
   */
  public static class VlanVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public VlanVirtualSwitchesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to VLAN group entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanVlanGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VlanGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanVlanGroupsResponseData vlanVlanGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanVlanGroupsRequestData body);

  /**
   * Get relations to VLAN group entities
   * Similar to <code>vlanVlanGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VlanGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanVlanGroupsResponseData> vlanVlanGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanVlanGroupsRequestData body);


  /**
   * Get relations to VLAN group entities
   * 
   * Note, this is equivalent to the other <code>vlanVlanGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanVlanGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanVlanGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VlanGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanVlanGroupsResponseData vlanVlanGroups(@Param("elid") String elid, VlanVlanGroupsRequestData body, @QueryMap(encoded=true) VlanVlanGroupsQueryParams queryParams);

  /**
  * Get relations to VLAN group entities
  * 
  * Note, this is equivalent to the other <code>vlanVlanGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanVlanGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/VlanGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanVlanGroupsResponseData> vlanVlanGroupsWithHttpInfo(@Param("elid") String elid, VlanVlanGroupsRequestData body, @QueryMap(encoded=true) VlanVlanGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanVlanGroups</code> method in a fluent style.
   */
  public static class VlanVlanGroupsQueryParams extends HashMap<String, Object> {
    public VlanVlanGroupsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to VLAN pool entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return VlanVlanPoolResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VlanPool?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanVlanPoolResponseData vlanVlanPool(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanVlanPoolRequestData body);

  /**
   * Get relations to VLAN pool entities
   * Similar to <code>vlanVlanPool</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VlanPool?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanVlanPoolResponseData> vlanVlanPoolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanVlanPoolRequestData body);


  /**
   * Get relations to VLAN pool entities
   * 
   * Note, this is equivalent to the other <code>vlanVlanPool</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanVlanPoolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanVlanPoolResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/VlanPool?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanVlanPoolResponseData vlanVlanPool(@Param("elid") String elid, VlanVlanPoolRequestData body, @QueryMap(encoded=true) VlanVlanPoolQueryParams queryParams);

  /**
  * Get relations to VLAN pool entities
  * 
  * Note, this is equivalent to the other <code>vlanVlanPool</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanVlanPoolResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/VlanPool?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanVlanPoolResponseData> vlanVlanPoolWithHttpInfo(@Param("elid") String elid, VlanVlanPoolRequestData body, @QueryMap(encoded=true) VlanVlanPoolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanVlanPool</code> method in a fluent style.
   */
  public static class VlanVlanPoolQueryParams extends HashMap<String, Object> {
    public VlanVlanPoolQueryParams sessionId(final String value) {
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
   * @return VlanZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  VlanZonesResponseData vlanZones(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanZonesRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>vlanZones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<VlanZonesResponseData> vlanZonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, VlanZonesRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>vlanZones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link VlanZonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return VlanZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/vlan/{elid}/Zones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  VlanZonesResponseData vlanZones(@Param("elid") String elid, VlanZonesRequestData body, @QueryMap(encoded=true) VlanZonesQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>vlanZones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return VlanZonesResponseData
      */
      @RequestLine("POST /api/rest/entity/vlan/{elid}/Zones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<VlanZonesResponseData> vlanZonesWithHttpInfo(@Param("elid") String elid, VlanZonesRequestData body, @QueryMap(encoded=true) VlanZonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>vlanZones</code> method in a fluent style.
   */
  public static class VlanZonesQueryParams extends HashMap<String, Object> {
    public VlanZonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
