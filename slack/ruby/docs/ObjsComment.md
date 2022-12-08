# slack::ObjsComment

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **comment** | **String** |  |  |
| **created** | **Integer** |  |  |
| **id** | **String** |  |  |
| **is_intro** | **Boolean** |  |  |
| **is_starred** | **Boolean** |  | [optional] |
| **num_stars** | **Integer** |  | [optional] |
| **pinned_info** | **Object** |  | [optional] |
| **pinned_to** | **Array&lt;String&gt;** |  | [optional] |
| **reactions** | [**Array&lt;ObjsReaction&gt;**](ObjsReaction.md) |  | [optional] |
| **timestamp** | **Integer** |  |  |
| **user** | **String** |  |  |

## Example

```ruby
require 'slack'

instance = slack::ObjsComment.new(
  comment: null,
  created: null,
  id: null,
  is_intro: null,
  is_starred: null,
  num_stars: null,
  pinned_info: null,
  pinned_to: null,
  reactions: null,
  timestamp: null,
  user: null
)
```

