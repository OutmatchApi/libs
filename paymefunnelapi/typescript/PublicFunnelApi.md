# .PublicFunnelApi

All URIs are relative to *https://www.PayMeFunnel.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFunnel**](PublicFunnelApi.md#getFunnel) | **GET** /publicfunnel/{funnel_id} | Publicly get funnel


# **getFunnel**
> FunnelMetadataPublic getFunnel()

Get funnel by id

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PublicFunnelApi(configuration);

let body:.PublicFunnelApiGetFunnelRequest = {
  // string | the funnel id
  funnelId: "funnel_id_example",
  // string | The payment session id (optional)
  sessionId: "session_id_example",
};

apiInstance.getFunnel(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funnelId** | [**string**] | the funnel id | defaults to undefined
 **sessionId** | [**string**] | The payment session id | (optional) defaults to undefined


### Return type

**FunnelMetadataPublic**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


