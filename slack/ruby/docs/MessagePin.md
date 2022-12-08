# slack::MessagePin

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **channel** | **String** |  | [optional] |
| **created** | **Integer** |  | [optional] |
| **created_by** | **String** |  | [optional] |
| **message** | [**ObjsMessage**](ObjsMessage.md) |  | [optional] |
| **type** | **String** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::MessagePin.new(
  channel: null,
  created: null,
  created_by: null,
  message: null,
  type: null
)
```

