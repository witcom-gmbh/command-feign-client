package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateViaNetIpv4AddressRequestData;
import com.fntsoftware.businessgateway.entities.CreateViaNetIpv4AddressResponse;
import com.fntsoftware.businessgateway.entities.CreateViaNetrangeIpv4AddressRequestData;
import com.fntsoftware.businessgateway.entities.CreateViaNetrangeIpv4AddressResponse;
import com.fntsoftware.businessgateway.entities.DeleteIpv4AddressRequestData;
import com.fntsoftware.businessgateway.entities.DeleteIpv4AddressResponse;
import com.fntsoftware.businessgateway.entities.Ipv4Address100048RequestData;
import com.fntsoftware.businessgateway.entities.Ipv4Address100048ResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressCustomBgpnbv4RequestData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressCustomBgpnbv4ResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressHostnameRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressHostnameResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressInterfacesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressInterfacesResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressIpv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressIpv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressIpv4NetrangeRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressIpv4NetrangeResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressIpv4NetworkRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressIpv4NetworkResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressObjectsRequest;
import com.fntsoftware.businessgateway.entities.Ipv4AddressObjectsResponse;
import com.fntsoftware.businessgateway.entities.Ipv4AddressOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressPersonsRequestData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressPersonsResponseData;
import com.fntsoftware.businessgateway.entities.Ipv4AddressQueryRequest;
import com.fntsoftware.businessgateway.entities.Ipv4AddressQueryResponse;
import com.fntsoftware.businessgateway.entities.Ipv4AddressSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.Ipv4AddressSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateIpv4AddressRequestData;
import com.fntsoftware.businessgateway.entities.UpdateIpv4AddressResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesIpv4AddressRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesIpv4AddressResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface Ipv4AddressApi extends ApiClient.Api {


  /**
   * Create via network
   * Creates an IPv4 address via an IPv4 net
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateViaNetIpv4AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/createViaNet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateViaNetIpv4AddressResponse createViaNetIpv4Address(@Param("sessionId") String sessionId, CreateViaNetIpv4AddressRequestData body);

  /**
   * Create via network
   * Similar to <code>createViaNetIpv4Address</code> but it also returns the http response headers .
   * Creates an IPv4 address via an IPv4 net
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/createViaNet?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateViaNetIpv4AddressResponse> createViaNetIpv4AddressWithHttpInfo(@Param("sessionId") String sessionId, CreateViaNetIpv4AddressRequestData body);


  /**
   * Create via network
   * Creates an IPv4 address via an IPv4 net
   * Note, this is equivalent to the other <code>createViaNetIpv4Address</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateViaNetIpv4AddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateViaNetIpv4AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/createViaNet?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateViaNetIpv4AddressResponse createViaNetIpv4Address(CreateViaNetIpv4AddressRequestData body, @QueryMap(encoded=true) CreateViaNetIpv4AddressQueryParams queryParams);

  /**
  * Create via network
  * Creates an IPv4 address via an IPv4 net
  * Note, this is equivalent to the other <code>createViaNetIpv4Address</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateViaNetIpv4AddressResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/createViaNet?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateViaNetIpv4AddressResponse> createViaNetIpv4AddressWithHttpInfo(CreateViaNetIpv4AddressRequestData body, @QueryMap(encoded=true) CreateViaNetIpv4AddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createViaNetIpv4Address</code> method in a fluent style.
   */
  public static class CreateViaNetIpv4AddressQueryParams extends HashMap<String, Object> {
    public CreateViaNetIpv4AddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create via network range
   * Creates an IPv4 address via an IPv4 netrange
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateViaNetrangeIpv4AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/createViaNetrange?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateViaNetrangeIpv4AddressResponse createViaNetrangeIpv4Address(@Param("sessionId") String sessionId, CreateViaNetrangeIpv4AddressRequestData body);

  /**
   * Create via network range
   * Similar to <code>createViaNetrangeIpv4Address</code> but it also returns the http response headers .
   * Creates an IPv4 address via an IPv4 netrange
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/createViaNetrange?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateViaNetrangeIpv4AddressResponse> createViaNetrangeIpv4AddressWithHttpInfo(@Param("sessionId") String sessionId, CreateViaNetrangeIpv4AddressRequestData body);


  /**
   * Create via network range
   * Creates an IPv4 address via an IPv4 netrange
   * Note, this is equivalent to the other <code>createViaNetrangeIpv4Address</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateViaNetrangeIpv4AddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateViaNetrangeIpv4AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/createViaNetrange?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateViaNetrangeIpv4AddressResponse createViaNetrangeIpv4Address(CreateViaNetrangeIpv4AddressRequestData body, @QueryMap(encoded=true) CreateViaNetrangeIpv4AddressQueryParams queryParams);

  /**
  * Create via network range
  * Creates an IPv4 address via an IPv4 netrange
  * Note, this is equivalent to the other <code>createViaNetrangeIpv4Address</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateViaNetrangeIpv4AddressResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/createViaNetrange?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateViaNetrangeIpv4AddressResponse> createViaNetrangeIpv4AddressWithHttpInfo(CreateViaNetrangeIpv4AddressRequestData body, @QueryMap(encoded=true) CreateViaNetrangeIpv4AddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createViaNetrangeIpv4Address</code> method in a fluent style.
   */
  public static class CreateViaNetrangeIpv4AddressQueryParams extends HashMap<String, Object> {
    public CreateViaNetrangeIpv4AddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete IPv4 address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteIpv4AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteIpv4AddressResponse deleteIpv4Address(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteIpv4AddressRequestData body);

  /**
   * Delete
   * Similar to <code>deleteIpv4Address</code> but it also returns the http response headers .
   * Delete IPv4 address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteIpv4AddressResponse> deleteIpv4AddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteIpv4AddressRequestData body);


  /**
   * Delete
   * Delete IPv4 address
   * Note, this is equivalent to the other <code>deleteIpv4Address</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteIpv4AddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteIpv4AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteIpv4AddressResponse deleteIpv4Address(@Param("elid") String elid, DeleteIpv4AddressRequestData body, @QueryMap(encoded=true) DeleteIpv4AddressQueryParams queryParams);

  /**
  * Delete
  * Delete IPv4 address
  * Note, this is equivalent to the other <code>deleteIpv4Address</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteIpv4AddressResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteIpv4AddressResponse> deleteIpv4AddressWithHttpInfo(@Param("elid") String elid, DeleteIpv4AddressRequestData body, @QueryMap(encoded=true) DeleteIpv4AddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteIpv4Address</code> method in a fluent style.
   */
  public static class DeleteIpv4AddressQueryParams extends HashMap<String, Object> {
    public DeleteIpv4AddressQueryParams sessionId(final String value) {
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
   * @return Ipv4Address100048ResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/100048?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4Address100048ResponseData ipv4Address100048(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4Address100048RequestData body);

  /**
   * Get relations to RADIUS-contract entities
   * Similar to <code>ipv4Address100048</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/100048?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4Address100048ResponseData> ipv4Address100048WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4Address100048RequestData body);


  /**
   * Get relations to RADIUS-contract entities
   * 
   * Note, this is equivalent to the other <code>ipv4Address100048</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4Address100048QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4Address100048ResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/100048?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4Address100048ResponseData ipv4Address100048(@Param("elid") String elid, Ipv4Address100048RequestData body, @QueryMap(encoded=true) Ipv4Address100048QueryParams queryParams);

  /**
  * Get relations to RADIUS-contract entities
  * 
  * Note, this is equivalent to the other <code>ipv4Address100048</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4Address100048ResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/100048?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4Address100048ResponseData> ipv4Address100048WithHttpInfo(@Param("elid") String elid, Ipv4Address100048RequestData body, @QueryMap(encoded=true) Ipv4Address100048QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4Address100048</code> method in a fluent style.
   */
  public static class Ipv4Address100048QueryParams extends HashMap<String, Object> {
    public Ipv4Address100048QueryParams sessionId(final String value) {
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
   * @return Ipv4AddressContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressContractsResponseData ipv4AddressContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>ipv4AddressContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressContractsResponseData> ipv4AddressContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>ipv4AddressContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressContractsResponseData ipv4AddressContracts(@Param("elid") String elid, Ipv4AddressContractsRequestData body, @QueryMap(encoded=true) Ipv4AddressContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>ipv4AddressContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressContractsResponseData> ipv4AddressContractsWithHttpInfo(@Param("elid") String elid, Ipv4AddressContractsRequestData body, @QueryMap(encoded=true) Ipv4AddressContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressContracts</code> method in a fluent style.
   */
  public static class Ipv4AddressContractsQueryParams extends HashMap<String, Object> {
    public Ipv4AddressContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to BGP-Peer IPv4 entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return Ipv4AddressCustomBgpnbv4ResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/CustomBgpnbv4?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressCustomBgpnbv4ResponseData ipv4AddressCustomBgpnbv4(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressCustomBgpnbv4RequestData body);

  /**
   * Get relations to BGP-Peer IPv4 entities
   * Similar to <code>ipv4AddressCustomBgpnbv4</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/CustomBgpnbv4?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressCustomBgpnbv4ResponseData> ipv4AddressCustomBgpnbv4WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressCustomBgpnbv4RequestData body);


  /**
   * Get relations to BGP-Peer IPv4 entities
   * 
   * Note, this is equivalent to the other <code>ipv4AddressCustomBgpnbv4</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressCustomBgpnbv4QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressCustomBgpnbv4ResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/CustomBgpnbv4?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressCustomBgpnbv4ResponseData ipv4AddressCustomBgpnbv4(@Param("elid") String elid, Ipv4AddressCustomBgpnbv4RequestData body, @QueryMap(encoded=true) Ipv4AddressCustomBgpnbv4QueryParams queryParams);

  /**
  * Get relations to BGP-Peer IPv4 entities
  * 
  * Note, this is equivalent to the other <code>ipv4AddressCustomBgpnbv4</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressCustomBgpnbv4ResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/CustomBgpnbv4?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressCustomBgpnbv4ResponseData> ipv4AddressCustomBgpnbv4WithHttpInfo(@Param("elid") String elid, Ipv4AddressCustomBgpnbv4RequestData body, @QueryMap(encoded=true) Ipv4AddressCustomBgpnbv4QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressCustomBgpnbv4</code> method in a fluent style.
   */
  public static class Ipv4AddressCustomBgpnbv4QueryParams extends HashMap<String, Object> {
    public Ipv4AddressCustomBgpnbv4QueryParams sessionId(final String value) {
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
   * @return Ipv4AddressFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressFrameContractsResponseData ipv4AddressFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>ipv4AddressFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressFrameContractsResponseData> ipv4AddressFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>ipv4AddressFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressFrameContractsResponseData ipv4AddressFrameContracts(@Param("elid") String elid, Ipv4AddressFrameContractsRequestData body, @QueryMap(encoded=true) Ipv4AddressFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>ipv4AddressFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressFrameContractsResponseData> ipv4AddressFrameContractsWithHttpInfo(@Param("elid") String elid, Ipv4AddressFrameContractsRequestData body, @QueryMap(encoded=true) Ipv4AddressFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressFrameContracts</code> method in a fluent style.
   */
  public static class Ipv4AddressFrameContractsQueryParams extends HashMap<String, Object> {
    public Ipv4AddressFrameContractsQueryParams sessionId(final String value) {
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
   * @return Ipv4AddressHostnameResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Hostname?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressHostnameResponseData ipv4AddressHostname(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressHostnameRequestData body);

  /**
   * Get relations to Hostname entities
   * Similar to <code>ipv4AddressHostname</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Hostname?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressHostnameResponseData> ipv4AddressHostnameWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressHostnameRequestData body);


  /**
   * Get relations to Hostname entities
   * 
   * Note, this is equivalent to the other <code>ipv4AddressHostname</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressHostnameQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressHostnameResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Hostname?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressHostnameResponseData ipv4AddressHostname(@Param("elid") String elid, Ipv4AddressHostnameRequestData body, @QueryMap(encoded=true) Ipv4AddressHostnameQueryParams queryParams);

  /**
  * Get relations to Hostname entities
  * 
  * Note, this is equivalent to the other <code>ipv4AddressHostname</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressHostnameResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Hostname?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressHostnameResponseData> ipv4AddressHostnameWithHttpInfo(@Param("elid") String elid, Ipv4AddressHostnameRequestData body, @QueryMap(encoded=true) Ipv4AddressHostnameQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressHostname</code> method in a fluent style.
   */
  public static class Ipv4AddressHostnameQueryParams extends HashMap<String, Object> {
    public Ipv4AddressHostnameQueryParams sessionId(final String value) {
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
   * @return Ipv4AddressInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressInterfacesResponseData ipv4AddressInterfaces(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressInterfacesRequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>ipv4AddressInterfaces</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressInterfacesResponseData> ipv4AddressInterfacesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressInterfacesRequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>ipv4AddressInterfaces</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressInterfacesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressInterfacesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Interfaces?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressInterfacesResponseData ipv4AddressInterfaces(@Param("elid") String elid, Ipv4AddressInterfacesRequestData body, @QueryMap(encoded=true) Ipv4AddressInterfacesQueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>ipv4AddressInterfaces</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressInterfacesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Interfaces?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressInterfacesResponseData> ipv4AddressInterfacesWithHttpInfo(@Param("elid") String elid, Ipv4AddressInterfacesRequestData body, @QueryMap(encoded=true) Ipv4AddressInterfacesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressInterfaces</code> method in a fluent style.
   */
  public static class Ipv4AddressInterfacesQueryParams extends HashMap<String, Object> {
    public Ipv4AddressInterfacesQueryParams sessionId(final String value) {
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
   * @return Ipv4AddressIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressIpv4AddressesResponseData ipv4AddressIpv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressIpv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>ipv4AddressIpv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressIpv4AddressesResponseData> ipv4AddressIpv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressIpv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>ipv4AddressIpv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressIpv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressIpv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressIpv4AddressesResponseData ipv4AddressIpv4Addresses(@Param("elid") String elid, Ipv4AddressIpv4AddressesRequestData body, @QueryMap(encoded=true) Ipv4AddressIpv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>ipv4AddressIpv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressIpv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressIpv4AddressesResponseData> ipv4AddressIpv4AddressesWithHttpInfo(@Param("elid") String elid, Ipv4AddressIpv4AddressesRequestData body, @QueryMap(encoded=true) Ipv4AddressIpv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressIpv4Addresses</code> method in a fluent style.
   */
  public static class Ipv4AddressIpv4AddressesQueryParams extends HashMap<String, Object> {
    public Ipv4AddressIpv4AddressesQueryParams sessionId(final String value) {
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
   * @return Ipv4AddressIpv4NetrangeResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Ipv4Netrange?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressIpv4NetrangeResponseData ipv4AddressIpv4Netrange(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressIpv4NetrangeRequestData body);

  /**
   * Get relations to IPv4 netrange entities
   * Similar to <code>ipv4AddressIpv4Netrange</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Ipv4Netrange?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressIpv4NetrangeResponseData> ipv4AddressIpv4NetrangeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressIpv4NetrangeRequestData body);


  /**
   * Get relations to IPv4 netrange entities
   * 
   * Note, this is equivalent to the other <code>ipv4AddressIpv4Netrange</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressIpv4NetrangeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressIpv4NetrangeResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Ipv4Netrange?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressIpv4NetrangeResponseData ipv4AddressIpv4Netrange(@Param("elid") String elid, Ipv4AddressIpv4NetrangeRequestData body, @QueryMap(encoded=true) Ipv4AddressIpv4NetrangeQueryParams queryParams);

  /**
  * Get relations to IPv4 netrange entities
  * 
  * Note, this is equivalent to the other <code>ipv4AddressIpv4Netrange</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressIpv4NetrangeResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Ipv4Netrange?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressIpv4NetrangeResponseData> ipv4AddressIpv4NetrangeWithHttpInfo(@Param("elid") String elid, Ipv4AddressIpv4NetrangeRequestData body, @QueryMap(encoded=true) Ipv4AddressIpv4NetrangeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressIpv4Netrange</code> method in a fluent style.
   */
  public static class Ipv4AddressIpv4NetrangeQueryParams extends HashMap<String, Object> {
    public Ipv4AddressIpv4NetrangeQueryParams sessionId(final String value) {
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
   * @return Ipv4AddressIpv4NetworkResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Ipv4Network?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressIpv4NetworkResponseData ipv4AddressIpv4Network(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressIpv4NetworkRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>ipv4AddressIpv4Network</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Ipv4Network?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressIpv4NetworkResponseData> ipv4AddressIpv4NetworkWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressIpv4NetworkRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>ipv4AddressIpv4Network</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressIpv4NetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressIpv4NetworkResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Ipv4Network?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressIpv4NetworkResponseData ipv4AddressIpv4Network(@Param("elid") String elid, Ipv4AddressIpv4NetworkRequestData body, @QueryMap(encoded=true) Ipv4AddressIpv4NetworkQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>ipv4AddressIpv4Network</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressIpv4NetworkResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Ipv4Network?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressIpv4NetworkResponseData> ipv4AddressIpv4NetworkWithHttpInfo(@Param("elid") String elid, Ipv4AddressIpv4NetworkRequestData body, @QueryMap(encoded=true) Ipv4AddressIpv4NetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressIpv4Network</code> method in a fluent style.
   */
  public static class Ipv4AddressIpv4NetworkQueryParams extends HashMap<String, Object> {
    public Ipv4AddressIpv4NetworkQueryParams sessionId(final String value) {
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
   * @return Ipv4AddressMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressMaintenanceContractsResponseData ipv4AddressMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>ipv4AddressMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressMaintenanceContractsResponseData> ipv4AddressMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>ipv4AddressMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressMaintenanceContractsResponseData ipv4AddressMaintenanceContracts(@Param("elid") String elid, Ipv4AddressMaintenanceContractsRequestData body, @QueryMap(encoded=true) Ipv4AddressMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>ipv4AddressMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressMaintenanceContractsResponseData> ipv4AddressMaintenanceContractsWithHttpInfo(@Param("elid") String elid, Ipv4AddressMaintenanceContractsRequestData body, @QueryMap(encoded=true) Ipv4AddressMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressMaintenanceContracts</code> method in a fluent style.
   */
  public static class Ipv4AddressMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public Ipv4AddressMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return Ipv4AddressObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressObjectsResponse ipv4AddressObjects(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressObjectsRequest body);

  /**
   * Query Objects
   * Similar to <code>ipv4AddressObjects</code> but it also returns the http response headers .
   * Query of the Objects
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressObjectsResponse> ipv4AddressObjectsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressObjectsRequest body);


  /**
   * Query Objects
   * Query of the Objects
   * Note, this is equivalent to the other <code>ipv4AddressObjects</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressObjectsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Objects?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressObjectsResponse ipv4AddressObjects(@Param("elid") String elid, Ipv4AddressObjectsRequest body, @QueryMap(encoded=true) Ipv4AddressObjectsQueryParams queryParams);

  /**
  * Query Objects
  * Query of the Objects
  * Note, this is equivalent to the other <code>ipv4AddressObjects</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressObjectsResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Objects?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressObjectsResponse> ipv4AddressObjectsWithHttpInfo(@Param("elid") String elid, Ipv4AddressObjectsRequest body, @QueryMap(encoded=true) Ipv4AddressObjectsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressObjects</code> method in a fluent style.
   */
  public static class Ipv4AddressObjectsQueryParams extends HashMap<String, Object> {
    public Ipv4AddressObjectsQueryParams sessionId(final String value) {
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
   * @return Ipv4AddressOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressOrganizationsResponseData ipv4AddressOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>ipv4AddressOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressOrganizationsResponseData> ipv4AddressOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>ipv4AddressOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressOrganizationsResponseData ipv4AddressOrganizations(@Param("elid") String elid, Ipv4AddressOrganizationsRequestData body, @QueryMap(encoded=true) Ipv4AddressOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>ipv4AddressOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressOrganizationsResponseData> ipv4AddressOrganizationsWithHttpInfo(@Param("elid") String elid, Ipv4AddressOrganizationsRequestData body, @QueryMap(encoded=true) Ipv4AddressOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressOrganizations</code> method in a fluent style.
   */
  public static class Ipv4AddressOrganizationsQueryParams extends HashMap<String, Object> {
    public Ipv4AddressOrganizationsQueryParams sessionId(final String value) {
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
   * @return Ipv4AddressPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressPersonGroupsResponseData ipv4AddressPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>ipv4AddressPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressPersonGroupsResponseData> ipv4AddressPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>ipv4AddressPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressPersonGroupsResponseData ipv4AddressPersonGroups(@Param("elid") String elid, Ipv4AddressPersonGroupsRequestData body, @QueryMap(encoded=true) Ipv4AddressPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>ipv4AddressPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressPersonGroupsResponseData> ipv4AddressPersonGroupsWithHttpInfo(@Param("elid") String elid, Ipv4AddressPersonGroupsRequestData body, @QueryMap(encoded=true) Ipv4AddressPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressPersonGroups</code> method in a fluent style.
   */
  public static class Ipv4AddressPersonGroupsQueryParams extends HashMap<String, Object> {
    public Ipv4AddressPersonGroupsQueryParams sessionId(final String value) {
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
   * @return Ipv4AddressPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressPersonsResponseData ipv4AddressPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>ipv4AddressPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressPersonsResponseData> ipv4AddressPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>ipv4AddressPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressPersonsResponseData ipv4AddressPersons(@Param("elid") String elid, Ipv4AddressPersonsRequestData body, @QueryMap(encoded=true) Ipv4AddressPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>ipv4AddressPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressPersonsResponseData> ipv4AddressPersonsWithHttpInfo(@Param("elid") String elid, Ipv4AddressPersonsRequestData body, @QueryMap(encoded=true) Ipv4AddressPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressPersons</code> method in a fluent style.
   */
  public static class Ipv4AddressPersonsQueryParams extends HashMap<String, Object> {
    public Ipv4AddressPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return Ipv4AddressQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressQueryResponse ipv4AddressQuery(@Param("sessionId") String sessionId, Ipv4AddressQueryRequest body);

  /**
   * Basic query
   * Similar to <code>ipv4AddressQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressQueryResponse> ipv4AddressQueryWithHttpInfo(@Param("sessionId") String sessionId, Ipv4AddressQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>ipv4AddressQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressQueryResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressQueryResponse ipv4AddressQuery(Ipv4AddressQueryRequest body, @QueryMap(encoded=true) Ipv4AddressQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>ipv4AddressQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressQueryResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressQueryResponse> ipv4AddressQueryWithHttpInfo(Ipv4AddressQueryRequest body, @QueryMap(encoded=true) Ipv4AddressQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressQuery</code> method in a fluent style.
   */
  public static class Ipv4AddressQueryQueryParams extends HashMap<String, Object> {
    public Ipv4AddressQueryQueryParams sessionId(final String value) {
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
   * @return Ipv4AddressSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Ipv4AddressSystemAttributesResponse ipv4AddressSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>ipv4AddressSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<Ipv4AddressSystemAttributesResponse> ipv4AddressSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Ipv4AddressSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>ipv4AddressSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link Ipv4AddressSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return Ipv4AddressSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Ipv4AddressSystemAttributesResponse ipv4AddressSystemAttributes(@Param("elid") String elid, Ipv4AddressSystemAttributesRequest body, @QueryMap(encoded=true) Ipv4AddressSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>ipv4AddressSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return Ipv4AddressSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<Ipv4AddressSystemAttributesResponse> ipv4AddressSystemAttributesWithHttpInfo(@Param("elid") String elid, Ipv4AddressSystemAttributesRequest body, @QueryMap(encoded=true) Ipv4AddressSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>ipv4AddressSystemAttributes</code> method in a fluent style.
   */
  public static class Ipv4AddressSystemAttributesQueryParams extends HashMap<String, Object> {
    public Ipv4AddressSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify IPv4 address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateIpv4AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateIpv4AddressResponse updateIpv4Address(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateIpv4AddressRequestData body);

  /**
   * Modify
   * Similar to <code>updateIpv4Address</code> but it also returns the http response headers .
   * Modify IPv4 address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateIpv4AddressResponse> updateIpv4AddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateIpv4AddressRequestData body);


  /**
   * Modify
   * Modify IPv4 address
   * Note, this is equivalent to the other <code>updateIpv4Address</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateIpv4AddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateIpv4AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateIpv4AddressResponse updateIpv4Address(@Param("elid") String elid, UpdateIpv4AddressRequestData body, @QueryMap(encoded=true) UpdateIpv4AddressQueryParams queryParams);

  /**
  * Modify
  * Modify IPv4 address
  * Note, this is equivalent to the other <code>updateIpv4Address</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateIpv4AddressResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateIpv4AddressResponse> updateIpv4AddressWithHttpInfo(@Param("elid") String elid, UpdateIpv4AddressRequestData body, @QueryMap(encoded=true) UpdateIpv4AddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateIpv4Address</code> method in a fluent style.
   */
  public static class UpdateIpv4AddressQueryParams extends HashMap<String, Object> {
    public UpdateIpv4AddressQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesIpv4AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesIpv4AddressResponse updateSystemAttributesIpv4Address(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesIpv4AddressRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesIpv4Address</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesIpv4AddressResponse> updateSystemAttributesIpv4AddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesIpv4AddressRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesIpv4Address</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesIpv4AddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesIpv4AddressResponse
   */
  @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesIpv4AddressResponse updateSystemAttributesIpv4Address(@Param("elid") String elid, UpdateSystemAttributesIpv4AddressRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesIpv4AddressQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesIpv4Address</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesIpv4AddressResponse
      */
      @RequestLine("POST /api/rest/entity/ipv4Address/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesIpv4AddressResponse> updateSystemAttributesIpv4AddressWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesIpv4AddressRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesIpv4AddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesIpv4Address</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesIpv4AddressQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesIpv4AddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
