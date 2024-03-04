package com.fntsoftware.businessgateway.api;

import com.fntsoftware.businessgateway.ApiClient;
import com.fntsoftware.businessgateway.EncodingUtils;
import com.fntsoftware.businessgateway.entities.ApiResponse;

import com.fntsoftware.businessgateway.entities.CreateJobMasterRequestData;
import com.fntsoftware.businessgateway.entities.CreateJobMasterResponse;
import com.fntsoftware.businessgateway.entities.DeleteJobMasterRequestData;
import com.fntsoftware.businessgateway.entities.DeleteJobMasterResponse;
import com.fntsoftware.businessgateway.entities.JobMasterFunctionalLogRequest;
import com.fntsoftware.businessgateway.entities.JobMasterFunctionalLogResponse;
import com.fntsoftware.businessgateway.entities.JobMasterMonitoringInformationRequest;
import com.fntsoftware.businessgateway.entities.JobMasterMonitoringInformationResponse;
import com.fntsoftware.businessgateway.entities.JobMasterQueryRequest;
import com.fntsoftware.businessgateway.entities.JobMasterQueryResponse;
import com.fntsoftware.businessgateway.entities.StartJobAsyncJobMasterRequestData;
import com.fntsoftware.businessgateway.entities.StartJobAsyncJobMasterResponse;
import com.fntsoftware.businessgateway.entities.StartJobSyncJobMasterRequestData;
import com.fntsoftware.businessgateway.entities.StartJobSyncJobMasterResponse;
import com.fntsoftware.businessgateway.entities.UpdateJobMasterRequestData;
import com.fntsoftware.businessgateway.entities.UpdateJobMasterResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T13:31:32.601557352Z[Etc/UTC]")
public interface JobMasterApi extends ApiClient.Api {


