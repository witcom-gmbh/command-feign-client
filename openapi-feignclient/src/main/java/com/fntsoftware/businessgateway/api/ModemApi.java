package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateModemRequestData;
import com.fntsoftware.businessgateway.entities.CreateModemResponse;
import com.fntsoftware.businessgateway.entities.DeleteModemRequestData;
import com.fntsoftware.businessgateway.entities.DeleteModemResponse;
import com.fntsoftware.businessgateway.entities.ModemQueryRequest;
import com.fntsoftware.businessgateway.entities.ModemQueryResponse;
import com.fntsoftware.businessgateway.entities.ModemServerRequestData;
import com.fntsoftware.businessgateway.entities.ModemServerResponseData;
import com.fntsoftware.businessgateway.entities.ModemSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.ModemSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.UpdateModemRequestData;
import com.fntsoftware.businessgateway.entities.UpdateModemResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesModemRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesModemResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface ModemApi extends ApiClient.Api {


  /**
   * Create
   * Create modem
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateModemResponse
   */
  @RequestLine("POST /api/rest/entity/modem/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateModemResponse createModem(@Param("sessionId") String sessionId, CreateModemRequestData body);

  /**
   * Create
   * Similar to <code>createModem</code> but it also returns the http response headers .
   * Create modem
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/modem/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateModemResponse> createModemWithHttpInfo(@Param("sessionId") String sessionId, CreateModemRequestData body);


  /**
   * Create
   * Create modem
   * Note, this is equivalent to the other <code>createModem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateModemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateModemResponse
   */
  @RequestLine("POST /api/rest/entity/modem/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateModemResponse createModem(CreateModemRequestData body, @QueryMap(encoded=true) CreateModemQueryParams queryParams);

  /**
  * Create
  * Create modem
  * Note, this is equivalent to the other <code>createModem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateModemResponse
      */
      @RequestLine("POST /api/rest/entity/modem/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateModemResponse> createModemWithHttpInfo(CreateModemRequestData body, @QueryMap(encoded=true) CreateModemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createModem</code> method in a fluent style.
   */
  public static class CreateModemQueryParams extends HashMap<String, Object> {
    public CreateModemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete modem
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteModemResponse
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteModemResponse deleteModem(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteModemRequestData body);

  /**
   * Delete
   * Similar to <code>deleteModem</code> but it also returns the http response headers .
   * Delete modem
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteModemResponse> deleteModemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteModemRequestData body);


  /**
   * Delete
   * Delete modem
   * Note, this is equivalent to the other <code>deleteModem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteModemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteModemResponse
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteModemResponse deleteModem(@Param("elid") String elid, DeleteModemRequestData body, @QueryMap(encoded=true) DeleteModemQueryParams queryParams);

  /**
  * Delete
  * Delete modem
  * Note, this is equivalent to the other <code>deleteModem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteModemResponse
      */
      @RequestLine("POST /api/rest/entity/modem/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteModemResponse> deleteModemWithHttpInfo(@Param("elid") String elid, DeleteModemRequestData body, @QueryMap(encoded=true) DeleteModemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteModem</code> method in a fluent style.
   */
  public static class DeleteModemQueryParams extends HashMap<String, Object> {
    public DeleteModemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return ModemQueryResponse
   */
  @RequestLine("POST /api/rest/entity/modem/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModemQueryResponse modemQuery(@Param("sessionId") String sessionId, ModemQueryRequest body);

  /**
   * Basic query
   * Similar to <code>modemQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/modem/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModemQueryResponse> modemQueryWithHttpInfo(@Param("sessionId") String sessionId, ModemQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>modemQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModemQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModemQueryResponse
   */
  @RequestLine("POST /api/rest/entity/modem/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModemQueryResponse modemQuery(ModemQueryRequest body, @QueryMap(encoded=true) ModemQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>modemQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModemQueryResponse
      */
      @RequestLine("POST /api/rest/entity/modem/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModemQueryResponse> modemQueryWithHttpInfo(ModemQueryRequest body, @QueryMap(encoded=true) ModemQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>modemQuery</code> method in a fluent style.
   */
  public static class ModemQueryQueryParams extends HashMap<String, Object> {
    public ModemQueryQueryParams sessionId(final String value) {
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
   * @return ModemServerResponseData
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModemServerResponseData modemServer(@Param("sessionId") String sessionId, @Param("elid") String elid, ModemServerRequestData body);

  /**
   * Get relations to Server entities
   * Similar to <code>modemServer</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/Server?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModemServerResponseData> modemServerWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModemServerRequestData body);


  /**
   * Get relations to Server entities
   * 
   * Note, this is equivalent to the other <code>modemServer</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModemServerQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModemServerResponseData
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/Server?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModemServerResponseData modemServer(@Param("elid") String elid, ModemServerRequestData body, @QueryMap(encoded=true) ModemServerQueryParams queryParams);

  /**
  * Get relations to Server entities
  * 
  * Note, this is equivalent to the other <code>modemServer</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModemServerResponseData
      */
      @RequestLine("POST /api/rest/entity/modem/{elid}/Server?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModemServerResponseData> modemServerWithHttpInfo(@Param("elid") String elid, ModemServerRequestData body, @QueryMap(encoded=true) ModemServerQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>modemServer</code> method in a fluent style.
   */
  public static class ModemServerQueryParams extends HashMap<String, Object> {
    public ModemServerQueryParams sessionId(final String value) {
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
   * @return ModemSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ModemSystemAttributesResponse modemSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, ModemSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>modemSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ModemSystemAttributesResponse> modemSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, ModemSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>modemSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ModemSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ModemSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ModemSystemAttributesResponse modemSystemAttributes(@Param("elid") String elid, ModemSystemAttributesRequest body, @QueryMap(encoded=true) ModemSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>modemSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ModemSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/modem/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ModemSystemAttributesResponse> modemSystemAttributesWithHttpInfo(@Param("elid") String elid, ModemSystemAttributesRequest body, @QueryMap(encoded=true) ModemSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>modemSystemAttributes</code> method in a fluent style.
   */
  public static class ModemSystemAttributesQueryParams extends HashMap<String, Object> {
    public ModemSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify modem
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateModemResponse
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateModemResponse updateModem(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateModemRequestData body);

  /**
   * Modify
   * Similar to <code>updateModem</code> but it also returns the http response headers .
   * Modify modem
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateModemResponse> updateModemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateModemRequestData body);


  /**
   * Modify
   * Modify modem
   * Note, this is equivalent to the other <code>updateModem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateModemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateModemResponse
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateModemResponse updateModem(@Param("elid") String elid, UpdateModemRequestData body, @QueryMap(encoded=true) UpdateModemQueryParams queryParams);

  /**
  * Modify
  * Modify modem
  * Note, this is equivalent to the other <code>updateModem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateModemResponse
      */
      @RequestLine("POST /api/rest/entity/modem/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateModemResponse> updateModemWithHttpInfo(@Param("elid") String elid, UpdateModemRequestData body, @QueryMap(encoded=true) UpdateModemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateModem</code> method in a fluent style.
   */
  public static class UpdateModemQueryParams extends HashMap<String, Object> {
    public UpdateModemQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesModemResponse
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesModemResponse updateSystemAttributesModem(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesModemRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesModem</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesModemResponse> updateSystemAttributesModemWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesModemRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesModem</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesModemQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesModemResponse
   */
  @RequestLine("POST /api/rest/entity/modem/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesModemResponse updateSystemAttributesModem(@Param("elid") String elid, UpdateSystemAttributesModemRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesModemQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesModem</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesModemResponse
      */
      @RequestLine("POST /api/rest/entity/modem/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesModemResponse> updateSystemAttributesModemWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesModemRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesModemQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesModem</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesModemQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesModemQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
