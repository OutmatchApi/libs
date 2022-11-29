# .MessageAttemptApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet**](MessageAttemptApi.md#getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/ | Get Attempt
[**listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet**](MessageAttemptApi.md#listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/ | List Attempted Destinations
[**listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet**](MessageAttemptApi.md#listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg/ | List Attempted Messages
[**listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet**](MessageAttemptApi.md#listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/ | List Attempts
[**listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet**](MessageAttemptApi.md#listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet) | **GET** /api/v1/app/{app_id}/attempt/endpoint/{endpoint_id}/ | List Attempts By Endpoint
[**listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet**](MessageAttemptApi.md#listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet) | **GET** /api/v1/app/{app_id}/attempt/msg/{msg_id}/ | List Attempts By Msg
[**listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet**](MessageAttemptApi.md#listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt/ | List Attempts For Endpoint
[**resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost**](MessageAttemptApi.md#resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost) | **POST** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend/ | Resend Webhook


# **getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet**
> MessageAttemptOut getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet()

`msg_id`: Use a message id or a message `eventId`

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MessageAttemptApi(configuration);

let body:.MessageAttemptApiGetAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGetRequest = {
  // string
  attemptId: "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  msgId: "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.getAttemptApiV1AppAppIdMsgMsgIdAttemptAttemptIdGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attemptId** | [**string**] |  | defaults to undefined
 **msgId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**MessageAttemptOut**

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

# **listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet**
> ListResponseMessageEndpointOut listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet()

`msg_id`: Use a message id or a message `eventId`

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MessageAttemptApi(configuration);

let body:.MessageAttemptApiListAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGetRequest = {
  // string
  msgId: "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string (optional)
  iterator: "msgep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // number (optional)
  limit: 50,
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.listAttemptedDestinationsApiV1AppAppIdMsgMsgIdEndpointGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **iterator** | [**string**] |  | (optional) defaults to undefined
 **limit** | [**number**] |  | (optional) defaults to 50
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**ListResponseMessageEndpointOut**

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

# **listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet**
> ListResponseEndpointMessageOut listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet()

List messages for a particular endpoint. Additionally includes metadata about the latest message attempt.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MessageAttemptApi(configuration);

let body:.MessageAttemptApiListAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGetRequest = {
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string (optional)
  iterator: "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // number (optional)
  limit: 50,
  // string (optional)
  channel: "project_1337",
  // MessageStatus (optional)
  status: 0,
  // Date (optional)
  before: new Date('1970-01-01T00:00:00.00Z'),
  // Date (optional)
  after: new Date('1970-01-01T00:00:00.00Z'),
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.listAttemptedMessagesApiV1AppAppIdEndpointEndpointIdMsgGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **iterator** | [**string**] |  | (optional) defaults to undefined
 **limit** | [**number**] |  | (optional) defaults to 50
 **channel** | [**string**] |  | (optional) defaults to undefined
 **status** | **MessageStatus** |  | (optional) defaults to undefined
 **before** | [**Date**] |  | (optional) defaults to undefined
 **after** | [**Date**] |  | (optional) defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**ListResponseEndpointMessageOut**

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

# **listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet**
> ListResponseMessageAttemptOut listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet()

Deprecated: Please use \"List Attempts by Endpoint\" and \"List Attempts by Msg\" instead.  `msg_id`: Use a message id or a message `eventId`

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MessageAttemptApi(configuration);

let body:.MessageAttemptApiListAttemptsApiV1AppAppIdMsgMsgIdAttemptGetRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  msgId: "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string (optional)
  iterator: "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // number (optional)
  limit: 50,
  // string (optional)
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // Array<string> (optional)
  eventTypes: [
    "user.signup",
  ],
  // string (optional)
  channel: "project_1337",
  // MessageStatus (optional)
  status: 0,
  // Date (optional)
  before: new Date('1970-01-01T00:00:00.00Z'),
  // Date (optional)
  after: new Date('1970-01-01T00:00:00.00Z'),
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.listAttemptsApiV1AppAppIdMsgMsgIdAttemptGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | defaults to undefined
 **msgId** | [**string**] |  | defaults to undefined
 **iterator** | [**string**] |  | (optional) defaults to undefined
 **limit** | [**number**] |  | (optional) defaults to 50
 **endpointId** | [**string**] |  | (optional) defaults to undefined
 **eventTypes** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **channel** | [**string**] |  | (optional) defaults to undefined
 **status** | **MessageStatus** |  | (optional) defaults to undefined
 **before** | [**Date**] |  | (optional) defaults to undefined
 **after** | [**Date**] |  | (optional) defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**ListResponseMessageAttemptOut**

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

# **listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet**
> ListResponseMessageAttemptOut listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet()

List attempts by endpoint id

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MessageAttemptApi(configuration);

let body:.MessageAttemptApiListAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGetRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string (optional)
  iterator: "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // number (optional)
  limit: 50,
  // MessageStatus (optional)
  status: 0,
  // StatusCodeClass (optional)
  statusCodeClass: 0,
  // Array<string> (optional)
  eventTypes: [
    "user.signup",
  ],
  // string (optional)
  channel: "project_1337",
  // Date (optional)
  before: new Date('1970-01-01T00:00:00.00Z'),
  // Date (optional)
  after: new Date('1970-01-01T00:00:00.00Z'),
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.listAttemptsByEndpointApiV1AppAppIdAttemptEndpointEndpointIdGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | defaults to undefined
 **endpointId** | [**string**] |  | defaults to undefined
 **iterator** | [**string**] |  | (optional) defaults to undefined
 **limit** | [**number**] |  | (optional) defaults to 50
 **status** | **MessageStatus** |  | (optional) defaults to undefined
 **statusCodeClass** | **StatusCodeClass** |  | (optional) defaults to undefined
 **eventTypes** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **channel** | [**string**] |  | (optional) defaults to undefined
 **before** | [**Date**] |  | (optional) defaults to undefined
 **after** | [**Date**] |  | (optional) defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**ListResponseMessageAttemptOut**

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

# **listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet**
> ListResponseMessageAttemptOut listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet()

List attempts by message id

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MessageAttemptApi(configuration);

let body:.MessageAttemptApiListAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGetRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  msgId: "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string (optional)
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string (optional)
  iterator: "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // number (optional)
  limit: 50,
  // MessageStatus (optional)
  status: 0,
  // StatusCodeClass (optional)
  statusCodeClass: 0,
  // Array<string> (optional)
  eventTypes: [
    "user.signup",
  ],
  // string (optional)
  channel: "project_1337",
  // Date (optional)
  before: new Date('1970-01-01T00:00:00.00Z'),
  // Date (optional)
  after: new Date('1970-01-01T00:00:00.00Z'),
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.listAttemptsByMsgApiV1AppAppIdAttemptMsgMsgIdGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | defaults to undefined
 **msgId** | [**string**] |  | defaults to undefined
 **endpointId** | [**string**] |  | (optional) defaults to undefined
 **iterator** | [**string**] |  | (optional) defaults to undefined
 **limit** | [**number**] |  | (optional) defaults to 50
 **status** | **MessageStatus** |  | (optional) defaults to undefined
 **statusCodeClass** | **StatusCodeClass** |  | (optional) defaults to undefined
 **eventTypes** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **channel** | [**string**] |  | (optional) defaults to undefined
 **before** | [**Date**] |  | (optional) defaults to undefined
 **after** | [**Date**] |  | (optional) defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**ListResponseMessageAttemptOut**

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

# **listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet**
> ListResponseMessageAttemptEndpointOut listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet()

DEPRECATED: please use list_attempts with endpoint_id as a query parameter instead.  List the message attempts for a particular endpoint.  Returning the endpoint.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MessageAttemptApi(configuration);

let body:.MessageAttemptApiListAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGetRequest = {
  // string
  msgId: "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string (optional)
  iterator: "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // number (optional)
  limit: 50,
  // Array<string> (optional)
  eventTypes: [
    "user.signup",
  ],
  // string (optional)
  channel: "project_1337",
  // MessageStatus (optional)
  status: 0,
  // Date (optional)
  before: new Date('1970-01-01T00:00:00.00Z'),
  // Date (optional)
  after: new Date('1970-01-01T00:00:00.00Z'),
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.listAttemptsForEndpointApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttemptGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **endpointId** | [**string**] |  | defaults to undefined
 **iterator** | [**string**] |  | (optional) defaults to undefined
 **limit** | [**number**] |  | (optional) defaults to 50
 **eventTypes** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **channel** | [**string**] |  | (optional) defaults to undefined
 **status** | **MessageStatus** |  | (optional) defaults to undefined
 **before** | [**Date**] |  | (optional) defaults to undefined
 **after** | [**Date**] |  | (optional) defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**ListResponseMessageAttemptEndpointOut**

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

# **resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost**
> void resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost()

Resend a message to the specified endpoint.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MessageAttemptApi(configuration);

let body:.MessageAttemptApiResendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPostRequest = {
  // string
  endpointId: "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  msgId: "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.resendWebhookApiV1AppAppIdMsgMsgIdEndpointEndpointIdResendPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endpointId** | [**string**] |  | defaults to undefined
 **msgId** | [**string**] |  | defaults to undefined
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
**202** | Successful Response |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


