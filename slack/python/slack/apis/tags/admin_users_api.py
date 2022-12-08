# coding: utf-8

"""
    Slack Web API

    One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.  # noqa: E501

    The version of the OpenAPI document: 1.7.0
    Generated by: https://openapi-generator.tech
"""

from slack.paths.admin_users_assign.post import AdminUsersAssign
from slack.paths.admin_users_invite.post import AdminUsersInvite
from slack.paths.admin_users_list.get import AdminUsersList
from slack.paths.admin_users_remove.post import AdminUsersRemove
from slack.paths.admin_users_set_admin.post import AdminUsersSetAdmin
from slack.paths.admin_users_set_expiration.post import AdminUsersSetExpiration
from slack.paths.admin_users_set_owner.post import AdminUsersSetOwner
from slack.paths.admin_users_set_regular.post import AdminUsersSetRegular


class AdminUsersApi(
    AdminUsersAssign,
    AdminUsersInvite,
    AdminUsersList,
    AdminUsersRemove,
    AdminUsersSetAdmin,
    AdminUsersSetExpiration,
    AdminUsersSetOwner,
    AdminUsersSetRegular,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass