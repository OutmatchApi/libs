# coding: utf-8

"""
    Svix API

    Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site.   # noqa: E501

    The version of the OpenAPI document: 1.4.0
    Generated by: https://openapi-generator.tech
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from apitest import schemas  # noqa: F401


class MessageAttemptFailingEventData(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "endpointId",
            "appId",
            "lastAttempt",
            "msgId",
        }
        
        class properties:
            appId = schemas.StrSchema
            msgId = schemas.StrSchema
            endpointId = schemas.StrSchema
        
            @staticmethod
            def lastAttempt() -> typing.Type['MessageAttemptFailedData']:
                return MessageAttemptFailedData
            
            
            class appUid(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    max_length = 256
                    min_length = 1
                    regex=[{
                        'pattern': r'^[a-zA-Z0-9\-_.]+$',  # noqa: E501
                    }]
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'appUid':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class msgEventId(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    max_length = 256
                    min_length = 1
                    regex=[{
                        'pattern': r'^[a-zA-Z0-9\-_.]+$',  # noqa: E501
                    }]
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'msgEventId':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            __annotations__ = {
                "appId": appId,
                "msgId": msgId,
                "endpointId": endpointId,
                "lastAttempt": lastAttempt,
                "appUid": appUid,
                "msgEventId": msgEventId,
            }
    
    endpointId: MetaOapg.properties.endpointId
    appId: MetaOapg.properties.appId
    lastAttempt: 'MessageAttemptFailedData'
    msgId: MetaOapg.properties.msgId
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["appId"]) -> MetaOapg.properties.appId: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["msgId"]) -> MetaOapg.properties.msgId: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["endpointId"]) -> MetaOapg.properties.endpointId: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lastAttempt"]) -> 'MessageAttemptFailedData': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["appUid"]) -> MetaOapg.properties.appUid: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["msgEventId"]) -> MetaOapg.properties.msgEventId: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["appId", "msgId", "endpointId", "lastAttempt", "appUid", "msgEventId", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["appId"]) -> MetaOapg.properties.appId: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["msgId"]) -> MetaOapg.properties.msgId: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["endpointId"]) -> MetaOapg.properties.endpointId: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["lastAttempt"]) -> 'MessageAttemptFailedData': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["appUid"]) -> typing.Union[MetaOapg.properties.appUid, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["msgEventId"]) -> typing.Union[MetaOapg.properties.msgEventId, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["appId", "msgId", "endpointId", "lastAttempt", "appUid", "msgEventId", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        endpointId: typing.Union[MetaOapg.properties.endpointId, str, ],
        appId: typing.Union[MetaOapg.properties.appId, str, ],
        lastAttempt: 'MessageAttemptFailedData',
        msgId: typing.Union[MetaOapg.properties.msgId, str, ],
        appUid: typing.Union[MetaOapg.properties.appUid, None, str, schemas.Unset] = schemas.unset,
        msgEventId: typing.Union[MetaOapg.properties.msgEventId, None, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'MessageAttemptFailingEventData':
        return super().__new__(
            cls,
            *args,
            endpointId=endpointId,
            appId=appId,
            lastAttempt=lastAttempt,
            msgId=msgId,
            appUid=appUid,
            msgEventId=msgEventId,
            _configuration=_configuration,
            **kwargs,
        )

from apitest.model.message_attempt_failed_data import MessageAttemptFailedData
