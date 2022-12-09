# video-api::VideoUpdatePayload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** | A brief description of the video. | [optional] |
| **metadata** | [**Array&lt;Metadata&gt;**](Metadata.md) | A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing metadata for the video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. | [optional] |
| **mp4_support** | **Boolean** | Whether the player supports the mp4 format. | [optional] |
| **panoramic** | **Boolean** | Whether the video is a 360 degree or immersive video. | [optional] |
| **player_id** | **String** | The unique ID for the player you want to associate with your video. | [optional] |
| **public** | **Boolean** | Whether the video is publicly available or not. False means it is set to private. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos). | [optional] |
| **tags** | **Array&lt;String&gt;** | A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as whatever you send in this list will overwrite the existing list for the video. | [optional] |
| **title** | **String** | The title you want to use for your video. | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::VideoUpdatePayload.new(
  description: A film about good books.,
  metadata: null,
  mp4_support: true,
  panoramic: false,
  player_id: pl4k0jvEUuaTdRAEjQ4Jfrgz,
  public: true,
  tags: [&quot;maths&quot;, &quot;string theory&quot;, &quot;video&quot;],
  title: null
)
```

