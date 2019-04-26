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


import org.openapitools.client.model.InlineResponse20014;
import org.openapitools.client.model.ProcessRequest;
import org.openapitools.client.model.ProcessRequestEditable;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessRequestsApi {
    private ApiClient apiClient;

    public ProcessRequestsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProcessRequestsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteProcessRequest
     * @param processRequestId ID of process request to return (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deleteProcessRequestCall(String processRequestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/requests/{process_request_id}"
            .replaceAll("\\{" + "process_request_id" + "\\}", apiClient.escapeString(processRequestId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteProcessRequestValidateBeforeCall(String processRequestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'processRequestId' is set
        if (processRequestId == null) {
            throw new ApiException("Missing the required parameter 'processRequestId' when calling deleteProcessRequest(Async)");
        }
        

        okhttp3.Call call = deleteProcessRequestCall(processRequestId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a process request
     * 
     * @param processRequestId ID of process request to return (required)
     * @return ProcessRequest
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProcessRequest deleteProcessRequest(String processRequestId) throws ApiException {
        ApiResponse<ProcessRequest> resp = deleteProcessRequestWithHttpInfo(processRequestId);
        return resp.getData();
    }

    /**
     * Delete a process request
     * 
     * @param processRequestId ID of process request to return (required)
     * @return ApiResponse&lt;ProcessRequest&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProcessRequest> deleteProcessRequestWithHttpInfo(String processRequestId) throws ApiException {
        okhttp3.Call call = deleteProcessRequestValidateBeforeCall(processRequestId, null, null);
        Type localVarReturnType = new TypeToken<ProcessRequest>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a process request (asynchronously)
     * 
     * @param processRequestId ID of process request to return (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deleteProcessRequestAsync(String processRequestId, final ApiCallback<ProcessRequest> callback) throws ApiException {

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

        okhttp3.Call call = deleteProcessRequestValidateBeforeCall(processRequestId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProcessRequest>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getProcessRequestById
     * @param processRequestId ID of process request to return (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getProcessRequestByIdCall(String processRequestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/requests/{process_request_id}"
            .replaceAll("\\{" + "process_request_id" + "\\}", apiClient.escapeString(processRequestId.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProcessRequestByIdValidateBeforeCall(String processRequestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'processRequestId' is set
        if (processRequestId == null) {
            throw new ApiException("Missing the required parameter 'processRequestId' when calling getProcessRequestById(Async)");
        }
        

        okhttp3.Call call = getProcessRequestByIdCall(processRequestId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get single process request by ID
     * 
     * @param processRequestId ID of process request to return (required)
     * @return ProcessRequest
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProcessRequest getProcessRequestById(String processRequestId) throws ApiException {
        ApiResponse<ProcessRequest> resp = getProcessRequestByIdWithHttpInfo(processRequestId);
        return resp.getData();
    }

    /**
     * Get single process request by ID
     * 
     * @param processRequestId ID of process request to return (required)
     * @return ApiResponse&lt;ProcessRequest&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProcessRequest> getProcessRequestByIdWithHttpInfo(String processRequestId) throws ApiException {
        okhttp3.Call call = getProcessRequestByIdValidateBeforeCall(processRequestId, null, null);
        Type localVarReturnType = new TypeToken<ProcessRequest>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get single process request by ID (asynchronously)
     * 
     * @param processRequestId ID of process request to return (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getProcessRequestByIdAsync(String processRequestId, final ApiCallback<ProcessRequest> callback) throws ApiException {

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

        okhttp3.Call call = getProcessRequestByIdValidateBeforeCall(processRequestId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProcessRequest>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getProcessesRequests
     * @param type Only return requests by type (optional)
     * @param filter Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. (optional)
     * @param orderBy Field to order results by (optional)
     * @param orderDirection  (optional, default to asc)
     * @param perPage  (optional, default to 10)
     * @param include Include data from related models in payload. Comma seperated list. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getProcessesRequestsCall(String type, String filter, String orderBy, String orderDirection, Integer perPage, String include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/requests";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        }

        if (filter != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("order_by", orderBy));
        }

        if (orderDirection != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("order_direction", orderDirection));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("per_page", perPage));
        }

        if (include != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("include", include));
        }

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProcessesRequestsValidateBeforeCall(String type, String filter, String orderBy, String orderDirection, Integer perPage, String include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        okhttp3.Call call = getProcessesRequestsCall(type, filter, orderBy, orderDirection, perPage, include, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns all process Requests that the user has access to
     * 
     * @param type Only return requests by type (optional)
     * @param filter Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. (optional)
     * @param orderBy Field to order results by (optional)
     * @param orderDirection  (optional, default to asc)
     * @param perPage  (optional, default to 10)
     * @param include Include data from related models in payload. Comma seperated list. (optional)
     * @return InlineResponse20014
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20014 getProcessesRequests(String type, String filter, String orderBy, String orderDirection, Integer perPage, String include) throws ApiException {
        ApiResponse<InlineResponse20014> resp = getProcessesRequestsWithHttpInfo(type, filter, orderBy, orderDirection, perPage, include);
        return resp.getData();
    }

    /**
     * Returns all process Requests that the user has access to
     * 
     * @param type Only return requests by type (optional)
     * @param filter Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. (optional)
     * @param orderBy Field to order results by (optional)
     * @param orderDirection  (optional, default to asc)
     * @param perPage  (optional, default to 10)
     * @param include Include data from related models in payload. Comma seperated list. (optional)
     * @return ApiResponse&lt;InlineResponse20014&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20014> getProcessesRequestsWithHttpInfo(String type, String filter, String orderBy, String orderDirection, Integer perPage, String include) throws ApiException {
        okhttp3.Call call = getProcessesRequestsValidateBeforeCall(type, filter, orderBy, orderDirection, perPage, include, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20014>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns all process Requests that the user has access to (asynchronously)
     * 
     * @param type Only return requests by type (optional)
     * @param filter Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. (optional)
     * @param orderBy Field to order results by (optional)
     * @param orderDirection  (optional, default to asc)
     * @param perPage  (optional, default to 10)
     * @param include Include data from related models in payload. Comma seperated list. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getProcessesRequestsAsync(String type, String filter, String orderBy, String orderDirection, Integer perPage, String include, final ApiCallback<InlineResponse20014> callback) throws ApiException {

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

        okhttp3.Call call = getProcessesRequestsValidateBeforeCall(type, filter, orderBy, orderDirection, perPage, include, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20014>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateProcessRequest
     * @param processRequestId ID of process request to return (required)
     * @param processRequestEditable  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call updateProcessRequestCall(String processRequestId, ProcessRequestEditable processRequestEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = processRequestEditable;

        // create path and map variables
        String localVarPath = "/requests/{process_request_id}"
            .replaceAll("\\{" + "process_request_id" + "\\}", apiClient.escapeString(processRequestId.toString()));

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
    private okhttp3.Call updateProcessRequestValidateBeforeCall(String processRequestId, ProcessRequestEditable processRequestEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'processRequestId' is set
        if (processRequestId == null) {
            throw new ApiException("Missing the required parameter 'processRequestId' when calling updateProcessRequest(Async)");
        }
        
        // verify the required parameter 'processRequestEditable' is set
        if (processRequestEditable == null) {
            throw new ApiException("Missing the required parameter 'processRequestEditable' when calling updateProcessRequest(Async)");
        }
        

        okhttp3.Call call = updateProcessRequestCall(processRequestId, processRequestEditable, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a process request
     * 
     * @param processRequestId ID of process request to return (required)
     * @param processRequestEditable  (required)
     * @return ProcessRequest
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProcessRequest updateProcessRequest(String processRequestId, ProcessRequestEditable processRequestEditable) throws ApiException {
        ApiResponse<ProcessRequest> resp = updateProcessRequestWithHttpInfo(processRequestId, processRequestEditable);
        return resp.getData();
    }

    /**
     * Update a process request
     * 
     * @param processRequestId ID of process request to return (required)
     * @param processRequestEditable  (required)
     * @return ApiResponse&lt;ProcessRequest&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProcessRequest> updateProcessRequestWithHttpInfo(String processRequestId, ProcessRequestEditable processRequestEditable) throws ApiException {
        okhttp3.Call call = updateProcessRequestValidateBeforeCall(processRequestId, processRequestEditable, null, null);
        Type localVarReturnType = new TypeToken<ProcessRequest>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a process request (asynchronously)
     * 
     * @param processRequestId ID of process request to return (required)
     * @param processRequestEditable  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call updateProcessRequestAsync(String processRequestId, ProcessRequestEditable processRequestEditable, final ApiCallback<ProcessRequest> callback) throws ApiException {

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

        okhttp3.Call call = updateProcessRequestValidateBeforeCall(processRequestId, processRequestEditable, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProcessRequest>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
