# slack::UsergroupsApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**usergroups_create**](UsergroupsApi.md#usergroups_create) | **POST** /usergroups.create |  |
| [**usergroups_disable**](UsergroupsApi.md#usergroups_disable) | **POST** /usergroups.disable |  |
| [**usergroups_enable**](UsergroupsApi.md#usergroups_enable) | **POST** /usergroups.enable |  |
| [**usergroups_list**](UsergroupsApi.md#usergroups_list) | **GET** /usergroups.list |  |
| [**usergroups_update**](UsergroupsApi.md#usergroups_update) | **POST** /usergroups.update |  |
| [**usergroups_users_list**](UsergroupsApi.md#usergroups_users_list) | **GET** /usergroups.users.list |  |
| [**usergroups_users_update**](UsergroupsApi.md#usergroups_users_update) | **POST** /usergroups.users.update |  |


## usergroups_create

> <UsergroupsCreateSchema> usergroups_create(token, name, opts)



Create a User Group

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsergroupsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `usergroups:write`
name = 'name_example' # String | A name for the User Group. Must be unique among User Groups.
opts = {
  channels: 'channels_example', # String | A comma separated string of encoded channel IDs for which the User Group uses as a default.
  description: 'description_example', # String | A short description of the User Group.
  handle: 'handle_example', # String | A mention handle. Must be unique among channels, users and User Groups.
  include_count: true # Boolean | Include the number of users in each User Group.
}

begin
  
  result = api_instance.usergroups_create(token, name, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_create: #{e}"
end
```

#### Using the usergroups_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsergroupsCreateSchema>, Integer, Hash)> usergroups_create_with_http_info(token, name, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.usergroups_create_with_http_info(token, name, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsergroupsCreateSchema>
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;usergroups:write&#x60; |  |
| **name** | **String** | A name for the User Group. Must be unique among User Groups. |  |
| **channels** | **String** | A comma separated string of encoded channel IDs for which the User Group uses as a default. | [optional] |
| **description** | **String** | A short description of the User Group. | [optional] |
| **handle** | **String** | A mention handle. Must be unique among channels, users and User Groups. | [optional] |
| **include_count** | **Boolean** | Include the number of users in each User Group. | [optional] |

### Return type

[**UsergroupsCreateSchema**](UsergroupsCreateSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## usergroups_disable

> <UsergroupsDisableSchema> usergroups_disable(token, usergroup, opts)



Disable an existing User Group

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsergroupsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `usergroups:write`
usergroup = 'usergroup_example' # String | The encoded ID of the User Group to disable.
opts = {
  include_count: true # Boolean | Include the number of users in the User Group.
}

begin
  
  result = api_instance.usergroups_disable(token, usergroup, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_disable: #{e}"
end
```

#### Using the usergroups_disable_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsergroupsDisableSchema>, Integer, Hash)> usergroups_disable_with_http_info(token, usergroup, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.usergroups_disable_with_http_info(token, usergroup, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsergroupsDisableSchema>
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_disable_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;usergroups:write&#x60; |  |
| **usergroup** | **String** | The encoded ID of the User Group to disable. |  |
| **include_count** | **Boolean** | Include the number of users in the User Group. | [optional] |

### Return type

[**UsergroupsDisableSchema**](UsergroupsDisableSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## usergroups_enable

> <UsergroupsEnableSchema> usergroups_enable(token, usergroup, opts)



Enable a User Group

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsergroupsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `usergroups:write`
usergroup = 'usergroup_example' # String | The encoded ID of the User Group to enable.
opts = {
  include_count: true # Boolean | Include the number of users in the User Group.
}

begin
  
  result = api_instance.usergroups_enable(token, usergroup, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_enable: #{e}"
end
```

#### Using the usergroups_enable_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsergroupsEnableSchema>, Integer, Hash)> usergroups_enable_with_http_info(token, usergroup, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.usergroups_enable_with_http_info(token, usergroup, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsergroupsEnableSchema>
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_enable_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;usergroups:write&#x60; |  |
| **usergroup** | **String** | The encoded ID of the User Group to enable. |  |
| **include_count** | **Boolean** | Include the number of users in the User Group. | [optional] |

### Return type

[**UsergroupsEnableSchema**](UsergroupsEnableSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## usergroups_list

> <UsergroupsListSchema> usergroups_list(token, opts)



List all User Groups for a team

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsergroupsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `usergroups:read`
opts = {
  include_users: true, # Boolean | Include the list of users for each User Group.
  include_count: true, # Boolean | Include the number of users in each User Group.
  include_disabled: true # Boolean | Include disabled User Groups.
}

begin
  
  result = api_instance.usergroups_list(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_list: #{e}"
end
```

#### Using the usergroups_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsergroupsListSchema>, Integer, Hash)> usergroups_list_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.usergroups_list_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsergroupsListSchema>
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;usergroups:read&#x60; |  |
| **include_users** | **Boolean** | Include the list of users for each User Group. | [optional] |
| **include_count** | **Boolean** | Include the number of users in each User Group. | [optional] |
| **include_disabled** | **Boolean** | Include disabled User Groups. | [optional] |

### Return type

[**UsergroupsListSchema**](UsergroupsListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usergroups_update

> <UsergroupsUpdateSchema> usergroups_update(token, usergroup, opts)



Update an existing User Group

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsergroupsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `usergroups:write`
usergroup = 'usergroup_example' # String | The encoded ID of the User Group to update.
opts = {
  channels: 'channels_example', # String | A comma separated string of encoded channel IDs for which the User Group uses as a default.
  description: 'description_example', # String | A short description of the User Group.
  handle: 'handle_example', # String | A mention handle. Must be unique among channels, users and User Groups.
  include_count: true, # Boolean | Include the number of users in the User Group.
  name: 'name_example' # String | A name for the User Group. Must be unique among User Groups.
}

begin
  
  result = api_instance.usergroups_update(token, usergroup, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_update: #{e}"
end
```

#### Using the usergroups_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsergroupsUpdateSchema>, Integer, Hash)> usergroups_update_with_http_info(token, usergroup, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.usergroups_update_with_http_info(token, usergroup, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsergroupsUpdateSchema>
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;usergroups:write&#x60; |  |
| **usergroup** | **String** | The encoded ID of the User Group to update. |  |
| **channels** | **String** | A comma separated string of encoded channel IDs for which the User Group uses as a default. | [optional] |
| **description** | **String** | A short description of the User Group. | [optional] |
| **handle** | **String** | A mention handle. Must be unique among channels, users and User Groups. | [optional] |
| **include_count** | **Boolean** | Include the number of users in the User Group. | [optional] |
| **name** | **String** | A name for the User Group. Must be unique among User Groups. | [optional] |

### Return type

[**UsergroupsUpdateSchema**](UsergroupsUpdateSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


## usergroups_users_list

> <UsergroupsUsersListSchema> usergroups_users_list(token, usergroup, opts)



List all users in a User Group

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsergroupsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `usergroups:read`
usergroup = 'usergroup_example' # String | The encoded ID of the User Group to update.
opts = {
  include_disabled: true # Boolean | Allow results that involve disabled User Groups.
}

begin
  
  result = api_instance.usergroups_users_list(token, usergroup, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_users_list: #{e}"
end
```

#### Using the usergroups_users_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsergroupsUsersListSchema>, Integer, Hash)> usergroups_users_list_with_http_info(token, usergroup, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.usergroups_users_list_with_http_info(token, usergroup, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsergroupsUsersListSchema>
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_users_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;usergroups:read&#x60; |  |
| **usergroup** | **String** | The encoded ID of the User Group to update. |  |
| **include_disabled** | **Boolean** | Allow results that involve disabled User Groups. | [optional] |

### Return type

[**UsergroupsUsersListSchema**](UsergroupsUsersListSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usergroups_users_update

> <UsergroupsUsersUpdateSchema> usergroups_users_update(token, usergroup, users, opts)



Update the list of users for a User Group

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::UsergroupsApi.new
token = 'token_example' # String | Authentication token. Requires scope: `usergroups:write`
usergroup = 'usergroup_example' # String | The encoded ID of the User Group to update.
users = 'users_example' # String | A comma separated string of encoded user IDs that represent the entire list of users for the User Group.
opts = {
  include_count: true # Boolean | Include the number of users in the User Group.
}

begin
  
  result = api_instance.usergroups_users_update(token, usergroup, users, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_users_update: #{e}"
end
```

#### Using the usergroups_users_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsergroupsUsersUpdateSchema>, Integer, Hash)> usergroups_users_update_with_http_info(token, usergroup, users, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.usergroups_users_update_with_http_info(token, usergroup, users, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsergroupsUsersUpdateSchema>
rescue slack::ApiError => e
  puts "Error when calling UsergroupsApi->usergroups_users_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;usergroups:write&#x60; |  |
| **usergroup** | **String** | The encoded ID of the User Group to update. |  |
| **users** | **String** | A comma separated string of encoded user IDs that represent the entire list of users for the User Group. |  |
| **include_count** | **Boolean** | Include the number of users in the User Group. | [optional] |

### Return type

[**UsergroupsUsersUpdateSchema**](UsergroupsUsersUpdateSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

