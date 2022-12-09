<a name="__pageTop"></a>
# apivideo.apis.tags.players_api.PlayersApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**d_elete_players_player_id**](#d_elete_players_player_id) | **delete** /players/{playerId} | Delete a player
[**d_elete_players_player_id_logo**](#d_elete_players_player_id_logo) | **delete** /players/{playerId}/logo | Delete logo
[**g_et_players**](#g_et_players) | **get** /players | List all players
[**g_et_players_player_id**](#g_et_players_player_id) | **get** /players/{playerId} | Show a player
[**p_atch_players_player_id**](#p_atch_players_player_id) | **patch** /players/{playerId} | Update a player
[**p_ost_players**](#p_ost_players) | **post** /players | Create a player
[**p_ost_players_player_id_logo**](#p_ost_players_player_id_logo) | **post** /players/{playerId}/logo | Upload a logo

# **d_elete_players_player_id**
<a name="d_elete_players_player_id"></a>
> d_elete_players_player_id(player_id)

Delete a player

Delete a player if you no longer need it. You can delete any player that you have the player ID for.

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import players_api
from apivideo.model.not_found import NotFound
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = players_api.PlayersApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'playerId': "pl45d5vFFGrfdsdsd156dGhh",
    }
    try:
        # Delete a player
        api_response = api_instance.d_elete_players_player_id(
            path_params=path_params,
        )
    except apivideo.ApiException as e:
        print("Exception when calling PlayersApi->d_elete_players_player_id: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
playerId | PlayerIdSchema | | 

# PlayerIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
204 | [ApiResponseFor204](#d_elete_players_player_id.ApiResponseFor204) | No Content
404 | [ApiResponseFor404](#d_elete_players_player_id.ApiResponseFor404) | Not Found

#### d_elete_players_player_id.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### d_elete_players_player_id.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**NotFound**](../../models/NotFound.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **d_elete_players_player_id_logo**
<a name="d_elete_players_player_id_logo"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} d_elete_players_player_id_logo(player_id)

Delete logo

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import players_api
from apivideo.model.not_found import NotFound
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = players_api.PlayersApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'playerId': "pl14Db6oMJRH6SRVoOwORacK",
    }
    try:
        # Delete logo
        api_response = api_instance.d_elete_players_player_id_logo(
            path_params=path_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling PlayersApi->d_elete_players_player_id_logo: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
playerId | PlayerIdSchema | | 

# PlayerIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
204 | [ApiResponseFor204](#d_elete_players_player_id_logo.ApiResponseFor204) | No Content
404 | [ApiResponseFor404](#d_elete_players_player_id_logo.ApiResponseFor404) | Not Found

#### d_elete_players_player_id_logo.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor204ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor204ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

#### d_elete_players_player_id_logo.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**NotFound**](../../models/NotFound.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **g_et_players**
<a name="g_et_players"></a>
> PlayersListResponse g_et_players()

List all players

Retrieve a list of all the players you created, as well as details about each one. Tutorials that use the [player endpoint](https://api.video/blog/endpoints/player).

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import players_api
from apivideo.model.bad_request import BadRequest
from apivideo.model.players_list_response import PlayersListResponse
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = players_api.PlayersApi(api_client)

    # example passing only optional values
    query_params = {
        'sortBy': "createdAt",
        'sortOrder': "asc",
        'currentPage': 2,
        'pageSize': 30,
    }
    try:
        # List all players
        api_response = api_instance.g_et_players(
            query_params=query_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling PlayersApi->g_et_players: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
sortBy | SortBySchema | | optional
sortOrder | SortOrderSchema | | optional
currentPage | CurrentPageSchema | | optional
pageSize | PageSizeSchema | | optional


# SortBySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["createdAt", "updatedAt", ] 

# SortOrderSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["asc", "desc", ] 

# CurrentPageSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 1

# PageSizeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 25

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#g_et_players.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#g_et_players.ApiResponseFor400) | Bad Request

#### g_et_players.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PlayersListResponse**](../../models/PlayersListResponse.md) |  | 


#### g_et_players.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**BadRequest**](../../models/BadRequest.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **g_et_players_player_id**
<a name="g_et_players_player_id"></a>
> Player g_et_players_player_id(player_id)

Show a player

Use a player ID to retrieve details about the player and display it for viewers.

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import players_api
from apivideo.model.not_found import NotFound
from apivideo.model.player import Player
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = players_api.PlayersApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'playerId': "pl45d5vFFGrfdsdsd156dGhh",
    }
    try:
        # Show a player
        api_response = api_instance.g_et_players_player_id(
            path_params=path_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling PlayersApi->g_et_players_player_id: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
playerId | PlayerIdSchema | | 

# PlayerIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#g_et_players_player_id.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#g_et_players_player_id.ApiResponseFor404) | Not Found

#### g_et_players_player_id.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Player**](../../models/Player.md) |  | 


#### g_et_players_player_id.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**NotFound**](../../models/NotFound.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **p_atch_players_player_id**
<a name="p_atch_players_player_id"></a>
> Player p_atch_players_player_id(player_idplayer_update_payload)

Update a player

Use a player ID to update specific details for a player. NOTE: It may take up to 10 min before the new player configuration is available from our CDN.

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import players_api
from apivideo.model.player_update_payload import PlayerUpdatePayload
from apivideo.model.not_found import NotFound
from apivideo.model.player import Player
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = players_api.PlayersApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'playerId': "pl45d5vFFGrfdsdsd156dGhh",
    }
    body = PlayerUpdatePayload(None)
    try:
        # Update a player
        api_response = api_instance.p_atch_players_player_id(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling PlayersApi->p_atch_players_player_id: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PlayerUpdatePayload**](../../models/PlayerUpdatePayload.md) |  | 


### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
playerId | PlayerIdSchema | | 

# PlayerIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#p_atch_players_player_id.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#p_atch_players_player_id.ApiResponseFor404) | Not Found

#### p_atch_players_player_id.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Player**](../../models/Player.md) |  | 


#### p_atch_players_player_id.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**NotFound**](../../models/NotFound.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **p_ost_players**
<a name="p_ost_players"></a>
> Player p_ost_players(player_creation_payload)

Create a player

Create a player for your video, and customise it.

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import players_api
from apivideo.model.player import Player
from apivideo.model.player_creation_payload import PlayerCreationPayload
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = players_api.PlayersApi(api_client)

    # example passing only required values which don't have defaults set
    body = PlayerCreationPayload(None)
    try:
        # Create a player
        api_response = api_instance.p_ost_players(
            body=body,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling PlayersApi->p_ost_players: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**PlayerCreationPayload**](../../models/PlayerCreationPayload.md) |  | 


### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
201 | [ApiResponseFor201](#p_ost_players.ApiResponseFor201) | Created

#### p_ost_players.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Player**](../../models/Player.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **p_ost_players_player_id_logo**
<a name="p_ost_players_player_id_logo"></a>
> Player p_ost_players_player_id_logo(player_id)

Upload a logo

The uploaded image maximum size should be 200x100 and its weight should be 200KB.  It will be scaled down to 30px height and converted to PNG to be displayed in the player.

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import players_api
from apivideo.model.bad_request import BadRequest
from apivideo.model.not_found import NotFound
from apivideo.model.player import Player
from apivideo.model.players_upload_logo_payload import PlayersUploadLogoPayload
from pprint import pprint
# Defining the host is optional and defaults to https://ws.api.video
# See configuration.py for a list of all supported configuration parameters.
configuration = apivideo.Configuration(
    host = "https://ws.api.video"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = apivideo.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with apivideo.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = players_api.PlayersApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'playerId': "pl14Db6oMJRH6SRVoOwORacK",
    }
    try:
        # Upload a logo
        api_response = api_instance.p_ost_players_player_id_logo(
            path_params=path_params,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling PlayersApi->p_ost_players_player_id_logo: %s\n" % e)

    # example passing only optional values
    path_params = {
        'playerId': "pl14Db6oMJRH6SRVoOwORacK",
    }
    body = dict(
        file="[B@7fa2473a",
        link="path/to/my/logo/mylogo.jpg",
    )
    try:
        # Upload a logo
        api_response = api_instance.p_ost_players_player_id_logo(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling PlayersApi->p_ost_players_player_id_logo: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyMultipartFormData, Unset] | optional, default is unset |
path_params | RequestPathParams | |
content_type | str | optional, default is 'multipart/form-data' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyMultipartFormData
Type | Description  | Notes
------------- | ------------- | -------------
[**PlayersUploadLogoPayload**](../../models/PlayersUploadLogoPayload.md) |  | 


### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
playerId | PlayerIdSchema | | 

# PlayerIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
201 | [ApiResponseFor201](#p_ost_players_player_id_logo.ApiResponseFor201) | Created
400 | [ApiResponseFor400](#p_ost_players_player_id_logo.ApiResponseFor400) | Bad Request
404 | [ApiResponseFor404](#p_ost_players_player_id_logo.ApiResponseFor404) | Not Found

#### p_ost_players_player_id_logo.ApiResponseFor201
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor201ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor201ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Player**](../../models/Player.md) |  | 


#### p_ost_players_player_id_logo.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**BadRequest**](../../models/BadRequest.md) |  | 


#### p_ost_players_player_id_logo.ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor404ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**NotFound**](../../models/NotFound.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

