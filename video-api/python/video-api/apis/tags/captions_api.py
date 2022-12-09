# coding: utf-8

"""
    api.video

    api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.  # noqa: E501

    The version of the OpenAPI document: 1.0.1
    Generated by: https://openapi-generator.tech
"""

from video-api.paths.videos_video_id_captions_language.delete import DEleteVideosVideoIdCaptionsLanguage
from video-api.paths.videos_video_id_captions.get import GEtVideosVideoIdCaptions
from video-api.paths.videos_video_id_captions_language.get import GEtVideosVideoIdCaptionsLanguage
from video-api.paths.videos_video_id_captions_language.patch import PAtchVideosVideoIdCaptionsLanguage
from video-api.paths.videos_video_id_captions_language.post import POstVideosVideoIdCaptionsLanguage


class CaptionsApi(
    DEleteVideosVideoIdCaptionsLanguage,
    GEtVideosVideoIdCaptions,
    GEtVideosVideoIdCaptionsLanguage,
    PAtchVideosVideoIdCaptionsLanguage,
    POstVideosVideoIdCaptionsLanguage,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass
