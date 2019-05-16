# DocumentsApi

All URIs are relative to *https://api-sandbox.transferzero.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDocument**](DocumentsApi.md#getDocument) | **GET** /documents/{Document ID} | Fetching a document
[**getDocuments**](DocumentsApi.md#getDocuments) | **GET** /documents | Getting a list of documents
[**postDocuments**](DocumentsApi.md#postDocuments) | **POST** /documents | Creating a document


<a name="getDocument"></a>
# **getDocument**
> DocumentResponse getDocument(documentID)

Fetching a document

Returns a single document by the Documents ID

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.DocumentsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

DocumentsApi apiInstance = new DocumentsApi(apiClient);
UUID documentID = new UUID(); // UUID | ID of the document to get.  Example: `/v1/documents/bf9ff782-e182-45ac-abea-5bce83ad6670`
try {
    DocumentResponse result = apiInstance.getDocument(documentID);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DocumentResponse result = e.getResponseObject(DocumentResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling DocumentsApi#getDocument");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentID** | [**UUID**](.md)| ID of the document to get.  Example: &#x60;/v1/documents/bf9ff782-e182-45ac-abea-5bce83ad6670&#x60; |

### Return type

[**DocumentResponse**](DocumentResponse.md)

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

<a name="getDocuments"></a>
# **getDocuments**
> DocumentListResponse getDocuments(page, per)

Getting a list of documents

Fetches a list of documents.

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.DocumentsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

DocumentsApi apiInstance = new DocumentsApi(apiClient);
Integer page = 1; // Integer | The page number to request (defaults to 1)
Integer per = 10; // Integer | The number of results to load per page (defaults to 10)
try {
    DocumentListResponse result = apiInstance.getDocuments(page, per);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DocumentListResponse result = e.getResponseObject(DocumentListResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling DocumentsApi#getDocuments");
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

[**DocumentListResponse**](DocumentListResponse.md)

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

<a name="postDocuments"></a>
# **postDocuments**
> DocumentResponse postDocuments(documentRequest)

Creating a document

Creates a new document

### Example
```java
// Import classes:
//import com.transferzero.sdk.ApiClient;
//import com.transferzero.sdk.ApiException;
//import com.transferzero.sdk.Configuration;
//import com.transferzero.sdk.auth.*;
//import com.transferzero.sdk.api.DocumentsApi;

ApiClient apiClient = new ApiClient();
apiClient.setApiKey("<key>");
apiClient.setApiSecret("<secret>");
apiClient.setBasePath("https://api-sandbox.transferzero.com/v1");

DocumentsApi apiInstance = new DocumentsApi(apiClient);
DocumentRequest documentRequest = new DocumentRequest(); // DocumentRequest | 
try {
    DocumentResponse result = apiInstance.postDocuments(documentRequest);
    System.out.println(result);
} catch (ApiException e) {
    if (e.isValidationError()) {
        DocumentResponse result = e.getResponseObject(DocumentResponse.class);
        System.out.println(result);
        System.err.println("WARN: Validation error occurred when calling the endpoint");
    } else {
        System.err.println("Exception when calling DocumentsApi#postDocuments");
        e.printStackTrace();
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentRequest** | [**DocumentRequest**](DocumentRequest.md)|  |

### Return type

[**DocumentResponse**](DocumentResponse.md)

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

