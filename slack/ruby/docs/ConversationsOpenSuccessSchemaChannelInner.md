# slack::ConversationsOpenSuccessSchemaChannelInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created** | **String** |  | [optional] |
| **id** | **String** |  |  |
| **is_im** | **Boolean** |  | [optional] |
| **is_open** | **Boolean** |  | [optional] |
| **last_read** | **String** |  | [optional] |
| **latest** | [**ObjsMessage**](ObjsMessage.md) |  | [optional] |
| **unread_count** | **Float** |  | [optional] |
| **unread_count_display** | **Float** |  | [optional] |
| **user** | **String** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ConversationsOpenSuccessSchemaChannelInner.new(
  created: null,
  id: null,
  is_im: null,
  is_open: null,
  last_read: null,
  latest: null,
  unread_count: null,
  unread_count_display: null,
  user: null
)
```

