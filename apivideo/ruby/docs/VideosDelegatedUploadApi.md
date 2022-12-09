# apivideo::VideosDelegatedUploadApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**d_elete_upload_tokens_upload_token**](VideosDelegatedUploadApi.md#d_elete_upload_tokens_upload_token) | **DELETE** /upload-tokens/{uploadToken} | Delete an upload token |
| [**g_et_upload_tokens**](VideosDelegatedUploadApi.md#g_et_upload_tokens) | **GET** /upload-tokens | List all active upload tokens. |
| [**g_et_upload_tokens_upload_token**](VideosDelegatedUploadApi.md#g_et_upload_tokens_upload_token) | **GET** /upload-tokens/{uploadToken} | Show upload token |
| [**p_ost_upload**](VideosDelegatedUploadApi.md#p_ost_upload) | **POST** /upload | Upload with an upload token |
| [**p_ost_upload_tokens**](VideosDelegatedUploadApi.md#p_ost_upload_tokens) | **POST** /upload-tokens | Generate an upload token |


## d_elete_upload_tokens_upload_token

> d_elete_upload_tokens_upload_token(upload_token)

Delete an upload token

Delete an existing upload token. This is especially useful for tokens you may have created that do not expire.

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::VideosDelegatedUploadApi.new
upload_token = 'to1tcmSFHeYY5KzyhOqVKMKb' # String | The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication.

begin
  # Delete an upload token
  api_instance.d_elete_upload_tokens_upload_token(upload_token)
rescue apivideo::ApiError => e
  puts "Error when calling VideosDelegatedUploadApi->d_elete_upload_tokens_upload_token: #{e}"
end
```

#### Using the d_elete_upload_tokens_upload_token_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> d_elete_upload_tokens_upload_token_with_http_info(upload_token)

```ruby
begin
  # Delete an upload token
  data, status_code, headers = api_instance.d_elete_upload_tokens_upload_token_with_http_info(upload_token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue apivideo::ApiError => e
  puts "Error when calling VideosDelegatedUploadApi->d_elete_upload_tokens_upload_token_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **upload_token** | **String** | The unique identifier for the upload token you want to delete. Deleting a token will make it so the token can no longer be used for authentication. |  |

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_upload_tokens

> <TokenListResponse> g_et_upload_tokens(opts)

List all active upload tokens.

A delegated token is used to allow secure uploads without exposing your API key. Use this endpoint to retrieve a list of all currently active delegated tokens. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::VideosDelegatedUploadApi.new
opts = {
    sort_by: 'createdAt', # String | Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format.
    sort_order: 'asc', # String | Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A.
    current_page: 2, # Integer | Choose the number of search results to return per page. Minimum value: 1
    page_size: 30, # Integer | Results per page. Allowed values 1-100, default is 25.
}

begin
  # List all active upload tokens.
  result = api_instance.g_et_upload_tokens(opts)
  p result
rescue apivideo::ApiError => e
  puts "Error when calling VideosDelegatedUploadApi->g_et_upload_tokens: #{e}"
end
```

#### Using the g_et_upload_tokens_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TokenListResponse>, Integer, Hash)> g_et_upload_tokens_with_http_info(opts)

```ruby
begin
  # List all active upload tokens.
  data, status_code, headers = api_instance.g_et_upload_tokens_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TokenListResponse>
rescue apivideo::ApiError => e
  puts "Error when calling VideosDelegatedUploadApi->g_et_upload_tokens_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **sort_by** | **String** | Allowed: createdAt, ttl. You can use these to sort by when a token was created, or how much longer the token will be active (ttl - time to live). Date and time is presented in ISO-8601 format. | [optional] |
| **sort_order** | **String** | Allowed: asc, desc. Ascending is 0-9 or A-Z. Descending is 9-0 or Z-A. | [optional] |
| **current_page** | **Integer** | Choose the number of search results to return per page. Minimum value: 1 | [optional][default to 1] |
| **page_size** | **Integer** | Results per page. Allowed values 1-100, default is 25. | [optional][default to 25] |

### Return type

[**TokenListResponse**](TokenListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_upload_tokens_upload_token

> <UploadToken> g_et_upload_tokens_upload_token(upload_token)

Show upload token

You can retrieve details about a specific upload token if you have the unique identifier for the upload token. Add it in the path of the endpoint. Details include time-to-live (ttl), when the token was created, and when it will expire.

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::VideosDelegatedUploadApi.new
upload_token = 'to1tcmSFHeYY5KzyhOqVKMKb' # String | The unique identifier for the token you want information about.

begin
  # Show upload token
  result = api_instance.g_et_upload_tokens_upload_token(upload_token)
  p result
rescue apivideo::ApiError => e
  puts "Error when calling VideosDelegatedUploadApi->g_et_upload_tokens_upload_token: #{e}"
end
```

#### Using the g_et_upload_tokens_upload_token_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UploadToken>, Integer, Hash)> g_et_upload_tokens_upload_token_with_http_info(upload_token)

```ruby
begin
  # Show upload token
  data, status_code, headers = api_instance.g_et_upload_tokens_upload_token_with_http_info(upload_token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UploadToken>
rescue apivideo::ApiError => e
  puts "Error when calling VideosDelegatedUploadApi->g_et_upload_tokens_upload_token_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **upload_token** | **String** | The unique identifier for the token you want information about. |  |

### Return type

[**UploadToken**](UploadToken.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## p_ost_upload

> <Video> p_ost_upload(token, file, opts)

Upload with an upload token

When given a token, anyone can upload a file to the URI `https://ws.api.video/upload?token=<tokenId>`.  Example with cURL:  ```curl $ curl  --request POST --url 'https://ws.api.video/upload?token=toXXX'  --header 'content-type: multipart/form-data'  -F file=@video.mp4 ```  Or in an HTML form, with a little JavaScript to convert the form into JSON: ```html <!--form for user interaction--> <form name=\"videoUploadForm\" >   <label for=video>Video:</label>   <input type=file name=source/><br/>   <input value=\"Submit\" type=\"submit\"> </form> <div></div> <!--JS takes the form data      uses FormData to turn the response into JSON.     then uses POST to upload the video file.     Update the token parameter in the url to your upload token.     --> <script>    var form = document.forms.namedItem(\"videoUploadForm\");     form.addEventListener('submit', function(ev) {   ev.preventDefault();      var oOutput = document.querySelector(\"div\"),          oData = new FormData(form);      var oReq = new XMLHttpRequest();         oReq.open(\"POST\", \"https://ws.api.video/upload?token=toXXX\", true);      oReq.send(oData);   oReq.onload = function(oEvent) {        if (oReq.status ==201) {          oOutput.innerHTML = \"Your video is uploaded!<br/>\"  + oReq.response;        } else {          oOutput.innerHTML = \"Error \" + oReq.status + \" occurred when trying to upload your file.<br />\";        }      };    }, false);  </script> ```   ### Dealing with large files  We have created a <a href='https://api.video/blog/tutorials/uploading-large-files-with-javascript'>tutorial</a> to walk through the steps required.

### Examples

```ruby
require 'time'
require 'apivideo'

api_instance = apivideo::VideosDelegatedUploadApi.new
token = 'to1tcmSFHeYY5KzyhOqVKMKb' # String | The unique identifier for the token you want to use to upload a video.
file = File.new('/path/to/some/file') # File | The path to the video you want to upload.
opts = {
  content_range: 'Content-Range: bytes 200-100/5000', # String | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object.
  video_id: 'video_id_example' # String | The video id returned by the first call to this endpoint in a large video upload scenario.
}

begin
  # Upload with an upload token
  result = api_instance.p_ost_upload(token, file, opts)
  p result
rescue apivideo::ApiError => e
  puts "Error when calling VideosDelegatedUploadApi->p_ost_upload: #{e}"
end
```

#### Using the p_ost_upload_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Video>, Integer, Hash)> p_ost_upload_with_http_info(token, file, opts)

```ruby
begin
  # Upload with an upload token
  data, status_code, headers = api_instance.p_ost_upload_with_http_info(token, file, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Video>
rescue apivideo::ApiError => e
  puts "Error when calling VideosDelegatedUploadApi->p_ost_upload_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | The unique identifier for the token you want to use to upload a video. |  |
| **file** | **File** | The path to the video you want to upload. |  |
| **content_range** | **String** | Content-Range represents the range of bytes that will be returned as a result of the request. Byte ranges are inclusive, meaning that bytes 0-999 represents the first 1000 bytes in a file or object. | [optional] |
| **video_id** | **String** | The video id returned by the first call to this endpoint in a large video upload scenario. | [optional] |

### Return type

[**Video**](Video.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## p_ost_upload_tokens

> <UploadToken> p_ost_upload_tokens(opts)

Generate an upload token

Use this endpoint to generate an upload token. You can use this token to authenticate video uploads while keeping your API key safe. Tutorials using [delegated upload](https://api.video/blog/endpoints/delegated-upload).

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::VideosDelegatedUploadApi.new
opts = {
  token_create_payload: apivideo::TokenCreatePayload.new # TokenCreatePayload | 
}

begin
  # Generate an upload token
  result = api_instance.p_ost_upload_tokens(opts)
  p result
rescue apivideo::ApiError => e
  puts "Error when calling VideosDelegatedUploadApi->p_ost_upload_tokens: #{e}"
end
```

#### Using the p_ost_upload_tokens_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UploadToken>, Integer, Hash)> p_ost_upload_tokens_with_http_info(opts)

```ruby
begin
  # Generate an upload token
  data, status_code, headers = api_instance.p_ost_upload_tokens_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UploadToken>
rescue apivideo::ApiError => e
  puts "Error when calling VideosDelegatedUploadApi->p_ost_upload_tokens_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token_create_payload** | [**TokenCreatePayload**](TokenCreatePayload.md) |  | [optional] |

### Return type

[**UploadToken**](UploadToken.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

