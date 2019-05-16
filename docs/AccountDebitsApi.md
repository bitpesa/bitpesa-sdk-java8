# AccountDebitsApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountsDebit**](AccountDebitsApi.md#getAccountsDebit) | **GET** /accounts/debits/{Account Debit ID} | Fetching an account debit
[**getAccountsDebits**](AccountDebitsApi.md#getAccountsDebits) | **GET** /accounts/debits | Listing Accounts debits
[**postAccountsDebits**](AccountDebitsApi.md#postAccountsDebits) | **POST** /accounts/debits | Creating an account debit


<a name="getAccountsDebit"></a>
# **getAccountsDebit**
> DebitResponse getAccountsDebit(accountDebitID)

Fetching an account debit

Returns a single account debit by the account debit ID

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.AccountDebitsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

AccountDebitsApi apiInstance = new AccountDebitsApi(apiClient);
UUID accountDebitID = new UUID(); // UUID | ID of the account debit to get.  Example: `/v1/accounts/debits/9170c890-1a45-46bd-9b79-3deeb8b4ff3d`
try {
    DebitResponse result = apiInstance.getAccountsDebit(accountDebitID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DebitResponse result = e.getResponseObject(DebitResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling AccountDebitsApi#getAccountsDebit");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountDebitID** | [**UUID**](.md)| ID of the account debit to get.  Example: &#x60;/v1/accounts/debits/9170c890-1a45-46bd-9b79-3deeb8b4ff3d&#x60; |

### Return type

[**DebitResponse**](DebitResponse.md)

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

<a name="getAccountsDebits"></a>
# **getAccountsDebits**
> DebitListResponse getAccountsDebits(page, per)

Listing Accounts debits

Get a list of accounts debits

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.AccountDebitsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

AccountDebitsApi apiInstance = new AccountDebitsApi(apiClient);
Integer page = 1; // Integer | The page number to request (defaults to 1)
Integer per = 10; // Integer | The number of results to load per page (defaults to 10)
try {
    DebitListResponse result = apiInstance.getAccountsDebits(page, per);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DebitListResponse result = e.getResponseObject(DebitListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling AccountDebitsApi#getAccountsDebits");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page number to request (defaults to 1) | [optional]
 **per** | **Integer**| The number of results to load per page (defaults to 10) | [optional]

### Return type

[**DebitListResponse**](DebitListResponse.md)

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

<a name="postAccountsDebits"></a>
# **postAccountsDebits**
> DebitListResponse postAccountsDebits(debitRequestWrapper)

Creating an account debit

Creates a new account debit finding transaction through the internal balance  To successfully fund a transaction - - The currency needs to be the same as the input_currency on the transaction - The amount has to be the same as the input_amount on the transaction - The to_id is the id of the transaction - You need to have enough balance of the appropriate currency inside your wallet  Once the transaction is funded, we will immediately start trying to pay out the recipient(s).  It is also possible to create multiple account debits by supplying an array of debit objects 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.AccountDebitsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

AccountDebitsApi apiInstance = new AccountDebitsApi(apiClient);
DebitRequestWrapper debitRequestWrapper = new DebitRequestWrapper(); // DebitRequestWrapper | 
try {
    DebitListResponse result = apiInstance.postAccountsDebits(debitRequestWrapper);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DebitListResponse result = e.getResponseObject(DebitListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling AccountDebitsApi#postAccountsDebits");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **debitRequestWrapper** | [**DebitRequestWrapper**](DebitRequestWrapper.md)|  |

### Return type

[**DebitListResponse**](DebitListResponse.md)

## Authorization

You can set the API Key and Secret on the ApiClient object for authentication:

```java
ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");
```
### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

