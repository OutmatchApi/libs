# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from testing-api-video.apis.tag_to_api import tag_to_api

import enum


class TagValues(str, enum.Enum):
    ACCOUNT = "Account"
    ANALYTICS = "Analytics"
    AUTHENTICATION = "Authentication"
    CAPTIONS = "Captions"
    CHAPTERS = "Chapters"
    LIVE = "Live"
    PLAYERS = "Players"
    VIDEOS = "Videos"
    VIDEOS__DELEGATED_UPLOAD = "Videos - Delegated upload"
    WEBHOOKS = "Webhooks"
