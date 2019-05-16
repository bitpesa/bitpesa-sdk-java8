# WebhooksApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{Webhook ID} | Unsubscribing from a webhook
[**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /webhooks/{Webhook ID} | Find a webhook&#39;s details
[**getWebhookEvents**](WebhooksApi.md#getWebhookEvents) | **GET** /webhooks/events | Find possible webhook events
[**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /webhooks | Listing webhooks
[**postWebhooks**](WebhooksApi.md#postWebhooks) | **POST** /webhooks | Creating a webhook


<a name="deleteWebhook"></a>
# **deleteWebhook**
> WebhookDefinitionResponse deleteWebhook(webhookID)

Unsubscribing from a webhook

Unsubscribes from a webhook specified

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.WebhooksApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

WebhooksApi apiInstance = new WebhooksApi(apiClient);
String webhookID = "webhookID_example"; // String | The ID of webhook to cancel.  Example: `/v1/webhooks/9d4d7b73-a94c-4979-ab57-09074fd55d33`
try {
    WebhookDefinitionResponse result = apiInstance.deleteWebhook(webhookID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        WebhookDefinitionResponse result = e.getResponseObject(WebhookDefinitionResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling WebhooksApi#deleteWebhook");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookID** | **String**| The ID of webhook to cancel.  Example: &#x60;/v1/webhooks/9d4d7b73-a94c-4979-ab57-09074fd55d33&#x60; |

### Return type

[**WebhookDefinitionResponse**](WebhookDefinitionResponse.md)

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

<a name="getWebhook"></a>
# **getWebhook**
> WebhookDefinitionResponse getWebhook(webhookID)

Find a webhook&#39;s details

Look up a webhook&#39;s details with its ID

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.WebhooksApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

WebhooksApi apiInstance = new WebhooksApi(apiClient);
UUID webhookID = new UUID(); // UUID | The ID of the Webhook to look up  Example: `/v1/webhooks/9d4d7b73-a94c-4979-ab57-09074fd55d33`
try {
    WebhookDefinitionResponse result = apiInstance.getWebhook(webhookID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        WebhookDefinitionResponse result = e.getResponseObject(WebhookDefinitionResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling WebhooksApi#getWebhook");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookID** | [**UUID**](.md)| The ID of the Webhook to look up  Example: &#x60;/v1/webhooks/9d4d7b73-a94c-4979-ab57-09074fd55d33&#x60; |

### Return type

[**WebhookDefinitionResponse**](WebhookDefinitionResponse.md)

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

<a name="getWebhookEvents"></a>
# **getWebhookEvents**
> WebhookDefinitionEventListResponse getWebhookEvents()

Find possible webhook events

Fetching possible webhook events

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.WebhooksApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

WebhooksApi apiInstance = new WebhooksApi(apiClient);
try {
    WebhookDefinitionEventListResponse result = apiInstance.getWebhookEvents();
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        WebhookDefinitionEventListResponse result = e.getResponseObject(WebhookDefinitionEventListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling WebhooksApi#getWebhookEvents");
        e.printStackTrace();
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhookDefinitionEventListResponse**](WebhookDefinitionEventListResponse.md)

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

<a name="getWebhooks"></a>
# **getWebhooks**
> WebhookDefinitionListResponse getWebhooks(page, per)

Listing webhooks

Get a list of created webhooks

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.WebhooksApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

WebhooksApi apiInstance = new WebhooksApi(apiClient);
Integer page = 1; // Integer | The page number to request (defaults to 1)
Integer per = 10; // Integer | The number of results to load per page (defaults to 10)
try {
    WebhookDefinitionListResponse result = apiInstance.getWebhooks(page, per);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        WebhookDefinitionListResponse result = e.getResponseObject(WebhookDefinitionListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling WebhooksApi#getWebhooks");
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

[**WebhookDefinitionListResponse**](WebhookDefinitionListResponse.md)

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

<a name="postWebhooks"></a>
# **postWebhooks**
> WebhookDefinitionResponse postWebhooks(webhookDefinitionRequest)

Creating a webhook

Creates a new webhook, subscribing the provided endpoint to the specified event(s) 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.WebhooksApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

WebhooksApi apiInstance = new WebhooksApi(apiClient);
WebhookDefinitionRequest webhookDefinitionRequest = {"webhook":{"url":"http://myhost.com/for/transaction.paid_in","events":["transaction.paid_in"],"metadata":{"my":"data"}}}; // WebhookDefinitionRequest | 
try {
    WebhookDefinitionResponse result = apiInstance.postWebhooks(webhookDefinitionRequest);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        WebhookDefinitionResponse result = e.getResponseObject(WebhookDefinitionResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling WebhooksApi#postWebhooks");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookDefinitionRequest** | [**WebhookDefinitionRequest**](WebhookDefinitionRequest.md)|  |

### Return type

[**WebhookDefinitionResponse**](WebhookDefinitionResponse.md)

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

