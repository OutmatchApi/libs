# slack::FilesCommentsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**files_comments_delete**](FilesCommentsApi.md#files_comments_delete) | **POST** /files.comments.delete |  |


## files_comments_delete

> <FilesCommentsDeleteSchema> files_comments_delete(opts)



Deletes an existing comment on a file.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::FilesCommentsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `files:write:user`
  file: 'file_example', # String | File to delete a comment from.
  id: 'id_example' # String | The comment to delete.
}

begin
  
  result = api_instance.files_comments_delete(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesCommentsApi->files_comments_delete: #{e}"
end
```

#### Using the files_comments_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FilesCommentsDeleteSchema>, Integer, Hash)> files_comments_delete_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.files_comments_delete_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FilesCommentsDeleteSchema>
rescue slack::ApiError => e
  puts "Error when calling FilesCommentsApi->files_comments_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |
| **file** | **String** | File to delete a comment from. | [optional] |
| **id** | **String** | The comment to delete. | [optional] |

### Return type

[**FilesCommentsDeleteSchema**](FilesCommentsDeleteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

