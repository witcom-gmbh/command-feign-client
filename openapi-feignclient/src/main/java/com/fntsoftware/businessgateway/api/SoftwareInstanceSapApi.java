package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceSapRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceSapResponse;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstanceSapRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstanceSapResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapPersonsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapPersonsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapQueryRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapQueryResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapSoftwareInstallationRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapSoftwareInstallationResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceSapSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstanceSapRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstanceSapResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceSapRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceSapResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface SoftwareInstanceSapApi extends ApiClient.Api {


  /**
   * Create
   * Create software instance
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSoftwareInstanceSapResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSoftwareInstanceSapResponse createSoftwareInstanceSap(@Param("sessionId") String sessionId, CreateSoftwareInstanceSapRequestData body);

  /**
   * Create
   * Similar to <code>createSoftwareInstanceSap</code> but it also returns the http response headers .
   * Create software instance
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSoftwareInstanceSapResponse> createSoftwareInstanceSapWithHttpInfo(@Param("sessionId") String sessionId, CreateSoftwareInstanceSapRequestData body);


  /**
   * Create
   * Create software instance
   * Note, this is equivalent to the other <code>createSoftwareInstanceSap</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSoftwareInstanceSapQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSoftwareInstanceSapResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSoftwareInstanceSapResponse createSoftwareInstanceSap(CreateSoftwareInstanceSapRequestData body, @QueryMap(encoded=true) CreateSoftwareInstanceSapQueryParams queryParams);

  /**
  * Create
  * Create software instance
  * Note, this is equivalent to the other <code>createSoftwareInstanceSap</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSoftwareInstanceSapResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSoftwareInstanceSapResponse> createSoftwareInstanceSapWithHttpInfo(CreateSoftwareInstanceSapRequestData body, @QueryMap(encoded=true) CreateSoftwareInstanceSapQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSoftwareInstanceSap</code> method in a fluent style.
   */
  public static class CreateSoftwareInstanceSapQueryParams extends HashMap<String, Object> {
    public CreateSoftwareInstanceSapQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSoftwareInstanceSapResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSoftwareInstanceSapResponse deleteSoftwareInstanceSap(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstanceSapRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSoftwareInstanceSap</code> but it also returns the http response headers .
   * Delete Software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSoftwareInstanceSapResponse> deleteSoftwareInstanceSapWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstanceSapRequestData body);


  /**
   * Delete
   * Delete Software instance
   * Note, this is equivalent to the other <code>deleteSoftwareInstanceSap</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSoftwareInstanceSapQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSoftwareInstanceSapResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSoftwareInstanceSapResponse deleteSoftwareInstanceSap(@Param("elid") String elid, DeleteSoftwareInstanceSapRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstanceSapQueryParams queryParams);

  /**
  * Delete
  * Delete Software instance
  * Note, this is equivalent to the other <code>deleteSoftwareInstanceSap</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSoftwareInstanceSapResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSoftwareInstanceSapResponse> deleteSoftwareInstanceSapWithHttpInfo(@Param("elid") String elid, DeleteSoftwareInstanceSapRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstanceSapQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSoftwareInstanceSap</code> method in a fluent style.
   */
  public static class DeleteSoftwareInstanceSapQueryParams extends HashMap<String, Object> {
    public DeleteSoftwareInstanceSapQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceSapContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceSapContractsResponseData softwareInstanceSapContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>softwareInstanceSapContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceSapContractsResponseData> softwareInstanceSapContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceSapContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceSapContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceSapContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceSapContractsResponseData softwareInstanceSapContracts(@Param("elid") String elid, SoftwareInstanceSapContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceSapContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceSapContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceSapContractsResponseData> softwareInstanceSapContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceSapContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceSapContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceSapContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceSapContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceSapFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceSapFrameContractsResponseData softwareInstanceSapFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>softwareInstanceSapFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceSapFrameContractsResponseData> softwareInstanceSapFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceSapFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceSapFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceSapFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceSapFrameContractsResponseData softwareInstanceSapFrameContracts(@Param("elid") String elid, SoftwareInstanceSapFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceSapFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceSapFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceSapFrameContractsResponseData> softwareInstanceSapFrameContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceSapFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceSapFrameContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceSapFrameContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceSapFrameContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceSapMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceSapMaintenanceContractsResponseData softwareInstanceSapMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>softwareInstanceSapMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceSapMaintenanceContractsResponseData> softwareInstanceSapMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceSapMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceSapMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceSapMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceSapMaintenanceContractsResponseData softwareInstanceSapMaintenanceContracts(@Param("elid") String elid, SoftwareInstanceSapMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceSapMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceSapMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceSapMaintenanceContractsResponseData> softwareInstanceSapMaintenanceContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceSapMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceSapMaintenanceContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceSapMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceSapMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceSapOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceSapOperatingSystemInstallationResponseData softwareInstanceSapOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>softwareInstanceSapOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceSapOperatingSystemInstallationResponseData> softwareInstanceSapOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceSapOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceSapOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceSapOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceSapOperatingSystemInstallationResponseData softwareInstanceSapOperatingSystemInstallation(@Param("elid") String elid, SoftwareInstanceSapOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceSapOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceSapOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceSapOperatingSystemInstallationResponseData> softwareInstanceSapOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, SoftwareInstanceSapOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceSapOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class SoftwareInstanceSapOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceSapOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceSapOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceSapOrganizationsResponseData softwareInstanceSapOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>softwareInstanceSapOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceSapOrganizationsResponseData> softwareInstanceSapOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceSapOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceSapOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceSapOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceSapOrganizationsResponseData softwareInstanceSapOrganizations(@Param("elid") String elid, SoftwareInstanceSapOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceSapOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceSapOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceSapOrganizationsResponseData> softwareInstanceSapOrganizationsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceSapOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceSapOrganizations</code> method in a fluent style.
   */
  public static class SoftwareInstanceSapOrganizationsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceSapOrganizationsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceSapPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceSapPersonGroupsResponseData softwareInstanceSapPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>softwareInstanceSapPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceSapPersonGroupsResponseData> softwareInstanceSapPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceSapPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceSapPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceSapPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceSapPersonGroupsResponseData softwareInstanceSapPersonGroups(@Param("elid") String elid, SoftwareInstanceSapPersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceSapPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceSapPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceSapPersonGroupsResponseData> softwareInstanceSapPersonGroupsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceSapPersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceSapPersonGroups</code> method in a fluent style.
   */
  public static class SoftwareInstanceSapPersonGroupsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceSapPersonGroupsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceSapPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceSapPersonsResponseData softwareInstanceSapPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>softwareInstanceSapPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceSapPersonsResponseData> softwareInstanceSapPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceSapPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceSapPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceSapPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceSapPersonsResponseData softwareInstanceSapPersons(@Param("elid") String elid, SoftwareInstanceSapPersonsRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceSapPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceSapPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceSapPersonsResponseData> softwareInstanceSapPersonsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceSapPersonsRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceSapPersons</code> method in a fluent style.
   */
  public static class SoftwareInstanceSapPersonsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceSapPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SoftwareInstanceSapQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceSapQueryResponse softwareInstanceSapQuery(@Param("sessionId") String sessionId, SoftwareInstanceSapQueryRequest body);

  /**
   * Basic query
   * Similar to <code>softwareInstanceSapQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceSapQueryResponse> softwareInstanceSapQueryWithHttpInfo(@Param("sessionId") String sessionId, SoftwareInstanceSapQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>softwareInstanceSapQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceSapQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceSapQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceSapQueryResponse softwareInstanceSapQuery(SoftwareInstanceSapQueryRequest body, @QueryMap(encoded=true) SoftwareInstanceSapQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>softwareInstanceSapQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceSapQueryResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceSapQueryResponse> softwareInstanceSapQueryWithHttpInfo(SoftwareInstanceSapQueryRequest body, @QueryMap(encoded=true) SoftwareInstanceSapQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceSapQuery</code> method in a fluent style.
   */
  public static class SoftwareInstanceSapQueryQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceSapQueryQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceSapSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceSapSoftwareInstallationResponseData softwareInstanceSapSoftwareInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapSoftwareInstallationRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>softwareInstanceSapSoftwareInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceSapSoftwareInstallationResponseData> softwareInstanceSapSoftwareInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapSoftwareInstallationRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceSapSoftwareInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceSapSoftwareInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceSapSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceSapSoftwareInstallationResponseData softwareInstanceSapSoftwareInstallation(@Param("elid") String elid, SoftwareInstanceSapSoftwareInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapSoftwareInstallationQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceSapSoftwareInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceSapSoftwareInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/SoftwareInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceSapSoftwareInstallationResponseData> softwareInstanceSapSoftwareInstallationWithHttpInfo(@Param("elid") String elid, SoftwareInstanceSapSoftwareInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceSapSoftwareInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceSapSoftwareInstallation</code> method in a fluent style.
   */
  public static class SoftwareInstanceSapSoftwareInstallationQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceSapSoftwareInstallationQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceSapSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceSapSystemAttributesResponse softwareInstanceSapSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>softwareInstanceSapSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceSapSystemAttributesResponse> softwareInstanceSapSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceSapSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>softwareInstanceSapSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceSapSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceSapSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceSapSystemAttributesResponse softwareInstanceSapSystemAttributes(@Param("elid") String elid, SoftwareInstanceSapSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstanceSapSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>softwareInstanceSapSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceSapSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceSapSystemAttributesResponse> softwareInstanceSapSystemAttributesWithHttpInfo(@Param("elid") String elid, SoftwareInstanceSapSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstanceSapSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceSapSystemAttributes</code> method in a fluent style.
   */
  public static class SoftwareInstanceSapSystemAttributesQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceSapSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSoftwareInstanceSapResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSoftwareInstanceSapResponse updateSoftwareInstanceSap(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstanceSapRequestData body);

  /**
   * Modify
   * Similar to <code>updateSoftwareInstanceSap</code> but it also returns the http response headers .
   * Modify software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSoftwareInstanceSapResponse> updateSoftwareInstanceSapWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstanceSapRequestData body);


  /**
   * Modify
   * Modify software instance
   * Note, this is equivalent to the other <code>updateSoftwareInstanceSap</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSoftwareInstanceSapQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSoftwareInstanceSapResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSoftwareInstanceSapResponse updateSoftwareInstanceSap(@Param("elid") String elid, UpdateSoftwareInstanceSapRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstanceSapQueryParams queryParams);

  /**
  * Modify
  * Modify software instance
  * Note, this is equivalent to the other <code>updateSoftwareInstanceSap</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSoftwareInstanceSapResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSoftwareInstanceSapResponse> updateSoftwareInstanceSapWithHttpInfo(@Param("elid") String elid, UpdateSoftwareInstanceSapRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstanceSapQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSoftwareInstanceSap</code> method in a fluent style.
   */
  public static class UpdateSoftwareInstanceSapQueryParams extends HashMap<String, Object> {
    public UpdateSoftwareInstanceSapQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSoftwareInstanceSapResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstanceSapResponse updateSystemAttributesSoftwareInstanceSap(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceSapRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSoftwareInstanceSap</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSoftwareInstanceSapResponse> updateSystemAttributesSoftwareInstanceSapWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceSapRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstanceSap</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSoftwareInstanceSapQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSoftwareInstanceSapResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstanceSapResponse updateSystemAttributesSoftwareInstanceSap(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceSapRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstanceSapQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstanceSap</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSoftwareInstanceSapResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceSap/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSoftwareInstanceSapResponse> updateSystemAttributesSoftwareInstanceSapWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceSapRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstanceSapQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSoftwareInstanceSap</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSoftwareInstanceSapQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSoftwareInstanceSapQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
