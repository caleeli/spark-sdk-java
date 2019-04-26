/*
 * ProcessMaker API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@processmaker.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import ProcessMaker_Client.ApiCallback;
import ProcessMaker_Client.ApiClient;
import ProcessMaker_Client.ApiException;
import ProcessMaker_Client.ApiResponse;
import ProcessMaker_Client.Configuration;
import ProcessMaker_Client.Pair;
import ProcessMaker_Client.ProgressRequestBody;
import ProcessMaker_Client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.TaskAssignments;
import org.openapitools.client.model.TaskAssignmentsEditable;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskAssignmentsApi {
    private ApiClient apiClient;

    public TaskAssignmentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaskAssignmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createTaskAssignments
     * @param taskAssignmentsEditable  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createTaskAssignmentsCall(TaskAssignmentsEditable taskAssignmentsEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = taskAssignmentsEditable;

        // create path and map variables
        String localVarPath = "/task_assignments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.setHttpClient(apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] { "pm_api_bearer" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTaskAssignmentsValidateBeforeCall(TaskAssignmentsEditable taskAssignmentsEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'taskAssignmentsEditable' is set
        if (taskAssignmentsEditable == null) {
            throw new ApiException("Missing the required parameter 'taskAssignmentsEditable' when calling createTaskAssignments(Async)");
        }
        

        okhttp3.Call call = createTaskAssignmentsCall(taskAssignmentsEditable, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Save a new task assignments
     * 
     * @param taskAssignmentsEditable  (required)
     * @return TaskAssignments
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TaskAssignments createTaskAssignments(TaskAssignmentsEditable taskAssignmentsEditable) throws ApiException {
        ApiResponse<TaskAssignments> resp = createTaskAssignmentsWithHttpInfo(taskAssignmentsEditable);
        return resp.getData();
    }

    /**
     * Save a new task assignments
     * 
     * @param taskAssignmentsEditable  (required)
     * @return ApiResponse&lt;TaskAssignments&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TaskAssignments> createTaskAssignmentsWithHttpInfo(TaskAssignmentsEditable taskAssignmentsEditable) throws ApiException {
        okhttp3.Call call = createTaskAssignmentsValidateBeforeCall(taskAssignmentsEditable, null, null);
        Type localVarReturnType = new TypeToken<TaskAssignments>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Save a new task assignments (asynchronously)
     * 
     * @param taskAssignmentsEditable  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createTaskAssignmentsAsync(TaskAssignmentsEditable taskAssignmentsEditable, final ApiCallback<TaskAssignments> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = createTaskAssignmentsValidateBeforeCall(taskAssignmentsEditable, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TaskAssignments>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateTaskAssignments
     * @param taskAssignmentsId ID of task assignment to return (required)
     * @param taskAssignmentsEditable  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call updateTaskAssignmentsCall(String taskAssignmentsId, TaskAssignmentsEditable taskAssignmentsEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = taskAssignmentsEditable;

        // create path and map variables
        String localVarPath = "/task_assignments/{task_assignments_id}"
            .replaceAll("\\{" + "task_assignments_id" + "\\}", apiClient.escapeString(taskAssignmentsId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.setHttpClient(apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] { "pm_api_bearer" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateTaskAssignmentsValidateBeforeCall(String taskAssignmentsId, TaskAssignmentsEditable taskAssignmentsEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'taskAssignmentsId' is set
        if (taskAssignmentsId == null) {
            throw new ApiException("Missing the required parameter 'taskAssignmentsId' when calling updateTaskAssignments(Async)");
        }
        
        // verify the required parameter 'taskAssignmentsEditable' is set
        if (taskAssignmentsEditable == null) {
            throw new ApiException("Missing the required parameter 'taskAssignmentsEditable' when calling updateTaskAssignments(Async)");
        }
        

        okhttp3.Call call = updateTaskAssignmentsCall(taskAssignmentsId, taskAssignmentsEditable, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a task assignments
     * 
     * @param taskAssignmentsId ID of task assignment to return (required)
     * @param taskAssignmentsEditable  (required)
     * @return TaskAssignments
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TaskAssignments updateTaskAssignments(String taskAssignmentsId, TaskAssignmentsEditable taskAssignmentsEditable) throws ApiException {
        ApiResponse<TaskAssignments> resp = updateTaskAssignmentsWithHttpInfo(taskAssignmentsId, taskAssignmentsEditable);
        return resp.getData();
    }

    /**
     * Update a task assignments
     * 
     * @param taskAssignmentsId ID of task assignment to return (required)
     * @param taskAssignmentsEditable  (required)
     * @return ApiResponse&lt;TaskAssignments&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TaskAssignments> updateTaskAssignmentsWithHttpInfo(String taskAssignmentsId, TaskAssignmentsEditable taskAssignmentsEditable) throws ApiException {
        okhttp3.Call call = updateTaskAssignmentsValidateBeforeCall(taskAssignmentsId, taskAssignmentsEditable, null, null);
        Type localVarReturnType = new TypeToken<TaskAssignments>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a task assignments (asynchronously)
     * 
     * @param taskAssignmentsId ID of task assignment to return (required)
     * @param taskAssignmentsEditable  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call updateTaskAssignmentsAsync(String taskAssignmentsId, TaskAssignmentsEditable taskAssignmentsEditable, final ApiCallback<TaskAssignments> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = updateTaskAssignmentsValidateBeforeCall(taskAssignmentsId, taskAssignmentsEditable, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TaskAssignments>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
