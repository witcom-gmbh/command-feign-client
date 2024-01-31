package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynOspfAreaRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynOspfAreaResponse;
import com.fntsoftware.businessgateway.entities.CustomCtcdynOspfArea100042RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynOspfArea100042ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynOspfArea100043RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynOspfArea100043ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynOspfAreaQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomCtcdynOspfAreaQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomCtcdynOspfAreaSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomCtcdynOspfAreaSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomCtcdynOspfAreaRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomCtcdynOspfAreaResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynOspfAreaRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynOspfAreaResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomCtcdynOspfAreaRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomCtcdynOspfAreaResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface CustomCtcdynOspfAreaApi extends ApiClient.Api {


  /**
   * Create
   * Create OSPF-Area
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomCtcdynOspfAreaResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomCtcdynOspfAreaResponse createCustomCtcdynOspfArea(@Param("sessionId") String sessionId, CreateCustomCtcdynOspfAreaRequestData body);

  /**
   * Create
   * Similar to <code>createCustomCtcdynOspfArea</code> but it also returns the http response headers .
   * Create OSPF-Area
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomCtcdynOspfAreaResponse> createCustomCtcdynOspfAreaWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomCtcdynOspfAreaRequestData body);


  /**
   * Create
   * Create OSPF-Area
   * Note, this is equivalent to the other <code>createCustomCtcdynOspfArea</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomCtcdynOspfAreaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomCtcdynOspfAreaResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomCtcdynOspfAreaResponse createCustomCtcdynOspfArea(CreateCustomCtcdynOspfAreaRequestData body, @QueryMap(encoded=true) CreateCustomCtcdynOspfAreaQueryParams queryParams);

  /**
  * Create
  * Create OSPF-Area
  * Note, this is equivalent to the other <code>createCustomCtcdynOspfArea</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomCtcdynOspfAreaResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomCtcdynOspfAreaResponse> createCustomCtcdynOspfAreaWithHttpInfo(CreateCustomCtcdynOspfAreaRequestData body, @QueryMap(encoded=true) CreateCustomCtcdynOspfAreaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomCtcdynOspfArea</code> method in a fluent style.
   */
  public static class CreateCustomCtcdynOspfAreaQueryParams extends HashMap<String, Object> {
    public CreateCustomCtcdynOspfAreaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service (Telco) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomCtcdynOspfArea100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynOspfArea100042ResponseData customCtcdynOspfArea100042(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynOspfArea100042RequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>customCtcdynOspfArea100042</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/100042?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynOspfArea100042ResponseData> customCtcdynOspfArea100042WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynOspfArea100042RequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynOspfArea100042</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynOspfArea100042QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynOspfArea100042ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/100042?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynOspfArea100042ResponseData customCtcdynOspfArea100042(@Param("elid") String elid, CustomCtcdynOspfArea100042RequestData body, @QueryMap(encoded=true) CustomCtcdynOspfArea100042QueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynOspfArea100042</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynOspfArea100042ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/100042?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynOspfArea100042ResponseData> customCtcdynOspfArea100042WithHttpInfo(@Param("elid") String elid, CustomCtcdynOspfArea100042RequestData body, @QueryMap(encoded=true) CustomCtcdynOspfArea100042QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynOspfArea100042</code> method in a fluent style.
   */
  public static class CustomCtcdynOspfArea100042QueryParams extends HashMap<String, Object> {
    public CustomCtcdynOspfArea100042QueryParams sessionId(final String value) {
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
   * @return CustomCtcdynOspfArea100043ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/100043?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynOspfArea100043ResponseData customCtcdynOspfArea100043(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynOspfArea100043RequestData body);

  /**
   * Get relations to Interface entities
   * Similar to <code>customCtcdynOspfArea100043</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/100043?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynOspfArea100043ResponseData> customCtcdynOspfArea100043WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynOspfArea100043RequestData body);


  /**
   * Get relations to Interface entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynOspfArea100043</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynOspfArea100043QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynOspfArea100043ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/100043?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynOspfArea100043ResponseData customCtcdynOspfArea100043(@Param("elid") String elid, CustomCtcdynOspfArea100043RequestData body, @QueryMap(encoded=true) CustomCtcdynOspfArea100043QueryParams queryParams);

  /**
  * Get relations to Interface entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynOspfArea100043</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynOspfArea100043ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/100043?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynOspfArea100043ResponseData> customCtcdynOspfArea100043WithHttpInfo(@Param("elid") String elid, CustomCtcdynOspfArea100043RequestData body, @QueryMap(encoded=true) CustomCtcdynOspfArea100043QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynOspfArea100043</code> method in a fluent style.
   */
  public static class CustomCtcdynOspfArea100043QueryParams extends HashMap<String, Object> {
    public CustomCtcdynOspfArea100043QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomCtcdynOspfAreaQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynOspfAreaQueryResponse customCtcdynOspfAreaQuery(@Param("sessionId") String sessionId, CustomCtcdynOspfAreaQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customCtcdynOspfAreaQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynOspfAreaQueryResponse> customCtcdynOspfAreaQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomCtcdynOspfAreaQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customCtcdynOspfAreaQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynOspfAreaQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynOspfAreaQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynOspfAreaQueryResponse customCtcdynOspfAreaQuery(CustomCtcdynOspfAreaQueryRequest body, @QueryMap(encoded=true) CustomCtcdynOspfAreaQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customCtcdynOspfAreaQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynOspfAreaQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynOspfAreaQueryResponse> customCtcdynOspfAreaQueryWithHttpInfo(CustomCtcdynOspfAreaQueryRequest body, @QueryMap(encoded=true) CustomCtcdynOspfAreaQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynOspfAreaQuery</code> method in a fluent style.
   */
  public static class CustomCtcdynOspfAreaQueryQueryParams extends HashMap<String, Object> {
    public CustomCtcdynOspfAreaQueryQueryParams sessionId(final String value) {
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
   * @return CustomCtcdynOspfAreaSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynOspfAreaSystemAttributesResponse customCtcdynOspfAreaSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynOspfAreaSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customCtcdynOspfAreaSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynOspfAreaSystemAttributesResponse> customCtcdynOspfAreaSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynOspfAreaSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customCtcdynOspfAreaSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynOspfAreaSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynOspfAreaSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynOspfAreaSystemAttributesResponse customCtcdynOspfAreaSystemAttributes(@Param("elid") String elid, CustomCtcdynOspfAreaSystemAttributesRequest body, @QueryMap(encoded=true) CustomCtcdynOspfAreaSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customCtcdynOspfAreaSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynOspfAreaSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynOspfAreaSystemAttributesResponse> customCtcdynOspfAreaSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomCtcdynOspfAreaSystemAttributesRequest body, @QueryMap(encoded=true) CustomCtcdynOspfAreaSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynOspfAreaSystemAttributes</code> method in a fluent style.
   */
  public static class CustomCtcdynOspfAreaSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomCtcdynOspfAreaSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete OSPF-Area
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomCtcdynOspfAreaResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomCtcdynOspfAreaResponse deleteCustomCtcdynOspfArea(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomCtcdynOspfAreaRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomCtcdynOspfArea</code> but it also returns the http response headers .
   * Delete OSPF-Area
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomCtcdynOspfAreaResponse> deleteCustomCtcdynOspfAreaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomCtcdynOspfAreaRequestData body);


  /**
   * Delete
   * Delete OSPF-Area
   * Note, this is equivalent to the other <code>deleteCustomCtcdynOspfArea</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomCtcdynOspfAreaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomCtcdynOspfAreaResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomCtcdynOspfAreaResponse deleteCustomCtcdynOspfArea(@Param("elid") String elid, DeleteCustomCtcdynOspfAreaRequestData body, @QueryMap(encoded=true) DeleteCustomCtcdynOspfAreaQueryParams queryParams);

  /**
  * Delete
  * Delete OSPF-Area
  * Note, this is equivalent to the other <code>deleteCustomCtcdynOspfArea</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomCtcdynOspfAreaResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomCtcdynOspfAreaResponse> deleteCustomCtcdynOspfAreaWithHttpInfo(@Param("elid") String elid, DeleteCustomCtcdynOspfAreaRequestData body, @QueryMap(encoded=true) DeleteCustomCtcdynOspfAreaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomCtcdynOspfArea</code> method in a fluent style.
   */
  public static class DeleteCustomCtcdynOspfAreaQueryParams extends HashMap<String, Object> {
    public DeleteCustomCtcdynOspfAreaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify OSPF-Area
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomCtcdynOspfAreaResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomCtcdynOspfAreaResponse updateCustomCtcdynOspfArea(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomCtcdynOspfAreaRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomCtcdynOspfArea</code> but it also returns the http response headers .
   * Modify OSPF-Area
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomCtcdynOspfAreaResponse> updateCustomCtcdynOspfAreaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomCtcdynOspfAreaRequestData body);


  /**
   * Modify
   * Modify OSPF-Area
   * Note, this is equivalent to the other <code>updateCustomCtcdynOspfArea</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomCtcdynOspfAreaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomCtcdynOspfAreaResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomCtcdynOspfAreaResponse updateCustomCtcdynOspfArea(@Param("elid") String elid, UpdateCustomCtcdynOspfAreaRequestData body, @QueryMap(encoded=true) UpdateCustomCtcdynOspfAreaQueryParams queryParams);

  /**
  * Modify
  * Modify OSPF-Area
  * Note, this is equivalent to the other <code>updateCustomCtcdynOspfArea</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomCtcdynOspfAreaResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomCtcdynOspfAreaResponse> updateCustomCtcdynOspfAreaWithHttpInfo(@Param("elid") String elid, UpdateCustomCtcdynOspfAreaRequestData body, @QueryMap(encoded=true) UpdateCustomCtcdynOspfAreaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomCtcdynOspfArea</code> method in a fluent style.
   */
  public static class UpdateCustomCtcdynOspfAreaQueryParams extends HashMap<String, Object> {
    public UpdateCustomCtcdynOspfAreaQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomCtcdynOspfAreaResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomCtcdynOspfAreaResponse updateSystemAttributesCustomCtcdynOspfArea(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomCtcdynOspfAreaRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomCtcdynOspfArea</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomCtcdynOspfAreaResponse> updateSystemAttributesCustomCtcdynOspfAreaWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomCtcdynOspfAreaRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomCtcdynOspfArea</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomCtcdynOspfAreaQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomCtcdynOspfAreaResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomCtcdynOspfAreaResponse updateSystemAttributesCustomCtcdynOspfArea(@Param("elid") String elid, UpdateSystemAttributesCustomCtcdynOspfAreaRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomCtcdynOspfAreaQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomCtcdynOspfArea</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomCtcdynOspfAreaResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynOspfArea/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomCtcdynOspfAreaResponse> updateSystemAttributesCustomCtcdynOspfAreaWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomCtcdynOspfAreaRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomCtcdynOspfAreaQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomCtcdynOspfArea</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomCtcdynOspfAreaQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomCtcdynOspfAreaQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
