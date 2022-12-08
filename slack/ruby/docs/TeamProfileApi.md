# slack::TeamProfileApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**team_profile_get**](TeamProfileApi.md#team_profile_get) | **GET** /team.profile.get |  |


## team_profile_get

> <TeamProfileGetSuccessSchema> team_profile_get(token, opts)



Retrieve a team's profile.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::TeamProfileApi.new
token = 'token_example' # String | Authentication token. Requires scope: `users.profile:read`
opts = {
  visibility: 'visibility_example' # String | Filter by visibility.
}

begin
  
  result = api_instance.team_profile_get(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling TeamProfileApi->team_profile_get: #{e}"
end
```

#### Using the team_profile_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TeamProfileGetSuccessSchema>, Integer, Hash)> team_profile_get_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.team_profile_get_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TeamProfileGetSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling TeamProfileApi->team_profile_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;users.profile:read&#x60; |  |
| **visibility** | **String** | Filter by visibility. | [optional] |

### Return type

[**TeamProfileGetSuccessSchema**](TeamProfileGetSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

