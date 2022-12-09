<a name="__pageTop"></a>
# apivideo.apis.tags.account_api.AccountApi

All URIs are relative to *https://ws.api.video*

Method | HTTP request | Description
------------- | ------------- | -------------
[**g_et_account**](#g_et_account) | **get** /account | Show account

# **g_et_account**
<a name="g_et_account"></a>
> Account g_et_account()

Show account

Deprecated. Authenticate and get a token, then you can use the bearer token here to retrieve details about your account.

### Example

* Bearer Authentication (bearerAuth):
```python
import apivideo
from apivideo.apis.tags import account_api
from apivideo.model.not_found import NotFound
from apivideo.model.account import Account
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
    api_instance = account_api.AccountApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Show account
        api_response = api_instance.g_et_account()
        pprint(api_response)
    except apivideo.ApiException as e:
        print("Exception when calling AccountApi->g_et_account: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#g_et_account.ApiResponseFor200) | Success
404 | [ApiResponseFor404](#g_et_account.ApiResponseFor404) | Not Found

#### g_et_account.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Account**](../../models/Account.md) |  | 


#### g_et_account.ApiResponseFor404
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

