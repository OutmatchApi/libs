# slack::UsergroupsListSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **usergroups** | [**Array&lt;ObjsSubteam&gt;**](ObjsSubteam.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::UsergroupsListSchema.new(
  ok: null,
  usergroups: null
)
```

