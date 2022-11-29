import typing_extensions

from svix.paths import PathValues
from svix.apis.paths.api_v1_health_ import ApiV1Health
from svix.apis.paths.api_v1_app_ import ApiV1App
from svix.apis.paths.api_v1_app_app_id_ import ApiV1AppAppId
from svix.apis.paths.api_v1_auth_dashboard_access_app_id_ import ApiV1AuthDashboardAccessAppId
from svix.apis.paths.api_v1_auth_logout_ import ApiV1AuthLogout
from svix.apis.paths.api_v1_auth_app_app_id_expire_all_ import ApiV1AuthAppAppIdExpireAll
from svix.apis.paths.api_v1_event_type_ import ApiV1EventType
from svix.apis.paths.api_v1_event_type_event_type_name_ import ApiV1EventTypeEventTypeName
from svix.apis.paths.api_v1_app_app_id_endpoint_ import ApiV1AppAppIdEndpoint
from svix.apis.paths.api_v1_app_app_id_endpoint_endpoint_id_ import ApiV1AppAppIdEndpointEndpointId
from svix.apis.paths.api_v1_app_app_id_endpoint_endpoint_id_secret_ import ApiV1AppAppIdEndpointEndpointIdSecret
from svix.apis.paths.api_v1_app_app_id_endpoint_endpoint_id_secret_rotate_ import ApiV1AppAppIdEndpointEndpointIdSecretRotate
from svix.apis.paths.api_v1_app_app_id_endpoint_endpoint_id_stats_ import ApiV1AppAppIdEndpointEndpointIdStats
from svix.apis.paths.api_v1_app_app_id_endpoint_endpoint_id_recover_ import ApiV1AppAppIdEndpointEndpointIdRecover
from svix.apis.paths.api_v1_app_app_id_endpoint_endpoint_id_replay_missing_ import ApiV1AppAppIdEndpointEndpointIdReplayMissing
from svix.apis.paths.api_v1_app_app_id_endpoint_endpoint_id_headers_ import ApiV1AppAppIdEndpointEndpointIdHeaders
from svix.apis.paths.api_v1_app_app_id_msg_ import ApiV1AppAppIdMsg
from svix.apis.paths.api_v1_app_app_id_msg_msg_id_ import ApiV1AppAppIdMsgMsgId
from svix.apis.paths.api_v1_app_app_id_endpoint_endpoint_id_msg_ import ApiV1AppAppIdEndpointEndpointIdMsg
from svix.apis.paths.api_v1_app_app_id_attempt_endpoint_endpoint_id_ import ApiV1AppAppIdAttemptEndpointEndpointId
from svix.apis.paths.api_v1_app_app_id_attempt_msg_msg_id_ import ApiV1AppAppIdAttemptMsgMsgId
from svix.apis.paths.api_v1_app_app_id_msg_msg_id_endpoint_ import ApiV1AppAppIdMsgMsgIdEndpoint
from svix.apis.paths.api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_resend_ import ApiV1AppAppIdMsgMsgIdEndpointEndpointIdResend
from svix.apis.paths.api_v1_app_app_id_msg_msg_id_endpoint_endpoint_id_attempt_ import ApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttempt
from svix.apis.paths.api_v1_app_app_id_msg_msg_id_attempt_ import ApiV1AppAppIdMsgMsgIdAttempt
from svix.apis.paths.api_v1_app_app_id_msg_msg_id_attempt_attempt_id_ import ApiV1AppAppIdMsgMsgIdAttemptAttemptId
from svix.apis.paths.api_v1_app_app_id_integration_ import ApiV1AppAppIdIntegration
from svix.apis.paths.api_v1_app_app_id_integration_integ_id_ import ApiV1AppAppIdIntegrationIntegId
from svix.apis.paths.api_v1_app_app_id_integration_integ_id_key_ import ApiV1AppAppIdIntegrationIntegIdKey
from svix.apis.paths.api_v1_app_app_id_integration_integ_id_key_rotate_ import ApiV1AppAppIdIntegrationIntegIdKeyRotate

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.API_V1_HEALTH_: ApiV1Health,
        PathValues.API_V1_APP_: ApiV1App,
        PathValues.API_V1_APP_APP_ID_: ApiV1AppAppId,
        PathValues.API_V1_AUTH_DASHBOARDACCESS_APP_ID_: ApiV1AuthDashboardAccessAppId,
        PathValues.API_V1_AUTH_LOGOUT_: ApiV1AuthLogout,
        PathValues.API_V1_AUTH_APP_APP_ID_EXPIREALL_: ApiV1AuthAppAppIdExpireAll,
        PathValues.API_V1_EVENTTYPE_: ApiV1EventType,
        PathValues.API_V1_EVENTTYPE_EVENT_TYPE_NAME_: ApiV1EventTypeEventTypeName,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_: ApiV1AppAppIdEndpoint,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_: ApiV1AppAppIdEndpointEndpointId,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_SECRET_: ApiV1AppAppIdEndpointEndpointIdSecret,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_SECRET_ROTATE_: ApiV1AppAppIdEndpointEndpointIdSecretRotate,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_STATS_: ApiV1AppAppIdEndpointEndpointIdStats,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_RECOVER_: ApiV1AppAppIdEndpointEndpointIdRecover,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_REPLAYMISSING_: ApiV1AppAppIdEndpointEndpointIdReplayMissing,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_HEADERS_: ApiV1AppAppIdEndpointEndpointIdHeaders,
        PathValues.API_V1_APP_APP_ID_MSG_: ApiV1AppAppIdMsg,
        PathValues.API_V1_APP_APP_ID_MSG_MSG_ID_: ApiV1AppAppIdMsgMsgId,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_MSG_: ApiV1AppAppIdEndpointEndpointIdMsg,
        PathValues.API_V1_APP_APP_ID_ATTEMPT_ENDPOINT_ENDPOINT_ID_: ApiV1AppAppIdAttemptEndpointEndpointId,
        PathValues.API_V1_APP_APP_ID_ATTEMPT_MSG_MSG_ID_: ApiV1AppAppIdAttemptMsgMsgId,
        PathValues.API_V1_APP_APP_ID_MSG_MSG_ID_ENDPOINT_: ApiV1AppAppIdMsgMsgIdEndpoint,
        PathValues.API_V1_APP_APP_ID_MSG_MSG_ID_ENDPOINT_ENDPOINT_ID_RESEND_: ApiV1AppAppIdMsgMsgIdEndpointEndpointIdResend,
        PathValues.API_V1_APP_APP_ID_MSG_MSG_ID_ENDPOINT_ENDPOINT_ID_ATTEMPT_: ApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttempt,
        PathValues.API_V1_APP_APP_ID_MSG_MSG_ID_ATTEMPT_: ApiV1AppAppIdMsgMsgIdAttempt,
        PathValues.API_V1_APP_APP_ID_MSG_MSG_ID_ATTEMPT_ATTEMPT_ID_: ApiV1AppAppIdMsgMsgIdAttemptAttemptId,
        PathValues.API_V1_APP_APP_ID_INTEGRATION_: ApiV1AppAppIdIntegration,
        PathValues.API_V1_APP_APP_ID_INTEGRATION_INTEG_ID_: ApiV1AppAppIdIntegrationIntegId,
        PathValues.API_V1_APP_APP_ID_INTEGRATION_INTEG_ID_KEY_: ApiV1AppAppIdIntegrationIntegIdKey,
        PathValues.API_V1_APP_APP_ID_INTEGRATION_INTEG_ID_KEY_ROTATE_: ApiV1AppAppIdIntegrationIntegIdKeyRotate,
    }
)

