# # VideostatusIngest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filesize** | **int** | The size of your file in bytes. | [optional]
**received_bytes** | [**\OpenAPI\Client\Model\BytesRange[]**](BytesRange.md) | The total number of bytes received, listed for each chunk of the upload. | [optional]
**status** | **string** | There are three possible ingest statuses. missing - you are missing information required to ingest the video. uploading - the video is in the process of being uploaded. uploaded - the video is ready for use. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
