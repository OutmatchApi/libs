# testing-api-video::BytesRange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **from** | **Integer** | The starting point for the range of bytes for a chunk of a video. | [optional] |
| **to** | **Integer** | The ending point for the range of bytes for a chunk of a video. | [optional] |
| **total** | **Integer** | The total number of bytes in the provided range. | [optional] |

## Example

```ruby
require 'testing-api-video'

instance = testing-api-video::BytesRange.new(
  from: 0,
  to: 9999,
  total: 10000
)
```
