
# UsersSetPhotoErrorSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**inline**](#Error) |  | 
**ok** | [**DefsOkFalse**](DefsOkFalse.md) |  | 
**callstack** | **kotlin.String** | Note: PHP callstack is only visible in dev/qa |  [optional]
**debugStep** | **kotlin.String** | possibly DEV/QA only |  [optional]
**dims** | **kotlin.String** | possibly DEV/QA only |  [optional]
**timeIdent** | **kotlin.Int** | possibly DEV/QA only |  [optional]


<a name="Error"></a>
## Enum: error
Name | Value
---- | -----
error | bad_image, too_large, too_many_frames, not_found, not_authed, invalid_auth, account_inactive, token_revoked, no_permission, org_login_required, user_is_bot, invalid_arg_name, invalid_array_arg, invalid_charset, invalid_form_data, invalid_post_type, missing_post_type, team_added_to_org, invalid_json, json_not_object, request_timeout, upgrade_required, fatal_error



