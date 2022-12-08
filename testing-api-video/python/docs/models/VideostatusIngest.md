# testing-api-video.model.videostatus_ingest.VideostatusIngest

Details about the capturing, transferring, and storing of your video for use immediately or in the future.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details about the capturing, transferring, and storing of your video for use immediately or in the future. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**filesize** | decimal.Decimal, int,  | decimal.Decimal,  | The size of your file in bytes. | [optional] 
**[receivedBytes](#receivedBytes)** | list, tuple,  | tuple,  | The total number of bytes received, listed for each chunk of the upload. | [optional] 
**status** | str,  | str,  | There are three possible ingest statuses. missing - you are missing information required to ingest the video. uploading - the video is in the process of being uploaded. uploaded - the video is ready for use. | [optional] must be one of ["missing", "uploading", "uploaded", ] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# receivedBytes

The total number of bytes received, listed for each chunk of the upload.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | The total number of bytes received, listed for each chunk of the upload. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**BytesRange**](BytesRange.md) | [**BytesRange**](BytesRange.md) | [**BytesRange**](BytesRange.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

