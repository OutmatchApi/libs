# OpenAPI\Client\AppsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**appsEventAuthorizationsList()**](AppsApi.md#appsEventAuthorizationsList) | **GET** /apps.event.authorizations.list |  |
| [**appsPermissionsInfo()**](AppsApi.md#appsPermissionsInfo) | **GET** /apps.permissions.info |  |
| [**appsPermissionsRequest()**](AppsApi.md#appsPermissionsRequest) | **GET** /apps.permissions.request |  |
| [**appsPermissionsResourcesList()**](AppsApi.md#appsPermissionsResourcesList) | **GET** /apps.permissions.resources.list |  |
| [**appsPermissionsScopesList()**](AppsApi.md#appsPermissionsScopesList) | **GET** /apps.permissions.scopes.list |  |
| [**appsPermissionsUsersList()**](AppsApi.md#appsPermissionsUsersList) | **GET** /apps.permissions.users.list |  |
| [**appsPermissionsUsersRequest()**](AppsApi.md#appsPermissionsUsersRequest) | **GET** /apps.permissions.users.request |  |
| [**appsUninstall()**](AppsApi.md#appsUninstall) | **GET** /apps.uninstall |  |


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


$apiInstance = new OpenAPI\Client\Api\AppsApi(
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
    echo 'Exception when calling AppsApi->appsEventAuthorizationsList: ', $e->getMessage(), PHP_EOL;
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

## `appsPermissionsInfo()`

```php
appsPermissionsInfo($token): \OpenAPI\Client\Model\AppsPermissionsInfoSchema
```



Returns list of permissions this app has on a team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AppsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`

try {
    $result = $apiInstance->appsPermissionsInfo($token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppsApi->appsPermissionsInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | [optional] |

### Return type

[**\OpenAPI\Client\Model\AppsPermissionsInfoSchema**](../Model/AppsPermissionsInfoSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `appsPermissionsRequest()`

```php
appsPermissionsRequest($token, $scopes, $trigger_id): \OpenAPI\Client\Model\AppsPermissionsRequestSchema
```



Allows an app to request additional scopes

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AppsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$scopes = 'scopes_example'; // string | A comma separated list of scopes to request for
$trigger_id = 'trigger_id_example'; // string | Token used to trigger the permissions API

try {
    $result = $apiInstance->appsPermissionsRequest($token, $scopes, $trigger_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppsApi->appsPermissionsRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **scopes** | **string**| A comma separated list of scopes to request for | |
| **trigger_id** | **string**| Token used to trigger the permissions API | |

### Return type

[**\OpenAPI\Client\Model\AppsPermissionsRequestSchema**](../Model/AppsPermissionsRequestSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `appsPermissionsResourcesList()`

```php
appsPermissionsResourcesList($token, $cursor, $limit): \OpenAPI\Client\Model\AppsPermissionsResourcesListSuccessSchema
```



Returns list of resource grants this app has on a team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AppsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$cursor = 'cursor_example'; // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
$limit = 56; // int | The maximum number of items to return.

try {
    $result = $apiInstance->appsPermissionsResourcesList($token, $cursor, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppsApi->appsPermissionsResourcesList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **cursor** | **string**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |
| **limit** | **int**| The maximum number of items to return. | [optional] |

### Return type

[**\OpenAPI\Client\Model\AppsPermissionsResourcesListSuccessSchema**](../Model/AppsPermissionsResourcesListSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `appsPermissionsScopesList()`

```php
appsPermissionsScopesList($token): \OpenAPI\Client\Model\ApiPermissionsScopesListSuccessSchema
```



Returns list of scopes this app has on a team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AppsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`

try {
    $result = $apiInstance->appsPermissionsScopesList($token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppsApi->appsPermissionsScopesList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | |

### Return type

[**\OpenAPI\Client\Model\ApiPermissionsScopesListSuccessSchema**](../Model/ApiPermissionsScopesListSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `appsPermissionsUsersList()`

```php
appsPermissionsUsersList($token, $cursor, $limit): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Returns list of user grants and corresponding scopes this app has on a team.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AppsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$cursor = 'cursor_example'; // string | Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
$limit = 56; // int | The maximum number of items to return.

try {
    $result = $apiInstance->appsPermissionsUsersList($token, $cursor, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppsApi->appsPermissionsUsersList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **cursor** | **string**| Paginate through collections of data by setting the &#x60;cursor&#x60; parameter to a &#x60;next_cursor&#x60; attribute returned by a previous request&#39;s &#x60;response_metadata&#x60;. Default value fetches the first \&quot;page\&quot; of the collection. See [pagination](/docs/pagination) for more detail. | [optional] |
| **limit** | **int**| The maximum number of items to return. | [optional] |

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

## `appsPermissionsUsersRequest()`

```php
appsPermissionsUsersRequest($token, $scopes, $trigger_id, $user): \OpenAPI\Client\Model\DefaultSuccessTemplate
```



Enables an app to trigger a permissions modal to grant an app access to a user access scope.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AppsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$scopes = 'scopes_example'; // string | A comma separated list of user scopes to request for
$trigger_id = 'trigger_id_example'; // string | Token used to trigger the request
$user = 'user_example'; // string | The user this scope is being requested for

try {
    $result = $apiInstance->appsPermissionsUsersRequest($token, $scopes, $trigger_id, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppsApi->appsPermissionsUsersRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | |
| **scopes** | **string**| A comma separated list of user scopes to request for | |
| **trigger_id** | **string**| Token used to trigger the request | |
| **user** | **string**| The user this scope is being requested for | |

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

## `appsUninstall()`

```php
appsUninstall($token, $client_id, $client_secret): \OpenAPI\Client\Model\AppsUninstallSchema
```



Uninstalls your app from a workspace.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AppsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `none`
$client_id = 'client_id_example'; // string | Issued when you created your application.
$client_secret = 'client_secret_example'; // string | Issued when you created your application.

try {
    $result = $apiInstance->appsUninstall($token, $client_id, $client_secret);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AppsApi->appsUninstall: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;none&#x60; | [optional] |
| **client_id** | **string**| Issued when you created your application. | [optional] |
| **client_secret** | **string**| Issued when you created your application. | [optional] |

### Return type

[**\OpenAPI\Client\Model\AppsUninstallSchema**](../Model/AppsUninstallSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
