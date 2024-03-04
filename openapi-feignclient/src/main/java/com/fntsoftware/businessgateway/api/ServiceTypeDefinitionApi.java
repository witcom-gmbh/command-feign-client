package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerAsiServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerAsiServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerCsServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerCsServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerCwdmServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerCwdmServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerDwdmServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerDwdmServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerImaServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerImaServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerPdServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerPdServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerSatServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerSatServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerSpvcServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerSpvcServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerSpvpServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerSpvpServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerWbcServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeBearerWbcServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeMultipointPdServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeMultipointPdServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePathCsServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePathCsServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePathPdServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePathPdServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePathWdmServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePathWdmServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePointToPointCsServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePointToPointCsServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePointToPointPdServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypePointToPointPdServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeTrailCsServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeTrailCsServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeTrailPdServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.CreateServiceTypeTrailPdServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.DeleteServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.DeleteServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionBearersRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionBearersResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionCwdmParametersRequest;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionCwdmParametersResponse;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionDwdmParametersRequest;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionDwdmParametersResponse;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionPersonsRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionPersonsResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionQueryRequest;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionQueryResponse;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionServicesTelcoRequestData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionServicesTelcoResponseData;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ServiceTypeDefinitionSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.UpdateServiceTypeDefinitionResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTypeDefinitionRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesServiceTypeDefinitionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ServiceTypeDefinitionApi extends ApiClient.Api {


  /**
   * CreateServiceTypeBearerASI
   * CreateServiceTypeBearerASI
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeBearerAsiServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerAsi?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeBearerAsiServiceTypeDefinitionResponse createServiceTypeBearerAsiServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeBearerAsiServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeBearerASI
   * Similar to <code>createServiceTypeBearerAsiServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeBearerASI
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerAsi?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeBearerAsiServiceTypeDefinitionResponse> createServiceTypeBearerAsiServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeBearerAsiServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeBearerASI
   * CreateServiceTypeBearerASI
   * Note, this is equivalent to the other <code>createServiceTypeBearerAsiServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeBearerAsiServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeBearerAsiServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerAsi?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeBearerAsiServiceTypeDefinitionResponse createServiceTypeBearerAsiServiceTypeDefinition(CreateServiceTypeBearerAsiServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerAsiServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeBearerASI
  * CreateServiceTypeBearerASI
  * Note, this is equivalent to the other <code>createServiceTypeBearerAsiServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeBearerAsiServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerAsi?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeBearerAsiServiceTypeDefinitionResponse> createServiceTypeBearerAsiServiceTypeDefinitionWithHttpInfo(CreateServiceTypeBearerAsiServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerAsiServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeBearerAsiServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeBearerAsiServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeBearerAsiServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypeBearerCS
   * CreateServiceTypeBearerCS
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeBearerCsServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerCs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeBearerCsServiceTypeDefinitionResponse createServiceTypeBearerCsServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeBearerCsServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeBearerCS
   * Similar to <code>createServiceTypeBearerCsServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeBearerCS
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerCs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeBearerCsServiceTypeDefinitionResponse> createServiceTypeBearerCsServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeBearerCsServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeBearerCS
   * CreateServiceTypeBearerCS
   * Note, this is equivalent to the other <code>createServiceTypeBearerCsServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeBearerCsServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeBearerCsServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerCs?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeBearerCsServiceTypeDefinitionResponse createServiceTypeBearerCsServiceTypeDefinition(CreateServiceTypeBearerCsServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerCsServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeBearerCS
  * CreateServiceTypeBearerCS
  * Note, this is equivalent to the other <code>createServiceTypeBearerCsServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeBearerCsServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerCs?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeBearerCsServiceTypeDefinitionResponse> createServiceTypeBearerCsServiceTypeDefinitionWithHttpInfo(CreateServiceTypeBearerCsServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerCsServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeBearerCsServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeBearerCsServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeBearerCsServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypeBearerCWDM
   * CreateServiceTypeBearerCWDM
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeBearerCwdmServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerCwdm?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeBearerCwdmServiceTypeDefinitionResponse createServiceTypeBearerCwdmServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeBearerCwdmServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeBearerCWDM
   * Similar to <code>createServiceTypeBearerCwdmServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeBearerCWDM
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerCwdm?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeBearerCwdmServiceTypeDefinitionResponse> createServiceTypeBearerCwdmServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeBearerCwdmServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeBearerCWDM
   * CreateServiceTypeBearerCWDM
   * Note, this is equivalent to the other <code>createServiceTypeBearerCwdmServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeBearerCwdmServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeBearerCwdmServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerCwdm?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeBearerCwdmServiceTypeDefinitionResponse createServiceTypeBearerCwdmServiceTypeDefinition(CreateServiceTypeBearerCwdmServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerCwdmServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeBearerCWDM
  * CreateServiceTypeBearerCWDM
  * Note, this is equivalent to the other <code>createServiceTypeBearerCwdmServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeBearerCwdmServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerCwdm?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeBearerCwdmServiceTypeDefinitionResponse> createServiceTypeBearerCwdmServiceTypeDefinitionWithHttpInfo(CreateServiceTypeBearerCwdmServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerCwdmServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeBearerCwdmServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeBearerCwdmServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeBearerCwdmServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypeBearerDWDM
   * CreateServiceTypeBearerDWDM
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeBearerDwdmServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerDwdm?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeBearerDwdmServiceTypeDefinitionResponse createServiceTypeBearerDwdmServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeBearerDwdmServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeBearerDWDM
   * Similar to <code>createServiceTypeBearerDwdmServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeBearerDWDM
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerDwdm?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeBearerDwdmServiceTypeDefinitionResponse> createServiceTypeBearerDwdmServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeBearerDwdmServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeBearerDWDM
   * CreateServiceTypeBearerDWDM
   * Note, this is equivalent to the other <code>createServiceTypeBearerDwdmServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeBearerDwdmServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeBearerDwdmServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerDwdm?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeBearerDwdmServiceTypeDefinitionResponse createServiceTypeBearerDwdmServiceTypeDefinition(CreateServiceTypeBearerDwdmServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerDwdmServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeBearerDWDM
  * CreateServiceTypeBearerDWDM
  * Note, this is equivalent to the other <code>createServiceTypeBearerDwdmServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeBearerDwdmServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerDwdm?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeBearerDwdmServiceTypeDefinitionResponse> createServiceTypeBearerDwdmServiceTypeDefinitionWithHttpInfo(CreateServiceTypeBearerDwdmServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerDwdmServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeBearerDwdmServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeBearerDwdmServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeBearerDwdmServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypeBearerIMA
   * CreateServiceTypeBearerIMA
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeBearerImaServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerIma?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeBearerImaServiceTypeDefinitionResponse createServiceTypeBearerImaServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeBearerImaServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeBearerIMA
   * Similar to <code>createServiceTypeBearerImaServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeBearerIMA
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerIma?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeBearerImaServiceTypeDefinitionResponse> createServiceTypeBearerImaServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeBearerImaServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeBearerIMA
   * CreateServiceTypeBearerIMA
   * Note, this is equivalent to the other <code>createServiceTypeBearerImaServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeBearerImaServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeBearerImaServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerIma?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeBearerImaServiceTypeDefinitionResponse createServiceTypeBearerImaServiceTypeDefinition(CreateServiceTypeBearerImaServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerImaServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeBearerIMA
  * CreateServiceTypeBearerIMA
  * Note, this is equivalent to the other <code>createServiceTypeBearerImaServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeBearerImaServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerIma?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeBearerImaServiceTypeDefinitionResponse> createServiceTypeBearerImaServiceTypeDefinitionWithHttpInfo(CreateServiceTypeBearerImaServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerImaServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeBearerImaServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeBearerImaServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeBearerImaServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypeBearerPD
   * CreateServiceTypeBearerPD
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeBearerPdServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerPd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeBearerPdServiceTypeDefinitionResponse createServiceTypeBearerPdServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeBearerPdServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeBearerPD
   * Similar to <code>createServiceTypeBearerPdServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeBearerPD
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerPd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeBearerPdServiceTypeDefinitionResponse> createServiceTypeBearerPdServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeBearerPdServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeBearerPD
   * CreateServiceTypeBearerPD
   * Note, this is equivalent to the other <code>createServiceTypeBearerPdServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeBearerPdServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeBearerPdServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerPd?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeBearerPdServiceTypeDefinitionResponse createServiceTypeBearerPdServiceTypeDefinition(CreateServiceTypeBearerPdServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerPdServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeBearerPD
  * CreateServiceTypeBearerPD
  * Note, this is equivalent to the other <code>createServiceTypeBearerPdServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeBearerPdServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerPd?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeBearerPdServiceTypeDefinitionResponse> createServiceTypeBearerPdServiceTypeDefinitionWithHttpInfo(CreateServiceTypeBearerPdServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerPdServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeBearerPdServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeBearerPdServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeBearerPdServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypeBearerSAT
   * CreateServiceTypeBearerSAT
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeBearerSatServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerSat?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeBearerSatServiceTypeDefinitionResponse createServiceTypeBearerSatServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeBearerSatServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeBearerSAT
   * Similar to <code>createServiceTypeBearerSatServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeBearerSAT
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerSat?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeBearerSatServiceTypeDefinitionResponse> createServiceTypeBearerSatServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeBearerSatServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeBearerSAT
   * CreateServiceTypeBearerSAT
   * Note, this is equivalent to the other <code>createServiceTypeBearerSatServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeBearerSatServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeBearerSatServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerSat?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeBearerSatServiceTypeDefinitionResponse createServiceTypeBearerSatServiceTypeDefinition(CreateServiceTypeBearerSatServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerSatServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeBearerSAT
  * CreateServiceTypeBearerSAT
  * Note, this is equivalent to the other <code>createServiceTypeBearerSatServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeBearerSatServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerSat?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeBearerSatServiceTypeDefinitionResponse> createServiceTypeBearerSatServiceTypeDefinitionWithHttpInfo(CreateServiceTypeBearerSatServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerSatServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeBearerSatServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeBearerSatServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeBearerSatServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypeBearerSPVC
   * CreateServiceTypeBearerSPVC
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeBearerSpvcServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerSpvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeBearerSpvcServiceTypeDefinitionResponse createServiceTypeBearerSpvcServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeBearerSpvcServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeBearerSPVC
   * Similar to <code>createServiceTypeBearerSpvcServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeBearerSPVC
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerSpvc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeBearerSpvcServiceTypeDefinitionResponse> createServiceTypeBearerSpvcServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeBearerSpvcServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeBearerSPVC
   * CreateServiceTypeBearerSPVC
   * Note, this is equivalent to the other <code>createServiceTypeBearerSpvcServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeBearerSpvcServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeBearerSpvcServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerSpvc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeBearerSpvcServiceTypeDefinitionResponse createServiceTypeBearerSpvcServiceTypeDefinition(CreateServiceTypeBearerSpvcServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerSpvcServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeBearerSPVC
  * CreateServiceTypeBearerSPVC
  * Note, this is equivalent to the other <code>createServiceTypeBearerSpvcServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeBearerSpvcServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerSpvc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeBearerSpvcServiceTypeDefinitionResponse> createServiceTypeBearerSpvcServiceTypeDefinitionWithHttpInfo(CreateServiceTypeBearerSpvcServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerSpvcServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeBearerSpvcServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeBearerSpvcServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeBearerSpvcServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypeBearerSPVP
   * CreateServiceTypeBearerSPVP
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeBearerSpvpServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerSpvp?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeBearerSpvpServiceTypeDefinitionResponse createServiceTypeBearerSpvpServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeBearerSpvpServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeBearerSPVP
   * Similar to <code>createServiceTypeBearerSpvpServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeBearerSPVP
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerSpvp?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeBearerSpvpServiceTypeDefinitionResponse> createServiceTypeBearerSpvpServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeBearerSpvpServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeBearerSPVP
   * CreateServiceTypeBearerSPVP
   * Note, this is equivalent to the other <code>createServiceTypeBearerSpvpServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeBearerSpvpServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeBearerSpvpServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerSpvp?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeBearerSpvpServiceTypeDefinitionResponse createServiceTypeBearerSpvpServiceTypeDefinition(CreateServiceTypeBearerSpvpServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerSpvpServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeBearerSPVP
  * CreateServiceTypeBearerSPVP
  * Note, this is equivalent to the other <code>createServiceTypeBearerSpvpServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeBearerSpvpServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerSpvp?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeBearerSpvpServiceTypeDefinitionResponse> createServiceTypeBearerSpvpServiceTypeDefinitionWithHttpInfo(CreateServiceTypeBearerSpvpServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerSpvpServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeBearerSpvpServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeBearerSpvpServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeBearerSpvpServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypeBearerWBC
   * CreateServiceTypeBearerWBC
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeBearerWbcServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerWbc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeBearerWbcServiceTypeDefinitionResponse createServiceTypeBearerWbcServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeBearerWbcServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeBearerWBC
   * Similar to <code>createServiceTypeBearerWbcServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeBearerWBC
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerWbc?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeBearerWbcServiceTypeDefinitionResponse> createServiceTypeBearerWbcServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeBearerWbcServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeBearerWBC
   * CreateServiceTypeBearerWBC
   * Note, this is equivalent to the other <code>createServiceTypeBearerWbcServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeBearerWbcServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeBearerWbcServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerWbc?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeBearerWbcServiceTypeDefinitionResponse createServiceTypeBearerWbcServiceTypeDefinition(CreateServiceTypeBearerWbcServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerWbcServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeBearerWBC
  * CreateServiceTypeBearerWBC
  * Note, this is equivalent to the other <code>createServiceTypeBearerWbcServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeBearerWbcServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeBearerWbc?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeBearerWbcServiceTypeDefinitionResponse> createServiceTypeBearerWbcServiceTypeDefinitionWithHttpInfo(CreateServiceTypeBearerWbcServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeBearerWbcServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeBearerWbcServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeBearerWbcServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeBearerWbcServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypeConcatenatedPathCS
   * CreateServiceTypeConcatenatedPathCS
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeConcatenatedPathCs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionResponse createServiceTypeConcatenatedPathCsServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeConcatenatedPathCS
   * Similar to <code>createServiceTypeConcatenatedPathCsServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeConcatenatedPathCS
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeConcatenatedPathCs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionResponse> createServiceTypeConcatenatedPathCsServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeConcatenatedPathCS
   * CreateServiceTypeConcatenatedPathCS
   * Note, this is equivalent to the other <code>createServiceTypeConcatenatedPathCsServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeConcatenatedPathCs?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionResponse createServiceTypeConcatenatedPathCsServiceTypeDefinition(CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeConcatenatedPathCS
  * CreateServiceTypeConcatenatedPathCS
  * Note, this is equivalent to the other <code>createServiceTypeConcatenatedPathCsServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeConcatenatedPathCs?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionResponse> createServiceTypeConcatenatedPathCsServiceTypeDefinitionWithHttpInfo(CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeConcatenatedPathCsServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeConcatenatedPathCsServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypeMultipointPD
   * CreateServiceTypeMultipointPD
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeMultipointPdServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeMultipointPd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeMultipointPdServiceTypeDefinitionResponse createServiceTypeMultipointPdServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeMultipointPdServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeMultipointPD
   * Similar to <code>createServiceTypeMultipointPdServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeMultipointPD
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeMultipointPd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeMultipointPdServiceTypeDefinitionResponse> createServiceTypeMultipointPdServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeMultipointPdServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeMultipointPD
   * CreateServiceTypeMultipointPD
   * Note, this is equivalent to the other <code>createServiceTypeMultipointPdServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeMultipointPdServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeMultipointPdServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeMultipointPd?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeMultipointPdServiceTypeDefinitionResponse createServiceTypeMultipointPdServiceTypeDefinition(CreateServiceTypeMultipointPdServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeMultipointPdServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeMultipointPD
  * CreateServiceTypeMultipointPD
  * Note, this is equivalent to the other <code>createServiceTypeMultipointPdServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeMultipointPdServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeMultipointPd?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeMultipointPdServiceTypeDefinitionResponse> createServiceTypeMultipointPdServiceTypeDefinitionWithHttpInfo(CreateServiceTypeMultipointPdServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeMultipointPdServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeMultipointPdServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeMultipointPdServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeMultipointPdServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypePathCS
   * CreateServiceTypePathCS
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypePathCsServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePathCs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypePathCsServiceTypeDefinitionResponse createServiceTypePathCsServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypePathCsServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypePathCS
   * Similar to <code>createServiceTypePathCsServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypePathCS
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePathCs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypePathCsServiceTypeDefinitionResponse> createServiceTypePathCsServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypePathCsServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypePathCS
   * CreateServiceTypePathCS
   * Note, this is equivalent to the other <code>createServiceTypePathCsServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypePathCsServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypePathCsServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePathCs?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypePathCsServiceTypeDefinitionResponse createServiceTypePathCsServiceTypeDefinition(CreateServiceTypePathCsServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypePathCsServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypePathCS
  * CreateServiceTypePathCS
  * Note, this is equivalent to the other <code>createServiceTypePathCsServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypePathCsServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePathCs?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypePathCsServiceTypeDefinitionResponse> createServiceTypePathCsServiceTypeDefinitionWithHttpInfo(CreateServiceTypePathCsServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypePathCsServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypePathCsServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypePathCsServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypePathCsServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypePathPD
   * CreateServiceTypePathPD
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypePathPdServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePathPd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypePathPdServiceTypeDefinitionResponse createServiceTypePathPdServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypePathPdServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypePathPD
   * Similar to <code>createServiceTypePathPdServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypePathPD
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePathPd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypePathPdServiceTypeDefinitionResponse> createServiceTypePathPdServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypePathPdServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypePathPD
   * CreateServiceTypePathPD
   * Note, this is equivalent to the other <code>createServiceTypePathPdServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypePathPdServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypePathPdServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePathPd?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypePathPdServiceTypeDefinitionResponse createServiceTypePathPdServiceTypeDefinition(CreateServiceTypePathPdServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypePathPdServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypePathPD
  * CreateServiceTypePathPD
  * Note, this is equivalent to the other <code>createServiceTypePathPdServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypePathPdServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePathPd?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypePathPdServiceTypeDefinitionResponse> createServiceTypePathPdServiceTypeDefinitionWithHttpInfo(CreateServiceTypePathPdServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypePathPdServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypePathPdServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypePathPdServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypePathPdServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypePathWDM
   * CreateServiceTypePathWDM
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypePathWdmServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePathWdm?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypePathWdmServiceTypeDefinitionResponse createServiceTypePathWdmServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypePathWdmServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypePathWDM
   * Similar to <code>createServiceTypePathWdmServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypePathWDM
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePathWdm?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypePathWdmServiceTypeDefinitionResponse> createServiceTypePathWdmServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypePathWdmServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypePathWDM
   * CreateServiceTypePathWDM
   * Note, this is equivalent to the other <code>createServiceTypePathWdmServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypePathWdmServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypePathWdmServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePathWdm?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypePathWdmServiceTypeDefinitionResponse createServiceTypePathWdmServiceTypeDefinition(CreateServiceTypePathWdmServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypePathWdmServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypePathWDM
  * CreateServiceTypePathWDM
  * Note, this is equivalent to the other <code>createServiceTypePathWdmServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypePathWdmServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePathWdm?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypePathWdmServiceTypeDefinitionResponse> createServiceTypePathWdmServiceTypeDefinitionWithHttpInfo(CreateServiceTypePathWdmServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypePathWdmServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypePathWdmServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypePathWdmServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypePathWdmServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypePointToPointCS
   * CreateServiceTypePointToPointCS
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypePointToPointCsServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePointToPointCs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypePointToPointCsServiceTypeDefinitionResponse createServiceTypePointToPointCsServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypePointToPointCsServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypePointToPointCS
   * Similar to <code>createServiceTypePointToPointCsServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypePointToPointCS
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePointToPointCs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypePointToPointCsServiceTypeDefinitionResponse> createServiceTypePointToPointCsServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypePointToPointCsServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypePointToPointCS
   * CreateServiceTypePointToPointCS
   * Note, this is equivalent to the other <code>createServiceTypePointToPointCsServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypePointToPointCsServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypePointToPointCsServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePointToPointCs?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypePointToPointCsServiceTypeDefinitionResponse createServiceTypePointToPointCsServiceTypeDefinition(CreateServiceTypePointToPointCsServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypePointToPointCsServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypePointToPointCS
  * CreateServiceTypePointToPointCS
  * Note, this is equivalent to the other <code>createServiceTypePointToPointCsServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypePointToPointCsServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePointToPointCs?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypePointToPointCsServiceTypeDefinitionResponse> createServiceTypePointToPointCsServiceTypeDefinitionWithHttpInfo(CreateServiceTypePointToPointCsServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypePointToPointCsServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypePointToPointCsServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypePointToPointCsServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypePointToPointCsServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypePointToPointPD
   * CreateServiceTypePointToPointPD
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypePointToPointPdServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePointToPointPd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypePointToPointPdServiceTypeDefinitionResponse createServiceTypePointToPointPdServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypePointToPointPdServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypePointToPointPD
   * Similar to <code>createServiceTypePointToPointPdServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypePointToPointPD
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePointToPointPd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypePointToPointPdServiceTypeDefinitionResponse> createServiceTypePointToPointPdServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypePointToPointPdServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypePointToPointPD
   * CreateServiceTypePointToPointPD
   * Note, this is equivalent to the other <code>createServiceTypePointToPointPdServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypePointToPointPdServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypePointToPointPdServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePointToPointPd?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypePointToPointPdServiceTypeDefinitionResponse createServiceTypePointToPointPdServiceTypeDefinition(CreateServiceTypePointToPointPdServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypePointToPointPdServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypePointToPointPD
  * CreateServiceTypePointToPointPD
  * Note, this is equivalent to the other <code>createServiceTypePointToPointPdServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypePointToPointPdServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypePointToPointPd?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypePointToPointPdServiceTypeDefinitionResponse> createServiceTypePointToPointPdServiceTypeDefinitionWithHttpInfo(CreateServiceTypePointToPointPdServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypePointToPointPdServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypePointToPointPdServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypePointToPointPdServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypePointToPointPdServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypeTrailCS
   * CreateServiceTypeTrailCS
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeTrailCsServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeTrailCs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeTrailCsServiceTypeDefinitionResponse createServiceTypeTrailCsServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeTrailCsServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeTrailCS
   * Similar to <code>createServiceTypeTrailCsServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeTrailCS
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeTrailCs?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeTrailCsServiceTypeDefinitionResponse> createServiceTypeTrailCsServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeTrailCsServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeTrailCS
   * CreateServiceTypeTrailCS
   * Note, this is equivalent to the other <code>createServiceTypeTrailCsServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeTrailCsServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeTrailCsServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeTrailCs?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeTrailCsServiceTypeDefinitionResponse createServiceTypeTrailCsServiceTypeDefinition(CreateServiceTypeTrailCsServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeTrailCsServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeTrailCS
  * CreateServiceTypeTrailCS
  * Note, this is equivalent to the other <code>createServiceTypeTrailCsServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeTrailCsServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeTrailCs?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeTrailCsServiceTypeDefinitionResponse> createServiceTypeTrailCsServiceTypeDefinitionWithHttpInfo(CreateServiceTypeTrailCsServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeTrailCsServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeTrailCsServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeTrailCsServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeTrailCsServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CreateServiceTypeTrailPD
   * CreateServiceTypeTrailPD
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateServiceTypeTrailPdServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeTrailPd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateServiceTypeTrailPdServiceTypeDefinitionResponse createServiceTypeTrailPdServiceTypeDefinition(@Param("sessionId") String sessionId, CreateServiceTypeTrailPdServiceTypeDefinitionRequestData body);

  /**
   * CreateServiceTypeTrailPD
   * Similar to <code>createServiceTypeTrailPdServiceTypeDefinition</code> but it also returns the http response headers .
   * CreateServiceTypeTrailPD
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeTrailPd?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateServiceTypeTrailPdServiceTypeDefinitionResponse> createServiceTypeTrailPdServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, CreateServiceTypeTrailPdServiceTypeDefinitionRequestData body);


  /**
   * CreateServiceTypeTrailPD
   * CreateServiceTypeTrailPD
   * Note, this is equivalent to the other <code>createServiceTypeTrailPdServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateServiceTypeTrailPdServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateServiceTypeTrailPdServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeTrailPd?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateServiceTypeTrailPdServiceTypeDefinitionResponse createServiceTypeTrailPdServiceTypeDefinition(CreateServiceTypeTrailPdServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeTrailPdServiceTypeDefinitionQueryParams queryParams);

  /**
  * CreateServiceTypeTrailPD
  * CreateServiceTypeTrailPD
  * Note, this is equivalent to the other <code>createServiceTypeTrailPdServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateServiceTypeTrailPdServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/createServiceTypeTrailPd?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateServiceTypeTrailPdServiceTypeDefinitionResponse> createServiceTypeTrailPdServiceTypeDefinitionWithHttpInfo(CreateServiceTypeTrailPdServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) CreateServiceTypeTrailPdServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createServiceTypeTrailPdServiceTypeDefinition</code> method in a fluent style.
   */
  public static class CreateServiceTypeTrailPdServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public CreateServiceTypeTrailPdServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Service type definition
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteServiceTypeDefinitionResponse deleteServiceTypeDefinition(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTypeDefinitionRequestData body);

  /**
   * Delete
   * Similar to <code>deleteServiceTypeDefinition</code> but it also returns the http response headers .
   * Delete Service type definition
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteServiceTypeDefinitionResponse> deleteServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteServiceTypeDefinitionRequestData body);


  /**
   * Delete
   * Delete Service type definition
   * Note, this is equivalent to the other <code>deleteServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteServiceTypeDefinitionResponse deleteServiceTypeDefinition(@Param("elid") String elid, DeleteServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) DeleteServiceTypeDefinitionQueryParams queryParams);

  /**
  * Delete
  * Delete Service type definition
  * Note, this is equivalent to the other <code>deleteServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteServiceTypeDefinitionResponse> deleteServiceTypeDefinitionWithHttpInfo(@Param("elid") String elid, DeleteServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) DeleteServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteServiceTypeDefinition</code> method in a fluent style.
   */
  public static class DeleteServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public DeleteServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Bearer entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTypeDefinitionBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionBearersResponseData serviceTypeDefinitionBearers(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionBearersRequestData body);

  /**
   * Get relations to Bearer entities
   * Similar to <code>serviceTypeDefinitionBearers</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionBearersResponseData> serviceTypeDefinitionBearersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionBearersRequestData body);


  /**
   * Get relations to Bearer entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionBearers</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionBearersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionBearersResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Bearers?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionBearersResponseData serviceTypeDefinitionBearers(@Param("elid") String elid, ServiceTypeDefinitionBearersRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionBearersQueryParams queryParams);

  /**
  * Get relations to Bearer entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionBearers</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionBearersResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Bearers?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionBearersResponseData> serviceTypeDefinitionBearersWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionBearersRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionBearersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionBearers</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionBearersQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionBearersQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionContractsResponseData serviceTypeDefinitionContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>serviceTypeDefinitionContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionContractsResponseData> serviceTypeDefinitionContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionContractsResponseData serviceTypeDefinitionContracts(@Param("elid") String elid, ServiceTypeDefinitionContractsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionContractsResponseData> serviceTypeDefinitionContractsWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionContractsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionContracts</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionContractsQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CWDMParameters
   * CWDMParameters
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTypeDefinitionCwdmParametersResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/CwdmParameters?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionCwdmParametersResponse serviceTypeDefinitionCwdmParameters(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionCwdmParametersRequest body);

  /**
   * CWDMParameters
   * Similar to <code>serviceTypeDefinitionCwdmParameters</code> but it also returns the http response headers .
   * CWDMParameters
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/CwdmParameters?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionCwdmParametersResponse> serviceTypeDefinitionCwdmParametersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionCwdmParametersRequest body);


  /**
   * CWDMParameters
   * CWDMParameters
   * Note, this is equivalent to the other <code>serviceTypeDefinitionCwdmParameters</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionCwdmParametersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionCwdmParametersResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/CwdmParameters?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionCwdmParametersResponse serviceTypeDefinitionCwdmParameters(@Param("elid") String elid, ServiceTypeDefinitionCwdmParametersRequest body, @QueryMap(encoded=true) ServiceTypeDefinitionCwdmParametersQueryParams queryParams);

  /**
  * CWDMParameters
  * CWDMParameters
  * Note, this is equivalent to the other <code>serviceTypeDefinitionCwdmParameters</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionCwdmParametersResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/CwdmParameters?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionCwdmParametersResponse> serviceTypeDefinitionCwdmParametersWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionCwdmParametersRequest body, @QueryMap(encoded=true) ServiceTypeDefinitionCwdmParametersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionCwdmParameters</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionCwdmParametersQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionCwdmParametersQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * DWDMParameters
   * DWDMParameters
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTypeDefinitionDwdmParametersResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/DwdmParameters?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionDwdmParametersResponse serviceTypeDefinitionDwdmParameters(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionDwdmParametersRequest body);

  /**
   * DWDMParameters
   * Similar to <code>serviceTypeDefinitionDwdmParameters</code> but it also returns the http response headers .
   * DWDMParameters
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/DwdmParameters?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionDwdmParametersResponse> serviceTypeDefinitionDwdmParametersWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionDwdmParametersRequest body);


  /**
   * DWDMParameters
   * DWDMParameters
   * Note, this is equivalent to the other <code>serviceTypeDefinitionDwdmParameters</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionDwdmParametersQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionDwdmParametersResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/DwdmParameters?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionDwdmParametersResponse serviceTypeDefinitionDwdmParameters(@Param("elid") String elid, ServiceTypeDefinitionDwdmParametersRequest body, @QueryMap(encoded=true) ServiceTypeDefinitionDwdmParametersQueryParams queryParams);

  /**
  * DWDMParameters
  * DWDMParameters
  * Note, this is equivalent to the other <code>serviceTypeDefinitionDwdmParameters</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionDwdmParametersResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/DwdmParameters?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionDwdmParametersResponse> serviceTypeDefinitionDwdmParametersWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionDwdmParametersRequest body, @QueryMap(encoded=true) ServiceTypeDefinitionDwdmParametersQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionDwdmParameters</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionDwdmParametersQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionDwdmParametersQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionFrameContractsResponseData serviceTypeDefinitionFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>serviceTypeDefinitionFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionFrameContractsResponseData> serviceTypeDefinitionFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionFrameContractsResponseData serviceTypeDefinitionFrameContracts(@Param("elid") String elid, ServiceTypeDefinitionFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionFrameContractsResponseData> serviceTypeDefinitionFrameContractsWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionFrameContractsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionFrameContracts</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionFrameContractsQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Maintenance contract entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTypeDefinitionMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionMaintenanceContractsResponseData serviceTypeDefinitionMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>serviceTypeDefinitionMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionMaintenanceContractsResponseData> serviceTypeDefinitionMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionMaintenanceContractsResponseData serviceTypeDefinitionMaintenanceContracts(@Param("elid") String elid, ServiceTypeDefinitionMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionMaintenanceContractsResponseData> serviceTypeDefinitionMaintenanceContractsWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionMaintenanceContractsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionMaintenanceContracts</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionOrganizationsResponseData serviceTypeDefinitionOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>serviceTypeDefinitionOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionOrganizationsResponseData> serviceTypeDefinitionOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionOrganizationsResponseData serviceTypeDefinitionOrganizations(@Param("elid") String elid, ServiceTypeDefinitionOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionOrganizationsResponseData> serviceTypeDefinitionOrganizationsWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionOrganizationsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionOrganizations</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionOrganizationsQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionOrganizationsQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionPersonGroupsResponseData serviceTypeDefinitionPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>serviceTypeDefinitionPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionPersonGroupsResponseData> serviceTypeDefinitionPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionPersonGroupsResponseData serviceTypeDefinitionPersonGroups(@Param("elid") String elid, ServiceTypeDefinitionPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionPersonGroupsResponseData> serviceTypeDefinitionPersonGroupsWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionPersonGroupsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionPersonGroups</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionPersonGroupsQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionPersonGroupsQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionPersonsResponseData serviceTypeDefinitionPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>serviceTypeDefinitionPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionPersonsResponseData> serviceTypeDefinitionPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionPersonsResponseData serviceTypeDefinitionPersons(@Param("elid") String elid, ServiceTypeDefinitionPersonsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionPersonsResponseData> serviceTypeDefinitionPersonsWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionPersonsRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionPersons</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionPersonsQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ServiceTypeDefinitionQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionQueryResponse serviceTypeDefinitionQuery(@Param("sessionId") String sessionId, ServiceTypeDefinitionQueryRequest body);

  /**
   * Basic query
   * Similar to <code>serviceTypeDefinitionQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionQueryResponse> serviceTypeDefinitionQueryWithHttpInfo(@Param("sessionId") String sessionId, ServiceTypeDefinitionQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>serviceTypeDefinitionQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionQueryResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionQueryResponse serviceTypeDefinitionQuery(ServiceTypeDefinitionQueryRequest body, @QueryMap(encoded=true) ServiceTypeDefinitionQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>serviceTypeDefinitionQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionQueryResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionQueryResponse> serviceTypeDefinitionQueryWithHttpInfo(ServiceTypeDefinitionQueryRequest body, @QueryMap(encoded=true) ServiceTypeDefinitionQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionQuery</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionQueryQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionQueryQueryParams sessionId(final String value) {
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
   * @return ServiceTypeDefinitionServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionServicesTelcoResponseData serviceTypeDefinitionServicesTelco(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionServicesTelcoRequestData body);

  /**
   * Get relations to Service (Telco) entities
   * Similar to <code>serviceTypeDefinitionServicesTelco</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionServicesTelcoResponseData> serviceTypeDefinitionServicesTelcoWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionServicesTelcoRequestData body);


  /**
   * Get relations to Service (Telco) entities
   * 
   * Note, this is equivalent to the other <code>serviceTypeDefinitionServicesTelco</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionServicesTelcoQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionServicesTelcoResponseData
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/ServicesTelco?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionServicesTelcoResponseData serviceTypeDefinitionServicesTelco(@Param("elid") String elid, ServiceTypeDefinitionServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionServicesTelcoQueryParams queryParams);

  /**
  * Get relations to Service (Telco) entities
  * 
  * Note, this is equivalent to the other <code>serviceTypeDefinitionServicesTelco</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionServicesTelcoResponseData
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/ServicesTelco?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionServicesTelcoResponseData> serviceTypeDefinitionServicesTelcoWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionServicesTelcoRequestData body, @QueryMap(encoded=true) ServiceTypeDefinitionServicesTelcoQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionServicesTelco</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionServicesTelcoQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionServicesTelcoQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query system attributes
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ServiceTypeDefinitionSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ServiceTypeDefinitionSystemAttributesResponse serviceTypeDefinitionSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>serviceTypeDefinitionSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ServiceTypeDefinitionSystemAttributesResponse> serviceTypeDefinitionSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ServiceTypeDefinitionSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>serviceTypeDefinitionSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ServiceTypeDefinitionSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ServiceTypeDefinitionSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ServiceTypeDefinitionSystemAttributesResponse serviceTypeDefinitionSystemAttributes(@Param("elid") String elid, ServiceTypeDefinitionSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTypeDefinitionSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>serviceTypeDefinitionSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ServiceTypeDefinitionSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ServiceTypeDefinitionSystemAttributesResponse> serviceTypeDefinitionSystemAttributesWithHttpInfo(@Param("elid") String elid, ServiceTypeDefinitionSystemAttributesRequest body, @QueryMap(encoded=true) ServiceTypeDefinitionSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>serviceTypeDefinitionSystemAttributes</code> method in a fluent style.
   */
  public static class ServiceTypeDefinitionSystemAttributesQueryParams extends HashMap<String, Object> {
    public ServiceTypeDefinitionSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Service type definition
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateServiceTypeDefinitionResponse updateServiceTypeDefinition(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTypeDefinitionRequestData body);

  /**
   * Modify
   * Similar to <code>updateServiceTypeDefinition</code> but it also returns the http response headers .
   * Modify Service type definition
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateServiceTypeDefinitionResponse> updateServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateServiceTypeDefinitionRequestData body);


  /**
   * Modify
   * Modify Service type definition
   * Note, this is equivalent to the other <code>updateServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateServiceTypeDefinitionResponse updateServiceTypeDefinition(@Param("elid") String elid, UpdateServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) UpdateServiceTypeDefinitionQueryParams queryParams);

  /**
  * Modify
  * Modify Service type definition
  * Note, this is equivalent to the other <code>updateServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateServiceTypeDefinitionResponse> updateServiceTypeDefinitionWithHttpInfo(@Param("elid") String elid, UpdateServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) UpdateServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateServiceTypeDefinition</code> method in a fluent style.
   */
  public static class UpdateServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public UpdateServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Change system attributes
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSystemAttributesServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesServiceTypeDefinitionResponse updateSystemAttributesServiceTypeDefinition(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTypeDefinitionRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesServiceTypeDefinition</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesServiceTypeDefinitionResponse> updateSystemAttributesServiceTypeDefinitionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesServiceTypeDefinitionRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesServiceTypeDefinition</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesServiceTypeDefinitionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesServiceTypeDefinitionResponse
   */
  @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesServiceTypeDefinitionResponse updateSystemAttributesServiceTypeDefinition(@Param("elid") String elid, UpdateSystemAttributesServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTypeDefinitionQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesServiceTypeDefinition</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesServiceTypeDefinitionResponse
      */
      @RequestLine("POST /api/rest/entity/serviceTypeDefinition/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesServiceTypeDefinitionResponse> updateSystemAttributesServiceTypeDefinitionWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesServiceTypeDefinitionRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesServiceTypeDefinitionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesServiceTypeDefinition</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesServiceTypeDefinitionQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesServiceTypeDefinitionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
