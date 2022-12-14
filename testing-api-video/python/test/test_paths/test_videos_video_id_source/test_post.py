# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import testing-api-video
from testing-api-video.paths.videos_video_id_source import post  # noqa: E501
from testing-api-video import configuration, schemas, api_client

from .. import ApiTestMixin


class TestVideosVideoIdSource(ApiTestMixin, unittest.TestCase):
    """
    VideosVideoIdSource unit test stubs
        Upload a video  # noqa: E501
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 201




if __name__ == '__main__':
    unittest.main()
