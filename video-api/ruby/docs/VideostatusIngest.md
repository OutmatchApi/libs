# video-api::VideostatusIngest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **filesize** | **Integer** | The size of your file in bytes. | [optional] |
| **received_bytes** | [**Array&lt;BytesRange&gt;**](BytesRange.md) | The total number of bytes received, listed for each chunk of the upload. | [optional] |
| **status** | **String** | There are three possible ingest statuses. missing - you are missing information required to ingest the video. uploading - the video is in the process of being uploaded. uploaded - the video is ready for use. | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::VideostatusIngest.new(
  filesize: 200000,
  received_bytes: null,
  status: uploaded
)
```

