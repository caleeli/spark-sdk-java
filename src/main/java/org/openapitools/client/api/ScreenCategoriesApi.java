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


import org.openapitools.client.model.InlineResponse20015;
import org.openapitools.client.model.ScreenCategory;
import org.openapitools.client.model.ScreenCategoryEditable;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScreenCategoriesApi {
    private ApiClient apiClient;

    public ScreenCategoriesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ScreenCategoriesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createScreenCategory
     * @param screenCategoryEditable  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createScreenCategoryCall(ScreenCategoryEditable screenCategoryEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = screenCategoryEditable;

        // create path and map variables
        String localVarPath = "/screen_categories";

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
    private okhttp3.Call createScreenCategoryValidateBeforeCall(ScreenCategoryEditable screenCategoryEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'screenCategoryEditable' is set
        if (screenCategoryEditable == null) {
            throw new ApiException("Missing the required parameter 'screenCategoryEditable' when calling createScreenCategory(Async)");
        }
        

        okhttp3.Call call = createScreenCategoryCall(screenCategoryEditable, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Save a new Screen Category
     * 
     * @param screenCategoryEditable  (required)
     * @return ScreenCategory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ScreenCategory createScreenCategory(ScreenCategoryEditable screenCategoryEditable) throws ApiException {
        ApiResponse<ScreenCategory> resp = createScreenCategoryWithHttpInfo(screenCategoryEditable);
        return resp.getData();
    }

    /**
     * Save a new Screen Category
     * 
     * @param screenCategoryEditable  (required)
     * @return ApiResponse&lt;ScreenCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ScreenCategory> createScreenCategoryWithHttpInfo(ScreenCategoryEditable screenCategoryEditable) throws ApiException {
        okhttp3.Call call = createScreenCategoryValidateBeforeCall(screenCategoryEditable, null, null);
        Type localVarReturnType = new TypeToken<ScreenCategory>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Save a new Screen Category (asynchronously)
     * 
     * @param screenCategoryEditable  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createScreenCategoryAsync(ScreenCategoryEditable screenCategoryEditable, final ApiCallback<ScreenCategory> callback) throws ApiException {

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

        okhttp3.Call call = createScreenCategoryValidateBeforeCall(screenCategoryEditable, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ScreenCategory>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteScreenCategory
     * @param screenCategoryId ID of screen category to return (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deleteScreenCategoryCall(String screenCategoryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/screen_categories/screen_category_id"
            .replaceAll("\\{" + "screen_category_id" + "\\}", apiClient.escapeString(screenCategoryId.toString()));

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
    private okhttp3.Call deleteScreenCategoryValidateBeforeCall(String screenCategoryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'screenCategoryId' is set
        if (screenCategoryId == null) {
            throw new ApiException("Missing the required parameter 'screenCategoryId' when calling deleteScreenCategory(Async)");
        }
        

        okhttp3.Call call = deleteScreenCategoryCall(screenCategoryId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a screen category
     * 
     * @param screenCategoryId ID of screen category to return (required)
     * @return ScreenCategory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ScreenCategory deleteScreenCategory(String screenCategoryId) throws ApiException {
        ApiResponse<ScreenCategory> resp = deleteScreenCategoryWithHttpInfo(screenCategoryId);
        return resp.getData();
    }

    /**
     * Delete a screen category
     * 
     * @param screenCategoryId ID of screen category to return (required)
     * @return ApiResponse&lt;ScreenCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ScreenCategory> deleteScreenCategoryWithHttpInfo(String screenCategoryId) throws ApiException {
        okhttp3.Call call = deleteScreenCategoryValidateBeforeCall(screenCategoryId, null, null);
        Type localVarReturnType = new TypeToken<ScreenCategory>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a screen category (asynchronously)
     * 
     * @param screenCategoryId ID of screen category to return (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deleteScreenCategoryAsync(String screenCategoryId, final ApiCallback<ScreenCategory> callback) throws ApiException {

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

        okhttp3.Call call = deleteScreenCategoryValidateBeforeCall(screenCategoryId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ScreenCategory>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getScreenCategories
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
    public okhttp3.Call getScreenCategoriesCall(String filter, String orderBy, String orderDirection, Integer perPage, String include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/screen_categories";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private okhttp3.Call getScreenCategoriesValidateBeforeCall(String filter, String orderBy, String orderDirection, Integer perPage, String include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        okhttp3.Call call = getScreenCategoriesCall(filter, orderBy, orderDirection, perPage, include, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns all screens categories that the user has access to
     * 
     * @param filter Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. (optional)
     * @param orderBy Field to order results by (optional)
     * @param orderDirection  (optional, default to asc)
     * @param perPage  (optional, default to 10)
     * @param include Include data from related models in payload. Comma seperated list. (optional)
     * @return InlineResponse20015
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20015 getScreenCategories(String filter, String orderBy, String orderDirection, Integer perPage, String include) throws ApiException {
        ApiResponse<InlineResponse20015> resp = getScreenCategoriesWithHttpInfo(filter, orderBy, orderDirection, perPage, include);
        return resp.getData();
    }

    /**
     * Returns all screens categories that the user has access to
     * 
     * @param filter Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. (optional)
     * @param orderBy Field to order results by (optional)
     * @param orderDirection  (optional, default to asc)
     * @param perPage  (optional, default to 10)
     * @param include Include data from related models in payload. Comma seperated list. (optional)
     * @return ApiResponse&lt;InlineResponse20015&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20015> getScreenCategoriesWithHttpInfo(String filter, String orderBy, String orderDirection, Integer perPage, String include) throws ApiException {
        okhttp3.Call call = getScreenCategoriesValidateBeforeCall(filter, orderBy, orderDirection, perPage, include, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20015>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns all screens categories that the user has access to (asynchronously)
     * 
     * @param filter Filter results by string. Searches Name, Description, and Status. Status must match exactly. Others can be a substring. (optional)
     * @param orderBy Field to order results by (optional)
     * @param orderDirection  (optional, default to asc)
     * @param perPage  (optional, default to 10)
     * @param include Include data from related models in payload. Comma seperated list. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getScreenCategoriesAsync(String filter, String orderBy, String orderDirection, Integer perPage, String include, final ApiCallback<InlineResponse20015> callback) throws ApiException {

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

        okhttp3.Call call = getScreenCategoriesValidateBeforeCall(filter, orderBy, orderDirection, perPage, include, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20015>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getScreenCategoryById
     * @param screenCategoryId ID of screen category to return (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getScreenCategoryByIdCall(String screenCategoryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/screen_categories/screen_category_id"
            .replaceAll("\\{" + "screen_category_id" + "\\}", apiClient.escapeString(screenCategoryId.toString()));

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
    private okhttp3.Call getScreenCategoryByIdValidateBeforeCall(String screenCategoryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'screenCategoryId' is set
        if (screenCategoryId == null) {
            throw new ApiException("Missing the required parameter 'screenCategoryId' when calling getScreenCategoryById(Async)");
        }
        

        okhttp3.Call call = getScreenCategoryByIdCall(screenCategoryId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get single screen category by ID
     * 
     * @param screenCategoryId ID of screen category to return (required)
     * @return ScreenCategory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ScreenCategory getScreenCategoryById(String screenCategoryId) throws ApiException {
        ApiResponse<ScreenCategory> resp = getScreenCategoryByIdWithHttpInfo(screenCategoryId);
        return resp.getData();
    }

    /**
     * Get single screen category by ID
     * 
     * @param screenCategoryId ID of screen category to return (required)
     * @return ApiResponse&lt;ScreenCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ScreenCategory> getScreenCategoryByIdWithHttpInfo(String screenCategoryId) throws ApiException {
        okhttp3.Call call = getScreenCategoryByIdValidateBeforeCall(screenCategoryId, null, null);
        Type localVarReturnType = new TypeToken<ScreenCategory>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get single screen category by ID (asynchronously)
     * 
     * @param screenCategoryId ID of screen category to return (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getScreenCategoryByIdAsync(String screenCategoryId, final ApiCallback<ScreenCategory> callback) throws ApiException {

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

        okhttp3.Call call = getScreenCategoryByIdValidateBeforeCall(screenCategoryId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ScreenCategory>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateScreenCategory
     * @param screenCategoryId ID of screen category to return (required)
     * @param screenCategoryEditable  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call updateScreenCategoryCall(String screenCategoryId, ScreenCategoryEditable screenCategoryEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = screenCategoryEditable;

        // create path and map variables
        String localVarPath = "/screen_categories/screen_category_id"
            .replaceAll("\\{" + "screen_category_id" + "\\}", apiClient.escapeString(screenCategoryId.toString()));

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
    private okhttp3.Call updateScreenCategoryValidateBeforeCall(String screenCategoryId, ScreenCategoryEditable screenCategoryEditable, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'screenCategoryId' is set
        if (screenCategoryId == null) {
            throw new ApiException("Missing the required parameter 'screenCategoryId' when calling updateScreenCategory(Async)");
        }
        
        // verify the required parameter 'screenCategoryEditable' is set
        if (screenCategoryEditable == null) {
            throw new ApiException("Missing the required parameter 'screenCategoryEditable' when calling updateScreenCategory(Async)");
        }
        

        okhttp3.Call call = updateScreenCategoryCall(screenCategoryId, screenCategoryEditable, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a screen Category
     * 
     * @param screenCategoryId ID of screen category to return (required)
     * @param screenCategoryEditable  (required)
     * @return ScreenCategory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ScreenCategory updateScreenCategory(String screenCategoryId, ScreenCategoryEditable screenCategoryEditable) throws ApiException {
        ApiResponse<ScreenCategory> resp = updateScreenCategoryWithHttpInfo(screenCategoryId, screenCategoryEditable);
        return resp.getData();
    }

    /**
     * Update a screen Category
     * 
     * @param screenCategoryId ID of screen category to return (required)
     * @param screenCategoryEditable  (required)
     * @return ApiResponse&lt;ScreenCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ScreenCategory> updateScreenCategoryWithHttpInfo(String screenCategoryId, ScreenCategoryEditable screenCategoryEditable) throws ApiException {
        okhttp3.Call call = updateScreenCategoryValidateBeforeCall(screenCategoryId, screenCategoryEditable, null, null);
        Type localVarReturnType = new TypeToken<ScreenCategory>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a screen Category (asynchronously)
     * 
     * @param screenCategoryId ID of screen category to return (required)
     * @param screenCategoryEditable  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call updateScreenCategoryAsync(String screenCategoryId, ScreenCategoryEditable screenCategoryEditable, final ApiCallback<ScreenCategory> callback) throws ApiException {

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

        okhttp3.Call call = updateScreenCategoryValidateBeforeCall(screenCategoryId, screenCategoryEditable, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ScreenCategory>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
