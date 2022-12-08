# .PlayersApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEPlayersPlayerId**](PlayersApi.md#dELETEPlayersPlayerId) | **DELETE** /players/{playerId} | Delete a player
[**dELETEPlayersPlayerIdLogo**](PlayersApi.md#dELETEPlayersPlayerIdLogo) | **DELETE** /players/{playerId}/logo | Delete logo
[**gETPlayers**](PlayersApi.md#gETPlayers) | **GET** /players | List all players
[**gETPlayersPlayerId**](PlayersApi.md#gETPlayersPlayerId) | **GET** /players/{playerId} | Show a player
[**pATCHPlayersPlayerId**](PlayersApi.md#pATCHPlayersPlayerId) | **PATCH** /players/{playerId} | Update a player
[**pOSTPlayers**](PlayersApi.md#pOSTPlayers) | **POST** /players | Create a player
[**pOSTPlayersPlayerIdLogo**](PlayersApi.md#pOSTPlayersPlayerIdLogo) | **POST** /players/{playerId}/logo | Upload a logo


# **dELETEPlayersPlayerId**
> void dELETEPlayersPlayerId()

Delete a player if you no longer need it. You can delete any player that you have the player ID for.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PlayersApi(configuration);

let body:.PlayersApiDELETEPlayersPlayerIdRequest = {
  // string | The unique identifier for the player you want to delete.
  playerId: "pl45d5vFFGrfdsdsd156dGhh",
};

apiInstance.dELETEPlayersPlayerId(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | [**string**] | The unique identifier for the player you want to delete. | defaults to undefined


### Return type

**void**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **dELETEPlayersPlayerIdLogo**
> any dELETEPlayersPlayerIdLogo()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PlayersApi(configuration);

let body:.PlayersApiDELETEPlayersPlayerIdLogoRequest = {
  // string | The unique identifier for the player.
  playerId: "pl14Db6oMJRH6SRVoOwORacK",
};

apiInstance.dELETEPlayersPlayerIdLogo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | [**string**] | The unique identifier for the player. | defaults to undefined


### Return type

**any**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **gETPlayers**
> PlayersListResponse gETPlayers()

Retrieve a list of all the players you created, as well as details about each one. Tutorials that use the [player endpoint](https://api.video/blog/endpoints/player).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PlayersApi(configuration);

let body:.PlayersApiGETPlayersRequest = {
  // 'createdAt' | 'updatedAt' | createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format. (optional)
  sortBy: "createdAt",
  // 'asc' | 'desc' | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. (optional)
  sortOrder: "asc",
  // number | Choose the number of search results to return per page. Minimum value: 1 (optional)
  currentPage: 2,
  // number | Results per page. Allowed values 1-100, default is 25. (optional)
  pageSize: 30,
};

apiInstance.gETPlayers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sortBy** | [**&#39;createdAt&#39; | &#39;updatedAt&#39;**]**Array<&#39;createdAt&#39; &#124; &#39;updatedAt&#39;>** | createdAt is the time the player was created. updatedAt is the time the player was last updated. The time is presented in ISO-8601 format. | (optional) defaults to undefined
 **sortOrder** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** | Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. | (optional) defaults to undefined
 **currentPage** | [**number**] | Choose the number of search results to return per page. Minimum value: 1 | (optional) defaults to 1
 **pageSize** | [**number**] | Results per page. Allowed values 1-100, default is 25. | (optional) defaults to 25


### Return type

**PlayersListResponse**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **gETPlayersPlayerId**
> Player gETPlayersPlayerId()

Use a player ID to retrieve details about the player and display it for viewers.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PlayersApi(configuration);

let body:.PlayersApiGETPlayersPlayerIdRequest = {
  // string | The unique identifier for the player you want to retrieve. 
  playerId: "pl45d5vFFGrfdsdsd156dGhh",
};

apiInstance.gETPlayersPlayerId(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | [**string**] | The unique identifier for the player you want to retrieve.  | defaults to undefined


### Return type

**Player**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pATCHPlayersPlayerId**
> Player pATCHPlayersPlayerId(playerUpdatePayload)

Use a player ID to update specific details for a player. NOTE: It may take up to 10 min before the new player configuration is available from our CDN.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PlayersApi(configuration);

let body:.PlayersApiPATCHPlayersPlayerIdRequest = {
  // string | The unique identifier for the player.
  playerId: "pl45d5vFFGrfdsdsd156dGhh",
  // PlayerUpdatePayload
  playerUpdatePayload: null,
};

apiInstance.pATCHPlayersPlayerId(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerUpdatePayload** | **PlayerUpdatePayload**|  |
 **playerId** | [**string**] | The unique identifier for the player. | defaults to undefined


### Return type

**Player**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pOSTPlayers**
> Player pOSTPlayers(playerCreationPayload)

Create a player for your video, and customise it.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PlayersApi(configuration);

let body:.PlayersApiPOSTPlayersRequest = {
  // PlayerCreationPayload
  playerCreationPayload: null,
};

apiInstance.pOSTPlayers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerCreationPayload** | **PlayerCreationPayload**|  |


### Return type

**Player**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **pOSTPlayersPlayerIdLogo**
> Player pOSTPlayersPlayerIdLogo()

The uploaded image maximum size should be 200x100 and its weight should be 200KB.  It will be scaled down to 30px height and converted to PNG to be displayed in the player.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PlayersApi(configuration);

let body:.PlayersApiPOSTPlayersPlayerIdLogoRequest = {
  // string | The unique identifier for the player.
  playerId: "pl14Db6oMJRH6SRVoOwORacK",
  // HttpFile | The name of the file you want to use for your logo.
  file: { data: Buffer.from(fs.readFileSync('[B@1179fc8c', 'utf-8')), name: '[B@1179fc8c' },
  // string | The path to the file you want to upload and use as a logo.
  link: "path/to/my/logo/mylogo.jpg",
};

apiInstance.pOSTPlayersPlayerIdLogo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playerId** | [**string**] | The unique identifier for the player. | defaults to undefined
 **file** | [**HttpFile**] | The name of the file you want to use for your logo. | defaults to undefined
 **link** | [**string**] | The path to the file you want to upload and use as a logo. | defaults to undefined


### Return type

**Player**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


