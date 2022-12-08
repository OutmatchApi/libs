# slack::FilesRemoteApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**files_remote_add**](FilesRemoteApi.md#files_remote_add) | **POST** /files.remote.add |  |
| [**files_remote_info**](FilesRemoteApi.md#files_remote_info) | **GET** /files.remote.info |  |
| [**files_remote_list**](FilesRemoteApi.md#files_remote_list) | **GET** /files.remote.list |  |
| [**files_remote_remove**](FilesRemoteApi.md#files_remote_remove) | **POST** /files.remote.remove |  |
| [**files_remote_share**](FilesRemoteApi.md#files_remote_share) | **GET** /files.remote.share |  |
| [**files_remote_update**](FilesRemoteApi.md#files_remote_update) | **POST** /files.remote.update |  |


## files_remote_add

> <DefaultSuccessTemplate> files_remote_add(opts)



Adds a file from a remote service

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::FilesRemoteApi.new
opts = {
  external_id: 'external_id_example', # String | Creator defined GUID for the file.
  external_url: 'external_url_example', # String | URL of the remote file.
  filetype: 'filetype_example', # String | type of file
  indexable_file_contents: 'indexable_file_contents_example', # String | A text file (txt, pdf, doc, etc.) containing textual search terms that are used to improve discovery of the remote file.
  preview_image: 'preview_image_example', # String | Preview of the document via `multipart/form-data`.
  title: 'title_example', # String | Title of the file being shared.
  token: 'token_example' # String | Authentication token. Requires scope: `remote_files:write`
}

begin
  
  result = api_instance.files_remote_add(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesRemoteApi->files_remote_add: #{e}"
end
```

#### Using the files_remote_add_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> files_remote_add_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.files_remote_add_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling FilesRemoteApi->files_remote_add_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **external_id** | **String** | Creator defined GUID for the file. | [optional] |
| **external_url** | **String** | URL of the remote file. | [optional] |
| **filetype** | **String** | type of file | [optional] |
| **indexable_file_contents** | **String** | A text file (txt, pdf, doc, etc.) containing textual search terms that are used to improve discovery of the remote file. | [optional] |
| **preview_image** | **String** | Preview of the document via &#x60;multipart/form-data&#x60;. | [optional] |
| **title** | **String** | Title of the file being shared. | [optional] |
| **token** | **String** | Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## files_remote_info

> <DefaultSuccessTemplate> files_remote_info(opts)



Retrieve information about a remote file added to Slack

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::FilesRemoteApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `remote_files:read`
  file: 'file_example', # String | Specify a file by providing its ID.
  external_id: 'external_id_example' # String | Creator defined GUID for the file.
}

begin
  
  result = api_instance.files_remote_info(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesRemoteApi->files_remote_info: #{e}"
end
```

#### Using the files_remote_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> files_remote_info_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.files_remote_info_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling FilesRemoteApi->files_remote_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;remote_files:read&#x60; | [optional] |
| **file** | **String** | Specify a file by providing its ID. | [optional] |
| **external_id** | **String** | Creator defined GUID for the file. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## files_remote_list

> <DefaultSuccessTemplate> files_remote_list(opts)



Retrieve information about a remote file added to Slack

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::FilesRemoteApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `remote_files:read`
  channel: 'channel_example', # String | Filter files appearing in a specific channel, indicated by its ID.
  ts_from: 8.14, # Float | Filter files created after this timestamp (inclusive).
  ts_to: 8.14, # Float | Filter files created before this timestamp (inclusive).
  limit: 56, # Integer | The maximum number of items to return.
  cursor: 'cursor_example' # String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
}

begin
  
  result = api_instance.files_remote_list(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesRemoteApi->files_remote_list: #{e}"
end
```

#### Using the files_remote_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> files_remote_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.files_remote_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling FilesRemoteApi->files_remote_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;remote_files:read&#x60; | [optional] |
| **channel** | **String** | Filter files appearing in a specific channel, indicated by its ID. | [optional] |
| **ts_from** | **Float** | Filter files created after this timestamp (inclusive). | [optional] |
| **ts_to** | **Float** | Filter files created before this timestamp (inclusive). | [optional] |
| **limit** | **Integer** | The maximum number of items to return. | [optional] |
| **cursor** | **String** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## files_remote_remove

> <DefaultSuccessTemplate> files_remote_remove(opts)



Remove a remote file.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::FilesRemoteApi.new
opts = {
  external_id: 'external_id_example', # String | Creator defined GUID for the file.
  file: 'file_example', # String | Specify a file by providing its ID.
  token: 'token_example' # String | Authentication token. Requires scope: `remote_files:write`
}

begin
  
  result = api_instance.files_remote_remove(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesRemoteApi->files_remote_remove: #{e}"
end
```

#### Using the files_remote_remove_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> files_remote_remove_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.files_remote_remove_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling FilesRemoteApi->files_remote_remove_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **external_id** | **String** | Creator defined GUID for the file. | [optional] |
| **file** | **String** | Specify a file by providing its ID. | [optional] |
| **token** | **String** | Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## files_remote_share

> <DefaultSuccessTemplate> files_remote_share(opts)



Share a remote file into a channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::FilesRemoteApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `remote_files:share`
  file: 'file_example', # String | Specify a file registered with Slack by providing its ID. Either this field or `external_id` or both are required.
  external_id: 'external_id_example', # String | The globally unique identifier (GUID) for the file, as set by the app registering the file with Slack.  Either this field or `file` or both are required.
  channels: 'channels_example' # String | Comma-separated list of channel IDs where the file will be shared.
}

begin
  
  result = api_instance.files_remote_share(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesRemoteApi->files_remote_share: #{e}"
end
```

#### Using the files_remote_share_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> files_remote_share_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.files_remote_share_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling FilesRemoteApi->files_remote_share_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;remote_files:share&#x60; | [optional] |
| **file** | **String** | Specify a file registered with Slack by providing its ID. Either this field or &#x60;external_id&#x60; or both are required. | [optional] |
| **external_id** | **String** | The globally unique identifier (GUID) for the file, as set by the app registering the file with Slack.  Either this field or &#x60;file&#x60; or both are required. | [optional] |
| **channels** | **String** | Comma-separated list of channel IDs where the file will be shared. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## files_remote_update

> <DefaultSuccessTemplate> files_remote_update(opts)



Updates an existing remote file.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::FilesRemoteApi.new
opts = {
  external_id: 'external_id_example', # String | Creator defined GUID for the file.
  external_url: 'external_url_example', # String | URL of the remote file.
  file: 'file_example', # String | Specify a file by providing its ID.
  filetype: 'filetype_example', # String | type of file
  indexable_file_contents: 'indexable_file_contents_example', # String | File containing contents that can be used to improve searchability for the remote file.
  preview_image: 'preview_image_example', # String | Preview of the document via `multipart/form-data`.
  title: 'title_example', # String | Title of the file being shared.
  token: 'token_example' # String | Authentication token. Requires scope: `remote_files:write`
}

begin
  
  result = api_instance.files_remote_update(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesRemoteApi->files_remote_update: #{e}"
end
```

#### Using the files_remote_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> files_remote_update_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.files_remote_update_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling FilesRemoteApi->files_remote_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **external_id** | **String** | Creator defined GUID for the file. | [optional] |
| **external_url** | **String** | URL of the remote file. | [optional] |
| **file** | **String** | Specify a file by providing its ID. | [optional] |
| **filetype** | **String** | type of file | [optional] |
| **indexable_file_contents** | **String** | File containing contents that can be used to improve searchability for the remote file. | [optional] |
| **preview_image** | **String** | Preview of the document via &#x60;multipart/form-data&#x60;. | [optional] |
| **title** | **String** | Title of the file being shared. | [optional] |
| **token** | **String** | Authentication token. Requires scope: &#x60;remote_files:write&#x60; | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

