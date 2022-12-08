import typing_extensions

from slack.apis.tags import TagValues
from slack.apis.tags.admin_apps_api import AdminAppsApi
from slack.apis.tags.admin_api import AdminApi
from slack.apis.tags.admin_apps_approved_api import AdminAppsApprovedApi
from slack.apis.tags.admin_apps_requests_api import AdminAppsRequestsApi
from slack.apis.tags.admin_apps_restricted_api import AdminAppsRestrictedApi
from slack.apis.tags.admin_conversations_api import AdminConversationsApi
from slack.apis.tags.admin_conversations_ekm_api import AdminConversationsEkmApi
from slack.apis.tags.admin_conversations_restrict_access_api import AdminConversationsRestrictAccessApi
from slack.apis.tags.admin_emoji_api import AdminEmojiApi
from slack.apis.tags.admin_invite_requests_api import AdminInviteRequestsApi
from slack.apis.tags.admin_invite_requests_approved_api import AdminInviteRequestsApprovedApi
from slack.apis.tags.admin_invite_requests_denied_api import AdminInviteRequestsDeniedApi
from slack.apis.tags.admin_teams_admins_api import AdminTeamsAdminsApi
from slack.apis.tags.admin_teams_api import AdminTeamsApi
from slack.apis.tags.admin_teams_owners_api import AdminTeamsOwnersApi
from slack.apis.tags.admin_teams_settings_api import AdminTeamsSettingsApi
from slack.apis.tags.admin_usergroups_api import AdminUsergroupsApi
from slack.apis.tags.admin_users_api import AdminUsersApi
from slack.apis.tags.admin_users_session_api import AdminUsersSessionApi
from slack.apis.tags.api_api import ApiApi
from slack.apis.tags.apps_event_authorizations_api import AppsEventAuthorizationsApi
from slack.apis.tags.apps_api import AppsApi
from slack.apis.tags.apps_permissions_api import AppsPermissionsApi
from slack.apis.tags.apps_permissions_resources_api import AppsPermissionsResourcesApi
from slack.apis.tags.apps_permissions_scopes_api import AppsPermissionsScopesApi
from slack.apis.tags.apps_permissions_users_api import AppsPermissionsUsersApi
from slack.apis.tags.auth_api import AuthApi
from slack.apis.tags.bots_api import BotsApi
from slack.apis.tags.calls_api import CallsApi
from slack.apis.tags.calls_participants_api import CallsParticipantsApi
from slack.apis.tags.chat_api import ChatApi
from slack.apis.tags.chat_scheduled_messages_api import ChatScheduledMessagesApi
from slack.apis.tags.conversations_api import ConversationsApi
from slack.apis.tags.dialog_api import DialogApi
from slack.apis.tags.dnd_api import DndApi
from slack.apis.tags.emoji_api import EmojiApi
from slack.apis.tags.files_comments_api import FilesCommentsApi
from slack.apis.tags.files_api import FilesApi
from slack.apis.tags.files_remote_api import FilesRemoteApi
from slack.apis.tags.migration_api import MigrationApi
from slack.apis.tags.oauth_api import OauthApi
from slack.apis.tags.oauth_v2_api import OauthV2Api
from slack.apis.tags.pins_api import PinsApi
from slack.apis.tags.reactions_api import ReactionsApi
from slack.apis.tags.reminders_api import RemindersApi
from slack.apis.tags.rtm_api import RtmApi
from slack.apis.tags.search_api import SearchApi
from slack.apis.tags.stars_api import StarsApi
from slack.apis.tags.team_api import TeamApi
from slack.apis.tags.team_profile_api import TeamProfileApi
from slack.apis.tags.usergroups_api import UsergroupsApi
from slack.apis.tags.usergroups_users_api import UsergroupsUsersApi
from slack.apis.tags.users_api import UsersApi
from slack.apis.tags.users_profile_api import UsersProfileApi
from slack.apis.tags.views_api import ViewsApi
from slack.apis.tags.workflows_api import WorkflowsApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.ADMIN_APPS: AdminAppsApi,
        TagValues.ADMIN: AdminApi,
        TagValues.ADMIN_APPS_APPROVED: AdminAppsApprovedApi,
        TagValues.ADMIN_APPS_REQUESTS: AdminAppsRequestsApi,
        TagValues.ADMIN_APPS_RESTRICTED: AdminAppsRestrictedApi,
        TagValues.ADMIN_CONVERSATIONS: AdminConversationsApi,
        TagValues.ADMIN_CONVERSATIONS_EKM: AdminConversationsEkmApi,
        TagValues.ADMIN_CONVERSATIONS_RESTRICT_ACCESS: AdminConversationsRestrictAccessApi,
        TagValues.ADMIN_EMOJI: AdminEmojiApi,
        TagValues.ADMIN_INVITE_REQUESTS: AdminInviteRequestsApi,
        TagValues.ADMIN_INVITE_REQUESTS_APPROVED: AdminInviteRequestsApprovedApi,
        TagValues.ADMIN_INVITE_REQUESTS_DENIED: AdminInviteRequestsDeniedApi,
        TagValues.ADMIN_TEAMS_ADMINS: AdminTeamsAdminsApi,
        TagValues.ADMIN_TEAMS: AdminTeamsApi,
        TagValues.ADMIN_TEAMS_OWNERS: AdminTeamsOwnersApi,
        TagValues.ADMIN_TEAMS_SETTINGS: AdminTeamsSettingsApi,
        TagValues.ADMIN_USERGROUPS: AdminUsergroupsApi,
        TagValues.ADMIN_USERS: AdminUsersApi,
        TagValues.ADMIN_USERS_SESSION: AdminUsersSessionApi,
        TagValues.API: ApiApi,
        TagValues.APPS_EVENT_AUTHORIZATIONS: AppsEventAuthorizationsApi,
        TagValues.APPS: AppsApi,
        TagValues.APPS_PERMISSIONS: AppsPermissionsApi,
        TagValues.APPS_PERMISSIONS_RESOURCES: AppsPermissionsResourcesApi,
        TagValues.APPS_PERMISSIONS_SCOPES: AppsPermissionsScopesApi,
        TagValues.APPS_PERMISSIONS_USERS: AppsPermissionsUsersApi,
        TagValues.AUTH: AuthApi,
        TagValues.BOTS: BotsApi,
        TagValues.CALLS: CallsApi,
        TagValues.CALLS_PARTICIPANTS: CallsParticipantsApi,
        TagValues.CHAT: ChatApi,
        TagValues.CHAT_SCHEDULED_MESSAGES: ChatScheduledMessagesApi,
        TagValues.CONVERSATIONS: ConversationsApi,
        TagValues.DIALOG: DialogApi,
        TagValues.DND: DndApi,
        TagValues.EMOJI: EmojiApi,
        TagValues.FILES_COMMENTS: FilesCommentsApi,
        TagValues.FILES: FilesApi,
        TagValues.FILES_REMOTE: FilesRemoteApi,
        TagValues.MIGRATION: MigrationApi,
        TagValues.OAUTH: OauthApi,
        TagValues.OAUTH_V2: OauthV2Api,
        TagValues.PINS: PinsApi,
        TagValues.REACTIONS: ReactionsApi,
        TagValues.REMINDERS: RemindersApi,
        TagValues.RTM: RtmApi,
        TagValues.SEARCH: SearchApi,
        TagValues.STARS: StarsApi,
        TagValues.TEAM: TeamApi,
        TagValues.TEAM_PROFILE: TeamProfileApi,
        TagValues.USERGROUPS: UsergroupsApi,
        TagValues.USERGROUPS_USERS: UsergroupsUsersApi,
        TagValues.USERS: UsersApi,
        TagValues.USERS_PROFILE: UsersProfileApi,
        TagValues.VIEWS: ViewsApi,
        TagValues.WORKFLOWS: WorkflowsApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.ADMIN_APPS: AdminAppsApi,
        TagValues.ADMIN: AdminApi,
        TagValues.ADMIN_APPS_APPROVED: AdminAppsApprovedApi,
        TagValues.ADMIN_APPS_REQUESTS: AdminAppsRequestsApi,
        TagValues.ADMIN_APPS_RESTRICTED: AdminAppsRestrictedApi,
        TagValues.ADMIN_CONVERSATIONS: AdminConversationsApi,
        TagValues.ADMIN_CONVERSATIONS_EKM: AdminConversationsEkmApi,
        TagValues.ADMIN_CONVERSATIONS_RESTRICT_ACCESS: AdminConversationsRestrictAccessApi,
        TagValues.ADMIN_EMOJI: AdminEmojiApi,
        TagValues.ADMIN_INVITE_REQUESTS: AdminInviteRequestsApi,
        TagValues.ADMIN_INVITE_REQUESTS_APPROVED: AdminInviteRequestsApprovedApi,
        TagValues.ADMIN_INVITE_REQUESTS_DENIED: AdminInviteRequestsDeniedApi,
        TagValues.ADMIN_TEAMS_ADMINS: AdminTeamsAdminsApi,
        TagValues.ADMIN_TEAMS: AdminTeamsApi,
        TagValues.ADMIN_TEAMS_OWNERS: AdminTeamsOwnersApi,
        TagValues.ADMIN_TEAMS_SETTINGS: AdminTeamsSettingsApi,
        TagValues.ADMIN_USERGROUPS: AdminUsergroupsApi,
        TagValues.ADMIN_USERS: AdminUsersApi,
        TagValues.ADMIN_USERS_SESSION: AdminUsersSessionApi,
        TagValues.API: ApiApi,
        TagValues.APPS_EVENT_AUTHORIZATIONS: AppsEventAuthorizationsApi,
        TagValues.APPS: AppsApi,
        TagValues.APPS_PERMISSIONS: AppsPermissionsApi,
        TagValues.APPS_PERMISSIONS_RESOURCES: AppsPermissionsResourcesApi,
        TagValues.APPS_PERMISSIONS_SCOPES: AppsPermissionsScopesApi,
        TagValues.APPS_PERMISSIONS_USERS: AppsPermissionsUsersApi,
        TagValues.AUTH: AuthApi,
        TagValues.BOTS: BotsApi,
        TagValues.CALLS: CallsApi,
        TagValues.CALLS_PARTICIPANTS: CallsParticipantsApi,
        TagValues.CHAT: ChatApi,
        TagValues.CHAT_SCHEDULED_MESSAGES: ChatScheduledMessagesApi,
        TagValues.CONVERSATIONS: ConversationsApi,
        TagValues.DIALOG: DialogApi,
        TagValues.DND: DndApi,
        TagValues.EMOJI: EmojiApi,
        TagValues.FILES_COMMENTS: FilesCommentsApi,
        TagValues.FILES: FilesApi,
        TagValues.FILES_REMOTE: FilesRemoteApi,
        TagValues.MIGRATION: MigrationApi,
        TagValues.OAUTH: OauthApi,
        TagValues.OAUTH_V2: OauthV2Api,
        TagValues.PINS: PinsApi,
        TagValues.REACTIONS: ReactionsApi,
        TagValues.REMINDERS: RemindersApi,
        TagValues.RTM: RtmApi,
        TagValues.SEARCH: SearchApi,
        TagValues.STARS: StarsApi,
        TagValues.TEAM: TeamApi,
        TagValues.TEAM_PROFILE: TeamProfileApi,
        TagValues.USERGROUPS: UsergroupsApi,
        TagValues.USERGROUPS_USERS: UsergroupsUsersApi,
        TagValues.USERS: UsersApi,
        TagValues.USERS_PROFILE: UsersProfileApi,
        TagValues.VIEWS: ViewsApi,
        TagValues.WORKFLOWS: WorkflowsApi,
    }
)
