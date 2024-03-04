package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceWebRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceWebResponse;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstanceWebRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstanceWebResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebPersonsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebPersonsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebQueryRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebQueryResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebSoftwareInstallationRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebSoftwareInstallationResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWebSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstanceWebRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstanceWebResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceWebRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceWebResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface SoftwareInstanceWebApi extends ApiClient.Api {


  /**
   * Create
   * Create software instance
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSoftwareInstanceWebResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSoftwareInstanceWebResponse createSoftwareInstanceWeb(@Param("sessionId") String sessionId, CreateSoftwareInstanceWebRequestData body);

  /**
   * Create
   * Similar to <code>createSoftwareInstanceWeb</code> but it also returns the http response headers .
   * Create software instance
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSoftwareInstanceWebResponse> createSoftwareInstanceWebWithHttpInfo(@Param("sessionId") String sessionId, CreateSoftwareInstanceWebRequestData body);


  /**
   * Create
   * Create software instance
   * Note, this is equivalent to the other <code>createSoftwareInstanceWeb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSoftwareInstanceWebQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSoftwareInstanceWebResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSoftwareInstanceWebResponse createSoftwareInstanceWeb(CreateSoftwareInstanceWebRequestData body, @QueryMap(encoded=true) CreateSoftwareInstanceWebQueryParams queryParams);

  /**
  * Create
  * Create software instance
  * Note, this is equivalent to the other <code>createSoftwareInstanceWeb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSoftwareInstanceWebResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSoftwareInstanceWebResponse> createSoftwareInstanceWebWithHttpInfo(CreateSoftwareInstanceWebRequestData body, @QueryMap(encoded=true) CreateSoftwareInstanceWebQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSoftwareInstanceWeb</code> method in a fluent style.
   */
  public static class CreateSoftwareInstanceWebQueryParams extends HashMap<String, Object> {
    public CreateSoftwareInstanceWebQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSoftwareInstanceWebResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSoftwareInstanceWebResponse deleteSoftwareInstanceWeb(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstanceWebRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSoftwareInstanceWeb</code> but it also returns the http response headers .
   * Delete software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSoftwareInstanceWebResponse> deleteSoftwareInstanceWebWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstanceWebRequestData body);


  /**
   * Delete
   * Delete software instance
   * Note, this is equivalent to the other <code>deleteSoftwareInstanceWeb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSoftwareInstanceWebQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSoftwareInstanceWebResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSoftwareInstanceWebResponse deleteSoftwareInstanceWeb(@Param("elid") String elid, DeleteSoftwareInstanceWebRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstanceWebQueryParams queryParams);

  /**
  * Delete
  * Delete software instance
  * Note, this is equivalent to the other <code>deleteSoftwareInstanceWeb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSoftwareInstanceWebResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSoftwareInstanceWebResponse> deleteSoftwareInstanceWebWithHttpInfo(@Param("elid") String elid, DeleteSoftwareInstanceWebRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstanceWebQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSoftwareInstanceWeb</code> method in a fluent style.
   */
  public static class DeleteSoftwareInstanceWebQueryParams extends HashMap<String, Object> {
    public DeleteSoftwareInstanceWebQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWebContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWebContractsResponseData softwareInstanceWebContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>softwareInstanceWebContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWebContractsResponseData> softwareInstanceWebContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWebContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWebContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWebContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWebContractsResponseData softwareInstanceWebContracts(@Param("elid") String elid, SoftwareInstanceWebContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWebContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWebContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWebContractsResponseData> softwareInstanceWebContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWebContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWebContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceWebContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWebContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWebFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWebFrameContractsResponseData softwareInstanceWebFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>softwareInstanceWebFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWebFrameContractsResponseData> softwareInstanceWebFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWebFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWebFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWebFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWebFrameContractsResponseData softwareInstanceWebFrameContracts(@Param("elid") String elid, SoftwareInstanceWebFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWebFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWebFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWebFrameContractsResponseData> softwareInstanceWebFrameContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWebFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWebFrameContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceWebFrameContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWebFrameContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWebMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWebMaintenanceContractsResponseData softwareInstanceWebMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>softwareInstanceWebMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWebMaintenanceContractsResponseData> softwareInstanceWebMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWebMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWebMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWebMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWebMaintenanceContractsResponseData softwareInstanceWebMaintenanceContracts(@Param("elid") String elid, SoftwareInstanceWebMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWebMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWebMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWebMaintenanceContractsResponseData> softwareInstanceWebMaintenanceContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWebMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWebMaintenanceContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceWebMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWebMaintenanceContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Operating system installation entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstanceWebOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWebOperatingSystemInstallationResponseData softwareInstanceWebOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>softwareInstanceWebOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWebOperatingSystemInstallationResponseData> softwareInstanceWebOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWebOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWebOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWebOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWebOperatingSystemInstallationResponseData softwareInstanceWebOperatingSystemInstallation(@Param("elid") String elid, SoftwareInstanceWebOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWebOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWebOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWebOperatingSystemInstallationResponseData> softwareInstanceWebOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWebOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWebOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class SoftwareInstanceWebOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWebOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWebOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWebOrganizationsResponseData softwareInstanceWebOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>softwareInstanceWebOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWebOrganizationsResponseData> softwareInstanceWebOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWebOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWebOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWebOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWebOrganizationsResponseData softwareInstanceWebOrganizations(@Param("elid") String elid, SoftwareInstanceWebOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWebOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWebOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWebOrganizationsResponseData> softwareInstanceWebOrganizationsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWebOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWebOrganizations</code> method in a fluent style.
   */
  public static class SoftwareInstanceWebOrganizationsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWebOrganizationsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWebPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWebPersonGroupsResponseData softwareInstanceWebPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>softwareInstanceWebPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWebPersonGroupsResponseData> softwareInstanceWebPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWebPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWebPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWebPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWebPersonGroupsResponseData softwareInstanceWebPersonGroups(@Param("elid") String elid, SoftwareInstanceWebPersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWebPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWebPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWebPersonGroupsResponseData> softwareInstanceWebPersonGroupsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWebPersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWebPersonGroups</code> method in a fluent style.
   */
  public static class SoftwareInstanceWebPersonGroupsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWebPersonGroupsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWebPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWebPersonsResponseData softwareInstanceWebPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>softwareInstanceWebPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWebPersonsResponseData> softwareInstanceWebPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWebPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWebPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWebPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWebPersonsResponseData softwareInstanceWebPersons(@Param("elid") String elid, SoftwareInstanceWebPersonsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWebPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWebPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWebPersonsResponseData> softwareInstanceWebPersonsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWebPersonsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWebPersons</code> method in a fluent style.
   */
  public static class SoftwareInstanceWebPersonsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWebPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SoftwareInstanceWebQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWebQueryResponse softwareInstanceWebQuery(@Param("sessionId") String sessionId, SoftwareInstanceWebQueryRequest body);

  /**
   * Basic query
   * Similar to <code>softwareInstanceWebQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWebQueryResponse> softwareInstanceWebQueryWithHttpInfo(@Param("sessionId") String sessionId, SoftwareInstanceWebQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>softwareInstanceWebQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWebQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWebQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWebQueryResponse softwareInstanceWebQuery(SoftwareInstanceWebQueryRequest body, @QueryMap(encoded=true) SoftwareInstanceWebQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>softwareInstanceWebQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWebQueryResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWebQueryResponse> softwareInstanceWebQueryWithHttpInfo(SoftwareInstanceWebQueryRequest body, @QueryMap(encoded=true) SoftwareInstanceWebQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWebQuery</code> method in a fluent style.
   */
  public static class SoftwareInstanceWebQueryQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWebQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Software installation entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareInstanceWebSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWebSoftwareInstallationResponseData softwareInstanceWebSoftwareInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebSoftwareInstallationRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>softwareInstanceWebSoftwareInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWebSoftwareInstallationResponseData> softwareInstanceWebSoftwareInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebSoftwareInstallationRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWebSoftwareInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWebSoftwareInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWebSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWebSoftwareInstallationResponseData softwareInstanceWebSoftwareInstallation(@Param("elid") String elid, SoftwareInstanceWebSoftwareInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebSoftwareInstallationQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWebSoftwareInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWebSoftwareInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/SoftwareInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWebSoftwareInstallationResponseData> softwareInstanceWebSoftwareInstallationWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWebSoftwareInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceWebSoftwareInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWebSoftwareInstallation</code> method in a fluent style.
   */
  public static class SoftwareInstanceWebSoftwareInstallationQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWebSoftwareInstallationQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWebSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWebSystemAttributesResponse softwareInstanceWebSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>softwareInstanceWebSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWebSystemAttributesResponse> softwareInstanceWebSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWebSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>softwareInstanceWebSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWebSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWebSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWebSystemAttributesResponse softwareInstanceWebSystemAttributes(@Param("elid") String elid, SoftwareInstanceWebSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstanceWebSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>softwareInstanceWebSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWebSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWebSystemAttributesResponse> softwareInstanceWebSystemAttributesWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWebSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstanceWebSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWebSystemAttributes</code> method in a fluent style.
   */
  public static class SoftwareInstanceWebSystemAttributesQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWebSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSoftwareInstanceWebResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSoftwareInstanceWebResponse updateSoftwareInstanceWeb(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstanceWebRequestData body);

  /**
   * Modify
   * Similar to <code>updateSoftwareInstanceWeb</code> but it also returns the http response headers .
   * Modify software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSoftwareInstanceWebResponse> updateSoftwareInstanceWebWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstanceWebRequestData body);


  /**
   * Modify
   * Modify software instance
   * Note, this is equivalent to the other <code>updateSoftwareInstanceWeb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSoftwareInstanceWebQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSoftwareInstanceWebResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSoftwareInstanceWebResponse updateSoftwareInstanceWeb(@Param("elid") String elid, UpdateSoftwareInstanceWebRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstanceWebQueryParams queryParams);

  /**
  * Modify
  * Modify software instance
  * Note, this is equivalent to the other <code>updateSoftwareInstanceWeb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSoftwareInstanceWebResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSoftwareInstanceWebResponse> updateSoftwareInstanceWebWithHttpInfo(@Param("elid") String elid, UpdateSoftwareInstanceWebRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstanceWebQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSoftwareInstanceWeb</code> method in a fluent style.
   */
  public static class UpdateSoftwareInstanceWebQueryParams extends HashMap<String, Object> {
    public UpdateSoftwareInstanceWebQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSoftwareInstanceWebResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstanceWebResponse updateSystemAttributesSoftwareInstanceWeb(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceWebRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSoftwareInstanceWeb</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSoftwareInstanceWebResponse> updateSystemAttributesSoftwareInstanceWebWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceWebRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstanceWeb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSoftwareInstanceWebQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSoftwareInstanceWebResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstanceWebResponse updateSystemAttributesSoftwareInstanceWeb(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceWebRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstanceWebQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstanceWeb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSoftwareInstanceWebResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWeb/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSoftwareInstanceWebResponse> updateSystemAttributesSoftwareInstanceWebWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceWebRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstanceWebQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSoftwareInstanceWeb</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSoftwareInstanceWebQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSoftwareInstanceWebQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
