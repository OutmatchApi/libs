# slack::SearchApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**search_messages**](SearchApi.md#search_messages) | **GET** /search.messages |  |


## search_messages

> <DefaultSuccessTemplate> search_messages(token, query, opts)



Searches for messages matching a query.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::SearchApi.new
token = 'token_example' # String | Authentication token. Requires scope: `search:read`
query = 'query_example' # String | Search query.
opts = {
  count: 56, # Integer | Pass the number of results you want per \"page\". Maximum of `100`.
  highlight: true, # Boolean | Pass a value of `true` to enable query highlight markers (see below).
  page: 56, # Integer | 
  sort: 'sort_example', # String | Return matches sorted by either `score` or `timestamp`.
  sort_dir: 'sort_dir_example' # String | Change sort direction to ascending (`asc`) or descending (`desc`).
}

begin
  
  result = api_instance.search_messages(token, query, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling SearchApi->search_messages: #{e}"
end
```

#### Using the search_messages_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> search_messages_with_http_info(token, query, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.search_messages_with_http_info(token, query, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling SearchApi->search_messages_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;search:read&#x60; |  |
| **query** | **String** | Search query. |  |
| **count** | **Integer** | Pass the number of results you want per \&quot;page\&quot;. Maximum of &#x60;100&#x60;. | [optional] |
| **highlight** | **Boolean** | Pass a value of &#x60;true&#x60; to enable query highlight markers (see below). | [optional] |
| **page** | **Integer** |  | [optional] |
| **sort** | **String** | Return matches sorted by either &#x60;score&#x60; or &#x60;timestamp&#x60;. | [optional] |
| **sort_dir** | **String** | Change sort direction to ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

