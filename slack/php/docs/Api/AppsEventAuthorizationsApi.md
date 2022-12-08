# OpenAPI\Client\AppsEventAuthorizationsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**appsEventAuthorizationsList()**](AppsEventAuthorizationsApi.md#appsEventAuthorizationsList) | **GET** /apps.event.authorizations.list |  |


## `appsEventAuthorizationsList()`

```php
appsEventAuthorizationsList($token, $event_context, $cursor, $limit): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Get a list of authorizations for the given event context. Each authorization represents an app installation that the event is visible to.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AppsEventAuthorizationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `authorizations:read`
$event_context = 'event_context_example'; // string
$cursor = 'cursor_example'; // string
$limit = 56; // int

try {
    $result = $apiInstance->appsEventAuthorizationsList($token, $event_context, $cursor, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppsEventAuthorizationsApi->appsEventAuthorizationsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;authorizations:read&#x60; | |
| **event_context** | **string**|  | |
| **cursor** | **string**|  | [optional] |
| **limit** | **int**|  | [optional] |

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
