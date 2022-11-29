# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from api.apis.path_to_api import path_to_api

import enum


class PathValues(str, enum.Enum):
    STATUS = "/status"
    USER = "/user"
    API_APP = "/apiApp"
    API_APP_APP_ID_RELEASE = "/apiApp/{app_id}/release"
    API_APP_APP_ID_RELEASE_RELEASE_VERSION_SDK = "/apiApp/{app_id}/release/{release_version}/sdk"
