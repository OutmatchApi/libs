# coding: utf-8

# flake8: noqa

"""
    Slack Web API

    One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.  # noqa: E501

    The version of the OpenAPI document: 1.7.0
    Generated by: https://openapi-generator.tech
"""

__version__ = "1.7.0"

# import ApiClient
from slack.api_client import ApiClient

# import Configuration
from slack.configuration import Configuration

# import exceptions
from slack.exceptions import OpenApiException
from slack.exceptions import ApiAttributeError
from slack.exceptions import ApiTypeError
from slack.exceptions import ApiValueError
from slack.exceptions import ApiKeyError
from slack.exceptions import ApiException