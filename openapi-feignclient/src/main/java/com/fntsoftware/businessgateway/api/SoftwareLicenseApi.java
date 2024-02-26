package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSoftwareLicenseRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareLicenseResponse;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareLicenseRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareLicenseResponse;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseOperatingSystemInstallationsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseOperatingSystemInstallationsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareLicensePersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareLicensePersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareLicensePersonsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareLicensePersonsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseQueryRequest;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseQueryResponse;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseSoftwareInstallationsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseSoftwareInstallationsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseSoftwareProductRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseSoftwareProductResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SoftwareLicenseSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareLicenseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareLicenseResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareLicenseRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareLicenseResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface SoftwareLicenseApi extends ApiClient.Api {


  /**
   * Create
   * Creates a software licence. If the ID is not passed, it will be generated automatically by the system.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSoftwareLicenseResponse
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSoftwareLicenseResponse createSoftwareLicense(@Param("sessionId") String sessionId, CreateSoftwareLicenseRequestData body);

  /**
   * Create
   * Similar to <code>createSoftwareLicense</code> but it also returns the http response headers .
   * Creates a software licence. If the ID is not passed, it will be generated automatically by the system.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSoftwareLicenseResponse> createSoftwareLicenseWithHttpInfo(@Param("sessionId") String sessionId, CreateSoftwareLicenseRequestData body);


  /**
   * Create
   * Creates a software licence. If the ID is not passed, it will be generated automatically by the system.
   * Note, this is equivalent to the other <code>createSoftwareLicense</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSoftwareLicenseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSoftwareLicenseResponse
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSoftwareLicenseResponse createSoftwareLicense(CreateSoftwareLicenseRequestData body, @QueryMap(encoded=true) CreateSoftwareLicenseQueryParams queryParams);

  /**
  * Create
  * Creates a software licence. If the ID is not passed, it will be generated automatically by the system.
  * Note, this is equivalent to the other <code>createSoftwareLicense</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSoftwareLicenseResponse
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSoftwareLicenseResponse> createSoftwareLicenseWithHttpInfo(CreateSoftwareLicenseRequestData body, @QueryMap(encoded=true) CreateSoftwareLicenseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSoftwareLicense</code> method in a fluent style.
   */
  public static class CreateSoftwareLicenseQueryParams extends HashMap<String, Object> {
    public CreateSoftwareLicenseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete software license
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSoftwareLicenseResponse
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSoftwareLicenseResponse deleteSoftwareLicense(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareLicenseRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSoftwareLicense</code> but it also returns the http response headers .
   * Delete software license
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSoftwareLicenseResponse> deleteSoftwareLicenseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareLicenseRequestData body);


  /**
   * Delete
   * Delete software license
   * Note, this is equivalent to the other <code>deleteSoftwareLicense</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSoftwareLicenseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSoftwareLicenseResponse
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSoftwareLicenseResponse deleteSoftwareLicense(@Param("elid") String elid, DeleteSoftwareLicenseRequestData body, @QueryMap(encoded=true) DeleteSoftwareLicenseQueryParams queryParams);

  /**
  * Delete
  * Delete software license
  * Note, this is equivalent to the other <code>deleteSoftwareLicense</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSoftwareLicenseResponse
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSoftwareLicenseResponse> deleteSoftwareLicenseWithHttpInfo(@Param("elid") String elid, DeleteSoftwareLicenseRequestData body, @QueryMap(encoded=true) DeleteSoftwareLicenseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSoftwareLicense</code> method in a fluent style.
   */
  public static class DeleteSoftwareLicenseQueryParams extends HashMap<String, Object> {
    public DeleteSoftwareLicenseQueryParams sessionId(final String value) {
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
   * @return SoftwareLicenseContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareLicenseContractsResponseData softwareLicenseContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>softwareLicenseContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareLicenseContractsResponseData> softwareLicenseContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>softwareLicenseContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareLicenseContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareLicenseContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareLicenseContractsResponseData softwareLicenseContracts(@Param("elid") String elid, SoftwareLicenseContractsRequestData body, @QueryMap(encoded=true) SoftwareLicenseContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>softwareLicenseContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareLicenseContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareLicenseContractsResponseData> softwareLicenseContractsWithHttpInfo(@Param("elid") String elid, SoftwareLicenseContractsRequestData body, @QueryMap(encoded=true) SoftwareLicenseContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareLicenseContracts</code> method in a fluent style.
   */
  public static class SoftwareLicenseContractsQueryParams extends HashMap<String, Object> {
    public SoftwareLicenseContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareLicenseFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareLicenseFrameContractsResponseData softwareLicenseFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>softwareLicenseFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareLicenseFrameContractsResponseData> softwareLicenseFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>softwareLicenseFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareLicenseFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareLicenseFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareLicenseFrameContractsResponseData softwareLicenseFrameContracts(@Param("elid") String elid, SoftwareLicenseFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareLicenseFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>softwareLicenseFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareLicenseFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareLicenseFrameContractsResponseData> softwareLicenseFrameContractsWithHttpInfo(@Param("elid") String elid, SoftwareLicenseFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareLicenseFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareLicenseFrameContracts</code> method in a fluent style.
   */
  public static class SoftwareLicenseFrameContractsQueryParams extends HashMap<String, Object> {
    public SoftwareLicenseFrameContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareLicenseMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareLicenseMaintenanceContractsResponseData softwareLicenseMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>softwareLicenseMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareLicenseMaintenanceContractsResponseData> softwareLicenseMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>softwareLicenseMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareLicenseMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareLicenseMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareLicenseMaintenanceContractsResponseData softwareLicenseMaintenanceContracts(@Param("elid") String elid, SoftwareLicenseMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareLicenseMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>softwareLicenseMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareLicenseMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareLicenseMaintenanceContractsResponseData> softwareLicenseMaintenanceContractsWithHttpInfo(@Param("elid") String elid, SoftwareLicenseMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareLicenseMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareLicenseMaintenanceContracts</code> method in a fluent style.
   */
  public static class SoftwareLicenseMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public SoftwareLicenseMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareLicenseOperatingSystemInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/OperatingSystemInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareLicenseOperatingSystemInstallationsResponseData softwareLicenseOperatingSystemInstallations(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseOperatingSystemInstallationsRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>softwareLicenseOperatingSystemInstallations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/OperatingSystemInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareLicenseOperatingSystemInstallationsResponseData> softwareLicenseOperatingSystemInstallationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseOperatingSystemInstallationsRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>softwareLicenseOperatingSystemInstallations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareLicenseOperatingSystemInstallationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareLicenseOperatingSystemInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/OperatingSystemInstallations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareLicenseOperatingSystemInstallationsResponseData softwareLicenseOperatingSystemInstallations(@Param("elid") String elid, SoftwareLicenseOperatingSystemInstallationsRequestData body, @QueryMap(encoded=true) SoftwareLicenseOperatingSystemInstallationsQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>softwareLicenseOperatingSystemInstallations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareLicenseOperatingSystemInstallationsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/OperatingSystemInstallations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareLicenseOperatingSystemInstallationsResponseData> softwareLicenseOperatingSystemInstallationsWithHttpInfo(@Param("elid") String elid, SoftwareLicenseOperatingSystemInstallationsRequestData body, @QueryMap(encoded=true) SoftwareLicenseOperatingSystemInstallationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareLicenseOperatingSystemInstallations</code> method in a fluent style.
   */
  public static class SoftwareLicenseOperatingSystemInstallationsQueryParams extends HashMap<String, Object> {
    public SoftwareLicenseOperatingSystemInstallationsQueryParams sessionId(final String value) {
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
   * @return SoftwareLicenseOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareLicenseOrganizationsResponseData softwareLicenseOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>softwareLicenseOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareLicenseOrganizationsResponseData> softwareLicenseOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>softwareLicenseOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareLicenseOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareLicenseOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareLicenseOrganizationsResponseData softwareLicenseOrganizations(@Param("elid") String elid, SoftwareLicenseOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareLicenseOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>softwareLicenseOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareLicenseOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareLicenseOrganizationsResponseData> softwareLicenseOrganizationsWithHttpInfo(@Param("elid") String elid, SoftwareLicenseOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareLicenseOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareLicenseOrganizations</code> method in a fluent style.
   */
  public static class SoftwareLicenseOrganizationsQueryParams extends HashMap<String, Object> {
    public SoftwareLicenseOrganizationsQueryParams sessionId(final String value) {
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
   * @return SoftwareLicensePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareLicensePersonGroupsResponseData softwareLicensePersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicensePersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>softwareLicensePersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareLicensePersonGroupsResponseData> softwareLicensePersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicensePersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>softwareLicensePersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareLicensePersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareLicensePersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareLicensePersonGroupsResponseData softwareLicensePersonGroups(@Param("elid") String elid, SoftwareLicensePersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareLicensePersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>softwareLicensePersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareLicensePersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareLicensePersonGroupsResponseData> softwareLicensePersonGroupsWithHttpInfo(@Param("elid") String elid, SoftwareLicensePersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareLicensePersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareLicensePersonGroups</code> method in a fluent style.
   */
  public static class SoftwareLicensePersonGroupsQueryParams extends HashMap<String, Object> {
    public SoftwareLicensePersonGroupsQueryParams sessionId(final String value) {
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
   * @return SoftwareLicensePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareLicensePersonsResponseData softwareLicensePersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicensePersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>softwareLicensePersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareLicensePersonsResponseData> softwareLicensePersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicensePersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>softwareLicensePersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareLicensePersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareLicensePersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareLicensePersonsResponseData softwareLicensePersons(@Param("elid") String elid, SoftwareLicensePersonsRequestData body, @QueryMap(encoded=true) SoftwareLicensePersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>softwareLicensePersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareLicensePersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareLicensePersonsResponseData> softwareLicensePersonsWithHttpInfo(@Param("elid") String elid, SoftwareLicensePersonsRequestData body, @QueryMap(encoded=true) SoftwareLicensePersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareLicensePersons</code> method in a fluent style.
   */
  public static class SoftwareLicensePersonsQueryParams extends HashMap<String, Object> {
    public SoftwareLicensePersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SoftwareLicenseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareLicenseQueryResponse softwareLicenseQuery(@Param("sessionId") String sessionId, SoftwareLicenseQueryRequest body);

  /**
   * Basic query
   * Similar to <code>softwareLicenseQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareLicenseQueryResponse> softwareLicenseQueryWithHttpInfo(@Param("sessionId") String sessionId, SoftwareLicenseQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>softwareLicenseQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareLicenseQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareLicenseQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareLicenseQueryResponse softwareLicenseQuery(SoftwareLicenseQueryRequest body, @QueryMap(encoded=true) SoftwareLicenseQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>softwareLicenseQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareLicenseQueryResponse
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareLicenseQueryResponse> softwareLicenseQueryWithHttpInfo(SoftwareLicenseQueryRequest body, @QueryMap(encoded=true) SoftwareLicenseQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareLicenseQuery</code> method in a fluent style.
   */
  public static class SoftwareLicenseQueryQueryParams extends HashMap<String, Object> {
    public SoftwareLicenseQueryQueryParams sessionId(final String value) {
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
   * @return SoftwareLicenseSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareLicenseSoftwareInstallationsResponseData softwareLicenseSoftwareInstallations(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseSoftwareInstallationsRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>softwareLicenseSoftwareInstallations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareLicenseSoftwareInstallationsResponseData> softwareLicenseSoftwareInstallationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseSoftwareInstallationsRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>softwareLicenseSoftwareInstallations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareLicenseSoftwareInstallationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareLicenseSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareLicenseSoftwareInstallationsResponseData softwareLicenseSoftwareInstallations(@Param("elid") String elid, SoftwareLicenseSoftwareInstallationsRequestData body, @QueryMap(encoded=true) SoftwareLicenseSoftwareInstallationsQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>softwareLicenseSoftwareInstallations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareLicenseSoftwareInstallationsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/SoftwareInstallations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareLicenseSoftwareInstallationsResponseData> softwareLicenseSoftwareInstallationsWithHttpInfo(@Param("elid") String elid, SoftwareLicenseSoftwareInstallationsRequestData body, @QueryMap(encoded=true) SoftwareLicenseSoftwareInstallationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareLicenseSoftwareInstallations</code> method in a fluent style.
   */
  public static class SoftwareLicenseSoftwareInstallationsQueryParams extends HashMap<String, Object> {
    public SoftwareLicenseSoftwareInstallationsQueryParams sessionId(final String value) {
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
   * @return SoftwareLicenseSoftwareProductResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareLicenseSoftwareProductResponseData softwareLicenseSoftwareProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseSoftwareProductRequestData body);

  /**
   * Get relations to Software product entities
   * Similar to <code>softwareLicenseSoftwareProduct</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareLicenseSoftwareProductResponseData> softwareLicenseSoftwareProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseSoftwareProductRequestData body);


  /**
   * Get relations to Software product entities
   * 
   * Note, this is equivalent to the other <code>softwareLicenseSoftwareProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareLicenseSoftwareProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareLicenseSoftwareProductResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/SoftwareProduct?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareLicenseSoftwareProductResponseData softwareLicenseSoftwareProduct(@Param("elid") String elid, SoftwareLicenseSoftwareProductRequestData body, @QueryMap(encoded=true) SoftwareLicenseSoftwareProductQueryParams queryParams);

  /**
  * Get relations to Software product entities
  * 
  * Note, this is equivalent to the other <code>softwareLicenseSoftwareProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareLicenseSoftwareProductResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/SoftwareProduct?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareLicenseSoftwareProductResponseData> softwareLicenseSoftwareProductWithHttpInfo(@Param("elid") String elid, SoftwareLicenseSoftwareProductRequestData body, @QueryMap(encoded=true) SoftwareLicenseSoftwareProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareLicenseSoftwareProduct</code> method in a fluent style.
   */
  public static class SoftwareLicenseSoftwareProductQueryParams extends HashMap<String, Object> {
    public SoftwareLicenseSoftwareProductQueryParams sessionId(final String value) {
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
   * @return SoftwareLicenseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareLicenseSystemAttributesResponse softwareLicenseSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>softwareLicenseSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareLicenseSystemAttributesResponse> softwareLicenseSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareLicenseSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>softwareLicenseSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareLicenseSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareLicenseSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareLicenseSystemAttributesResponse softwareLicenseSystemAttributes(@Param("elid") String elid, SoftwareLicenseSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareLicenseSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>softwareLicenseSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareLicenseSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareLicenseSystemAttributesResponse> softwareLicenseSystemAttributesWithHttpInfo(@Param("elid") String elid, SoftwareLicenseSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareLicenseSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareLicenseSystemAttributes</code> method in a fluent style.
   */
  public static class SoftwareLicenseSystemAttributesQueryParams extends HashMap<String, Object> {
    public SoftwareLicenseSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify software license
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSoftwareLicenseResponse
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSoftwareLicenseResponse updateSoftwareLicense(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareLicenseRequestData body);

  /**
   * Modify
   * Similar to <code>updateSoftwareLicense</code> but it also returns the http response headers .
   * Modify software license
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSoftwareLicenseResponse> updateSoftwareLicenseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareLicenseRequestData body);


  /**
   * Modify
   * Modify software license
   * Note, this is equivalent to the other <code>updateSoftwareLicense</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSoftwareLicenseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSoftwareLicenseResponse
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSoftwareLicenseResponse updateSoftwareLicense(@Param("elid") String elid, UpdateSoftwareLicenseRequestData body, @QueryMap(encoded=true) UpdateSoftwareLicenseQueryParams queryParams);

  /**
  * Modify
  * Modify software license
  * Note, this is equivalent to the other <code>updateSoftwareLicense</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSoftwareLicenseResponse
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSoftwareLicenseResponse> updateSoftwareLicenseWithHttpInfo(@Param("elid") String elid, UpdateSoftwareLicenseRequestData body, @QueryMap(encoded=true) UpdateSoftwareLicenseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSoftwareLicense</code> method in a fluent style.
   */
  public static class UpdateSoftwareLicenseQueryParams extends HashMap<String, Object> {
    public UpdateSoftwareLicenseQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSoftwareLicenseResponse
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareLicenseResponse updateSystemAttributesSoftwareLicense(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareLicenseRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSoftwareLicense</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSoftwareLicenseResponse> updateSystemAttributesSoftwareLicenseWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareLicenseRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareLicense</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSoftwareLicenseQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSoftwareLicenseResponse
   */
  @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareLicenseResponse updateSystemAttributesSoftwareLicense(@Param("elid") String elid, UpdateSystemAttributesSoftwareLicenseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareLicenseQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareLicense</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSoftwareLicenseResponse
      */
      @RequestLine("POST /api/rest/entity/softwareLicense/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSoftwareLicenseResponse> updateSystemAttributesSoftwareLicenseWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSoftwareLicenseRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareLicenseQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSoftwareLicense</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSoftwareLicenseQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSoftwareLicenseQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
