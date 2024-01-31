package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSVlanRequestData;
import com.fntsoftware.businessgateway.entities.CreateSVlanResponse;
import com.fntsoftware.businessgateway.entities.DeleteSVlanRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSVlanResponse;
import com.fntsoftware.businessgateway.entities.SVlanCVlansChildRequestData;
import com.fntsoftware.businessgateway.entities.SVlanCVlansChildResponseData;
import com.fntsoftware.businessgateway.entities.SVlanContractsRequestData;
import com.fntsoftware.businessgateway.entities.SVlanContractsResponseData;
import com.fntsoftware.businessgateway.entities.SVlanCustomL2CpeSegmentRequestData;
import com.fntsoftware.businessgateway.entities.SVlanCustomL2CpeSegmentResponseData;
import com.fntsoftware.businessgateway.entities.SVlanCustomLogportRequestData;
import com.fntsoftware.businessgateway.entities.SVlanCustomLogportResponseData;
import com.fntsoftware.businessgateway.entities.SVlanDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.SVlanDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.SVlanFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SVlanFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SVlanIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.SVlanIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.SVlanMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.SVlanMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.SVlanObjectsRequest;
import com.fntsoftware.businessgateway.entities.SVlanObjectsResponse;
import com.fntsoftware.businessgateway.entities.SVlanOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SVlanOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SVlanPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SVlanPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SVlanPersonsRequestData;
import com.fntsoftware.businessgateway.entities.SVlanPersonsResponseData;
import com.fntsoftware.businessgateway.entities.SVlanPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.SVlanPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.SVlanQueryRequest;
import com.fntsoftware.businessgateway.entities.SVlanQueryResponse;
import com.fntsoftware.businessgateway.entities.SVlanSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SVlanSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.SVlanVirtualNasServersRequestData;
import com.fntsoftware.businessgateway.entities.SVlanVirtualNasServersResponseData;
import com.fntsoftware.businessgateway.entities.SVlanVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.SVlanVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.SVlanVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.SVlanVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.SVlanVlanGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SVlanVlanGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SVlanVlanPoolRequestData;
import com.fntsoftware.businessgateway.entities.SVlanVlanPoolResponseData;
import com.fntsoftware.businessgateway.entities.SVlanZonesRequestData;
import com.fntsoftware.businessgateway.entities.SVlanZonesResponseData;
import com.fntsoftware.businessgateway.entities.UpdateSVlanRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSVlanResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSVlanRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSVlanResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface SVlanApi extends ApiClient.Api {


  /**
   * Create
   * Create VLAN
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSVlanResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSVlanResponse createSVlan(@Param("sessionId") String sessionId, CreateSVlanRequestData body);

  /**
   * Create
   * Similar to <code>createSVlan</code> but it also returns the http response headers .
   * Create VLAN
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSVlanResponse> createSVlanWithHttpInfo(@Param("sessionId") String sessionId, CreateSVlanRequestData body);


  /**
   * Create
   * Create VLAN
   * Note, this is equivalent to the other <code>createSVlan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSVlanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSVlanResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSVlanResponse createSVlan(CreateSVlanRequestData body, @QueryMap(encoded=true) CreateSVlanQueryParams queryParams);

  /**
  * Create
  * Create VLAN
  * Note, this is equivalent to the other <code>createSVlan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSVlanResponse
      */
      @RequestLine("POST /api/rest/entity/sVlan/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSVlanResponse> createSVlanWithHttpInfo(CreateSVlanRequestData body, @QueryMap(encoded=true) CreateSVlanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSVlan</code> method in a fluent style.
   */
  public static class CreateSVlanQueryParams extends HashMap<String, Object> {
    public CreateSVlanQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete VLAN
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSVlanResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSVlanResponse deleteSVlan(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSVlanRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSVlan</code> but it also returns the http response headers .
   * Delete VLAN
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSVlanResponse> deleteSVlanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSVlanRequestData body);


  /**
   * Delete
   * Delete VLAN
   * Note, this is equivalent to the other <code>deleteSVlan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSVlanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSVlanResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSVlanResponse deleteSVlan(@Param("elid") String elid, DeleteSVlanRequestData body, @QueryMap(encoded=true) DeleteSVlanQueryParams queryParams);

  /**
  * Delete
  * Delete VLAN
  * Note, this is equivalent to the other <code>deleteSVlan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSVlanResponse
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSVlanResponse> deleteSVlanWithHttpInfo(@Param("elid") String elid, DeleteSVlanRequestData body, @QueryMap(encoded=true) DeleteSVlanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSVlan</code> method in a fluent style.
   */
  public static class DeleteSVlanQueryParams extends HashMap<String, Object> {
    public DeleteSVlanQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to C-VLAN (child) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SVlanCVlansChildResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/CVlansChild?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanCVlansChildResponseData sVlanCVlansChild(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanCVlansChildRequestData body);

  /**
   * Get relations to C-VLAN (child) entities
   * Similar to <code>sVlanCVlansChild</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/CVlansChild?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanCVlansChildResponseData> sVlanCVlansChildWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanCVlansChildRequestData body);


  /**
   * Get relations to C-VLAN (child) entities
   * 
   * Note, this is equivalent to the other <code>sVlanCVlansChild</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanCVlansChildQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanCVlansChildResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/CVlansChild?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanCVlansChildResponseData sVlanCVlansChild(@Param("elid") String elid, SVlanCVlansChildRequestData body, @QueryMap(encoded=true) SVlanCVlansChildQueryParams queryParams);

  /**
  * Get relations to C-VLAN (child) entities
  * 
  * Note, this is equivalent to the other <code>sVlanCVlansChild</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanCVlansChildResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/CVlansChild?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanCVlansChildResponseData> sVlanCVlansChildWithHttpInfo(@Param("elid") String elid, SVlanCVlansChildRequestData body, @QueryMap(encoded=true) SVlanCVlansChildQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanCVlansChild</code> method in a fluent style.
   */
  public static class SVlanCVlansChildQueryParams extends HashMap<String, Object> {
    public SVlanCVlansChildQueryParams sessionId(final String value) {
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
   * @return SVlanContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanContractsResponseData sVlanContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>sVlanContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanContractsResponseData> sVlanContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>sVlanContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanContractsResponseData sVlanContracts(@Param("elid") String elid, SVlanContractsRequestData body, @QueryMap(encoded=true) SVlanContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>sVlanContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanContractsResponseData> sVlanContractsWithHttpInfo(@Param("elid") String elid, SVlanContractsRequestData body, @QueryMap(encoded=true) SVlanContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanContracts</code> method in a fluent style.
   */
  public static class SVlanContractsQueryParams extends HashMap<String, Object> {
    public SVlanContractsQueryParams sessionId(final String value) {
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
   * @return SVlanCustomL2CpeSegmentResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanCustomL2CpeSegmentResponseData sVlanCustomL2CpeSegment(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanCustomL2CpeSegmentRequestData body);

  /**
   * Get relations to L2-CPE Segment entities
   * Similar to <code>sVlanCustomL2CpeSegment</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanCustomL2CpeSegmentResponseData> sVlanCustomL2CpeSegmentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanCustomL2CpeSegmentRequestData body);


  /**
   * Get relations to L2-CPE Segment entities
   * 
   * Note, this is equivalent to the other <code>sVlanCustomL2CpeSegment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanCustomL2CpeSegmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanCustomL2CpeSegmentResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanCustomL2CpeSegmentResponseData sVlanCustomL2CpeSegment(@Param("elid") String elid, SVlanCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) SVlanCustomL2CpeSegmentQueryParams queryParams);

  /**
  * Get relations to L2-CPE Segment entities
  * 
  * Note, this is equivalent to the other <code>sVlanCustomL2CpeSegment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanCustomL2CpeSegmentResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanCustomL2CpeSegmentResponseData> sVlanCustomL2CpeSegmentWithHttpInfo(@Param("elid") String elid, SVlanCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) SVlanCustomL2CpeSegmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanCustomL2CpeSegment</code> method in a fluent style.
   */
  public static class SVlanCustomL2CpeSegmentQueryParams extends HashMap<String, Object> {
    public SVlanCustomL2CpeSegmentQueryParams sessionId(final String value) {
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
   * @return SVlanCustomLogportResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/CustomLogport?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanCustomLogportResponseData sVlanCustomLogport(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanCustomLogportRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>sVlanCustomLogport</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/CustomLogport?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanCustomLogportResponseData> sVlanCustomLogportWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanCustomLogportRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>sVlanCustomLogport</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanCustomLogportQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanCustomLogportResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/CustomLogport?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanCustomLogportResponseData sVlanCustomLogport(@Param("elid") String elid, SVlanCustomLogportRequestData body, @QueryMap(encoded=true) SVlanCustomLogportQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>sVlanCustomLogport</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanCustomLogportResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/CustomLogport?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanCustomLogportResponseData> sVlanCustomLogportWithHttpInfo(@Param("elid") String elid, SVlanCustomLogportRequestData body, @QueryMap(encoded=true) SVlanCustomLogportQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanCustomLogport</code> method in a fluent style.
   */
  public static class SVlanCustomLogportQueryParams extends HashMap<String, Object> {
    public SVlanCustomLogportQueryParams sessionId(final String value) {
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
   * @return SVlanDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanDevicesAllResponseData sVlanDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>sVlanDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanDevicesAllResponseData> sVlanDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>sVlanDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanDevicesAllResponseData sVlanDevicesAll(@Param("elid") String elid, SVlanDevicesAllRequestData body, @QueryMap(encoded=true) SVlanDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>sVlanDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanDevicesAllResponseData> sVlanDevicesAllWithHttpInfo(@Param("elid") String elid, SVlanDevicesAllRequestData body, @QueryMap(encoded=true) SVlanDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanDevicesAll</code> method in a fluent style.
   */
  public static class SVlanDevicesAllQueryParams extends HashMap<String, Object> {
    public SVlanDevicesAllQueryParams sessionId(final String value) {
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
   * @return SVlanFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanFrameContractsResponseData sVlanFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>sVlanFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanFrameContractsResponseData> sVlanFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>sVlanFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanFrameContractsResponseData sVlanFrameContracts(@Param("elid") String elid, SVlanFrameContractsRequestData body, @QueryMap(encoded=true) SVlanFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>sVlanFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanFrameContractsResponseData> sVlanFrameContractsWithHttpInfo(@Param("elid") String elid, SVlanFrameContractsRequestData body, @QueryMap(encoded=true) SVlanFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanFrameContracts</code> method in a fluent style.
   */
  public static class SVlanFrameContractsQueryParams extends HashMap<String, Object> {
    public SVlanFrameContractsQueryParams sessionId(final String value) {
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
   * @return SVlanIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanIpv4NetworksResponseData sVlanIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>sVlanIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanIpv4NetworksResponseData> sVlanIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>sVlanIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanIpv4NetworksResponseData sVlanIpv4Networks(@Param("elid") String elid, SVlanIpv4NetworksRequestData body, @QueryMap(encoded=true) SVlanIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>sVlanIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanIpv4NetworksResponseData> sVlanIpv4NetworksWithHttpInfo(@Param("elid") String elid, SVlanIpv4NetworksRequestData body, @QueryMap(encoded=true) SVlanIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanIpv4Networks</code> method in a fluent style.
   */
  public static class SVlanIpv4NetworksQueryParams extends HashMap<String, Object> {
    public SVlanIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return SVlanMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanMaintenanceContractsResponseData sVlanMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>sVlanMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanMaintenanceContractsResponseData> sVlanMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>sVlanMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanMaintenanceContractsResponseData sVlanMaintenanceContracts(@Param("elid") String elid, SVlanMaintenanceContractsRequestData body, @QueryMap(encoded=true) SVlanMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>sVlanMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanMaintenanceContractsResponseData> sVlanMaintenanceContractsWithHttpInfo(@Param("elid") String elid, SVlanMaintenanceContractsRequestData body, @QueryMap(encoded=true) SVlanMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanMaintenanceContracts</code> method in a fluent style.
   */
  public static class SVlanMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public SVlanMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return SVlanObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanObjectsResponse sVlanObjects(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanObjectsRequest body);

  /**
   * Query Objects
   * Similar to <code>sVlanObjects</code> but it also returns the http response headers .
   * Query of the Objects
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanObjectsResponse> sVlanObjectsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanObjectsRequest body);


  /**
   * Query Objects
   * Query of the Objects
   * Note, this is equivalent to the other <code>sVlanObjects</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanObjectsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Objects?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanObjectsResponse sVlanObjects(@Param("elid") String elid, SVlanObjectsRequest body, @QueryMap(encoded=true) SVlanObjectsQueryParams queryParams);

  /**
  * Query Objects
  * Query of the Objects
  * Note, this is equivalent to the other <code>sVlanObjects</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanObjectsResponse
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/Objects?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanObjectsResponse> sVlanObjectsWithHttpInfo(@Param("elid") String elid, SVlanObjectsRequest body, @QueryMap(encoded=true) SVlanObjectsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanObjects</code> method in a fluent style.
   */
  public static class SVlanObjectsQueryParams extends HashMap<String, Object> {
    public SVlanObjectsQueryParams sessionId(final String value) {
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
   * @return SVlanOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanOrganizationsResponseData sVlanOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>sVlanOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanOrganizationsResponseData> sVlanOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>sVlanOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanOrganizationsResponseData sVlanOrganizations(@Param("elid") String elid, SVlanOrganizationsRequestData body, @QueryMap(encoded=true) SVlanOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>sVlanOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanOrganizationsResponseData> sVlanOrganizationsWithHttpInfo(@Param("elid") String elid, SVlanOrganizationsRequestData body, @QueryMap(encoded=true) SVlanOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanOrganizations</code> method in a fluent style.
   */
  public static class SVlanOrganizationsQueryParams extends HashMap<String, Object> {
    public SVlanOrganizationsQueryParams sessionId(final String value) {
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
   * @return SVlanPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanPersonGroupsResponseData sVlanPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>sVlanPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanPersonGroupsResponseData> sVlanPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>sVlanPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanPersonGroupsResponseData sVlanPersonGroups(@Param("elid") String elid, SVlanPersonGroupsRequestData body, @QueryMap(encoded=true) SVlanPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>sVlanPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanPersonGroupsResponseData> sVlanPersonGroupsWithHttpInfo(@Param("elid") String elid, SVlanPersonGroupsRequestData body, @QueryMap(encoded=true) SVlanPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanPersonGroups</code> method in a fluent style.
   */
  public static class SVlanPersonGroupsQueryParams extends HashMap<String, Object> {
    public SVlanPersonGroupsQueryParams sessionId(final String value) {
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
   * @return SVlanPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanPersonsResponseData sVlanPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>sVlanPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanPersonsResponseData> sVlanPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>sVlanPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanPersonsResponseData sVlanPersons(@Param("elid") String elid, SVlanPersonsRequestData body, @QueryMap(encoded=true) SVlanPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>sVlanPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanPersonsResponseData> sVlanPersonsWithHttpInfo(@Param("elid") String elid, SVlanPersonsRequestData body, @QueryMap(encoded=true) SVlanPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanPersons</code> method in a fluent style.
   */
  public static class SVlanPersonsQueryParams extends HashMap<String, Object> {
    public SVlanPersonsQueryParams sessionId(final String value) {
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
   * @return SVlanPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanPhysicalPortsDataResponseData sVlanPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanPhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>sVlanPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanPhysicalPortsDataResponseData> sVlanPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanPhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>sVlanPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanPhysicalPortsDataResponseData sVlanPhysicalPortsData(@Param("elid") String elid, SVlanPhysicalPortsDataRequestData body, @QueryMap(encoded=true) SVlanPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>sVlanPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanPhysicalPortsDataResponseData> sVlanPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, SVlanPhysicalPortsDataRequestData body, @QueryMap(encoded=true) SVlanPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanPhysicalPortsData</code> method in a fluent style.
   */
  public static class SVlanPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public SVlanPhysicalPortsDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SVlanQueryResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanQueryResponse sVlanQuery(@Param("sessionId") String sessionId, SVlanQueryRequest body);

  /**
   * Basic query
   * Similar to <code>sVlanQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanQueryResponse> sVlanQueryWithHttpInfo(@Param("sessionId") String sessionId, SVlanQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>sVlanQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanQueryResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanQueryResponse sVlanQuery(SVlanQueryRequest body, @QueryMap(encoded=true) SVlanQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>sVlanQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanQueryResponse
      */
      @RequestLine("POST /api/rest/entity/sVlan/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanQueryResponse> sVlanQueryWithHttpInfo(SVlanQueryRequest body, @QueryMap(encoded=true) SVlanQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanQuery</code> method in a fluent style.
   */
  public static class SVlanQueryQueryParams extends HashMap<String, Object> {
    public SVlanQueryQueryParams sessionId(final String value) {
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
   * @return SVlanSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanSystemAttributesResponse sVlanSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>sVlanSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanSystemAttributesResponse> sVlanSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>sVlanSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanSystemAttributesResponse sVlanSystemAttributes(@Param("elid") String elid, SVlanSystemAttributesRequest body, @QueryMap(encoded=true) SVlanSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>sVlanSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanSystemAttributesResponse> sVlanSystemAttributesWithHttpInfo(@Param("elid") String elid, SVlanSystemAttributesRequest body, @QueryMap(encoded=true) SVlanSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanSystemAttributes</code> method in a fluent style.
   */
  public static class SVlanSystemAttributesQueryParams extends HashMap<String, Object> {
    public SVlanSystemAttributesQueryParams sessionId(final String value) {
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
   * @return SVlanVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanVirtualNasServersResponseData sVlanVirtualNasServers(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanVirtualNasServersRequestData body);

  /**
   * Get relations to Virtual NAS server entities
   * Similar to <code>sVlanVirtualNasServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanVirtualNasServersResponseData> sVlanVirtualNasServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanVirtualNasServersRequestData body);


  /**
   * Get relations to Virtual NAS server entities
   * 
   * Note, this is equivalent to the other <code>sVlanVirtualNasServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanVirtualNasServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanVirtualNasServersResponseData sVlanVirtualNasServers(@Param("elid") String elid, SVlanVirtualNasServersRequestData body, @QueryMap(encoded=true) SVlanVirtualNasServersQueryParams queryParams);

  /**
  * Get relations to Virtual NAS server entities
  * 
  * Note, this is equivalent to the other <code>sVlanVirtualNasServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanVirtualNasServersResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/VirtualNasServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanVirtualNasServersResponseData> sVlanVirtualNasServersWithHttpInfo(@Param("elid") String elid, SVlanVirtualNasServersRequestData body, @QueryMap(encoded=true) SVlanVirtualNasServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanVirtualNasServers</code> method in a fluent style.
   */
  public static class SVlanVirtualNasServersQueryParams extends HashMap<String, Object> {
    public SVlanVirtualNasServersQueryParams sessionId(final String value) {
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
   * @return SVlanVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanVirtualServersResponseData sVlanVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>sVlanVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanVirtualServersResponseData> sVlanVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>sVlanVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanVirtualServersResponseData sVlanVirtualServers(@Param("elid") String elid, SVlanVirtualServersRequestData body, @QueryMap(encoded=true) SVlanVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>sVlanVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanVirtualServersResponseData> sVlanVirtualServersWithHttpInfo(@Param("elid") String elid, SVlanVirtualServersRequestData body, @QueryMap(encoded=true) SVlanVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanVirtualServers</code> method in a fluent style.
   */
  public static class SVlanVirtualServersQueryParams extends HashMap<String, Object> {
    public SVlanVirtualServersQueryParams sessionId(final String value) {
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
   * @return SVlanVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanVirtualSwitchesResponseData sVlanVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>sVlanVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanVirtualSwitchesResponseData> sVlanVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>sVlanVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanVirtualSwitchesResponseData sVlanVirtualSwitches(@Param("elid") String elid, SVlanVirtualSwitchesRequestData body, @QueryMap(encoded=true) SVlanVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>sVlanVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanVirtualSwitchesResponseData> sVlanVirtualSwitchesWithHttpInfo(@Param("elid") String elid, SVlanVirtualSwitchesRequestData body, @QueryMap(encoded=true) SVlanVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanVirtualSwitches</code> method in a fluent style.
   */
  public static class SVlanVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public SVlanVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return SVlanVlanGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VlanGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanVlanGroupsResponseData sVlanVlanGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanVlanGroupsRequestData body);

  /**
   * Get relations to VLAN group entities
   * Similar to <code>sVlanVlanGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VlanGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanVlanGroupsResponseData> sVlanVlanGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanVlanGroupsRequestData body);


  /**
   * Get relations to VLAN group entities
   * 
   * Note, this is equivalent to the other <code>sVlanVlanGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanVlanGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanVlanGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VlanGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanVlanGroupsResponseData sVlanVlanGroups(@Param("elid") String elid, SVlanVlanGroupsRequestData body, @QueryMap(encoded=true) SVlanVlanGroupsQueryParams queryParams);

  /**
  * Get relations to VLAN group entities
  * 
  * Note, this is equivalent to the other <code>sVlanVlanGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanVlanGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/VlanGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanVlanGroupsResponseData> sVlanVlanGroupsWithHttpInfo(@Param("elid") String elid, SVlanVlanGroupsRequestData body, @QueryMap(encoded=true) SVlanVlanGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanVlanGroups</code> method in a fluent style.
   */
  public static class SVlanVlanGroupsQueryParams extends HashMap<String, Object> {
    public SVlanVlanGroupsQueryParams sessionId(final String value) {
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
   * @return SVlanVlanPoolResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VlanPool?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanVlanPoolResponseData sVlanVlanPool(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanVlanPoolRequestData body);

  /**
   * Get relations to VLAN pool entities
   * Similar to <code>sVlanVlanPool</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VlanPool?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanVlanPoolResponseData> sVlanVlanPoolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanVlanPoolRequestData body);


  /**
   * Get relations to VLAN pool entities
   * 
   * Note, this is equivalent to the other <code>sVlanVlanPool</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanVlanPoolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanVlanPoolResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/VlanPool?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanVlanPoolResponseData sVlanVlanPool(@Param("elid") String elid, SVlanVlanPoolRequestData body, @QueryMap(encoded=true) SVlanVlanPoolQueryParams queryParams);

  /**
  * Get relations to VLAN pool entities
  * 
  * Note, this is equivalent to the other <code>sVlanVlanPool</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanVlanPoolResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/VlanPool?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanVlanPoolResponseData> sVlanVlanPoolWithHttpInfo(@Param("elid") String elid, SVlanVlanPoolRequestData body, @QueryMap(encoded=true) SVlanVlanPoolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanVlanPool</code> method in a fluent style.
   */
  public static class SVlanVlanPoolQueryParams extends HashMap<String, Object> {
    public SVlanVlanPoolQueryParams sessionId(final String value) {
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
   * @return SVlanZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SVlanZonesResponseData sVlanZones(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanZonesRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>sVlanZones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SVlanZonesResponseData> sVlanZonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SVlanZonesRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>sVlanZones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SVlanZonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SVlanZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/Zones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SVlanZonesResponseData sVlanZones(@Param("elid") String elid, SVlanZonesRequestData body, @QueryMap(encoded=true) SVlanZonesQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>sVlanZones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SVlanZonesResponseData
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/Zones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SVlanZonesResponseData> sVlanZonesWithHttpInfo(@Param("elid") String elid, SVlanZonesRequestData body, @QueryMap(encoded=true) SVlanZonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sVlanZones</code> method in a fluent style.
   */
  public static class SVlanZonesQueryParams extends HashMap<String, Object> {
    public SVlanZonesQueryParams sessionId(final String value) {
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
   * @return UpdateSVlanResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSVlanResponse updateSVlan(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSVlanRequestData body);

  /**
   * Modify
   * Similar to <code>updateSVlan</code> but it also returns the http response headers .
   * Modify VLAN
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSVlanResponse> updateSVlanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSVlanRequestData body);


  /**
   * Modify
   * Modify VLAN
   * Note, this is equivalent to the other <code>updateSVlan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSVlanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSVlanResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSVlanResponse updateSVlan(@Param("elid") String elid, UpdateSVlanRequestData body, @QueryMap(encoded=true) UpdateSVlanQueryParams queryParams);

  /**
  * Modify
  * Modify VLAN
  * Note, this is equivalent to the other <code>updateSVlan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSVlanResponse
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSVlanResponse> updateSVlanWithHttpInfo(@Param("elid") String elid, UpdateSVlanRequestData body, @QueryMap(encoded=true) UpdateSVlanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSVlan</code> method in a fluent style.
   */
  public static class UpdateSVlanQueryParams extends HashMap<String, Object> {
    public UpdateSVlanQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSVlanResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSVlanResponse updateSystemAttributesSVlan(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSVlanRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSVlan</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSVlanResponse> updateSystemAttributesSVlanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSVlanRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSVlan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSVlanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSVlanResponse
   */
  @RequestLine("POST /api/rest/entity/sVlan/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSVlanResponse updateSystemAttributesSVlan(@Param("elid") String elid, UpdateSystemAttributesSVlanRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSVlanQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSVlan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSVlanResponse
      */
      @RequestLine("POST /api/rest/entity/sVlan/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSVlanResponse> updateSystemAttributesSVlanWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSVlanRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSVlanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSVlan</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSVlanQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSVlanQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
