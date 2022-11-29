# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from svix.apis.tag_to_api import tag_to_api

import enum


class TagValues(str, enum.Enum):
    APPLICATION = "Application"
    MESSAGE = "Message"
    MESSAGE_ATTEMPT = "Message Attempt"
    ENDPOINT = "Endpoint"
    INTEGRATION = "Integration"
    EVENT_TYPE = "Event Type"
    AUTHENTICATION = "Authentication"
    HEALTH = "Health"
    WEBHOOKS = "Webhooks"
