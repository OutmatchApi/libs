# testing-api-video::VideoSessionDevice

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **model** | **String** | The specific model of the device, if known. | [optional] |
| **type** | **String** | What the type is like desktop, laptop, mobile. | [optional] |
| **vendor** | **String** | If known, what the brand of the device is, like Apple, Dell, etc. | [optional] |

## Example

```ruby
require 'testing-api-video'

instance = testing-api-video::VideoSessionDevice.new(
  model: unknown,
  type: desktop,
  vendor: Dell
)
```

