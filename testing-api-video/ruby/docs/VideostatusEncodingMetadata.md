# testing-api-video::VideostatusEncodingMetadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **aspect_ratio** | **String** |  | [optional] |
| **audio_codec** | **String** | The method used to compress and decompress digital audio for your video. | [optional] |
| **bitrate** | **Float** | The number of bits processed per second. | [optional] |
| **duration** | **Integer** | The length of the video. | [optional] |
| **framerate** | **Integer** | The frequency with which consecutive images or frames appear on a display. Shown in this API as frames per second (fps). | [optional] |
| **height** | **Integer** | The height of the video in pixels. | [optional] |
| **samplerate** | **Integer** | How many samples per second a digital audio system uses to record an audio signal. The higher the rate, the higher the frequencies that can be recorded. They are presented in this API using hertz. | [optional] |
| **video_codec** | **String** | The method used to compress and decompress digital video. API Video supports all codecs in the libavcodec library.  | [optional] |
| **width** | **Integer** | The width of the video in pixels. | [optional] |

## Example

```ruby
require 'testing-api-video'

instance = testing-api-video::VideostatusEncodingMetadata.new(
  aspect_ratio: null,
  audio_codec: null,
  bitrate: null,
  duration: null,
  framerate: 60,
  height: null,
  samplerate: 48000,
  video_codec: null,
  width: null
)
```

