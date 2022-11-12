# .ApiAppApi

All URIs are relative to *http://localhost:8000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApiApp**](ApiAppApi.md#createApiApp) | **POST** /apiApp | Create api app
[**createApiAppRelease**](ApiAppApi.md#createApiAppRelease) | **POST** /apiApp/{app_id}/release | Create api app release
[**createApiAppReleaseSdks**](ApiAppApi.md#createApiAppReleaseSdks) | **POST** /apiApp/{app_id}/release/{release_version}/sdk | Generate sdks for a relase


# **createApiApp**
> createApiApp()

Create an api app for the authenticated user

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ApiAppApi(configuration);

let body:.ApiAppApiCreateApiAppRequest = {
  // ApiAppRequest | Created api app object (optional)
  apiAppRequest: {
    name: "My Api",
  },
};

apiInstance.createApiApp(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiAppRequest** | **ApiAppRequest**| Created api app object |


### Return type

void (empty response body)

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**4XX** | Client Error |  -  |
**0** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createApiAppRelease**
> createApiAppRelease()

Create an api app release

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ApiAppApi(configuration);

let body:.ApiAppApiCreateApiAppReleaseRequest = {
  // string | app id to associate the release with
  appId: "app_id_example",
  // ReleaseRequest | Created release object (optional)
  releaseRequest: {
    specString: "a json/yaml open api spec",
  },
};

apiInstance.createApiAppRelease(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **releaseRequest** | **ReleaseRequest**| Created release object |
 **appId** | [**string**] | app id to associate the release with | defaults to undefined


### Return type

void (empty response body)

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**4XX** | Client Error |  -  |
**0** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createApiAppReleaseSdks**
> createApiAppReleaseSdks()

Generate sdks for a relase

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ApiAppApi(configuration);

let body:.ApiAppApiCreateApiAppReleaseSdksRequest = {
  // string | app id
  appId: "app_id_example",
  // string | release id
  releaseVersion: "1.0.0",
  // SdkRequest | Created sdks objects (optional)
  sdkRequest: {
    languages: [
      "go",
    ],
  },
};

apiInstance.createApiAppReleaseSdks(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdkRequest** | **SdkRequest**| Created sdks objects |
 **appId** | [**string**] | app id | defaults to undefined
 **releaseVersion** | [**string**] | release id | defaults to undefined


### Return type

void (empty response body)

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**4XX** | Client Error |  -  |
**0** | successful operation |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


