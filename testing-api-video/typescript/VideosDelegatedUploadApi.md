# .VideosDelegatedUploadApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEUploadTokensUploadToken**](VideosDelegatedUploadApi.md#dELETEUploadTokensUploadToken) | **DELETE** /upload-tokens/{uploadToken} | Delete an upload token
[**gETUploadTokens**](VideosDelegatedUploadApi.md#gETUploadTokens) | **GET** /upload-tokens | List all active upload tokens.
[**gETUploadTokensUploadToken**](VideosDelegatedUploadApi.md#gETUploadTokensUploadToken) | **GET** /upload-tokens/{uploadToken} | Show upload token
[**pOSTUpload**](VideosDelegatedUploadApi.md#pOSTUpload) | **POST** /upload | Upload with an upload token
[**pOSTUploadTokens**](VideosDelegatedUploadApi.md#pOSTUploadTokens) | **POST** /upload-tokens | Generate an upload token


# **dELETEUploadTokensUploadToken**
> void dELETEUploadTokensUploadToken()

Delete an existing upload token. This is especially useful for tokens you may have created that do not expire.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosDelegatedUploadApi(configuration);

let body:.VideosDelegatedUploadApiDELETEUploadTokensUploadTokenRequest = {
  // string | The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication.
  uploadToken: "to1tcmSFHeYY5KzyhOqVKMKb",
};

apiInstance.dELETEUploadTokensUploadToken(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadToken** | [**string**] | The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication. | defaults to undefined


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

# **gETUploadTokens**
> TokenListResponse gETUploadTokens()

A delegated token is used to allow secure uploads without exposing your API key. Use this endpoint to retrieve a list of all currently active delegated tokens. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosDelegatedUploadApi(configuration);

let body:.VideosDelegatedUploadApiGETUploadTokensRequest = {
  // 'createdAt' | 'ttl' | Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format. (optional)
  sortBy: "ttl",
  // 'asc' | 'desc' | Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A. (optional)
  sortOrder: "asc",
  // number | Choose the number of search results to return per page. Minimum value: 1 (optional)
  currentPage: 2,
  // number | Results per page. Allowed values 1-100, default is 25. (optional)
  pageSize: 30,
};

apiInstance.gETUploadTokens(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortBy** | [**&#39;createdAt&#39; | &#39;ttl&#39;**]**Array<&#39;createdAt&#39; &#124; &#39;ttl&#39;>** | Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format. | (optional) defaults to undefined
 **sortOrder** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A. | (optional) defaults to undefined
 **currentPage** | [**number**] | Choose the number of search results to return per page. Minimum value: 1 | (optional) defaults to 1
 **pageSize** | [**number**] | Results per page. Allowed values 1-100, default is 25. | (optional) defaults to 25


### Return type

**TokenListResponse**

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

# **gETUploadTokensUploadToken**
> UploadToken gETUploadTokensUploadToken()

You can retrieve details about a specific upload token if you have the unique identifier for the upload token. Add it in the path of the endpoint. Details include time-to-live (ttl), when the token was created, and when it will expire.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosDelegatedUploadApi(configuration);

let body:.VideosDelegatedUploadApiGETUploadTokensUploadTokenRequest = {
  // string | The unique identifier for the token you want information about.
  uploadToken: "to1tcmSFHeYY5KzyhOqVKMKb",
};

apiInstance.gETUploadTokensUploadToken(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadToken** | [**string**] | The unique identifier for the token you want information about. | defaults to undefined


### Return type

**UploadToken**

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

# **pOSTUpload**
> Video pOSTUpload()

When given a token, anyone can upload a file to the URI `https://ws.api.video/upload?token=<tokenId>`.  Example with cURL:  ```curl $ curl  --request POST --url 'https://ws.api.video/upload?token=toXXX'  --header 'content-type: multipart/form-data'  -F file=@video.mp4 ```  Or in an HTML form, with a little JavaScript to convert the form into JSON: ```html <!--form for user interaction--> <form name=\"videoUploadForm\" >   <label for=video>Video:</label>   <input type=file name=source/><br/>   <input value=\"Submit\" type=\"submit\"> </form> <div></div> <!--JS takes the form data      uses FormData to turn the response into JSON.     then uses POST to upload the video file.     Update the token parameter in the url to your upload token.     --> <script>    var form = document.forms.namedItem(\"videoUploadForm\");     form.addEventListener('submit', function(ev) {   ev.preventDefault();      var oOutput = document.querySelector(\"div\"),          oData = new FormData(form);      var oReq = new XMLHttpRequest();         oReq.open(\"POST\", \"https://ws.api.video/upload?token=toXXX\", true);      oReq.send(oData);   oReq.onload = function(oEvent) {        if (oReq.status ==201) {          oOutput.innerHTML = \"Your video is uploaded!<br/>\"  + oReq.response;        } else {          oOutput.innerHTML = \"Error \" + oReq.status + \" occurred when trying to upload your file.<br />\";        }      };    }, false);  </script> ```   ### Dealing with large files  We have created a <a href='https://api.video/blog/tutorials/uploading-large-files-with-javascript'>tutorial</a> to walk through the steps required.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosDelegatedUploadApi(configuration);

let body:.VideosDelegatedUploadApiPOSTUploadRequest = {
  // string | The unique identifier for the token you want to use to upload a video.
  token: "to1tcmSFHeYY5KzyhOqVKMKb",
  // HttpFile | The path to the video you want to upload.
  file: { data: Buffer.from(fs.readFileSync('[B@a03529c', 'utf-8')), name: '[B@a03529c' },
  // string | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. (optional)
  contentRange: "Content-Range: bytes 200-100/5000",
  // string | The video id returned by the first call to this endpoint in a large video upload scenario. (optional)
  videoId: "videoId_example",
};

apiInstance.pOSTUpload(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | [**string**] | The unique identifier for the token you want to use to upload a video. | defaults to undefined
 **file** | [**HttpFile**] | The path to the video you want to upload. | defaults to undefined
 **contentRange** | [**string**] | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. | (optional) defaults to undefined
 **videoId** | [**string**] | The video id returned by the first call to this endpoint in a large video upload scenario. | (optional) defaults to undefined


### Return type

**Video**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pOSTUploadTokens**
> UploadToken pOSTUploadTokens()

Use this endpoint to generate an upload token. You can use this token to authenticate video uploads while keeping your API key safe. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .VideosDelegatedUploadApi(configuration);

let body:.VideosDelegatedUploadApiPOSTUploadTokensRequest = {
  // TokenCreatePayload (optional)
  tokenCreatePayload: {
    ttl: 0,
  },
};

apiInstance.pOSTUploadTokens(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenCreatePayload** | **TokenCreatePayload**|  |


### Return type

**UploadToken**

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

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


