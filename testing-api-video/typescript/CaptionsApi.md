# .CaptionsApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEVideosVideoIdCaptionsLanguage**](CaptionsApi.md#dELETEVideosVideoIdCaptionsLanguage) | **DELETE** /videos/{videoId}/captions/{language} | Delete a caption
[**gETVideosVideoIdCaptions**](CaptionsApi.md#gETVideosVideoIdCaptions) | **GET** /videos/{videoId}/captions | List video captions
[**gETVideosVideoIdCaptionsLanguage**](CaptionsApi.md#gETVideosVideoIdCaptionsLanguage) | **GET** /videos/{videoId}/captions/{language} | Show a caption
[**pATCHVideosVideoIdCaptionsLanguage**](CaptionsApi.md#pATCHVideosVideoIdCaptionsLanguage) | **PATCH** /videos/{videoId}/captions/{language} | Update caption
[**pOSTVideosVideoIdCaptionsLanguage**](CaptionsApi.md#pOSTVideosVideoIdCaptionsLanguage) | **POST** /videos/{videoId}/captions/{language} | Upload a caption


# **dELETEVideosVideoIdCaptionsLanguage**
> void dELETEVideosVideoIdCaptionsLanguage()

Delete a caption in a specific language by providing the video ID for the video you want to delete the caption from and the language the caption is in.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CaptionsApi(configuration);

let body:.CaptionsApiDELETEVideosVideoIdCaptionsLanguageRequest = {
  // string | The unique identifier for the video you want to delete a caption from.
  videoId: "vi4k0jvEUuaTdRAEjQ4Prklgc",
  // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
  language: "en",
};

apiInstance.dELETEVideosVideoIdCaptionsLanguage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | The unique identifier for the video you want to delete a caption from. | defaults to undefined
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

# **gETVideosVideoIdCaptions**
> CaptionsListResponse gETVideosVideoIdCaptions()

Retrieve a list of available captions for the videoId you provide.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CaptionsApi(configuration);

let body:.CaptionsApiGETVideosVideoIdCaptionsRequest = {
  // string | The unique identifier for the video you want to retrieve a list of captions for.
  videoId: "vi4k0jvEUuaTdRAEjQ4Prklg",
  // number | Choose the number of search results to return per page. Minimum value: 1 (optional)
  currentPage: 2,
  // number | Results per page. Allowed values 1-100, default is 25. (optional)
  pageSize: 30,
};

apiInstance.gETVideosVideoIdCaptions(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | The unique identifier for the video you want to retrieve a list of captions for. | defaults to undefined
 **currentPage** | [**number**] | Choose the number of search results to return per page. Minimum value: 1 | (optional) defaults to 1
 **pageSize** | [**number**] | Results per page. Allowed values 1-100, default is 25. | (optional) defaults to 25


### Return type

**CaptionsListResponse**

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

# **gETVideosVideoIdCaptionsLanguage**
> Subtitle gETVideosVideoIdCaptionsLanguage()

Display a caption for a video in a specific language. If the language is available, the caption is returned. Otherwise, you will get a response indicating the caption was not found. Tutorials that use the [captions endpoint](https://api.video/blog/endpoints/captions).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CaptionsApi(configuration);

let body:.CaptionsApiGETVideosVideoIdCaptionsLanguageRequest = {
  // string | The unique identifier for the video you want captions for.
  videoId: "vi4k0jvEUuaTdRAEjQ4Prklg",
  // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation
  language: "en",
};

apiInstance.gETVideosVideoIdCaptionsLanguage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | The unique identifier for the video you want captions for. | defaults to undefined
 **language** | [**string**] | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation | defaults to undefined


### Return type

**Subtitle**

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

# **pATCHVideosVideoIdCaptionsLanguage**
> Subtitle pATCHVideosVideoIdCaptionsLanguage()

To have the captions on automatically, use this PATCH to set default: true.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CaptionsApi(configuration);

let body:.CaptionsApiPATCHVideosVideoIdCaptionsLanguageRequest = {
  // string | The unique identifier for the video you want to have automatic captions for. 
  videoId: "vi4k0jvEUuaTdRAEjQ4Prklg",
  // string | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation.
  language: "en",
  // CaptionsUpdatePayload (optional)
  captionsUpdatePayload: {
    _default: true,
  },
};

apiInstance.pATCHVideosVideoIdCaptionsLanguage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **captionsUpdatePayload** | **CaptionsUpdatePayload**|  |
 **videoId** | [**string**] | The unique identifier for the video you want to have automatic captions for.  | defaults to undefined
 **language** | [**string**] | A valid [BCP 47](https://github.com/libyal/libfwnt/wiki/Language-Code-identifiers) language representation. | defaults to undefined


### Return type

**Subtitle**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pOSTVideosVideoIdCaptionsLanguage**
> Subtitle pOSTVideosVideoIdCaptionsLanguage()

Upload a VTT file to add captions to your video.  Read our [captioning tutorial](https://api.video/blog/tutorials/adding-captions) for more details.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CaptionsApi(configuration);

let body:.CaptionsApiPOSTVideosVideoIdCaptionsLanguageRequest = {
  // string | The unique identifier for the video you want to add a caption to.
  videoId: "vi4k0jvEUuaTdRAEjQ4Prklg",
  // string | A valid BCP 47 language representation.
  language: "en",
  // HttpFile | The video text track (VTT) you want to upload.
  file: { data: Buffer.from(fs.readFileSync('[B@42211e04', 'utf-8')), name: '[B@42211e04' },
};

apiInstance.pOSTVideosVideoIdCaptionsLanguage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | [**string**] | The unique identifier for the video you want to add a caption to. | defaults to undefined
 **language** | [**string**] | A valid BCP 47 language representation. | defaults to undefined
 **file** | [**HttpFile**] | The video text track (VTT) you want to upload. | defaults to undefined


### Return type

**Subtitle**

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


