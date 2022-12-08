# slack::PinsListSuccessSchemaInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | [**Array&lt;PinsListSuccessSchemaInnerAnyOfItemsInner&gt;**](PinsListSuccessSchemaInnerAnyOfItemsInner.md) |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **count** | **Integer** |  |  |

## Example

```ruby
require 'slack'

instance = slack::PinsListSuccessSchemaInner.new(
  items: null,
  ok: null,
  count: null
)
```

