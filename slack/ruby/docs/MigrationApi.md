# slack::MigrationApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**migration_exchange**](MigrationApi.md#migration_exchange) | **GET** /migration.exchange |  |


## migration_exchange

> <MigrationExchangeSuccessSchema> migration_exchange(token, users, opts)



For Enterprise Grid workspaces, map local user IDs to global user IDs

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::MigrationApi.new
token = 'token_example' # String | Authentication token. Requires scope: `tokens.basic`
users = 'users_example' # String | A comma-separated list of user ids, up to 400 per request
opts = {
  team_id: 'team_id_example', # String | Specify team_id starts with `T` in case of Org Token
  to_old: true # Boolean | Specify `true` to convert `W` global user IDs to workspace-specific `U` IDs. Defaults to `false`.
}

begin
  
  result = api_instance.migration_exchange(token, users, opts)
  p result
rescue slack::ApiError => e
  puts "Error when calling MigrationApi->migration_exchange: #{e}"
end
```

#### Using the migration_exchange_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MigrationExchangeSuccessSchema>, Integer, Hash)> migration_exchange_with_http_info(token, users, opts)

```ruby
begin
  
  data, status_code, headers = api_instance.migration_exchange_with_http_info(token, users, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MigrationExchangeSuccessSchema>
rescue slack::ApiError => e
  puts "Error when calling MigrationApi->migration_exchange_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;tokens.basic&#x60; |  |
| **users** | **String** | A comma-separated list of user ids, up to 400 per request |  |
| **team_id** | **String** | Specify team_id starts with &#x60;T&#x60; in case of Org Token | [optional] |
| **to_old** | **Boolean** | Specify &#x60;true&#x60; to convert &#x60;W&#x60; global user IDs to workspace-specific &#x60;U&#x60; IDs. Defaults to &#x60;false&#x60;. | [optional] |

### Return type

[**MigrationExchangeSuccessSchema**](MigrationExchangeSuccessSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

