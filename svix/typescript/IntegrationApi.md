# .IntegrationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIntegrationApiV1AppAppIdIntegrationPost**](IntegrationApi.md#createIntegrationApiV1AppAppIdIntegrationPost) | **POST** /api/v1/app/{app_id}/integration/ | Create Integration
[**deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete**](IntegrationApi.md#deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete) | **DELETE** /api/v1/app/{app_id}/integration/{integ_id}/ | Delete Integration
[**getIntegrationApiV1AppAppIdIntegrationIntegIdGet**](IntegrationApi.md#getIntegrationApiV1AppAppIdIntegrationIntegIdGet) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/ | Get Integration
[**getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet**](IntegrationApi.md#getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/key/ | Get Integration Key
[**listIntegrationsApiV1AppAppIdIntegrationGet**](IntegrationApi.md#listIntegrationsApiV1AppAppIdIntegrationGet) | **GET** /api/v1/app/{app_id}/integration/ | List Integrations
[**rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost**](IntegrationApi.md#rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost) | **POST** /api/v1/app/{app_id}/integration/{integ_id}/key/rotate/ | Rotate Integration Key
[**updateIntegrationApiV1AppAppIdIntegrationIntegIdPut**](IntegrationApi.md#updateIntegrationApiV1AppAppIdIntegrationIntegIdPut) | **PUT** /api/v1/app/{app_id}/integration/{integ_id}/ | Update Integration


# **createIntegrationApiV1AppAppIdIntegrationPost**
> IntegrationOut createIntegrationApiV1AppAppIdIntegrationPost(integrationIn)

Create an integration.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationApi(configuration);

let body:.IntegrationApiCreateIntegrationApiV1AppAppIdIntegrationPostRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // IntegrationIn
  integrationIn: {
    name: "Example Integration",
  },
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.createIntegrationApiV1AppAppIdIntegrationPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationIn** | **IntegrationIn**|  |
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**IntegrationOut**

### Authorization

[HTTPBearer](README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successful Response |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete**
> void deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete()

Delete an integration and revoke it's key.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationApi(configuration);

let body:.IntegrationApiDeleteIntegrationApiV1AppAppIdIntegrationIntegIdDeleteRequest = {
  // string
  integId: "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.deleteIntegrationApiV1AppAppIdIntegrationIntegIdDelete(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
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

# **getIntegrationApiV1AppAppIdIntegrationIntegIdGet**
> IntegrationOut getIntegrationApiV1AppAppIdIntegrationIntegIdGet()

Get an integration.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationApi(configuration);

let body:.IntegrationApiGetIntegrationApiV1AppAppIdIntegrationIntegIdGetRequest = {
  // string
  integId: "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.getIntegrationApiV1AppAppIdIntegrationIntegIdGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**IntegrationOut**

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

# **getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet**
> IntegrationKeyOut getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet()

Get an integration's key.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationApi(configuration);

let body:.IntegrationApiGetIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGetRequest = {
  // string
  integId: "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.getIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**IntegrationKeyOut**

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

# **listIntegrationsApiV1AppAppIdIntegrationGet**
> ListResponseIntegrationOut listIntegrationsApiV1AppAppIdIntegrationGet()

List the application's integrations.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationApi(configuration);

let body:.IntegrationApiListIntegrationsApiV1AppAppIdIntegrationGetRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string (optional)
  iterator: "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // number (optional)
  limit: 50,
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.listIntegrationsApiV1AppAppIdIntegrationGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | defaults to undefined
 **iterator** | [**string**] |  | (optional) defaults to undefined
 **limit** | [**number**] |  | (optional) defaults to 50
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**ListResponseIntegrationOut**

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

# **rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost**
> IntegrationKeyOut rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost()

Rotate the integration's key. The previous key will be immediately revoked.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationApi(configuration);

let body:.IntegrationApiRotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePostRequest = {
  // string
  integId: "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.rotateIntegrationKeyApiV1AppAppIdIntegrationIntegIdKeyRotatePost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**IntegrationKeyOut**

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

# **updateIntegrationApiV1AppAppIdIntegrationIntegIdPut**
> IntegrationOut updateIntegrationApiV1AppAppIdIntegrationIntegIdPut(integrationUpdate)

Update an integration.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .IntegrationApi(configuration);

let body:.IntegrationApiUpdateIntegrationApiV1AppAppIdIntegrationIntegIdPutRequest = {
  // string
  integId: "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // IntegrationUpdate
  integrationUpdate: {
    name: "Example Integration",
  },
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.updateIntegrationApiV1AppAppIdIntegrationIntegIdPut(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationUpdate** | **IntegrationUpdate**|  |
 **integId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**IntegrationOut**

### Authorization

[HTTPBearer](README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
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


