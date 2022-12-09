# coding: utf-8

# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from video-api.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from video-api.model.access_token import AccessToken
from video-api.model.account import Account
from video-api.model.authenticate_payload import AuthenticatePayload
from video-api.model.bad_request import BadRequest
from video-api.model.bytes_range import BytesRange
from video-api.model.captions_list_response import CaptionsListResponse
from video-api.model.captions_update_payload import CaptionsUpdatePayload
from video-api.model.chapter import Chapter
from video-api.model.chapters_list_response import ChaptersListResponse
from video-api.model.link import Link
from video-api.model.live_stream import LiveStream
from video-api.model.live_stream_assets import LiveStreamAssets
from video-api.model.live_stream_create_payload import LiveStreamCreatePayload
from video-api.model.live_stream_list_response import LiveStreamListResponse
from video-api.model.live_stream_session import LiveStreamSession
from video-api.model.live_stream_session_client import LiveStreamSessionClient
from video-api.model.live_stream_session_device import LiveStreamSessionDevice
from video-api.model.live_stream_session_location import LiveStreamSessionLocation
from video-api.model.live_stream_session_referrer import LiveStreamSessionReferrer
from video-api.model.live_stream_session_session import LiveStreamSessionSession
from video-api.model.live_stream_update_payload import LiveStreamUpdatePayload
from video-api.model.metadata import Metadata
from video-api.model.not_found import NotFound
from video-api.model.pagination import Pagination
from video-api.model.pagination_link import PaginationLink
from video-api.model.player import Player
from video-api.model.player_creation_payload import PlayerCreationPayload
from video-api.model.player_session_event import PlayerSessionEvent
from video-api.model.player_update_payload import PlayerUpdatePayload
from video-api.model.playerinput import Playerinput
from video-api.model.players_list_response import PlayersListResponse
from video-api.model.quality import Quality
from video-api.model.raw_statistics_list_live_stream_analytics_response import RawStatisticsListLiveStreamAnalyticsResponse
from video-api.model.raw_statistics_list_player_session_events_response import RawStatisticsListPlayerSessionEventsResponse
from video-api.model.raw_statistics_list_sessions_response import RawStatisticsListSessionsResponse
from video-api.model.refresh_token_payload import RefreshTokenPayload
from video-api.model.subtitle import Subtitle
from video-api.model.token_create_payload import TokenCreatePayload
from video-api.model.token_list_response import TokenListResponse
from video-api.model.upload_token import UploadToken
from video-api.model.video import Video
from video-api.model.video_assets import VideoAssets
from video-api.model.video_create_payload import VideoCreatePayload
from video-api.model.video_session import VideoSession
from video-api.model.video_session_client import VideoSessionClient
from video-api.model.video_session_device import VideoSessionDevice
from video-api.model.video_session_location import VideoSessionLocation
from video-api.model.video_session_os import VideoSessionOs
from video-api.model.video_session_referrer import VideoSessionReferrer
from video-api.model.video_session_session import VideoSessionSession
from video-api.model.video_source import VideoSource
from video-api.model.video_source_live_stream import VideoSourceLiveStream
from video-api.model.video_source_live_stream_link import VideoSourceLiveStreamLink
from video-api.model.video_thumbnail_pick_payload import VideoThumbnailPickPayload
from video-api.model.video_update_payload import VideoUpdatePayload
from video-api.model.videos_list_response import VideosListResponse
from video-api.model.videostatus import Videostatus
from video-api.model.videostatus_encoding import VideostatusEncoding
from video-api.model.videostatus_encoding_metadata import VideostatusEncodingMetadata
from video-api.model.videostatus_ingest import VideostatusIngest
from video-api.model.webhook import Webhook
from video-api.model.webhooks_create_payload import WebhooksCreatePayload
from video-api.model.webhooks_list_response import WebhooksListResponse
