# slack::TeamApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**team_access_logs**](TeamApi.md#team_access_logs) | **GET** /team.accessLogs |  |
| [**team_billable_info**](TeamApi.md#team_billable_info) | **GET** /team.billableInfo |  |
| [**team_info**](TeamApi.md#team_info) | **GET** /team.info |  |
| [**team_integration_logs**](TeamApi.md#team_integration_logs) | **GET** /team.integrationLogs |  |
| [**team_profile_get**](TeamApi.md#team_profile_get) | **GET** /team.profile.get |  |


## team_access_logs

> <TeamAccessLogsSchema> team_access_logs(token, opts)



Gets the access logs for the current team.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::TeamApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin`
opts = {
  before: 'before_example', # String | End of time range of logs to include in results (inclusive).
  count: 'count_example', # String | 
  page: 'page_example' # String | 
}

begin
  
  result = api_instance.team_access_logs(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling TeamApi->team_access_logs: #{e}"
end
```

#### Using the team_access_logs_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TeamAccessLogsSchema>, Integer, Hash)> team_access_logs_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.team_access_logs_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TeamAccessLogsSchema>
rescue slack::ApiError => e
  puts "Error when calling TeamApi->team_access_logs_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin&#x60; |  |
| **before** | **String** | End of time range of logs to include in results (inclusive). | [optional] |
| **count** | **String** |  | [optional] |
| **page** | **String** |  | [optional] |

### Return type

[**TeamAccessLogsSchema**](TeamAccessLogsSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## team_billable_info

> <DefaultSuccessTemplate> team_billable_info(token, opts)



Gets billable users information for the current team.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::TeamApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin`
opts = {
  user: 'user_example' # String | A user to retrieve the billable information for. Defaults to all users.
}

begin
  
  result = api_instance.team_billable_info(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling TeamApi->team_billable_info: #{e}"
end
```

#### Using the team_billable_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DefaultSuccessTemplate>, Integer, Hash)> team_billable_info_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.team_billable_info_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DefaultSuccessTemplate>
rescue slack::ApiError => e
  puts "Error when calling TeamApi->team_billable_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin&#x60; |  |
| **user** | **String** | A user to retrieve the billable information for. Defaults to all users. | [optional] |

### Return type

[**DefaultSuccessTemplate**](DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## team_info

> <TeamInfoSchema> team_info(token, opts)



Gets information about the current team.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::TeamApi.new
token = 'token_example' # String | Authentication token. Requires scope: `team:read`
opts = {
  team: 'team_example' # String | Team to get info on, if omitted, will return information about the current team. Will only return team that the authenticated token is allowed to see through external shared channels
}

begin
  
  result = api_instance.team_info(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling TeamApi->team_info: #{e}"
end
```

#### Using the team_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TeamInfoSchema>, Integer, Hash)> team_info_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.team_info_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TeamInfoSchema>
rescue slack::ApiError => e
  puts "Error when calling TeamApi->team_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;team:read&#x60; |  |
| **team** | **String** | Team to get info on, if omitted, will return information about the current team. Will only return team that the authenticated token is allowed to see through external shared channels | [optional] |

### Return type

[**TeamInfoSchema**](TeamInfoSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## team_integration_logs

> <TeamIntegrationLogsSchema> team_integration_logs(token, opts)



Gets the integration logs for the current team.

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::TeamApi.new
token = 'token_example' # String | Authentication token. Requires scope: `admin`
opts = {
  app_id: 'app_id_example', # String | Filter logs to this Slack app. Defaults to all logs.
  change_type: 'change_type_example', # String | Filter logs with this change type. Defaults to all logs.
  count: 'count_example', # String | 
  page: 'page_example', # String | 
  service_id: 'service_id_example', # String | Filter logs to this service. Defaults to all logs.
  user: 'user_example' # String | Filter logs generated by this userâ€™s actions. Defaults to all logs.
}

begin
  
  result = api_instance.team_integration_logs(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling TeamApi->team_integration_logs: #{e}"
end
```

#### Using the team_integration_logs_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TeamIntegrationLogsSchema>, Integer, Hash)> team_integration_logs_with_http_info(token, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.team_integration_logs_with_http_info(token, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TeamIntegrationLogsSchema>
rescue slack::ApiError => e
  puts "Error when calling TeamApi->team_integration_logs_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;admin&#x60; |  |
| **app_id** | **String** | Filter logs to this Slack app. Defaults to all logs. | [optional] |
| **change_type** | **String** | Filter logs with this change type. Defaults to all logs. | [optional] |
| **count** | **String** |  | [optional] |
| **page** | **String** |  | [optional] |
| **service_id** | **String** | Filter logs to this service. Defaults to all logs. | [optional] |
| **user** | **String** | Filter logs generated by this userâ€™s actions. Defaults to all logs. | [optional] |

### Return type

[**TeamIntegrationLogsSchema**](TeamIntegrationLogsSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


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

api_instance = slack::TeamApi.new
token = 'token_example' # String | Authentication token. Requires scope: `users.profile:read`
opts = {
  visibility: 'visibility_example' # String | Filter by visibility.
}

begin
  
  result = api_instance.team_profile_get(token, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling TeamApi->team_profile_get: #{e}"
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
  puts "Error when calling TeamApi->team_profile_get_with_http_info: #{e}"
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

