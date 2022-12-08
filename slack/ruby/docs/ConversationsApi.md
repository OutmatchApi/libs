# slack::ConversationsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**conversations_archive**](ConversationsApi.md#conversations_archive) | **POST** /conversations.archive |  |
| [**conversations_close**](ConversationsApi.md#conversations_close) | **POST** /conversations.close |  |
| [**conversations_create**](ConversationsApi.md#conversations_create) | **POST** /conversations.create |  |
| [**conversations_history**](ConversationsApi.md#conversations_history) | **GET** /conversations.history |  |
| [**conversations_info**](ConversationsApi.md#conversations_info) | **GET** /conversations.info |  |
| [**conversations_invite**](ConversationsApi.md#conversations_invite) | **POST** /conversations.invite |  |
| [**conversations_join**](ConversationsApi.md#conversations_join) | **POST** /conversations.join |  |
| [**conversations_kick**](ConversationsApi.md#conversations_kick) | **POST** /conversations.kick |  |
| [**conversations_leave**](ConversationsApi.md#conversations_leave) | **POST** /conversations.leave |  |
| [**conversations_list**](ConversationsApi.md#conversations_list) | **GET** /conversations.list |  |
| [**conversations_mark**](ConversationsApi.md#conversations_mark) | **POST** /conversations.mark |  |
| [**conversations_members**](ConversationsApi.md#conversations_members) | **GET** /conversations.members |  |
| [**conversations_open**](ConversationsApi.md#conversations_open) | **POST** /conversations.open |  |
| [**conversations_rename**](ConversationsApi.md#conversations_rename) | **POST** /conversations.rename |  |
| [**conversations_replies**](ConversationsApi.md#conversations_replies) | **GET** /conversations.replies |  |
| [**conversations_set_purpose**](ConversationsApi.md#conversations_set_purpose) | **POST** /conversations.setPurpose |  |
| [**conversations_set_topic**](ConversationsApi.md#conversations_set_topic) | **POST** /conversations.setTopic |  |
| [**conversations_unarchive**](ConversationsApi.md#conversations_unarchive) | **POST** /conversations.unarchive |  |


## conversations_archive

> <ConversationsArchiveSuccessSchema> conversations_archive(opts)



Archives a conversation.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:write`
  channel: 'channel_example' # String | ID of conversation to archive
}

begin
  
  result = api_instance.conversations_archive(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_archive: #{e}"
end
```

#### Using the conversations_archive_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsArchiveSuccessSchema>, Integer, Hash)> conversations_archive_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_archive_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsArchiveSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_archive_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String** | ID of conversation to archive | [optional] |

### Return type

[**ConversationsArchiveSuccessSchema**](ConversationsArchiveSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## conversations_close

> <ConversationsCloseSuccessSchema> conversations_close(opts)



Closes a direct message or multi-person direct message.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:write`
  channel: 'channel_example' # String | Conversation to close.
}

begin
  
  result = api_instance.conversations_close(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_close: #{e}"
end
```

#### Using the conversations_close_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsCloseSuccessSchema>, Integer, Hash)> conversations_close_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_close_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsCloseSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_close_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String** | Conversation to close. | [optional] |

### Return type

[**ConversationsCloseSuccessSchema**](ConversationsCloseSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## conversations_create

> <ConversationsCreateSuccessSchema> conversations_create(opts)



Initiates a public or private channel-based conversation

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:write`
  is_private: true, # Boolean | Create a private channel instead of a public one
  name: 'name_example' # String | Name of the public or private channel to create
}

begin
  
  result = api_instance.conversations_create(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_create: #{e}"
end
```

#### Using the conversations_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsCreateSuccessSchema>, Integer, Hash)> conversations_create_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_create_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsCreateSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **is_private** | **Boolean** | Create a private channel instead of a public one | [optional] |
| **name** | **String** | Name of the public or private channel to create | [optional] |

### Return type

[**ConversationsCreateSuccessSchema**](ConversationsCreateSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## conversations_history

> <ConversationsHistorySuccessSchema> conversations_history(opts)



Fetches a conversation's history of messages and events.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:history`
  channel: 'channel_example', # String | Conversation ID to fetch history for.
  latest: 8.14, # Float | End of time range of messages to include in results.
  oldest: 8.14, # Float | Start of time range of messages to include in results.
  inclusive: true, # Boolean | Include messages with latest or oldest timestamp in results only when either timestamp is specified.
  limit: 56, # Integer | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
  cursor: 'cursor_example' # String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
}

begin
  
  result = api_instance.conversations_history(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_history: #{e}"
end
```

#### Using the conversations_history_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsHistorySuccessSchema>, Integer, Hash)> conversations_history_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_history_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsHistorySuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_history_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:history&#x60; | [optional] |
| **channel** | **String** | Conversation ID to fetch history for. | [optional] |
| **latest** | **Float** | End of time range of messages to include in results. | [optional] |
| **oldest** | **Float** | Start of time range of messages to include in results. | [optional] |
| **inclusive** | **Boolean** | Include messages with latest or oldest timestamp in results only when either timestamp is specified. | [optional] |
| **limit** | **Integer** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | [optional] |
| **cursor** | **String** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |

### Return type

[**ConversationsHistorySuccessSchema**](ConversationsHistorySuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## conversations_info

> <ConversationsInfoSuccessSchema> conversations_info(opts)



Retrieve information about a conversation.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:read`
  channel: 'channel_example', # String | Conversation ID to learn more about
  include_locale: true, # Boolean | Set this to `true` to receive the locale for this conversation. Defaults to `false`
  include_num_members: true # Boolean | Set to `true` to include the member count for the specified conversation. Defaults to `false`
}

begin
  
  result = api_instance.conversations_info(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_info: #{e}"
end
```

#### Using the conversations_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsInfoSuccessSchema>, Integer, Hash)> conversations_info_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_info_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsInfoSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional] |
| **channel** | **String** | Conversation ID to learn more about | [optional] |
| **include_locale** | **Boolean** | Set this to &#x60;true&#x60; to receive the locale for this conversation. Defaults to &#x60;false&#x60; | [optional] |
| **include_num_members** | **Boolean** | Set to &#x60;true&#x60; to include the member count for the specified conversation. Defaults to &#x60;false&#x60; | [optional] |

### Return type

[**ConversationsInfoSuccessSchema**](ConversationsInfoSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## conversations_invite

> <ConversationsInviteErrorSchema> conversations_invite(opts)



Invites users to a channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:write`
  channel: 'channel_example', # String | The ID of the public or private channel to invite user(s) to.
  users: 'users_example' # String | A comma separated list of user IDs. Up to 1000 users may be listed.
}

begin
  
  result = api_instance.conversations_invite(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_invite: #{e}"
end
```

#### Using the conversations_invite_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsInviteErrorSchema>, Integer, Hash)> conversations_invite_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_invite_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsInviteErrorSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_invite_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String** | The ID of the public or private channel to invite user(s) to. | [optional] |
| **users** | **String** | A comma separated list of user IDs. Up to 1000 users may be listed. | [optional] |

### Return type

[**ConversationsInviteErrorSchema**](ConversationsInviteErrorSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## conversations_join

> <ConversationsJoinSuccessSchema> conversations_join(opts)



Joins an existing conversation.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `channels:write`
  channel: 'channel_example' # String | ID of conversation to join
}

begin
  
  result = api_instance.conversations_join(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_join: #{e}"
end
```

#### Using the conversations_join_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsJoinSuccessSchema>, Integer, Hash)> conversations_join_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_join_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsJoinSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_join_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;channels:write&#x60; | [optional] |
| **channel** | **String** | ID of conversation to join | [optional] |

### Return type

[**ConversationsJoinSuccessSchema**](ConversationsJoinSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## conversations_kick

> <ConversationsKickSuccessSchema> conversations_kick(opts)



Removes a user from a conversation.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:write`
  channel: 'channel_example', # String | ID of conversation to remove user from.
  user: 'user_example' # String | User ID to be removed.
}

begin
  
  result = api_instance.conversations_kick(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_kick: #{e}"
end
```

#### Using the conversations_kick_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsKickSuccessSchema>, Integer, Hash)> conversations_kick_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_kick_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsKickSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_kick_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String** | ID of conversation to remove user from. | [optional] |
| **user** | **String** | User ID to be removed. | [optional] |

### Return type

[**ConversationsKickSuccessSchema**](ConversationsKickSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## conversations_leave

> <ConversationsLeaveSuccessSchema> conversations_leave(opts)



Leaves a conversation.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:write`
  channel: 'channel_example' # String | Conversation to leave
}

begin
  
  result = api_instance.conversations_leave(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_leave: #{e}"
end
```

#### Using the conversations_leave_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsLeaveSuccessSchema>, Integer, Hash)> conversations_leave_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_leave_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsLeaveSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_leave_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String** | Conversation to leave | [optional] |

### Return type

[**ConversationsLeaveSuccessSchema**](ConversationsLeaveSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## conversations_list

> <ConversationsListSuccessSchema> conversations_list(opts)



Lists all channels in a Slack team.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:read`
  exclude_archived: true, # Boolean | Set to `true` to exclude archived channels from the list
  types: 'types_example', # String | Mix and match channel types by providing a comma-separated list of any combination of `public_channel`, `private_channel`, `mpim`, `im`
  limit: 56, # Integer | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. Must be an integer no larger than 1000.
  cursor: 'cursor_example' # String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
}

begin
  
  result = api_instance.conversations_list(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_list: #{e}"
end
```

#### Using the conversations_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsListSuccessSchema>, Integer, Hash)> conversations_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsListSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional] |
| **exclude_archived** | **Boolean** | Set to &#x60;true&#x60; to exclude archived channels from the list | [optional] |
| **types** | **String** | Mix and match channel types by providing a comma-separated list of any combination of &#x60;public_channel&#x60;, &#x60;private_channel&#x60;, &#x60;mpim&#x60;, &#x60;im&#x60; | [optional] |
| **limit** | **Integer** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. Must be an integer no larger than 1000. | [optional] |
| **cursor** | **String** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |

### Return type

[**ConversationsListSuccessSchema**](ConversationsListSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## conversations_mark

> <ConversationsMarkSuccessSchema> conversations_mark(opts)



Sets the read cursor in a channel.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:write`
  channel: 'channel_example', # String | Channel or conversation to set the read cursor for.
  ts: 8.14 # Float | Unique identifier of message you want marked as most recently seen in this conversation.
}

begin
  
  result = api_instance.conversations_mark(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_mark: #{e}"
end
```

#### Using the conversations_mark_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsMarkSuccessSchema>, Integer, Hash)> conversations_mark_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_mark_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsMarkSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_mark_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String** | Channel or conversation to set the read cursor for. | [optional] |
| **ts** | **Float** | Unique identifier of message you want marked as most recently seen in this conversation. | [optional] |

### Return type

[**ConversationsMarkSuccessSchema**](ConversationsMarkSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## conversations_members

> <ConversationsMembersSuccessSchema> conversations_members(opts)



Retrieve members of a conversation.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:read`
  channel: 'channel_example', # String | ID of the conversation to retrieve members for
  limit: 56, # Integer | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
  cursor: 'cursor_example' # String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
}

begin
  
  result = api_instance.conversations_members(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_members: #{e}"
end
```

#### Using the conversations_members_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsMembersSuccessSchema>, Integer, Hash)> conversations_members_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_members_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsMembersSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_members_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional] |
| **channel** | **String** | ID of the conversation to retrieve members for | [optional] |
| **limit** | **Integer** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | [optional] |
| **cursor** | **String** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |

### Return type

[**ConversationsMembersSuccessSchema**](ConversationsMembersSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## conversations_open

> <ConversationsOpenSuccessSchema> conversations_open(opts)



Opens or resumes a direct message or multi-person direct message.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:write`
  channel: 'channel_example', # String | Resume a conversation by supplying an `im` or `mpim`'s ID. Or provide the `users` field instead.
  return_im: true, # Boolean | Boolean, indicates you want the full IM channel definition in the response.
  users: 'users_example' # String | Comma separated lists of users. If only one user is included, this creates a 1:1 DM.  The ordering of the users is preserved whenever a multi-person direct message is returned. Supply a `channel` when not supplying `users`.
}

begin
  
  result = api_instance.conversations_open(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_open: #{e}"
end
```

#### Using the conversations_open_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsOpenSuccessSchema>, Integer, Hash)> conversations_open_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_open_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsOpenSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_open_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String** | Resume a conversation by supplying an &#x60;im&#x60; or &#x60;mpim&#x60;&#39;s ID. Or provide the &#x60;users&#x60; field instead. | [optional] |
| **return_im** | **Boolean** | Boolean, indicates you want the full IM channel definition in the response. | [optional] |
| **users** | **String** | Comma separated lists of users. If only one user is included, this creates a 1:1 DM.  The ordering of the users is preserved whenever a multi-person direct message is returned. Supply a &#x60;channel&#x60; when not supplying &#x60;users&#x60;. | [optional] |

### Return type

[**ConversationsOpenSuccessSchema**](ConversationsOpenSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## conversations_rename

> <ConversationsRenameSuccessSchema> conversations_rename(opts)



Renames a conversation.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:write`
  channel: 'channel_example', # String | ID of conversation to rename
  name: 'name_example' # String | New name for conversation.
}

begin
  
  result = api_instance.conversations_rename(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_rename: #{e}"
end
```

#### Using the conversations_rename_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsRenameSuccessSchema>, Integer, Hash)> conversations_rename_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_rename_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsRenameSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_rename_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String** | ID of conversation to rename | [optional] |
| **name** | **String** | New name for conversation. | [optional] |

### Return type

[**ConversationsRenameSuccessSchema**](ConversationsRenameSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## conversations_replies

> <ConversationsRepliesSuccessSchema> conversations_replies(opts)



Retrieve a thread of messages posted to a conversation

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:history`
  channel: 'channel_example', # String | Conversation ID to fetch thread from.
  ts: 8.14, # Float | Unique identifier of a thread's parent message. `ts` must be the timestamp of an existing message with 0 or more replies. If there are no replies then just the single message referenced by `ts` will return - it is just an ordinary, unthreaded message.
  latest: 8.14, # Float | End of time range of messages to include in results.
  oldest: 8.14, # Float | Start of time range of messages to include in results.
  inclusive: true, # Boolean | Include messages with latest or oldest timestamp in results only when either timestamp is specified.
  limit: 56, # Integer | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
  cursor: 'cursor_example' # String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
}

begin
  
  result = api_instance.conversations_replies(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_replies: #{e}"
end
```

#### Using the conversations_replies_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsRepliesSuccessSchema>, Integer, Hash)> conversations_replies_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_replies_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsRepliesSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_replies_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:history&#x60; | [optional] |
| **channel** | **String** | Conversation ID to fetch thread from. | [optional] |
| **ts** | **Float** | Unique identifier of a thread&#39;s parent message. &#x60;ts&#x60; must be the timestamp of an existing message with 0 or more replies. If there are no replies then just the single message referenced by &#x60;ts&#x60; will return - it is just an ordinary, unthreaded message. | [optional] |
| **latest** | **Float** | End of time range of messages to include in results. | [optional] |
| **oldest** | **Float** | Start of time range of messages to include in results. | [optional] |
| **inclusive** | **Boolean** | Include messages with latest or oldest timestamp in results only when either timestamp is specified. | [optional] |
| **limit** | **Integer** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | [optional] |
| **cursor** | **String** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |

### Return type

[**ConversationsRepliesSuccessSchema**](ConversationsRepliesSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## conversations_set_purpose

> <ConversationsSetPurposeSuccessSchema> conversations_set_purpose(opts)



Sets the purpose for a conversation.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:write`
  channel: 'channel_example', # String | Conversation to set the purpose of
  purpose: 'purpose_example' # String | A new, specialer purpose
}

begin
  
  result = api_instance.conversations_set_purpose(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_set_purpose: #{e}"
end
```

#### Using the conversations_set_purpose_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsSetPurposeSuccessSchema>, Integer, Hash)> conversations_set_purpose_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_set_purpose_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsSetPurposeSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_set_purpose_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String** | Conversation to set the purpose of | [optional] |
| **purpose** | **String** | A new, specialer purpose | [optional] |

### Return type

[**ConversationsSetPurposeSuccessSchema**](ConversationsSetPurposeSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## conversations_set_topic

> <ConversationsSetTopicSuccessSchema> conversations_set_topic(opts)



Sets the topic for a conversation.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:write`
  channel: 'channel_example', # String | Conversation to set the topic of
  topic: 'topic_example' # String | The new topic string. Does not support formatting or linkification.
}

begin
  
  result = api_instance.conversations_set_topic(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_set_topic: #{e}"
end
```

#### Using the conversations_set_topic_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsSetTopicSuccessSchema>, Integer, Hash)> conversations_set_topic_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_set_topic_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsSetTopicSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_set_topic_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String** | Conversation to set the topic of | [optional] |
| **topic** | **String** | The new topic string. Does not support formatting or linkification. | [optional] |

### Return type

[**ConversationsSetTopicSuccessSchema**](ConversationsSetTopicSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## conversations_unarchive

> <ConversationsUnarchiveSuccessSchema> conversations_unarchive(opts)



Reverses conversation archival.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::ConversationsApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:write`
  channel: 'channel_example' # String | ID of conversation to unarchive
}

begin
  
  result = api_instance.conversations_unarchive(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_unarchive: #{e}"
end
```

#### Using the conversations_unarchive_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversationsUnarchiveSuccessSchema>, Integer, Hash)> conversations_unarchive_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.conversations_unarchive_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversationsUnarchiveSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling ConversationsApi->conversations_unarchive_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **String** | ID of conversation to unarchive | [optional] |

### Return type

[**ConversationsUnarchiveSuccessSchema**](ConversationsUnarchiveSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

