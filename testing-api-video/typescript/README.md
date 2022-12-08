## @apilibraries/testing-api-video@1.0.0

### Install

```
npm install @apilibraries/testing-api-video@1.0.0 --save

// Or with yarn

yarn add @apilibraries/testing-api-video@1.0.0

```

### Building

To build and compile the typescript sources to javascript use:
```
npm install
npm run build

// Or with yarn

yarn
yarn build
```

## Documentation for API Endpoints

All URIs are relative to *https://ws.api.video*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**gETAccount**](AccountApi.md#getaccount) | **GET** /account | Show account
*AnalyticsApi* | [**gETAnalyticsLiveStreamsLiveStreamId**](AnalyticsApi.md#getanalyticslivestreamslivestreamid) | **GET** /analytics/live-streams/{liveStreamId} | List live stream player sessions
*AnalyticsApi* | [**gETAnalyticsSessionsSessionIdEvents**](AnalyticsApi.md#getanalyticssessionssessionidevents) | **GET** /analytics/sessions/{sessionId}/events | List player session events
*AnalyticsApi* | [**gETAnalyticsVideosVideoId**](AnalyticsApi.md#getanalyticsvideosvideoid) | **GET** /analytics/videos/{videoId} | List video player sessions
*AuthenticationApi* | [**pOSTAuthApiKey**](AuthenticationApi.md#postauthapikey) | **POST** /auth/api-key | Authenticate
*AuthenticationApi* | [**pOSTAuthRefresh**](AuthenticationApi.md#postauthrefresh) | **POST** /auth/refresh | Refresh token
*CaptionsApi* | [**dELETEVideosVideoIdCaptionsLanguage**](CaptionsApi.md#deletevideosvideoidcaptionslanguage) | **DELETE** /videos/{videoId}/captions/{language} | Delete a caption
*CaptionsApi* | [**gETVideosVideoIdCaptions**](CaptionsApi.md#getvideosvideoidcaptions) | **GET** /videos/{videoId}/captions | List video captions
*CaptionsApi* | [**gETVideosVideoIdCaptionsLanguage**](CaptionsApi.md#getvideosvideoidcaptionslanguage) | **GET** /videos/{videoId}/captions/{language} | Show a caption
*CaptionsApi* | [**pATCHVideosVideoIdCaptionsLanguage**](CaptionsApi.md#patchvideosvideoidcaptionslanguage) | **PATCH** /videos/{videoId}/captions/{language} | Update caption
*CaptionsApi* | [**pOSTVideosVideoIdCaptionsLanguage**](CaptionsApi.md#postvideosvideoidcaptionslanguage) | **POST** /videos/{videoId}/captions/{language} | Upload a caption
*ChaptersApi* | [**dELETEVideosVideoIdChaptersLanguage**](ChaptersApi.md#deletevideosvideoidchapterslanguage) | **DELETE** /videos/{videoId}/chapters/{language} | Delete a chapter
*ChaptersApi* | [**gETVideosVideoIdChapters**](ChaptersApi.md#getvideosvideoidchapters) | **GET** /videos/{videoId}/chapters | List video chapters
*ChaptersApi* | [**gETVideosVideoIdChaptersLanguage**](ChaptersApi.md#getvideosvideoidchapterslanguage) | **GET** /videos/{videoId}/chapters/{language} | Show a chapter
*ChaptersApi* | [**pOSTVideosVideoIdChaptersLanguage**](ChaptersApi.md#postvideosvideoidchapterslanguage) | **POST** /videos/{videoId}/chapters/{language} | Upload a chapter
*LiveApi* | [**dELETELiveStreamsLiveStreamId**](LiveApi.md#deletelivestreamslivestreamid) | **DELETE** /live-streams/{liveStreamId} | Delete a live stream
*LiveApi* | [**dELETELiveStreamsLiveStreamIdThumbnail**](LiveApi.md#deletelivestreamslivestreamidthumbnail) | **DELETE** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail
*LiveApi* | [**gETLiveStreams**](LiveApi.md#getlivestreams) | **GET** /live-streams | List all live streams
*LiveApi* | [**gETLiveStreamsLiveStreamId**](LiveApi.md#getlivestreamslivestreamid) | **GET** /live-streams/{liveStreamId} | Show live stream
*LiveApi* | [**pATCHLiveStreamsLiveStreamId**](LiveApi.md#patchlivestreamslivestreamid) | **PATCH** /live-streams/{liveStreamId} | Update a live stream
*LiveApi* | [**pOSTLiveStreams**](LiveApi.md#postlivestreams) | **POST** /live-streams | Create live stream
*LiveApi* | [**pOSTLiveStreamsLiveStreamIdThumbnail**](LiveApi.md#postlivestreamslivestreamidthumbnail) | **POST** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail
*PlayersApi* | [**dELETEPlayersPlayerId**](PlayersApi.md#deleteplayersplayerid) | **DELETE** /players/{playerId} | Delete a player
*PlayersApi* | [**dELETEPlayersPlayerIdLogo**](PlayersApi.md#deleteplayersplayeridlogo) | **DELETE** /players/{playerId}/logo | Delete logo
*PlayersApi* | [**gETPlayers**](PlayersApi.md#getplayers) | **GET** /players | List all players
*PlayersApi* | [**gETPlayersPlayerId**](PlayersApi.md#getplayersplayerid) | **GET** /players/{playerId} | Show a player
*PlayersApi* | [**pATCHPlayersPlayerId**](PlayersApi.md#patchplayersplayerid) | **PATCH** /players/{playerId} | Update a player
*PlayersApi* | [**pOSTPlayers**](PlayersApi.md#postplayers) | **POST** /players | Create a player
*PlayersApi* | [**pOSTPlayersPlayerIdLogo**](PlayersApi.md#postplayersplayeridlogo) | **POST** /players/{playerId}/logo | Upload a logo
*VideosApi* | [**dELETEVideo**](VideosApi.md#deletevideo) | **DELETE** /videos/{videoId} | Delete a video
*VideosApi* | [**gETVideo**](VideosApi.md#getvideo) | **GET** /videos/{videoId} | Show a video
*VideosApi* | [**gETVideoStatus**](VideosApi.md#getvideostatus) | **GET** /videos/{videoId}/status | Show video status
*VideosApi* | [**lISTVideos**](VideosApi.md#listvideos) | **GET** /videos | List all videos
*VideosApi* | [**pATCHVideo**](VideosApi.md#patchvideo) | **PATCH** /videos/{videoId} | Update a video
*VideosApi* | [**pATCHVideosVideoIdThumbnail**](VideosApi.md#patchvideosvideoidthumbnail) | **PATCH** /videos/{videoId}/thumbnail | Pick a thumbnail
*VideosApi* | [**pOSTVideo**](VideosApi.md#postvideo) | **POST** /videos | Create a video
*VideosApi* | [**pOSTVideosVideoIdSource**](VideosApi.md#postvideosvideoidsource) | **POST** /videos/{videoId}/source | Upload a video
*VideosApi* | [**pOSTVideosVideoIdThumbnail**](VideosApi.md#postvideosvideoidthumbnail) | **POST** /videos/{videoId}/thumbnail | Upload a thumbnail
*VideosDelegatedUploadApi* | [**dELETEUploadTokensUploadToken**](VideosDelegatedUploadApi.md#deleteuploadtokensuploadtoken) | **DELETE** /upload-tokens/{uploadToken} | Delete an upload token
*VideosDelegatedUploadApi* | [**gETUploadTokens**](VideosDelegatedUploadApi.md#getuploadtokens) | **GET** /upload-tokens | List all active upload tokens.
*VideosDelegatedUploadApi* | [**gETUploadTokensUploadToken**](VideosDelegatedUploadApi.md#getuploadtokensuploadtoken) | **GET** /upload-tokens/{uploadToken} | Show upload token
*VideosDelegatedUploadApi* | [**pOSTUpload**](VideosDelegatedUploadApi.md#postupload) | **POST** /upload | Upload with an upload token
*VideosDelegatedUploadApi* | [**pOSTUploadTokens**](VideosDelegatedUploadApi.md#postuploadtokens) | **POST** /upload-tokens | Generate an upload token
*WebhooksApi* | [**dELETEWebhook**](WebhooksApi.md#deletewebhook) | **DELETE** /webhooks/{webhookId} | Delete a Webhook
*WebhooksApi* | [**gETWebhook**](WebhooksApi.md#getwebhook) | **GET** /webhooks/{webhookId} | Show Webhook details
*WebhooksApi* | [**lISTWebhooks**](WebhooksApi.md#listwebhooks) | **GET** /webhooks | List all webhooks
*WebhooksApi* | [**pOSTWebhooks**](WebhooksApi.md#postwebhooks) | **POST** /webhooks | Create Webhook

