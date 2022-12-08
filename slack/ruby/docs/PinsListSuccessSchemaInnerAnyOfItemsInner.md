# slack::PinsListSuccessSchemaInnerAnyOfItemsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created** | **Integer** |  | [optional] |
| **created_by** | **String** |  | [optional] |
| **file** | [**ObjsFile**](ObjsFile.md) |  | [optional] |
| **type** | **String** |  | [optional] |
| **channel** | **String** |  | [optional] |
| **message** | [**ObjsMessage**](ObjsMessage.md) |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::PinsListSuccessSchemaInnerAnyOfItemsInner.new(
  created: null,
  created_by: null,
  file: null,
  type: null,
  channel: null,
  message: null
)
```

