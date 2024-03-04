package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynVirtDcRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomCtcdynVirtDcResponse;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtDc100024RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtDc100024ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtDc100025RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtDc100025ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtDc100026RequestData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtDc100026ResponseData;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtDcQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtDcQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtDcSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomCtcdynVirtDcSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomCtcdynVirtDcRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomCtcdynVirtDcResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynVirtDcRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomCtcdynVirtDcResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomCtcdynVirtDcRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomCtcdynVirtDcResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface CustomCtcdynVirtDcApi extends ApiClient.Api {


  /**
   * Create
   * Create Virtual Datacenter
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomCtcdynVirtDcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomCtcdynVirtDcResponse createCustomCtcdynVirtDc(@Param("sessionId") String sessionId, CreateCustomCtcdynVirtDcRequestData body);

  /**
   * Create
   * Similar to <code>createCustomCtcdynVirtDc</code> but it also returns the http response headers .
   * Create Virtual Datacenter
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomCtcdynVirtDcResponse> createCustomCtcdynVirtDcWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomCtcdynVirtDcRequestData body);


  /**
   * Create
   * Create Virtual Datacenter
   * Note, this is equivalent to the other <code>createCustomCtcdynVirtDc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomCtcdynVirtDcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomCtcdynVirtDcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomCtcdynVirtDcResponse createCustomCtcdynVirtDc(CreateCustomCtcdynVirtDcRequestData body, @QueryMap(encoded=true) CreateCustomCtcdynVirtDcQueryParams queryParams);

  /**
  * Create
  * Create Virtual Datacenter
  * Note, this is equivalent to the other <code>createCustomCtcdynVirtDc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomCtcdynVirtDcResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomCtcdynVirtDcResponse> createCustomCtcdynVirtDcWithHttpInfo(CreateCustomCtcdynVirtDcRequestData body, @QueryMap(encoded=true) CreateCustomCtcdynVirtDcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomCtcdynVirtDc</code> method in a fluent style.
   */
  public static class CreateCustomCtcdynVirtDcQueryParams extends HashMap<String, Object> {
    public CreateCustomCtcdynVirtDcQueryParams sessionId(final String value) {
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
   * @return CustomCtcdynVirtDc100024ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/100024?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVirtDc100024ResponseData customCtcdynVirtDc100024(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtDc100024RequestData body);

  /**
   * Get relations to Storage product entities
   * Similar to <code>customCtcdynVirtDc100024</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/100024?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVirtDc100024ResponseData> customCtcdynVirtDc100024WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtDc100024RequestData body);


  /**
   * Get relations to Storage product entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynVirtDc100024</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVirtDc100024QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVirtDc100024ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/100024?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVirtDc100024ResponseData customCtcdynVirtDc100024(@Param("elid") String elid, CustomCtcdynVirtDc100024RequestData body, @QueryMap(encoded=true) CustomCtcdynVirtDc100024QueryParams queryParams);

  /**
  * Get relations to Storage product entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynVirtDc100024</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVirtDc100024ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/100024?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVirtDc100024ResponseData> customCtcdynVirtDc100024WithHttpInfo(@Param("elid") String elid, CustomCtcdynVirtDc100024RequestData body, @QueryMap(encoded=true) CustomCtcdynVirtDc100024QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVirtDc100024</code> method in a fluent style.
   */
  public static class CustomCtcdynVirtDc100024QueryParams extends HashMap<String, Object> {
    public CustomCtcdynVirtDc100024QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Serverfarm entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomCtcdynVirtDc100025ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/100025?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVirtDc100025ResponseData customCtcdynVirtDc100025(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtDc100025RequestData body);

  /**
   * Get relations to Serverfarm entities
   * Similar to <code>customCtcdynVirtDc100025</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/100025?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVirtDc100025ResponseData> customCtcdynVirtDc100025WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtDc100025RequestData body);


  /**
   * Get relations to Serverfarm entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynVirtDc100025</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVirtDc100025QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVirtDc100025ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/100025?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVirtDc100025ResponseData customCtcdynVirtDc100025(@Param("elid") String elid, CustomCtcdynVirtDc100025RequestData body, @QueryMap(encoded=true) CustomCtcdynVirtDc100025QueryParams queryParams);

  /**
  * Get relations to Serverfarm entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynVirtDc100025</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVirtDc100025ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/100025?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVirtDc100025ResponseData> customCtcdynVirtDc100025WithHttpInfo(@Param("elid") String elid, CustomCtcdynVirtDc100025RequestData body, @QueryMap(encoded=true) CustomCtcdynVirtDc100025QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVirtDc100025</code> method in a fluent style.
   */
  public static class CustomCtcdynVirtDc100025QueryParams extends HashMap<String, Object> {
    public CustomCtcdynVirtDc100025QueryParams sessionId(final String value) {
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
   * @return CustomCtcdynVirtDc100026ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/100026?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVirtDc100026ResponseData customCtcdynVirtDc100026(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtDc100026RequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>customCtcdynVirtDc100026</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/100026?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVirtDc100026ResponseData> customCtcdynVirtDc100026WithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtDc100026RequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>customCtcdynVirtDc100026</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVirtDc100026QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVirtDc100026ResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/100026?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVirtDc100026ResponseData customCtcdynVirtDc100026(@Param("elid") String elid, CustomCtcdynVirtDc100026RequestData body, @QueryMap(encoded=true) CustomCtcdynVirtDc100026QueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>customCtcdynVirtDc100026</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVirtDc100026ResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/100026?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVirtDc100026ResponseData> customCtcdynVirtDc100026WithHttpInfo(@Param("elid") String elid, CustomCtcdynVirtDc100026RequestData body, @QueryMap(encoded=true) CustomCtcdynVirtDc100026QueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVirtDc100026</code> method in a fluent style.
   */
  public static class CustomCtcdynVirtDc100026QueryParams extends HashMap<String, Object> {
    public CustomCtcdynVirtDc100026QueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomCtcdynVirtDcQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVirtDcQueryResponse customCtcdynVirtDcQuery(@Param("sessionId") String sessionId, CustomCtcdynVirtDcQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customCtcdynVirtDcQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVirtDcQueryResponse> customCtcdynVirtDcQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomCtcdynVirtDcQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customCtcdynVirtDcQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVirtDcQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVirtDcQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVirtDcQueryResponse customCtcdynVirtDcQuery(CustomCtcdynVirtDcQueryRequest body, @QueryMap(encoded=true) CustomCtcdynVirtDcQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customCtcdynVirtDcQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVirtDcQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVirtDcQueryResponse> customCtcdynVirtDcQueryWithHttpInfo(CustomCtcdynVirtDcQueryRequest body, @QueryMap(encoded=true) CustomCtcdynVirtDcQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVirtDcQuery</code> method in a fluent style.
   */
  public static class CustomCtcdynVirtDcQueryQueryParams extends HashMap<String, Object> {
    public CustomCtcdynVirtDcQueryQueryParams sessionId(final String value) {
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
   * @return CustomCtcdynVirtDcSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomCtcdynVirtDcSystemAttributesResponse customCtcdynVirtDcSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtDcSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customCtcdynVirtDcSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomCtcdynVirtDcSystemAttributesResponse> customCtcdynVirtDcSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomCtcdynVirtDcSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customCtcdynVirtDcSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomCtcdynVirtDcSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomCtcdynVirtDcSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomCtcdynVirtDcSystemAttributesResponse customCtcdynVirtDcSystemAttributes(@Param("elid") String elid, CustomCtcdynVirtDcSystemAttributesRequest body, @QueryMap(encoded=true) CustomCtcdynVirtDcSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customCtcdynVirtDcSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomCtcdynVirtDcSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomCtcdynVirtDcSystemAttributesResponse> customCtcdynVirtDcSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomCtcdynVirtDcSystemAttributesRequest body, @QueryMap(encoded=true) CustomCtcdynVirtDcSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customCtcdynVirtDcSystemAttributes</code> method in a fluent style.
   */
  public static class CustomCtcdynVirtDcSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomCtcdynVirtDcSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Virtual Datacenter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomCtcdynVirtDcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomCtcdynVirtDcResponse deleteCustomCtcdynVirtDc(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomCtcdynVirtDcRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomCtcdynVirtDc</code> but it also returns the http response headers .
   * Delete Virtual Datacenter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomCtcdynVirtDcResponse> deleteCustomCtcdynVirtDcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomCtcdynVirtDcRequestData body);


  /**
   * Delete
   * Delete Virtual Datacenter
   * Note, this is equivalent to the other <code>deleteCustomCtcdynVirtDc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomCtcdynVirtDcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomCtcdynVirtDcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomCtcdynVirtDcResponse deleteCustomCtcdynVirtDc(@Param("elid") String elid, DeleteCustomCtcdynVirtDcRequestData body, @QueryMap(encoded=true) DeleteCustomCtcdynVirtDcQueryParams queryParams);

  /**
  * Delete
  * Delete Virtual Datacenter
  * Note, this is equivalent to the other <code>deleteCustomCtcdynVirtDc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomCtcdynVirtDcResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomCtcdynVirtDcResponse> deleteCustomCtcdynVirtDcWithHttpInfo(@Param("elid") String elid, DeleteCustomCtcdynVirtDcRequestData body, @QueryMap(encoded=true) DeleteCustomCtcdynVirtDcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomCtcdynVirtDc</code> method in a fluent style.
   */
  public static class DeleteCustomCtcdynVirtDcQueryParams extends HashMap<String, Object> {
    public DeleteCustomCtcdynVirtDcQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Virtual Datacenter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomCtcdynVirtDcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomCtcdynVirtDcResponse updateCustomCtcdynVirtDc(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomCtcdynVirtDcRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomCtcdynVirtDc</code> but it also returns the http response headers .
   * Modify Virtual Datacenter
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomCtcdynVirtDcResponse> updateCustomCtcdynVirtDcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomCtcdynVirtDcRequestData body);


  /**
   * Modify
   * Modify Virtual Datacenter
   * Note, this is equivalent to the other <code>updateCustomCtcdynVirtDc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomCtcdynVirtDcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomCtcdynVirtDcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomCtcdynVirtDcResponse updateCustomCtcdynVirtDc(@Param("elid") String elid, UpdateCustomCtcdynVirtDcRequestData body, @QueryMap(encoded=true) UpdateCustomCtcdynVirtDcQueryParams queryParams);

  /**
  * Modify
  * Modify Virtual Datacenter
  * Note, this is equivalent to the other <code>updateCustomCtcdynVirtDc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomCtcdynVirtDcResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomCtcdynVirtDcResponse> updateCustomCtcdynVirtDcWithHttpInfo(@Param("elid") String elid, UpdateCustomCtcdynVirtDcRequestData body, @QueryMap(encoded=true) UpdateCustomCtcdynVirtDcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomCtcdynVirtDc</code> method in a fluent style.
   */
  public static class UpdateCustomCtcdynVirtDcQueryParams extends HashMap<String, Object> {
    public UpdateCustomCtcdynVirtDcQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomCtcdynVirtDcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomCtcdynVirtDcResponse updateSystemAttributesCustomCtcdynVirtDc(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomCtcdynVirtDcRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomCtcdynVirtDc</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomCtcdynVirtDcResponse> updateSystemAttributesCustomCtcdynVirtDcWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomCtcdynVirtDcRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomCtcdynVirtDc</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomCtcdynVirtDcQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomCtcdynVirtDcResponse
   */
  @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomCtcdynVirtDcResponse updateSystemAttributesCustomCtcdynVirtDc(@Param("elid") String elid, UpdateSystemAttributesCustomCtcdynVirtDcRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomCtcdynVirtDcQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomCtcdynVirtDc</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomCtcdynVirtDcResponse
      */
      @RequestLine("POST /api/rest/entity/custom/ctcdynVirtDc/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomCtcdynVirtDcResponse> updateSystemAttributesCustomCtcdynVirtDcWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomCtcdynVirtDcRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomCtcdynVirtDcQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomCtcdynVirtDc</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomCtcdynVirtDcQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomCtcdynVirtDcQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
