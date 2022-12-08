# slack::FilesInfoSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **comments** | **Array&lt;Object&gt;** |  |  |
| **content_html** | **Object** |  | [optional] |
| **editor** | **String** |  | [optional] |
| **file** | [**ObjsFile**](ObjsFile.md) |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **paging** | [**ObjsPaging**](ObjsPaging.md) |  | [optional] |
| **response_metadata** | [**Array&lt;ObjsResponseMetadataInner&gt;**](ObjsResponseMetadataInner.md) |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::FilesInfoSchema.new(
  comments: null,
  content_html: null,
  editor: null,
  file: null,
  ok: null,
  paging: null,
  response_metadata: null
)
```

