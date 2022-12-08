# OpenAPI\Client\ConversationsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**conversationsArchive()**](ConversationsApi.md#conversationsArchive) | **POST** /conversations.archive |  |
| [**conversationsClose()**](ConversationsApi.md#conversationsClose) | **POST** /conversations.close |  |
| [**conversationsCreate()**](ConversationsApi.md#conversationsCreate) | **POST** /conversations.create |  |
| [**conversationsHistory()**](ConversationsApi.md#conversationsHistory) | **GET** /conversations.history |  |
| [**conversationsInfo()**](ConversationsApi.md#conversationsInfo) | **GET** /conversations.info |  |
| [**conversationsInvite()**](ConversationsApi.md#conversationsInvite) | **POST** /conversations.invite |  |
| [**conversationsJoin()**](ConversationsApi.md#conversationsJoin) | **POST** /conversations.join |  |
| [**conversationsKick()**](ConversationsApi.md#conversationsKick) | **POST** /conversations.kick |  |
| [**conversationsLeave()**](ConversationsApi.md#conversationsLeave) | **POST** /conversations.leave |  |
| [**conversationsList()**](ConversationsApi.md#conversationsList) | **GET** /conversations.list |  |
| [**conversationsMark()**](ConversationsApi.md#conversationsMark) | **POST** /conversations.mark |  |
| [**conversationsMembers()**](ConversationsApi.md#conversationsMembers) | **GET** /conversations.members |  |
| [**conversationsOpen()**](ConversationsApi.md#conversationsOpen) | **POST** /conversations.open |  |
| [**conversationsRename()**](ConversationsApi.md#conversationsRename) | **POST** /conversations.rename |  |
| [**conversationsReplies()**](ConversationsApi.md#conversationsReplies) | **GET** /conversations.replies |  |
| [**conversationsSetPurpose()**](ConversationsApi.md#conversationsSetPurpose) | **POST** /conversations.setPurpose |  |
| [**conversationsSetTopic()**](ConversationsApi.md#conversationsSetTopic) | **POST** /conversations.setTopic |  |
| [**conversationsUnarchive()**](ConversationsApi.md#conversationsUnarchive) | **POST** /conversations.unarchive |  |


## `conversationsArchive()`

```php
conversationsArchive($token, $channel): \OpenAPI\Client\Model\ConversationsArchiveSuccessSchema
```



Archives a conversation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:write`
$channel = 'channel_example'; // string | ID of conversation to archive

try {
    $result = $apiInstance->conversationsArchive($token, $channel);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsArchive: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **string**| ID of conversation to archive | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsArchiveSuccessSchema**](../Model/ConversationsArchiveSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsClose()`

```php
conversationsClose($token, $channel): \OpenAPI\Client\Model\ConversationsCloseSuccessSchema
```



Closes a direct message or multi-person direct message.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:write`
$channel = 'channel_example'; // string | Conversation to close.

try {
    $result = $apiInstance->conversationsClose($token, $channel);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsClose: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **string**| Conversation to close. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsCloseSuccessSchema**](../Model/ConversationsCloseSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsCreate()`

```php
conversationsCreate($token, $is_private, $name): \OpenAPI\Client\Model\ConversationsCreateSuccessSchema
```



Initiates a public or private channel-based conversation

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:write`
$is_private = True; // bool | Create a private channel instead of a public one
$name = 'name_example'; // string | Name of the public or private channel to create

try {
    $result = $apiInstance->conversationsCreate($token, $is_private, $name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **is_private** | **bool**| Create a private channel instead of a public one | [optional] |
| **name** | **string**| Name of the public or private channel to create | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsCreateSuccessSchema**](../Model/ConversationsCreateSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsHistory()`

```php
conversationsHistory($token, $channel, $latest, $oldest, $inclusive, $limit, $cursor): \OpenAPI\Client\Model\ConversationsHistorySuccessSchema
```



Fetches a conversation's history of messages and events.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:history`
$channel = 'channel_example'; // string | Conversation ID to fetch history for.
$latest = 3.4; // float | End of time range of messages to include in results.
$oldest = 3.4; // float | Start of time range of messages to include in results.
$inclusive = True; // bool | Include messages with latest or oldest timestamp in results only when either timestamp is specified.
$limit = 56; // int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
$cursor = 'cursor_example'; // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.

try {
    $result = $apiInstance->conversationsHistory($token, $channel, $latest, $oldest, $inclusive, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsHistory: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:history&#x60; | [optional] |
| **channel** | **string**| Conversation ID to fetch history for. | [optional] |
| **latest** | **float**| End of time range of messages to include in results. | [optional] |
| **oldest** | **float**| Start of time range of messages to include in results. | [optional] |
| **inclusive** | **bool**| Include messages with latest or oldest timestamp in results only when either timestamp is specified. | [optional] |
| **limit** | **int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | [optional] |
| **cursor** | **string**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsHistorySuccessSchema**](../Model/ConversationsHistorySuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsInfo()`

```php
conversationsInfo($token, $channel, $include_locale, $include_num_members): \OpenAPI\Client\Model\ConversationsInfoSuccessSchema
```



Retrieve information about a conversation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:read`
$channel = 'channel_example'; // string | Conversation ID to learn more about
$include_locale = True; // bool | Set this to `true` to receive the locale for this conversation. Defaults to `false`
$include_num_members = True; // bool | Set to `true` to include the member count for the specified conversation. Defaults to `false`

try {
    $result = $apiInstance->conversationsInfo($token, $channel, $include_locale, $include_num_members);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional] |
| **channel** | **string**| Conversation ID to learn more about | [optional] |
| **include_locale** | **bool**| Set this to &#x60;true&#x60; to receive the locale for this conversation. Defaults to &#x60;false&#x60; | [optional] |
| **include_num_members** | **bool**| Set to &#x60;true&#x60; to include the member count for the specified conversation. Defaults to &#x60;false&#x60; | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsInfoSuccessSchema**](../Model/ConversationsInfoSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsInvite()`

```php
conversationsInvite($token, $channel, $users): \OpenAPI\Client\Model\ConversationsInviteErrorSchema
```



Invites users to a channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:write`
$channel = 'channel_example'; // string | The ID of the public or private channel to invite user(s) to.
$users = 'users_example'; // string | A comma separated list of user IDs. Up to 1000 users may be listed.

try {
    $result = $apiInstance->conversationsInvite($token, $channel, $users);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsInvite: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **string**| The ID of the public or private channel to invite user(s) to. | [optional] |
| **users** | **string**| A comma separated list of user IDs. Up to 1000 users may be listed. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsInviteErrorSchema**](../Model/ConversationsInviteErrorSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsJoin()`

```php
conversationsJoin($token, $channel): \OpenAPI\Client\Model\ConversationsJoinSuccessSchema
```



Joins an existing conversation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `channels:write`
$channel = 'channel_example'; // string | ID of conversation to join

try {
    $result = $apiInstance->conversationsJoin($token, $channel);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsJoin: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;channels:write&#x60; | [optional] |
| **channel** | **string**| ID of conversation to join | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsJoinSuccessSchema**](../Model/ConversationsJoinSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsKick()`

```php
conversationsKick($token, $channel, $user): \OpenAPI\Client\Model\ConversationsKickSuccessSchema
```



Removes a user from a conversation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:write`
$channel = 'channel_example'; // string | ID of conversation to remove user from.
$user = 'user_example'; // string | User ID to be removed.

try {
    $result = $apiInstance->conversationsKick($token, $channel, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsKick: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **string**| ID of conversation to remove user from. | [optional] |
| **user** | **string**| User ID to be removed. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsKickSuccessSchema**](../Model/ConversationsKickSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsLeave()`

```php
conversationsLeave($token, $channel): \OpenAPI\Client\Model\ConversationsLeaveSuccessSchema
```



Leaves a conversation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:write`
$channel = 'channel_example'; // string | Conversation to leave

try {
    $result = $apiInstance->conversationsLeave($token, $channel);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsLeave: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **string**| Conversation to leave | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsLeaveSuccessSchema**](../Model/ConversationsLeaveSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsList()`

```php
conversationsList($token, $exclude_archived, $types, $limit, $cursor): \OpenAPI\Client\Model\ConversationsListSuccessSchema
```



Lists all channels in a Slack team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:read`
$exclude_archived = True; // bool | Set to `true` to exclude archived channels from the list
$types = 'types_example'; // string | Mix and match channel types by providing a comma-separated list of any combination of `public_channel`, `private_channel`, `mpim`, `im`
$limit = 56; // int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. Must be an integer no larger than 1000.
$cursor = 'cursor_example'; // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.

try {
    $result = $apiInstance->conversationsList($token, $exclude_archived, $types, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional] |
| **exclude_archived** | **bool**| Set to &#x60;true&#x60; to exclude archived channels from the list | [optional] |
| **types** | **string**| Mix and match channel types by providing a comma-separated list of any combination of &#x60;public_channel&#x60;, &#x60;private_channel&#x60;, &#x60;mpim&#x60;, &#x60;im&#x60; | [optional] |
| **limit** | **int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn&#39;t been reached. Must be an integer no larger than 1000. | [optional] |
| **cursor** | **string**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsListSuccessSchema**](../Model/ConversationsListSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsMark()`

```php
conversationsMark($token, $channel, $ts): \OpenAPI\Client\Model\ConversationsMarkSuccessSchema
```



Sets the read cursor in a channel.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:write`
$channel = 'channel_example'; // string | Channel or conversation to set the read cursor for.
$ts = 3.4; // float | Unique identifier of message you want marked as most recently seen in this conversation.

try {
    $result = $apiInstance->conversationsMark($token, $channel, $ts);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsMark: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **string**| Channel or conversation to set the read cursor for. | [optional] |
| **ts** | **float**| Unique identifier of message you want marked as most recently seen in this conversation. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsMarkSuccessSchema**](../Model/ConversationsMarkSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsMembers()`

```php
conversationsMembers($token, $channel, $limit, $cursor): \OpenAPI\Client\Model\ConversationsMembersSuccessSchema
```



Retrieve members of a conversation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:read`
$channel = 'channel_example'; // string | ID of the conversation to retrieve members for
$limit = 56; // int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
$cursor = 'cursor_example'; // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.

try {
    $result = $apiInstance->conversationsMembers($token, $channel, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsMembers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:read&#x60; | [optional] |
| **channel** | **string**| ID of the conversation to retrieve members for | [optional] |
| **limit** | **int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | [optional] |
| **cursor** | **string**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsMembersSuccessSchema**](../Model/ConversationsMembersSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsOpen()`

```php
conversationsOpen($token, $channel, $return_im, $users): \OpenAPI\Client\Model\ConversationsOpenSuccessSchema
```



Opens or resumes a direct message or multi-person direct message.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:write`
$channel = 'channel_example'; // string | Resume a conversation by supplying an `im` or `mpim`'s ID. Or provide the `users` field instead.
$return_im = True; // bool | Boolean, indicates you want the full IM channel definition in the response.
$users = 'users_example'; // string | Comma separated lists of users. If only one user is included, this creates a 1:1 DM.  The ordering of the users is preserved whenever a multi-person direct message is returned. Supply a `channel` when not supplying `users`.

try {
    $result = $apiInstance->conversationsOpen($token, $channel, $return_im, $users);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsOpen: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **string**| Resume a conversation by supplying an &#x60;im&#x60; or &#x60;mpim&#x60;&#39;s ID. Or provide the &#x60;users&#x60; field instead. | [optional] |
| **return_im** | **bool**| Boolean, indicates you want the full IM channel definition in the response. | [optional] |
| **users** | **string**| Comma separated lists of users. If only one user is included, this creates a 1:1 DM.  The ordering of the users is preserved whenever a multi-person direct message is returned. Supply a &#x60;channel&#x60; when not supplying &#x60;users&#x60;. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsOpenSuccessSchema**](../Model/ConversationsOpenSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsRename()`

```php
conversationsRename($token, $channel, $name): \OpenAPI\Client\Model\ConversationsRenameSuccessSchema
```



Renames a conversation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:write`
$channel = 'channel_example'; // string | ID of conversation to rename
$name = 'name_example'; // string | New name for conversation.

try {
    $result = $apiInstance->conversationsRename($token, $channel, $name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsRename: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **string**| ID of conversation to rename | [optional] |
| **name** | **string**| New name for conversation. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsRenameSuccessSchema**](../Model/ConversationsRenameSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsReplies()`

```php
conversationsReplies($token, $channel, $ts, $latest, $oldest, $inclusive, $limit, $cursor): \OpenAPI\Client\Model\ConversationsRepliesSuccessSchema
```



Retrieve a thread of messages posted to a conversation

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:history`
$channel = 'channel_example'; // string | Conversation ID to fetch thread from.
$ts = 3.4; // float | Unique identifier of a thread's parent message. `ts` must be the timestamp of an existing message with 0 or more replies. If there are no replies then just the single message referenced by `ts` will return - it is just an ordinary, unthreaded message.
$latest = 3.4; // float | End of time range of messages to include in results.
$oldest = 3.4; // float | Start of time range of messages to include in results.
$inclusive = True; // bool | Include messages with latest or oldest timestamp in results only when either timestamp is specified.
$limit = 56; // int | The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached.
$cursor = 'cursor_example'; // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.

try {
    $result = $apiInstance->conversationsReplies($token, $channel, $ts, $latest, $oldest, $inclusive, $limit, $cursor);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsReplies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:history&#x60; | [optional] |
| **channel** | **string**| Conversation ID to fetch thread from. | [optional] |
| **ts** | **float**| Unique identifier of a thread&#39;s parent message. &#x60;ts&#x60; must be the timestamp of an existing message with 0 or more replies. If there are no replies then just the single message referenced by &#x60;ts&#x60; will return - it is just an ordinary, unthreaded message. | [optional] |
| **latest** | **float**| End of time range of messages to include in results. | [optional] |
| **oldest** | **float**| Start of time range of messages to include in results. | [optional] |
| **inclusive** | **bool**| Include messages with latest or oldest timestamp in results only when either timestamp is specified. | [optional] |
| **limit** | **int**| The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn&#39;t been reached. | [optional] |
| **cursor** | **string**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsRepliesSuccessSchema**](../Model/ConversationsRepliesSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsSetPurpose()`

```php
conversationsSetPurpose($token, $channel, $purpose): \OpenAPI\Client\Model\ConversationsSetPurposeSuccessSchema
```



Sets the purpose for a conversation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:write`
$channel = 'channel_example'; // string | Conversation to set the purpose of
$purpose = 'purpose_example'; // string | A new, specialer purpose

try {
    $result = $apiInstance->conversationsSetPurpose($token, $channel, $purpose);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsSetPurpose: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **string**| Conversation to set the purpose of | [optional] |
| **purpose** | **string**| A new, specialer purpose | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsSetPurposeSuccessSchema**](../Model/ConversationsSetPurposeSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsSetTopic()`

```php
conversationsSetTopic($token, $channel, $topic): \OpenAPI\Client\Model\ConversationsSetTopicSuccessSchema
```



Sets the topic for a conversation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:write`
$channel = 'channel_example'; // string | Conversation to set the topic of
$topic = 'topic_example'; // string | The new topic string. Does not support formatting or linkification.

try {
    $result = $apiInstance->conversationsSetTopic($token, $channel, $topic);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsSetTopic: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **string**| Conversation to set the topic of | [optional] |
| **topic** | **string**| The new topic string. Does not support formatting or linkification. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsSetTopicSuccessSchema**](../Model/ConversationsSetTopicSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversationsUnarchive()`

```php
conversationsUnarchive($token, $channel): \OpenAPI\Client\Model\ConversationsUnarchiveSuccessSchema
```



Reverses conversation archival.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `conversations:write`
$channel = 'channel_example'; // string | ID of conversation to unarchive

try {
    $result = $apiInstance->conversationsUnarchive($token, $channel);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversationsApi->conversationsUnarchive: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;conversations:write&#x60; | [optional] |
| **channel** | **string**| ID of conversation to unarchive | [optional] |

### Return type

[**\OpenAPI\Client\Model\ConversationsUnarchiveSuccessSchema**](../Model/ConversationsUnarchiveSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
