
# ChatScheduleMessageErrorSchema

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
error | invalid_time, time_in_past, time_too_far, channel_not_found, not_in_channel, is_archived, msg_too_long, no_text, restricted_action, restricted_action_read_only_channel, restricted_action_thread_only_channel, restricted_action_non_threadable_channel, too_many_attachments, rate_limited, not_authed, invalid_auth, account_inactive, token_revoked, no_permission, org_login_required, ekm_access_denied, missing_scope, invalid_arguments, invalid_arg_name, invalid_charset, invalid_form_data, invalid_post_type, missing_post_type, team_added_to_org, invalid_json, json_not_object, request_timeout, upgrade_required, fatal_error



