# .PodcastApi

All URIs are relative to *https://www.podcastxxxxxxx.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**processPodcast**](PodcastApi.md#processPodcast) | **POST** /podcast | Process Podcast


# **processPodcast**
> Podcast processPodcast()

Processing a podcast episode

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PodcastApi(configuration);

let body:.PodcastApiProcessPodcastRequest = {
  // ProcessPodcastRequest (optional)
  processPodcastRequest: {
    podcastName: "my-first-million",
    youtubeVideoId: "12345",
  },
};

apiInstance.processPodcast(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processPodcastRequest** | **ProcessPodcastRequest**|  |


### Return type

**Podcast**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | pocast processed |  -  |
**4XX** | Client Error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


