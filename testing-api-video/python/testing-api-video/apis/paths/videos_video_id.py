from testing-api-video.paths.videos_video_id.get import ApiForget
from testing-api-video.paths.videos_video_id.delete import ApiFordelete
from testing-api-video.paths.videos_video_id.patch import ApiForpatch


class VideosVideoId(
    ApiForget,
    ApiFordelete,
    ApiForpatch,
):
    pass
