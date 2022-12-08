# slack::DialogApi

All URIs are relative to *https://slack.com/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**dialog_open**](DialogApi.md#dialog_open) | **GET** /dialog.open |  |


## dialog_open

> <DialogOpenSchema> dialog_open(token, dialog, trigger_id)



Open a dialog with a user

### Examples

```ruby
require 'time'
require 'slack'
# setup authorization
slack.configure do |config|
  # Configure OAuth2 access token for authorization: slackAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = slack::DialogApi.new
token = 'token_example' # String | Authentication token. Requires scope: `none`
dialog = 'dialog_example' # String | The dialog definition. This must be a JSON-encoded string.
trigger_id = 'trigger_id_example' # String | Exchange a trigger to post to the user.

begin
  
  result = api_instance.dialog_open(token, dialog, trigger_id)
  p result
rescue slack::ApiError => e
  puts "Error when calling DialogApi->dialog_open: #{e}"
end
```

#### Using the dialog_open_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DialogOpenSchema>, Integer, Hash)> dialog_open_with_http_info(token, dialog, trigger_id)

```ruby
begin
  
  data, status_code, headers = api_instance.dialog_open_with_http_info(token, dialog, trigger_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DialogOpenSchema>
rescue slack::ApiError => e
  puts "Error when calling DialogApi->dialog_open_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **token** | **String** | Authentication token. Requires scope: &#x60;none&#x60; |  |
| **dialog** | **String** | The dialog definition. This must be a JSON-encoded string. |  |
| **trigger_id** | **String** | Exchange a trigger to post to the user. |  |

### Return type

[**DialogOpenSchema**](DialogOpenSchema.md)

### Authorization

[slackAuth](../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

