

# ApiLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | ID of the API log |  [optional]
**requestMethod** | **String** | Initial HTTP request method |  [optional]
**requestUrl** | **String** | URL to which initial request was sent |  [optional]
**requestBody** | **String** | Body sent with initial request returned as a string |  [optional]
**requestHeaders** | **Map&lt;String, String&gt;** | Authorization and access information sent with initial request |  [optional]
**responseStatus** | **String** | Status of response |  [optional]
**responseBody** | **String** | Full response body returned as a string |  [optional]
**responseHeaders** | **Map&lt;String, String&gt;** | Headers returned with response |  [optional]
**createdAt** | **String** | Date and time of response |  [optional]



