# .MessageApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMessageApiV1AppAppIdMsgPost**](MessageApi.md#createMessageApiV1AppAppIdMsgPost) | **POST** /api/v1/app/{app_id}/msg/ | Create Message
[**getMessageApiV1AppAppIdMsgMsgIdGet**](MessageApi.md#getMessageApiV1AppAppIdMsgMsgIdGet) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/ | Get Message
[**listMessagesApiV1AppAppIdMsgGet**](MessageApi.md#listMessagesApiV1AppAppIdMsgGet) | **GET** /api/v1/app/{app_id}/msg/ | List Messages


# **createMessageApiV1AppAppIdMsgPost**
> MessageOut createMessageApiV1AppAppIdMsgPost(messageIn)

Creates a new message and dispatches it to all of the application's endpoints.  The `eventId` is an optional custom unique ID. It's verified to be unique only up to a day, after that no verification will be made. If a message with the same `eventId` already exists for any application in your environment, a 409 conflict error will be returned.  The `eventType` indicates the type and schema of the event. All messages of a certain `eventType` are expected to have the same schema. Endpoints can choose to only listen to specific event types. Messages can also have `channels`, which similar to event types let endpoints filter by them. Unlike event types, messages can have multiple channels, and channels don't imply a specific message content or schema.  The `payload' property is the webhook's body (the actual webhook message).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MessageApi(configuration);

let body:.MessageApiCreateMessageApiV1AppAppIdMsgPostRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // MessageIn
  messageIn: {
    eventType: "user.signup",
    eventId: "evt_pNZKtWg8Azow",
    channels: ["project_123","group_2"],
    payload: {},
    payloadRetentionPeriod: 90,
  },
  // boolean (optional)
  withContent: true,
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.createMessageApiV1AppAppIdMsgPost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageIn** | **MessageIn**|  |
 **appId** | [**string**] |  | defaults to undefined
 **withContent** | [**boolean**] |  | (optional) defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**MessageOut**

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
**413** | Request Entity Too Large |  -  |
**422** | Validation Error |  -  |
**429** | Too Many Requests |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getMessageApiV1AppAppIdMsgMsgIdGet**
> MessageOut getMessageApiV1AppAppIdMsgMsgIdGet()

Get a message by its ID or eventID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MessageApi(configuration);

let body:.MessageApiGetMessageApiV1AppAppIdMsgMsgIdGetRequest = {
  // string
  msgId: "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.getMessageApiV1AppAppIdMsgMsgIdGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **msgId** | [**string**] |  | defaults to undefined
 **appId** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**MessageOut**

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

# **listMessagesApiV1AppAppIdMsgGet**
> ListResponseMessageOut listMessagesApiV1AppAppIdMsgGet()

List all of the application's messages.  The `before` parameter lets you filter all items created before a certain date and is ignored if an iterator is passed. The `after` parameter lets you filter all items created after a certain date and is ignored if an iterator is passed. `before` and `after` cannot be used simultaneously.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .MessageApi(configuration);

let body:.MessageApiListMessagesApiV1AppAppIdMsgGetRequest = {
  // string
  appId: "app_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // string (optional)
  iterator: "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2",
  // number (optional)
  limit: 50,
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

apiInstance.listMessagesApiV1AppAppIdMsgGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | [**string**] |  | defaults to undefined
 **iterator** | [**string**] |  | (optional) defaults to undefined
 **limit** | [**number**] |  | (optional) defaults to 50
 **eventTypes** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **channel** | [**string**] |  | (optional) defaults to undefined
 **before** | [**Date**] |  | (optional) defaults to undefined
 **after** | [**Date**] |  | (optional) defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**ListResponseMessageOut**

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


