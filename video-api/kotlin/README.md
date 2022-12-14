# video-api - Kotlin client library for api.video

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: 1.0.1
- Package version: 
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen

## Requires

* Kotlin 1.6.10
* Gradle 7.5

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://ws.api.video*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**gETAccount**](docs/AccountApi.md#getaccount) | **GET** /account | Show account
*AnalyticsApi* | [**gETAnalyticsLiveStreamsLiveStreamId**](docs/AnalyticsApi.md#getanalyticslivestreamslivestreamid) | **GET** /analytics/live-streams/{liveStreamId} | List live stream player sessions
*AnalyticsApi* | [**gETAnalyticsSessionsSessionIdEvents**](docs/AnalyticsApi.md#getanalyticssessionssessionidevents) | **GET** /analytics/sessions/{sessionId}/events | List player session events
*AnalyticsApi* | [**gETAnalyticsVideosVideoId**](docs/AnalyticsApi.md#getanalyticsvideosvideoid) | **GET** /analytics/videos/{videoId} | List video player sessions
*AuthenticationApi* | [**pOSTAuthApiKey**](docs/AuthenticationApi.md#postauthapikey) | **POST** /auth/api-key | Authenticate
*AuthenticationApi* | [**pOSTAuthRefresh**](docs/AuthenticationApi.md#postauthrefresh) | **POST** /auth/refresh | Refresh token
*CaptionsApi* | [**dELETEVideosVideoIdCaptionsLanguage**](docs/CaptionsApi.md#deletevideosvideoidcaptionslanguage) | **DELETE** /videos/{videoId}/captions/{language} | Delete a caption
*CaptionsApi* | [**gETVideosVideoIdCaptions**](docs/CaptionsApi.md#getvideosvideoidcaptions) | **GET** /videos/{videoId}/captions | List video captions
*CaptionsApi* | [**gETVideosVideoIdCaptionsLanguage**](docs/CaptionsApi.md#getvideosvideoidcaptionslanguage) | **GET** /videos/{videoId}/captions/{language} | Show a caption
*CaptionsApi* | [**pATCHVideosVideoIdCaptionsLanguage**](docs/CaptionsApi.md#patchvideosvideoidcaptionslanguage) | **PATCH** /videos/{videoId}/captions/{language} | Update caption
*CaptionsApi* | [**pOSTVideosVideoIdCaptionsLanguage**](docs/CaptionsApi.md#postvideosvideoidcaptionslanguage) | **POST** /videos/{videoId}/captions/{language} | Upload a caption
*ChaptersApi* | [**dELETEVideosVideoIdChaptersLanguage**](docs/ChaptersApi.md#deletevideosvideoidchapterslanguage) | **DELETE** /videos/{videoId}/chapters/{language} | Delete a chapter
*ChaptersApi* | [**gETVideosVideoIdChapters**](docs/ChaptersApi.md#getvideosvideoidchapters) | **GET** /videos/{videoId}/chapters | List video chapters
*ChaptersApi* | [**gETVideosVideoIdChaptersLanguage**](docs/ChaptersApi.md#getvideosvideoidchapterslanguage) | **GET** /videos/{videoId}/chapters/{language} | Show a chapter
*ChaptersApi* | [**pOSTVideosVideoIdChaptersLanguage**](docs/ChaptersApi.md#postvideosvideoidchapterslanguage) | **POST** /videos/{videoId}/chapters/{language} | Upload a chapter
*LiveApi* | [**dELETELiveStreamsLiveStreamId**](docs/LiveApi.md#deletelivestreamslivestreamid) | **DELETE** /live-streams/{liveStreamId} | Delete a live stream
*LiveApi* | [**dELETELiveStreamsLiveStreamIdThumbnail**](docs/LiveApi.md#deletelivestreamslivestreamidthumbnail) | **DELETE** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail
*LiveApi* | [**gETLiveStreams**](docs/LiveApi.md#getlivestreams) | **GET** /live-streams | List all live streams
*LiveApi* | [**gETLiveStreamsLiveStreamId**](docs/LiveApi.md#getlivestreamslivestreamid) | **GET** /live-streams/{liveStreamId} | Show live stream
*LiveApi* | [**pATCHLiveStreamsLiveStreamId**](docs/LiveApi.md#patchlivestreamslivestreamid) | **PATCH** /live-streams/{liveStreamId} | Update a live stream
*LiveApi* | [**pOSTLiveStreams**](docs/LiveApi.md#postlivestreams) | **POST** /live-streams | Create live stream
*LiveApi* | [**pOSTLiveStreamsLiveStreamIdThumbnail**](docs/LiveApi.md#postlivestreamslivestreamidthumbnail) | **POST** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail
*PlayersApi* | [**dELETEPlayersPlayerId**](docs/PlayersApi.md#deleteplayersplayerid) | **DELETE** /players/{playerId} | Delete a player
*PlayersApi* | [**dELETEPlayersPlayerIdLogo**](docs/PlayersApi.md#deleteplayersplayeridlogo) | **DELETE** /players/{playerId}/logo | Delete logo
*PlayersApi* | [**gETPlayers**](docs/PlayersApi.md#getplayers) | **GET** /players | List all players
*PlayersApi* | [**gETPlayersPlayerId**](docs/PlayersApi.md#getplayersplayerid) | **GET** /players/{playerId} | Show a player
*PlayersApi* | [**pATCHPlayersPlayerId**](docs/PlayersApi.md#patchplayersplayerid) | **PATCH** /players/{playerId} | Update a player
*PlayersApi* | [**pOSTPlayers**](docs/PlayersApi.md#postplayers) | **POST** /players | Create a player
*PlayersApi* | [**pOSTPlayersPlayerIdLogo**](docs/PlayersApi.md#postplayersplayeridlogo) | **POST** /players/{playerId}/logo | Upload a logo
*VideosApi* | [**dELETEVideo**](docs/VideosApi.md#deletevideo) | **DELETE** /videos/{videoId} | Delete a video
*VideosApi* | [**gETVideo**](docs/VideosApi.md#getvideo) | **GET** /videos/{videoId} | Show a video
*VideosApi* | [**gETVideoStatus**](docs/VideosApi.md#getvideostatus) | **GET** /videos/{videoId}/status | Show video status
*VideosApi* | [**lISTVideos**](docs/VideosApi.md#listvideos) | **GET** /videos | List all videos
*VideosApi* | [**pATCHVideo**](docs/VideosApi.md#patchvideo) | **PATCH** /videos/{videoId} | Update a video
*VideosApi* | [**pATCHVideosVideoIdThumbnail**](docs/VideosApi.md#patchvideosvideoidthumbnail) | **PATCH** /videos/{videoId}/thumbnail | Pick a thumbnail
*VideosApi* | [**pOSTVideo**](docs/VideosApi.md#postvideo) | **POST** /videos | Create a video
*VideosApi* | [**pOSTVideosVideoIdSource**](docs/VideosApi.md#postvideosvideoidsource) | **POST** /videos/{videoId}/source | Upload a video
*VideosApi* | [**pOSTVideosVideoIdThumbnail**](docs/VideosApi.md#postvideosvideoidthumbnail) | **POST** /videos/{videoId}/thumbnail | Upload a thumbnail
*VideosDelegatedUploadApi* | [**dELETEUploadTokensUploadToken**](docs/VideosDelegatedUploadApi.md#deleteuploadtokensuploadtoken) | **DELETE** /upload-tokens/{uploadToken} | Delete an upload token
*VideosDelegatedUploadApi* | [**gETUploadTokens**](docs/VideosDelegatedUploadApi.md#getuploadtokens) | **GET** /upload-tokens | List all active upload tokens.
*VideosDelegatedUploadApi* | [**gETUploadTokensUploadToken**](docs/VideosDelegatedUploadApi.md#getuploadtokensuploadtoken) | **GET** /upload-tokens/{uploadToken} | Show upload token
*VideosDelegatedUploadApi* | [**pOSTUpload**](docs/VideosDelegatedUploadApi.md#postupload) | **POST** /upload | Upload with an upload token
*VideosDelegatedUploadApi* | [**pOSTUploadTokens**](docs/VideosDelegatedUploadApi.md#postuploadtokens) | **POST** /upload-tokens | Generate an upload token
*WebhooksApi* | [**dELETEWebhook**](docs/WebhooksApi.md#deletewebhook) | **DELETE** /webhooks/{webhookId} | Delete a Webhook
*WebhooksApi* | [**gETWebhook**](docs/WebhooksApi.md#getwebhook) | **GET** /webhooks/{webhookId} | Show Webhook details
*WebhooksApi* | [**lISTWebhooks**](docs/WebhooksApi.md#listwebhooks) | **GET** /webhooks | List all webhooks
*WebhooksApi* | [**pOSTWebhooks**](docs/WebhooksApi.md#postwebhooks) | **POST** /webhooks | Create Webhook


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.outmatchapi.video-api.AccessMinusToken](docs/AccessMinusToken.md)
 - [com.outmatchapi.video-api.Account](docs/Account.md)
 - [com.outmatchapi.video-api.AccountQuota](docs/AccountQuota.md)
 - [com.outmatchapi.video-api.AuthenticateMinusPayload](docs/AuthenticateMinusPayload.md)
 - [com.outmatchapi.video-api.BadMinusRequest](docs/BadMinusRequest.md)
 - [com.outmatchapi.video-api.BytesRange](docs/BytesRange.md)
 - [com.outmatchapi.video-api.CaptionsMinusListMinusResponse](docs/CaptionsMinusListMinusResponse.md)
 - [com.outmatchapi.video-api.CaptionsMinusUpdateMinusPayload](docs/CaptionsMinusUpdateMinusPayload.md)
 - [com.outmatchapi.video-api.Chapter](docs/Chapter.md)
 - [com.outmatchapi.video-api.ChaptersMinusListMinusResponse](docs/ChaptersMinusListMinusResponse.md)
 - [com.outmatchapi.video-api.Link](docs/Link.md)
 - [com.outmatchapi.video-api.LiveMinusStream](docs/LiveMinusStream.md)
 - [com.outmatchapi.video-api.LiveMinusStreamMinusCreateMinusPayload](docs/LiveMinusStreamMinusCreateMinusPayload.md)
 - [com.outmatchapi.video-api.LiveMinusStreamMinusListMinusResponse](docs/LiveMinusStreamMinusListMinusResponse.md)
 - [com.outmatchapi.video-api.LiveMinusStreamMinusSession](docs/LiveMinusStreamMinusSession.md)
 - [com.outmatchapi.video-api.LiveMinusStreamMinusUpdateMinusPayload](docs/LiveMinusStreamMinusUpdateMinusPayload.md)
 - [com.outmatchapi.video-api.LiveStreamAssets](docs/LiveStreamAssets.md)
 - [com.outmatchapi.video-api.LiveStreamSessionClient](docs/LiveStreamSessionClient.md)
 - [com.outmatchapi.video-api.LiveStreamSessionDevice](docs/LiveStreamSessionDevice.md)
 - [com.outmatchapi.video-api.LiveStreamSessionLocation](docs/LiveStreamSessionLocation.md)
 - [com.outmatchapi.video-api.LiveStreamSessionReferrer](docs/LiveStreamSessionReferrer.md)
 - [com.outmatchapi.video-api.LiveStreamSessionSession](docs/LiveStreamSessionSession.md)
 - [com.outmatchapi.video-api.Metadata](docs/Metadata.md)
 - [com.outmatchapi.video-api.NotMinusFound](docs/NotMinusFound.md)
 - [com.outmatchapi.video-api.Pagination](docs/Pagination.md)
 - [com.outmatchapi.video-api.PaginationLink](docs/PaginationLink.md)
 - [com.outmatchapi.video-api.Player](docs/Player.md)
 - [com.outmatchapi.video-api.PlayerAllOf](docs/PlayerAllOf.md)
 - [com.outmatchapi.video-api.PlayerAllOfAssets](docs/PlayerAllOfAssets.md)
 - [com.outmatchapi.video-api.PlayerCreationPayload](docs/PlayerCreationPayload.md)
 - [com.outmatchapi.video-api.PlayerMinusSessionMinusEvent](docs/PlayerMinusSessionMinusEvent.md)
 - [com.outmatchapi.video-api.PlayerUpdatePayload](docs/PlayerUpdatePayload.md)
 - [com.outmatchapi.video-api.Playerinput](docs/Playerinput.md)
 - [com.outmatchapi.video-api.PlayersMinusListMinusResponse](docs/PlayersMinusListMinusResponse.md)
 - [com.outmatchapi.video-api.Quality](docs/Quality.md)
 - [com.outmatchapi.video-api.RawMinusStatisticsMinusListMinusLiveMinusStreamMinusAnalyticsMinusResponse](docs/RawMinusStatisticsMinusListMinusLiveMinusStreamMinusAnalyticsMinusResponse.md)
 - [com.outmatchapi.video-api.RawMinusStatisticsMinusListMinusPlayerMinusSessionMinusEventsMinusResponse](docs/RawMinusStatisticsMinusListMinusPlayerMinusSessionMinusEventsMinusResponse.md)
 - [com.outmatchapi.video-api.RawMinusStatisticsMinusListMinusSessionsMinusResponse](docs/RawMinusStatisticsMinusListMinusSessionsMinusResponse.md)
 - [com.outmatchapi.video-api.RefreshMinusTokenMinusPayload](docs/RefreshMinusTokenMinusPayload.md)
 - [com.outmatchapi.video-api.Subtitle](docs/Subtitle.md)
 - [com.outmatchapi.video-api.TokenMinusCreateMinusPayload](docs/TokenMinusCreateMinusPayload.md)
 - [com.outmatchapi.video-api.TokenMinusListMinusResponse](docs/TokenMinusListMinusResponse.md)
 - [com.outmatchapi.video-api.UploadMinusToken](docs/UploadMinusToken.md)
 - [com.outmatchapi.video-api.Video](docs/Video.md)
 - [com.outmatchapi.video-api.VideoAssets](docs/VideoAssets.md)
 - [com.outmatchapi.video-api.VideoMinusCreateMinusPayload](docs/VideoMinusCreateMinusPayload.md)
 - [com.outmatchapi.video-api.VideoMinusSession](docs/VideoMinusSession.md)
 - [com.outmatchapi.video-api.VideoMinusThumbnailMinusPickMinusPayload](docs/VideoMinusThumbnailMinusPickMinusPayload.md)
 - [com.outmatchapi.video-api.VideoMinusUpdateMinusPayload](docs/VideoMinusUpdateMinusPayload.md)
 - [com.outmatchapi.video-api.VideoSessionClient](docs/VideoSessionClient.md)
 - [com.outmatchapi.video-api.VideoSessionDevice](docs/VideoSessionDevice.md)
 - [com.outmatchapi.video-api.VideoSessionLocation](docs/VideoSessionLocation.md)
 - [com.outmatchapi.video-api.VideoSessionOs](docs/VideoSessionOs.md)
 - [com.outmatchapi.video-api.VideoSessionReferrer](docs/VideoSessionReferrer.md)
 - [com.outmatchapi.video-api.VideoSessionSession](docs/VideoSessionSession.md)
 - [com.outmatchapi.video-api.VideoSource](docs/VideoSource.md)
 - [com.outmatchapi.video-api.VideoSourceLiveStream](docs/VideoSourceLiveStream.md)
 - [com.outmatchapi.video-api.VideoSourceLiveStreamLink](docs/VideoSourceLiveStreamLink.md)
 - [com.outmatchapi.video-api.VideosMinusListMinusResponse](docs/VideosMinusListMinusResponse.md)
 - [com.outmatchapi.video-api.Videostatus](docs/Videostatus.md)
 - [com.outmatchapi.video-api.VideostatusEncoding](docs/VideostatusEncoding.md)
 - [com.outmatchapi.video-api.VideostatusEncodingMetadata](docs/VideostatusEncodingMetadata.md)
 - [com.outmatchapi.video-api.VideostatusIngest](docs/VideostatusIngest.md)
 - [com.outmatchapi.video-api.Webhook](docs/Webhook.md)
 - [com.outmatchapi.video-api.WebhooksMinusCreateMinusPayload](docs/WebhooksMinusCreateMinusPayload.md)
 - [com.outmatchapi.video-api.WebhooksMinusListMinusResponse](docs/WebhooksMinusListMinusResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="bearerAuth"></a>
### bearerAuth

- **Type**: HTTP basic authentication

