# slack::StarsListSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | **Array&lt;Array&lt;StarsListSchemaItemsInnerInner&gt;&gt;** |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **paging** | [**ObjsPaging**](ObjsPaging.md) |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::StarsListSchema.new(
  items: null,
  ok: null,
  paging: null
)
```

