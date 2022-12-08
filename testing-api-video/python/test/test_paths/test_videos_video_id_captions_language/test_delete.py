# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import testing-api-video
from testing-api-video.paths.videos_video_id_captions_language import delete  # noqa: E501
from testing-api-video import configuration, schemas, api_client

from .. import ApiTestMixin


class TestVideosVideoIdCaptionsLanguage(ApiTestMixin, unittest.TestCase):
    """
    VideosVideoIdCaptionsLanguage unit test stubs
        Delete a caption  # noqa: E501
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = delete.ApiFordelete(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 204
    response_body = ''


if __name__ == '__main__':
    unittest.main()
