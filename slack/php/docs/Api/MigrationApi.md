# OpenAPI\Client\MigrationApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**migrationExchange()**](MigrationApi.md#migrationExchange) | **GET** /migration.exchange |  |


## `migrationExchange()`

```php
migrationExchange($token, $users, $team_id, $to_old): \OpenAPI\Client\Model\MigrationExchangeSuccessSchema
```



For Enterprise Grid workspaces, map local user IDs to global user IDs

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: slackAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\MigrationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$token = 'token_example'; // string | Authentication token. Requires scope: `tokens.basic`
$users = 'users_example'; // string | A comma-separated list of user ids, up to 400 per request
$team_id = 'team_id_example'; // string | Specify team_id starts with `T` in case of Org Token
$to_old = True; // bool | Specify `true` to convert `W` global user IDs to workspace-specific `U` IDs. Defaults to `false`.

try {
    $result = $apiInstance->migrationExchange($token, $users, $team_id, $to_old);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MigrationApi->migrationExchange: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **token** | **string**| Authentication token. Requires scope: &#x60;tokens.basic&#x60; | |
| **users** | **string**| A comma-separated list of user ids, up to 400 per request | |
| **team_id** | **string**| Specify team_id starts with &#x60;T&#x60; in case of Org Token | [optional] |
| **to_old** | **bool**| Specify &#x60;true&#x60; to convert &#x60;W&#x60; global user IDs to workspace-specific &#x60;U&#x60; IDs. Defaults to &#x60;false&#x60;. | [optional] |

### Return type

[**\OpenAPI\Client\Model\MigrationExchangeSuccessSchema**](../Model/MigrationExchangeSuccessSchema.md)

### Authorization

[slackAuth](../../README.md#slackAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
