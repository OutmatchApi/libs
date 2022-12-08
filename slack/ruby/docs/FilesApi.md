# slack::FilesApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**files_comments_delete**](FilesApi.md#files_comments_delete) | **POST** /files.comments.delete |  |
| [**files_delete**](FilesApi.md#files_delete) | **POST** /files.delete |  |
| [**files_info**](FilesApi.md#files_info) | **GET** /files.info |  |
| [**files_list**](FilesApi.md#files_list) | **GET** /files.list |  |
| [**files_remote_add**](FilesApi.md#files_remote_add) | **POST** /files.remote.add |  |
| [**files_remote_info**](FilesApi.md#files_remote_info) | **GET** /files.remote.info |  |
| [**files_remote_list**](FilesApi.md#files_remote_list) | **GET** /files.remote.list |  |
| [**files_remote_remove**](FilesApi.md#files_remote_remove) | **POST** /files.remote.remove |  |
| [**files_remote_share**](FilesApi.md#files_remote_share) | **GET** /files.remote.share |  |
| [**files_remote_update**](FilesApi.md#files_remote_update) | **POST** /files.remote.update |  |
| [**files_revoke_public_url**](FilesApi.md#files_revoke_public_url) | **POST** /files.revokePublicURL |  |
| [**files_shared_public_url**](FilesApi.md#files_shared_public_url) | **POST** /files.sharedPublicURL |  |
| [**files_upload**](FilesApi.md#files_upload) | **POST** /files.upload |  |


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

api_instance = slack::FilesApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `files:write:user`
  file: 'file_example', # String | File to delete a comment from.
  id: 'id_example' # String | The comment to delete.
}

begin
  
  result = api_instance.files_comments_delete(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_comments_delete: #{e}"
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
  puts "Error when calling FilesApi->files_comments_delete_with_http_info: #{e}"
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


## files_delete

> <FilesDeleteSchema> files_delete(opts)



Deletes a file.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::FilesApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `files:write:user`
  file: 'file_example' # String | ID of file to delete.
}

begin
  
  result = api_instance.files_delete(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_delete: #{e}"
end
```

#### Using the files_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FilesDeleteSchema>, Integer, Hash)> files_delete_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.files_delete_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FilesDeleteSchema>
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |
| **file** | **String** | ID of file to delete. | [optional] |

### Return type

[**FilesDeleteSchema**](FilesDeleteSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## files_info

> <FilesInfoSchema> files_info(opts)



Gets information about a file.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::FilesApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `files:read`
  file: 'file_example', # String | Specify a file by providing its ID.
  count: 'count_example', # String | 
  page: 'page_example', # String | 
  limit: 56, # Integer | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached.
  cursor: 'cursor_example' # String | Parameter for pagination. File comments are paginated for a single file. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection of comments. See [pagination](/docs/pagination) for more details.
}

begin
  
  result = api_instance.files_info(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_info: #{e}"
end
```

#### Using the files_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FilesInfoSchema>, Integer, Hash)> files_info_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.files_info_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FilesInfoSchema>
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;files:read&#x60; | [optional] |
| **file** | **String** | Specify a file by providing its ID. | [optional] |
| **count** | **String** |  | [optional] |
| **page** | **String** |  | [optional] |
| **limit** | **Integer** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. | [optional] |
| **cursor** | **String** | Parameter for pagination. File comments are paginated for a single file. Set &#x60;cursor&#x60; equal to the &#x60;next_cursor&#x60; attribute returned by the previous request&#39;s &#x60;response_metadata&#x60;. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \&quot;page\&quot; of the collection of comments. See [pagination](/docs/pagination) for more details. | [optional] |

### Return type

[**FilesInfoSchema**](FilesInfoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## files_list

> <FilesListSchema> files_list(opts)



List for a team, in a channel, or from a user with applied filters.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::FilesApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `files:read`
  user: 'user_example', # String | Filter files created by a single user.
  channel: 'channel_example', # String | Filter files appearing in a specific channel, indicated by its ID.
  ts_from: 8.14, # Float | Filter files created after this timestamp (inclusive).
  ts_to: 8.14, # Float | Filter files created before this timestamp (inclusive).
  types: 'types_example', # String | Filter files by type ([see below](#file_types)). You can pass multiple values in the types argument, like `types=spaces,snippets`.The default value is `all`, which does not filter the list.
  count: 'count_example', # String | 
  page: 'page_example', # String | 
  show_files_hidden_by_limit: true # Boolean | Show truncated file info for files hidden due to being too old, and the team who owns the file being over the file limit.
}

begin
  
  result = api_instance.files_list(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_list: #{e}"
end
```

#### Using the files_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FilesListSchema>, Integer, Hash)> files_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.files_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FilesListSchema>
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;files:read&#x60; | [optional] |
| **user** | **String** | Filter files created by a single user. | [optional] |
| **channel** | **String** | Filter files appearing in a specific channel, indicated by its ID. | [optional] |
| **ts_from** | **Float** | Filter files created after this timestamp (inclusive). | [optional] |
| **ts_to** | **Float** | Filter files created before this timestamp (inclusive). | [optional] |
| **types** | **String** | Filter files by type ([see below](#file_types)). You can pass multiple values in the types argument, like &#x60;types&#x3D;spaces,snippets&#x60;.The default value is &#x60;all&#x60;, which does not filter the list. | [optional] |
| **count** | **String** |  | [optional] |
| **page** | **String** |  | [optional] |
| **show_files_hidden_by_limit** | **Boolean** | Show truncated file info for files hidden due to being too old, and the team who owns the file being over the file limit. | [optional] |

### Return type

[**FilesListSchema**](FilesListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


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

api_instance = slack::FilesApi.new
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
  puts "Error when calling FilesApi->files_remote_add: #{e}"
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
  puts "Error when calling FilesApi->files_remote_add_with_http_info: #{e}"
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

api_instance = slack::FilesApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `remote_files:read`
  file: 'file_example', # String | Specify a file by providing its ID.
  external_id: 'external_id_example' # String | Creator defined GUID for the file.
}

begin
  
  result = api_instance.files_remote_info(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_remote_info: #{e}"
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
  puts "Error when calling FilesApi->files_remote_info_with_http_info: #{e}"
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

api_instance = slack::FilesApi.new
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
  puts "Error when calling FilesApi->files_remote_list: #{e}"
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
  puts "Error when calling FilesApi->files_remote_list_with_http_info: #{e}"
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

api_instance = slack::FilesApi.new
opts = {
  external_id: 'external_id_example', # String | Creator defined GUID for the file.
  file: 'file_example', # String | Specify a file by providing its ID.
  token: 'token_example' # String | Authentication token. Requires scope: `remote_files:write`
}

begin
  
  result = api_instance.files_remote_remove(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_remote_remove: #{e}"
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
  puts "Error when calling FilesApi->files_remote_remove_with_http_info: #{e}"
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

api_instance = slack::FilesApi.new
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
  puts "Error when calling FilesApi->files_remote_share: #{e}"
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
  puts "Error when calling FilesApi->files_remote_share_with_http_info: #{e}"
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

api_instance = slack::FilesApi.new
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
  puts "Error when calling FilesApi->files_remote_update: #{e}"
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
  puts "Error when calling FilesApi->files_remote_update_with_http_info: #{e}"
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


## files_revoke_public_url

> <FilesRevokePublicURLSchema> files_revoke_public_url(opts)



Revokes public/external sharing access for a file

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::FilesApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `files:write:user`
  file: 'file_example' # String | File to revoke
}

begin
  
  result = api_instance.files_revoke_public_url(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_revoke_public_url: #{e}"
end
```

#### Using the files_revoke_public_url_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FilesRevokePublicURLSchema>, Integer, Hash)> files_revoke_public_url_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.files_revoke_public_url_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FilesRevokePublicURLSchema>
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_revoke_public_url_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |
| **file** | **String** | File to revoke | [optional] |

### Return type

[**FilesRevokePublicURLSchema**](FilesRevokePublicURLSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## files_shared_public_url

> <FilesSharedPublicURLSchema> files_shared_public_url(opts)



Enables a file for public/external sharing.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::FilesApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `files:write:user`
  file: 'file_example' # String | File to share
}

begin
  
  result = api_instance.files_shared_public_url(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_shared_public_url: #{e}"
end
```

#### Using the files_shared_public_url_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FilesSharedPublicURLSchema>, Integer, Hash)> files_shared_public_url_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.files_shared_public_url_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FilesSharedPublicURLSchema>
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_shared_public_url_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |
| **file** | **String** | File to share | [optional] |

### Return type

[**FilesSharedPublicURLSchema**](FilesSharedPublicURLSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## files_upload

> <FilesUploadSchema> files_upload(opts)



Uploads or creates a file.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::FilesApi.new
opts = {
  channels: 'channels_example', # String | Comma-separated list of channel names or IDs where the file will be shared.
  content: 'content_example', # String | File contents via a POST variable. If omitting this parameter, you must provide a `file`.
  file: 'file_example', # String | File contents via `multipart/form-data`. If omitting this parameter, you must submit `content`.
  filename: 'filename_example', # String | Filename of file.
  filetype: 'filetype_example', # String | A [file type](/types/file#file_types) identifier.
  initial_comment: 'initial_comment_example', # String | The message text introducing the file in specified `channels`.
  thread_ts: 8.14, # Float | Provide another message's `ts` value to upload this file as a reply. Never use a reply's `ts` value; use its parent instead.
  title: 'title_example', # String | Title of file.
  token: 'token_example' # String | Authentication token. Requires scope: `files:write:user`
}

begin
  
  result = api_instance.files_upload(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_upload: #{e}"
end
```

#### Using the files_upload_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FilesUploadSchema>, Integer, Hash)> files_upload_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.files_upload_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FilesUploadSchema>
rescue slack::ApiError => e
  puts "Error when calling FilesApi->files_upload_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **channels** | **String** | Comma-separated list of channel names or IDs where the file will be shared. | [optional] |
| **content** | **String** | File contents via a POST variable. If omitting this parameter, you must provide a &#x60;file&#x60;. | [optional] |
| **file** | **String** | File contents via &#x60;multipart/form-data&#x60;. If omitting this parameter, you must submit &#x60;content&#x60;. | [optional] |
| **filename** | **String** | Filename of file. | [optional] |
| **filetype** | **String** | A [file type](/types/file#file_types) identifier. | [optional] |
| **initial_comment** | **String** | The message text introducing the file in specified &#x60;channels&#x60;. | [optional] |
| **thread_ts** | **Float** | Provide another message&#39;s &#x60;ts&#x60; value to upload this file as a reply. Never use a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | [optional] |
| **title** | **String** | Title of file. | [optional] |
| **token** | **String** | Authentication token. Requires scope: &#x60;files:write:user&#x60; | [optional] |

### Return type

[**FilesUploadSchema**](FilesUploadSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

