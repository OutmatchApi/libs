# slack::ReactionsListSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | **Array&lt;Array&lt;ReactionsListSchemaItemsInnerInner&gt;&gt;** |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **paging** | [**ObjsPaging**](ObjsPaging.md) |  | [optional] |
| **response_metadata** | [**Array&lt;ObjsResponseMetadataInner&gt;**](ObjsResponseMetadataInner.md) |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ReactionsListSchema.new(
  items: null,
  ok: null,
  paging: null,
  response_metadata: null
)
```

