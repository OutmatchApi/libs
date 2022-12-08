# \WebhooksApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**d_elete_webhook**](WebhooksApi.md#d_elete_webhook) | **DELETE** /webhooks/{webhookId} | Delete a Webhook
[**g_et_webhook**](WebhooksApi.md#g_et_webhook) | **GET** /webhooks/{webhookId} | Show Webhook details
[**l_ist_webhooks**](WebhooksApi.md#l_ist_webhooks) | **GET** /webhooks | List all webhooks
[**p_ost_webhooks**](WebhooksApi.md#p_ost_webhooks) | **POST** /webhooks | Create Webhook



## d_elete_webhook

> d_elete_webhook(webhook_id)
Delete a Webhook

This endpoint will delete the indicated webhook.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**webhook_id** | **String** | The webhook you wish to delete. | [required] |

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_webhook

> crate::models::Webhook g_et_webhook(webhook_id)
Show Webhook details

This call provides the same JSON information provided on Webjhook creation.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**webhook_id** | **String** | The unique webhook you wish to retreive details on. | [required] |

### Return type

[**crate::models::Webhook**](webhook.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## l_ist_webhooks

> crate::models::WebhooksListResponse l_ist_webhooks(events, current_page, page_size)
List all webhooks

Requests to this endpoint return a list of your webhooks (with all their details). You can filter what the webhook list that the API returns using the parameters described below.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**events** | Option<**String**> | The webhook event that you wish to filter on. |  |
**current_page** | Option<**i32**> | Choose the number of search results to return per page. Minimum value: 1 |  |[default to 1]
**page_size** | Option<**i32**> | Results per page. Allowed values 1-100, default is 25. |  |[default to 25]

### Return type

[**crate::models::WebhooksListResponse**](webhooks-list-response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_ost_webhooks

> crate::models::Webhook p_ost_webhooks(webhooks_create_payload)
Create Webhook

Webhooks can push notifications to your server, rather than polling api.video for changes. We currently offer four events:  * ```video.encoding.quality.completed```  When a new video is uploaded into your account, it will be encoded into several different HLS sizes/bitrates.  When each version is encoded, your webhook will get a notification.  It will look like ```{ \\\"type\\\": \\\"video.encoding.quality.completed\\\", \\\"emittedAt\\\": \\\"2021-01-29T16:46:25.217+01:00\\\", \\\"videoId\\\": \\\"viXXXXXXXX\\\", \\\"encoding\\\": \\\"hls\\\", \\\"quality\\\": \\\"720p\\\"} ```. This request says that the 720p HLS encoding was completed. * ```live-stream.broadcast.started```  When a livestream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * ```live-stream.broadcast.ended```  This event fores when the livestream has finished broadcasting, and the broadcasting parameter flips from false to true. * ```video.source.recorded```  This event is similar to ```video.encoding.quality.completed```, but tells you if a livestream has been recorded as a VOD.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**webhooks_create_payload** | Option<[**WebhooksCreatePayload**](WebhooksCreatePayload.md)> |  |  |

### Return type

[**crate::models::Webhook**](webhook.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

