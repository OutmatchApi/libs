# coding: utf-8

"""
    Slack Web API

    One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.  # noqa: E501

    The version of the OpenAPI document: 1.7.0
    Generated by: https://openapi-generator.tech
"""

from slack.paths.reactions_add.post import ReactionsAdd
from slack.paths.reactions_get.get import ReactionsGet
from slack.paths.reactions_list.get import ReactionsList
from slack.paths.reactions_remove.post import ReactionsRemove


class ReactionsApi(
    ReactionsAdd,
    ReactionsGet,
    ReactionsList,
    ReactionsRemove,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass