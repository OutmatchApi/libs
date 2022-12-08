# OpenAPI\Client\ChatApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**chatDelete()**](ChatApi.md#chatDelete) | **POST** /chat.delete |  |
| [**chatDeleteScheduledMessage()**](ChatApi.md#chatDeleteScheduledMessage) | **POST** /chat.deleteScheduledMessage |  |
| [**chatGetPermalink()**](ChatApi.md#chatGetPermalink) | **GET** /chat.getPermalink |  |
| [**chatMeMessage()**](ChatApi.md#chatMeMessage) | **POST** /chat.meMessage |  |
| [**chatPostEphemeral()**](ChatApi.md#chatPostEphemeral) | **POST** /chat.postEphemeral |  |
| [**chatPostMessage()**](ChatApi.md#chatPostMessage) | **POST** /chat.postMessage |  |
| [**chatScheduleMessage()**](ChatApi.md#chatScheduleMessage) | **POST** /chat.scheduleMessage |  |
| [**chatScheduledMessagesList()**](ChatApi.md#chatScheduledMessagesList) | **GET** /chat.scheduledMessages.list |  |
| [**chatUnfurl()**](ChatApi.md#chatUnfurl) | **POST** /chat.unfurl |  |
| [**chatUpdate()**](ChatApi.md#chatUpdate) | **POST** /chat.update |  |


## `chatDelete()`

```php
chatDelete($token, $as_user, $channel, $ts): \OpenAPI\Client\Model\ChatDeleteSuccessSchema
```



Deletes a message.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `chat:write`
$as_user = True; // bool | Pass true to delete the message as the authed user with `chat:write:user` scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with `chat:write:bot` scope.
$channel = 'channel_example'; // string | Channel containing the message to be deleted.
$ts = 3.4; // float | Timestamp of the message to be deleted.

try {
    $result = $apiInstance->chatDelete($token, $as_user, $channel, $ts);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;chat:write&#x60; | [optional] |
| **as_user** | **bool**| Pass true to delete the message as the authed user with &#x60;chat:write:user&#x60; scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with &#x60;chat:write:bot&#x60; scope. | [optional] |
| **channel** | **string**| Channel containing the message to be deleted. | [optional] |
| **ts** | **float**| Timestamp of the message to be deleted. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ChatDeleteSuccessSchema**](../Model/ChatDeleteSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `chatDeleteScheduledMessage()`

```php
chatDeleteScheduledMessage($token, $channel, $scheduled_message_id, $as_user): \OpenAPI\Client\Model\ChatDeleteScheduledMessageSchema
```



Deletes a pending scheduled message from the queue.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `chat:write`
$channel = 'channel_example'; // string | The channel the scheduled_message is posting to
$scheduled_message_id = 'scheduled_message_id_example'; // string | `scheduled_message_id` returned from call to chat.scheduleMessage
$as_user = True; // bool | Pass true to delete the message as the authed user with `chat:write:user` scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with `chat:write:bot` scope.

try {
    $result = $apiInstance->chatDeleteScheduledMessage($token, $channel, $scheduled_message_id, $as_user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatDeleteScheduledMessage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;chat:write&#x60; | |
| **channel** | **string**| The channel the scheduled_message is posting to | |
| **scheduled_message_id** | **string**| &#x60;scheduled_message_id&#x60; returned from call to chat.scheduleMessage | |
| **as_user** | **bool**| Pass true to delete the message as the authed user with &#x60;chat:write:user&#x60; scope. [Bot users](/bot-users) in this context are considered authed users. If unused or false, the message will be deleted with &#x60;chat:write:bot&#x60; scope. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ChatDeleteScheduledMessageSchema**](../Model/ChatDeleteScheduledMessageSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `chatGetPermalink()`

```php
chatGetPermalink($token, $channel, $message_ts): \OpenAPI\Client\Model\ChatGetPermalinkSuccessSchema
```



Retrieve a permalink URL for a specific extant message

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$channel = 'channel_example'; // string | The ID of the conversation or channel containing the message
$message_ts = 'message_ts_example'; // string | A message's `ts` value, uniquely identifying it within a channel

try {
    $result = $apiInstance->chatGetPermalink($token, $channel, $message_ts);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatGetPermalink: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **channel** | **string**| The ID of the conversation or channel containing the message | |
| **message_ts** | **string**| A message&#39;s &#x60;ts&#x60; value, uniquely identifying it within a channel | |

### Return type

[**\OpenAPI\Client\Model\ChatGetPermalinkSuccessSchema**](../Model/ChatGetPermalinkSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `chatMeMessage()`

```php
chatMeMessage($token, $channel, $text): \OpenAPI\Client\Model\ChatMeMessageSchema
```



Share a me message into a channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `chat:write`
$channel = 'channel_example'; // string | Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name.
$text = 'text_example'; // string | Text of the message to send.

try {
    $result = $apiInstance->chatMeMessage($token, $channel, $text);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatMeMessage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;chat:write&#x60; | [optional] |
| **channel** | **string**| Channel to send message to. Can be a public channel, private group or IM channel. Can be an encoded ID, or a name. | [optional] |
| **text** | **string**| Text of the message to send. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ChatMeMessageSchema**](../Model/ChatMeMessageSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `chatPostEphemeral()`

```php
chatPostEphemeral($token, $channel, $user, $as_user, $attachments, $blocks, $icon_emoji, $icon_url, $link_names, $parse, $text, $thread_ts, $username): \OpenAPI\Client\Model\ChatPostEphemeralSuccessSchema
```



Sends an ephemeral message to a user in a channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `chat:write`
$channel = 'channel_example'; // string | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name.
$user = 'user_example'; // string | `id` of the user who will receive the ephemeral message. The user should be in the channel specified by the `channel` argument.
$as_user = True; // bool | Pass true to post the message as the authed user. Defaults to true if the chat:write:bot scope is not included. Otherwise, defaults to false.
$attachments = 'attachments_example'; // string | A JSON-based array of structured attachments, presented as a URL-encoded string.
$blocks = 'blocks_example'; // string | A JSON-based array of structured blocks, presented as a URL-encoded string.
$icon_emoji = 'icon_emoji_example'; // string | Emoji to use as the icon for this message. Overrides `icon_url`. Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](#authorship) below.
$icon_url = 'icon_url_example'; // string | URL to an image to use as the icon for this message. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
$link_names = True; // bool | Find and link channel names and usernames.
$parse = 'parse_example'; // string | Change how messages are treated. Defaults to `none`. See [below](#formatting).
$text = 'text_example'; // string | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail.
$thread_ts = 'thread_ts_example'; // string | Provide another message's `ts` value to post this message in a thread. Avoid using a reply's `ts` value; use its parent's value instead. Ephemeral messages in threads are only shown if there is already an active thread.
$username = 'username_example'; // string | Set your bot's user name. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.

try {
    $result = $apiInstance->chatPostEphemeral($token, $channel, $user, $as_user, $attachments, $blocks, $icon_emoji, $icon_url, $link_names, $parse, $text, $thread_ts, $username);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatPostEphemeral: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;chat:write&#x60; | |
| **channel** | **string**| Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. | |
| **user** | **string**| &#x60;id&#x60; of the user who will receive the ephemeral message. The user should be in the channel specified by the &#x60;channel&#x60; argument. | |
| **as_user** | **bool**| Pass true to post the message as the authed user. Defaults to true if the chat:write:bot scope is not included. Otherwise, defaults to false. | [optional] |
| **attachments** | **string**| A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional] |
| **blocks** | **string**| A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional] |
| **icon_emoji** | **string**| Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](#authorship) below. | [optional] |
| **icon_url** | **string**| URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional] |
| **link_names** | **bool**| Find and link channel names and usernames. | [optional] |
| **parse** | **string**| Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](#formatting). | [optional] |
| **text** | **string**| How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | [optional] |
| **thread_ts** | **string**| Provide another message&#39;s &#x60;ts&#x60; value to post this message in a thread. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent&#39;s value instead. Ephemeral messages in threads are only shown if there is already an active thread. | [optional] |
| **username** | **string**| Set your bot&#39;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ChatPostEphemeralSuccessSchema**](../Model/ChatPostEphemeralSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `chatPostMessage()`

```php
chatPostMessage($token, $channel, $as_user, $attachments, $blocks, $icon_emoji, $icon_url, $link_names, $mrkdwn, $parse, $reply_broadcast, $text, $thread_ts, $unfurl_links, $unfurl_media, $username): \OpenAPI\Client\Model\ChatPostMessageSuccessSchema
```



Sends a message to a channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `chat:write`
$channel = 'channel_example'; // string | Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details.
$as_user = 'as_user_example'; // string | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [authorship](#authorship) below.
$attachments = 'attachments_example'; // string | A JSON-based array of structured attachments, presented as a URL-encoded string.
$blocks = 'blocks_example'; // string | A JSON-based array of structured blocks, presented as a URL-encoded string.
$icon_emoji = 'icon_emoji_example'; // string | Emoji to use as the icon for this message. Overrides `icon_url`. Must be used in conjunction with `as_user` set to `false`, otherwise ignored. See [authorship](#authorship) below.
$icon_url = 'icon_url_example'; // string | URL to an image to use as the icon for this message. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.
$link_names = True; // bool | Find and link channel names and usernames.
$mrkdwn = True; // bool | Disable Slack markup parsing by setting to `false`. Enabled by default.
$parse = 'parse_example'; // string | Change how messages are treated. Defaults to `none`. See [below](#formatting).
$reply_broadcast = True; // bool | Used in conjunction with `thread_ts` and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to `false`.
$text = 'text_example'; // string | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail.
$thread_ts = 'thread_ts_example'; // string | Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead.
$unfurl_links = True; // bool | Pass true to enable unfurling of primarily text-based content.
$unfurl_media = True; // bool | Pass false to disable unfurling of media content.
$username = 'username_example'; // string | Set your bot's user name. Must be used in conjunction with `as_user` set to false, otherwise ignored. See [authorship](#authorship) below.

try {
    $result = $apiInstance->chatPostMessage($token, $channel, $as_user, $attachments, $blocks, $icon_emoji, $icon_url, $link_names, $mrkdwn, $parse, $reply_broadcast, $text, $thread_ts, $unfurl_links, $unfurl_media, $username);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatPostMessage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;chat:write&#x60; | |
| **channel** | **string**| Channel, private group, or IM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details. | |
| **as_user** | **string**| Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [authorship](#authorship) below. | [optional] |
| **attachments** | **string**| A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional] |
| **blocks** | **string**| A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional] |
| **icon_emoji** | **string**| Emoji to use as the icon for this message. Overrides &#x60;icon_url&#x60;. Must be used in conjunction with &#x60;as_user&#x60; set to &#x60;false&#x60;, otherwise ignored. See [authorship](#authorship) below. | [optional] |
| **icon_url** | **string**| URL to an image to use as the icon for this message. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional] |
| **link_names** | **bool**| Find and link channel names and usernames. | [optional] |
| **mrkdwn** | **bool**| Disable Slack markup parsing by setting to &#x60;false&#x60;. Enabled by default. | [optional] |
| **parse** | **string**| Change how messages are treated. Defaults to &#x60;none&#x60;. See [below](#formatting). | [optional] |
| **reply_broadcast** | **bool**| Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. | [optional] |
| **text** | **string**| How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | [optional] |
| **thread_ts** | **string**| Provide another message&#39;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | [optional] |
| **unfurl_links** | **bool**| Pass true to enable unfurling of primarily text-based content. | [optional] |
| **unfurl_media** | **bool**| Pass false to disable unfurling of media content. | [optional] |
| **username** | **string**| Set your bot&#39;s user name. Must be used in conjunction with &#x60;as_user&#x60; set to false, otherwise ignored. See [authorship](#authorship) below. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ChatPostMessageSuccessSchema**](../Model/ChatPostMessageSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `chatScheduleMessage()`

```php
chatScheduleMessage($token, $as_user, $attachments, $blocks, $channel, $link_names, $parse, $post_at, $reply_broadcast, $text, $thread_ts, $unfurl_links, $unfurl_media): \OpenAPI\Client\Model\ChatScheduleMessageSuccessSchema
```



Schedules a message to be sent to a channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `chat:write`
$as_user = True; // bool | Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship).
$attachments = 'attachments_example'; // string | A JSON-based array of structured attachments, presented as a URL-encoded string.
$blocks = 'blocks_example'; // string | A JSON-based array of structured blocks, presented as a URL-encoded string.
$channel = 'channel_example'; // string | Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details.
$link_names = True; // bool | Find and link channel names and usernames.
$parse = 'parse_example'; // string | Change how messages are treated. Defaults to `none`. See [chat.postMessage](chat.postMessage#formatting).
$post_at = 'post_at_example'; // string | Unix EPOCH timestamp of time in future to send the message.
$reply_broadcast = True; // bool | Used in conjunction with `thread_ts` and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to `false`.
$text = 'text_example'; // string | How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail.
$thread_ts = 3.4; // float | Provide another message's `ts` value to make this message a reply. Avoid using a reply's `ts` value; use its parent instead.
$unfurl_links = True; // bool | Pass true to enable unfurling of primarily text-based content.
$unfurl_media = True; // bool | Pass false to disable unfurling of media content.

try {
    $result = $apiInstance->chatScheduleMessage($token, $as_user, $attachments, $blocks, $channel, $link_names, $parse, $post_at, $reply_broadcast, $text, $thread_ts, $unfurl_links, $unfurl_media);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatScheduleMessage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;chat:write&#x60; | [optional] |
| **as_user** | **bool**| Pass true to post the message as the authed user, instead of as a bot. Defaults to false. See [chat.postMessage](chat.postMessage#authorship). | [optional] |
| **attachments** | **string**| A JSON-based array of structured attachments, presented as a URL-encoded string. | [optional] |
| **blocks** | **string**| A JSON-based array of structured blocks, presented as a URL-encoded string. | [optional] |
| **channel** | **string**| Channel, private group, or DM channel to send message to. Can be an encoded ID, or a name. See [below](#channels) for more details. | [optional] |
| **link_names** | **bool**| Find and link channel names and usernames. | [optional] |
| **parse** | **string**| Change how messages are treated. Defaults to &#x60;none&#x60;. See [chat.postMessage](chat.postMessage#formatting). | [optional] |
| **post_at** | **string**| Unix EPOCH timestamp of time in future to send the message. | [optional] |
| **reply_broadcast** | **bool**| Used in conjunction with &#x60;thread_ts&#x60; and indicates whether reply should be made visible to everyone in the channel or conversation. Defaults to &#x60;false&#x60;. | [optional] |
| **text** | **string**| How this field works and whether it is required depends on other fields you use in your API call. [See below](#text_usage) for more detail. | [optional] |
| **thread_ts** | **float**| Provide another message&#39;s &#x60;ts&#x60; value to make this message a reply. Avoid using a reply&#39;s &#x60;ts&#x60; value; use its parent instead. | [optional] |
| **unfurl_links** | **bool**| Pass true to enable unfurling of primarily text-based content. | [optional] |
| **unfurl_media** | **bool**| Pass false to disable unfurling of media content. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ChatScheduleMessageSuccessSchema**](../Model/ChatScheduleMessageSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `chatScheduledMessagesList()`

```php
chatScheduledMessagesList($token, $channel, $latest, $oldest, $limit, $cursor): \OpenAPI\Client\Model\ChatScheduledMessagesListSchema
```



Returns a list of scheduled messages.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$channel = 'channel_example'; // string | The channel of the scheduled messages
$latest = 3.4; // float | A UNIX timestamp of the latest value in the time range
$oldest = 3.4; // float | A UNIX timestamp of the oldest value in the time range
$limit = 56; // int | Maximum number of original entries to return.
$cursor = 'cursor_example'; // string | For pagination purposes, this is the `cursor` value returned from a previous call to `chat.scheduledmessages.list` indicating where you want to start this call from.

try {
    $result = $apiInstance->chatScheduledMessagesList($token, $channel, $latest, $oldest, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatScheduledMessagesList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | [optional] |
| **channel** | **string**| The channel of the scheduled messages | [optional] |
| **latest** | **float**| A UNIX timestamp of the latest value in the time range | [optional] |
| **oldest** | **float**| A UNIX timestamp of the oldest value in the time range | [optional] |
| **limit** | **int**| Maximum number of original entries to return. | [optional] |
| **cursor** | **string**| For pagination purposes, this is the &#x60;cursor&#x60; value returned from a previous call to &#x60;chat.scheduledmessages.list&#x60; indicating where you want to start this call from. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ChatScheduledMessagesListSchema**](../Model/ChatScheduledMessagesListSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `chatUnfurl()`

```php
chatUnfurl($token, $channel, $ts, $unfurls, $user_auth_message, $user_auth_required, $user_auth_url): \OpenAPI\Client\Model\ChatUnfurlSuccessSchema
```



Provide custom unfurl behavior for user-posted URLs

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `links:write`
$channel = 'channel_example'; // string | Channel ID of the message
$ts = 'ts_example'; // string | Timestamp of the message to add unfurl behavior to.
$unfurls = 'unfurls_example'; // string | URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments.
$user_auth_message = 'user_auth_message_example'; // string | Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior
$user_auth_required = True; // bool | Set to `true` or `1` to indicate the user must install your Slack app to trigger unfurls for this domain
$user_auth_url = 'user_auth_url_example'; // string | Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded.

try {
    $result = $apiInstance->chatUnfurl($token, $channel, $ts, $unfurls, $user_auth_message, $user_auth_required, $user_auth_url);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatUnfurl: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;links:write&#x60; | |
| **channel** | **string**| Channel ID of the message | |
| **ts** | **string**| Timestamp of the message to add unfurl behavior to. | |
| **unfurls** | **string**| URL-encoded JSON map with keys set to URLs featured in the the message, pointing to their unfurl blocks or message attachments. | [optional] |
| **user_auth_message** | **string**| Provide a simply-formatted string to send as an ephemeral message to the user as invitation to authenticate further and enable full unfurling behavior | [optional] |
| **user_auth_required** | **bool**| Set to &#x60;true&#x60; or &#x60;1&#x60; to indicate the user must install your Slack app to trigger unfurls for this domain | [optional] |
| **user_auth_url** | **string**| Send users to this custom URL where they will complete authentication in your app to fully trigger unfurling. Value should be properly URL-encoded. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ChatUnfurlSuccessSchema**](../Model/ChatUnfurlSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `chatUpdate()`

```php
chatUpdate($token, $channel, $ts, $as_user, $attachments, $blocks, $link_names, $parse, $text): \OpenAPI\Client\Model\ChatUpdateSuccessSchema
```



Updates a message.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `chat:write`
$channel = 'channel_example'; // string | Channel containing the message to be updated.
$ts = 'ts_example'; // string | Timestamp of the message to be updated.
$as_user = 'as_user_example'; // string | Pass true to update the message as the authed user. [Bot users](/bot-users) in this context are considered authed users.
$attachments = 'attachments_example'; // string | A JSON-based array of structured attachments, presented as a URL-encoded string. This field is required when not presenting `text`. If you don't include this field, the message's previous `attachments` will be retained. To remove previous `attachments`, include an empty array for this field.
$blocks = 'blocks_example'; // string | A JSON-based array of [structured blocks](/block-kit/building), presented as a URL-encoded string. If you don't include this field, the message's previous `blocks` will be retained. To remove previous `blocks`, include an empty array for this field.
$link_names = 'link_names_example'; // string | Find and link channel names and usernames. Defaults to `none`. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, `none`.
$parse = 'parse_example'; // string | Change how messages are treated. Defaults to `client`, unlike `chat.postMessage`. Accepts either `none` or `full`. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, `client`.
$text = 'text_example'; // string | New text for the message, using the [default formatting rules](/reference/surfaces/formatting). It's not required when presenting `blocks` or `attachments`.

try {
    $result = $apiInstance->chatUpdate($token, $channel, $ts, $as_user, $attachments, $blocks, $link_names, $parse, $text);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;chat:write&#x60; | |
| **channel** | **string**| Channel containing the message to be updated. | |
| **ts** | **string**| Timestamp of the message to be updated. | |
| **as_user** | **string**| Pass true to update the message as the authed user. [Bot users](/bot-users) in this context are considered authed users. | [optional] |
| **attachments** | **string**| A JSON-based array of structured attachments, presented as a URL-encoded string. This field is required when not presenting &#x60;text&#x60;. If you don&#39;t include this field, the message&#39;s previous &#x60;attachments&#x60; will be retained. To remove previous &#x60;attachments&#x60;, include an empty array for this field. | [optional] |
| **blocks** | **string**| A JSON-based array of [structured blocks](/block-kit/building), presented as a URL-encoded string. If you don&#39;t include this field, the message&#39;s previous &#x60;blocks&#x60; will be retained. To remove previous &#x60;blocks&#x60;, include an empty array for this field. | [optional] |
| **link_names** | **string**| Find and link channel names and usernames. Defaults to &#x60;none&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;none&#x60;. | [optional] |
| **parse** | **string**| Change how messages are treated. Defaults to &#x60;client&#x60;, unlike &#x60;chat.postMessage&#x60;. Accepts either &#x60;none&#x60; or &#x60;full&#x60;. If you do not specify a value for this field, the original value set for the message will be overwritten with the default, &#x60;client&#x60;. | [optional] |
| **text** | **string**| New text for the message, using the [default formatting rules](/reference/surfaces/formatting). It&#39;s not required when presenting &#x60;blocks&#x60; or &#x60;attachments&#x60;. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ChatUpdateSuccessSchema**](../Model/ChatUpdateSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
