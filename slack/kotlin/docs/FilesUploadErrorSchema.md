
# FilesUploadErrorSchema

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
error | posting_to_general_channel_denied, invalid_channel, file_uploads_disabled, file_uploads_except_images_disabled, storage_limit_reached, not_authed, invalid_auth, account_inactive, no_permission, invalid_arg_name, invalid_array_arg, invalid_charset, invalid_form_data, invalid_post_type, missing_post_type, team_added_to_org, invalid_json, json_not_object, request_timeout, upgrade_required



