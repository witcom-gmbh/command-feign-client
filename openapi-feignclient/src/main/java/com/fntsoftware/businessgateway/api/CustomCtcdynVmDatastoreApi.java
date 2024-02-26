package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynVmDatastoreRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynVmDatastoreResponse;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastore100033RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastore100033ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastore100034RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastore100034ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastore100035RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastore100035ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastore100036RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastore100036ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastore100037RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastore100037ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastoreQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastoreQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastoreSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVmDatastoreSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomCtcdynVmDatastoreRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomCtcdynVmDatastoreResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynVmDatastoreRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynVmDatastoreResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomCtcdynVmDatastoreRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomCtcdynVmDatastoreResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface CustomCtcdynVmDatastoreApi extends ApiClient.Api {


  /**
   * Create
   * Create VM datastore
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomCtcdynVmDatastoreResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomCtcdynVmDatastoreResponse createCustomCtcdynVmDatastore(@Param("sessionId") String sessionId, CreateCustomCtcdynVmDatastoreRequestData body);

  /**
   * Create
   * Similar to <code>createCustomCtcdynVmDatastore</code> but it also returns the http response headers .
   * Create VM datastore
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomCtcdynVmDatastoreResponse> createCustomCtcdynVmDatastoreWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomCtcdynVmDatastoreRequestData body);


  /**
   * Create
   * Create VM datastore
   * Note, this is equivalent to the other <code>createCustomCtcdynVmDatastore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomCtcdynVmDatastoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomCtcdynVmDatastoreResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomCtcdynVmDatastoreResponse createCustomCtcdynVmDatastore(CreateCustomCtcdynVmDatastoreRequestData body, @QueryMap(encoded=true) CreateCustomCtcdynVmDatastoreQueryParams queryParams);

  /**
  * Create
  * Create VM datastore
  * Note, this is equivalent to the other <code>createCustomCtcdynVmDatastore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomCtcdynVmDatastoreResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomCtcdynVmDatastoreResponse> createCustomCtcdynVmDatastoreWithHttpInfo(CreateCustomCtcdynVmDatastoreRequestData body, @QueryMap(encoded=true) CreateCustomCtcdynVmDatastoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomCtcdynVmDatastore</code> method in a fluent style.
   */
  public static class CreateCustomCtcdynVmDatastoreQueryParams extends HashMap<String, Object> {
    public CreateCustomCtcdynVmDatastoreQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to File system entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomCtcdynVmDatastore100033ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100033?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVmDatastore100033ResponseData customCtcdynVmDatastore100033(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVmDatastore100033RequestData body);

  /**
   * Get relations to File system entities
   * Similar to <code>customCtcdynVmDatastore100033</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100033?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVmDatastore100033ResponseData> customCtcdynVmDatastore100033WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVmDatastore100033RequestData body);


  /**
   * Get relations to File system entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynVmDatastore100033</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVmDatastore100033QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVmDatastore100033ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100033?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVmDatastore100033ResponseData customCtcdynVmDatastore100033(@Param("elid") String elid, CustomCtcdynVmDatastore100033RequestData body, @QueryMap(encoded=true) CustomCtcdynVmDatastore100033QueryParams queryParams);

  /**
  * Get relations to File system entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynVmDatastore100033</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVmDatastore100033ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100033?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVmDatastore100033ResponseData> customCtcdynVmDatastore100033WithHttpInfo(@Param("elid") String elid, CustomCtcdynVmDatastore100033RequestData body, @QueryMap(encoded=true) CustomCtcdynVmDatastore100033QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVmDatastore100033</code> method in a fluent style.
   */
  public static class CustomCtcdynVmDatastore100033QueryParams extends HashMap<String, Object> {
    public CustomCtcdynVmDatastore100033QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual disk entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomCtcdynVmDatastore100034ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100034?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVmDatastore100034ResponseData customCtcdynVmDatastore100034(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVmDatastore100034RequestData body);

  /**
   * Get relations to Virtual disk entities
   * Similar to <code>customCtcdynVmDatastore100034</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100034?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVmDatastore100034ResponseData> customCtcdynVmDatastore100034WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVmDatastore100034RequestData body);


  /**
   * Get relations to Virtual disk entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynVmDatastore100034</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVmDatastore100034QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVmDatastore100034ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100034?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVmDatastore100034ResponseData customCtcdynVmDatastore100034(@Param("elid") String elid, CustomCtcdynVmDatastore100034RequestData body, @QueryMap(encoded=true) CustomCtcdynVmDatastore100034QueryParams queryParams);

  /**
  * Get relations to Virtual disk entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynVmDatastore100034</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVmDatastore100034ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100034?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVmDatastore100034ResponseData> customCtcdynVmDatastore100034WithHttpInfo(@Param("elid") String elid, CustomCtcdynVmDatastore100034RequestData body, @QueryMap(encoded=true) CustomCtcdynVmDatastore100034QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVmDatastore100034</code> method in a fluent style.
   */
  public static class CustomCtcdynVmDatastore100034QueryParams extends HashMap<String, Object> {
    public CustomCtcdynVmDatastore100034QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Storage product entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomCtcdynVmDatastore100035ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100035?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVmDatastore100035ResponseData customCtcdynVmDatastore100035(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVmDatastore100035RequestData body);

  /**
   * Get relations to Storage product entities
   * Similar to <code>customCtcdynVmDatastore100035</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100035?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVmDatastore100035ResponseData> customCtcdynVmDatastore100035WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVmDatastore100035RequestData body);


  /**
   * Get relations to Storage product entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynVmDatastore100035</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVmDatastore100035QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVmDatastore100035ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100035?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVmDatastore100035ResponseData customCtcdynVmDatastore100035(@Param("elid") String elid, CustomCtcdynVmDatastore100035RequestData body, @QueryMap(encoded=true) CustomCtcdynVmDatastore100035QueryParams queryParams);

  /**
  * Get relations to Storage product entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynVmDatastore100035</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVmDatastore100035ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100035?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVmDatastore100035ResponseData> customCtcdynVmDatastore100035WithHttpInfo(@Param("elid") String elid, CustomCtcdynVmDatastore100035RequestData body, @QueryMap(encoded=true) CustomCtcdynVmDatastore100035QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVmDatastore100035</code> method in a fluent style.
   */
  public static class CustomCtcdynVmDatastore100035QueryParams extends HashMap<String, Object> {
    public CustomCtcdynVmDatastore100035QueryParams sessionId(final String value) {
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
   * @return CustomCtcdynVmDatastore100036ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100036?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVmDatastore100036ResponseData customCtcdynVmDatastore100036(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVmDatastore100036RequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>customCtcdynVmDatastore100036</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100036?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVmDatastore100036ResponseData> customCtcdynVmDatastore100036WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVmDatastore100036RequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynVmDatastore100036</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVmDatastore100036QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVmDatastore100036ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100036?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVmDatastore100036ResponseData customCtcdynVmDatastore100036(@Param("elid") String elid, CustomCtcdynVmDatastore100036RequestData body, @QueryMap(encoded=true) CustomCtcdynVmDatastore100036QueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynVmDatastore100036</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVmDatastore100036ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100036?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVmDatastore100036ResponseData> customCtcdynVmDatastore100036WithHttpInfo(@Param("elid") String elid, CustomCtcdynVmDatastore100036RequestData body, @QueryMap(encoded=true) CustomCtcdynVmDatastore100036QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVmDatastore100036</code> method in a fluent style.
   */
  public static class CustomCtcdynVmDatastore100036QueryParams extends HashMap<String, Object> {
    public CustomCtcdynVmDatastore100036QueryParams sessionId(final String value) {
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
   * @return CustomCtcdynVmDatastore100037ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100037?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVmDatastore100037ResponseData customCtcdynVmDatastore100037(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVmDatastore100037RequestData body);

  /**
   * Get relations to Storage unit entities
   * Similar to <code>customCtcdynVmDatastore100037</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100037?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVmDatastore100037ResponseData> customCtcdynVmDatastore100037WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVmDatastore100037RequestData body);


  /**
   * Get relations to Storage unit entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynVmDatastore100037</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVmDatastore100037QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVmDatastore100037ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100037?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVmDatastore100037ResponseData customCtcdynVmDatastore100037(@Param("elid") String elid, CustomCtcdynVmDatastore100037RequestData body, @QueryMap(encoded=true) CustomCtcdynVmDatastore100037QueryParams queryParams);

  /**
  * Get relations to Storage unit entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynVmDatastore100037</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVmDatastore100037ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/100037?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVmDatastore100037ResponseData> customCtcdynVmDatastore100037WithHttpInfo(@Param("elid") String elid, CustomCtcdynVmDatastore100037RequestData body, @QueryMap(encoded=true) CustomCtcdynVmDatastore100037QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVmDatastore100037</code> method in a fluent style.
   */
  public static class CustomCtcdynVmDatastore100037QueryParams extends HashMap<String, Object> {
    public CustomCtcdynVmDatastore100037QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomCtcdynVmDatastoreQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVmDatastoreQueryResponse customCtcdynVmDatastoreQuery(@Param("sessionId") String sessionId, CustomCtcdynVmDatastoreQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customCtcdynVmDatastoreQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVmDatastoreQueryResponse> customCtcdynVmDatastoreQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomCtcdynVmDatastoreQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customCtcdynVmDatastoreQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVmDatastoreQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVmDatastoreQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVmDatastoreQueryResponse customCtcdynVmDatastoreQuery(CustomCtcdynVmDatastoreQueryRequest body, @QueryMap(encoded=true) CustomCtcdynVmDatastoreQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customCtcdynVmDatastoreQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVmDatastoreQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVmDatastoreQueryResponse> customCtcdynVmDatastoreQueryWithHttpInfo(CustomCtcdynVmDatastoreQueryRequest body, @QueryMap(encoded=true) CustomCtcdynVmDatastoreQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVmDatastoreQuery</code> method in a fluent style.
   */
  public static class CustomCtcdynVmDatastoreQueryQueryParams extends HashMap<String, Object> {
    public CustomCtcdynVmDatastoreQueryQueryParams sessionId(final String value) {
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
   * @return CustomCtcdynVmDatastoreSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVmDatastoreSystemAttributesResponse customCtcdynVmDatastoreSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVmDatastoreSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customCtcdynVmDatastoreSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVmDatastoreSystemAttributesResponse> customCtcdynVmDatastoreSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVmDatastoreSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customCtcdynVmDatastoreSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVmDatastoreSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVmDatastoreSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVmDatastoreSystemAttributesResponse customCtcdynVmDatastoreSystemAttributes(@Param("elid") String elid, CustomCtcdynVmDatastoreSystemAttributesRequest body, @QueryMap(encoded=true) CustomCtcdynVmDatastoreSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customCtcdynVmDatastoreSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVmDatastoreSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVmDatastoreSystemAttributesResponse> customCtcdynVmDatastoreSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomCtcdynVmDatastoreSystemAttributesRequest body, @QueryMap(encoded=true) CustomCtcdynVmDatastoreSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVmDatastoreSystemAttributes</code> method in a fluent style.
   */
  public static class CustomCtcdynVmDatastoreSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomCtcdynVmDatastoreSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete VM datastore
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomCtcdynVmDatastoreResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomCtcdynVmDatastoreResponse deleteCustomCtcdynVmDatastore(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomCtcdynVmDatastoreRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomCtcdynVmDatastore</code> but it also returns the http response headers .
   * Delete VM datastore
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomCtcdynVmDatastoreResponse> deleteCustomCtcdynVmDatastoreWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomCtcdynVmDatastoreRequestData body);


  /**
   * Delete
   * Delete VM datastore
   * Note, this is equivalent to the other <code>deleteCustomCtcdynVmDatastore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomCtcdynVmDatastoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomCtcdynVmDatastoreResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomCtcdynVmDatastoreResponse deleteCustomCtcdynVmDatastore(@Param("elid") String elid, DeleteCustomCtcdynVmDatastoreRequestData body, @QueryMap(encoded=true) DeleteCustomCtcdynVmDatastoreQueryParams queryParams);

  /**
  * Delete
  * Delete VM datastore
  * Note, this is equivalent to the other <code>deleteCustomCtcdynVmDatastore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomCtcdynVmDatastoreResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomCtcdynVmDatastoreResponse> deleteCustomCtcdynVmDatastoreWithHttpInfo(@Param("elid") String elid, DeleteCustomCtcdynVmDatastoreRequestData body, @QueryMap(encoded=true) DeleteCustomCtcdynVmDatastoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomCtcdynVmDatastore</code> method in a fluent style.
   */
  public static class DeleteCustomCtcdynVmDatastoreQueryParams extends HashMap<String, Object> {
    public DeleteCustomCtcdynVmDatastoreQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify VM datastore
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomCtcdynVmDatastoreResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomCtcdynVmDatastoreResponse updateCustomCtcdynVmDatastore(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomCtcdynVmDatastoreRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomCtcdynVmDatastore</code> but it also returns the http response headers .
   * Modify VM datastore
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomCtcdynVmDatastoreResponse> updateCustomCtcdynVmDatastoreWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomCtcdynVmDatastoreRequestData body);


  /**
   * Modify
   * Modify VM datastore
   * Note, this is equivalent to the other <code>updateCustomCtcdynVmDatastore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomCtcdynVmDatastoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomCtcdynVmDatastoreResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomCtcdynVmDatastoreResponse updateCustomCtcdynVmDatastore(@Param("elid") String elid, UpdateCustomCtcdynVmDatastoreRequestData body, @QueryMap(encoded=true) UpdateCustomCtcdynVmDatastoreQueryParams queryParams);

  /**
  * Modify
  * Modify VM datastore
  * Note, this is equivalent to the other <code>updateCustomCtcdynVmDatastore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomCtcdynVmDatastoreResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomCtcdynVmDatastoreResponse> updateCustomCtcdynVmDatastoreWithHttpInfo(@Param("elid") String elid, UpdateCustomCtcdynVmDatastoreRequestData body, @QueryMap(encoded=true) UpdateCustomCtcdynVmDatastoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomCtcdynVmDatastore</code> method in a fluent style.
   */
  public static class UpdateCustomCtcdynVmDatastoreQueryParams extends HashMap<String, Object> {
    public UpdateCustomCtcdynVmDatastoreQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomCtcdynVmDatastoreResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomCtcdynVmDatastoreResponse updateSystemAttributesCustomCtcdynVmDatastore(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomCtcdynVmDatastoreRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomCtcdynVmDatastore</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomCtcdynVmDatastoreResponse> updateSystemAttributesCustomCtcdynVmDatastoreWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomCtcdynVmDatastoreRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomCtcdynVmDatastore</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomCtcdynVmDatastoreQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomCtcdynVmDatastoreResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomCtcdynVmDatastoreResponse updateSystemAttributesCustomCtcdynVmDatastore(@Param("elid") String elid, UpdateSystemAttributesCustomCtcdynVmDatastoreRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomCtcdynVmDatastoreQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomCtcdynVmDatastore</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomCtcdynVmDatastoreResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVmDatastore/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomCtcdynVmDatastoreResponse> updateSystemAttributesCustomCtcdynVmDatastoreWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomCtcdynVmDatastoreRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomCtcdynVmDatastoreQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomCtcdynVmDatastore</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomCtcdynVmDatastoreQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomCtcdynVmDatastoreQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
