<a name="__pageTop"></a>
# api.apis.tags.api_app_api.ApiAppApi

All URIs are relative to *https://api.outmatchapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_api_app**](#create_api_app) | **post** /apiApp | Create api app
[**create_api_app_release**](#create_api_app_release) | **post** /apiApp/{app_id}/release | Create api app release
[**create_api_app_release_sdks**](#create_api_app_release_sdks) | **post** /apiApp/{app_id}/release/{release_version}/sdk | Generate sdks for a relase

# **create_api_app**
<a name="create_api_app"></a>
> ApiApp create_api_app()

Create api app

Create an api app for the authenticated user

### Example

* Bearer (JWT) Authentication (bearerAuth):
```python
import api
from api.apis.tags import api_app_api
from api.model.error import Error
from api.model.api_app import ApiApp
from pprint import pprint
# Defining the host is optional and defaults to https://api.outmatchapi.com
# See configuration.py for a list of all supported configuration parameters.
configuration = api.Configuration(
    host = "https://api.outmatchapi.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): bearerAuth
configuration = api.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_app_api.ApiAppApi(api_client)

    # example passing only optional values
    body = dict(
        name="My Api",
    )
    try:
        # Create api app
        api_response = api_instance.create_api_app(
            body=body,
        )
        pprint(api_response)
    except api.ApiException as e:
        print("Exception when calling ApiAppApi->create_api_app: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson, Unset] | optional, default is unset |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', 'application/xml', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str,  | str,  |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#create_api_app.ApiResponseFor200) | Example response
4XX | [ApiResponseFor4XX](#create_api_app.ApiResponseFor4XX) | Example response

#### create_api_app.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, SchemaFor200ResponseBodyApplicationXml, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ApiApp**](../../models/ApiApp.md) |  | 


# SchemaFor200ResponseBodyApplicationXml

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

#### create_api_app.ApiResponseFor4XX
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor4XXResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor4XXResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **create_api_app_release**
<a name="create_api_app_release"></a>
> Release create_api_app_release(app_id)

Create api app release

Create an api app release

### Example

* Bearer (JWT) Authentication (bearerAuth):
```python
import api
from api.apis.tags import api_app_api
from api.model.release import Release
from pprint import pprint
# Defining the host is optional and defaults to https://api.outmatchapi.com
# See configuration.py for a list of all supported configuration parameters.
configuration = api.Configuration(
    host = "https://api.outmatchapi.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): bearerAuth
configuration = api.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_app_api.ApiAppApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_id_example",
    }
    try:
        # Create api app release
        api_response = api_instance.create_api_app_release(
            path_params=path_params,
        )
        pprint(api_response)
    except api.ApiException as e:
        print("Exception when calling ApiAppApi->create_api_app_release: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_id_example",
    }
    body = "body_example"
    try:
        # Create api app release
        api_response = api_instance.create_api_app_release(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except api.ApiException as e:
        print("Exception when calling ApiAppApi->create_api_app_release: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyTextPlain, Unset] | optional, default is unset |
path_params | RequestPathParams | |
content_type | str | optional, default is 'text/plain' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', 'application/xml', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyTextPlain

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
app_id | AppIdSchema | | 

# AppIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#create_api_app_release.ApiResponseFor200) | Example response

#### create_api_app_release.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, SchemaFor200ResponseBodyApplicationXml, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Release**](../../models/Release.md) |  | 


# SchemaFor200ResponseBodyApplicationXml

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **create_api_app_release_sdks**
<a name="create_api_app_release_sdks"></a>
> [Sdk] create_api_app_release_sdks(app_idrelease_version)

Generate sdks for a relase

Generate sdks for a relase

### Example

* Bearer (JWT) Authentication (bearerAuth):
```python
import api
from api.apis.tags import api_app_api
from api.model.language import Language
from api.model.sdk import Sdk
from pprint import pprint
# Defining the host is optional and defaults to https://api.outmatchapi.com
# See configuration.py for a list of all supported configuration parameters.
configuration = api.Configuration(
    host = "https://api.outmatchapi.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): bearerAuth
configuration = api.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_app_api.ApiAppApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'app_id': "app_id_example",
        'release_version': "1.0.0",
    }
    try:
        # Generate sdks for a relase
        api_response = api_instance.create_api_app_release_sdks(
            path_params=path_params,
        )
        pprint(api_response)
    except api.ApiException as e:
        print("Exception when calling ApiAppApi->create_api_app_release_sdks: %s\n" % e)

    # example passing only optional values
    path_params = {
        'app_id': "app_id_example",
        'release_version': "1.0.0",
    }
    body = dict(
        languages=[
            Language("go")
        ],
    )
    try:
        # Generate sdks for a relase
        api_response = api_instance.create_api_app_release_sdks(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except api.ApiException as e:
        print("Exception when calling ApiAppApi->create_api_app_release_sdks: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson, Unset] | optional, default is unset |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[languages](#languages)** | list, tuple,  | tuple,  |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# languages

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Language**]({{complexTypePrefix}}Language.md) | [**Language**]({{complexTypePrefix}}Language.md) | [**Language**]({{complexTypePrefix}}Language.md) |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
app_id | AppIdSchema | | 
release_version | ReleaseVersionSchema | | 

# AppIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ReleaseVersionSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#create_api_app_release_sdks.ApiResponseFor200) | Example response

#### create_api_app_release_sdks.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Sdk**]({{complexTypePrefix}}Sdk.md) | [**Sdk**]({{complexTypePrefix}}Sdk.md) | [**Sdk**]({{complexTypePrefix}}Sdk.md) |  | 

### Authorization

[bearerAuth](../../../README.md#bearerAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

