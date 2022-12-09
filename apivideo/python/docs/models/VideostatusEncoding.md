# apivideo.model.videostatus_encoding.VideostatusEncoding

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**metadata** | [**VideostatusEncodingMetadata**](VideostatusEncodingMetadata.md) | [**VideostatusEncodingMetadata**](VideostatusEncodingMetadata.md) |  | [optional] 
**playable** | bool,  | BoolClass,  | Whether the video is playable or not. | [optional] 
**[qualities](#qualities)** | list, tuple,  | tuple,  | Available qualities the video can be viewed in. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# qualities

Available qualities the video can be viewed in.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Available qualities the video can be viewed in. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Quality**](Quality.md) | [**Quality**](Quality.md) | [**Quality**](Quality.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

