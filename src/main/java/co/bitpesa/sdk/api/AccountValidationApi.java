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


import co.bitpesa.sdk.model.AccountValidationRequest;
import co.bitpesa.sdk.model.AccountValidationResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountValidationApi {
    private ApiClient localVarApiClient;

    public AccountValidationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccountValidationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for postAccountValidations
     * @param accountValidationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * More information on account validation and bank account name enquiry
     * @see <a href="https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#bank-account-name-enquiry">Validates the existence of a bank account Documentation</a>
     */
    public okhttp3.Call postAccountValidationsCall(AccountValidationRequest accountValidationRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = accountValidationRequest;

        // create path and map variables
        String localVarPath = "/account_validations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "AuthorizationKey", "AuthorizationNonce", "AuthorizationSecret", "AuthorizationSignature" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postAccountValidationsValidateBeforeCall(AccountValidationRequest accountValidationRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'accountValidationRequest' is set
        if (accountValidationRequest == null) {
            throw new ApiException("Missing the required parameter 'accountValidationRequest' when calling postAccountValidations(Async)");
        }
        

        okhttp3.Call localVarCall = postAccountValidationsCall(accountValidationRequest, _callback);
        return localVarCall;

    }

    /**
     * Validates the existence of a bank account
     * Validates the existence of a bank account and returns the associated customer name
     * @param accountValidationRequest  (required)
     * @return AccountValidationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * More information on account validation and bank account name enquiry
     * @see <a href="https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#bank-account-name-enquiry">Validates the existence of a bank account Documentation</a>
     */
    public AccountValidationResponse postAccountValidations(AccountValidationRequest accountValidationRequest) throws ApiException {
        ApiResponse<AccountValidationResponse> localVarResp = postAccountValidationsWithHttpInfo(accountValidationRequest);
        return localVarResp.getData();
    }

    /**
     * Validates the existence of a bank account
     * Validates the existence of a bank account and returns the associated customer name
     * @param accountValidationRequest  (required)
     * @return ApiResponse&lt;AccountValidationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * More information on account validation and bank account name enquiry
     * @see <a href="https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#bank-account-name-enquiry">Validates the existence of a bank account Documentation</a>
     */
    public ApiResponse<AccountValidationResponse> postAccountValidationsWithHttpInfo(AccountValidationRequest accountValidationRequest) throws ApiException {
        okhttp3.Call localVarCall = postAccountValidationsValidateBeforeCall(accountValidationRequest, null);
        Type localVarReturnType = new TypeToken<AccountValidationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Validates the existence of a bank account (asynchronously)
     * Validates the existence of a bank account and returns the associated customer name
     * @param accountValidationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * More information on account validation and bank account name enquiry
     * @see <a href="https://github.com/bitpesa/api-documentation/blob/master/additional-features.md#bank-account-name-enquiry">Validates the existence of a bank account Documentation</a>
     */
    public okhttp3.Call postAccountValidationsAsync(AccountValidationRequest accountValidationRequest, final ApiCallback<AccountValidationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postAccountValidationsValidateBeforeCall(accountValidationRequest, _callback);
        Type localVarReturnType = new TypeToken<AccountValidationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
