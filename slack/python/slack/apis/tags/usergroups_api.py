# coding: utf-8

"""
    Slack Web API

    One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.  # noqa: E501

    The version of the OpenAPI document: 1.7.0
    Generated by: https://openapi-generator.tech
"""

from slack.paths.usergroups_create.post import UsergroupsCreate
from slack.paths.usergroups_disable.post import UsergroupsDisable
from slack.paths.usergroups_enable.post import UsergroupsEnable
from slack.paths.usergroups_list.get import UsergroupsList
from slack.paths.usergroups_update.post import UsergroupsUpdate
from slack.paths.usergroups_users_list.get import UsergroupsUsersList
from slack.paths.usergroups_users_update.post import UsergroupsUsersUpdate


class UsergroupsApi(
    UsergroupsCreate,
    UsergroupsDisable,
    UsergroupsEnable,
    UsergroupsList,
    UsergroupsUpdate,
    UsergroupsUsersList,
    UsergroupsUsersUpdate,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass
