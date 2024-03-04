package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynStorageProductRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynStorageProductResponse;
import com.fntsoftware.businessgateway.entities.CustomCtcdynStorageProduct100022RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynStorageProduct100022ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynStorageProduct100024RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynStorageProduct100024ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynStorageProduct100027RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynStorageProduct100027ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynStorageProduct100035RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynStorageProduct100035ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynStorageProductQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomCtcdynStorageProductQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomCtcdynStorageProductSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomCtcdynStorageProductSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomCtcdynStorageProductRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomCtcdynStorageProductResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynStorageProductRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynStorageProductResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomCtcdynStorageProductRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomCtcdynStorageProductResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface CustomCtcdynStorageProductApi extends ApiClient.Api {


  /**
   * Create
   * Create Storage product
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomCtcdynStorageProductResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomCtcdynStorageProductResponse createCustomCtcdynStorageProduct(@Param("sessionId") String sessionId, CreateCustomCtcdynStorageProductRequestData body);

  /**
   * Create
   * Similar to <code>createCustomCtcdynStorageProduct</code> but it also returns the http response headers .
   * Create Storage product
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomCtcdynStorageProductResponse> createCustomCtcdynStorageProductWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomCtcdynStorageProductRequestData body);


  /**
   * Create
   * Create Storage product
   * Note, this is equivalent to the other <code>createCustomCtcdynStorageProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomCtcdynStorageProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomCtcdynStorageProductResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomCtcdynStorageProductResponse createCustomCtcdynStorageProduct(CreateCustomCtcdynStorageProductRequestData body, @QueryMap(encoded=true) CreateCustomCtcdynStorageProductQueryParams queryParams);

  /**
  * Create
  * Create Storage product
  * Note, this is equivalent to the other <code>createCustomCtcdynStorageProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomCtcdynStorageProductResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomCtcdynStorageProductResponse> createCustomCtcdynStorageProductWithHttpInfo(CreateCustomCtcdynStorageProductRequestData body, @QueryMap(encoded=true) CreateCustomCtcdynStorageProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomCtcdynStorageProduct</code> method in a fluent style.
   */
  public static class CreateCustomCtcdynStorageProductQueryParams extends HashMap<String, Object> {
    public CreateCustomCtcdynStorageProductQueryParams sessionId(final String value) {
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
   * @return CustomCtcdynStorageProduct100022ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100022?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynStorageProduct100022ResponseData customCtcdynStorageProduct100022(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynStorageProduct100022RequestData body);

  /**
   * Get relations to Storage unit entities
   * Similar to <code>customCtcdynStorageProduct100022</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100022?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynStorageProduct100022ResponseData> customCtcdynStorageProduct100022WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynStorageProduct100022RequestData body);


  /**
   * Get relations to Storage unit entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynStorageProduct100022</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynStorageProduct100022QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynStorageProduct100022ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100022?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynStorageProduct100022ResponseData customCtcdynStorageProduct100022(@Param("elid") String elid, CustomCtcdynStorageProduct100022RequestData body, @QueryMap(encoded=true) CustomCtcdynStorageProduct100022QueryParams queryParams);

  /**
  * Get relations to Storage unit entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynStorageProduct100022</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynStorageProduct100022ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100022?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynStorageProduct100022ResponseData> customCtcdynStorageProduct100022WithHttpInfo(@Param("elid") String elid, CustomCtcdynStorageProduct100022RequestData body, @QueryMap(encoded=true) CustomCtcdynStorageProduct100022QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynStorageProduct100022</code> method in a fluent style.
   */
  public static class CustomCtcdynStorageProduct100022QueryParams extends HashMap<String, Object> {
    public CustomCtcdynStorageProduct100022QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual Datacenter entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomCtcdynStorageProduct100024ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100024?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynStorageProduct100024ResponseData customCtcdynStorageProduct100024(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynStorageProduct100024RequestData body);

  /**
   * Get relations to Virtual Datacenter entities
   * Similar to <code>customCtcdynStorageProduct100024</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100024?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynStorageProduct100024ResponseData> customCtcdynStorageProduct100024WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynStorageProduct100024RequestData body);


  /**
   * Get relations to Virtual Datacenter entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynStorageProduct100024</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynStorageProduct100024QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynStorageProduct100024ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100024?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynStorageProduct100024ResponseData customCtcdynStorageProduct100024(@Param("elid") String elid, CustomCtcdynStorageProduct100024RequestData body, @QueryMap(encoded=true) CustomCtcdynStorageProduct100024QueryParams queryParams);

  /**
  * Get relations to Virtual Datacenter entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynStorageProduct100024</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynStorageProduct100024ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100024?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynStorageProduct100024ResponseData> customCtcdynStorageProduct100024WithHttpInfo(@Param("elid") String elid, CustomCtcdynStorageProduct100024RequestData body, @QueryMap(encoded=true) CustomCtcdynStorageProduct100024QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynStorageProduct100024</code> method in a fluent style.
   */
  public static class CustomCtcdynStorageProduct100024QueryParams extends HashMap<String, Object> {
    public CustomCtcdynStorageProduct100024QueryParams sessionId(final String value) {
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
   * @return CustomCtcdynStorageProduct100027ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100027?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynStorageProduct100027ResponseData customCtcdynStorageProduct100027(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynStorageProduct100027RequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>customCtcdynStorageProduct100027</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100027?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynStorageProduct100027ResponseData> customCtcdynStorageProduct100027WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynStorageProduct100027RequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynStorageProduct100027</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynStorageProduct100027QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynStorageProduct100027ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100027?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynStorageProduct100027ResponseData customCtcdynStorageProduct100027(@Param("elid") String elid, CustomCtcdynStorageProduct100027RequestData body, @QueryMap(encoded=true) CustomCtcdynStorageProduct100027QueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynStorageProduct100027</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynStorageProduct100027ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100027?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynStorageProduct100027ResponseData> customCtcdynStorageProduct100027WithHttpInfo(@Param("elid") String elid, CustomCtcdynStorageProduct100027RequestData body, @QueryMap(encoded=true) CustomCtcdynStorageProduct100027QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynStorageProduct100027</code> method in a fluent style.
   */
  public static class CustomCtcdynStorageProduct100027QueryParams extends HashMap<String, Object> {
    public CustomCtcdynStorageProduct100027QueryParams sessionId(final String value) {
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
   * @return CustomCtcdynStorageProduct100035ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100035?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynStorageProduct100035ResponseData customCtcdynStorageProduct100035(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynStorageProduct100035RequestData body);

  /**
   * Get relations to VM datastore entities
   * Similar to <code>customCtcdynStorageProduct100035</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100035?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynStorageProduct100035ResponseData> customCtcdynStorageProduct100035WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynStorageProduct100035RequestData body);


  /**
   * Get relations to VM datastore entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynStorageProduct100035</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynStorageProduct100035QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynStorageProduct100035ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100035?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynStorageProduct100035ResponseData customCtcdynStorageProduct100035(@Param("elid") String elid, CustomCtcdynStorageProduct100035RequestData body, @QueryMap(encoded=true) CustomCtcdynStorageProduct100035QueryParams queryParams);

  /**
  * Get relations to VM datastore entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynStorageProduct100035</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynStorageProduct100035ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/100035?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynStorageProduct100035ResponseData> customCtcdynStorageProduct100035WithHttpInfo(@Param("elid") String elid, CustomCtcdynStorageProduct100035RequestData body, @QueryMap(encoded=true) CustomCtcdynStorageProduct100035QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynStorageProduct100035</code> method in a fluent style.
   */
  public static class CustomCtcdynStorageProduct100035QueryParams extends HashMap<String, Object> {
    public CustomCtcdynStorageProduct100035QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomCtcdynStorageProductQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynStorageProductQueryResponse customCtcdynStorageProductQuery(@Param("sessionId") String sessionId, CustomCtcdynStorageProductQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customCtcdynStorageProductQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynStorageProductQueryResponse> customCtcdynStorageProductQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomCtcdynStorageProductQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customCtcdynStorageProductQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynStorageProductQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynStorageProductQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynStorageProductQueryResponse customCtcdynStorageProductQuery(CustomCtcdynStorageProductQueryRequest body, @QueryMap(encoded=true) CustomCtcdynStorageProductQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customCtcdynStorageProductQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynStorageProductQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynStorageProductQueryResponse> customCtcdynStorageProductQueryWithHttpInfo(CustomCtcdynStorageProductQueryRequest body, @QueryMap(encoded=true) CustomCtcdynStorageProductQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynStorageProductQuery</code> method in a fluent style.
   */
  public static class CustomCtcdynStorageProductQueryQueryParams extends HashMap<String, Object> {
    public CustomCtcdynStorageProductQueryQueryParams sessionId(final String value) {
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
   * @return CustomCtcdynStorageProductSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynStorageProductSystemAttributesResponse customCtcdynStorageProductSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynStorageProductSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customCtcdynStorageProductSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynStorageProductSystemAttributesResponse> customCtcdynStorageProductSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynStorageProductSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customCtcdynStorageProductSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynStorageProductSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynStorageProductSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynStorageProductSystemAttributesResponse customCtcdynStorageProductSystemAttributes(@Param("elid") String elid, CustomCtcdynStorageProductSystemAttributesRequest body, @QueryMap(encoded=true) CustomCtcdynStorageProductSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customCtcdynStorageProductSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynStorageProductSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynStorageProductSystemAttributesResponse> customCtcdynStorageProductSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomCtcdynStorageProductSystemAttributesRequest body, @QueryMap(encoded=true) CustomCtcdynStorageProductSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynStorageProductSystemAttributes</code> method in a fluent style.
   */
  public static class CustomCtcdynStorageProductSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomCtcdynStorageProductSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Storage product
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomCtcdynStorageProductResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomCtcdynStorageProductResponse deleteCustomCtcdynStorageProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomCtcdynStorageProductRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomCtcdynStorageProduct</code> but it also returns the http response headers .
   * Delete Storage product
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomCtcdynStorageProductResponse> deleteCustomCtcdynStorageProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomCtcdynStorageProductRequestData body);


  /**
   * Delete
   * Delete Storage product
   * Note, this is equivalent to the other <code>deleteCustomCtcdynStorageProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomCtcdynStorageProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomCtcdynStorageProductResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomCtcdynStorageProductResponse deleteCustomCtcdynStorageProduct(@Param("elid") String elid, DeleteCustomCtcdynStorageProductRequestData body, @QueryMap(encoded=true) DeleteCustomCtcdynStorageProductQueryParams queryParams);

  /**
  * Delete
  * Delete Storage product
  * Note, this is equivalent to the other <code>deleteCustomCtcdynStorageProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomCtcdynStorageProductResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomCtcdynStorageProductResponse> deleteCustomCtcdynStorageProductWithHttpInfo(@Param("elid") String elid, DeleteCustomCtcdynStorageProductRequestData body, @QueryMap(encoded=true) DeleteCustomCtcdynStorageProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomCtcdynStorageProduct</code> method in a fluent style.
   */
  public static class DeleteCustomCtcdynStorageProductQueryParams extends HashMap<String, Object> {
    public DeleteCustomCtcdynStorageProductQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Storage product
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomCtcdynStorageProductResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomCtcdynStorageProductResponse updateCustomCtcdynStorageProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomCtcdynStorageProductRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomCtcdynStorageProduct</code> but it also returns the http response headers .
   * Modify Storage product
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomCtcdynStorageProductResponse> updateCustomCtcdynStorageProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomCtcdynStorageProductRequestData body);


  /**
   * Modify
   * Modify Storage product
   * Note, this is equivalent to the other <code>updateCustomCtcdynStorageProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomCtcdynStorageProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomCtcdynStorageProductResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomCtcdynStorageProductResponse updateCustomCtcdynStorageProduct(@Param("elid") String elid, UpdateCustomCtcdynStorageProductRequestData body, @QueryMap(encoded=true) UpdateCustomCtcdynStorageProductQueryParams queryParams);

  /**
  * Modify
  * Modify Storage product
  * Note, this is equivalent to the other <code>updateCustomCtcdynStorageProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomCtcdynStorageProductResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomCtcdynStorageProductResponse> updateCustomCtcdynStorageProductWithHttpInfo(@Param("elid") String elid, UpdateCustomCtcdynStorageProductRequestData body, @QueryMap(encoded=true) UpdateCustomCtcdynStorageProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomCtcdynStorageProduct</code> method in a fluent style.
   */
  public static class UpdateCustomCtcdynStorageProductQueryParams extends HashMap<String, Object> {
    public UpdateCustomCtcdynStorageProductQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomCtcdynStorageProductResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomCtcdynStorageProductResponse updateSystemAttributesCustomCtcdynStorageProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomCtcdynStorageProductRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomCtcdynStorageProduct</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomCtcdynStorageProductResponse> updateSystemAttributesCustomCtcdynStorageProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomCtcdynStorageProductRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomCtcdynStorageProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomCtcdynStorageProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomCtcdynStorageProductResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomCtcdynStorageProductResponse updateSystemAttributesCustomCtcdynStorageProduct(@Param("elid") String elid, UpdateSystemAttributesCustomCtcdynStorageProductRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomCtcdynStorageProductQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomCtcdynStorageProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomCtcdynStorageProductResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynStorageProduct/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomCtcdynStorageProductResponse> updateSystemAttributesCustomCtcdynStorageProductWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomCtcdynStorageProductRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomCtcdynStorageProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomCtcdynStorageProduct</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomCtcdynStorageProductQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomCtcdynStorageProductQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
