# ApiAppApi

All URIs are relative to *https://api.outmatchapi.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApiApp**](ApiAppApi.md#createApiApp) | **POST** /apiApp | Create api app |
| [**createApiAppRelease**](ApiAppApi.md#createApiAppRelease) | **POST** /apiApp/{app_id}/release | Create api app release |
| [**createApiAppReleaseSdks**](ApiAppApi.md#createApiAppReleaseSdks) | **POST** /apiApp/{app_id}/release/{release_version}/sdk | Generate sdks for a relase |


<a name="createApiApp"></a>
# **createApiApp**
> ApiApp createApiApp(createApiAppRequest)

Create api app

Create an api app for the authenticated user

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import api.ApiAppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.outmatchapi.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ApiAppApi apiInstance = new ApiAppApi(defaultClient);
    CreateApiAppRequest createApiAppRequest = new CreateApiAppRequest(); // CreateApiAppRequest | 
    try {
      ApiApp result = apiInstance.createApiApp(createApiAppRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAppApi#createApiApp");
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
| **createApiAppRequest** | [**CreateApiAppRequest**](CreateApiAppRequest.md)|  | [optional] |

### Return type

[**ApiApp**](ApiApp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **4XX** | Example response |  -  |

<a name="createApiAppRelease"></a>
# **createApiAppRelease**
> Release createApiAppRelease(appId, body)

Create api app release

Create an api app release

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import api.ApiAppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.outmatchapi.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ApiAppApi apiInstance = new ApiAppApi(defaultClient);
    String appId = "appId_example"; // String | app id to associate the release with
    String body = "body_example"; // String | Created release object
    try {
      Release result = apiInstance.createApiAppRelease(appId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAppApi#createApiAppRelease");
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
| **appId** | **String**| app id to associate the release with | |
| **body** | **String**| Created release object | [optional] |

### Return type

[**Release**](Release.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |

<a name="createApiAppReleaseSdks"></a>
# **createApiAppReleaseSdks**
> List&lt;Sdk&gt; createApiAppReleaseSdks(appId, releaseVersion, createApiAppReleaseSdksRequest)

Generate sdks for a relase

Generate sdks for a relase

### Example
```java
// Import classes:
import invalidPackageName.ApiClient;
import invalidPackageName.ApiException;
import invalidPackageName.Configuration;
import invalidPackageName.auth.*;
import invalidPackageName.models.*;
import api.ApiAppApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.outmatchapi.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ApiAppApi apiInstance = new ApiAppApi(defaultClient);
    String appId = "appId_example"; // String | app id
    String releaseVersion = "1.0.0"; // String | release id
    CreateApiAppReleaseSdksRequest createApiAppReleaseSdksRequest = new CreateApiAppReleaseSdksRequest(); // CreateApiAppReleaseSdksRequest | 
    try {
      List<Sdk> result = apiInstance.createApiAppReleaseSdks(appId, releaseVersion, createApiAppReleaseSdksRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAppApi#createApiAppReleaseSdks");
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
| **appId** | **String**| app id | |
| **releaseVersion** | **String**| release id | |
| **createApiAppReleaseSdksRequest** | [**CreateApiAppReleaseSdksRequest**](CreateApiAppReleaseSdksRequest.md)|  | [optional] |

### Return type

[**List&lt;Sdk&gt;**](Sdk.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |

