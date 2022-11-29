from svix.paths.api_v1_app_app_id_.get import ApiForget
from svix.paths.api_v1_app_app_id_.put import ApiForput
from svix.paths.api_v1_app_app_id_.delete import ApiFordelete


class ApiV1AppAppId(
    ApiForget,
    ApiForput,
    ApiFordelete,
):
    pass
