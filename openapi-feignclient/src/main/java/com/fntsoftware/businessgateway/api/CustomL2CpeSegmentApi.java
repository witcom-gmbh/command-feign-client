package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomL2CpeSegmentRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomL2CpeSegmentResponse;
import com.fntsoftware.businessgateway.entities.CustomL2CpeSegmentChassisRequestData;
import com.fntsoftware.businessgateway.entities.CustomL2CpeSegmentChassisResponseData;
import com.fntsoftware.businessgateway.entities.CustomL2CpeSegmentIpv4NetworkRequestData;
import com.fntsoftware.businessgateway.entities.CustomL2CpeSegmentIpv4NetworkResponseData;
import com.fntsoftware.businessgateway.entities.CustomL2CpeSegmentQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomL2CpeSegmentQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomL2CpeSegmentSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomL2CpeSegmentSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CustomL2CpeSegmentVlanRequestData;
import com.fntsoftware.businessgateway.entities.CustomL2CpeSegmentVlanResponseData;
import com.fntsoftware.businessgateway.entities.DeleteCustomL2CpeSegmentRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomL2CpeSegmentResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomL2CpeSegmentRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomL2CpeSegmentResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomL2CpeSegmentRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomL2CpeSegmentResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CustomL2CpeSegmentApi extends ApiClient.Api {


  /**
   * Create
   * Create L2-CPE Segment
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomL2CpeSegmentResponse
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomL2CpeSegmentResponse createCustomL2CpeSegment(@Param("sessionId") String sessionId, CreateCustomL2CpeSegmentRequestData body);

  /**
   * Create
   * Similar to <code>createCustomL2CpeSegment</code> but it also returns the http response headers .
   * Create L2-CPE Segment
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomL2CpeSegmentResponse> createCustomL2CpeSegmentWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomL2CpeSegmentRequestData body);


  /**
   * Create
   * Create L2-CPE Segment
   * Note, this is equivalent to the other <code>createCustomL2CpeSegment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomL2CpeSegmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomL2CpeSegmentResponse
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomL2CpeSegmentResponse createCustomL2CpeSegment(CreateCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) CreateCustomL2CpeSegmentQueryParams queryParams);

  /**
  * Create
  * Create L2-CPE Segment
  * Note, this is equivalent to the other <code>createCustomL2CpeSegment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomL2CpeSegmentResponse
      */
      @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomL2CpeSegmentResponse> createCustomL2CpeSegmentWithHttpInfo(CreateCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) CreateCustomL2CpeSegmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomL2CpeSegment</code> method in a fluent style.
   */
  public static class CreateCustomL2CpeSegmentQueryParams extends HashMap<String, Object> {
    public CreateCustomL2CpeSegmentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Chassis entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomL2CpeSegmentChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomL2CpeSegmentChassisResponseData customL2CpeSegmentChassis(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomL2CpeSegmentChassisRequestData body);

  /**
   * Get relations to Chassis entities
   * Similar to <code>customL2CpeSegmentChassis</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomL2CpeSegmentChassisResponseData> customL2CpeSegmentChassisWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomL2CpeSegmentChassisRequestData body);


  /**
   * Get relations to Chassis entities
   * 
   * Note, this is equivalent to the other <code>customL2CpeSegmentChassis</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomL2CpeSegmentChassisQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomL2CpeSegmentChassisResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/Chassis?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomL2CpeSegmentChassisResponseData customL2CpeSegmentChassis(@Param("elid") String elid, CustomL2CpeSegmentChassisRequestData body, @QueryMap(encoded=true) CustomL2CpeSegmentChassisQueryParams queryParams);

  /**
  * Get relations to Chassis entities
  * 
  * Note, this is equivalent to the other <code>customL2CpeSegmentChassis</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomL2CpeSegmentChassisResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/Chassis?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomL2CpeSegmentChassisResponseData> customL2CpeSegmentChassisWithHttpInfo(@Param("elid") String elid, CustomL2CpeSegmentChassisRequestData body, @QueryMap(encoded=true) CustomL2CpeSegmentChassisQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customL2CpeSegmentChassis</code> method in a fluent style.
   */
  public static class CustomL2CpeSegmentChassisQueryParams extends HashMap<String, Object> {
    public CustomL2CpeSegmentChassisQueryParams sessionId(final String value) {
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
   * @return CustomL2CpeSegmentIpv4NetworkResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/Ipv4Network?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomL2CpeSegmentIpv4NetworkResponseData customL2CpeSegmentIpv4Network(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomL2CpeSegmentIpv4NetworkRequestData body);

  /**
   * Get relations to IPv4 Network entities
   * Similar to <code>customL2CpeSegmentIpv4Network</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/Ipv4Network?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomL2CpeSegmentIpv4NetworkResponseData> customL2CpeSegmentIpv4NetworkWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomL2CpeSegmentIpv4NetworkRequestData body);


  /**
   * Get relations to IPv4 Network entities
   * 
   * Note, this is equivalent to the other <code>customL2CpeSegmentIpv4Network</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomL2CpeSegmentIpv4NetworkQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomL2CpeSegmentIpv4NetworkResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/Ipv4Network?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomL2CpeSegmentIpv4NetworkResponseData customL2CpeSegmentIpv4Network(@Param("elid") String elid, CustomL2CpeSegmentIpv4NetworkRequestData body, @QueryMap(encoded=true) CustomL2CpeSegmentIpv4NetworkQueryParams queryParams);

  /**
  * Get relations to IPv4 Network entities
  * 
  * Note, this is equivalent to the other <code>customL2CpeSegmentIpv4Network</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomL2CpeSegmentIpv4NetworkResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/Ipv4Network?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomL2CpeSegmentIpv4NetworkResponseData> customL2CpeSegmentIpv4NetworkWithHttpInfo(@Param("elid") String elid, CustomL2CpeSegmentIpv4NetworkRequestData body, @QueryMap(encoded=true) CustomL2CpeSegmentIpv4NetworkQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customL2CpeSegmentIpv4Network</code> method in a fluent style.
   */
  public static class CustomL2CpeSegmentIpv4NetworkQueryParams extends HashMap<String, Object> {
    public CustomL2CpeSegmentIpv4NetworkQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomL2CpeSegmentQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomL2CpeSegmentQueryResponse customL2CpeSegmentQuery(@Param("sessionId") String sessionId, CustomL2CpeSegmentQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customL2CpeSegmentQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomL2CpeSegmentQueryResponse> customL2CpeSegmentQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomL2CpeSegmentQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customL2CpeSegmentQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomL2CpeSegmentQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomL2CpeSegmentQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomL2CpeSegmentQueryResponse customL2CpeSegmentQuery(CustomL2CpeSegmentQueryRequest body, @QueryMap(encoded=true) CustomL2CpeSegmentQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customL2CpeSegmentQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomL2CpeSegmentQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomL2CpeSegmentQueryResponse> customL2CpeSegmentQueryWithHttpInfo(CustomL2CpeSegmentQueryRequest body, @QueryMap(encoded=true) CustomL2CpeSegmentQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customL2CpeSegmentQuery</code> method in a fluent style.
   */
  public static class CustomL2CpeSegmentQueryQueryParams extends HashMap<String, Object> {
    public CustomL2CpeSegmentQueryQueryParams sessionId(final String value) {
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
   * @return CustomL2CpeSegmentSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomL2CpeSegmentSystemAttributesResponse customL2CpeSegmentSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomL2CpeSegmentSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customL2CpeSegmentSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomL2CpeSegmentSystemAttributesResponse> customL2CpeSegmentSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomL2CpeSegmentSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customL2CpeSegmentSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomL2CpeSegmentSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomL2CpeSegmentSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomL2CpeSegmentSystemAttributesResponse customL2CpeSegmentSystemAttributes(@Param("elid") String elid, CustomL2CpeSegmentSystemAttributesRequest body, @QueryMap(encoded=true) CustomL2CpeSegmentSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customL2CpeSegmentSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomL2CpeSegmentSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomL2CpeSegmentSystemAttributesResponse> customL2CpeSegmentSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomL2CpeSegmentSystemAttributesRequest body, @QueryMap(encoded=true) CustomL2CpeSegmentSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customL2CpeSegmentSystemAttributes</code> method in a fluent style.
   */
  public static class CustomL2CpeSegmentSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomL2CpeSegmentSystemAttributesQueryParams sessionId(final String value) {
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
   * @return CustomL2CpeSegmentVlanResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/Vlan?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomL2CpeSegmentVlanResponseData customL2CpeSegmentVlan(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomL2CpeSegmentVlanRequestData body);

  /**
   * Get relations to VLAN entities
   * Similar to <code>customL2CpeSegmentVlan</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/Vlan?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomL2CpeSegmentVlanResponseData> customL2CpeSegmentVlanWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomL2CpeSegmentVlanRequestData body);


  /**
   * Get relations to VLAN entities
   * 
   * Note, this is equivalent to the other <code>customL2CpeSegmentVlan</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomL2CpeSegmentVlanQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomL2CpeSegmentVlanResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/Vlan?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomL2CpeSegmentVlanResponseData customL2CpeSegmentVlan(@Param("elid") String elid, CustomL2CpeSegmentVlanRequestData body, @QueryMap(encoded=true) CustomL2CpeSegmentVlanQueryParams queryParams);

  /**
  * Get relations to VLAN entities
  * 
  * Note, this is equivalent to the other <code>customL2CpeSegmentVlan</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomL2CpeSegmentVlanResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/Vlan?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomL2CpeSegmentVlanResponseData> customL2CpeSegmentVlanWithHttpInfo(@Param("elid") String elid, CustomL2CpeSegmentVlanRequestData body, @QueryMap(encoded=true) CustomL2CpeSegmentVlanQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customL2CpeSegmentVlan</code> method in a fluent style.
   */
  public static class CustomL2CpeSegmentVlanQueryParams extends HashMap<String, Object> {
    public CustomL2CpeSegmentVlanQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete L2-CPE Segment
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomL2CpeSegmentResponse
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomL2CpeSegmentResponse deleteCustomL2CpeSegment(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomL2CpeSegmentRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomL2CpeSegment</code> but it also returns the http response headers .
   * Delete L2-CPE Segment
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomL2CpeSegmentResponse> deleteCustomL2CpeSegmentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomL2CpeSegmentRequestData body);


  /**
   * Delete
   * Delete L2-CPE Segment
   * Note, this is equivalent to the other <code>deleteCustomL2CpeSegment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomL2CpeSegmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomL2CpeSegmentResponse
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomL2CpeSegmentResponse deleteCustomL2CpeSegment(@Param("elid") String elid, DeleteCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) DeleteCustomL2CpeSegmentQueryParams queryParams);

  /**
  * Delete
  * Delete L2-CPE Segment
  * Note, this is equivalent to the other <code>deleteCustomL2CpeSegment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomL2CpeSegmentResponse
      */
      @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomL2CpeSegmentResponse> deleteCustomL2CpeSegmentWithHttpInfo(@Param("elid") String elid, DeleteCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) DeleteCustomL2CpeSegmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomL2CpeSegment</code> method in a fluent style.
   */
  public static class DeleteCustomL2CpeSegmentQueryParams extends HashMap<String, Object> {
    public DeleteCustomL2CpeSegmentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify L2-CPE Segment
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomL2CpeSegmentResponse
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomL2CpeSegmentResponse updateCustomL2CpeSegment(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomL2CpeSegmentRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomL2CpeSegment</code> but it also returns the http response headers .
   * Modify L2-CPE Segment
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomL2CpeSegmentResponse> updateCustomL2CpeSegmentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomL2CpeSegmentRequestData body);


  /**
   * Modify
   * Modify L2-CPE Segment
   * Note, this is equivalent to the other <code>updateCustomL2CpeSegment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomL2CpeSegmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomL2CpeSegmentResponse
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomL2CpeSegmentResponse updateCustomL2CpeSegment(@Param("elid") String elid, UpdateCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) UpdateCustomL2CpeSegmentQueryParams queryParams);

  /**
  * Modify
  * Modify L2-CPE Segment
  * Note, this is equivalent to the other <code>updateCustomL2CpeSegment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomL2CpeSegmentResponse
      */
      @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomL2CpeSegmentResponse> updateCustomL2CpeSegmentWithHttpInfo(@Param("elid") String elid, UpdateCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) UpdateCustomL2CpeSegmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomL2CpeSegment</code> method in a fluent style.
   */
  public static class UpdateCustomL2CpeSegmentQueryParams extends HashMap<String, Object> {
    public UpdateCustomL2CpeSegmentQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomL2CpeSegmentResponse
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomL2CpeSegmentResponse updateSystemAttributesCustomL2CpeSegment(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomL2CpeSegmentRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomL2CpeSegment</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomL2CpeSegmentResponse> updateSystemAttributesCustomL2CpeSegmentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomL2CpeSegmentRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomL2CpeSegment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomL2CpeSegmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomL2CpeSegmentResponse
   */
  @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomL2CpeSegmentResponse updateSystemAttributesCustomL2CpeSegment(@Param("elid") String elid, UpdateSystemAttributesCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomL2CpeSegmentQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomL2CpeSegment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomL2CpeSegmentResponse
      */
      @RequestLine("POST /api/rest/entity/custom/l2CpeSegment/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomL2CpeSegmentResponse> updateSystemAttributesCustomL2CpeSegmentWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomL2CpeSegmentRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomL2CpeSegmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomL2CpeSegment</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomL2CpeSegmentQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomL2CpeSegmentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
