# apivideo.model.playerinput.Playerinput

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**backgroundBottom** | str,  | str,  | RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7) | [optional] 
**backgroundText** | str,  | str,  | RGBA color for title text. Default: rgba(255, 255, 255, 1) | [optional] 
**backgroundTop** | str,  | str,  | RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7) | [optional] 
**enableApi** | bool,  | BoolClass,  | enable/disable player SDK access. Default: true | [optional] if omitted the server will use the default value of True
**enableControls** | bool,  | BoolClass,  | enable/disable player controls. Default: true | [optional] if omitted the server will use the default value of True
**forceAutoplay** | bool,  | BoolClass,  | enable/disable player autoplay. Default: false | [optional] if omitted the server will use the default value of False
**forceLoop** | bool,  | BoolClass,  | enable/disable looping. Default: false | [optional] if omitted the server will use the default value of False
**hideTitle** | bool,  | BoolClass,  | enable/disable title. Default: false | [optional] if omitted the server will use the default value of False
**link** | str,  | str,  | RGBA color for all controls. Default: rgba(255, 255, 255, 1) | [optional] 
**linkHover** | str,  | str,  | RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1) | [optional] 
**text** | str,  | str,  | RGBA color for timer text. Default: rgba(255, 255, 255, 1) | [optional] 
**trackBackground** | str,  | str,  | RGBA color playback bar: background. Default: rgba(255, 255, 255, .2) | [optional] 
**trackPlayed** | str,  | str,  | RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95) | [optional] 
**trackUnplayed** | str,  | str,  | RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35) | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

