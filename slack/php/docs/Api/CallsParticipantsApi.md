# OpenAPI\Client\CallsParticipantsApi

All URIs are relative to https://slack.com/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**callsParticipantsAdd()**](CallsParticipantsApi.md#callsParticipantsAdd) | **POST** /calls.participants.add |  |
| [**callsParticipantsRemove()**](CallsParticipantsApi.md#callsParticipantsRemove) | **POST** /calls.participants.remove |  |


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


$apiInstance = new OpenAPI\Client\Api\CallsParticipantsApi(
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
    echo 'Exception when calling CallsParticipantsApi->callsParticipantsAdd: ', $e->getMessage(), PHP_EOL;
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


$apiInstance = new OpenAPI\Client\Api\CallsParticipantsApi(
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
    echo 'Exception when calling CallsParticipantsApi->callsParticipantsRemove: ', $e->getMessage(), PHP_EOL;
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
