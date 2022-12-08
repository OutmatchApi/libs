import typing_extensions

from testing-api-video.paths import PathValues
from testing-api-video.apis.paths.account import Account
from testing-api-video.apis.paths.analytics_live_streams_live_stream_id import AnalyticsLiveStreamsLiveStreamId
from testing-api-video.apis.paths.analytics_sessions_session_id_events import AnalyticsSessionsSessionIdEvents
from testing-api-video.apis.paths.analytics_videos_video_id import AnalyticsVideosVideoId
from testing-api-video.apis.paths.auth_api_key import AuthApiKey
from testing-api-video.apis.paths.auth_refresh import AuthRefresh
from testing-api-video.apis.paths.live_streams import LiveStreams
from testing-api-video.apis.paths.live_streams_live_stream_id import LiveStreamsLiveStreamId
from testing-api-video.apis.paths.live_streams_live_stream_id_thumbnail import LiveStreamsLiveStreamIdThumbnail
from testing-api-video.apis.paths.players import Players
from testing-api-video.apis.paths.players_player_id import PlayersPlayerId
from testing-api-video.apis.paths.players_player_id_logo import PlayersPlayerIdLogo
from testing-api-video.apis.paths.upload import Upload
from testing-api-video.apis.paths.upload_tokens import UploadTokens
from testing-api-video.apis.paths.upload_tokens_upload_token import UploadTokensUploadToken
from testing-api-video.apis.paths.videos import Videos
from testing-api-video.apis.paths.videos_video_id import VideosVideoId
from testing-api-video.apis.paths.videos_video_id_captions import VideosVideoIdCaptions
from testing-api-video.apis.paths.videos_video_id_captions_language import VideosVideoIdCaptionsLanguage
from testing-api-video.apis.paths.videos_video_id_chapters import VideosVideoIdChapters
from testing-api-video.apis.paths.videos_video_id_chapters_language import VideosVideoIdChaptersLanguage
from testing-api-video.apis.paths.videos_video_id_source import VideosVideoIdSource
from testing-api-video.apis.paths.videos_video_id_status import VideosVideoIdStatus
from testing-api-video.apis.paths.videos_video_id_thumbnail import VideosVideoIdThumbnail
from testing-api-video.apis.paths.webhooks import Webhooks
from testing-api-video.apis.paths.webhooks_webhook_id import WebhooksWebhookId

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.ACCOUNT: Account,
        PathValues.ANALYTICS_LIVESTREAMS_LIVE_STREAM_ID: AnalyticsLiveStreamsLiveStreamId,
        PathValues.ANALYTICS_SESSIONS_SESSION_ID_EVENTS: AnalyticsSessionsSessionIdEvents,
        PathValues.ANALYTICS_VIDEOS_VIDEO_ID: AnalyticsVideosVideoId,
        PathValues.AUTH_APIKEY: AuthApiKey,
        PathValues.AUTH_REFRESH: AuthRefresh,
        PathValues.LIVESTREAMS: LiveStreams,
        PathValues.LIVESTREAMS_LIVE_STREAM_ID: LiveStreamsLiveStreamId,
        PathValues.LIVESTREAMS_LIVE_STREAM_ID_THUMBNAIL: LiveStreamsLiveStreamIdThumbnail,
        PathValues.PLAYERS: Players,
        PathValues.PLAYERS_PLAYER_ID: PlayersPlayerId,
        PathValues.PLAYERS_PLAYER_ID_LOGO: PlayersPlayerIdLogo,
        PathValues.UPLOAD: Upload,
        PathValues.UPLOADTOKENS: UploadTokens,
        PathValues.UPLOADTOKENS_UPLOAD_TOKEN: UploadTokensUploadToken,
        PathValues.VIDEOS: Videos,
        PathValues.VIDEOS_VIDEO_ID: VideosVideoId,
        PathValues.VIDEOS_VIDEO_ID_CAPTIONS: VideosVideoIdCaptions,
        PathValues.VIDEOS_VIDEO_ID_CAPTIONS_LANGUAGE: VideosVideoIdCaptionsLanguage,
        PathValues.VIDEOS_VIDEO_ID_CHAPTERS: VideosVideoIdChapters,
        PathValues.VIDEOS_VIDEO_ID_CHAPTERS_LANGUAGE: VideosVideoIdChaptersLanguage,
        PathValues.VIDEOS_VIDEO_ID_SOURCE: VideosVideoIdSource,
        PathValues.VIDEOS_VIDEO_ID_STATUS: VideosVideoIdStatus,
        PathValues.VIDEOS_VIDEO_ID_THUMBNAIL: VideosVideoIdThumbnail,
        PathValues.WEBHOOKS: Webhooks,
        PathValues.WEBHOOKS_WEBHOOK_ID: WebhooksWebhookId,
    }
)

path_to_api = PathToApi(
    {
        PathValues.ACCOUNT: Account,
        PathValues.ANALYTICS_LIVESTREAMS_LIVE_STREAM_ID: AnalyticsLiveStreamsLiveStreamId,
        PathValues.ANALYTICS_SESSIONS_SESSION_ID_EVENTS: AnalyticsSessionsSessionIdEvents,
        PathValues.ANALYTICS_VIDEOS_VIDEO_ID: AnalyticsVideosVideoId,
        PathValues.AUTH_APIKEY: AuthApiKey,
        PathValues.AUTH_REFRESH: AuthRefresh,
        PathValues.LIVESTREAMS: LiveStreams,
        PathValues.LIVESTREAMS_LIVE_STREAM_ID: LiveStreamsLiveStreamId,
        PathValues.LIVESTREAMS_LIVE_STREAM_ID_THUMBNAIL: LiveStreamsLiveStreamIdThumbnail,
        PathValues.PLAYERS: Players,
        PathValues.PLAYERS_PLAYER_ID: PlayersPlayerId,
        PathValues.PLAYERS_PLAYER_ID_LOGO: PlayersPlayerIdLogo,
        PathValues.UPLOAD: Upload,
        PathValues.UPLOADTOKENS: UploadTokens,
        PathValues.UPLOADTOKENS_UPLOAD_TOKEN: UploadTokensUploadToken,
        PathValues.VIDEOS: Videos,
        PathValues.VIDEOS_VIDEO_ID: VideosVideoId,
        PathValues.VIDEOS_VIDEO_ID_CAPTIONS: VideosVideoIdCaptions,
        PathValues.VIDEOS_VIDEO_ID_CAPTIONS_LANGUAGE: VideosVideoIdCaptionsLanguage,
        PathValues.VIDEOS_VIDEO_ID_CHAPTERS: VideosVideoIdChapters,
        PathValues.VIDEOS_VIDEO_ID_CHAPTERS_LANGUAGE: VideosVideoIdChaptersLanguage,
        PathValues.VIDEOS_VIDEO_ID_SOURCE: VideosVideoIdSource,
        PathValues.VIDEOS_VIDEO_ID_STATUS: VideosVideoIdStatus,
        PathValues.VIDEOS_VIDEO_ID_THUMBNAIL: VideosVideoIdThumbnail,
        PathValues.WEBHOOKS: Webhooks,
        PathValues.WEBHOOKS_WEBHOOK_ID: WebhooksWebhookId,
    }
)
