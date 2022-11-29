# EndpointApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEndpointApiV1AppAppIdEndpointPost**](EndpointApi.md#createEndpointApiV1AppAppIdEndpointPost) | **POST** /api/v1/app/{app_id}/endpoint/ | Create Endpoint |
| [**deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete**](EndpointApi.md#deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Delete Endpoint |
| [**getEndpointApiV1AppAppIdEndpointEndpointIdGet**](EndpointApi.md#getEndpointApiV1AppAppIdEndpointEndpointIdGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Get Endpoint |
| [**getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet**](EndpointApi.md#getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Get Endpoint Headers |
| [**getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet**](EndpointApi.md#getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/ | Get Endpoint Secret |
| [**getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet**](EndpointApi.md#getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats/ | Get Endpoint Stats |
| [**listEndpointsApiV1AppAppIdEndpointGet**](EndpointApi.md#listEndpointsApiV1AppAppIdEndpointGet) | **GET** /api/v1/app/{app_id}/endpoint/ | List Endpoints |
| [**patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch**](EndpointApi.md#patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Patch Endpoint Headers |
| [**recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost**](EndpointApi.md#recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover/ | Recover Failed Webhooks |
| [**replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost**](EndpointApi.md#replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing/ | Replay Missing Webhooks |
| [**rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost**](EndpointApi.md#rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate/ | Rotate Endpoint Secret |
| [**updateEndpointApiV1AppAppIdEndpointEndpointIdPut**](EndpointApi.md#updateEndpointApiV1AppAppIdEndpointEndpointIdPut) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Update Endpoint |
| [**updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut**](EndpointApi.md#updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Update Endpoint Headers |


<a name="createEndpointApiV1AppAppIdEndpointPost"></a>
# **createEndpointApiV1AppAppIdEndpointPost**
> EndpointOut createEndpointApiV1AppAppIdEndpointPost(appId, endpointIn, idempotencyKey)

Create Endpoint

Create a new endpoint for the application.  When &#x60;secret&#x60; is &#x60;null&#x60; the secret is automatically generated (recommended)

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import svix.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    EndpointIn endpointIn = new EndpointIn(); // EndpointIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      EndpointOut result = apiInstance.createEndpointApiV1AppAppIdEndpointPost(appId, endpointIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#createEndpointApiV1AppAppIdEndpointPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **endpointIn** | [**EndpointIn**](EndpointIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation Error |  -  |
| **429** | Too Many Requests |  -  |

<a name="deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete"></a>
# **deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete**
> deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(endpointId, appId, idempotencyKey)

Delete Endpoint

Delete an endpoint.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import svix.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String endpointId = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String appId = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      apiInstance.deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(endpointId, appId, idempotencyKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **String**|  | |
| **appId** | **String**|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation Error |  -  |
| **429** | Too Many Requests |  -  |

<a name="getEndpointApiV1AppAppIdEndpointEndpointIdGet"></a>
# **getEndpointApiV1AppAppIdEndpointEndpointIdGet**
> EndpointOut getEndpointApiV1AppAppIdEndpointEndpointIdGet(endpointId, appId, idempotencyKey)

Get Endpoint

Get an application.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import svix.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String endpointId = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String appId = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      EndpointOut result = apiInstance.getEndpointApiV1AppAppIdEndpointEndpointIdGet(endpointId, appId, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getEndpointApiV1AppAppIdEndpointEndpointIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **String**|  | |
| **appId** | **String**|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation Error |  -  |
| **429** | Too Many Requests |  -  |

<a name="getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet"></a>
# **getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet**
> EndpointHeadersOut getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(endpointId, appId, idempotencyKey)

Get Endpoint Headers

Get the additional headers to be sent with the webhook

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import svix.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String endpointId = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String appId = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      EndpointHeadersOut result = apiInstance.getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(endpointId, appId, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **String**|  | |
| **appId** | **String**|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**EndpointHeadersOut**](EndpointHeadersOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation Error |  -  |
| **429** | Too Many Requests |  -  |

<a name="getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet"></a>
# **getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet**
> EndpointSecretOut getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(endpointId, appId, idempotencyKey)

Get Endpoint Secret

Get the endpoint&#39;s signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.svix.com/consuming-webhooks/).

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import svix.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String endpointId = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String appId = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      EndpointSecretOut result = apiInstance.getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(endpointId, appId, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **String**|  | |
| **appId** | **String**|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**EndpointSecretOut**](EndpointSecretOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation Error |  -  |
| **429** | Too Many Requests |  -  |

<a name="getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet"></a>
# **getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet**
> EndpointStats getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(endpointId, appId, idempotencyKey)

Get Endpoint Stats

Get basic statistics for the endpoint.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import svix.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String endpointId = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String appId = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      EndpointStats result = apiInstance.getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(endpointId, appId, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **String**|  | |
| **appId** | **String**|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**EndpointStats**](EndpointStats.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation Error |  -  |
| **429** | Too Many Requests |  -  |

<a name="listEndpointsApiV1AppAppIdEndpointGet"></a>
# **listEndpointsApiV1AppAppIdEndpointGet**
> ListResponseEndpointOut listEndpointsApiV1AppAppIdEndpointGet(appId, iterator, limit, idempotencyKey)

List Endpoints

List the application&#39;s endpoints.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import svix.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String iterator = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    Integer limit = 50; // Integer | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      ListResponseEndpointOut result = apiInstance.listEndpointsApiV1AppAppIdEndpointGet(appId, iterator, limit, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#listEndpointsApiV1AppAppIdEndpointGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **iterator** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 50] |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**ListResponseEndpointOut**](ListResponseEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation Error |  -  |
| **429** | Too Many Requests |  -  |

<a name="patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch"></a>
# **patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch**
> patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(appId, endpointId, endpointHeadersPatchIn, idempotencyKey)

Patch Endpoint Headers

Partially set the additional headers to be sent with the webhook

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import svix.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String endpointId = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    EndpointHeadersPatchIn endpointHeadersPatchIn = new EndpointHeadersPatchIn(); // EndpointHeadersPatchIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      apiInstance.patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(appId, endpointId, endpointHeadersPatchIn, idempotencyKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **endpointId** | **String**|  | |
| **endpointHeadersPatchIn** | [**EndpointHeadersPatchIn**](EndpointHeadersPatchIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation Error |  -  |
| **429** | Too Many Requests |  -  |

<a name="recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost"></a>
# **recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost**
> Object recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(appId, endpointId, recoverIn, idempotencyKey)

Recover Failed Webhooks

Resend all failed messages since a given time.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import svix.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String endpointId = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    RecoverIn recoverIn = new RecoverIn(); // RecoverIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      Object result = apiInstance.recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(appId, endpointId, recoverIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **endpointId** | **String**|  | |
| **recoverIn** | [**RecoverIn**](RecoverIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

**Object**

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation Error |  -  |
| **429** | Too Many Requests |  -  |

<a name="replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost"></a>
# **replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost**
> Object replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(appId, endpointId, replayIn, idempotencyKey)

Replay Missing Webhooks

Replays messages to the endpoint. Only messages that were created after &#x60;since&#x60; will be sent. Messages that were previously sent to the endpoint are not resent.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import svix.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String endpointId = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    ReplayIn replayIn = new ReplayIn(); // ReplayIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      Object result = apiInstance.replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(appId, endpointId, replayIn, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **endpointId** | **String**|  | |
| **replayIn** | [**ReplayIn**](ReplayIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

**Object**

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation Error |  -  |
| **429** | Too Many Requests |  -  |

<a name="rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost"></a>
# **rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost**
> rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(endpointId, appId, endpointSecretRotateIn, idempotencyKey)

Rotate Endpoint Secret

Rotates the endpoint&#39;s signing secret.  The previous secret will be valid for the next 24 hours.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import svix.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String endpointId = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String appId = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    EndpointSecretRotateIn endpointSecretRotateIn = new EndpointSecretRotateIn(); // EndpointSecretRotateIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      apiInstance.rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(endpointId, appId, endpointSecretRotateIn, idempotencyKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **String**|  | |
| **appId** | **String**|  | |
| **endpointSecretRotateIn** | [**EndpointSecretRotateIn**](EndpointSecretRotateIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful Response |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation Error |  -  |
| **429** | Too Many Requests |  -  |

<a name="updateEndpointApiV1AppAppIdEndpointEndpointIdPut"></a>
# **updateEndpointApiV1AppAppIdEndpointEndpointIdPut**
> EndpointOut updateEndpointApiV1AppAppIdEndpointEndpointIdPut(endpointId, appId, endpointUpdate, idempotencyKey)

Update Endpoint

Update an endpoint.

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import svix.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String endpointId = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String appId = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    EndpointUpdate endpointUpdate = new EndpointUpdate(); // EndpointUpdate | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      EndpointOut result = apiInstance.updateEndpointApiV1AppAppIdEndpointEndpointIdPut(endpointId, appId, endpointUpdate, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#updateEndpointApiV1AppAppIdEndpointEndpointIdPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **String**|  | |
| **appId** | **String**|  | |
| **endpointUpdate** | [**EndpointUpdate**](EndpointUpdate.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **201** | Created |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation Error |  -  |
| **429** | Too Many Requests |  -  |

<a name="updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut"></a>
# **updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut**
> updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(appId, endpointId, endpointHeadersIn, idempotencyKey)

Update Endpoint Headers

Set the additional headers to be sent with the webhook

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import svix.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: HTTPBearer
    HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
    HTTPBearer.setBearerToken("BEARER TOKEN");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    String endpointId = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // String | 
    EndpointHeadersIn endpointHeadersIn = new EndpointHeadersIn(); // EndpointHeadersIn | 
    String idempotencyKey = "idempotencyKey_example"; // String | The request's idempotency key
    try {
      apiInstance.updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(appId, endpointId, endpointHeadersIn, idempotencyKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**|  | |
| **endpointId** | **String**|  | |
| **endpointHeadersIn** | [**EndpointHeadersIn**](EndpointHeadersIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Validation Error |  -  |
| **429** | Too Many Requests |  -  |

