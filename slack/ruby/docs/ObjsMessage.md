# slack::ObjsMessage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **attachments** | [**Array&lt;ObjsMessageAttachmentsInner&gt;**](ObjsMessageAttachmentsInner.md) |  | [optional] |
| **blocks** | [**Array&lt;BlocksInner&gt;**](BlocksInner.md) | This is a very loose definition, in the future, we&#39;ll populate this with deeper schema in this definition namespace. | [optional] |
| **bot_id** | [**Array&lt;ObjsMessageBotIdInner&gt;**](ObjsMessageBotIdInner.md) |  | [optional] |
| **bot_profile** | [**ObjsBotProfile**](ObjsBotProfile.md) |  | [optional] |
| **client_msg_id** | **String** |  | [optional] |
| **comment** | [**ObjsComment**](ObjsComment.md) |  | [optional] |
| **display_as_bot** | **Boolean** |  | [optional] |
| **file** | [**ObjsFile**](ObjsFile.md) |  | [optional] |
| **files** | [**Array&lt;ObjsFile&gt;**](ObjsFile.md) |  | [optional] |
| **icons** | [**ObjsMessageIcons**](ObjsMessageIcons.md) |  | [optional] |
| **inviter** | **String** |  | [optional] |
| **is_delayed_message** | **Boolean** |  | [optional] |
| **is_intro** | **Boolean** |  | [optional] |
| **is_starred** | **Boolean** |  | [optional] |
| **last_read** | **String** |  | [optional] |
| **latest_reply** | **String** |  | [optional] |
| **name** | **String** |  | [optional] |
| **old_name** | **String** |  | [optional] |
| **parent_user_id** | **String** |  | [optional] |
| **permalink** | **String** |  | [optional] |
| **pinned_to** | **Array&lt;String&gt;** |  | [optional] |
| **purpose** | **String** |  | [optional] |
| **reactions** | [**Array&lt;ObjsReaction&gt;**](ObjsReaction.md) |  | [optional] |
| **reply_count** | **Integer** |  | [optional] |
| **reply_users** | **Array&lt;String&gt;** |  | [optional] |
| **reply_users_count** | **Integer** |  | [optional] |
| **source_team** | **String** |  | [optional] |
| **subscribed** | **Boolean** |  | [optional] |
| **subtype** | **String** |  | [optional] |
| **team** | **String** |  | [optional] |
| **text** | **String** |  |  |
| **thread_ts** | **String** |  | [optional] |
| **topic** | **String** |  | [optional] |
| **ts** | **String** |  |  |
| **type** | **String** |  |  |
| **unread_count** | **Integer** |  | [optional] |
| **upload** | **Boolean** |  | [optional] |
| **user** | **String** |  | [optional] |
| **user_profile** | [**ObjsUserProfileShort**](ObjsUserProfileShort.md) |  | [optional] |
| **user_team** | **String** |  | [optional] |
| **username** | **String** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ObjsMessage.new(
  attachments: null,
  blocks: null,
  bot_id: null,
  bot_profile: null,
  client_msg_id: null,
  comment: null,
  display_as_bot: null,
  file: null,
  files: null,
  icons: null,
  inviter: null,
  is_delayed_message: null,
  is_intro: null,
  is_starred: null,
  last_read: null,
  latest_reply: null,
  name: null,
  old_name: null,
  parent_user_id: null,
  permalink: null,
  pinned_to: null,
  purpose: null,
  reactions: null,
  reply_count: null,
  reply_users: null,
  reply_users_count: null,
  source_team: null,
  subscribed: null,
  subtype: null,
  team: null,
  text: null,
  thread_ts: null,
  topic: null,
  ts: null,
  type: null,
  unread_count: null,
  upload: null,
  user: null,
  user_profile: null,
  user_team: null,
  username: null
)
```

