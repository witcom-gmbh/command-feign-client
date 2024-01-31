package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateNominalRequestData;
import com.fntsoftware.businessgateway.entities.CreateNominalResponse;
import com.fntsoftware.businessgateway.entities.DeleteNominalRequestData;
import com.fntsoftware.businessgateway.entities.DeleteNominalResponse;
import com.fntsoftware.businessgateway.entities.NominalContractsRequestData;
import com.fntsoftware.businessgateway.entities.NominalContractsResponseData;
import com.fntsoftware.businessgateway.entities.NominalFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.NominalFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.NominalOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.NominalOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.NominalPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.NominalPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.NominalPersonsRequestData;
import com.fntsoftware.businessgateway.entities.NominalPersonsResponseData;
import com.fntsoftware.businessgateway.entities.NominalPostalAddressesRequestData;
import com.fntsoftware.businessgateway.entities.NominalPostalAddressesResponseData;
import com.fntsoftware.businessgateway.entities.NominalQueryExtendedGeolocationRequest;
import com.fntsoftware.businessgateway.entities.NominalQueryExtendedGeolocationResponse;
import com.fntsoftware.businessgateway.entities.NominalQueryExtendedSitesRequest;
import com.fntsoftware.businessgateway.entities.NominalQueryExtendedSitesResponse;
import com.fntsoftware.businessgateway.entities.NominalQueryGeolocationRequest;
import com.fntsoftware.businessgateway.entities.NominalQueryGeolocationResponse;
import com.fntsoftware.businessgateway.entities.NominalQueryRequest;
import com.fntsoftware.businessgateway.entities.NominalQueryResponse;
import com.fntsoftware.businessgateway.entities.NominalSitesRequestData;
import com.fntsoftware.businessgateway.entities.NominalSitesResponseData;
import com.fntsoftware.businessgateway.entities.NominalSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.NominalSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateNominalRequestData;
import com.fntsoftware.businessgateway.entities.UpdateNominalResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNominalRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesNominalResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface NominalApi extends ApiClient.Api {


  /**
   * Create
   * Create Nominal
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateNominalResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateNominalResponse createNominal(@Param("sessionId") String sessionId, CreateNominalRequestData body);

  /**
   * Create
   * Similar to <code>createNominal</code> but it also returns the http response headers .
   * Create Nominal
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateNominalResponse> createNominalWithHttpInfo(@Param("sessionId") String sessionId, CreateNominalRequestData body);


  /**
   * Create
   * Create Nominal
   * Note, this is equivalent to the other <code>createNominal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateNominalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateNominalResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateNominalResponse createNominal(CreateNominalRequestData body, @QueryMap(encoded=true) CreateNominalQueryParams queryParams);

  /**
  * Create
  * Create Nominal
  * Note, this is equivalent to the other <code>createNominal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateNominalResponse
      */
      @RequestLine("POST /api/rest/entity/nominal/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateNominalResponse> createNominalWithHttpInfo(CreateNominalRequestData body, @QueryMap(encoded=true) CreateNominalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createNominal</code> method in a fluent style.
   */
  public static class CreateNominalQueryParams extends HashMap<String, Object> {
    public CreateNominalQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Nominal
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteNominalResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteNominalResponse deleteNominal(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNominalRequestData body);

  /**
   * Delete
   * Similar to <code>deleteNominal</code> but it also returns the http response headers .
   * Delete Nominal
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteNominalResponse> deleteNominalWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteNominalRequestData body);


  /**
   * Delete
   * Delete Nominal
   * Note, this is equivalent to the other <code>deleteNominal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteNominalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteNominalResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteNominalResponse deleteNominal(@Param("elid") String elid, DeleteNominalRequestData body, @QueryMap(encoded=true) DeleteNominalQueryParams queryParams);

  /**
  * Delete
  * Delete Nominal
  * Note, this is equivalent to the other <code>deleteNominal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteNominalResponse
      */
      @RequestLine("POST /api/rest/entity/nominal/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteNominalResponse> deleteNominalWithHttpInfo(@Param("elid") String elid, DeleteNominalRequestData body, @QueryMap(encoded=true) DeleteNominalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteNominal</code> method in a fluent style.
   */
  public static class DeleteNominalQueryParams extends HashMap<String, Object> {
    public DeleteNominalQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NominalContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NominalContractsResponseData nominalContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>nominalContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NominalContractsResponseData> nominalContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>nominalContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NominalContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NominalContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NominalContractsResponseData nominalContracts(@Param("elid") String elid, NominalContractsRequestData body, @QueryMap(encoded=true) NominalContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>nominalContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NominalContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/nominal/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NominalContractsResponseData> nominalContractsWithHttpInfo(@Param("elid") String elid, NominalContractsRequestData body, @QueryMap(encoded=true) NominalContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nominalContracts</code> method in a fluent style.
   */
  public static class NominalContractsQueryParams extends HashMap<String, Object> {
    public NominalContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Frame contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NominalFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NominalFrameContractsResponseData nominalFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>nominalFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NominalFrameContractsResponseData> nominalFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>nominalFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NominalFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NominalFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NominalFrameContractsResponseData nominalFrameContracts(@Param("elid") String elid, NominalFrameContractsRequestData body, @QueryMap(encoded=true) NominalFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>nominalFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NominalFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/nominal/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NominalFrameContractsResponseData> nominalFrameContractsWithHttpInfo(@Param("elid") String elid, NominalFrameContractsRequestData body, @QueryMap(encoded=true) NominalFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nominalFrameContracts</code> method in a fluent style.
   */
  public static class NominalFrameContractsQueryParams extends HashMap<String, Object> {
    public NominalFrameContractsQueryParams sessionId(final String value) {
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
   * @return NominalOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NominalOrganizationsResponseData nominalOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>nominalOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NominalOrganizationsResponseData> nominalOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>nominalOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NominalOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NominalOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NominalOrganizationsResponseData nominalOrganizations(@Param("elid") String elid, NominalOrganizationsRequestData body, @QueryMap(encoded=true) NominalOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>nominalOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NominalOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/nominal/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NominalOrganizationsResponseData> nominalOrganizationsWithHttpInfo(@Param("elid") String elid, NominalOrganizationsRequestData body, @QueryMap(encoded=true) NominalOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nominalOrganizations</code> method in a fluent style.
   */
  public static class NominalOrganizationsQueryParams extends HashMap<String, Object> {
    public NominalOrganizationsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Person group entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NominalPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NominalPersonGroupsResponseData nominalPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>nominalPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NominalPersonGroupsResponseData> nominalPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>nominalPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NominalPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NominalPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NominalPersonGroupsResponseData nominalPersonGroups(@Param("elid") String elid, NominalPersonGroupsRequestData body, @QueryMap(encoded=true) NominalPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>nominalPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NominalPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/nominal/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NominalPersonGroupsResponseData> nominalPersonGroupsWithHttpInfo(@Param("elid") String elid, NominalPersonGroupsRequestData body, @QueryMap(encoded=true) NominalPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nominalPersonGroups</code> method in a fluent style.
   */
  public static class NominalPersonGroupsQueryParams extends HashMap<String, Object> {
    public NominalPersonGroupsQueryParams sessionId(final String value) {
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
   * @return NominalPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NominalPersonsResponseData nominalPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>nominalPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NominalPersonsResponseData> nominalPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>nominalPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NominalPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NominalPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NominalPersonsResponseData nominalPersons(@Param("elid") String elid, NominalPersonsRequestData body, @QueryMap(encoded=true) NominalPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>nominalPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NominalPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/nominal/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NominalPersonsResponseData> nominalPersonsWithHttpInfo(@Param("elid") String elid, NominalPersonsRequestData body, @QueryMap(encoded=true) NominalPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nominalPersons</code> method in a fluent style.
   */
  public static class NominalPersonsQueryParams extends HashMap<String, Object> {
    public NominalPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Postal address entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NominalPostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NominalPostalAddressesResponseData nominalPostalAddresses(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalPostalAddressesRequestData body);

  /**
   * Get relations to Postal address entities
   * Similar to <code>nominalPostalAddresses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NominalPostalAddressesResponseData> nominalPostalAddressesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalPostalAddressesRequestData body);


  /**
   * Get relations to Postal address entities
   * 
   * Note, this is equivalent to the other <code>nominalPostalAddresses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NominalPostalAddressesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NominalPostalAddressesResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/PostalAddresses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NominalPostalAddressesResponseData nominalPostalAddresses(@Param("elid") String elid, NominalPostalAddressesRequestData body, @QueryMap(encoded=true) NominalPostalAddressesQueryParams queryParams);

  /**
  * Get relations to Postal address entities
  * 
  * Note, this is equivalent to the other <code>nominalPostalAddresses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NominalPostalAddressesResponseData
      */
      @RequestLine("POST /api/rest/entity/nominal/{elid}/PostalAddresses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NominalPostalAddressesResponseData> nominalPostalAddressesWithHttpInfo(@Param("elid") String elid, NominalPostalAddressesRequestData body, @QueryMap(encoded=true) NominalPostalAddressesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nominalPostalAddresses</code> method in a fluent style.
   */
  public static class NominalPostalAddressesQueryParams extends HashMap<String, Object> {
    public NominalPostalAddressesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NominalQueryResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NominalQueryResponse nominalQuery(@Param("sessionId") String sessionId, NominalQueryRequest body);

  /**
   * Basic query
   * Similar to <code>nominalQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NominalQueryResponse> nominalQueryWithHttpInfo(@Param("sessionId") String sessionId, NominalQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>nominalQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NominalQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NominalQueryResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NominalQueryResponse nominalQuery(NominalQueryRequest body, @QueryMap(encoded=true) NominalQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>nominalQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NominalQueryResponse
      */
      @RequestLine("POST /api/rest/entity/nominal/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NominalQueryResponse> nominalQueryWithHttpInfo(NominalQueryRequest body, @QueryMap(encoded=true) NominalQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nominalQuery</code> method in a fluent style.
   */
  public static class NominalQueryQueryParams extends HashMap<String, Object> {
    public NominalQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Geo Location extended
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NominalQueryExtendedGeolocationResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/queryExtendedGeolocation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NominalQueryExtendedGeolocationResponse nominalQueryExtendedGeolocation(@Param("sessionId") String sessionId, NominalQueryExtendedGeolocationRequest body);

  /**
   * Geo Location extended
   * Similar to <code>nominalQueryExtendedGeolocation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/queryExtendedGeolocation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NominalQueryExtendedGeolocationResponse> nominalQueryExtendedGeolocationWithHttpInfo(@Param("sessionId") String sessionId, NominalQueryExtendedGeolocationRequest body);


  /**
   * Geo Location extended
   * 
   * Note, this is equivalent to the other <code>nominalQueryExtendedGeolocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NominalQueryExtendedGeolocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NominalQueryExtendedGeolocationResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/queryExtendedGeolocation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NominalQueryExtendedGeolocationResponse nominalQueryExtendedGeolocation(NominalQueryExtendedGeolocationRequest body, @QueryMap(encoded=true) NominalQueryExtendedGeolocationQueryParams queryParams);

  /**
  * Geo Location extended
  * 
  * Note, this is equivalent to the other <code>nominalQueryExtendedGeolocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NominalQueryExtendedGeolocationResponse
      */
      @RequestLine("POST /api/rest/entity/nominal/queryExtendedGeolocation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NominalQueryExtendedGeolocationResponse> nominalQueryExtendedGeolocationWithHttpInfo(NominalQueryExtendedGeolocationRequest body, @QueryMap(encoded=true) NominalQueryExtendedGeolocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nominalQueryExtendedGeolocation</code> method in a fluent style.
   */
  public static class NominalQueryExtendedGeolocationQueryParams extends HashMap<String, Object> {
    public NominalQueryExtendedGeolocationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query site
   * Query site in a radius for nominal
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NominalQueryExtendedSitesResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/queryExtendedSites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NominalQueryExtendedSitesResponse nominalQueryExtendedSites(@Param("sessionId") String sessionId, NominalQueryExtendedSitesRequest body);

  /**
   * Query site
   * Similar to <code>nominalQueryExtendedSites</code> but it also returns the http response headers .
   * Query site in a radius for nominal
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/queryExtendedSites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NominalQueryExtendedSitesResponse> nominalQueryExtendedSitesWithHttpInfo(@Param("sessionId") String sessionId, NominalQueryExtendedSitesRequest body);


  /**
   * Query site
   * Query site in a radius for nominal
   * Note, this is equivalent to the other <code>nominalQueryExtendedSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NominalQueryExtendedSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NominalQueryExtendedSitesResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/queryExtendedSites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NominalQueryExtendedSitesResponse nominalQueryExtendedSites(NominalQueryExtendedSitesRequest body, @QueryMap(encoded=true) NominalQueryExtendedSitesQueryParams queryParams);

  /**
  * Query site
  * Query site in a radius for nominal
  * Note, this is equivalent to the other <code>nominalQueryExtendedSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NominalQueryExtendedSitesResponse
      */
      @RequestLine("POST /api/rest/entity/nominal/queryExtendedSites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NominalQueryExtendedSitesResponse> nominalQueryExtendedSitesWithHttpInfo(NominalQueryExtendedSitesRequest body, @QueryMap(encoded=true) NominalQueryExtendedSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nominalQueryExtendedSites</code> method in a fluent style.
   */
  public static class NominalQueryExtendedSitesQueryParams extends HashMap<String, Object> {
    public NominalQueryExtendedSitesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query geolocalization
   * Query geolocalization for nominal
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return NominalQueryGeolocationResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/queryGeolocation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NominalQueryGeolocationResponse nominalQueryGeolocation(@Param("sessionId") String sessionId, NominalQueryGeolocationRequest body);

  /**
   * Query geolocalization
   * Similar to <code>nominalQueryGeolocation</code> but it also returns the http response headers .
   * Query geolocalization for nominal
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/queryGeolocation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NominalQueryGeolocationResponse> nominalQueryGeolocationWithHttpInfo(@Param("sessionId") String sessionId, NominalQueryGeolocationRequest body);


  /**
   * Query geolocalization
   * Query geolocalization for nominal
   * Note, this is equivalent to the other <code>nominalQueryGeolocation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NominalQueryGeolocationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NominalQueryGeolocationResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/queryGeolocation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NominalQueryGeolocationResponse nominalQueryGeolocation(NominalQueryGeolocationRequest body, @QueryMap(encoded=true) NominalQueryGeolocationQueryParams queryParams);

  /**
  * Query geolocalization
  * Query geolocalization for nominal
  * Note, this is equivalent to the other <code>nominalQueryGeolocation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NominalQueryGeolocationResponse
      */
      @RequestLine("POST /api/rest/entity/nominal/queryGeolocation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NominalQueryGeolocationResponse> nominalQueryGeolocationWithHttpInfo(NominalQueryGeolocationRequest body, @QueryMap(encoded=true) NominalQueryGeolocationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nominalQueryGeolocation</code> method in a fluent style.
   */
  public static class NominalQueryGeolocationQueryParams extends HashMap<String, Object> {
    public NominalQueryGeolocationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Sites entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return NominalSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NominalSitesResponseData nominalSites(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalSitesRequestData body);

  /**
   * Get relations to Sites entities
   * Similar to <code>nominalSites</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/Sites?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NominalSitesResponseData> nominalSitesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalSitesRequestData body);


  /**
   * Get relations to Sites entities
   * 
   * Note, this is equivalent to the other <code>nominalSites</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NominalSitesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NominalSitesResponseData
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/Sites?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NominalSitesResponseData nominalSites(@Param("elid") String elid, NominalSitesRequestData body, @QueryMap(encoded=true) NominalSitesQueryParams queryParams);

  /**
  * Get relations to Sites entities
  * 
  * Note, this is equivalent to the other <code>nominalSites</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NominalSitesResponseData
      */
      @RequestLine("POST /api/rest/entity/nominal/{elid}/Sites?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NominalSitesResponseData> nominalSitesWithHttpInfo(@Param("elid") String elid, NominalSitesRequestData body, @QueryMap(encoded=true) NominalSitesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nominalSites</code> method in a fluent style.
   */
  public static class NominalSitesQueryParams extends HashMap<String, Object> {
    public NominalSitesQueryParams sessionId(final String value) {
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
   * @return NominalSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  NominalSystemAttributesResponse nominalSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>nominalSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<NominalSystemAttributesResponse> nominalSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, NominalSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>nominalSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link NominalSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return NominalSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  NominalSystemAttributesResponse nominalSystemAttributes(@Param("elid") String elid, NominalSystemAttributesRequest body, @QueryMap(encoded=true) NominalSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>nominalSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return NominalSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/nominal/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<NominalSystemAttributesResponse> nominalSystemAttributesWithHttpInfo(@Param("elid") String elid, NominalSystemAttributesRequest body, @QueryMap(encoded=true) NominalSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>nominalSystemAttributes</code> method in a fluent style.
   */
  public static class NominalSystemAttributesQueryParams extends HashMap<String, Object> {
    public NominalSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Nominal
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateNominalResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateNominalResponse updateNominal(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNominalRequestData body);

  /**
   * Modify
   * Similar to <code>updateNominal</code> but it also returns the http response headers .
   * Modify Nominal
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateNominalResponse> updateNominalWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateNominalRequestData body);


  /**
   * Modify
   * Modify Nominal
   * Note, this is equivalent to the other <code>updateNominal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateNominalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateNominalResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateNominalResponse updateNominal(@Param("elid") String elid, UpdateNominalRequestData body, @QueryMap(encoded=true) UpdateNominalQueryParams queryParams);

  /**
  * Modify
  * Modify Nominal
  * Note, this is equivalent to the other <code>updateNominal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateNominalResponse
      */
      @RequestLine("POST /api/rest/entity/nominal/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateNominalResponse> updateNominalWithHttpInfo(@Param("elid") String elid, UpdateNominalRequestData body, @QueryMap(encoded=true) UpdateNominalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateNominal</code> method in a fluent style.
   */
  public static class UpdateNominalQueryParams extends HashMap<String, Object> {
    public UpdateNominalQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesNominalResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesNominalResponse updateSystemAttributesNominal(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNominalRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesNominal</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesNominalResponse> updateSystemAttributesNominalWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesNominalRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesNominal</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesNominalQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesNominalResponse
   */
  @RequestLine("POST /api/rest/entity/nominal/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesNominalResponse updateSystemAttributesNominal(@Param("elid") String elid, UpdateSystemAttributesNominalRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNominalQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesNominal</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesNominalResponse
      */
      @RequestLine("POST /api/rest/entity/nominal/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesNominalResponse> updateSystemAttributesNominalWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesNominalRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesNominalQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesNominal</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesNominalQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesNominalQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
