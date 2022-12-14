# coding: utf-8

"""
    Slack Web API

    One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.  # noqa: E501

    The version of the OpenAPI document: 1.7.0
    Generated by: https://openapi-generator.tech
"""

from slack.paths.pins_add.post import PinsAdd
from slack.paths.pins_list.get import PinsList
from slack.paths.pins_remove.post import PinsRemove


class PinsApi(
    PinsAdd,
    PinsList,
    PinsRemove,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass
