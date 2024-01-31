package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateIpv6NetrangeRequestData;
import com.fntsoftware.businessgateway.entities.CreateIpv6NetrangeResponse;
import com.fntsoftware.businessgateway.entities.DeleteIpv6NetrangeRequestData;
import com.fntsoftware.businessgateway.entities.DeleteIpv6NetrangeResponse;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeDomainRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeDomainResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeIpv6AddressesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeIpv6AddressesResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeIpv6NetworkRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeIpv6NetworkResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeNetrangeNameRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeNetrangeNameResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeObjectsRequest;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeObjectsResponse;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangePersonsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangePersonsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeQueryRequest;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeQueryResponse;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeVirtualNasServersRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeVirtualNasServersResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeZonesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6NetrangeZonesResponseData;
import com.fntsoftware.businessgateway.entities.UpdateIpv6NetrangeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateIpv6NetrangeResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesIpv6NetrangeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesIpv6NetrangeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface Ipv6NetrangeApi extends ApiClient.Api {


  /**
   * Create
   * Create IPv6 netrange
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateIpv6NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateIpv6NetrangeResponse createIpv6Netrange(@Param("sessionId") String sessionId, CreateIpv6NetrangeRequestData body);

  /**
   * Create
   * Similar to <code>createIpv6Netrange</code> but it also returns the http response headers .
   * Create IPv6 netrange
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateIpv6NetrangeResponse> createIpv6NetrangeWithHttpInfo(@Param("sessionId") String sessionId, CreateIpv6NetrangeRequestData body);


  /**
   * Create
   * Create IPv6 netrange
   * Note, this is equivalent to the other <code>createIpv6Netrange</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateIpv6NetrangeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateIpv6NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateIpv6NetrangeResponse createIpv6Netrange(CreateIpv6NetrangeRequestData body, @QueryMap(encoded=true) CreateIpv6NetrangeQueryParams queryParams);

  /**
  * Create
  * Create IPv6 netrange
  * Note, this is equivalent to the other <code>createIpv6Netrange</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateIpv6NetrangeResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateIpv6NetrangeResponse> createIpv6NetrangeWithHttpInfo(CreateIpv6NetrangeRequestData body, @QueryMap(encoded=true) CreateIpv6NetrangeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createIpv6Netrange</code> method in a fluent style.
   */
  public static class CreateIpv6NetrangeQueryParams extends HashMap<String, Object> {
    public CreateIpv6NetrangeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete IPv6 netrange
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteIpv6NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteIpv6NetrangeResponse deleteIpv6Netrange(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteIpv6NetrangeRequestData body);

  /**
   * Delete
   * Similar to <code>deleteIpv6Netrange</code> but it also returns the http response headers .
   * Delete IPv6 netrange
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteIpv6NetrangeResponse> deleteIpv6NetrangeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteIpv6NetrangeRequestData body);


  /**
   * Delete
   * Delete IPv6 netrange
   * Note, this is equivalent to the other <code>deleteIpv6Netrange</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteIpv6NetrangeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteIpv6NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteIpv6NetrangeResponse deleteIpv6Netrange(@Param("elid") String elid, DeleteIpv6NetrangeRequestData body, @QueryMap(encoded=true) DeleteIpv6NetrangeQueryParams queryParams);

  /**
  * Delete
  * Delete IPv6 netrange
  * Note, this is equivalent to the other <code>deleteIpv6Netrange</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteIpv6NetrangeResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteIpv6NetrangeResponse> deleteIpv6NetrangeWithHttpInfo(@Param("elid") String elid, DeleteIpv6NetrangeRequestData body, @QueryMap(encoded=true) DeleteIpv6NetrangeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteIpv6Netrange</code> method in a fluent style.
   */
  public static class DeleteIpv6NetrangeQueryParams extends HashMap<String, Object> {
    public DeleteIpv6NetrangeQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeContractsResponseData ipv6NetrangeContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>ipv6NetrangeContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeContractsResponseData> ipv6NetrangeContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangeContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeContractsResponseData ipv6NetrangeContracts(@Param("elid") String elid, Ipv6NetrangeContractsRequestData body, @QueryMap(encoded=true) Ipv6NetrangeContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangeContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeContractsResponseData> ipv6NetrangeContractsWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeContractsRequestData body, @QueryMap(encoded=true) Ipv6NetrangeContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeContracts</code> method in a fluent style.
   */
  public static class Ipv6NetrangeContractsQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeContractsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeDevicesAllResponseData ipv6NetrangeDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>ipv6NetrangeDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeDevicesAllResponseData> ipv6NetrangeDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangeDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeDevicesAllResponseData ipv6NetrangeDevicesAll(@Param("elid") String elid, Ipv6NetrangeDevicesAllRequestData body, @QueryMap(encoded=true) Ipv6NetrangeDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangeDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeDevicesAllResponseData> ipv6NetrangeDevicesAllWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeDevicesAllRequestData body, @QueryMap(encoded=true) Ipv6NetrangeDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeDevicesAll</code> method in a fluent style.
   */
  public static class Ipv6NetrangeDevicesAllQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeDevicesAllQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeDomainResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Domain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeDomainResponseData ipv6NetrangeDomain(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeDomainRequestData body);

  /**
   * Get relations to Domain entities
   * Similar to <code>ipv6NetrangeDomain</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Domain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeDomainResponseData> ipv6NetrangeDomainWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeDomainRequestData body);


  /**
   * Get relations to Domain entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangeDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeDomainResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Domain?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeDomainResponseData ipv6NetrangeDomain(@Param("elid") String elid, Ipv6NetrangeDomainRequestData body, @QueryMap(encoded=true) Ipv6NetrangeDomainQueryParams queryParams);

  /**
  * Get relations to Domain entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangeDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeDomainResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Domain?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeDomainResponseData> ipv6NetrangeDomainWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeDomainRequestData body, @QueryMap(encoded=true) Ipv6NetrangeDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeDomain</code> method in a fluent style.
   */
  public static class Ipv6NetrangeDomainQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeDomainQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeFrameContractsResponseData ipv6NetrangeFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>ipv6NetrangeFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeFrameContractsResponseData> ipv6NetrangeFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangeFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeFrameContractsResponseData ipv6NetrangeFrameContracts(@Param("elid") String elid, Ipv6NetrangeFrameContractsRequestData body, @QueryMap(encoded=true) Ipv6NetrangeFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangeFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeFrameContractsResponseData> ipv6NetrangeFrameContractsWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeFrameContractsRequestData body, @QueryMap(encoded=true) Ipv6NetrangeFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeFrameContracts</code> method in a fluent style.
   */
  public static class Ipv6NetrangeFrameContractsQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeFrameContractsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeIpv6AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeIpv6AddressesResponseData ipv6NetrangeIpv6Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeIpv6AddressesRequestData body);

  /**
   * Get relations to IPv6 address entities
   * Similar to <code>ipv6NetrangeIpv6Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeIpv6AddressesResponseData> ipv6NetrangeIpv6AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeIpv6AddressesRequestData body);


  /**
   * Get relations to IPv6 address entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangeIpv6Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeIpv6AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeIpv6AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeIpv6AddressesResponseData ipv6NetrangeIpv6Addresses(@Param("elid") String elid, Ipv6NetrangeIpv6AddressesRequestData body, @QueryMap(encoded=true) Ipv6NetrangeIpv6AddressesQueryParams queryParams);

  /**
  * Get relations to IPv6 address entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangeIpv6Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeIpv6AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Ipv6Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeIpv6AddressesResponseData> ipv6NetrangeIpv6AddressesWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeIpv6AddressesRequestData body, @QueryMap(encoded=true) Ipv6NetrangeIpv6AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeIpv6Addresses</code> method in a fluent style.
   */
  public static class Ipv6NetrangeIpv6AddressesQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeIpv6AddressesQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeIpv6NetworkResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Ipv6Network?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeIpv6NetworkResponseData ipv6NetrangeIpv6Network(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeIpv6NetworkRequestData body);

  /**
   * Get relations to IPv6 network entities
   * Similar to <code>ipv6NetrangeIpv6Network</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Ipv6Network?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeIpv6NetworkResponseData> ipv6NetrangeIpv6NetworkWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeIpv6NetworkRequestData body);


  /**
   * Get relations to IPv6 network entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangeIpv6Network</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeIpv6NetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeIpv6NetworkResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Ipv6Network?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeIpv6NetworkResponseData ipv6NetrangeIpv6Network(@Param("elid") String elid, Ipv6NetrangeIpv6NetworkRequestData body, @QueryMap(encoded=true) Ipv6NetrangeIpv6NetworkQueryParams queryParams);

  /**
  * Get relations to IPv6 network entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangeIpv6Network</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeIpv6NetworkResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Ipv6Network?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeIpv6NetworkResponseData> ipv6NetrangeIpv6NetworkWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeIpv6NetworkRequestData body, @QueryMap(encoded=true) Ipv6NetrangeIpv6NetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeIpv6Network</code> method in a fluent style.
   */
  public static class Ipv6NetrangeIpv6NetworkQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeIpv6NetworkQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeMaintenanceContractsResponseData ipv6NetrangeMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>ipv6NetrangeMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeMaintenanceContractsResponseData> ipv6NetrangeMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangeMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeMaintenanceContractsResponseData ipv6NetrangeMaintenanceContracts(@Param("elid") String elid, Ipv6NetrangeMaintenanceContractsRequestData body, @QueryMap(encoded=true) Ipv6NetrangeMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangeMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeMaintenanceContractsResponseData> ipv6NetrangeMaintenanceContractsWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeMaintenanceContractsRequestData body, @QueryMap(encoded=true) Ipv6NetrangeMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeMaintenanceContracts</code> method in a fluent style.
   */
  public static class Ipv6NetrangeMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeNetrangeNameResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/NetrangeName?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeNetrangeNameResponseData ipv6NetrangeNetrangeName(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeNetrangeNameRequestData body);

  /**
   * Get relations to Netrange name entities
   * Similar to <code>ipv6NetrangeNetrangeName</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/NetrangeName?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeNetrangeNameResponseData> ipv6NetrangeNetrangeNameWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeNetrangeNameRequestData body);


  /**
   * Get relations to Netrange name entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangeNetrangeName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeNetrangeNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeNetrangeNameResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/NetrangeName?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeNetrangeNameResponseData ipv6NetrangeNetrangeName(@Param("elid") String elid, Ipv6NetrangeNetrangeNameRequestData body, @QueryMap(encoded=true) Ipv6NetrangeNetrangeNameQueryParams queryParams);

  /**
  * Get relations to Netrange name entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangeNetrangeName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeNetrangeNameResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/NetrangeName?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeNetrangeNameResponseData> ipv6NetrangeNetrangeNameWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeNetrangeNameRequestData body, @QueryMap(encoded=true) Ipv6NetrangeNetrangeNameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeNetrangeName</code> method in a fluent style.
   */
  public static class Ipv6NetrangeNetrangeNameQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeNetrangeNameQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeObjectsResponse ipv6NetrangeObjects(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeObjectsRequest body);

  /**
   * Query Objects
   * Similar to <code>ipv6NetrangeObjects</code> but it also returns the http response headers .
   * Query of the Objects
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeObjectsResponse> ipv6NetrangeObjectsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeObjectsRequest body);


  /**
   * Query Objects
   * Query of the Objects
   * Note, this is equivalent to the other <code>ipv6NetrangeObjects</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeObjectsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Objects?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeObjectsResponse ipv6NetrangeObjects(@Param("elid") String elid, Ipv6NetrangeObjectsRequest body, @QueryMap(encoded=true) Ipv6NetrangeObjectsQueryParams queryParams);

  /**
  * Query Objects
  * Query of the Objects
  * Note, this is equivalent to the other <code>ipv6NetrangeObjects</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeObjectsResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Objects?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeObjectsResponse> ipv6NetrangeObjectsWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeObjectsRequest body, @QueryMap(encoded=true) Ipv6NetrangeObjectsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeObjects</code> method in a fluent style.
   */
  public static class Ipv6NetrangeObjectsQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeObjectsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeOrganizationsResponseData ipv6NetrangeOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>ipv6NetrangeOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeOrganizationsResponseData> ipv6NetrangeOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangeOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeOrganizationsResponseData ipv6NetrangeOrganizations(@Param("elid") String elid, Ipv6NetrangeOrganizationsRequestData body, @QueryMap(encoded=true) Ipv6NetrangeOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangeOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeOrganizationsResponseData> ipv6NetrangeOrganizationsWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeOrganizationsRequestData body, @QueryMap(encoded=true) Ipv6NetrangeOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeOrganizations</code> method in a fluent style.
   */
  public static class Ipv6NetrangeOrganizationsQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeOrganizationsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangePersonGroupsResponseData ipv6NetrangePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>ipv6NetrangePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangePersonGroupsResponseData> ipv6NetrangePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangePersonGroupsResponseData ipv6NetrangePersonGroups(@Param("elid") String elid, Ipv6NetrangePersonGroupsRequestData body, @QueryMap(encoded=true) Ipv6NetrangePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangePersonGroupsResponseData> ipv6NetrangePersonGroupsWithHttpInfo(@Param("elid") String elid, Ipv6NetrangePersonGroupsRequestData body, @QueryMap(encoded=true) Ipv6NetrangePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangePersonGroups</code> method in a fluent style.
   */
  public static class Ipv6NetrangePersonGroupsQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangePersonGroupsQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangePersonsResponseData ipv6NetrangePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>ipv6NetrangePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangePersonsResponseData> ipv6NetrangePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangePersonsResponseData ipv6NetrangePersons(@Param("elid") String elid, Ipv6NetrangePersonsRequestData body, @QueryMap(encoded=true) Ipv6NetrangePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangePersonsResponseData> ipv6NetrangePersonsWithHttpInfo(@Param("elid") String elid, Ipv6NetrangePersonsRequestData body, @QueryMap(encoded=true) Ipv6NetrangePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangePersons</code> method in a fluent style.
   */
  public static class Ipv6NetrangePersonsQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return Ipv6NetrangeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeQueryResponse ipv6NetrangeQuery(@Param("sessionId") String sessionId, Ipv6NetrangeQueryRequest body);

  /**
   * Basic query
   * Similar to <code>ipv6NetrangeQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeQueryResponse> ipv6NetrangeQueryWithHttpInfo(@Param("sessionId") String sessionId, Ipv6NetrangeQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>ipv6NetrangeQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeQueryResponse ipv6NetrangeQuery(Ipv6NetrangeQueryRequest body, @QueryMap(encoded=true) Ipv6NetrangeQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>ipv6NetrangeQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeQueryResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeQueryResponse> ipv6NetrangeQueryWithHttpInfo(Ipv6NetrangeQueryRequest body, @QueryMap(encoded=true) Ipv6NetrangeQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeQuery</code> method in a fluent style.
   */
  public static class Ipv6NetrangeQueryQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeQueryQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeSystemAttributesResponse ipv6NetrangeSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>ipv6NetrangeSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeSystemAttributesResponse> ipv6NetrangeSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>ipv6NetrangeSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeSystemAttributesResponse ipv6NetrangeSystemAttributes(@Param("elid") String elid, Ipv6NetrangeSystemAttributesRequest body, @QueryMap(encoded=true) Ipv6NetrangeSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>ipv6NetrangeSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeSystemAttributesResponse> ipv6NetrangeSystemAttributesWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeSystemAttributesRequest body, @QueryMap(encoded=true) Ipv6NetrangeSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeSystemAttributes</code> method in a fluent style.
   */
  public static class Ipv6NetrangeSystemAttributesQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeSystemAttributesQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeVirtualNasServersResponseData ipv6NetrangeVirtualNasServers(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeVirtualNasServersRequestData body);

  /**
   * Get relations to Virtual NAS server entities
   * Similar to <code>ipv6NetrangeVirtualNasServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeVirtualNasServersResponseData> ipv6NetrangeVirtualNasServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeVirtualNasServersRequestData body);


  /**
   * Get relations to Virtual NAS server entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangeVirtualNasServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeVirtualNasServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeVirtualNasServersResponseData ipv6NetrangeVirtualNasServers(@Param("elid") String elid, Ipv6NetrangeVirtualNasServersRequestData body, @QueryMap(encoded=true) Ipv6NetrangeVirtualNasServersQueryParams queryParams);

  /**
  * Get relations to Virtual NAS server entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangeVirtualNasServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeVirtualNasServersResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/VirtualNasServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeVirtualNasServersResponseData> ipv6NetrangeVirtualNasServersWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeVirtualNasServersRequestData body, @QueryMap(encoded=true) Ipv6NetrangeVirtualNasServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeVirtualNasServers</code> method in a fluent style.
   */
  public static class Ipv6NetrangeVirtualNasServersQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeVirtualNasServersQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeVirtualServersResponseData ipv6NetrangeVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>ipv6NetrangeVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeVirtualServersResponseData> ipv6NetrangeVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangeVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeVirtualServersResponseData ipv6NetrangeVirtualServers(@Param("elid") String elid, Ipv6NetrangeVirtualServersRequestData body, @QueryMap(encoded=true) Ipv6NetrangeVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangeVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeVirtualServersResponseData> ipv6NetrangeVirtualServersWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeVirtualServersRequestData body, @QueryMap(encoded=true) Ipv6NetrangeVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeVirtualServers</code> method in a fluent style.
   */
  public static class Ipv6NetrangeVirtualServersQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeVirtualServersQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeVirtualSwitchesResponseData ipv6NetrangeVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>ipv6NetrangeVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeVirtualSwitchesResponseData> ipv6NetrangeVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangeVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeVirtualSwitchesResponseData ipv6NetrangeVirtualSwitches(@Param("elid") String elid, Ipv6NetrangeVirtualSwitchesRequestData body, @QueryMap(encoded=true) Ipv6NetrangeVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangeVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeVirtualSwitchesResponseData> ipv6NetrangeVirtualSwitchesWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeVirtualSwitchesRequestData body, @QueryMap(encoded=true) Ipv6NetrangeVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeVirtualSwitches</code> method in a fluent style.
   */
  public static class Ipv6NetrangeVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return Ipv6NetrangeZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6NetrangeZonesResponseData ipv6NetrangeZones(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeZonesRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>ipv6NetrangeZones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6NetrangeZonesResponseData> ipv6NetrangeZonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6NetrangeZonesRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>ipv6NetrangeZones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6NetrangeZonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6NetrangeZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Zones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6NetrangeZonesResponseData ipv6NetrangeZones(@Param("elid") String elid, Ipv6NetrangeZonesRequestData body, @QueryMap(encoded=true) Ipv6NetrangeZonesQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>ipv6NetrangeZones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6NetrangeZonesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/Zones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6NetrangeZonesResponseData> ipv6NetrangeZonesWithHttpInfo(@Param("elid") String elid, Ipv6NetrangeZonesRequestData body, @QueryMap(encoded=true) Ipv6NetrangeZonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6NetrangeZones</code> method in a fluent style.
   */
  public static class Ipv6NetrangeZonesQueryParams extends HashMap<String, Object> {
    public Ipv6NetrangeZonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify IPv6 netrange
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateIpv6NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateIpv6NetrangeResponse updateIpv6Netrange(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateIpv6NetrangeRequestData body);

  /**
   * Modify
   * Similar to <code>updateIpv6Netrange</code> but it also returns the http response headers .
   * Modify IPv6 netrange
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateIpv6NetrangeResponse> updateIpv6NetrangeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateIpv6NetrangeRequestData body);


  /**
   * Modify
   * Modify IPv6 netrange
   * Note, this is equivalent to the other <code>updateIpv6Netrange</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateIpv6NetrangeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateIpv6NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateIpv6NetrangeResponse updateIpv6Netrange(@Param("elid") String elid, UpdateIpv6NetrangeRequestData body, @QueryMap(encoded=true) UpdateIpv6NetrangeQueryParams queryParams);

  /**
  * Modify
  * Modify IPv6 netrange
  * Note, this is equivalent to the other <code>updateIpv6Netrange</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateIpv6NetrangeResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateIpv6NetrangeResponse> updateIpv6NetrangeWithHttpInfo(@Param("elid") String elid, UpdateIpv6NetrangeRequestData body, @QueryMap(encoded=true) UpdateIpv6NetrangeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateIpv6Netrange</code> method in a fluent style.
   */
  public static class UpdateIpv6NetrangeQueryParams extends HashMap<String, Object> {
    public UpdateIpv6NetrangeQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesIpv6NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesIpv6NetrangeResponse updateSystemAttributesIpv6Netrange(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesIpv6NetrangeRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesIpv6Netrange</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesIpv6NetrangeResponse> updateSystemAttributesIpv6NetrangeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesIpv6NetrangeRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesIpv6Netrange</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesIpv6NetrangeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesIpv6NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesIpv6NetrangeResponse updateSystemAttributesIpv6Netrange(@Param("elid") String elid, UpdateSystemAttributesIpv6NetrangeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesIpv6NetrangeQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesIpv6Netrange</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesIpv6NetrangeResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Netrange/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesIpv6NetrangeResponse> updateSystemAttributesIpv6NetrangeWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesIpv6NetrangeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesIpv6NetrangeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesIpv6Netrange</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesIpv6NetrangeQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesIpv6NetrangeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
