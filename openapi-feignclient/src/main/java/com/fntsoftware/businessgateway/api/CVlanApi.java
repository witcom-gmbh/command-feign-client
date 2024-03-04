package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CVlanContractsRequestData;
import com.fntsoftware.businessgateway.entities.CVlanContractsResponseData;
import com.fntsoftware.businessgateway.entities.CVlanCustomL2CpeSegmentRequestData;
import com.fntsoftware.businessgateway.entities.CVlanCustomL2CpeSegmentResponseData;
import com.fntsoftware.businessgateway.entities.CVlanCustomLogportRequestData;
import com.fntsoftware.businessgateway.entities.CVlanCustomLogportResponseData;
import com.fntsoftware.businessgateway.entities.CVlanDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.CVlanDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.CVlanFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.CVlanFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.CVlanIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.CVlanIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.CVlanMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.CVlanMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.CVlanObjectsRequest;
import com.fntsoftware.businessgateway.entities.CVlanObjectsResponse;
import com.fntsoftware.businessgateway.entities.CVlanOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.CVlanOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.CVlanPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.CVlanPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.CVlanPersonsRequestData;
import com.fntsoftware.businessgateway.entities.CVlanPersonsResponseData;
import com.fntsoftware.businessgateway.entities.CVlanPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.CVlanPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.CVlanQueryRequest;
import com.fntsoftware.businessgateway.entities.CVlanQueryResponse;
import com.fntsoftware.businessgateway.entities.CVlanSVlanParentRequestData;
import com.fntsoftware.businessgateway.entities.CVlanSVlanParentResponseData;
import com.fntsoftware.businessgateway.entities.CVlanSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CVlanSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CVlanVirtualNasServersRequestData;
import com.fntsoftware.businessgateway.entities.CVlanVirtualNasServersResponseData;
import com.fntsoftware.businessgateway.entities.CVlanVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.CVlanVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.CVlanVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.CVlanVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.CVlanVlanGroupsRequestData;
import com.fntsoftware.businessgateway.entities.CVlanVlanGroupsResponseData;
import com.fntsoftware.businessgateway.entities.CVlanVlanPoolRequestData;
import com.fntsoftware.businessgateway.entities.CVlanVlanPoolResponseData;
import com.fntsoftware.businessgateway.entities.CVlanZonesRequestData;
import com.fntsoftware.businessgateway.entities.CVlanZonesResponseData;
import com.fntsoftware.businessgateway.entities.CreateCVlanRequestData;
import com.fntsoftware.businessgateway.entities.CreateCVlanResponse;
import com.fntsoftware.businessgateway.entities.DeleteCVlanRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCVlanResponse;
import com.fntsoftware.businessgateway.entities.UpdateCVlanRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCVlanResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCVlanRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCVlanResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface CVlanApi extends ApiClient.Api {


  /**
   * Get relations to Contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CVlanContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanContractsResponseData cVlanContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>cVlanContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanContractsResponseData> cVlanContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>cVlanContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanContractsResponseData cVlanContracts(@Param("elid") String elid, CVlanContractsRequestData body, @QueryMap(encoded=true) CVlanContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>cVlanContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanContractsResponseData> cVlanContractsWithHttpInfo(@Param("elid") String elid, CVlanContractsRequestData body, @QueryMap(encoded=true) CVlanContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanContracts</code> method in a fluent style.
   */
  public static class CVlanContractsQueryParams extends HashMap<String, Object> {
    public CVlanContractsQueryParams sessionId(final String value) {
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
   * @return CVlanCustomL2CpeSegmentResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanCustomL2CpeSegmentResponseData cVlanCustomL2CpeSegment(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanCustomL2CpeSegmentRequestData body);

  /**
   * Get relations to L2-CPE Segment entities
   * Similar to <code>cVlanCustomL2CpeSegment</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanCustomL2CpeSegmentResponseData> cVlanCustomL2CpeSegmentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanCustomL2CpeSegmentRequestData body);


  /**
   * Get relations to L2-CPE Segment entities
   * 
   * Note, this is equivalent to the other <code>cVlanCustomL2CpeSegment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanCustomL2CpeSegmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanCustomL2CpeSegmentResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanCustomL2CpeSegmentResponseData cVlanCustomL2CpeSegment(@Param("elid") String elid, CVlanCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) CVlanCustomL2CpeSegmentQueryParams queryParams);

  /**
  * Get relations to L2-CPE Segment entities
  * 
  * Note, this is equivalent to the other <code>cVlanCustomL2CpeSegment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanCustomL2CpeSegmentResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanCustomL2CpeSegmentResponseData> cVlanCustomL2CpeSegmentWithHttpInfo(@Param("elid") String elid, CVlanCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) CVlanCustomL2CpeSegmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanCustomL2CpeSegment</code> method in a fluent style.
   */
  public static class CVlanCustomL2CpeSegmentQueryParams extends HashMap<String, Object> {
    public CVlanCustomL2CpeSegmentQueryParams sessionId(final String value) {
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
   * @return CVlanCustomLogportResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/CustomLogport?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanCustomLogportResponseData cVlanCustomLogport(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanCustomLogportRequestData body);

  /**
   * Get relations to Logical port entities
   * Similar to <code>cVlanCustomLogport</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/CustomLogport?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanCustomLogportResponseData> cVlanCustomLogportWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanCustomLogportRequestData body);


  /**
   * Get relations to Logical port entities
   * 
   * Note, this is equivalent to the other <code>cVlanCustomLogport</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanCustomLogportQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanCustomLogportResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/CustomLogport?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanCustomLogportResponseData cVlanCustomLogport(@Param("elid") String elid, CVlanCustomLogportRequestData body, @QueryMap(encoded=true) CVlanCustomLogportQueryParams queryParams);

  /**
  * Get relations to Logical port entities
  * 
  * Note, this is equivalent to the other <code>cVlanCustomLogport</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanCustomLogportResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/CustomLogport?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanCustomLogportResponseData> cVlanCustomLogportWithHttpInfo(@Param("elid") String elid, CVlanCustomLogportRequestData body, @QueryMap(encoded=true) CVlanCustomLogportQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanCustomLogport</code> method in a fluent style.
   */
  public static class CVlanCustomLogportQueryParams extends HashMap<String, Object> {
    public CVlanCustomLogportQueryParams sessionId(final String value) {
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
   * @return CVlanDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanDevicesAllResponseData cVlanDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>cVlanDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanDevicesAllResponseData> cVlanDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>cVlanDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanDevicesAllResponseData cVlanDevicesAll(@Param("elid") String elid, CVlanDevicesAllRequestData body, @QueryMap(encoded=true) CVlanDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>cVlanDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanDevicesAllResponseData> cVlanDevicesAllWithHttpInfo(@Param("elid") String elid, CVlanDevicesAllRequestData body, @QueryMap(encoded=true) CVlanDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanDevicesAll</code> method in a fluent style.
   */
  public static class CVlanDevicesAllQueryParams extends HashMap<String, Object> {
    public CVlanDevicesAllQueryParams sessionId(final String value) {
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
   * @return CVlanFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanFrameContractsResponseData cVlanFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>cVlanFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanFrameContractsResponseData> cVlanFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>cVlanFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanFrameContractsResponseData cVlanFrameContracts(@Param("elid") String elid, CVlanFrameContractsRequestData body, @QueryMap(encoded=true) CVlanFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>cVlanFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanFrameContractsResponseData> cVlanFrameContractsWithHttpInfo(@Param("elid") String elid, CVlanFrameContractsRequestData body, @QueryMap(encoded=true) CVlanFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanFrameContracts</code> method in a fluent style.
   */
  public static class CVlanFrameContractsQueryParams extends HashMap<String, Object> {
    public CVlanFrameContractsQueryParams sessionId(final String value) {
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
   * @return CVlanIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanIpv4NetworksResponseData cVlanIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>cVlanIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanIpv4NetworksResponseData> cVlanIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>cVlanIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanIpv4NetworksResponseData cVlanIpv4Networks(@Param("elid") String elid, CVlanIpv4NetworksRequestData body, @QueryMap(encoded=true) CVlanIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>cVlanIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanIpv4NetworksResponseData> cVlanIpv4NetworksWithHttpInfo(@Param("elid") String elid, CVlanIpv4NetworksRequestData body, @QueryMap(encoded=true) CVlanIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanIpv4Networks</code> method in a fluent style.
   */
  public static class CVlanIpv4NetworksQueryParams extends HashMap<String, Object> {
    public CVlanIpv4NetworksQueryParams sessionId(final String value) {
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
   * @return CVlanMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanMaintenanceContractsResponseData cVlanMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>cVlanMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanMaintenanceContractsResponseData> cVlanMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>cVlanMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanMaintenanceContractsResponseData cVlanMaintenanceContracts(@Param("elid") String elid, CVlanMaintenanceContractsRequestData body, @QueryMap(encoded=true) CVlanMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>cVlanMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanMaintenanceContractsResponseData> cVlanMaintenanceContractsWithHttpInfo(@Param("elid") String elid, CVlanMaintenanceContractsRequestData body, @QueryMap(encoded=true) CVlanMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanMaintenanceContracts</code> method in a fluent style.
   */
  public static class CVlanMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public CVlanMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return CVlanObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanObjectsResponse cVlanObjects(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanObjectsRequest body);

  /**
   * Query Objects
   * Similar to <code>cVlanObjects</code> but it also returns the http response headers .
   * Query of the Objects
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanObjectsResponse> cVlanObjectsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanObjectsRequest body);


  /**
   * Query Objects
   * Query of the Objects
   * Note, this is equivalent to the other <code>cVlanObjects</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanObjectsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Objects?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanObjectsResponse cVlanObjects(@Param("elid") String elid, CVlanObjectsRequest body, @QueryMap(encoded=true) CVlanObjectsQueryParams queryParams);

  /**
  * Query Objects
  * Query of the Objects
  * Note, this is equivalent to the other <code>cVlanObjects</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanObjectsResponse
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/Objects?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanObjectsResponse> cVlanObjectsWithHttpInfo(@Param("elid") String elid, CVlanObjectsRequest body, @QueryMap(encoded=true) CVlanObjectsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanObjects</code> method in a fluent style.
   */
  public static class CVlanObjectsQueryParams extends HashMap<String, Object> {
    public CVlanObjectsQueryParams sessionId(final String value) {
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
   * @return CVlanOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanOrganizationsResponseData cVlanOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>cVlanOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanOrganizationsResponseData> cVlanOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>cVlanOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanOrganizationsResponseData cVlanOrganizations(@Param("elid") String elid, CVlanOrganizationsRequestData body, @QueryMap(encoded=true) CVlanOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>cVlanOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanOrganizationsResponseData> cVlanOrganizationsWithHttpInfo(@Param("elid") String elid, CVlanOrganizationsRequestData body, @QueryMap(encoded=true) CVlanOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanOrganizations</code> method in a fluent style.
   */
  public static class CVlanOrganizationsQueryParams extends HashMap<String, Object> {
    public CVlanOrganizationsQueryParams sessionId(final String value) {
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
   * @return CVlanPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanPersonGroupsResponseData cVlanPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>cVlanPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanPersonGroupsResponseData> cVlanPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>cVlanPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanPersonGroupsResponseData cVlanPersonGroups(@Param("elid") String elid, CVlanPersonGroupsRequestData body, @QueryMap(encoded=true) CVlanPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>cVlanPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanPersonGroupsResponseData> cVlanPersonGroupsWithHttpInfo(@Param("elid") String elid, CVlanPersonGroupsRequestData body, @QueryMap(encoded=true) CVlanPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanPersonGroups</code> method in a fluent style.
   */
  public static class CVlanPersonGroupsQueryParams extends HashMap<String, Object> {
    public CVlanPersonGroupsQueryParams sessionId(final String value) {
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
   * @return CVlanPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanPersonsResponseData cVlanPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>cVlanPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanPersonsResponseData> cVlanPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>cVlanPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanPersonsResponseData cVlanPersons(@Param("elid") String elid, CVlanPersonsRequestData body, @QueryMap(encoded=true) CVlanPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>cVlanPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanPersonsResponseData> cVlanPersonsWithHttpInfo(@Param("elid") String elid, CVlanPersonsRequestData body, @QueryMap(encoded=true) CVlanPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanPersons</code> method in a fluent style.
   */
  public static class CVlanPersonsQueryParams extends HashMap<String, Object> {
    public CVlanPersonsQueryParams sessionId(final String value) {
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
   * @return CVlanPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanPhysicalPortsDataResponseData cVlanPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanPhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>cVlanPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanPhysicalPortsDataResponseData> cVlanPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanPhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>cVlanPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanPhysicalPortsDataResponseData cVlanPhysicalPortsData(@Param("elid") String elid, CVlanPhysicalPortsDataRequestData body, @QueryMap(encoded=true) CVlanPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>cVlanPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanPhysicalPortsDataResponseData> cVlanPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, CVlanPhysicalPortsDataRequestData body, @QueryMap(encoded=true) CVlanPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanPhysicalPortsData</code> method in a fluent style.
   */
  public static class CVlanPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public CVlanPhysicalPortsDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CVlanQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanQueryResponse cVlanQuery(@Param("sessionId") String sessionId, CVlanQueryRequest body);

  /**
   * Basic query
   * Similar to <code>cVlanQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanQueryResponse> cVlanQueryWithHttpInfo(@Param("sessionId") String sessionId, CVlanQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>cVlanQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanQueryResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanQueryResponse cVlanQuery(CVlanQueryRequest body, @QueryMap(encoded=true) CVlanQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>cVlanQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanQueryResponse
      */
      @RequestLine("POST /api/rest/entity/cVlan/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanQueryResponse> cVlanQueryWithHttpInfo(CVlanQueryRequest body, @QueryMap(encoded=true) CVlanQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanQuery</code> method in a fluent style.
   */
  public static class CVlanQueryQueryParams extends HashMap<String, Object> {
    public CVlanQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to S-VLAN (parent) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CVlanSVlanParentResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/SVlanParent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanSVlanParentResponseData cVlanSVlanParent(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanSVlanParentRequestData body);

  /**
   * Get relations to S-VLAN (parent) entities
   * Similar to <code>cVlanSVlanParent</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/SVlanParent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanSVlanParentResponseData> cVlanSVlanParentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanSVlanParentRequestData body);


  /**
   * Get relations to S-VLAN (parent) entities
   * 
   * Note, this is equivalent to the other <code>cVlanSVlanParent</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanSVlanParentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanSVlanParentResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/SVlanParent?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanSVlanParentResponseData cVlanSVlanParent(@Param("elid") String elid, CVlanSVlanParentRequestData body, @QueryMap(encoded=true) CVlanSVlanParentQueryParams queryParams);

  /**
  * Get relations to S-VLAN (parent) entities
  * 
  * Note, this is equivalent to the other <code>cVlanSVlanParent</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanSVlanParentResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/SVlanParent?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanSVlanParentResponseData> cVlanSVlanParentWithHttpInfo(@Param("elid") String elid, CVlanSVlanParentRequestData body, @QueryMap(encoded=true) CVlanSVlanParentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanSVlanParent</code> method in a fluent style.
   */
  public static class CVlanSVlanParentQueryParams extends HashMap<String, Object> {
    public CVlanSVlanParentQueryParams sessionId(final String value) {
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
   * @return CVlanSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanSystemAttributesResponse cVlanSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>cVlanSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanSystemAttributesResponse> cVlanSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>cVlanSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanSystemAttributesResponse cVlanSystemAttributes(@Param("elid") String elid, CVlanSystemAttributesRequest body, @QueryMap(encoded=true) CVlanSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>cVlanSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanSystemAttributesResponse> cVlanSystemAttributesWithHttpInfo(@Param("elid") String elid, CVlanSystemAttributesRequest body, @QueryMap(encoded=true) CVlanSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanSystemAttributes</code> method in a fluent style.
   */
  public static class CVlanSystemAttributesQueryParams extends HashMap<String, Object> {
    public CVlanSystemAttributesQueryParams sessionId(final String value) {
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
   * @return CVlanVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanVirtualNasServersResponseData cVlanVirtualNasServers(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanVirtualNasServersRequestData body);

  /**
   * Get relations to Virtual NAS server entities
   * Similar to <code>cVlanVirtualNasServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanVirtualNasServersResponseData> cVlanVirtualNasServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanVirtualNasServersRequestData body);


  /**
   * Get relations to Virtual NAS server entities
   * 
   * Note, this is equivalent to the other <code>cVlanVirtualNasServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanVirtualNasServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanVirtualNasServersResponseData cVlanVirtualNasServers(@Param("elid") String elid, CVlanVirtualNasServersRequestData body, @QueryMap(encoded=true) CVlanVirtualNasServersQueryParams queryParams);

  /**
  * Get relations to Virtual NAS server entities
  * 
  * Note, this is equivalent to the other <code>cVlanVirtualNasServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanVirtualNasServersResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/VirtualNasServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanVirtualNasServersResponseData> cVlanVirtualNasServersWithHttpInfo(@Param("elid") String elid, CVlanVirtualNasServersRequestData body, @QueryMap(encoded=true) CVlanVirtualNasServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanVirtualNasServers</code> method in a fluent style.
   */
  public static class CVlanVirtualNasServersQueryParams extends HashMap<String, Object> {
    public CVlanVirtualNasServersQueryParams sessionId(final String value) {
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
   * @return CVlanVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanVirtualServersResponseData cVlanVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>cVlanVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanVirtualServersResponseData> cVlanVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>cVlanVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanVirtualServersResponseData cVlanVirtualServers(@Param("elid") String elid, CVlanVirtualServersRequestData body, @QueryMap(encoded=true) CVlanVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>cVlanVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanVirtualServersResponseData> cVlanVirtualServersWithHttpInfo(@Param("elid") String elid, CVlanVirtualServersRequestData body, @QueryMap(encoded=true) CVlanVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanVirtualServers</code> method in a fluent style.
   */
  public static class CVlanVirtualServersQueryParams extends HashMap<String, Object> {
    public CVlanVirtualServersQueryParams sessionId(final String value) {
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
   * @return CVlanVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanVirtualSwitchesResponseData cVlanVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>cVlanVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanVirtualSwitchesResponseData> cVlanVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>cVlanVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanVirtualSwitchesResponseData cVlanVirtualSwitches(@Param("elid") String elid, CVlanVirtualSwitchesRequestData body, @QueryMap(encoded=true) CVlanVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>cVlanVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanVirtualSwitchesResponseData> cVlanVirtualSwitchesWithHttpInfo(@Param("elid") String elid, CVlanVirtualSwitchesRequestData body, @QueryMap(encoded=true) CVlanVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanVirtualSwitches</code> method in a fluent style.
   */
  public static class CVlanVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public CVlanVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return CVlanVlanGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VlanGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanVlanGroupsResponseData cVlanVlanGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanVlanGroupsRequestData body);

  /**
   * Get relations to VLAN group entities
   * Similar to <code>cVlanVlanGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VlanGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanVlanGroupsResponseData> cVlanVlanGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanVlanGroupsRequestData body);


  /**
   * Get relations to VLAN group entities
   * 
   * Note, this is equivalent to the other <code>cVlanVlanGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanVlanGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanVlanGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VlanGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanVlanGroupsResponseData cVlanVlanGroups(@Param("elid") String elid, CVlanVlanGroupsRequestData body, @QueryMap(encoded=true) CVlanVlanGroupsQueryParams queryParams);

  /**
  * Get relations to VLAN group entities
  * 
  * Note, this is equivalent to the other <code>cVlanVlanGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanVlanGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/VlanGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanVlanGroupsResponseData> cVlanVlanGroupsWithHttpInfo(@Param("elid") String elid, CVlanVlanGroupsRequestData body, @QueryMap(encoded=true) CVlanVlanGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanVlanGroups</code> method in a fluent style.
   */
  public static class CVlanVlanGroupsQueryParams extends HashMap<String, Object> {
    public CVlanVlanGroupsQueryParams sessionId(final String value) {
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
   * @return CVlanVlanPoolResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VlanPool?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanVlanPoolResponseData cVlanVlanPool(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanVlanPoolRequestData body);

  /**
   * Get relations to VLAN pool entities
   * Similar to <code>cVlanVlanPool</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VlanPool?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanVlanPoolResponseData> cVlanVlanPoolWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanVlanPoolRequestData body);


  /**
   * Get relations to VLAN pool entities
   * 
   * Note, this is equivalent to the other <code>cVlanVlanPool</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanVlanPoolQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanVlanPoolResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/VlanPool?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanVlanPoolResponseData cVlanVlanPool(@Param("elid") String elid, CVlanVlanPoolRequestData body, @QueryMap(encoded=true) CVlanVlanPoolQueryParams queryParams);

  /**
  * Get relations to VLAN pool entities
  * 
  * Note, this is equivalent to the other <code>cVlanVlanPool</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanVlanPoolResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/VlanPool?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanVlanPoolResponseData> cVlanVlanPoolWithHttpInfo(@Param("elid") String elid, CVlanVlanPoolRequestData body, @QueryMap(encoded=true) CVlanVlanPoolQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanVlanPool</code> method in a fluent style.
   */
  public static class CVlanVlanPoolQueryParams extends HashMap<String, Object> {
    public CVlanVlanPoolQueryParams sessionId(final String value) {
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
   * @return CVlanZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CVlanZonesResponseData cVlanZones(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanZonesRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>cVlanZones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CVlanZonesResponseData> cVlanZonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CVlanZonesRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>cVlanZones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CVlanZonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CVlanZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/Zones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CVlanZonesResponseData cVlanZones(@Param("elid") String elid, CVlanZonesRequestData body, @QueryMap(encoded=true) CVlanZonesQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>cVlanZones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CVlanZonesResponseData
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/Zones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CVlanZonesResponseData> cVlanZonesWithHttpInfo(@Param("elid") String elid, CVlanZonesRequestData body, @QueryMap(encoded=true) CVlanZonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cVlanZones</code> method in a fluent style.
   */
  public static class CVlanZonesQueryParams extends HashMap<String, Object> {
    public CVlanZonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create VLAN
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCVlanResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCVlanResponse createCVlan(@Param("sessionId") String sessionId, CreateCVlanRequestData body);

  /**
   * Create
   * Similar to <code>createCVlan</code> but it also returns the http response headers .
   * Create VLAN
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCVlanResponse> createCVlanWithHttpInfo(@Param("sessionId") String sessionId, CreateCVlanRequestData body);


  /**
   * Create
   * Create VLAN
   * Note, this is equivalent to the other <code>createCVlan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCVlanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCVlanResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCVlanResponse createCVlan(CreateCVlanRequestData body, @QueryMap(encoded=true) CreateCVlanQueryParams queryParams);

  /**
  * Create
  * Create VLAN
  * Note, this is equivalent to the other <code>createCVlan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCVlanResponse
      */
      @RequestLine("POST /api/rest/entity/cVlan/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCVlanResponse> createCVlanWithHttpInfo(CreateCVlanRequestData body, @QueryMap(encoded=true) CreateCVlanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCVlan</code> method in a fluent style.
   */
  public static class CreateCVlanQueryParams extends HashMap<String, Object> {
    public CreateCVlanQueryParams sessionId(final String value) {
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
   * @return DeleteCVlanResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCVlanResponse deleteCVlan(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCVlanRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCVlan</code> but it also returns the http response headers .
   * Delete VLAN
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCVlanResponse> deleteCVlanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCVlanRequestData body);


  /**
   * Delete
   * Delete VLAN
   * Note, this is equivalent to the other <code>deleteCVlan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCVlanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCVlanResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCVlanResponse deleteCVlan(@Param("elid") String elid, DeleteCVlanRequestData body, @QueryMap(encoded=true) DeleteCVlanQueryParams queryParams);

  /**
  * Delete
  * Delete VLAN
  * Note, this is equivalent to the other <code>deleteCVlan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCVlanResponse
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCVlanResponse> deleteCVlanWithHttpInfo(@Param("elid") String elid, DeleteCVlanRequestData body, @QueryMap(encoded=true) DeleteCVlanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCVlan</code> method in a fluent style.
   */
  public static class DeleteCVlanQueryParams extends HashMap<String, Object> {
    public DeleteCVlanQueryParams sessionId(final String value) {
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
   * @return UpdateCVlanResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCVlanResponse updateCVlan(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCVlanRequestData body);

  /**
   * Modify
   * Similar to <code>updateCVlan</code> but it also returns the http response headers .
   * Modify VLAN
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCVlanResponse> updateCVlanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCVlanRequestData body);


  /**
   * Modify
   * Modify VLAN
   * Note, this is equivalent to the other <code>updateCVlan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCVlanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCVlanResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCVlanResponse updateCVlan(@Param("elid") String elid, UpdateCVlanRequestData body, @QueryMap(encoded=true) UpdateCVlanQueryParams queryParams);

  /**
  * Modify
  * Modify VLAN
  * Note, this is equivalent to the other <code>updateCVlan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCVlanResponse
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCVlanResponse> updateCVlanWithHttpInfo(@Param("elid") String elid, UpdateCVlanRequestData body, @QueryMap(encoded=true) UpdateCVlanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCVlan</code> method in a fluent style.
   */
  public static class UpdateCVlanQueryParams extends HashMap<String, Object> {
    public UpdateCVlanQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCVlanResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCVlanResponse updateSystemAttributesCVlan(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCVlanRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCVlan</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCVlanResponse> updateSystemAttributesCVlanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCVlanRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCVlan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCVlanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCVlanResponse
   */
  @RequestLine("POST /api/rest/entity/cVlan/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCVlanResponse updateSystemAttributesCVlan(@Param("elid") String elid, UpdateSystemAttributesCVlanRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCVlanQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCVlan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCVlanResponse
      */
      @RequestLine("POST /api/rest/entity/cVlan/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCVlanResponse> updateSystemAttributesCVlanWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCVlanRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCVlanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCVlan</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCVlanQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCVlanQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
