from apivideo.paths.videos_video_id.get import ApiForget
from apivideo.paths.videos_video_id.delete import ApiFordelete
from apivideo.paths.videos_video_id.patch import ApiForpatch


class VideosVideoId(
    ApiForget,
    ApiFordelete,
    ApiForpatch,
):
    pass
