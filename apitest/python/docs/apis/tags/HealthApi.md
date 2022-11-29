<a name="__pageTop"></a>
# apitest.apis.tags.health_api.HealthApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**health_api_v1_health_get**](#health_api_v1_health_get) | **get** /api/v1/health/ | Health

# **health_api_v1_health_get**
<a name="health_api_v1_health_get"></a>
> health_api_v1_health_get()

Health

Verify the API server is up and running.

### Example

```python
import apitest
from apitest.apis.tags import health_api
from apitest.model.http_validation_error import HTTPValidationError
from pprint import pprint
# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = apitest.Configuration(
    host = "http://localhost"
)

# Enter a context with an instance of the API client
with apitest.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = health_api.HealthApi(api_client)

    # example passing only optional values
    header_params = {
        'idempotency-key': "idempotency-key_example",
    }
    try:
        # Health
        api_response = api_instance.health_api_v1_health_get(
            header_params=header_params,
        )
    except apitest.ApiException as e:
        print("Exception when calling HealthApi->health_api_v1_health_get: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
header_params | RequestHeaderParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
idempotency-key | IdempotencyKeySchema | | optional

# IdempotencyKeySchema

The request's idempotency key

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  | The request&#x27;s idempotency key | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
204 | [ApiResponseFor204](#health_api_v1_health_get.ApiResponseFor204) | Successful Response
422 | [ApiResponseFor422](#health_api_v1_health_get.ApiResponseFor422) | Validation Error

#### health_api_v1_health_get.ApiResponseFor204
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

#### health_api_v1_health_get.ApiResponseFor422
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor422ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor422ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**HTTPValidationError**](../../models/HTTPValidationError.md) |  | 


### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

