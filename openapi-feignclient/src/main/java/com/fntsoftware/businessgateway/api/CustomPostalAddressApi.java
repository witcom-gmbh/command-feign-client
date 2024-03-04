package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateCustomPostalAddressRequestData;
import com.fntsoftware.businessgateway.entities.CreateCustomPostalAddressResponse;
import com.fntsoftware.businessgateway.entities.CustomPostalAddressBuildingRequestData;
import com.fntsoftware.businessgateway.entities.CustomPostalAddressBuildingResponseData;
import com.fntsoftware.businessgateway.entities.CustomPostalAddressCampusRequestData;
import com.fntsoftware.businessgateway.entities.CustomPostalAddressCampusResponseData;
import com.fntsoftware.businessgateway.entities.CustomPostalAddressQueryRequest;
import com.fntsoftware.businessgateway.entities.CustomPostalAddressQueryResponse;
import com.fntsoftware.businessgateway.entities.CustomPostalAddressSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.CustomPostalAddressSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.DeleteCustomPostalAddressRequestData;
import com.fntsoftware.businessgateway.entities.DeleteCustomPostalAddressResponse;
import com.fntsoftware.businessgateway.entities.UpdateCustomPostalAddressRequestData;
import com.fntsoftware.businessgateway.entities.UpdateCustomPostalAddressResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomPostalAddressRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesCustomPostalAddressResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface CustomPostalAddressApi extends ApiClient.Api {


  /**
   * Create
   * Create Postal address
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateCustomPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateCustomPostalAddressResponse createCustomPostalAddress(@Param("sessionId") String sessionId, CreateCustomPostalAddressRequestData body);

  /**
   * Create
   * Similar to <code>createCustomPostalAddress</code> but it also returns the http response headers .
   * Create Postal address
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateCustomPostalAddressResponse> createCustomPostalAddressWithHttpInfo(@Param("sessionId") String sessionId, CreateCustomPostalAddressRequestData body);


  /**
   * Create
   * Create Postal address
   * Note, this is equivalent to the other <code>createCustomPostalAddress</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateCustomPostalAddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateCustomPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateCustomPostalAddressResponse createCustomPostalAddress(CreateCustomPostalAddressRequestData body, @QueryMap(encoded=true) CreateCustomPostalAddressQueryParams queryParams);

  /**
  * Create
  * Create Postal address
  * Note, this is equivalent to the other <code>createCustomPostalAddress</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateCustomPostalAddressResponse
      */
      @RequestLine("POST /api/rest/entity/custom/postalAddress/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateCustomPostalAddressResponse> createCustomPostalAddressWithHttpInfo(CreateCustomPostalAddressRequestData body, @QueryMap(encoded=true) CreateCustomPostalAddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createCustomPostalAddress</code> method in a fluent style.
   */
  public static class CreateCustomPostalAddressQueryParams extends HashMap<String, Object> {
    public CreateCustomPostalAddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Building entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomPostalAddressBuildingResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/Building?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomPostalAddressBuildingResponseData customPostalAddressBuilding(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomPostalAddressBuildingRequestData body);

  /**
   * Get relations to Building entities
   * Similar to <code>customPostalAddressBuilding</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/Building?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomPostalAddressBuildingResponseData> customPostalAddressBuildingWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomPostalAddressBuildingRequestData body);


  /**
   * Get relations to Building entities
   * 
   * Note, this is equivalent to the other <code>customPostalAddressBuilding</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomPostalAddressBuildingQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomPostalAddressBuildingResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/Building?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomPostalAddressBuildingResponseData customPostalAddressBuilding(@Param("elid") String elid, CustomPostalAddressBuildingRequestData body, @QueryMap(encoded=true) CustomPostalAddressBuildingQueryParams queryParams);

  /**
  * Get relations to Building entities
  * 
  * Note, this is equivalent to the other <code>customPostalAddressBuilding</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomPostalAddressBuildingResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/Building?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomPostalAddressBuildingResponseData> customPostalAddressBuildingWithHttpInfo(@Param("elid") String elid, CustomPostalAddressBuildingRequestData body, @QueryMap(encoded=true) CustomPostalAddressBuildingQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customPostalAddressBuilding</code> method in a fluent style.
   */
  public static class CustomPostalAddressBuildingQueryParams extends HashMap<String, Object> {
    public CustomPostalAddressBuildingQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Campus entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CustomPostalAddressCampusResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/Campus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomPostalAddressCampusResponseData customPostalAddressCampus(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomPostalAddressCampusRequestData body);

  /**
   * Get relations to Campus entities
   * Similar to <code>customPostalAddressCampus</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/Campus?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomPostalAddressCampusResponseData> customPostalAddressCampusWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomPostalAddressCampusRequestData body);


  /**
   * Get relations to Campus entities
   * 
   * Note, this is equivalent to the other <code>customPostalAddressCampus</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomPostalAddressCampusQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomPostalAddressCampusResponseData
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/Campus?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomPostalAddressCampusResponseData customPostalAddressCampus(@Param("elid") String elid, CustomPostalAddressCampusRequestData body, @QueryMap(encoded=true) CustomPostalAddressCampusQueryParams queryParams);

  /**
  * Get relations to Campus entities
  * 
  * Note, this is equivalent to the other <code>customPostalAddressCampus</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomPostalAddressCampusResponseData
      */
      @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/Campus?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomPostalAddressCampusResponseData> customPostalAddressCampusWithHttpInfo(@Param("elid") String elid, CustomPostalAddressCampusRequestData body, @QueryMap(encoded=true) CustomPostalAddressCampusQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customPostalAddressCampus</code> method in a fluent style.
   */
  public static class CustomPostalAddressCampusQueryParams extends HashMap<String, Object> {
    public CustomPostalAddressCampusQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CustomPostalAddressQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomPostalAddressQueryResponse customPostalAddressQuery(@Param("sessionId") String sessionId, CustomPostalAddressQueryRequest body);

  /**
   * Basic query
   * Similar to <code>customPostalAddressQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomPostalAddressQueryResponse> customPostalAddressQueryWithHttpInfo(@Param("sessionId") String sessionId, CustomPostalAddressQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>customPostalAddressQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomPostalAddressQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomPostalAddressQueryResponse
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomPostalAddressQueryResponse customPostalAddressQuery(CustomPostalAddressQueryRequest body, @QueryMap(encoded=true) CustomPostalAddressQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>customPostalAddressQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomPostalAddressQueryResponse
      */
      @RequestLine("POST /api/rest/entity/custom/postalAddress/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomPostalAddressQueryResponse> customPostalAddressQueryWithHttpInfo(CustomPostalAddressQueryRequest body, @QueryMap(encoded=true) CustomPostalAddressQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customPostalAddressQuery</code> method in a fluent style.
   */
  public static class CustomPostalAddressQueryQueryParams extends HashMap<String, Object> {
    public CustomPostalAddressQueryQueryParams sessionId(final String value) {
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
   * @return CustomPostalAddressSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CustomPostalAddressSystemAttributesResponse customPostalAddressSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomPostalAddressSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>customPostalAddressSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CustomPostalAddressSystemAttributesResponse> customPostalAddressSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CustomPostalAddressSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>customPostalAddressSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CustomPostalAddressSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CustomPostalAddressSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CustomPostalAddressSystemAttributesResponse customPostalAddressSystemAttributes(@Param("elid") String elid, CustomPostalAddressSystemAttributesRequest body, @QueryMap(encoded=true) CustomPostalAddressSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>customPostalAddressSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CustomPostalAddressSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CustomPostalAddressSystemAttributesResponse> customPostalAddressSystemAttributesWithHttpInfo(@Param("elid") String elid, CustomPostalAddressSystemAttributesRequest body, @QueryMap(encoded=true) CustomPostalAddressSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>customPostalAddressSystemAttributes</code> method in a fluent style.
   */
  public static class CustomPostalAddressSystemAttributesQueryParams extends HashMap<String, Object> {
    public CustomPostalAddressSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Postal address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteCustomPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteCustomPostalAddressResponse deleteCustomPostalAddress(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomPostalAddressRequestData body);

  /**
   * Delete
   * Similar to <code>deleteCustomPostalAddress</code> but it also returns the http response headers .
   * Delete Postal address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteCustomPostalAddressResponse> deleteCustomPostalAddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteCustomPostalAddressRequestData body);


  /**
   * Delete
   * Delete Postal address
   * Note, this is equivalent to the other <code>deleteCustomPostalAddress</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteCustomPostalAddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteCustomPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteCustomPostalAddressResponse deleteCustomPostalAddress(@Param("elid") String elid, DeleteCustomPostalAddressRequestData body, @QueryMap(encoded=true) DeleteCustomPostalAddressQueryParams queryParams);

  /**
  * Delete
  * Delete Postal address
  * Note, this is equivalent to the other <code>deleteCustomPostalAddress</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteCustomPostalAddressResponse
      */
      @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteCustomPostalAddressResponse> deleteCustomPostalAddressWithHttpInfo(@Param("elid") String elid, DeleteCustomPostalAddressRequestData body, @QueryMap(encoded=true) DeleteCustomPostalAddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteCustomPostalAddress</code> method in a fluent style.
   */
  public static class DeleteCustomPostalAddressQueryParams extends HashMap<String, Object> {
    public DeleteCustomPostalAddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Postal address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateCustomPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateCustomPostalAddressResponse updateCustomPostalAddress(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomPostalAddressRequestData body);

  /**
   * Modify
   * Similar to <code>updateCustomPostalAddress</code> but it also returns the http response headers .
   * Modify Postal address
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateCustomPostalAddressResponse> updateCustomPostalAddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateCustomPostalAddressRequestData body);


  /**
   * Modify
   * Modify Postal address
   * Note, this is equivalent to the other <code>updateCustomPostalAddress</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateCustomPostalAddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateCustomPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateCustomPostalAddressResponse updateCustomPostalAddress(@Param("elid") String elid, UpdateCustomPostalAddressRequestData body, @QueryMap(encoded=true) UpdateCustomPostalAddressQueryParams queryParams);

  /**
  * Modify
  * Modify Postal address
  * Note, this is equivalent to the other <code>updateCustomPostalAddress</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateCustomPostalAddressResponse
      */
      @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateCustomPostalAddressResponse> updateCustomPostalAddressWithHttpInfo(@Param("elid") String elid, UpdateCustomPostalAddressRequestData body, @QueryMap(encoded=true) UpdateCustomPostalAddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateCustomPostalAddress</code> method in a fluent style.
   */
  public static class UpdateCustomPostalAddressQueryParams extends HashMap<String, Object> {
    public UpdateCustomPostalAddressQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesCustomPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesCustomPostalAddressResponse updateSystemAttributesCustomPostalAddress(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomPostalAddressRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesCustomPostalAddress</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesCustomPostalAddressResponse> updateSystemAttributesCustomPostalAddressWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesCustomPostalAddressRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesCustomPostalAddress</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesCustomPostalAddressQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesCustomPostalAddressResponse
   */
  @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesCustomPostalAddressResponse updateSystemAttributesCustomPostalAddress(@Param("elid") String elid, UpdateSystemAttributesCustomPostalAddressRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomPostalAddressQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesCustomPostalAddress</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesCustomPostalAddressResponse
      */
      @RequestLine("POST /api/rest/entity/custom/postalAddress/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesCustomPostalAddressResponse> updateSystemAttributesCustomPostalAddressWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesCustomPostalAddressRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesCustomPostalAddressQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesCustomPostalAddress</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesCustomPostalAddressQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesCustomPostalAddressQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
