# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import svix
from svix.paths.api_v1_app_app_id_endpoint_endpoint_id_headers_ import put  # noqa: E501
from svix import configuration, schemas, api_client

from .. import ApiTestMixin


class TestApiV1AppAppIdEndpointEndpointIdHeaders(ApiTestMixin, unittest.TestCase):
    """
    ApiV1AppAppIdEndpointEndpointIdHeaders unit test stubs
        Update Endpoint Headers  # noqa: E501
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = put.ApiForput(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 204
    response_body = ''




if __name__ == '__main__':
    unittest.main()
