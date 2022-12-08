# slack::UsersApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**users_conversations**](UsersApi.md#users_conversations) | **GET** /users.conversations |  |
| [**users_delete_photo**](UsersApi.md#users_delete_photo) | **POST** /users.deletePhoto |  |
| [**users_get_presence**](UsersApi.md#users_get_presence) | **GET** /users.getPresence |  |
| [**users_identity**](UsersApi.md#users_identity) | **GET** /users.identity |  |
| [**users_info**](UsersApi.md#users_info) | **GET** /users.info |  |
| [**users_list**](UsersApi.md#users_list) | **GET** /users.list |  |
| [**users_lookup_by_email**](UsersApi.md#users_lookup_by_email) | **GET** /users.lookupByEmail |  |
| [**users_profile_get**](UsersApi.md#users_profile_get) | **GET** /users.profile.get |  |
| [**users_profile_set**](UsersApi.md#users_profile_set) | **POST** /users.profile.set |  |
| [**users_set_active**](UsersApi.md#users_set_active) | **POST** /users.setActive |  |
| [**users_set_photo**](UsersApi.md#users_set_photo) | **POST** /users.setPhoto |  |
| [**users_set_presence**](UsersApi.md#users_set_presence) | **POST** /users.setPresence |  |


## users_conversations

> <UsersConversationsSuccessSchema> users_conversations(opts)



List conversations the calling user may access.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsersApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `conversations:read`
  user: 'user_example', # String | Browse conversations by a specific user ID's membership. Non-public channels are restricted to those where the calling user shares membership.
  types: 'types_example', # String | Mix and match channel types by providing a comma-separated list of any combination of `public_channel`, `private_channel`, `mpim`, `im`
  exclude_archived: true, # Boolean | Set to `true` to exclude archived channels from the list
  limit: 56, # Integer | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. Must be an integer no larger than 1000.
  cursor: 'cursor_example' # String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
}

begin
  
  result = api_instance.users_conversations(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_conversations: #{e}"
end
```

#### Using the users_conversations_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsersConversationsSuccessSchema>, Integer, Hash)> users_conversations_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.users_conversations_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsersConversationsSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_conversations_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional] |
| **user** | **String** | Browse conversations by a specific user ID&#39;s membership. Non-public channels are restricted to those where the calling user shares membership. | [optional] |
| **types** | **String** | Mix and match channel types by providing a comma-separated list of any combination of &#x60;public_channel&#x60;, &#x60;private_channel&#x60;, &#x60;mpim&#x60;, &#x60;im&#x60; | [optional] |
| **exclude_archived** | **Boolean** | Set to &#x60;true&#x60; to exclude archived channels from the list | [optional] |
| **limit** | **Integer** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. Must be an integer no larger than 1000. | [optional] |
| **cursor** | **String** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |

### Return type

[**UsersConversationsSuccessSchema**](UsersConversationsSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## users_delete_photo

> <UsersDeletePhotoSchema> users_delete_photo(token)



Delete the user profile photo

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `users.profile:write`

begin
  
  result = api_instance.users_delete_photo(token)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_delete_photo: #{e}"
end
```

#### Using the users_delete_photo_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsersDeletePhotoSchema>, Integer, Hash)> users_delete_photo_with_http_info(token)

```ruby
begin
  
  data, status_code, headers = api_instance.users_delete_photo_with_http_info(token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsersDeletePhotoSchema>
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_delete_photo_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;users.profile:write&#x60; |  |

### Return type

[**UsersDeletePhotoSchema**](UsersDeletePhotoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## users_get_presence

> <APIMethodUsersGetPresence> users_get_presence(token, opts)



Gets user presence information.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `users:read`
opts = {
  user: 'user_example' # String | User to get presence info on. Defaults to the authed user.
}

begin
  
  result = api_instance.users_get_presence(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_get_presence: #{e}"
end
```

#### Using the users_get_presence_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<APIMethodUsersGetPresence>, Integer, Hash)> users_get_presence_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.users_get_presence_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <APIMethodUsersGetPresence>
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_get_presence_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;users:read&#x60; |  |
| **user** | **String** | User to get presence info on. Defaults to the authed user. | [optional] |

### Return type

[**APIMethodUsersGetPresence**](APIMethodUsersGetPresence.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## users_identity

> <Array<UsersIdentitySchemaInner>> users_identity(opts)



Get a user's identity.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsersApi.new
opts = {
  token: 'token_example' # String | Authentication token. Requires scope: `identity.basic`
}

begin
  
  result = api_instance.users_identity(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_identity: #{e}"
end
```

#### Using the users_identity_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<UsersIdentitySchemaInner>>, Integer, Hash)> users_identity_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.users_identity_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<UsersIdentitySchemaInner>>
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_identity_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;identity.basic&#x60; | [optional] |

### Return type

[**Array&lt;UsersIdentitySchemaInner&gt;**](UsersIdentitySchemaInner.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## users_info

> <UsersInfoSuccessSchema> users_info(token, opts)



Gets information about a user.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `users:read`
opts = {
  include_locale: true, # Boolean | Set this to `true` to receive the locale for this user. Defaults to `false`
  user: 'user_example' # String | User to get info on
}

begin
  
  result = api_instance.users_info(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_info: #{e}"
end
```

#### Using the users_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsersInfoSuccessSchema>, Integer, Hash)> users_info_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.users_info_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsersInfoSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;users:read&#x60; |  |
| **include_locale** | **Boolean** | Set this to &#x60;true&#x60; to receive the locale for this user. Defaults to &#x60;false&#x60; | [optional] |
| **user** | **String** | User to get info on | [optional] |

### Return type

[**UsersInfoSuccessSchema**](UsersInfoSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## users_list

> <UsersListSchema> users_list(opts)



Lists all users in a Slack team.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsersApi.new
opts = {
  token: 'token_example', # String | Authentication token. Requires scope: `users:read`
  limit: 56, # Integer | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached. Providing no `limit` value will result in Slack attempting to deliver you the entire result set. If the collection is too large you may experience `limit_required` or HTTP 500 errors.
  cursor: 'cursor_example', # String | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
  include_locale: true # Boolean | Set this to `true` to receive the locale for users. Defaults to `false`
}

begin
  
  result = api_instance.users_list(opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_list: #{e}"
end
```

#### Using the users_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsersListSchema>, Integer, Hash)> users_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.users_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsersListSchema>
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;users:read&#x60; | [optional] |
| **limit** | **Integer** | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. Providing no &#x60;limit&#x60; value will result in Slack attempting to deliver you the entire result set. If the collection is too large you may experience &#x60;limit_required&#x60; or HTTP 500 errors. | [optional] |
| **cursor** | **String** | Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |
| **include_locale** | **Boolean** | Set this to &#x60;true&#x60; to receive the locale for users. Defaults to &#x60;false&#x60; | [optional] |

### Return type

[**UsersListSchema**](UsersListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## users_lookup_by_email

> <UsersLookupByEmailSuccessSchema> users_lookup_by_email(token, email)



Find a user with an email address.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `users:read.email`
email = 'email_example' # String | An email address belonging to a user in the workspace

begin
  
  result = api_instance.users_lookup_by_email(token, email)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_lookup_by_email: #{e}"
end
```

#### Using the users_lookup_by_email_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsersLookupByEmailSuccessSchema>, Integer, Hash)> users_lookup_by_email_with_http_info(token, email)

```ruby
begin
  
  data, status_code, headers = api_instance.users_lookup_by_email_with_http_info(token, email)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsersLookupByEmailSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_lookup_by_email_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;users:read.email&#x60; |  |
| **email** | **String** | An email address belonging to a user in the workspace |  |

### Return type

[**UsersLookupByEmailSuccessSchema**](UsersLookupByEmailSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## users_profile_get

> <UsersProfileGetSchema> users_profile_get(token, opts)



Retrieves a user's profile information.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `users.profile:read`
opts = {
  include_labels: true, # Boolean | Include labels for each ID in custom profile fields
  user: 'user_example' # String | User to retrieve profile info for
}

begin
  
  result = api_instance.users_profile_get(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_profile_get: #{e}"
end
```

#### Using the users_profile_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsersProfileGetSchema>, Integer, Hash)> users_profile_get_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.users_profile_get_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsersProfileGetSchema>
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_profile_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;users.profile:read&#x60; |  |
| **include_labels** | **Boolean** | Include labels for each ID in custom profile fields | [optional] |
| **user** | **String** | User to retrieve profile info for | [optional] |

### Return type

[**UsersProfileGetSchema**](UsersProfileGetSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## users_profile_set

> <UsersProfileSetSchema> users_profile_set(token, opts)



Set the profile information for a user.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `users.profile:write`
opts = {
  name: 'name_example', # String | Name of a single key to set. Usable only if `profile` is not passed.
  profile: 'profile_example', # String | Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters.
  user: 'user_example', # String | ID of user to change. This argument may only be specified by team admins on paid teams.
  value: 'value_example' # String | Value to set a single key to. Usable only if `profile` is not passed.
}

begin
  
  result = api_instance.users_profile_set(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_profile_set: #{e}"
end
```

#### Using the users_profile_set_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsersProfileSetSchema>, Integer, Hash)> users_profile_set_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.users_profile_set_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsersProfileSetSchema>
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_profile_set_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;users.profile:write&#x60; |  |
| **name** | **String** | Name of a single key to set. Usable only if &#x60;profile&#x60; is not passed. | [optional] |
| **profile** | **String** | Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters. | [optional] |
| **user** | **String** | ID of user to change. This argument may only be specified by team admins on paid teams. | [optional] |
| **value** | **String** | Value to set a single key to. Usable only if &#x60;profile&#x60; is not passed. | [optional] |

### Return type

[**UsersProfileSetSchema**](UsersProfileSetSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## users_set_active

> <UsersSetActiveSchema> users_set_active(token)



Marked a user as active. Deprecated and non-functional.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `users:write`

begin
  
  result = api_instance.users_set_active(token)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_set_active: #{e}"
end
```

#### Using the users_set_active_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsersSetActiveSchema>, Integer, Hash)> users_set_active_with_http_info(token)

```ruby
begin
  
  data, status_code, headers = api_instance.users_set_active_with_http_info(token)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsersSetActiveSchema>
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_set_active_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;users:write&#x60; |  |

### Return type

[**UsersSetActiveSchema**](UsersSetActiveSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## users_set_photo

> <UsersSetPhotoSchema> users_set_photo(token, opts)



Set the user profile photo

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `users.profile:write`
opts = {
  crop_w: 'crop_w_example', # String | Width/height of crop box (always square)
  crop_x: 'crop_x_example', # String | X coordinate of top-left corner of crop box
  crop_y: 'crop_y_example', # String | Y coordinate of top-left corner of crop box
  image: 'image_example' # String | File contents via `multipart/form-data`.
}

begin
  
  result = api_instance.users_set_photo(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_set_photo: #{e}"
end
```

#### Using the users_set_photo_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsersSetPhotoSchema>, Integer, Hash)> users_set_photo_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.users_set_photo_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsersSetPhotoSchema>
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_set_photo_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;users.profile:write&#x60; |  |
| **crop_w** | **String** | Width/height of crop box (always square) | [optional] |
| **crop_x** | **String** | X coordinate of top-left corner of crop box | [optional] |
| **crop_y** | **String** | Y coordinate of top-left corner of crop box | [optional] |
| **image** | **String** | File contents via &#x60;multipart/form-data&#x60;. | [optional] |

### Return type

[**UsersSetPhotoSchema**](UsersSetPhotoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## users_set_presence

> <UsersSetPresenceSchema> users_set_presence(token, presence)



Manually sets user presence.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `users:write`
presence = 'presence_example' # String | Either `auto` or `away`

begin
  
  result = api_instance.users_set_presence(token, presence)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_set_presence: #{e}"
end
```

#### Using the users_set_presence_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsersSetPresenceSchema>, Integer, Hash)> users_set_presence_with_http_info(token, presence)

```ruby
begin
  
  data, status_code, headers = api_instance.users_set_presence_with_http_info(token, presence)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsersSetPresenceSchema>
rescue slack::ApiError => e
  puts "Error when calling UsersApi->users_set_presence_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;users:write&#x60; |  |
| **presence** | **String** | Either &#x60;auto&#x60; or &#x60;away&#x60; |  |

### Return type

[**UsersSetPresenceSchema**](UsersSetPresenceSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

