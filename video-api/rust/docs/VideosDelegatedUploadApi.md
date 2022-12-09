# \VideosDelegatedUploadApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**d_elete_upload_tokens_upload_token**](VideosDelegatedUploadApi.md#d_elete_upload_tokens_upload_token) | **DELETE** /upload-tokens/{uploadToken} | Delete an upload token
[**g_et_upload_tokens**](VideosDelegatedUploadApi.md#g_et_upload_tokens) | **GET** /upload-tokens | List all active upload tokens.
[**g_et_upload_tokens_upload_token**](VideosDelegatedUploadApi.md#g_et_upload_tokens_upload_token) | **GET** /upload-tokens/{uploadToken} | Show upload token
[**p_ost_upload**](VideosDelegatedUploadApi.md#p_ost_upload) | **POST** /upload | Upload with an upload token
[**p_ost_upload_tokens**](VideosDelegatedUploadApi.md#p_ost_upload_tokens) | **POST** /upload-tokens | Generate an upload token



## d_elete_upload_tokens_upload_token

> d_elete_upload_tokens_upload_token(upload_token)
Delete an upload token

Delete an existing upload token. This is especially useful for tokens you may have created that do not expire.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**upload_token** | **String** | The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication. | [required] |

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_upload_tokens

> crate::models::TokenListResponse g_et_upload_tokens(sort_by, sort_order, current_page, page_size)
List all active upload tokens.

A delegated token is used to allow secure uploads without exposing your API key. Use this endpoint to retrieve a list of all currently active delegated tokens. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**sort_by** | Option<**String**> | Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format. |  |
**sort_order** | Option<**String**> | Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A. |  |
**current_page** | Option<**i32**> | Choose the number of search results to return per page. Minimum value: 1 |  |[default to 1]
**page_size** | Option<**i32**> | Results per page. Allowed values 1-100, default is 25. |  |[default to 25]

### Return type

[**crate::models::TokenListResponse**](token-list-response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_upload_tokens_upload_token

> crate::models::UploadToken g_et_upload_tokens_upload_token(upload_token)
Show upload token

You can retrieve details about a specific upload token if you have the unique identifier for the upload token. Add it in the path of the endpoint. Details include time-to-live (ttl), when the token was created, and when it will expire.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**upload_token** | **String** | The unique identifier for the token you want information about. | [required] |

### Return type

[**crate::models::UploadToken**](upload-token.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_ost_upload

> crate::models::Video p_ost_upload(token, file, content_range, video_id)
Upload with an upload token

When given a token, anyone can upload a file to the URI `https://ws.api.video/upload?token=<tokenId>`.  Example with cURL:  ```curl $ curl  --request POST --url 'https://ws.api.video/upload?token=toXXX'  --header 'content-type: multipart/form-data'  -F file=@video.mp4 ```  Or in an HTML form, with a little JavaScript to convert the form into JSON: ```html <!--form for user interaction--> <form name=\"videoUploadForm\" >   <label for=video>Video:</label>   <input type=file name=source/><br/>   <input value=\"Submit\" type=\"submit\"> </form> <div></div> <!--JS takes the form data      uses FormData to turn the response into JSON.     then uses POST to upload the video file.     Update the token parameter in the url to your upload token.     --> <script>    var form = document.forms.namedItem(\"videoUploadForm\");     form.addEventListener('submit', function(ev) {   ev.preventDefault();      var oOutput = document.querySelector(\"div\"),          oData = new FormData(form);      var oReq = new XMLHttpRequest();         oReq.open(\"POST\", \"https://ws.api.video/upload?token=toXXX\", true);      oReq.send(oData);   oReq.onload = function(oEvent) {        if (oReq.status ==201) {          oOutput.innerHTML = \"Your video is uploaded!<br/>\"  + oReq.response;        } else {          oOutput.innerHTML = \"Error \" + oReq.status + \" occurred when trying to upload your file.<br />\";        }      };    }, false);  </script> ```   ### Dealing with large files  We have created a <a href='https://api.video/blog/tutorials/uploading-large-files-with-javascript'>tutorial</a> to walk through the steps required.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**token** | **String** | The unique identifier for the token you want to use to upload a video. | [required] |
**file** | **std::path::PathBuf** | The path to the video you want to upload. | [required] |
**content_range** | Option<**String**> | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. |  |
**video_id** | Option<**String**> | The video id returned by the first call to this endpoint in a large video upload scenario. |  |

### Return type

[**crate::models::Video**](video.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_ost_upload_tokens

> crate::models::UploadToken p_ost_upload_tokens(token_create_payload)
Generate an upload token

Use this endpoint to generate an upload token. You can use this token to authenticate video uploads while keeping your API key safe. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**token_create_payload** | Option<[**TokenCreatePayload**](TokenCreatePayload.md)> |  |  |

### Return type

[**crate::models::UploadToken**](upload-token.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

