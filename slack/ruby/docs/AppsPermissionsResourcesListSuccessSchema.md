# slack::AppsPermissionsResourcesListSuccessSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **resources** | [**Array&lt;AppsPermissionsResourcesListSuccessSchemaResourcesInner&gt;**](AppsPermissionsResourcesListSuccessSchemaResourcesInner.md) |  |  |
| **response_metadata** | [**AppsPermissionsResourcesListSuccessSchemaResponseMetadata**](AppsPermissionsResourcesListSuccessSchemaResponseMetadata.md) |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::AppsPermissionsResourcesListSuccessSchema.new(
  ok: null,
  resources: null,
  response_metadata: null
)
```

