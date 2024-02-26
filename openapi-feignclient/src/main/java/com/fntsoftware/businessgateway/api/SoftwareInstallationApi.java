package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSoftwareInstallationRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstallationResponse;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstallationRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstallationResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationApplicationDeploymentsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationApplicationDeploymentsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationDeviceAllResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationPersonsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationPersonsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationQueryRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationQueryResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationServerRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationServerResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareInstancesMssqldbRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareInstancesMssqldbResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareInstancesOracledbRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareInstancesOracledbResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareInstancesRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareInstancesResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareInstancesSapRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareInstancesSapResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareInstancesWebRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareInstancesWebResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareInstancesWindowsserviceRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareInstancesWindowsserviceResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareLicensesRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareLicensesResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareProductRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSoftwareProductResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationVirtualServerRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstallationVirtualServerResponseData;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstallationRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstallationResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstallationRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstallationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface SoftwareInstallationApi extends ApiClient.Api {


  /**
   * Create
   * Creates a software. If the ID is not passed, it will be generated automatically by the system.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSoftwareInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSoftwareInstallationResponse createSoftwareInstallation(@Param("sessionId") String sessionId, CreateSoftwareInstallationRequestData body);

  /**
   * Create
   * Similar to <code>createSoftwareInstallation</code> but it also returns the http response headers .
   * Creates a software. If the ID is not passed, it will be generated automatically by the system.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSoftwareInstallationResponse> createSoftwareInstallationWithHttpInfo(@Param("sessionId") String sessionId, CreateSoftwareInstallationRequestData body);


  /**
   * Create
   * Creates a software. If the ID is not passed, it will be generated automatically by the system.
   * Note, this is equivalent to the other <code>createSoftwareInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSoftwareInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSoftwareInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSoftwareInstallationResponse createSoftwareInstallation(CreateSoftwareInstallationRequestData body, @QueryMap(encoded=true) CreateSoftwareInstallationQueryParams queryParams);

  /**
  * Create
  * Creates a software. If the ID is not passed, it will be generated automatically by the system.
  * Note, this is equivalent to the other <code>createSoftwareInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSoftwareInstallationResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSoftwareInstallationResponse> createSoftwareInstallationWithHttpInfo(CreateSoftwareInstallationRequestData body, @QueryMap(encoded=true) CreateSoftwareInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSoftwareInstallation</code> method in a fluent style.
   */
  public static class CreateSoftwareInstallationQueryParams extends HashMap<String, Object> {
    public CreateSoftwareInstallationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete software installation
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSoftwareInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSoftwareInstallationResponse deleteSoftwareInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstallationRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSoftwareInstallation</code> but it also returns the http response headers .
   * Delete software installation
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSoftwareInstallationResponse> deleteSoftwareInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstallationRequestData body);


  /**
   * Delete
   * Delete software installation
   * Note, this is equivalent to the other <code>deleteSoftwareInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSoftwareInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSoftwareInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSoftwareInstallationResponse deleteSoftwareInstallation(@Param("elid") String elid, DeleteSoftwareInstallationRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstallationQueryParams queryParams);

  /**
  * Delete
  * Delete software installation
  * Note, this is equivalent to the other <code>deleteSoftwareInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSoftwareInstallationResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSoftwareInstallationResponse> deleteSoftwareInstallationWithHttpInfo(@Param("elid") String elid, DeleteSoftwareInstallationRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSoftwareInstallation</code> method in a fluent style.
   */
  public static class DeleteSoftwareInstallationQueryParams extends HashMap<String, Object> {
    public DeleteSoftwareInstallationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Application Deployment entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstallationApplicationDeploymentsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationApplicationDeploymentsResponseData softwareInstallationApplicationDeployments(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationApplicationDeploymentsRequestData body);

  /**
   * Get relations to Application Deployment entities
   * Similar to <code>softwareInstallationApplicationDeployments</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationApplicationDeploymentsResponseData> softwareInstallationApplicationDeploymentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationApplicationDeploymentsRequestData body);


  /**
   * Get relations to Application Deployment entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationApplicationDeployments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationApplicationDeploymentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationApplicationDeploymentsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationApplicationDeploymentsResponseData softwareInstallationApplicationDeployments(@Param("elid") String elid, SoftwareInstallationApplicationDeploymentsRequestData body, @QueryMap(encoded=true) SoftwareInstallationApplicationDeploymentsQueryParams queryParams);

  /**
  * Get relations to Application Deployment entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationApplicationDeployments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationApplicationDeploymentsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/ApplicationDeployments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationApplicationDeploymentsResponseData> softwareInstallationApplicationDeploymentsWithHttpInfo(@Param("elid") String elid, SoftwareInstallationApplicationDeploymentsRequestData body, @QueryMap(encoded=true) SoftwareInstallationApplicationDeploymentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationApplicationDeployments</code> method in a fluent style.
   */
  public static class SoftwareInstallationApplicationDeploymentsQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationApplicationDeploymentsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstallationContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationContractsResponseData softwareInstallationContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>softwareInstallationContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationContractsResponseData> softwareInstallationContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationContractsResponseData softwareInstallationContracts(@Param("elid") String elid, SoftwareInstallationContractsRequestData body, @QueryMap(encoded=true) SoftwareInstallationContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationContractsResponseData> softwareInstallationContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstallationContractsRequestData body, @QueryMap(encoded=true) SoftwareInstallationContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationContracts</code> method in a fluent style.
   */
  public static class SoftwareInstallationContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device (all) entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstallationDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/DeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationDeviceAllResponseData softwareInstallationDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationDeviceAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>softwareInstallationDeviceAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/DeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationDeviceAllResponseData> softwareInstallationDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationDeviceAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/DeviceAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationDeviceAllResponseData softwareInstallationDeviceAll(@Param("elid") String elid, SoftwareInstallationDeviceAllRequestData body, @QueryMap(encoded=true) SoftwareInstallationDeviceAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationDeviceAllResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/DeviceAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationDeviceAllResponseData> softwareInstallationDeviceAllWithHttpInfo(@Param("elid") String elid, SoftwareInstallationDeviceAllRequestData body, @QueryMap(encoded=true) SoftwareInstallationDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationDeviceAll</code> method in a fluent style.
   */
  public static class SoftwareInstallationDeviceAllQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationDeviceAllQueryParams sessionId(final String value) {
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
   * @return SoftwareInstallationFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationFrameContractsResponseData softwareInstallationFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>softwareInstallationFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationFrameContractsResponseData> softwareInstallationFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationFrameContractsResponseData softwareInstallationFrameContracts(@Param("elid") String elid, SoftwareInstallationFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstallationFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationFrameContractsResponseData> softwareInstallationFrameContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstallationFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstallationFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationFrameContracts</code> method in a fluent style.
   */
  public static class SoftwareInstallationFrameContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationFrameContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstallationMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationMaintenanceContractsResponseData softwareInstallationMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>softwareInstallationMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationMaintenanceContractsResponseData> softwareInstallationMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationMaintenanceContractsResponseData softwareInstallationMaintenanceContracts(@Param("elid") String elid, SoftwareInstallationMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstallationMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationMaintenanceContractsResponseData> softwareInstallationMaintenanceContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstallationMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstallationMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationMaintenanceContracts</code> method in a fluent style.
   */
  public static class SoftwareInstallationMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstallationOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationOrganizationsResponseData softwareInstallationOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>softwareInstallationOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationOrganizationsResponseData> softwareInstallationOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationOrganizationsResponseData softwareInstallationOrganizations(@Param("elid") String elid, SoftwareInstallationOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstallationOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationOrganizationsResponseData> softwareInstallationOrganizationsWithHttpInfo(@Param("elid") String elid, SoftwareInstallationOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstallationOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationOrganizations</code> method in a fluent style.
   */
  public static class SoftwareInstallationOrganizationsQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationOrganizationsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstallationPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationPersonGroupsResponseData softwareInstallationPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>softwareInstallationPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationPersonGroupsResponseData> softwareInstallationPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationPersonGroupsResponseData softwareInstallationPersonGroups(@Param("elid") String elid, SoftwareInstallationPersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstallationPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationPersonGroupsResponseData> softwareInstallationPersonGroupsWithHttpInfo(@Param("elid") String elid, SoftwareInstallationPersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstallationPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationPersonGroups</code> method in a fluent style.
   */
  public static class SoftwareInstallationPersonGroupsQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationPersonGroupsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstallationPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationPersonsResponseData softwareInstallationPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>softwareInstallationPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationPersonsResponseData> softwareInstallationPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationPersonsResponseData softwareInstallationPersons(@Param("elid") String elid, SoftwareInstallationPersonsRequestData body, @QueryMap(encoded=true) SoftwareInstallationPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationPersonsResponseData> softwareInstallationPersonsWithHttpInfo(@Param("elid") String elid, SoftwareInstallationPersonsRequestData body, @QueryMap(encoded=true) SoftwareInstallationPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationPersons</code> method in a fluent style.
   */
  public static class SoftwareInstallationPersonsQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SoftwareInstallationQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationQueryResponse softwareInstallationQuery(@Param("sessionId") String sessionId, SoftwareInstallationQueryRequest body);

  /**
   * Basic query
   * Similar to <code>softwareInstallationQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationQueryResponse> softwareInstallationQueryWithHttpInfo(@Param("sessionId") String sessionId, SoftwareInstallationQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>softwareInstallationQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationQueryResponse softwareInstallationQuery(SoftwareInstallationQueryRequest body, @QueryMap(encoded=true) SoftwareInstallationQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>softwareInstallationQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationQueryResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationQueryResponse> softwareInstallationQueryWithHttpInfo(SoftwareInstallationQueryRequest body, @QueryMap(encoded=true) SoftwareInstallationQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationQuery</code> method in a fluent style.
   */
  public static class SoftwareInstallationQueryQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationQueryQueryParams sessionId(final String value) {
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
   * @return SoftwareInstallationServerResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationServerResponseData softwareInstallationServer(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationServerRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>softwareInstallationServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationServerResponseData> softwareInstallationServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationServerRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationServerResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Server?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationServerResponseData softwareInstallationServer(@Param("elid") String elid, SoftwareInstallationServerRequestData body, @QueryMap(encoded=true) SoftwareInstallationServerQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationServerResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/Server?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationServerResponseData> softwareInstallationServerWithHttpInfo(@Param("elid") String elid, SoftwareInstallationServerRequestData body, @QueryMap(encoded=true) SoftwareInstallationServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationServer</code> method in a fluent style.
   */
  public static class SoftwareInstallationServerQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstallationSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationSoftwareInstancesResponseData softwareInstallationSoftwareInstances(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareInstancesRequestData body);

  /**
   * Get relations to Software instance entities
   * Similar to <code>softwareInstallationSoftwareInstances</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationSoftwareInstancesResponseData> softwareInstallationSoftwareInstancesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareInstancesRequestData body);


  /**
   * Get relations to Software instance entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationSoftwareInstances</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationSoftwareInstancesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationSoftwareInstancesResponseData softwareInstallationSoftwareInstances(@Param("elid") String elid, SoftwareInstallationSoftwareInstancesRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareInstancesQueryParams queryParams);

  /**
  * Get relations to Software instance entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationSoftwareInstances</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationSoftwareInstancesResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstances?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationSoftwareInstancesResponseData> softwareInstallationSoftwareInstancesWithHttpInfo(@Param("elid") String elid, SoftwareInstallationSoftwareInstancesRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareInstancesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationSoftwareInstances</code> method in a fluent style.
   */
  public static class SoftwareInstallationSoftwareInstancesQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationSoftwareInstancesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance MS SQL DB entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstallationSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationSoftwareInstancesMssqldbResponseData softwareInstallationSoftwareInstancesMssqldb(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareInstancesMssqldbRequestData body);

  /**
   * Get relations to Software instance MS SQL DB entities
   * Similar to <code>softwareInstallationSoftwareInstancesMssqldb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationSoftwareInstancesMssqldbResponseData> softwareInstallationSoftwareInstancesMssqldbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareInstancesMssqldbRequestData body);


  /**
   * Get relations to Software instance MS SQL DB entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationSoftwareInstancesMssqldb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationSoftwareInstancesMssqldbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationSoftwareInstancesMssqldbResponseData softwareInstallationSoftwareInstancesMssqldb(@Param("elid") String elid, SoftwareInstallationSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareInstancesMssqldbQueryParams queryParams);

  /**
  * Get relations to Software instance MS SQL DB entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationSoftwareInstancesMssqldb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationSoftwareInstancesMssqldbResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationSoftwareInstancesMssqldbResponseData> softwareInstallationSoftwareInstancesMssqldbWithHttpInfo(@Param("elid") String elid, SoftwareInstallationSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareInstancesMssqldbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationSoftwareInstancesMssqldb</code> method in a fluent style.
   */
  public static class SoftwareInstallationSoftwareInstancesMssqldbQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationSoftwareInstancesMssqldbQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance Oracle DB entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstallationSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationSoftwareInstancesOracledbResponseData softwareInstallationSoftwareInstancesOracledb(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareInstancesOracledbRequestData body);

  /**
   * Get relations to Software instance Oracle DB entities
   * Similar to <code>softwareInstallationSoftwareInstancesOracledb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationSoftwareInstancesOracledbResponseData> softwareInstallationSoftwareInstancesOracledbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareInstancesOracledbRequestData body);


  /**
   * Get relations to Software instance Oracle DB entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationSoftwareInstancesOracledb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationSoftwareInstancesOracledbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationSoftwareInstancesOracledbResponseData softwareInstallationSoftwareInstancesOracledb(@Param("elid") String elid, SoftwareInstallationSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareInstancesOracledbQueryParams queryParams);

  /**
  * Get relations to Software instance Oracle DB entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationSoftwareInstancesOracledb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationSoftwareInstancesOracledbResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationSoftwareInstancesOracledbResponseData> softwareInstallationSoftwareInstancesOracledbWithHttpInfo(@Param("elid") String elid, SoftwareInstallationSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareInstancesOracledbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationSoftwareInstancesOracledb</code> method in a fluent style.
   */
  public static class SoftwareInstallationSoftwareInstancesOracledbQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationSoftwareInstancesOracledbQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance SAP entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstallationSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationSoftwareInstancesSapResponseData softwareInstallationSoftwareInstancesSap(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareInstancesSapRequestData body);

  /**
   * Get relations to Software instance SAP entities
   * Similar to <code>softwareInstallationSoftwareInstancesSap</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationSoftwareInstancesSapResponseData> softwareInstallationSoftwareInstancesSapWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareInstancesSapRequestData body);


  /**
   * Get relations to Software instance SAP entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationSoftwareInstancesSap</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationSoftwareInstancesSapQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationSoftwareInstancesSapResponseData softwareInstallationSoftwareInstancesSap(@Param("elid") String elid, SoftwareInstallationSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareInstancesSapQueryParams queryParams);

  /**
  * Get relations to Software instance SAP entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationSoftwareInstancesSap</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationSoftwareInstancesSapResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationSoftwareInstancesSapResponseData> softwareInstallationSoftwareInstancesSapWithHttpInfo(@Param("elid") String elid, SoftwareInstallationSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareInstancesSapQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationSoftwareInstancesSap</code> method in a fluent style.
   */
  public static class SoftwareInstallationSoftwareInstancesSapQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationSoftwareInstancesSapQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance Web entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstallationSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationSoftwareInstancesWebResponseData softwareInstallationSoftwareInstancesWeb(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareInstancesWebRequestData body);

  /**
   * Get relations to Software instance Web entities
   * Similar to <code>softwareInstallationSoftwareInstancesWeb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationSoftwareInstancesWebResponseData> softwareInstallationSoftwareInstancesWebWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareInstancesWebRequestData body);


  /**
   * Get relations to Software instance Web entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationSoftwareInstancesWeb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationSoftwareInstancesWebQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationSoftwareInstancesWebResponseData softwareInstallationSoftwareInstancesWeb(@Param("elid") String elid, SoftwareInstallationSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareInstancesWebQueryParams queryParams);

  /**
  * Get relations to Software instance Web entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationSoftwareInstancesWeb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationSoftwareInstancesWebResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationSoftwareInstancesWebResponseData> softwareInstallationSoftwareInstancesWebWithHttpInfo(@Param("elid") String elid, SoftwareInstallationSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareInstancesWebQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationSoftwareInstancesWeb</code> method in a fluent style.
   */
  public static class SoftwareInstallationSoftwareInstancesWebQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationSoftwareInstancesWebQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software instance Windows service entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstallationSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationSoftwareInstancesWindowsserviceResponseData softwareInstallationSoftwareInstancesWindowsservice(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareInstancesWindowsserviceRequestData body);

  /**
   * Get relations to Software instance Windows service entities
   * Similar to <code>softwareInstallationSoftwareInstancesWindowsservice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationSoftwareInstancesWindowsserviceResponseData> softwareInstallationSoftwareInstancesWindowsserviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareInstancesWindowsserviceRequestData body);


  /**
   * Get relations to Software instance Windows service entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationSoftwareInstancesWindowsservice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationSoftwareInstancesWindowsserviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationSoftwareInstancesWindowsserviceResponseData softwareInstallationSoftwareInstancesWindowsservice(@Param("elid") String elid, SoftwareInstallationSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareInstancesWindowsserviceQueryParams queryParams);

  /**
  * Get relations to Software instance Windows service entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationSoftwareInstancesWindowsservice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationSoftwareInstancesWindowsserviceResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationSoftwareInstancesWindowsserviceResponseData> softwareInstallationSoftwareInstancesWindowsserviceWithHttpInfo(@Param("elid") String elid, SoftwareInstallationSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareInstancesWindowsserviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationSoftwareInstancesWindowsservice</code> method in a fluent style.
   */
  public static class SoftwareInstallationSoftwareInstancesWindowsserviceQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationSoftwareInstancesWindowsserviceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software license entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstallationSoftwareLicensesResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationSoftwareLicensesResponseData softwareInstallationSoftwareLicenses(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareLicensesRequestData body);

  /**
   * Get relations to Software license entities
   * Similar to <code>softwareInstallationSoftwareLicenses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationSoftwareLicensesResponseData> softwareInstallationSoftwareLicensesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareLicensesRequestData body);


  /**
   * Get relations to Software license entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationSoftwareLicenses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationSoftwareLicensesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationSoftwareLicensesResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationSoftwareLicensesResponseData softwareInstallationSoftwareLicenses(@Param("elid") String elid, SoftwareInstallationSoftwareLicensesRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareLicensesQueryParams queryParams);

  /**
  * Get relations to Software license entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationSoftwareLicenses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationSoftwareLicensesResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareLicenses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationSoftwareLicensesResponseData> softwareInstallationSoftwareLicensesWithHttpInfo(@Param("elid") String elid, SoftwareInstallationSoftwareLicensesRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareLicensesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationSoftwareLicenses</code> method in a fluent style.
   */
  public static class SoftwareInstallationSoftwareLicensesQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationSoftwareLicensesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software product entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstallationSoftwareProductResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationSoftwareProductResponseData softwareInstallationSoftwareProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareProductRequestData body);

  /**
   * Get relations to Software product entities
   * Similar to <code>softwareInstallationSoftwareProduct</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationSoftwareProductResponseData> softwareInstallationSoftwareProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSoftwareProductRequestData body);


  /**
   * Get relations to Software product entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationSoftwareProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationSoftwareProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationSoftwareProductResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationSoftwareProductResponseData softwareInstallationSoftwareProduct(@Param("elid") String elid, SoftwareInstallationSoftwareProductRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareProductQueryParams queryParams);

  /**
  * Get relations to Software product entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationSoftwareProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationSoftwareProductResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SoftwareProduct?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationSoftwareProductResponseData> softwareInstallationSoftwareProductWithHttpInfo(@Param("elid") String elid, SoftwareInstallationSoftwareProductRequestData body, @QueryMap(encoded=true) SoftwareInstallationSoftwareProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationSoftwareProduct</code> method in a fluent style.
   */
  public static class SoftwareInstallationSoftwareProductQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationSoftwareProductQueryParams sessionId(final String value) {
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
   * @return SoftwareInstallationSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationSystemAttributesResponse softwareInstallationSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>softwareInstallationSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationSystemAttributesResponse> softwareInstallationSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>softwareInstallationSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationSystemAttributesResponse softwareInstallationSystemAttributes(@Param("elid") String elid, SoftwareInstallationSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstallationSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>softwareInstallationSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationSystemAttributesResponse> softwareInstallationSystemAttributesWithHttpInfo(@Param("elid") String elid, SoftwareInstallationSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstallationSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationSystemAttributes</code> method in a fluent style.
   */
  public static class SoftwareInstallationSystemAttributesQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Virtual server entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstallationVirtualServerResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstallationVirtualServerResponseData softwareInstallationVirtualServer(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationVirtualServerRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>softwareInstallationVirtualServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstallationVirtualServerResponseData> softwareInstallationVirtualServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstallationVirtualServerRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>softwareInstallationVirtualServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstallationVirtualServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstallationVirtualServerResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstallationVirtualServerResponseData softwareInstallationVirtualServer(@Param("elid") String elid, SoftwareInstallationVirtualServerRequestData body, @QueryMap(encoded=true) SoftwareInstallationVirtualServerQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>softwareInstallationVirtualServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstallationVirtualServerResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/VirtualServer?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstallationVirtualServerResponseData> softwareInstallationVirtualServerWithHttpInfo(@Param("elid") String elid, SoftwareInstallationVirtualServerRequestData body, @QueryMap(encoded=true) SoftwareInstallationVirtualServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstallationVirtualServer</code> method in a fluent style.
   */
  public static class SoftwareInstallationVirtualServerQueryParams extends HashMap<String, Object> {
    public SoftwareInstallationVirtualServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify software installation
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSoftwareInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSoftwareInstallationResponse updateSoftwareInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstallationRequestData body);

  /**
   * Modify
   * Similar to <code>updateSoftwareInstallation</code> but it also returns the http response headers .
   * Modify software installation
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSoftwareInstallationResponse> updateSoftwareInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstallationRequestData body);


  /**
   * Modify
   * Modify software installation
   * Note, this is equivalent to the other <code>updateSoftwareInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSoftwareInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSoftwareInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSoftwareInstallationResponse updateSoftwareInstallation(@Param("elid") String elid, UpdateSoftwareInstallationRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstallationQueryParams queryParams);

  /**
  * Modify
  * Modify software installation
  * Note, this is equivalent to the other <code>updateSoftwareInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSoftwareInstallationResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSoftwareInstallationResponse> updateSoftwareInstallationWithHttpInfo(@Param("elid") String elid, UpdateSoftwareInstallationRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSoftwareInstallation</code> method in a fluent style.
   */
  public static class UpdateSoftwareInstallationQueryParams extends HashMap<String, Object> {
    public UpdateSoftwareInstallationQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSoftwareInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstallationResponse updateSystemAttributesSoftwareInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstallationRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSoftwareInstallation</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSoftwareInstallationResponse> updateSystemAttributesSoftwareInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstallationRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSoftwareInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSoftwareInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstallationResponse updateSystemAttributesSoftwareInstallation(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstallationRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstallationQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSoftwareInstallationResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstallation/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSoftwareInstallationResponse> updateSystemAttributesSoftwareInstallationWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstallationRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSoftwareInstallation</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSoftwareInstallationQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSoftwareInstallationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
