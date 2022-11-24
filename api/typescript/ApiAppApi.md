# .ApiAppApi

All URIs are relative to *https://api.outmatchapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApiApp**](ApiAppApi.md#createApiApp) | **POST** /apiApp | Create api app
[**createApiAppRelease**](ApiAppApi.md#createApiAppRelease) | **POST** /apiApp/{app_id}/release | Create api app release
[**createApiAppReleaseSdks**](ApiAppApi.md#createApiAppReleaseSdks) | **POST** /apiApp/{app_id}/release/{release_version}/sdk | Generate sdks for a relase


# **createApiApp**
> ApiApp createApiApp()

Create an api app for the authenticated user

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ApiAppApi(configuration);

let body:.ApiAppApiCreateApiAppRequest = {
  // CreateApiAppRequest (optional)
  createApiAppRequest: {
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
 **createApiAppRequest** | **CreateApiAppRequest**|  |


### Return type

**ApiApp**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Example response |  -  |
**4XX** | Example response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createApiAppRelease**
> Release createApiAppRelease()

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
  // string | Created release object (optional)
  body: "body_example",
};

apiInstance.createApiAppRelease(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **string**| Created release object |
 **appId** | [**string**] | app id to associate the release with | defaults to undefined


### Return type

**Release**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Example response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createApiAppReleaseSdks**
> Array<Sdk> createApiAppReleaseSdks()

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
  // CreateApiAppReleaseSdksRequest (optional)
  createApiAppReleaseSdksRequest: {
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
 **createApiAppReleaseSdksRequest** | **CreateApiAppReleaseSdksRequest**|  |
 **appId** | [**string**] | app id | defaults to undefined
 **releaseVersion** | [**string**] | release id | defaults to undefined


### Return type

**Array<Sdk>**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Example response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


