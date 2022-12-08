# OpenAPI\Client\AppsPermissionsUsersApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**appsPermissionsUsersList()**](AppsPermissionsUsersApi.md#appsPermissionsUsersList) | **GET** /apps.permissions.users.list |  |
| [**appsPermissionsUsersRequest()**](AppsPermissionsUsersApi.md#appsPermissionsUsersRequest) | **GET** /apps.permissions.users.request |  |


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


$apiInstance = new OpenAPI\Client\Api\AppsPermissionsUsersApi(
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
    echo 'Exception when calling AppsPermissionsUsersApi->appsPermissionsUsersList: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\AppsPermissionsUsersApi(
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
    echo 'Exception when calling AppsPermissionsUsersApi->appsPermissionsUsersRequest: ', $e->getMessage(), PHP_EOL;
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
