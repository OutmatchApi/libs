# EndpointIn

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
**secret** | Option<**String**> | The endpoint's verification secret. If `null` is passed, a secret is automatically generated. Format: `base64` encoded random bytes optionally prefixed with `whsec_`. Recommended size: 24. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


