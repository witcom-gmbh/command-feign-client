package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceMssqldbRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareInstanceMssqldbResponse;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstanceMssqldbRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareInstanceMssqldbResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbOperatingSystemInstallationRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbOperatingSystemInstallationResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbPersonsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbPersonsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbQueryRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbQueryResponse;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbSoftwareInstallationRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbSoftwareInstallationResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SoftwareInstanceMssqldbSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstanceMssqldbRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareInstanceMssqldbResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceMssqldbRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareInstanceMssqldbResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface SoftwareInstanceMssqldbApi extends ApiClient.Api {


  /**
   * Create
   * Create software instance
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSoftwareInstanceMssqldbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSoftwareInstanceMssqldbResponse createSoftwareInstanceMssqldb(@Param("sessionId") String sessionId, CreateSoftwareInstanceMssqldbRequestData body);

  /**
   * Create
   * Similar to <code>createSoftwareInstanceMssqldb</code> but it also returns the http response headers .
   * Create software instance
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSoftwareInstanceMssqldbResponse> createSoftwareInstanceMssqldbWithHttpInfo(@Param("sessionId") String sessionId, CreateSoftwareInstanceMssqldbRequestData body);


  /**
   * Create
   * Create software instance
   * Note, this is equivalent to the other <code>createSoftwareInstanceMssqldb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSoftwareInstanceMssqldbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSoftwareInstanceMssqldbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSoftwareInstanceMssqldbResponse createSoftwareInstanceMssqldb(CreateSoftwareInstanceMssqldbRequestData body, @QueryMap(encoded=true) CreateSoftwareInstanceMssqldbQueryParams queryParams);

  /**
  * Create
  * Create software instance
  * Note, this is equivalent to the other <code>createSoftwareInstanceMssqldb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSoftwareInstanceMssqldbResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSoftwareInstanceMssqldbResponse> createSoftwareInstanceMssqldbWithHttpInfo(CreateSoftwareInstanceMssqldbRequestData body, @QueryMap(encoded=true) CreateSoftwareInstanceMssqldbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSoftwareInstanceMssqldb</code> method in a fluent style.
   */
  public static class CreateSoftwareInstanceMssqldbQueryParams extends HashMap<String, Object> {
    public CreateSoftwareInstanceMssqldbQueryParams sessionId(final String value) {
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
   * @return DeleteSoftwareInstanceMssqldbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSoftwareInstanceMssqldbResponse deleteSoftwareInstanceMssqldb(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstanceMssqldbRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSoftwareInstanceMssqldb</code> but it also returns the http response headers .
   * Delete software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSoftwareInstanceMssqldbResponse> deleteSoftwareInstanceMssqldbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareInstanceMssqldbRequestData body);


  /**
   * Delete
   * Delete software instance
   * Note, this is equivalent to the other <code>deleteSoftwareInstanceMssqldb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSoftwareInstanceMssqldbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSoftwareInstanceMssqldbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSoftwareInstanceMssqldbResponse deleteSoftwareInstanceMssqldb(@Param("elid") String elid, DeleteSoftwareInstanceMssqldbRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstanceMssqldbQueryParams queryParams);

  /**
  * Delete
  * Delete software instance
  * Note, this is equivalent to the other <code>deleteSoftwareInstanceMssqldb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSoftwareInstanceMssqldbResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSoftwareInstanceMssqldbResponse> deleteSoftwareInstanceMssqldbWithHttpInfo(@Param("elid") String elid, DeleteSoftwareInstanceMssqldbRequestData body, @QueryMap(encoded=true) DeleteSoftwareInstanceMssqldbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSoftwareInstanceMssqldb</code> method in a fluent style.
   */
  public static class DeleteSoftwareInstanceMssqldbQueryParams extends HashMap<String, Object> {
    public DeleteSoftwareInstanceMssqldbQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceMssqldbContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceMssqldbContractsResponseData softwareInstanceMssqldbContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>softwareInstanceMssqldbContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceMssqldbContractsResponseData> softwareInstanceMssqldbContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceMssqldbContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceMssqldbContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceMssqldbContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceMssqldbContractsResponseData softwareInstanceMssqldbContracts(@Param("elid") String elid, SoftwareInstanceMssqldbContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceMssqldbContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceMssqldbContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceMssqldbContractsResponseData> softwareInstanceMssqldbContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceMssqldbContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceMssqldbContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceMssqldbContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceMssqldbContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceMssqldbFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceMssqldbFrameContractsResponseData softwareInstanceMssqldbFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>softwareInstanceMssqldbFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceMssqldbFrameContractsResponseData> softwareInstanceMssqldbFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceMssqldbFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceMssqldbFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceMssqldbFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceMssqldbFrameContractsResponseData softwareInstanceMssqldbFrameContracts(@Param("elid") String elid, SoftwareInstanceMssqldbFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceMssqldbFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceMssqldbFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceMssqldbFrameContractsResponseData> softwareInstanceMssqldbFrameContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceMssqldbFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceMssqldbFrameContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceMssqldbFrameContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceMssqldbFrameContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceMssqldbMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceMssqldbMaintenanceContractsResponseData softwareInstanceMssqldbMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>softwareInstanceMssqldbMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceMssqldbMaintenanceContractsResponseData> softwareInstanceMssqldbMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceMssqldbMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceMssqldbMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceMssqldbMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceMssqldbMaintenanceContractsResponseData softwareInstanceMssqldbMaintenanceContracts(@Param("elid") String elid, SoftwareInstanceMssqldbMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceMssqldbMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceMssqldbMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceMssqldbMaintenanceContractsResponseData> softwareInstanceMssqldbMaintenanceContractsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceMssqldbMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceMssqldbMaintenanceContracts</code> method in a fluent style.
   */
  public static class SoftwareInstanceMssqldbMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceMssqldbMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceMssqldbOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceMssqldbOperatingSystemInstallationResponseData softwareInstanceMssqldbOperatingSystemInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbOperatingSystemInstallationRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>softwareInstanceMssqldbOperatingSystemInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceMssqldbOperatingSystemInstallationResponseData> softwareInstanceMssqldbOperatingSystemInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbOperatingSystemInstallationRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceMssqldbOperatingSystemInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceMssqldbOperatingSystemInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceMssqldbOperatingSystemInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceMssqldbOperatingSystemInstallationResponseData softwareInstanceMssqldbOperatingSystemInstallation(@Param("elid") String elid, SoftwareInstanceMssqldbOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbOperatingSystemInstallationQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceMssqldbOperatingSystemInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceMssqldbOperatingSystemInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/OperatingSystemInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceMssqldbOperatingSystemInstallationResponseData> softwareInstanceMssqldbOperatingSystemInstallationWithHttpInfo(@Param("elid") String elid, SoftwareInstanceMssqldbOperatingSystemInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbOperatingSystemInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceMssqldbOperatingSystemInstallation</code> method in a fluent style.
   */
  public static class SoftwareInstanceMssqldbOperatingSystemInstallationQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceMssqldbOperatingSystemInstallationQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceMssqldbOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceMssqldbOrganizationsResponseData softwareInstanceMssqldbOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>softwareInstanceMssqldbOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceMssqldbOrganizationsResponseData> softwareInstanceMssqldbOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceMssqldbOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceMssqldbOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceMssqldbOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceMssqldbOrganizationsResponseData softwareInstanceMssqldbOrganizations(@Param("elid") String elid, SoftwareInstanceMssqldbOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceMssqldbOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceMssqldbOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceMssqldbOrganizationsResponseData> softwareInstanceMssqldbOrganizationsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceMssqldbOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceMssqldbOrganizations</code> method in a fluent style.
   */
  public static class SoftwareInstanceMssqldbOrganizationsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceMssqldbOrganizationsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceMssqldbPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceMssqldbPersonGroupsResponseData softwareInstanceMssqldbPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>softwareInstanceMssqldbPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceMssqldbPersonGroupsResponseData> softwareInstanceMssqldbPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceMssqldbPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceMssqldbPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceMssqldbPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceMssqldbPersonGroupsResponseData softwareInstanceMssqldbPersonGroups(@Param("elid") String elid, SoftwareInstanceMssqldbPersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceMssqldbPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceMssqldbPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceMssqldbPersonGroupsResponseData> softwareInstanceMssqldbPersonGroupsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceMssqldbPersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceMssqldbPersonGroups</code> method in a fluent style.
   */
  public static class SoftwareInstanceMssqldbPersonGroupsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceMssqldbPersonGroupsQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceMssqldbPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceMssqldbPersonsResponseData softwareInstanceMssqldbPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>softwareInstanceMssqldbPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceMssqldbPersonsResponseData> softwareInstanceMssqldbPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceMssqldbPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceMssqldbPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceMssqldbPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceMssqldbPersonsResponseData softwareInstanceMssqldbPersons(@Param("elid") String elid, SoftwareInstanceMssqldbPersonsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceMssqldbPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceMssqldbPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceMssqldbPersonsResponseData> softwareInstanceMssqldbPersonsWithHttpInfo(@Param("elid") String elid, SoftwareInstanceMssqldbPersonsRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceMssqldbPersons</code> method in a fluent style.
   */
  public static class SoftwareInstanceMssqldbPersonsQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceMssqldbPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SoftwareInstanceMssqldbQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceMssqldbQueryResponse softwareInstanceMssqldbQuery(@Param("sessionId") String sessionId, SoftwareInstanceMssqldbQueryRequest body);

  /**
   * Basic query
   * Similar to <code>softwareInstanceMssqldbQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceMssqldbQueryResponse> softwareInstanceMssqldbQueryWithHttpInfo(@Param("sessionId") String sessionId, SoftwareInstanceMssqldbQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>softwareInstanceMssqldbQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceMssqldbQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceMssqldbQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceMssqldbQueryResponse softwareInstanceMssqldbQuery(SoftwareInstanceMssqldbQueryRequest body, @QueryMap(encoded=true) SoftwareInstanceMssqldbQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>softwareInstanceMssqldbQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceMssqldbQueryResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceMssqldbQueryResponse> softwareInstanceMssqldbQueryWithHttpInfo(SoftwareInstanceMssqldbQueryRequest body, @QueryMap(encoded=true) SoftwareInstanceMssqldbQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceMssqldbQuery</code> method in a fluent style.
   */
  public static class SoftwareInstanceMssqldbQueryQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceMssqldbQueryQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceMssqldbSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceMssqldbSoftwareInstallationResponseData softwareInstanceMssqldbSoftwareInstallation(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbSoftwareInstallationRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>softwareInstanceMssqldbSoftwareInstallation</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceMssqldbSoftwareInstallationResponseData> softwareInstanceMssqldbSoftwareInstallationWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbSoftwareInstallationRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>softwareInstanceMssqldbSoftwareInstallation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceMssqldbSoftwareInstallationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceMssqldbSoftwareInstallationResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/SoftwareInstallation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceMssqldbSoftwareInstallationResponseData softwareInstanceMssqldbSoftwareInstallation(@Param("elid") String elid, SoftwareInstanceMssqldbSoftwareInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbSoftwareInstallationQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>softwareInstanceMssqldbSoftwareInstallation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceMssqldbSoftwareInstallationResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/SoftwareInstallation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceMssqldbSoftwareInstallationResponseData> softwareInstanceMssqldbSoftwareInstallationWithHttpInfo(@Param("elid") String elid, SoftwareInstanceMssqldbSoftwareInstallationRequestData body, @QueryMap(encoded=true) SoftwareInstanceMssqldbSoftwareInstallationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceMssqldbSoftwareInstallation</code> method in a fluent style.
   */
  public static class SoftwareInstanceMssqldbSoftwareInstallationQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceMssqldbSoftwareInstallationQueryParams sessionId(final String value) {
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
   * @return SoftwareInstanceMssqldbSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareInstanceMssqldbSystemAttributesResponse softwareInstanceMssqldbSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>softwareInstanceMssqldbSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareInstanceMssqldbSystemAttributesResponse> softwareInstanceMssqldbSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareInstanceMssqldbSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>softwareInstanceMssqldbSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareInstanceMssqldbSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareInstanceMssqldbSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareInstanceMssqldbSystemAttributesResponse softwareInstanceMssqldbSystemAttributes(@Param("elid") String elid, SoftwareInstanceMssqldbSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstanceMssqldbSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>softwareInstanceMssqldbSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareInstanceMssqldbSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareInstanceMssqldbSystemAttributesResponse> softwareInstanceMssqldbSystemAttributesWithHttpInfo(@Param("elid") String elid, SoftwareInstanceMssqldbSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareInstanceMssqldbSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareInstanceMssqldbSystemAttributes</code> method in a fluent style.
   */
  public static class SoftwareInstanceMssqldbSystemAttributesQueryParams extends HashMap<String, Object> {
    public SoftwareInstanceMssqldbSystemAttributesQueryParams sessionId(final String value) {
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
   * @return UpdateSoftwareInstanceMssqldbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSoftwareInstanceMssqldbResponse updateSoftwareInstanceMssqldb(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstanceMssqldbRequestData body);

  /**
   * Modify
   * Similar to <code>updateSoftwareInstanceMssqldb</code> but it also returns the http response headers .
   * Modify software instance
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSoftwareInstanceMssqldbResponse> updateSoftwareInstanceMssqldbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareInstanceMssqldbRequestData body);


  /**
   * Modify
   * Modify software instance
   * Note, this is equivalent to the other <code>updateSoftwareInstanceMssqldb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSoftwareInstanceMssqldbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSoftwareInstanceMssqldbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSoftwareInstanceMssqldbResponse updateSoftwareInstanceMssqldb(@Param("elid") String elid, UpdateSoftwareInstanceMssqldbRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstanceMssqldbQueryParams queryParams);

  /**
  * Modify
  * Modify software instance
  * Note, this is equivalent to the other <code>updateSoftwareInstanceMssqldb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSoftwareInstanceMssqldbResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSoftwareInstanceMssqldbResponse> updateSoftwareInstanceMssqldbWithHttpInfo(@Param("elid") String elid, UpdateSoftwareInstanceMssqldbRequestData body, @QueryMap(encoded=true) UpdateSoftwareInstanceMssqldbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSoftwareInstanceMssqldb</code> method in a fluent style.
   */
  public static class UpdateSoftwareInstanceMssqldbQueryParams extends HashMap<String, Object> {
    public UpdateSoftwareInstanceMssqldbQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSoftwareInstanceMssqldbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstanceMssqldbResponse updateSystemAttributesSoftwareInstanceMssqldb(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceMssqldbRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSoftwareInstanceMssqldb</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSoftwareInstanceMssqldbResponse> updateSystemAttributesSoftwareInstanceMssqldbWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceMssqldbRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstanceMssqldb</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSoftwareInstanceMssqldbQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSoftwareInstanceMssqldbResponse
   */
  @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareInstanceMssqldbResponse updateSystemAttributesSoftwareInstanceMssqldb(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceMssqldbRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstanceMssqldbQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareInstanceMssqldb</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSoftwareInstanceMssqldbResponse
      */
      @RequestLine("POST /api/rest/entity/softwareInstanceMssqldb/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSoftwareInstanceMssqldbResponse> updateSystemAttributesSoftwareInstanceMssqldbWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSoftwareInstanceMssqldbRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareInstanceMssqldbQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSoftwareInstanceMssqldb</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSoftwareInstanceMssqldbQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSoftwareInstanceMssqldbQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
