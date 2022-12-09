# video-api::Subtitle

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **default** | **Boolean** | Whether you will have subtitles or not. True for yes you will have subtitles, false for no you will not have subtitles. | [optional][default to false] |
| **src** | **String** |  | [optional] |
| **srclang** | **String** |  | [optional] |
| **uri** | **String** |  | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::Subtitle.new(
  default: false,
  src: null,
  srclang: null,
  uri: null
)
```

