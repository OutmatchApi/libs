import typing_extensions

from api.paths import PathValues
from api.apis.paths.status import Status
from api.apis.paths.user import User
from api.apis.paths.api_app import ApiApp
from api.apis.paths.api_app_app_id_release import ApiAppAppIdRelease
from api.apis.paths.api_app_app_id_release_release_version_sdk import ApiAppAppIdReleaseReleaseVersionSdk

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.STATUS: Status,
        PathValues.USER: User,
        PathValues.API_APP: ApiApp,
        PathValues.API_APP_APP_ID_RELEASE: ApiAppAppIdRelease,
        PathValues.API_APP_APP_ID_RELEASE_RELEASE_VERSION_SDK: ApiAppAppIdReleaseReleaseVersionSdk,
    }
)

path_to_api = PathToApi(
    {
        PathValues.STATUS: Status,
        PathValues.USER: User,
        PathValues.API_APP: ApiApp,
        PathValues.API_APP_APP_ID_RELEASE: ApiAppAppIdRelease,
        PathValues.API_APP_APP_ID_RELEASE_RELEASE_VERSION_SDK: ApiAppAppIdReleaseReleaseVersionSdk,
    }
)
