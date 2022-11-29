# MessageEndpointOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uid** | Option<**String**> | Optional unique identifier for the endpoint | [optional]
**url** | **String** |  | 
**version** | **i32** |  | 
**description** | Option<**String**> |  | [optional][default to ]
**filter_types** | Option<**Vec<String>**> |  | [optional]
**channels** | Option<**Vec<String>**> | List of message channels this endpoint listens to (omit for all) | [optional]
**disabled** | Option<**bool**> |  | [optional][default to false]
**rate_limit** | Option<**i32**> |  | [optional]
**metadata** | Option<**::std::collections::HashMap<String, String>**> |  | [optional]
**id** | **String** |  | 
**created_at** | **String** |  | 
**status** | [**crate::models::MessageStatus**](MessageStatus.md) |  | 
**next_attempt** | Option<**String**> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


