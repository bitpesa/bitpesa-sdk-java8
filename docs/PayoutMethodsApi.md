# PayoutMethodsApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePayoutMethod**](PayoutMethodsApi.md#deletePayoutMethod) | **DELETE** /payout_methods/{Payout Method ID} | Deleting a payout method
[**getPayoutMethod**](PayoutMethodsApi.md#getPayoutMethod) | **GET** /payout_methods/{Payout Method ID} | Fetching a payout method
[**getPayoutMethods**](PayoutMethodsApi.md#getPayoutMethods) | **GET** /payout_methods | Listing payout methods
[**patchPayoutMethod**](PayoutMethodsApi.md#patchPayoutMethod) | **PATCH** /payout_methods/{Payout Method ID} | Updating a payout method
[**postPayoutMethods**](PayoutMethodsApi.md#postPayoutMethods) | **POST** /payout_methods | Creating a payout method


<a name="deletePayoutMethod"></a>
# **deletePayoutMethod**
> PayoutMethodResponse deletePayoutMethod(payoutMethodID)

Deleting a payout method

Deletes a single payout method by the Payout Method ID

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PayoutMethodsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

PayoutMethodsApi apiInstance = new PayoutMethodsApi(apiClient);
UUID payoutMethodID = new UUID(); // UUID | ID of the payout method to delete.  Example: `/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670`
try {
    PayoutMethodResponse result = apiInstance.deletePayoutMethod(payoutMethodID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        PayoutMethodResponse result = e.getResponseObject(PayoutMethodResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PayoutMethodsApi#deletePayoutMethod");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payoutMethodID** | [**UUID**](.md)| ID of the payout method to delete.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |

### Return type

[**PayoutMethodResponse**](PayoutMethodResponse.md)

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

<a name="getPayoutMethod"></a>
# **getPayoutMethod**
> PayoutMethodResponse getPayoutMethod(payoutMethodID)

Fetching a payout method

Show a payout method by id

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PayoutMethodsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

PayoutMethodsApi apiInstance = new PayoutMethodsApi(apiClient);
UUID payoutMethodID = new UUID(); // UUID | ID of the payout method to get.  Example: `/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670`
try {
    PayoutMethodResponse result = apiInstance.getPayoutMethod(payoutMethodID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        PayoutMethodResponse result = e.getResponseObject(PayoutMethodResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PayoutMethodsApi#getPayoutMethod");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payoutMethodID** | [**UUID**](.md)| ID of the payout method to get.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |

### Return type

[**PayoutMethodResponse**](PayoutMethodResponse.md)

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

<a name="getPayoutMethods"></a>
# **getPayoutMethods**
> PayoutMethodListResponse getPayoutMethods(state, type, senderId, page, per, createdAtFrom, createdAtTo)

Listing payout methods

List available payout methods

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PayoutMethodsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

PayoutMethodsApi apiInstance = new PayoutMethodsApi(apiClient);
List<String> state = Arrays.asList(); // List<String> | Allows filtering results by `state` of the payout method.  Example: `/v1/payout_methods?state[]=enabled`
List<String> type = Arrays.asList(); // List<String> | Allows filtering results by the specified type.  Example: `/v1/payout_methods?type[]=NGN::Bank`
String senderId = "senderId_example"; // String | Allows filtering results by the specified sender id.  Example: `/v1/payout_methods?sender_id=bf9ff782-e182-45ac-abea-5bce83ad6670`
Integer page = 1; // Integer | The page number to request (defaults to 1)
Integer per = 10; // Integer | The number of results to load per page (defaults to 10)
String createdAtFrom = "createdAtFrom_example"; // String | Start date to filter recipients by created_at range Allows filtering results by the specified `created_at` timeframe.  Example: `/v1/recipients?created_at_from=2018-06-06&created_at_to=2018-06-08`
String createdAtTo = "createdAtTo_example"; // String | End date to filter recipients by created_at range Allows filtering results by the specified `created_at` timeframe.  Example: `/v1/recipients?created_at_from=2018-06-06&created_at_to=2018-06-08`
try {
    PayoutMethodListResponse result = apiInstance.getPayoutMethods(state, type, senderId, page, per, createdAtFrom, createdAtTo);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        PayoutMethodListResponse result = e.getResponseObject(PayoutMethodListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PayoutMethodsApi#getPayoutMethods");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | [**List&lt;String&gt;**](String.md)| Allows filtering results by &#x60;state&#x60; of the payout method.  Example: &#x60;/v1/payout_methods?state[]&#x3D;enabled&#x60; | [optional] [enum: enabled, disabled]
 **type** | [**List&lt;String&gt;**](String.md)| Allows filtering results by the specified type.  Example: &#x60;/v1/payout_methods?type[]&#x3D;NGN::Bank&#x60; | [optional]
 **senderId** | **String**| Allows filtering results by the specified sender id.  Example: &#x60;/v1/payout_methods?sender_id&#x3D;bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; | [optional]
 **page** | **Integer**| The page number to request (defaults to 1) | [optional]
 **per** | **Integer**| The number of results to load per page (defaults to 10) | [optional]
 **createdAtFrom** | **String**| Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; | [optional]
 **createdAtTo** | **String**| End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; | [optional]

### Return type

[**PayoutMethodListResponse**](PayoutMethodListResponse.md)

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

<a name="patchPayoutMethod"></a>
# **patchPayoutMethod**
> PayoutMethodResponse patchPayoutMethod(payoutMethodID, payoutMethod)

Updating a payout method

Updates the payout method specified in the URL path.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PayoutMethodsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

PayoutMethodsApi apiInstance = new PayoutMethodsApi(apiClient);
UUID payoutMethodID = new UUID(); // UUID | ID of the payout method to get.  Example: `/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670`
PayoutMethod payoutMethod = new PayoutMethod(); // PayoutMethod | 
try {
    PayoutMethodResponse result = apiInstance.patchPayoutMethod(payoutMethodID, payoutMethod);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        PayoutMethodResponse result = e.getResponseObject(PayoutMethodResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PayoutMethodsApi#patchPayoutMethod");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payoutMethodID** | [**UUID**](.md)| ID of the payout method to get.  Example: &#x60;/v1/payout_methods/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |
 **payoutMethod** | [**PayoutMethod**](PayoutMethod.md)|  |

### Return type

[**PayoutMethodResponse**](PayoutMethodResponse.md)

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

<a name="postPayoutMethods"></a>
# **postPayoutMethods**
> PayoutMethodResponse postPayoutMethods(payoutMethodRequest)

Creating a payout method

Creates a new payout method in our system. 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.PayoutMethodsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

PayoutMethodsApi apiInstance = new PayoutMethodsApi(apiClient);
PayoutMethodRequest payoutMethodRequest = new PayoutMethodRequest(); // PayoutMethodRequest | 
try {
    PayoutMethodResponse result = apiInstance.postPayoutMethods(payoutMethodRequest);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        PayoutMethodResponse result = e.getResponseObject(PayoutMethodResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling PayoutMethodsApi#postPayoutMethods");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payoutMethodRequest** | [**PayoutMethodRequest**](PayoutMethodRequest.md)|  |

### Return type

[**PayoutMethodResponse**](PayoutMethodResponse.md)

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

