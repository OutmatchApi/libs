
# ConversationsOpenErrorSchema

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
error | method_not_supported_for_channel_type, user_not_found, user_not_visible, user_disabled, users_list_not_supplied, not_enough_users, too_many_users, invalid_user_combination, not_authed, invalid_auth, account_inactive, invalid_arg_name, invalid_array_arg, invalid_charset, invalid_form_data, invalid_post_type, missing_post_type, team_added_to_org, invalid_json, json_not_object, request_timeout, upgrade_required, channel_not_found