  /**
   * Create
   * Create Job configuration
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return CreateJobMasterResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  CreateJobMasterResponse createJobMaster(@Param("sessionId") String sessionId, CreateJobMasterRequestData body);

  /**
   * Create
   * Similar to <code>createJobMaster</code> but it also returns the http response headers .
   * Create Job configuration
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/jobMaster/create?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<CreateJobMasterResponse> createJobMasterWithHttpInfo(@Param("sessionId") String sessionId, CreateJobMasterRequestData body);


  /**
   * Create
   * Create Job configuration
   * Note, this is equivalent to the other <code>createJobMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateJobMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return CreateJobMasterResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/create?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  CreateJobMasterResponse createJobMaster(CreateJobMasterRequestData body, @QueryMap(encoded=true) CreateJobMasterQueryParams queryParams);

  /**
  * Create
  * Create Job configuration
  * Note, this is equivalent to the other <code>createJobMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return CreateJobMasterResponse
      */
      @RequestLine("POST /api/rest/entity/jobMaster/create?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<CreateJobMasterResponse> createJobMasterWithHttpInfo(CreateJobMasterRequestData body, @QueryMap(encoded=true) CreateJobMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>createJobMaster</code> method in a fluent style.
   */
  public static class CreateJobMasterQueryParams extends HashMap<String, Object> {
    public CreateJobMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Delete
   * Delete Job configuration
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return DeleteJobMasterResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  DeleteJobMasterResponse deleteJobMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteJobMasterRequestData body);

  /**
   * Delete
   * Similar to <code>deleteJobMaster</code> but it also returns the http response headers .
   * Delete Job configuration
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/jobMaster/{elid}/delete?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<DeleteJobMasterResponse> deleteJobMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, DeleteJobMasterRequestData body);


  /**
   * Delete
   * Delete Job configuration
   * Note, this is equivalent to the other <code>deleteJobMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link DeleteJobMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return DeleteJobMasterResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/{elid}/delete?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  DeleteJobMasterResponse deleteJobMaster(@Param("elid") String elid, DeleteJobMasterRequestData body, @QueryMap(encoded=true) DeleteJobMasterQueryParams queryParams);

  /**
  * Delete
  * Delete Job configuration
  * Note, this is equivalent to the other <code>deleteJobMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return DeleteJobMasterResponse
      */
      @RequestLine("POST /api/rest/entity/jobMaster/{elid}/delete?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<DeleteJobMasterResponse> deleteJobMasterWithHttpInfo(@Param("elid") String elid, DeleteJobMasterRequestData body, @QueryMap(encoded=true) DeleteJobMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>deleteJobMaster</code> method in a fluent style.
   */
  public static class DeleteJobMasterQueryParams extends HashMap<String, Object> {
    public DeleteJobMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Technical log
   * Outputs technical logging information for execution of a Tool Framework Job
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return JobMasterFunctionalLogResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/functionalLog?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JobMasterFunctionalLogResponse jobMasterFunctionalLog(@Param("sessionId") String sessionId, JobMasterFunctionalLogRequest body);

  /**
   * Query Technical log
   * Similar to <code>jobMasterFunctionalLog</code> but it also returns the http response headers .
   * Outputs technical logging information for execution of a Tool Framework Job
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/jobMaster/functionalLog?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JobMasterFunctionalLogResponse> jobMasterFunctionalLogWithHttpInfo(@Param("sessionId") String sessionId, JobMasterFunctionalLogRequest body);


  /**
   * Query Technical log
   * Outputs technical logging information for execution of a Tool Framework Job
   * Note, this is equivalent to the other <code>jobMasterFunctionalLog</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JobMasterFunctionalLogQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JobMasterFunctionalLogResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/functionalLog?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JobMasterFunctionalLogResponse jobMasterFunctionalLog(JobMasterFunctionalLogRequest body, @QueryMap(encoded=true) JobMasterFunctionalLogQueryParams queryParams);

  /**
  * Query Technical log
  * Outputs technical logging information for execution of a Tool Framework Job
  * Note, this is equivalent to the other <code>jobMasterFunctionalLog</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JobMasterFunctionalLogResponse
      */
      @RequestLine("POST /api/rest/entity/jobMaster/functionalLog?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JobMasterFunctionalLogResponse> jobMasterFunctionalLogWithHttpInfo(JobMasterFunctionalLogRequest body, @QueryMap(encoded=true) JobMasterFunctionalLogQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>jobMasterFunctionalLog</code> method in a fluent style.
   */
  public static class JobMasterFunctionalLogQueryParams extends HashMap<String, Object> {
    public JobMasterFunctionalLogQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Query Monitoring information
   * Outputs monitoring information for the execution of a Tool Framework Job
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return JobMasterMonitoringInformationResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/monitoringInformation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JobMasterMonitoringInformationResponse jobMasterMonitoringInformation(@Param("sessionId") String sessionId, JobMasterMonitoringInformationRequest body);

  /**
   * Query Monitoring information
   * Similar to <code>jobMasterMonitoringInformation</code> but it also returns the http response headers .
   * Outputs monitoring information for the execution of a Tool Framework Job
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/jobMaster/monitoringInformation?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JobMasterMonitoringInformationResponse> jobMasterMonitoringInformationWithHttpInfo(@Param("sessionId") String sessionId, JobMasterMonitoringInformationRequest body);


  /**
   * Query Monitoring information
   * Outputs monitoring information for the execution of a Tool Framework Job
   * Note, this is equivalent to the other <code>jobMasterMonitoringInformation</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JobMasterMonitoringInformationQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JobMasterMonitoringInformationResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/monitoringInformation?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JobMasterMonitoringInformationResponse jobMasterMonitoringInformation(JobMasterMonitoringInformationRequest body, @QueryMap(encoded=true) JobMasterMonitoringInformationQueryParams queryParams);

  /**
  * Query Monitoring information
  * Outputs monitoring information for the execution of a Tool Framework Job
  * Note, this is equivalent to the other <code>jobMasterMonitoringInformation</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JobMasterMonitoringInformationResponse
      */
      @RequestLine("POST /api/rest/entity/jobMaster/monitoringInformation?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JobMasterMonitoringInformationResponse> jobMasterMonitoringInformationWithHttpInfo(JobMasterMonitoringInformationRequest body, @QueryMap(encoded=true) JobMasterMonitoringInformationQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>jobMasterMonitoringInformation</code> method in a fluent style.
   */
  public static class JobMasterMonitoringInformationQueryParams extends HashMap<String, Object> {
    public JobMasterMonitoringInformationQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return JobMasterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  JobMasterQueryResponse jobMasterQuery(@Param("sessionId") String sessionId, JobMasterQueryRequest body);

  /**
   * Basic query
   * Similar to <code>jobMasterQuery</code> but it also returns the http response headers .
   * Query for fetching all basic target entity data.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/jobMaster/query?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<JobMasterQueryResponse> jobMasterQueryWithHttpInfo(@Param("sessionId") String sessionId, JobMasterQueryRequest body);


  /**
   * Basic query
   * Query for fetching all basic target entity data.
   * Note, this is equivalent to the other <code>jobMasterQuery</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link JobMasterQueryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return JobMasterQueryResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/query?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  JobMasterQueryResponse jobMasterQuery(JobMasterQueryRequest body, @QueryMap(encoded=true) JobMasterQueryQueryParams queryParams);

  /**
  * Basic query
  * Query for fetching all basic target entity data.
  * Note, this is equivalent to the other <code>jobMasterQuery</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return JobMasterQueryResponse
      */
      @RequestLine("POST /api/rest/entity/jobMaster/query?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<JobMasterQueryResponse> jobMasterQueryWithHttpInfo(JobMasterQueryRequest body, @QueryMap(encoded=true) JobMasterQueryQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>jobMasterQuery</code> method in a fluent style.
   */
  public static class JobMasterQueryQueryParams extends HashMap<String, Object> {
    public JobMasterQueryQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Start job asynchronously
   * Starts a Tool Framework Job asynchronously. Does not wait for the Tool Framework Job to complete execution.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StartJobAsyncJobMasterResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/startJobAsync?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StartJobAsyncJobMasterResponse startJobAsyncJobMaster(@Param("sessionId") String sessionId, StartJobAsyncJobMasterRequestData body);

  /**
   * Start job asynchronously
   * Similar to <code>startJobAsyncJobMaster</code> but it also returns the http response headers .
   * Starts a Tool Framework Job asynchronously. Does not wait for the Tool Framework Job to complete execution.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/jobMaster/startJobAsync?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StartJobAsyncJobMasterResponse> startJobAsyncJobMasterWithHttpInfo(@Param("sessionId") String sessionId, StartJobAsyncJobMasterRequestData body);


  /**
   * Start job asynchronously
   * Starts a Tool Framework Job asynchronously. Does not wait for the Tool Framework Job to complete execution.
   * Note, this is equivalent to the other <code>startJobAsyncJobMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StartJobAsyncJobMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StartJobAsyncJobMasterResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/startJobAsync?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StartJobAsyncJobMasterResponse startJobAsyncJobMaster(StartJobAsyncJobMasterRequestData body, @QueryMap(encoded=true) StartJobAsyncJobMasterQueryParams queryParams);

  /**
  * Start job asynchronously
  * Starts a Tool Framework Job asynchronously. Does not wait for the Tool Framework Job to complete execution.
  * Note, this is equivalent to the other <code>startJobAsyncJobMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StartJobAsyncJobMasterResponse
      */
      @RequestLine("POST /api/rest/entity/jobMaster/startJobAsync?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StartJobAsyncJobMasterResponse> startJobAsyncJobMasterWithHttpInfo(StartJobAsyncJobMasterRequestData body, @QueryMap(encoded=true) StartJobAsyncJobMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>startJobAsyncJobMaster</code> method in a fluent style.
   */
  public static class StartJobAsyncJobMasterQueryParams extends HashMap<String, Object> {
    public StartJobAsyncJobMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Start job synchronously
   * Starts a Tool Framework Job synchronously. Waits for the Tool Framework Job to complete execution.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return StartJobSyncJobMasterResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/startJobSync?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  StartJobSyncJobMasterResponse startJobSyncJobMaster(@Param("sessionId") String sessionId, StartJobSyncJobMasterRequestData body);

  /**
   * Start job synchronously
   * Similar to <code>startJobSyncJobMaster</code> but it also returns the http response headers .
   * Starts a Tool Framework Job synchronously. Waits for the Tool Framework Job to complete execution.
   * @param sessionId Session-ID (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/jobMaster/startJobSync?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<StartJobSyncJobMasterResponse> startJobSyncJobMasterWithHttpInfo(@Param("sessionId") String sessionId, StartJobSyncJobMasterRequestData body);


  /**
   * Start job synchronously
   * Starts a Tool Framework Job synchronously. Waits for the Tool Framework Job to complete execution.
   * Note, this is equivalent to the other <code>startJobSyncJobMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link StartJobSyncJobMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return StartJobSyncJobMasterResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/startJobSync?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  StartJobSyncJobMasterResponse startJobSyncJobMaster(StartJobSyncJobMasterRequestData body, @QueryMap(encoded=true) StartJobSyncJobMasterQueryParams queryParams);

  /**
  * Start job synchronously
  * Starts a Tool Framework Job synchronously. Waits for the Tool Framework Job to complete execution.
  * Note, this is equivalent to the other <code>startJobSyncJobMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return StartJobSyncJobMasterResponse
      */
      @RequestLine("POST /api/rest/entity/jobMaster/startJobSync?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<StartJobSyncJobMasterResponse> startJobSyncJobMasterWithHttpInfo(StartJobSyncJobMasterRequestData body, @QueryMap(encoded=true) StartJobSyncJobMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>startJobSyncJobMaster</code> method in a fluent style.
   */
  public static class StartJobSyncJobMasterQueryParams extends HashMap<String, Object> {
    public StartJobSyncJobMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Modify
   * Modify Job configuration
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return UpdateJobMasterResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  UpdateJobMasterResponse updateJobMaster(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateJobMasterRequestData body);

  /**
   * Modify
   * Similar to <code>updateJobMaster</code> but it also returns the http response headers .
   * Modify Job configuration
   * @param sessionId Session-ID (required)
   * @param elid  (required)
   * @param body  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/rest/entity/jobMaster/{elid}/update?sessionId={sessionId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<UpdateJobMasterResponse> updateJobMasterWithHttpInfo(@Param("sessionId") String sessionId, @Param("elid") String elid, UpdateJobMasterRequestData body);


  /**
   * Modify
   * Modify Job configuration
   * Note, this is equivalent to the other <code>updateJobMaster</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link UpdateJobMasterQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param elid  (required)
   * @param body  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>sessionId - Session-ID (required)</li>
   *   </ul>
   * @return UpdateJobMasterResponse
   */
  @RequestLine("POST /api/rest/entity/jobMaster/{elid}/update?sessionId={sessionId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  UpdateJobMasterResponse updateJobMaster(@Param("elid") String elid, UpdateJobMasterRequestData body, @QueryMap(encoded=true) UpdateJobMasterQueryParams queryParams);

  /**
  * Modify
  * Modify Job configuration
  * Note, this is equivalent to the other <code>updateJobMaster</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param elid  (required)
              * @param body  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>sessionId - Session-ID (required)</li>
      *   </ul>
          * @return UpdateJobMasterResponse
      */
      @RequestLine("POST /api/rest/entity/jobMaster/{elid}/update?sessionId={sessionId}")
      @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
      })
   ApiResponse<UpdateJobMasterResponse> updateJobMasterWithHttpInfo(@Param("elid") String elid, UpdateJobMasterRequestData body, @QueryMap(encoded=true) UpdateJobMasterQueryParams queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>updateJobMaster</code> method in a fluent style.
   */
  public static class UpdateJobMasterQueryParams extends HashMap<String, Object> {
    public UpdateJobMasterQueryParams sessionId(final String value) {
      put("sessionId", EncodingUtils.encode(value));
      return this;
    }
  }
}
