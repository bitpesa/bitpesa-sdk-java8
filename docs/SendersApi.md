# SendersApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSender**](SendersApi.md#deleteSender) | **DELETE** /senders/{Sender ID} | Deleting a sender
[**getSender**](SendersApi.md#getSender) | **GET** /senders/{Sender ID} | Fetching a sender
[**getSenders**](SendersApi.md#getSenders) | **GET** /senders | Listing senders
[**patchSender**](SendersApi.md#patchSender) | **PATCH** /senders/{Sender ID} | Updating a sender
[**postSenders**](SendersApi.md#postSenders) | **POST** /senders | Creating a sender


<a name="deleteSender"></a>
# **deleteSender**
> SenderResponse deleteSender(senderID)

Deleting a sender

Deletes a single sender by the Sender ID

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.SendersApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

SendersApi apiInstance = new SendersApi(apiClient);
UUID senderID = new UUID(); // UUID | ID of the sender to delete.  Example: `/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670`
try {
    SenderResponse result = apiInstance.deleteSender(senderID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        SenderResponse result = e.getResponseObject(SenderResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling SendersApi#deleteSender");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderID** | [**UUID**](.md)| ID of the sender to delete.  Example: &#x60;/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |

### Return type

[**SenderResponse**](SenderResponse.md)

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

<a name="getSender"></a>
# **getSender**
> SenderResponse getSender(senderID)

Fetching a sender

Returns a single sender by the Sender ID

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.SendersApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

SendersApi apiInstance = new SendersApi(apiClient);
UUID senderID = new UUID(); // UUID | ID of the sender to get.  Example: `/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670`
try {
    SenderResponse result = apiInstance.getSender(senderID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        SenderResponse result = e.getResponseObject(SenderResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling SendersApi#getSender");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderID** | [**UUID**](.md)| ID of the sender to get.  Example: &#x60;/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |

### Return type

[**SenderResponse**](SenderResponse.md)

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

<a name="getSenders"></a>
# **getSenders**
> SenderListResponse getSenders(page, per, createdAtFrom, createdAtTo, externalId)

Listing senders

Get a list of available senders

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.SendersApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

SendersApi apiInstance = new SendersApi(apiClient);
Integer page = 1; // Integer | The page number to request (defaults to 1)
Integer per = 10; // Integer | The number of results to load per page (defaults to 10)
String createdAtFrom = "createdAtFrom_example"; // String | Start date to filter recipients by created_at range Allows filtering results by the specified `created_at` timeframe.  Example: `/v1/recipients?created_at_from=2018-06-06&created_at_to=2018-06-08`
String createdAtTo = "createdAtTo_example"; // String | End date to filter recipients by created_at range Allows filtering results by the specified `created_at` timeframe.  Example: `/v1/recipients?created_at_from=2018-06-06&created_at_to=2018-06-08`
String externalId = "externalId_example"; // String | Allows filtering results by `external_id`.  Example: `/v1/senders?external_id=26ec8517-2f0d-48c0-b74f-0bccb9ab3a87`
try {
    SenderListResponse result = apiInstance.getSenders(page, per, createdAtFrom, createdAtTo, externalId);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        SenderListResponse result = e.getResponseObject(SenderListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling SendersApi#getSenders");
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
 **externalId** | **String**| Allows filtering results by &#x60;external_id&#x60;.  Example: &#x60;/v1/senders?external_id&#x3D;26ec8517-2f0d-48c0-b74f-0bccb9ab3a87&#x60; | [optional]

### Return type

[**SenderListResponse**](SenderListResponse.md)

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

<a name="patchSender"></a>
# **patchSender**
> SenderResponse patchSender(senderID, senderRequest)

Updating a sender

Updates the sender specified in the URL path.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.SendersApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

SendersApi apiInstance = new SendersApi(apiClient);
UUID senderID = new UUID(); // UUID | ID of the sender to get.  Example: `/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670`
SenderRequest senderRequest = new SenderRequest(); // SenderRequest | 
try {
    SenderResponse result = apiInstance.patchSender(senderID, senderRequest);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        SenderResponse result = e.getResponseObject(SenderResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling SendersApi#patchSender");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderID** | [**UUID**](.md)| ID of the sender to get.  Example: &#x60;/v1/senders/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |
 **senderRequest** | [**SenderRequest**](SenderRequest.md)|  |

### Return type

[**SenderResponse**](SenderResponse.md)

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

<a name="postSenders"></a>
# **postSenders**
> SenderResponse postSenders(senderRequest)

Creating a sender

Creates a new sender in our system. 

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.SendersApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

SendersApi apiInstance = new SendersApi(apiClient);
SenderRequest senderRequest = {
  "sender": {
    "country": "UG",
    "phone_country": "UG",
    "phone_number": "752403639",
    "email": "example@home.org",
    "first_name": "Johnny",
    "last_name": "English",
    "city": "Kampala",
    "street": "Unknown 17-3",
    "address_description": "Description of address",
    "postal_code": "798983",
    "birth_date": "1900-12-31",
    "documents": [
      {
        "upload": "data:image/png;base64,iVBORw0KGg...lFTkSuQmCC",
        "upload_file_name": "example.png",
        "metadata": {
          "my": "data"
        }
      }
    ],
    "ip": "127.0.0.1",
    "external_id": "806ec63a-a5a7-43cc-9d75-1ee74fbcc026",
    "metadata": {
      "my": "data"
    }
  }
}; // SenderRequest | 
try {
    SenderResponse result = apiInstance.postSenders(senderRequest);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        SenderResponse result = e.getResponseObject(SenderResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling SendersApi#postSenders");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderRequest** | [**SenderRequest**](SenderRequest.md)|  |

### Return type

[**SenderResponse**](SenderResponse.md)

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

