# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import apivideo
from apivideo.paths.videos import post  # noqa: E501
from apivideo import configuration, schemas, api_client

from .. import ApiTestMixin


class TestVideos(ApiTestMixin, unittest.TestCase):
    """
    Videos unit test stubs
        Create a video  # noqa: E501
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
