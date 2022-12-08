# slack::FilesListSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **files** | [**Array&lt;ObjsFile&gt;**](ObjsFile.md) |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **paging** | [**ObjsPaging**](ObjsPaging.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::FilesListSchema.new(
  files: null,
  ok: null,
  paging: null
)
```

