
# VideoAssets

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hls** | [**java.net.URI**](java.net.URI.md) | This is the manifest URL. For HTTP Live Streaming (HLS), when a HLS video stream is initiated, the first file to download is the manifest. This file has the extension M3U8, and provides the video player with information about the various bitrates available for streaming. |  [optional]
**iframe** | **kotlin.String** | Code to use video from a third party website |  [optional]
**mp4** | [**java.net.URI**](java.net.URI.md) | Available only if mp4Support is enabled. Raw mp4 url. |  [optional]
**player** | [**java.net.URI**](java.net.URI.md) | Raw url of the player. |  [optional]
**thumbnail** | [**java.net.URI**](java.net.URI.md) | Poster of the video. |  [optional]



