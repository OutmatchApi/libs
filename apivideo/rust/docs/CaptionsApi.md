# \CaptionsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**d_elete_videos_video_id_captions_language**](CaptionsApi.md#d_elete_videos_video_id_captions_language) | **DELETE** /videos/{videoId}/captions/{language} | Delete a caption
[**g_et_videos_video_id_captions**](CaptionsApi.md#g_et_videos_video_id_captions) | **GET** /videos/{videoId}/captions | List video captions
[**g_et_videos_video_id_captions_language**](CaptionsApi.md#g_et_videos_video_id_captions_language) | **GET** /videos/{videoId}/captions/{language} | Show a caption
[**p_atch_videos_video_id_captions_language**](CaptionsApi.md#p_atch_videos_video_id_captions_language) | **PATCH** /videos/{videoId}/captions/{language} | Update caption
[**p_ost_videos_video_id_captions_language**](CaptionsApi.md#p_ost_videos_video_id_captions_language) | **POST** /videos/{videoId}/captions/{language} | Upload a caption



## d_elete_videos_video_id_captions_language

> d_elete_videos_video_id_captions_language(video_id, language)
Delete a caption

Delete a caption in a specific language by providing the video ID for the video you want to delete the caption from and the language the caption is in.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The unique identifier for the video you want to delete a caption from. | [required] |
**language** | **String** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | [required] |

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_videos_video_id_captions

> crate::models::CaptionsListResponse g_et_videos_video_id_captions(video_id, current_page, page_size)
List video captions

Retrieve a list of available captions for the videoId you provide.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The unique identifier for the video you want to retrieve a list of captions for. | [required] |
**current_page** | Option<**i32**> | Choose the number of search results to return per page. Minimum value: 1 |  |[default to 1]
**page_size** | Option<**i32**> | Results per page. Allowed values 1-100, default is 25. |  |[default to 25]

### Return type

[**crate::models::CaptionsListResponse**](captions-list-response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_videos_video_id_captions_language

> crate::models::Subtitle g_et_videos_video_id_captions_language(video_id, language)
Show a caption

Display a caption for a video in a specific language. If the language is available, the caption is returned. Otherwise, you will get a response indicating the caption was not found. Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The unique identifier for the video you want captions for. | [required] |
**language** | **String** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation | [required] |

### Return type

[**crate::models::Subtitle**](subtitle.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_atch_videos_video_id_captions_language

> crate::models::Subtitle p_atch_videos_video_id_captions_language(video_id, language, captions_update_payload)
Update caption

To have the captions on automatically, use this PATCH to set default: true.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The unique identifier for the video you want to have automatic captions for.  | [required] |
**language** | **String** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | [required] |
**captions_update_payload** | Option<[**CaptionsUpdatePayload**](CaptionsUpdatePayload.md)> |  |  |

### Return type

[**crate::models::Subtitle**](subtitle.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_ost_videos_video_id_captions_language

> crate::models::Subtitle p_ost_videos_video_id_captions_language(video_id, language, file)
Upload a caption

Upload a VTT file to add captions to your video.  Read our [captioning tutorial](https://api.video/blog/tutorials/adding-captions) for more details.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The unique identifier for the video you want to add a caption to. | [required] |
**language** | **String** | A valid BCP 47 language representation. | [required] |
**file** | **std::path::PathBuf** | The video text track (VTT) you want to upload. | [required] |

### Return type

[**crate::models::Subtitle**](subtitle.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

