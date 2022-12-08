# slack::UsergroupsUsersApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**usergroups_users_list**](UsergroupsUsersApi.md#usergroups_users_list) | **GET** /usergroups.users.list |  |
| [**usergroups_users_update**](UsergroupsUsersApi.md#usergroups_users_update) | **POST** /usergroups.users.update |  |


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

api_instance = slack::UsergroupsUsersApi.new
token = 'token_example' # String | Authentication token. Requires scope: `usergroups:read`
usergroup = 'usergroup_example' # String | The encoded ID of the User Group to update.
opts = {
  include_disabled: true # Boolean | Allow results that involve disabled User Groups.
}

begin
  
  result = api_instance.usergroups_users_list(token, usergroup, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsergroupsUsersApi->usergroups_users_list: #{e}"
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
  puts "Error when calling UsergroupsUsersApi->usergroups_users_list_with_http_info: #{e}"
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

api_instance = slack::UsergroupsUsersApi.new
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
  puts "Error when calling UsergroupsUsersApi->usergroups_users_update: #{e}"
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
  puts "Error when calling UsergroupsUsersApi->usergroups_users_update_with_http_info: #{e}"
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

