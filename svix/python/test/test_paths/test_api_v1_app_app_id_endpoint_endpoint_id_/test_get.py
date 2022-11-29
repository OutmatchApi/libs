# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import svix
from svix.paths.api_v1_app_app_id_endpoint_endpoint_id_ import get  # noqa: E501
from svix import configuration, schemas, api_client

from .. import ApiTestMixin


class TestApiV1AppAppIdEndpointEndpointId(ApiTestMixin, unittest.TestCase):
    """
    ApiV1AppAppIdEndpointEndpointId unit test stubs
        Get Endpoint  # noqa: E501
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = get.ApiForget(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200




if __name__ == '__main__':
    unittest.main()
