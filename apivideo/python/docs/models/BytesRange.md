# apivideo.model.bytes_range.BytesRange

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**from** | decimal.Decimal, int,  | decimal.Decimal,  | The starting point for the range of bytes for a chunk of a video. | [optional] 
**to** | decimal.Decimal, int,  | decimal.Decimal,  | The ending point for the range of bytes for a chunk of a video. | [optional] 
**total** | decimal.Decimal, int,  | decimal.Decimal,  | The total number of bytes in the provided range. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

