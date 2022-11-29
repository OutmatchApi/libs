# .EndpointApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEndpointApiV1AppAppIdEndpointPost**](EndpointApi.md#createEndpointApiV1AppAppIdEndpointPost) | **POST** /api/v1/app/{app_id}/endpoint/ | Create Endpoint
[**deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete**](EndpointApi.md#deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Delete Endpoint
[**getEndpointApiV1AppAppIdEndpointEndpointIdGet**](EndpointApi.md#getEndpointApiV1AppAppIdEndpointEndpointIdGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Get Endpoint
[**getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet**](EndpointApi.md#getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Get Endpoint Headers
[**getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet**](EndpointApi.md#getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/ | Get Endpoint Secret
[**getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet**](EndpointApi.md#getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats/ | Get Endpoint Stats
[**listEndpointsApiV1AppAppIdEndpointGet**](EndpointApi.md#listEndpointsApiV1AppAppIdEndpointGet) | **GET** /api/v1/app/{app_id}/endpoint/ | List Endpoints
[**patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch**](EndpointApi.md#patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Patch Endpoint Headers
[**recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost**](EndpointApi.md#recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover/ | Recover Failed Webhooks
[**replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost**](EndpointApi.md#replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing/ | Replay Missing Webhooks
[**rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost**](EndpointApi.md#rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate/ | Rotate Endpoint Secret
[**updateEndpointApiV1AppAppIdEndpointEndpointIdPut**](EndpointApi.md#updateEndpointApiV1AppAppIdEndpointEndpointIdPut) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/ | Update Endpoint
[**updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut**](EndpointApi.md#updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/ | Update Endpoint Headers


# **createEndpointApiV1AppAppIdEndpointPost**
> EndpointOut createEndpointApiV1AppAppIdEndpointPost(endpointIn)

Create a new endpoint for the application.  When `secret` is `null` the secret is automatically generated (recommended)

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EndpointApi(configuration);

let body:.EndpointApiCreateEndpointApiV1AppAppIdEndpointPostRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // EndpointIn
  endpointIn: {
    uid: "unique-endpoint-identifier",
    url: "https://example.com/webhook/",
    version: 1,
    description: "An example endpoint name",
    filterTypes: ["user.signup","user.deleted"],
    channels: ["project_123","group_2"],
    disabled: false,
    rateLimit: 1000,
    metadata: {
      "key": "key_example",
    },
    secret: "whsec_C2FVsBQIhrscChlQIMV+b5sSYspob7oD",
  },
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.createEndpointApiV1AppAppIdEndpointPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointIn** | **EndpointIn**|  |
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**EndpointOut**

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

# **deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete**
> void deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete()

Delete an endpoint.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EndpointApi(configuration);

let body:.EndpointApiDeleteEndpointApiV1AppAppIdEndpointEndpointIdDeleteRequest = {
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.deleteEndpointApiV1AppAppIdEndpointEndpointIdDelete(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | [**string**] |  | defaults to undefined
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

# **getEndpointApiV1AppAppIdEndpointEndpointIdGet**
> EndpointOut getEndpointApiV1AppAppIdEndpointEndpointIdGet()

Get an application.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EndpointApi(configuration);

let body:.EndpointApiGetEndpointApiV1AppAppIdEndpointEndpointIdGetRequest = {
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.getEndpointApiV1AppAppIdEndpointEndpointIdGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**EndpointOut**

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

# **getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet**
> EndpointHeadersOut getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet()

Get the additional headers to be sent with the webhook

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EndpointApi(configuration);

let body:.EndpointApiGetEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGetRequest = {
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.getEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**EndpointHeadersOut**

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

# **getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet**
> EndpointSecretOut getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet()

Get the endpoint's signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.svix.com/consuming-webhooks/).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EndpointApi(configuration);

let body:.EndpointApiGetEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGetRequest = {
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.getEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**EndpointSecretOut**

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

# **getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet**
> EndpointStats getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet()

Get basic statistics for the endpoint.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EndpointApi(configuration);

let body:.EndpointApiGetEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGetRequest = {
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.getEndpointStatsApiV1AppAppIdEndpointEndpointIdStatsGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**EndpointStats**

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

# **listEndpointsApiV1AppAppIdEndpointGet**
> ListResponseEndpointOut listEndpointsApiV1AppAppIdEndpointGet()

List the application's endpoints.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EndpointApi(configuration);

let body:.EndpointApiListEndpointsApiV1AppAppIdEndpointGetRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string (optional)
  iterator: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // number (optional)
  limit: 50,
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.listEndpointsApiV1AppAppIdEndpointGet(body).then((data:any) => {
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

**ListResponseEndpointOut**

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

# **patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch**
> void patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(endpointHeadersPatchIn)

Partially set the additional headers to be sent with the webhook

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EndpointApi(configuration);

let body:.EndpointApiPatchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatchRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // EndpointHeadersPatchIn
  endpointHeadersPatchIn: {
    headers: {
      "key": "key_example",
    },
  },
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.patchEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPatch(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointHeadersPatchIn** | **EndpointHeadersPatchIn**|  |
 **appId** | [**string**] |  | defaults to undefined
 **endpointId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**void**

### Authorization

[HTTPBearer](README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
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

# **recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost**
> any recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(recoverIn)

Resend all failed messages since a given time.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EndpointApi(configuration);

let body:.EndpointApiRecoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPostRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // RecoverIn
  recoverIn: {
    since: new Date('1970-01-01T00:00:00.00Z'),
    until: new Date('1970-01-01T00:00:00.00Z'),
  },
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.recoverFailedWebhooksApiV1AppAppIdEndpointEndpointIdRecoverPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recoverIn** | **RecoverIn**|  |
 **appId** | [**string**] |  | defaults to undefined
 **endpointId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**any**

### Authorization

[HTTPBearer](README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Successful Response |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost**
> any replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(replayIn)

Replays messages to the endpoint. Only messages that were created after `since` will be sent. Messages that were previously sent to the endpoint are not resent.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EndpointApi(configuration);

let body:.EndpointApiReplayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPostRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // ReplayIn
  replayIn: {
    since: new Date('1970-01-01T00:00:00.00Z'),
    until: new Date('1970-01-01T00:00:00.00Z'),
  },
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.replayMissingWebhooksApiV1AppAppIdEndpointEndpointIdReplayMissingPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replayIn** | **ReplayIn**|  |
 **appId** | [**string**] |  | defaults to undefined
 **endpointId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**any**

### Authorization

[HTTPBearer](README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Successful Response |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost**
> void rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(endpointSecretRotateIn)

Rotates the endpoint's signing secret.  The previous secret will be valid for the next 24 hours.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EndpointApi(configuration);

let body:.EndpointApiRotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePostRequest = {
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // EndpointSecretRotateIn
  endpointSecretRotateIn: {
    key: "whsec_C2FVsBQIhrscChlQIMV+b5sSYspob7oD",
  },
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.rotateEndpointSecretApiV1AppAppIdEndpointEndpointIdSecretRotatePost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointSecretRotateIn** | **EndpointSecretRotateIn**|  |
 **endpointId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**void**

### Authorization

[HTTPBearer](README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successful Response |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateEndpointApiV1AppAppIdEndpointEndpointIdPut**
> EndpointOut updateEndpointApiV1AppAppIdEndpointEndpointIdPut(endpointUpdate)

Update an endpoint.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EndpointApi(configuration);

let body:.EndpointApiUpdateEndpointApiV1AppAppIdEndpointEndpointIdPutRequest = {
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // EndpointUpdate
  endpointUpdate: {
    uid: "unique-endpoint-identifier",
    url: "https://example.com/webhook/",
    version: 1,
    description: "An example endpoint name",
    filterTypes: ["user.signup","user.deleted"],
    channels: ["project_123","group_2"],
    disabled: false,
    rateLimit: 1000,
    metadata: {
      "key": "key_example",
    },
  },
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.updateEndpointApiV1AppAppIdEndpointEndpointIdPut(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointUpdate** | **EndpointUpdate**|  |
 **endpointId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**EndpointOut**

### Authorization

[HTTPBearer](README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut**
> void updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(endpointHeadersIn)

Set the additional headers to be sent with the webhook

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EndpointApi(configuration);

let body:.EndpointApiUpdateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPutRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // EndpointHeadersIn
  endpointHeadersIn: {
    headers: {
      "key": "key_example",
    },
  },
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.updateEndpointHeadersApiV1AppAppIdEndpointEndpointIdHeadersPut(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointHeadersIn** | **EndpointHeadersIn**|  |
 **appId** | [**string**] |  | defaults to undefined
 **endpointId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**void**

### Authorization

[HTTPBearer](README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
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


