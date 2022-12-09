# apivideo::PlayersApi

All URIs are relative to *https://ws.api.video*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**d_elete_players_player_id**](PlayersApi.md#d_elete_players_player_id) | **DELETE** /players/{playerId} | Delete a player |
| [**d_elete_players_player_id_logo**](PlayersApi.md#d_elete_players_player_id_logo) | **DELETE** /players/{playerId}/logo | Delete logo |
| [**g_et_players**](PlayersApi.md#g_et_players) | **GET** /players | List all players |
| [**g_et_players_player_id**](PlayersApi.md#g_et_players_player_id) | **GET** /players/{playerId} | Show a player |
| [**p_atch_players_player_id**](PlayersApi.md#p_atch_players_player_id) | **PATCH** /players/{playerId} | Update a player |
| [**p_ost_players**](PlayersApi.md#p_ost_players) | **POST** /players | Create a player |
| [**p_ost_players_player_id_logo**](PlayersApi.md#p_ost_players_player_id_logo) | **POST** /players/{playerId}/logo | Upload a logo |


## d_elete_players_player_id

> d_elete_players_player_id(player_id)

Delete a player

Delete a player if you no longer need it. You can delete any player that you have the player ID for.

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::PlayersApi.new
player_id = 'pl45d5vFFGrfdsdsd156dGhh' # String | The unique identifier for the player you want to delete.

begin
  # Delete a player
  api_instance.d_elete_players_player_id(player_id)
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->d_elete_players_player_id: #{e}"
end
```

#### Using the d_elete_players_player_id_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> d_elete_players_player_id_with_http_info(player_id)

```ruby
begin
  # Delete a player
  data, status_code, headers = api_instance.d_elete_players_player_id_with_http_info(player_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->d_elete_players_player_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **player_id** | **String** | The unique identifier for the player you want to delete. |  |

### Return type

nil (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## d_elete_players_player_id_logo

> Object d_elete_players_player_id_logo(player_id)

Delete logo

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::PlayersApi.new
player_id = 'pl14Db6oMJRH6SRVoOwORacK' # String | The unique identifier for the player.

begin
  # Delete logo
  result = api_instance.d_elete_players_player_id_logo(player_id)
  p result
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->d_elete_players_player_id_logo: #{e}"
end
```

#### Using the d_elete_players_player_id_logo_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> d_elete_players_player_id_logo_with_http_info(player_id)

```ruby
begin
  # Delete logo
  data, status_code, headers = api_instance.d_elete_players_player_id_logo_with_http_info(player_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Object
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->d_elete_players_player_id_logo_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **player_id** | **String** | The unique identifier for the player. |  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_players

> <PlayersListResponse> g_et_players(opts)

List all players

Retrieve a list of all the players you created, as well as details about each one. Tutorials that use the [player endpoint](https://api.video/blog/endpoints/player).

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::PlayersApi.new
opts = {
    sort_by: 'createdAt', # String | createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format.
    sort_order: 'asc', # String | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones.
    current_page: 2, # Integer | Choose the number of search results to return per page. Minimum value: 1
    page_size: 30, # Integer | Results per page. Allowed values 1-100, default is 25.
}

begin
  # List all players
  result = api_instance.g_et_players(opts)
  p result
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->g_et_players: #{e}"
end
```

#### Using the g_et_players_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PlayersListResponse>, Integer, Hash)> g_et_players_with_http_info(opts)

```ruby
begin
  # List all players
  data, status_code, headers = api_instance.g_et_players_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PlayersListResponse>
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->g_et_players_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **sort_by** | **String** | createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format. | [optional] |
| **sort_order** | **String** | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. | [optional] |
| **current_page** | **Integer** | Choose the number of search results to return per page. Minimum value: 1 | [optional][default to 1] |
| **page_size** | **Integer** | Results per page. Allowed values 1-100, default is 25. | [optional][default to 25] |

### Return type

[**PlayersListResponse**](PlayersListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## g_et_players_player_id

> <Player> g_et_players_player_id(player_id)

Show a player

Use a player ID to retrieve details about the player and display it for viewers.

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::PlayersApi.new
player_id = 'pl45d5vFFGrfdsdsd156dGhh' # String | The unique identifier for the player you want to retrieve. 

begin
  # Show a player
  result = api_instance.g_et_players_player_id(player_id)
  p result
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->g_et_players_player_id: #{e}"
end
```

#### Using the g_et_players_player_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Player>, Integer, Hash)> g_et_players_player_id_with_http_info(player_id)

```ruby
begin
  # Show a player
  data, status_code, headers = api_instance.g_et_players_player_id_with_http_info(player_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Player>
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->g_et_players_player_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **player_id** | **String** | The unique identifier for the player you want to retrieve.  |  |

### Return type

[**Player**](Player.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## p_atch_players_player_id

> <Player> p_atch_players_player_id(player_id, player_update_payload)

Update a player

Use a player ID to update specific details for a player. NOTE: It may take up to 10 min before the new player configuration is available from our CDN.

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::PlayersApi.new
player_id = 'pl45d5vFFGrfdsdsd156dGhh' # String | The unique identifier for the player.
player_update_payload = apivideo::PlayerUpdatePayload.new # PlayerUpdatePayload | 

begin
  # Update a player
  result = api_instance.p_atch_players_player_id(player_id, player_update_payload)
  p result
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->p_atch_players_player_id: #{e}"
end
```

#### Using the p_atch_players_player_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Player>, Integer, Hash)> p_atch_players_player_id_with_http_info(player_id, player_update_payload)

```ruby
begin
  # Update a player
  data, status_code, headers = api_instance.p_atch_players_player_id_with_http_info(player_id, player_update_payload)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Player>
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->p_atch_players_player_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **player_id** | **String** | The unique identifier for the player. |  |
| **player_update_payload** | [**PlayerUpdatePayload**](PlayerUpdatePayload.md) |  |  |

### Return type

[**Player**](Player.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## p_ost_players

> <Player> p_ost_players(player_creation_payload)

Create a player

Create a player for your video, and customise it.

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::PlayersApi.new
player_creation_payload = apivideo::PlayerCreationPayload.new # PlayerCreationPayload | 

begin
  # Create a player
  result = api_instance.p_ost_players(player_creation_payload)
  p result
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->p_ost_players: #{e}"
end
```

#### Using the p_ost_players_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Player>, Integer, Hash)> p_ost_players_with_http_info(player_creation_payload)

```ruby
begin
  # Create a player
  data, status_code, headers = api_instance.p_ost_players_with_http_info(player_creation_payload)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Player>
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->p_ost_players_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **player_creation_payload** | [**PlayerCreationPayload**](PlayerCreationPayload.md) |  |  |

### Return type

[**Player**](Player.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## p_ost_players_player_id_logo

> <Player> p_ost_players_player_id_logo(player_id, file, link)

Upload a logo

The uploaded image maximum size should be 200x100 and its weight should be 200KB.  It will be scaled down to 30px height and converted to PNG to be displayed in the player.

### Examples

```ruby
require 'time'
require 'apivideo'
# setup authorization
apivideo.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = apivideo::PlayersApi.new
player_id = 'pl14Db6oMJRH6SRVoOwORacK' # String | The unique identifier for the player.
file = File.new('/path/to/some/file') # File | The name of the file you want to use for your logo.
link = 'link_example' # String | The path to the file you want to upload and use as a logo.

begin
  # Upload a logo
  result = api_instance.p_ost_players_player_id_logo(player_id, file, link)
  p result
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->p_ost_players_player_id_logo: #{e}"
end
```

#### Using the p_ost_players_player_id_logo_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Player>, Integer, Hash)> p_ost_players_player_id_logo_with_http_info(player_id, file, link)

```ruby
begin
  # Upload a logo
  data, status_code, headers = api_instance.p_ost_players_player_id_logo_with_http_info(player_id, file, link)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Player>
rescue apivideo::ApiError => e
  puts "Error when calling PlayersApi->p_ost_players_player_id_logo_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **player_id** | **String** | The unique identifier for the player. |  |
| **file** | **File** | The name of the file you want to use for your logo. |  |
| **link** | **String** | The path to the file you want to upload and use as a logo. |  |

### Return type

[**Player**](Player.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

