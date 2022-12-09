# OpenAPI\Client\PlayersApi

All URIs are relative to https://ws.api.video, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**dELETEPlayersPlayerId()**](PlayersApi.md#dELETEPlayersPlayerId) | **DELETE** /players/{playerId} | Delete a player |
| [**dELETEPlayersPlayerIdLogo()**](PlayersApi.md#dELETEPlayersPlayerIdLogo) | **DELETE** /players/{playerId}/logo | Delete logo |
| [**gETPlayers()**](PlayersApi.md#gETPlayers) | **GET** /players | List all players |
| [**gETPlayersPlayerId()**](PlayersApi.md#gETPlayersPlayerId) | **GET** /players/{playerId} | Show a player |
| [**pATCHPlayersPlayerId()**](PlayersApi.md#pATCHPlayersPlayerId) | **PATCH** /players/{playerId} | Update a player |
| [**pOSTPlayers()**](PlayersApi.md#pOSTPlayers) | **POST** /players | Create a player |
| [**pOSTPlayersPlayerIdLogo()**](PlayersApi.md#pOSTPlayersPlayerIdLogo) | **POST** /players/{playerId}/logo | Upload a logo |


## `dELETEPlayersPlayerId()`

```php
dELETEPlayersPlayerId($player_id)
```

Delete a player

Delete a player if you no longer need it. You can delete any player that you have the player ID for.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PlayersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$player_id = pl45d5vFFGrfdsdsd156dGhh; // string | The unique identifier for the player you want to delete.

try {
    $apiInstance->dELETEPlayersPlayerId($player_id);
} catch (Exception $e) {
    echo 'Exception when calling PlayersApi->dELETEPlayersPlayerId: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **player_id** | **string**| The unique identifier for the player you want to delete. | |

### Return type

void (empty response body)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `dELETEPlayersPlayerIdLogo()`

```php
dELETEPlayersPlayerIdLogo($player_id): object
```

Delete logo

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PlayersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$player_id = pl14Db6oMJRH6SRVoOwORacK; // string | The unique identifier for the player.

try {
    $result = $apiInstance->dELETEPlayersPlayerIdLogo($player_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PlayersApi->dELETEPlayersPlayerIdLogo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **player_id** | **string**| The unique identifier for the player. | |

### Return type

**object**

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gETPlayers()`

```php
gETPlayers($sort_by, $sort_order, $current_page, $page_size): \OpenAPI\Client\Model\PlayersListResponse
```

List all players

Retrieve a list of all the players you created, as well as details about each one. Tutorials that use the [player endpoint](https://api.video/blog/endpoints/player).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PlayersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

$associative_array = [
    'sort_by' => createdAt, // string | createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format.
    'sort_order' => asc, // string | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones.
    'current_page' => 2, // int | Choose the number of search results to return per page. Minimum value: 1
    'page_size' => 30, // int | Results per page. Allowed values 1-100, default is 25.
];

try {
    $result = $apiInstance->gETPlayers($associate_array);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PlayersApi->gETPlayers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Note: the input parameter is an associative array with the keys listed as the parameter names below.

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort_by** | **string**| createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format. | [optional] |
| **sort_order** | **string**| Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. | [optional] |
| **current_page** | **int**| Choose the number of search results to return per page. Minimum value: 1 | [optional] [default to 1] |
| **page_size** | **int**| Results per page. Allowed values 1-100, default is 25. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\PlayersListResponse**](../Model/PlayersListResponse.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `gETPlayersPlayerId()`

```php
gETPlayersPlayerId($player_id): \OpenAPI\Client\Model\Player
```

Show a player

Use a player ID to retrieve details about the player and display it for viewers.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PlayersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$player_id = pl45d5vFFGrfdsdsd156dGhh; // string | The unique identifier for the player you want to retrieve.

try {
    $result = $apiInstance->gETPlayersPlayerId($player_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PlayersApi->gETPlayersPlayerId: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **player_id** | **string**| The unique identifier for the player you want to retrieve. | |

### Return type

[**\OpenAPI\Client\Model\Player**](../Model/Player.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pATCHPlayersPlayerId()`

```php
pATCHPlayersPlayerId($player_id, $player_update_payload): \OpenAPI\Client\Model\Player
```

Update a player

Use a player ID to update specific details for a player. NOTE: It may take up to 10 min before the new player configuration is available from our CDN.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PlayersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$player_id = pl45d5vFFGrfdsdsd156dGhh; // string | The unique identifier for the player.
$player_update_payload = new \OpenAPI\Client\Model\PlayerUpdatePayload(); // \OpenAPI\Client\Model\PlayerUpdatePayload

try {
    $result = $apiInstance->pATCHPlayersPlayerId($player_id, $player_update_payload);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PlayersApi->pATCHPlayersPlayerId: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **player_id** | **string**| The unique identifier for the player. | |
| **player_update_payload** | [**\OpenAPI\Client\Model\PlayerUpdatePayload**](../Model/PlayerUpdatePayload.md)|  | |

### Return type

[**\OpenAPI\Client\Model\Player**](../Model/Player.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pOSTPlayers()`

```php
pOSTPlayers($player_creation_payload): \OpenAPI\Client\Model\Player
```

Create a player

Create a player for your video, and customise it.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PlayersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$player_creation_payload = new \OpenAPI\Client\Model\PlayerCreationPayload(); // \OpenAPI\Client\Model\PlayerCreationPayload

try {
    $result = $apiInstance->pOSTPlayers($player_creation_payload);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PlayersApi->pOSTPlayers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **player_creation_payload** | [**\OpenAPI\Client\Model\PlayerCreationPayload**](../Model/PlayerCreationPayload.md)|  | |

### Return type

[**\OpenAPI\Client\Model\Player**](../Model/Player.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pOSTPlayersPlayerIdLogo()`

```php
pOSTPlayersPlayerIdLogo($player_id, $file, $link): \OpenAPI\Client\Model\Player
```

Upload a logo

The uploaded image maximum size should be 200x100 and its weight should be 200KB.  It will be scaled down to 30px height and converted to PNG to be displayed in the player.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PlayersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$player_id = pl14Db6oMJRH6SRVoOwORacK; // string | The unique identifier for the player.
$file = "/path/to/file.txt"; // \SplFileObject | The name of the file you want to use for your logo.
$link = 'link_example'; // string | The path to the file you want to upload and use as a logo.

try {
    $result = $apiInstance->pOSTPlayersPlayerIdLogo($player_id, $file, $link);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PlayersApi->pOSTPlayersPlayerIdLogo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **player_id** | **string**| The unique identifier for the player. | |
| **file** | **\SplFileObject****\SplFileObject**| The name of the file you want to use for your logo. | |
| **link** | **string**| The path to the file you want to upload and use as a logo. | |

### Return type

[**\OpenAPI\Client\Model\Player**](../Model/Player.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
