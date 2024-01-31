package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomBgpnbv4RequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomBgpnbv4Response;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv4Ipv4AddressesRequestData;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv4Ipv4AddressesResponseData;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv4OrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv4OrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv4QueryRequest;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv4QueryResponse;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv4SystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomBgpnbv4SystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomBgpnbv4RequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomBgpnbv4Response;
import com.fntsoftware.businessgateway.entities.UpdateCustomBgpnbv4RequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomBgpnbv4Response;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomBgpnbv4RequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomBgpnbv4Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CustomBgpnbv4Api extends ApiClient.Api {


  /**
   * Create
   * Create BGP-Peer IPv4
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomBgpnbv4Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomBgpnbv4Response createCustomBgpnbv4(@Param("sessionId") String sessionId, CreateCustomBgpnbv4RequestData body);

  /**
   * Create
   * Similar to <code>createCustomBgpnbv4</code> but it also returns the http response headers .
   * Create BGP-Peer IPv4
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomBgpnbv4Response> createCustomBgpnbv4WithHttpInfo(@Param("sessionId") String sessionId, CreateCustomBgpnbv4RequestData body);


  /**
   * Create
   * Create BGP-Peer IPv4
   * Note, this is equivalent to the other <code>createCustomBgpnbv4</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomBgpnbv4QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomBgpnbv4Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomBgpnbv4Response createCustomBgpnbv4(CreateCustomBgpnbv4RequestData body, @QueryMap(encoded=true) CreateCustomBgpnbv4QueryParams queryParams);

  /**
  * Create
  * Create BGP-Peer IPv4
  * Note, this is equivalent to the other <code>createCustomBgpnbv4</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomBgpnbv4Response
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv4/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomBgpnbv4Response> createCustomBgpnbv4WithHttpInfo(CreateCustomBgpnbv4RequestData body, @QueryMap(encoded=true) CreateCustomBgpnbv4QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomBgpnbv4</code> method in a fluent style.
   */
  public static class CreateCustomBgpnbv4QueryParams extends HashMap<String, Object> {
    public CreateCustomBgpnbv4QueryParams sessionId(final String value) {
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
   * @return CustomBgpnbv4Ipv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomBgpnbv4Ipv4AddressesResponseData customBgpnbv4Ipv4Addresses(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomBgpnbv4Ipv4AddressesRequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>customBgpnbv4Ipv4Addresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomBgpnbv4Ipv4AddressesResponseData> customBgpnbv4Ipv4AddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomBgpnbv4Ipv4AddressesRequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>customBgpnbv4Ipv4Addresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomBgpnbv4Ipv4AddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomBgpnbv4Ipv4AddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/Ipv4Addresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomBgpnbv4Ipv4AddressesResponseData customBgpnbv4Ipv4Addresses(@Param("elid") String elid, CustomBgpnbv4Ipv4AddressesRequestData body, @QueryMap(encoded=true) CustomBgpnbv4Ipv4AddressesQueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>customBgpnbv4Ipv4Addresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomBgpnbv4Ipv4AddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/Ipv4Addresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomBgpnbv4Ipv4AddressesResponseData> customBgpnbv4Ipv4AddressesWithHttpInfo(@Param("elid") String elid, CustomBgpnbv4Ipv4AddressesRequestData body, @QueryMap(encoded=true) CustomBgpnbv4Ipv4AddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customBgpnbv4Ipv4Addresses</code> method in a fluent style.
   */
  public static class CustomBgpnbv4Ipv4AddressesQueryParams extends HashMap<String, Object> {
    public CustomBgpnbv4Ipv4AddressesQueryParams sessionId(final String value) {
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
   * @return CustomBgpnbv4OrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomBgpnbv4OrganizationsResponseData customBgpnbv4Organizations(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomBgpnbv4OrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>customBgpnbv4Organizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomBgpnbv4OrganizationsResponseData> customBgpnbv4OrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomBgpnbv4OrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>customBgpnbv4Organizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomBgpnbv4OrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomBgpnbv4OrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomBgpnbv4OrganizationsResponseData customBgpnbv4Organizations(@Param("elid") String elid, CustomBgpnbv4OrganizationsRequestData body, @QueryMap(encoded=true) CustomBgpnbv4OrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>customBgpnbv4Organizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomBgpnbv4OrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomBgpnbv4OrganizationsResponseData> customBgpnbv4OrganizationsWithHttpInfo(@Param("elid") String elid, CustomBgpnbv4OrganizationsRequestData body, @QueryMap(encoded=true) CustomBgpnbv4OrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customBgpnbv4Organizations</code> method in a fluent style.
   */
  public static class CustomBgpnbv4OrganizationsQueryParams extends HashMap<String, Object> {
    public CustomBgpnbv4OrganizationsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomBgpnbv4QueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomBgpnbv4QueryResponse customBgpnbv4Query(@Param("sessionId") String sessionId, CustomBgpnbv4QueryRequest body);

  /**
   * Basic query
   * Similar to <code>customBgpnbv4Query</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomBgpnbv4QueryResponse> customBgpnbv4QueryWithHttpInfo(@Param("sessionId") String sessionId, CustomBgpnbv4QueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customBgpnbv4Query</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomBgpnbv4QueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomBgpnbv4QueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomBgpnbv4QueryResponse customBgpnbv4Query(CustomBgpnbv4QueryRequest body, @QueryMap(encoded=true) CustomBgpnbv4QueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customBgpnbv4Query</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomBgpnbv4QueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv4/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomBgpnbv4QueryResponse> customBgpnbv4QueryWithHttpInfo(CustomBgpnbv4QueryRequest body, @QueryMap(encoded=true) CustomBgpnbv4QueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customBgpnbv4Query</code> method in a fluent style.
   */
  public static class CustomBgpnbv4QueryQueryParams extends HashMap<String, Object> {
    public CustomBgpnbv4QueryQueryParams sessionId(final String value) {
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
   * @return CustomBgpnbv4SystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomBgpnbv4SystemAttributesResponse customBgpnbv4SystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomBgpnbv4SystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customBgpnbv4SystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomBgpnbv4SystemAttributesResponse> customBgpnbv4SystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomBgpnbv4SystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customBgpnbv4SystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomBgpnbv4SystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomBgpnbv4SystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomBgpnbv4SystemAttributesResponse customBgpnbv4SystemAttributes(@Param("elid") String elid, CustomBgpnbv4SystemAttributesRequest body, @QueryMap(encoded=true) CustomBgpnbv4SystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customBgpnbv4SystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomBgpnbv4SystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomBgpnbv4SystemAttributesResponse> customBgpnbv4SystemAttributesWithHttpInfo(@Param("elid") String elid, CustomBgpnbv4SystemAttributesRequest body, @QueryMap(encoded=true) CustomBgpnbv4SystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customBgpnbv4SystemAttributes</code> method in a fluent style.
   */
  public static class CustomBgpnbv4SystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomBgpnbv4SystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete BGP-Peer IPv4
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomBgpnbv4Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomBgpnbv4Response deleteCustomBgpnbv4(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomBgpnbv4RequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomBgpnbv4</code> but it also returns the http response headers .
   * Delete BGP-Peer IPv4
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomBgpnbv4Response> deleteCustomBgpnbv4WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomBgpnbv4RequestData body);


  /**
   * Delete
   * Delete BGP-Peer IPv4
   * Note, this is equivalent to the other <code>deleteCustomBgpnbv4</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomBgpnbv4QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomBgpnbv4Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomBgpnbv4Response deleteCustomBgpnbv4(@Param("elid") String elid, DeleteCustomBgpnbv4RequestData body, @QueryMap(encoded=true) DeleteCustomBgpnbv4QueryParams queryParams);

  /**
  * Delete
  * Delete BGP-Peer IPv4
  * Note, this is equivalent to the other <code>deleteCustomBgpnbv4</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomBgpnbv4Response
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomBgpnbv4Response> deleteCustomBgpnbv4WithHttpInfo(@Param("elid") String elid, DeleteCustomBgpnbv4RequestData body, @QueryMap(encoded=true) DeleteCustomBgpnbv4QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomBgpnbv4</code> method in a fluent style.
   */
  public static class DeleteCustomBgpnbv4QueryParams extends HashMap<String, Object> {
    public DeleteCustomBgpnbv4QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify BGP-Peer IPv4
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomBgpnbv4Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomBgpnbv4Response updateCustomBgpnbv4(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomBgpnbv4RequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomBgpnbv4</code> but it also returns the http response headers .
   * Modify BGP-Peer IPv4
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomBgpnbv4Response> updateCustomBgpnbv4WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomBgpnbv4RequestData body);


  /**
   * Modify
   * Modify BGP-Peer IPv4
   * Note, this is equivalent to the other <code>updateCustomBgpnbv4</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomBgpnbv4QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomBgpnbv4Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomBgpnbv4Response updateCustomBgpnbv4(@Param("elid") String elid, UpdateCustomBgpnbv4RequestData body, @QueryMap(encoded=true) UpdateCustomBgpnbv4QueryParams queryParams);

  /**
  * Modify
  * Modify BGP-Peer IPv4
  * Note, this is equivalent to the other <code>updateCustomBgpnbv4</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomBgpnbv4Response
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomBgpnbv4Response> updateCustomBgpnbv4WithHttpInfo(@Param("elid") String elid, UpdateCustomBgpnbv4RequestData body, @QueryMap(encoded=true) UpdateCustomBgpnbv4QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomBgpnbv4</code> method in a fluent style.
   */
  public static class UpdateCustomBgpnbv4QueryParams extends HashMap<String, Object> {
    public UpdateCustomBgpnbv4QueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomBgpnbv4Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomBgpnbv4Response updateSystemAttributesCustomBgpnbv4(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomBgpnbv4RequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomBgpnbv4</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomBgpnbv4Response> updateSystemAttributesCustomBgpnbv4WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomBgpnbv4RequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomBgpnbv4</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomBgpnbv4QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomBgpnbv4Response
   */
  @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomBgpnbv4Response updateSystemAttributesCustomBgpnbv4(@Param("elid") String elid, UpdateSystemAttributesCustomBgpnbv4RequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomBgpnbv4QueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomBgpnbv4</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomBgpnbv4Response
      */
      @RequestLine("POST /api/rest/entity/custom/bgpnbv4/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomBgpnbv4Response> updateSystemAttributesCustomBgpnbv4WithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomBgpnbv4RequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomBgpnbv4QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomBgpnbv4</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomBgpnbv4QueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomBgpnbv4QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
