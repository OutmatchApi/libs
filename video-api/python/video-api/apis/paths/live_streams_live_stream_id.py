from video-api.paths.live_streams_live_stream_id.get import ApiForget
from video-api.paths.live_streams_live_stream_id.delete import ApiFordelete
from video-api.paths.live_streams_live_stream_id.patch import ApiForpatch


class LiveStreamsLiveStreamId(
    ApiForget,
    ApiFordelete,
    ApiForpatch,
):
    pass
