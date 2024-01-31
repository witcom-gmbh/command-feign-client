package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateIpv4NetrangeRequestData;
import com.fntsoftware.businessgateway.entities.CreateIpv4NetrangeResponse;
import com.fntsoftware.businessgateway.entities.DeleteIpv4NetrangeRequestData;
import com.fntsoftware.businessgateway.entities.DeleteIpv4NetrangeResponse;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeDomainRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeDomainResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeIpv4NetworkRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeIpv4NetworkResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeNetrangeNameRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeNetrangeNameResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeObjectsRequest;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeObjectsResponse;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangePersonsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangePersonsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeQueryRequest;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeQueryResponse;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeVirtualNasServersRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeVirtualNasServersResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeVirtualServersRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeVirtualServersResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeVirtualSwitchesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeVirtualSwitchesResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeZonesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4NetrangeZonesResponseData;
import com.fntsoftware.businessgateway.entities.UpdateIpv4NetrangeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateIpv4NetrangeResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesIpv4NetrangeRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesIpv4NetrangeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface Ipv4NetrangeApi extends ApiClient.Api {


  /**
   * Create
   * Create IPv4 netrange
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateIpv4NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateIpv4NetrangeResponse createIpv4Netrange(@Param("sessionId") String sessionId, CreateIpv4NetrangeRequestData body);

  /**
   * Create
   * Similar to <code>createIpv4Netrange</code> but it also returns the http response headers .
   * Create IPv4 netrange
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateIpv4NetrangeResponse> createIpv4NetrangeWithHttpInfo(@Param("sessionId") String sessionId, CreateIpv4NetrangeRequestData body);


  /**
   * Create
   * Create IPv4 netrange
   * Note, this is equivalent to the other <code>createIpv4Netrange</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateIpv4NetrangeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateIpv4NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateIpv4NetrangeResponse createIpv4Netrange(CreateIpv4NetrangeRequestData body, @QueryMap(encoded=true) CreateIpv4NetrangeQueryParams queryParams);

  /**
  * Create
  * Create IPv4 netrange
  * Note, this is equivalent to the other <code>createIpv4Netrange</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateIpv4NetrangeResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateIpv4NetrangeResponse> createIpv4NetrangeWithHttpInfo(CreateIpv4NetrangeRequestData body, @QueryMap(encoded=true) CreateIpv4NetrangeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createIpv4Netrange</code> method in a fluent style.
   */
  public static class CreateIpv4NetrangeQueryParams extends HashMap<String, Object> {
    public CreateIpv4NetrangeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete IPv4 netrange
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteIpv4NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteIpv4NetrangeResponse deleteIpv4Netrange(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteIpv4NetrangeRequestData body);

  /**
   * Delete
   * Similar to <code>deleteIpv4Netrange</code> but it also returns the http response headers .
   * Delete IPv4 netrange
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteIpv4NetrangeResponse> deleteIpv4NetrangeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteIpv4NetrangeRequestData body);


  /**
   * Delete
   * Delete IPv4 netrange
   * Note, this is equivalent to the other <code>deleteIpv4Netrange</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteIpv4NetrangeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteIpv4NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteIpv4NetrangeResponse deleteIpv4Netrange(@Param("elid") String elid, DeleteIpv4NetrangeRequestData body, @QueryMap(encoded=true) DeleteIpv4NetrangeQueryParams queryParams);

  /**
  * Delete
  * Delete IPv4 netrange
  * Note, this is equivalent to the other <code>deleteIpv4Netrange</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteIpv4NetrangeResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteIpv4NetrangeResponse> deleteIpv4NetrangeWithHttpInfo(@Param("elid") String elid, DeleteIpv4NetrangeRequestData body, @QueryMap(encoded=true) DeleteIpv4NetrangeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteIpv4Netrange</code> method in a fluent style.
   */
  public static class DeleteIpv4NetrangeQueryParams extends HashMap<String, Object> {
    public DeleteIpv4NetrangeQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeContractsResponseData ipv4NetrangeContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>ipv4NetrangeContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeContractsResponseData> ipv4NetrangeContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangeContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeContractsResponseData ipv4NetrangeContracts(@Param("elid") String elid, Ipv4NetrangeContractsRequestData body, @QueryMap(encoded=true) Ipv4NetrangeContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangeContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeContractsResponseData> ipv4NetrangeContractsWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeContractsRequestData body, @QueryMap(encoded=true) Ipv4NetrangeContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeContracts</code> method in a fluent style.
   */
  public static class Ipv4NetrangeContractsQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeContractsQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeDevicesAllResponseData ipv4NetrangeDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>ipv4NetrangeDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeDevicesAllResponseData> ipv4NetrangeDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangeDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeDevicesAllResponseData ipv4NetrangeDevicesAll(@Param("elid") String elid, Ipv4NetrangeDevicesAllRequestData body, @QueryMap(encoded=true) Ipv4NetrangeDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangeDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeDevicesAllResponseData> ipv4NetrangeDevicesAllWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeDevicesAllRequestData body, @QueryMap(encoded=true) Ipv4NetrangeDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeDevicesAll</code> method in a fluent style.
   */
  public static class Ipv4NetrangeDevicesAllQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeDevicesAllQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeDomainResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Domain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeDomainResponseData ipv4NetrangeDomain(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeDomainRequestData body);

  /**
   * Get relations to Domain entities
   * Similar to <code>ipv4NetrangeDomain</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Domain?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeDomainResponseData> ipv4NetrangeDomainWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeDomainRequestData body);


  /**
   * Get relations to Domain entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangeDomain</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeDomainQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeDomainResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Domain?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeDomainResponseData ipv4NetrangeDomain(@Param("elid") String elid, Ipv4NetrangeDomainRequestData body, @QueryMap(encoded=true) Ipv4NetrangeDomainQueryParams queryParams);

  /**
  * Get relations to Domain entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangeDomain</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeDomainResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Domain?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeDomainResponseData> ipv4NetrangeDomainWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeDomainRequestData body, @QueryMap(encoded=true) Ipv4NetrangeDomainQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeDomain</code> method in a fluent style.
   */
  public static class Ipv4NetrangeDomainQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeDomainQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeFrameContractsResponseData ipv4NetrangeFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>ipv4NetrangeFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeFrameContractsResponseData> ipv4NetrangeFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangeFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeFrameContractsResponseData ipv4NetrangeFrameContracts(@Param("elid") String elid, Ipv4NetrangeFrameContractsRequestData body, @QueryMap(encoded=true) Ipv4NetrangeFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangeFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeFrameContractsResponseData> ipv4NetrangeFrameContractsWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeFrameContractsRequestData body, @QueryMap(encoded=true) Ipv4NetrangeFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeFrameContracts</code> method in a fluent style.
   */
  public static class Ipv4NetrangeFrameContractsQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to IPv4 address entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv4NetrangeIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeIpv4AddressesResponseData ipv4NetrangeIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>ipv4NetrangeIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeIpv4AddressesResponseData> ipv4NetrangeIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangeIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeIpv4AddressesResponseData ipv4NetrangeIpv4Addresses(@Param("elid") String elid, Ipv4NetrangeIpv4AddressesRequestData body, @QueryMap(encoded=true) Ipv4NetrangeIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangeIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeIpv4AddressesResponseData> ipv4NetrangeIpv4AddressesWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeIpv4AddressesRequestData body, @QueryMap(encoded=true) Ipv4NetrangeIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeIpv4Addresses</code> method in a fluent style.
   */
  public static class Ipv4NetrangeIpv4AddressesQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeIpv4NetworkResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Ipv4Network?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeIpv4NetworkResponseData ipv4NetrangeIpv4Network(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeIpv4NetworkRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>ipv4NetrangeIpv4Network</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Ipv4Network?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeIpv4NetworkResponseData> ipv4NetrangeIpv4NetworkWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeIpv4NetworkRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangeIpv4Network</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeIpv4NetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeIpv4NetworkResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Ipv4Network?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeIpv4NetworkResponseData ipv4NetrangeIpv4Network(@Param("elid") String elid, Ipv4NetrangeIpv4NetworkRequestData body, @QueryMap(encoded=true) Ipv4NetrangeIpv4NetworkQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangeIpv4Network</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeIpv4NetworkResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Ipv4Network?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeIpv4NetworkResponseData> ipv4NetrangeIpv4NetworkWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeIpv4NetworkRequestData body, @QueryMap(encoded=true) Ipv4NetrangeIpv4NetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeIpv4Network</code> method in a fluent style.
   */
  public static class Ipv4NetrangeIpv4NetworkQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeIpv4NetworkQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeMaintenanceContractsResponseData ipv4NetrangeMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>ipv4NetrangeMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeMaintenanceContractsResponseData> ipv4NetrangeMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangeMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeMaintenanceContractsResponseData ipv4NetrangeMaintenanceContracts(@Param("elid") String elid, Ipv4NetrangeMaintenanceContractsRequestData body, @QueryMap(encoded=true) Ipv4NetrangeMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangeMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeMaintenanceContractsResponseData> ipv4NetrangeMaintenanceContractsWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeMaintenanceContractsRequestData body, @QueryMap(encoded=true) Ipv4NetrangeMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeMaintenanceContracts</code> method in a fluent style.
   */
  public static class Ipv4NetrangeMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeNetrangeNameResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/NetrangeName?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeNetrangeNameResponseData ipv4NetrangeNetrangeName(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeNetrangeNameRequestData body);

  /**
   * Get relations to Netrange name entities
   * Similar to <code>ipv4NetrangeNetrangeName</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/NetrangeName?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeNetrangeNameResponseData> ipv4NetrangeNetrangeNameWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeNetrangeNameRequestData body);


  /**
   * Get relations to Netrange name entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangeNetrangeName</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeNetrangeNameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeNetrangeNameResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/NetrangeName?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeNetrangeNameResponseData ipv4NetrangeNetrangeName(@Param("elid") String elid, Ipv4NetrangeNetrangeNameRequestData body, @QueryMap(encoded=true) Ipv4NetrangeNetrangeNameQueryParams queryParams);

  /**
  * Get relations to Netrange name entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangeNetrangeName</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeNetrangeNameResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/NetrangeName?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeNetrangeNameResponseData> ipv4NetrangeNetrangeNameWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeNetrangeNameRequestData body, @QueryMap(encoded=true) Ipv4NetrangeNetrangeNameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeNetrangeName</code> method in a fluent style.
   */
  public static class Ipv4NetrangeNetrangeNameQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeNetrangeNameQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeObjectsResponse ipv4NetrangeObjects(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeObjectsRequest body);

  /**
   * Query Objects
   * Similar to <code>ipv4NetrangeObjects</code> but it also returns the http response headers .
   * Query of the Objects
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeObjectsResponse> ipv4NetrangeObjectsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeObjectsRequest body);


  /**
   * Query Objects
   * Query of the Objects
   * Note, this is equivalent to the other <code>ipv4NetrangeObjects</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeObjectsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Objects?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeObjectsResponse ipv4NetrangeObjects(@Param("elid") String elid, Ipv4NetrangeObjectsRequest body, @QueryMap(encoded=true) Ipv4NetrangeObjectsQueryParams queryParams);

  /**
  * Query Objects
  * Query of the Objects
  * Note, this is equivalent to the other <code>ipv4NetrangeObjects</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeObjectsResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Objects?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeObjectsResponse> ipv4NetrangeObjectsWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeObjectsRequest body, @QueryMap(encoded=true) Ipv4NetrangeObjectsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeObjects</code> method in a fluent style.
   */
  public static class Ipv4NetrangeObjectsQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeObjectsQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeOrganizationsResponseData ipv4NetrangeOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>ipv4NetrangeOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeOrganizationsResponseData> ipv4NetrangeOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangeOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeOrganizationsResponseData ipv4NetrangeOrganizations(@Param("elid") String elid, Ipv4NetrangeOrganizationsRequestData body, @QueryMap(encoded=true) Ipv4NetrangeOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangeOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeOrganizationsResponseData> ipv4NetrangeOrganizationsWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeOrganizationsRequestData body, @QueryMap(encoded=true) Ipv4NetrangeOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeOrganizations</code> method in a fluent style.
   */
  public static class Ipv4NetrangeOrganizationsQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeOrganizationsQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangePersonGroupsResponseData ipv4NetrangePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>ipv4NetrangePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangePersonGroupsResponseData> ipv4NetrangePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangePersonGroupsResponseData ipv4NetrangePersonGroups(@Param("elid") String elid, Ipv4NetrangePersonGroupsRequestData body, @QueryMap(encoded=true) Ipv4NetrangePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangePersonGroupsResponseData> ipv4NetrangePersonGroupsWithHttpInfo(@Param("elid") String elid, Ipv4NetrangePersonGroupsRequestData body, @QueryMap(encoded=true) Ipv4NetrangePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangePersonGroups</code> method in a fluent style.
   */
  public static class Ipv4NetrangePersonGroupsQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangePersonGroupsQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangePersonsResponseData ipv4NetrangePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>ipv4NetrangePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangePersonsResponseData> ipv4NetrangePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangePersonsResponseData ipv4NetrangePersons(@Param("elid") String elid, Ipv4NetrangePersonsRequestData body, @QueryMap(encoded=true) Ipv4NetrangePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangePersonsResponseData> ipv4NetrangePersonsWithHttpInfo(@Param("elid") String elid, Ipv4NetrangePersonsRequestData body, @QueryMap(encoded=true) Ipv4NetrangePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangePersons</code> method in a fluent style.
   */
  public static class Ipv4NetrangePersonsQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return Ipv4NetrangeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeQueryResponse ipv4NetrangeQuery(@Param("sessionId") String sessionId, Ipv4NetrangeQueryRequest body);

  /**
   * Basic query
   * Similar to <code>ipv4NetrangeQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeQueryResponse> ipv4NetrangeQueryWithHttpInfo(@Param("sessionId") String sessionId, Ipv4NetrangeQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>ipv4NetrangeQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeQueryResponse ipv4NetrangeQuery(Ipv4NetrangeQueryRequest body, @QueryMap(encoded=true) Ipv4NetrangeQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>ipv4NetrangeQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeQueryResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeQueryResponse> ipv4NetrangeQueryWithHttpInfo(Ipv4NetrangeQueryRequest body, @QueryMap(encoded=true) Ipv4NetrangeQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeQuery</code> method in a fluent style.
   */
  public static class Ipv4NetrangeQueryQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeQueryQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeSystemAttributesResponse ipv4NetrangeSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>ipv4NetrangeSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeSystemAttributesResponse> ipv4NetrangeSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>ipv4NetrangeSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeSystemAttributesResponse ipv4NetrangeSystemAttributes(@Param("elid") String elid, Ipv4NetrangeSystemAttributesRequest body, @QueryMap(encoded=true) Ipv4NetrangeSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>ipv4NetrangeSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeSystemAttributesResponse> ipv4NetrangeSystemAttributesWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeSystemAttributesRequest body, @QueryMap(encoded=true) Ipv4NetrangeSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeSystemAttributes</code> method in a fluent style.
   */
  public static class Ipv4NetrangeSystemAttributesQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeSystemAttributesQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeVirtualNasServersResponseData ipv4NetrangeVirtualNasServers(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeVirtualNasServersRequestData body);

  /**
   * Get relations to Virtual NAS server entities
   * Similar to <code>ipv4NetrangeVirtualNasServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeVirtualNasServersResponseData> ipv4NetrangeVirtualNasServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeVirtualNasServersRequestData body);


  /**
   * Get relations to Virtual NAS server entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangeVirtualNasServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeVirtualNasServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeVirtualNasServersResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/VirtualNasServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeVirtualNasServersResponseData ipv4NetrangeVirtualNasServers(@Param("elid") String elid, Ipv4NetrangeVirtualNasServersRequestData body, @QueryMap(encoded=true) Ipv4NetrangeVirtualNasServersQueryParams queryParams);

  /**
  * Get relations to Virtual NAS server entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangeVirtualNasServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeVirtualNasServersResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/VirtualNasServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeVirtualNasServersResponseData> ipv4NetrangeVirtualNasServersWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeVirtualNasServersRequestData body, @QueryMap(encoded=true) Ipv4NetrangeVirtualNasServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeVirtualNasServers</code> method in a fluent style.
   */
  public static class Ipv4NetrangeVirtualNasServersQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeVirtualNasServersQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeVirtualServersResponseData ipv4NetrangeVirtualServers(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeVirtualServersRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>ipv4NetrangeVirtualServers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeVirtualServersResponseData> ipv4NetrangeVirtualServersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeVirtualServersRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangeVirtualServers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeVirtualServersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeVirtualServersResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/VirtualServers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeVirtualServersResponseData ipv4NetrangeVirtualServers(@Param("elid") String elid, Ipv4NetrangeVirtualServersRequestData body, @QueryMap(encoded=true) Ipv4NetrangeVirtualServersQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangeVirtualServers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeVirtualServersResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/VirtualServers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeVirtualServersResponseData> ipv4NetrangeVirtualServersWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeVirtualServersRequestData body, @QueryMap(encoded=true) Ipv4NetrangeVirtualServersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeVirtualServers</code> method in a fluent style.
   */
  public static class Ipv4NetrangeVirtualServersQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeVirtualServersQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeVirtualSwitchesResponseData ipv4NetrangeVirtualSwitches(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeVirtualSwitchesRequestData body);

  /**
   * Get relations to Virtual switch entities
   * Similar to <code>ipv4NetrangeVirtualSwitches</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeVirtualSwitchesResponseData> ipv4NetrangeVirtualSwitchesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeVirtualSwitchesRequestData body);


  /**
   * Get relations to Virtual switch entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangeVirtualSwitches</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeVirtualSwitchesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeVirtualSwitchesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/VirtualSwitches?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeVirtualSwitchesResponseData ipv4NetrangeVirtualSwitches(@Param("elid") String elid, Ipv4NetrangeVirtualSwitchesRequestData body, @QueryMap(encoded=true) Ipv4NetrangeVirtualSwitchesQueryParams queryParams);

  /**
  * Get relations to Virtual switch entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangeVirtualSwitches</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeVirtualSwitchesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/VirtualSwitches?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeVirtualSwitchesResponseData> ipv4NetrangeVirtualSwitchesWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeVirtualSwitchesRequestData body, @QueryMap(encoded=true) Ipv4NetrangeVirtualSwitchesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeVirtualSwitches</code> method in a fluent style.
   */
  public static class Ipv4NetrangeVirtualSwitchesQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeVirtualSwitchesQueryParams sessionId(final String value) {
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
   * @return Ipv4NetrangeZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4NetrangeZonesResponseData ipv4NetrangeZones(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeZonesRequestData body);

  /**
   * Get relations to Zone entities
   * Similar to <code>ipv4NetrangeZones</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Zones?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4NetrangeZonesResponseData> ipv4NetrangeZonesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4NetrangeZonesRequestData body);


  /**
   * Get relations to Zone entities
   * 
   * Note, this is equivalent to the other <code>ipv4NetrangeZones</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4NetrangeZonesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4NetrangeZonesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Zones?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4NetrangeZonesResponseData ipv4NetrangeZones(@Param("elid") String elid, Ipv4NetrangeZonesRequestData body, @QueryMap(encoded=true) Ipv4NetrangeZonesQueryParams queryParams);

  /**
  * Get relations to Zone entities
  * 
  * Note, this is equivalent to the other <code>ipv4NetrangeZones</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4NetrangeZonesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/Zones?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4NetrangeZonesResponseData> ipv4NetrangeZonesWithHttpInfo(@Param("elid") String elid, Ipv4NetrangeZonesRequestData body, @QueryMap(encoded=true) Ipv4NetrangeZonesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4NetrangeZones</code> method in a fluent style.
   */
  public static class Ipv4NetrangeZonesQueryParams extends HashMap<String, Object> {
    public Ipv4NetrangeZonesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify IPv4 netrange
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateIpv4NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateIpv4NetrangeResponse updateIpv4Netrange(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateIpv4NetrangeRequestData body);

  /**
   * Modify
   * Similar to <code>updateIpv4Netrange</code> but it also returns the http response headers .
   * Modify IPv4 netrange
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateIpv4NetrangeResponse> updateIpv4NetrangeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateIpv4NetrangeRequestData body);


  /**
   * Modify
   * Modify IPv4 netrange
   * Note, this is equivalent to the other <code>updateIpv4Netrange</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateIpv4NetrangeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateIpv4NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateIpv4NetrangeResponse updateIpv4Netrange(@Param("elid") String elid, UpdateIpv4NetrangeRequestData body, @QueryMap(encoded=true) UpdateIpv4NetrangeQueryParams queryParams);

  /**
  * Modify
  * Modify IPv4 netrange
  * Note, this is equivalent to the other <code>updateIpv4Netrange</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateIpv4NetrangeResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateIpv4NetrangeResponse> updateIpv4NetrangeWithHttpInfo(@Param("elid") String elid, UpdateIpv4NetrangeRequestData body, @QueryMap(encoded=true) UpdateIpv4NetrangeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateIpv4Netrange</code> method in a fluent style.
   */
  public static class UpdateIpv4NetrangeQueryParams extends HashMap<String, Object> {
    public UpdateIpv4NetrangeQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesIpv4NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesIpv4NetrangeResponse updateSystemAttributesIpv4Netrange(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesIpv4NetrangeRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesIpv4Netrange</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesIpv4NetrangeResponse> updateSystemAttributesIpv4NetrangeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesIpv4NetrangeRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesIpv4Netrange</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesIpv4NetrangeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesIpv4NetrangeResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesIpv4NetrangeResponse updateSystemAttributesIpv4Netrange(@Param("elid") String elid, UpdateSystemAttributesIpv4NetrangeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesIpv4NetrangeQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesIpv4Netrange</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesIpv4NetrangeResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Netrange/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesIpv4NetrangeResponse> updateSystemAttributesIpv4NetrangeWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesIpv4NetrangeRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesIpv4NetrangeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesIpv4Netrange</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesIpv4NetrangeQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesIpv4NetrangeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
