package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.CreateOperatingSystemInstallationResponse;
import com.fntsoftware.businessgateway.entities.DeleteOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.DeleteOperatingSystemInstallationResponse;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationApplicationDeploymentsRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationApplicationDeploymentsResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationContractsRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationContractsResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationDeviceAllRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationDeviceAllResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationHypervisorRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationHypervisorResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationPersonsRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationPersonsResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationQueryRequest;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationQueryResponse;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareInstancesMssqldbRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareInstancesMssqldbResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareInstancesOracledbRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareInstancesOracledbResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareInstancesRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareInstancesResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareInstancesSapRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareInstancesSapResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareInstancesWebRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareInstancesWebResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareInstancesWindowsserviceRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareInstancesWindowsserviceResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareLicensesRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareLicensesResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareProductRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSoftwareProductResponseData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationVirtualServerRequestData;
import com.fntsoftware.businessgateway.entities.OperatingSystemInstallationVirtualServerResponseData;
import com.fntsoftware.businessgateway.entities.UpdateOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.UpdateOperatingSystemInstallationResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesOperatingSystemInstallationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface OperatingSystemInstallationApi extends ApiClient.Api {


  /**
   * Create
   * Creates a software. If the ID is not passed, it will be generated automatically by the system.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateOperatingSystemInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateOperatingSystemInstallationResponse createOperatingSystemInstallation(@Param("sessionId") String sessionId, CreateOperatingSystemInstallationRequestData body);

  /**
   * Create
   * Similar to <code>createOperatingSystemInstallation</code> but it also returns the http response headers .
   * Creates a software. If the ID is not passed, it will be generated automatically by the system.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateOperatingSystemInstallationResponse> createOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, CreateOperatingSystemInstallationRequestData body);


  /**
   * Create
   * Creates a software. If the ID is not passed, it will be generated automatically by the system.
   * Note, this is equivalent to the other <code>createOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateOperatingSystemInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateOperatingSystemInstallationResponse createOperatingSystemInstallation(CreateOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) CreateOperatingSystemInstallationQueryParams queryParams);

  /**
  * Create
  * Creates a software. If the ID is not passed, it will be generated automatically by the system.
  * Note, this is equivalent to the other <code>createOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateOperatingSystemInstallationResponse
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateOperatingSystemInstallationResponse> createOperatingSystemInstallationWithHttpInfo(CreateOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) CreateOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class CreateOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public CreateOperatingSystemInstallationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete operating system installation
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteOperatingSystemInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteOperatingSystemInstallationResponse deleteOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteOperatingSystemInstallationRequestData body);

  /**
   * Delete
   * Similar to <code>deleteOperatingSystemInstallation</code> but it also returns the http response headers .
   * Delete operating system installation
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteOperatingSystemInstallationResponse> deleteOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteOperatingSystemInstallationRequestData body);


  /**
   * Delete
   * Delete operating system installation
   * Note, this is equivalent to the other <code>deleteOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteOperatingSystemInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteOperatingSystemInstallationResponse deleteOperatingSystemInstallation(@Param("elid") String elid, DeleteOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) DeleteOperatingSystemInstallationQueryParams queryParams);

  /**
  * Delete
  * Delete operating system installation
  * Note, this is equivalent to the other <code>deleteOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteOperatingSystemInstallationResponse
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteOperatingSystemInstallationResponse> deleteOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, DeleteOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) DeleteOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class DeleteOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public DeleteOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationApplicationDeploymentsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationApplicationDeploymentsResponseData operatingSystemInstallationApplicationDeployments(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationApplicationDeploymentsRequestData body);

  /**
   * Get relations to Application Deployment entities
   * Similar to <code>operatingSystemInstallationApplicationDeployments</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationApplicationDeploymentsResponseData> operatingSystemInstallationApplicationDeploymentsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationApplicationDeploymentsRequestData body);


  /**
   * Get relations to Application Deployment entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationApplicationDeployments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationApplicationDeploymentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationApplicationDeploymentsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/ApplicationDeployments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationApplicationDeploymentsResponseData operatingSystemInstallationApplicationDeployments(@Param("elid") String elid, OperatingSystemInstallationApplicationDeploymentsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationApplicationDeploymentsQueryParams queryParams);

  /**
  * Get relations to Application Deployment entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationApplicationDeployments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationApplicationDeploymentsResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/ApplicationDeployments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationApplicationDeploymentsResponseData> operatingSystemInstallationApplicationDeploymentsWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationApplicationDeploymentsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationApplicationDeploymentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationApplicationDeployments</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationApplicationDeploymentsQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationApplicationDeploymentsQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationContractsResponseData operatingSystemInstallationContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>operatingSystemInstallationContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationContractsResponseData> operatingSystemInstallationContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationContractsResponseData operatingSystemInstallationContracts(@Param("elid") String elid, OperatingSystemInstallationContractsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationContractsResponseData> operatingSystemInstallationContractsWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationContractsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationContracts</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationContractsQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationContractsQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/DeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationDeviceAllResponseData operatingSystemInstallationDeviceAll(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationDeviceAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>operatingSystemInstallationDeviceAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/DeviceAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationDeviceAllResponseData> operatingSystemInstallationDeviceAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationDeviceAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationDeviceAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationDeviceAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationDeviceAllResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/DeviceAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationDeviceAllResponseData operatingSystemInstallationDeviceAll(@Param("elid") String elid, OperatingSystemInstallationDeviceAllRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationDeviceAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationDeviceAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationDeviceAllResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/DeviceAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationDeviceAllResponseData> operatingSystemInstallationDeviceAllWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationDeviceAllRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationDeviceAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationDeviceAll</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationDeviceAllQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationDeviceAllQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationFrameContractsResponseData operatingSystemInstallationFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>operatingSystemInstallationFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationFrameContractsResponseData> operatingSystemInstallationFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationFrameContractsResponseData operatingSystemInstallationFrameContracts(@Param("elid") String elid, OperatingSystemInstallationFrameContractsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationFrameContractsResponseData> operatingSystemInstallationFrameContractsWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationFrameContractsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationFrameContracts</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationFrameContractsQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Hypervisor entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return OperatingSystemInstallationHypervisorResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Hypervisor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationHypervisorResponseData operatingSystemInstallationHypervisor(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationHypervisorRequestData body);

  /**
   * Get relations to Hypervisor entities
   * Similar to <code>operatingSystemInstallationHypervisor</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Hypervisor?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationHypervisorResponseData> operatingSystemInstallationHypervisorWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationHypervisorRequestData body);


  /**
   * Get relations to Hypervisor entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationHypervisor</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationHypervisorQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationHypervisorResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Hypervisor?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationHypervisorResponseData operatingSystemInstallationHypervisor(@Param("elid") String elid, OperatingSystemInstallationHypervisorRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationHypervisorQueryParams queryParams);

  /**
  * Get relations to Hypervisor entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationHypervisor</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationHypervisorResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Hypervisor?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationHypervisorResponseData> operatingSystemInstallationHypervisorWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationHypervisorRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationHypervisorQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationHypervisor</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationHypervisorQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationHypervisorQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationMaintenanceContractsResponseData operatingSystemInstallationMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>operatingSystemInstallationMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationMaintenanceContractsResponseData> operatingSystemInstallationMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationMaintenanceContractsResponseData operatingSystemInstallationMaintenanceContracts(@Param("elid") String elid, OperatingSystemInstallationMaintenanceContractsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationMaintenanceContractsResponseData> operatingSystemInstallationMaintenanceContractsWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationMaintenanceContractsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationMaintenanceContracts</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationOrganizationsResponseData operatingSystemInstallationOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>operatingSystemInstallationOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationOrganizationsResponseData> operatingSystemInstallationOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationOrganizationsResponseData operatingSystemInstallationOrganizations(@Param("elid") String elid, OperatingSystemInstallationOrganizationsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationOrganizationsResponseData> operatingSystemInstallationOrganizationsWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationOrganizationsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationOrganizations</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationOrganizationsQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationOrganizationsQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationPersonGroupsResponseData operatingSystemInstallationPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>operatingSystemInstallationPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationPersonGroupsResponseData> operatingSystemInstallationPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationPersonGroupsResponseData operatingSystemInstallationPersonGroups(@Param("elid") String elid, OperatingSystemInstallationPersonGroupsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationPersonGroupsResponseData> operatingSystemInstallationPersonGroupsWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationPersonGroupsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationPersonGroups</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationPersonGroupsQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationPersonGroupsQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationPersonsResponseData operatingSystemInstallationPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>operatingSystemInstallationPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationPersonsResponseData> operatingSystemInstallationPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationPersonsResponseData operatingSystemInstallationPersons(@Param("elid") String elid, OperatingSystemInstallationPersonsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationPersonsResponseData> operatingSystemInstallationPersonsWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationPersonsRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationPersons</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationPersonsQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return OperatingSystemInstallationQueryResponse
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationQueryResponse operatingSystemInstallationQuery(@Param("sessionId") String sessionId, OperatingSystemInstallationQueryRequest body);

  /**
   * Basic query
   * Similar to <code>operatingSystemInstallationQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationQueryResponse> operatingSystemInstallationQueryWithHttpInfo(@Param("sessionId") String sessionId, OperatingSystemInstallationQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>operatingSystemInstallationQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationQueryResponse
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationQueryResponse operatingSystemInstallationQuery(OperatingSystemInstallationQueryRequest body, @QueryMap(encoded=true) OperatingSystemInstallationQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>operatingSystemInstallationQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationQueryResponse
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationQueryResponse> operatingSystemInstallationQueryWithHttpInfo(OperatingSystemInstallationQueryRequest body, @QueryMap(encoded=true) OperatingSystemInstallationQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationQuery</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationQueryQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationQueryQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareInstancesResponseData operatingSystemInstallationSoftwareInstances(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesRequestData body);

  /**
   * Get relations to Software instance entities
   * Similar to <code>operatingSystemInstallationSoftwareInstances</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationSoftwareInstancesResponseData> operatingSystemInstallationSoftwareInstancesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesRequestData body);


  /**
   * Get relations to Software instance entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareInstances</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationSoftwareInstancesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationSoftwareInstancesResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstances?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareInstancesResponseData operatingSystemInstallationSoftwareInstances(@Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareInstancesQueryParams queryParams);

  /**
  * Get relations to Software instance entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareInstances</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationSoftwareInstancesResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstances?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationSoftwareInstancesResponseData> operatingSystemInstallationSoftwareInstancesWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareInstancesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationSoftwareInstances</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationSoftwareInstancesQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationSoftwareInstancesQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareInstancesMssqldbResponseData operatingSystemInstallationSoftwareInstancesMssqldb(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesMssqldbRequestData body);

  /**
   * Get relations to Software instance MS SQL DB entities
   * Similar to <code>operatingSystemInstallationSoftwareInstancesMssqldb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationSoftwareInstancesMssqldbResponseData> operatingSystemInstallationSoftwareInstancesMssqldbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesMssqldbRequestData body);


  /**
   * Get relations to Software instance MS SQL DB entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareInstancesMssqldb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationSoftwareInstancesMssqldbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationSoftwareInstancesMssqldbResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareInstancesMssqldbResponseData operatingSystemInstallationSoftwareInstancesMssqldb(@Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareInstancesMssqldbQueryParams queryParams);

  /**
  * Get relations to Software instance MS SQL DB entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareInstancesMssqldb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationSoftwareInstancesMssqldbResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesMssqldb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationSoftwareInstancesMssqldbResponseData> operatingSystemInstallationSoftwareInstancesMssqldbWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesMssqldbRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareInstancesMssqldbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationSoftwareInstancesMssqldb</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationSoftwareInstancesMssqldbQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationSoftwareInstancesMssqldbQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareInstancesOracledbResponseData operatingSystemInstallationSoftwareInstancesOracledb(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesOracledbRequestData body);

  /**
   * Get relations to Software instance Oracle DB entities
   * Similar to <code>operatingSystemInstallationSoftwareInstancesOracledb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationSoftwareInstancesOracledbResponseData> operatingSystemInstallationSoftwareInstancesOracledbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesOracledbRequestData body);


  /**
   * Get relations to Software instance Oracle DB entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareInstancesOracledb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationSoftwareInstancesOracledbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationSoftwareInstancesOracledbResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareInstancesOracledbResponseData operatingSystemInstallationSoftwareInstancesOracledb(@Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareInstancesOracledbQueryParams queryParams);

  /**
  * Get relations to Software instance Oracle DB entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareInstancesOracledb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationSoftwareInstancesOracledbResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesOracledb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationSoftwareInstancesOracledbResponseData> operatingSystemInstallationSoftwareInstancesOracledbWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesOracledbRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareInstancesOracledbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationSoftwareInstancesOracledb</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationSoftwareInstancesOracledbQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationSoftwareInstancesOracledbQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareInstancesSapResponseData operatingSystemInstallationSoftwareInstancesSap(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesSapRequestData body);

  /**
   * Get relations to Software instance SAP entities
   * Similar to <code>operatingSystemInstallationSoftwareInstancesSap</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationSoftwareInstancesSapResponseData> operatingSystemInstallationSoftwareInstancesSapWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesSapRequestData body);


  /**
   * Get relations to Software instance SAP entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareInstancesSap</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationSoftwareInstancesSapQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationSoftwareInstancesSapResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareInstancesSapResponseData operatingSystemInstallationSoftwareInstancesSap(@Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareInstancesSapQueryParams queryParams);

  /**
  * Get relations to Software instance SAP entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareInstancesSap</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationSoftwareInstancesSapResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesSap?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationSoftwareInstancesSapResponseData> operatingSystemInstallationSoftwareInstancesSapWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesSapRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareInstancesSapQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationSoftwareInstancesSap</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationSoftwareInstancesSapQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationSoftwareInstancesSapQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareInstancesWebResponseData operatingSystemInstallationSoftwareInstancesWeb(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesWebRequestData body);

  /**
   * Get relations to Software instance Web entities
   * Similar to <code>operatingSystemInstallationSoftwareInstancesWeb</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationSoftwareInstancesWebResponseData> operatingSystemInstallationSoftwareInstancesWebWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesWebRequestData body);


  /**
   * Get relations to Software instance Web entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareInstancesWeb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationSoftwareInstancesWebQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationSoftwareInstancesWebResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareInstancesWebResponseData operatingSystemInstallationSoftwareInstancesWeb(@Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareInstancesWebQueryParams queryParams);

  /**
  * Get relations to Software instance Web entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareInstancesWeb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationSoftwareInstancesWebResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesWeb?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationSoftwareInstancesWebResponseData> operatingSystemInstallationSoftwareInstancesWebWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesWebRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareInstancesWebQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationSoftwareInstancesWeb</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationSoftwareInstancesWebQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationSoftwareInstancesWebQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareInstancesWindowsserviceResponseData operatingSystemInstallationSoftwareInstancesWindowsservice(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesWindowsserviceRequestData body);

  /**
   * Get relations to Software instance Windows service entities
   * Similar to <code>operatingSystemInstallationSoftwareInstancesWindowsservice</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationSoftwareInstancesWindowsserviceResponseData> operatingSystemInstallationSoftwareInstancesWindowsserviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesWindowsserviceRequestData body);


  /**
   * Get relations to Software instance Windows service entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareInstancesWindowsservice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationSoftwareInstancesWindowsserviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationSoftwareInstancesWindowsserviceResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareInstancesWindowsserviceResponseData operatingSystemInstallationSoftwareInstancesWindowsservice(@Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareInstancesWindowsserviceQueryParams queryParams);

  /**
  * Get relations to Software instance Windows service entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareInstancesWindowsservice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationSoftwareInstancesWindowsserviceResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareInstancesWindowsservice?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationSoftwareInstancesWindowsserviceResponseData> operatingSystemInstallationSoftwareInstancesWindowsserviceWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationSoftwareInstancesWindowsserviceRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareInstancesWindowsserviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationSoftwareInstancesWindowsservice</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationSoftwareInstancesWindowsserviceQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationSoftwareInstancesWindowsserviceQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationSoftwareLicensesResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareLicensesResponseData operatingSystemInstallationSoftwareLicenses(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareLicensesRequestData body);

  /**
   * Get relations to Software license entities
   * Similar to <code>operatingSystemInstallationSoftwareLicenses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationSoftwareLicensesResponseData> operatingSystemInstallationSoftwareLicensesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareLicensesRequestData body);


  /**
   * Get relations to Software license entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareLicenses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationSoftwareLicensesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationSoftwareLicensesResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareLicensesResponseData operatingSystemInstallationSoftwareLicenses(@Param("elid") String elid, OperatingSystemInstallationSoftwareLicensesRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareLicensesQueryParams queryParams);

  /**
  * Get relations to Software license entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareLicenses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationSoftwareLicensesResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareLicenses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationSoftwareLicensesResponseData> operatingSystemInstallationSoftwareLicensesWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationSoftwareLicensesRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareLicensesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationSoftwareLicenses</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationSoftwareLicensesQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationSoftwareLicensesQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationSoftwareProductResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareProductResponseData operatingSystemInstallationSoftwareProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareProductRequestData body);

  /**
   * Get relations to Software product entities
   * Similar to <code>operatingSystemInstallationSoftwareProduct</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationSoftwareProductResponseData> operatingSystemInstallationSoftwareProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSoftwareProductRequestData body);


  /**
   * Get relations to Software product entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationSoftwareProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationSoftwareProductResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationSoftwareProductResponseData operatingSystemInstallationSoftwareProduct(@Param("elid") String elid, OperatingSystemInstallationSoftwareProductRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareProductQueryParams queryParams);

  /**
  * Get relations to Software product entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationSoftwareProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationSoftwareProductResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SoftwareProduct?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationSoftwareProductResponseData> operatingSystemInstallationSoftwareProductWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationSoftwareProductRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationSoftwareProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationSoftwareProduct</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationSoftwareProductQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationSoftwareProductQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationSystemAttributesResponse operatingSystemInstallationSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>operatingSystemInstallationSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationSystemAttributesResponse> operatingSystemInstallationSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>operatingSystemInstallationSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationSystemAttributesResponse operatingSystemInstallationSystemAttributes(@Param("elid") String elid, OperatingSystemInstallationSystemAttributesRequest body, @QueryMap(encoded=true) OperatingSystemInstallationSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>operatingSystemInstallationSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationSystemAttributesResponse> operatingSystemInstallationSystemAttributesWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationSystemAttributesRequest body, @QueryMap(encoded=true) OperatingSystemInstallationSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationSystemAttributes</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationSystemAttributesQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationSystemAttributesQueryParams sessionId(final String value) {
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
   * @return OperatingSystemInstallationVirtualServerResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  OperatingSystemInstallationVirtualServerResponseData operatingSystemInstallationVirtualServer(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationVirtualServerRequestData body);

  /**
   * Get relations to Virtual server entities
   * Similar to <code>operatingSystemInstallationVirtualServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<OperatingSystemInstallationVirtualServerResponseData> operatingSystemInstallationVirtualServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, OperatingSystemInstallationVirtualServerRequestData body);


  /**
   * Get relations to Virtual server entities
   * 
   * Note, this is equivalent to the other <code>operatingSystemInstallationVirtualServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link OperatingSystemInstallationVirtualServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return OperatingSystemInstallationVirtualServerResponseData
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/VirtualServer?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  OperatingSystemInstallationVirtualServerResponseData operatingSystemInstallationVirtualServer(@Param("elid") String elid, OperatingSystemInstallationVirtualServerRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationVirtualServerQueryParams queryParams);

  /**
  * Get relations to Virtual server entities
  * 
  * Note, this is equivalent to the other <code>operatingSystemInstallationVirtualServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return OperatingSystemInstallationVirtualServerResponseData
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/VirtualServer?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<OperatingSystemInstallationVirtualServerResponseData> operatingSystemInstallationVirtualServerWithHttpInfo(@Param("elid") String elid, OperatingSystemInstallationVirtualServerRequestData body, @QueryMap(encoded=true) OperatingSystemInstallationVirtualServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>operatingSystemInstallationVirtualServer</code> method in a fluent style.
   */
  public static class OperatingSystemInstallationVirtualServerQueryParams extends HashMap<String, Object> {
    public OperatingSystemInstallationVirtualServerQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify operating system installation
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateOperatingSystemInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateOperatingSystemInstallationResponse updateOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateOperatingSystemInstallationRequestData body);

  /**
   * Modify
   * Similar to <code>updateOperatingSystemInstallation</code> but it also returns the http response headers .
   * Modify operating system installation
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateOperatingSystemInstallationResponse> updateOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateOperatingSystemInstallationRequestData body);


  /**
   * Modify
   * Modify operating system installation
   * Note, this is equivalent to the other <code>updateOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateOperatingSystemInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateOperatingSystemInstallationResponse updateOperatingSystemInstallation(@Param("elid") String elid, UpdateOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) UpdateOperatingSystemInstallationQueryParams queryParams);

  /**
  * Modify
  * Modify operating system installation
  * Note, this is equivalent to the other <code>updateOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateOperatingSystemInstallationResponse
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateOperatingSystemInstallationResponse> updateOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, UpdateOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) UpdateOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class UpdateOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public UpdateOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesOperatingSystemInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesOperatingSystemInstallationResponse updateSystemAttributesOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesOperatingSystemInstallationRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesOperatingSystemInstallation</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesOperatingSystemInstallationResponse> updateSystemAttributesOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesOperatingSystemInstallationRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesOperatingSystemInstallationResponse
   */
  @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesOperatingSystemInstallationResponse updateSystemAttributesOperatingSystemInstallation(@Param("elid") String elid, UpdateSystemAttributesOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesOperatingSystemInstallationQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesOperatingSystemInstallationResponse
      */
      @RequestLine("POST /api/rest/entity/operatingSystemInstallation/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesOperatingSystemInstallationResponse> updateSystemAttributesOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesOperatingSystemInstallationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
