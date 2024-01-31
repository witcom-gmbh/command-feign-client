package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateIpv4NetworkRequestData;
import com.fntsoftware.businessgateway.entities.CreateIpv4NetworkResponse;
import com.fntsoftware.businessgateway.entities.DeleteIpv4NetworkRequestData;
import com.fntsoftware.businessgateway.entities.DeleteIpv4NetworkResponse;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkCustomIpaccessSvcsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkCustomIpaccessSvcsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkCustomL2CpeSegmentRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkCustomL2CpeSegmentResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkDomainRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkDomainResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkFreeNetRequest;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkFreeNetResponse;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkGatewayRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkGatewayResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkIpv4NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkIpv4NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkIpv6NetworksRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkIpv6NetworksResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkNetMandatorRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkNetMandatorResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkNetrangeNameRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkNetrangeNameResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkObjectsRequest;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkObjectsResponse;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkParentNetworkRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkParentNetworkResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkPersonsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkPersonsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkQueryRequest;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkQueryResponse;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkSubNetworksRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkSubNetworksResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkVirtualNasServersRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkVirtualNasServersResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkZonesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetworkZonesResponseData;
import com.fntsoftware.businessgateway.entities.UpdateIpv4NetworkRequestData;
import com.fntsoftware.businessgateway.entities.UpdateIpv4NetworkResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesIpv4NetworkRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesIpv4NetworkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface Ipv4NetworkApi extends ApiClient.Api {


  /**
   * Create
   * To create an IPv4 network a domain, a net mandator and a netrange name is required. There are three creation modes: CIDR, prefix and subnet mask. In the \&quot;CIDR\&quot; mode the attribute \&quot;ID\&quot; (e.g.  192.168.178.1/24) has to be specified in \&quot;CIDR-notation\&quot;. In the \&quot;prefix\&quot; mode the \&quot;attribute-ID\&quot; which is the \&quot;net-ID\&quot; must be specified by an \&quot;IP address\&quot; and for the attribute \&quot;PREFIX_LENGTH\&quot; the \&quot;prefix length\&quot; must be specified. In the \&quot;subnet mask\&quot; mode the attribute \&quot;ID\&quot; which is the \&quot;net-ID\&quot; must be specified by an \&quot;IP address\&quot; and the attribute \&quot;SUBNETMASK\&quot; which declares the \&quot;subnet mask\&quot; must be specified.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateIpv4NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateIpv4NetworkResponse createIpv4Network(@Param("sessionId") String sessionId, CreateIpv4NetworkRequestData body);

  /**
   * Create
   * Similar to <code>createIpv4Network</code> but it also returns the http response headers .
   * To create an IPv4 network a domain, a net mandator and a netrange name is required. There are three creation modes: CIDR, prefix and subnet mask. In the \&quot;CIDR\&quot; mode the attribute \&quot;ID\&quot; (e.g.  192.168.178.1/24) has to be specified in \&quot;CIDR-notation\&quot;. In the \&quot;prefix\&quot; mode the \&quot;attribute-ID\&quot; which is the \&quot;net-ID\&quot; must be specified by an \&quot;IP address\&quot; and for the attribute \&quot;PREFIX_LENGTH\&quot; the \&quot;prefix length\&quot; must be specified. In the \&quot;subnet mask\&quot; mode the attribute \&quot;ID\&quot; which is the \&quot;net-ID\&quot; must be specified by an \&quot;IP address\&quot; and the attribute \&quot;SUBNETMASK\&quot; which declares the \&quot;subnet mask\&quot; must be specified.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateIpv4NetworkResponse> createIpv4NetworkWithHttpInfo(@Param("sessionId") String sessionId, CreateIpv4NetworkRequestData body);


  /**
   * Create
   * To create an IPv4 network a domain, a net mandator and a netrange name is required. There are three creation modes: CIDR, prefix and subnet mask. In the \&quot;CIDR\&quot; mode the attribute \&quot;ID\&quot; (e.g.  192.168.178.1/24) has to be specified in \&quot;CIDR-notation\&quot;. In the \&quot;prefix\&quot; mode the \&quot;attribute-ID\&quot; which is the \&quot;net-ID\&quot; must be specified by an \&quot;IP address\&quot; and for the attribute \&quot;PREFIX_LENGTH\&quot; the \&quot;prefix length\&quot; must be specified. In the \&quot;subnet mask\&quot; mode the attribute \&quot;ID\&quot; which is the \&quot;net-ID\&quot; must be specified by an \&quot;IP address\&quot; and the attribute \&quot;SUBNETMASK\&quot; which declares the \&quot;subnet mask\&quot; must be specified.
   * Note, this is equivalent to the other <code>createIpv4Network</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateIpv4NetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateIpv4NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateIpv4NetworkResponse createIpv4Network(CreateIpv4NetworkRequestData body, @QueryMap(encoded=true) CreateIpv4NetworkQueryParams queryParams);

  /**
  * Create
  * To create an IPv4 network a domain, a net mandator and a netrange name is required. There are three creation modes: CIDR, prefix and subnet mask. In the \&quot;CIDR\&quot; mode the attribute \&quot;ID\&quot; (e.g.  192.168.178.1/24) has to be specified in \&quot;CIDR-notation\&quot;. In the \&quot;prefix\&quot; mode the \&quot;attribute-ID\&quot; which is the \&quot;net-ID\&quot; must be specified by an \&quot;IP address\&quot; and for the attribute \&quot;PREFIX_LENGTH\&quot; the \&quot;prefix length\&quot; must be specified. In the \&quot;subnet mask\&quot; mode the attribute \&quot;ID\&quot; which is the \&quot;net-ID\&quot; must be specified by an \&quot;IP address\&quot; and the attribute \&quot;SUBNETMASK\&quot; which declares the \&quot;subnet mask\&quot; must be specified.
  * Note, this is equivalent to the other <code>createIpv4Network</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateIpv4NetworkResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateIpv4NetworkResponse> createIpv4NetworkWithHttpInfo(CreateIpv4NetworkRequestData body, @QueryMap(encoded=true) CreateIpv4NetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createIpv4Network</code> method in a fluent style.
   */
  public static class CreateIpv4NetworkQueryParams extends HashMap<String, Object> {
    public CreateIpv4NetworkQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete IPv4 network
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteIpv4NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteIpv4NetworkResponse deleteIpv4Network(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteIpv4NetworkRequestData body);

  /**
   * Delete
   * Similar to <code>deleteIpv4Network</code> but it also returns the http response headers .
   * Delete IPv4 network
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteIpv4NetworkResponse> deleteIpv4NetworkWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteIpv4NetworkRequestData body);


  /**
   * Delete
   * Delete IPv4 network
   * Note, this is equivalent to the other <code>deleteIpv4Network</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteIpv4NetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteIpv4NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteIpv4NetworkResponse deleteIpv4Network(@Param("elid") String elid, DeleteIpv4NetworkRequestData body, @QueryMap(encoded=true) DeleteIpv4NetworkQueryParams queryParams);

  /**
  * Delete
  * Delete IPv4 network
  * Note, this is equivalent to the other <code>deleteIpv4Network</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteIpv4NetworkResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteIpv4NetworkResponse> deleteIpv4NetworkWithHttpInfo(@Param("elid") String elid, DeleteIpv4NetworkRequestData body, @QueryMap(encoded=true) DeleteIpv4NetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteIpv4Network</code> method in a fluent style.
   */
  public static class DeleteIpv4NetworkQueryParams extends HashMap<String, Object> {
    public DeleteIpv4NetworkQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkContractsResponseData ipv4NetworkContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>ipv4NetworkContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkContractsResponseData> ipv4NetworkContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkContractsResponseData ipv4NetworkContracts(@Param("elid") String elid, Ipv4NetworkContractsRequestData body, @QueryMap(encoded=true) Ipv4NetworkContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkContractsResponseData> ipv4NetworkContractsWithHttpInfo(@Param("elid") String elid, Ipv4NetworkContractsRequestData body, @QueryMap(encoded=true) Ipv4NetworkContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkContracts</code> method in a fluent style.
   */
  public static class Ipv4NetworkContractsQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IP-Access Services entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv4NetworkCustomIpaccessSvcsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/CustomIpaccessSvcs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkCustomIpaccessSvcsResponseData ipv4NetworkCustomIpaccessSvcs(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkCustomIpaccessSvcsRequestData body);

  /**
   * Get relations to IP-Access Services entities
   * Similar to <code>ipv4NetworkCustomIpaccessSvcs</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/CustomIpaccessSvcs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkCustomIpaccessSvcsResponseData> ipv4NetworkCustomIpaccessSvcsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkCustomIpaccessSvcsRequestData body);


  /**
   * Get relations to IP-Access Services entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkCustomIpaccessSvcs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkCustomIpaccessSvcsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkCustomIpaccessSvcsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/CustomIpaccessSvcs?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkCustomIpaccessSvcsResponseData ipv4NetworkCustomIpaccessSvcs(@Param("elid") String elid, Ipv4NetworkCustomIpaccessSvcsRequestData body, @QueryMap(encoded=true) Ipv4NetworkCustomIpaccessSvcsQueryParams queryParams);

  /**
  * Get relations to IP-Access Services entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkCustomIpaccessSvcs</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkCustomIpaccessSvcsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/CustomIpaccessSvcs?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkCustomIpaccessSvcsResponseData> ipv4NetworkCustomIpaccessSvcsWithHttpInfo(@Param("elid") String elid, Ipv4NetworkCustomIpaccessSvcsRequestData body, @QueryMap(encoded=true) Ipv4NetworkCustomIpaccessSvcsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkCustomIpaccessSvcs</code> method in a fluent style.
   */
  public static class Ipv4NetworkCustomIpaccessSvcsQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkCustomIpaccessSvcsQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkCustomL2CpeSegmentResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkCustomL2CpeSegmentResponseData ipv4NetworkCustomL2CpeSegment(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkCustomL2CpeSegmentRequestData body);

  /**
   * Get relations to L2-CPE Segment entities
   * Similar to <code>ipv4NetworkCustomL2CpeSegment</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkCustomL2CpeSegmentResponseData> ipv4NetworkCustomL2CpeSegmentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkCustomL2CpeSegmentRequestData body);


  /**
   * Get relations to L2-CPE Segment entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkCustomL2CpeSegment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkCustomL2CpeSegmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkCustomL2CpeSegmentResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkCustomL2CpeSegmentResponseData ipv4NetworkCustomL2CpeSegment(@Param("elid") String elid, Ipv4NetworkCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) Ipv4NetworkCustomL2CpeSegmentQueryParams queryParams);

  /**
  * Get relations to L2-CPE Segment entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkCustomL2CpeSegment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkCustomL2CpeSegmentResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/CustomL2CpeSegment?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkCustomL2CpeSegmentResponseData> ipv4NetworkCustomL2CpeSegmentWithHttpInfo(@Param("elid") String elid, Ipv4NetworkCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) Ipv4NetworkCustomL2CpeSegmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkCustomL2CpeSegment</code> method in a fluent style.
   */
  public static class Ipv4NetworkCustomL2CpeSegmentQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkCustomL2CpeSegmentQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkDevicesAllResponseData ipv4NetworkDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>ipv4NetworkDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkDevicesAllResponseData> ipv4NetworkDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkDevicesAllResponseData ipv4NetworkDevicesAll(@Param("elid") String elid, Ipv4NetworkDevicesAllRequestData body, @QueryMap(encoded=true) Ipv4NetworkDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkDevicesAllResponseData> ipv4NetworkDevicesAllWithHttpInfo(@Param("elid") String elid, Ipv4NetworkDevicesAllRequestData body, @QueryMap(encoded=true) Ipv4NetworkDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkDevicesAll</code> method in a fluent style.
   */
  public static class Ipv4NetworkDevicesAllQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkDevicesAllQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Domain entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv4NetworkDomainResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Domain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkDomainResponseData ipv4NetworkDomain(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkDomainRequestData body);

  /**
   * Get relations to Domain entities
   * Similar to <code>ipv4NetworkDomain</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Domain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkDomainResponseData> ipv4NetworkDomainWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkDomainRequestData body);


  /**
   * Get relations to Domain entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkDomainResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Domain?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkDomainResponseData ipv4NetworkDomain(@Param("elid") String elid, Ipv4NetworkDomainRequestData body, @QueryMap(encoded=true) Ipv4NetworkDomainQueryParams queryParams);

  /**
  * Get relations to Domain entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkDomainResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Domain?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkDomainResponseData> ipv4NetworkDomainWithHttpInfo(@Param("elid") String elid, Ipv4NetworkDomainRequestData body, @QueryMap(encoded=true) Ipv4NetworkDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkDomain</code> method in a fluent style.
   */
  public static class Ipv4NetworkDomainQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkDomainQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkFrameContractsResponseData ipv4NetworkFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>ipv4NetworkFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkFrameContractsResponseData> ipv4NetworkFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkFrameContractsResponseData ipv4NetworkFrameContracts(@Param("elid") String elid, Ipv4NetworkFrameContractsRequestData body, @QueryMap(encoded=true) Ipv4NetworkFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkFrameContractsResponseData> ipv4NetworkFrameContractsWithHttpInfo(@Param("elid") String elid, Ipv4NetworkFrameContractsRequestData body, @QueryMap(encoded=true) Ipv4NetworkFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkFrameContracts</code> method in a fluent style.
   */
  public static class Ipv4NetworkFrameContractsQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Query free nets
   * Query of the Query free nets
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return Ipv4NetworkFreeNetResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/freeNet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkFreeNetResponse ipv4NetworkFreeNet(@Param("sessionId") String sessionId, Ipv4NetworkFreeNetRequest body);

  /**
   * Query Query free nets
   * Similar to <code>ipv4NetworkFreeNet</code> but it also returns the http response headers .
   * Query of the Query free nets
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/freeNet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkFreeNetResponse> ipv4NetworkFreeNetWithHttpInfo(@Param("sessionId") String sessionId, Ipv4NetworkFreeNetRequest body);


  /**
   * Query Query free nets
   * Query of the Query free nets
   * Note, this is equivalent to the other <code>ipv4NetworkFreeNet</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkFreeNetQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkFreeNetResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/freeNet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkFreeNetResponse ipv4NetworkFreeNet(Ipv4NetworkFreeNetRequest body, @QueryMap(encoded=true) Ipv4NetworkFreeNetQueryParams queryParams);

  /**
  * Query Query free nets
  * Query of the Query free nets
  * Note, this is equivalent to the other <code>ipv4NetworkFreeNet</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkFreeNetResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/freeNet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkFreeNetResponse> ipv4NetworkFreeNetWithHttpInfo(Ipv4NetworkFreeNetRequest body, @QueryMap(encoded=true) Ipv4NetworkFreeNetQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkFreeNet</code> method in a fluent style.
   */
  public static class Ipv4NetworkFreeNetQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkFreeNetQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IP gateway entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv4NetworkGatewayResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Gateway?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkGatewayResponseData ipv4NetworkGateway(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkGatewayRequestData body);

  /**
   * Get relations to IP gateway entities
   * Similar to <code>ipv4NetworkGateway</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Gateway?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkGatewayResponseData> ipv4NetworkGatewayWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkGatewayRequestData body);


  /**
   * Get relations to IP gateway entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkGateway</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkGatewayQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkGatewayResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Gateway?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkGatewayResponseData ipv4NetworkGateway(@Param("elid") String elid, Ipv4NetworkGatewayRequestData body, @QueryMap(encoded=true) Ipv4NetworkGatewayQueryParams queryParams);

  /**
  * Get relations to IP gateway entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkGateway</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkGatewayResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Gateway?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkGatewayResponseData> ipv4NetworkGatewayWithHttpInfo(@Param("elid") String elid, Ipv4NetworkGatewayRequestData body, @QueryMap(encoded=true) Ipv4NetworkGatewayQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkGateway</code> method in a fluent style.
   */
  public static class Ipv4NetworkGatewayQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkGatewayQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkIpv4NetrangesResponseData ipv4NetworkIpv4Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkIpv4NetrangesRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>ipv4NetworkIpv4Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkIpv4NetrangesResponseData> ipv4NetworkIpv4NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkIpv4NetrangesRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkIpv4Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkIpv4NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkIpv4NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Ipv4Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkIpv4NetrangesResponseData ipv4NetworkIpv4Netranges(@Param("elid") String elid, Ipv4NetworkIpv4NetrangesRequestData body, @QueryMap(encoded=true) Ipv4NetworkIpv4NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkIpv4Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkIpv4NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Ipv4Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkIpv4NetrangesResponseData> ipv4NetworkIpv4NetrangesWithHttpInfo(@Param("elid") String elid, Ipv4NetworkIpv4NetrangesRequestData body, @QueryMap(encoded=true) Ipv4NetworkIpv4NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkIpv4Netranges</code> method in a fluent style.
   */
  public static class Ipv4NetworkIpv4NetrangesQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkIpv4NetrangesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv6 network entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv4NetworkIpv6NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Ipv6Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkIpv6NetworksResponseData ipv4NetworkIpv6Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkIpv6NetworksRequestData body);

  /**
   * Get relations to IPv6 network entities
   * Similar to <code>ipv4NetworkIpv6Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Ipv6Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkIpv6NetworksResponseData> ipv4NetworkIpv6NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkIpv6NetworksRequestData body);


  /**
   * Get relations to IPv6 network entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkIpv6Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkIpv6NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkIpv6NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Ipv6Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkIpv6NetworksResponseData ipv4NetworkIpv6Networks(@Param("elid") String elid, Ipv4NetworkIpv6NetworksRequestData body, @QueryMap(encoded=true) Ipv4NetworkIpv6NetworksQueryParams queryParams);

  /**
  * Get relations to IPv6 network entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkIpv6Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkIpv6NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Ipv6Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkIpv6NetworksResponseData> ipv4NetworkIpv6NetworksWithHttpInfo(@Param("elid") String elid, Ipv4NetworkIpv6NetworksRequestData body, @QueryMap(encoded=true) Ipv4NetworkIpv6NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkIpv6Networks</code> method in a fluent style.
   */
  public static class Ipv4NetworkIpv6NetworksQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkIpv6NetworksQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkMaintenanceContractsResponseData ipv4NetworkMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>ipv4NetworkMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkMaintenanceContractsResponseData> ipv4NetworkMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkMaintenanceContractsResponseData ipv4NetworkMaintenanceContracts(@Param("elid") String elid, Ipv4NetworkMaintenanceContractsRequestData body, @QueryMap(encoded=true) Ipv4NetworkMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkMaintenanceContractsResponseData> ipv4NetworkMaintenanceContractsWithHttpInfo(@Param("elid") String elid, Ipv4NetworkMaintenanceContractsRequestData body, @QueryMap(encoded=true) Ipv4NetworkMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkMaintenanceContracts</code> method in a fluent style.
   */
  public static class Ipv4NetworkMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Net mandator entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv4NetworkNetMandatorResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/NetMandator?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkNetMandatorResponseData ipv4NetworkNetMandator(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkNetMandatorRequestData body);

  /**
   * Get relations to Net mandator entities
   * Similar to <code>ipv4NetworkNetMandator</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/NetMandator?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkNetMandatorResponseData> ipv4NetworkNetMandatorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkNetMandatorRequestData body);


  /**
   * Get relations to Net mandator entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkNetMandator</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkNetMandatorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkNetMandatorResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/NetMandator?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkNetMandatorResponseData ipv4NetworkNetMandator(@Param("elid") String elid, Ipv4NetworkNetMandatorRequestData body, @QueryMap(encoded=true) Ipv4NetworkNetMandatorQueryParams queryParams);

  /**
  * Get relations to Net mandator entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkNetMandator</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkNetMandatorResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/NetMandator?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkNetMandatorResponseData> ipv4NetworkNetMandatorWithHttpInfo(@Param("elid") String elid, Ipv4NetworkNetMandatorRequestData body, @QueryMap(encoded=true) Ipv4NetworkNetMandatorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkNetMandator</code> method in a fluent style.
   */
  public static class Ipv4NetworkNetMandatorQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkNetMandatorQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Netrange name entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv4NetworkNetrangeNameResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/NetrangeName?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkNetrangeNameResponseData ipv4NetworkNetrangeName(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkNetrangeNameRequestData body);

  /**
   * Get relations to Netrange name entities
   * Similar to <code>ipv4NetworkNetrangeName</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/NetrangeName?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkNetrangeNameResponseData> ipv4NetworkNetrangeNameWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkNetrangeNameRequestData body);


  /**
   * Get relations to Netrange name entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkNetrangeName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkNetrangeNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkNetrangeNameResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/NetrangeName?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkNetrangeNameResponseData ipv4NetworkNetrangeName(@Param("elid") String elid, Ipv4NetworkNetrangeNameRequestData body, @QueryMap(encoded=true) Ipv4NetworkNetrangeNameQueryParams queryParams);

  /**
  * Get relations to Netrange name entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkNetrangeName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkNetrangeNameResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/NetrangeName?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkNetrangeNameResponseData> ipv4NetworkNetrangeNameWithHttpInfo(@Param("elid") String elid, Ipv4NetworkNetrangeNameRequestData body, @QueryMap(encoded=true) Ipv4NetworkNetrangeNameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkNetrangeName</code> method in a fluent style.
   */
  public static class Ipv4NetworkNetrangeNameQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkNetrangeNameQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkObjectsResponse ipv4NetworkObjects(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkObjectsRequest body);

  /**
   * Query Objects
   * Similar to <code>ipv4NetworkObjects</code> but it also returns the http response headers .
   * Query of the Objects
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkObjectsResponse> ipv4NetworkObjectsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkObjectsRequest body);


  /**
   * Query Objects
   * Query of the Objects
   * Note, this is equivalent to the other <code>ipv4NetworkObjects</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkObjectsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Objects?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkObjectsResponse ipv4NetworkObjects(@Param("elid") String elid, Ipv4NetworkObjectsRequest body, @QueryMap(encoded=true) Ipv4NetworkObjectsQueryParams queryParams);

  /**
  * Query Objects
  * Query of the Objects
  * Note, this is equivalent to the other <code>ipv4NetworkObjects</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkObjectsResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Objects?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkObjectsResponse> ipv4NetworkObjectsWithHttpInfo(@Param("elid") String elid, Ipv4NetworkObjectsRequest body, @QueryMap(encoded=true) Ipv4NetworkObjectsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkObjects</code> method in a fluent style.
   */
  public static class Ipv4NetworkObjectsQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkObjectsQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkOrganizationsResponseData ipv4NetworkOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>ipv4NetworkOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkOrganizationsResponseData> ipv4NetworkOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkOrganizationsResponseData ipv4NetworkOrganizations(@Param("elid") String elid, Ipv4NetworkOrganizationsRequestData body, @QueryMap(encoded=true) Ipv4NetworkOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkOrganizationsResponseData> ipv4NetworkOrganizationsWithHttpInfo(@Param("elid") String elid, Ipv4NetworkOrganizationsRequestData body, @QueryMap(encoded=true) Ipv4NetworkOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkOrganizations</code> method in a fluent style.
   */
  public static class Ipv4NetworkOrganizationsQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkOrganizationsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Higher-level IP network entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv4NetworkParentNetworkResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/ParentNetwork?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkParentNetworkResponseData ipv4NetworkParentNetwork(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkParentNetworkRequestData body);

  /**
   * Get relations to Higher-level IP network entities
   * Similar to <code>ipv4NetworkParentNetwork</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/ParentNetwork?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkParentNetworkResponseData> ipv4NetworkParentNetworkWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkParentNetworkRequestData body);


  /**
   * Get relations to Higher-level IP network entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkParentNetwork</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkParentNetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkParentNetworkResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/ParentNetwork?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkParentNetworkResponseData ipv4NetworkParentNetwork(@Param("elid") String elid, Ipv4NetworkParentNetworkRequestData body, @QueryMap(encoded=true) Ipv4NetworkParentNetworkQueryParams queryParams);

  /**
  * Get relations to Higher-level IP network entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkParentNetwork</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkParentNetworkResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/ParentNetwork?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkParentNetworkResponseData> ipv4NetworkParentNetworkWithHttpInfo(@Param("elid") String elid, Ipv4NetworkParentNetworkRequestData body, @QueryMap(encoded=true) Ipv4NetworkParentNetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkParentNetwork</code> method in a fluent style.
   */
  public static class Ipv4NetworkParentNetworkQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkParentNetworkQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkPersonGroupsResponseData ipv4NetworkPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>ipv4NetworkPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkPersonGroupsResponseData> ipv4NetworkPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkPersonGroupsResponseData ipv4NetworkPersonGroups(@Param("elid") String elid, Ipv4NetworkPersonGroupsRequestData body, @QueryMap(encoded=true) Ipv4NetworkPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkPersonGroupsResponseData> ipv4NetworkPersonGroupsWithHttpInfo(@Param("elid") String elid, Ipv4NetworkPersonGroupsRequestData body, @QueryMap(encoded=true) Ipv4NetworkPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkPersonGroups</code> method in a fluent style.
   */
  public static class Ipv4NetworkPersonGroupsQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkPersonGroupsQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkPersonsResponseData ipv4NetworkPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>ipv4NetworkPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkPersonsResponseData> ipv4NetworkPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkPersonsResponseData ipv4NetworkPersons(@Param("elid") String elid, Ipv4NetworkPersonsRequestData body, @QueryMap(encoded=true) Ipv4NetworkPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkPersonsResponseData> ipv4NetworkPersonsWithHttpInfo(@Param("elid") String elid, Ipv4NetworkPersonsRequestData body, @QueryMap(encoded=true) Ipv4NetworkPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkPersons</code> method in a fluent style.
   */
  public static class Ipv4NetworkPersonsQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return Ipv4NetworkQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkQueryResponse ipv4NetworkQuery(@Param("sessionId") String sessionId, Ipv4NetworkQueryRequest body);

  /**
   * Basic query
   * Similar to <code>ipv4NetworkQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkQueryResponse> ipv4NetworkQueryWithHttpInfo(@Param("sessionId") String sessionId, Ipv4NetworkQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>ipv4NetworkQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkQueryResponse ipv4NetworkQuery(Ipv4NetworkQueryRequest body, @QueryMap(encoded=true) Ipv4NetworkQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>ipv4NetworkQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkQueryResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkQueryResponse> ipv4NetworkQueryWithHttpInfo(Ipv4NetworkQueryRequest body, @QueryMap(encoded=true) Ipv4NetworkQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkQuery</code> method in a fluent style.
   */
  public static class Ipv4NetworkQueryQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Lower-level IP network entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv4NetworkSubNetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/SubNetworks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkSubNetworksResponseData ipv4NetworkSubNetworks(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkSubNetworksRequestData body);

  /**
   * Get relations to Lower-level IP network entities
   * Similar to <code>ipv4NetworkSubNetworks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/SubNetworks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkSubNetworksResponseData> ipv4NetworkSubNetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkSubNetworksRequestData body);


  /**
   * Get relations to Lower-level IP network entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkSubNetworks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkSubNetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkSubNetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/SubNetworks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkSubNetworksResponseData ipv4NetworkSubNetworks(@Param("elid") String elid, Ipv4NetworkSubNetworksRequestData body, @QueryMap(encoded=true) Ipv4NetworkSubNetworksQueryParams queryParams);

  /**
  * Get relations to Lower-level IP network entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkSubNetworks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkSubNetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/SubNetworks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkSubNetworksResponseData> ipv4NetworkSubNetworksWithHttpInfo(@Param("elid") String elid, Ipv4NetworkSubNetworksRequestData body, @QueryMap(encoded=true) Ipv4NetworkSubNetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkSubNetworks</code> method in a fluent style.
   */
  public static class Ipv4NetworkSubNetworksQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkSubNetworksQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkSystemAttributesResponse ipv4NetworkSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>ipv4NetworkSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkSystemAttributesResponse> ipv4NetworkSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>ipv4NetworkSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkSystemAttributesResponse ipv4NetworkSystemAttributes(@Param("elid") String elid, Ipv4NetworkSystemAttributesRequest body, @QueryMap(encoded=true) Ipv4NetworkSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>ipv4NetworkSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkSystemAttributesResponse> ipv4NetworkSystemAttributesWithHttpInfo(@Param("elid") String elid, Ipv4NetworkSystemAttributesRequest body, @QueryMap(encoded=true) Ipv4NetworkSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkSystemAttributes</code> method in a fluent style.
   */
  public static class Ipv4NetworkSystemAttributesQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkSystemAttributesQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkVirtualNasServersResponseData ipv4NetworkVirtualNasServers(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkVirtualNasServersRequestData body);

  /**
   * Get relations to Virtual NAS server entities
   * Similar to <code>ipv4NetworkVirtualNasServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkVirtualNasServersResponseData> ipv4NetworkVirtualNasServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkVirtualNasServersRequestData body);


  /**
   * Get relations to Virtual NAS server entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkVirtualNasServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkVirtualNasServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkVirtualNasServersResponseData ipv4NetworkVirtualNasServers(@Param("elid") String elid, Ipv4NetworkVirtualNasServersRequestData body, @QueryMap(encoded=true) Ipv4NetworkVirtualNasServersQueryParams queryParams);

  /**
  * Get relations to Virtual NAS server entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkVirtualNasServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkVirtualNasServersResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/VirtualNasServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkVirtualNasServersResponseData> ipv4NetworkVirtualNasServersWithHttpInfo(@Param("elid") String elid, Ipv4NetworkVirtualNasServersRequestData body, @QueryMap(encoded=true) Ipv4NetworkVirtualNasServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkVirtualNasServers</code> method in a fluent style.
   */
  public static class Ipv4NetworkVirtualNasServersQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkVirtualNasServersQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkVirtualSwitchesResponseData ipv4NetworkVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>ipv4NetworkVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkVirtualSwitchesResponseData> ipv4NetworkVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkVirtualSwitchesResponseData ipv4NetworkVirtualSwitches(@Param("elid") String elid, Ipv4NetworkVirtualSwitchesRequestData body, @QueryMap(encoded=true) Ipv4NetworkVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkVirtualSwitchesResponseData> ipv4NetworkVirtualSwitchesWithHttpInfo(@Param("elid") String elid, Ipv4NetworkVirtualSwitchesRequestData body, @QueryMap(encoded=true) Ipv4NetworkVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkVirtualSwitches</code> method in a fluent style.
   */
  public static class Ipv4NetworkVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return Ipv4NetworkZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetworkZonesResponseData ipv4NetworkZones(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkZonesRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>ipv4NetworkZones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetworkZonesResponseData> ipv4NetworkZonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetworkZonesRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetworkZones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetworkZonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetworkZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Zones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetworkZonesResponseData ipv4NetworkZones(@Param("elid") String elid, Ipv4NetworkZonesRequestData body, @QueryMap(encoded=true) Ipv4NetworkZonesQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetworkZones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetworkZonesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/Zones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetworkZonesResponseData> ipv4NetworkZonesWithHttpInfo(@Param("elid") String elid, Ipv4NetworkZonesRequestData body, @QueryMap(encoded=true) Ipv4NetworkZonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetworkZones</code> method in a fluent style.
   */
  public static class Ipv4NetworkZonesQueryParams extends HashMap<String, Object> {
    public Ipv4NetworkZonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify IPv4 network
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateIpv4NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateIpv4NetworkResponse updateIpv4Network(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateIpv4NetworkRequestData body);

  /**
   * Modify
   * Similar to <code>updateIpv4Network</code> but it also returns the http response headers .
   * Modify IPv4 network
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateIpv4NetworkResponse> updateIpv4NetworkWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateIpv4NetworkRequestData body);


  /**
   * Modify
   * Modify IPv4 network
   * Note, this is equivalent to the other <code>updateIpv4Network</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateIpv4NetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateIpv4NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateIpv4NetworkResponse updateIpv4Network(@Param("elid") String elid, UpdateIpv4NetworkRequestData body, @QueryMap(encoded=true) UpdateIpv4NetworkQueryParams queryParams);

  /**
  * Modify
  * Modify IPv4 network
  * Note, this is equivalent to the other <code>updateIpv4Network</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateIpv4NetworkResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateIpv4NetworkResponse> updateIpv4NetworkWithHttpInfo(@Param("elid") String elid, UpdateIpv4NetworkRequestData body, @QueryMap(encoded=true) UpdateIpv4NetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateIpv4Network</code> method in a fluent style.
   */
  public static class UpdateIpv4NetworkQueryParams extends HashMap<String, Object> {
    public UpdateIpv4NetworkQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesIpv4NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesIpv4NetworkResponse updateSystemAttributesIpv4Network(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesIpv4NetworkRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesIpv4Network</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesIpv4NetworkResponse> updateSystemAttributesIpv4NetworkWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesIpv4NetworkRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesIpv4Network</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesIpv4NetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesIpv4NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesIpv4NetworkResponse updateSystemAttributesIpv4Network(@Param("elid") String elid, UpdateSystemAttributesIpv4NetworkRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesIpv4NetworkQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesIpv4Network</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesIpv4NetworkResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Network/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesIpv4NetworkResponse> updateSystemAttributesIpv4NetworkWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesIpv4NetworkRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesIpv4NetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesIpv4Network</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesIpv4NetworkQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesIpv4NetworkQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
