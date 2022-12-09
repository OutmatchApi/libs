# apivideo::Video

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **assets** | [**VideoAssets**](VideoAssets.md) |  | [optional] |
| **description** | **String** | A description for the video content.  | [optional] |
| **metadata** | [**Array&lt;Metadata&gt;**](Metadata.md) | Metadata you can use to categorise and filter videos. Metadata is a list of dictionaries, where each dictionary represents a key value pair for categorising a video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.  | [optional] |
| **mp4_support** | **Boolean** | This lets you know whether mp4 is supported. If enabled, an mp4 URL will be provided in the response for the video.  | [optional] |
| **panoramic** | **Boolean** | Defines if video is panoramic.  | [optional] |
| **player_id** | **String** | The id of the player that will be applied on the video.  | [optional] |
| **public** | **Boolean** | Defines if the content is publicly reachable or if a unique token is needed for each play session. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos).  | [optional] |
| **published_at** | **String** | The date and time the API created the video. Date and time are provided using ISO-8601 UTC format. | [optional] |
| **source** | [**VideoSource**](VideoSource.md) |  | [optional] |
| **tags** | **Array&lt;Object&gt;** | One array of tags (each tag is a string) in order to categorize a video. Tags may include spaces.   | [optional] |
| **title** | **String** | The title of the video content.  | [optional] |
| **updated_at** | **Time** | The date and time the video was updated. Date and time are provided using ISO-8601 UTC format. | [optional] |
| **video_id** | **String** | The unique identifier of the video object. | [optional] |

## Example

```ruby
require 'apivideo'

instance = apivideo::Video.new(
  assets: null,
  description: An amazing video explaining string theory.,
  metadata: [{&quot;key&quot;:&quot;Author&quot;, &quot;value&quot;:&quot;John Doe&quot;}, {&quot;key&quot;:&quot;Format&quot;, &quot;value&quot;:&quot;Tutorial&quot;}],
  mp4_support: true,
  panoramic: false,
  player_id: pl45KFKdlddgk654dspkze,
  public: false,
  published_at: 2019-12-16T08:25:51.000Z,
  source: null,
  tags: &quot;tags&quot;: [&quot;maths&quot;, &quot;string theory&quot;, &quot;video&quot;],
  title: Maths video,
  updated_at: 2019-12-16T08:15:51Z,
  video_id: vi4k0jvEUuaTdRAEjQ4Prklg
)
```

