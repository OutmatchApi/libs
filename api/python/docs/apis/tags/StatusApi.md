<a name="__pageTop"></a>
# api.apis.tags.status_api.StatusApi

All URIs are relative to *https://api.outmatchapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_status**](#get_status) | **get** /status | 

# **get_status**
<a name="get_status"></a>
> get_status()



Check the API status

### Example

```python
import api
from api.apis.tags import status_api
from pprint import pprint
# Defining the host is optional and defaults to https://api.outmatchapi.com
# See configuration.py for a list of all supported configuration parameters.
configuration = api.Configuration(
    host = "https://api.outmatchapi.com"
)

# Enter a context with an instance of the API client
with api.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = status_api.StatusApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.get_status()
    except api.ApiException as e:
        print("Exception when calling StatusApi->get_status: %s\n" % e)
```
### Parameters
This endpoint does not need any parameter.

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#get_status.ApiResponseFor200) | Good response

#### get_status.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | Unset | headers were not defined |

### Authorization

No authorization required

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

