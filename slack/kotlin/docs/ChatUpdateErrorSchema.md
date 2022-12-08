
# ChatUpdateErrorSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**inline**](#Error) |  | 
**ok** | [**DefsOkFalse**](DefsOkFalse.md) |  | 
**callstack** | **kotlin.String** | Note: PHP callstack is only visible in dev/qa |  [optional]


<a name="Error"></a>
## Enum: error
Name | Value
---- | -----
error | message_not_found, cant_update_message, channel_not_found, edit_window_closed, msg_too_long, too_many_attachments, rate_limited, no_text, not_authed, invalid_auth, account_inactive, token_revoked, no_permission, invalid_arg_name, invalid_array_arg, invalid_charset, invalid_form_data, invalid_post_type, missing_post_type, request_timeout, invalid_json, json_not_object, upgrade_required, fatal_error, is_inactive



