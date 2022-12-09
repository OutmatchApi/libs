# apivideo::Chapter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **language** | **String** |  | [optional] |
| **src** | **String** | The link to your VTT file, which contains your chapters information for the video. | [optional] |
| **uri** | **String** |  | [optional] |

## Example

```ruby
require 'apivideo'

instance = apivideo::Chapter.new(
  language: null,
  src: https://cdn.api.video/vod/vi3N6cDinStg3oBbN79GklWS/chapters/fr.vtt,
  uri: null
)
```

