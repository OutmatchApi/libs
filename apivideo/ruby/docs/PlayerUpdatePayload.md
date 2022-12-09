# apivideo::PlayerUpdatePayload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **background_bottom** | **String** | RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7) | [optional] |
| **background_text** | **String** | RGBA color for title text. Default: rgba(255, 255, 255, 1) | [optional] |
| **background_top** | **String** | RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7) | [optional] |
| **enable_api** | **Boolean** | enable/disable player SDK access. Default: true | [optional][default to true] |
| **enable_controls** | **Boolean** | enable/disable player controls. Default: true | [optional][default to true] |
| **force_autoplay** | **Boolean** | enable/disable player autoplay. Default: false | [optional][default to false] |
| **force_loop** | **Boolean** | enable/disable looping. Default: false | [optional][default to false] |
| **hide_title** | **Boolean** | enable/disable title. Default: false | [optional][default to false] |
| **link** | **String** | RGBA color for all controls. Default: rgba(255, 255, 255, 1) | [optional] |
| **link_hover** | **String** | RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1) | [optional] |
| **text** | **String** | RGBA color for timer text. Default: rgba(255, 255, 255, 1) | [optional] |
| **track_background** | **String** | RGBA color playback bar: background. Default: rgba(255, 255, 255, .2) | [optional] |
| **track_played** | **String** | RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95) | [optional] |
| **track_unplayed** | **String** | RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35) | [optional] |

## Example

```ruby
require 'apivideo'

instance = apivideo::PlayerUpdatePayload.new(
  background_bottom: null,
  background_text: null,
  background_top: null,
  enable_api: null,
  enable_controls: null,
  force_autoplay: null,
  force_loop: null,
  hide_title: null,
  link: null,
  link_hover: null,
  text: null,
  track_background: null,
  track_played: null,
  track_unplayed: null
)
```

