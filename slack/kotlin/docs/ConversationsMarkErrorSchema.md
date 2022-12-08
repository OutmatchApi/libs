
# ConversationsMarkErrorSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**inline**](#Error) |  | 
**ok** | [**DefsOkFalse**](DefsOkFalse.md) |  | 
**callstack** | **kotlin.String** | Note: PHP callstack is only visible in dev/qa |  [optional]
**needed** | **kotlin.String** |  |  [optional]
**provided** | **kotlin.String** |  |  [optional]


<a name="Error"></a>
## Enum: error
Name | Value
---- | -----
error | method_not_supported_for_channel_type, missing_scope, channel_not_found, invalid_timestamp, not_in_channel, not_authed, invalid_auth, account_inactive, invalid_arg_name, invalid_array_arg, invalid_charset, invalid_form_data, invalid_post_type, missing_post_type, invalid_json, json_not_object, request_timeout, upgrade_required, not_allowed_token_type



