
# VideostatusIngest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filesize** | **kotlin.Int** | The size of your file in bytes. |  [optional]
**receivedBytes** | [**kotlin.collections.List&lt;BytesRange&gt;**](BytesRange.md) | The total number of bytes received, listed for each chunk of the upload. |  [optional]
**status** | [**inline**](#Status) | There are three possible ingest statuses. missing - you are missing information required to ingest the video. uploading - the video is in the process of being uploaded. uploaded - the video is ready for use. |  [optional]


<a name="Status"></a>
## Enum: status
Name | Value
---- | -----
status | missing, uploading, uploaded



