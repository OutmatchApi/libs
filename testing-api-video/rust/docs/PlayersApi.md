# \PlayersApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**d_elete_players_player_id**](PlayersApi.md#d_elete_players_player_id) | **DELETE** /players/{playerId} | Delete a player
[**d_elete_players_player_id_logo**](PlayersApi.md#d_elete_players_player_id_logo) | **DELETE** /players/{playerId}/logo | Delete logo
[**g_et_players**](PlayersApi.md#g_et_players) | **GET** /players | List all players
[**g_et_players_player_id**](PlayersApi.md#g_et_players_player_id) | **GET** /players/{playerId} | Show a player
[**p_atch_players_player_id**](PlayersApi.md#p_atch_players_player_id) | **PATCH** /players/{playerId} | Update a player
[**p_ost_players**](PlayersApi.md#p_ost_players) | **POST** /players | Create a player
[**p_ost_players_player_id_logo**](PlayersApi.md#p_ost_players_player_id_logo) | **POST** /players/{playerId}/logo | Upload a logo



## d_elete_players_player_id

> d_elete_players_player_id(player_id)
Delete a player

Delete a player if you no longer need it. You can delete any player that you have the player ID for.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**player_id** | **String** | The unique identifier for the player you want to delete. | [required] |

### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## d_elete_players_player_id_logo

> serde_json::Value d_elete_players_player_id_logo(player_id)
Delete logo

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**player_id** | **String** | The unique identifier for the player. | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_players

> crate::models::PlayersListResponse g_et_players(sort_by, sort_order, current_page, page_size)
List all players

Retrieve a list of all the players you created, as well as details about each one. Tutorials that use the [player endpoint](https://api.video/blog/endpoints/player).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**sort_by** | Option<**String**> | createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format. |  |
**sort_order** | Option<**String**> | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. |  |
**current_page** | Option<**i32**> | Choose the number of search results to return per page. Minimum value: 1 |  |[default to 1]
**page_size** | Option<**i32**> | Results per page. Allowed values 1-100, default is 25. |  |[default to 25]

### Return type

[**crate::models::PlayersListResponse**](players-list-response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## g_et_players_player_id

> crate::models::Player g_et_players_player_id(player_id)
Show a player

Use a player ID to retrieve details about the player and display it for viewers.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**player_id** | **String** | The unique identifier for the player you want to retrieve.  | [required] |

### Return type

[**crate::models::Player**](player.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_atch_players_player_id

> crate::models::Player p_atch_players_player_id(player_id, player_update_payload)
Update a player

Use a player ID to update specific details for a player. NOTE: It may take up to 10 min before the new player configuration is available from our CDN.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**player_id** | **String** | The unique identifier for the player. | [required] |
**player_update_payload** | [**PlayerUpdatePayload**](PlayerUpdatePayload.md) |  | [required] |

### Return type

[**crate::models::Player**](player.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_ost_players

> crate::models::Player p_ost_players(player_creation_payload)
Create a player

Create a player for your video, and customise it.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**player_creation_payload** | [**PlayerCreationPayload**](PlayerCreationPayload.md) |  | [required] |

### Return type

[**crate::models::Player**](player.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## p_ost_players_player_id_logo

> crate::models::Player p_ost_players_player_id_logo(player_id, file, link)
Upload a logo

The uploaded image maximum size should be 200x100 and its weight should be 200KB.  It will be scaled down to 30px height and converted to PNG to be displayed in the player.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**player_id** | **String** | The unique identifier for the player. | [required] |
**file** | **std::path::PathBuf** | The name of the file you want to use for your logo. | [required] |
**link** | **String** | The path to the file you want to upload and use as a logo. | [required] |

### Return type

[**crate::models::Player**](player.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

