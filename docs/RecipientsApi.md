# RecipientsApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRecipient**](RecipientsApi.md#deleteRecipient) | **DELETE** /recipients/{Recipient ID} | Cancelling a recipient
[**getRecipients**](RecipientsApi.md#getRecipients) | **GET** /recipients | Getting a list of recipients with filtering
[**patchRecipient**](RecipientsApi.md#patchRecipient) | **PATCH** /recipients/{Recipient ID} | Updating a recipient


<a name="deleteRecipient"></a>
# **deleteRecipient**
> RecipientResponse deleteRecipient(recipientID)

Cancelling a recipient

Cancels the payment to the recipient specified in the URL path.  Please note only recipients where the &#x60;may_cancel&#x60; attribute is true can be cancelled.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.RecipientsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

RecipientsApi apiInstance = new RecipientsApi(apiClient);
UUID recipientID = new UUID(); // UUID | ID of recipient to cancel.  Example: `/v1/recipients/9d4d7b73-a94c-4979-ab57-09074fd55d33`
try {
    RecipientResponse result = apiInstance.deleteRecipient(recipientID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        RecipientResponse result = e.getResponseObject(RecipientResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling RecipientsApi#deleteRecipient");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recipientID** | [**UUID**](.md)| ID of recipient to cancel.  Example: &#x60;/v1/recipients/9d4d7b73-a94c-4979-ab57-09074fd55d33&#x60; |

### Return type

[**RecipientResponse**](RecipientResponse.md)

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

<a name="getRecipients"></a>
# **getRecipients**
> RecipientListResponse getRecipients(page, per, createdAtFrom, createdAtTo, amountFrom, amountTo, state, currency)

Getting a list of recipients with filtering

Fetches details of all recipients.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.RecipientsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

RecipientsApi apiInstance = new RecipientsApi(apiClient);
Integer page = 1; // Integer | The page number to request (defaults to 1)
Integer per = 10; // Integer | The number of results to load per page (defaults to 10)
String createdAtFrom = "createdAtFrom_example"; // String | Start date to filter recipients by created_at range Allows filtering results by the specified `created_at` timeframe.  Example: `/v1/recipients?created_at_from=2018-06-06&created_at_to=2018-06-08`
String createdAtTo = "createdAtTo_example"; // String | End date to filter recipients by created_at range Allows filtering results by the specified `created_at` timeframe.  Example: `/v1/recipients?created_at_from=2018-06-06&created_at_to=2018-06-08`
String amountFrom = "amountFrom_example"; // String | Minimum amount to filter recipients by amount range.  Allows filtering results by the specified `amount` range. When using this filter, the `currency` should also be specified.  Example: `/v1/recipients?currency=NGN&amount_from=83.76672339&amount_to=83.76672339`
String amountTo = "amountTo_example"; // String | Max amount to filter recipients by amount range.  Allows filtering results by the specified `amount` range. When using this filter, the `currency` should also be specified.  Example: `/v1/recipients?currency=NGN&amount_from=83.76672339&amount_to=83.76672339`
List<String> state = Arrays.asList(); // List<String> | Allows filtering results by `state` of recipient. See [API Documentation - Recipient state](https://github.com/transferzero/api-documentation/blob/master/transaction-flow.md#state-1) for possible states.  Example: `/v1/recipients?state[]=error&state[]=initial`
List<String> currency = Arrays.asList(); // List<String> | Allows filtering results by `input_currency`.  Additionally required when filtering by an amount range Example: `/v1/recipients?currency[]=KES&currency[]=NGN`
try {
    RecipientListResponse result = apiInstance.getRecipients(page, per, createdAtFrom, createdAtTo, amountFrom, amountTo, state, currency);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        RecipientListResponse result = e.getResponseObject(RecipientListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling RecipientsApi#getRecipients");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| The page number to request (defaults to 1) | [optional]
 **per** | **Integer**| The number of results to load per page (defaults to 10) | [optional]
 **createdAtFrom** | **String**| Start date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; | [optional]
 **createdAtTo** | **String**| End date to filter recipients by created_at range Allows filtering results by the specified &#x60;created_at&#x60; timeframe.  Example: &#x60;/v1/recipients?created_at_from&#x3D;2018-06-06&amp;created_at_to&#x3D;2018-06-08&#x60; | [optional]
 **amountFrom** | **String**| Minimum amount to filter recipients by amount range.  Allows filtering results by the specified &#x60;amount&#x60; range. When using this filter, the &#x60;currency&#x60; should also be specified.  Example: &#x60;/v1/recipients?currency&#x3D;NGN&amp;amount_from&#x3D;83.76672339&amp;amount_to&#x3D;83.76672339&#x60; | [optional]
 **amountTo** | **String**| Max amount to filter recipients by amount range.  Allows filtering results by the specified &#x60;amount&#x60; range. When using this filter, the &#x60;currency&#x60; should also be specified.  Example: &#x60;/v1/recipients?currency&#x3D;NGN&amp;amount_from&#x3D;83.76672339&amp;amount_to&#x3D;83.76672339&#x60; | [optional]
 **state** | [**List&lt;String&gt;**](String.md)| Allows filtering results by &#x60;state&#x60; of recipient. See [API Documentation - Recipient state](https://github.com/transferzero/api-documentation/blob/master/transaction-flow.md#state-1) for possible states.  Example: &#x60;/v1/recipients?state[]&#x3D;error&amp;state[]&#x3D;initial&#x60; | [optional]
 **currency** | [**List&lt;String&gt;**](String.md)| Allows filtering results by &#x60;input_currency&#x60;.  Additionally required when filtering by an amount range Example: &#x60;/v1/recipients?currency[]&#x3D;KES&amp;currency[]&#x3D;NGN&#x60; | [optional]

### Return type

[**RecipientListResponse**](RecipientListResponse.md)

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

<a name="patchRecipient"></a>
# **patchRecipient**
> RecipientResponse patchRecipient(recipientID, recipientRequest)

Updating a recipient

Updates the recipient specified in the URL path.  Please note that only recipients where the &#x60;editable&#x60; field is true can be modified. Once the recipient is modified any subsequent payout tries will be sent to the updated details.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.RecipientsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

RecipientsApi apiInstance = new RecipientsApi(apiClient);
UUID recipientID = new UUID(); // UUID | ID of recipient to update.  Example: `/v1/recipients/9d4d7b73-a94c-4979-ab57-09074fd55d33`
RecipientRequest recipientRequest = new RecipientRequest(); // RecipientRequest | 
try {
    RecipientResponse result = apiInstance.patchRecipient(recipientID, recipientRequest);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        RecipientResponse result = e.getResponseObject(RecipientResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling RecipientsApi#patchRecipient");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recipientID** | [**UUID**](.md)| ID of recipient to update.  Example: &#x60;/v1/recipients/9d4d7b73-a94c-4979-ab57-09074fd55d33&#x60; |
 **recipientRequest** | [**RecipientRequest**](RecipientRequest.md)|  |

### Return type

[**RecipientResponse**](RecipientResponse.md)

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

