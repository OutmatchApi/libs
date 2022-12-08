# slack::AdminConversationsEkmApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**admin_conversations_ekm_list_original_connected_channel_info**](AdminConversationsEkmApi.md#admin_conversations_ekm_list_original_connected_channel_info) | **GET** /admin.conversations.ekm.listOriginalConnectedChannelInfo |  |


## admin_conversations_ekm_list_original_connected_channel_info

> <DefaultSuccessTemplate> admin_conversations_ekm_list_original_connected_channel_info(token, opts)



List all disconnected channelsâ€”i.e., channels that were once connected to other workspaces and then disconnectedâ€”and the corresponding original channel IDs for key revocation with EKM.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::AdminConversationsEkmApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin.conversations:read`
opts = {
  channel_ids: 'channel_ids_example', # String | A comma-separated list of channels to filter to.
  team_ids: 'team_ids_example', # String | A comma-separated list of the workspaces to which the channels you would like returned belong.
  limit: 56, # Integer | The maximum number of items to return. Must be between 1 - 1000 both inclusive.
  cursor: 'cursor_example' # String | Set `cursor` to `next_cursor` returned by the previous call to list items in the next page.
}

begin
  
  result = api_instance.admin_conversations_ekm_list_original_connected_channel_info(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling AdminConversationsEkmApi->admin_conversations_ekm_list_original_connected_channel_info: #{e}"
end
```

#### Using the admin_conversations_ekm_list_original_connected_channel_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> admin_conversations_ekm_list_original_connected_channel_info_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.admin_conversations_ekm_list_original_connected_channel_info_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling AdminConversationsEkmApi->admin_conversations_ekm_list_original_connected_channel_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin.conversations:read&#x60; |  |
| **channel_ids** | **String** | A comma-separated list of channels to filter to. | [optional] |
| **team_ids** | **String** | A comma-separated list of the workspaces to which the channels you would like returned belong. | [optional] |
| **limit** | **Integer** | The maximum number of items to return. Must be between 1 - 1000 both inclusive. | [optional] |
| **cursor** | **String** | Set &#x60;cursor&#x60; to &#x60;next_cursor&#x60; returned by the previous call to list items in the next page. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

