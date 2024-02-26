package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.ChangeTraySectionTypeTraySectionRequestData;
import com.fntsoftware.businessgateway.entities.ChangeTraySectionTypeTraySectionResponse;
import com.fntsoftware.businessgateway.entities.CreateTraySectionRequestData;
import com.fntsoftware.businessgateway.entities.CreateTraySectionResponse;
import com.fntsoftware.businessgateway.entities.DeleteTraySectionRequestData;
import com.fntsoftware.businessgateway.entities.DeleteTraySectionResponse;
import com.fntsoftware.businessgateway.entities.LoopInNodeTraySectionRequestData;
import com.fntsoftware.businessgateway.entities.LoopInNodeTraySectionResponse;
import com.fntsoftware.businessgateway.entities.TraySectionContractsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionContractsResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionDataCablesRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionDataCablesResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionDuctsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionDuctsResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionFrameContractsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionFrameContractsResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionFromNodeRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionFromNodeResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionMaintenanceContractsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionMaintenanceContractsResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionPersonsRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionPersonsResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionQueryRequest;
import com.fntsoftware.businessgateway.entities.TraySectionQueryResponse;
import com.fntsoftware.businessgateway.entities.TraySectionSegmentContentRequest;
import com.fntsoftware.businessgateway.entities.TraySectionSegmentContentResponse;
import com.fntsoftware.businessgateway.entities.TraySectionSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.TraySectionSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.TraySectionToNodeRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionToNodeResponseData;
import com.fntsoftware.businessgateway.entities.TraySectionTraySectionTypeRequestData;
import com.fntsoftware.businessgateway.entities.TraySectionTraySectionTypeResponseData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTraySectionRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesTraySectionResponse;
import com.fntsoftware.businessgateway.entities.UpdateTraySectionRequestData;
import com.fntsoftware.businessgateway.entities.UpdateTraySectionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface TraySectionApi extends ApiClient.Api {


  /**
   * Replace tray section type
   * Swap the Tray section type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return ChangeTraySectionTypeTraySectionResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/changeTraySectionType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ChangeTraySectionTypeTraySectionResponse changeTraySectionTypeTraySection(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTraySectionTypeTraySectionRequestData body);

  /**
   * Replace tray section type
   * Similar to <code>changeTraySectionTypeTraySection</code> but it also returns the http response headers .
   * Swap the Tray section type
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/changeTraySectionType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ChangeTraySectionTypeTraySectionResponse> changeTraySectionTypeTraySectionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ChangeTraySectionTypeTraySectionRequestData body);


  /**
   * Replace tray section type
   * Swap the Tray section type
   * Note, this is equivalent to the other <code>changeTraySectionTypeTraySection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ChangeTraySectionTypeTraySectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ChangeTraySectionTypeTraySectionResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/changeTraySectionType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ChangeTraySectionTypeTraySectionResponse changeTraySectionTypeTraySection(@Param("elid") String elid, ChangeTraySectionTypeTraySectionRequestData body, @QueryMap(encoded=true) ChangeTraySectionTypeTraySectionQueryParams queryParams);

  /**
  * Replace tray section type
  * Swap the Tray section type
  * Note, this is equivalent to the other <code>changeTraySectionTypeTraySection</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ChangeTraySectionTypeTraySectionResponse
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/changeTraySectionType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ChangeTraySectionTypeTraySectionResponse> changeTraySectionTypeTraySectionWithHttpInfo(@Param("elid") String elid, ChangeTraySectionTypeTraySectionRequestData body, @QueryMap(encoded=true) ChangeTraySectionTypeTraySectionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>changeTraySectionTypeTraySection</code> method in a fluent style.
   */
  public static class ChangeTraySectionTypeTraySectionQueryParams extends HashMap<String, Object> {
    public ChangeTraySectionTypeTraySectionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create
   * Create Tray section
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateTraySectionResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateTraySectionResponse createTraySection(@Param("sessionId") String sessionId, CreateTraySectionRequestData body);

  /**
   * Create
   * Similar to <code>createTraySection</code> but it also returns the http response headers .
   * Create Tray section
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateTraySectionResponse> createTraySectionWithHttpInfo(@Param("sessionId") String sessionId, CreateTraySectionRequestData body);


  /**
   * Create
   * Create Tray section
   * Note, this is equivalent to the other <code>createTraySection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateTraySectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateTraySectionResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateTraySectionResponse createTraySection(CreateTraySectionRequestData body, @QueryMap(encoded=true) CreateTraySectionQueryParams queryParams);

  /**
  * Create
  * Create Tray section
  * Note, this is equivalent to the other <code>createTraySection</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateTraySectionResponse
      */
      @RequestLine("POST /api/rest/entity/traySection/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateTraySectionResponse> createTraySectionWithHttpInfo(CreateTraySectionRequestData body, @QueryMap(encoded=true) CreateTraySectionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createTraySection</code> method in a fluent style.
   */
  public static class CreateTraySectionQueryParams extends HashMap<String, Object> {
    public CreateTraySectionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Tray section
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteTraySectionResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteTraySectionResponse deleteTraySection(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteTraySectionRequestData body);

  /**
   * Delete
   * Similar to <code>deleteTraySection</code> but it also returns the http response headers .
   * Delete Tray section
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteTraySectionResponse> deleteTraySectionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteTraySectionRequestData body);


  /**
   * Delete
   * Delete Tray section
   * Note, this is equivalent to the other <code>deleteTraySection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteTraySectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteTraySectionResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteTraySectionResponse deleteTraySection(@Param("elid") String elid, DeleteTraySectionRequestData body, @QueryMap(encoded=true) DeleteTraySectionQueryParams queryParams);

  /**
  * Delete
  * Delete Tray section
  * Note, this is equivalent to the other <code>deleteTraySection</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteTraySectionResponse
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteTraySectionResponse> deleteTraySectionWithHttpInfo(@Param("elid") String elid, DeleteTraySectionRequestData body, @QueryMap(encoded=true) DeleteTraySectionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteTraySection</code> method in a fluent style.
   */
  public static class DeleteTraySectionQueryParams extends HashMap<String, Object> {
    public DeleteTraySectionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Loop-in node
   * Loop in node
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return LoopInNodeTraySectionResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/loopInNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LoopInNodeTraySectionResponse loopInNodeTraySection(@Param("sessionId") String sessionId, @Param("elid") String elid, LoopInNodeTraySectionRequestData body);

  /**
   * Loop-in node
   * Similar to <code>loopInNodeTraySection</code> but it also returns the http response headers .
   * Loop in node
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/loopInNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LoopInNodeTraySectionResponse> loopInNodeTraySectionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, LoopInNodeTraySectionRequestData body);


  /**
   * Loop-in node
   * Loop in node
   * Note, this is equivalent to the other <code>loopInNodeTraySection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LoopInNodeTraySectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LoopInNodeTraySectionResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/loopInNode?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LoopInNodeTraySectionResponse loopInNodeTraySection(@Param("elid") String elid, LoopInNodeTraySectionRequestData body, @QueryMap(encoded=true) LoopInNodeTraySectionQueryParams queryParams);

  /**
  * Loop-in node
  * Loop in node
  * Note, this is equivalent to the other <code>loopInNodeTraySection</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LoopInNodeTraySectionResponse
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/loopInNode?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LoopInNodeTraySectionResponse> loopInNodeTraySectionWithHttpInfo(@Param("elid") String elid, LoopInNodeTraySectionRequestData body, @QueryMap(encoded=true) LoopInNodeTraySectionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>loopInNodeTraySection</code> method in a fluent style.
   */
  public static class LoopInNodeTraySectionQueryParams extends HashMap<String, Object> {
    public LoopInNodeTraySectionQueryParams sessionId(final String value) {
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
   * @return TraySectionContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionContractsResponseData traySectionContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionContractsRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>traySectionContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionContractsResponseData> traySectionContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionContractsRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>traySectionContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/Contracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionContractsResponseData traySectionContracts(@Param("elid") String elid, TraySectionContractsRequestData body, @QueryMap(encoded=true) TraySectionContractsQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>traySectionContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/Contracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionContractsResponseData> traySectionContractsWithHttpInfo(@Param("elid") String elid, TraySectionContractsRequestData body, @QueryMap(encoded=true) TraySectionContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionContracts</code> method in a fluent style.
   */
  public static class TraySectionContractsQueryParams extends HashMap<String, Object> {
    public TraySectionContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Data cable entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionDataCablesResponseData traySectionDataCables(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionDataCablesRequestData body);

  /**
   * Get relations to Data cable entities
   * Similar to <code>traySectionDataCables</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionDataCablesResponseData> traySectionDataCablesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionDataCablesRequestData body);


  /**
   * Get relations to Data cable entities
   * 
   * Note, this is equivalent to the other <code>traySectionDataCables</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionDataCablesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionDataCablesResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/DataCables?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionDataCablesResponseData traySectionDataCables(@Param("elid") String elid, TraySectionDataCablesRequestData body, @QueryMap(encoded=true) TraySectionDataCablesQueryParams queryParams);

  /**
  * Get relations to Data cable entities
  * 
  * Note, this is equivalent to the other <code>traySectionDataCables</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionDataCablesResponseData
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/DataCables?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionDataCablesResponseData> traySectionDataCablesWithHttpInfo(@Param("elid") String elid, TraySectionDataCablesRequestData body, @QueryMap(encoded=true) TraySectionDataCablesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionDataCables</code> method in a fluent style.
   */
  public static class TraySectionDataCablesQueryParams extends HashMap<String, Object> {
    public TraySectionDataCablesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Duct entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionDuctsResponseData traySectionDucts(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionDuctsRequestData body);

  /**
   * Get relations to Duct entities
   * Similar to <code>traySectionDucts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionDuctsResponseData> traySectionDuctsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionDuctsRequestData body);


  /**
   * Get relations to Duct entities
   * 
   * Note, this is equivalent to the other <code>traySectionDucts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionDuctsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionDuctsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/Ducts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionDuctsResponseData traySectionDucts(@Param("elid") String elid, TraySectionDuctsRequestData body, @QueryMap(encoded=true) TraySectionDuctsQueryParams queryParams);

  /**
  * Get relations to Duct entities
  * 
  * Note, this is equivalent to the other <code>traySectionDucts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionDuctsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/Ducts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionDuctsResponseData> traySectionDuctsWithHttpInfo(@Param("elid") String elid, TraySectionDuctsRequestData body, @QueryMap(encoded=true) TraySectionDuctsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionDucts</code> method in a fluent style.
   */
  public static class TraySectionDuctsQueryParams extends HashMap<String, Object> {
    public TraySectionDuctsQueryParams sessionId(final String value) {
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
   * @return TraySectionFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionFrameContractsResponseData traySectionFrameContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionFrameContractsRequestData body);

  /**
   * Get relations to Frame contract entities
   * Similar to <code>traySectionFrameContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionFrameContractsResponseData> traySectionFrameContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionFrameContractsRequestData body);


  /**
   * Get relations to Frame contract entities
   * 
   * Note, this is equivalent to the other <code>traySectionFrameContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionFrameContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionFrameContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/FrameContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionFrameContractsResponseData traySectionFrameContracts(@Param("elid") String elid, TraySectionFrameContractsRequestData body, @QueryMap(encoded=true) TraySectionFrameContractsQueryParams queryParams);

  /**
  * Get relations to Frame contract entities
  * 
  * Note, this is equivalent to the other <code>traySectionFrameContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionFrameContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/FrameContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionFrameContractsResponseData> traySectionFrameContractsWithHttpInfo(@Param("elid") String elid, TraySectionFrameContractsRequestData body, @QueryMap(encoded=true) TraySectionFrameContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionFrameContracts</code> method in a fluent style.
   */
  public static class TraySectionFrameContractsQueryParams extends HashMap<String, Object> {
    public TraySectionFrameContractsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Node entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionFromNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/FromNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionFromNodeResponseData traySectionFromNode(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionFromNodeRequestData body);

  /**
   * Get relations to Node entities
   * Similar to <code>traySectionFromNode</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/FromNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionFromNodeResponseData> traySectionFromNodeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionFromNodeRequestData body);


  /**
   * Get relations to Node entities
   * 
   * Note, this is equivalent to the other <code>traySectionFromNode</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionFromNodeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionFromNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/FromNode?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionFromNodeResponseData traySectionFromNode(@Param("elid") String elid, TraySectionFromNodeRequestData body, @QueryMap(encoded=true) TraySectionFromNodeQueryParams queryParams);

  /**
  * Get relations to Node entities
  * 
  * Note, this is equivalent to the other <code>traySectionFromNode</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionFromNodeResponseData
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/FromNode?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionFromNodeResponseData> traySectionFromNodeWithHttpInfo(@Param("elid") String elid, TraySectionFromNodeRequestData body, @QueryMap(encoded=true) TraySectionFromNodeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionFromNode</code> method in a fluent style.
   */
  public static class TraySectionFromNodeQueryParams extends HashMap<String, Object> {
    public TraySectionFromNodeQueryParams sessionId(final String value) {
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
   * @return TraySectionMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionMaintenanceContractsResponseData traySectionMaintenanceContracts(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionMaintenanceContractsRequestData body);

  /**
   * Get relations to Maintenance contract entities
   * Similar to <code>traySectionMaintenanceContracts</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionMaintenanceContractsResponseData> traySectionMaintenanceContractsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionMaintenanceContractsRequestData body);


  /**
   * Get relations to Maintenance contract entities
   * 
   * Note, this is equivalent to the other <code>traySectionMaintenanceContracts</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionMaintenanceContractsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionMaintenanceContractsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/MaintenanceContracts?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionMaintenanceContractsResponseData traySectionMaintenanceContracts(@Param("elid") String elid, TraySectionMaintenanceContractsRequestData body, @QueryMap(encoded=true) TraySectionMaintenanceContractsQueryParams queryParams);

  /**
  * Get relations to Maintenance contract entities
  * 
  * Note, this is equivalent to the other <code>traySectionMaintenanceContracts</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionMaintenanceContractsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/MaintenanceContracts?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionMaintenanceContractsResponseData> traySectionMaintenanceContractsWithHttpInfo(@Param("elid") String elid, TraySectionMaintenanceContractsRequestData body, @QueryMap(encoded=true) TraySectionMaintenanceContractsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionMaintenanceContracts</code> method in a fluent style.
   */
  public static class TraySectionMaintenanceContractsQueryParams extends HashMap<String, Object> {
    public TraySectionMaintenanceContractsQueryParams sessionId(final String value) {
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
   * @return TraySectionOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionOrganizationsResponseData traySectionOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>traySectionOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionOrganizationsResponseData> traySectionOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>traySectionOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionOrganizationsResponseData traySectionOrganizations(@Param("elid") String elid, TraySectionOrganizationsRequestData body, @QueryMap(encoded=true) TraySectionOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>traySectionOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionOrganizationsResponseData> traySectionOrganizationsWithHttpInfo(@Param("elid") String elid, TraySectionOrganizationsRequestData body, @QueryMap(encoded=true) TraySectionOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionOrganizations</code> method in a fluent style.
   */
  public static class TraySectionOrganizationsQueryParams extends HashMap<String, Object> {
    public TraySectionOrganizationsQueryParams sessionId(final String value) {
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
   * @return TraySectionPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionPersonGroupsResponseData traySectionPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>traySectionPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionPersonGroupsResponseData> traySectionPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>traySectionPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionPersonGroupsResponseData traySectionPersonGroups(@Param("elid") String elid, TraySectionPersonGroupsRequestData body, @QueryMap(encoded=true) TraySectionPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>traySectionPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionPersonGroupsResponseData> traySectionPersonGroupsWithHttpInfo(@Param("elid") String elid, TraySectionPersonGroupsRequestData body, @QueryMap(encoded=true) TraySectionPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionPersonGroups</code> method in a fluent style.
   */
  public static class TraySectionPersonGroupsQueryParams extends HashMap<String, Object> {
    public TraySectionPersonGroupsQueryParams sessionId(final String value) {
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
   * @return TraySectionPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionPersonsResponseData traySectionPersons(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionPersonsRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>traySectionPersons</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/Persons?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionPersonsResponseData> traySectionPersonsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionPersonsRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>traySectionPersons</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionPersonsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionPersonsResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/Persons?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionPersonsResponseData traySectionPersons(@Param("elid") String elid, TraySectionPersonsRequestData body, @QueryMap(encoded=true) TraySectionPersonsQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>traySectionPersons</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionPersonsResponseData
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/Persons?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionPersonsResponseData> traySectionPersonsWithHttpInfo(@Param("elid") String elid, TraySectionPersonsRequestData body, @QueryMap(encoded=true) TraySectionPersonsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionPersons</code> method in a fluent style.
   */
  public static class TraySectionPersonsQueryParams extends HashMap<String, Object> {
    public TraySectionPersonsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return TraySectionQueryResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionQueryResponse traySectionQuery(@Param("sessionId") String sessionId, TraySectionQueryRequest body);

  /**
   * Basic query
   * Similar to <code>traySectionQuery</code> but it also returns the http response headers .
   * Query for querying all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionQueryResponse> traySectionQueryWithHttpInfo(@Param("sessionId") String sessionId, TraySectionQueryRequest body);


  /**
   * Basic query
   * Query for querying all basic target entity data
   * Note, this is equivalent to the other <code>traySectionQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionQueryResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionQueryResponse traySectionQuery(TraySectionQueryRequest body, @QueryMap(encoded=true) TraySectionQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for querying all basic target entity data
  * Note, this is equivalent to the other <code>traySectionQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionQueryResponse
      */
      @RequestLine("POST /api/rest/entity/traySection/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionQueryResponse> traySectionQueryWithHttpInfo(TraySectionQueryRequest body, @QueryMap(encoded=true) TraySectionQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionQuery</code> method in a fluent style.
   */
  public static class TraySectionQueryQueryParams extends HashMap<String, Object> {
    public TraySectionQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query segment content
   * Query of all objects of the segment content.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionSegmentContentResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/SegmentContent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionSegmentContentResponse traySectionSegmentContent(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionSegmentContentRequest body);

  /**
   * Query segment content
   * Similar to <code>traySectionSegmentContent</code> but it also returns the http response headers .
   * Query of all objects of the segment content.
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/SegmentContent?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionSegmentContentResponse> traySectionSegmentContentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionSegmentContentRequest body);


  /**
   * Query segment content
   * Query of all objects of the segment content.
   * Note, this is equivalent to the other <code>traySectionSegmentContent</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionSegmentContentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionSegmentContentResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/SegmentContent?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionSegmentContentResponse traySectionSegmentContent(@Param("elid") String elid, TraySectionSegmentContentRequest body, @QueryMap(encoded=true) TraySectionSegmentContentQueryParams queryParams);

  /**
  * Query segment content
  * Query of all objects of the segment content.
  * Note, this is equivalent to the other <code>traySectionSegmentContent</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionSegmentContentResponse
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/SegmentContent?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionSegmentContentResponse> traySectionSegmentContentWithHttpInfo(@Param("elid") String elid, TraySectionSegmentContentRequest body, @QueryMap(encoded=true) TraySectionSegmentContentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionSegmentContent</code> method in a fluent style.
   */
  public static class TraySectionSegmentContentQueryParams extends HashMap<String, Object> {
    public TraySectionSegmentContentQueryParams sessionId(final String value) {
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
   * @return TraySectionSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionSystemAttributesResponse traySectionSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>traySectionSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionSystemAttributesResponse> traySectionSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>traySectionSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionSystemAttributesResponse traySectionSystemAttributes(@Param("elid") String elid, TraySectionSystemAttributesRequest body, @QueryMap(encoded=true) TraySectionSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>traySectionSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionSystemAttributesResponse> traySectionSystemAttributesWithHttpInfo(@Param("elid") String elid, TraySectionSystemAttributesRequest body, @QueryMap(encoded=true) TraySectionSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionSystemAttributes</code> method in a fluent style.
   */
  public static class TraySectionSystemAttributesQueryParams extends HashMap<String, Object> {
    public TraySectionSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Node entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionToNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/ToNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionToNodeResponseData traySectionToNode(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionToNodeRequestData body);

  /**
   * Get relations to Node entities
   * Similar to <code>traySectionToNode</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/ToNode?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionToNodeResponseData> traySectionToNodeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionToNodeRequestData body);


  /**
   * Get relations to Node entities
   * 
   * Note, this is equivalent to the other <code>traySectionToNode</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionToNodeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionToNodeResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/ToNode?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionToNodeResponseData traySectionToNode(@Param("elid") String elid, TraySectionToNodeRequestData body, @QueryMap(encoded=true) TraySectionToNodeQueryParams queryParams);

  /**
  * Get relations to Node entities
  * 
  * Note, this is equivalent to the other <code>traySectionToNode</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionToNodeResponseData
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/ToNode?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionToNodeResponseData> traySectionToNodeWithHttpInfo(@Param("elid") String elid, TraySectionToNodeRequestData body, @QueryMap(encoded=true) TraySectionToNodeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionToNode</code> method in a fluent style.
   */
  public static class TraySectionToNodeQueryParams extends HashMap<String, Object> {
    public TraySectionToNodeQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Tray section type entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return TraySectionTraySectionTypeResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/TraySectionType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  TraySectionTraySectionTypeResponseData traySectionTraySectionType(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTraySectionTypeRequestData body);

  /**
   * Get relations to Tray section type entities
   * Similar to <code>traySectionTraySectionType</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/TraySectionType?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<TraySectionTraySectionTypeResponseData> traySectionTraySectionTypeWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, TraySectionTraySectionTypeRequestData body);


  /**
   * Get relations to Tray section type entities
   * 
   * Note, this is equivalent to the other <code>traySectionTraySectionType</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link TraySectionTraySectionTypeQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return TraySectionTraySectionTypeResponseData
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/TraySectionType?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  TraySectionTraySectionTypeResponseData traySectionTraySectionType(@Param("elid") String elid, TraySectionTraySectionTypeRequestData body, @QueryMap(encoded=true) TraySectionTraySectionTypeQueryParams queryParams);

  /**
  * Get relations to Tray section type entities
  * 
  * Note, this is equivalent to the other <code>traySectionTraySectionType</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return TraySectionTraySectionTypeResponseData
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/TraySectionType?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<TraySectionTraySectionTypeResponseData> traySectionTraySectionTypeWithHttpInfo(@Param("elid") String elid, TraySectionTraySectionTypeRequestData body, @QueryMap(encoded=true) TraySectionTraySectionTypeQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>traySectionTraySectionType</code> method in a fluent style.
   */
  public static class TraySectionTraySectionTypeQueryParams extends HashMap<String, Object> {
    public TraySectionTraySectionTypeQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesTraySectionResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesTraySectionResponse updateSystemAttributesTraySection(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTraySectionRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesTraySection</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesTraySectionResponse> updateSystemAttributesTraySectionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesTraySectionRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesTraySection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesTraySectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesTraySectionResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesTraySectionResponse updateSystemAttributesTraySection(@Param("elid") String elid, UpdateSystemAttributesTraySectionRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTraySectionQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesTraySection</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesTraySectionResponse
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesTraySectionResponse> updateSystemAttributesTraySectionWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesTraySectionRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesTraySectionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesTraySection</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesTraySectionQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesTraySectionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Tray section
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateTraySectionResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateTraySectionResponse updateTraySection(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateTraySectionRequestData body);

  /**
   * Modify
   * Similar to <code>updateTraySection</code> but it also returns the http response headers .
   * Modify Tray section
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateTraySectionResponse> updateTraySectionWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateTraySectionRequestData body);


  /**
   * Modify
   * Modify Tray section
   * Note, this is equivalent to the other <code>updateTraySection</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateTraySectionQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateTraySectionResponse
   */
  @RequestLine("POST /api/rest/entity/traySection/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateTraySectionResponse updateTraySection(@Param("elid") String elid, UpdateTraySectionRequestData body, @QueryMap(encoded=true) UpdateTraySectionQueryParams queryParams);

  /**
  * Modify
  * Modify Tray section
  * Note, this is equivalent to the other <code>updateTraySection</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateTraySectionResponse
      */
      @RequestLine("POST /api/rest/entity/traySection/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateTraySectionResponse> updateTraySectionWithHttpInfo(@Param("elid") String elid, UpdateTraySectionRequestData body, @QueryMap(encoded=true) UpdateTraySectionQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateTraySection</code> method in a fluent style.
   */
  public static class UpdateTraySectionQueryParams extends HashMap<String, Object> {
    public UpdateTraySectionQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
