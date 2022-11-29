# .EventTypeApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEventTypeApiV1EventTypePost**](EventTypeApi.md#createEventTypeApiV1EventTypePost) | **POST** /api/v1/event-type/ | Create Event Type
[**deleteEventTypeApiV1EventTypeEventTypeNameDelete**](EventTypeApi.md#deleteEventTypeApiV1EventTypeEventTypeNameDelete) | **DELETE** /api/v1/event-type/{event_type_name}/ | Archive Event Type
[**getEventTypeApiV1EventTypeEventTypeNameGet**](EventTypeApi.md#getEventTypeApiV1EventTypeEventTypeNameGet) | **GET** /api/v1/event-type/{event_type_name}/ | Get Event Type
[**listEventTypesApiV1EventTypeGet**](EventTypeApi.md#listEventTypesApiV1EventTypeGet) | **GET** /api/v1/event-type/ | List Event Types
[**updateEventTypeApiV1EventTypeEventTypeNamePut**](EventTypeApi.md#updateEventTypeApiV1EventTypeEventTypeNamePut) | **PUT** /api/v1/event-type/{event_type_name}/ | Update Event Type


# **createEventTypeApiV1EventTypePost**
> EventTypeOut createEventTypeApiV1EventTypePost(eventTypeIn)

Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EventTypeApi(configuration);

let body:.EventTypeApiCreateEventTypeApiV1EventTypePostRequest = {
  // EventTypeIn
  eventTypeIn: {
    description: "A user has signed up",
    schemas: {
      "key": {},
    },
    archived: false,
    name: "user.signup",
  },
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.createEventTypeApiV1EventTypePost(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventTypeIn** | **EventTypeIn**|  |
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**EventTypeOut**

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

# **deleteEventTypeApiV1EventTypeEventTypeNameDelete**
> void deleteEventTypeApiV1EventTypeEventTypeNameDelete()

Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EventTypeApi(configuration);

let body:.EventTypeApiDeleteEventTypeApiV1EventTypeEventTypeNameDeleteRequest = {
  // string
  eventTypeName: "user.signup",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.deleteEventTypeApiV1EventTypeEventTypeNameDelete(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventTypeName** | [**string**] |  | defaults to undefined
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

# **getEventTypeApiV1EventTypeEventTypeNameGet**
> EventTypeOut getEventTypeApiV1EventTypeEventTypeNameGet()

Get an event type.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EventTypeApi(configuration);

let body:.EventTypeApiGetEventTypeApiV1EventTypeEventTypeNameGetRequest = {
  // string
  eventTypeName: "user.signup",
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.getEventTypeApiV1EventTypeEventTypeNameGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventTypeName** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**EventTypeOut**

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

# **listEventTypesApiV1EventTypeGet**
> ListResponseEventTypeOut listEventTypesApiV1EventTypeGet()

Return the list of event types.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EventTypeApi(configuration);

let body:.EventTypeApiListEventTypesApiV1EventTypeGetRequest = {
  // string (optional)
  iterator: "user.signup",
  // number (optional)
  limit: 50,
  // boolean (optional)
  withContent: false,
  // boolean (optional)
  includeArchived: false,
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.listEventTypesApiV1EventTypeGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **iterator** | [**string**] |  | (optional) defaults to undefined
 **limit** | [**number**] |  | (optional) defaults to 50
 **withContent** | [**boolean**] |  | (optional) defaults to undefined
 **includeArchived** | [**boolean**] |  | (optional) defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**ListResponseEventTypeOut**

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

# **updateEventTypeApiV1EventTypeEventTypeNamePut**
> EventTypeOut updateEventTypeApiV1EventTypeEventTypeNamePut(eventTypeUpdate)

Update an event type.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EventTypeApi(configuration);

let body:.EventTypeApiUpdateEventTypeApiV1EventTypeEventTypeNamePutRequest = {
  // string
  eventTypeName: "user.signup",
  // EventTypeUpdate
  eventTypeUpdate: {
    description: "A user has signed up",
    schemas: {
      "key": {},
    },
    archived: false,
  },
  // string | The request's idempotency key (optional)
  idempotencyKey: "idempotency-key_example",
};

apiInstance.updateEventTypeApiV1EventTypeEventTypeNamePut(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventTypeUpdate** | **EventTypeUpdate**|  |
 **eventTypeName** | [**string**] |  | defaults to undefined
 **idempotencyKey** | [**string**] | The request&#39;s idempotency key | (optional) defaults to undefined


### Return type

**EventTypeOut**

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


