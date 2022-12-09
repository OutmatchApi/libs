# apivideo::VideoSessionLocation

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **city** | **String** | The city of the viewer. | [optional] |
| **country** | **String** | The country of the viewer. | [optional] |

## Example

```ruby
require 'apivideo'

instance = apivideo::VideoSessionLocation.new(
  city: Paris,
  country: France
)
```

