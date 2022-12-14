# OpenAPIClient-php

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.


## Installation & Usage

### Requirements

PHP 7.4 and later.
Should also work with PHP 8.0.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



// Configure Bearer authorization: bearerAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->gETAccount();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AccountApi->gETAccount: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *https://ws.api.video*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**gETAccount**](docs/Api/AccountApi.md#getaccount) | **GET** /account | Show account
*AnalyticsApi* | [**gETAnalyticsLiveStreamsLiveStreamId**](docs/Api/AnalyticsApi.md#getanalyticslivestreamslivestreamid) | **GET** /analytics/live-streams/{liveStreamId} | List live stream player sessions
*AnalyticsApi* | [**gETAnalyticsSessionsSessionIdEvents**](docs/Api/AnalyticsApi.md#getanalyticssessionssessionidevents) | **GET** /analytics/sessions/{sessionId}/events | List player session events
*AnalyticsApi* | [**gETAnalyticsVideosVideoId**](docs/Api/AnalyticsApi.md#getanalyticsvideosvideoid) | **GET** /analytics/videos/{videoId} | List video player sessions
*AuthenticationApi* | [**pOSTAuthApiKey**](docs/Api/AuthenticationApi.md#postauthapikey) | **POST** /auth/api-key | Authenticate
*AuthenticationApi* | [**pOSTAuthRefresh**](docs/Api/AuthenticationApi.md#postauthrefresh) | **POST** /auth/refresh | Refresh token
*CaptionsApi* | [**dELETEVideosVideoIdCaptionsLanguage**](docs/Api/CaptionsApi.md#deletevideosvideoidcaptionslanguage) | **DELETE** /videos/{videoId}/captions/{language} | Delete a caption
*CaptionsApi* | [**gETVideosVideoIdCaptions**](docs/Api/CaptionsApi.md#getvideosvideoidcaptions) | **GET** /videos/{videoId}/captions | List video captions
*CaptionsApi* | [**gETVideosVideoIdCaptionsLanguage**](docs/Api/CaptionsApi.md#getvideosvideoidcaptionslanguage) | **GET** /videos/{videoId}/captions/{language} | Show a caption
*CaptionsApi* | [**pATCHVideosVideoIdCaptionsLanguage**](docs/Api/CaptionsApi.md#patchvideosvideoidcaptionslanguage) | **PATCH** /videos/{videoId}/captions/{language} | Update caption
*CaptionsApi* | [**pOSTVideosVideoIdCaptionsLanguage**](docs/Api/CaptionsApi.md#postvideosvideoidcaptionslanguage) | **POST** /videos/{videoId}/captions/{language} | Upload a caption
*ChaptersApi* | [**dELETEVideosVideoIdChaptersLanguage**](docs/Api/ChaptersApi.md#deletevideosvideoidchapterslanguage) | **DELETE** /videos/{videoId}/chapters/{language} | Delete a chapter
*ChaptersApi* | [**gETVideosVideoIdChapters**](docs/Api/ChaptersApi.md#getvideosvideoidchapters) | **GET** /videos/{videoId}/chapters | List video chapters
*ChaptersApi* | [**gETVideosVideoIdChaptersLanguage**](docs/Api/ChaptersApi.md#getvideosvideoidchapterslanguage) | **GET** /videos/{videoId}/chapters/{language} | Show a chapter
*ChaptersApi* | [**pOSTVideosVideoIdChaptersLanguage**](docs/Api/ChaptersApi.md#postvideosvideoidchapterslanguage) | **POST** /videos/{videoId}/chapters/{language} | Upload a chapter
*LiveApi* | [**dELETELiveStreamsLiveStreamId**](docs/Api/LiveApi.md#deletelivestreamslivestreamid) | **DELETE** /live-streams/{liveStreamId} | Delete a live stream
*LiveApi* | [**dELETELiveStreamsLiveStreamIdThumbnail**](docs/Api/LiveApi.md#deletelivestreamslivestreamidthumbnail) | **DELETE** /live-streams/{liveStreamId}/thumbnail | Delete a thumbnail
*LiveApi* | [**gETLiveStreams**](docs/Api/LiveApi.md#getlivestreams) | **GET** /live-streams | List all live streams
*LiveApi* | [**gETLiveStreamsLiveStreamId**](docs/Api/LiveApi.md#getlivestreamslivestreamid) | **GET** /live-streams/{liveStreamId} | Show live stream
*LiveApi* | [**pATCHLiveStreamsLiveStreamId**](docs/Api/LiveApi.md#patchlivestreamslivestreamid) | **PATCH** /live-streams/{liveStreamId} | Update a live stream
*LiveApi* | [**pOSTLiveStreams**](docs/Api/LiveApi.md#postlivestreams) | **POST** /live-streams | Create live stream
*LiveApi* | [**pOSTLiveStreamsLiveStreamIdThumbnail**](docs/Api/LiveApi.md#postlivestreamslivestreamidthumbnail) | **POST** /live-streams/{liveStreamId}/thumbnail | Upload a thumbnail
*PlayersApi* | [**dELETEPlayersPlayerId**](docs/Api/PlayersApi.md#deleteplayersplayerid) | **DELETE** /players/{playerId} | Delete a player
*PlayersApi* | [**dELETEPlayersPlayerIdLogo**](docs/Api/PlayersApi.md#deleteplayersplayeridlogo) | **DELETE** /players/{playerId}/logo | Delete logo
*PlayersApi* | [**gETPlayers**](docs/Api/PlayersApi.md#getplayers) | **GET** /players | List all players
*PlayersApi* | [**gETPlayersPlayerId**](docs/Api/PlayersApi.md#getplayersplayerid) | **GET** /players/{playerId} | Show a player
*PlayersApi* | [**pATCHPlayersPlayerId**](docs/Api/PlayersApi.md#patchplayersplayerid) | **PATCH** /players/{playerId} | Update a player
*PlayersApi* | [**pOSTPlayers**](docs/Api/PlayersApi.md#postplayers) | **POST** /players | Create a player
*PlayersApi* | [**pOSTPlayersPlayerIdLogo**](docs/Api/PlayersApi.md#postplayersplayeridlogo) | **POST** /players/{playerId}/logo | Upload a logo
*VideosApi* | [**dELETEVideo**](docs/Api/VideosApi.md#deletevideo) | **DELETE** /videos/{videoId} | Delete a video
*VideosApi* | [**gETVideo**](docs/Api/VideosApi.md#getvideo) | **GET** /videos/{videoId} | Show a video
*VideosApi* | [**gETVideoStatus**](docs/Api/VideosApi.md#getvideostatus) | **GET** /videos/{videoId}/status | Show video status
*VideosApi* | [**lISTVideos**](docs/Api/VideosApi.md#listvideos) | **GET** /videos | List all videos
*VideosApi* | [**pATCHVideo**](docs/Api/VideosApi.md#patchvideo) | **PATCH** /videos/{videoId} | Update a video
*VideosApi* | [**pATCHVideosVideoIdThumbnail**](docs/Api/VideosApi.md#patchvideosvideoidthumbnail) | **PATCH** /videos/{videoId}/thumbnail | Pick a thumbnail
*VideosApi* | [**pOSTVideo**](docs/Api/VideosApi.md#postvideo) | **POST** /videos | Create a video
*VideosApi* | [**pOSTVideosVideoIdSource**](docs/Api/VideosApi.md#postvideosvideoidsource) | **POST** /videos/{videoId}/source | Upload a video
*VideosApi* | [**pOSTVideosVideoIdThumbnail**](docs/Api/VideosApi.md#postvideosvideoidthumbnail) | **POST** /videos/{videoId}/thumbnail | Upload a thumbnail
*VideosDelegatedUploadApi* | [**dELETEUploadTokensUploadToken**](docs/Api/VideosDelegatedUploadApi.md#deleteuploadtokensuploadtoken) | **DELETE** /upload-tokens/{uploadToken} | Delete an upload token
*VideosDelegatedUploadApi* | [**gETUploadTokens**](docs/Api/VideosDelegatedUploadApi.md#getuploadtokens) | **GET** /upload-tokens | List all active upload tokens.
*VideosDelegatedUploadApi* | [**gETUploadTokensUploadToken**](docs/Api/VideosDelegatedUploadApi.md#getuploadtokensuploadtoken) | **GET** /upload-tokens/{uploadToken} | Show upload token
*VideosDelegatedUploadApi* | [**pOSTUpload**](docs/Api/VideosDelegatedUploadApi.md#postupload) | **POST** /upload | Upload with an upload token
*VideosDelegatedUploadApi* | [**pOSTUploadTokens**](docs/Api/VideosDelegatedUploadApi.md#postuploadtokens) | **POST** /upload-tokens | Generate an upload token
*WebhooksApi* | [**dELETEWebhook**](docs/Api/WebhooksApi.md#deletewebhook) | **DELETE** /webhooks/{webhookId} | Delete a Webhook
*WebhooksApi* | [**gETWebhook**](docs/Api/WebhooksApi.md#getwebhook) | **GET** /webhooks/{webhookId} | Show Webhook details
*WebhooksApi* | [**lISTWebhooks**](docs/Api/WebhooksApi.md#listwebhooks) | **GET** /webhooks | List all webhooks
*WebhooksApi* | [**pOSTWebhooks**](docs/Api/WebhooksApi.md#postwebhooks) | **POST** /webhooks | Create Webhook

## Models

- [AccessToken](docs/Model/AccessToken.md)
- [Account](docs/Model/Account.md)
- [AccountQuota](docs/Model/AccountQuota.md)
- [AuthenticatePayload](docs/Model/AuthenticatePayload.md)
- [BadRequest](docs/Model/BadRequest.md)
- [BytesRange](docs/Model/BytesRange.md)
- [CaptionsListResponse](docs/Model/CaptionsListResponse.md)
- [CaptionsUpdatePayload](docs/Model/CaptionsUpdatePayload.md)
- [Chapter](docs/Model/Chapter.md)
- [ChaptersListResponse](docs/Model/ChaptersListResponse.md)
- [Link](docs/Model/Link.md)
- [LiveStream](docs/Model/LiveStream.md)
- [LiveStreamAssets](docs/Model/LiveStreamAssets.md)
- [LiveStreamCreatePayload](docs/Model/LiveStreamCreatePayload.md)
- [LiveStreamListResponse](docs/Model/LiveStreamListResponse.md)
- [LiveStreamSession](docs/Model/LiveStreamSession.md)
- [LiveStreamSessionClient](docs/Model/LiveStreamSessionClient.md)
- [LiveStreamSessionDevice](docs/Model/LiveStreamSessionDevice.md)
- [LiveStreamSessionLocation](docs/Model/LiveStreamSessionLocation.md)
- [LiveStreamSessionReferrer](docs/Model/LiveStreamSessionReferrer.md)
- [LiveStreamSessionSession](docs/Model/LiveStreamSessionSession.md)
- [LiveStreamUpdatePayload](docs/Model/LiveStreamUpdatePayload.md)
- [Metadata](docs/Model/Metadata.md)
- [NotFound](docs/Model/NotFound.md)
- [Pagination](docs/Model/Pagination.md)
- [PaginationLink](docs/Model/PaginationLink.md)
- [Player](docs/Model/Player.md)
- [PlayerAllOf](docs/Model/PlayerAllOf.md)
- [PlayerAllOfAssets](docs/Model/PlayerAllOfAssets.md)
- [PlayerCreationPayload](docs/Model/PlayerCreationPayload.md)
- [PlayerSessionEvent](docs/Model/PlayerSessionEvent.md)
- [PlayerUpdatePayload](docs/Model/PlayerUpdatePayload.md)
- [Playerinput](docs/Model/Playerinput.md)
- [PlayersListResponse](docs/Model/PlayersListResponse.md)
- [Quality](docs/Model/Quality.md)
- [RawStatisticsListLiveStreamAnalyticsResponse](docs/Model/RawStatisticsListLiveStreamAnalyticsResponse.md)
- [RawStatisticsListPlayerSessionEventsResponse](docs/Model/RawStatisticsListPlayerSessionEventsResponse.md)
- [RawStatisticsListSessionsResponse](docs/Model/RawStatisticsListSessionsResponse.md)
- [RefreshTokenPayload](docs/Model/RefreshTokenPayload.md)
- [Subtitle](docs/Model/Subtitle.md)
- [TokenCreatePayload](docs/Model/TokenCreatePayload.md)
- [TokenListResponse](docs/Model/TokenListResponse.md)
- [UploadToken](docs/Model/UploadToken.md)
- [Video](docs/Model/Video.md)
- [VideoAssets](docs/Model/VideoAssets.md)
- [VideoCreatePayload](docs/Model/VideoCreatePayload.md)
- [VideoSession](docs/Model/VideoSession.md)
- [VideoSessionClient](docs/Model/VideoSessionClient.md)
- [VideoSessionDevice](docs/Model/VideoSessionDevice.md)
- [VideoSessionLocation](docs/Model/VideoSessionLocation.md)
- [VideoSessionOs](docs/Model/VideoSessionOs.md)
- [VideoSessionReferrer](docs/Model/VideoSessionReferrer.md)
- [VideoSessionSession](docs/Model/VideoSessionSession.md)
- [VideoSource](docs/Model/VideoSource.md)
- [VideoSourceLiveStream](docs/Model/VideoSourceLiveStream.md)
- [VideoSourceLiveStreamLink](docs/Model/VideoSourceLiveStreamLink.md)
- [VideoThumbnailPickPayload](docs/Model/VideoThumbnailPickPayload.md)
- [VideoUpdatePayload](docs/Model/VideoUpdatePayload.md)
- [VideosListResponse](docs/Model/VideosListResponse.md)
- [Videostatus](docs/Model/Videostatus.md)
- [VideostatusEncoding](docs/Model/VideostatusEncoding.md)
- [VideostatusEncodingMetadata](docs/Model/VideostatusEncodingMetadata.md)
- [VideostatusIngest](docs/Model/VideostatusIngest.md)
- [Webhook](docs/Model/Webhook.md)
- [WebhooksCreatePayload](docs/Model/WebhooksCreatePayload.md)
- [WebhooksListResponse](docs/Model/WebhooksListResponse.md)

## Authorization

### bearerAuth

- **Type**: Bearer authentication

## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author



## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `1.0.0`
    - Package version: `1.0.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
