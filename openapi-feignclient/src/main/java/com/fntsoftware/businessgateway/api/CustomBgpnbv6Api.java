package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomBgpnbv6RequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomBgpnbv6Response;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv6Ipv6AddressesRequestData;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv6Ipv6AddressesResponseData;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv6OrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv6OrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv6QueryRequest;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv6QueryResponse;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv6SystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv6SystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomBgpnbv6RequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomBgpnbv6Response;
import com.fntsoftware.businessgateway.entities.UpdateCustomBgpnbv6RequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomBgpnbv6Response;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomBgpnbv6RequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomBgpnbv6Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CustomBgpnbv6Api extends ApiClient.Api {


  /**
   * Create
   * Create BGP-Peering IPv4
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomBgpnbv6Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomBgpnbv6Response createCustomBgpnbv6(@Param("sessionId") String sessionId, CreateCustomBgpnbv6RequestData body);

  /**
   * Create
   * Similar to <code>createCustomBgpnbv6</code> but it also returns the http response headers .
   * Create BGP-Peering IPv4
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomBgpnbv6Response> createCustomBgpnbv6WithHttpInfo(@Param("sessionId") String sessionId, CreateCustomBgpnbv6RequestData body);


  /**
   * Create
   * Create BGP-Peering IPv4
   * Note, this is equivalent to the other <code>createCustomBgpnbv6</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomBgpnbv6QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomBgpnbv6Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomBgpnbv6Response createCustomBgpnbv6(CreateCustomBgpnbv6RequestData body, @QueryMap(encoded=true) CreateCustomBgpnbv6QueryParams queryParams);

  /**
  * Create
  * Create BGP-Peering IPv4
  * Note, this is equivalent to the other <code>createCustomBgpnbv6</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomBgpnbv6Response
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv6/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomBgpnbv6Response> createCustomBgpnbv6WithHttpInfo(CreateCustomBgpnbv6RequestData body, @QueryMap(encoded=true) CreateCustomBgpnbv6QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomBgpnbv6</code> method in a fluent style.
   */
  public static class CreateCustomBgpnbv6QueryParams extends HashMap<String, Object> {
    public CreateCustomBgpnbv6QueryParams sessionId(final String value) {
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
   * @return CustomBgpnbv6Ipv6AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomBgpnbv6Ipv6AddressesResponseData customBgpnbv6Ipv6Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomBgpnbv6Ipv6AddressesRequestData body);

  /**
   * Get relations to IPv6 address entities
   * Similar to <code>customBgpnbv6Ipv6Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomBgpnbv6Ipv6AddressesResponseData> customBgpnbv6Ipv6AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomBgpnbv6Ipv6AddressesRequestData body);


  /**
   * Get relations to IPv6 address entities
   * 
   * Note, this is equivalent to the other <code>customBgpnbv6Ipv6Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomBgpnbv6Ipv6AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomBgpnbv6Ipv6AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/Ipv6Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomBgpnbv6Ipv6AddressesResponseData customBgpnbv6Ipv6Addresses(@Param("elid") String elid, CustomBgpnbv6Ipv6AddressesRequestData body, @QueryMap(encoded=true) CustomBgpnbv6Ipv6AddressesQueryParams queryParams);

  /**
  * Get relations to IPv6 address entities
  * 
  * Note, this is equivalent to the other <code>customBgpnbv6Ipv6Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomBgpnbv6Ipv6AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/Ipv6Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomBgpnbv6Ipv6AddressesResponseData> customBgpnbv6Ipv6AddressesWithHttpInfo(@Param("elid") String elid, CustomBgpnbv6Ipv6AddressesRequestData body, @QueryMap(encoded=true) CustomBgpnbv6Ipv6AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customBgpnbv6Ipv6Addresses</code> method in a fluent style.
   */
  public static class CustomBgpnbv6Ipv6AddressesQueryParams extends HashMap<String, Object> {
    public CustomBgpnbv6Ipv6AddressesQueryParams sessionId(final String value) {
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
   * @return CustomBgpnbv6OrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomBgpnbv6OrganizationsResponseData customBgpnbv6Organizations(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomBgpnbv6OrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>customBgpnbv6Organizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomBgpnbv6OrganizationsResponseData> customBgpnbv6OrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomBgpnbv6OrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>customBgpnbv6Organizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomBgpnbv6OrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomBgpnbv6OrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomBgpnbv6OrganizationsResponseData customBgpnbv6Organizations(@Param("elid") String elid, CustomBgpnbv6OrganizationsRequestData body, @QueryMap(encoded=true) CustomBgpnbv6OrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>customBgpnbv6Organizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomBgpnbv6OrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomBgpnbv6OrganizationsResponseData> customBgpnbv6OrganizationsWithHttpInfo(@Param("elid") String elid, CustomBgpnbv6OrganizationsRequestData body, @QueryMap(encoded=true) CustomBgpnbv6OrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customBgpnbv6Organizations</code> method in a fluent style.
   */
  public static class CustomBgpnbv6OrganizationsQueryParams extends HashMap<String, Object> {
    public CustomBgpnbv6OrganizationsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomBgpnbv6QueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomBgpnbv6QueryResponse customBgpnbv6Query(@Param("sessionId") String sessionId, CustomBgpnbv6QueryRequest body);

  /**
   * Basic query
   * Similar to <code>customBgpnbv6Query</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomBgpnbv6QueryResponse> customBgpnbv6QueryWithHttpInfo(@Param("sessionId") String sessionId, CustomBgpnbv6QueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customBgpnbv6Query</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomBgpnbv6QueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomBgpnbv6QueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomBgpnbv6QueryResponse customBgpnbv6Query(CustomBgpnbv6QueryRequest body, @QueryMap(encoded=true) CustomBgpnbv6QueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customBgpnbv6Query</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomBgpnbv6QueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv6/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomBgpnbv6QueryResponse> customBgpnbv6QueryWithHttpInfo(CustomBgpnbv6QueryRequest body, @QueryMap(encoded=true) CustomBgpnbv6QueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customBgpnbv6Query</code> method in a fluent style.
   */
  public static class CustomBgpnbv6QueryQueryParams extends HashMap<String, Object> {
    public CustomBgpnbv6QueryQueryParams sessionId(final String value) {
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
   * @return CustomBgpnbv6SystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomBgpnbv6SystemAttributesResponse customBgpnbv6SystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomBgpnbv6SystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customBgpnbv6SystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomBgpnbv6SystemAttributesResponse> customBgpnbv6SystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomBgpnbv6SystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customBgpnbv6SystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomBgpnbv6SystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomBgpnbv6SystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomBgpnbv6SystemAttributesResponse customBgpnbv6SystemAttributes(@Param("elid") String elid, CustomBgpnbv6SystemAttributesRequest body, @QueryMap(encoded=true) CustomBgpnbv6SystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customBgpnbv6SystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomBgpnbv6SystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomBgpnbv6SystemAttributesResponse> customBgpnbv6SystemAttributesWithHttpInfo(@Param("elid") String elid, CustomBgpnbv6SystemAttributesRequest body, @QueryMap(encoded=true) CustomBgpnbv6SystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customBgpnbv6SystemAttributes</code> method in a fluent style.
   */
  public static class CustomBgpnbv6SystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomBgpnbv6SystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete BGP-Peering IPv4
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomBgpnbv6Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomBgpnbv6Response deleteCustomBgpnbv6(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomBgpnbv6RequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomBgpnbv6</code> but it also returns the http response headers .
   * Delete BGP-Peering IPv4
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomBgpnbv6Response> deleteCustomBgpnbv6WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomBgpnbv6RequestData body);


  /**
   * Delete
   * Delete BGP-Peering IPv4
   * Note, this is equivalent to the other <code>deleteCustomBgpnbv6</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomBgpnbv6QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomBgpnbv6Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomBgpnbv6Response deleteCustomBgpnbv6(@Param("elid") String elid, DeleteCustomBgpnbv6RequestData body, @QueryMap(encoded=true) DeleteCustomBgpnbv6QueryParams queryParams);

  /**
  * Delete
  * Delete BGP-Peering IPv4
  * Note, this is equivalent to the other <code>deleteCustomBgpnbv6</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomBgpnbv6Response
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomBgpnbv6Response> deleteCustomBgpnbv6WithHttpInfo(@Param("elid") String elid, DeleteCustomBgpnbv6RequestData body, @QueryMap(encoded=true) DeleteCustomBgpnbv6QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomBgpnbv6</code> method in a fluent style.
   */
  public static class DeleteCustomBgpnbv6QueryParams extends HashMap<String, Object> {
    public DeleteCustomBgpnbv6QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify BGP-Peering IPv4
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomBgpnbv6Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomBgpnbv6Response updateCustomBgpnbv6(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomBgpnbv6RequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomBgpnbv6</code> but it also returns the http response headers .
   * Modify BGP-Peering IPv4
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomBgpnbv6Response> updateCustomBgpnbv6WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomBgpnbv6RequestData body);


  /**
   * Modify
   * Modify BGP-Peering IPv4
   * Note, this is equivalent to the other <code>updateCustomBgpnbv6</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomBgpnbv6QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomBgpnbv6Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomBgpnbv6Response updateCustomBgpnbv6(@Param("elid") String elid, UpdateCustomBgpnbv6RequestData body, @QueryMap(encoded=true) UpdateCustomBgpnbv6QueryParams queryParams);

  /**
  * Modify
  * Modify BGP-Peering IPv4
  * Note, this is equivalent to the other <code>updateCustomBgpnbv6</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomBgpnbv6Response
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomBgpnbv6Response> updateCustomBgpnbv6WithHttpInfo(@Param("elid") String elid, UpdateCustomBgpnbv6RequestData body, @QueryMap(encoded=true) UpdateCustomBgpnbv6QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomBgpnbv6</code> method in a fluent style.
   */
  public static class UpdateCustomBgpnbv6QueryParams extends HashMap<String, Object> {
    public UpdateCustomBgpnbv6QueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomBgpnbv6Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomBgpnbv6Response updateSystemAttributesCustomBgpnbv6(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomBgpnbv6RequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomBgpnbv6</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomBgpnbv6Response> updateSystemAttributesCustomBgpnbv6WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomBgpnbv6RequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomBgpnbv6</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomBgpnbv6QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomBgpnbv6Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomBgpnbv6Response updateSystemAttributesCustomBgpnbv6(@Param("elid") String elid, UpdateSystemAttributesCustomBgpnbv6RequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomBgpnbv6QueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomBgpnbv6</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomBgpnbv6Response
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv6/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomBgpnbv6Response> updateSystemAttributesCustomBgpnbv6WithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomBgpnbv6RequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomBgpnbv6QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomBgpnbv6</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomBgpnbv6QueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomBgpnbv6QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
