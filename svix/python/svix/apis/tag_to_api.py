import typing_extensions

from svix.apis.tags import TagValues
from svix.apis.tags.application_api import ApplicationApi
from svix.apis.tags.message_api import MessageApi
from svix.apis.tags.message_attempt_api import MessageAttemptApi
from svix.apis.tags.endpoint_api import EndpointApi
from svix.apis.tags.integration_api import IntegrationApi
from svix.apis.tags.event_type_api import EventTypeApi
from svix.apis.tags.authentication_api import AuthenticationApi
from svix.apis.tags.health_api import HealthApi
from svix.apis.tags.webhooks_api import WebhooksApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.APPLICATION: ApplicationApi,
        TagValues.MESSAGE: MessageApi,
        TagValues.MESSAGE_ATTEMPT: MessageAttemptApi,
        TagValues.ENDPOINT: EndpointApi,
        TagValues.INTEGRATION: IntegrationApi,
        TagValues.EVENT_TYPE: EventTypeApi,
        TagValues.AUTHENTICATION: AuthenticationApi,
        TagValues.HEALTH: HealthApi,
        TagValues.WEBHOOKS: WebhooksApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.APPLICATION: ApplicationApi,
        TagValues.MESSAGE: MessageApi,
        TagValues.MESSAGE_ATTEMPT: MessageAttemptApi,
        TagValues.ENDPOINT: EndpointApi,
        TagValues.INTEGRATION: IntegrationApi,
        TagValues.EVENT_TYPE: EventTypeApi,
        TagValues.AUTHENTICATION: AuthenticationApi,
        TagValues.HEALTH: HealthApi,
        TagValues.WEBHOOKS: WebhooksApi,
    }
)
