import typing_extensions

from api.apis.tags import TagValues
from api.apis.tags.user_api import UserApi
from api.apis.tags.api_app_api import ApiAppApi
from api.apis.tags.status_api import StatusApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.USER: UserApi,
        TagValues.API_APP: ApiAppApi,
        TagValues.STATUS: StatusApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.USER: UserApi,
        TagValues.API_APP: ApiAppApi,
        TagValues.STATUS: StatusApi,
    }
)
