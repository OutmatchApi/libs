# .WebhooksApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEWebhook**](WebhooksApi.md#dELETEWebhook) | **DELETE** /webhooks/{webhookId} | Delete a Webhook
[**gETWebhook**](WebhooksApi.md#gETWebhook) | **GET** /webhooks/{webhookId} | Show Webhook details
[**lISTWebhooks**](WebhooksApi.md#lISTWebhooks) | **GET** /webhooks | List all webhooks
[**pOSTWebhooks**](WebhooksApi.md#pOSTWebhooks) | **POST** /webhooks | Create Webhook


# **dELETEWebhook**
> void dELETEWebhook()

This endpoint will delete the indicated webhook.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WebhooksApi(configuration);

let body:.WebhooksApiDELETEWebhookRequest = {
  // string | The webhook you wish to delete.
  webhookId: "webhookId_example",
};

apiInstance.dELETEWebhook(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**string**] | The webhook you wish to delete. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **gETWebhook**
> Webhook gETWebhook()

This call provides the same JSON information provided on Webjhook creation.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WebhooksApi(configuration);

let body:.WebhooksApiGETWebhookRequest = {
  // string | The unique webhook you wish to retreive details on.
  webhookId: "webhookId_example",
};

apiInstance.gETWebhook(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | [**string**] | The unique webhook you wish to retreive details on. | defaults to undefined


### Return type

**Webhook**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **lISTWebhooks**
> WebhooksListResponse lISTWebhooks()

Requests to this endpoint return a list of your webhooks (with all their details). You can filter what the webhook list that the API returns using the parameters described below.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WebhooksApi(configuration);

let body:.WebhooksApiLISTWebhooksRequest = {
  // string | The webhook event that you wish to filter on. (optional)
  events: "video.encoding.quality.completed",
  // number | Choose the number of search results to return per page. Minimum value: 1 (optional)
  currentPage: 2,
  // number | Results per page. Allowed values 1-100, default is 25. (optional)
  pageSize: 30,
};

apiInstance.lISTWebhooks(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **events** | [**string**] | The webhook event that you wish to filter on. | (optional) defaults to undefined
 **currentPage** | [**number**] | Choose the number of search results to return per page. Minimum value: 1 | (optional) defaults to 1
 **pageSize** | [**number**] | Results per page. Allowed values 1-100, default is 25. | (optional) defaults to 25


### Return type

**WebhooksListResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pOSTWebhooks**
> Webhook pOSTWebhooks()

Webhooks can push notifications to your server, rather than polling api.video for changes. We currently offer four events:  * ```video.encoding.quality.completed```  When a new video is uploaded into your account, it will be encoded into several different HLS sizes/bitrates.  When each version is encoded, your webhook will get a notification.  It will look like ```{ \\\"type\\\": \\\"video.encoding.quality.completed\\\", \\\"emittedAt\\\": \\\"2021-01-29T16:46:25.217+01:00\\\", \\\"videoId\\\": \\\"viXXXXXXXX\\\", \\\"encoding\\\": \\\"hls\\\", \\\"quality\\\": \\\"720p\\\"} ```. This request says that the 720p HLS encoding was completed. * ```live-stream.broadcast.started```  When a livestream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * ```live-stream.broadcast.ended```  This event fores when the livestream has finished broadcasting, and the broadcasting parameter flips from false to true. * ```video.source.recorded```  This event is similar to ```video.encoding.quality.completed```, but tells you if a livestream has been recorded as a VOD.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WebhooksApi(configuration);

let body:.WebhooksApiPOSTWebhooksRequest = {
  // WebhooksCreatePayload (optional)
  webhooksCreatePayload: {
    events: [
      "video.encoding.quality.completed",
    ],
    url: "https://example.com/webhooks",
  },
};

apiInstance.pOSTWebhooks(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhooksCreatePayload** | **WebhooksCreatePayload**|  |


### Return type

**Webhook**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


