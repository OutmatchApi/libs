# OpenAPI\Client\ViewsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**viewsOpen()**](ViewsApi.md#viewsOpen) | **GET** /views.open |  |
| [**viewsPublish()**](ViewsApi.md#viewsPublish) | **GET** /views.publish |  |
| [**viewsPush()**](ViewsApi.md#viewsPush) | **GET** /views.push |  |
| [**viewsUpdate()**](ViewsApi.md#viewsUpdate) | **GET** /views.update |  |


## `viewsOpen()`

```php
viewsOpen($token, $trigger_id, $view): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Open a view for a user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ViewsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$trigger_id = 'trigger_id_example'; // string | Exchange a trigger to post to the user.
$view = 'view_example'; // string | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.

try {
    $result = $apiInstance->viewsOpen($token, $trigger_id, $view);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ViewsApi->viewsOpen: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **trigger_id** | **string**| Exchange a trigger to post to the user. | |
| **view** | **string**| A [view payload](/reference/surfaces/views). This must be a JSON-encoded string. | |

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

## `viewsPublish()`

```php
viewsPublish($token, $user_id, $view, $hash): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Publish a static view for a User.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ViewsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$user_id = 'user_id_example'; // string | `id` of the user you want publish a view to.
$view = 'view_example'; // string | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.
$hash = 'hash_example'; // string | A string that represents view state to protect against possible race conditions.

try {
    $result = $apiInstance->viewsPublish($token, $user_id, $view, $hash);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ViewsApi->viewsPublish: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **user_id** | **string**| &#x60;id&#x60; of the user you want publish a view to. | |
| **view** | **string**| A [view payload](/reference/surfaces/views). This must be a JSON-encoded string. | |
| **hash** | **string**| A string that represents view state to protect against possible race conditions. | [optional] |

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

## `viewsPush()`

```php
viewsPush($token, $trigger_id, $view): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Push a view onto the stack of a root view.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ViewsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$trigger_id = 'trigger_id_example'; // string | Exchange a trigger to post to the user.
$view = 'view_example'; // string | A [view payload](/reference/surfaces/views). This must be a JSON-encoded string.

try {
    $result = $apiInstance->viewsPush($token, $trigger_id, $view);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ViewsApi->viewsPush: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **trigger_id** | **string**| Exchange a trigger to post to the user. | |
| **view** | **string**| A [view payload](/reference/surfaces/views). This must be a JSON-encoded string. | |

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

## `viewsUpdate()`

```php
viewsUpdate($token, $view_id, $external_id, $view, $hash): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Update an existing view.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ViewsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$view_id = 'view_id_example'; // string | A unique identifier of the view to be updated. Either `view_id` or `external_id` is required.
$external_id = 'external_id_example'; // string | A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either `view_id` or `external_id` is required.
$view = 'view_example'; // string | A [view object](/reference/surfaces/views). This must be a JSON-encoded string.
$hash = 'hash_example'; // string | A string that represents view state to protect against possible race conditions.

try {
    $result = $apiInstance->viewsUpdate($token, $view_id, $external_id, $view, $hash);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ViewsApi->viewsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **view_id** | **string**| A unique identifier of the view to be updated. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. | [optional] |
| **external_id** | **string**| A unique identifier of the view set by the developer. Must be unique for all views on a team. Max length of 255 characters. Either &#x60;view_id&#x60; or &#x60;external_id&#x60; is required. | [optional] |
| **view** | **string**| A [view object](/reference/surfaces/views). This must be a JSON-encoded string. | [optional] |
| **hash** | **string**| A string that represents view state to protect against possible race conditions. | [optional] |

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
