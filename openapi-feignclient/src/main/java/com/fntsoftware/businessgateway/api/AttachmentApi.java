package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.AttachmentAttachmentsRequest;
import com.fntsoftware.businessgateway.entities.AttachmentAttachmentsResponse;
import com.fntsoftware.businessgateway.entities.AttachmentObjectsRequest;
import com.fntsoftware.businessgateway.entities.AttachmentObjectsResponse;
import com.fntsoftware.businessgateway.entities.AttachmentQueryRequest;
import com.fntsoftware.businessgateway.entities.AttachmentQueryResponse;
import com.fntsoftware.businessgateway.entities.AttachmentSystemAttributesRequest;
import com.fntsoftware.businessgateway.entities.AttachmentSystemAttributesResponse;
import com.fntsoftware.businessgateway.entities.CreateLinkObjectAttachmentRequestData;
import com.fntsoftware.businessgateway.entities.CreateLinkObjectAttachmentResponse;
import com.fntsoftware.businessgateway.entities.CreateLinkUrlAttachmentRequestData;
import com.fntsoftware.businessgateway.entities.CreateLinkUrlAttachmentResponse;
import com.fntsoftware.businessgateway.entities.DeleteAttachmentRequestData;
import com.fntsoftware.businessgateway.entities.DeleteAttachmentResponse;
import com.fntsoftware.businessgateway.entities.UpdateLinkObjectAttachmentRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLinkObjectAttachmentResponse;
import com.fntsoftware.businessgateway.entities.UpdateLinkUrlAttachmentRequestData;
import com.fntsoftware.businessgateway.entities.UpdateLinkUrlAttachmentResponse;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesAttachmentRequestData;
import com.fntsoftware.businessgateway.entities.UpdateSystemAttributesAttachmentResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface AttachmentApi extends ApiClient.Api {


  /**
   * File attachments
   * Query file attachments
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return AttachmentAttachmentsResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/attachments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AttachmentAttachmentsResponse attachmentAttachments(@Param("sessionId") String sessionId, AttachmentAttachmentsRequest body);

  /**
   * File attachments
   * Similar to <code>attachmentAttachments</code> but it also returns the http response headers .
   * Query file attachments
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/attachment/attachments?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AttachmentAttachmentsResponse> attachmentAttachmentsWithHttpInfo(@Param("sessionId") String sessionId, AttachmentAttachmentsRequest body);


  /**
   * File attachments
   * Query file attachments
   * Note, this is equivalent to the other <code>attachmentAttachments</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AttachmentAttachmentsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AttachmentAttachmentsResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/attachments?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AttachmentAttachmentsResponse attachmentAttachments(AttachmentAttachmentsRequest body, @QueryMap(encoded=true) AttachmentAttachmentsQueryParams queryParams);

  /**
  * File attachments
  * Query file attachments
  * Note, this is equivalent to the other <code>attachmentAttachments</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AttachmentAttachmentsResponse
      */
      @RequestLine("POST /api/rest/entity/attachment/attachments?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AttachmentAttachmentsResponse> attachmentAttachmentsWithHttpInfo(AttachmentAttachmentsRequest body, @QueryMap(encoded=true) AttachmentAttachmentsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>attachmentAttachments</code> method in a fluent style.
   */
  public static class AttachmentAttachmentsQueryParams extends HashMap<String, Object> {
    public AttachmentAttachmentsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Objects
   * Query objects
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return AttachmentObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  AttachmentObjectsResponse attachmentObjects(@Param("sessionId") String sessionId, @Param("elid") String elid, AttachmentObjectsRequest body);

  /**
   * Objects
   * Similar to <code>attachmentObjects</code> but it also returns the http response headers .
   * Query objects
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/Objects?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<AttachmentObjectsResponse> attachmentObjectsWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, AttachmentObjectsRequest body);


  /**
   * Objects
   * Query objects
   * Note, this is equivalent to the other <code>attachmentObjects</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link AttachmentObjectsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return AttachmentObjectsResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/Objects?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  AttachmentObjectsResponse attachmentObjects(@Param("elid") String elid, AttachmentObjectsRequest body, @QueryMap(encoded=true) AttachmentObjectsQueryParams queryParams);

  /**
  * Objects
  * Query objects
  * Note, this is equivalent to the other <code>attachmentObjects</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return AttachmentObjectsResponse
      */
      @RequestLine("POST /api/rest/entity/attachment/{elid}/Objects?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<AttachmentObjectsResponse> attachmentObjectsWithHttpInfo(@Param("elid") String elid, AttachmentObjectsRequest body, @QueryMap(encoded=true) AttachmentObjectsQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>attachmentObjects</code> method in a fluent style.
   */
  public static class AttachmentObjectsQueryParams extends HashMap<String, Object> {
    public AttachmentObjectsQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

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
   * Link object
   * Links a file attachment with an object or a port
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return CreateLinkObjectAttachmentResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/createLinkObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateLinkObjectAttachmentResponse createLinkObjectAttachment(@Param("sessionId") String sessionId, @Param("elid") String elid, CreateLinkObjectAttachmentRequestData body);

  /**
   * Link object
   * Similar to <code>createLinkObjectAttachment</code> but it also returns the http response headers .
   * Links a file attachment with an object or a port
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/createLinkObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateLinkObjectAttachmentResponse> createLinkObjectAttachmentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, CreateLinkObjectAttachmentRequestData body);


  /**
   * Link object
   * Links a file attachment with an object or a port
   * Note, this is equivalent to the other <code>createLinkObjectAttachment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateLinkObjectAttachmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateLinkObjectAttachmentResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/createLinkObject?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateLinkObjectAttachmentResponse createLinkObjectAttachment(@Param("elid") String elid, CreateLinkObjectAttachmentRequestData body, @QueryMap(encoded=true) CreateLinkObjectAttachmentQueryParams queryParams);

  /**
  * Link object
  * Links a file attachment with an object or a port
  * Note, this is equivalent to the other <code>createLinkObjectAttachment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateLinkObjectAttachmentResponse
      */
      @RequestLine("POST /api/rest/entity/attachment/{elid}/createLinkObject?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateLinkObjectAttachmentResponse> createLinkObjectAttachmentWithHttpInfo(@Param("elid") String elid, CreateLinkObjectAttachmentRequestData body, @QueryMap(encoded=true) CreateLinkObjectAttachmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createLinkObjectAttachment</code> method in a fluent style.
   */
  public static class CreateLinkObjectAttachmentQueryParams extends HashMap<String, Object> {
    public CreateLinkObjectAttachmentQueryParams sessionId(final String value) {
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
   * Update object connection
   * Update a link to an attachment to an object or a port
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateLinkObjectAttachmentResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/updateLinkObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateLinkObjectAttachmentResponse updateLinkObjectAttachment(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLinkObjectAttachmentRequestData body);

  /**
   * Update object connection
   * Similar to <code>updateLinkObjectAttachment</code> but it also returns the http response headers .
   * Update a link to an attachment to an object or a port
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/updateLinkObject?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateLinkObjectAttachmentResponse> updateLinkObjectAttachmentWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateLinkObjectAttachmentRequestData body);


  /**
   * Update object connection
   * Update a link to an attachment to an object or a port
   * Note, this is equivalent to the other <code>updateLinkObjectAttachment</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateLinkObjectAttachmentQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateLinkObjectAttachmentResponse
   */
  @RequestLine("POST /api/rest/entity/attachment/{elid}/updateLinkObject?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateLinkObjectAttachmentResponse updateLinkObjectAttachment(@Param("elid") String elid, UpdateLinkObjectAttachmentRequestData body, @QueryMap(encoded=true) UpdateLinkObjectAttachmentQueryParams queryParams);

  /**
  * Update object connection
  * Update a link to an attachment to an object or a port
  * Note, this is equivalent to the other <code>updateLinkObjectAttachment</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateLinkObjectAttachmentResponse
      */
      @RequestLine("POST /api/rest/entity/attachment/{elid}/updateLinkObject?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateLinkObjectAttachmentResponse> updateLinkObjectAttachmentWithHttpInfo(@Param("elid") String elid, UpdateLinkObjectAttachmentRequestData body, @QueryMap(encoded=true) UpdateLinkObjectAttachmentQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateLinkObjectAttachment</code> method in a fluent style.
   */
  public static class UpdateLinkObjectAttachmentQueryParams extends HashMap<String, Object> {
    public UpdateLinkObjectAttachmentQueryParams sessionId(final String value) {
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
