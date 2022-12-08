# VideostatusIngest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filesize** | Option<**i32**> | The size of your file in bytes. | [optional]
**received_bytes** | Option<[**Vec<crate::models::BytesRange>**](bytes_range.md)> | The total number of bytes received, listed for each chunk of the upload. | [optional]
**status** | Option<**String**> | There are three possible ingest statuses. missing - you are missing information required to ingest the video. uploading - the video is in the process of being uploaded. uploaded - the video is ready for use. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


