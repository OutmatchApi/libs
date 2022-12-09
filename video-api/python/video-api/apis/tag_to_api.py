import typing_extensions

from video-api.apis.tags import TagValues
from video-api.apis.tags.account_api import AccountApi
from video-api.apis.tags.analytics_api import AnalyticsApi
from video-api.apis.tags.authentication_api import AuthenticationApi
from video-api.apis.tags.captions_api import CaptionsApi
from video-api.apis.tags.chapters_api import ChaptersApi
from video-api.apis.tags.live_api import LiveApi
from video-api.apis.tags.players_api import PlayersApi
from video-api.apis.tags.videos_api import VideosApi
from video-api.apis.tags.videos_delegated_upload_api import VideosDelegatedUploadApi
from video-api.apis.tags.webhooks_api import WebhooksApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.ACCOUNT: AccountApi,
        TagValues.ANALYTICS: AnalyticsApi,
        TagValues.AUTHENTICATION: AuthenticationApi,
        TagValues.CAPTIONS: CaptionsApi,
        TagValues.CHAPTERS: ChaptersApi,
        TagValues.LIVE: LiveApi,
        TagValues.PLAYERS: PlayersApi,
        TagValues.VIDEOS: VideosApi,
        TagValues.VIDEOS__DELEGATED_UPLOAD: VideosDelegatedUploadApi,
        TagValues.WEBHOOKS: WebhooksApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.ACCOUNT: AccountApi,
        TagValues.ANALYTICS: AnalyticsApi,
        TagValues.AUTHENTICATION: AuthenticationApi,
        TagValues.CAPTIONS: CaptionsApi,
        TagValues.CHAPTERS: ChaptersApi,
        TagValues.LIVE: LiveApi,
        TagValues.PLAYERS: PlayersApi,
        TagValues.VIDEOS: VideosApi,
        TagValues.VIDEOS__DELEGATED_UPLOAD: VideosDelegatedUploadApi,
        TagValues.WEBHOOKS: WebhooksApi,
    }
)
