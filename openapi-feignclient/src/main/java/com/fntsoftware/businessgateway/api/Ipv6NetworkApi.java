package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateIpv6NetworkRequestData;
import com.fntsoftware.businessgateway.entities.CreateIpv6NetworkResponse;
import com.fntsoftware.businessgateway.entities.DeleteIpv6NetworkRequestData;
import com.fntsoftware.businessgateway.entities.DeleteIpv6NetworkResponse;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkCustomIpaccessSvcsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkCustomIpaccessSvcsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkDomainRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkDomainResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkGatewayRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkGatewayResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkIpv4NetworksRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkIpv4NetworksResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkIpv6AddressesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkIpv6AddressesResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkIpv6NetrangesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkIpv6NetrangesResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkNetMandatorRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkNetMandatorResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkNetrangeNameRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkNetrangeNameResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkObjectsRequest;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkObjectsResponse;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkPersonsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkPersonsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkPhysicalPortsDataRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkPhysicalPortsDataResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkQueryRequest;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkQueryResponse;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkVlanRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkVlanResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkZonesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetworkZonesResponseData;
import com.fntsoftware.businessgateway.entities.UpdateIpv6NetworkRequestData;
import com.fntsoftware.businessgateway.entities.UpdateIpv6NetworkResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesIpv6NetworkRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesIpv6NetworkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface Ipv6NetworkApi extends ApiClient.Api {


  /**
   * Create
   * Create IPv6 network
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateIpv6NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateIpv6NetworkResponse createIpv6Network(@Param("sessionId") String sessionId, CreateIpv6NetworkRequestData body);

  /**
   * Create
   * Similar to <code>createIpv6Network</code> but it also returns the http response headers .
   * Create IPv6 network
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateIpv6NetworkResponse> createIpv6NetworkWithHttpInfo(@Param("sessionId") String sessionId, CreateIpv6NetworkRequestData body);


  /**
   * Create
   * Create IPv6 network
   * Note, this is equivalent to the other <code>createIpv6Network</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateIpv6NetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateIpv6NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateIpv6NetworkResponse createIpv6Network(CreateIpv6NetworkRequestData body, @QueryMap(encoded=true) CreateIpv6NetworkQueryParams queryParams);

  /**
  * Create
  * Create IPv6 network
  * Note, this is equivalent to the other <code>createIpv6Network</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateIpv6NetworkResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateIpv6NetworkResponse> createIpv6NetworkWithHttpInfo(CreateIpv6NetworkRequestData body, @QueryMap(encoded=true) CreateIpv6NetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createIpv6Network</code> method in a fluent style.
   */
  public static class CreateIpv6NetworkQueryParams extends HashMap<String, Object> {
    public CreateIpv6NetworkQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete IPv6 network
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteIpv6NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteIpv6NetworkResponse deleteIpv6Network(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteIpv6NetworkRequestData body);

  /**
   * Delete
   * Similar to <code>deleteIpv6Network</code> but it also returns the http response headers .
   * Delete IPv6 network
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteIpv6NetworkResponse> deleteIpv6NetworkWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteIpv6NetworkRequestData body);


  /**
   * Delete
   * Delete IPv6 network
   * Note, this is equivalent to the other <code>deleteIpv6Network</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteIpv6NetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteIpv6NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteIpv6NetworkResponse deleteIpv6Network(@Param("elid") String elid, DeleteIpv6NetworkRequestData body, @QueryMap(encoded=true) DeleteIpv6NetworkQueryParams queryParams);

  /**
  * Delete
  * Delete IPv6 network
  * Note, this is equivalent to the other <code>deleteIpv6Network</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteIpv6NetworkResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteIpv6NetworkResponse> deleteIpv6NetworkWithHttpInfo(@Param("elid") String elid, DeleteIpv6NetworkRequestData body, @QueryMap(encoded=true) DeleteIpv6NetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteIpv6Network</code> method in a fluent style.
   */
  public static class DeleteIpv6NetworkQueryParams extends HashMap<String, Object> {
    public DeleteIpv6NetworkQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkContractsResponseData ipv6NetworkContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>ipv6NetworkContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkContractsResponseData> ipv6NetworkContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkContractsResponseData ipv6NetworkContracts(@Param("elid") String elid, Ipv6NetworkContractsRequestData body, @QueryMap(encoded=true) Ipv6NetworkContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkContractsResponseData> ipv6NetworkContractsWithHttpInfo(@Param("elid") String elid, Ipv6NetworkContractsRequestData body, @QueryMap(encoded=true) Ipv6NetworkContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkContracts</code> method in a fluent style.
   */
  public static class Ipv6NetworkContractsQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkContractsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkCustomIpaccessSvcsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/CustomIpaccessSvcs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkCustomIpaccessSvcsResponseData ipv6NetworkCustomIpaccessSvcs(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkCustomIpaccessSvcsRequestData body);

  /**
   * Get relations to IP-Access Services entities
   * Similar to <code>ipv6NetworkCustomIpaccessSvcs</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/CustomIpaccessSvcs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkCustomIpaccessSvcsResponseData> ipv6NetworkCustomIpaccessSvcsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkCustomIpaccessSvcsRequestData body);


  /**
   * Get relations to IP-Access Services entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkCustomIpaccessSvcs</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkCustomIpaccessSvcsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkCustomIpaccessSvcsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/CustomIpaccessSvcs?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkCustomIpaccessSvcsResponseData ipv6NetworkCustomIpaccessSvcs(@Param("elid") String elid, Ipv6NetworkCustomIpaccessSvcsRequestData body, @QueryMap(encoded=true) Ipv6NetworkCustomIpaccessSvcsQueryParams queryParams);

  /**
  * Get relations to IP-Access Services entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkCustomIpaccessSvcs</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkCustomIpaccessSvcsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/CustomIpaccessSvcs?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkCustomIpaccessSvcsResponseData> ipv6NetworkCustomIpaccessSvcsWithHttpInfo(@Param("elid") String elid, Ipv6NetworkCustomIpaccessSvcsRequestData body, @QueryMap(encoded=true) Ipv6NetworkCustomIpaccessSvcsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkCustomIpaccessSvcs</code> method in a fluent style.
   */
  public static class Ipv6NetworkCustomIpaccessSvcsQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkCustomIpaccessSvcsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkDevicesAllResponseData ipv6NetworkDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>ipv6NetworkDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkDevicesAllResponseData> ipv6NetworkDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkDevicesAllResponseData ipv6NetworkDevicesAll(@Param("elid") String elid, Ipv6NetworkDevicesAllRequestData body, @QueryMap(encoded=true) Ipv6NetworkDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkDevicesAllResponseData> ipv6NetworkDevicesAllWithHttpInfo(@Param("elid") String elid, Ipv6NetworkDevicesAllRequestData body, @QueryMap(encoded=true) Ipv6NetworkDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkDevicesAll</code> method in a fluent style.
   */
  public static class Ipv6NetworkDevicesAllQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkDevicesAllQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkDomainResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Domain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkDomainResponseData ipv6NetworkDomain(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkDomainRequestData body);

  /**
   * Get relations to Domain entities
   * Similar to <code>ipv6NetworkDomain</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Domain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkDomainResponseData> ipv6NetworkDomainWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkDomainRequestData body);


  /**
   * Get relations to Domain entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkDomainResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Domain?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkDomainResponseData ipv6NetworkDomain(@Param("elid") String elid, Ipv6NetworkDomainRequestData body, @QueryMap(encoded=true) Ipv6NetworkDomainQueryParams queryParams);

  /**
  * Get relations to Domain entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkDomainResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Domain?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkDomainResponseData> ipv6NetworkDomainWithHttpInfo(@Param("elid") String elid, Ipv6NetworkDomainRequestData body, @QueryMap(encoded=true) Ipv6NetworkDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkDomain</code> method in a fluent style.
   */
  public static class Ipv6NetworkDomainQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkDomainQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkFrameContractsResponseData ipv6NetworkFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>ipv6NetworkFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkFrameContractsResponseData> ipv6NetworkFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkFrameContractsResponseData ipv6NetworkFrameContracts(@Param("elid") String elid, Ipv6NetworkFrameContractsRequestData body, @QueryMap(encoded=true) Ipv6NetworkFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkFrameContractsResponseData> ipv6NetworkFrameContractsWithHttpInfo(@Param("elid") String elid, Ipv6NetworkFrameContractsRequestData body, @QueryMap(encoded=true) Ipv6NetworkFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkFrameContracts</code> method in a fluent style.
   */
  public static class Ipv6NetworkFrameContractsQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkFrameContractsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkGatewayResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Gateway?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkGatewayResponseData ipv6NetworkGateway(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkGatewayRequestData body);

  /**
   * Get relations to IP gateway entities
   * Similar to <code>ipv6NetworkGateway</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Gateway?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkGatewayResponseData> ipv6NetworkGatewayWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkGatewayRequestData body);


  /**
   * Get relations to IP gateway entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkGateway</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkGatewayQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkGatewayResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Gateway?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkGatewayResponseData ipv6NetworkGateway(@Param("elid") String elid, Ipv6NetworkGatewayRequestData body, @QueryMap(encoded=true) Ipv6NetworkGatewayQueryParams queryParams);

  /**
  * Get relations to IP gateway entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkGateway</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkGatewayResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Gateway?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkGatewayResponseData> ipv6NetworkGatewayWithHttpInfo(@Param("elid") String elid, Ipv6NetworkGatewayRequestData body, @QueryMap(encoded=true) Ipv6NetworkGatewayQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkGateway</code> method in a fluent style.
   */
  public static class Ipv6NetworkGatewayQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkGatewayQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkIpv4NetworksResponseData ipv6NetworkIpv4Networks(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkIpv4NetworksRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>ipv6NetworkIpv4Networks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkIpv4NetworksResponseData> ipv6NetworkIpv4NetworksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkIpv4NetworksRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkIpv4Networks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkIpv4NetworksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkIpv4NetworksResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Ipv4Networks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkIpv4NetworksResponseData ipv6NetworkIpv4Networks(@Param("elid") String elid, Ipv6NetworkIpv4NetworksRequestData body, @QueryMap(encoded=true) Ipv6NetworkIpv4NetworksQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkIpv4Networks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkIpv4NetworksResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Ipv4Networks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkIpv4NetworksResponseData> ipv6NetworkIpv4NetworksWithHttpInfo(@Param("elid") String elid, Ipv6NetworkIpv4NetworksRequestData body, @QueryMap(encoded=true) Ipv6NetworkIpv4NetworksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkIpv4Networks</code> method in a fluent style.
   */
  public static class Ipv6NetworkIpv4NetworksQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkIpv4NetworksQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv6 address entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv6NetworkIpv6AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkIpv6AddressesResponseData ipv6NetworkIpv6Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkIpv6AddressesRequestData body);

  /**
   * Get relations to IPv6 address entities
   * Similar to <code>ipv6NetworkIpv6Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkIpv6AddressesResponseData> ipv6NetworkIpv6AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkIpv6AddressesRequestData body);


  /**
   * Get relations to IPv6 address entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkIpv6Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkIpv6AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkIpv6AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkIpv6AddressesResponseData ipv6NetworkIpv6Addresses(@Param("elid") String elid, Ipv6NetworkIpv6AddressesRequestData body, @QueryMap(encoded=true) Ipv6NetworkIpv6AddressesQueryParams queryParams);

  /**
  * Get relations to IPv6 address entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkIpv6Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkIpv6AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Ipv6Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkIpv6AddressesResponseData> ipv6NetworkIpv6AddressesWithHttpInfo(@Param("elid") String elid, Ipv6NetworkIpv6AddressesRequestData body, @QueryMap(encoded=true) Ipv6NetworkIpv6AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkIpv6Addresses</code> method in a fluent style.
   */
  public static class Ipv6NetworkIpv6AddressesQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkIpv6AddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv6 netrange entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv6NetworkIpv6NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Ipv6Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkIpv6NetrangesResponseData ipv6NetworkIpv6Netranges(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkIpv6NetrangesRequestData body);

  /**
   * Get relations to IPv6 netrange entities
   * Similar to <code>ipv6NetworkIpv6Netranges</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Ipv6Netranges?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkIpv6NetrangesResponseData> ipv6NetworkIpv6NetrangesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkIpv6NetrangesRequestData body);


  /**
   * Get relations to IPv6 netrange entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkIpv6Netranges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkIpv6NetrangesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkIpv6NetrangesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Ipv6Netranges?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkIpv6NetrangesResponseData ipv6NetworkIpv6Netranges(@Param("elid") String elid, Ipv6NetworkIpv6NetrangesRequestData body, @QueryMap(encoded=true) Ipv6NetworkIpv6NetrangesQueryParams queryParams);

  /**
  * Get relations to IPv6 netrange entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkIpv6Netranges</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkIpv6NetrangesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Ipv6Netranges?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkIpv6NetrangesResponseData> ipv6NetworkIpv6NetrangesWithHttpInfo(@Param("elid") String elid, Ipv6NetworkIpv6NetrangesRequestData body, @QueryMap(encoded=true) Ipv6NetworkIpv6NetrangesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkIpv6Netranges</code> method in a fluent style.
   */
  public static class Ipv6NetworkIpv6NetrangesQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkIpv6NetrangesQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkMaintenanceContractsResponseData ipv6NetworkMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>ipv6NetworkMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkMaintenanceContractsResponseData> ipv6NetworkMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkMaintenanceContractsResponseData ipv6NetworkMaintenanceContracts(@Param("elid") String elid, Ipv6NetworkMaintenanceContractsRequestData body, @QueryMap(encoded=true) Ipv6NetworkMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkMaintenanceContractsResponseData> ipv6NetworkMaintenanceContractsWithHttpInfo(@Param("elid") String elid, Ipv6NetworkMaintenanceContractsRequestData body, @QueryMap(encoded=true) Ipv6NetworkMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkMaintenanceContracts</code> method in a fluent style.
   */
  public static class Ipv6NetworkMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkNetMandatorResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/NetMandator?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkNetMandatorResponseData ipv6NetworkNetMandator(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkNetMandatorRequestData body);

  /**
   * Get relations to Net mandator entities
   * Similar to <code>ipv6NetworkNetMandator</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/NetMandator?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkNetMandatorResponseData> ipv6NetworkNetMandatorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkNetMandatorRequestData body);


  /**
   * Get relations to Net mandator entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkNetMandator</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkNetMandatorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkNetMandatorResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/NetMandator?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkNetMandatorResponseData ipv6NetworkNetMandator(@Param("elid") String elid, Ipv6NetworkNetMandatorRequestData body, @QueryMap(encoded=true) Ipv6NetworkNetMandatorQueryParams queryParams);

  /**
  * Get relations to Net mandator entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkNetMandator</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkNetMandatorResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/NetMandator?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkNetMandatorResponseData> ipv6NetworkNetMandatorWithHttpInfo(@Param("elid") String elid, Ipv6NetworkNetMandatorRequestData body, @QueryMap(encoded=true) Ipv6NetworkNetMandatorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkNetMandator</code> method in a fluent style.
   */
  public static class Ipv6NetworkNetMandatorQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkNetMandatorQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkNetrangeNameResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/NetrangeName?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkNetrangeNameResponseData ipv6NetworkNetrangeName(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkNetrangeNameRequestData body);

  /**
   * Get relations to Netrange name entities
   * Similar to <code>ipv6NetworkNetrangeName</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/NetrangeName?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkNetrangeNameResponseData> ipv6NetworkNetrangeNameWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkNetrangeNameRequestData body);


  /**
   * Get relations to Netrange name entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkNetrangeName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkNetrangeNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkNetrangeNameResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/NetrangeName?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkNetrangeNameResponseData ipv6NetworkNetrangeName(@Param("elid") String elid, Ipv6NetworkNetrangeNameRequestData body, @QueryMap(encoded=true) Ipv6NetworkNetrangeNameQueryParams queryParams);

  /**
  * Get relations to Netrange name entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkNetrangeName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkNetrangeNameResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/NetrangeName?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkNetrangeNameResponseData> ipv6NetworkNetrangeNameWithHttpInfo(@Param("elid") String elid, Ipv6NetworkNetrangeNameRequestData body, @QueryMap(encoded=true) Ipv6NetworkNetrangeNameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkNetrangeName</code> method in a fluent style.
   */
  public static class Ipv6NetworkNetrangeNameQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkNetrangeNameQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkObjectsResponse ipv6NetworkObjects(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkObjectsRequest body);

  /**
   * Query Objects
   * Similar to <code>ipv6NetworkObjects</code> but it also returns the http response headers .
   * Query of the Objects
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkObjectsResponse> ipv6NetworkObjectsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkObjectsRequest body);


  /**
   * Query Objects
   * Query of the Objects
   * Note, this is equivalent to the other <code>ipv6NetworkObjects</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkObjectsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Objects?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkObjectsResponse ipv6NetworkObjects(@Param("elid") String elid, Ipv6NetworkObjectsRequest body, @QueryMap(encoded=true) Ipv6NetworkObjectsQueryParams queryParams);

  /**
  * Query Objects
  * Query of the Objects
  * Note, this is equivalent to the other <code>ipv6NetworkObjects</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkObjectsResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Objects?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkObjectsResponse> ipv6NetworkObjectsWithHttpInfo(@Param("elid") String elid, Ipv6NetworkObjectsRequest body, @QueryMap(encoded=true) Ipv6NetworkObjectsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkObjects</code> method in a fluent style.
   */
  public static class Ipv6NetworkObjectsQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkObjectsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkOrganizationsResponseData ipv6NetworkOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>ipv6NetworkOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkOrganizationsResponseData> ipv6NetworkOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkOrganizationsResponseData ipv6NetworkOrganizations(@Param("elid") String elid, Ipv6NetworkOrganizationsRequestData body, @QueryMap(encoded=true) Ipv6NetworkOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkOrganizationsResponseData> ipv6NetworkOrganizationsWithHttpInfo(@Param("elid") String elid, Ipv6NetworkOrganizationsRequestData body, @QueryMap(encoded=true) Ipv6NetworkOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkOrganizations</code> method in a fluent style.
   */
  public static class Ipv6NetworkOrganizationsQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkOrganizationsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkPersonGroupsResponseData ipv6NetworkPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>ipv6NetworkPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkPersonGroupsResponseData> ipv6NetworkPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkPersonGroupsResponseData ipv6NetworkPersonGroups(@Param("elid") String elid, Ipv6NetworkPersonGroupsRequestData body, @QueryMap(encoded=true) Ipv6NetworkPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkPersonGroupsResponseData> ipv6NetworkPersonGroupsWithHttpInfo(@Param("elid") String elid, Ipv6NetworkPersonGroupsRequestData body, @QueryMap(encoded=true) Ipv6NetworkPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkPersonGroups</code> method in a fluent style.
   */
  public static class Ipv6NetworkPersonGroupsQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkPersonGroupsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkPersonsResponseData ipv6NetworkPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>ipv6NetworkPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkPersonsResponseData> ipv6NetworkPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkPersonsResponseData ipv6NetworkPersons(@Param("elid") String elid, Ipv6NetworkPersonsRequestData body, @QueryMap(encoded=true) Ipv6NetworkPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkPersonsResponseData> ipv6NetworkPersonsWithHttpInfo(@Param("elid") String elid, Ipv6NetworkPersonsRequestData body, @QueryMap(encoded=true) Ipv6NetworkPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkPersons</code> method in a fluent style.
   */
  public static class Ipv6NetworkPersonsQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkPersonsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkPhysicalPortsDataResponseData ipv6NetworkPhysicalPortsData(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkPhysicalPortsDataRequestData body);

  /**
   * Get relations to Physical port (data) entities
   * Similar to <code>ipv6NetworkPhysicalPortsData</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkPhysicalPortsDataResponseData> ipv6NetworkPhysicalPortsDataWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkPhysicalPortsDataRequestData body);


  /**
   * Get relations to Physical port (data) entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkPhysicalPortsData</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkPhysicalPortsDataQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkPhysicalPortsDataResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/PhysicalPortsData?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkPhysicalPortsDataResponseData ipv6NetworkPhysicalPortsData(@Param("elid") String elid, Ipv6NetworkPhysicalPortsDataRequestData body, @QueryMap(encoded=true) Ipv6NetworkPhysicalPortsDataQueryParams queryParams);

  /**
  * Get relations to Physical port (data) entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkPhysicalPortsData</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkPhysicalPortsDataResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/PhysicalPortsData?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkPhysicalPortsDataResponseData> ipv6NetworkPhysicalPortsDataWithHttpInfo(@Param("elid") String elid, Ipv6NetworkPhysicalPortsDataRequestData body, @QueryMap(encoded=true) Ipv6NetworkPhysicalPortsDataQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkPhysicalPortsData</code> method in a fluent style.
   */
  public static class Ipv6NetworkPhysicalPortsDataQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkPhysicalPortsDataQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return Ipv6NetworkQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkQueryResponse ipv6NetworkQuery(@Param("sessionId") String sessionId, Ipv6NetworkQueryRequest body);

  /**
   * Basic query
   * Similar to <code>ipv6NetworkQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkQueryResponse> ipv6NetworkQueryWithHttpInfo(@Param("sessionId") String sessionId, Ipv6NetworkQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>ipv6NetworkQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkQueryResponse ipv6NetworkQuery(Ipv6NetworkQueryRequest body, @QueryMap(encoded=true) Ipv6NetworkQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>ipv6NetworkQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkQueryResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkQueryResponse> ipv6NetworkQueryWithHttpInfo(Ipv6NetworkQueryRequest body, @QueryMap(encoded=true) Ipv6NetworkQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkQuery</code> method in a fluent style.
   */
  public static class Ipv6NetworkQueryQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query system attributes
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv6NetworkSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkSystemAttributesResponse ipv6NetworkSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>ipv6NetworkSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkSystemAttributesResponse> ipv6NetworkSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>ipv6NetworkSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkSystemAttributesResponse ipv6NetworkSystemAttributes(@Param("elid") String elid, Ipv6NetworkSystemAttributesRequest body, @QueryMap(encoded=true) Ipv6NetworkSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>ipv6NetworkSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkSystemAttributesResponse> ipv6NetworkSystemAttributesWithHttpInfo(@Param("elid") String elid, Ipv6NetworkSystemAttributesRequest body, @QueryMap(encoded=true) Ipv6NetworkSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkSystemAttributes</code> method in a fluent style.
   */
  public static class Ipv6NetworkSystemAttributesQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkSystemAttributesQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkVlanResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Vlan?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkVlanResponseData ipv6NetworkVlan(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkVlanRequestData body);

  /**
   * Get relations to VLAN entities
   * Similar to <code>ipv6NetworkVlan</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Vlan?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkVlanResponseData> ipv6NetworkVlanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkVlanRequestData body);


  /**
   * Get relations to VLAN entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkVlan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkVlanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkVlanResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Vlan?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkVlanResponseData ipv6NetworkVlan(@Param("elid") String elid, Ipv6NetworkVlanRequestData body, @QueryMap(encoded=true) Ipv6NetworkVlanQueryParams queryParams);

  /**
  * Get relations to VLAN entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkVlan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkVlanResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Vlan?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkVlanResponseData> ipv6NetworkVlanWithHttpInfo(@Param("elid") String elid, Ipv6NetworkVlanRequestData body, @QueryMap(encoded=true) Ipv6NetworkVlanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkVlan</code> method in a fluent style.
   */
  public static class Ipv6NetworkVlanQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkVlanQueryParams sessionId(final String value) {
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
   * @return Ipv6NetworkZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetworkZonesResponseData ipv6NetworkZones(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkZonesRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>ipv6NetworkZones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetworkZonesResponseData> ipv6NetworkZonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetworkZonesRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetworkZones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetworkZonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetworkZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Zones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetworkZonesResponseData ipv6NetworkZones(@Param("elid") String elid, Ipv6NetworkZonesRequestData body, @QueryMap(encoded=true) Ipv6NetworkZonesQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetworkZones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetworkZonesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/Zones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetworkZonesResponseData> ipv6NetworkZonesWithHttpInfo(@Param("elid") String elid, Ipv6NetworkZonesRequestData body, @QueryMap(encoded=true) Ipv6NetworkZonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetworkZones</code> method in a fluent style.
   */
  public static class Ipv6NetworkZonesQueryParams extends HashMap<String, Object> {
    public Ipv6NetworkZonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify IPv6 network
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateIpv6NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateIpv6NetworkResponse updateIpv6Network(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateIpv6NetworkRequestData body);

  /**
   * Modify
   * Similar to <code>updateIpv6Network</code> but it also returns the http response headers .
   * Modify IPv6 network
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateIpv6NetworkResponse> updateIpv6NetworkWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateIpv6NetworkRequestData body);


  /**
   * Modify
   * Modify IPv6 network
   * Note, this is equivalent to the other <code>updateIpv6Network</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateIpv6NetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateIpv6NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateIpv6NetworkResponse updateIpv6Network(@Param("elid") String elid, UpdateIpv6NetworkRequestData body, @QueryMap(encoded=true) UpdateIpv6NetworkQueryParams queryParams);

  /**
  * Modify
  * Modify IPv6 network
  * Note, this is equivalent to the other <code>updateIpv6Network</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateIpv6NetworkResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateIpv6NetworkResponse> updateIpv6NetworkWithHttpInfo(@Param("elid") String elid, UpdateIpv6NetworkRequestData body, @QueryMap(encoded=true) UpdateIpv6NetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateIpv6Network</code> method in a fluent style.
   */
  public static class UpdateIpv6NetworkQueryParams extends HashMap<String, Object> {
    public UpdateIpv6NetworkQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Change system attributes
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSystemAttributesIpv6NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesIpv6NetworkResponse updateSystemAttributesIpv6Network(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesIpv6NetworkRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesIpv6Network</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesIpv6NetworkResponse> updateSystemAttributesIpv6NetworkWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesIpv6NetworkRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesIpv6Network</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesIpv6NetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesIpv6NetworkResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesIpv6NetworkResponse updateSystemAttributesIpv6Network(@Param("elid") String elid, UpdateSystemAttributesIpv6NetworkRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesIpv6NetworkQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesIpv6Network</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesIpv6NetworkResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Network/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesIpv6NetworkResponse> updateSystemAttributesIpv6NetworkWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesIpv6NetworkRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesIpv6NetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesIpv6Network</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesIpv6NetworkQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesIpv6NetworkQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
