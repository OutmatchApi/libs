# video-api::LiveStreamSessionReferrer

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **medium** | **String** | The type of search that brought the viewer to the live stream. Organic would be they found it on their own, paid would be they found it via an advertisement. | [optional] |
| **search_term** | **String** | What term they searched for that led them to the live stream. | [optional] |
| **source** | **String** | Where the viewer came from to see the live stream (usually where they searched from). | [optional] |
| **url** | **String** | The website the viewer of the live stream was referred to in order to view the live stream. | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::LiveStreamSessionReferrer.new(
  medium: organic,
  search_term: video stream,
  source: https://google.com,
  url: https://api.video
)
```

