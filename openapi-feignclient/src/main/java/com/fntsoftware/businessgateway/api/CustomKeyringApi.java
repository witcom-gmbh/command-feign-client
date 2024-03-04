package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomKeyringRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomKeyringResponse;
import com.fntsoftware.businessgateway.entities.CustomKeyringCustomKeysRequestData;
import com.fntsoftware.businessgateway.entities.CustomKeyringCustomKeysResponseData;
import com.fntsoftware.businessgateway.entities.CustomKeyringOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.CustomKeyringOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.CustomKeyringPersonsRequestData;
import com.fntsoftware.businessgateway.entities.CustomKeyringPersonsResponseData;
import com.fntsoftware.businessgateway.entities.CustomKeyringQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomKeyringQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomKeyringSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomKeyringSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomKeyringRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomKeyringResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomKeyringRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomKeyringResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomKeyringRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomKeyringResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface CustomKeyringApi extends ApiClient.Api {


  /**
   * Create
   * Create Keyring
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomKeyringResponse
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomKeyringResponse createCustomKeyring(@Param("sessionId") String sessionId, CreateCustomKeyringRequestData body);

  /**
   * Create
   * Similar to <code>createCustomKeyring</code> but it also returns the http response headers .
   * Create Keyring
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomKeyringResponse> createCustomKeyringWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomKeyringRequestData body);


  /**
   * Create
   * Create Keyring
   * Note, this is equivalent to the other <code>createCustomKeyring</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomKeyringQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomKeyringResponse
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomKeyringResponse createCustomKeyring(CreateCustomKeyringRequestData body, @QueryMap(encoded=true) CreateCustomKeyringQueryParams queryParams);

  /**
  * Create
  * Create Keyring
  * Note, this is equivalent to the other <code>createCustomKeyring</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomKeyringResponse
      */
      @RequestLine("POST /api/rest/entity/custom/keyring/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomKeyringResponse> createCustomKeyringWithHttpInfo(CreateCustomKeyringRequestData body, @QueryMap(encoded=true) CreateCustomKeyringQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomKeyring</code> method in a fluent style.
   */
  public static class CreateCustomKeyringQueryParams extends HashMap<String, Object> {
    public CreateCustomKeyringQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Key entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomKeyringCustomKeysResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/CustomKeys?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomKeyringCustomKeysResponseData customKeyringCustomKeys(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyringCustomKeysRequestData body);

  /**
   * Get relations to Key entities
   * Similar to <code>customKeyringCustomKeys</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/CustomKeys?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomKeyringCustomKeysResponseData> customKeyringCustomKeysWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyringCustomKeysRequestData body);


  /**
   * Get relations to Key entities
   * 
   * Note, this is equivalent to the other <code>customKeyringCustomKeys</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomKeyringCustomKeysQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomKeyringCustomKeysResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/CustomKeys?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomKeyringCustomKeysResponseData customKeyringCustomKeys(@Param("elid") String elid, CustomKeyringCustomKeysRequestData body, @QueryMap(encoded=true) CustomKeyringCustomKeysQueryParams queryParams);

  /**
  * Get relations to Key entities
  * 
  * Note, this is equivalent to the other <code>customKeyringCustomKeys</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomKeyringCustomKeysResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/CustomKeys?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomKeyringCustomKeysResponseData> customKeyringCustomKeysWithHttpInfo(@Param("elid") String elid, CustomKeyringCustomKeysRequestData body, @QueryMap(encoded=true) CustomKeyringCustomKeysQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customKeyringCustomKeys</code> method in a fluent style.
   */
  public static class CustomKeyringCustomKeysQueryParams extends HashMap<String, Object> {
    public CustomKeyringCustomKeysQueryParams sessionId(final String value) {
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
   * @return CustomKeyringOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomKeyringOrganizationsResponseData customKeyringOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyringOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>customKeyringOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomKeyringOrganizationsResponseData> customKeyringOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyringOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>customKeyringOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomKeyringOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomKeyringOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomKeyringOrganizationsResponseData customKeyringOrganizations(@Param("elid") String elid, CustomKeyringOrganizationsRequestData body, @QueryMap(encoded=true) CustomKeyringOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>customKeyringOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomKeyringOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomKeyringOrganizationsResponseData> customKeyringOrganizationsWithHttpInfo(@Param("elid") String elid, CustomKeyringOrganizationsRequestData body, @QueryMap(encoded=true) CustomKeyringOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customKeyringOrganizations</code> method in a fluent style.
   */
  public static class CustomKeyringOrganizationsQueryParams extends HashMap<String, Object> {
    public CustomKeyringOrganizationsQueryParams sessionId(final String value) {
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
   * @return CustomKeyringPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomKeyringPersonsResponseData customKeyringPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyringPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>customKeyringPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomKeyringPersonsResponseData> customKeyringPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyringPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>customKeyringPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomKeyringPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomKeyringPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomKeyringPersonsResponseData customKeyringPersons(@Param("elid") String elid, CustomKeyringPersonsRequestData body, @QueryMap(encoded=true) CustomKeyringPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>customKeyringPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomKeyringPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomKeyringPersonsResponseData> customKeyringPersonsWithHttpInfo(@Param("elid") String elid, CustomKeyringPersonsRequestData body, @QueryMap(encoded=true) CustomKeyringPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customKeyringPersons</code> method in a fluent style.
   */
  public static class CustomKeyringPersonsQueryParams extends HashMap<String, Object> {
    public CustomKeyringPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomKeyringQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomKeyringQueryResponse customKeyringQuery(@Param("sessionId") String sessionId, CustomKeyringQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customKeyringQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomKeyringQueryResponse> customKeyringQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomKeyringQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customKeyringQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomKeyringQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomKeyringQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomKeyringQueryResponse customKeyringQuery(CustomKeyringQueryRequest body, @QueryMap(encoded=true) CustomKeyringQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customKeyringQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomKeyringQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/keyring/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomKeyringQueryResponse> customKeyringQueryWithHttpInfo(CustomKeyringQueryRequest body, @QueryMap(encoded=true) CustomKeyringQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customKeyringQuery</code> method in a fluent style.
   */
  public static class CustomKeyringQueryQueryParams extends HashMap<String, Object> {
    public CustomKeyringQueryQueryParams sessionId(final String value) {
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
   * @return CustomKeyringSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomKeyringSystemAttributesResponse customKeyringSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyringSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customKeyringSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomKeyringSystemAttributesResponse> customKeyringSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomKeyringSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customKeyringSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomKeyringSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomKeyringSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomKeyringSystemAttributesResponse customKeyringSystemAttributes(@Param("elid") String elid, CustomKeyringSystemAttributesRequest body, @QueryMap(encoded=true) CustomKeyringSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customKeyringSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomKeyringSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomKeyringSystemAttributesResponse> customKeyringSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomKeyringSystemAttributesRequest body, @QueryMap(encoded=true) CustomKeyringSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customKeyringSystemAttributes</code> method in a fluent style.
   */
  public static class CustomKeyringSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomKeyringSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Keyring
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomKeyringResponse
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomKeyringResponse deleteCustomKeyring(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomKeyringRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomKeyring</code> but it also returns the http response headers .
   * Delete Keyring
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomKeyringResponse> deleteCustomKeyringWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomKeyringRequestData body);


  /**
   * Delete
   * Delete Keyring
   * Note, this is equivalent to the other <code>deleteCustomKeyring</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomKeyringQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomKeyringResponse
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomKeyringResponse deleteCustomKeyring(@Param("elid") String elid, DeleteCustomKeyringRequestData body, @QueryMap(encoded=true) DeleteCustomKeyringQueryParams queryParams);

  /**
  * Delete
  * Delete Keyring
  * Note, this is equivalent to the other <code>deleteCustomKeyring</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomKeyringResponse
      */
      @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomKeyringResponse> deleteCustomKeyringWithHttpInfo(@Param("elid") String elid, DeleteCustomKeyringRequestData body, @QueryMap(encoded=true) DeleteCustomKeyringQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomKeyring</code> method in a fluent style.
   */
  public static class DeleteCustomKeyringQueryParams extends HashMap<String, Object> {
    public DeleteCustomKeyringQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Keyring
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomKeyringResponse
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomKeyringResponse updateCustomKeyring(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomKeyringRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomKeyring</code> but it also returns the http response headers .
   * Modify Keyring
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomKeyringResponse> updateCustomKeyringWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomKeyringRequestData body);


  /**
   * Modify
   * Modify Keyring
   * Note, this is equivalent to the other <code>updateCustomKeyring</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomKeyringQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomKeyringResponse
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomKeyringResponse updateCustomKeyring(@Param("elid") String elid, UpdateCustomKeyringRequestData body, @QueryMap(encoded=true) UpdateCustomKeyringQueryParams queryParams);

  /**
  * Modify
  * Modify Keyring
  * Note, this is equivalent to the other <code>updateCustomKeyring</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomKeyringResponse
      */
      @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomKeyringResponse> updateCustomKeyringWithHttpInfo(@Param("elid") String elid, UpdateCustomKeyringRequestData body, @QueryMap(encoded=true) UpdateCustomKeyringQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomKeyring</code> method in a fluent style.
   */
  public static class UpdateCustomKeyringQueryParams extends HashMap<String, Object> {
    public UpdateCustomKeyringQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomKeyringResponse
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomKeyringResponse updateSystemAttributesCustomKeyring(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomKeyringRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomKeyring</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomKeyringResponse> updateSystemAttributesCustomKeyringWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomKeyringRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomKeyring</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomKeyringQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomKeyringResponse
   */
  @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomKeyringResponse updateSystemAttributesCustomKeyring(@Param("elid") String elid, UpdateSystemAttributesCustomKeyringRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomKeyringQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomKeyring</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomKeyringResponse
      */
      @RequestLine("POST /api/rest/entity/custom/keyring/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomKeyringResponse> updateSystemAttributesCustomKeyringWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomKeyringRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomKeyringQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomKeyring</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomKeyringQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomKeyringQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
