
# ChatPostEphemeralErrorSchema

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
error | channel_not_found, is_archived, msg_too_long, no_text, restricted_action, too_many_attachments, user_not_in_channel, not_authed, invalid_auth, account_inactive, token_revoked, no_permission, org_login_required, invalid_arg_name, invalid_array_arg, invalid_charset, invalid_form_data, invalid_post_type, missing_post_type, team_added_to_org, invalid_json, json_not_object, request_timeout, upgrade_required, fatal_error



