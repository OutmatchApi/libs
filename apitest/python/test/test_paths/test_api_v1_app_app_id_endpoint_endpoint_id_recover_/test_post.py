# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import apitest
from apitest.paths.api_v1_app_app_id_endpoint_endpoint_id_recover_ import post  # noqa: E501
from apitest import configuration, schemas, api_client

from .. import ApiTestMixin


class TestApiV1AppAppIdEndpointEndpointIdRecover(ApiTestMixin, unittest.TestCase):
    """
    ApiV1AppAppIdEndpointEndpointIdRecover unit test stubs
        Recover Failed Webhooks  # noqa: E501
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = post.ApiForpost(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 202






if __name__ == '__main__':
    unittest.main()
