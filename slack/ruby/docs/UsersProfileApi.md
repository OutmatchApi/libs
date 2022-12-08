# slack::UsersProfileApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**users_profile_get**](UsersProfileApi.md#users_profile_get) | **GET** /users.profile.get |  |
| [**users_profile_set**](UsersProfileApi.md#users_profile_set) | **POST** /users.profile.set |  |


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

api_instance = slack::UsersProfileApi.new
token = 'token_example' # String | Authentication token. Requires scope: `users.profile:read`
opts = {
  include_labels: true, # Boolean | Include labels for each ID in custom profile fields
  user: 'user_example' # String | User to retrieve profile info for
}

begin
  
  result = api_instance.users_profile_get(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling UsersProfileApi->users_profile_get: #{e}"
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
  puts "Error when calling UsersProfileApi->users_profile_get_with_http_info: #{e}"
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

api_instance = slack::UsersProfileApi.new
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
  puts "Error when calling UsersProfileApi->users_profile_set: #{e}"
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
  puts "Error when calling UsersProfileApi->users_profile_set_with_http_info: #{e}"
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

