# MessageIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_type** | **String** |  | 
**event_id** | Option<**String**> | Optional unique identifier for the message | [optional]
**channels** | Option<**Vec<String>**> | List of free-form identifiers that endpoints can filter by | [optional]
**payload** | [**serde_json::Value**](.md) |  | 
**payload_retention_period** | Option<**i32**> | The retention period for the payload (in days). | [optional][default to 90]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


