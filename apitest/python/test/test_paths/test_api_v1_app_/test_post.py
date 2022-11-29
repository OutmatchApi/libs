# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import apitest
from apitest.paths.api_v1_app_ import post  # noqa: E501
from apitest import configuration, schemas, api_client

from .. import ApiTestMixin


class TestApiV1App(ApiTestMixin, unittest.TestCase):
    """
    ApiV1App unit test stubs
        Create Application  # noqa: E501
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200






if __name__ == '__main__':
    unittest.main()
