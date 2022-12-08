<a name="__pageTop"></a>
# slack.apis.tags.views_api.ViewsApi

All URIs are relative to *https://slack.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**views_open**](#views_open) | **get** /views.open | 
[**views_publish**](#views_publish) | **get** /views.publish | 
[**views_push**](#views_push) | **get** /views.push | 
[**views_update**](#views_update) | **get** /views.update | 

# **views_open**
<a name="views_open"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} views_open(tokentrigger_idview)



Open a view for a user.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import views_api
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from pprint import pprint
# Defining the host is optional and defaults to https://slack.com/api
# See configuration.py for a list of all supported configuration parameters.
configuration = slack.Configuration(
    host = "https://slack.com/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: slackAuth
configuration = slack.Configuration(
    host = "https://slack.com/api"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'
# Enter a context with an instance of the API client
with slack.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = views_api.ViewsApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'trigger_id': "trigger_id_example",
        'view': "view_example",
    }
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.views_open(
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ViewsApi->views_open: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
header_params | RequestHeaderParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
trigger_id | TriggerIdSchema | | 
view | ViewSchema | | 


# TriggerIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ViewSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
token | TokenSchema | | 

# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#views_open.ApiResponseFor200) | Typical success response includes the opened view payload.
default | [ApiResponseForDefault](#views_open.ApiResponseForDefault) | Typical error response, before getting to any possible validation errors.

#### views_open.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

This method either only returns a brief _OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

#### views_open.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

This method either only returns a brief _not OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _not OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **views_publish**
<a name="views_publish"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} views_publish(tokenuser_idview)



Publish a static view for a User.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import views_api
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from pprint import pprint
# Defining the host is optional and defaults to https://slack.com/api
# See configuration.py for a list of all supported configuration parameters.
configuration = slack.Configuration(
    host = "https://slack.com/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: slackAuth
configuration = slack.Configuration(
    host = "https://slack.com/api"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'
# Enter a context with an instance of the API client
with slack.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = views_api.ViewsApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'user_id': "user_id_example",
        'view': "view_example",
    }
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.views_publish(
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ViewsApi->views_publish: %s\n" % e)

    # example passing only optional values
    query_params = {
        'user_id': "user_id_example",
        'view': "view_example",
        'hash': "hash_example",
    }
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.views_publish(
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ViewsApi->views_publish: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
header_params | RequestHeaderParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
user_id | UserIdSchema | | 
view | ViewSchema | | 
hash | HashSchema | | optional


# UserIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ViewSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# HashSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
token | TokenSchema | | 

# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#views_publish.ApiResponseFor200) | Typical success response includes the published view payload.
default | [ApiResponseForDefault](#views_publish.ApiResponseForDefault) | Typical error response, before getting to any possible validation errors.

#### views_publish.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

This method either only returns a brief _OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

#### views_publish.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

This method either only returns a brief _not OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _not OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **views_push**
<a name="views_push"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} views_push(tokentrigger_idview)



Push a view onto the stack of a root view.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import views_api
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from pprint import pprint
# Defining the host is optional and defaults to https://slack.com/api
# See configuration.py for a list of all supported configuration parameters.
configuration = slack.Configuration(
    host = "https://slack.com/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: slackAuth
configuration = slack.Configuration(
    host = "https://slack.com/api"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'
# Enter a context with an instance of the API client
with slack.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = views_api.ViewsApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'trigger_id': "trigger_id_example",
        'view': "view_example",
    }
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.views_push(
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ViewsApi->views_push: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
header_params | RequestHeaderParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
trigger_id | TriggerIdSchema | | 
view | ViewSchema | | 


# TriggerIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ViewSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
token | TokenSchema | | 

# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#views_push.ApiResponseFor200) | Typical success response includes the pushed view payload.
default | [ApiResponseForDefault](#views_push.ApiResponseForDefault) | Typical error response.

#### views_push.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

This method either only returns a brief _OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

#### views_push.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

This method either only returns a brief _not OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _not OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **views_update**
<a name="views_update"></a>
> {str: (bool, date, datetime, dict, float, int, list, str, none_type)} views_update(token)



Update an existing view.

### Example

* OAuth Authentication (slackAuth):
```python
import slack
from slack.apis.tags import views_api
from slack.model.defs_ok_false import DefsOkFalse
from slack.model.defs_ok_true import DefsOkTrue
from pprint import pprint
# Defining the host is optional and defaults to https://slack.com/api
# See configuration.py for a list of all supported configuration parameters.
configuration = slack.Configuration(
    host = "https://slack.com/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure OAuth2 access token for authorization: slackAuth
configuration = slack.Configuration(
    host = "https://slack.com/api"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'
# Enter a context with an instance of the API client
with slack.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = views_api.ViewsApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
    }
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.views_update(
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ViewsApi->views_update: %s\n" % e)

    # example passing only optional values
    query_params = {
        'view_id': "view_id_example",
        'external_id': "external_id_example",
        'view': "view_example",
        'hash': "hash_example",
    }
    header_params = {
        'token': "token_example",
    }
    try:
        api_response = api_instance.views_update(
            query_params=query_params,
            header_params=header_params,
        )
        pprint(api_response)
    except slack.ApiException as e:
        print("Exception when calling ViewsApi->views_update: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
header_params | RequestHeaderParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
view_id | ViewIdSchema | | optional
external_id | ExternalIdSchema | | optional
view | ViewSchema | | optional
hash | HashSchema | | optional


# ViewIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ExternalIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ViewSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# HashSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
token | TokenSchema | | 

# TokenSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#views_update.ApiResponseFor200) | Typical success response includes the updated view payload.
default | [ApiResponseForDefault](#views_update.ApiResponseForDefault) | Typical error response.

#### views_update.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

This method either only returns a brief _OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) | [**DefsOkTrue**]({{complexTypePrefix}}DefsOkTrue.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

#### views_update.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson

This method either only returns a brief _not OK_ response or a verbose schema is not available for this method.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This method either only returns a brief _not OK_ response or a verbose schema is not available for this method. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ok** | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) | [**DefsOkFalse**]({{complexTypePrefix}}DefsOkFalse.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

### Authorization

[slackAuth](../../../README.md#slackAuth)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

