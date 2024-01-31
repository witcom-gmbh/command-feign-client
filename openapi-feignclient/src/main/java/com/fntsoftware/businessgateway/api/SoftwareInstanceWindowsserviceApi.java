package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceWindowsserviceRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceWindowsserviceResponse;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstanceWindowsserviceRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstanceWindowsserviceResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsservicePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsservicePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsservicePersonsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsservicePersonsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceQueryRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceQueryResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceSoftwareInstallationRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceSoftwareInstallationResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceWindowsserviceSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstanceWindowsserviceRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstanceWindowsserviceResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceWindowsserviceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface SoftwareInstanceWindowsserviceApi extends ApiClient.Api {


  /**
   * Create
   * Create Software instance
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSoftwareInstanceWindowsserviceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSoftwareInstanceWindowsserviceResponse createSoftwareInstanceWindowsservice(@Param("sessionId") String sessionId, CreateSoftwareInstanceWindowsserviceRequestData body);

  /**
   * Create
   * Similar to <code>createSoftwareInstanceWindowsservice</code> but it also returns the http response headers .
   * Create Software instance
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSoftwareInstanceWindowsserviceResponse> createSoftwareInstanceWindowsserviceWithHttpInfo(@Param("sessionId") String sessionId, CreateSoftwareInstanceWindowsserviceRequestData body);


  /**
   * Create
   * Create Software instance
   * Note, this is equivalent to the other <code>createSoftwareInstanceWindowsservice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSoftwareInstanceWindowsserviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSoftwareInstanceWindowsserviceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSoftwareInstanceWindowsserviceResponse createSoftwareInstanceWindowsservice(CreateSoftwareInstanceWindowsserviceRequestData body, @QueryMap(encoded=true) CreateSoftwareInstanceWindowsserviceQueryParams queryParams);

  /**
  * Create
  * Create Software instance
  * Note, this is equivalent to the other <code>createSoftwareInstanceWindowsservice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSoftwareInstanceWindowsserviceResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSoftwareInstanceWindowsserviceResponse> createSoftwareInstanceWindowsserviceWithHttpInfo(CreateSoftwareInstanceWindowsserviceRequestData body, @QueryMap(encoded=true) CreateSoftwareInstanceWindowsserviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSoftwareInstanceWindowsservice</code> method in a fluent style.
   */
  public static class CreateSoftwareInstanceWindowsserviceQueryParams extends HashMap<String, Object> {
    public CreateSoftwareInstanceWindowsserviceQueryParams sessionId(final String value) {
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
   * @return DeleteSoftwareInstanceWindowsserviceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSoftwareInstanceWindowsserviceResponse deleteSoftwareInstanceWindowsservice(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstanceWindowsserviceRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSoftwareInstanceWindowsservice</code> but it also returns the http response headers .
   * Delete Software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSoftwareInstanceWindowsserviceResponse> deleteSoftwareInstanceWindowsserviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstanceWindowsserviceRequestData body);


  /**
   * Delete
   * Delete Software instance
   * Note, this is equivalent to the other <code>deleteSoftwareInstanceWindowsservice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSoftwareInstanceWindowsserviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSoftwareInstanceWindowsserviceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSoftwareInstanceWindowsserviceResponse deleteSoftwareInstanceWindowsservice(@Param("elid") String elid, DeleteSoftwareInstanceWindowsserviceRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstanceWindowsserviceQueryParams queryParams);

  /**
  * Delete
  * Delete Software instance
  * Note, this is equivalent to the other <code>deleteSoftwareInstanceWindowsservice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSoftwareInstanceWindowsserviceResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSoftwareInstanceWindowsserviceResponse> deleteSoftwareInstanceWindowsserviceWithHttpInfo(@Param("elid") String elid, DeleteSoftwareInstanceWindowsserviceRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstanceWindowsserviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSoftwareInstanceWindowsservice</code> method in a fluent style.
   */
  public static class DeleteSoftwareInstanceWindowsserviceQueryParams extends HashMap<String, Object> {
    public DeleteSoftwareInstanceWindowsserviceQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWindowsserviceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceContractsResponseData softwareInstanceWindowsserviceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>softwareInstanceWindowsserviceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWindowsserviceContractsResponseData> softwareInstanceWindowsserviceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWindowsserviceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWindowsserviceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceContractsResponseData softwareInstanceWindowsserviceContracts(@Param("elid") String elid, SoftwareInstanceWindowsserviceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWindowsserviceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWindowsserviceContractsResponseData> softwareInstanceWindowsserviceContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWindowsserviceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWindowsserviceContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceWindowsserviceContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWindowsserviceContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWindowsserviceFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceFrameContractsResponseData softwareInstanceWindowsserviceFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>softwareInstanceWindowsserviceFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWindowsserviceFrameContractsResponseData> softwareInstanceWindowsserviceFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWindowsserviceFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWindowsserviceFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceFrameContractsResponseData softwareInstanceWindowsserviceFrameContracts(@Param("elid") String elid, SoftwareInstanceWindowsserviceFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWindowsserviceFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWindowsserviceFrameContractsResponseData> softwareInstanceWindowsserviceFrameContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWindowsserviceFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWindowsserviceFrameContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceWindowsserviceFrameContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWindowsserviceFrameContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWindowsserviceMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceMaintenanceContractsResponseData softwareInstanceWindowsserviceMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>softwareInstanceWindowsserviceMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWindowsserviceMaintenanceContractsResponseData> softwareInstanceWindowsserviceMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWindowsserviceMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWindowsserviceMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceMaintenanceContractsResponseData softwareInstanceWindowsserviceMaintenanceContracts(@Param("elid") String elid, SoftwareInstanceWindowsserviceMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWindowsserviceMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWindowsserviceMaintenanceContractsResponseData> softwareInstanceWindowsserviceMaintenanceContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWindowsserviceMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWindowsserviceMaintenanceContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceWindowsserviceMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWindowsserviceMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWindowsserviceOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceOperatingSystemInstallationResponseData softwareInstanceWindowsserviceOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>softwareInstanceWindowsserviceOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWindowsserviceOperatingSystemInstallationResponseData> softwareInstanceWindowsserviceOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWindowsserviceOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWindowsserviceOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceOperatingSystemInstallationResponseData softwareInstanceWindowsserviceOperatingSystemInstallation(@Param("elid") String elid, SoftwareInstanceWindowsserviceOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWindowsserviceOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWindowsserviceOperatingSystemInstallationResponseData> softwareInstanceWindowsserviceOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWindowsserviceOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWindowsserviceOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class SoftwareInstanceWindowsserviceOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWindowsserviceOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWindowsserviceOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceOrganizationsResponseData softwareInstanceWindowsserviceOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>softwareInstanceWindowsserviceOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWindowsserviceOrganizationsResponseData> softwareInstanceWindowsserviceOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWindowsserviceOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWindowsserviceOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceOrganizationsResponseData softwareInstanceWindowsserviceOrganizations(@Param("elid") String elid, SoftwareInstanceWindowsserviceOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWindowsserviceOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWindowsserviceOrganizationsResponseData> softwareInstanceWindowsserviceOrganizationsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWindowsserviceOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWindowsserviceOrganizations</code> method in a fluent style.
   */
  public static class SoftwareInstanceWindowsserviceOrganizationsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWindowsserviceOrganizationsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWindowsservicePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWindowsservicePersonGroupsResponseData softwareInstanceWindowsservicePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsservicePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>softwareInstanceWindowsservicePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWindowsservicePersonGroupsResponseData> softwareInstanceWindowsservicePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsservicePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWindowsservicePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWindowsservicePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWindowsservicePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWindowsservicePersonGroupsResponseData softwareInstanceWindowsservicePersonGroups(@Param("elid") String elid, SoftwareInstanceWindowsservicePersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsservicePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWindowsservicePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWindowsservicePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWindowsservicePersonGroupsResponseData> softwareInstanceWindowsservicePersonGroupsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWindowsservicePersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsservicePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWindowsservicePersonGroups</code> method in a fluent style.
   */
  public static class SoftwareInstanceWindowsservicePersonGroupsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWindowsservicePersonGroupsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWindowsservicePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWindowsservicePersonsResponseData softwareInstanceWindowsservicePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsservicePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>softwareInstanceWindowsservicePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWindowsservicePersonsResponseData> softwareInstanceWindowsservicePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsservicePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWindowsservicePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWindowsservicePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWindowsservicePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWindowsservicePersonsResponseData softwareInstanceWindowsservicePersons(@Param("elid") String elid, SoftwareInstanceWindowsservicePersonsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsservicePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWindowsservicePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWindowsservicePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWindowsservicePersonsResponseData> softwareInstanceWindowsservicePersonsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWindowsservicePersonsRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsservicePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWindowsservicePersons</code> method in a fluent style.
   */
  public static class SoftwareInstanceWindowsservicePersonsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWindowsservicePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SoftwareInstanceWindowsserviceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceQueryResponse softwareInstanceWindowsserviceQuery(@Param("sessionId") String sessionId, SoftwareInstanceWindowsserviceQueryRequest body);

  /**
   * Basic query
   * Similar to <code>softwareInstanceWindowsserviceQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWindowsserviceQueryResponse> softwareInstanceWindowsserviceQueryWithHttpInfo(@Param("sessionId") String sessionId, SoftwareInstanceWindowsserviceQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWindowsserviceQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWindowsserviceQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceQueryResponse softwareInstanceWindowsserviceQuery(SoftwareInstanceWindowsserviceQueryRequest body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWindowsserviceQueryResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWindowsserviceQueryResponse> softwareInstanceWindowsserviceQueryWithHttpInfo(SoftwareInstanceWindowsserviceQueryRequest body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWindowsserviceQuery</code> method in a fluent style.
   */
  public static class SoftwareInstanceWindowsserviceQueryQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWindowsserviceQueryQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWindowsserviceSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceSoftwareInstallationResponseData softwareInstanceWindowsserviceSoftwareInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceSoftwareInstallationRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>softwareInstanceWindowsserviceSoftwareInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWindowsserviceSoftwareInstallationResponseData> softwareInstanceWindowsserviceSoftwareInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceSoftwareInstallationRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceSoftwareInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWindowsserviceSoftwareInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWindowsserviceSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceSoftwareInstallationResponseData softwareInstanceWindowsserviceSoftwareInstallation(@Param("elid") String elid, SoftwareInstanceWindowsserviceSoftwareInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceSoftwareInstallationQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceSoftwareInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWindowsserviceSoftwareInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/SoftwareInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWindowsserviceSoftwareInstallationResponseData> softwareInstanceWindowsserviceSoftwareInstallationWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWindowsserviceSoftwareInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceSoftwareInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWindowsserviceSoftwareInstallation</code> method in a fluent style.
   */
  public static class SoftwareInstanceWindowsserviceSoftwareInstallationQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWindowsserviceSoftwareInstallationQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceWindowsserviceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceSystemAttributesResponse softwareInstanceWindowsserviceSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>softwareInstanceWindowsserviceSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceWindowsserviceSystemAttributesResponse> softwareInstanceWindowsserviceSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceWindowsserviceSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceWindowsserviceSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceWindowsserviceSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceWindowsserviceSystemAttributesResponse softwareInstanceWindowsserviceSystemAttributes(@Param("elid") String elid, SoftwareInstanceWindowsserviceSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>softwareInstanceWindowsserviceSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceWindowsserviceSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceWindowsserviceSystemAttributesResponse> softwareInstanceWindowsserviceSystemAttributesWithHttpInfo(@Param("elid") String elid, SoftwareInstanceWindowsserviceSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstanceWindowsserviceSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceWindowsserviceSystemAttributes</code> method in a fluent style.
   */
  public static class SoftwareInstanceWindowsserviceSystemAttributesQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceWindowsserviceSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSoftwareInstanceWindowsserviceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSoftwareInstanceWindowsserviceResponse updateSoftwareInstanceWindowsservice(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstanceWindowsserviceRequestData body);

  /**
   * Modify
   * Similar to <code>updateSoftwareInstanceWindowsservice</code> but it also returns the http response headers .
   * Modify software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSoftwareInstanceWindowsserviceResponse> updateSoftwareInstanceWindowsserviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstanceWindowsserviceRequestData body);


  /**
   * Modify
   * Modify software instance
   * Note, this is equivalent to the other <code>updateSoftwareInstanceWindowsservice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSoftwareInstanceWindowsserviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSoftwareInstanceWindowsserviceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSoftwareInstanceWindowsserviceResponse updateSoftwareInstanceWindowsservice(@Param("elid") String elid, UpdateSoftwareInstanceWindowsserviceRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstanceWindowsserviceQueryParams queryParams);

  /**
  * Modify
  * Modify software instance
  * Note, this is equivalent to the other <code>updateSoftwareInstanceWindowsservice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSoftwareInstanceWindowsserviceResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSoftwareInstanceWindowsserviceResponse> updateSoftwareInstanceWindowsserviceWithHttpInfo(@Param("elid") String elid, UpdateSoftwareInstanceWindowsserviceRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstanceWindowsserviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSoftwareInstanceWindowsservice</code> method in a fluent style.
   */
  public static class UpdateSoftwareInstanceWindowsserviceQueryParams extends HashMap<String, Object> {
    public UpdateSoftwareInstanceWindowsserviceQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSoftwareInstanceWindowsserviceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstanceWindowsserviceResponse updateSystemAttributesSoftwareInstanceWindowsservice(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSoftwareInstanceWindowsservice</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSoftwareInstanceWindowsserviceResponse> updateSystemAttributesSoftwareInstanceWindowsserviceWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstanceWindowsservice</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSoftwareInstanceWindowsserviceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSoftwareInstanceWindowsserviceResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstanceWindowsserviceResponse updateSystemAttributesSoftwareInstanceWindowsservice(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstanceWindowsserviceQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstanceWindowsservice</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSoftwareInstanceWindowsserviceResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceWindowsservice/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSoftwareInstanceWindowsserviceResponse> updateSystemAttributesSoftwareInstanceWindowsserviceWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceWindowsserviceRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstanceWindowsserviceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSoftwareInstanceWindowsservice</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSoftwareInstanceWindowsserviceQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSoftwareInstanceWindowsserviceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
