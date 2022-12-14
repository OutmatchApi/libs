# coding: utf-8

"""
    Slack Web API

    One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.  # noqa: E501

    The version of the OpenAPI document: 1.7.0
    Generated by: https://openapi-generator.tech
"""

from slack.paths.files_remote_add.post import FilesRemoteAdd
from slack.paths.files_remote_info.get import FilesRemoteInfo
from slack.paths.files_remote_list.get import FilesRemoteList
from slack.paths.files_remote_remove.post import FilesRemoteRemove
from slack.paths.files_remote_share.get import FilesRemoteShare
from slack.paths.files_remote_update.post import FilesRemoteUpdate


class FilesRemoteApi(
    FilesRemoteAdd,
    FilesRemoteInfo,
    FilesRemoteList,
    FilesRemoteRemove,
    FilesRemoteShare,
    FilesRemoteUpdate,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass
