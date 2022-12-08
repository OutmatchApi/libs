# slack::UsersListSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cache_ts** | **Integer** |  |  |
| **members** | **Array&lt;Array&gt;** |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **response_metadata** | [**Array&lt;ObjsResponseMetadataInner&gt;**](ObjsResponseMetadataInner.md) |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::UsersListSchema.new(
  cache_ts: null,
  members: null,
  ok: null,
  response_metadata: null
)
```

