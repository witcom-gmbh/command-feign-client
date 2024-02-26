package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AttachmentQueryRequest;
import com.fntsoftware.businessgateway.entities.AttachmentQueryResponse;
import com.fntsoftware.businessgateway.entities.AttachmentSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.AttachmentSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CreateLinkUrlAttachmentRequestData;
import com.fntsoftware.businessgateway.entities.CreateLinkUrlAttachmentResponse;
import com.fntsoftware.businessgateway.entities.DeleteAttachmentRequestData;
import com.fntsoftware.businessgateway.entities.DeleteAttachmentResponse;
import com.fntsoftware.businessgateway.entities.UpdateLinkUrlAttachmentRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLinkUrlAttachmentResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesAttachmentRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesAttachmentResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-26T11:20:24.990023935Z[Etc/UTC]")
public interface AttachmentApi extends ApiClient.Api {


  /**
   * Basic query
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return AttachmentQueryResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AttachmentQueryResponse attachmentQuery(@Param("sessionId") String sessionId, AttachmentQueryRequest body);

  /**
   * Basic query
   * Similar to <code>attachmentQuery</code> but it also returns the http response headers .
   * Query for all basic target entity data
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/attachment/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AttachmentQueryResponse> attachmentQueryWithHttpInfo(@Param("sessionId") String sessionId, AttachmentQueryRequest body);


  /**
   * Basic query
   * Query for all basic target entity data
   * Note, this is equivalent to the other <code>attachmentQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AttachmentQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AttachmentQueryResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AttachmentQueryResponse attachmentQuery(AttachmentQueryRequest body, @QueryMap(encoded=true) AttachmentQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for all basic target entity data
  * Note, this is equivalent to the other <code>attachmentQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AttachmentQueryResponse
      */
      @RequestLine("POST /api/rest/entity/attachment/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AttachmentQueryResponse> attachmentQueryWithHttpInfo(AttachmentQueryRequest body, @QueryMap(encoded=true) AttachmentQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>attachmentQuery</code> method in a fluent style.
   */
  public static class AttachmentQueryQueryParams extends HashMap<String, Object> {
    public AttachmentQueryQueryParams sessionId(final String value) {
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
   * @return AttachmentSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AttachmentSystemAttributesResponse attachmentSystemAttributes(@Param("sessionId") String sessionId, @Param("elid") String elid, AttachmentSystemAttributesRequest body);

  /**
   * Query system attributes
   * Similar to <code>attachmentSystemAttributes</code> but it also returns the http response headers .
   * Query for all system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AttachmentSystemAttributesResponse> attachmentSystemAttributesWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AttachmentSystemAttributesRequest body);


  /**
   * Query system attributes
   * Query for all system attributes
   * Note, this is equivalent to the other <code>attachmentSystemAttributes</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AttachmentSystemAttributesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AttachmentSystemAttributesResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/SystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AttachmentSystemAttributesResponse attachmentSystemAttributes(@Param("elid") String elid, AttachmentSystemAttributesRequest body, @QueryMap(encoded=true) AttachmentSystemAttributesQueryParams queryParams);

  /**
  * Query system attributes
  * Query for all system attributes
  * Note, this is equivalent to the other <code>attachmentSystemAttributes</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AttachmentSystemAttributesResponse
      */
      @RequestLine("POST /api/rest/entity/attachment/{elid}/SystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AttachmentSystemAttributesResponse> attachmentSystemAttributesWithHttpInfo(@Param("elid") String elid, AttachmentSystemAttributesRequest body, @QueryMap(encoded=true) AttachmentSystemAttributesQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>attachmentSystemAttributes</code> method in a fluent style.
   */
  public static class AttachmentSystemAttributesQueryParams extends HashMap<String, Object> {
    public AttachmentSystemAttributesQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Create (link/URL)
   * Create (link / URL)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateLinkUrlAttachmentResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/createLinkUrl?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateLinkUrlAttachmentResponse createLinkUrlAttachment(@Param("sessionId") String sessionId, CreateLinkUrlAttachmentRequestData body);

  /**
   * Create (link/URL)
   * Similar to <code>createLinkUrlAttachment</code> but it also returns the http response headers .
   * Create (link / URL)
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/attachment/createLinkUrl?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateLinkUrlAttachmentResponse> createLinkUrlAttachmentWithHttpInfo(@Param("sessionId") String sessionId, CreateLinkUrlAttachmentRequestData body);


  /**
   * Create (link/URL)
   * Create (link / URL)
   * Note, this is equivalent to the other <code>createLinkUrlAttachment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateLinkUrlAttachmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateLinkUrlAttachmentResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/createLinkUrl?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateLinkUrlAttachmentResponse createLinkUrlAttachment(CreateLinkUrlAttachmentRequestData body, @QueryMap(encoded=true) CreateLinkUrlAttachmentQueryParams queryParams);

  /**
  * Create (link/URL)
  * Create (link / URL)
  * Note, this is equivalent to the other <code>createLinkUrlAttachment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateLinkUrlAttachmentResponse
      */
      @RequestLine("POST /api/rest/entity/attachment/createLinkUrl?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateLinkUrlAttachmentResponse> createLinkUrlAttachmentWithHttpInfo(CreateLinkUrlAttachmentRequestData body, @QueryMap(encoded=true) CreateLinkUrlAttachmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createLinkUrlAttachment</code> method in a fluent style.
   */
  public static class CreateLinkUrlAttachmentQueryParams extends HashMap<String, Object> {
    public CreateLinkUrlAttachmentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete attachments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteAttachmentResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteAttachmentResponse deleteAttachment(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteAttachmentRequestData body);

  /**
   * Delete
   * Similar to <code>deleteAttachment</code> but it also returns the http response headers .
   * Delete attachments
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteAttachmentResponse> deleteAttachmentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteAttachmentRequestData body);


  /**
   * Delete
   * Delete attachments
   * Note, this is equivalent to the other <code>deleteAttachment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteAttachmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteAttachmentResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteAttachmentResponse deleteAttachment(@Param("elid") String elid, DeleteAttachmentRequestData body, @QueryMap(encoded=true) DeleteAttachmentQueryParams queryParams);

  /**
  * Delete
  * Delete attachments
  * Note, this is equivalent to the other <code>deleteAttachment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteAttachmentResponse
      */
      @RequestLine("POST /api/rest/entity/attachment/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteAttachmentResponse> deleteAttachmentWithHttpInfo(@Param("elid") String elid, DeleteAttachmentRequestData body, @QueryMap(encoded=true) DeleteAttachmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteAttachment</code> method in a fluent style.
   */
  public static class DeleteAttachmentQueryParams extends HashMap<String, Object> {
    public DeleteAttachmentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify (link/URL)
   * Modify (link / URL)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateLinkUrlAttachmentResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/updateLinkUrl?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateLinkUrlAttachmentResponse updateLinkUrlAttachment(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLinkUrlAttachmentRequestData body);

  /**
   * Modify (link/URL)
   * Similar to <code>updateLinkUrlAttachment</code> but it also returns the http response headers .
   * Modify (link / URL)
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/updateLinkUrl?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateLinkUrlAttachmentResponse> updateLinkUrlAttachmentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLinkUrlAttachmentRequestData body);


  /**
   * Modify (link/URL)
   * Modify (link / URL)
   * Note, this is equivalent to the other <code>updateLinkUrlAttachment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateLinkUrlAttachmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateLinkUrlAttachmentResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/updateLinkUrl?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateLinkUrlAttachmentResponse updateLinkUrlAttachment(@Param("elid") String elid, UpdateLinkUrlAttachmentRequestData body, @QueryMap(encoded=true) UpdateLinkUrlAttachmentQueryParams queryParams);

  /**
  * Modify (link/URL)
  * Modify (link / URL)
  * Note, this is equivalent to the other <code>updateLinkUrlAttachment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateLinkUrlAttachmentResponse
      */
      @RequestLine("POST /api/rest/entity/attachment/{elid}/updateLinkUrl?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateLinkUrlAttachmentResponse> updateLinkUrlAttachmentWithHttpInfo(@Param("elid") String elid, UpdateLinkUrlAttachmentRequestData body, @QueryMap(encoded=true) UpdateLinkUrlAttachmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateLinkUrlAttachment</code> method in a fluent style.
   */
  public static class UpdateLinkUrlAttachmentQueryParams extends HashMap<String, Object> {
    public UpdateLinkUrlAttachmentQueryParams sessionId(final String value) {
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
   * @return UpdateSystemAttributesAttachmentResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateSystemAttributesAttachmentResponse updateSystemAttributesAttachment(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesAttachmentRequestData body);

  /**
   * Change system attributes
   * Similar to <code>updateSystemAttributesAttachment</code> but it also returns the http response headers .
   * Modify system attributes
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateSystemAttributesAttachmentResponse> updateSystemAttributesAttachmentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateSystemAttributesAttachmentRequestData body);


  /**
   * Change system attributes
   * Modify system attributes
   * Note, this is equivalent to the other <code>updateSystemAttributesAttachment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateSystemAttributesAttachmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateSystemAttributesAttachmentResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/updateSystemAttributes?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateSystemAttributesAttachmentResponse updateSystemAttributesAttachment(@Param("elid") String elid, UpdateSystemAttributesAttachmentRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesAttachmentQueryParams queryParams);

  /**
  * Change system attributes
  * Modify system attributes
  * Note, this is equivalent to the other <code>updateSystemAttributesAttachment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateSystemAttributesAttachmentResponse
      */
      @RequestLine("POST /api/rest/entity/attachment/{elid}/updateSystemAttributes?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateSystemAttributesAttachmentResponse> updateSystemAttributesAttachmentWithHttpInfo(@Param("elid") String elid, UpdateSystemAttributesAttachmentRequestData body, @QueryMap(encoded=true) UpdateSystemAttributesAttachmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateSystemAttributesAttachment</code> method in a fluent style.
   */
  public static class UpdateSystemAttributesAttachmentQueryParams extends HashMap<String, Object> {
    public UpdateSystemAttributesAttachmentQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
