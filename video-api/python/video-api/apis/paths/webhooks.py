from video-api.paths.webhooks.get import ApiForget
from video-api.paths.webhooks.post import ApiForpost


class Webhooks(
    ApiForget,
    ApiForpost,
):
    pass
