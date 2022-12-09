from video-api.paths.videos_video_id_captions_language.get import ApiForget
from video-api.paths.videos_video_id_captions_language.post import ApiForpost
from video-api.paths.videos_video_id_captions_language.delete import ApiFordelete
from video-api.paths.videos_video_id_captions_language.patch import ApiForpatch


class VideosVideoIdCaptionsLanguage(
    ApiForget,
    ApiForpost,
    ApiFordelete,
    ApiForpatch,
):
    pass
