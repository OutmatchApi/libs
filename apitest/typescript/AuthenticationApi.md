# .AuthenticationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDashboardAccessApiV1AuthDashboardAccessAppIdPost**](AuthenticationApi.md#getDashboardAccessApiV1AuthDashboardAccessAppIdPost) | **POST** /api/v1/auth/dashboard-access/{app_id}/ | Get Consumer App Portal Access
[**logoutApiV1AuthLogoutPost**](AuthenticationApi.md#logoutApiV1AuthLogoutPost) | **POST** /api/v1/auth/logout/ | Logout


# **getDashboardAccessApiV1AuthDashboardAccessAppIdPost**
> DashboardAccessOut getDashboardAccessApiV1AuthDashboardAccessAppIdPost()

Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthenticationApi(configuration);

let body:.AuthenticationApiGetDashboardAccessApiV1AuthDashboardAccessAppIdPostRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.getDashboardAccessApiV1AuthDashboardAccessAppIdPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**DashboardAccessOut**

### Authorization

[HTTPBearer](README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **logoutApiV1AuthLogoutPost**
> void logoutApiV1AuthLogoutPost()

Logout an app token.  Trying to log out other tokens will fail.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthenticationApi(configuration);

let body:.AuthenticationApiLogoutApiV1AuthLogoutPostRequest = {
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.logoutApiV1AuthLogoutPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**void**

### Authorization

[HTTPBearer](README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successful Response |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


