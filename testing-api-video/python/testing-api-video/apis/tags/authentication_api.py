# coding: utf-8

"""
    api.video

    api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

from testing-api-video.paths.auth_api_key.post import POstAuthApiKey
from testing-api-video.paths.auth_refresh.post import POstAuthRefresh


class AuthenticationApi(
    POstAuthApiKey,
    POstAuthRefresh,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass
