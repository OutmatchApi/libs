# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from svix.apis.path_to_api import path_to_api

import enum


class PathValues(str, enum.Enum):
    API_V1_HEALTH_ = "/api/v1/health/"
    API_V1_APP_ = "/api/v1/app/"
    API_V1_APP_APP_ID_ = "/api/v1/app/{app_id}/"
    API_V1_AUTH_DASHBOARDACCESS_APP_ID_ = "/api/v1/auth/dashboard-access/{app_id}/"
    API_V1_AUTH_LOGOUT_ = "/api/v1/auth/logout/"
    API_V1_AUTH_APP_APP_ID_EXPIREALL_ = "/api/v1/auth/app/{app_id}/expire-all/"
    API_V1_EVENTTYPE_ = "/api/v1/event-type/"
    API_V1_EVENTTYPE_EVENT_TYPE_NAME_ = "/api/v1/event-type/{event_type_name}/"
    API_V1_APP_APP_ID_ENDPOINT_ = "/api/v1/app/{app_id}/endpoint/"
    API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_ = "/api/v1/app/{app_id}/endpoint/{endpoint_id}/"
    API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_SECRET_ = "/api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/"
    API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_SECRET_ROTATE_ = "/api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate/"
    API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_STATS_ = "/api/v1/app/{app_id}/endpoint/{endpoint_id}/stats/"
    API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_RECOVER_ = "/api/v1/app/{app_id}/endpoint/{endpoint_id}/recover/"
    API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_REPLAYMISSING_ = "/api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing/"
    API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_HEADERS_ = "/api/v1/app/{app_id}/endpoint/{endpoint_id}/headers/"
    API_V1_APP_APP_ID_MSG_ = "/api/v1/app/{app_id}/msg/"
    API_V1_APP_APP_ID_MSG_MSG_ID_ = "/api/v1/app/{app_id}/msg/{msg_id}/"
    API_V1_APP_APP_ID_ENDPOINT_ENDPOINT_ID_MSG_ = "/api/v1/app/{app_id}/endpoint/{endpoint_id}/msg/"
    API_V1_APP_APP_ID_ATTEMPT_ENDPOINT_ENDPOINT_ID_ = "/api/v1/app/{app_id}/attempt/endpoint/{endpoint_id}/"
    API_V1_APP_APP_ID_ATTEMPT_MSG_MSG_ID_ = "/api/v1/app/{app_id}/attempt/msg/{msg_id}/"
    API_V1_APP_APP_ID_MSG_MSG_ID_ENDPOINT_ = "/api/v1/app/{app_id}/msg/{msg_id}/endpoint/"
    API_V1_APP_APP_ID_MSG_MSG_ID_ENDPOINT_ENDPOINT_ID_RESEND_ = "/api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend/"
    API_V1_APP_APP_ID_MSG_MSG_ID_ENDPOINT_ENDPOINT_ID_ATTEMPT_ = "/api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt/"
    API_V1_APP_APP_ID_MSG_MSG_ID_ATTEMPT_ = "/api/v1/app/{app_id}/msg/{msg_id}/attempt/"
    API_V1_APP_APP_ID_MSG_MSG_ID_ATTEMPT_ATTEMPT_ID_ = "/api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/"
    API_V1_APP_APP_ID_INTEGRATION_ = "/api/v1/app/{app_id}/integration/"
    API_V1_APP_APP_ID_INTEGRATION_INTEG_ID_ = "/api/v1/app/{app_id}/integration/{integ_id}/"
    API_V1_APP_APP_ID_INTEGRATION_INTEG_ID_KEY_ = "/api/v1/app/{app_id}/integration/{integ_id}/key/"
    API_V1_APP_APP_ID_INTEGRATION_INTEG_ID_KEY_ROTATE_ = "/api/v1/app/{app_id}/integration/{integ_id}/key/rotate/"
