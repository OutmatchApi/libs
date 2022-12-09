# \ChaptersApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**d_elete_videos_video_id_chapters_language**](ChaptersApi.md#d_elete_videos_video_id_chapters_language) | **DELETE** /videos/{videoId}/chapters/{language} | Delete a chapter
[**g_et_videos_video_id_chapters**](ChaptersApi.md#g_et_videos_video_id_chapters) | **GET** /videos/{videoId}/chapters | List video chapters
[**g_et_videos_video_id_chapters_language**](ChaptersApi.md#g_et_videos_video_id_chapters_language) | **GET** /videos/{videoId}/chapters/{language} | Show a chapter
[**p_ost_videos_video_id_chapters_language**](ChaptersApi.md#p_ost_videos_video_id_chapters_language) | **POST** /videos/{videoId}/chapters/{language} | Upload a chapter



## d_elete_videos_video_id_chapters_language

> d_elete_videos_video_id_chapters_language(video_id, language)
Delete a chapter

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The unique identifier for the video you want to delete a chapter from.  | [required] |
**language** | **String** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | [required] |

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_videos_video_id_chapters

> crate::models::ChaptersListResponse g_et_videos_video_id_chapters(video_id, current_page, page_size)
List video chapters

Retrieve a list of all chapters for a specified video.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The unique identifier for the video you want to retrieve a list of chapters for. | [required] |
**current_page** | Option<**i32**> | Choose the number of search results to return per page. Minimum value: 1 |  |[default to 1]
**page_size** | Option<**i32**> | Results per page. Allowed values 1-100, default is 25. |  |[default to 25]

### Return type

[**crate::models::ChaptersListResponse**](chapters-list-response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_videos_video_id_chapters_language

> crate::models::Chapter g_et_videos_video_id_chapters_language(video_id, language)
Show a chapter

Chapters help your viewers find the sections of the video they are most interested in viewing. Tutorials that use the [chapters endpoint](https://api.video/blog/endpoints/chapters).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The unique identifier for the video you want to show a chapter for. | [required] |
**language** | **String** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | [required] |

### Return type

[**crate::models::Chapter**](chapter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_ost_videos_video_id_chapters_language

> crate::models::Chapter p_ost_videos_video_id_chapters_language(video_id, language, file)
Upload a chapter

Chapters help break the video into sections. Read our [tutorial](https://api.video/blog/tutorials/adding-chapters-to-your-videos) for more details.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**video_id** | **String** | The unique identifier for the video you want to upload a chapter for. | [required] |
**language** | **String** | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | [required] |
**file** | **std::path::PathBuf** | The VTT file describing the chapters you want to upload. | [required] |

### Return type

[**crate::models::Chapter**](chapter.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

