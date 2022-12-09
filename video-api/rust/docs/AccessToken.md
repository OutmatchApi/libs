# AccessToken

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | Option<**String**> | The access token containing security credentials allowing you to acccess the API. The token lasts for one hour. | [optional]
**expires_in** | Option<**i32**> | Lists the time in seconds when your access token expires. It lasts for one hour. | [optional]
**refresh_token** | Option<**String**> | A token you can use to get the next access token when your current access token expires. | [optional]
**token_type** | Option<**String**> | The type of token you have. | [optional][default to bearer]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


