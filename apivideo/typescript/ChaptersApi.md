# .ChaptersApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEVideosVideoIdChaptersLanguage**](ChaptersApi.md#dELETEVideosVideoIdChaptersLanguage) | **DELETE** /videos/{videoId}/chapters/{language} | Delete a chapter
[**gETVideosVideoIdChapters**](ChaptersApi.md#gETVideosVideoIdChapters) | **GET** /videos/{videoId}/chapters | List video chapters
[**gETVideosVideoIdChaptersLanguage**](ChaptersApi.md#gETVideosVideoIdChaptersLanguage) | **GET** /videos/{videoId}/chapters/{language} | Show a chapter
[**pOSTVideosVideoIdChaptersLanguage**](ChaptersApi.md#pOSTVideosVideoIdChaptersLanguage) | **POST** /videos/{videoId}/chapters/{language} | Upload a chapter


# **dELETEVideosVideoIdChaptersLanguage**
> void dELETEVideosVideoIdChaptersLanguage()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ChaptersApi(configuration);

let body:.ChaptersApiDELETEVideosVideoIdChaptersLanguageRequest = {
  // string | The unique identifier for the video you want to delete a chapter from. 
  videoId: "vi4k0jvEUuaTdRAEjQ4Jfrgz",
  // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
  language: "en",
};

apiInstance.dELETEVideosVideoIdChaptersLanguage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | The unique identifier for the video you want to delete a chapter from.  | defaults to undefined
 **language** | [**string**] | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | defaults to undefined


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

# **gETVideosVideoIdChapters**
> ChaptersListResponse gETVideosVideoIdChapters()

Retrieve a list of all chapters for a specified video.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ChaptersApi(configuration);

let body:.ChaptersApiGETVideosVideoIdChaptersRequest = {
  // string | The unique identifier for the video you want to retrieve a list of chapters for.
  videoId: "vi4k0jvEUuaTdRAEjQ4Jfrgz",
  // number | Choose the number of search results to return per page. Minimum value: 1 (optional)
  currentPage: 2,
  // number | Results per page. Allowed values 1-100, default is 25. (optional)
  pageSize: 30,
};

apiInstance.gETVideosVideoIdChapters(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | The unique identifier for the video you want to retrieve a list of chapters for. | defaults to undefined
 **currentPage** | [**number**] | Choose the number of search results to return per page. Minimum value: 1 | (optional) defaults to 1
 **pageSize** | [**number**] | Results per page. Allowed values 1-100, default is 25. | (optional) defaults to 25


### Return type

**ChaptersListResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **gETVideosVideoIdChaptersLanguage**
> Chapter gETVideosVideoIdChaptersLanguage()

Chapters help your viewers find the sections of the video they are most interested in viewing. Tutorials that use the [chapters endpoint](https://api.video/blog/endpoints/chapters).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ChaptersApi(configuration);

let body:.ChaptersApiGETVideosVideoIdChaptersLanguageRequest = {
  // string | The unique identifier for the video you want to show a chapter for.
  videoId: "vi4k0jvEUuaTdRAEjQ4Jfrgz",
  // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
  language: "en",
};

apiInstance.gETVideosVideoIdChaptersLanguage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | The unique identifier for the video you want to show a chapter for. | defaults to undefined
 **language** | [**string**] | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | defaults to undefined


### Return type

**Chapter**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pOSTVideosVideoIdChaptersLanguage**
> Chapter pOSTVideosVideoIdChaptersLanguage()

Chapters help break the video into sections. Read our [tutorial](https://api.video/blog/tutorials/adding-chapters-to-your-videos) for more details.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ChaptersApi(configuration);

let body:.ChaptersApiPOSTVideosVideoIdChaptersLanguageRequest = {
  // string | The unique identifier for the video you want to upload a chapter for.
  videoId: "vi4k0jvEUuaTdRAEjQ4Jfrgz",
  // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
  language: "en",
  // HttpFile | The VTT file describing the chapters you want to upload.
  file: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

apiInstance.pOSTVideosVideoIdChaptersLanguage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | The unique identifier for the video you want to upload a chapter for. | defaults to undefined
 **language** | [**string**] | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | defaults to undefined
 **file** | [**HttpFile**] | The VTT file describing the chapters you want to upload. | defaults to undefined


### Return type

**Chapter**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


