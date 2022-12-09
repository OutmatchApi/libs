# coding: utf-8

"""
    api.video

    api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.  # noqa: E501

    The version of the OpenAPI document: 1.0.1
    Generated by: https://openapi-generator.tech
"""

from apivideo.paths.videos_video_id.delete import DEleteVideo
from apivideo.paths.videos_video_id.get import GEtVideo
from apivideo.paths.videos_video_id_status.get import GEtVideoStatus
from apivideo.paths.videos.get import LIstVideos
from apivideo.paths.videos_video_id.patch import PAtchVideo
from apivideo.paths.videos_video_id_thumbnail.patch import PAtchVideosVideoIdThumbnail
from apivideo.paths.videos.post import POstVideo
from apivideo.paths.videos_video_id_source.post import POstVideosVideoIdSource
from apivideo.paths.videos_video_id_thumbnail.post import POstVideosVideoIdThumbnail


class VideosApi(
    DEleteVideo,
    GEtVideo,
    GEtVideoStatus,
    LIstVideos,
    PAtchVideo,
    PAtchVideosVideoIdThumbnail,
    POstVideo,
    POstVideosVideoIdSource,
    POstVideosVideoIdThumbnail,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass
