# OpenAPI\Client\CallsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**callsAdd()**](CallsApi.md#callsAdd) | **POST** /calls.add |  |
| [**callsEnd()**](CallsApi.md#callsEnd) | **POST** /calls.end |  |
| [**callsInfo()**](CallsApi.md#callsInfo) | **GET** /calls.info |  |
| [**callsParticipantsAdd()**](CallsApi.md#callsParticipantsAdd) | **POST** /calls.participants.add |  |
| [**callsParticipantsRemove()**](CallsApi.md#callsParticipantsRemove) | **POST** /calls.participants.remove |  |
| [**callsUpdate()**](CallsApi.md#callsUpdate) | **POST** /calls.update |  |


## `callsAdd()`

```php
callsAdd($token, $external_unique_id, $join_url, $created_by, $date_start, $desktop_app_join_url, $external_display_id, $title, $users): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Registers a new Call.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CallsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `calls:write`
$external_unique_id = 'external_unique_id_example'; // string | An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service.
$join_url = 'join_url_example'; // string | The URL required for a client to join the Call.
$created_by = 'created_by_example'; // string | The valid Slack user ID of the user who created this Call. When this method is called with a user token, the `created_by` field is optional and defaults to the authed user of the token. Otherwise, the field is required.
$date_start = 56; // int | Call start time in UTC UNIX timestamp format
$desktop_app_join_url = 'desktop_app_join_url_example'; // string | When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL.
$external_display_id = 'external_display_id_example'; // string | An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object.
$title = 'title_example'; // string | The name of the Call.
$users = 'users_example'; // string | The list of users to register as participants in the Call. [Read more on how to specify users here](/apis/calls#users).

try {
    $result = $apiInstance->callsAdd($token, $external_unique_id, $join_url, $created_by, $date_start, $desktop_app_join_url, $external_display_id, $title, $users);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallsApi->callsAdd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;calls:write&#x60; | |
| **external_unique_id** | **string**| An ID supplied by the 3rd-party Call provider. It must be unique across all Calls from that service. | |
| **join_url** | **string**| The URL required for a client to join the Call. | |
| **created_by** | **string**| The valid Slack user ID of the user who created this Call. When this method is called with a user token, the &#x60;created_by&#x60; field is optional and defaults to the authed user of the token. Otherwise, the field is required. | [optional] |
| **date_start** | **int**| Call start time in UTC UNIX timestamp format | [optional] |
| **desktop_app_join_url** | **string**| When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. | [optional] |
| **external_display_id** | **string**| An optional, human-readable ID supplied by the 3rd-party Call provider. If supplied, this ID will be displayed in the Call object. | [optional] |
| **title** | **string**| The name of the Call. | [optional] |
| **users** | **string**| The list of users to register as participants in the Call. [Read more on how to specify users here](/apis/calls#users). | [optional] |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `callsEnd()`

```php
callsEnd($token, $id, $duration): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Ends a Call.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CallsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `calls:write`
$id = 'id_example'; // string | `id` returned when registering the call using the [`calls.add`](/methods/calls.add) method.
$duration = 56; // int | Call duration in seconds

try {
    $result = $apiInstance->callsEnd($token, $id, $duration);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallsApi->callsEnd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;calls:write&#x60; | |
| **id** | **string**| &#x60;id&#x60; returned when registering the call using the [&#x60;calls.add&#x60;](/methods/calls.add) method. | |
| **duration** | **int**| Call duration in seconds | [optional] |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `callsInfo()`

```php
callsInfo($token, $id): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Returns information about a Call.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CallsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `calls:read`
$id = 'id_example'; // string | `id` of the Call returned by the [`calls.add`](/methods/calls.add) method.

try {
    $result = $apiInstance->callsInfo($token, $id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallsApi->callsInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;calls:read&#x60; | |
| **id** | **string**| &#x60;id&#x60; of the Call returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. | |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `callsParticipantsAdd()`

```php
callsParticipantsAdd($token, $id, $users): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Registers new participants added to a Call.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CallsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `calls:write`
$id = 'id_example'; // string | `id` returned by the [`calls.add`](/methods/calls.add) method.
$users = 'users_example'; // string | The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users).

try {
    $result = $apiInstance->callsParticipantsAdd($token, $id, $users);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallsApi->callsParticipantsAdd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;calls:write&#x60; | |
| **id** | **string**| &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. | |
| **users** | **string**| The list of users to add as participants in the Call. [Read more on how to specify users here](/apis/calls#users). | |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `callsParticipantsRemove()`

```php
callsParticipantsRemove($token, $id, $users): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Registers participants removed from a Call.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CallsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `calls:write`
$id = 'id_example'; // string | `id` returned by the [`calls.add`](/methods/calls.add) method.
$users = 'users_example'; // string | The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users).

try {
    $result = $apiInstance->callsParticipantsRemove($token, $id, $users);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallsApi->callsParticipantsRemove: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;calls:write&#x60; | |
| **id** | **string**| &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. | |
| **users** | **string**| The list of users to remove as participants in the Call. [Read more on how to specify users here](/apis/calls#users). | |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `callsUpdate()`

```php
callsUpdate($token, $id, $desktop_app_join_url, $join_url, $title): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Updates information about a Call.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CallsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `calls:write`
$id = 'id_example'; // string | `id` returned by the [`calls.add`](/methods/calls.add) method.
$desktop_app_join_url = 'desktop_app_join_url_example'; // string | When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL.
$join_url = 'join_url_example'; // string | The URL required for a client to join the Call.
$title = 'title_example'; // string | The name of the Call.

try {
    $result = $apiInstance->callsUpdate($token, $id, $desktop_app_join_url, $join_url, $title);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CallsApi->callsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;calls:write&#x60; | |
| **id** | **string**| &#x60;id&#x60; returned by the [&#x60;calls.add&#x60;](/methods/calls.add) method. | |
| **desktop_app_join_url** | **string**| When supplied, available Slack clients will attempt to directly launch the 3rd-party Call with this URL. | [optional] |
| **join_url** | **string**| The URL required for a client to join the Call. | [optional] |
| **title** | **string**| The name of the Call. | [optional] |

### Return type

[**\OpenAPI\Client\Model\DefaultSuccessTemplate**](../Model/DefaultSuccessTemplate.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
