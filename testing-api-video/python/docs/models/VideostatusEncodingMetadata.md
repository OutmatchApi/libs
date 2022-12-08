# testing-api-video.model.videostatus_encoding_metadata.VideostatusEncodingMetadata

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**aspectRatio** | str,  | str,  |  | [optional] 
**audioCodec** | str,  | str,  | The method used to compress and decompress digital audio for your video. | [optional] 
**bitrate** | decimal.Decimal, int, float,  | decimal.Decimal,  | The number of bits processed per second. | [optional] 
**duration** | decimal.Decimal, int,  | decimal.Decimal,  | The length of the video. | [optional] 
**framerate** | decimal.Decimal, int,  | decimal.Decimal,  | The frequency with which consecutive images or frames appear on a display. Shown in this API as frames per second (fps). | [optional] 
**height** | decimal.Decimal, int,  | decimal.Decimal,  | The height of the video in pixels. | [optional] 
**samplerate** | decimal.Decimal, int,  | decimal.Decimal,  | How many samples per second a digital audio system uses to record an audio signal. The higher the rate, the higher the frequencies that can be recorded. They are presented in this API using hertz. | [optional] 
**videoCodec** | str,  | str,  | The method used to compress and decompress digital video. API Video supports all codecs in the libavcodec library.  | [optional] 
**width** | decimal.Decimal, int,  | decimal.Decimal,  | The width of the video in pixels. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

