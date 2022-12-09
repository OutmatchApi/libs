import typing_extensions

from apivideo.apis.tags import TagValues
from apivideo.apis.tags.account_api import AccountApi
from apivideo.apis.tags.analytics_api import AnalyticsApi
from apivideo.apis.tags.authentication_api import AuthenticationApi
from apivideo.apis.tags.captions_api import CaptionsApi
from apivideo.apis.tags.chapters_api import ChaptersApi
from apivideo.apis.tags.live_api import LiveApi
from apivideo.apis.tags.players_api import PlayersApi
from apivideo.apis.tags.videos_api import VideosApi
from apivideo.apis.tags.videos_delegated_upload_api import VideosDelegatedUploadApi
from apivideo.apis.tags.webhooks_api import WebhooksApi

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
