import typing_extensions

from apitest.apis.tags import TagValues
from apitest.apis.tags.application_api import ApplicationApi
from apitest.apis.tags.message_api import MessageApi
from apitest.apis.tags.message_attempt_api import MessageAttemptApi
from apitest.apis.tags.endpoint_api import EndpointApi
from apitest.apis.tags.integration_api import IntegrationApi
from apitest.apis.tags.event_type_api import EventTypeApi
from apitest.apis.tags.authentication_api import AuthenticationApi
from apitest.apis.tags.health_api import HealthApi
from apitest.apis.tags.webhooks_api import WebhooksApi

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
