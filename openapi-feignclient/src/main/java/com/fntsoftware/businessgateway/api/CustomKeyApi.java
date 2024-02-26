package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomKeyRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomKeyResponse;
import com.fntsoftware.businessgateway.entities.CustomKeyCustomKeyParentRequestData;
import com.fntsoftware.businessgateway.entities.CustomKeyCustomKeyParentResponseData;
import com.fntsoftware.businessgateway.entities.CustomKeyCustomKeyringRequestData;
import com.fntsoftware.businessgateway.entities.CustomKeyCustomKeyringResponseData;
import com.fntsoftware.businessgateway.entities.CustomKeyCustomKeysChildRequestData;
import com.fntsoftware.businessgateway.entities.CustomKeyCustomKeysChildResponseData;
import com.fntsoftware.businessgateway.entities.CustomKeyCustomLocksRequestData;
import com.fntsoftware.businessgateway.entities.CustomKeyCustomLocksResponseData;
import com.fntsoftware.businessgateway.entities.CustomKeyOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.CustomKeyOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.CustomKeyPersonsRequestData;
import com.fntsoftware.businessgateway.entities.CustomKeyPersonsResponseData;
import com.fntsoftware.businessgateway.entities.CustomKeyQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomKeyQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomKeySystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomKeySystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomKeyRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomKeyResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomKeyRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomKeyResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomKeyRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomKeyResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface CustomKeyApi extends ApiClient.Api {


  /**
   * Create
   * Create Key
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomKeyResponse
   */
  @RequestLine("POST /api/rest/entity/custom/key/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomKeyResponse createCustomKey(@Param("sessionId") String sessionId, CreateCustomKeyRequestData body);

  /**
   * Create
   * Similar to <code>createCustomKey</code> but it also returns the http response headers .
   * Create Key
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/key/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomKeyResponse> createCustomKeyWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomKeyRequestData body);


  /**
   * Create
   * Create Key
   * Note, this is equivalent to the other <code>createCustomKey</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomKeyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomKeyResponse
   */
  @RequestLine("POST /api/rest/entity/custom/key/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomKeyResponse createCustomKey(CreateCustomKeyRequestData body, @QueryMap(encoded=true) CreateCustomKeyQueryParams queryParams);

  /**
  * Create
  * Create Key
  * Note, this is equivalent to the other <code>createCustomKey</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomKeyResponse
      */
      @RequestLine("POST /api/rest/entity/custom/key/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomKeyResponse> createCustomKeyWithHttpInfo(CreateCustomKeyRequestData body, @QueryMap(encoded=true) CreateCustomKeyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomKey</code> method in a fluent style.
   */
  public static class CreateCustomKeyQueryParams extends HashMap<String, Object> {
    public CreateCustomKeyQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Master key entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomKeyCustomKeyParentResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomKeyParent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomKeyCustomKeyParentResponseData customKeyCustomKeyParent(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyCustomKeyParentRequestData body);

  /**
   * Get relations to Master key entities
   * Similar to <code>customKeyCustomKeyParent</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomKeyParent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomKeyCustomKeyParentResponseData> customKeyCustomKeyParentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyCustomKeyParentRequestData body);


  /**
   * Get relations to Master key entities
   * 
   * Note, this is equivalent to the other <code>customKeyCustomKeyParent</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomKeyCustomKeyParentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomKeyCustomKeyParentResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomKeyParent?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomKeyCustomKeyParentResponseData customKeyCustomKeyParent(@Param("elid") String elid, CustomKeyCustomKeyParentRequestData body, @QueryMap(encoded=true) CustomKeyCustomKeyParentQueryParams queryParams);

  /**
  * Get relations to Master key entities
  * 
  * Note, this is equivalent to the other <code>customKeyCustomKeyParent</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomKeyCustomKeyParentResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomKeyParent?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomKeyCustomKeyParentResponseData> customKeyCustomKeyParentWithHttpInfo(@Param("elid") String elid, CustomKeyCustomKeyParentRequestData body, @QueryMap(encoded=true) CustomKeyCustomKeyParentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customKeyCustomKeyParent</code> method in a fluent style.
   */
  public static class CustomKeyCustomKeyParentQueryParams extends HashMap<String, Object> {
    public CustomKeyCustomKeyParentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Keyring entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomKeyCustomKeyringResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomKeyring?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomKeyCustomKeyringResponseData customKeyCustomKeyring(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyCustomKeyringRequestData body);

  /**
   * Get relations to Keyring entities
   * Similar to <code>customKeyCustomKeyring</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomKeyring?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomKeyCustomKeyringResponseData> customKeyCustomKeyringWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyCustomKeyringRequestData body);


  /**
   * Get relations to Keyring entities
   * 
   * Note, this is equivalent to the other <code>customKeyCustomKeyring</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomKeyCustomKeyringQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomKeyCustomKeyringResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomKeyring?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomKeyCustomKeyringResponseData customKeyCustomKeyring(@Param("elid") String elid, CustomKeyCustomKeyringRequestData body, @QueryMap(encoded=true) CustomKeyCustomKeyringQueryParams queryParams);

  /**
  * Get relations to Keyring entities
  * 
  * Note, this is equivalent to the other <code>customKeyCustomKeyring</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomKeyCustomKeyringResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomKeyring?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomKeyCustomKeyringResponseData> customKeyCustomKeyringWithHttpInfo(@Param("elid") String elid, CustomKeyCustomKeyringRequestData body, @QueryMap(encoded=true) CustomKeyCustomKeyringQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customKeyCustomKeyring</code> method in a fluent style.
   */
  public static class CustomKeyCustomKeyringQueryParams extends HashMap<String, Object> {
    public CustomKeyCustomKeyringQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Detailkey entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomKeyCustomKeysChildResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomKeysChild?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomKeyCustomKeysChildResponseData customKeyCustomKeysChild(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyCustomKeysChildRequestData body);

  /**
   * Get relations to Detailkey entities
   * Similar to <code>customKeyCustomKeysChild</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomKeysChild?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomKeyCustomKeysChildResponseData> customKeyCustomKeysChildWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyCustomKeysChildRequestData body);


  /**
   * Get relations to Detailkey entities
   * 
   * Note, this is equivalent to the other <code>customKeyCustomKeysChild</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomKeyCustomKeysChildQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomKeyCustomKeysChildResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomKeysChild?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomKeyCustomKeysChildResponseData customKeyCustomKeysChild(@Param("elid") String elid, CustomKeyCustomKeysChildRequestData body, @QueryMap(encoded=true) CustomKeyCustomKeysChildQueryParams queryParams);

  /**
  * Get relations to Detailkey entities
  * 
  * Note, this is equivalent to the other <code>customKeyCustomKeysChild</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomKeyCustomKeysChildResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomKeysChild?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomKeyCustomKeysChildResponseData> customKeyCustomKeysChildWithHttpInfo(@Param("elid") String elid, CustomKeyCustomKeysChildRequestData body, @QueryMap(encoded=true) CustomKeyCustomKeysChildQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customKeyCustomKeysChild</code> method in a fluent style.
   */
  public static class CustomKeyCustomKeysChildQueryParams extends HashMap<String, Object> {
    public CustomKeyCustomKeysChildQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Locks entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomKeyCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomKeyCustomLocksResponseData customKeyCustomLocks(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyCustomLocksRequestData body);

  /**
   * Get relations to Locks entities
   * Similar to <code>customKeyCustomLocks</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomKeyCustomLocksResponseData> customKeyCustomLocksWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyCustomLocksRequestData body);


  /**
   * Get relations to Locks entities
   * 
   * Note, this is equivalent to the other <code>customKeyCustomLocks</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomKeyCustomLocksQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomKeyCustomLocksResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomLocks?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomKeyCustomLocksResponseData customKeyCustomLocks(@Param("elid") String elid, CustomKeyCustomLocksRequestData body, @QueryMap(encoded=true) CustomKeyCustomLocksQueryParams queryParams);

  /**
  * Get relations to Locks entities
  * 
  * Note, this is equivalent to the other <code>customKeyCustomLocks</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomKeyCustomLocksResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/key/{elid}/CustomLocks?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomKeyCustomLocksResponseData> customKeyCustomLocksWithHttpInfo(@Param("elid") String elid, CustomKeyCustomLocksRequestData body, @QueryMap(encoded=true) CustomKeyCustomLocksQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customKeyCustomLocks</code> method in a fluent style.
   */
  public static class CustomKeyCustomLocksQueryParams extends HashMap<String, Object> {
    public CustomKeyCustomLocksQueryParams sessionId(final String value) {
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
   * @return CustomKeyOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomKeyOrganizationsResponseData customKeyOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>customKeyOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomKeyOrganizationsResponseData> customKeyOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>customKeyOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomKeyOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomKeyOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomKeyOrganizationsResponseData customKeyOrganizations(@Param("elid") String elid, CustomKeyOrganizationsRequestData body, @QueryMap(encoded=true) CustomKeyOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>customKeyOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomKeyOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/key/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomKeyOrganizationsResponseData> customKeyOrganizationsWithHttpInfo(@Param("elid") String elid, CustomKeyOrganizationsRequestData body, @QueryMap(encoded=true) CustomKeyOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customKeyOrganizations</code> method in a fluent style.
   */
  public static class CustomKeyOrganizationsQueryParams extends HashMap<String, Object> {
    public CustomKeyOrganizationsQueryParams sessionId(final String value) {
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
   * @return CustomKeyPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomKeyPersonsResponseData customKeyPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>customKeyPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomKeyPersonsResponseData> customKeyPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>customKeyPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomKeyPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomKeyPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomKeyPersonsResponseData customKeyPersons(@Param("elid") String elid, CustomKeyPersonsRequestData body, @QueryMap(encoded=true) CustomKeyPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>customKeyPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomKeyPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/key/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomKeyPersonsResponseData> customKeyPersonsWithHttpInfo(@Param("elid") String elid, CustomKeyPersonsRequestData body, @QueryMap(encoded=true) CustomKeyPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customKeyPersons</code> method in a fluent style.
   */
  public static class CustomKeyPersonsQueryParams extends HashMap<String, Object> {
    public CustomKeyPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomKeyQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/key/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomKeyQueryResponse customKeyQuery(@Param("sessionId") String sessionId, CustomKeyQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customKeyQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/key/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomKeyQueryResponse> customKeyQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomKeyQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customKeyQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomKeyQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomKeyQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/key/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomKeyQueryResponse customKeyQuery(CustomKeyQueryRequest body, @QueryMap(encoded=true) CustomKeyQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customKeyQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomKeyQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/key/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomKeyQueryResponse> customKeyQueryWithHttpInfo(CustomKeyQueryRequest body, @QueryMap(encoded=true) CustomKeyQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customKeyQuery</code> method in a fluent style.
   */
  public static class CustomKeyQueryQueryParams extends HashMap<String, Object> {
    public CustomKeyQueryQueryParams sessionId(final String value) {
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
   * @return CustomKeySystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomKeySystemAttributesResponse customKeySystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeySystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customKeySystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomKeySystemAttributesResponse> customKeySystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeySystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customKeySystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomKeySystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomKeySystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomKeySystemAttributesResponse customKeySystemAttributes(@Param("elid") String elid, CustomKeySystemAttributesRequest body, @QueryMap(encoded=true) CustomKeySystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customKeySystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomKeySystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/key/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomKeySystemAttributesResponse> customKeySystemAttributesWithHttpInfo(@Param("elid") String elid, CustomKeySystemAttributesRequest body, @QueryMap(encoded=true) CustomKeySystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customKeySystemAttributes</code> method in a fluent style.
   */
  public static class CustomKeySystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomKeySystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Key
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomKeyResponse
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomKeyResponse deleteCustomKey(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomKeyRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomKey</code> but it also returns the http response headers .
   * Delete Key
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomKeyResponse> deleteCustomKeyWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomKeyRequestData body);


  /**
   * Delete
   * Delete Key
   * Note, this is equivalent to the other <code>deleteCustomKey</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomKeyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomKeyResponse
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomKeyResponse deleteCustomKey(@Param("elid") String elid, DeleteCustomKeyRequestData body, @QueryMap(encoded=true) DeleteCustomKeyQueryParams queryParams);

  /**
  * Delete
  * Delete Key
  * Note, this is equivalent to the other <code>deleteCustomKey</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomKeyResponse
      */
      @RequestLine("POST /api/rest/entity/custom/key/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomKeyResponse> deleteCustomKeyWithHttpInfo(@Param("elid") String elid, DeleteCustomKeyRequestData body, @QueryMap(encoded=true) DeleteCustomKeyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomKey</code> method in a fluent style.
   */
  public static class DeleteCustomKeyQueryParams extends HashMap<String, Object> {
    public DeleteCustomKeyQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Key
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomKeyResponse
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomKeyResponse updateCustomKey(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomKeyRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomKey</code> but it also returns the http response headers .
   * Modify Key
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomKeyResponse> updateCustomKeyWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomKeyRequestData body);


  /**
   * Modify
   * Modify Key
   * Note, this is equivalent to the other <code>updateCustomKey</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomKeyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomKeyResponse
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomKeyResponse updateCustomKey(@Param("elid") String elid, UpdateCustomKeyRequestData body, @QueryMap(encoded=true) UpdateCustomKeyQueryParams queryParams);

  /**
  * Modify
  * Modify Key
  * Note, this is equivalent to the other <code>updateCustomKey</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomKeyResponse
      */
      @RequestLine("POST /api/rest/entity/custom/key/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomKeyResponse> updateCustomKeyWithHttpInfo(@Param("elid") String elid, UpdateCustomKeyRequestData body, @QueryMap(encoded=true) UpdateCustomKeyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomKey</code> method in a fluent style.
   */
  public static class UpdateCustomKeyQueryParams extends HashMap<String, Object> {
    public UpdateCustomKeyQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomKeyResponse
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomKeyResponse updateSystemAttributesCustomKey(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomKeyRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomKey</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomKeyResponse> updateSystemAttributesCustomKeyWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomKeyRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomKey</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomKeyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomKeyResponse
   */
  @RequestLine("POST /api/rest/entity/custom/key/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomKeyResponse updateSystemAttributesCustomKey(@Param("elid") String elid, UpdateSystemAttributesCustomKeyRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomKeyQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomKey</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomKeyResponse
      */
      @RequestLine("POST /api/rest/entity/custom/key/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomKeyResponse> updateSystemAttributesCustomKeyWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomKeyRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomKeyQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomKey</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomKeyQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomKeyQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
