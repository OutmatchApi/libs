# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from video-api.apis.path_to_api import path_to_api

import enum


class PathValues(str, enum.Enum):
    ACCOUNT = "/account"
    ANALYTICS_LIVESTREAMS_LIVE_STREAM_ID = "/analytics/live-streams/{liveStreamId}"
    ANALYTICS_SESSIONS_SESSION_ID_EVENTS = "/analytics/sessions/{sessionId}/events"
    ANALYTICS_VIDEOS_VIDEO_ID = "/analytics/videos/{videoId}"
    AUTH_APIKEY = "/auth/api-key"
    AUTH_REFRESH = "/auth/refresh"
    LIVESTREAMS = "/live-streams"
    LIVESTREAMS_LIVE_STREAM_ID = "/live-streams/{liveStreamId}"
    LIVESTREAMS_LIVE_STREAM_ID_THUMBNAIL = "/live-streams/{liveStreamId}/thumbnail"
    PLAYERS = "/players"
    PLAYERS_PLAYER_ID = "/players/{playerId}"
    PLAYERS_PLAYER_ID_LOGO = "/players/{playerId}/logo"
    UPLOAD = "/upload"
    UPLOADTOKENS = "/upload-tokens"
    UPLOADTOKENS_UPLOAD_TOKEN = "/upload-tokens/{uploadToken}"
    VIDEOS = "/videos"
    VIDEOS_VIDEO_ID = "/videos/{videoId}"
    VIDEOS_VIDEO_ID_CAPTIONS = "/videos/{videoId}/captions"
    VIDEOS_VIDEO_ID_CAPTIONS_LANGUAGE = "/videos/{videoId}/captions/{language}"
    VIDEOS_VIDEO_ID_CHAPTERS = "/videos/{videoId}/chapters"
    VIDEOS_VIDEO_ID_CHAPTERS_LANGUAGE = "/videos/{videoId}/chapters/{language}"
    VIDEOS_VIDEO_ID_SOURCE = "/videos/{videoId}/source"
    VIDEOS_VIDEO_ID_STATUS = "/videos/{videoId}/status"
    VIDEOS_VIDEO_ID_THUMBNAIL = "/videos/{videoId}/thumbnail"
    WEBHOOKS = "/webhooks"
    WEBHOOKS_WEBHOOK_ID = "/webhooks/{webhookId}"
