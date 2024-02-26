package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateLanRouteSignalPathRequestData;
import com.fntsoftware.businessgateway.entities.CreateLanRouteSignalPathResponse;
import com.fntsoftware.businessgateway.entities.CreateSignalPathRequestData;
import com.fntsoftware.businessgateway.entities.CreateSignalPathResponse;
import com.fntsoftware.businessgateway.entities.CreateTcRouteSignalPathRequestData;
import com.fntsoftware.businessgateway.entities.CreateTcRouteSignalPathResponse;
import com.fntsoftware.businessgateway.entities.CreateVoipRouteSignalPathRequestData;
import com.fntsoftware.businessgateway.entities.CreateVoipRouteSignalPathResponse;
import com.fntsoftware.businessgateway.entities.DeleteSignalPathRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSignalPathResponse;
import com.fntsoftware.businessgateway.entities.SignalPathCableMasterDataCableRequestData;
import com.fntsoftware.businessgateway.entities.SignalPathCableMasterDataCableResponseData;
import com.fntsoftware.businessgateway.entities.SignalPathContractsRequestData;
import com.fntsoftware.businessgateway.entities.SignalPathContractsResponseData;
import com.fntsoftware.businessgateway.entities.SignalPathFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SignalPathFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SignalPathOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SignalPathOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SignalPathPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SignalPathPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SignalPathPersonsRequestData;
import com.fntsoftware.businessgateway.entities.SignalPathPersonsResponseData;
import com.fntsoftware.businessgateway.entities.SignalPathQueryRequest;
import com.fntsoftware.businessgateway.entities.SignalPathQueryResponse;
import com.fntsoftware.businessgateway.entities.SignalPathServiceSignalmgmtRequestData;
import com.fntsoftware.businessgateway.entities.SignalPathServiceSignalmgmtResponseData;
import com.fntsoftware.businessgateway.entities.SignalPathSignalPathsChildRequestData;
import com.fntsoftware.businessgateway.entities.SignalPathSignalPathsChildResponseData;
import com.fntsoftware.businessgateway.entities.SignalPathSignalPathsParentRequestData;
import com.fntsoftware.businessgateway.entities.SignalPathSignalPathsParentResponseData;
import com.fntsoftware.businessgateway.entities.SignalPathSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SignalPathSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSignalPathRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSignalPathResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSignalPathRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSignalPathResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface SignalPathApi extends ApiClient.Api {


  /**
   * Create LAN route
   * Create LAN route
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CreateLanRouteSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/createLanRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateLanRouteSignalPathResponse createLanRouteSignalPath(@Param("sessionId") String sessionId, @Param("elid") String elid, CreateLanRouteSignalPathRequestData body);

  /**
   * Create LAN route
   * Similar to <code>createLanRouteSignalPath</code> but it also returns the http response headers .
   * Create LAN route
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/createLanRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateLanRouteSignalPathResponse> createLanRouteSignalPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CreateLanRouteSignalPathRequestData body);


  /**
   * Create LAN route
   * Create LAN route
   * Note, this is equivalent to the other <code>createLanRouteSignalPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateLanRouteSignalPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateLanRouteSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/createLanRoute?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateLanRouteSignalPathResponse createLanRouteSignalPath(@Param("elid") String elid, CreateLanRouteSignalPathRequestData body, @QueryMap(encoded=true) CreateLanRouteSignalPathQueryParams queryParams);

  /**
  * Create LAN route
  * Create LAN route
  * Note, this is equivalent to the other <code>createLanRouteSignalPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateLanRouteSignalPathResponse
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/createLanRoute?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateLanRouteSignalPathResponse> createLanRouteSignalPathWithHttpInfo(@Param("elid") String elid, CreateLanRouteSignalPathRequestData body, @QueryMap(encoded=true) CreateLanRouteSignalPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createLanRouteSignalPath</code> method in a fluent style.
   */
  public static class CreateLanRouteSignalPathQueryParams extends HashMap<String, Object> {
    public CreateLanRouteSignalPathQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Signal path
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSignalPathResponse createSignalPath(@Param("sessionId") String sessionId, CreateSignalPathRequestData body);

  /**
   * Create
   * Similar to <code>createSignalPath</code> but it also returns the http response headers .
   * Create Signal path
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSignalPathResponse> createSignalPathWithHttpInfo(@Param("sessionId") String sessionId, CreateSignalPathRequestData body);


  /**
   * Create
   * Create Signal path
   * Note, this is equivalent to the other <code>createSignalPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSignalPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSignalPathResponse createSignalPath(CreateSignalPathRequestData body, @QueryMap(encoded=true) CreateSignalPathQueryParams queryParams);

  /**
  * Create
  * Create Signal path
  * Note, this is equivalent to the other <code>createSignalPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSignalPathResponse
      */
      @RequestLine("POST /api/rest/entity/signalPath/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSignalPathResponse> createSignalPathWithHttpInfo(CreateSignalPathRequestData body, @QueryMap(encoded=true) CreateSignalPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSignalPath</code> method in a fluent style.
   */
  public static class CreateSignalPathQueryParams extends HashMap<String, Object> {
    public CreateSignalPathQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create analog/digital route
   * Create analog/digital route
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CreateTcRouteSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/createTcRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateTcRouteSignalPathResponse createTcRouteSignalPath(@Param("sessionId") String sessionId, @Param("elid") String elid, CreateTcRouteSignalPathRequestData body);

  /**
   * Create analog/digital route
   * Similar to <code>createTcRouteSignalPath</code> but it also returns the http response headers .
   * Create analog/digital route
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/createTcRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateTcRouteSignalPathResponse> createTcRouteSignalPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CreateTcRouteSignalPathRequestData body);


  /**
   * Create analog/digital route
   * Create analog/digital route
   * Note, this is equivalent to the other <code>createTcRouteSignalPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateTcRouteSignalPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateTcRouteSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/createTcRoute?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateTcRouteSignalPathResponse createTcRouteSignalPath(@Param("elid") String elid, CreateTcRouteSignalPathRequestData body, @QueryMap(encoded=true) CreateTcRouteSignalPathQueryParams queryParams);

  /**
  * Create analog/digital route
  * Create analog/digital route
  * Note, this is equivalent to the other <code>createTcRouteSignalPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateTcRouteSignalPathResponse
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/createTcRoute?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateTcRouteSignalPathResponse> createTcRouteSignalPathWithHttpInfo(@Param("elid") String elid, CreateTcRouteSignalPathRequestData body, @QueryMap(encoded=true) CreateTcRouteSignalPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createTcRouteSignalPath</code> method in a fluent style.
   */
  public static class CreateTcRouteSignalPathQueryParams extends HashMap<String, Object> {
    public CreateTcRouteSignalPathQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create VoIP route
   * Create VoIP route
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CreateVoipRouteSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/createVoipRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateVoipRouteSignalPathResponse createVoipRouteSignalPath(@Param("sessionId") String sessionId, @Param("elid") String elid, CreateVoipRouteSignalPathRequestData body);

  /**
   * Create VoIP route
   * Similar to <code>createVoipRouteSignalPath</code> but it also returns the http response headers .
   * Create VoIP route
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/createVoipRoute?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateVoipRouteSignalPathResponse> createVoipRouteSignalPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CreateVoipRouteSignalPathRequestData body);


  /**
   * Create VoIP route
   * Create VoIP route
   * Note, this is equivalent to the other <code>createVoipRouteSignalPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateVoipRouteSignalPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateVoipRouteSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/createVoipRoute?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateVoipRouteSignalPathResponse createVoipRouteSignalPath(@Param("elid") String elid, CreateVoipRouteSignalPathRequestData body, @QueryMap(encoded=true) CreateVoipRouteSignalPathQueryParams queryParams);

  /**
  * Create VoIP route
  * Create VoIP route
  * Note, this is equivalent to the other <code>createVoipRouteSignalPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateVoipRouteSignalPathResponse
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/createVoipRoute?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateVoipRouteSignalPathResponse> createVoipRouteSignalPathWithHttpInfo(@Param("elid") String elid, CreateVoipRouteSignalPathRequestData body, @QueryMap(encoded=true) CreateVoipRouteSignalPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createVoipRouteSignalPath</code> method in a fluent style.
   */
  public static class CreateVoipRouteSignalPathQueryParams extends HashMap<String, Object> {
    public CreateVoipRouteSignalPathQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Signal path
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSignalPathResponse deleteSignalPath(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSignalPathRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSignalPath</code> but it also returns the http response headers .
   * Delete Signal path
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSignalPathResponse> deleteSignalPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSignalPathRequestData body);


  /**
   * Delete
   * Delete Signal path
   * Note, this is equivalent to the other <code>deleteSignalPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSignalPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSignalPathResponse deleteSignalPath(@Param("elid") String elid, DeleteSignalPathRequestData body, @QueryMap(encoded=true) DeleteSignalPathQueryParams queryParams);

  /**
  * Delete
  * Delete Signal path
  * Note, this is equivalent to the other <code>deleteSignalPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSignalPathResponse
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSignalPathResponse> deleteSignalPathWithHttpInfo(@Param("elid") String elid, DeleteSignalPathRequestData body, @QueryMap(encoded=true) DeleteSignalPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSignalPath</code> method in a fluent style.
   */
  public static class DeleteSignalPathQueryParams extends HashMap<String, Object> {
    public DeleteSignalPathQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Cable master Data cable entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SignalPathCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SignalPathCableMasterDataCableResponseData signalPathCableMasterDataCable(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathCableMasterDataCableRequestData body);

  /**
   * Get relations to Cable master Data cable entities
   * Similar to <code>signalPathCableMasterDataCable</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SignalPathCableMasterDataCableResponseData> signalPathCableMasterDataCableWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathCableMasterDataCableRequestData body);


  /**
   * Get relations to Cable master Data cable entities
   * 
   * Note, this is equivalent to the other <code>signalPathCableMasterDataCable</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SignalPathCableMasterDataCableQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SignalPathCableMasterDataCableResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/CableMasterDataCable?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SignalPathCableMasterDataCableResponseData signalPathCableMasterDataCable(@Param("elid") String elid, SignalPathCableMasterDataCableRequestData body, @QueryMap(encoded=true) SignalPathCableMasterDataCableQueryParams queryParams);

  /**
  * Get relations to Cable master Data cable entities
  * 
  * Note, this is equivalent to the other <code>signalPathCableMasterDataCable</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SignalPathCableMasterDataCableResponseData
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/CableMasterDataCable?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SignalPathCableMasterDataCableResponseData> signalPathCableMasterDataCableWithHttpInfo(@Param("elid") String elid, SignalPathCableMasterDataCableRequestData body, @QueryMap(encoded=true) SignalPathCableMasterDataCableQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>signalPathCableMasterDataCable</code> method in a fluent style.
   */
  public static class SignalPathCableMasterDataCableQueryParams extends HashMap<String, Object> {
    public SignalPathCableMasterDataCableQueryParams sessionId(final String value) {
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
   * @return SignalPathContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SignalPathContractsResponseData signalPathContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>signalPathContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SignalPathContractsResponseData> signalPathContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>signalPathContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SignalPathContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SignalPathContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SignalPathContractsResponseData signalPathContracts(@Param("elid") String elid, SignalPathContractsRequestData body, @QueryMap(encoded=true) SignalPathContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>signalPathContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SignalPathContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SignalPathContractsResponseData> signalPathContractsWithHttpInfo(@Param("elid") String elid, SignalPathContractsRequestData body, @QueryMap(encoded=true) SignalPathContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>signalPathContracts</code> method in a fluent style.
   */
  public static class SignalPathContractsQueryParams extends HashMap<String, Object> {
    public SignalPathContractsQueryParams sessionId(final String value) {
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
   * @return SignalPathFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SignalPathFrameContractsResponseData signalPathFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>signalPathFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SignalPathFrameContractsResponseData> signalPathFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>signalPathFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SignalPathFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SignalPathFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SignalPathFrameContractsResponseData signalPathFrameContracts(@Param("elid") String elid, SignalPathFrameContractsRequestData body, @QueryMap(encoded=true) SignalPathFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>signalPathFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SignalPathFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SignalPathFrameContractsResponseData> signalPathFrameContractsWithHttpInfo(@Param("elid") String elid, SignalPathFrameContractsRequestData body, @QueryMap(encoded=true) SignalPathFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>signalPathFrameContracts</code> method in a fluent style.
   */
  public static class SignalPathFrameContractsQueryParams extends HashMap<String, Object> {
    public SignalPathFrameContractsQueryParams sessionId(final String value) {
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
   * @return SignalPathOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SignalPathOrganizationsResponseData signalPathOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>signalPathOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SignalPathOrganizationsResponseData> signalPathOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>signalPathOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SignalPathOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SignalPathOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SignalPathOrganizationsResponseData signalPathOrganizations(@Param("elid") String elid, SignalPathOrganizationsRequestData body, @QueryMap(encoded=true) SignalPathOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>signalPathOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SignalPathOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SignalPathOrganizationsResponseData> signalPathOrganizationsWithHttpInfo(@Param("elid") String elid, SignalPathOrganizationsRequestData body, @QueryMap(encoded=true) SignalPathOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>signalPathOrganizations</code> method in a fluent style.
   */
  public static class SignalPathOrganizationsQueryParams extends HashMap<String, Object> {
    public SignalPathOrganizationsQueryParams sessionId(final String value) {
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
   * @return SignalPathPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SignalPathPersonGroupsResponseData signalPathPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>signalPathPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SignalPathPersonGroupsResponseData> signalPathPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>signalPathPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SignalPathPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SignalPathPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SignalPathPersonGroupsResponseData signalPathPersonGroups(@Param("elid") String elid, SignalPathPersonGroupsRequestData body, @QueryMap(encoded=true) SignalPathPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>signalPathPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SignalPathPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SignalPathPersonGroupsResponseData> signalPathPersonGroupsWithHttpInfo(@Param("elid") String elid, SignalPathPersonGroupsRequestData body, @QueryMap(encoded=true) SignalPathPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>signalPathPersonGroups</code> method in a fluent style.
   */
  public static class SignalPathPersonGroupsQueryParams extends HashMap<String, Object> {
    public SignalPathPersonGroupsQueryParams sessionId(final String value) {
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
   * @return SignalPathPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SignalPathPersonsResponseData signalPathPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>signalPathPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SignalPathPersonsResponseData> signalPathPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>signalPathPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SignalPathPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SignalPathPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SignalPathPersonsResponseData signalPathPersons(@Param("elid") String elid, SignalPathPersonsRequestData body, @QueryMap(encoded=true) SignalPathPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>signalPathPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SignalPathPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SignalPathPersonsResponseData> signalPathPersonsWithHttpInfo(@Param("elid") String elid, SignalPathPersonsRequestData body, @QueryMap(encoded=true) SignalPathPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>signalPathPersons</code> method in a fluent style.
   */
  public static class SignalPathPersonsQueryParams extends HashMap<String, Object> {
    public SignalPathPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SignalPathQueryResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SignalPathQueryResponse signalPathQuery(@Param("sessionId") String sessionId, SignalPathQueryRequest body);

  /**
   * Basic query
   * Similar to <code>signalPathQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SignalPathQueryResponse> signalPathQueryWithHttpInfo(@Param("sessionId") String sessionId, SignalPathQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>signalPathQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SignalPathQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SignalPathQueryResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SignalPathQueryResponse signalPathQuery(SignalPathQueryRequest body, @QueryMap(encoded=true) SignalPathQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>signalPathQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SignalPathQueryResponse
      */
      @RequestLine("POST /api/rest/entity/signalPath/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SignalPathQueryResponse> signalPathQueryWithHttpInfo(SignalPathQueryRequest body, @QueryMap(encoded=true) SignalPathQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>signalPathQuery</code> method in a fluent style.
   */
  public static class SignalPathQueryQueryParams extends HashMap<String, Object> {
    public SignalPathQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Service (Signal Management) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SignalPathServiceSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/ServiceSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SignalPathServiceSignalmgmtResponseData signalPathServiceSignalmgmt(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathServiceSignalmgmtRequestData body);

  /**
   * Get relations to Service (Signal Management) entities
   * Similar to <code>signalPathServiceSignalmgmt</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/ServiceSignalmgmt?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SignalPathServiceSignalmgmtResponseData> signalPathServiceSignalmgmtWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathServiceSignalmgmtRequestData body);


  /**
   * Get relations to Service (Signal Management) entities
   * 
   * Note, this is equivalent to the other <code>signalPathServiceSignalmgmt</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SignalPathServiceSignalmgmtQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SignalPathServiceSignalmgmtResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/ServiceSignalmgmt?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SignalPathServiceSignalmgmtResponseData signalPathServiceSignalmgmt(@Param("elid") String elid, SignalPathServiceSignalmgmtRequestData body, @QueryMap(encoded=true) SignalPathServiceSignalmgmtQueryParams queryParams);

  /**
  * Get relations to Service (Signal Management) entities
  * 
  * Note, this is equivalent to the other <code>signalPathServiceSignalmgmt</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SignalPathServiceSignalmgmtResponseData
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/ServiceSignalmgmt?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SignalPathServiceSignalmgmtResponseData> signalPathServiceSignalmgmtWithHttpInfo(@Param("elid") String elid, SignalPathServiceSignalmgmtRequestData body, @QueryMap(encoded=true) SignalPathServiceSignalmgmtQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>signalPathServiceSignalmgmt</code> method in a fluent style.
   */
  public static class SignalPathServiceSignalmgmtQueryParams extends HashMap<String, Object> {
    public SignalPathServiceSignalmgmtQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Signal path (child) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SignalPathSignalPathsChildResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/SignalPathsChild?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SignalPathSignalPathsChildResponseData signalPathSignalPathsChild(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathSignalPathsChildRequestData body);

  /**
   * Get relations to Signal path (child) entities
   * Similar to <code>signalPathSignalPathsChild</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/SignalPathsChild?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SignalPathSignalPathsChildResponseData> signalPathSignalPathsChildWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathSignalPathsChildRequestData body);


  /**
   * Get relations to Signal path (child) entities
   * 
   * Note, this is equivalent to the other <code>signalPathSignalPathsChild</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SignalPathSignalPathsChildQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SignalPathSignalPathsChildResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/SignalPathsChild?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SignalPathSignalPathsChildResponseData signalPathSignalPathsChild(@Param("elid") String elid, SignalPathSignalPathsChildRequestData body, @QueryMap(encoded=true) SignalPathSignalPathsChildQueryParams queryParams);

  /**
  * Get relations to Signal path (child) entities
  * 
  * Note, this is equivalent to the other <code>signalPathSignalPathsChild</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SignalPathSignalPathsChildResponseData
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/SignalPathsChild?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SignalPathSignalPathsChildResponseData> signalPathSignalPathsChildWithHttpInfo(@Param("elid") String elid, SignalPathSignalPathsChildRequestData body, @QueryMap(encoded=true) SignalPathSignalPathsChildQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>signalPathSignalPathsChild</code> method in a fluent style.
   */
  public static class SignalPathSignalPathsChildQueryParams extends HashMap<String, Object> {
    public SignalPathSignalPathsChildQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Signal path (parent) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SignalPathSignalPathsParentResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/SignalPathsParent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SignalPathSignalPathsParentResponseData signalPathSignalPathsParent(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathSignalPathsParentRequestData body);

  /**
   * Get relations to Signal path (parent) entities
   * Similar to <code>signalPathSignalPathsParent</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/SignalPathsParent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SignalPathSignalPathsParentResponseData> signalPathSignalPathsParentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathSignalPathsParentRequestData body);


  /**
   * Get relations to Signal path (parent) entities
   * 
   * Note, this is equivalent to the other <code>signalPathSignalPathsParent</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SignalPathSignalPathsParentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SignalPathSignalPathsParentResponseData
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/SignalPathsParent?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SignalPathSignalPathsParentResponseData signalPathSignalPathsParent(@Param("elid") String elid, SignalPathSignalPathsParentRequestData body, @QueryMap(encoded=true) SignalPathSignalPathsParentQueryParams queryParams);

  /**
  * Get relations to Signal path (parent) entities
  * 
  * Note, this is equivalent to the other <code>signalPathSignalPathsParent</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SignalPathSignalPathsParentResponseData
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/SignalPathsParent?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SignalPathSignalPathsParentResponseData> signalPathSignalPathsParentWithHttpInfo(@Param("elid") String elid, SignalPathSignalPathsParentRequestData body, @QueryMap(encoded=true) SignalPathSignalPathsParentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>signalPathSignalPathsParent</code> method in a fluent style.
   */
  public static class SignalPathSignalPathsParentQueryParams extends HashMap<String, Object> {
    public SignalPathSignalPathsParentQueryParams sessionId(final String value) {
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
   * @return SignalPathSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SignalPathSystemAttributesResponse signalPathSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>signalPathSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SignalPathSystemAttributesResponse> signalPathSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SignalPathSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>signalPathSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SignalPathSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SignalPathSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SignalPathSystemAttributesResponse signalPathSystemAttributes(@Param("elid") String elid, SignalPathSystemAttributesRequest body, @QueryMap(encoded=true) SignalPathSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>signalPathSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SignalPathSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SignalPathSystemAttributesResponse> signalPathSystemAttributesWithHttpInfo(@Param("elid") String elid, SignalPathSystemAttributesRequest body, @QueryMap(encoded=true) SignalPathSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>signalPathSystemAttributes</code> method in a fluent style.
   */
  public static class SignalPathSystemAttributesQueryParams extends HashMap<String, Object> {
    public SignalPathSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Signal path
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSignalPathResponse updateSignalPath(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSignalPathRequestData body);

  /**
   * Modify
   * Similar to <code>updateSignalPath</code> but it also returns the http response headers .
   * Modify Signal path
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSignalPathResponse> updateSignalPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSignalPathRequestData body);


  /**
   * Modify
   * Modify Signal path
   * Note, this is equivalent to the other <code>updateSignalPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSignalPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSignalPathResponse updateSignalPath(@Param("elid") String elid, UpdateSignalPathRequestData body, @QueryMap(encoded=true) UpdateSignalPathQueryParams queryParams);

  /**
  * Modify
  * Modify Signal path
  * Note, this is equivalent to the other <code>updateSignalPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSignalPathResponse
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSignalPathResponse> updateSignalPathWithHttpInfo(@Param("elid") String elid, UpdateSignalPathRequestData body, @QueryMap(encoded=true) UpdateSignalPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSignalPath</code> method in a fluent style.
   */
  public static class UpdateSignalPathQueryParams extends HashMap<String, Object> {
    public UpdateSignalPathQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSignalPathResponse updateSystemAttributesSignalPath(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSignalPathRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSignalPath</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSignalPathResponse> updateSystemAttributesSignalPathWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSignalPathRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSignalPath</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSignalPathQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSignalPathResponse
   */
  @RequestLine("POST /api/rest/entity/signalPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSignalPathResponse updateSystemAttributesSignalPath(@Param("elid") String elid, UpdateSystemAttributesSignalPathRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSignalPathQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSignalPath</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSignalPathResponse
      */
      @RequestLine("POST /api/rest/entity/signalPath/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSignalPathResponse> updateSystemAttributesSignalPathWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSignalPathRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSignalPathQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSignalPath</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSignalPathQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSignalPathQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
