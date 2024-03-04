package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateViaNetIpv6AddressRequestData;
import com.fntsoftware.businessgateway.entities.CreateViaNetIpv6AddressResponse;
import com.fntsoftware.businessgateway.entities.CreateViaNetrangeIpv6AddressRequestData;
import com.fntsoftware.businessgateway.entities.CreateViaNetrangeIpv6AddressResponse;
import com.fntsoftware.businessgateway.entities.DeleteIpv6AddressRequestData;
import com.fntsoftware.businessgateway.entities.DeleteIpv6AddressResponse;
import com.fntsoftware.businessgateway.entities.Ipv6Address100049RequestData;
import com.fntsoftware.businessgateway.entities.Ipv6Address100049ResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressCustomBgpnbv6RequestData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressCustomBgpnbv6ResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressHostnameRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressHostnameResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressIpv6AddressesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressIpv6AddressesResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressIpv6NetrangeRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressIpv6NetrangeResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressIpv6NetworkRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressIpv6NetworkResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressObjectsRequest;
import com.fntsoftware.businessgateway.entities.Ipv6AddressObjectsResponse;
import com.fntsoftware.businessgateway.entities.Ipv6AddressOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressPersonsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressPersonsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv6AddressQueryRequest;
import com.fntsoftware.businessgateway.entities.Ipv6AddressQueryResponse;
import com.fntsoftware.businessgateway.entities.Ipv6AddressSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.Ipv6AddressSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateIpv6AddressRequestData;
import com.fntsoftware.businessgateway.entities.UpdateIpv6AddressResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesIpv6AddressRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesIpv6AddressResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface Ipv6AddressApi extends ApiClient.Api {


  /**
   * Create via network
   * Creates an IPv6 address by specifying an IPv6 network.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateViaNetIpv6AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/createViaNet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateViaNetIpv6AddressResponse createViaNetIpv6Address(@Param("sessionId") String sessionId, CreateViaNetIpv6AddressRequestData body);

  /**
   * Create via network
   * Similar to <code>createViaNetIpv6Address</code> but it also returns the http response headers .
   * Creates an IPv6 address by specifying an IPv6 network.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/createViaNet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateViaNetIpv6AddressResponse> createViaNetIpv6AddressWithHttpInfo(@Param("sessionId") String sessionId, CreateViaNetIpv6AddressRequestData body);


  /**
   * Create via network
   * Creates an IPv6 address by specifying an IPv6 network.
   * Note, this is equivalent to the other <code>createViaNetIpv6Address</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateViaNetIpv6AddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateViaNetIpv6AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/createViaNet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateViaNetIpv6AddressResponse createViaNetIpv6Address(CreateViaNetIpv6AddressRequestData body, @QueryMap(encoded=true) CreateViaNetIpv6AddressQueryParams queryParams);

  /**
  * Create via network
  * Creates an IPv6 address by specifying an IPv6 network.
  * Note, this is equivalent to the other <code>createViaNetIpv6Address</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateViaNetIpv6AddressResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/createViaNet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateViaNetIpv6AddressResponse> createViaNetIpv6AddressWithHttpInfo(CreateViaNetIpv6AddressRequestData body, @QueryMap(encoded=true) CreateViaNetIpv6AddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createViaNetIpv6Address</code> method in a fluent style.
   */
  public static class CreateViaNetIpv6AddressQueryParams extends HashMap<String, Object> {
    public CreateViaNetIpv6AddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create via network range
   * Creates an IPv6 address by specifying an IPv6 network range.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateViaNetrangeIpv6AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/createViaNetrange?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateViaNetrangeIpv6AddressResponse createViaNetrangeIpv6Address(@Param("sessionId") String sessionId, CreateViaNetrangeIpv6AddressRequestData body);

  /**
   * Create via network range
   * Similar to <code>createViaNetrangeIpv6Address</code> but it also returns the http response headers .
   * Creates an IPv6 address by specifying an IPv6 network range.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/createViaNetrange?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateViaNetrangeIpv6AddressResponse> createViaNetrangeIpv6AddressWithHttpInfo(@Param("sessionId") String sessionId, CreateViaNetrangeIpv6AddressRequestData body);


  /**
   * Create via network range
   * Creates an IPv6 address by specifying an IPv6 network range.
   * Note, this is equivalent to the other <code>createViaNetrangeIpv6Address</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateViaNetrangeIpv6AddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateViaNetrangeIpv6AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/createViaNetrange?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateViaNetrangeIpv6AddressResponse createViaNetrangeIpv6Address(CreateViaNetrangeIpv6AddressRequestData body, @QueryMap(encoded=true) CreateViaNetrangeIpv6AddressQueryParams queryParams);

  /**
  * Create via network range
  * Creates an IPv6 address by specifying an IPv6 network range.
  * Note, this is equivalent to the other <code>createViaNetrangeIpv6Address</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateViaNetrangeIpv6AddressResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/createViaNetrange?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateViaNetrangeIpv6AddressResponse> createViaNetrangeIpv6AddressWithHttpInfo(CreateViaNetrangeIpv6AddressRequestData body, @QueryMap(encoded=true) CreateViaNetrangeIpv6AddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createViaNetrangeIpv6Address</code> method in a fluent style.
   */
  public static class CreateViaNetrangeIpv6AddressQueryParams extends HashMap<String, Object> {
    public CreateViaNetrangeIpv6AddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete IPv6 address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteIpv6AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteIpv6AddressResponse deleteIpv6Address(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteIpv6AddressRequestData body);

  /**
   * Delete
   * Similar to <code>deleteIpv6Address</code> but it also returns the http response headers .
   * Delete IPv6 address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteIpv6AddressResponse> deleteIpv6AddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteIpv6AddressRequestData body);


  /**
   * Delete
   * Delete IPv6 address
   * Note, this is equivalent to the other <code>deleteIpv6Address</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteIpv6AddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteIpv6AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteIpv6AddressResponse deleteIpv6Address(@Param("elid") String elid, DeleteIpv6AddressRequestData body, @QueryMap(encoded=true) DeleteIpv6AddressQueryParams queryParams);

  /**
  * Delete
  * Delete IPv6 address
  * Note, this is equivalent to the other <code>deleteIpv6Address</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteIpv6AddressResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteIpv6AddressResponse> deleteIpv6AddressWithHttpInfo(@Param("elid") String elid, DeleteIpv6AddressRequestData body, @QueryMap(encoded=true) DeleteIpv6AddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteIpv6Address</code> method in a fluent style.
   */
  public static class DeleteIpv6AddressQueryParams extends HashMap<String, Object> {
    public DeleteIpv6AddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to RADIUS-contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv6Address100049ResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/100049?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6Address100049ResponseData ipv6Address100049(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6Address100049RequestData body);

  /**
   * Get relations to RADIUS-contract entities
   * Similar to <code>ipv6Address100049</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/100049?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6Address100049ResponseData> ipv6Address100049WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6Address100049RequestData body);


  /**
   * Get relations to RADIUS-contract entities
   * 
   * Note, this is equivalent to the other <code>ipv6Address100049</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6Address100049QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6Address100049ResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/100049?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6Address100049ResponseData ipv6Address100049(@Param("elid") String elid, Ipv6Address100049RequestData body, @QueryMap(encoded=true) Ipv6Address100049QueryParams queryParams);

  /**
  * Get relations to RADIUS-contract entities
  * 
  * Note, this is equivalent to the other <code>ipv6Address100049</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6Address100049ResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/100049?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6Address100049ResponseData> ipv6Address100049WithHttpInfo(@Param("elid") String elid, Ipv6Address100049RequestData body, @QueryMap(encoded=true) Ipv6Address100049QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6Address100049</code> method in a fluent style.
   */
  public static class Ipv6Address100049QueryParams extends HashMap<String, Object> {
    public Ipv6Address100049QueryParams sessionId(final String value) {
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
   * @return Ipv6AddressContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressContractsResponseData ipv6AddressContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>ipv6AddressContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressContractsResponseData> ipv6AddressContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>ipv6AddressContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressContractsResponseData ipv6AddressContracts(@Param("elid") String elid, Ipv6AddressContractsRequestData body, @QueryMap(encoded=true) Ipv6AddressContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>ipv6AddressContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressContractsResponseData> ipv6AddressContractsWithHttpInfo(@Param("elid") String elid, Ipv6AddressContractsRequestData body, @QueryMap(encoded=true) Ipv6AddressContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressContracts</code> method in a fluent style.
   */
  public static class Ipv6AddressContractsQueryParams extends HashMap<String, Object> {
    public Ipv6AddressContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to BGP-Peering IPv4 entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv6AddressCustomBgpnbv6ResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/CustomBgpnbv6?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressCustomBgpnbv6ResponseData ipv6AddressCustomBgpnbv6(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressCustomBgpnbv6RequestData body);

  /**
   * Get relations to BGP-Peering IPv4 entities
   * Similar to <code>ipv6AddressCustomBgpnbv6</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/CustomBgpnbv6?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressCustomBgpnbv6ResponseData> ipv6AddressCustomBgpnbv6WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressCustomBgpnbv6RequestData body);


  /**
   * Get relations to BGP-Peering IPv4 entities
   * 
   * Note, this is equivalent to the other <code>ipv6AddressCustomBgpnbv6</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressCustomBgpnbv6QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressCustomBgpnbv6ResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/CustomBgpnbv6?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressCustomBgpnbv6ResponseData ipv6AddressCustomBgpnbv6(@Param("elid") String elid, Ipv6AddressCustomBgpnbv6RequestData body, @QueryMap(encoded=true) Ipv6AddressCustomBgpnbv6QueryParams queryParams);

  /**
  * Get relations to BGP-Peering IPv4 entities
  * 
  * Note, this is equivalent to the other <code>ipv6AddressCustomBgpnbv6</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressCustomBgpnbv6ResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/CustomBgpnbv6?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressCustomBgpnbv6ResponseData> ipv6AddressCustomBgpnbv6WithHttpInfo(@Param("elid") String elid, Ipv6AddressCustomBgpnbv6RequestData body, @QueryMap(encoded=true) Ipv6AddressCustomBgpnbv6QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressCustomBgpnbv6</code> method in a fluent style.
   */
  public static class Ipv6AddressCustomBgpnbv6QueryParams extends HashMap<String, Object> {
    public Ipv6AddressCustomBgpnbv6QueryParams sessionId(final String value) {
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
   * @return Ipv6AddressFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressFrameContractsResponseData ipv6AddressFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>ipv6AddressFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressFrameContractsResponseData> ipv6AddressFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>ipv6AddressFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressFrameContractsResponseData ipv6AddressFrameContracts(@Param("elid") String elid, Ipv6AddressFrameContractsRequestData body, @QueryMap(encoded=true) Ipv6AddressFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>ipv6AddressFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressFrameContractsResponseData> ipv6AddressFrameContractsWithHttpInfo(@Param("elid") String elid, Ipv6AddressFrameContractsRequestData body, @QueryMap(encoded=true) Ipv6AddressFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressFrameContracts</code> method in a fluent style.
   */
  public static class Ipv6AddressFrameContractsQueryParams extends HashMap<String, Object> {
    public Ipv6AddressFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Hostname entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv6AddressHostnameResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Hostname?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressHostnameResponseData ipv6AddressHostname(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressHostnameRequestData body);

  /**
   * Get relations to Hostname entities
   * Similar to <code>ipv6AddressHostname</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Hostname?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressHostnameResponseData> ipv6AddressHostnameWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressHostnameRequestData body);


  /**
   * Get relations to Hostname entities
   * 
   * Note, this is equivalent to the other <code>ipv6AddressHostname</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressHostnameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressHostnameResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Hostname?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressHostnameResponseData ipv6AddressHostname(@Param("elid") String elid, Ipv6AddressHostnameRequestData body, @QueryMap(encoded=true) Ipv6AddressHostnameQueryParams queryParams);

  /**
  * Get relations to Hostname entities
  * 
  * Note, this is equivalent to the other <code>ipv6AddressHostname</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressHostnameResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Hostname?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressHostnameResponseData> ipv6AddressHostnameWithHttpInfo(@Param("elid") String elid, Ipv6AddressHostnameRequestData body, @QueryMap(encoded=true) Ipv6AddressHostnameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressHostname</code> method in a fluent style.
   */
  public static class Ipv6AddressHostnameQueryParams extends HashMap<String, Object> {
    public Ipv6AddressHostnameQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Interface entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv6AddressInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressInterfacesResponseData ipv6AddressInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>ipv6AddressInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressInterfacesResponseData> ipv6AddressInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>ipv6AddressInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressInterfacesResponseData ipv6AddressInterfaces(@Param("elid") String elid, Ipv6AddressInterfacesRequestData body, @QueryMap(encoded=true) Ipv6AddressInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>ipv6AddressInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressInterfacesResponseData> ipv6AddressInterfacesWithHttpInfo(@Param("elid") String elid, Ipv6AddressInterfacesRequestData body, @QueryMap(encoded=true) Ipv6AddressInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressInterfaces</code> method in a fluent style.
   */
  public static class Ipv6AddressInterfacesQueryParams extends HashMap<String, Object> {
    public Ipv6AddressInterfacesQueryParams sessionId(final String value) {
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
   * @return Ipv6AddressIpv6AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressIpv6AddressesResponseData ipv6AddressIpv6Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressIpv6AddressesRequestData body);

  /**
   * Get relations to IPv6 address entities
   * Similar to <code>ipv6AddressIpv6Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressIpv6AddressesResponseData> ipv6AddressIpv6AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressIpv6AddressesRequestData body);


  /**
   * Get relations to IPv6 address entities
   * 
   * Note, this is equivalent to the other <code>ipv6AddressIpv6Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressIpv6AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressIpv6AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressIpv6AddressesResponseData ipv6AddressIpv6Addresses(@Param("elid") String elid, Ipv6AddressIpv6AddressesRequestData body, @QueryMap(encoded=true) Ipv6AddressIpv6AddressesQueryParams queryParams);

  /**
  * Get relations to IPv6 address entities
  * 
  * Note, this is equivalent to the other <code>ipv6AddressIpv6Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressIpv6AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Ipv6Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressIpv6AddressesResponseData> ipv6AddressIpv6AddressesWithHttpInfo(@Param("elid") String elid, Ipv6AddressIpv6AddressesRequestData body, @QueryMap(encoded=true) Ipv6AddressIpv6AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressIpv6Addresses</code> method in a fluent style.
   */
  public static class Ipv6AddressIpv6AddressesQueryParams extends HashMap<String, Object> {
    public Ipv6AddressIpv6AddressesQueryParams sessionId(final String value) {
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
   * @return Ipv6AddressIpv6NetrangeResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Ipv6Netrange?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressIpv6NetrangeResponseData ipv6AddressIpv6Netrange(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressIpv6NetrangeRequestData body);

  /**
   * Get relations to IPv6 netrange entities
   * Similar to <code>ipv6AddressIpv6Netrange</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Ipv6Netrange?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressIpv6NetrangeResponseData> ipv6AddressIpv6NetrangeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressIpv6NetrangeRequestData body);


  /**
   * Get relations to IPv6 netrange entities
   * 
   * Note, this is equivalent to the other <code>ipv6AddressIpv6Netrange</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressIpv6NetrangeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressIpv6NetrangeResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Ipv6Netrange?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressIpv6NetrangeResponseData ipv6AddressIpv6Netrange(@Param("elid") String elid, Ipv6AddressIpv6NetrangeRequestData body, @QueryMap(encoded=true) Ipv6AddressIpv6NetrangeQueryParams queryParams);

  /**
  * Get relations to IPv6 netrange entities
  * 
  * Note, this is equivalent to the other <code>ipv6AddressIpv6Netrange</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressIpv6NetrangeResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Ipv6Netrange?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressIpv6NetrangeResponseData> ipv6AddressIpv6NetrangeWithHttpInfo(@Param("elid") String elid, Ipv6AddressIpv6NetrangeRequestData body, @QueryMap(encoded=true) Ipv6AddressIpv6NetrangeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressIpv6Netrange</code> method in a fluent style.
   */
  public static class Ipv6AddressIpv6NetrangeQueryParams extends HashMap<String, Object> {
    public Ipv6AddressIpv6NetrangeQueryParams sessionId(final String value) {
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
   * @return Ipv6AddressIpv6NetworkResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Ipv6Network?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressIpv6NetworkResponseData ipv6AddressIpv6Network(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressIpv6NetworkRequestData body);

  /**
   * Get relations to IPv6 network entities
   * Similar to <code>ipv6AddressIpv6Network</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Ipv6Network?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressIpv6NetworkResponseData> ipv6AddressIpv6NetworkWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressIpv6NetworkRequestData body);


  /**
   * Get relations to IPv6 network entities
   * 
   * Note, this is equivalent to the other <code>ipv6AddressIpv6Network</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressIpv6NetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressIpv6NetworkResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Ipv6Network?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressIpv6NetworkResponseData ipv6AddressIpv6Network(@Param("elid") String elid, Ipv6AddressIpv6NetworkRequestData body, @QueryMap(encoded=true) Ipv6AddressIpv6NetworkQueryParams queryParams);

  /**
  * Get relations to IPv6 network entities
  * 
  * Note, this is equivalent to the other <code>ipv6AddressIpv6Network</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressIpv6NetworkResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Ipv6Network?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressIpv6NetworkResponseData> ipv6AddressIpv6NetworkWithHttpInfo(@Param("elid") String elid, Ipv6AddressIpv6NetworkRequestData body, @QueryMap(encoded=true) Ipv6AddressIpv6NetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressIpv6Network</code> method in a fluent style.
   */
  public static class Ipv6AddressIpv6NetworkQueryParams extends HashMap<String, Object> {
    public Ipv6AddressIpv6NetworkQueryParams sessionId(final String value) {
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
   * @return Ipv6AddressMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressMaintenanceContractsResponseData ipv6AddressMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>ipv6AddressMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressMaintenanceContractsResponseData> ipv6AddressMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>ipv6AddressMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressMaintenanceContractsResponseData ipv6AddressMaintenanceContracts(@Param("elid") String elid, Ipv6AddressMaintenanceContractsRequestData body, @QueryMap(encoded=true) Ipv6AddressMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>ipv6AddressMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressMaintenanceContractsResponseData> ipv6AddressMaintenanceContractsWithHttpInfo(@Param("elid") String elid, Ipv6AddressMaintenanceContractsRequestData body, @QueryMap(encoded=true) Ipv6AddressMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressMaintenanceContracts</code> method in a fluent style.
   */
  public static class Ipv6AddressMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public Ipv6AddressMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return Ipv6AddressObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressObjectsResponse ipv6AddressObjects(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressObjectsRequest body);

  /**
   * Query Objects
   * Similar to <code>ipv6AddressObjects</code> but it also returns the http response headers .
   * Query of the Objects
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressObjectsResponse> ipv6AddressObjectsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressObjectsRequest body);


  /**
   * Query Objects
   * Query of the Objects
   * Note, this is equivalent to the other <code>ipv6AddressObjects</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressObjectsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Objects?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressObjectsResponse ipv6AddressObjects(@Param("elid") String elid, Ipv6AddressObjectsRequest body, @QueryMap(encoded=true) Ipv6AddressObjectsQueryParams queryParams);

  /**
  * Query Objects
  * Query of the Objects
  * Note, this is equivalent to the other <code>ipv6AddressObjects</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressObjectsResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Objects?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressObjectsResponse> ipv6AddressObjectsWithHttpInfo(@Param("elid") String elid, Ipv6AddressObjectsRequest body, @QueryMap(encoded=true) Ipv6AddressObjectsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressObjects</code> method in a fluent style.
   */
  public static class Ipv6AddressObjectsQueryParams extends HashMap<String, Object> {
    public Ipv6AddressObjectsQueryParams sessionId(final String value) {
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
   * @return Ipv6AddressOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressOrganizationsResponseData ipv6AddressOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>ipv6AddressOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressOrganizationsResponseData> ipv6AddressOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>ipv6AddressOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressOrganizationsResponseData ipv6AddressOrganizations(@Param("elid") String elid, Ipv6AddressOrganizationsRequestData body, @QueryMap(encoded=true) Ipv6AddressOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>ipv6AddressOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressOrganizationsResponseData> ipv6AddressOrganizationsWithHttpInfo(@Param("elid") String elid, Ipv6AddressOrganizationsRequestData body, @QueryMap(encoded=true) Ipv6AddressOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressOrganizations</code> method in a fluent style.
   */
  public static class Ipv6AddressOrganizationsQueryParams extends HashMap<String, Object> {
    public Ipv6AddressOrganizationsQueryParams sessionId(final String value) {
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
   * @return Ipv6AddressPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressPersonGroupsResponseData ipv6AddressPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>ipv6AddressPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressPersonGroupsResponseData> ipv6AddressPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>ipv6AddressPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressPersonGroupsResponseData ipv6AddressPersonGroups(@Param("elid") String elid, Ipv6AddressPersonGroupsRequestData body, @QueryMap(encoded=true) Ipv6AddressPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>ipv6AddressPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressPersonGroupsResponseData> ipv6AddressPersonGroupsWithHttpInfo(@Param("elid") String elid, Ipv6AddressPersonGroupsRequestData body, @QueryMap(encoded=true) Ipv6AddressPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressPersonGroups</code> method in a fluent style.
   */
  public static class Ipv6AddressPersonGroupsQueryParams extends HashMap<String, Object> {
    public Ipv6AddressPersonGroupsQueryParams sessionId(final String value) {
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
   * @return Ipv6AddressPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressPersonsResponseData ipv6AddressPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>ipv6AddressPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressPersonsResponseData> ipv6AddressPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>ipv6AddressPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressPersonsResponseData ipv6AddressPersons(@Param("elid") String elid, Ipv6AddressPersonsRequestData body, @QueryMap(encoded=true) Ipv6AddressPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>ipv6AddressPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressPersonsResponseData> ipv6AddressPersonsWithHttpInfo(@Param("elid") String elid, Ipv6AddressPersonsRequestData body, @QueryMap(encoded=true) Ipv6AddressPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressPersons</code> method in a fluent style.
   */
  public static class Ipv6AddressPersonsQueryParams extends HashMap<String, Object> {
    public Ipv6AddressPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return Ipv6AddressQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressQueryResponse ipv6AddressQuery(@Param("sessionId") String sessionId, Ipv6AddressQueryRequest body);

  /**
   * Basic query
   * Similar to <code>ipv6AddressQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressQueryResponse> ipv6AddressQueryWithHttpInfo(@Param("sessionId") String sessionId, Ipv6AddressQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>ipv6AddressQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressQueryResponse ipv6AddressQuery(Ipv6AddressQueryRequest body, @QueryMap(encoded=true) Ipv6AddressQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>ipv6AddressQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressQueryResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressQueryResponse> ipv6AddressQueryWithHttpInfo(Ipv6AddressQueryRequest body, @QueryMap(encoded=true) Ipv6AddressQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressQuery</code> method in a fluent style.
   */
  public static class Ipv6AddressQueryQueryParams extends HashMap<String, Object> {
    public Ipv6AddressQueryQueryParams sessionId(final String value) {
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
   * @return Ipv6AddressSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv6AddressSystemAttributesResponse ipv6AddressSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>ipv6AddressSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv6AddressSystemAttributesResponse> ipv6AddressSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv6AddressSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>ipv6AddressSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv6AddressSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv6AddressSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv6AddressSystemAttributesResponse ipv6AddressSystemAttributes(@Param("elid") String elid, Ipv6AddressSystemAttributesRequest body, @QueryMap(encoded=true) Ipv6AddressSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>ipv6AddressSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv6AddressSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv6AddressSystemAttributesResponse> ipv6AddressSystemAttributesWithHttpInfo(@Param("elid") String elid, Ipv6AddressSystemAttributesRequest body, @QueryMap(encoded=true) Ipv6AddressSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv6AddressSystemAttributes</code> method in a fluent style.
   */
  public static class Ipv6AddressSystemAttributesQueryParams extends HashMap<String, Object> {
    public Ipv6AddressSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify IPv6 address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateIpv6AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateIpv6AddressResponse updateIpv6Address(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateIpv6AddressRequestData body);

  /**
   * Modify
   * Similar to <code>updateIpv6Address</code> but it also returns the http response headers .
   * Modify IPv6 address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateIpv6AddressResponse> updateIpv6AddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateIpv6AddressRequestData body);


  /**
   * Modify
   * Modify IPv6 address
   * Note, this is equivalent to the other <code>updateIpv6Address</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateIpv6AddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateIpv6AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateIpv6AddressResponse updateIpv6Address(@Param("elid") String elid, UpdateIpv6AddressRequestData body, @QueryMap(encoded=true) UpdateIpv6AddressQueryParams queryParams);

  /**
  * Modify
  * Modify IPv6 address
  * Note, this is equivalent to the other <code>updateIpv6Address</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateIpv6AddressResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateIpv6AddressResponse> updateIpv6AddressWithHttpInfo(@Param("elid") String elid, UpdateIpv6AddressRequestData body, @QueryMap(encoded=true) UpdateIpv6AddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateIpv6Address</code> method in a fluent style.
   */
  public static class UpdateIpv6AddressQueryParams extends HashMap<String, Object> {
    public UpdateIpv6AddressQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesIpv6AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesIpv6AddressResponse updateSystemAttributesIpv6Address(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesIpv6AddressRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesIpv6Address</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesIpv6AddressResponse> updateSystemAttributesIpv6AddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesIpv6AddressRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesIpv6Address</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesIpv6AddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesIpv6AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesIpv6AddressResponse updateSystemAttributesIpv6Address(@Param("elid") String elid, UpdateSystemAttributesIpv6AddressRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesIpv6AddressQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesIpv6Address</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesIpv6AddressResponse
      */
      @RequestLine("POST /api/rest/entity/ipv6Address/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesIpv6AddressResponse> updateSystemAttributesIpv6AddressWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesIpv6AddressRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesIpv6AddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesIpv6Address</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesIpv6AddressQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesIpv6AddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
