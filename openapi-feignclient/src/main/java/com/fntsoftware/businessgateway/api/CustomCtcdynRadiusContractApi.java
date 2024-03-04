package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynRadiusContractRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynRadiusContractResponse;
import com.fntsoftware.businessgateway.entities.CustomCtcdynRadiusContract100048RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynRadiusContract100048ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynRadiusContract100049RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynRadiusContract100049ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynRadiusContractQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomCtcdynRadiusContractQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomCtcdynRadiusContractSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomCtcdynRadiusContractSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomCtcdynRadiusContractRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomCtcdynRadiusContractResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynRadiusContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynRadiusContractResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomCtcdynRadiusContractRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomCtcdynRadiusContractResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface CustomCtcdynRadiusContractApi extends ApiClient.Api {


  /**
   * Create
   * Create RADIUS-contract
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomCtcdynRadiusContractResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomCtcdynRadiusContractResponse createCustomCtcdynRadiusContract(@Param("sessionId") String sessionId, CreateCustomCtcdynRadiusContractRequestData body);

  /**
   * Create
   * Similar to <code>createCustomCtcdynRadiusContract</code> but it also returns the http response headers .
   * Create RADIUS-contract
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomCtcdynRadiusContractResponse> createCustomCtcdynRadiusContractWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomCtcdynRadiusContractRequestData body);


  /**
   * Create
   * Create RADIUS-contract
   * Note, this is equivalent to the other <code>createCustomCtcdynRadiusContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomCtcdynRadiusContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomCtcdynRadiusContractResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomCtcdynRadiusContractResponse createCustomCtcdynRadiusContract(CreateCustomCtcdynRadiusContractRequestData body, @QueryMap(encoded=true) CreateCustomCtcdynRadiusContractQueryParams queryParams);

  /**
  * Create
  * Create RADIUS-contract
  * Note, this is equivalent to the other <code>createCustomCtcdynRadiusContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomCtcdynRadiusContractResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomCtcdynRadiusContractResponse> createCustomCtcdynRadiusContractWithHttpInfo(CreateCustomCtcdynRadiusContractRequestData body, @QueryMap(encoded=true) CreateCustomCtcdynRadiusContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomCtcdynRadiusContract</code> method in a fluent style.
   */
  public static class CreateCustomCtcdynRadiusContractQueryParams extends HashMap<String, Object> {
    public CreateCustomCtcdynRadiusContractQueryParams sessionId(final String value) {
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
   * @return CustomCtcdynRadiusContract100048ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/100048?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynRadiusContract100048ResponseData customCtcdynRadiusContract100048(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynRadiusContract100048RequestData body);

  /**
   * Get relations to IPv4 address entities
   * Similar to <code>customCtcdynRadiusContract100048</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/100048?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynRadiusContract100048ResponseData> customCtcdynRadiusContract100048WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynRadiusContract100048RequestData body);


  /**
   * Get relations to IPv4 address entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynRadiusContract100048</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynRadiusContract100048QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynRadiusContract100048ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/100048?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynRadiusContract100048ResponseData customCtcdynRadiusContract100048(@Param("elid") String elid, CustomCtcdynRadiusContract100048RequestData body, @QueryMap(encoded=true) CustomCtcdynRadiusContract100048QueryParams queryParams);

  /**
  * Get relations to IPv4 address entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynRadiusContract100048</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynRadiusContract100048ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/100048?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynRadiusContract100048ResponseData> customCtcdynRadiusContract100048WithHttpInfo(@Param("elid") String elid, CustomCtcdynRadiusContract100048RequestData body, @QueryMap(encoded=true) CustomCtcdynRadiusContract100048QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynRadiusContract100048</code> method in a fluent style.
   */
  public static class CustomCtcdynRadiusContract100048QueryParams extends HashMap<String, Object> {
    public CustomCtcdynRadiusContract100048QueryParams sessionId(final String value) {
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
   * @return CustomCtcdynRadiusContract100049ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/100049?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynRadiusContract100049ResponseData customCtcdynRadiusContract100049(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynRadiusContract100049RequestData body);

  /**
   * Get relations to IPv6 address entities
   * Similar to <code>customCtcdynRadiusContract100049</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/100049?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynRadiusContract100049ResponseData> customCtcdynRadiusContract100049WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynRadiusContract100049RequestData body);


  /**
   * Get relations to IPv6 address entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynRadiusContract100049</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynRadiusContract100049QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynRadiusContract100049ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/100049?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynRadiusContract100049ResponseData customCtcdynRadiusContract100049(@Param("elid") String elid, CustomCtcdynRadiusContract100049RequestData body, @QueryMap(encoded=true) CustomCtcdynRadiusContract100049QueryParams queryParams);

  /**
  * Get relations to IPv6 address entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynRadiusContract100049</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynRadiusContract100049ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/100049?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynRadiusContract100049ResponseData> customCtcdynRadiusContract100049WithHttpInfo(@Param("elid") String elid, CustomCtcdynRadiusContract100049RequestData body, @QueryMap(encoded=true) CustomCtcdynRadiusContract100049QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynRadiusContract100049</code> method in a fluent style.
   */
  public static class CustomCtcdynRadiusContract100049QueryParams extends HashMap<String, Object> {
    public CustomCtcdynRadiusContract100049QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomCtcdynRadiusContractQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynRadiusContractQueryResponse customCtcdynRadiusContractQuery(@Param("sessionId") String sessionId, CustomCtcdynRadiusContractQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customCtcdynRadiusContractQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynRadiusContractQueryResponse> customCtcdynRadiusContractQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomCtcdynRadiusContractQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customCtcdynRadiusContractQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynRadiusContractQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynRadiusContractQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynRadiusContractQueryResponse customCtcdynRadiusContractQuery(CustomCtcdynRadiusContractQueryRequest body, @QueryMap(encoded=true) CustomCtcdynRadiusContractQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customCtcdynRadiusContractQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynRadiusContractQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynRadiusContractQueryResponse> customCtcdynRadiusContractQueryWithHttpInfo(CustomCtcdynRadiusContractQueryRequest body, @QueryMap(encoded=true) CustomCtcdynRadiusContractQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynRadiusContractQuery</code> method in a fluent style.
   */
  public static class CustomCtcdynRadiusContractQueryQueryParams extends HashMap<String, Object> {
    public CustomCtcdynRadiusContractQueryQueryParams sessionId(final String value) {
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
   * @return CustomCtcdynRadiusContractSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynRadiusContractSystemAttributesResponse customCtcdynRadiusContractSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynRadiusContractSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customCtcdynRadiusContractSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynRadiusContractSystemAttributesResponse> customCtcdynRadiusContractSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynRadiusContractSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customCtcdynRadiusContractSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynRadiusContractSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynRadiusContractSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynRadiusContractSystemAttributesResponse customCtcdynRadiusContractSystemAttributes(@Param("elid") String elid, CustomCtcdynRadiusContractSystemAttributesRequest body, @QueryMap(encoded=true) CustomCtcdynRadiusContractSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customCtcdynRadiusContractSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynRadiusContractSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynRadiusContractSystemAttributesResponse> customCtcdynRadiusContractSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomCtcdynRadiusContractSystemAttributesRequest body, @QueryMap(encoded=true) CustomCtcdynRadiusContractSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynRadiusContractSystemAttributes</code> method in a fluent style.
   */
  public static class CustomCtcdynRadiusContractSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomCtcdynRadiusContractSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete RADIUS-contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomCtcdynRadiusContractResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomCtcdynRadiusContractResponse deleteCustomCtcdynRadiusContract(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomCtcdynRadiusContractRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomCtcdynRadiusContract</code> but it also returns the http response headers .
   * Delete RADIUS-contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomCtcdynRadiusContractResponse> deleteCustomCtcdynRadiusContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomCtcdynRadiusContractRequestData body);


  /**
   * Delete
   * Delete RADIUS-contract
   * Note, this is equivalent to the other <code>deleteCustomCtcdynRadiusContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomCtcdynRadiusContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomCtcdynRadiusContractResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomCtcdynRadiusContractResponse deleteCustomCtcdynRadiusContract(@Param("elid") String elid, DeleteCustomCtcdynRadiusContractRequestData body, @QueryMap(encoded=true) DeleteCustomCtcdynRadiusContractQueryParams queryParams);

  /**
  * Delete
  * Delete RADIUS-contract
  * Note, this is equivalent to the other <code>deleteCustomCtcdynRadiusContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomCtcdynRadiusContractResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomCtcdynRadiusContractResponse> deleteCustomCtcdynRadiusContractWithHttpInfo(@Param("elid") String elid, DeleteCustomCtcdynRadiusContractRequestData body, @QueryMap(encoded=true) DeleteCustomCtcdynRadiusContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomCtcdynRadiusContract</code> method in a fluent style.
   */
  public static class DeleteCustomCtcdynRadiusContractQueryParams extends HashMap<String, Object> {
    public DeleteCustomCtcdynRadiusContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify RADIUS-contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomCtcdynRadiusContractResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomCtcdynRadiusContractResponse updateCustomCtcdynRadiusContract(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomCtcdynRadiusContractRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomCtcdynRadiusContract</code> but it also returns the http response headers .
   * Modify RADIUS-contract
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomCtcdynRadiusContractResponse> updateCustomCtcdynRadiusContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomCtcdynRadiusContractRequestData body);


  /**
   * Modify
   * Modify RADIUS-contract
   * Note, this is equivalent to the other <code>updateCustomCtcdynRadiusContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomCtcdynRadiusContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomCtcdynRadiusContractResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomCtcdynRadiusContractResponse updateCustomCtcdynRadiusContract(@Param("elid") String elid, UpdateCustomCtcdynRadiusContractRequestData body, @QueryMap(encoded=true) UpdateCustomCtcdynRadiusContractQueryParams queryParams);

  /**
  * Modify
  * Modify RADIUS-contract
  * Note, this is equivalent to the other <code>updateCustomCtcdynRadiusContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomCtcdynRadiusContractResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomCtcdynRadiusContractResponse> updateCustomCtcdynRadiusContractWithHttpInfo(@Param("elid") String elid, UpdateCustomCtcdynRadiusContractRequestData body, @QueryMap(encoded=true) UpdateCustomCtcdynRadiusContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomCtcdynRadiusContract</code> method in a fluent style.
   */
  public static class UpdateCustomCtcdynRadiusContractQueryParams extends HashMap<String, Object> {
    public UpdateCustomCtcdynRadiusContractQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomCtcdynRadiusContractResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomCtcdynRadiusContractResponse updateSystemAttributesCustomCtcdynRadiusContract(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomCtcdynRadiusContractRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomCtcdynRadiusContract</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomCtcdynRadiusContractResponse> updateSystemAttributesCustomCtcdynRadiusContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomCtcdynRadiusContractRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomCtcdynRadiusContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomCtcdynRadiusContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomCtcdynRadiusContractResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomCtcdynRadiusContractResponse updateSystemAttributesCustomCtcdynRadiusContract(@Param("elid") String elid, UpdateSystemAttributesCustomCtcdynRadiusContractRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomCtcdynRadiusContractQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomCtcdynRadiusContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomCtcdynRadiusContractResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynRadiusContract/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomCtcdynRadiusContractResponse> updateSystemAttributesCustomCtcdynRadiusContractWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomCtcdynRadiusContractRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomCtcdynRadiusContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomCtcdynRadiusContract</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomCtcdynRadiusContractQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomCtcdynRadiusContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