path_to_api = PathToApi(
    {
        PathValues.API_V1_HEALTH_: ApiV1Health,
        PathValues.API_V1_APP_: ApiV1App,
        PathValues.API_V1_APP_APP_ID_: ApiV1AppAppId,
        PathValues.API_V1_AUTH_DASHBOARDACCESS_APP_ID_: ApiV1AuthDashboardAccessAppId,
        PathValues.API_V1_AUTH_LOGOUT_: ApiV1AuthLogout,
        PathValues.API_V1_AUTH_APP_APP_ID_EXPIREALL_: ApiV1AuthAppAppIdExpireAll,
        PathValues.API_V1_EVENTTYPE_: ApiV1EventType,
        PathValues.API_V1_EVENTTYPE_EVENT_TYPE_NAME_: ApiV1EventTypeEventTypeName,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_: ApiV1AppAppIdEndpoint,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_: ApiV1AppAppIdEndpointEndpointId,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_SECRET_: ApiV1AppAppIdEndpointEndpointIdSecret,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_SECRET_ROTATE_: ApiV1AppAppIdEndpointEndpointIdSecretRotate,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_STATS_: ApiV1AppAppIdEndpointEndpointIdStats,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_RECOVER_: ApiV1AppAppIdEndpointEndpointIdRecover,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_REPLAYMISSING_: ApiV1AppAppIdEndpointEndpointIdReplayMissing,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_HEADERS_: ApiV1AppAppIdEndpointEndpointIdHeaders,
        PathValues.API_V1_APP_APP_ID_MSG_: ApiV1AppAppIdMsg,
        PathValues.API_V1_APP_APP_ID_MSG_MSG_ID_: ApiV1AppAppIdMsgMsgId,
        PathValues.API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_MSG_: ApiV1AppAppIdEndpointEndpointIdMsg,
        PathValues.API_V1_APP_APP_ID_ATTEMPT_ENDPOINT_ENDPOINT_ID_: ApiV1AppAppIdAttemptEndpointEndpointId,
        PathValues.API_V1_APP_APP_ID_ATTEMPT_MSG_MSG_ID_: ApiV1AppAppIdAttemptMsgMsgId,
        PathValues.API_V1_APP_APP_ID_MSG_MSG_ID_ENDPOINT_: ApiV1AppAppIdMsgMsgIdEndpoint,
        PathValues.API_V1_APP_APP_ID_MSG_MSG_ID_ENDPOINT_ENDPOINT_ID_RESEND_: ApiV1AppAppIdMsgMsgIdEndpointEndpointIdResend,
        PathValues.API_V1_APP_APP_ID_MSG_MSG_ID_ENDPOINT_ENDPOINT_ID_ATTEMPT_: ApiV1AppAppIdMsgMsgIdEndpointEndpointIdAttempt,
        PathValues.API_V1_APP_APP_ID_MSG_MSG_ID_ATTEMPT_: ApiV1AppAppIdMsgMsgIdAttempt,
        PathValues.API_V1_APP_APP_ID_MSG_MSG_ID_ATTEMPT_ATTEMPT_ID_: ApiV1AppAppIdMsgMsgIdAttemptAttemptId,
        PathValues.API_V1_APP_APP_ID_INTEGRATION_: ApiV1AppAppIdIntegration,
        PathValues.API_V1_APP_APP_ID_INTEGRATION_INTEG_ID_: ApiV1AppAppIdIntegrationIntegId,
        PathValues.API_V1_APP_APP_ID_INTEGRATION_INTEG_ID_KEY_: ApiV1AppAppIdIntegrationIntegIdKey,
        PathValues.API_V1_APP_APP_ID_INTEGRATION_INTEG_ID_KEY_ROTATE_: ApiV1AppAppIdIntegrationIntegIdKeyRotate,
    }
)
