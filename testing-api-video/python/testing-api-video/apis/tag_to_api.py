import typing_extensions

from testing-api-video.apis.tags import TagValues
from testing-api-video.apis.tags.account_api import AccountApi
from testing-api-video.apis.tags.analytics_api import AnalyticsApi
from testing-api-video.apis.tags.authentication_api import AuthenticationApi
from testing-api-video.apis.tags.captions_api import CaptionsApi
from testing-api-video.apis.tags.chapters_api import ChaptersApi
from testing-api-video.apis.tags.live_api import LiveApi
from testing-api-video.apis.tags.players_api import PlayersApi
from testing-api-video.apis.tags.videos_api import VideosApi
from testing-api-video.apis.tags.videos_delegated_upload_api import VideosDelegatedUploadApi
from testing-api-video.apis.tags.webhooks_api import WebhooksApi

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
