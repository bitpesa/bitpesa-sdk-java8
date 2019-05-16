# AccountsApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccount**](AccountsApi.md#getAccount) | **GET** /accounts/{Currency} | Fetches account balance for specified currrency
[**getAccounts**](AccountsApi.md#getAccounts) | **GET** /accounts | Fetches account balances for all currencies


<a name="getAccount"></a>
# **getAccount**
> AccountResponse getAccount(currency)

Fetches account balance for specified currrency

Fetches account balance for specified currrency, and returns current balance and associated currency code

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.AccountsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

AccountsApi apiInstance = new AccountsApi(apiClient);
String currency = "currency_example"; // String | Currency code of account balance to fetch  Example: `/v1/accounts/USD`
try {
    AccountResponse result = apiInstance.getAccount(currency);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        AccountResponse result = e.getResponseObject(AccountResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling AccountsApi#getAccount");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency code of account balance to fetch  Example: &#x60;/v1/accounts/USD&#x60; |

### Return type

[**AccountResponse**](AccountResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");
```
### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccounts"></a>
# **getAccounts**
> AccountListResponse getAccounts()

Fetches account balances for all currencies

Fetches account balances for all currencies, and returns an array of the current balances and associated currency codes.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.AccountsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

AccountsApi apiInstance = new AccountsApi(apiClient);
try {
    AccountListResponse result = apiInstance.getAccounts();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        AccountListResponse result = e.getResponseObject(AccountListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling AccountsApi#getAccounts");
        e.printStackTrace();
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountListResponse**](AccountListResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");
```
### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

