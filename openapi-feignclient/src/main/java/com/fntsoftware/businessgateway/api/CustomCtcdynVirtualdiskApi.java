package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynVirtualdiskRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynVirtualdiskResponse;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtualdisk100030RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtualdisk100030ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtualdisk100031RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtualdisk100031ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtualdisk100034RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtualdisk100034ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtualdiskQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtualdiskQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtualdiskSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtualdiskSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomCtcdynVirtualdiskRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomCtcdynVirtualdiskResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynVirtualdiskRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynVirtualdiskResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomCtcdynVirtualdiskRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomCtcdynVirtualdiskResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface CustomCtcdynVirtualdiskApi extends ApiClient.Api {


  /**
   * Create
   * Create Virtual disk
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomCtcdynVirtualdiskResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomCtcdynVirtualdiskResponse createCustomCtcdynVirtualdisk(@Param("sessionId") String sessionId, CreateCustomCtcdynVirtualdiskRequestData body);

  /**
   * Create
   * Similar to <code>createCustomCtcdynVirtualdisk</code> but it also returns the http response headers .
   * Create Virtual disk
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomCtcdynVirtualdiskResponse> createCustomCtcdynVirtualdiskWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomCtcdynVirtualdiskRequestData body);


  /**
   * Create
   * Create Virtual disk
   * Note, this is equivalent to the other <code>createCustomCtcdynVirtualdisk</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomCtcdynVirtualdiskQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomCtcdynVirtualdiskResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomCtcdynVirtualdiskResponse createCustomCtcdynVirtualdisk(CreateCustomCtcdynVirtualdiskRequestData body, @QueryMap(encoded=true) CreateCustomCtcdynVirtualdiskQueryParams queryParams);

  /**
  * Create
  * Create Virtual disk
  * Note, this is equivalent to the other <code>createCustomCtcdynVirtualdisk</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomCtcdynVirtualdiskResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomCtcdynVirtualdiskResponse> createCustomCtcdynVirtualdiskWithHttpInfo(CreateCustomCtcdynVirtualdiskRequestData body, @QueryMap(encoded=true) CreateCustomCtcdynVirtualdiskQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomCtcdynVirtualdisk</code> method in a fluent style.
   */
  public static class CreateCustomCtcdynVirtualdiskQueryParams extends HashMap<String, Object> {
    public CreateCustomCtcdynVirtualdiskQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomCtcdynVirtualdisk100030ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/100030?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVirtualdisk100030ResponseData customCtcdynVirtualdisk100030(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtualdisk100030RequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>customCtcdynVirtualdisk100030</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/100030?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVirtualdisk100030ResponseData> customCtcdynVirtualdisk100030WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtualdisk100030RequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynVirtualdisk100030</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVirtualdisk100030QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVirtualdisk100030ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/100030?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVirtualdisk100030ResponseData customCtcdynVirtualdisk100030(@Param("elid") String elid, CustomCtcdynVirtualdisk100030RequestData body, @QueryMap(encoded=true) CustomCtcdynVirtualdisk100030QueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynVirtualdisk100030</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVirtualdisk100030ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/100030?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVirtualdisk100030ResponseData> customCtcdynVirtualdisk100030WithHttpInfo(@Param("elid") String elid, CustomCtcdynVirtualdisk100030RequestData body, @QueryMap(encoded=true) CustomCtcdynVirtualdisk100030QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVirtualdisk100030</code> method in a fluent style.
   */
  public static class CustomCtcdynVirtualdisk100030QueryParams extends HashMap<String, Object> {
    public CustomCtcdynVirtualdisk100030QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage unit entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomCtcdynVirtualdisk100031ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/100031?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVirtualdisk100031ResponseData customCtcdynVirtualdisk100031(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtualdisk100031RequestData body);

  /**
   * Get relations to Storage unit entities
   * Similar to <code>customCtcdynVirtualdisk100031</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/100031?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVirtualdisk100031ResponseData> customCtcdynVirtualdisk100031WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtualdisk100031RequestData body);


  /**
   * Get relations to Storage unit entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynVirtualdisk100031</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVirtualdisk100031QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVirtualdisk100031ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/100031?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVirtualdisk100031ResponseData customCtcdynVirtualdisk100031(@Param("elid") String elid, CustomCtcdynVirtualdisk100031RequestData body, @QueryMap(encoded=true) CustomCtcdynVirtualdisk100031QueryParams queryParams);

  /**
  * Get relations to Storage unit entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynVirtualdisk100031</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVirtualdisk100031ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/100031?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVirtualdisk100031ResponseData> customCtcdynVirtualdisk100031WithHttpInfo(@Param("elid") String elid, CustomCtcdynVirtualdisk100031RequestData body, @QueryMap(encoded=true) CustomCtcdynVirtualdisk100031QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVirtualdisk100031</code> method in a fluent style.
   */
  public static class CustomCtcdynVirtualdisk100031QueryParams extends HashMap<String, Object> {
    public CustomCtcdynVirtualdisk100031QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to VM datastore entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomCtcdynVirtualdisk100034ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/100034?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVirtualdisk100034ResponseData customCtcdynVirtualdisk100034(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtualdisk100034RequestData body);

  /**
   * Get relations to VM datastore entities
   * Similar to <code>customCtcdynVirtualdisk100034</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/100034?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVirtualdisk100034ResponseData> customCtcdynVirtualdisk100034WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtualdisk100034RequestData body);


  /**
   * Get relations to VM datastore entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynVirtualdisk100034</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVirtualdisk100034QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVirtualdisk100034ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/100034?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVirtualdisk100034ResponseData customCtcdynVirtualdisk100034(@Param("elid") String elid, CustomCtcdynVirtualdisk100034RequestData body, @QueryMap(encoded=true) CustomCtcdynVirtualdisk100034QueryParams queryParams);

  /**
  * Get relations to VM datastore entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynVirtualdisk100034</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVirtualdisk100034ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/100034?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVirtualdisk100034ResponseData> customCtcdynVirtualdisk100034WithHttpInfo(@Param("elid") String elid, CustomCtcdynVirtualdisk100034RequestData body, @QueryMap(encoded=true) CustomCtcdynVirtualdisk100034QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVirtualdisk100034</code> method in a fluent style.
   */
  public static class CustomCtcdynVirtualdisk100034QueryParams extends HashMap<String, Object> {
    public CustomCtcdynVirtualdisk100034QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomCtcdynVirtualdiskQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVirtualdiskQueryResponse customCtcdynVirtualdiskQuery(@Param("sessionId") String sessionId, CustomCtcdynVirtualdiskQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customCtcdynVirtualdiskQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVirtualdiskQueryResponse> customCtcdynVirtualdiskQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomCtcdynVirtualdiskQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customCtcdynVirtualdiskQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVirtualdiskQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVirtualdiskQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVirtualdiskQueryResponse customCtcdynVirtualdiskQuery(CustomCtcdynVirtualdiskQueryRequest body, @QueryMap(encoded=true) CustomCtcdynVirtualdiskQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customCtcdynVirtualdiskQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVirtualdiskQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVirtualdiskQueryResponse> customCtcdynVirtualdiskQueryWithHttpInfo(CustomCtcdynVirtualdiskQueryRequest body, @QueryMap(encoded=true) CustomCtcdynVirtualdiskQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVirtualdiskQuery</code> method in a fluent style.
   */
  public static class CustomCtcdynVirtualdiskQueryQueryParams extends HashMap<String, Object> {
    public CustomCtcdynVirtualdiskQueryQueryParams sessionId(final String value) {
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
   * @return CustomCtcdynVirtualdiskSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVirtualdiskSystemAttributesResponse customCtcdynVirtualdiskSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtualdiskSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customCtcdynVirtualdiskSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVirtualdiskSystemAttributesResponse> customCtcdynVirtualdiskSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtualdiskSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customCtcdynVirtualdiskSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVirtualdiskSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVirtualdiskSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVirtualdiskSystemAttributesResponse customCtcdynVirtualdiskSystemAttributes(@Param("elid") String elid, CustomCtcdynVirtualdiskSystemAttributesRequest body, @QueryMap(encoded=true) CustomCtcdynVirtualdiskSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customCtcdynVirtualdiskSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVirtualdiskSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVirtualdiskSystemAttributesResponse> customCtcdynVirtualdiskSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomCtcdynVirtualdiskSystemAttributesRequest body, @QueryMap(encoded=true) CustomCtcdynVirtualdiskSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVirtualdiskSystemAttributes</code> method in a fluent style.
   */
  public static class CustomCtcdynVirtualdiskSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomCtcdynVirtualdiskSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Virtual disk
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomCtcdynVirtualdiskResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomCtcdynVirtualdiskResponse deleteCustomCtcdynVirtualdisk(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomCtcdynVirtualdiskRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomCtcdynVirtualdisk</code> but it also returns the http response headers .
   * Delete Virtual disk
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomCtcdynVirtualdiskResponse> deleteCustomCtcdynVirtualdiskWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomCtcdynVirtualdiskRequestData body);


  /**
   * Delete
   * Delete Virtual disk
   * Note, this is equivalent to the other <code>deleteCustomCtcdynVirtualdisk</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomCtcdynVirtualdiskQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomCtcdynVirtualdiskResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomCtcdynVirtualdiskResponse deleteCustomCtcdynVirtualdisk(@Param("elid") String elid, DeleteCustomCtcdynVirtualdiskRequestData body, @QueryMap(encoded=true) DeleteCustomCtcdynVirtualdiskQueryParams queryParams);

  /**
  * Delete
  * Delete Virtual disk
  * Note, this is equivalent to the other <code>deleteCustomCtcdynVirtualdisk</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomCtcdynVirtualdiskResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomCtcdynVirtualdiskResponse> deleteCustomCtcdynVirtualdiskWithHttpInfo(@Param("elid") String elid, DeleteCustomCtcdynVirtualdiskRequestData body, @QueryMap(encoded=true) DeleteCustomCtcdynVirtualdiskQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomCtcdynVirtualdisk</code> method in a fluent style.
   */
  public static class DeleteCustomCtcdynVirtualdiskQueryParams extends HashMap<String, Object> {
    public DeleteCustomCtcdynVirtualdiskQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Virtual disk
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomCtcdynVirtualdiskResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomCtcdynVirtualdiskResponse updateCustomCtcdynVirtualdisk(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomCtcdynVirtualdiskRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomCtcdynVirtualdisk</code> but it also returns the http response headers .
   * Modify Virtual disk
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomCtcdynVirtualdiskResponse> updateCustomCtcdynVirtualdiskWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomCtcdynVirtualdiskRequestData body);


  /**
   * Modify
   * Modify Virtual disk
   * Note, this is equivalent to the other <code>updateCustomCtcdynVirtualdisk</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomCtcdynVirtualdiskQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomCtcdynVirtualdiskResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomCtcdynVirtualdiskResponse updateCustomCtcdynVirtualdisk(@Param("elid") String elid, UpdateCustomCtcdynVirtualdiskRequestData body, @QueryMap(encoded=true) UpdateCustomCtcdynVirtualdiskQueryParams queryParams);

  /**
  * Modify
  * Modify Virtual disk
  * Note, this is equivalent to the other <code>updateCustomCtcdynVirtualdisk</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomCtcdynVirtualdiskResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomCtcdynVirtualdiskResponse> updateCustomCtcdynVirtualdiskWithHttpInfo(@Param("elid") String elid, UpdateCustomCtcdynVirtualdiskRequestData body, @QueryMap(encoded=true) UpdateCustomCtcdynVirtualdiskQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomCtcdynVirtualdisk</code> method in a fluent style.
   */
  public static class UpdateCustomCtcdynVirtualdiskQueryParams extends HashMap<String, Object> {
    public UpdateCustomCtcdynVirtualdiskQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomCtcdynVirtualdiskResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomCtcdynVirtualdiskResponse updateSystemAttributesCustomCtcdynVirtualdisk(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomCtcdynVirtualdiskRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomCtcdynVirtualdisk</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomCtcdynVirtualdiskResponse> updateSystemAttributesCustomCtcdynVirtualdiskWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomCtcdynVirtualdiskRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomCtcdynVirtualdisk</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomCtcdynVirtualdiskQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomCtcdynVirtualdiskResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomCtcdynVirtualdiskResponse updateSystemAttributesCustomCtcdynVirtualdisk(@Param("elid") String elid, UpdateSystemAttributesCustomCtcdynVirtualdiskRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomCtcdynVirtualdiskQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomCtcdynVirtualdisk</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomCtcdynVirtualdiskResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtualdisk/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomCtcdynVirtualdiskResponse> updateSystemAttributesCustomCtcdynVirtualdiskWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomCtcdynVirtualdiskRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomCtcdynVirtualdiskQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomCtcdynVirtualdisk</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomCtcdynVirtualdiskQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomCtcdynVirtualdiskQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
