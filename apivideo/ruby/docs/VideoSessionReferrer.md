# apivideo::VideoSessionReferrer

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **medium** | **String** | How they arrived at the site, for example organic or paid. Organic meaning they found it themselves and paid meaning they followed a link from an advertisement. | [optional] |
| **search_term** | **String** | The search term they typed to arrive at the video session. | [optional] |
| **source** | **String** | The source the referrer came from to the video session. For example if they searched through google to find the stream. | [optional] |
| **url** | **String** | The link the viewer used to reach the video session. | [optional] |

## Example

```ruby
require 'apivideo'

instance = apivideo::VideoSessionReferrer.new(
  medium: organic,
  search_term: null,
  source: https://google.com,
  url: https://api.video
)
```

