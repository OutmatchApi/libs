
# ConversationsInviteErrorSchema1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ok** | [**DefsOkFalse**](DefsOkFalse.md) |  | 
**callstack** | **kotlin.String** | Note: PHP callstack is only visible in dev/qa |  [optional]
**error** | [**inline**](#Error) |  |  [optional]
**errors** | [**kotlin.collections.Set&lt;ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner&gt;**](ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner.md) |  |  [optional]
**needed** | **kotlin.String** |  |  [optional]
**provided** | **kotlin.String** |  |  [optional]


<a name="Error"></a>
## Enum: error
Name | Value
---- | -----
error | method_not_supported_for_channel_type, missing_scope, channel_not_found, user_not_found, no_user, cant_invite_self, not_in_channel, already_in_channel, is_archived, cant_invite, too_many_users, ura_max_channels, not_authed, invalid_auth, account_inactive, user_is_bot, user_is_restricted, user_is_ultra_restricted, invalid_arg_name, invalid_array_arg, invalid_charset, invalid_form_data, invalid_post_type, missing_post_type, invalid_json, json_not_object, request_timeout, upgrade_required, team_added_to_org, missing_charset, superfluous_charset



