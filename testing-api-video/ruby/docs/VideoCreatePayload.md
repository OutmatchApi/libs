# testing-api-video::VideoCreatePayload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** | A brief description of your video. | [optional] |
| **metadata** | [**Array&lt;Metadata&gt;**](Metadata.md) | A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. Read more on [dynamic metadata](https://api.video/blog/endpoints/dynamic-metadata). | [optional] |
| **mp4_support** | **Boolean** | Enables mp4 version in addition to streamed version. | [optional][default to true] |
| **panoramic** | **Boolean** | Indicates if your video is a 360/immersive video. | [optional][default to false] |
| **player_id** | **String** | The unique identification number for your video player. | [optional] |
| **public** | **Boolean** | Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos). | [optional][default to true] |
| **published_at** | **Time** | The API uses ISO-8601 format for time, and includes 3 places for milliseconds. | [optional] |
| **source** | **String** | If you add a video already on the web, this is where you enter the url for the video. | [optional] |
| **tags** | **Array&lt;String&gt;** | A list of tags you want to use to describe your video. | [optional] |
| **title** | **String** | The title of your new video. |  |

## Example

```ruby
require 'testing-api-video'

instance = testing-api-video::VideoCreatePayload.new(
  description: A video about string theory.,
  metadata: [{&quot;key&quot;: &quot;Author&quot;, &quot;value&quot;: &quot;John Doe&quot;}],
  mp4_support: true,
  panoramic: false,
  player_id: pl45KFKdlddgk654dspkze,
  public: true,
  published_at: 2020-07-14T23:36:18.598Z,
  source: https://www.myvideo.url.com/video.mp4,
  tags: [&quot;maths&quot;, &quot;string theory&quot;, &quot;video&quot;],
  title: Maths video
)
```

