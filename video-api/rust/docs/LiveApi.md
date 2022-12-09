# \LiveApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**d_elete_live_streams_live_stream_id**](LiveApi.md#d_elete_live_streams_live_stream_id) | **DELETE** /live-streams/{liveStreamId} | Delete a live stream
[**d_elete_live_streams_live_stream_id_thumbnail**](LiveApi.md#d_elete_live_streams_live_stream_id_thumbnail) | **DELETE** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail
[**g_et_live_streams**](LiveApi.md#g_et_live_streams) | **GET** /live-streams | List all live streams
[**g_et_live_streams_live_stream_id**](LiveApi.md#g_et_live_streams_live_stream_id) | **GET** /live-streams/{liveStreamId} | Show live stream
[**p_atch_live_streams_live_stream_id**](LiveApi.md#p_atch_live_streams_live_stream_id) | **PATCH** /live-streams/{liveStreamId} | Update a live stream
[**p_ost_live_streams**](LiveApi.md#p_ost_live_streams) | **POST** /live-streams | Create live stream
[**p_ost_live_streams_live_stream_id_thumbnail**](LiveApi.md#p_ost_live_streams_live_stream_id_thumbnail) | **POST** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail



## d_elete_live_streams_live_stream_id

> d_elete_live_streams_live_stream_id(live_stream_id)
Delete a live stream

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**live_stream_id** | **String** | The unique ID for the live stream that you want to remove. | [required] |

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## d_elete_live_streams_live_stream_id_thumbnail

> crate::models::LiveStream d_elete_live_streams_live_stream_id_thumbnail(live_stream_id)
Delete a thumbnail

Send the unique identifier for a live stream to delete it from the system.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**live_stream_id** | **String** | The unique identifier for the live stream you want to delete.  | [required] |

### Return type

[**crate::models::LiveStream**](live-stream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_live_streams

> crate::models::LiveStreamListResponse g_et_live_streams(stream_key, name, sort_by, sort_order, current_page, page_size)
List all live streams

With no parameters added to the url, this will return all livestreams. Query by name or key to limit the list.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**stream_key** | Option<**String**> | The unique stream key that allows you to stream videos. |  |
**name** | Option<**String**> | You can filter live streams by their name or a part of their name. |  |
**sort_by** | Option<**String**> | Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format. |  |
**sort_order** | Option<**String**> | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending. |  |
**current_page** | Option<**i32**> | Choose the number of search results to return per page. Minimum value: 1 |  |[default to 1]
**page_size** | Option<**i32**> | Results per page. Allowed values 1-100, default is 25. |  |[default to 25]

### Return type

[**crate::models::LiveStreamListResponse**](live-stream-list-response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_live_streams_live_stream_id

> crate::models::LiveStream g_et_live_streams_live_stream_id(live_stream_id)
Show live stream

Supply a LivestreamId, and you'll get all the details for streaming into, and watching the livestream. Tutorials that use the [show livestream endpoint](https://api.video/blog/endpoints/live-stream-status).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**live_stream_id** | **String** | The unique ID for the live stream you want to watch. | [required] |

### Return type

[**crate::models::LiveStream**](live-stream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_atch_live_streams_live_stream_id

> crate::models::LiveStream p_atch_live_streams_live_stream_id(live_stream_id, live_stream_update_payload)
Update a live stream

Use this endpoint to update the player, or to turn recording on/off (saving a copy of the livestream). NOTE: If the livestream is actively streaming, changing the recording status will only affect the NEXT stream.    The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**live_stream_id** | **String** | The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off. | [required] |
**live_stream_update_payload** | Option<[**LiveStreamUpdatePayload**](LiveStreamUpdatePayload.md)> |  |  |

### Return type

[**crate::models::LiveStream**](live-stream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_ost_live_streams

> crate::models::LiveStream p_ost_live_streams(live_stream_create_payload)
Create live stream

A live stream will give you the 'connection point' to RTMP your video stream to api.video. It will also give you the details for viewers to watch the same livestream.  The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer. See our [Live Stream Tutorial](https://api.video/blog/tutorials/live-stream-tutorial) for a walkthrough of this API with OBS. Your RTMP endpoint for the livestream is rtmp://broadcast.api.video/s/{streamKey} Tutorials that [create live streams](https://api.video/blog/endpoints/live-create).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**live_stream_create_payload** | Option<[**LiveStreamCreatePayload**](LiveStreamCreatePayload.md)> |  |  |

### Return type

[**crate::models::LiveStream**](live-stream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_ost_live_streams_live_stream_id_thumbnail

> crate::models::LiveStream p_ost_live_streams_live_stream_id_thumbnail(live_stream_id, file)
Upload a thumbnail

Upload an image to use as a backdrop for your livestream. Tutorials that [update live stream thumbnails](https://api.video/blog/endpoints/live-upload-a-thumbnail).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**live_stream_id** | **String** | The unique ID for the live stream you want to upload. | [required] |
**file** | **std::path::PathBuf** | The image to be added as a thumbnail. | [required] |

### Return type

[**crate::models::LiveStream**](live-stream.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

