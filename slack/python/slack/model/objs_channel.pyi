# coding: utf-8

"""
    Slack Web API

    One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.  # noqa: E501

    The version of the OpenAPI document: 1.7.0
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

from slack import schemas  # noqa: F401


class ObjsChannel(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "is_private",
            "creator",
            "is_mpim",
            "purpose",
            "created",
            "name_normalized",
            "is_channel",
            "is_shared",
            "members",
            "name",
            "topic",
            "id",
            "is_org_shared",
        }
        
        class properties:
            created = schemas.IntSchema
        
            @staticmethod
            def creator() -> typing.Type['DefsUserId']:
                return DefsUserId
        
            @staticmethod
            def id() -> typing.Type['DefsChannelId']:
                return DefsChannelId
            is_channel = schemas.BoolSchema
            is_mpim = schemas.BoolSchema
            is_org_shared = schemas.BoolSchema
            is_private = schemas.BoolSchema
            is_shared = schemas.BoolSchema
            
            
            class members(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['DefsUserId']:
                        return DefsUserId
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['DefsUserId'], typing.List['DefsUserId']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'members':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'DefsUserId':
                    return super().__getitem__(i)
            name = schemas.StrSchema
            name_normalized = schemas.StrSchema
            
            
            class purpose(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    required = {
                        "last_set",
                        "creator",
                        "value",
                    }
                    
                    class properties:
                    
                        @staticmethod
                        def creator() -> typing.Type['DefsTopicPurposeCreator']:
                            return DefsTopicPurposeCreator
                        last_set = schemas.IntSchema
                        value = schemas.StrSchema
                        __annotations__ = {
                            "creator": creator,
                            "last_set": last_set,
                            "value": value,
                        }
                    additional_properties = schemas.NotAnyTypeSchema
                
                last_set: MetaOapg.properties.last_set
                creator: 'DefsTopicPurposeCreator'
                value: MetaOapg.properties.value
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["last_set"]) -> MetaOapg.properties.last_set: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["creator"]) -> 'DefsTopicPurposeCreator': ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["value"]) -> MetaOapg.properties.value: ...
                
                def __getitem__(self, name: typing.Union[typing_extensions.Literal["last_set"], typing_extensions.Literal["creator"], typing_extensions.Literal["value"], ]):
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["last_set"]) -> MetaOapg.properties.last_set: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["creator"]) -> 'DefsTopicPurposeCreator': ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["value"]) -> MetaOapg.properties.value: ...
                
                def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["last_set"], typing_extensions.Literal["creator"], typing_extensions.Literal["value"], ]):
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, ],
                    last_set: typing.Union[MetaOapg.properties.last_set, decimal.Decimal, int, ],
                    creator: 'DefsTopicPurposeCreator',
                    value: typing.Union[MetaOapg.properties.value, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'purpose':
                    return super().__new__(
                        cls,
                        *args,
                        last_set=last_set,
                        creator=creator,
                        value=value,
                        _configuration=_configuration,
                    )
            
            
            class topic(
                schemas.DictSchema
            ):
            
            
                class MetaOapg:
                    required = {
                        "last_set",
                        "creator",
                        "value",
                    }
                    
                    class properties:
                    
                        @staticmethod
                        def creator() -> typing.Type['DefsTopicPurposeCreator']:
                            return DefsTopicPurposeCreator
                        last_set = schemas.IntSchema
                        value = schemas.StrSchema
                        __annotations__ = {
                            "creator": creator,
                            "last_set": last_set,
                            "value": value,
                        }
                    additional_properties = schemas.NotAnyTypeSchema
                
                last_set: MetaOapg.properties.last_set
                creator: 'DefsTopicPurposeCreator'
                value: MetaOapg.properties.value
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["last_set"]) -> MetaOapg.properties.last_set: ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["creator"]) -> 'DefsTopicPurposeCreator': ...
                
                @typing.overload
                def __getitem__(self, name: typing_extensions.Literal["value"]) -> MetaOapg.properties.value: ...
                
                def __getitem__(self, name: typing.Union[typing_extensions.Literal["last_set"], typing_extensions.Literal["creator"], typing_extensions.Literal["value"], ]):
                    # dict_instance[name] accessor
                    return super().__getitem__(name)
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["last_set"]) -> MetaOapg.properties.last_set: ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["creator"]) -> 'DefsTopicPurposeCreator': ...
                
                @typing.overload
                def get_item_oapg(self, name: typing_extensions.Literal["value"]) -> MetaOapg.properties.value: ...
                
                def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["last_set"], typing_extensions.Literal["creator"], typing_extensions.Literal["value"], ]):
                    return super().get_item_oapg(name)
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, ],
                    last_set: typing.Union[MetaOapg.properties.last_set, decimal.Decimal, int, ],
                    creator: 'DefsTopicPurposeCreator',
                    value: typing.Union[MetaOapg.properties.value, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'topic':
                    return super().__new__(
                        cls,
                        *args,
                        last_set=last_set,
                        creator=creator,
                        value=value,
                        _configuration=_configuration,
                    )
        
            @staticmethod
            def accepted_user() -> typing.Type['DefsUserId']:
                return DefsUserId
            is_archived = schemas.BoolSchema
            is_frozen = schemas.BoolSchema
            is_general = schemas.BoolSchema
            is_member = schemas.BoolSchema
            is_moved = schemas.IntSchema
            is_non_threadable = schemas.BoolSchema
            is_pending_ext_shared = schemas.BoolSchema
            is_read_only = schemas.BoolSchema
            is_thread_only = schemas.BoolSchema
        
            @staticmethod
            def last_read() -> typing.Type['DefsTs']:
                return DefsTs
            
            
            class latest(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    
                    class items(
                        schemas.ComposedSchema,
                    ):
                    
                    
                        class MetaOapg:
                            any_of_1 = schemas.AnyTypeSchema
                            
                            @classmethod
                            @functools.lru_cache()
                            def any_of(cls):
                                # we need this here to make our import statements work
                                # we must store _composed_schemas in here so the code is only run
                                # when we invoke this method. If we kept this at the class
                                # level we would get an error because the class level
                                # code would be run when this module is imported, and these composed
                                # classes don't exist yet because their module has not finished
                                # loading
                                return [
                                    ObjsMessage,
                                    cls.any_of_1,
                                ]
                    
                    
                        def __new__(
                            cls,
                            *args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                            _configuration: typing.Optional[schemas.Configuration] = None,
                            **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                        ) -> 'items':
                            return super().__new__(
                                cls,
                                *args,
                                _configuration=_configuration,
                                **kwargs,
                            )
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ]], typing.List[typing.Union[MetaOapg.items, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'latest':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            num_members = schemas.IntSchema
            
            
            class pending_shared(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['DefsTeam']:
                        return DefsTeam
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['DefsTeam'], typing.List['DefsTeam']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'pending_shared':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'DefsTeam':
                    return super().__getitem__(i)
            
            
            class previous_names(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    items = schemas.StrSchema
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, str, ]], typing.List[typing.Union[MetaOapg.items, str, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'previous_names':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            priority = schemas.NumberSchema
            unlinked = schemas.IntSchema
            unread_count = schemas.IntSchema
            unread_count_display = schemas.IntSchema
            __annotations__ = {
                "created": created,
                "creator": creator,
                "id": id,
                "is_channel": is_channel,
                "is_mpim": is_mpim,
                "is_org_shared": is_org_shared,
                "is_private": is_private,
                "is_shared": is_shared,
                "members": members,
                "name": name,
                "name_normalized": name_normalized,
                "purpose": purpose,
                "topic": topic,
                "accepted_user": accepted_user,
                "is_archived": is_archived,
                "is_frozen": is_frozen,
                "is_general": is_general,
                "is_member": is_member,
                "is_moved": is_moved,
                "is_non_threadable": is_non_threadable,
                "is_pending_ext_shared": is_pending_ext_shared,
                "is_read_only": is_read_only,
                "is_thread_only": is_thread_only,
                "last_read": last_read,
                "latest": latest,
                "num_members": num_members,
                "pending_shared": pending_shared,
                "previous_names": previous_names,
                "priority": priority,
                "unlinked": unlinked,
                "unread_count": unread_count,
                "unread_count_display": unread_count_display,
            }
        additional_properties = schemas.NotAnyTypeSchema
    
    is_private: MetaOapg.properties.is_private
    creator: 'DefsUserId'
    is_mpim: MetaOapg.properties.is_mpim
    purpose: MetaOapg.properties.purpose
    created: MetaOapg.properties.created
    name_normalized: MetaOapg.properties.name_normalized
    is_channel: MetaOapg.properties.is_channel
    is_shared: MetaOapg.properties.is_shared
    members: MetaOapg.properties.members
    name: MetaOapg.properties.name
    topic: MetaOapg.properties.topic
    id: 'DefsChannelId'
    is_org_shared: MetaOapg.properties.is_org_shared
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_private"]) -> MetaOapg.properties.is_private: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["creator"]) -> 'DefsUserId': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_mpim"]) -> MetaOapg.properties.is_mpim: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["purpose"]) -> MetaOapg.properties.purpose: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created"]) -> MetaOapg.properties.created: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name_normalized"]) -> MetaOapg.properties.name_normalized: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_channel"]) -> MetaOapg.properties.is_channel: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_shared"]) -> MetaOapg.properties.is_shared: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["members"]) -> MetaOapg.properties.members: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["topic"]) -> MetaOapg.properties.topic: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> 'DefsChannelId': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_org_shared"]) -> MetaOapg.properties.is_org_shared: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["accepted_user"]) -> 'DefsUserId': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_archived"]) -> MetaOapg.properties.is_archived: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_frozen"]) -> MetaOapg.properties.is_frozen: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_general"]) -> MetaOapg.properties.is_general: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_member"]) -> MetaOapg.properties.is_member: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_moved"]) -> MetaOapg.properties.is_moved: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_non_threadable"]) -> MetaOapg.properties.is_non_threadable: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_pending_ext_shared"]) -> MetaOapg.properties.is_pending_ext_shared: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_read_only"]) -> MetaOapg.properties.is_read_only: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["is_thread_only"]) -> MetaOapg.properties.is_thread_only: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["last_read"]) -> 'DefsTs': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["latest"]) -> MetaOapg.properties.latest: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["num_members"]) -> MetaOapg.properties.num_members: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pending_shared"]) -> MetaOapg.properties.pending_shared: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["previous_names"]) -> MetaOapg.properties.previous_names: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["priority"]) -> MetaOapg.properties.priority: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["unlinked"]) -> MetaOapg.properties.unlinked: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["unread_count"]) -> MetaOapg.properties.unread_count: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["unread_count_display"]) -> MetaOapg.properties.unread_count_display: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["is_private"], typing_extensions.Literal["creator"], typing_extensions.Literal["is_mpim"], typing_extensions.Literal["purpose"], typing_extensions.Literal["created"], typing_extensions.Literal["name_normalized"], typing_extensions.Literal["is_channel"], typing_extensions.Literal["is_shared"], typing_extensions.Literal["members"], typing_extensions.Literal["name"], typing_extensions.Literal["topic"], typing_extensions.Literal["id"], typing_extensions.Literal["is_org_shared"], typing_extensions.Literal["accepted_user"], typing_extensions.Literal["is_archived"], typing_extensions.Literal["is_frozen"], typing_extensions.Literal["is_general"], typing_extensions.Literal["is_member"], typing_extensions.Literal["is_moved"], typing_extensions.Literal["is_non_threadable"], typing_extensions.Literal["is_pending_ext_shared"], typing_extensions.Literal["is_read_only"], typing_extensions.Literal["is_thread_only"], typing_extensions.Literal["last_read"], typing_extensions.Literal["latest"], typing_extensions.Literal["num_members"], typing_extensions.Literal["pending_shared"], typing_extensions.Literal["previous_names"], typing_extensions.Literal["priority"], typing_extensions.Literal["unlinked"], typing_extensions.Literal["unread_count"], typing_extensions.Literal["unread_count_display"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_private"]) -> MetaOapg.properties.is_private: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["creator"]) -> 'DefsUserId': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_mpim"]) -> MetaOapg.properties.is_mpim: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["purpose"]) -> MetaOapg.properties.purpose: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created"]) -> MetaOapg.properties.created: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["name_normalized"]) -> MetaOapg.properties.name_normalized: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_channel"]) -> MetaOapg.properties.is_channel: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_shared"]) -> MetaOapg.properties.is_shared: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["members"]) -> MetaOapg.properties.members: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["topic"]) -> MetaOapg.properties.topic: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> 'DefsChannelId': ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_org_shared"]) -> MetaOapg.properties.is_org_shared: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["accepted_user"]) -> typing.Union['DefsUserId', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_archived"]) -> typing.Union[MetaOapg.properties.is_archived, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_frozen"]) -> typing.Union[MetaOapg.properties.is_frozen, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_general"]) -> typing.Union[MetaOapg.properties.is_general, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_member"]) -> typing.Union[MetaOapg.properties.is_member, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_moved"]) -> typing.Union[MetaOapg.properties.is_moved, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_non_threadable"]) -> typing.Union[MetaOapg.properties.is_non_threadable, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_pending_ext_shared"]) -> typing.Union[MetaOapg.properties.is_pending_ext_shared, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_read_only"]) -> typing.Union[MetaOapg.properties.is_read_only, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["is_thread_only"]) -> typing.Union[MetaOapg.properties.is_thread_only, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["last_read"]) -> typing.Union['DefsTs', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["latest"]) -> typing.Union[MetaOapg.properties.latest, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["num_members"]) -> typing.Union[MetaOapg.properties.num_members, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["pending_shared"]) -> typing.Union[MetaOapg.properties.pending_shared, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["previous_names"]) -> typing.Union[MetaOapg.properties.previous_names, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["priority"]) -> typing.Union[MetaOapg.properties.priority, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["unlinked"]) -> typing.Union[MetaOapg.properties.unlinked, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["unread_count"]) -> typing.Union[MetaOapg.properties.unread_count, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["unread_count_display"]) -> typing.Union[MetaOapg.properties.unread_count_display, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["is_private"], typing_extensions.Literal["creator"], typing_extensions.Literal["is_mpim"], typing_extensions.Literal["purpose"], typing_extensions.Literal["created"], typing_extensions.Literal["name_normalized"], typing_extensions.Literal["is_channel"], typing_extensions.Literal["is_shared"], typing_extensions.Literal["members"], typing_extensions.Literal["name"], typing_extensions.Literal["topic"], typing_extensions.Literal["id"], typing_extensions.Literal["is_org_shared"], typing_extensions.Literal["accepted_user"], typing_extensions.Literal["is_archived"], typing_extensions.Literal["is_frozen"], typing_extensions.Literal["is_general"], typing_extensions.Literal["is_member"], typing_extensions.Literal["is_moved"], typing_extensions.Literal["is_non_threadable"], typing_extensions.Literal["is_pending_ext_shared"], typing_extensions.Literal["is_read_only"], typing_extensions.Literal["is_thread_only"], typing_extensions.Literal["last_read"], typing_extensions.Literal["latest"], typing_extensions.Literal["num_members"], typing_extensions.Literal["pending_shared"], typing_extensions.Literal["previous_names"], typing_extensions.Literal["priority"], typing_extensions.Literal["unlinked"], typing_extensions.Literal["unread_count"], typing_extensions.Literal["unread_count_display"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        is_private: typing.Union[MetaOapg.properties.is_private, bool, ],
        creator: 'DefsUserId',
        is_mpim: typing.Union[MetaOapg.properties.is_mpim, bool, ],
        purpose: typing.Union[MetaOapg.properties.purpose, dict, frozendict.frozendict, ],
        created: typing.Union[MetaOapg.properties.created, decimal.Decimal, int, ],
        name_normalized: typing.Union[MetaOapg.properties.name_normalized, str, ],
        is_channel: typing.Union[MetaOapg.properties.is_channel, bool, ],
        is_shared: typing.Union[MetaOapg.properties.is_shared, bool, ],
        members: typing.Union[MetaOapg.properties.members, list, tuple, ],
        name: typing.Union[MetaOapg.properties.name, str, ],
        topic: typing.Union[MetaOapg.properties.topic, dict, frozendict.frozendict, ],
        id: 'DefsChannelId',
        is_org_shared: typing.Union[MetaOapg.properties.is_org_shared, bool, ],
        accepted_user: typing.Union['DefsUserId', schemas.Unset] = schemas.unset,
        is_archived: typing.Union[MetaOapg.properties.is_archived, bool, schemas.Unset] = schemas.unset,
        is_frozen: typing.Union[MetaOapg.properties.is_frozen, bool, schemas.Unset] = schemas.unset,
        is_general: typing.Union[MetaOapg.properties.is_general, bool, schemas.Unset] = schemas.unset,
        is_member: typing.Union[MetaOapg.properties.is_member, bool, schemas.Unset] = schemas.unset,
        is_moved: typing.Union[MetaOapg.properties.is_moved, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        is_non_threadable: typing.Union[MetaOapg.properties.is_non_threadable, bool, schemas.Unset] = schemas.unset,
        is_pending_ext_shared: typing.Union[MetaOapg.properties.is_pending_ext_shared, bool, schemas.Unset] = schemas.unset,
        is_read_only: typing.Union[MetaOapg.properties.is_read_only, bool, schemas.Unset] = schemas.unset,
        is_thread_only: typing.Union[MetaOapg.properties.is_thread_only, bool, schemas.Unset] = schemas.unset,
        last_read: typing.Union['DefsTs', schemas.Unset] = schemas.unset,
        latest: typing.Union[MetaOapg.properties.latest, list, tuple, schemas.Unset] = schemas.unset,
        num_members: typing.Union[MetaOapg.properties.num_members, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        pending_shared: typing.Union[MetaOapg.properties.pending_shared, list, tuple, schemas.Unset] = schemas.unset,
        previous_names: typing.Union[MetaOapg.properties.previous_names, list, tuple, schemas.Unset] = schemas.unset,
        priority: typing.Union[MetaOapg.properties.priority, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        unlinked: typing.Union[MetaOapg.properties.unlinked, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        unread_count: typing.Union[MetaOapg.properties.unread_count, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        unread_count_display: typing.Union[MetaOapg.properties.unread_count_display, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'ObjsChannel':
        return super().__new__(
            cls,
            *args,
            is_private=is_private,
            creator=creator,
            is_mpim=is_mpim,
            purpose=purpose,
            created=created,
            name_normalized=name_normalized,
            is_channel=is_channel,
            is_shared=is_shared,
            members=members,
            name=name,
            topic=topic,
            id=id,
            is_org_shared=is_org_shared,
            accepted_user=accepted_user,
            is_archived=is_archived,
            is_frozen=is_frozen,
            is_general=is_general,
            is_member=is_member,
            is_moved=is_moved,
            is_non_threadable=is_non_threadable,
            is_pending_ext_shared=is_pending_ext_shared,
            is_read_only=is_read_only,
            is_thread_only=is_thread_only,
            last_read=last_read,
            latest=latest,
            num_members=num_members,
            pending_shared=pending_shared,
            previous_names=previous_names,
            priority=priority,
            unlinked=unlinked,
            unread_count=unread_count,
            unread_count_display=unread_count_display,
            _configuration=_configuration,
        )

from slack.model.defs_channel_id import DefsChannelId
from slack.model.defs_team import DefsTeam
from slack.model.defs_topic_purpose_creator import DefsTopicPurposeCreator
from slack.model.defs_ts import DefsTs
from slack.model.defs_user_id import DefsUserId
from slack.model.objs_message import ObjsMessage
