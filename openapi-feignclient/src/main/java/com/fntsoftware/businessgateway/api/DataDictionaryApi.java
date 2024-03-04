package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.DataDictionaryDataDictionaryRequest;
import com.fntsoftware.businessgateway.entities.DataDictionaryDataDictionaryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface DataDictionaryApi extends ApiClient.Api {


  /**
   * Query data dictionary
   * Supplies all values of a static or dynamic data dictionary.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return DataDictionaryDataDictionaryResponse
   */
  @RequestLine("POST /api/rest/entity/dataDictionary/dataDictionary?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DataDictionaryDataDictionaryResponse dataDictionaryDataDictionary(@Param("sessionId") String sessionId, DataDictionaryDataDictionaryRequest body);

  /**
   * Query data dictionary
   * Similar to <code>dataDictionaryDataDictionary</code> but it also returns the http response headers .
   * Supplies all values of a static or dynamic data dictionary.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/dataDictionary/dataDictionary?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DataDictionaryDataDictionaryResponse> dataDictionaryDataDictionaryWithHttpInfo(@Param("sessionId") String sessionId, DataDictionaryDataDictionaryRequest body);


  /**
   * Query data dictionary
   * Supplies all values of a static or dynamic data dictionary.
   * Note, this is equivalent to the other <code>dataDictionaryDataDictionary</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DataDictionaryDataDictionaryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DataDictionaryDataDictionaryResponse
   */
  @RequestLine("POST /api/rest/entity/dataDictionary/dataDictionary?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DataDictionaryDataDictionaryResponse dataDictionaryDataDictionary(DataDictionaryDataDictionaryRequest body, @QueryMap(encoded=true) DataDictionaryDataDictionaryQueryParams queryParams);

  /**
  * Query data dictionary
  * Supplies all values of a static or dynamic data dictionary.
  * Note, this is equivalent to the other <code>dataDictionaryDataDictionary</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DataDictionaryDataDictionaryResponse
      */
      @RequestLine("POST /api/rest/entity/dataDictionary/dataDictionary?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DataDictionaryDataDictionaryResponse> dataDictionaryDataDictionaryWithHttpInfo(DataDictionaryDataDictionaryRequest body, @QueryMap(encoded=true) DataDictionaryDataDictionaryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>dataDictionaryDataDictionary</code> method in a fluent style.
   */
  public static class DataDictionaryDataDictionaryQueryParams extends HashMap<String, Object> {
    public DataDictionaryDataDictionaryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
