package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.SendEmailEmailServiceRequestData;
import com.fntsoftware.businessgateway.entities.SendEmailEmailServiceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T11:10:37.320689708Z[Etc/UTC]")
public interface EmailServiceApi extends ApiClient.Api {


  /**
   * Send e-mail
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return SendEmailEmailServiceResponse
   */
  @RequestLine("POST /api/rest/entity/emailService/sendEmail?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SendEmailEmailServiceResponse sendEmailEmailService(@Param("sessionId") String sessionId, SendEmailEmailServiceRequestData body);

  /**
   * Send e-mail
   * Similar to <code>sendEmailEmailService</code> but it also returns the http response headers .
   * 
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/emailService/sendEmail?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SendEmailEmailServiceResponse> sendEmailEmailServiceWithHttpInfo(@Param("sessionId") String sessionId, SendEmailEmailServiceRequestData body);


  /**
   * Send e-mail
   * 
   * Note, this is equivalent to the other <code>sendEmailEmailService</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link SendEmailEmailServiceQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return SendEmailEmailServiceResponse
   */
  @RequestLine("POST /api/rest/entity/emailService/sendEmail?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  SendEmailEmailServiceResponse sendEmailEmailService(SendEmailEmailServiceRequestData body, @QueryMap(encoded=true) SendEmailEmailServiceQueryParams queryParams);

  /**
  * Send e-mail
  * 
  * Note, this is equivalent to the other <code>sendEmailEmailService</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return SendEmailEmailServiceResponse
      */
      @RequestLine("POST /api/rest/entity/emailService/sendEmail?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<SendEmailEmailServiceResponse> sendEmailEmailServiceWithHttpInfo(SendEmailEmailServiceRequestData body, @QueryMap(encoded=true) SendEmailEmailServiceQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>sendEmailEmailService</code> method in a fluent style.
   */
  public static class SendEmailEmailServiceQueryParams extends HashMap<String, Object> {
    public SendEmailEmailServiceQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
