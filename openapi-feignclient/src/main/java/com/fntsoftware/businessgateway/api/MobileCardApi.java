package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CancelSimCardMobileCardRequestData;
import com.fntsoftware.businessgateway.entities.CancelSimCardMobileCardResponse;
import com.fntsoftware.businessgateway.entities.DeleteMobileCardRequestData;
import com.fntsoftware.businessgateway.entities.DeleteMobileCardResponse;
import com.fntsoftware.businessgateway.entities.LockSimCardMobileCardResponse;
import com.fntsoftware.businessgateway.entities.MobileCardCellTelephoneServicesRequestData;
import com.fntsoftware.businessgateway.entities.MobileCardCellTelephoneServicesResponseData;
import com.fntsoftware.businessgateway.entities.MobileCardContractRequestData;
import com.fntsoftware.businessgateway.entities.MobileCardContractResponseData;
import com.fntsoftware.businessgateway.entities.MobileCardDataOptionsRequestData;
import com.fntsoftware.businessgateway.entities.MobileCardDataOptionsResponseData;
import com.fntsoftware.businessgateway.entities.MobileCardDevicesAllRequestData;
import com.fntsoftware.businessgateway.entities.MobileCardDevicesAllResponseData;
import com.fntsoftware.businessgateway.entities.MobileCardOrganizationsRequestData;
import com.fntsoftware.businessgateway.entities.MobileCardOrganizationsResponseData;
import com.fntsoftware.businessgateway.entities.MobileCardPersonGroupsRequestData;
import com.fntsoftware.businessgateway.entities.MobileCardPersonGroupsResponseData;
import com.fntsoftware.businessgateway.entities.MobileCardPersonRequestData;
import com.fntsoftware.businessgateway.entities.MobileCardPersonResponseData;
import com.fntsoftware.businessgateway.entities.MobileCardQueryRequest;
import com.fntsoftware.businessgateway.entities.MobileCardQueryResponse;
import com.fntsoftware.businessgateway.entities.MobileCardSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.MobileCardSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.ReactivateSimCardMobileCardResponse;
import com.fntsoftware.businessgateway.entities.UnlockSimCardMobileCardResponse;
import com.fntsoftware.businessgateway.entities.UpdateMobileCardRequestData;
import com.fntsoftware.businessgateway.entities.UpdateMobileCardResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMobileCardRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesMobileCardResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface MobileCardApi extends ApiClient.Api {


  /**
   * Cancel SIM card
   * Cancel SIM card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CancelSimCardMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/cancelSimCard?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CancelSimCardMobileCardResponse cancelSimCardMobileCard(@Param("sessionId") String sessionId, @Param("elid") String elid, CancelSimCardMobileCardRequestData body);

  /**
   * Cancel SIM card
   * Similar to <code>cancelSimCardMobileCard</code> but it also returns the http response headers .
   * Cancel SIM card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/cancelSimCard?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CancelSimCardMobileCardResponse> cancelSimCardMobileCardWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CancelSimCardMobileCardRequestData body);


  /**
   * Cancel SIM card
   * Cancel SIM card
   * Note, this is equivalent to the other <code>cancelSimCardMobileCard</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CancelSimCardMobileCardQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CancelSimCardMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/cancelSimCard?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CancelSimCardMobileCardResponse cancelSimCardMobileCard(@Param("elid") String elid, CancelSimCardMobileCardRequestData body, @QueryMap(encoded=true) CancelSimCardMobileCardQueryParams queryParams);

  /**
  * Cancel SIM card
  * Cancel SIM card
  * Note, this is equivalent to the other <code>cancelSimCardMobileCard</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CancelSimCardMobileCardResponse
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/cancelSimCard?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CancelSimCardMobileCardResponse> cancelSimCardMobileCardWithHttpInfo(@Param("elid") String elid, CancelSimCardMobileCardRequestData body, @QueryMap(encoded=true) CancelSimCardMobileCardQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>cancelSimCardMobileCard</code> method in a fluent style.
   */
  public static class CancelSimCardMobileCardQueryParams extends HashMap<String, Object> {
    public CancelSimCardMobileCardQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete SIM card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteMobileCardResponse deleteMobileCard(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteMobileCardRequestData body);

  /**
   * Delete
   * Similar to <code>deleteMobileCard</code> but it also returns the http response headers .
   * Delete SIM card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteMobileCardResponse> deleteMobileCardWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteMobileCardRequestData body);


  /**
   * Delete
   * Delete SIM card
   * Note, this is equivalent to the other <code>deleteMobileCard</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteMobileCardQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteMobileCardResponse deleteMobileCard(@Param("elid") String elid, DeleteMobileCardRequestData body, @QueryMap(encoded=true) DeleteMobileCardQueryParams queryParams);

  /**
  * Delete
  * Delete SIM card
  * Note, this is equivalent to the other <code>deleteMobileCard</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteMobileCardResponse
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteMobileCardResponse> deleteMobileCardWithHttpInfo(@Param("elid") String elid, DeleteMobileCardRequestData body, @QueryMap(encoded=true) DeleteMobileCardQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteMobileCard</code> method in a fluent style.
   */
  public static class DeleteMobileCardQueryParams extends HashMap<String, Object> {
    public DeleteMobileCardQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Lock SIM card
   * Lock SIM card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return LockSimCardMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/lockSimCard?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  LockSimCardMobileCardResponse lockSimCardMobileCard(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);

  /**
   * Lock SIM card
   * Similar to <code>lockSimCardMobileCard</code> but it also returns the http response headers .
   * Lock SIM card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/lockSimCard?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<LockSimCardMobileCardResponse> lockSimCardMobileCardWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);


  /**
   * Lock SIM card
   * Lock SIM card
   * Note, this is equivalent to the other <code>lockSimCardMobileCard</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link LockSimCardMobileCardQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return LockSimCardMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/lockSimCard?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  LockSimCardMobileCardResponse lockSimCardMobileCard(@Param("elid") String elid, Object body, @QueryMap(encoded=true) LockSimCardMobileCardQueryParams queryParams);

  /**
  * Lock SIM card
  * Lock SIM card
  * Note, this is equivalent to the other <code>lockSimCardMobileCard</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return LockSimCardMobileCardResponse
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/lockSimCard?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<LockSimCardMobileCardResponse> lockSimCardMobileCardWithHttpInfo(@Param("elid") String elid, Object body, @QueryMap(encoded=true) LockSimCardMobileCardQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>lockSimCardMobileCard</code> method in a fluent style.
   */
  public static class LockSimCardMobileCardQueryParams extends HashMap<String, Object> {
    public LockSimCardMobileCardQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Cell telephone service entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MobileCardCellTelephoneServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/CellTelephoneServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MobileCardCellTelephoneServicesResponseData mobileCardCellTelephoneServices(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardCellTelephoneServicesRequestData body);

  /**
   * Get relations to Cell telephone service entities
   * Similar to <code>mobileCardCellTelephoneServices</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/CellTelephoneServices?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MobileCardCellTelephoneServicesResponseData> mobileCardCellTelephoneServicesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardCellTelephoneServicesRequestData body);


  /**
   * Get relations to Cell telephone service entities
   * 
   * Note, this is equivalent to the other <code>mobileCardCellTelephoneServices</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MobileCardCellTelephoneServicesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MobileCardCellTelephoneServicesResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/CellTelephoneServices?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MobileCardCellTelephoneServicesResponseData mobileCardCellTelephoneServices(@Param("elid") String elid, MobileCardCellTelephoneServicesRequestData body, @QueryMap(encoded=true) MobileCardCellTelephoneServicesQueryParams queryParams);

  /**
  * Get relations to Cell telephone service entities
  * 
  * Note, this is equivalent to the other <code>mobileCardCellTelephoneServices</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MobileCardCellTelephoneServicesResponseData
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/CellTelephoneServices?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MobileCardCellTelephoneServicesResponseData> mobileCardCellTelephoneServicesWithHttpInfo(@Param("elid") String elid, MobileCardCellTelephoneServicesRequestData body, @QueryMap(encoded=true) MobileCardCellTelephoneServicesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mobileCardCellTelephoneServices</code> method in a fluent style.
   */
  public static class MobileCardCellTelephoneServicesQueryParams extends HashMap<String, Object> {
    public MobileCardCellTelephoneServicesQueryParams sessionId(final String value) {
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
   * @return MobileCardContractResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/Contract?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MobileCardContractResponseData mobileCardContract(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardContractRequestData body);

  /**
   * Get relations to Contract entities
   * Similar to <code>mobileCardContract</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/Contract?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MobileCardContractResponseData> mobileCardContractWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardContractRequestData body);


  /**
   * Get relations to Contract entities
   * 
   * Note, this is equivalent to the other <code>mobileCardContract</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MobileCardContractQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MobileCardContractResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/Contract?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MobileCardContractResponseData mobileCardContract(@Param("elid") String elid, MobileCardContractRequestData body, @QueryMap(encoded=true) MobileCardContractQueryParams queryParams);

  /**
  * Get relations to Contract entities
  * 
  * Note, this is equivalent to the other <code>mobileCardContract</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MobileCardContractResponseData
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/Contract?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MobileCardContractResponseData> mobileCardContractWithHttpInfo(@Param("elid") String elid, MobileCardContractRequestData body, @QueryMap(encoded=true) MobileCardContractQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mobileCardContract</code> method in a fluent style.
   */
  public static class MobileCardContractQueryParams extends HashMap<String, Object> {
    public MobileCardContractQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Get relations to Data option entities
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return MobileCardDataOptionsResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/DataOptions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MobileCardDataOptionsResponseData mobileCardDataOptions(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardDataOptionsRequestData body);

  /**
   * Get relations to Data option entities
   * Similar to <code>mobileCardDataOptions</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/DataOptions?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MobileCardDataOptionsResponseData> mobileCardDataOptionsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardDataOptionsRequestData body);


  /**
   * Get relations to Data option entities
   * 
   * Note, this is equivalent to the other <code>mobileCardDataOptions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MobileCardDataOptionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MobileCardDataOptionsResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/DataOptions?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MobileCardDataOptionsResponseData mobileCardDataOptions(@Param("elid") String elid, MobileCardDataOptionsRequestData body, @QueryMap(encoded=true) MobileCardDataOptionsQueryParams queryParams);

  /**
  * Get relations to Data option entities
  * 
  * Note, this is equivalent to the other <code>mobileCardDataOptions</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MobileCardDataOptionsResponseData
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/DataOptions?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MobileCardDataOptionsResponseData> mobileCardDataOptionsWithHttpInfo(@Param("elid") String elid, MobileCardDataOptionsRequestData body, @QueryMap(encoded=true) MobileCardDataOptionsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mobileCardDataOptions</code> method in a fluent style.
   */
  public static class MobileCardDataOptionsQueryParams extends HashMap<String, Object> {
    public MobileCardDataOptionsQueryParams sessionId(final String value) {
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
   * @return MobileCardDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MobileCardDevicesAllResponseData mobileCardDevicesAll(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardDevicesAllRequestData body);

  /**
   * Get relations to Device (all) entities
   * Similar to <code>mobileCardDevicesAll</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MobileCardDevicesAllResponseData> mobileCardDevicesAllWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardDevicesAllRequestData body);


  /**
   * Get relations to Device (all) entities
   * 
   * Note, this is equivalent to the other <code>mobileCardDevicesAll</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MobileCardDevicesAllQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MobileCardDevicesAllResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/DevicesAll?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MobileCardDevicesAllResponseData mobileCardDevicesAll(@Param("elid") String elid, MobileCardDevicesAllRequestData body, @QueryMap(encoded=true) MobileCardDevicesAllQueryParams queryParams);

  /**
  * Get relations to Device (all) entities
  * 
  * Note, this is equivalent to the other <code>mobileCardDevicesAll</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MobileCardDevicesAllResponseData
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/DevicesAll?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MobileCardDevicesAllResponseData> mobileCardDevicesAllWithHttpInfo(@Param("elid") String elid, MobileCardDevicesAllRequestData body, @QueryMap(encoded=true) MobileCardDevicesAllQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mobileCardDevicesAll</code> method in a fluent style.
   */
  public static class MobileCardDevicesAllQueryParams extends HashMap<String, Object> {
    public MobileCardDevicesAllQueryParams sessionId(final String value) {
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
   * @return MobileCardOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MobileCardOrganizationsResponseData mobileCardOrganizations(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardOrganizationsRequestData body);

  /**
   * Get relations to Organization entities
   * Similar to <code>mobileCardOrganizations</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MobileCardOrganizationsResponseData> mobileCardOrganizationsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardOrganizationsRequestData body);


  /**
   * Get relations to Organization entities
   * 
   * Note, this is equivalent to the other <code>mobileCardOrganizations</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MobileCardOrganizationsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MobileCardOrganizationsResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/Organizations?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MobileCardOrganizationsResponseData mobileCardOrganizations(@Param("elid") String elid, MobileCardOrganizationsRequestData body, @QueryMap(encoded=true) MobileCardOrganizationsQueryParams queryParams);

  /**
  * Get relations to Organization entities
  * 
  * Note, this is equivalent to the other <code>mobileCardOrganizations</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MobileCardOrganizationsResponseData
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/Organizations?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MobileCardOrganizationsResponseData> mobileCardOrganizationsWithHttpInfo(@Param("elid") String elid, MobileCardOrganizationsRequestData body, @QueryMap(encoded=true) MobileCardOrganizationsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mobileCardOrganizations</code> method in a fluent style.
   */
  public static class MobileCardOrganizationsQueryParams extends HashMap<String, Object> {
    public MobileCardOrganizationsQueryParams sessionId(final String value) {
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
   * @return MobileCardPersonResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/Person?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MobileCardPersonResponseData mobileCardPerson(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardPersonRequestData body);

  /**
   * Get relations to Person entities
   * Similar to <code>mobileCardPerson</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/Person?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MobileCardPersonResponseData> mobileCardPersonWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardPersonRequestData body);


  /**
   * Get relations to Person entities
   * 
   * Note, this is equivalent to the other <code>mobileCardPerson</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MobileCardPersonQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MobileCardPersonResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/Person?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MobileCardPersonResponseData mobileCardPerson(@Param("elid") String elid, MobileCardPersonRequestData body, @QueryMap(encoded=true) MobileCardPersonQueryParams queryParams);

  /**
  * Get relations to Person entities
  * 
  * Note, this is equivalent to the other <code>mobileCardPerson</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MobileCardPersonResponseData
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/Person?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MobileCardPersonResponseData> mobileCardPersonWithHttpInfo(@Param("elid") String elid, MobileCardPersonRequestData body, @QueryMap(encoded=true) MobileCardPersonQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mobileCardPerson</code> method in a fluent style.
   */
  public static class MobileCardPersonQueryParams extends HashMap<String, Object> {
    public MobileCardPersonQueryParams sessionId(final String value) {
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
   * @return MobileCardPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MobileCardPersonGroupsResponseData mobileCardPersonGroups(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardPersonGroupsRequestData body);

  /**
   * Get relations to Person group entities
   * Similar to <code>mobileCardPersonGroups</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MobileCardPersonGroupsResponseData> mobileCardPersonGroupsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardPersonGroupsRequestData body);


  /**
   * Get relations to Person group entities
   * 
   * Note, this is equivalent to the other <code>mobileCardPersonGroups</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MobileCardPersonGroupsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MobileCardPersonGroupsResponseData
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/PersonGroups?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MobileCardPersonGroupsResponseData mobileCardPersonGroups(@Param("elid") String elid, MobileCardPersonGroupsRequestData body, @QueryMap(encoded=true) MobileCardPersonGroupsQueryParams queryParams);

  /**
  * Get relations to Person group entities
  * 
  * Note, this is equivalent to the other <code>mobileCardPersonGroups</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MobileCardPersonGroupsResponseData
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/PersonGroups?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MobileCardPersonGroupsResponseData> mobileCardPersonGroupsWithHttpInfo(@Param("elid") String elid, MobileCardPersonGroupsRequestData body, @QueryMap(encoded=true) MobileCardPersonGroupsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mobileCardPersonGroups</code> method in a fluent style.
   */
  public static class MobileCardPersonGroupsQueryParams extends HashMap<String, Object> {
    public MobileCardPersonGroupsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return MobileCardQueryResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MobileCardQueryResponse mobileCardQuery(@Param("sessionId") String sessionId, MobileCardQueryRequest body);

  /**
   * Basic query
   * Similar to <code>mobileCardQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MobileCardQueryResponse> mobileCardQueryWithHttpInfo(@Param("sessionId") String sessionId, MobileCardQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>mobileCardQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MobileCardQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MobileCardQueryResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MobileCardQueryResponse mobileCardQuery(MobileCardQueryRequest body, @QueryMap(encoded=true) MobileCardQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>mobileCardQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MobileCardQueryResponse
      */
      @RequestLine("POST /api/rest/entity/mobileCard/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MobileCardQueryResponse> mobileCardQueryWithHttpInfo(MobileCardQueryRequest body, @QueryMap(encoded=true) MobileCardQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mobileCardQuery</code> method in a fluent style.
   */
  public static class MobileCardQueryQueryParams extends HashMap<String, Object> {
    public MobileCardQueryQueryParams sessionId(final String value) {
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
   * @return MobileCardSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  MobileCardSystemAttributesResponse mobileCardSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>mobileCardSystemAttributes</code> but it also returns the http response headers .
   * Query for system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<MobileCardSystemAttributesResponse> mobileCardSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, MobileCardSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for system attributes
   * Note, this is equivalent to the other <code>mobileCardSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link MobileCardSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return MobileCardSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  MobileCardSystemAttributesResponse mobileCardSystemAttributes(@Param("elid") String elid, MobileCardSystemAttributesRequest body, @QueryMap(encoded=true) MobileCardSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for system attributes
  * Note, this is equivalent to the other <code>mobileCardSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return MobileCardSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<MobileCardSystemAttributesResponse> mobileCardSystemAttributesWithHttpInfo(@Param("elid") String elid, MobileCardSystemAttributesRequest body, @QueryMap(encoded=true) MobileCardSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>mobileCardSystemAttributes</code> method in a fluent style.
   */
  public static class MobileCardSystemAttributesQueryParams extends HashMap<String, Object> {
    public MobileCardSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Reactivate SIM card
   * Reactivate SIM card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return ReactivateSimCardMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/reactivateSimCard?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ReactivateSimCardMobileCardResponse reactivateSimCardMobileCard(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);

  /**
   * Reactivate SIM card
   * Similar to <code>reactivateSimCardMobileCard</code> but it also returns the http response headers .
   * Reactivate SIM card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/reactivateSimCard?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<ReactivateSimCardMobileCardResponse> reactivateSimCardMobileCardWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);


  /**
   * Reactivate SIM card
   * Reactivate SIM card
   * Note, this is equivalent to the other <code>reactivateSimCardMobileCard</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReactivateSimCardMobileCardQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return ReactivateSimCardMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/reactivateSimCard?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  ReactivateSimCardMobileCardResponse reactivateSimCardMobileCard(@Param("elid") String elid, Object body, @QueryMap(encoded=true) ReactivateSimCardMobileCardQueryParams queryParams);

  /**
  * Reactivate SIM card
  * Reactivate SIM card
  * Note, this is equivalent to the other <code>reactivateSimCardMobileCard</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return ReactivateSimCardMobileCardResponse
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/reactivateSimCard?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<ReactivateSimCardMobileCardResponse> reactivateSimCardMobileCardWithHttpInfo(@Param("elid") String elid, Object body, @QueryMap(encoded=true) ReactivateSimCardMobileCardQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>reactivateSimCardMobileCard</code> method in a fluent style.
   */
  public static class ReactivateSimCardMobileCardQueryParams extends HashMap<String, Object> {
    public ReactivateSimCardMobileCardQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Unlock SIM card
   * Unlock SIM card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return UnlockSimCardMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/unlockSimCard?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UnlockSimCardMobileCardResponse unlockSimCardMobileCard(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);

  /**
   * Unlock SIM card
   * Similar to <code>unlockSimCardMobileCard</code> but it also returns the http response headers .
   * Unlock SIM card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/unlockSimCard?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UnlockSimCardMobileCardResponse> unlockSimCardMobileCardWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, Object body);


  /**
   * Unlock SIM card
   * Unlock SIM card
   * Note, this is equivalent to the other <code>unlockSimCardMobileCard</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UnlockSimCardMobileCardQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (optional)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UnlockSimCardMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/unlockSimCard?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UnlockSimCardMobileCardResponse unlockSimCardMobileCard(@Param("elid") String elid, Object body, @QueryMap(encoded=true) UnlockSimCardMobileCardQueryParams queryParams);

  /**
  * Unlock SIM card
  * Unlock SIM card
  * Note, this is equivalent to the other <code>unlockSimCardMobileCard</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (optional)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UnlockSimCardMobileCardResponse
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/unlockSimCard?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UnlockSimCardMobileCardResponse> unlockSimCardMobileCardWithHttpInfo(@Param("elid") String elid, Object body, @QueryMap(encoded=true) UnlockSimCardMobileCardQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>unlockSimCardMobileCard</code> method in a fluent style.
   */
  public static class UnlockSimCardMobileCardQueryParams extends HashMap<String, Object> {
    public UnlockSimCardMobileCardQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify SIM card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateMobileCardResponse updateMobileCard(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateMobileCardRequestData body);

  /**
   * Modify
   * Similar to <code>updateMobileCard</code> but it also returns the http response headers .
   * Modify SIM card
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateMobileCardResponse> updateMobileCardWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateMobileCardRequestData body);


  /**
   * Modify
   * Modify SIM card
   * Note, this is equivalent to the other <code>updateMobileCard</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateMobileCardQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateMobileCardResponse updateMobileCard(@Param("elid") String elid, UpdateMobileCardRequestData body, @QueryMap(encoded=true) UpdateMobileCardQueryParams queryParams);

  /**
  * Modify
  * Modify SIM card
  * Note, this is equivalent to the other <code>updateMobileCard</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateMobileCardResponse
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateMobileCardResponse> updateMobileCardWithHttpInfo(@Param("elid") String elid, UpdateMobileCardRequestData body, @QueryMap(encoded=true) UpdateMobileCardQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateMobileCard</code> method in a fluent style.
   */
  public static class UpdateMobileCardQueryParams extends HashMap<String, Object> {
    public UpdateMobileCardQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Change system attributes
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateSystemAttributesMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesMobileCardResponse updateSystemAttributesMobileCard(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMobileCardRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesMobileCard</code> but it also returns the http response headers .
   * Change system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesMobileCardResponse> updateSystemAttributesMobileCardWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesMobileCardRequestData body);


  /**
   * Change system attributes
   * Change system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesMobileCard</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesMobileCardQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesMobileCardResponse
   */
  @RequestLine("POST /api/rest/entity/mobileCard/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesMobileCardResponse updateSystemAttributesMobileCard(@Param("elid") String elid, UpdateSystemAttributesMobileCardRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMobileCardQueryParams queryParams);

  /**
  * Change system attributes
  * Change system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesMobileCard</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesMobileCardResponse
      */
      @RequestLine("POST /api/rest/entity/mobileCard/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesMobileCardResponse> updateSystemAttributesMobileCardWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesMobileCardRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesMobileCardQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesMobileCard</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesMobileCardQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesMobileCardQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
