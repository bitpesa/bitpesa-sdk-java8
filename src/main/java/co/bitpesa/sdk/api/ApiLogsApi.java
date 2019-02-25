/*
 * BitPesa API
 * Reference documentation for the BitPesa API V1
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package co.bitpesa.sdk.api;

import co.bitpesa.sdk.ApiCallback;
import co.bitpesa.sdk.ApiClient;
import co.bitpesa.sdk.ApiException;
import co.bitpesa.sdk.ApiResponse;
import co.bitpesa.sdk.Configuration;
import co.bitpesa.sdk.Pair;
import co.bitpesa.sdk.ProgressRequestBody;
import co.bitpesa.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import co.bitpesa.sdk.model.ApiLogListResponse;
import co.bitpesa.sdk.model.ApiLogResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiLogsApi {
    private ApiClient apiClient;

    public ApiLogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApiLogsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getApiLog
     * @param apILogID ID of the API log to retrieve  Example: &#x60;/v1/api_logs/00485ce9-532b-45e7-8518-7e5582242407&#x60; (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getApiLogCall(UUID apILogID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api_logs/{API Log ID}"
            .replaceAll("\\{" + "API Log ID" + "\\}", apiClient.escapeString(apILogID.toString()));

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

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApiLogValidateBeforeCall(UUID apILogID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'apILogID' is set
        if (apILogID == null) {
            throw new ApiException("Missing the required parameter 'apILogID' when calling getApiLog(Async)");
        }
        

        okhttp3.Call call = getApiLogCall(apILogID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch an individual API log
     * Returns a single API log based on the API log ID.
     * @param apILogID ID of the API log to retrieve  Example: &#x60;/v1/api_logs/00485ce9-532b-45e7-8518-7e5582242407&#x60; (required)
     * @return ApiLogResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiLogResponse getApiLog(UUID apILogID) throws ApiException {
        ApiResponse<ApiLogResponse> resp = getApiLogWithHttpInfo(apILogID);
        return resp.getData();
    }

    /**
     * Fetch an individual API log
     * Returns a single API log based on the API log ID.
     * @param apILogID ID of the API log to retrieve  Example: &#x60;/v1/api_logs/00485ce9-532b-45e7-8518-7e5582242407&#x60; (required)
     * @return ApiResponse&lt;ApiLogResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiLogResponse> getApiLogWithHttpInfo(UUID apILogID) throws ApiException {
        okhttp3.Call call = getApiLogValidateBeforeCall(apILogID, null, null);
        Type localVarReturnType = new TypeToken<ApiLogResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch an individual API log (asynchronously)
     * Returns a single API log based on the API log ID.
     * @param apILogID ID of the API log to retrieve  Example: &#x60;/v1/api_logs/00485ce9-532b-45e7-8518-7e5582242407&#x60; (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getApiLogAsync(UUID apILogID, final ApiCallback<ApiLogResponse> callback) throws ApiException {

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

        okhttp3.Call call = getApiLogValidateBeforeCall(apILogID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiLogResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getApiLogs
     * @param page The page number to request (defaults to 1) (optional)
     * @param per The number of results to load per page (defaults to 10) (optional)
     * @param createdAtFrom Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param createdAtTo End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getApiLogsCall(Integer page, Integer per, String createdAtFrom, String createdAtTo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api_logs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        }

        if (per != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("per", per));
        }

        if (createdAtFrom != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("created_at_from", createdAtFrom));
        }

        if (createdAtTo != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("created_at_to", createdAtTo));
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

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApiLogsValidateBeforeCall(Integer page, Integer per, String createdAtFrom, String createdAtTo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        okhttp3.Call call = getApiLogsCall(page, per, createdAtFrom, createdAtTo, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch a list of API logs
     * Returns a list of API logs. Also includes information relating to the original request.
     * @param page The page number to request (defaults to 1) (optional)
     * @param per The number of results to load per page (defaults to 10) (optional)
     * @param createdAtFrom Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param createdAtTo End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @return ApiLogListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiLogListResponse getApiLogs(Integer page, Integer per, String createdAtFrom, String createdAtTo) throws ApiException {
        ApiResponse<ApiLogListResponse> resp = getApiLogsWithHttpInfo(page, per, createdAtFrom, createdAtTo);
        return resp.getData();
    }

    /**
     * Fetch a list of API logs
     * Returns a list of API logs. Also includes information relating to the original request.
     * @param page The page number to request (defaults to 1) (optional)
     * @param per The number of results to load per page (defaults to 10) (optional)
     * @param createdAtFrom Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param createdAtTo End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @return ApiResponse&lt;ApiLogListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiLogListResponse> getApiLogsWithHttpInfo(Integer page, Integer per, String createdAtFrom, String createdAtTo) throws ApiException {
        okhttp3.Call call = getApiLogsValidateBeforeCall(page, per, createdAtFrom, createdAtTo, null, null);
        Type localVarReturnType = new TypeToken<ApiLogListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch a list of API logs (asynchronously)
     * Returns a list of API logs. Also includes information relating to the original request.
     * @param page The page number to request (defaults to 1) (optional)
     * @param per The number of results to load per page (defaults to 10) (optional)
     * @param createdAtFrom Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param createdAtTo End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getApiLogsAsync(Integer page, Integer per, String createdAtFrom, String createdAtTo, final ApiCallback<ApiLogListResponse> callback) throws ApiException {

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

        okhttp3.Call call = getApiLogsValidateBeforeCall(page, per, createdAtFrom, createdAtTo, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiLogListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
