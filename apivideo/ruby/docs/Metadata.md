# apivideo::Metadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **key** | **String** | The constant that defines the data set. | [optional] |
| **value** | **String** | A variable which belongs to the data set. | [optional] |

## Example

```ruby
require 'apivideo'

instance = apivideo::Metadata.new(
  key: Color,
  value: Green
)
```

