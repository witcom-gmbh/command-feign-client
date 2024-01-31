package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateSoftwareProductRequestData;
import com.fntsoftware.businessgateway.entities.CreateSoftwareProductResponse;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareProductRequestData;
import com.fntsoftware.businessgateway.entities.DeleteSoftwareProductResponse;
import com.fntsoftware.businessgateway.entities.SoftwareProductApplicationReleasesRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareProductApplicationReleasesResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareProductCiClassesRequest;
import com.fntsoftware.businessgateway.entities.SoftwareProductCiClassesResponse;
import com.fntsoftware.businessgateway.entities.SoftwareProductContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareProductContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareProductDeviceMasterRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareProductDeviceMasterResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareProductFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareProductFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareProductMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareProductMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareProductOperatingSystemInstallationsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareProductOperatingSystemInstallationsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareProductOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareProductOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareProductPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareProductPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareProductPersonsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareProductPersonsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareProductQueryRequest;
import com.fntsoftware.businessgateway.entities.SoftwareProductQueryResponse;
import com.fntsoftware.businessgateway.entities.SoftwareProductSoftwareInstallationsRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareProductSoftwareInstallationsResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareProductSoftwareLicensesRequestData;
import com.fntsoftware.businessgateway.entities.SoftwareProductSoftwareLicensesResponseData;
import com.fntsoftware.businessgateway.entities.SoftwareProductSoftwareReleasesRequest;
import com.fntsoftware.businessgateway.entities.SoftwareProductSoftwareReleasesResponse;
import com.fntsoftware.businessgateway.entities.SoftwareProductSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.SoftwareProductSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareProductRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSoftwareProductResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareProductRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesSoftwareProductResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface SoftwareProductApi extends ApiClient.Api {


  /**
   * Create
   * Create software product
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateSoftwareProductResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateSoftwareProductResponse createSoftwareProduct(@Param("sessionId") String sessionId, CreateSoftwareProductRequestData body);

  /**
   * Create
   * Similar to <code>createSoftwareProduct</code> but it also returns the http response headers .
   * Create software product
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateSoftwareProductResponse> createSoftwareProductWithHttpInfo(@Param("sessionId") String sessionId, CreateSoftwareProductRequestData body);


  /**
   * Create
   * Create software product
   * Note, this is equivalent to the other <code>createSoftwareProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateSoftwareProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateSoftwareProductResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateSoftwareProductResponse createSoftwareProduct(CreateSoftwareProductRequestData body, @QueryMap(encoded=true) CreateSoftwareProductQueryParams queryParams);

  /**
  * Create
  * Create software product
  * Note, this is equivalent to the other <code>createSoftwareProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateSoftwareProductResponse
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateSoftwareProductResponse> createSoftwareProductWithHttpInfo(CreateSoftwareProductRequestData body, @QueryMap(encoded=true) CreateSoftwareProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createSoftwareProduct</code> method in a fluent style.
   */
  public static class CreateSoftwareProductQueryParams extends HashMap<String, Object> {
    public CreateSoftwareProductQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete software product
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteSoftwareProductResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteSoftwareProductResponse deleteSoftwareProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareProductRequestData body);

  /**
   * Delete
   * Similar to <code>deleteSoftwareProduct</code> but it also returns the http response headers .
   * Delete software product
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteSoftwareProductResponse> deleteSoftwareProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteSoftwareProductRequestData body);


  /**
   * Delete
   * Delete software product
   * Note, this is equivalent to the other <code>deleteSoftwareProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteSoftwareProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteSoftwareProductResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteSoftwareProductResponse deleteSoftwareProduct(@Param("elid") String elid, DeleteSoftwareProductRequestData body, @QueryMap(encoded=true) DeleteSoftwareProductQueryParams queryParams);

  /**
  * Delete
  * Delete software product
  * Note, this is equivalent to the other <code>deleteSoftwareProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteSoftwareProductResponse
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteSoftwareProductResponse> deleteSoftwareProductWithHttpInfo(@Param("elid") String elid, DeleteSoftwareProductRequestData body, @QueryMap(encoded=true) DeleteSoftwareProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteSoftwareProduct</code> method in a fluent style.
   */
  public static class DeleteSoftwareProductQueryParams extends HashMap<String, Object> {
    public DeleteSoftwareProductQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Application Release entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareProductApplicationReleasesResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/ApplicationReleases?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductApplicationReleasesResponseData softwareProductApplicationReleases(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductApplicationReleasesRequestData body);

  /**
   * Get relations to Application Release entities
   * Similar to <code>softwareProductApplicationReleases</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/ApplicationReleases?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductApplicationReleasesResponseData> softwareProductApplicationReleasesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductApplicationReleasesRequestData body);


  /**
   * Get relations to Application Release entities
   * 
   * Note, this is equivalent to the other <code>softwareProductApplicationReleases</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductApplicationReleasesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductApplicationReleasesResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/ApplicationReleases?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductApplicationReleasesResponseData softwareProductApplicationReleases(@Param("elid") String elid, SoftwareProductApplicationReleasesRequestData body, @QueryMap(encoded=true) SoftwareProductApplicationReleasesQueryParams queryParams);

  /**
  * Get relations to Application Release entities
  * 
  * Note, this is equivalent to the other <code>softwareProductApplicationReleases</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductApplicationReleasesResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/ApplicationReleases?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductApplicationReleasesResponseData> softwareProductApplicationReleasesWithHttpInfo(@Param("elid") String elid, SoftwareProductApplicationReleasesRequestData body, @QueryMap(encoded=true) SoftwareProductApplicationReleasesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductApplicationReleases</code> method in a fluent style.
   */
  public static class SoftwareProductApplicationReleasesQueryParams extends HashMap<String, Object> {
    public SoftwareProductApplicationReleasesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * CI class query
   * Queries the enabled CI classes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareProductCiClassesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/CiClasses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductCiClassesResponse softwareProductCiClasses(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductCiClassesRequest body);

  /**
   * CI class query
   * Similar to <code>softwareProductCiClasses</code> but it also returns the http response headers .
   * Queries the enabled CI classes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/CiClasses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductCiClassesResponse> softwareProductCiClassesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductCiClassesRequest body);


  /**
   * CI class query
   * Queries the enabled CI classes
   * Note, this is equivalent to the other <code>softwareProductCiClasses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductCiClassesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductCiClassesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/CiClasses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductCiClassesResponse softwareProductCiClasses(@Param("elid") String elid, SoftwareProductCiClassesRequest body, @QueryMap(encoded=true) SoftwareProductCiClassesQueryParams queryParams);

  /**
  * CI class query
  * Queries the enabled CI classes
  * Note, this is equivalent to the other <code>softwareProductCiClasses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductCiClassesResponse
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/CiClasses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductCiClassesResponse> softwareProductCiClassesWithHttpInfo(@Param("elid") String elid, SoftwareProductCiClassesRequest body, @QueryMap(encoded=true) SoftwareProductCiClassesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductCiClasses</code> method in a fluent style.
   */
  public static class SoftwareProductCiClassesQueryParams extends HashMap<String, Object> {
    public SoftwareProductCiClassesQueryParams sessionId(final String value) {
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
   * @return SoftwareProductContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductContractsResponseData softwareProductContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>softwareProductContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductContractsResponseData> softwareProductContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>softwareProductContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductContractsResponseData softwareProductContracts(@Param("elid") String elid, SoftwareProductContractsRequestData body, @QueryMap(encoded=true) SoftwareProductContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>softwareProductContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductContractsResponseData> softwareProductContractsWithHttpInfo(@Param("elid") String elid, SoftwareProductContractsRequestData body, @QueryMap(encoded=true) SoftwareProductContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductContracts</code> method in a fluent style.
   */
  public static class SoftwareProductContractsQueryParams extends HashMap<String, Object> {
    public SoftwareProductContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Device master entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareProductDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductDeviceMasterResponseData softwareProductDeviceMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductDeviceMasterRequestData body);

  /**
   * Get relations to Device master entities
   * Similar to <code>softwareProductDeviceMaster</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductDeviceMasterResponseData> softwareProductDeviceMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductDeviceMasterRequestData body);


  /**
   * Get relations to Device master entities
   * 
   * Note, this is equivalent to the other <code>softwareProductDeviceMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductDeviceMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductDeviceMasterResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/DeviceMaster?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductDeviceMasterResponseData softwareProductDeviceMaster(@Param("elid") String elid, SoftwareProductDeviceMasterRequestData body, @QueryMap(encoded=true) SoftwareProductDeviceMasterQueryParams queryParams);

  /**
  * Get relations to Device master entities
  * 
  * Note, this is equivalent to the other <code>softwareProductDeviceMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductDeviceMasterResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/DeviceMaster?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductDeviceMasterResponseData> softwareProductDeviceMasterWithHttpInfo(@Param("elid") String elid, SoftwareProductDeviceMasterRequestData body, @QueryMap(encoded=true) SoftwareProductDeviceMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductDeviceMaster</code> method in a fluent style.
   */
  public static class SoftwareProductDeviceMasterQueryParams extends HashMap<String, Object> {
    public SoftwareProductDeviceMasterQueryParams sessionId(final String value) {
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
   * @return SoftwareProductFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductFrameContractsResponseData softwareProductFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>softwareProductFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductFrameContractsResponseData> softwareProductFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>softwareProductFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductFrameContractsResponseData softwareProductFrameContracts(@Param("elid") String elid, SoftwareProductFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareProductFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>softwareProductFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductFrameContractsResponseData> softwareProductFrameContractsWithHttpInfo(@Param("elid") String elid, SoftwareProductFrameContractsRequestData body, @QueryMap(encoded=true) SoftwareProductFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductFrameContracts</code> method in a fluent style.
   */
  public static class SoftwareProductFrameContractsQueryParams extends HashMap<String, Object> {
    public SoftwareProductFrameContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareProductMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductMaintenanceContractsResponseData softwareProductMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>softwareProductMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductMaintenanceContractsResponseData> softwareProductMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>softwareProductMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductMaintenanceContractsResponseData softwareProductMaintenanceContracts(@Param("elid") String elid, SoftwareProductMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareProductMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>softwareProductMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductMaintenanceContractsResponseData> softwareProductMaintenanceContractsWithHttpInfo(@Param("elid") String elid, SoftwareProductMaintenanceContractsRequestData body, @QueryMap(encoded=true) SoftwareProductMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductMaintenanceContracts</code> method in a fluent style.
   */
  public static class SoftwareProductMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public SoftwareProductMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return SoftwareProductOperatingSystemInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/OperatingSystemInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductOperatingSystemInstallationsResponseData softwareProductOperatingSystemInstallations(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductOperatingSystemInstallationsRequestData body);

  /**
   * Get relations to Operating system installation entities
   * Similar to <code>softwareProductOperatingSystemInstallations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/OperatingSystemInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductOperatingSystemInstallationsResponseData> softwareProductOperatingSystemInstallationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductOperatingSystemInstallationsRequestData body);


  /**
   * Get relations to Operating system installation entities
   * 
   * Note, this is equivalent to the other <code>softwareProductOperatingSystemInstallations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductOperatingSystemInstallationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductOperatingSystemInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/OperatingSystemInstallations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductOperatingSystemInstallationsResponseData softwareProductOperatingSystemInstallations(@Param("elid") String elid, SoftwareProductOperatingSystemInstallationsRequestData body, @QueryMap(encoded=true) SoftwareProductOperatingSystemInstallationsQueryParams queryParams);

  /**
  * Get relations to Operating system installation entities
  * 
  * Note, this is equivalent to the other <code>softwareProductOperatingSystemInstallations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductOperatingSystemInstallationsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/OperatingSystemInstallations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductOperatingSystemInstallationsResponseData> softwareProductOperatingSystemInstallationsWithHttpInfo(@Param("elid") String elid, SoftwareProductOperatingSystemInstallationsRequestData body, @QueryMap(encoded=true) SoftwareProductOperatingSystemInstallationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductOperatingSystemInstallations</code> method in a fluent style.
   */
  public static class SoftwareProductOperatingSystemInstallationsQueryParams extends HashMap<String, Object> {
    public SoftwareProductOperatingSystemInstallationsQueryParams sessionId(final String value) {
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
   * @return SoftwareProductOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductOrganizationsResponseData softwareProductOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>softwareProductOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductOrganizationsResponseData> softwareProductOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>softwareProductOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductOrganizationsResponseData softwareProductOrganizations(@Param("elid") String elid, SoftwareProductOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareProductOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>softwareProductOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductOrganizationsResponseData> softwareProductOrganizationsWithHttpInfo(@Param("elid") String elid, SoftwareProductOrganizationsRequestData body, @QueryMap(encoded=true) SoftwareProductOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductOrganizations</code> method in a fluent style.
   */
  public static class SoftwareProductOrganizationsQueryParams extends HashMap<String, Object> {
    public SoftwareProductOrganizationsQueryParams sessionId(final String value) {
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
   * @return SoftwareProductPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductPersonGroupsResponseData softwareProductPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>softwareProductPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductPersonGroupsResponseData> softwareProductPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>softwareProductPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductPersonGroupsResponseData softwareProductPersonGroups(@Param("elid") String elid, SoftwareProductPersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareProductPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>softwareProductPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductPersonGroupsResponseData> softwareProductPersonGroupsWithHttpInfo(@Param("elid") String elid, SoftwareProductPersonGroupsRequestData body, @QueryMap(encoded=true) SoftwareProductPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductPersonGroups</code> method in a fluent style.
   */
  public static class SoftwareProductPersonGroupsQueryParams extends HashMap<String, Object> {
    public SoftwareProductPersonGroupsQueryParams sessionId(final String value) {
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
   * @return SoftwareProductPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductPersonsResponseData softwareProductPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>softwareProductPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductPersonsResponseData> softwareProductPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>softwareProductPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductPersonsResponseData softwareProductPersons(@Param("elid") String elid, SoftwareProductPersonsRequestData body, @QueryMap(encoded=true) SoftwareProductPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>softwareProductPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductPersonsResponseData> softwareProductPersonsWithHttpInfo(@Param("elid") String elid, SoftwareProductPersonsRequestData body, @QueryMap(encoded=true) SoftwareProductPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductPersons</code> method in a fluent style.
   */
  public static class SoftwareProductPersonsQueryParams extends HashMap<String, Object> {
    public SoftwareProductPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SoftwareProductQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductQueryResponse softwareProductQuery(@Param("sessionId") String sessionId, SoftwareProductQueryRequest body);

  /**
   * Basic query
   * Similar to <code>softwareProductQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductQueryResponse> softwareProductQueryWithHttpInfo(@Param("sessionId") String sessionId, SoftwareProductQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>softwareProductQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductQueryResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductQueryResponse softwareProductQuery(SoftwareProductQueryRequest body, @QueryMap(encoded=true) SoftwareProductQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>softwareProductQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductQueryResponse
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductQueryResponse> softwareProductQueryWithHttpInfo(SoftwareProductQueryRequest body, @QueryMap(encoded=true) SoftwareProductQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductQuery</code> method in a fluent style.
   */
  public static class SoftwareProductQueryQueryParams extends HashMap<String, Object> {
    public SoftwareProductQueryQueryParams sessionId(final String value) {
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
   * @return SoftwareProductSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductSoftwareInstallationsResponseData softwareProductSoftwareInstallations(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductSoftwareInstallationsRequestData body);

  /**
   * Get relations to Software installation entities
   * Similar to <code>softwareProductSoftwareInstallations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductSoftwareInstallationsResponseData> softwareProductSoftwareInstallationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductSoftwareInstallationsRequestData body);


  /**
   * Get relations to Software installation entities
   * 
   * Note, this is equivalent to the other <code>softwareProductSoftwareInstallations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductSoftwareInstallationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductSoftwareInstallationsResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SoftwareInstallations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductSoftwareInstallationsResponseData softwareProductSoftwareInstallations(@Param("elid") String elid, SoftwareProductSoftwareInstallationsRequestData body, @QueryMap(encoded=true) SoftwareProductSoftwareInstallationsQueryParams queryParams);

  /**
  * Get relations to Software installation entities
  * 
  * Note, this is equivalent to the other <code>softwareProductSoftwareInstallations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductSoftwareInstallationsResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SoftwareInstallations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductSoftwareInstallationsResponseData> softwareProductSoftwareInstallationsWithHttpInfo(@Param("elid") String elid, SoftwareProductSoftwareInstallationsRequestData body, @QueryMap(encoded=true) SoftwareProductSoftwareInstallationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductSoftwareInstallations</code> method in a fluent style.
   */
  public static class SoftwareProductSoftwareInstallationsQueryParams extends HashMap<String, Object> {
    public SoftwareProductSoftwareInstallationsQueryParams sessionId(final String value) {
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
   * @return SoftwareProductSoftwareLicensesResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductSoftwareLicensesResponseData softwareProductSoftwareLicenses(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductSoftwareLicensesRequestData body);

  /**
   * Get relations to Software license entities
   * Similar to <code>softwareProductSoftwareLicenses</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductSoftwareLicensesResponseData> softwareProductSoftwareLicensesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductSoftwareLicensesRequestData body);


  /**
   * Get relations to Software license entities
   * 
   * Note, this is equivalent to the other <code>softwareProductSoftwareLicenses</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductSoftwareLicensesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductSoftwareLicensesResponseData
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SoftwareLicenses?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductSoftwareLicensesResponseData softwareProductSoftwareLicenses(@Param("elid") String elid, SoftwareProductSoftwareLicensesRequestData body, @QueryMap(encoded=true) SoftwareProductSoftwareLicensesQueryParams queryParams);

  /**
  * Get relations to Software license entities
  * 
  * Note, this is equivalent to the other <code>softwareProductSoftwareLicenses</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductSoftwareLicensesResponseData
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SoftwareLicenses?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductSoftwareLicensesResponseData> softwareProductSoftwareLicensesWithHttpInfo(@Param("elid") String elid, SoftwareProductSoftwareLicensesRequestData body, @QueryMap(encoded=true) SoftwareProductSoftwareLicensesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductSoftwareLicenses</code> method in a fluent style.
   */
  public static class SoftwareProductSoftwareLicensesQueryParams extends HashMap<String, Object> {
    public SoftwareProductSoftwareLicensesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Software release query
   * Queries the software releases
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return SoftwareProductSoftwareReleasesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SoftwareReleases?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductSoftwareReleasesResponse softwareProductSoftwareReleases(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductSoftwareReleasesRequest body);

  /**
   * Software release query
   * Similar to <code>softwareProductSoftwareReleases</code> but it also returns the http response headers .
   * Queries the software releases
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SoftwareReleases?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductSoftwareReleasesResponse> softwareProductSoftwareReleasesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductSoftwareReleasesRequest body);


  /**
   * Software release query
   * Queries the software releases
   * Note, this is equivalent to the other <code>softwareProductSoftwareReleases</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductSoftwareReleasesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductSoftwareReleasesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SoftwareReleases?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductSoftwareReleasesResponse softwareProductSoftwareReleases(@Param("elid") String elid, SoftwareProductSoftwareReleasesRequest body, @QueryMap(encoded=true) SoftwareProductSoftwareReleasesQueryParams queryParams);

  /**
  * Software release query
  * Queries the software releases
  * Note, this is equivalent to the other <code>softwareProductSoftwareReleases</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductSoftwareReleasesResponse
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SoftwareReleases?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductSoftwareReleasesResponse> softwareProductSoftwareReleasesWithHttpInfo(@Param("elid") String elid, SoftwareProductSoftwareReleasesRequest body, @QueryMap(encoded=true) SoftwareProductSoftwareReleasesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductSoftwareReleases</code> method in a fluent style.
   */
  public static class SoftwareProductSoftwareReleasesQueryParams extends HashMap<String, Object> {
    public SoftwareProductSoftwareReleasesQueryParams sessionId(final String value) {
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
   * @return SoftwareProductSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SoftwareProductSystemAttributesResponse softwareProductSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>softwareProductSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SoftwareProductSystemAttributesResponse> softwareProductSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, SoftwareProductSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>softwareProductSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SoftwareProductSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SoftwareProductSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SoftwareProductSystemAttributesResponse softwareProductSystemAttributes(@Param("elid") String elid, SoftwareProductSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareProductSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>softwareProductSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SoftwareProductSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SoftwareProductSystemAttributesResponse> softwareProductSystemAttributesWithHttpInfo(@Param("elid") String elid, SoftwareProductSystemAttributesRequest body, @QueryMap(encoded=true) SoftwareProductSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>softwareProductSystemAttributes</code> method in a fluent style.
   */
  public static class SoftwareProductSystemAttributesQueryParams extends HashMap<String, Object> {
    public SoftwareProductSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify software product
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSoftwareProductResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSoftwareProductResponse updateSoftwareProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareProductRequestData body);

  /**
   * Modify
   * Similar to <code>updateSoftwareProduct</code> but it also returns the http response headers .
   * Modify software product
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSoftwareProductResponse> updateSoftwareProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSoftwareProductRequestData body);


  /**
   * Modify
   * Modify software product
   * Note, this is equivalent to the other <code>updateSoftwareProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSoftwareProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSoftwareProductResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSoftwareProductResponse updateSoftwareProduct(@Param("elid") String elid, UpdateSoftwareProductRequestData body, @QueryMap(encoded=true) UpdateSoftwareProductQueryParams queryParams);

  /**
  * Modify
  * Modify software product
  * Note, this is equivalent to the other <code>updateSoftwareProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSoftwareProductResponse
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSoftwareProductResponse> updateSoftwareProductWithHttpInfo(@Param("elid") String elid, UpdateSoftwareProductRequestData body, @QueryMap(encoded=true) UpdateSoftwareProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSoftwareProduct</code> method in a fluent style.
   */
  public static class UpdateSoftwareProductQueryParams extends HashMap<String, Object> {
    public UpdateSoftwareProductQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesSoftwareProductResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareProductResponse updateSystemAttributesSoftwareProduct(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareProductRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesSoftwareProduct</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesSoftwareProductResponse> updateSystemAttributesSoftwareProductWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesSoftwareProductRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareProduct</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesSoftwareProductQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesSoftwareProductResponse
   */
  @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesSoftwareProductResponse updateSystemAttributesSoftwareProduct(@Param("elid") String elid, UpdateSystemAttributesSoftwareProductRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareProductQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesSoftwareProduct</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesSoftwareProductResponse
      */
      @RequestLine("POST /api/rest/entity/softwareProduct/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesSoftwareProductResponse> updateSystemAttributesSoftwareProductWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesSoftwareProductRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesSoftwareProductQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesSoftwareProduct</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesSoftwareProductQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesSoftwareProductQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
